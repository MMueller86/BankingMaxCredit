package financial;

import financial.entity.FinancialSituationEntity;
import financial.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mmueller on 03.10.2017.
 */
@RestController
public class CreditController {

    @Autowired
    CreditService creditService;

    @RequestMapping("/")
    @CrossOrigin
    public String index() {
        return "Greetings from Spring Boot!";
    }

    /*
    example json:
    {"id":"",
    "earnings":[
        {"name":"income wife","value":2000.0},
        {"name":"income Husband","value":10000.0}],
    "credits":[{"name":"credit1","value":4000.0}]}
     */
    @RequestMapping(value = "/getMaxCredit", method = RequestMethod.POST)
    @CrossOrigin
    public @ResponseBody
    double getMaxCredit(@RequestBody FinancialSituationEntity financialSituation) {
        Double maxCredit = creditService.calculateMaxCredit(financialSituation);
        return maxCredit;
    }
}
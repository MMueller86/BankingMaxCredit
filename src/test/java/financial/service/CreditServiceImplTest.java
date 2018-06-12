package financial.service;

import financial.entity.FinancialSituationEntity;
import org.junit.Assert;
import org.junit.Test;
import util.FinancialSituationTestDataUtil;

/**
 * Created by mmueller on 03.10.2017.
 */
public class CreditServiceImplTest {

    private CreditService sut = new CreditServiceImpl();

    @Test
    public void calculateMaxCredit() {
        FinancialSituationEntity financialSituation = FinancialSituationTestDataUtil.createFinancialSituation(3200,
                2400, 500);
        double maxRate = sut.calculateMaxCredit(financialSituation);
        Assert.assertTrue(510000 == maxRate);

    }
}

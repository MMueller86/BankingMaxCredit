package financial.service;

import financial.entity.FinancialPositionEntity;
import financial.entity.FinancialSituationEntity;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * Created by mmueller on 03.10.2017.
 */
@Component
public class CreditServiceImpl implements CreditService {

    @Override
    public double calculateMaxCredit(FinancialSituationEntity financialSituation) {
        double maxCredit = 0;
        double income = getSum(financialSituation.getEarnings());
        double credits = getSum(financialSituation.getCredits());
        double availableIncome = income - credits;

        if (availableIncome > 0) {
            maxCredit = availableIncome * 100.0;
        }
        return maxCredit;
    }

    private double getSum(Set<FinancialPositionEntity> positions) {
        double sum = 0;
        for (FinancialPositionEntity income : positions) {
            sum += income.getValue();
        }
        return sum;
    }
}

package util;

import financial.entity.FinancialPositionEntity;
import financial.entity.FinancialSituationEntity;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by mmueller on 03.10.2017.
 */
public class FinancialSituationTestDataUtil {

    public static FinancialSituationEntity createFinancialSituation(double income1, double income2, double credit) {
        FinancialSituationEntity financialSituation = new FinancialSituationEntity();
        FinancialPositionEntity husband = new FinancialPositionEntity();
        husband.setName("income Husband");
        husband.setValue(income1);

        FinancialPositionEntity wife = new FinancialPositionEntity();
        wife.setName("income wife");
        wife.setValue(income2);

        Set<FinancialPositionEntity> earnings = new HashSet<FinancialPositionEntity>();
        earnings.add(husband);
        earnings.add(wife);
        financialSituation.setEarnings(earnings);

        FinancialPositionEntity creditEntity = new FinancialPositionEntity();
        creditEntity.setName("credit1");
        creditEntity.setValue(credit);
        Set<FinancialPositionEntity> credits = new HashSet<>();
        credits.add(creditEntity);
        financialSituation.setCredits(credits);

        return financialSituation;
    }
}

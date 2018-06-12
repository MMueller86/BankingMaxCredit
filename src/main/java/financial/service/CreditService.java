package financial.service;

import financial.entity.FinancialSituationEntity;

/**
 * Created by mmueller on 03.10.2017.
 */
public interface CreditService {
    /**
     * Calculates the maximal possible credit.
     *
     * @param financialSituation
     * @return
     */
    double calculateMaxCredit(FinancialSituationEntity financialSituation);

}

package financial.entity;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by mmueller on 27.09.2017.
 */
public class FinancialSituationEntity implements Serializable {

    public static final String TABLE_NAME = "financialSituation";
    private static final long serialVersionUID = 6474080158599353301L;

    private String id;
    Set<FinancialPositionEntity> earnings;
    Set<FinancialPositionEntity> credits;

    public FinancialSituationEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Set<FinancialPositionEntity> getEarnings() {
        return earnings;
    }

    public void setEarnings(Set<FinancialPositionEntity> earnings) {
        this.earnings = earnings;
    }

    public Set<FinancialPositionEntity> getCredits() {
        return credits;
    }

    public void setCredits(Set<FinancialPositionEntity> credits) {
        this.credits = credits;
    }
}

package financial.entity;

import java.io.Serializable;

/**
 * Created by mmueller on 27.09.2017.
 */
public class FinancialPositionEntity implements Serializable {


    private static final long serialVersionUID = -3659741279470105669L;
    private String name;
    private double value;

    public FinancialPositionEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
import java.util.Objects;

public class LogicVariable {
    private String name;
    private boolean value;
    private LogicGate calculatedBy;

    public LogicVariable(String name, boolean value) {
        this.name = name;
        this.value = value;
    }

    public LogicVariable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean getValue() {
        if (calculatedBy != null) calculatedBy.calculate();
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogicVariable that = (LogicVariable) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public LogicGate getCalculatedBy() {
        return calculatedBy;
    }

    public void setCalculatedBy(LogicGate calculatedBy) {
        this.calculatedBy = calculatedBy;
    }

    public String getFormula() {
        if (calculatedBy != null) {
            return calculatedBy.getFormula();
        }
        return name;
    }
}

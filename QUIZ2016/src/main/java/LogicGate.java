public abstract class LogicGate {
    protected LogicVariable outputVar;
    protected LogicVariable[] inputVars;

    public LogicGate(LogicVariable outputVar, LogicVariable[] inputVars) throws ColisionException, CycleException {
        if (outputVar.getCalculatedBy() != null) throw new ColisionException();
        this.outputVar = outputVar;
        this.inputVars = inputVars;
        if (checkDependencies()) throw new CycleException();
    }

    public LogicVariable getOutput() {
        return outputVar;
    }

    public LogicVariable[] getInputs() {
        return inputVars;
    }

    public abstract String getSymbol();

    public String getFormula() {
        StringBuilder vars = new StringBuilder();

        for (int i = 0; i < inputVars.length; i++) {
            vars.append(inputVars[i].getFormula());
            if (i != inputVars.length -1) vars.append(",");
        }

        return getSymbol() + "(" + vars.toString() + ")";
    }

    public abstract void calculate();

    public boolean checkDependencies() {
        for (LogicVariable lv : inputVars) {
            if (lv.getCalculatedBy() != null) {
                if (lv.getCalculatedBy().checkDependencies(this.outputVar)) return true;
                if (lv.getCalculatedBy().checkDependencies()) return true;
            }
        }
        return false;
    }

    public boolean checkDependencies(LogicVariable outputVar) {
        for (LogicVariable lv : inputVars) {
            if (lv.equals(outputVar)) return true;
        }
        return false;
    }
}

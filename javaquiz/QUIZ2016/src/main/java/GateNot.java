public class GateNot extends LogicGate {
    public GateNot(LogicVariable outputVar, LogicVariable input) throws ColisionException, CycleException {
        super(outputVar, new LogicVariable[]{input});

        calculate();
    }

    @Override
    public String getSymbol() {
        return "NOT";
    }

    @Override
    public void calculate() {
        for (LogicVariable inputVar : inputVars) {
            outputVar.setValue(!inputVar.getValue());
        }
        outputVar.setCalculatedBy(this);
    }
}

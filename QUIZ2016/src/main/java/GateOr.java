public class GateOr extends LogicGate {
    public GateOr(LogicVariable outputVar, LogicVariable input1, LogicVariable input2) throws ColisionException, CycleException {
        super(outputVar, new LogicVariable[]{input1, input2});

        calculate();
    }

    @Override
    public String getSymbol() {
        return "OR";
    }

    @Override
    public void calculate() {
        for (int i = 0; i < inputVars.length - 1; i+=2){
            outputVar.setValue(inputVars[i].getValue() || inputVars[i+1].getValue());
        }
        outputVar.setCalculatedBy(this);
    }
}

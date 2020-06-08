import java.util.HashMap;

public class CombinatorialCircuit {
    HashMap<String, LogicVariable> variables;

    public CombinatorialCircuit() {
        this.variables = new HashMap<>();
    }

    public boolean addVariable(LogicVariable variable) {
        if (this.variables.containsKey(variable.getName())) return false;
        this.variables.put(variable.getName(), variable);
        return true;
    }

    public LogicVariable getVariableByName(String name) {
        if (!this.variables.containsKey(name)) return null;
        return this.variables.get(name);
    }
}

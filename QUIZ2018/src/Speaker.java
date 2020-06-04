public class Speaker extends Person {
    int fee;

    public Speaker(String name, int age) {
        super(name, age);
        fee = 0;
    }

    public Speaker(String name) {
        super(name);
        fee = 0;
    }

    public int getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return "Speaker " + name + " has a fee value of " + fee + ".";
    }
}

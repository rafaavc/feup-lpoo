public class HumanClient implements Client {
    OrderingStrategy orderingStrategy;
    HumanClient(OrderingStrategy os) {
        orderingStrategy = os;
    }

    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        orderingStrategy.wants(drink, recipe, bar);
    }


    public void happyHourStarted(Bar bar) {
        orderingStrategy.happyHourStarted(bar);
    }

    public void happyHourEnded(Bar bar) {
        orderingStrategy.happyHourEnded(bar);
    }
}

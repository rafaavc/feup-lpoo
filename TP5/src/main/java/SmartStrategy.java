public class SmartStrategy implements OrderingStrategy {
    StringDrink drink;
    StringRecipe recipe;

    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if (bar.isHappyHour()) {
            bar.order(drink, recipe);
        } else {
            this.drink = drink;
            this.recipe = recipe;
        }
    }

    public void happyHourStarted(Bar bar) {
        if (drink != null && recipe != null) {
            ((StringBar) bar).order(drink, recipe);
            drink = null;
            recipe = null;
        }
    }

    public void happyHourEnded(Bar bar) {

    }
}

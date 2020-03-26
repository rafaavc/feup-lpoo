public class StringReplacer implements StringTransformer {
    private char which, by;
    StringReplacer(char w, char b) {
        which = w;
        by = b;
    }
    public void execute(StringDrink drink) {
        String drinkText = drink.getText();
        drink.setText(drinkText.replace(which, by));
    }
}

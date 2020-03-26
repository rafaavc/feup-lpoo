public class StringInverter implements StringTransformer {
    public void execute(StringDrink drink) {
        String drinkText = drink.getText();
        byte [] drinkArray = drinkText.getBytes();
        byte [] result = new byte[drinkText.length()];

        for (int byteIndex = drinkText.length() -1; byteIndex >= 0; byteIndex--) {
            int resultIndex = drinkText.length() - 1 - byteIndex;
            result[resultIndex] = drinkArray[byteIndex];
        }

        drink.setText(new String(result));
    }
}

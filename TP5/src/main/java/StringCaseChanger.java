public class StringCaseChanger implements StringTransformer {
    public void execute(StringDrink drink) {
        StringBuffer sb = new StringBuffer(drink.getText());
        for (int i = 0; i < sb.length(); i++) {
            char character = sb.charAt(i);
            if (Character.isLowerCase(character)) {
                character = Character.toUpperCase(character);
            } else {
                character = Character.toLowerCase(character);
            }
            sb.replace(i, i+1, Character.toString(character));
        }
        drink.setText(sb.toString());
    }
}

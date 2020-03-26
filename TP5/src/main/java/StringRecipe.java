import java.util.List;

public class StringRecipe {
    private List<StringTransformer> stringTransformers;
    StringRecipe(List<StringTransformer> sTransformers) {
        stringTransformers = sTransformers;
    }
    public void mix(StringDrink drink) {
        for (StringTransformer st : stringTransformers) {
            st.execute(drink);
        }
    }
}

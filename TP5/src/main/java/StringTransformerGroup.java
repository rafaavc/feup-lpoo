import java.util.List;

public class StringTransformerGroup implements StringTransformer {
    List<StringTransformer> transformers;

    StringTransformerGroup(List<StringTransformer> t) {
        transformers = t;
    }

    public void execute(StringDrink drink) {
        for (StringTransformer st : transformers) {
            st.execute(drink);
        }
    }
}

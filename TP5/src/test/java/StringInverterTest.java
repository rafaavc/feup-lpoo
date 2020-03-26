import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringInverterTest {
    @Test
    public void stringInverter() {
        StringDrink drink = new StringDrink("ABCD");
        StringInverter si = new StringInverter();
        si.execute(drink);
        assertEquals("DCBA", drink.getText());

        StringDrink otherDrink = new StringDrink("THIS IS A TEST");
        si.execute(otherDrink);
        assertEquals("TSET A SI SIHT", otherDrink.getText());
    }
}

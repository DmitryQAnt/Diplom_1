package praktikum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IngredientTypeParametrizedTest {

    private IngredientType inputType;
    private String expected;

    public IngredientTypeParametrizedTest(IngredientType inputType, String expected) {
        this.inputType = inputType;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getData() {
        return Arrays.asList(new Object[][] {
                { IngredientType.SAUCE, "SAUCE" },
                { IngredientType.FILLING, "FILLING" },
        });
    }

    @Test
    public void testIngredientTypeValues() {
        assertEquals(inputType, IngredientType.valueOf(expected));
    }
}

package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class IngredientTest {
    private static final String TEST_NAME = "TestName";
    private static final float TEST_PRICE = 100;

    @Test
    public void checkPriceIsTheSame() {
        Ingredient ingredient = new Ingredient(IngredientType.FILLING, TEST_NAME,TEST_PRICE);
        Float expected = TEST_PRICE;
        Float actual = ingredient.getPrice();
        assertEquals(expected, actual);
    }
    @Test
    public void checkNameIsTheSame() {
        Ingredient ingredient = new Ingredient(IngredientType.FILLING, TEST_NAME,TEST_PRICE);
        String expected = TEST_NAME;
        String actual = ingredient.getName();
        assertEquals(expected, actual);
    }
    @Test
    public void checkIngredientTypeIsSame() {
        Ingredient ingredient = new Ingredient(IngredientType.FILLING, TEST_NAME,TEST_PRICE);
        Enum expected = IngredientType.FILLING;
        Enum actual = ingredient.getType();
        assertEquals(expected, actual);
    }
}

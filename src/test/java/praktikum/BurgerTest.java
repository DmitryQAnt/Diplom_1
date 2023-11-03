package praktikum;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {
    private static final String FULL_BURGER = "(==== black bun ====)\n" + "= filling dinosaur =\n" + "= sauce hot sauce =\n" + "(==== black bun ====)\n" + "\n" + "Price: 500.000000" + "\n";
    private static final String BURGER_BUNS_ONLY = "(==== black bun ====)\n" + "(==== black bun ====)\n" + "\n" + "Price: 200.000000" + "\n";
    private static final String BURGER_ONE_INGREDIENT = "(==== black bun ====)\n" + "= filling dinosaur =\n" + "(==== black bun ====)\n" + "\n" + "Price: 400.000000" + "\n";
    private static final float PRICE_WITH_ONE_INGREDIENT = 500;
    private static final float PRICE_WITH_NO_INGREDIENTS = 200;
    public static final int INGREDIENT_ADDED = 1;
    public static final int INGREDIENT_REMOVED = 0;
    public static final int LIST_IS_EMPTY = 0;
    private Burger burger;

    @Mock
    Bun bun;
    @Mock
    Ingredient sauce;
    @Mock
    Ingredient filling;

    @Before
    public void setUp() {
        burger = new Burger();
        assertEquals(LIST_IS_EMPTY, burger.ingredients.size());
        Mockito.when(bun.getPrice()).thenReturn(100F);
        Mockito.when(bun.getName()).thenReturn("black bun");
        Mockito.when(sauce.getType()).thenReturn(IngredientType.SAUCE);
        Mockito.when(sauce.getName()).thenReturn("hot sauce");
        Mockito.when(sauce.getPrice()).thenReturn(100f);
        Mockito.when(filling.getType()).thenReturn(IngredientType.FILLING);
        Mockito.when(filling.getName()).thenReturn("dinosaur");
        Mockito.when(filling.getPrice()).thenReturn(200f);
    }

    @Test
    public void checkGetPriceWithNoIngredients() {
        burger.setBuns(bun);
        assertEquals(PRICE_WITH_NO_INGREDIENTS, burger.getPrice(),0);
    }
    @Test
    public void checkGetPriceWithOneIngredient(){
        burger.setBuns(bun);
        burger.addIngredient(sauce);
        burger.addIngredient(filling);
        assertEquals(PRICE_WITH_ONE_INGREDIENT, burger.getPrice(), 0);
    }

    @Test
    public void checkIfAddIngredientIsSuccessful() {
        burger.addIngredient(sauce);
        assertEquals(INGREDIENT_ADDED, burger.ingredients.size());
    }

    @Test
    public void checkIfRemoveIngredientIsSuccessful() {
        burger.addIngredient(sauce);
        burger.removeIngredient(0);
        assertEquals(INGREDIENT_REMOVED, burger.ingredients.size());
    }

    @Test
    public void checkIfMoveIngredientIsSuccessful() {
        burger.addIngredient(sauce);
        burger.addIngredient(filling);
        burger.moveIngredient(1, 0);
        assertEquals(filling, burger.ingredients.get(0));
    }
    @Test
    public void checkGetReceiptWithSauceAndFilling() {
        burger.setBuns(bun);
        burger.addIngredient(filling);
        burger.addIngredient(sauce);
        assertEquals(FULL_BURGER, burger.getReceipt());
    }
    @Test
    public void checkGetReceiptWithBunsOnly() {
        burger.setBuns(bun);
        assertEquals(BURGER_BUNS_ONLY, burger.getReceipt());
    }
    @Test
    public void checkGetReceiptWithOneIngredient() {
        burger.setBuns(bun);
        burger.addIngredient(filling);
        assertEquals(BURGER_ONE_INGREDIENT, burger.getReceipt());
    }
}

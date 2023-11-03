package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BunTest {
    private static final String TEST_NAME = "TestName";
    private static final float TEST_PRICE = 100;


    @Test
    public void checkPriceIsTheSame() {
        Bun bun = new Bun(TEST_NAME, TEST_PRICE);
        Float expected = TEST_PRICE;
        Float actual = bun.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void checkNameIsTheSame() {
        Bun bun = new Bun(TEST_NAME, TEST_PRICE);
        String expected = TEST_NAME;
        String actual = bun.getName();
        assertEquals(expected, actual);
    }
}
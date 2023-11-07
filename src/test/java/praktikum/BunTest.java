//package praktikum;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//
//@RunWith(Parameterized.class)
//public class BunTest {
//    private static final String TEST_NAME = "TestName";
//    private static final float TEST_PRICE = 100;
//    private final String name;
//    private final float price;
//
//    public BunTest(String name, float price) {
//        this.name = name;
//        this.price = price;
//    }
//
//    @Parameterized.Parameters
//    public static Object[][] getData() {
//        return new Object[][]{
//                {TEST_NAME, TEST_PRICE},
//                {null, TEST_PRICE},
//                {"", TEST_PRICE}
//        };
//    }
//
//    @Test
//    public void checkGetNameReturnRightValue() {
//        Bun bun = new Bun(name, price);
//        Assert.assertEquals(name, bun.getName());
//    }
//
//    @Test
//    public void checkGetPriceReturnRightValue() {
//        Bun bun = new Bun(name, price);
//        Assert.assertEquals(price, bun.getPrice(), 0);
//    }
//}
//

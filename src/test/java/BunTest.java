import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

public class BunTest {
    private final String bunName = "Краторная булка N-200i";
    private final float bunPrice = 1255;

    @Test
    public void getNameBunNameShouldBeReturnedTest() {
        Bun bun = new Bun(bunName, bunPrice);
        assertEquals("Ошибка. Должно было передаться название булочки" ,bunName, bun.getName());
    }

    @Test
    public void getPriceBunPriceShouldBeReturnedTest() {
        Bun bun = new Bun(bunName, bunPrice);
        assertEquals("Ошибка. Должна была передаться цена булочки", bunPrice, bun.getPrice(), 0);
    }
}

package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collections;

@RunWith(Parameterized.class)
public class BunParametrizedTest {
  private final String name;
  private final float price;

  public BunParametrizedTest(String name, float price) {
    this.name = name;
    this.price = price;
  }

  @Parameterized.Parameters(name = "Data test: {0}, {1}")
  public static Object[][] getData() {
    return new Object[][]{
            {"Флюоресцентная булка R2-D3", 988.025f},
            {"Краторная булка N-200i", 1255},
            //Check for a bun name that contains only spaces
            {"   ", 988.025f},
            //Check for a bun name with a value of null
            {null, 988.025f},
            //Check for a price that is equal to a negative value
            {"Флюоресцентная булка R2-D3", -988.025f},
            //Check for a price that is equal 0
            {"Краторная булка N-200i", 0},
            //Check for a price that is equal to a max value
            {"Флюоресцентная булка R2-D3", Float.MAX_VALUE},
            //Check for a price that is equal to a min value
            {"Краторная булка N-200i", Float.MIN_VALUE},
            //Check for a price that contains not numeric value
            {"Флюоресцентная булка R2-D3", Float.NaN},
            //Check for a very long string
            {"Краторная булка N-200i " + String.join("", Collections.nCopies(100, "очень длинное название булки ")), 100f},
            //Checking for special characters in the string
            {"@&%$*()", 0}
    };
  }

  @Test
  public void getNameBunParameterizedTest() {
    Bun bun = new Bun(name, price);
    Assert.assertEquals("Incorrect name of bun. Change, please",name, bun.getName());
  }

  @Test
  public void getPriceBunParameterizedTest() {
    Bun bun = new Bun(name, price);
    Assert.assertEquals("Incorrect price of bun. Change it, please",price, bun.getPrice(), 0);
  }
}
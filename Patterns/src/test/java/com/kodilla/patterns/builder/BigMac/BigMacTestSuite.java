package com.kodilla.patterns.builder.BigMac;
import com.kodilla.patterns.builder.bigmac.BigMac;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
public class BigMacTestSuite {
    @Test
    void TestBigmacBuilder() {
        BigMac bigmac = new BigMac.BigMacBuilder()
                .bun("sezam")
                .burgers(1)
                .sauce("standard")
                .ingredient("bekon")
                .ingredient("sałata")
                .ingredient("ser")
                .build();

        String bun = bigmac.getBun();
        int burgers = bigmac.getBurgers();
        String sauce = bigmac.getSauce();
        List<String>ingredients = bigmac.getIngredients();

        assertEquals("sezam",bun);
        assertEquals(1, burgers);
        assertEquals("standard", sauce);
        assertEquals(3, ingredients.size());
        assertTrue(ingredients.contains("sałata"));
        assertTrue(ingredients.contains("bekon"));
        assertTrue(ingredients.contains("ser"));

    }
}

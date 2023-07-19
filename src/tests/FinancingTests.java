package tests;

import entities.Financing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinancingTests {
    @Test
    public void constructorShouldCreateObjectWhenValidData(){
        Financing f = new Financing(100000.00,2000.00,80);

        Assertions.assertEquals(100000.00, f.entry());
        Assertions.assertEquals(2000.00, f.getIncome());
        Assertions.assertEquals(80, f.getMonths());
    }
}

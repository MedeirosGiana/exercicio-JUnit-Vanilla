package tests;

import entities.Financing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinancingTests {
    @Test
    public void constructorShouldCreateObjectWhenValidData(){
        Financing f = new Financing(100000.00,2000.00,80);

        Assertions.assertEquals(100000.00, f.getTotalAmount());
        Assertions.assertEquals(2000.00, f.getIncome());
        Assertions.assertEquals(80, f.getMonths());
    }
    @Test
    public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData(){

        Assertions.assertThrows(IllegalArgumentException.class,()-> {
            Financing f = new Financing(100000.00,2000.00,20);
        });
    }
    @Test
    public void setTotalAmountShouldUpdateValueWhenValidData(){
        //arrange
        Financing f = new Financing(100000.00,2000.00,80);
        //actions
        f.setTotalAmount(90000.00);
        //assert
        Assertions.assertEquals(90000.00, f.getTotalAmount());
    }
    @Test
    public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData(){
        Assertions.assertThrows(IllegalArgumentException.class,()-> {
        Financing f = new Financing(100000.00,2000.00,80);
        f.setTotalAmount(110000.00);
        });
    }
    @Test
    public void setIncomeShouldUpdateValueWhenValidData(){
        Financing f = new Financing(100000.00,2000.00,80);
        f.setIncome(2500.00);
        Assertions.assertEquals(2500.00, f.getIncome());
    }

    @Test
    public  void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            Financing f = new Financing(100000.00,2000.00,80);
            f.setIncome(1900.00);
        });
    }
    @Test
    public void setMonthsShouldUpdateValueWhenValidData(){
        Financing f = new Financing(100000.00,2000.00,80);
        f.setMonths(85);
        Assertions.assertEquals(85,f.getMonths());
    }
}

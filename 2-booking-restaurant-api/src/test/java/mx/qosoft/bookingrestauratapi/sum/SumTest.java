/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.qosoft.bookingrestauratapi.sum;

import mx.qosoft.bookingrestaurantapi.sum.Sum;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Elliott
 */
public class SumTest {
    
    Sum sum = new Sum();
    
    @Test
    public void sumTest() {
        int sumTest = sum.sum(1, 1);
        int resultExpect = 2;
        assertEquals(resultExpect, sumTest);
    }
}

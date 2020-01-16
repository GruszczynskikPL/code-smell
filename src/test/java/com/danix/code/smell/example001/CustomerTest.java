package com.danix.code.smell.example001;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * @author  danix
 */
public class CustomerTest {

    @Test
    public void shouldReturnCustomerName() {
        Customer customer = Mockito.mock(Customer.class);
        when(customer.getFullName()).thenReturn("Travis");
        assertEquals("Travis", customer.getFullName());
    }
}

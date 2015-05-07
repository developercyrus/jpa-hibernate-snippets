package javaee.jpa.hibernate.example1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClientIT {
    @Test
    public void test1() {
        System.out.println(Client.getFirstName());
        assertEquals("peter", Client.getFirstName());
    }
}


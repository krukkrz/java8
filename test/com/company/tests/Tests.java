package com.company.tests;

import com.company.solutions.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void shouldReturnHelloWorld(){
        Person person = new Person();
        assertEquals("Hello World!", person.hello());
    }

    @Test
    public void shouldReturnPersonName(){
        Person person = new Person();
        assertEquals(person.name, person.getName());
    }
}

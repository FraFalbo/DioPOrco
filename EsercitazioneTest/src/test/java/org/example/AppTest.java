package org.example;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals; import static org.junit.Assert.*;



public class AppTest {
    static Sommatore sommatore;


    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        sommatore= new Sommatore();
        System.out.println("Inizio Test");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("Fine Test");
        sommatore=null;
    }


    @Test
    public void testSommatore() {
        List<Integer> l=new ArrayList<Integer>();
        l=Arrays.asList(1,2,3,4,5,6);
        assertEquals(sommatore.ciao(l), 21);
    }
}
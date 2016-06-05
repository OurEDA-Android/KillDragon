package com.example.means88.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Means88 on 2016/6/4.
 */
@RunWith(Parameterized.class)
public class ParameterTest {

    private static int cnt = 0;

    private int a, b;

    public ParameterTest(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Parameters
    public static Collection data() {
        List<Object[]> datas = new ArrayList<>();
        for(int i=0; i<5; i++) {
            if(i==3) {
                datas.add(new Object[]{1, 2});
            }
            Object[] data = new Object[]{i, 5-i};
            datas.add(data);
        }
        return datas;
    }

    @Test
    public void test() {
        assertEquals(5, a+b);
    }

    @AfterClass
    public static void after() {

    }
}

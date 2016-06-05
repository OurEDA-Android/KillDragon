package com.example.means88.test;

import android.app.Application;
import android.content.Context;
import android.test.ApplicationTestCase;

/**
 * Created by Means88 on 2016/6/4.
 */
public class ExampleTest extends ApplicationTestCase<Application> {

    public ExampleTest() {
        super(Application.class);
        Context context = getContext();
    }

    public void test1() {
        assertEquals(1, 0);
    }

    public void test() {
        assertEquals(1, 0);
    }

}

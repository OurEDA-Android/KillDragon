package com.example.means88.test;

import android.app.Activity;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;

import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.TextView;

import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        setActivityInitialTouchMode(true);
    }

    public void testMainActivity() {
        Activity activity = getActivity();
        Button button = (Button) activity.findViewById(R.id.button);
        TextView textView = (TextView) activity.findViewById(R.id.text_view);
        TouchUtils.clickView(this, button);
        assertEquals("clicked", textView.getText().toString());
    }

    public void test1() {
        assertEquals(1, 1);
    }

}
package com.example.means88.test;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static junit.framework.Assert.assertEquals;

/**
 * Created by Means88 on 2016/6/4.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class JUnit4Test {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @BeforeClass
    public static void init() {

    }

    @Before
    public void setUp() {
    }

    @Test
    public void tstButton() {
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.text_view))
                .check(matches(withText("success")));
    }

    @Test
    public void tstTextView() {
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.text_view))
                .check(matches(withText("clicked")));
    }
}

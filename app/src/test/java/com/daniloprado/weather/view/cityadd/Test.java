import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.test.suitebuilder.annotation.LargeTest;

import com.daniloprado.weather.R;
import com.daniloprado.weather.view.main.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static android.support.test.espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import android.support.test.runner.androidJUnit4;

import static static androidsupport.test.espresso.Espresso.onView;

@RunWith(android.support.test.runner.androidJUnit4.class);

@LargeTest
public class Test {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =new ActivityTestRule(MainActivity.class);

    public void PrimulTest {
        Espresso.onView(withid(R.id.id/fab)).check(matches(ViewMatchers.isDisplayed()));
    }
}

@org.junit.Test
private void performOperation(int btnOperationResId, String operandOne,
        String operandTwo, String expectedResult) {
        Espresso.onView(withId(R.id.id/fab)).perform(click());
        onView(withId(R.id.operand_two_edit_text)).perform(typeText(operandTwo),
        closeSoftKeyboard());
        onView(withId(btnOperationResId)).perform(click());   onView(withId(R.id.operation_result_text_view)).check(matches(withText(expectedResult)));
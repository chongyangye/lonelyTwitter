package ca.ualberta.cs.lonelytwitter.test;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Instrumentation;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ViewAsserts;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import ca.ualberta.cs.lonelytwitter.ImportantTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;

/*
 * generate this class with new.. JUnit Test Case
 * set superclass to ActivityInstrumentationTestCase2
 */
@SuppressLint("NewApi")
public class LonelyTwitterActivityUITest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	Instrumentation instrumentation;
	Activity activity;
	EditText textInput;
	
	public LonelyTwitterActivityUITest() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		instrumentation = getInstrumentation();
		activity = getActivity();

		textInput = ((EditText) activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.body));
	}
	public void testAddTweet() throws Throwable{
		runTestOnUiThread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				//	ListView oldTweetsList;
				ListView oldTweetsList;
				oldTweetsList = (ListView)activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.oldTweetsList);
				ArrayAdapter<NormalTweetModel> adapter = (ArrayAdapter)oldTweetsList.getAdapter();
				int before = adapter.getCount();

				String text = "Hello world";
				makeTweet(text);
				int after = adapter.getCount();

				assertTrue(after > before);
				assertFalse(before > after);

				NormalTweetModel as = adapter.getItem(adapter.getCount() - 1);
				//check if it's normal type
				assertTrue(as.getClass() == NormalTweetModel.class);
				//check if it's the same as before
				assertTrue(as.getText().equals(text));
				assertFalse(as.getText().equals(text + text));

				assertFalse(textInput.getText().toString() == null || textInput.getText().toString().equals(""));//makeTweet("hi there");
			}
		});
		//makeTweet("hi there");
	}
	
	/*
	 * fills in the input text field and clicks the 'save'
	 * button for the activity under test
	 */
	private void makeTweet(String text) {
		assertNotNull(activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.save));
		textInput.setText(text);
		((Button) activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.save)).performClick();
	}
}

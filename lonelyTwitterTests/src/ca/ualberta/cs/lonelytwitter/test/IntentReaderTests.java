package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.IntentReaderActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

@SuppressLint("NewApi")
public class IntentReaderTests extends ActivityInstrumentationTestCase2<IntentReaderActivity> {

	public IntentReaderTests() {
		super(IntentReaderActivity.class);
	}
	public void testSendText(){
		Intent intent = new Intent();
		String text ="hello";
		intent.putExtra(IntentReaderActivity.TEXT_KEY,text);
		setActivityIntent(intent);
		IntentReaderActivity activity =getActivity();
		
		
		assertNotNull(activity);
		
		assertEquals("IntentReaderActivity should get text from intent",text,activity.getText());
	}
	public void testDoubleText(){
		Intent intent = new Intent();
		String text ="hello";
		intent.putExtra(IntentReaderActivity.TEXT_KEY,text);
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY,IntentReaderActivity.DOUBLE);
		setActivityIntent(intent);
		IntentReaderActivity activity =getActivity();
		
		
		assertNotNull(activity);
		
		assertEquals("IntentReaderActivity should get text from intent",text+text,activity.getText());
	}
	
	public void testDisplayText(){
		Intent intent = new Intent();
		String text ="hello";
		intent.putExtra(IntentReaderActivity.TEXT_KEY,text);
		setActivityIntent(intent);
		IntentReaderActivity activity =getActivity();
		
		
		assertNotNull(activity);
		
		TextView textView =(TextView) activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.intentText);
		assertEquals("intentReaderActivity should display text", text,textView.getText().toString());
	}
}

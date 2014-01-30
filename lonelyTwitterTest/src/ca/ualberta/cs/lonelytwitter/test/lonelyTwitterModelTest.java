package ca.ualberta.cs.lonelytwitter.test;

import java.util.Date;

import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import android.test.ActivityInstrumentationTestCase2;

public class lonelyTwitterModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public lonelyTwitterModelTest() {
		super(LonelyTwitterActivity.class);
	}
	public void testFailure(){
         assertEquals("5 should not equal 4", 5,4);
         //fail("failure");
 }
	public void testEquals(){
		Date date=new Date();
		NormalTweetModel normal = new NormalTweetModel("test",date);
		NormalTweetModel otherNormal = new NormalTweetModel("different text",date);
		
		assertFalse("different tweets are not equal",
				normal.equals(otherNormal));
	}
}


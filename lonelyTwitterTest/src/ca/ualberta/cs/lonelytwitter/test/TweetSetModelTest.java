package ca.ualberta.cs.lonelytwitter.test;

import java.util.Date;

import ca.ualberta.cs.lonelytwitter.ImportantTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import android.test.ActivityInstrumentationTestCase2;

public class TweetSetModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public TweetSetModelTest() {
		super(LonelyTwitterActivity.class);
	}
	public void testequal(){
        String testString = "test";
        Date date = new Date();
        ImportantTweetModel importmo = new ImportantTweetModel(testString, date);
        NormalTweetModel normo = new NormalTweetModel(testString, date);
        //LonelyTweetModel lonelyTweetModel = new LonelyTweetModel(testString);
       
        boolean norResult = importmo.equals(normo);
        boolean norResult_import_own = importmo.equals(importmo);
        boolean importResult = normo.equals(importmo);
        boolean importResult_normal_own = normo.equals(normo);
       
        assertFalse("normal Vs important(import.equal)", norResult);
        assertTrue("important Vs important(import.equal)", norResult_import_own);
        assertFalse("normal Vs important(normal.equal)", importResult);
        assertTrue("normal Vs normal(normal.equal)", importResult_normal_own);
    }


}

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetController implements TweetControllerInterface {
	private TweetListModel tweetListModel;
	
	public void addTweet(String text) {
		// TODO Auto-generated method stub
		ArrayList<AbsractTweetModel> list=tweetListModel.getTweetList();
		list.add(new NormalTweetModel(text));
	}

	public TweetController() {
		super();
		// TODO Auto-generated constructor stub
		tweetListModel= new TweetListModel();
		
	}
	
	
}

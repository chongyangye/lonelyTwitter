package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetListModel {
	private ArrayList<AbsractTweetModel> tweetList;

	public ArrayList<AbsractTweetModel> getTweetList() {
		return tweetList;
	}

	public void setTweetList(ArrayList<AbsractTweetModel> tweetList) {
		this.tweetList = tweetList;
	}

	public TweetListModel() {
		super();
		// TODO Auto-generated constructor stub
		tweetList = new ArrayList<AbsractTweetModel>();
	}

}

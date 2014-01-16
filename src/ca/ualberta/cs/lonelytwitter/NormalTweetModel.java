package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class NormalTweetModel extends AbsractTweetModel {

	public NormalTweetModel(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Date getTimestamp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isImportant() {
		// TODO Auto-generated method stub
		return false;
	}

}

package com.android.rudolfmedia.criminalintent;

import java.util.UUID;

/**
 * Created by danRudolf on 12/2/14.
 */
public class Crime {

	private UUID mID;
	private String mTitle;



	public Crime () {

		mID = UUID.randomUUID();
	}

	public UUID getID( ){

		return mID;
	}

	public String getTitle() {

		return mTitle;
	}

	public void setTitle (String title){

		mTitle = title;
	}


}
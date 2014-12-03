package com.android.rudolfmedia.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by danRudolf on 12/2/14.
 */
public class Crime {

	private UUID mID;
	private String mTitle;
	private Date mDate;
	private boolean mSolved;




	public Crime () {

		mID = UUID.randomUUID();
		mDate = new Date();
	}

	@Override
	public String toString(){
		return mTitle;
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

	public Date getDate(){

		return mDate;
	}

	public void setDate(Date date){

		mDate = date;
	}

	public void setSolved(boolean solved){

		mSolved = solved;
	}

	public boolean isSolved(){

		return mSolved;
	}


}

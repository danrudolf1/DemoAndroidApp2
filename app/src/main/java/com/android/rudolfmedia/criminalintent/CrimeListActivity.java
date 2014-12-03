package com.android.rudolfmedia.criminalintent;


/**
 * Created by danRudolf on 12/2/14.
 */
public class CrimeListActivity extends SingleFragmentActivity {

	@Override
	protected android.support.v4.app.Fragment createFragment() {
		return new CrimeListFragment();
	}

}

package com.android.rudolfmedia.criminalintent;


import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by danRudolf on 12/2/14.
 */
public class CrimeListFragment extends ListFragment{

	private ArrayList<Crime> mCrimes;
	private static final String TAG = "CrimeListFragment";

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		getActivity().setTitle(R.string.crimes_title);
		mCrimes = CrimeLab.getCrimeLab(getActivity()).getCrimes();

		CrimeAdapter adapter = new CrimeAdapter(mCrimes);
		setListAdapter(adapter);

	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id){
		Crime c = ((CrimeAdapter)getListAdapter()).getItem(position);
	}

	private class CrimeAdapter extends ArrayAdapter<Crime> {
		public  CrimeAdapter(ArrayList<Crime> crimes) {
			super(getActivity(), 0, crimes);
		}
			@Override
			public View getView(int position, View convertView, ViewGroup parent) {

				if (convertView == null) {
					convertView = getActivity().getLayoutInflater().inflate(R.layout.list_item_crime, parent, false);
				}
				Crime c = getItem(position);

				TextView titleTextView = (TextView) convertView.findViewById(R.id.crime_list_item_titleTextView);
				titleTextView.setText(c.getTitle());

				TextView dateTextView = (TextView)convertView.findViewById(R.id.crime_list_item_dateTextView);
				dateTextView.setText(c.getDate().toString());

				CheckBox solvedCheckBox = (CheckBox)convertView.findViewById(R.id.crime_list_item_solvedCheckBox);
				solvedCheckBox.setChecked(c.isSolved());

				return convertView;

			}
	}

}

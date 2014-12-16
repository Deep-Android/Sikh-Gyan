package com.jmatharu.gurbanigyan;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import com.jmatharu.gurbanigyan.fragments.FragmentA;
import com.jmatharu.gurbanigyan.fragments.FragmentB;
import com.jmatharu.gurbanigyan.fragments.FragmentC;
import com.jmatharu.gurbanigyan.fragments.FragmentD;
import com.jmatharu.gurbanigyan.fragments.FragmentE;
import com.jmatharu.gurbanigyan.fragments.FragmentF;
import com.jmatharu.gurbanigyan.fragments.FragmentG;
import com.jmatharu.gurbanigyan.fragments.FragmentH;
import com.jmatharu.gurbanigyan.fragments.FragmentI;
import com.jmatharu.gurbanigyan.fragments.FragmentJ;
import com.jmatharu.gurbanigyan.fragments.FragmentK;
import com.jmatharu.gurbanigyan.fragments.FragmentL;
import com.jmatharu.gurbanigyan.fragments.FragmentM;
import com.jmatharu.gurbanigyan.fragments.FragmentN;
import com.jmatharu.gurbanigyan.fragments.FragmentO;
import com.jmatharu.gurbanigyan.fragments.FragmentP;
import com.jmatharu.gurbanigyan.fragments.FragmentQ;

public class MainActivity extends FragmentActivity {

	ViewPager viewPager = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Declaring
		viewPager = (ViewPager) findViewById(R.id.ViewPagerActivity);
		FragmentManager fragmentManger = getSupportFragmentManager();
		viewPager.setAdapter(new MyAdapter(fragmentManger));
	}
}

class MyAdapter extends FragmentStatePagerAdapter {

	public MyAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		Fragment fragment = null;
		if (arg0 == 0) {
			fragment = new FragmentA();
		}
		if (arg0 == 1) {
			fragment = new FragmentB();
		}
		if (arg0 == 2) {
			fragment = new FragmentC();
		}
		if (arg0 == 3) {
			fragment = new FragmentD();
		}
		if (arg0 == 4) {
			fragment = new FragmentE();
		}
		if (arg0 == 5) {
			fragment = new FragmentF();
		}
		if (arg0 == 6) {
			fragment = new FragmentG();
		}
		if (arg0 == 7) {
			fragment = new FragmentH();
		}
		if (arg0 == 8) {
			fragment = new FragmentI();
		}
		if (arg0 == 9) {
			fragment = new FragmentJ();
		}
		if (arg0 == 10) {
			fragment = new FragmentK();
		}
		if (arg0 == 11) {
			fragment = new FragmentL();
		}
		if (arg0 == 12) {
			fragment = new FragmentM();
		}
		if (arg0 == 13) {
			fragment = new FragmentN();
		}
		if (arg0 == 14) {
			fragment = new FragmentO();
		}
		if (arg0 == 15) {
			fragment = new FragmentP();
		}
		if (arg0 == 16) {
			fragment = new FragmentQ();
		}
		return fragment;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 17;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		// TODO Auto-generated method stub

		if (position == 0) {
			return "Grazing Buffaloes";
		}
		if (position == 1) {
			return "Bhai Lalo and Malik Bhago";
		}
		if (position == 2) {
			return "Sajjan Rogue";
		}
		if (position == 3) {
			return "Kauda the Cannibal";
		}
		if (position == 4) {
			return "Wali Qandhari, the Arrogant Priest";
		}
		if (position == 5) {
			return "Realization of Offering Water to Ancestors at Haridwar";
		}
		if (position == 6) {
			return "Why does God Himself helps His Devotees?";
		}
		if (position == 7) {
			return "Tapa, the Monk";
		}
		if (position == 8) {
			return "Revival of Manak Chand";
		}
		if (position == 9) {
			return "God saved Sain Ji's Job";
		}
		if (position == 10) {
			return "Kabeer Ji Tied Up in Chains, Saved by God";
		}
		if (position == 11) {
			return "Naamdev Ji and the Hindu Priests";
		}
		if (position == 12) {
			return "Leper and the Wonder Lake";
		}
		if (position == 13) {
			return "The King and The Queen";
		}
		if (position == 14) {
			return "Evil Greed";
		}
		if (position == 15) {
			return "Hypocrite Priest";
		}
		if (position == 16) {
			return "Why do Good People Suffer?";
		}
		return null;
	}
}
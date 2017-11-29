package com.bignerdranch.android.criminalintent4;

import android.support.v4.app.Fragment;

/**
 * Created by ltt19 on 2017/11/11.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}

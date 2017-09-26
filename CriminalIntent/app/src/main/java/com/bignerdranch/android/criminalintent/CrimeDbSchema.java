package com.bignerdranch.android.criminalintent;

/**
 * Created by ltt19 on 2017/9/20.
 */

public class CrimeDbSchema {
    public static final class CrimeTable {
        public static final String NAME = "crimes";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "TITLE";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
        }

    }
}

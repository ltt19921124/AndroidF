package com.example.broadcastbestpractice2;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ltt19 on 2017/12/20.
 */

public class ActivityCollector {


    public static List<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity) {
        activities.remove(activity);
    }

    public static void removeActivity(Activity activity) {
        activities.remove(activity);
    }
    public static void finishAll() {
        for (Activity activity : activities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }
}

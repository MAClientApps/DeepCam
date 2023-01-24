package com.lakshitasuman.deepcam;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.sdk.perelander.Mob;
import com.sdk.perelander.MobConfig;

import vocsy.ads.AdsApplication;

public class AugsMyapplication extends AdsApplication {

    public MobConfig mobConfig;

    @Override
    public void onCreate() {
        super.onCreate();

        mobConfig = new MobConfig(this, "1221vbq99ksg");
        Mob.onCreate(mobConfig);
        registerActivityLifecycleCallbacks(new MobLifecycleCallbacks());

    }

    private static final class MobLifecycleCallbacks implements ActivityLifecycleCallbacks {
        @Override
        public void onActivityResumed(Activity activity) {
            Mob.onResume(activity);
        }

        @Override
        public void onActivityPaused(Activity activity) {
            Mob.onPause();
        }

        @Override
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle savedInstanceState) {
        }

        @Override
        public void onActivityStarted(@NonNull Activity activity) {
        }

        @Override
        public void onActivityStopped(@NonNull Activity activity) {
        }

        @Override
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle outState) {
        }

        @Override
        public void onActivityDestroyed(@NonNull Activity activity) {
        }
    }
}

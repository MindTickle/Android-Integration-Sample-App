package com.mindtickle.integrations.testmindtickle6;

import android.app.Application;
import android.content.Context;

import com.mindtickle.integrations.android_sdk.MindTickle;

/**
 * Created by himanshugupta on 15/10/16.
 */

public class TestMindTickle6Application extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        MindTickle.initialize(
                getApplicationContext(),
                "rachit.idea08.mindtickle.com",
                "cc6ce537a8295708cbece6b715a242ee8d4d482222cdd4e12975b4792e4443a71a72135a152972506fe55777c34c4332");
    }
}

package com.app.autoupdateandroid;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Log;

import androidx.core.content.FileProvider;

import java.io.File;
import java.io.IOException;

public class UpdateChecker {


    public static void checkForDialog(Context context) {
        if (context != null) {
            new CheckUpdateTask(context, Constants.TYPE_DIALOG, true).execute();
        } else {
            Log.e(Constants.TAG, "The arg context is null");
        }
    }


    public static void checkForNotification(Context context) {
        if (context != null) {
            new CheckUpdateTask(context, Constants.TYPE_NOTIFICATION, false).execute();
        } else {
            Log.e(Constants.TAG, "The arg context is null");
        }

    }


}
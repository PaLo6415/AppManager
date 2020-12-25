package android.content.pm;

import android.content.Intent;

interface IPackageDeleteObserver2 {
    void onUserActionRequired(Intent intent);
    void onPackageDeleted(String packageName, int returnCode, String msg);
}
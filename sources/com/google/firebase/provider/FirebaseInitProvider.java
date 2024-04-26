package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.internal.i;
import com.google.firebase.a;
import fa.d;

public class FirebaseInitProvider extends ContentProvider {
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        i.i(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if (!"com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            super.attachInfo(context, providerInfo);
            return;
        }
        throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        a aVar;
        Context context = getContext();
        synchronized (a.f9659i) {
            if (((s.i) a.f9661k).e("[DEFAULT]") >= 0) {
                aVar = a.b();
            } else {
                d a10 = d.a(context);
                if (a10 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    aVar = null;
                } else {
                    aVar = a.e(context, a10);
                }
            }
        }
        if (aVar == null) {
            Log.i("FirebaseInitProvider", "FirebaseApp initialization unsuccessful");
        } else {
            Log.i("FirebaseInitProvider", "FirebaseApp initialization successful");
        }
        return false;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}

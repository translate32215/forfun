package com.google.android.gms.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import e8.fj0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public class MobileAdsInitProvider extends ContentProvider {

    /* renamed from: a  reason: collision with root package name */
    public final fj0 f5572a = new fj0();

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        this.f5572a.attachInfo(context, providerInfo);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        this.f5572a.getClass();
        return 0;
    }

    public String getType(Uri uri) {
        this.f5572a.getClass();
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        this.f5572a.getClass();
        return null;
    }

    public boolean onCreate() {
        this.f5572a.getClass();
        return false;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        this.f5572a.getClass();
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        this.f5572a.getClass();
        return 0;
    }
}

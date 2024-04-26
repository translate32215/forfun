package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class m implements Callable<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f5672a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f5673b;

    public m(Context context, Context context2) {
        this.f5672a = context;
        this.f5673b = context2;
    }

    public final /* synthetic */ Object call() throws Exception {
        SharedPreferences sharedPreferences;
        boolean z10 = false;
        if (this.f5672a != null) {
            e.H("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.f5672a.getSharedPreferences("admob_user_agent", 0);
        } else {
            e.H("Attempting to read user agent from local cache.");
            sharedPreferences = this.f5673b.getSharedPreferences("admob_user_agent", 0);
            z10 = true;
        }
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            e.H("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.f5673b);
            if (z10) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                e.H("Persisting user agent.");
            }
        }
        return string;
    }
}

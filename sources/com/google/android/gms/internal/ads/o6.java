package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import e8.t;
import e8.ti0;
import f7.d0;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class o6 implements SharedPreferences.OnSharedPreferenceChangeListener {
    @GuardedBy("AdMobPlusIdlessListener.class")

    /* renamed from: c  reason: collision with root package name */
    public static o6 f7669c;

    /* renamed from: a  reason: collision with root package name */
    public final d0 f7670a;

    /* renamed from: b  reason: collision with root package name */
    public String f7671b = "";

    public o6(Context context, d0 d0Var) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        this.f7670a = d0Var;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(defaultSharedPreferences, "IABTCF_PurposeConsents");
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("IABTCF_PurposeConsents".equals(str)) {
            String string = sharedPreferences.getString("IABTCF_PurposeConsents", "");
            if (!string.isEmpty() && !this.f7671b.equals(string)) {
                this.f7671b = string;
                boolean z10 = false;
                if (string.charAt(0) != '1') {
                    z10 = true;
                }
                if (((Boolean) ti0.f16763j.f16769f.a(t.f16579g0)).booleanValue()) {
                    this.f7670a.h(z10);
                }
                ((Boolean) ti0.f16763j.f16769f.a(t.f16573f0)).booleanValue();
            }
        }
    }
}

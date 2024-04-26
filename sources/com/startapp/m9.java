package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.SimpleTokenUtils;
import com.startapp.sdk.common.SDKException;

/* compiled from: Sta */
public class m9 extends y0 {

    /* renamed from: h0  reason: collision with root package name */
    public l8 f10880h0;

    /* renamed from: i0  reason: collision with root package name */
    public String f10881i0;

    public m9(Context context) {
        super(1);
        this.f10880h0 = f8.a(context);
        this.f10881i0 = a0.a(context);
    }

    public void a(m8 m8Var) throws SDKException {
        super.a(m8Var);
        m8Var.a("placement", (Object) "INAPP_DOWNLOAD", true, true);
        l8 l8Var = this.f10880h0;
        if (l8Var != null) {
            m8Var.a("install_referrer", (Object) l8Var.f10812a.getString("install_referrer"), true, true);
            m8Var.a("referrer_click_timestamp_seconds", (Object) Long.valueOf(this.f10880h0.f10812a.getLong("referrer_click_timestamp_seconds")), true, true);
            m8Var.a("install_begin_timestamp_seconds", (Object) Long.valueOf(this.f10880h0.f10812a.getLong("install_begin_timestamp_seconds")), true, true);
        }
        m8Var.a("apkSig", (Object) this.f10881i0, true, true);
        long j10 = SimpleTokenUtils.f12114c;
        if (j10 != 0) {
            m8Var.a("firstInstalledAppTS", (Object) Long.valueOf(j10), false, true);
        }
    }
}

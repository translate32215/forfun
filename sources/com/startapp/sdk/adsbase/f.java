package com.startapp.sdk.adsbase;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.b3;
import com.startapp.i4;
import com.startapp.m9;
import com.startapp.o7;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.wb;
import com.startapp.y3;

/* compiled from: Sta */
public class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f12339a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ComponentLocator f12340b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f12341c;

    public f(StartAppSDKInternal startAppSDKInternal, Context context, ComponentLocator componentLocator, e eVar) {
        this.f12339a = context;
        this.f12340b = componentLocator;
        this.f12341c = eVar;
    }

    public void run() {
        Boolean bool;
        o7.a aVar;
        try {
            m9 m9Var = new m9(this.f12339a);
            m9Var.a(this.f12339a, new AdPreferences());
            y3 k10 = this.f12340b.k();
            StringBuilder sb2 = new StringBuilder();
            MetaData metaData = MetaData.f12393k;
            String str = metaData.trackDownloadHost;
            if (str == null) {
                str = metaData.c();
            }
            sb2.append(str);
            sb2.append(AdsConstants.f12101c);
            String sb3 = sb2.toString();
            k10.getClass();
            bool = null;
            aVar = k10.a(sb3, m9Var, (b3<Throwable, Void>) null);
        } catch (Throwable th) {
            i4.a(th);
            return;
        }
        if (aVar != null) {
            String str2 = aVar.f11522a;
            if (!TextUtils.isEmpty(str2)) {
                String a10 = wb.a(str2, "@ct@", "@ct@");
                String a11 = wb.a(str2, "@tsc@", "@tsc@");
                String a12 = wb.a(str2, "@apc@", "@apc@");
                try {
                    Integer valueOf = !TextUtils.isEmpty(a10) ? Integer.valueOf(Integer.parseInt(a10)) : null;
                    Long valueOf2 = !TextUtils.isEmpty(a11) ? Long.valueOf(Long.parseLong(a11)) : null;
                    if (!TextUtils.isEmpty(a12)) {
                        bool = Boolean.valueOf(Boolean.parseBoolean(a12));
                    }
                    Boolean bool2 = bool;
                    if (!(valueOf == null && valueOf2 == null && bool2 == null)) {
                        this.f12340b.f().a(valueOf, valueOf2, bool2, false, true);
                    }
                } catch (Throwable th2) {
                    i4.a(th2);
                }
            }
        }
        e.a a13 = this.f12341c.edit();
        a13.a("shared_prefs_first_init", Boolean.FALSE);
        a13.f12335a.putBoolean("shared_prefs_first_init", false);
        a13.apply();
    }
}

package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.remoteconfig.StaleDcConfig;

/* compiled from: Sta */
public class ga extends i2<fa> {

    /* renamed from: e  reason: collision with root package name */
    public final e f10467e;

    /* renamed from: f  reason: collision with root package name */
    public final d3<StaleDcConfig> f10468f;

    public ga(Context context, e eVar, d3<StaleDcConfig> d3Var) {
        super(context, 86400000);
        this.f10467e = eVar;
        this.f10468f = d3Var;
    }

    public Object a(boolean z10) {
        fa faVar = new fa();
        String str = null;
        if (!z10) {
            str = this.f10467e.getString("a83b59c2138cbf65", (String) null);
        }
        if (str == null) {
            Context context = this.f10529a;
            context.getPackageName();
            str = wb.b(context);
            e.a a10 = this.f10467e.edit();
            a10.a("a83b59c2138cbf65", str);
            a10.f12335a.putString("a83b59c2138cbf65", str);
            a10.apply();
        }
        faVar.f10386a = str;
        return faVar;
    }

    public Object c() {
        return new fa();
    }
}

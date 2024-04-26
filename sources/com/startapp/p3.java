package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* compiled from: Sta */
public class p3 extends x0 {

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o9 f11566a;

        public a(o9 o9Var) {
            this.f11566a = o9Var;
        }

        public void run() {
            JSONArray jSONArray;
            o9 o9Var = this.f11566a;
            o9Var.f11531c.unregisterListener(o9Var.f11534f);
            v7 v7Var = p3.this.f12781b;
            o9 o9Var2 = this.f11566a;
            o9Var2.getClass();
            try {
                jSONArray = o9Var2.f11530b.a();
            } catch (Exception unused) {
                jSONArray = null;
            }
            v7Var.a(jSONArray);
        }
    }

    public p3(Context context, v7 v7Var) {
        super(context, v7Var);
    }

    public void a() {
        try {
            long millis = TimeUnit.SECONDS.toMillis((long) MetaData.f12393k.G().k());
            o9 o9Var = new o9(this.f12780a, this.f12781b);
            this.f12782c.postDelayed(new a(o9Var), millis);
            o9Var.b();
        } catch (Throwable th) {
            i4.a(th);
            this.f12781b.a((Object) null);
        }
    }
}

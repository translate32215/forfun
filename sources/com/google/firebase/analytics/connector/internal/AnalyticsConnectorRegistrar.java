package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.i;
import ja.a;
import ja.b;
import ja.c;
import java.util.Arrays;
import java.util.List;
import k8.s1;
import la.c;
import la.d;
import la.g;
import la.m;

@Keep
/* compiled from: com.google.android.gms:play-services-measurement-api@@19.0.2 */
public class AnalyticsConnectorRegistrar implements g {
    public static a lambda$getComponents$0(d dVar) {
        com.google.firebase.a aVar = (com.google.firebase.a) dVar.a(com.google.firebase.a.class);
        Context context = (Context) dVar.a(Context.class);
        ra.d dVar2 = (ra.d) dVar.a(ra.d.class);
        if (aVar == null) {
            throw new NullPointerException("null reference");
        } else if (context == null) {
            throw new NullPointerException("null reference");
        } else if (dVar2 != null) {
            i.h(context.getApplicationContext());
            if (b.f19696b == null) {
                synchronized (b.class) {
                    if (b.f19696b == null) {
                        Bundle bundle = new Bundle(1);
                        if (aVar.g()) {
                            dVar2.b(fa.a.class, ja.d.f19699a, c.f19698a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", aVar.f());
                        }
                        b.f19696b = new b(s1.e(context, (String) null, (String) null, (String) null, bundle).f20456b);
                    }
                }
            }
            return b.f19696b;
        } else {
            throw new NullPointerException("null reference");
        }
    }

    @SuppressLint({"MissingPermission"})
    @Keep
    public List<la.c<?>> getComponents() {
        c.b<a> a10 = la.c.a(a.class);
        a10.a(new m(com.google.firebase.a.class, 1, 0));
        a10.a(new m(Context.class, 1, 0));
        a10.a(new m(ra.d.class, 1, 0));
        a10.f21195e = ka.a.f20573a;
        a10.c(2);
        return Arrays.asList(new la.c[]{a10.b(), cb.g.a("fire-analytics", "19.0.2")});
    }
}

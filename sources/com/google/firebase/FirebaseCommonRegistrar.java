package com.google.firebase;

import android.content.Context;
import android.os.Build;
import cb.b;
import cb.e;
import cb.h;
import java.util.ArrayList;
import java.util.List;
import la.c;
import la.g;
import la.m;
import sa.d;
import t4.k;
import t4.l;
import t4.o;
import t4.p;

public class FirebaseCommonRegistrar implements g {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public List<c<?>> getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        c.b<h> a10 = c.a(h.class);
        a10.a(new m(e.class, 2, 0));
        a10.f21195e = b.f4369a;
        arrayList.add(a10.b());
        int i10 = sa.c.f25185b;
        c.b<sa.e> a11 = c.a(sa.e.class);
        a11.a(new m(Context.class, 1, 0));
        a11.a(new m(d.class, 2, 0));
        a11.f21195e = sa.b.f25184a;
        arrayList.add(a11.b());
        arrayList.add(cb.g.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(cb.g.a("fire-core", "20.0.0"));
        arrayList.add(cb.g.a("device-name", a(Build.PRODUCT)));
        arrayList.add(cb.g.a("device-model", a(Build.DEVICE)));
        arrayList.add(cb.g.a("device-brand", a(Build.BRAND)));
        arrayList.add(cb.g.b("android-target-sdk", k.f25708b));
        arrayList.add(cb.g.b("android-min-sdk", l.f25710b));
        arrayList.add(cb.g.b("android-platform", p.f25718c));
        arrayList.add(cb.g.b("android-installer", o.f25715b));
        try {
            str = kd.c.f20605e.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(cb.g.a("kotlin", str));
        }
        return arrayList;
    }
}

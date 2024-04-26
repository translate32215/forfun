package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import e8.pi;
import e8.w8;
import e8.x8;
import e8.zh0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class xe implements pi {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    public final HashSet<x6> f8551a = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    public final Context f8552b;

    /* renamed from: c  reason: collision with root package name */
    public final x8 f8553c;

    public xe(Context context, x8 x8Var) {
        this.f8552b = context;
        this.f8553c = x8Var;
    }

    public final Bundle a() {
        String str;
        Bundle bundle;
        x8 x8Var = this.f8553c;
        Context context = this.f8552b;
        x8Var.getClass();
        HashSet hashSet = new HashSet();
        synchronized (x8Var.f17444a) {
            hashSet.addAll(x8Var.f17448e);
            x8Var.f17448e.clear();
        }
        Bundle bundle2 = new Bundle();
        z6 z6Var = x8Var.f17447d;
        a7 a7Var = x8Var.f17446c;
        synchronized (a7Var) {
            str = a7Var.f5944b;
        }
        synchronized (z6Var.f8676f) {
            bundle = new Bundle();
            bundle.putString("session_id", z6Var.f8678h.b() ? "" : z6Var.f8677g);
            bundle.putLong("basets", z6Var.f8672b);
            bundle.putLong("currts", z6Var.f8671a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", z6Var.f8673c);
            bundle.putInt("preqs_in_session", z6Var.f8674d);
            bundle.putLong("time_in_session", z6Var.f8675e);
            bundle.putInt("pclick", z6Var.f8679i);
            bundle.putInt("pimp", z6Var.f8680j);
            bundle.putBoolean("support_transparent_background", z6.b(context));
        }
        bundle2.putBundle("app", bundle);
        Bundle bundle3 = new Bundle();
        Iterator<w8> it = x8Var.f17449f.iterator();
        if (!it.hasNext()) {
            bundle2.putBundle("slots", bundle3);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(((x6) it2.next()).a());
            }
            bundle2.putParcelableArrayList("ads", arrayList);
            synchronized (this) {
                this.f8551a.clear();
                this.f8551a.addAll(hashSet);
            }
            return bundle2;
        }
        w8 next = it.next();
        throw new NoSuchMethodError();
    }

    public final synchronized void j0(zh0 zh0) {
        if (zh0.f17753a != 3) {
            x8 x8Var = this.f8553c;
            HashSet<x6> hashSet = this.f8551a;
            synchronized (x8Var.f17444a) {
                x8Var.f17448e.addAll(hashSet);
            }
        }
    }
}

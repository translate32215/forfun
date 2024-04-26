package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.JsonWriter;
import d7.l;
import e8.bj;
import e8.ek;
import e8.li;
import e8.m20;
import e8.pi;
import e8.pj;
import e8.q20;
import e8.t00;
import e8.v0;
import e8.vq;
import e8.wh0;
import e8.zh0;
import e8.zi;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import l0.e;
import z6.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class lb implements a, li, pi, zi, bj, pj, ek, q20, wh0 {

    /* renamed from: a  reason: collision with root package name */
    public final List<Object> f7357a;

    /* renamed from: b  reason: collision with root package name */
    public final vq f7358b;

    /* renamed from: c  reason: collision with root package name */
    public long f7359c;

    public lb(vq vqVar, b8 b8Var) {
        this.f7358b = vqVar;
        this.f7357a = Collections.singletonList(b8Var);
    }

    public final void B(Cif ifVar, String str) {
        Q(m20.class, "onTaskStarted", str);
    }

    public final void C() {
        Q(li.class, "onAdClosed", new Object[0]);
    }

    public final void C0(t00 t00) {
    }

    public final void F() {
        Q(li.class, "onAdOpened", new Object[0]);
    }

    public final void J() {
        Q(li.class, "onAdLeftApplication", new Object[0]);
    }

    public final void O() {
        Q(zi.class, "onAdImpression", new Object[0]);
    }

    public final void P(Cif ifVar, String str) {
        Q(m20.class, "onTaskSucceeded", str);
    }

    public final void Q(Class<?> cls, String str, Object... objArr) {
        vq vqVar = this.f7358b;
        List<Object> list = this.f7357a;
        String simpleName = cls.getSimpleName();
        String concat = simpleName.length() != 0 ? "Event-".concat(simpleName) : new String("Event-");
        vqVar.getClass();
        if (((Boolean) v0.f17011a.b()).booleanValue()) {
            long b10 = vqVar.f17158a.b();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(b10);
                jsonWriter.name("source").value(concat);
                jsonWriter.name("event").value(str);
                jsonWriter.name("components").beginArray();
                for (Object obj : list) {
                    jsonWriter.value(obj.toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    Object obj2 = objArr[i10];
                    jsonWriter.value(obj2 != null ? obj2.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e10) {
                e.C("unable to log", e10);
            }
            String valueOf = String.valueOf(stringWriter.toString());
            e.J(valueOf.length() != 0 ? "AD-DBG ".concat(valueOf) : new String("AD-DBG "));
        }
    }

    public final void a(String str, String str2) {
        Q(a.class, "onAppEvent", str, str2);
    }

    public final void d0() {
        Q(li.class, "onRewardedVideoStarted", new Object[0]);
    }

    public final void g(Cif ifVar, String str, Throwable th) {
        Q(m20.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    public final void g0() {
        Q(li.class, "onRewardedVideoCompleted", new Object[0]);
    }

    public final void j0(zh0 zh0) {
        Q(pi.class, "onAdFailedToLoad", Integer.valueOf(zh0.f17753a), zh0.f17754b, zh0.f17755c);
    }

    public final void k0(l5 l5Var) {
        this.f7359c = l.B.f13193j.a();
        Q(ek.class, "onAdRequest", new Object[0]);
    }

    public final void l(Context context) {
        Q(bj.class, "onResume", context);
    }

    public final void m(Context context) {
        Q(bj.class, "onDestroy", context);
    }

    public final void n() {
        Q(wh0.class, "onAdClicked", new Object[0]);
    }

    @ParametersAreNonnullByDefault
    public final void t(m5 m5Var, String str, String str2) {
        Q(li.class, "onRewarded", m5Var, str, str2);
    }

    public final void v() {
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("Ad Request Latency : ");
        sb2.append(l.B.f13193j.a() - this.f7359c);
        e.H(sb2.toString());
        Q(pj.class, "onAdLoaded", new Object[0]);
    }

    public final void w(Context context) {
        Q(bj.class, "onPause", context);
    }

    public final void y(Cif ifVar, String str) {
        Q(m20.class, "onTaskCreated", str);
    }
}

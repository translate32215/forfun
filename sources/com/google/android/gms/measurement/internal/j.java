package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.i;
import o8.c4;
import o8.f3;
import o8.g;
import o8.g3;
import o8.h3;
import o8.i3;
import o8.j3;
import o8.v2;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class j extends c4 {

    /* renamed from: w  reason: collision with root package name */
    public static final Pair<String, Long> f8807w = new Pair<>("", 0L);

    /* renamed from: c  reason: collision with root package name */
    public SharedPreferences f8808c;

    /* renamed from: d  reason: collision with root package name */
    public i3 f8809d;

    /* renamed from: e  reason: collision with root package name */
    public final h3 f8810e = new h3(this, "first_open_time", 0);

    /* renamed from: f  reason: collision with root package name */
    public final j3 f8811f;

    /* renamed from: g  reason: collision with root package name */
    public String f8812g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f8813h;

    /* renamed from: i  reason: collision with root package name */
    public long f8814i;

    /* renamed from: j  reason: collision with root package name */
    public final h3 f8815j = new h3(this, "session_timeout", 1800000);

    /* renamed from: k  reason: collision with root package name */
    public final f3 f8816k = new f3(this, "start_new_session", true);

    /* renamed from: l  reason: collision with root package name */
    public final j3 f8817l = new j3(this, "non_personalized_ads");

    /* renamed from: m  reason: collision with root package name */
    public final f3 f8818m = new f3(this, "allow_remote_dynamite", false);

    /* renamed from: n  reason: collision with root package name */
    public final h3 f8819n = new h3(this, "last_pause_time", 0);

    /* renamed from: o  reason: collision with root package name */
    public boolean f8820o;

    /* renamed from: p  reason: collision with root package name */
    public final f3 f8821p;

    /* renamed from: q  reason: collision with root package name */
    public final f3 f8822q;

    /* renamed from: r  reason: collision with root package name */
    public final h3 f8823r;

    /* renamed from: s  reason: collision with root package name */
    public final j3 f8824s;

    /* renamed from: t  reason: collision with root package name */
    public final j3 f8825t;

    /* renamed from: u  reason: collision with root package name */
    public final h3 f8826u;

    /* renamed from: v  reason: collision with root package name */
    public final g3 f8827v;

    public j(l lVar) {
        super(lVar);
        i.e("app_install_time");
        this.f8811f = new j3(this, "app_instance_id");
        this.f8821p = new f3(this, "app_backgrounded", false);
        this.f8822q = new f3(this, "deep_link_retrieval_complete", false);
        this.f8823r = new h3(this, "deep_link_retrieval_attempts", 0);
        this.f8824s = new j3(this, "firebase_feature_rollouts");
        this.f8825t = new j3(this, "deferred_attribution_cache");
        this.f8826u = new h3(this, "deferred_attribution_cache_timestamp", 0);
        this.f8827v = new g3(this);
    }

    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    public final void i() {
        SharedPreferences sharedPreferences = this.f8864a.f8837a.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f8808c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f8820o = z10;
        if (!z10) {
            SharedPreferences.Editor edit = this.f8808c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f8864a.getClass();
        this.f8809d = new i3(this, Math.max(0, v2.f23503c.a(null).longValue()));
    }

    public final boolean j() {
        return true;
    }

    public final SharedPreferences o() {
        h();
        k();
        i.h(this.f8808c);
        return this.f8808c;
    }

    public final g p() {
        h();
        return g.b(o().getString("consent_settings", "G1"));
    }

    public final Boolean q() {
        h();
        if (o().contains("measurement_enabled")) {
            return Boolean.valueOf(o().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public final void r(Boolean bool) {
        h();
        SharedPreferences.Editor edit = o().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    public final void s(boolean z10) {
        h();
        this.f8864a.d().f8805n.b("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor edit = o().edit();
        edit.putBoolean("deferred_analytics_collection", z10);
        edit.apply();
    }

    public final boolean t(long j10) {
        return j10 - this.f8815j.a() > this.f8819n.a();
    }

    public final boolean u(int i10) {
        return g.h(i10, o().getInt("consent_source", 100));
    }
}

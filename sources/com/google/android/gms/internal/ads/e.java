package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import e8.l;
import f7.y;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
import t1.c;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class e implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final Object f6253a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final ConditionVariable f6254b = new ConditionVariable();

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f6255c = false;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f6256d = false;

    /* renamed from: e  reason: collision with root package name */
    public SharedPreferences f6257e = null;

    /* renamed from: f  reason: collision with root package name */
    public Bundle f6258f = new Bundle();

    /* renamed from: g  reason: collision with root package name */
    public Context f6259g;

    /* renamed from: h  reason: collision with root package name */
    public JSONObject f6260h = new JSONObject();

    public final <T> T a(l<T> lVar) {
        if (!this.f6254b.block(5000)) {
            synchronized (this.f6253a) {
                if (!this.f6256d) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.f6255c || this.f6257e == null) {
            synchronized (this.f6253a) {
                if (this.f6255c) {
                    if (this.f6257e == null) {
                    }
                }
                T t10 = lVar.f15347c;
                return t10;
            }
        }
        int i10 = lVar.f15345a;
        if (i10 == 2) {
            Bundle bundle = this.f6258f;
            if (bundle == null) {
                return lVar.f15347c;
            }
            return lVar.e(bundle);
        } else if (i10 != 1 || !this.f6260h.has(lVar.f15346b)) {
            return y.b(new c(this, (l) lVar));
        } else {
            return lVar.i(this.f6260h);
        }
    }

    public final void b() {
        if (this.f6257e != null) {
            try {
                this.f6260h = new JSONObject((String) y.b(new ri(this)));
            } catch (JSONException unused) {
            }
        }
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            b();
        }
    }
}

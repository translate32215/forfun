package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.su;
import d7.l;
import e8.h9;
import e8.k9;
import e8.o50;
import e8.p50;
import e8.q0;
import e8.t;
import e8.ti0;
import e8.u8;
import f7.d0;
import f7.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import l0.e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class o implements d0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5679a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public boolean f5680b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Runnable> f5681c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public p50<?> f5682d;
    @GuardedBy("lock")

    /* renamed from: e  reason: collision with root package name */
    public su f5683e = null;
    @GuardedBy("lock")

    /* renamed from: f  reason: collision with root package name */
    public SharedPreferences f5684f;
    @GuardedBy("lock")

    /* renamed from: g  reason: collision with root package name */
    public SharedPreferences.Editor f5685g;
    @GuardedBy("lock")

    /* renamed from: h  reason: collision with root package name */
    public boolean f5686h = true;
    @GuardedBy("lock")

    /* renamed from: i  reason: collision with root package name */
    public String f5687i;
    @GuardedBy("lock")

    /* renamed from: j  reason: collision with root package name */
    public String f5688j;
    @GuardedBy("lock")

    /* renamed from: k  reason: collision with root package name */
    public boolean f5689k = true;
    @GuardedBy("lock")

    /* renamed from: l  reason: collision with root package name */
    public String f5690l = "";
    @GuardedBy("lock")

    /* renamed from: m  reason: collision with root package name */
    public long f5691m = 0;
    @GuardedBy("lock")

    /* renamed from: n  reason: collision with root package name */
    public long f5692n = 0;
    @GuardedBy("lock")

    /* renamed from: o  reason: collision with root package name */
    public long f5693o = 0;
    @GuardedBy("lock")

    /* renamed from: p  reason: collision with root package name */
    public int f5694p = -1;
    @GuardedBy("lock")

    /* renamed from: q  reason: collision with root package name */
    public int f5695q = 0;
    @GuardedBy("lock")

    /* renamed from: r  reason: collision with root package name */
    public Set<String> f5696r = Collections.emptySet();
    @GuardedBy("lock")

    /* renamed from: s  reason: collision with root package name */
    public JSONObject f5697s = new JSONObject();
    @GuardedBy("lock")

    /* renamed from: t  reason: collision with root package name */
    public boolean f5698t = true;
    @GuardedBy("lock")

    /* renamed from: u  reason: collision with root package name */
    public boolean f5699u = true;
    @GuardedBy("lock")

    /* renamed from: v  reason: collision with root package name */
    public String f5700v = null;
    @GuardedBy("lock")

    /* renamed from: w  reason: collision with root package name */
    public int f5701w = -1;

    public final String A() {
        String str;
        B();
        synchronized (this.f5679a) {
            str = this.f5700v;
        }
        return str;
    }

    public final void B() {
        p50<?> p50 = this.f5682d;
        if (p50 != null && !p50.isDone()) {
            try {
                this.f5682d.get(1, TimeUnit.SECONDS);
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                e.D("Interrupted while waiting for preferences loaded.", e10);
            } catch (CancellationException | ExecutionException | TimeoutException e11) {
                e.C("Fail to initialize AdSharedPreferenceManager.", e11);
            }
        }
    }

    public final void C() {
        o50 o50 = h9.f14881a;
        ((k9) o50).f15244a.execute(new j(this));
    }

    public final void a(int i10) {
        B();
        synchronized (this.f5679a) {
            if (this.f5695q != i10) {
                this.f5695q = i10;
                SharedPreferences.Editor editor = this.f5685g;
                if (editor != null) {
                    editor.putInt("version_code", i10);
                    this.f5685g.apply();
                }
                C();
            }
        }
    }

    public final boolean b() {
        boolean z10;
        if (!((Boolean) ti0.f16763j.f16769f.a(t.f16579g0)).booleanValue()) {
            return false;
        }
        B();
        synchronized (this.f5679a) {
            z10 = this.f5689k;
        }
        return z10;
    }

    public final void c(boolean z10) {
        B();
        synchronized (this.f5679a) {
            if (this.f5699u != z10) {
                this.f5699u = z10;
                SharedPreferences.Editor editor = this.f5685g;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z10);
                    this.f5685g.apply();
                }
                C();
            }
        }
    }

    public final long d() {
        long j10;
        B();
        synchronized (this.f5679a) {
            j10 = this.f5693o;
        }
        return j10;
    }

    public final void e(int i10) {
        B();
        synchronized (this.f5679a) {
            if (this.f5694p != i10) {
                this.f5694p = i10;
                SharedPreferences.Editor editor = this.f5685g;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i10);
                    this.f5685g.apply();
                }
                C();
            }
        }
    }

    public final void f(String str, String str2, boolean z10) {
        B();
        synchronized (this.f5679a) {
            JSONArray optJSONArray = this.f5697s.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            int i10 = 0;
            while (true) {
                if (i10 < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                    if (optJSONObject != null) {
                        if (!str2.equals(optJSONObject.optString("template_id"))) {
                            i10++;
                        } else if (!z10 || !optJSONObject.optBoolean("uses_media_view", false)) {
                            length = i10;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z10);
                jSONObject.put("timestamp_ms", l.B.f13193j.b());
                optJSONArray.put(length, jSONObject);
                this.f5697s.put(str, optJSONArray);
            } catch (JSONException e10) {
                e.D("Could not update native advanced settings", e10);
            }
            SharedPreferences.Editor editor = this.f5685g;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.f5697s.toString());
                this.f5685g.apply();
            }
            C();
        }
    }

    public final void g(long j10) {
        B();
        synchronized (this.f5679a) {
            if (this.f5692n != j10) {
                this.f5692n = j10;
                SharedPreferences.Editor editor = this.f5685g;
                if (editor != null) {
                    editor.putLong("app_last_background_time_ms", j10);
                    this.f5685g.apply();
                }
                C();
            }
        }
    }

    public final void h(boolean z10) {
        B();
        synchronized (this.f5679a) {
            if (z10 != this.f5689k) {
                this.f5689k = z10;
                SharedPreferences.Editor editor = this.f5685g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z10);
                    this.f5685g.apply();
                }
                C();
            }
        }
    }

    public final int i() {
        int i10;
        B();
        synchronized (this.f5679a) {
            i10 = this.f5694p;
        }
        return i10;
    }

    public final u8 j() {
        u8 u8Var;
        B();
        synchronized (this.f5679a) {
            u8Var = new u8(this.f5690l, this.f5691m);
        }
        return u8Var;
    }

    public final void k() {
        B();
        synchronized (this.f5679a) {
            this.f5697s = new JSONObject();
            SharedPreferences.Editor editor = this.f5685g;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.f5685g.apply();
            }
            C();
        }
    }

    public final long l() {
        long j10;
        B();
        synchronized (this.f5679a) {
            j10 = this.f5692n;
        }
        return j10;
    }

    public final int m() {
        int i10;
        B();
        synchronized (this.f5679a) {
            i10 = this.f5695q;
        }
        return i10;
    }

    public final void n(boolean z10) {
        B();
        synchronized (this.f5679a) {
            if (this.f5698t != z10) {
                this.f5698t = z10;
                SharedPreferences.Editor editor = this.f5685g;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z10);
                    this.f5685g.apply();
                }
                C();
            }
        }
    }

    public final JSONObject o() {
        JSONObject jSONObject;
        B();
        synchronized (this.f5679a) {
            jSONObject = this.f5697s;
        }
        return jSONObject;
    }

    public final void p(long j10) {
        B();
        synchronized (this.f5679a) {
            if (this.f5693o != j10) {
                this.f5693o = j10;
                SharedPreferences.Editor editor = this.f5685g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j10);
                    this.f5685g.apply();
                }
                C();
            }
        }
    }

    public final void q(Context context) {
        r(context, (String) null, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        if (r4.length() == 0) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        r4 = "admob__".concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        r4 = new java.lang.String("admob__");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        r2.f5682d = ((com.google.android.gms.internal.ads.ih) e8.h9.f14881a).b(new f7.f0(r2, r3, r4));
        r2.f5680b = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000a, code lost:
        if (r4 != null) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000c, code lost:
        r4 = "admob";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(android.content.Context r3, java.lang.String r4, boolean r5) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f5679a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r2.f5684f     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return
        L_0x0009:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            if (r4 != 0) goto L_0x000f
            java.lang.String r4 = "admob"
            goto L_0x0021
        L_0x000f:
            java.lang.String r0 = "admob__"
            int r1 = r4.length()
            if (r1 == 0) goto L_0x001c
            java.lang.String r4 = r0.concat(r4)
            goto L_0x0021
        L_0x001c:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r0)
        L_0x0021:
            e8.o50 r0 = e8.h9.f14881a
            f7.f0 r1 = new f7.f0
            r1.<init>((com.google.android.gms.ads.internal.util.o) r2, (android.content.Context) r3, (java.lang.String) r4)
            com.google.android.gms.internal.ads.ih r0 = (com.google.android.gms.internal.ads.ih) r0
            e8.p50 r3 = r0.b(r1)
            r2.f5682d = r3
            r2.f5680b = r5
            return
        L_0x0033:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.o.r(android.content.Context, java.lang.String, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(java.lang.String r4) {
        /*
            r3 = this;
            r3.B()
            java.lang.Object r0 = r3.f5679a
            monitor-enter(r0)
            if (r4 == 0) goto L_0x0026
            java.lang.String r1 = r3.f5687i     // Catch:{ all -> 0x0028 }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0011
            goto L_0x0026
        L_0x0011:
            r3.f5687i = r4     // Catch:{ all -> 0x0028 }
            android.content.SharedPreferences$Editor r1 = r3.f5685g     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0021
            java.lang.String r2 = "content_url_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0028 }
            android.content.SharedPreferences$Editor r4 = r3.f5685g     // Catch:{ all -> 0x0028 }
            r4.apply()     // Catch:{ all -> 0x0028 }
        L_0x0021:
            r3.C()     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.o.s(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(java.lang.String r4) {
        /*
            r3 = this;
            r3.B()
            java.lang.Object r0 = r3.f5679a
            monitor-enter(r0)
            if (r4 == 0) goto L_0x0026
            java.lang.String r1 = r3.f5688j     // Catch:{ all -> 0x0028 }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0011
            goto L_0x0026
        L_0x0011:
            r3.f5688j = r4     // Catch:{ all -> 0x0028 }
            android.content.SharedPreferences$Editor r1 = r3.f5685g     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0021
            java.lang.String r2 = "content_vertical_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0028 }
            android.content.SharedPreferences$Editor r4 = r3.f5685g     // Catch:{ all -> 0x0028 }
            r4.apply()     // Catch:{ all -> 0x0028 }
        L_0x0021:
            r3.C()     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.o.t(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(java.lang.String r6) {
        /*
            r5 = this;
            r5.B()
            java.lang.Object r0 = r5.f5679a
            monitor-enter(r0)
            d7.l r1 = d7.l.B     // Catch:{ all -> 0x004f }
            z7.b r1 = r1.f13193j     // Catch:{ all -> 0x004f }
            long r1 = r1.b()     // Catch:{ all -> 0x004f }
            r5.f5691m = r1     // Catch:{ all -> 0x004f }
            if (r6 == 0) goto L_0x004d
            java.lang.String r3 = r5.f5690l     // Catch:{ all -> 0x004f }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x004f }
            if (r3 == 0) goto L_0x001b
            goto L_0x004d
        L_0x001b:
            r5.f5690l = r6     // Catch:{ all -> 0x004f }
            android.content.SharedPreferences$Editor r3 = r5.f5685g     // Catch:{ all -> 0x004f }
            if (r3 == 0) goto L_0x0032
            java.lang.String r4 = "app_settings_json"
            r3.putString(r4, r6)     // Catch:{ all -> 0x004f }
            android.content.SharedPreferences$Editor r6 = r5.f5685g     // Catch:{ all -> 0x004f }
            java.lang.String r3 = "app_settings_last_update_ms"
            r6.putLong(r3, r1)     // Catch:{ all -> 0x004f }
            android.content.SharedPreferences$Editor r6 = r5.f5685g     // Catch:{ all -> 0x004f }
            r6.apply()     // Catch:{ all -> 0x004f }
        L_0x0032:
            r5.C()     // Catch:{ all -> 0x004f }
            java.util.List<java.lang.Runnable> r6 = r5.f5681c     // Catch:{ all -> 0x004f }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x004f }
        L_0x003b:
            boolean r1 = r6.hasNext()     // Catch:{ all -> 0x004f }
            if (r1 == 0) goto L_0x004b
            java.lang.Object r1 = r6.next()     // Catch:{ all -> 0x004f }
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ all -> 0x004f }
            r1.run()     // Catch:{ all -> 0x004f }
            goto L_0x003b
        L_0x004b:
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            return
        L_0x004d:
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            return
        L_0x004f:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            goto L_0x0053
        L_0x0052:
            throw r6
        L_0x0053:
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.o.u(java.lang.String):void");
    }

    public final void v(String str) {
        B();
        synchronized (this.f5679a) {
            if (!TextUtils.equals(this.f5700v, str)) {
                this.f5700v = str;
                SharedPreferences.Editor editor = this.f5685g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f5685g.apply();
                }
                C();
            }
        }
    }

    public final su w() {
        if (!this.f5680b) {
            return null;
        }
        if ((x() && y()) || !((Boolean) q0.f16041b.b()).booleanValue()) {
            return null;
        }
        synchronized (this.f5679a) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.f5683e == null) {
                this.f5683e = new su();
            }
            su suVar = this.f5683e;
            synchronized (suVar.f8154c) {
                if (suVar.f8152a) {
                    e.E("Content hash thread already started, quiting...");
                } else {
                    suVar.f8152a = true;
                    suVar.start();
                }
            }
            e.J("start fetching content...");
            su suVar2 = this.f5683e;
            return suVar2;
        }
    }

    public final boolean x() {
        boolean z10;
        B();
        synchronized (this.f5679a) {
            z10 = this.f5698t;
        }
        return z10;
    }

    public final boolean y() {
        boolean z10;
        B();
        synchronized (this.f5679a) {
            z10 = this.f5699u;
        }
        return z10;
    }

    public final String z() {
        String str;
        B();
        synchronized (this.f5679a) {
            str = this.f5688j;
        }
        return str;
    }
}

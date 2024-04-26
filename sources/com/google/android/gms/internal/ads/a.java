package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.appcompat.widget.o;
import com.google.android.gms.internal.ads.i4;
import e8.a2;
import e8.gf0;
import e8.j3;
import e8.jg0;
import e8.o1;
import e8.qe0;
import e8.sd0;
import e8.wi0;
import j4.e;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import x6.c;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class a<T> implements Comparable<a<T>> {

    /* renamed from: a  reason: collision with root package name */
    public final i4.a f5920a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5921b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5922c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5923d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f5924e;

    /* renamed from: f  reason: collision with root package name */
    public j3 f5925f;

    /* renamed from: g  reason: collision with root package name */
    public Integer f5926g;

    /* renamed from: h  reason: collision with root package name */
    public o1 f5927h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5928i;

    /* renamed from: r  reason: collision with root package name */
    public boolean f5929r;

    /* renamed from: s  reason: collision with root package name */
    public jg0 f5930s;

    /* renamed from: t  reason: collision with root package name */
    public qe0 f5931t;

    /* renamed from: u  reason: collision with root package name */
    public gf0 f5932u;

    public a(int i10, String str, j3 j3Var) {
        Uri parse;
        String host;
        this.f5920a = i4.a.f6917c ? new i4.a() : null;
        this.f5924e = new Object();
        this.f5928i = true;
        int i11 = 0;
        this.f5929r = false;
        this.f5931t = null;
        this.f5921b = i10;
        this.f5922c = str;
        this.f5925f = j3Var;
        this.f5930s = new jg0();
        if (!(TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null)) {
            i11 = host.hashCode();
        }
        this.f5923d = i11;
    }

    public Map<String, String> a() throws sd0 {
        return Collections.emptyMap();
    }

    public final boolean b() {
        synchronized (this.f5924e) {
        }
        return false;
    }

    public abstract c c(wi0 wi0);

    public /* synthetic */ int compareTo(Object obj) {
        return this.f5926g.intValue() - ((a) obj).f5926g.intValue();
    }

    public abstract void f(T t10);

    public final void i(c cVar) {
        gf0 gf0;
        List<a> list;
        synchronized (this.f5924e) {
            gf0 = this.f5932u;
        }
        if (gf0 != null) {
            qe0 qe0 = (qe0) cVar.f27857b;
            if (qe0 != null) {
                if (!(qe0.f16150e < System.currentTimeMillis())) {
                    String r10 = r();
                    synchronized (gf0) {
                        list = (List) gf0.f14776b.remove(r10);
                    }
                    if (list != null) {
                        if (i4.f6915a) {
                            i4.c("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), r10);
                        }
                        for (a h10 : list) {
                            ((vt) gf0.f14777c).f8410d.h(h10, cVar, (Runnable) null);
                        }
                        return;
                    }
                    return;
                }
            }
            gf0.j(this);
        }
    }

    public final void m(String str) {
        if (i4.a.f6917c) {
            this.f5920a.a(str, Thread.currentThread().getId());
        }
    }

    public final void o(int i10) {
        o1 o1Var = this.f5927h;
        if (o1Var != null) {
            o1Var.b(this, i10);
        }
    }

    public final void q(String str) {
        o1 o1Var = this.f5927h;
        if (o1Var != null) {
            synchronized (o1Var.f15727b) {
                o1Var.f15727b.remove(this);
            }
            synchronized (o1Var.f15735j) {
                for (a2 a10 : o1Var.f15735j) {
                    a10.a(this);
                }
            }
            o1Var.b(this, 5);
        }
        if (i4.a.f6917c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new r(this, str, id2));
                return;
            }
            this.f5920a.a(str, id2);
            this.f5920a.b(toString());
        }
    }

    public final String r() {
        String str = this.f5922c;
        int i10 = this.f5921b;
        if (i10 == 0 || i10 == -1) {
            return str;
        }
        String num = Integer.toString(i10);
        StringBuilder sb2 = new StringBuilder(o.a(str, o.a(num, 1)));
        sb2.append(num);
        sb2.append('-');
        sb2.append(str);
        return sb2.toString();
    }

    public byte[] s() throws sd0 {
        return null;
    }

    public final void t() {
        synchronized (this.f5924e) {
            this.f5929r = true;
        }
    }

    public String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.f5923d));
        String concat = valueOf.length() != 0 ? "0x".concat(valueOf) : new String("0x");
        b();
        String str = this.f5922c;
        String valueOf2 = String.valueOf(g0.NORMAL);
        String valueOf3 = String.valueOf(this.f5926g);
        return androidx.fragment.app.c.a(e.a(valueOf3.length() + valueOf2.length() + o.a(concat, o.a(str, "[ ] ".length() + 3)), "[ ] ", str, " ", concat), " ", valueOf2, " ", valueOf3);
    }

    public final boolean u() {
        boolean z10;
        synchronized (this.f5924e) {
            z10 = this.f5929r;
        }
        return z10;
    }

    public final void v() {
        gf0 gf0;
        synchronized (this.f5924e) {
            gf0 = this.f5932u;
        }
        if (gf0 != null) {
            gf0.j(this);
        }
    }
}

package e8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import c8.a;
import c8.b;
import com.google.android.gms.internal.ads.fa;
import com.google.android.gms.internal.ads.hz;
import com.google.android.gms.internal.ads.j3;
import com.google.android.gms.internal.ads.pz;
import com.google.android.gms.internal.ads.t;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.u;
import com.google.android.gms.internal.ads.z;
import java.util.Collections;
import java.util.List;
import l0.e;
import s.i;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class jn {

    /* renamed from: a  reason: collision with root package name */
    public int f15156a;

    /* renamed from: b  reason: collision with root package name */
    public hz f15157b;

    /* renamed from: c  reason: collision with root package name */
    public u f15158c;

    /* renamed from: d  reason: collision with root package name */
    public View f15159d;

    /* renamed from: e  reason: collision with root package name */
    public List<?> f15160e;

    /* renamed from: f  reason: collision with root package name */
    public List<pz> f15161f = Collections.emptyList();

    /* renamed from: g  reason: collision with root package name */
    public pz f15162g;

    /* renamed from: h  reason: collision with root package name */
    public Bundle f15163h;

    /* renamed from: i  reason: collision with root package name */
    public t7 f15164i;

    /* renamed from: j  reason: collision with root package name */
    public t7 f15165j;

    /* renamed from: k  reason: collision with root package name */
    public a f15166k;

    /* renamed from: l  reason: collision with root package name */
    public View f15167l;

    /* renamed from: m  reason: collision with root package name */
    public a f15168m;

    /* renamed from: n  reason: collision with root package name */
    public double f15169n;

    /* renamed from: o  reason: collision with root package name */
    public z f15170o;

    /* renamed from: p  reason: collision with root package name */
    public z f15171p;

    /* renamed from: q  reason: collision with root package name */
    public String f15172q;

    /* renamed from: r  reason: collision with root package name */
    public i<String, t> f15173r = new i<>();

    /* renamed from: s  reason: collision with root package name */
    public i<String, String> f15174s = new i<>();

    /* renamed from: t  reason: collision with root package name */
    public float f15175t;

    /* renamed from: u  reason: collision with root package name */
    public String f15176u;

    public static fa i(hz hzVar, j3 j3Var) {
        if (hzVar == null) {
            return null;
        }
        return new fa(hzVar, j3Var);
    }

    public static jn j(hz hzVar, u uVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, a aVar, String str4, String str5, double d10, z zVar, String str6, float f10) {
        jn jnVar = new jn();
        jnVar.f15156a = 6;
        jnVar.f15157b = hzVar;
        jnVar.f15158c = uVar;
        jnVar.f15159d = view;
        String str7 = str;
        jnVar.u("headline", str);
        jnVar.f15160e = list;
        String str8 = str2;
        jnVar.u("body", str2);
        jnVar.f15163h = bundle;
        String str9 = str3;
        jnVar.u("call_to_action", str3);
        jnVar.f15167l = view2;
        jnVar.f15168m = aVar;
        String str10 = str4;
        jnVar.u("store", str4);
        String str11 = str5;
        jnVar.u("price", str5);
        jnVar.f15169n = d10;
        jnVar.f15170o = zVar;
        jnVar.u("advertiser", str6);
        synchronized (jnVar) {
            try {
                jnVar.f15175t = f10;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jnVar;
    }

    public static <T> T r(a aVar) {
        if (aVar == null) {
            return null;
        }
        return b.z0(aVar);
    }

    public static jn s(j3 j3Var) {
        try {
            return j(i(j3Var.getVideoController(), j3Var), j3Var.h(), (View) r(j3Var.L()), j3Var.b(), j3Var.i(), j3Var.c(), j3Var.K(), j3Var.getCallToAction(), (View) r(j3Var.E()), j3Var.p(), j3Var.u(), j3Var.r(), j3Var.k(), j3Var.w(), j3Var.t(), j3Var.V1());
        } catch (RemoteException e10) {
            e.D("Failed to get native ad assets from unified ad mapper", e10);
            return null;
        }
    }

    public final synchronized String a() {
        return t("body");
    }

    public final synchronized String b() {
        return t("call_to_action");
    }

    public final synchronized String c() {
        return this.f15172q;
    }

    public final synchronized Bundle d() {
        if (this.f15163h == null) {
            this.f15163h = new Bundle();
        }
        return this.f15163h;
    }

    public final synchronized String e() {
        return t("headline");
    }

    public final synchronized List<?> f() {
        return this.f15160e;
    }

    public final synchronized List<pz> g() {
        return this.f15161f;
    }

    public final synchronized hz h() {
        return this.f15157b;
    }

    public final synchronized int k() {
        return this.f15156a;
    }

    public final z l() {
        List<?> list = this.f15160e;
        if (!(list == null || list.size() == 0)) {
            Object obj = this.f15160e.get(0);
            if (obj instanceof IBinder) {
                return t.s6((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized pz m() {
        return this.f15162g;
    }

    public final synchronized View n() {
        return this.f15167l;
    }

    public final synchronized t7 o() {
        return this.f15164i;
    }

    public final synchronized t7 p() {
        return this.f15165j;
    }

    public final synchronized a q() {
        return this.f15166k;
    }

    public final synchronized String t(String str) {
        return this.f15174s.getOrDefault(str, null);
    }

    public final synchronized void u(String str, String str2) {
        if (str2 == null) {
            this.f15174s.remove(str);
        } else {
            this.f15174s.put(str, str2);
        }
    }

    public final synchronized u v() {
        return this.f15158c;
    }

    public final synchronized a w() {
        return this.f15168m;
    }
}

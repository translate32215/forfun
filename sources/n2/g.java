package n2;

import a3.b;
import android.content.Context;
import android.os.RemoteException;
import android.util.Base64;
import android.util.JsonWriter;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.a0;
import androidx.fragment.app.d0;
import androidx.fragment.app.g0;
import androidx.fragment.app.h0;
import androidx.fragment.app.p;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.ads.aw;
import com.google.android.gms.internal.ads.b7;
import com.google.android.gms.internal.ads.c7;
import com.google.android.gms.internal.ads.cw;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.gf;
import com.google.android.gms.internal.ads.k3;
import com.google.android.gms.internal.ads.mv;
import com.google.android.gms.internal.ads.n2;
import com.google.android.gms.internal.ads.ow;
import com.google.android.gms.internal.ads.pe;
import com.google.android.gms.internal.ads.pv;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.y2;
import com.google.android.gms.internal.ads.y8;
import d7.l;
import e8.d5;
import e8.mj;
import e8.mt;
import e8.nd;
import e8.o9;
import e8.p4;
import e8.pj;
import e8.q2;
import e8.t00;
import e8.u4;
import e8.ul;
import e8.zu;
import g7.e;
import g7.f;
import g7.h;
import g7.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k8.o;
import m3.t;
import org.json.JSONObject;
import r2.a;
import t.d;

/* compiled from: Trackers */
public class g implements o9, e, f, g7.g, c7, mv, gf {

    /* renamed from: e  reason: collision with root package name */
    public static g f21849e;

    /* renamed from: a  reason: collision with root package name */
    public Object f21850a;

    /* renamed from: b  reason: collision with root package name */
    public Object f21851b;

    /* renamed from: c  reason: collision with root package name */
    public Object f21852c;

    /* renamed from: d  reason: collision with root package name */
    public Object f21853d;

    public g(pv.a aVar, String str, ow owVar, String str2) {
        this.f21850a = aVar;
        this.f21851b = str;
        this.f21852c = owVar;
        this.f21853d = str2;
    }

    public static synchronized g k(Context context, a aVar) {
        g gVar;
        synchronized (g.class) {
            if (f21849e == null) {
                f21849e = new g(context, aVar);
            }
            gVar = f21849e;
        }
        return gVar;
    }

    public static void x(MediationNativeAdapter mediationNativeAdapter, n nVar, h hVar) {
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            Object obj = new Object();
            new k3();
            synchronized (obj) {
            }
        }
    }

    public o A(String str) {
        if (((Map) this.f21852c).containsKey(str)) {
            return (o) ((Map) this.f21852c).get(str);
        }
        g gVar = (g) this.f21850a;
        if (gVar != null) {
            return gVar.A(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", new Object[]{str}));
    }

    public void B(String str, o oVar) {
        if (!((Map) this.f21853d).containsKey(str)) {
            if (oVar == null) {
                ((Map) this.f21852c).remove(str);
            } else {
                ((Map) this.f21852c).put(str, oVar);
            }
        }
    }

    public void C(String str, o oVar) {
        g gVar;
        if (!((Map) this.f21852c).containsKey(str) && (gVar = (g) this.f21850a) != null && gVar.D(str)) {
            ((g) this.f21850a).C(str, oVar);
        } else if (!((Map) this.f21853d).containsKey(str)) {
            if (oVar == null) {
                ((Map) this.f21852c).remove(str);
            } else {
                ((Map) this.f21852c).put(str, oVar);
            }
        }
    }

    public boolean D(String str) {
        if (((Map) this.f21852c).containsKey(str)) {
            return true;
        }
        g gVar = (g) this.f21850a;
        if (gVar != null) {
            return gVar.D(str);
        }
        return false;
    }

    public void a(p pVar) {
        if (!((ArrayList) this.f21850a).contains(pVar)) {
            synchronized (((ArrayList) this.f21850a)) {
                ((ArrayList) this.f21850a).add(pVar);
            }
            pVar.f1807t = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + pVar);
    }

    public Object apply(Object obj) {
        Void voidR = (Void) obj;
        return ((zu) this.f21850a).f17795b.a((t00) this.f21851b, (qe) this.f21852c, (mt) this.f21853d);
    }

    public void b(JsonWriter jsonWriter) {
        byte[] bArr = (byte[]) this.f21853d;
        Object obj = b7.f5991b;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value((String) this.f21850a);
        jsonWriter.name("verb").value((String) this.f21851b);
        jsonWriter.endObject();
        b7.b(jsonWriter, (Map) this.f21852c);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64.encodeToString(bArr, 0));
        }
        jsonWriter.endObject();
    }

    public void c() {
        ((HashMap) this.f21851b).values().removeAll(Collections.singleton((Object) null));
    }

    public void d(cw.a aVar) {
        pv.a aVar2 = (pv.a) this.f21850a;
        String str = (String) this.f21851b;
        ow owVar = (ow) this.f21852c;
        String str2 = (String) this.f21853d;
        pv.b bVar = (pv.b) aVar.r().w();
        if (bVar.f5971c) {
            bVar.n();
            bVar.f5971c = false;
        }
        pv.y((pv) bVar.f5970b, aVar2);
        aVar.o(bVar);
        aw.a aVar3 = (aw.a) ((cw) aVar.f5970b).H().w();
        if (aVar3.f5971c) {
            aVar3.n();
            aVar3.f5971c = false;
        }
        aw.z((aw) aVar3.f5970b, str);
        if (aVar3.f5971c) {
            aVar3.n();
            aVar3.f5971c = false;
        }
        aw.y((aw) aVar3.f5970b, owVar);
        aVar.q(aVar3);
        if (aVar.f5971c) {
            aVar.n();
            aVar.f5971c = false;
        }
        cw.F((cw) aVar.f5970b, str2);
    }

    public p e(String str) {
        h0 h0Var = (h0) ((HashMap) this.f21851b).get(str);
        if (h0Var != null) {
            return h0Var.f1694c;
        }
        return null;
    }

    public p f(String str) {
        for (h0 h0Var : ((HashMap) this.f21851b).values()) {
            if (h0Var != null) {
                p pVar = h0Var.f1694c;
                if (!str.equals(pVar.f1794f)) {
                    pVar = pVar.D.f1579c.f(str);
                }
                if (pVar != null) {
                    return pVar;
                }
            }
        }
        return null;
    }

    public List<h0> g() {
        ArrayList arrayList = new ArrayList();
        for (h0 h0Var : ((HashMap) this.f21851b).values()) {
            if (h0Var != null) {
                arrayList.add(h0Var);
            }
        }
        return arrayList;
    }

    public List<p> h() {
        ArrayList arrayList = new ArrayList();
        for (h0 h0Var : ((HashMap) this.f21851b).values()) {
            if (h0Var != null) {
                arrayList.add(h0Var.f1694c);
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    public h0 i(String str) {
        return (h0) ((HashMap) this.f21851b).get(str);
    }

    public List<p> j() {
        ArrayList arrayList;
        if (((ArrayList) this.f21850a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f21850a)) {
            arrayList = new ArrayList((ArrayList) this.f21850a);
        }
        return arrayList;
    }

    public void l(h0 h0Var) {
        p pVar = h0Var.f1694c;
        if (!(((HashMap) this.f21851b).get(pVar.f1794f) != null)) {
            ((HashMap) this.f21851b).put(pVar.f1794f, h0Var);
            if (pVar.L) {
                if (pVar.K) {
                    ((d0) this.f21853d).f(pVar);
                } else {
                    ((d0) this.f21853d).i(pVar);
                }
                pVar.L = false;
            }
            if (a0.N(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + pVar);
            }
        }
    }

    public void m(Object obj) {
        u4 u4Var = (u4) obj;
        n2 n2Var = (n2) this.f21853d;
        p4 p4Var = (p4) this.f21850a;
        Object obj2 = this.f21851b;
        d7 d7Var = (d7) this.f21852c;
        n2Var.getClass();
        try {
            com.google.android.gms.ads.internal.util.p pVar = l.B.f13186c;
            String K = com.google.android.gms.ads.internal.util.p.K();
            q2.f16076p.a(K, new d5(n2Var, p4Var, d7Var));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", K);
            jSONObject.put("args", n2Var.f7514b.c(obj2));
            u4Var.m(n2Var.f7516d, jSONObject);
        } catch (Exception e10) {
            d7Var.c(e10);
            l0.e.C("Unable to invokeJavascript", e10);
            p4Var.p();
        } catch (Throwable th) {
            p4Var.p();
            throw th;
        }
    }

    public void n(h0 h0Var) {
        p pVar = h0Var.f1694c;
        if (pVar.K) {
            ((d0) this.f21853d).i(pVar);
        }
        if (((h0) ((HashMap) this.f21851b).put(pVar.f1794f, (Object) null)) != null && a0.N(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + pVar);
        }
    }

    public void o(MediationInterstitialAdapter mediationInterstitialAdapter) {
        i.d("#008 Must be called on the main UI thread.");
        l0.e.E("Adapter called onAdClosed.");
        try {
            ((y2) this.f21850a).C();
        } catch (RemoteException e10) {
            l0.e.F("#007 Could not call remote method.", e10);
        }
    }

    public void p(MediationInterstitialAdapter mediationInterstitialAdapter, int i10) {
        i.d("#008 Must be called on the main UI thread.");
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Adapter called onAdFailedToLoad with error ");
        sb2.append(i10);
        sb2.append(".");
        l0.e.E(sb2.toString());
        try {
            ((y2) this.f21850a).h0(i10);
        } catch (RemoteException e10) {
            l0.e.F("#007 Could not call remote method.", e10);
        }
    }

    public void q(MediationInterstitialAdapter mediationInterstitialAdapter) {
        i.d("#008 Must be called on the main UI thread.");
        l0.e.E("Adapter called onAdLoaded.");
        try {
            ((y2) this.f21850a).v();
        } catch (RemoteException e10) {
            l0.e.F("#007 Could not call remote method.", e10);
        }
    }

    public void r(MediationNativeAdapter mediationNativeAdapter, h hVar) {
        i.d("#008 Must be called on the main UI thread.");
        l0.e.E("Adapter called onAdLoaded.");
        this.f21851b = hVar;
        this.f21852c = null;
        x(mediationNativeAdapter, (n) null, hVar);
        try {
            ((y2) this.f21850a).v();
        } catch (RemoteException e10) {
            l0.e.F("#007 Could not call remote method.", e10);
        }
    }

    public void s(MediationInterstitialAdapter mediationInterstitialAdapter) {
        i.d("#008 Must be called on the main UI thread.");
        l0.e.E("Adapter called onAdOpened.");
        try {
            ((y2) this.f21850a).F();
        } catch (RemoteException e10) {
            l0.e.F("#007 Could not call remote method.", e10);
        }
    }

    public void t(p pVar) {
        synchronized (((ArrayList) this.f21850a)) {
            ((ArrayList) this.f21850a).remove(pVar);
        }
        pVar.f1807t = false;
    }

    public g0 u(String str, g0 g0Var) {
        if (g0Var != null) {
            return (g0) ((HashMap) this.f21852c).put(str, g0Var);
        }
        return (g0) ((HashMap) this.f21852c).remove(str);
    }

    public mj v(Set<ul<pj>> set) {
        return new mj(set);
    }

    public g w() {
        return new g(this, (t) this.f21851b);
    }

    public o y(o oVar) {
        return ((t) this.f21851b).d(this, oVar);
    }

    public o z(k8.e eVar) {
        o oVar = o.f20381n;
        Iterator<Integer> A = eVar.A();
        while (A.hasNext()) {
            oVar = ((t) this.f21851b).d(this, eVar.y(A.next().intValue()));
            if (oVar instanceof k8.g) {
                break;
            }
        }
        return oVar;
    }

    public g(zu zuVar, t00 t00, qe qeVar, mt mtVar) {
        this.f21850a = zuVar;
        this.f21851b = t00;
        this.f21852c = qeVar;
        this.f21853d = mtVar;
    }

    public g(String str, String str2, Map map, byte[] bArr) {
        this.f21850a = str;
        this.f21851b = str2;
        this.f21852c = map;
        this.f21853d = bArr;
    }

    public g(View view, t7 t7Var, y8 y8Var, pe peVar) {
        this.f21851b = view;
        this.f21853d = t7Var;
        this.f21850a = y8Var;
        this.f21852c = peVar;
    }

    public g(n2 n2Var, p4 p4Var, Object obj, d7 d7Var) {
        this.f21853d = n2Var;
        this.f21850a = p4Var;
        this.f21851b = obj;
        this.f21852c = d7Var;
    }

    public g(y2 y2Var) {
        this.f21850a = y2Var;
    }

    public g(nd ndVar) {
        this.f21853d = ndVar;
    }

    public g(String str, String str2, String str3) {
        this.f21853d = "%s_%s_%s";
        this.f21850a = str;
        this.f21851b = str2;
        this.f21852c = str3;
    }

    public g(g gVar, t tVar) {
        this.f21852c = new HashMap();
        this.f21853d = new HashMap();
        this.f21850a = gVar;
        this.f21851b = tVar;
    }

    public g(a3.a aVar, a3.a aVar2, b bVar, b bVar2) {
        this.f21850a = aVar;
        this.f21851b = aVar2;
        this.f21852c = bVar;
        this.f21853d = bVar2;
    }

    public g(int i10) {
        if (i10 != 2) {
            this.f21850a = new d(256, 0);
            this.f21851b = new d(256, 0);
            this.f21852c = new d(256, 0);
            this.f21853d = new t.h[32];
            return;
        }
        this.f21850a = new ArrayList();
        this.f21851b = new HashMap();
        this.f21852c = new HashMap();
    }

    public g(Context context, a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f21850a = new a(applicationContext, aVar);
        this.f21851b = new b(applicationContext, aVar);
        this.f21852c = new e(applicationContext, aVar);
        this.f21853d = new f(applicationContext, aVar);
    }
}

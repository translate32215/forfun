package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.os.RemoteException;
import android.util.JsonReader;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import b6.g;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.ads.mediation.b;
import com.google.android.gms.internal.ads.ai;
import com.startapp.b4;
import e.h;
import e7.e;
import e7.i;
import e8.ah;
import e8.aw;
import e8.c9;
import e8.co;
import e8.dg;
import e8.ds;
import e8.dt;
import e8.dv;
import e8.e00;
import e8.eg0;
import e8.fg0;
import e8.h30;
import e8.h4;
import e8.h9;
import e8.i30;
import e8.ii;
import e8.iz;
import e8.jc0;
import e8.k20;
import e8.kp;
import e8.l;
import e8.l20;
import e8.l50;
import e8.m1;
import e8.mi;
import e8.nd;
import e8.o00;
import e8.o50;
import e8.oq;
import e8.ov;
import e8.p50;
import e8.p9;
import e8.pa0;
import e8.pg;
import e8.qn;
import e8.qt;
import e8.qz;
import e8.r00;
import e8.r4;
import e8.rf;
import e8.rm;
import e8.sr;
import e8.t;
import e8.t00;
import e8.t20;
import e8.ti0;
import e8.tn;
import e8.u00;
import e8.u20;
import e8.uf0;
import e8.wr;
import e8.xr;
import e8.yr;
import e8.yv;
import e8.zh0;
import e8.zk;
import e8.zm;
import f7.f0;
import f7.j;
import f7.j0;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import q.f;
import r7.m;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class j8 implements zh, el, b, m1, gf {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7133a;

    /* renamed from: b  reason: collision with root package name */
    public Object f7134b;

    /* renamed from: c  reason: collision with root package name */
    public Object f7135c;

    /* renamed from: d  reason: collision with root package name */
    public Object f7136d;

    public j8(h2 h2Var, r4 r4Var, h4 h4Var) {
        this.f7133a = 7;
        this.f7134b = h2Var;
        this.f7135c = r4Var;
        this.f7136d = h4Var;
    }

    private final void e(Object obj) {
        q9 q9Var = (q9) obj;
        synchronized (((ke) this.f7136d)) {
            ((ke) this.f7136d).f7246h = null;
            l lVar = t.f16667u4;
            if (((Boolean) ti0.f16763j.f16769f.a(lVar)).booleanValue()) {
                ri riVar = q9Var.f13730g.f6448a;
                riVar.O(((ke) this.f7136d).f7242d);
                ((f9) riVar.f8042b).f6452e = ((ke) this.f7136d).f7243e;
            }
            ((aw) this.f7134b).a(q9Var);
            if (((Boolean) ti0.f16763j.f16769f.a(lVar)).booleanValue()) {
                ((ke) this.f7136d).f7240b.execute(new e(this));
                ((ke) this.f7136d).f7240b.execute(new qz(this));
            }
        }
    }

    public static j8 f(Reader reader) throws r00 {
        try {
            j8 j8Var = new j8(new JsonReader(reader));
            try {
                reader.close();
            } catch (IOException unused) {
            }
            return j8Var;
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e10) {
            throw new r00("unable to parse ServerResponse", e10);
        } catch (Throwable th) {
            try {
                reader.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    public static String m(int i10) {
        int i11 = r8.f8018a[i10 - 1];
        if (i11 == 1) {
            return "bb";
        }
        if (i11 == 2) {
            return "h";
        }
        if (i11 == 3) {
            return "cc";
        }
        if (i11 != 4) {
            return i11 != 5 ? "u" : "cb";
        }
        return "ac";
    }

    public JSONObject Y() {
        return ((co) this.f7134b).Y();
    }

    public void a(Object obj) {
        switch (this.f7133a) {
            case 2:
                za zaVar = (za) obj;
                synchronized (((le) this.f7136d)) {
                    ((f9) zaVar.f13730g.f6448a.f8042b).f6452e = ((le) this.f7136d).f7381d;
                    ((aw) this.f7134b).a(zaVar);
                    Object obj2 = this.f7136d;
                    Executor executor = ((le) obj2).f7379b;
                    e00 e00 = ((le) obj2).f7381d;
                    e00.getClass();
                    executor.execute(new qz(e00));
                    ((le) this.f7136d).f7381d.w();
                }
                return;
            case 15:
                ah ahVar = (ah) obj;
                synchronized (((kd) this.f7136d)) {
                    ahVar.f13730g.f6448a.O((ov) ((kd) this.f7136d).f7237d.f7135c);
                    ((aw) this.f7134b).a(ahVar);
                    ((kd) this.f7136d).f7235b.e().execute(new j(this));
                }
                return;
            case 16:
                ah ahVar2 = (ah) obj;
                synchronized (((vd) this.f7136d)) {
                    ((vd) this.f7136d).f8359h = null;
                    if (((Boolean) ti0.f16763j.f16769f.a(t.f16661t4)).booleanValue()) {
                        ((f9) ahVar2.f13730g.f6448a.f8042b).f6451d = ((vd) this.f7136d).f8355d;
                    }
                    ((aw) this.f7134b).a(ahVar2);
                }
                return;
            case 17:
                dg dgVar = (dg) obj;
                synchronized (((xd) this.f7136d)) {
                    Object obj3 = this.f7136d;
                    ((xd) obj3).f8550j = null;
                    ((xd) obj3).f8546f.removeAllViews();
                    if (dgVar.f() != null) {
                        ViewParent parent = dgVar.f().getParent();
                        if (parent instanceof ViewGroup) {
                            String str = "";
                            ii iiVar = dgVar.f13729f;
                            if (iiVar != null) {
                                str = iiVar.f15049a;
                            }
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 78);
                            sb2.append("Banner view provided from ");
                            sb2.append(str);
                            sb2.append(" already has a parent view. Removing its old parent.");
                            l0.e.K(sb2.toString());
                            ((ViewGroup) parent).removeView(dgVar.f());
                        }
                    }
                    l lVar = t.f16655s4;
                    if (((Boolean) ti0.f16763j.f16769f.a(lVar)).booleanValue()) {
                        ri riVar = dgVar.f13730g.f6448a;
                        riVar.O(((xd) this.f7136d).f8544d);
                        ((f9) riVar.f8042b).f6450c = ((xd) this.f7136d).f8545e;
                    }
                    ((xd) this.f7136d).f8546f.addView(dgVar.f());
                    ((aw) this.f7134b).a(dgVar);
                    if (((Boolean) ti0.f16763j.f16769f.a(lVar)).booleanValue()) {
                        Object obj4 = this.f7136d;
                        Executor executor2 = ((xd) obj4).f8542b;
                        ov ovVar = ((xd) obj4).f8544d;
                        ovVar.getClass();
                        executor2.execute(new e(ovVar));
                    }
                    ((xd) this.f7136d).f8548h.K0(dgVar.h());
                }
                return;
            default:
                e(obj);
                return;
        }
    }

    public void a0(MotionEvent motionEvent) {
        ((co) this.f7134b).onTouch((View) null, motionEvent);
    }

    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ((dt) this.f7134b).f14330b.execute(new f0(sQLiteDatabase, (String) this.f7136d, (c9) this.f7135c));
        return null;
    }

    public void b(String str) {
        switch (this.f7133a) {
            case b4.f10106f /*8*/:
                try {
                    ((t3) this.f7134b).l(str);
                    return;
                } catch (RemoteException e10) {
                    l0.e.C("", e10);
                    return;
                }
            default:
                try {
                    ((z3) this.f7134b).l(str);
                    return;
                } catch (RemoteException e11) {
                    l0.e.C("", e11);
                    return;
                }
        }
    }

    public byte[] c(byte[] bArr, int i10) throws GeneralSecurityException {
        byte[] bArr2;
        if (i10 <= 16) {
            Cipher a10 = zo.f8719e.a("AES/ECB/NoPadding");
            a10.init(1, (SecretKey) this.f7134b);
            double length = (double) bArr.length;
            Double.isNaN(length);
            Double.isNaN(length);
            int max = Math.max(1, (int) Math.ceil(length / 16.0d));
            if ((max << 4) == bArr.length) {
                bArr2 = g.c(bArr, (max - 1) << 4, (byte[]) this.f7135c, 0, 16);
            } else {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) << 4, bArr.length);
                if (copyOfRange.length < 16) {
                    byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                    copyOf[copyOfRange.length] = b4.f10104d;
                    bArr2 = g.f(copyOf, (byte[]) this.f7136d);
                } else {
                    throw new IllegalArgumentException("x must be smaller than a block.");
                }
            }
            byte[] bArr3 = new byte[16];
            for (int i11 = 0; i11 < max - 1; i11++) {
                bArr3 = a10.doFinal(g.c(bArr3, 0, bArr, i11 << 4, 16));
            }
            return Arrays.copyOf(a10.doFinal(g.f(bArr2, bArr3)), i10);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }

    public boolean d() {
        return ((uf0) this.f7135c) != null;
    }

    public void d0() {
        tn tnVar = (tn) this.f7136d;
        String[] strArr = ga.f6617v;
        Map<String, WeakReference<View>> B5 = ((co) this.f7134b).B5();
        boolean z10 = false;
        if (B5 != null) {
            int length = strArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (B5.get(strArr[i10]) != null) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
        }
        if (z10) {
            ((co) this.f7134b).onClick((ViewGroup) this.f7135c);
        }
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [e8.p50, com.google.android.gms.internal.ads.gh, e8.l50] */
    /* JADX WARNING: type inference failed for: r6v1, types: [com.google.android.gms.internal.ads.gh, e8.p50<RetT>, com.google.android.gms.internal.ads.fh, java.lang.Runnable] */
    public <RetT> p50<RetT> g(l5 l5Var, ds<InputStream> dsVar, ds<InputStream> dsVar2, oh<InputStream, RetT> ohVar) {
        p50 p50;
        String str = l5Var.f7317d;
        p pVar = d7.l.B.f13186c;
        if (p.A(str)) {
            p50 = new ai.a(new wr(we.INTERNAL_ERROR));
        } else {
            p50 = yh.k(dsVar.y(l5Var), ExecutionException.class, yr.f17664a, (o50) this.f7134b);
        }
        ? u10 = l50.v(p50).u(ohVar, (o50) this.f7134b);
        ? fhVar = new fh(u10, wr.class, new xr(this, (ds) dsVar2, l5Var, (oh) ohVar));
        u10.a(fhVar, h.d((o50) this.f7134b, fhVar));
        return fhVar;
    }

    public h30 h() {
        String str = "";
        if (((String) this.f7134b) == null) {
            str = str.concat(" clientVersion");
        }
        if (((Boolean) this.f7135c) == null) {
            str = String.valueOf(str).concat(" shouldGetAdvertisingId");
        }
        if (((Boolean) this.f7136d) == null) {
            str = String.valueOf(str).concat(" isGooglePlayServicesAvailable");
        }
        if (str.isEmpty()) {
            return new i30((String) this.f7134b, ((Boolean) this.f7135c).booleanValue(), ((Boolean) this.f7136d).booleanValue(), (jc0) null);
        }
        throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
    }

    public <O> dv i(Callable<O> callable) {
        g m10 = yh.m((List) this.f7135c);
        p50 a10 = m10.a(l20.f15351a, h9.f14886f);
        k20 k20 = (k20) this.f7136d;
        return new dv(k20, this.f7134b, a10, (List) this.f7135c, (p50) m10.a(callable, k20.f15223a));
    }

    public void j(long j10, int i10) {
        if (((Boolean) ti0.f16763j.f16769f.a(t.H4)).booleanValue()) {
            u20 c10 = u20.c("ad_closed");
            c10.b((re) ((t00) this.f7136d).f16701b.f7135c);
            c10.f16842a.put("show_time", String.valueOf(j10));
            c10.f16842a.put("ad_format", "app_open_ad");
            c10.f16842a.put("acr", m(i10));
            ((t20) this.f7134b).a(c10);
            return;
        }
        p9 a10 = ((oq) this.f7135c).a();
        a10.h((re) ((t00) this.f7136d).f16701b.f7135c);
        ((Map) a10.f15880b).put("action", "ad_closed");
        ((Map) a10.f15880b).put("show_time", String.valueOf(j10));
        ((Map) a10.f15880b).put("ad_format", "app_open_ad");
        ((Map) a10.f15880b).put("acr", m(i10));
        a10.l();
    }

    public void k() throws IOException {
        Object obj = this.f7136d;
        if (((IOException) obj) == null) {
            Object obj2 = this.f7135c;
            if (((uf0) obj2) != null) {
                uf0 uf0 = (uf0) obj2;
                int i10 = ((uf0) obj2).f16949c;
                IOException iOException = uf0.f16950d;
                if (iOException != null && uf0.f16951e > i10) {
                    throw iOException;
                }
                return;
            }
            return;
        }
        throw ((IOException) obj);
    }

    public j8 l(boolean z10) {
        this.f7135c = Boolean.valueOf(z10);
        return this;
    }

    public void n(Throwable th) {
        zh0 zh0;
        zh0 zh02;
        switch (this.f7133a) {
            case 2:
                kp b10 = ((le) this.f7136d).f7382e.b();
                if (b10 == null) {
                    zh0 = l0.e.q(th, (qt) null);
                } else {
                    zh0 = l0.e.q(th, b10.a().f15523l);
                }
                synchronized (((le) this.f7136d)) {
                    if (b10 != null) {
                        b10.d().I0(new mi(zh0, 0));
                        ((le) this.f7136d).f7379b.execute(new m(this, zh0, (q.e) null));
                    } else {
                        ((le) this.f7136d).f7381d.j0(zh0);
                        ((le) this.f7136d).a((o00) this.f7135c).e().a().f15517f.I0(zk.f17774a);
                    }
                    androidx.appcompat.widget.p.q(zh0.f17753a, th, "RewardedAdLoader.onFailure");
                    ((aw) this.f7134b).w();
                }
                return;
            case 15:
                zh0 q10 = l0.e.q(th, ((zm) this.f7135c).c().f15523l);
                ((zm) this.f7135c).d().I0(new mi(q10, 0));
                ((kd) this.f7136d).f7235b.e().execute(new j0(this, q10));
                androidx.appcompat.widget.p.q(q10.f17753a, th, "NativeAdLoader.onFailure");
                ((aw) this.f7134b).w();
                return;
            case 16:
                rf rfVar = (rf) ((vd) this.f7136d).f8356e.b();
                if (rfVar == null) {
                    zh02 = l0.e.q(th, (qt) null);
                } else {
                    zh02 = l0.e.q(th, rfVar.a().f15523l);
                }
                synchronized (((vd) this.f7136d)) {
                    Object obj = this.f7136d;
                    ((vd) obj).f8359h = null;
                    if (rfVar != null) {
                        rfVar.d().I0(new mi(zh02, 0));
                        if (((Boolean) ti0.f16763j.f16769f.a(t.f16661t4)).booleanValue()) {
                            ((vd) this.f7136d).f8353b.execute(new m(this, zh02));
                        }
                    } else {
                        ((vd) obj).f8355d.j0(zh02);
                        ((rf) ((vd) this.f7136d).b((iz) this.f7135c).b()).a().f15517f.I0(zk.f17774a);
                    }
                    androidx.appcompat.widget.p.q(zh02.f17753a, th, "AppOpenAdLoader.onFailure");
                    ((aw) this.f7134b).w();
                }
                return;
            case 17:
                zh0 q11 = l0.e.q(th, ((pg) this.f7135c).c().f15523l);
                synchronized (((xd) this.f7136d)) {
                    ((xd) this.f7136d).f8550j = null;
                    ((pg) this.f7135c).d().I0(new mi(q11, 0));
                    if (((Boolean) ti0.f16763j.f16769f.a(t.f16655s4)).booleanValue()) {
                        ((xd) this.f7136d).f8542b.execute(new j0(this, q11, (q.e) null));
                    }
                    ((xd) this.f7136d).f8548h.K0(60);
                    androidx.appcompat.widget.p.q(q11.f17753a, th, "BannerAdLoader.onFailure");
                    ((aw) this.f7134b).w();
                }
                return;
            default:
                zh0 q12 = l0.e.q(th, ((rm) this.f7135c).b().f15523l);
                synchronized (((ke) this.f7136d)) {
                    ((ke) this.f7136d).f7246h = null;
                    ((rm) this.f7135c).c().I0(new mi(q12, 0));
                    if (((Boolean) ti0.f16763j.f16769f.a(t.f16667u4)).booleanValue()) {
                        ((ke) this.f7136d).f7240b.execute(new i(this, q12));
                        ((ke) this.f7136d).f7240b.execute(new j0(this, q12, (f) null));
                    }
                    androidx.appcompat.widget.p.q(q12.f17753a, th, "InterstitialAdLoader.onFailure");
                    ((aw) this.f7134b).w();
                }
                return;
        }
    }

    public j8(dt dtVar, c9 c9Var, String str) {
        this.f7133a = 13;
        this.f7134b = dtVar;
        this.f7135c = c9Var;
        this.f7136d = str;
    }

    public j8() {
        this.f7133a = 4;
    }

    public j8(g4 g4Var, t3 t3Var, y2 y2Var) {
        this.f7133a = 8;
        this.f7136d = g4Var;
        this.f7134b = t3Var;
        this.f7135c = y2Var;
    }

    public j8(g4 g4Var, z3 z3Var, y2 y2Var) {
        this.f7133a = 9;
        this.f7136d = g4Var;
        this.f7134b = z3Var;
        this.f7135c = y2Var;
    }

    public j8(kd kdVar, aw awVar, zm zmVar) {
        this.f7133a = 15;
        this.f7136d = kdVar;
        this.f7134b = awVar;
        this.f7135c = zmVar;
    }

    public j8(vd vdVar, aw awVar, iz izVar) {
        this.f7133a = 16;
        this.f7136d = vdVar;
        this.f7134b = awVar;
        this.f7135c = izVar;
    }

    public j8(xd xdVar, aw awVar, pg pgVar) {
        this.f7133a = 17;
        this.f7136d = xdVar;
        this.f7134b = awVar;
        this.f7135c = pgVar;
    }

    public j8(ke keVar, aw awVar, rm rmVar) {
        this.f7133a = 18;
        this.f7136d = keVar;
        this.f7134b = awVar;
        this.f7135c = rmVar;
    }

    public j8(le leVar, aw awVar, o00 o00) {
        this.f7133a = 2;
        this.f7136d = leVar;
        this.f7134b = awVar;
        this.f7135c = o00;
    }

    public j8(qn qnVar, t20 t20) {
        this.f7133a = 14;
        this.f7134b = qnVar;
        ov ovVar = new ov(t20);
        this.f7135c = ovVar;
        this.f7136d = new yv(ovVar, ((qn) this.f7134b).f16187e);
    }

    public j8(tn tnVar, co coVar, ViewGroup viewGroup) {
        this.f7133a = 12;
        this.f7136d = tnVar;
        this.f7134b = coVar;
        this.f7135c = viewGroup;
    }

    public j8(oq oqVar, t00 t00, t20 t20) {
        this.f7133a = 10;
        this.f7134b = t20;
        this.f7135c = oqVar;
        this.f7136d = t00;
    }

    public j8(t00 t00, qe qeVar, String str) {
        this.f7133a = 11;
        this.f7134b = t00;
        this.f7135c = qeVar;
        this.f7136d = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    public j8(o50 o50, sr srVar, pa0 pa0) {
        this.f7133a = 1;
        this.f7134b = o50;
        this.f7135c = srVar;
        this.f7136d = pa0;
    }

    public j8(String str) {
        this.f7133a = 6;
        int i10 = eg0.f14479a;
        this.f7134b = Executors.newSingleThreadExecutor(new fg0(str));
    }

    public j8(byte[] bArr) {
        this.f7133a = 5;
        hp.a(bArr.length);
        this.f7134b = new SecretKeySpec(bArr, "AES");
        Cipher a10 = zo.f8719e.a("AES/ECB/NoPadding");
        a10.init(1, (SecretKey) this.f7134b);
        byte[] f10 = rq.f(a10.doFinal(new byte[16]));
        this.f7135c = f10;
        this.f7136d = rq.f(f10);
    }

    public j8(JsonReader jsonReader) {
        List list;
        ArrayList arrayList;
        this.f7133a = 3;
        List emptyList = Collections.emptyList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        re reVar = null;
        List list2 = emptyList;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                List list3 = list2;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        ArrayList arrayList3 = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList3.add(new qe(jsonReader));
                        }
                        jsonReader.endArray();
                        arrayList = arrayList3;
                    } else if (nextName2.equals("common")) {
                        reVar = new re(jsonReader);
                        arrayList = list3;
                    } else {
                        jsonReader.skipValue();
                        arrayList = list3;
                    }
                    list3 = arrayList;
                }
                jsonReader.endObject();
                jsonReader.endArray();
                list = list3;
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    Map<String, String> map = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if ("name".equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            map = com.google.android.gms.ads.internal.util.i.i(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList2.add(new u00(str, map));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
                list = list2;
            } else {
                list = list2;
            }
            list2 = list;
        }
        this.f7136d = arrayList2;
        this.f7134b = list2;
        this.f7135c = reVar == null ? new re(new JsonReader(new StringReader("{}"))) : reVar;
    }

    public j8(k20 k20, Object obj, List list, h hVar) {
        this.f7133a = 19;
        this.f7133a = 19;
        this.f7136d = k20;
        this.f7134b = obj;
        this.f7135c = list;
    }

    public j8(nd ndVar, u.b bVar) {
        this.f7133a = 0;
        this.f7133a = 0;
        this.f7136d = ndVar;
    }
}

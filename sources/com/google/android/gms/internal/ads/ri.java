package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import c7.a;
import com.google.android.gms.internal.ads.ai;
import com.google.android.gms.internal.ads.cq;
import com.google.android.gms.internal.ads.gw;
import com.google.android.gms.internal.ads.iw;
import com.google.android.gms.internal.ads.ow;
import com.google.android.gms.internal.ads.wv;
import d7.e;
import d7.h;
import d7.l;
import e7.k;
import e8.a00;
import e8.ap;
import e8.aw;
import e8.b00;
import e8.c9;
import e8.ct;
import e8.ds;
import e8.dt;
import e8.ei;
import e8.f80;
import e8.fn;
import e8.h4;
import e8.h9;
import e8.ji;
import e8.jm;
import e8.k9;
import e8.l9;
import e8.m1;
import e8.n40;
import e8.o3;
import e8.o50;
import e8.o9;
import e8.ov;
import e8.p50;
import e8.sr;
import e8.t;
import e8.t40;
import e8.ti0;
import e8.u20;
import e8.u4;
import e8.u40;
import e8.ua;
import e8.ug0;
import e8.vg0;
import e8.wr;
import e8.zj;
import f7.f0;
import f7.j0;
import j4.c;
import j4.d;
import java.io.File;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ri<KeyFormatProtoT extends cq, KeyProtoT extends cq> implements n40, a, o9, c, d, zh, l9, j9, m1, h, ds, gf, e, aw, ee, a00 {

    /* renamed from: c  reason: collision with root package name */
    public static ri f8040c;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8041a;

    /* renamed from: b  reason: collision with root package name */
    public ti<KeyFormatProtoT, KeyProtoT> f8042b;

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.ads.internal.overlay.c, com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ri(com.google.android.gms.ads.internal.overlay.c r2) {
        /*
            r1 = this;
            r0 = 12
            r1.f8041a = r0
            r1.<init>()
            r1.f8042b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ri.<init>(com.google.android.gms.ads.internal.overlay.c):void");
    }

    public void B() {
        ((jm) this.f8042b).c().I0(ji.f15149a);
    }

    public ei C(b00 b00) {
        return (ei) this.f8042b;
    }

    public void F(Object obj) {
        switch (this.f8041a) {
            case 12:
                ((k) obj).J3((com.google.android.gms.ads.internal.overlay.c) this.f8042b);
                return;
            case 13:
                ((e9) obj).l(((zj) this.f8042b).f17772b.Z);
                return;
            case 15:
                ((ug0) obj).t((vg0) this.f8042b);
                return;
            default:
                ((o3) obj).S((a6) this.f8042b);
                return;
        }
    }

    public void J() {
        ((jm) this.f8042b).d().O();
        ((jm) this.f8042b).e().K0();
    }

    public ri O(ov ovVar) {
        ((f9) this.f8042b).f6449b = ovVar;
        return this;
    }

    public void P() {
        d9 d9Var = ((cb) this.f8042b).f6110g;
        synchronized (d9Var) {
            if (d9Var.f6194f) {
                if (d9Var.f6193e > 0 && d9Var.f6195g.isCancelled()) {
                    d9Var.L0(d9Var.f6193e);
                }
                d9Var.f6194f = false;
            }
        }
    }

    public void Q(boolean z10, long j10) {
        ua uaVar = ((n7) this.f8042b).f7542s;
        if (uaVar != null) {
            uaVar.d(z10, j10);
        }
    }

    public Thread S(Context context, String str) {
        if (!((AtomicBoolean) this.f8042b).compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new f0(this, context, str));
        thread.start();
        return thread;
    }

    public KeyProtoT T(mp mpVar) throws GeneralSecurityException, f80 {
        cq c10 = this.f8042b.c(mpVar);
        this.f8042b.a(c10);
        return (cq) this.f8042b.b(c10);
    }

    public JSONObject Y() {
        return null;
    }

    public /* synthetic */ void a(Object obj) {
        switch (this.f8041a) {
            case 9:
                Void voidR = (Void) obj;
                n6.f7519m.remove((p50) this.f8042b);
                return;
            case 23:
                try {
                    ((gf) this.f8042b).apply((SQLiteDatabase) obj);
                    return;
                } catch (Exception e10) {
                    String valueOf = String.valueOf(e10.getMessage());
                    l0.e.I(valueOf.length() != 0 ? "Error executing function on offline buffered ping database: ".concat(valueOf) : new String("Error executing function on offline buffered ping database: "));
                    return;
                }
            default:
                q9 q9Var = (q9) obj;
                synchronized (((hd) this.f8042b)) {
                    ti<KeyFormatProtoT, KeyProtoT> tiVar = this.f8042b;
                    ((hd) tiVar).f6851g = q9Var;
                    ((hd) tiVar).f6851g.b();
                }
                return;
        }
    }

    public void a0(MotionEvent motionEvent) {
    }

    public Object apply(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        Object obj2;
        switch (this.f8041a) {
            case 21:
                sb sbVar = (sb) this.f8042b;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                sbVar.getClass();
                if (((Boolean) ti0.f16763j.f16769f.a(t.H4)).booleanValue()) {
                    u20 c10 = u20.c("oa_upload");
                    c10.f16842a.put("oa_failed_reqs", String.valueOf(tb.a(sQLiteDatabase, 0)));
                    c10.f16842a.put("oa_total_reqs", String.valueOf(tb.a(sQLiteDatabase, 1)));
                    c10.f16842a.put("oa_upload_time", String.valueOf(l.B.f13193j.b()));
                    c10.f16842a.put("oa_last_successful_time", String.valueOf(tb.b(sQLiteDatabase)));
                    c10.f16842a.put("oa_session_id", sbVar.f8118g.b() ? "" : sbVar.f8116e);
                    sbVar.f8117f.a(c10);
                    ArrayList<iw.a> c11 = tb.c(sQLiteDatabase);
                    sb.a(sQLiteDatabase, c11);
                    int size = c11.size();
                    int i10 = 0;
                    while (i10 < size) {
                        iw.a aVar = c11.get(i10);
                        i10++;
                        iw.a aVar2 = aVar;
                        u20 c12 = u20.c("oa_signals");
                        if (sbVar.f8118g.b()) {
                            str = "";
                        } else {
                            str = sbVar.f8116e;
                        }
                        c12.f16842a.put("oa_session_id", str);
                        gw Q = aVar2.Q();
                        String valueOf = Q.A() ? String.valueOf(Q.B().f6719a) : "-1";
                        List<wv.a> P = aVar2.P();
                        mg mgVar = ct.f14189a;
                        if (P instanceof RandomAccess) {
                            obj2 = new t40(P, mgVar);
                        } else {
                            obj2 = new u40(P, mgVar);
                        }
                        String obj3 = obj2.toString();
                        c12.f16842a.put("oa_sig_ts", String.valueOf(aVar2.y()));
                        c12.f16842a.put("oa_sig_status", String.valueOf(aVar2.M().f8664a));
                        c12.f16842a.put("oa_sig_resp_lat", String.valueOf(aVar2.N()));
                        c12.f16842a.put("oa_sig_render_lat", String.valueOf(aVar2.O()));
                        c12.f16842a.put("oa_sig_formats", obj3);
                        c12.f16842a.put("oa_sig_nw_type", valueOf);
                        c12.f16842a.put("oa_sig_wifi", String.valueOf(aVar2.R().f8664a));
                        c12.f16842a.put("oa_sig_airplane", String.valueOf(aVar2.S().f8664a));
                        c12.f16842a.put("oa_sig_data", String.valueOf(aVar2.T().f8664a));
                        c12.f16842a.put("oa_sig_nw_resp", String.valueOf(aVar2.U()));
                        c12.f16842a.put("oa_sig_offline", String.valueOf(aVar2.V().f8664a));
                        c12.f16842a.put("oa_sig_nw_state", String.valueOf(aVar2.W().f7119a));
                        if (Q.C() && Q.A() && Q.B().equals(gw.c.CELL)) {
                            c12.f16842a.put("oa_sig_cell_type", String.valueOf(Q.D().f6714a));
                        }
                        sbVar.f8117f.a(c12);
                    }
                } else {
                    ArrayList<iw.a> c13 = tb.c(sQLiteDatabase);
                    iw.c F = iw.F();
                    String packageName = sbVar.f8113b.getPackageName();
                    if (F.f5971c) {
                        F.n();
                        z10 = false;
                        F.f5971c = false;
                    } else {
                        z10 = false;
                    }
                    iw.B((iw) F.f5970b, packageName);
                    String str2 = Build.MODEL;
                    if (F.f5971c) {
                        F.n();
                        F.f5971c = z10;
                    }
                    iw.E((iw) F.f5970b, str2);
                    int a10 = tb.a(sQLiteDatabase, z10 ? 1 : 0);
                    if (F.f5971c) {
                        F.n();
                        F.f5971c = z10;
                    }
                    iw.y((iw) F.f5970b, a10);
                    if (F.f5971c) {
                        F.n();
                        F.f5971c = z10;
                    }
                    iw.A((iw) F.f5970b, c13);
                    int a11 = tb.a(sQLiteDatabase, 1);
                    if (F.f5971c) {
                        F.n();
                        F.f5971c = z10;
                    }
                    iw.C((iw) F.f5970b, a11);
                    long b10 = l.B.f13193j.b();
                    if (F.f5971c) {
                        F.n();
                        z11 = false;
                        F.f5971c = false;
                    } else {
                        z11 = false;
                    }
                    iw.z((iw) F.f5970b, b10);
                    long b11 = tb.b(sQLiteDatabase);
                    if (F.f5971c) {
                        F.n();
                        F.f5971c = z11;
                    }
                    iw.D((iw) F.f5970b, b11);
                    sb.a(sQLiteDatabase, c13);
                    sbVar.f8112a.a(new g2((iw) ((aq) F.j())));
                    ow.a B = ow.B();
                    int i11 = sbVar.f8115d.f14545b;
                    if (B.f5971c) {
                        B.n();
                        z12 = false;
                        B.f5971c = false;
                    } else {
                        z12 = false;
                    }
                    ow.y((ow) B.f5970b, i11);
                    int i12 = sbVar.f8115d.f14546c;
                    if (B.f5971c) {
                        B.n();
                        B.f5971c = z12;
                    }
                    ow.z((ow) B.f5970b, i12);
                    int i13 = sbVar.f8115d.f14547d ? 0 : 2;
                    if (B.f5971c) {
                        B.n();
                        B.f5971c = false;
                    }
                    ow.A((ow) B.f5970b, i13);
                    sbVar.f8112a.a(new g2((ow) ((aq) B.j())));
                    sbVar.f8112a.b(ov.OFFLINE_UPLOAD);
                }
                sQLiteDatabase.delete("offline_signal_contents", (String) null, (String[]) null);
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", 0);
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{"failed_requests"});
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("value", 0);
                sQLiteDatabase.update("offline_signal_statistics", contentValues2, "statistic_name = ?", new String[]{"total_requests"});
                return null;
            default:
                dt.a((SQLiteDatabase) obj, (c9) this.f8042b);
                return null;
        }
    }

    public void d0() {
        fn fnVar = ((ap) this.f8042b).f13739d;
        if (fnVar != null) {
            synchronized (fnVar) {
                fnVar.f14654j.t("_videoMediaView");
            }
        }
    }

    public void g(Object obj) {
        switch (this.f8041a) {
            case 26:
                ((av) obj).n1((yu) this.f8042b);
                return;
            default:
                m5 m5Var = (m5) this.f8042b;
                ((e6) obj).V(new m6(m5Var.o(), m5Var.q0()));
                return;
        }
    }

    public Object get() {
        return ((e) this.f8042b).f6257e.getString("flag_configuration", "{}");
    }

    public File l() {
        return (File) this.f8042b;
    }

    public void m(Object obj) {
        switch (this.f8041a) {
            case 5:
                o50 o50 = h9.f14885e;
                ((k9) o50).f15244a.execute(new j0(this, (h4) obj));
                return;
            default:
                ((d7) this.f8042b).b((u4) obj);
                return;
        }
    }

    public void n(Throwable th) {
        switch (this.f8041a) {
            case 9:
                n6.f7519m.remove((p50) this.f8042b);
                return;
            default:
                String valueOf = String.valueOf(th.getMessage());
                l0.e.I(valueOf.length() != 0 ? "Failed to get offline buffered ping database: ".concat(valueOf) : new String("Failed to get offline buffered ping database: "));
                return;
        }
    }

    public void t(View view) {
    }

    public void v() {
        d9 d9Var = ((cb) this.f8042b).f6110g;
        synchronized (d9Var) {
            if (!d9Var.f6194f) {
                ScheduledFuture<?> scheduledFuture = d9Var.f6195g;
                if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                    d9Var.f6193e = -1;
                } else {
                    d9Var.f6195g.cancel(true);
                    d9Var.f6193e = d9Var.f6192d - d9Var.f6191c.a();
                }
                d9Var.f6194f = true;
            }
        }
    }

    public void w() {
        synchronized (((hd) this.f8042b)) {
            ((hd) this.f8042b).f6851g = null;
        }
    }

    public p50 y(l5 l5Var) {
        p50 p50;
        sr srVar = (sr) this.f8042b;
        synchronized (srVar.f15834b) {
            int i10 = srVar.f16514h;
            if (i10 != 1 && i10 != 2) {
                p50 = new ai.a(new wr(we.INVALID_REQUEST));
            } else if (srVar.f15835c) {
                p50 = srVar.f15833a;
            } else {
                srVar.f16514h = 2;
                srVar.f15835c = true;
                srVar.f15837e = l5Var;
                srVar.f15838f.n();
                d7<InputStream> d7Var = srVar.f15833a;
                d7Var.f6188a.a(new e7.e(srVar), h9.f14886f);
                p50 = srVar.f15833a;
            }
        }
        return p50;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT>, com.google.android.gms.internal.ads.e] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ri(com.google.android.gms.internal.ads.e r2) {
        /*
            r1 = this;
            r0 = 1
            r1.f8041a = r0
            r1.<init>()
            r1.f8042b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ri.<init>(com.google.android.gms.internal.ads.e):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.m5, com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ri(com.google.android.gms.internal.ads.m5 r2) {
        /*
            r1 = this;
            r0 = 28
            r1.f8041a = r0
            r1.<init>()
            r1.f8042b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ri.<init>(com.google.android.gms.internal.ads.m5):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.a6, com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ri(com.google.android.gms.internal.ads.a6 r2) {
        /*
            r1 = this;
            r0 = 16
            r1.f8041a = r0
            r1.<init>()
            r1.f8042b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ri.<init>(com.google.android.gms.internal.ads.a6):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.d7, com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ri(com.google.android.gms.internal.ads.d7 r2) {
        /*
            r1 = this;
            r0 = 6
            r1.f8041a = r0
            r1.<init>()
            r1.f8042b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ri.<init>(com.google.android.gms.internal.ads.d7):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT>, com.google.android.gms.internal.ads.n7] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ri(com.google.android.gms.internal.ads.n7 r2) {
        /*
            r1 = this;
            r0 = 11
            r1.f8041a = r0
            r1.<init>()
            r1.f8042b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ri.<init>(com.google.android.gms.internal.ads.n7):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.t7, com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ri(com.google.android.gms.internal.ads.t7 r2) {
        /*
            r1 = this;
            r0 = 19
            r1.f8041a = r0
            r1.<init>()
            r1.f8042b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ri.<init>(com.google.android.gms.internal.ads.t7):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.sb, com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ri(com.google.android.gms.internal.ads.sb r2) {
        /*
            r1 = this;
            r0 = 21
            r1.f8041a = r0
            r1.<init>()
            r1.f8042b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ri.<init>(com.google.android.gms.internal.ads.sb):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.yu, com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ri(com.google.android.gms.internal.ads.yu r2) {
        /*
            r1 = this;
            r0 = 26
            r1.f8041a = r0
            r1.<init>()
            r1.f8042b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ri.<init>(com.google.android.gms.internal.ads.yu):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [e8.f3, com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ri(e8.f3 r2) {
        /*
            r1 = this;
            r0 = 4
            r1.f8041a = r0
            r1.<init>()
            r1.f8042b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ri.<init>(e8.f3):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [e8.c9, com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ri(e8.c9 r2) {
        /*
            r1 = this;
            r0 = 22
            r1.f8041a = r0
            r1.<init>()
            r1.f8042b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ri.<init>(e8.c9):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [e8.ei, com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ri(e8.ei r2) {
        /*
            r1 = this;
            r0 = 27
            r1.f8041a = r0
            r1.<init>()
            r1.f8042b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ri.<init>(e8.ei):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [e8.zj, com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ri(e8.zj r2) {
        /*
            r1 = this;
            r0 = 13
            r1.f8041a = r0
            r1.<init>()
            r1.f8042b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ri.<init>(e8.zj):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [e8.sr, com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ri(e8.sr r2) {
        /*
            r1 = this;
            r0 = 20
            r1.f8041a = r0
            r1.<init>()
            r1.f8042b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ri.<init>(e8.sr):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [e8.vg0, com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ri(e8.vg0 r2) {
        /*
            r1 = this;
            r0 = 15
            r1.f8041a = r0
            r1.<init>()
            r1.f8042b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ri.<init>(e8.vg0):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT>, com.google.android.gms.internal.ads.y2] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ri(com.google.android.gms.internal.ads.y2 r2) {
        /*
            r1 = this;
            r0 = 8
            r1.f8041a = r0
            r1.<init>()
            r1.f8042b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ri.<init>(com.google.android.gms.internal.ads.y2):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.cb, com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ri(com.google.android.gms.internal.ads.cb r2) {
        /*
            r1 = this;
            r0 = 18
            r1.f8041a = r0
            r1.f8042b = r2
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ri.<init>(com.google.android.gms.internal.ads.cb):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.hd, com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ri(com.google.android.gms.internal.ads.hd r2) {
        /*
            r1 = this;
            r0 = 25
            r1.f8041a = r0
            r1.f8042b = r2
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ri.<init>(com.google.android.gms.internal.ads.hd):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.gf, com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ri(com.google.android.gms.internal.ads.gf r2) {
        /*
            r1 = this;
            r0 = 23
            r1.f8041a = r0
            r1.f8042b = r2
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ri.<init>(com.google.android.gms.internal.ads.gf):void");
    }

    public ri(ti tiVar) {
        this.f8041a = 0;
        this.f8042b = tiVar;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [e8.c0, com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ri(e8.c0 r2) {
        /*
            r1 = this;
            r0 = 2
            r1.f8041a = r0
            r1.<init>()
            r1.f8042b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ri.<init>(e8.c0):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [e8.r4, com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ri(e8.r4 r2) {
        /*
            r1 = this;
            r0 = 5
            r1.f8041a = r0
            r1.f8042b = r2
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ri.<init>(e8.r4):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [e8.jm, com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ri(e8.jm r2) {
        /*
            r1 = this;
            r0 = 24
            r1.f8041a = r0
            r1.f8042b = r2
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ri.<init>(e8.jm):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [e8.ap, com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ri(e8.ap r2) {
        /*
            r1 = this;
            r0 = 17
            r1.f8041a = r0
            r1.f8042b = r2
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ri.<init>(e8.ap):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [e8.w00, com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ri(e8.w00 r2) {
        /*
            r1 = this;
            r0 = 29
            r1.f8041a = r0
            r1.<init>()
            r1.f8042b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ri.<init>(e8.w00):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [e8.p50, com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ri(e8.p50 r2) {
        /*
            r1 = this;
            r0 = 9
            r1.f8041a = r0
            r1.f8042b = r2
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ri.<init>(e8.p50):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT>, java.io.File] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ri(java.io.File r2) {
        /*
            r1 = this;
            r0 = 10
            r1.f8041a = r0
            r1.f8042b = r2
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ri.<init>(java.io.File):void");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.concurrent.atomic.AtomicBoolean, com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT>] */
    public ri() {
        this.f8041a = 7;
        this.f8042b = new AtomicBoolean(false);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.f9, com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ri(com.google.android.gms.internal.ads.f9 r1, e.h r2) {
        /*
            r0 = this;
            r2 = 14
            r0.f8041a = r2
            r0.f8041a = r2
            r0.<init>()
            r0.f8042b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ri.<init>(com.google.android.gms.internal.ads.f9, e.h):void");
    }
}

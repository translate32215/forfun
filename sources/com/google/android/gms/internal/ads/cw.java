package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import com.google.android.gms.internal.ads.aw;
import com.google.android.gms.internal.ads.pv;
import e8.c90;
import e8.d70;
import e8.d80;
import e8.f90;
import e8.k90;
import e8.q80;
import e8.vh0;
import e8.z60;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class cw extends aq<cw, a> implements c90 {
    /* access modifiers changed from: private */
    public static final cw zzccc;
    private static volatile f90<cw> zzei;
    private int zzcbp;
    private String zzcbq = "";
    private int zzcbr;
    private int zzcbs = 1000;
    private ow zzcbt;
    private d80 zzcbu = q80.f16099d;
    private aw zzcbv;
    private bw zzcbw;
    private gw zzcbx;
    private pv zzcby;
    private iw zzcbz;
    private uv zzcca;
    private vv zzccb;
    private int zzdt;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<cw, a> {
        public a() {
            super(cw.zzccc);
        }

        public final a o(pv.b bVar) {
            if (this.f5971c) {
                n();
                this.f5971c = false;
            }
            cw.z((cw) this.f5970b, (pv) ((aq) bVar.j()));
            return this;
        }

        public final a p(vv vvVar) {
            if (this.f5971c) {
                n();
                this.f5971c = false;
            }
            cw.B((cw) this.f5970b, vvVar);
            return this;
        }

        public final a q(aw.a aVar) {
            if (this.f5971c) {
                n();
                this.f5971c = false;
            }
            cw.C((cw) this.f5970b, (aw) ((aq) aVar.j()));
            return this;
        }

        public final pv r() {
            return ((cw) this.f5970b).I();
        }

        public a(uw uwVar) {
            super(cw.zzccc);
        }
    }

    static {
        cw cwVar = new cw();
        zzccc = cwVar;
        aq.t(cw.class, cwVar);
    }

    public static void A(cw cwVar, uv uvVar) {
        cwVar.getClass();
        uvVar.getClass();
        cwVar.zzcca = uvVar;
        cwVar.zzdt |= 1024;
    }

    public static void B(cw cwVar, vv vvVar) {
        cwVar.getClass();
        vvVar.getClass();
        cwVar.zzccb = vvVar;
        cwVar.zzdt |= 2048;
    }

    public static void C(cw cwVar, aw awVar) {
        cwVar.getClass();
        cwVar.zzcbv = awVar;
        cwVar.zzdt |= 32;
    }

    public static void D(cw cwVar, iw iwVar) {
        cwVar.getClass();
        iwVar.getClass();
        cwVar.zzcbz = iwVar;
        cwVar.zzdt |= 512;
    }

    public static void E(cw cwVar, Iterable iterable) {
        d80 d80 = cwVar.zzcbu;
        if (!((d70) d80).f14227a) {
            q80 q80 = (q80) d80;
            int i10 = q80.f16101c;
            cwVar.zzcbu = q80.r(i10 == 0 ? 10 : i10 << 1);
        }
        z60.h(iterable, cwVar.zzcbu);
    }

    public static void F(cw cwVar, String str) {
        cwVar.getClass();
        str.getClass();
        cwVar.zzdt |= 2;
        cwVar.zzcbq = str;
    }

    public static a J() {
        return (a) zzccc.v();
    }

    public static void y(cw cwVar) {
        cwVar.getClass();
        cwVar.zzcbu = q80.f16099d;
    }

    public static void z(cw cwVar, pv pvVar) {
        cwVar.getClass();
        cwVar.zzcby = pvVar;
        cwVar.zzdt |= 256;
    }

    public final String G() {
        return this.zzcbq;
    }

    public final aw H() {
        aw awVar = this.zzcbv;
        return awVar == null ? aw.A() : awVar;
    }

    public final pv I() {
        pv pvVar = this.zzcby;
        return pvVar == null ? pv.B() : pvVar;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (uw.f8300a[i10 - 1]) {
            case 1:
                return new cw();
            case 2:
                return new a((uw) null);
            case 3:
                return new k90(zzccc, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzdt", "zzcbp", "zzcbq", "zzcbr", "zzcbs", vh0.f17147a, "zzcbt", "zzcbu", "zzcbv", "zzcbw", "zzcbx", "zzcby", "zzcbz", "zzcca", "zzccb"});
            case 4:
                return zzccc;
            case 5:
                f90<cw> f90 = zzei;
                if (f90 == null) {
                    synchronized (cw.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzccc);
                            zzei = f90;
                        }
                    }
                }
                return f90;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

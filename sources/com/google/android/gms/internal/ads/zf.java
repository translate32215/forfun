package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;
import e8.x70;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class zf extends aq<zf, b> implements c90 {
    private static volatile f90<zf> zzei;
    /* access modifiers changed from: private */
    public static final zf zzhsd;
    private int zzdt;
    private String zzdu = "";
    private int zzhsa;
    private String zzhsb = "";
    private tf zzhsc;

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public enum a implements x70 {
        EVENT_TYPE_UNKNOWN(0),
        BLOCKED_IMPRESSION(1);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f8710a;

        /* access modifiers changed from: public */
        a(int i10) {
            this.f8710a = i10;
        }

        public final int g() {
            return this.f8710a;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8710a + " name=" + name() + '>';
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public static final class b extends aq.b<zf, b> {
        public b() {
            super(zf.zzhsd);
        }

        public b(yf yfVar) {
            super(zf.zzhsd);
        }
    }

    static {
        zf zfVar = new zf();
        zzhsd = zfVar;
        aq.t(zf.class, zfVar);
    }

    public static void A(zf zfVar, String str) {
        zfVar.getClass();
        str.getClass();
        zfVar.zzdt |= 2;
        zfVar.zzdu = str;
    }

    public static b B() {
        return (b) zzhsd.v();
    }

    public static void y(zf zfVar, tf tfVar) {
        zfVar.getClass();
        zfVar.zzhsc = tfVar;
        zfVar.zzdt |= 8;
    }

    public static void z(zf zfVar, a aVar) {
        zfVar.getClass();
        zfVar.zzhsa = aVar.f8710a;
        zfVar.zzdt |= 1;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (yf.f8607a[i10 - 1]) {
            case 1:
                return new zf();
            case 2:
                return new b((yf) null);
            case 3:
                return new k90(zzhsd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzdt", "zzhsa", ag.f5962a, "zzdu", "zzhsb", "zzhsc"});
            case 4:
                return zzhsd;
            case 5:
                f90<zf> f90 = zzei;
                if (f90 == null) {
                    synchronized (zf.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzhsd);
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

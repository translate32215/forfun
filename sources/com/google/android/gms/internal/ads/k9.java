package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c80;
import e8.c90;
import e8.f90;
import e8.i90;
import e8.k90;
import e8.x70;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class k9 extends aq<k9, a> implements c90 {
    /* access modifiers changed from: private */
    public static final k9 zzeh;
    private static volatile f90<k9> zzei;
    private int zzdt;
    private String zzdu = "";
    private long zzdv;
    private String zzdw = "";
    private String zzdx = "";
    private String zzdy = "";
    private long zzdz;
    private long zzea;
    private String zzeb = "";
    private long zzec;
    private String zzed = "";
    private String zzee = "";
    private c80<b> zzef = i90.f15001d;
    private int zzeg;

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public static final class a extends aq.b<k9, a> {
        public a() {
            super(k9.zzeh);
        }

        public a(g9 g9Var) {
            super(k9.zzeh);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public static final class b extends aq<b, a> implements c90 {
        private static volatile f90<b> zzei;
        /* access modifiers changed from: private */
        public static final b zzel;
        private int zzdt;
        private String zzej = "";
        private String zzek = "";

        /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
        public static final class a extends aq.b<b, a> {
            public a(g9 g9Var) {
                super(b.zzel);
            }
        }

        static {
            b bVar = new b();
            zzel = bVar;
            aq.t(b.class, bVar);
        }

        public final Object q(int i10, Object obj, Object obj2) {
            switch (g9.f6616a[i10 - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a((g9) null);
                case 3:
                    return new k90(zzel, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzdt", "zzej", "zzek"});
                case 4:
                    return zzel;
                case 5:
                    f90<b> f90 = zzei;
                    if (f90 == null) {
                        synchronized (b.class) {
                            f90 = zzei;
                            if (f90 == null) {
                                f90 = new aq.a<>(zzel);
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

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public enum c implements x70 {
        UNKNOWN(0),
        ENABLED(1),
        DISABLED(2);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f7215a;

        /* access modifiers changed from: public */
        c(int i10) {
            this.f7215a = i10;
        }

        public final int g() {
            return this.f7215a;
        }

        public final String toString() {
            return "<" + c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f7215a + " name=" + name() + '>';
        }
    }

    static {
        k9 k9Var = new k9();
        zzeh = k9Var;
        aq.t(k9.class, k9Var);
    }

    public static void A(k9 k9Var, String str) {
        k9Var.getClass();
        str.getClass();
        k9Var.zzdt |= 1;
        k9Var.zzdu = str;
    }

    public static void B(k9 k9Var, String str) {
        k9Var.getClass();
        str.getClass();
        k9Var.zzdt |= 4;
        k9Var.zzdw = str;
    }

    public static void C(k9 k9Var, String str) {
        k9Var.getClass();
        str.getClass();
        k9Var.zzdt |= 8;
        k9Var.zzdx = str;
    }

    public static void D(k9 k9Var, String str) {
        k9Var.getClass();
        str.getClass();
        k9Var.zzdt |= 16;
        k9Var.zzdy = str;
    }

    public static void E(k9 k9Var, String str) {
        k9Var.getClass();
        str.getClass();
        k9Var.zzdt |= 1024;
        k9Var.zzee = str;
    }

    public static a F() {
        return (a) zzeh.v();
    }

    public static void y(k9 k9Var, long j10) {
        k9Var.zzdt |= 2;
        k9Var.zzdv = j10;
    }

    public static void z(k9 k9Var, c cVar) {
        k9Var.getClass();
        k9Var.zzeg = cVar.f7215a;
        k9Var.zzdt |= 2048;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (g9.f6616a[i10 - 1]) {
            case 1:
                return new k9();
            case 2:
                return new a((g9) null);
            case 3:
                return new k90(zzeh, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zzdt", "zzdu", "zzdv", "zzdw", "zzdx", "zzdy", "zzdz", "zzea", "zzeb", "zzec", "zzed", "zzee", "zzef", b.class, "zzeg", r9.f8019a});
            case 4:
                return zzeh;
            case 5:
                f90<k9> f90 = zzei;
                if (f90 == null) {
                    synchronized (k9.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzeh);
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

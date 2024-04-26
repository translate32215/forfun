package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c80;
import e8.c90;
import e8.f90;
import e8.i90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class un extends aq<un, b> implements c90 {
    private static volatile f90<un> zzei;
    /* access modifiers changed from: private */
    public static final un zzigi;
    private int zziga;
    private c80<a> zzigh = i90.f15001d;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq<a, C0086a> implements c90 {
        private static volatile f90<a> zzei;
        /* access modifiers changed from: private */
        public static final a zzigj;
        private String zzifc = "";
        private int zzift;
        private int zzige;
        private int zzigf;

        /* renamed from: com.google.android.gms.internal.ads.un$a$a  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        public static final class C0086a extends aq.b<a, C0086a> {
            public C0086a() {
                super(a.zzigj);
            }

            public C0086a(tn tnVar) {
                super(a.zzigj);
            }
        }

        static {
            a aVar = new a();
            zzigj = aVar;
            aq.t(a.class, aVar);
        }

        public static void A(a aVar, Cdo doVar) {
            aVar.getClass();
            aVar.zzift = doVar.g();
        }

        public static void B(a aVar, String str) {
            aVar.getClass();
            str.getClass();
            aVar.zzifc = str;
        }

        public static C0086a C() {
            return (C0086a) zzigj.v();
        }

        public static void y(a aVar, int i10) {
            aVar.zzigf = i10;
        }

        public static void z(a aVar, ln lnVar) {
            aVar.getClass();
            aVar.zzige = lnVar.g();
        }

        public final Object q(int i10, Object obj, Object obj2) {
            switch (tn.f8208a[i10 - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C0086a((tn) null);
                case 3:
                    return new k90(zzigj, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzifc", "zzige", "zzigf", "zzift"});
                case 4:
                    return zzigj;
                case 5:
                    f90<a> f90 = zzei;
                    if (f90 == null) {
                        synchronized (a.class) {
                            f90 = zzei;
                            if (f90 == null) {
                                f90 = new aq.a<>(zzigj);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class b extends aq.b<un, b> {
        public b() {
            super(un.zzigi);
        }

        public b(tn tnVar) {
            super(un.zzigi);
        }
    }

    static {
        un unVar = new un();
        zzigi = unVar;
        aq.t(un.class, unVar);
    }

    public static b A() {
        return (b) zzigi.v();
    }

    public static void y(un unVar, int i10) {
        unVar.zziga = i10;
    }

    public static void z(un unVar, a aVar) {
        unVar.getClass();
        aVar.getClass();
        c80<a> c80 = unVar.zzigh;
        if (!c80.k()) {
            unVar.zzigh = aq.p(c80);
        }
        unVar.zzigh.add(aVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (tn.f8208a[i10 - 1]) {
            case 1:
                return new un();
            case 2:
                return new b((tn) null);
            case 3:
                return new k90(zzigi, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zziga", "zzigh", a.class});
            case 4:
                return zzigi;
            case 5:
                f90<un> f90 = zzei;
                if (f90 == null) {
                    synchronized (un.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzigi);
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

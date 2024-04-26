package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.a80;
import e8.c90;
import e8.d70;
import e8.f90;
import e8.k90;
import e8.w70;
import e8.x70;
import e8.y70;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class tf extends aq<tf, b> implements c90 {
    private static volatile f90<tf> zzei;
    private static final a80<Integer, a> zzhrs = new wf();
    /* access modifiers changed from: private */
    public static final tf zzhrw;
    private int zzdt;
    private y70 zzhrr = w70.f17224d;
    private String zzhrt = "";
    private String zzhru = "";
    private String zzhrv = "";

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public enum a implements x70 {
        BLOCKED_REASON_UNKNOWN(1),
        BLOCKED_REASON_BACKGROUND(2);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f8200a;

        /* access modifiers changed from: public */
        a(int i10) {
            this.f8200a = i10;
        }

        public final int g() {
            return this.f8200a;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8200a + " name=" + name() + '>';
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public static final class b extends aq.b<tf, b> {
        public b() {
            super(tf.zzhrw);
        }

        public b(wf wfVar) {
            super(tf.zzhrw);
        }
    }

    static {
        tf tfVar = new tf();
        zzhrw = tfVar;
        aq.t(tf.class, tfVar);
    }

    public static b A() {
        return (b) zzhrw.v();
    }

    public static void y(tf tfVar, a aVar) {
        tfVar.getClass();
        aVar.getClass();
        y70 y70 = tfVar.zzhrr;
        if (!((d70) y70).f14227a) {
            tfVar.zzhrr = aq.o(y70);
        }
        ((w70) tfVar.zzhrr).o(aVar.f8200a);
    }

    public static void z(tf tfVar, String str) {
        tfVar.getClass();
        str.getClass();
        tfVar.zzdt |= 1;
        tfVar.zzhrt = str;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (vf.f8363a[i10 - 1]) {
            case 1:
                return new tf();
            case 2:
                return new b((wf) null);
            case 3:
                return new k90(zzhrw, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzdt", "zzhrr", xf.f8554a, "zzhrt", "zzhru", "zzhrv"});
            case 4:
                return zzhrw;
            case 5:
                f90<tf> f90 = zzei;
                if (f90 == null) {
                    synchronized (tf.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzhrw);
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

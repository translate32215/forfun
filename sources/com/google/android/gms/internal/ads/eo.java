package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c80;
import e8.c90;
import e8.f90;
import e8.i90;
import e8.k90;
import java.util.List;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class eo extends aq<eo, a> implements c90 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f6295a = 0;
    private static volatile f90<eo> zzei;
    /* access modifiers changed from: private */
    public static final eo zzihc;
    private String zziha = "";
    private c80<pn> zzihb = i90.f15001d;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<eo, a> {
        public a(fo foVar) {
            super(eo.zzihc);
        }
    }

    static {
        eo eoVar = new eo();
        zzihc = eoVar;
        aq.t(eo.class, eoVar);
    }

    public static eo z() {
        return zzihc;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (fo.f6469a[i10 - 1]) {
            case 1:
                return new eo();
            case 2:
                return new a((fo) null);
            case 3:
                return new k90(zzihc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zziha", "zzihb", pn.class});
            case 4:
                return zzihc;
            case 5:
                f90<eo> f90 = zzei;
                if (f90 == null) {
                    synchronized (eo.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzihc);
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

    public final List<pn> y() {
        return this.zzihb;
    }
}

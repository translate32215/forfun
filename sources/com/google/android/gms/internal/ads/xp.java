package com.google.android.gms.internal.ads;

import com.startapp.b4;
import e8.d90;
import e8.g80;
import e8.j80;
import e8.o90;
import e8.p70;
import e8.p90;
import e8.q70;
import e8.x70;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class xp<T extends q70<T>> {

    /* renamed from: d  reason: collision with root package name */
    public static final xp f8564d = new xp(true);

    /* renamed from: a  reason: collision with root package name */
    public final p90<T, Object> f8565a = new o90(16);

    /* renamed from: b  reason: collision with root package name */
    public boolean f8566b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8567c;

    public xp() {
        int i10 = p90.f15882g;
    }

    public static int c(uq uqVar, int i10, Object obj) {
        int G = sp.G(i10);
        if (uqVar == uq.GROUP) {
            cq cqVar = (cq) obj;
            if (cqVar instanceof kp) {
                kp kpVar = (kp) cqVar;
            }
            G <<= 1;
        }
        return h(uqVar, obj) + G;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if ((r2 instanceof byte[]) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        if (r1 == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004c, code lost:
        throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if ((r2 instanceof e8.g80) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if ((r2 instanceof e8.x70) == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e(com.google.android.gms.internal.ads.uq r1, java.lang.Object r2) {
        /*
            java.nio.charset.Charset r0 = e8.v70.f17029a
            r2.getClass()
            int[] r0 = e8.p70.f15875a
            com.google.android.gms.internal.ads.vq r1 = r1.f8273a
            int r1 = r1.ordinal()
            r1 = r0[r1]
            switch(r1) {
                case 1: goto L_0x003e;
                case 2: goto L_0x003b;
                case 3: goto L_0x0038;
                case 4: goto L_0x0035;
                case 5: goto L_0x0032;
                case 6: goto L_0x002f;
                case 7: goto L_0x0025;
                case 8: goto L_0x001c;
                case 9: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0041
        L_0x0013:
            boolean r1 = r2 instanceof com.google.android.gms.internal.ads.cq
            if (r1 != 0) goto L_0x002d
            boolean r1 = r2 instanceof e8.g80
            if (r1 == 0) goto L_0x0041
            goto L_0x002d
        L_0x001c:
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 != 0) goto L_0x002d
            boolean r1 = r2 instanceof e8.x70
            if (r1 == 0) goto L_0x0041
            goto L_0x002d
        L_0x0025:
            boolean r1 = r2 instanceof com.google.android.gms.internal.ads.mp
            if (r1 != 0) goto L_0x002d
            boolean r1 = r2 instanceof byte[]
            if (r1 == 0) goto L_0x0041
        L_0x002d:
            r1 = 1
            goto L_0x0042
        L_0x002f:
            boolean r1 = r2 instanceof java.lang.String
            goto L_0x0042
        L_0x0032:
            boolean r1 = r2 instanceof java.lang.Boolean
            goto L_0x0042
        L_0x0035:
            boolean r1 = r2 instanceof java.lang.Double
            goto L_0x0042
        L_0x0038:
            boolean r1 = r2 instanceof java.lang.Float
            goto L_0x0042
        L_0x003b:
            boolean r1 = r2 instanceof java.lang.Long
            goto L_0x0042
        L_0x003e:
            boolean r1 = r2 instanceof java.lang.Integer
            goto L_0x0042
        L_0x0041:
            r1 = 0
        L_0x0042:
            if (r1 == 0) goto L_0x0045
            return
        L_0x0045:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Wrong object type used with protocol message reflection."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xp.e(com.google.android.gms.internal.ads.uq, java.lang.Object):void");
    }

    public static Object g(Object obj) {
        if (obj instanceof d90) {
            return ((d90) obj).s();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int h(uq uqVar, Object obj) {
        int c10;
        int I;
        switch (p70.f15876b[uqVar.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                Logger logger = sp.f8137b;
                return 8;
            case 2:
                ((Float) obj).floatValue();
                Logger logger2 = sp.f8137b;
                return 4;
            case 3:
                return sp.A(((Long) obj).longValue());
            case 4:
                return sp.A(((Long) obj).longValue());
            case 5:
                return sp.H(((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                Logger logger3 = sp.f8137b;
                return 8;
            case 7:
                ((Integer) obj).intValue();
                Logger logger4 = sp.f8137b;
                return 4;
            case b4.f10106f /*8*/:
                ((Boolean) obj).booleanValue();
                Logger logger5 = sp.f8137b;
                return 1;
            case 9:
                Logger logger6 = sp.f8137b;
                return ((cq) obj).c();
            case 10:
                if (!(obj instanceof g80)) {
                    Logger logger7 = sp.f8137b;
                    c10 = ((cq) obj).c();
                    I = sp.I(c10);
                    break;
                } else {
                    Logger logger8 = sp.f8137b;
                    c10 = ((g80) obj).b();
                    I = sp.I(c10);
                    break;
                }
            case 11:
                if (obj instanceof mp) {
                    return sp.o((mp) obj);
                }
                return sp.P((String) obj);
            case 12:
                if (!(obj instanceof mp)) {
                    Logger logger9 = sp.f8137b;
                    c10 = ((byte[]) obj).length;
                    I = sp.I(c10);
                    break;
                } else {
                    return sp.o((mp) obj);
                }
            case 13:
                return sp.I(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                Logger logger10 = sp.f8137b;
                return 4;
            case 15:
                ((Long) obj).longValue();
                Logger logger11 = sp.f8137b;
                return 8;
            case 16:
                return sp.J(((Integer) obj).intValue());
            case 17:
                return sp.B(((Long) obj).longValue());
            case 18:
                if (obj instanceof x70) {
                    return sp.H(((x70) obj).g());
                }
                return sp.H(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return I + c10;
    }

    public static int i(q70<?> q70, Object obj) {
        uq k10 = q70.k();
        int g10 = q70.g();
        if (!q70.n()) {
            return c(k10, g10, obj);
        }
        int i10 = 0;
        if (q70.h()) {
            for (Object h10 : (List) obj) {
                i10 += h(k10, h10);
            }
            return sp.G(g10) + i10 + sp.I(i10);
        }
        for (Object c10 : (List) obj) {
            i10 += c(k10, g10, c10);
        }
        return i10;
    }

    public static <T extends q70<T>> boolean j(Map.Entry<T, Object> entry) {
        q70 q70 = (q70) entry.getKey();
        if (q70.l() == vq.MESSAGE) {
            if (q70.n()) {
                for (cq isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof cq) {
                    if (!((cq) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof g80) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public static int m(Map.Entry<T, Object> entry) {
        int l10;
        int I;
        int c10;
        int I2;
        q70 q70 = (q70) entry.getKey();
        Object value = entry.getValue();
        if (q70.l() != vq.MESSAGE || q70.n() || q70.h()) {
            return i(q70, value);
        }
        if (value instanceof g80) {
            l10 = sp.l(2, ((q70) entry.getKey()).g()) + (sp.I(8) << 1);
            I = sp.I(24);
            c10 = ((g80) value).b();
            I2 = sp.I(c10);
        } else {
            l10 = sp.l(2, ((q70) entry.getKey()).g()) + (sp.I(8) << 1);
            I = sp.I(24);
            c10 = ((cq) value).c();
            I2 = sp.I(c10);
        }
        return I2 + c10 + I + l10;
    }

    public final boolean a() {
        for (int i10 = 0; i10 < this.f8565a.d(); i10++) {
            if (!j(this.f8565a.h(i10))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> j10 : this.f8565a.e()) {
            if (!j(j10)) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Map.Entry<T, Object>> b() {
        if (this.f8567c) {
            return new j80(this.f8565a.entrySet().iterator());
        }
        return this.f8565a.entrySet().iterator();
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        xp xpVar = new xp();
        for (int i10 = 0; i10 < this.f8565a.d(); i10++) {
            Map.Entry<T, Object> h10 = this.f8565a.h(i10);
            xpVar.f((q70) h10.getKey(), h10.getValue());
        }
        for (Map.Entry next : this.f8565a.e()) {
            xpVar.f((q70) next.getKey(), next.getValue());
        }
        xpVar.f8567c = this.f8567c;
        return xpVar;
    }

    public final Object d(T t10) {
        Object obj = this.f8565a.get(t10);
        if (!(obj instanceof g80)) {
            return obj;
        }
        g80 g80 = (g80) obj;
        int i10 = g80.f14736c;
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp)) {
            return false;
        }
        return this.f8565a.equals(((xp) obj).f8565a);
    }

    public final void f(T t10, Object obj) {
        if (!t10.n()) {
            e(t10.k(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                e(t10.k(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof g80) {
            this.f8567c = true;
        }
        this.f8565a.put(t10, obj);
    }

    public final int hashCode() {
        return this.f8565a.hashCode();
    }

    public final void k() {
        if (!this.f8566b) {
            this.f8565a.c();
            this.f8566b = true;
        }
    }

    public final void l(Map.Entry<T, Object> entry) {
        Object obj;
        q70 q70 = (q70) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof g80) {
            g80 g80 = (g80) value;
            int i10 = g80.f14736c;
            throw new NoSuchMethodError();
        } else if (q70.n()) {
            Object d10 = d(q70);
            if (d10 == null) {
                d10 = new ArrayList();
            }
            for (Object g10 : (List) value) {
                ((List) d10).add(g(g10));
            }
            this.f8565a.put(q70, d10);
        } else if (q70.l() == vq.MESSAGE) {
            Object d11 = d(q70);
            if (d11 == null) {
                this.f8565a.put(q70, g(value));
                return;
            }
            if (d11 instanceof d90) {
                obj = q70.j((d90) d11, (d90) value);
            } else {
                obj = q70.p(((cq) d11).d(), (cq) value).j();
            }
            this.f8565a.put(q70, obj);
        } else {
            this.f8565a.put(q70, g(value));
        }
    }

    public xp(boolean z10) {
        int i10 = p90.f15882g;
        k();
        k();
    }
}

package com.google.android.gms.internal.ads;

import e8.ha0;
import e8.i80;
import e8.k80;
import e8.q70;
import e8.q80;
import e8.w70;
import e8.z70;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class kq {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f7265a;

    /* renamed from: b  reason: collision with root package name */
    public static final lq<?, ?> f7266b = s(false);

    /* renamed from: c  reason: collision with root package name */
    public static final lq<?, ?> f7267c = s(true);

    /* renamed from: d  reason: collision with root package name */
    public static final lq<?, ?> f7268d = new mq();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f7265a = cls;
    }

    public static void A(int i10, List<Long> list, ha0 ha0, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            tp tpVar = (tp) ha0;
            tpVar.getClass();
            int i11 = 0;
            if (z10) {
                tpVar.f8209a.c(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += sp.B(list.get(i13).longValue());
                }
                tpVar.f8209a.E(i12);
                while (i11 < list.size()) {
                    tpVar.f8209a.y(sp.C(list.get(i11).longValue()));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                tpVar.f8209a.N(i10, sp.C(list.get(i11).longValue()));
                i11++;
            }
        }
    }

    public static void B(int i10, List<Long> list, ha0 ha0, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            tp tpVar = (tp) ha0;
            tpVar.getClass();
            int i11 = 0;
            if (z10) {
                tpVar.f8209a.c(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    list.get(i13).longValue();
                    Logger logger = sp.f8137b;
                    i12 += 8;
                }
                tpVar.f8209a.E(i12);
                while (i11 < list.size()) {
                    tpVar.f8209a.z(list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                tpVar.f8209a.R(i10, list.get(i11).longValue());
                i11++;
            }
        }
    }

    public static void C(int i10, List<Long> list, ha0 ha0, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            tp tpVar = (tp) ha0;
            tpVar.getClass();
            int i11 = 0;
            if (z10) {
                tpVar.f8209a.c(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    list.get(i13).longValue();
                    Logger logger = sp.f8137b;
                    i12 += 8;
                }
                tpVar.f8209a.E(i12);
                while (i11 < list.size()) {
                    tpVar.f8209a.z(list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                tpVar.f8209a.R(i10, list.get(i11).longValue());
                i11++;
            }
        }
    }

    public static void D(int i10, List<Integer> list, ha0 ha0, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            tp tpVar = (tp) ha0;
            tpVar.getClass();
            int i11 = 0;
            if (z10) {
                tpVar.f8209a.c(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += sp.H(list.get(i13).intValue());
                }
                tpVar.f8209a.E(i12);
                while (i11 < list.size()) {
                    tpVar.f8209a.D(list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                tpVar.f8209a.h(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public static boolean E(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void F(int i10, List<Integer> list, ha0 ha0, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            tp tpVar = (tp) ha0;
            tpVar.getClass();
            int i11 = 0;
            if (z10) {
                tpVar.f8209a.c(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += sp.I(list.get(i13).intValue());
                }
                tpVar.f8209a.E(i12);
                while (i11 < list.size()) {
                    tpVar.f8209a.E(list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                tpVar.f8209a.i(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public static void G(int i10, List<Integer> list, ha0 ha0, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            tp tpVar = (tp) ha0;
            tpVar.getClass();
            int i11 = 0;
            if (z10) {
                tpVar.f8209a.c(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += sp.J(list.get(i13).intValue());
                }
                tpVar.f8209a.E(i12);
                while (i11 < list.size()) {
                    tpVar.f8209a.E(sp.L(list.get(i11).intValue()));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                tpVar.f8209a.i(i10, sp.L(list.get(i11).intValue()));
                i11++;
            }
        }
    }

    public static void H(int i10, List<Integer> list, ha0 ha0, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            tp tpVar = (tp) ha0;
            tpVar.getClass();
            int i11 = 0;
            if (z10) {
                tpVar.f8209a.c(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    list.get(i13).intValue();
                    Logger logger = sp.f8137b;
                    i12 += 4;
                }
                tpVar.f8209a.E(i12);
                while (i11 < list.size()) {
                    tpVar.f8209a.F(list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                tpVar.f8209a.j(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public static void I(int i10, List<Integer> list, ha0 ha0, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            tp tpVar = (tp) ha0;
            tpVar.getClass();
            int i11 = 0;
            if (z10) {
                tpVar.f8209a.c(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    list.get(i13).intValue();
                    Logger logger = sp.f8137b;
                    i12 += 4;
                }
                tpVar.f8209a.E(i12);
                while (i11 < list.size()) {
                    tpVar.f8209a.F(list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                tpVar.f8209a.j(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public static void J(int i10, List<Integer> list, ha0 ha0, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            tp tpVar = (tp) ha0;
            tpVar.getClass();
            int i11 = 0;
            if (z10) {
                tpVar.f8209a.c(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += sp.H(list.get(i13).intValue());
                }
                tpVar.f8209a.E(i12);
                while (i11 < list.size()) {
                    tpVar.f8209a.D(list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                tpVar.f8209a.h(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public static void K(int i10, List<Boolean> list, ha0 ha0, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            tp tpVar = (tp) ha0;
            tpVar.getClass();
            int i11 = 0;
            if (z10) {
                tpVar.f8209a.c(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    list.get(i13).booleanValue();
                    Logger logger = sp.f8137b;
                    i12++;
                }
                tpVar.f8209a.E(i12);
                while (i11 < list.size()) {
                    tpVar.f8209a.x(list.get(i11).booleanValue() ? (byte) 1 : 0);
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                tpVar.f8209a.K(i10, list.get(i11).booleanValue());
                i11++;
            }
        }
    }

    public static int L(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (sp.G(i10) * list.size()) + g(list);
    }

    public static int M(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (sp.G(i10) * size) + h(list);
    }

    public static int N(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (sp.G(i10) * size) + i(list);
    }

    public static int O(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (sp.G(i10) * size) + j(list);
    }

    public static int P(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (sp.G(i10) * size) + k(list);
    }

    public static int Q(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (sp.G(i10) * size) + l(list);
    }

    public static int R(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (sp.G(i10) * size) + m(list);
    }

    public static int S(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return sp.n(i10) * size;
    }

    public static int T(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return sp.V(i10) * size;
    }

    public static <UT, UB> UB a(int i10, int i11, UB ub2, lq<UT, UB> lqVar) {
        if (ub2 == null) {
            ub2 = lqVar.n();
        }
        lqVar.a(ub2, i10, (long) i11);
        return ub2;
    }

    public static <UT, UB> UB b(int i10, List<Integer> list, z70 z70, UB ub2, lq<UT, UB> lqVar) {
        if (z70 == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (z70.a(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    if (ub2 == null) {
                        ub2 = lqVar.n();
                    }
                    lqVar.a(ub2, i10, (long) intValue);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!z70.a(intValue2)) {
                    if (ub2 == null) {
                        ub2 = lqVar.n();
                    }
                    lqVar.a(ub2, i10, (long) intValue2);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    public static void c(int i10, List<String> list, ha0 ha0) throws IOException {
        if (list != null && !list.isEmpty()) {
            tp tpVar = (tp) ha0;
            tpVar.getClass();
            int i11 = 0;
            if (list instanceof k80) {
                k80 k80 = (k80) list;
                while (i11 < list.size()) {
                    Object p10 = k80.p(i11);
                    if (p10 instanceof String) {
                        tpVar.f8209a.O(i10, (String) p10);
                    } else {
                        tpVar.f8209a.e(i10, (mp) p10);
                    }
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                tpVar.f8209a.O(i10, list.get(i11));
                i11++;
            }
        }
    }

    public static void d(int i10, List<?> list, ha0 ha0, iq iqVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            tp tpVar = (tp) ha0;
            tpVar.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                tpVar.f8209a.g(i10, (cq) list.get(i11), iqVar);
            }
        }
    }

    public static void e(int i10, List<Double> list, ha0 ha0, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            tp tpVar = (tp) ha0;
            tpVar.getClass();
            int i11 = 0;
            if (z10) {
                tpVar.f8209a.c(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    list.get(i13).doubleValue();
                    Logger logger = sp.f8137b;
                    i12 += 8;
                }
                tpVar.f8209a.E(i12);
                while (i11 < list.size()) {
                    sp spVar = tpVar.f8209a;
                    double doubleValue = list.get(i11).doubleValue();
                    spVar.getClass();
                    spVar.z(Double.doubleToRawLongBits(doubleValue));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                sp spVar2 = tpVar.f8209a;
                double doubleValue2 = list.get(i11).doubleValue();
                spVar2.getClass();
                spVar2.R(i10, Double.doubleToRawLongBits(doubleValue2));
                i11++;
            }
        }
    }

    public static <T, FT extends q70<FT>> void f(vp<FT> vpVar, T t10, T t11) {
        xp<FT> g10 = vpVar.g(t11);
        if (!g10.f8565a.isEmpty()) {
            xp<FT> h10 = vpVar.h(t10);
            h10.getClass();
            for (int i10 = 0; i10 < g10.f8565a.d(); i10++) {
                h10.l(g10.f8565a.h(i10));
            }
            for (Map.Entry<T, Object> l10 : g10.f8565a.e()) {
                h10.l(l10);
            }
        }
    }

    public static int g(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof q80) {
            q80 q80 = (q80) list;
            i10 = 0;
            while (i11 < size) {
                i10 += sp.A(q80.f(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + sp.A(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int h(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof q80) {
            q80 q80 = (q80) list;
            i10 = 0;
            while (i11 < size) {
                i10 += sp.A(q80.f(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + sp.A(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int i(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof q80) {
            q80 q80 = (q80) list;
            i10 = 0;
            while (i11 < size) {
                i10 += sp.B(q80.f(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + sp.B(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int j(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof w70) {
            w70 w70 = (w70) list;
            i10 = 0;
            while (i11 < size) {
                i10 += sp.H(w70.f(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + sp.H(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int k(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof w70) {
            w70 w70 = (w70) list;
            i10 = 0;
            while (i11 < size) {
                i10 += sp.H(w70.f(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + sp.H(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int l(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof w70) {
            w70 w70 = (w70) list;
            i10 = 0;
            while (i11 < size) {
                i10 += sp.I(w70.f(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + sp.I(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int m(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof w70) {
            w70 w70 = (w70) list;
            i10 = 0;
            while (i11 < size) {
                i10 += sp.J(w70.f(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + sp.J(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int n(List<?> list) {
        return list.size() << 2;
    }

    public static int o(List<?> list) {
        return list.size() << 3;
    }

    public static void p(int i10, List<mp> list, ha0 ha0) throws IOException {
        if (list != null && !list.isEmpty()) {
            tp tpVar = (tp) ha0;
            tpVar.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                tpVar.f8209a.e(i10, list.get(i11));
            }
        }
    }

    public static void q(int i10, List<?> list, ha0 ha0, iq iqVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            tp tpVar = (tp) ha0;
            tpVar.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                tpVar.e(i10, list.get(i11), iqVar);
            }
        }
    }

    public static void r(int i10, List<Float> list, ha0 ha0, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            tp tpVar = (tp) ha0;
            tpVar.getClass();
            int i11 = 0;
            if (z10) {
                tpVar.f8209a.c(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    list.get(i13).floatValue();
                    Logger logger = sp.f8137b;
                    i12 += 4;
                }
                tpVar.f8209a.E(i12);
                while (i11 < list.size()) {
                    sp spVar = tpVar.f8209a;
                    float floatValue = list.get(i11).floatValue();
                    spVar.getClass();
                    spVar.F(Float.floatToRawIntBits(floatValue));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                sp spVar2 = tpVar.f8209a;
                float floatValue2 = list.get(i11).floatValue();
                spVar2.getClass();
                spVar2.j(i10, Float.floatToRawIntBits(floatValue2));
                i11++;
            }
        }
    }

    public static lq<?, ?> s(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (lq) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z10)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int t(int i10, Object obj, iq iqVar) {
        if (obj instanceof i80) {
            int I = sp.I(i10 << 3);
            int b10 = ((i80) obj).b();
            return sp.I(b10) + b10 + I;
        }
        return sp.d((cq) obj, iqVar) + sp.I(i10 << 3);
    }

    public static int u(int i10, List<?> list) {
        int i11;
        int i12;
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        int G = sp.G(i10) * size;
        if (list instanceof k80) {
            k80 k80 = (k80) list;
            while (i13 < size) {
                Object p10 = k80.p(i13);
                if (p10 instanceof mp) {
                    i12 = sp.o((mp) p10);
                } else {
                    i12 = sp.P((String) p10);
                }
                G = i12 + G;
                i13++;
            }
        } else {
            while (i13 < size) {
                Object obj = list.get(i13);
                if (obj instanceof mp) {
                    i11 = sp.o((mp) obj);
                } else {
                    i11 = sp.P((String) obj);
                }
                G = i11 + G;
                i13++;
            }
        }
        return G;
    }

    public static int v(int i10, List<?> list, iq iqVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int G = sp.G(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof i80) {
                int b10 = ((i80) obj).b();
                G += sp.I(b10) + b10;
            } else {
                G = sp.d((cq) obj, iqVar) + G;
            }
        }
        return G;
    }

    public static void w(int i10, List<Long> list, ha0 ha0, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            tp tpVar = (tp) ha0;
            tpVar.getClass();
            int i11 = 0;
            if (z10) {
                tpVar.f8209a.c(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += sp.A(list.get(i13).longValue());
                }
                tpVar.f8209a.E(i12);
                while (i11 < list.size()) {
                    tpVar.f8209a.y(list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                tpVar.f8209a.N(i10, list.get(i11).longValue());
                i11++;
            }
        }
    }

    public static int x(int i10, List<mp> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int G = sp.G(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            G += sp.o(list.get(i11));
        }
        return G;
    }

    public static int y(int i10, List<cq> list, iq iqVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += sp.w(i10, list.get(i12), iqVar);
        }
        return i11;
    }

    public static void z(int i10, List<Long> list, ha0 ha0, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            tp tpVar = (tp) ha0;
            tpVar.getClass();
            int i11 = 0;
            if (z10) {
                tpVar.f8209a.c(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += sp.A(list.get(i13).longValue());
                }
                tpVar.f8209a.E(i12);
                while (i11 < list.size()) {
                    tpVar.f8209a.y(list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                tpVar.f8209a.N(i10, list.get(i11).longValue());
                i11++;
            }
        }
    }
}

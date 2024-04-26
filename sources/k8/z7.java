package k8;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class z7 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f20565a;

    /* renamed from: b  reason: collision with root package name */
    public static final l8<?, ?> f20566b = u(false);

    /* renamed from: c  reason: collision with root package name */
    public static final l8<?, ?> f20567c = u(true);

    /* renamed from: d  reason: collision with root package name */
    public static final l8<?, ?> f20568d = new n8();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f20565a = cls;
    }

    public static int A(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (t5.b(i10 << 3) + 8) * size;
    }

    public static int B(List<?> list) {
        return list.size() * 8;
    }

    public static int C(int i10, List<m7> list, x7 x7Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += t5.w(i10, list.get(i12), x7Var);
        }
        return i11;
    }

    public static int D(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (t5.A(i10) * size) + E(list);
    }

    public static int E(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof m6) {
            m6 m6Var = (m6) list;
            i10 = 0;
            while (i11 < size) {
                i10 += t5.x(m6Var.f(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + t5.x(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int F(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (t5.A(i10) * list.size()) + G(list);
    }

    public static int G(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof b7) {
            b7 b7Var = (b7) list;
            i10 = 0;
            while (i11 < size) {
                i10 += t5.c(b7Var.f(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + t5.c(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int H(int i10, Object obj, x7 x7Var) {
        if (obj instanceof v6) {
            int b10 = t5.b(i10 << 3);
            int a10 = ((v6) obj).a();
            return t5.b(a10) + a10 + b10;
        }
        return t5.y((m7) obj, x7Var) + t5.b(i10 << 3);
    }

    public static int I(int i10, List<?> list, x7 x7Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int A = t5.A(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof v6) {
                int a10 = ((v6) obj).a();
                A += t5.b(a10) + a10;
            } else {
                A = t5.y((m7) obj, x7Var) + A;
            }
        }
        return A;
    }

    public static int J(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (t5.A(i10) * size) + K(list);
    }

    public static int K(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof m6) {
            m6 m6Var = (m6) list;
            i10 = 0;
            while (i11 < size) {
                int f10 = m6Var.f(i11);
                i10 += t5.b((f10 >> 31) ^ (f10 + f10));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                int intValue = list.get(i11).intValue();
                i12 = i10 + t5.b((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    public static int L(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (t5.A(i10) * size) + M(list);
    }

    public static int M(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof b7) {
            b7 b7Var = (b7) list;
            i10 = 0;
            while (i11 < size) {
                long f10 = b7Var.f(i11);
                i10 += t5.c((f10 >> 63) ^ (f10 + f10));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                long longValue = list.get(i11).longValue();
                i12 = i10 + t5.c((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    public static int N(int i10, List<?> list) {
        int i11;
        int i12;
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        int A = t5.A(i10) * size;
        if (list instanceof x6) {
            x6 x6Var = (x6) list;
            while (i13 < size) {
                Object u10 = x6Var.u(i13);
                if (u10 instanceof p5) {
                    i12 = t5.v((p5) u10);
                } else {
                    i12 = t5.z((String) u10);
                }
                A = i12 + A;
                i13++;
            }
        } else {
            while (i13 < size) {
                Object obj = list.get(i13);
                if (obj instanceof p5) {
                    i11 = t5.v((p5) obj);
                } else {
                    i11 = t5.z((String) obj);
                }
                A = i11 + A;
                i13++;
            }
        }
        return A;
    }

    public static int O(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (t5.A(i10) * size) + P(list);
    }

    public static int P(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof m6) {
            m6 m6Var = (m6) list;
            i10 = 0;
            while (i11 < size) {
                i10 += t5.b(m6Var.f(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + t5.b(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int Q(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (t5.A(i10) * size) + R(list);
    }

    public static int R(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof b7) {
            b7 b7Var = (b7) list;
            i10 = 0;
            while (i11 < size) {
                i10 += t5.c(b7Var.f(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + t5.c(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void b(int i10, List<Boolean> list, u5 u5Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            u5Var.getClass();
            int i11 = 0;
            if (z10) {
                u5Var.f20485a.p(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    list.get(i13).booleanValue();
                    i12++;
                }
                u5Var.f20485a.r(i12);
                while (i11 < list.size()) {
                    u5Var.f20485a.d(list.get(i11).booleanValue() ? (byte) 1 : 0);
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                u5Var.f20485a.e(i10, list.get(i11).booleanValue());
                i11++;
            }
        }
    }

    public static void c(int i10, List<p5> list, u5 u5Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            u5Var.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                u5Var.f20485a.f(i10, list.get(i11));
            }
        }
    }

    public static void d(int i10, List<Double> list, u5 u5Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            u5Var.getClass();
            int i11 = 0;
            if (z10) {
                u5Var.f20485a.p(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    list.get(i13).doubleValue();
                    i12 += 8;
                }
                u5Var.f20485a.r(i12);
                while (i11 < list.size()) {
                    u5Var.f20485a.k(Double.doubleToRawLongBits(list.get(i11).doubleValue()));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                u5Var.f20485a.j(i10, Double.doubleToRawLongBits(list.get(i11).doubleValue()));
                i11++;
            }
        }
    }

    public static void e(int i10, List<Integer> list, u5 u5Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            u5Var.getClass();
            int i11 = 0;
            if (z10) {
                u5Var.f20485a.p(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += t5.x(list.get(i13).intValue());
                }
                u5Var.f20485a.r(i12);
                while (i11 < list.size()) {
                    u5Var.f20485a.n(list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                u5Var.f20485a.l(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public static void f(int i10, List<Integer> list, u5 u5Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            u5Var.getClass();
            int i11 = 0;
            if (z10) {
                u5Var.f20485a.p(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    list.get(i13).intValue();
                    i12 += 4;
                }
                u5Var.f20485a.r(i12);
                while (i11 < list.size()) {
                    u5Var.f20485a.h(list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                u5Var.f20485a.g(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public static void g(int i10, List<Long> list, u5 u5Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            u5Var.getClass();
            int i11 = 0;
            if (z10) {
                u5Var.f20485a.p(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    list.get(i13).longValue();
                    i12 += 8;
                }
                u5Var.f20485a.r(i12);
                while (i11 < list.size()) {
                    u5Var.f20485a.k(list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                u5Var.f20485a.j(i10, list.get(i11).longValue());
                i11++;
            }
        }
    }

    public static void h(int i10, List<Float> list, u5 u5Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            u5Var.getClass();
            int i11 = 0;
            if (z10) {
                u5Var.f20485a.p(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    list.get(i13).floatValue();
                    i12 += 4;
                }
                u5Var.f20485a.r(i12);
                while (i11 < list.size()) {
                    u5Var.f20485a.h(Float.floatToRawIntBits(list.get(i11).floatValue()));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                u5Var.f20485a.g(i10, Float.floatToRawIntBits(list.get(i11).floatValue()));
                i11++;
            }
        }
    }

    public static void i(int i10, List<?> list, u5 u5Var, x7 x7Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                u5Var.e(i10, list.get(i11), x7Var);
            }
        }
    }

    public static void j(int i10, List<Integer> list, u5 u5Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            u5Var.getClass();
            int i11 = 0;
            if (z10) {
                u5Var.f20485a.p(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += t5.x(list.get(i13).intValue());
                }
                u5Var.f20485a.r(i12);
                while (i11 < list.size()) {
                    u5Var.f20485a.n(list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                u5Var.f20485a.l(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public static void k(int i10, List<Long> list, u5 u5Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            u5Var.getClass();
            int i11 = 0;
            if (z10) {
                u5Var.f20485a.p(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += t5.c(list.get(i13).longValue());
                }
                u5Var.f20485a.r(i12);
                while (i11 < list.size()) {
                    u5Var.f20485a.u(list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                u5Var.f20485a.t(i10, list.get(i11).longValue());
                i11++;
            }
        }
    }

    public static void l(int i10, List<?> list, u5 u5Var, x7 x7Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                u5Var.f(i10, list.get(i11), x7Var);
            }
        }
    }

    public static void m(int i10, List<Integer> list, u5 u5Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            u5Var.getClass();
            int i11 = 0;
            if (z10) {
                u5Var.f20485a.p(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    list.get(i13).intValue();
                    i12 += 4;
                }
                u5Var.f20485a.r(i12);
                while (i11 < list.size()) {
                    u5Var.f20485a.h(list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                u5Var.f20485a.g(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public static void n(int i10, List<Long> list, u5 u5Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            u5Var.getClass();
            int i11 = 0;
            if (z10) {
                u5Var.f20485a.p(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    list.get(i13).longValue();
                    i12 += 8;
                }
                u5Var.f20485a.r(i12);
                while (i11 < list.size()) {
                    u5Var.f20485a.k(list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                u5Var.f20485a.j(i10, list.get(i11).longValue());
                i11++;
            }
        }
    }

    public static void o(int i10, List<Integer> list, u5 u5Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            u5Var.getClass();
            int i11 = 0;
            if (z10) {
                u5Var.f20485a.p(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    int intValue = list.get(i13).intValue();
                    i12 += t5.b((intValue >> 31) ^ (intValue + intValue));
                }
                u5Var.f20485a.r(i12);
                while (i11 < list.size()) {
                    t5 t5Var = u5Var.f20485a;
                    int intValue2 = list.get(i11).intValue();
                    t5Var.r((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                t5 t5Var2 = u5Var.f20485a;
                int intValue3 = list.get(i11).intValue();
                t5Var2.q(i10, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i11++;
            }
        }
    }

    public static void p(int i10, List<Long> list, u5 u5Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            u5Var.getClass();
            int i11 = 0;
            if (z10) {
                u5Var.f20485a.p(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    long longValue = list.get(i13).longValue();
                    i12 += t5.c((longValue >> 63) ^ (longValue + longValue));
                }
                u5Var.f20485a.r(i12);
                while (i11 < list.size()) {
                    t5 t5Var = u5Var.f20485a;
                    long longValue2 = list.get(i11).longValue();
                    t5Var.u((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                t5 t5Var2 = u5Var.f20485a;
                long longValue3 = list.get(i11).longValue();
                t5Var2.t(i10, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i11++;
            }
        }
    }

    public static void q(int i10, List<String> list, u5 u5Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            u5Var.getClass();
            int i11 = 0;
            if (list instanceof x6) {
                x6 x6Var = (x6) list;
                while (i11 < list.size()) {
                    Object u10 = x6Var.u(i11);
                    if (u10 instanceof String) {
                        u5Var.f20485a.o(i10, (String) u10);
                    } else {
                        u5Var.f20485a.f(i10, (p5) u10);
                    }
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                u5Var.f20485a.o(i10, list.get(i11));
                i11++;
            }
        }
    }

    public static void r(int i10, List<Integer> list, u5 u5Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            u5Var.getClass();
            int i11 = 0;
            if (z10) {
                u5Var.f20485a.p(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += t5.b(list.get(i13).intValue());
                }
                u5Var.f20485a.r(i12);
                while (i11 < list.size()) {
                    u5Var.f20485a.r(list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                u5Var.f20485a.q(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public static int s(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (t5.b(i10 << 3) + 1) * size;
    }

    public static void t(int i10, List<Long> list, u5 u5Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            u5Var.getClass();
            int i11 = 0;
            if (z10) {
                u5Var.f20485a.p(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += t5.c(list.get(i13).longValue());
                }
                u5Var.f20485a.r(i12);
                while (i11 < list.size()) {
                    u5Var.f20485a.u(list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                u5Var.f20485a.t(i10, list.get(i11).longValue());
                i11++;
            }
        }
    }

    public static l8<?, ?> u(boolean z10) {
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
            return (l8) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z10)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int v(int i10, List<p5> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int A = t5.A(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            A += t5.v(list.get(i11));
        }
        return A;
    }

    public static int w(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (t5.A(i10) * size) + x(list);
    }

    public static int x(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof m6) {
            m6 m6Var = (m6) list;
            i10 = 0;
            while (i11 < size) {
                i10 += t5.x(m6Var.f(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + t5.x(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int y(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (t5.b(i10 << 3) + 4) * size;
    }

    public static int z(List<?> list) {
        return list.size() * 4;
    }
}

package q;

import android.database.Cursor;
import kd.o;
import l0.e;
import md.d;
import md.f;
import od.c;
import od.g;
import td.p;
import ud.k;
import ud.x;

public class a {

    /* renamed from: q.a$a  reason: collision with other inner class name */
    /* compiled from: IntrinsicsJvm.kt */
    public static final class C0217a extends g {

        /* renamed from: b  reason: collision with root package name */
        public int f24010b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ p f24011c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Object f24012d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0217a(d dVar, p pVar, Object obj) {
            super(dVar);
            this.f24011c = pVar;
            this.f24012d = obj;
        }

        public Object l(Object obj) {
            int i10 = this.f24010b;
            if (i10 == 0) {
                this.f24010b = 1;
                e.l(obj);
                k.d(this.f24011c, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
                p pVar = this.f24011c;
                x.b(pVar, 2);
                return pVar.h(this.f24012d, this);
            } else if (i10 == 1) {
                this.f24010b = 2;
                e.l(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    public static final class b extends c {

        /* renamed from: d  reason: collision with root package name */
        public int f24013d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ p f24014e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Object f24015f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d dVar, f fVar, p pVar, Object obj) {
            super(dVar, fVar);
            this.f24014e = pVar;
            this.f24015f = obj;
        }

        public Object l(Object obj) {
            int i10 = this.f24013d;
            if (i10 == 0) {
                this.f24013d = 1;
                e.l(obj);
                k.d(this.f24014e, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
                p pVar = this.f24014e;
                x.b(pVar, 2);
                return pVar.h(this.f24015f, this);
            } else if (i10 == 1) {
                this.f24013d = 2;
                e.l(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    public static float a(float f10) {
        return f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((double) ((f10 + 0.055f) / 1.055f), 2.4000000953674316d);
    }

    public static float b(float f10) {
        return f10 <= 0.0031308f ? f10 * 12.92f : (float) ((Math.pow((double) f10, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static void c(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int d(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException();
    }

    public static int e(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str);
    }

    public static <T> T f(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void g(boolean z10, String str) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }

    public static final <R, T> d<o> h(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar) {
        k.f(pVar, "<this>");
        k.f(dVar, "completion");
        if (pVar instanceof od.a) {
            return ((od.a) pVar).a(r10, dVar);
        }
        f context = dVar.getContext();
        if (context == md.g.f21797a) {
            return new C0217a(dVar, pVar, r10);
        }
        return new b(dVar, context, pVar, r10);
    }

    public static int i(float f10, int i10, int i11) {
        if (i10 == i11) {
            return i10;
        }
        float f11 = ((float) ((i10 >> 24) & 255)) / 255.0f;
        float a10 = a(((float) ((i10 >> 16) & 255)) / 255.0f);
        float a11 = a(((float) ((i10 >> 8) & 255)) / 255.0f);
        float a12 = a(((float) (i10 & 255)) / 255.0f);
        float a13 = a(((float) ((i11 >> 16) & 255)) / 255.0f);
        float a14 = a(((float) ((i11 >> 8) & 255)) / 255.0f);
        float a15 = a(((float) (i11 & 255)) / 255.0f);
        float a16 = h.e.a(((float) ((i11 >> 24) & 255)) / 255.0f, f11, f10, f11);
        float a17 = h.e.a(a13, a10, f10, a10);
        float a18 = h.e.a(a14, a11, f10, a11);
        float a19 = h.e.a(a15, a12, f10, a12);
        int round = Math.round(b(a17) * 255.0f) << 16;
        return Math.round(b(a19) * 255.0f) | round | (Math.round(a16 * 255.0f) << 24) | (Math.round(b(a18) * 255.0f) << 8);
    }

    public static int j(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r2 == null) goto L_0x002b;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> md.d<T> k(md.d<? super T> r2) {
        /*
            java.lang.String r0 = "<this>"
            ud.k.f(r2, r0)
            boolean r0 = r2 instanceof od.c
            if (r0 == 0) goto L_0x000d
            r0 = r2
            od.c r0 = (od.c) r0
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x002e
            md.d<java.lang.Object> r2 = r0.f23686c
            if (r2 != 0) goto L_0x002e
            md.f r2 = r0.f23685b
            ud.k.c(r2)
            int r1 = md.e.X
            md.e$a r1 = md.e.a.f21795a
            md.f$b r2 = r2.get(r1)
            md.e r2 = (md.e) r2
            if (r2 == 0) goto L_0x002b
            md.d r2 = r2.T(r0)
            if (r2 != 0) goto L_0x002c
        L_0x002b:
            r2 = r0
        L_0x002c:
            r0.f23686c = r2
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q.a.k(md.d):md.d");
    }
}

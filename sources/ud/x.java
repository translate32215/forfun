package ud;

import java.util.Collection;
import vd.a;
import vd.b;

/* compiled from: TypeIntrinsics */
public class x {
    public static Collection a(Object obj) {
        if (!(obj instanceof a) || (obj instanceof b)) {
            try {
                return (Collection) obj;
            } catch (ClassCastException e10) {
                k.i(e10, x.class.getName());
                throw e10;
            }
        } else {
            c(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00b9, code lost:
        if (r0 == r4) goto L_0x00bd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object b(java.lang.Object r3, int r4) {
        /*
            if (r3 == 0) goto L_0x00d6
            boolean r0 = r3 instanceof kd.a
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00bc
            boolean r0 = r3 instanceof ud.h
            if (r0 == 0) goto L_0x0015
            r0 = r3
            ud.h r0 = (ud.h) r0
            int r0 = r0.e()
            goto L_0x00b9
        L_0x0015:
            boolean r0 = r3 instanceof td.a
            if (r0 == 0) goto L_0x001c
            r0 = 0
            goto L_0x00b9
        L_0x001c:
            boolean r0 = r3 instanceof td.l
            if (r0 == 0) goto L_0x0023
            r0 = 1
            goto L_0x00b9
        L_0x0023:
            boolean r0 = r3 instanceof td.p
            if (r0 == 0) goto L_0x002a
            r0 = 2
            goto L_0x00b9
        L_0x002a:
            boolean r0 = r3 instanceof td.q
            if (r0 == 0) goto L_0x0031
            r0 = 3
            goto L_0x00b9
        L_0x0031:
            boolean r0 = r3 instanceof td.r
            if (r0 == 0) goto L_0x0038
            r0 = 4
            goto L_0x00b9
        L_0x0038:
            boolean r0 = r3 instanceof td.s
            if (r0 == 0) goto L_0x003f
            r0 = 5
            goto L_0x00b9
        L_0x003f:
            boolean r0 = r3 instanceof td.t
            if (r0 == 0) goto L_0x0046
            r0 = 6
            goto L_0x00b9
        L_0x0046:
            boolean r0 = r3 instanceof td.u
            if (r0 == 0) goto L_0x004d
            r0 = 7
            goto L_0x00b9
        L_0x004d:
            boolean r0 = r3 instanceof td.v
            if (r0 == 0) goto L_0x0055
            r0 = 8
            goto L_0x00b9
        L_0x0055:
            boolean r0 = r3 instanceof td.w
            if (r0 == 0) goto L_0x005d
            r0 = 9
            goto L_0x00b9
        L_0x005d:
            boolean r0 = r3 instanceof td.b
            if (r0 == 0) goto L_0x0064
            r0 = 10
            goto L_0x00b9
        L_0x0064:
            boolean r0 = r3 instanceof td.c
            if (r0 == 0) goto L_0x006b
            r0 = 11
            goto L_0x00b9
        L_0x006b:
            boolean r0 = r3 instanceof td.d
            if (r0 == 0) goto L_0x0072
            r0 = 12
            goto L_0x00b9
        L_0x0072:
            boolean r0 = r3 instanceof td.e
            if (r0 == 0) goto L_0x0079
            r0 = 13
            goto L_0x00b9
        L_0x0079:
            boolean r0 = r3 instanceof td.f
            if (r0 == 0) goto L_0x0080
            r0 = 14
            goto L_0x00b9
        L_0x0080:
            boolean r0 = r3 instanceof td.g
            if (r0 == 0) goto L_0x0087
            r0 = 15
            goto L_0x00b9
        L_0x0087:
            boolean r0 = r3 instanceof td.h
            if (r0 == 0) goto L_0x008e
            r0 = 16
            goto L_0x00b9
        L_0x008e:
            boolean r0 = r3 instanceof td.i
            if (r0 == 0) goto L_0x0095
            r0 = 17
            goto L_0x00b9
        L_0x0095:
            boolean r0 = r3 instanceof td.j
            if (r0 == 0) goto L_0x009c
            r0 = 18
            goto L_0x00b9
        L_0x009c:
            boolean r0 = r3 instanceof td.k
            if (r0 == 0) goto L_0x00a3
            r0 = 19
            goto L_0x00b9
        L_0x00a3:
            boolean r0 = r3 instanceof td.m
            if (r0 == 0) goto L_0x00aa
            r0 = 20
            goto L_0x00b9
        L_0x00aa:
            boolean r0 = r3 instanceof td.n
            if (r0 == 0) goto L_0x00b1
            r0 = 21
            goto L_0x00b9
        L_0x00b1:
            boolean r0 = r3 instanceof td.o
            if (r0 == 0) goto L_0x00b8
            r0 = 22
            goto L_0x00b9
        L_0x00b8:
            r0 = -1
        L_0x00b9:
            if (r0 != r4) goto L_0x00bc
            goto L_0x00bd
        L_0x00bc:
            r1 = 0
        L_0x00bd:
            if (r1 == 0) goto L_0x00c0
            goto L_0x00d6
        L_0x00c0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "kotlin.jvm.functions.Function"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            c(r3, r4)
            r3 = 0
            throw r3
        L_0x00d6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ud.x.b(java.lang.Object, int):java.lang.Object");
    }

    public static void c(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(q.b.a(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        k.i(classCastException, x.class.getName());
        throw classCastException;
    }
}

package k8;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class y6 extends a7 {

    /* renamed from: c  reason: collision with root package name */
    public static final Class<?> f20559c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public final void a(Object obj, long j10) {
        Object obj2;
        List list = (List) s8.j(obj, j10);
        if (list instanceof x6) {
            obj2 = ((x6) list).b();
        } else if (!f20559c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof t7) || !(list instanceof q6)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                q6 q6Var = (q6) list;
                if (q6Var.e()) {
                    q6Var.d();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        s8.f20465c.s(obj, j10, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: k8.w6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: k8.w6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: k8.w6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E> void b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.lang.Object r6 = k8.s8.j(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = k8.s8.j(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x003b
            boolean r2 = r1 instanceof k8.x6
            if (r2 == 0) goto L_0x0020
            k8.w6 r1 = new k8.w6
            r1.<init>((int) r0)
            goto L_0x0035
        L_0x0020:
            boolean r2 = r1 instanceof k8.t7
            if (r2 == 0) goto L_0x0030
            boolean r2 = r1 instanceof k8.q6
            if (r2 == 0) goto L_0x0030
            k8.q6 r1 = (k8.q6) r1
            k8.q6 r0 = r1.g(r0)
            r1 = r0
            goto L_0x0035
        L_0x0030:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0035:
            n3.d r0 = k8.s8.f20465c
            r0.s(r5, r7, r1)
            goto L_0x0097
        L_0x003b:
            java.lang.Class<?> r2 = f20559c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x005b
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
            n3.d r0 = k8.s8.f20465c
            r0.s(r5, r7, r2)
        L_0x0059:
            r1 = r2
            goto L_0x0097
        L_0x005b:
            boolean r2 = r1 instanceof k8.o8
            if (r2 == 0) goto L_0x0078
            k8.w6 r2 = new k8.w6
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            k8.o8 r1 = (k8.o8) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            n3.d r0 = k8.s8.f20465c
            r0.s(r5, r7, r2)
            goto L_0x0059
        L_0x0078:
            boolean r2 = r1 instanceof k8.t7
            if (r2 == 0) goto L_0x0097
            boolean r2 = r1 instanceof k8.q6
            if (r2 == 0) goto L_0x0097
            r2 = r1
            k8.q6 r2 = (k8.q6) r2
            boolean r3 = r2.e()
            if (r3 != 0) goto L_0x0097
            int r1 = r1.size()
            int r1 = r1 + r0
            k8.q6 r1 = r2.g(r1)
            n3.d r0 = k8.s8.f20465c
            r0.s(r5, r7, r1)
        L_0x0097:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L_0x00a6
            if (r2 <= 0) goto L_0x00a6
            r1.addAll(r6)
        L_0x00a6:
            if (r0 > 0) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            r6 = r1
        L_0x00aa:
            n3.d r0 = k8.s8.f20465c
            r0.s(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.y6.b(java.lang.Object, java.lang.Object, long):void");
    }
}

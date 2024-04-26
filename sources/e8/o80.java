package e8;

import com.google.android.gms.internal.ads.ji;
import com.google.android.gms.internal.ads.oq;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class o80 extends m80 {

    /* renamed from: c  reason: collision with root package name */
    public static final Class<?> f15748c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public o80(ji jiVar) {
        super((ji) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: e8.l80} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: e8.l80} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: e8.l80} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <L> java.util.List<L> d(java.lang.Object r3, long r4, int r6) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.oq.u(r3, r4)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002f
            boolean r1 = r0 instanceof e8.k80
            if (r1 == 0) goto L_0x0016
            e8.l80 r0 = new e8.l80
            r0.<init>((int) r6)
            goto L_0x002b
        L_0x0016:
            boolean r1 = r0 instanceof e8.h90
            if (r1 == 0) goto L_0x0026
            boolean r1 = r0 instanceof e8.c80
            if (r1 == 0) goto L_0x0026
            e8.c80 r0 = (e8.c80) r0
            e8.c80 r6 = r0.r(r6)
            r0 = r6
            goto L_0x002b
        L_0x0026:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x002b:
            com.google.android.gms.internal.ads.oq.e(r3, r4, r0)
            goto L_0x0085
        L_0x002f:
            java.lang.Class<?> r1 = f15748c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004d
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            com.google.android.gms.internal.ads.oq.e(r3, r4, r1)
        L_0x004b:
            r0 = r1
            goto L_0x0085
        L_0x004d:
            boolean r1 = r0 instanceof e8.aa0
            if (r1 == 0) goto L_0x0068
            e8.l80 r1 = new e8.l80
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            e8.aa0 r0 = (e8.aa0) r0
            int r6 = r1.size()
            r1.addAll(r6, r0)
            com.google.android.gms.internal.ads.oq.e(r3, r4, r1)
            goto L_0x004b
        L_0x0068:
            boolean r1 = r0 instanceof e8.h90
            if (r1 == 0) goto L_0x0085
            boolean r1 = r0 instanceof e8.c80
            if (r1 == 0) goto L_0x0085
            r1 = r0
            e8.c80 r1 = (e8.c80) r1
            boolean r2 = r1.k()
            if (r2 != 0) goto L_0x0085
            int r0 = r0.size()
            int r0 = r0 + r6
            e8.c80 r0 = r1.r(r0)
            com.google.android.gms.internal.ads.oq.e(r3, r4, r0)
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.o80.d(java.lang.Object, long, int):java.util.List");
    }

    public final <L> List<L> a(Object obj, long j10) {
        return d(obj, j10, 10);
    }

    public final <E> void b(Object obj, Object obj2, long j10) {
        List list = (List) oq.u(obj2, j10);
        List d10 = d(obj, j10, list.size());
        int size = d10.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d10.addAll(list);
        }
        if (size > 0) {
            list = d10;
        }
        oq.e(obj, j10, list);
    }

    public final void c(Object obj, long j10) {
        Object obj2;
        List list = (List) oq.u(obj, j10);
        if (list instanceof k80) {
            obj2 = ((k80) list).m();
        } else if (!f15748c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof h90) || !(list instanceof c80)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                c80 c80 = (c80) list;
                if (c80.k()) {
                    c80.t();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        oq.e(obj, j10, obj2);
    }
}

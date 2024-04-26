package k8;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class z6 extends a7 {
    public final void a(Object obj, long j10) {
        ((q6) s8.j(obj, j10)).d();
    }

    public final <E> void b(Object obj, Object obj2, long j10) {
        q6 q6Var = (q6) s8.j(obj, j10);
        q6 q6Var2 = (q6) s8.j(obj2, j10);
        int size = q6Var.size();
        int size2 = q6Var2.size();
        if (size > 0 && size2 > 0) {
            if (!q6Var.e()) {
                q6Var = q6Var.g(size2 + size);
            }
            q6Var.addAll(q6Var2);
        }
        if (size > 0) {
            q6Var2 = q6Var;
        }
        s8.f20465c.s(obj, j10, q6Var2);
    }
}

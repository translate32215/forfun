package ke;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import le.c;
import ve.f;
import ve.g;

/* compiled from: FormBody */
public final class p extends c0 {

    /* renamed from: c  reason: collision with root package name */
    public static final u f20770c = u.b("application/x-www-form-urlencoded");

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f20771a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f20772b;

    /* compiled from: FormBody */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f20773a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final List<String> f20774b = new ArrayList();
    }

    public p(List<String> list, List<String> list2) {
        this.f20771a = c.o(list);
        this.f20772b = c.o(list2);
    }

    public long a() {
        return d((g) null, true);
    }

    public u b() {
        return f20770c;
    }

    public void c(g gVar) throws IOException {
        d(gVar, false);
    }

    public final long d(@Nullable g gVar, boolean z10) {
        f fVar;
        if (z10) {
            fVar = new f();
        } else {
            fVar = gVar.c();
        }
        int size = this.f20771a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                fVar.q0(38);
            }
            fVar.w0(this.f20771a.get(i10));
            fVar.q0(61);
            fVar.w0(this.f20772b.get(i10));
        }
        if (!z10) {
            return 0;
        }
        long j10 = fVar.f26740b;
        fVar.a();
        return j10;
    }
}

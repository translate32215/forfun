package p6;

import h6.e;
import java.util.Collections;
import java.util.List;
import v6.a;

/* compiled from: Tx3gSubtitle */
public final class b implements e {

    /* renamed from: b  reason: collision with root package name */
    public static final b f23944b = new b();

    /* renamed from: a  reason: collision with root package name */
    public final List<h6.b> f23945a;

    public b(h6.b bVar) {
        this.f23945a = Collections.singletonList(bVar);
    }

    public int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    public long b(int i10) {
        a.a(i10 == 0);
        return 0;
    }

    public List<h6.b> c(long j10) {
        return j10 >= 0 ? this.f23945a : Collections.emptyList();
    }

    public int f() {
        return 1;
    }

    public b() {
        this.f23945a = Collections.emptyList();
    }
}

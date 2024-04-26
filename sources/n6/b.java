package n6;

import h6.e;
import java.util.Collections;
import java.util.List;
import v6.a;
import v6.e0;

/* compiled from: SubripSubtitle */
public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public final h6.b[] f22343a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f22344b;

    public b(h6.b[] bVarArr, long[] jArr) {
        this.f22343a = bVarArr;
        this.f22344b = jArr;
    }

    public int a(long j10) {
        int b10 = e0.b(this.f22344b, j10, false, false);
        if (b10 < this.f22344b.length) {
            return b10;
        }
        return -1;
    }

    public long b(int i10) {
        boolean z10 = true;
        a.a(i10 >= 0);
        if (i10 >= this.f22344b.length) {
            z10 = false;
        }
        a.a(z10);
        return this.f22344b[i10];
    }

    public List<h6.b> c(long j10) {
        int f10 = e0.f(this.f22344b, j10, true, false);
        if (f10 != -1) {
            h6.b[] bVarArr = this.f22343a;
            if (bVarArr[f10] != h6.b.f18921q) {
                return Collections.singletonList(bVarArr[f10]);
            }
        }
        return Collections.emptyList();
    }

    public int f() {
        return this.f22344b.length;
    }
}

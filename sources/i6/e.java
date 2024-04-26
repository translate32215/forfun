package i6;

import h6.b;
import java.util.Collections;
import java.util.List;
import v6.a;

/* compiled from: CeaSubtitle */
public final class e implements h6.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f19322a;

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f19323b;

    public e(List list, int i10) {
        this.f19322a = i10;
        if (i10 == 1) {
            this.f19323b = list;
        } else if (i10 != 2) {
            this.f19323b = list;
        } else {
            this.f19323b = Collections.unmodifiableList(list);
        }
    }

    public int a(long j10) {
        switch (this.f19322a) {
            case 0:
                return j10 < 0 ? 0 : -1;
            case 1:
                return -1;
            default:
                return j10 < 0 ? 0 : -1;
        }
    }

    public long b(int i10) {
        boolean z10 = false;
        switch (this.f19322a) {
            case 0:
                if (i10 == 0) {
                    z10 = true;
                }
                a.a(z10);
                return 0;
            case 1:
                return 0;
            default:
                if (i10 == 0) {
                    z10 = true;
                }
                a.a(z10);
                return 0;
        }
    }

    public List c(long j10) {
        switch (this.f19322a) {
            case 0:
                return j10 >= 0 ? this.f19323b : Collections.emptyList();
            case 1:
                return this.f19323b;
            default:
                return j10 >= 0 ? this.f19323b : Collections.emptyList();
        }
    }

    public int f() {
        return 1;
    }
}

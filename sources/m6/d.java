package m6;

import h6.b;
import h6.e;
import java.util.Collections;
import java.util.List;
import v6.a;
import v6.e0;

/* compiled from: SsaSubtitle */
public final class d implements e {

    /* renamed from: a  reason: collision with root package name */
    public final List<List<b>> f21750a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Long> f21751b;

    public d(List<List<b>> list, List<Long> list2) {
        this.f21750a = list;
        this.f21751b = list2;
    }

    public int a(long j10) {
        int i10;
        List<Long> list = this.f21751b;
        Long valueOf = Long.valueOf(j10);
        int i11 = e0.f26436a;
        int binarySearch = Collections.binarySearch(list, valueOf);
        if (binarySearch < 0) {
            i10 = binarySearch ^ -1;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size || list.get(binarySearch).compareTo(valueOf) != 0) {
                    i10 = binarySearch;
                }
                binarySearch++;
                break;
            } while (list.get(binarySearch).compareTo(valueOf) != 0);
            i10 = binarySearch;
        }
        if (i10 < this.f21751b.size()) {
            return i10;
        }
        return -1;
    }

    public long b(int i10) {
        boolean z10 = true;
        a.a(i10 >= 0);
        if (i10 >= this.f21751b.size()) {
            z10 = false;
        }
        a.a(z10);
        return this.f21751b.get(i10).longValue();
    }

    public List<b> c(long j10) {
        int c10 = e0.c(this.f21751b, Long.valueOf(j10), true, false);
        if (c10 == -1) {
            return Collections.emptyList();
        }
        return this.f21750a.get(c10);
    }

    public int f() {
        return this.f21751b.size();
    }
}

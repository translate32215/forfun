package q6;

import h6.b;
import h6.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import v6.a;
import v6.e0;

/* compiled from: WebvttSubtitle */
public final class j implements e {

    /* renamed from: a  reason: collision with root package name */
    public final List<d> f24212a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f24213b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f24214c;

    public j(List<d> list) {
        this.f24212a = Collections.unmodifiableList(new ArrayList(list));
        this.f24213b = new long[(list.size() * 2)];
        for (int i10 = 0; i10 < list.size(); i10++) {
            d dVar = list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f24213b;
            jArr[i11] = dVar.f24181b;
            jArr[i11 + 1] = dVar.f24182c;
        }
        long[] jArr2 = this.f24213b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f24214c = copyOf;
        Arrays.sort(copyOf);
    }

    public int a(long j10) {
        int b10 = e0.b(this.f24214c, j10, false, false);
        if (b10 < this.f24214c.length) {
            return b10;
        }
        return -1;
    }

    public long b(int i10) {
        boolean z10 = true;
        a.a(i10 >= 0);
        if (i10 >= this.f24214c.length) {
            z10 = false;
        }
        a.a(z10);
        return this.f24214c[i10];
    }

    public List<b> c(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f24212a.size(); i10++) {
            long[] jArr = this.f24213b;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                d dVar = this.f24212a.get(i10);
                b bVar = dVar.f24180a;
                if (bVar.f18925d == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, i.f24211a);
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            b.C0156b a10 = ((d) arrayList2.get(i12)).f24180a.a();
            a10.f18941d = (float) (-1 - i12);
            a10.f18942e = 1;
            arrayList.add(a10.a());
        }
        return arrayList;
    }

    public int f() {
        return this.f24214c.length;
    }
}

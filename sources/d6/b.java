package d6;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import x4.f;
import y5.a;
import y5.c;

/* compiled from: DashManifest */
public class b implements a<b> {

    /* renamed from: a  reason: collision with root package name */
    public final long f13077a;

    /* renamed from: b  reason: collision with root package name */
    public final long f13078b;

    /* renamed from: c  reason: collision with root package name */
    public final long f13079c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f13080d;

    /* renamed from: e  reason: collision with root package name */
    public final long f13081e;

    /* renamed from: f  reason: collision with root package name */
    public final long f13082f;

    /* renamed from: g  reason: collision with root package name */
    public final long f13083g;

    /* renamed from: h  reason: collision with root package name */
    public final long f13084h;

    /* renamed from: i  reason: collision with root package name */
    public final m f13085i;

    /* renamed from: j  reason: collision with root package name */
    public final k f13086j;

    /* renamed from: k  reason: collision with root package name */
    public final Uri f13087k;

    /* renamed from: l  reason: collision with root package name */
    public final g f13088l;

    /* renamed from: m  reason: collision with root package name */
    public final List<f> f13089m;

    public b(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, g gVar, m mVar, k kVar, Uri uri, List<f> list) {
        this.f13077a = j10;
        this.f13078b = j11;
        this.f13079c = j12;
        this.f13080d = z10;
        this.f13081e = j13;
        this.f13082f = j14;
        this.f13083g = j15;
        this.f13084h = j16;
        this.f13088l = gVar;
        this.f13085i = mVar;
        this.f13087k = uri;
        this.f13086j = kVar;
        this.f13089m = list == null ? Collections.emptyList() : list;
    }

    public Object a(List list) {
        long j10;
        b bVar = this;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new c(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j11 = 0;
        int i10 = 0;
        while (true) {
            j10 = -9223372036854775807L;
            if (i10 >= c()) {
                break;
            }
            if (((c) linkedList.peek()).f28103a != i10) {
                long d10 = bVar.d(i10);
                if (d10 != -9223372036854775807L) {
                    j11 += d10;
                }
            } else {
                f b10 = bVar.b(i10);
                List<a> list2 = b10.f13111c;
                c cVar = (c) linkedList.poll();
                int i11 = cVar.f28103a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = cVar.f28104b;
                    a aVar = list2.get(i12);
                    List<i> list3 = aVar.f13073c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add(list3.get(cVar.f28105c));
                        cVar = (c) linkedList.poll();
                        if (!(cVar.f28103a == i11 && cVar.f28104b == i12)) {
                            List<a> list4 = list2;
                            arrayList2.add(new a(aVar.f13071a, aVar.f13072b, arrayList3, aVar.f13074d, aVar.f13075e, aVar.f13076f));
                        }
                        arrayList3.add(list3.get(cVar.f28105c));
                        cVar = (c) linkedList.poll();
                        break;
                    } while (cVar.f28104b == i12);
                    List<a> list42 = list2;
                    arrayList2.add(new a(aVar.f13071a, aVar.f13072b, arrayList3, aVar.f13074d, aVar.f13075e, aVar.f13076f));
                    if (cVar.f28103a != i11) {
                        break;
                    }
                    list2 = list42;
                }
                linkedList.addFirst(cVar);
                arrayList.add(new f(b10.f13109a, b10.f13110b - j11, arrayList2, b10.f13112d));
            }
            i10++;
            bVar = this;
        }
        long j12 = bVar.f13078b;
        if (j12 != -9223372036854775807L) {
            j10 = j12 - j11;
        }
        return new b(bVar.f13077a, j10, bVar.f13079c, bVar.f13080d, bVar.f13081e, bVar.f13082f, bVar.f13083g, bVar.f13084h, bVar.f13088l, bVar.f13085i, bVar.f13086j, bVar.f13087k, arrayList);
    }

    public final f b(int i10) {
        return this.f13089m.get(i10);
    }

    public final int c() {
        return this.f13089m.size();
    }

    public final long d(int i10) {
        long j10;
        if (i10 == this.f13089m.size() - 1) {
            long j11 = this.f13078b;
            if (j11 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j10 = j11 - this.f13089m.get(i10).f13110b;
        } else {
            j10 = this.f13089m.get(i10 + 1).f13110b - this.f13089m.get(i10).f13110b;
        }
        return j10;
    }

    public final long e(int i10) {
        return f.b(d(i10));
    }
}

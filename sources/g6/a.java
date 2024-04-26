package g6;

import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import k5.n;
import v6.e0;
import x4.b0;
import y5.c;

/* compiled from: SsManifest */
public class a implements y5.a<a> {

    /* renamed from: a  reason: collision with root package name */
    public final int f18502a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18503b;

    /* renamed from: c  reason: collision with root package name */
    public final int f18504c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f18505d;

    /* renamed from: e  reason: collision with root package name */
    public final C0145a f18506e;

    /* renamed from: f  reason: collision with root package name */
    public final b[] f18507f;

    /* renamed from: g  reason: collision with root package name */
    public final long f18508g;

    /* renamed from: h  reason: collision with root package name */
    public final long f18509h;

    /* renamed from: g6.a$a  reason: collision with other inner class name */
    /* compiled from: SsManifest */
    public static class C0145a {

        /* renamed from: a  reason: collision with root package name */
        public final UUID f18510a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f18511b;

        /* renamed from: c  reason: collision with root package name */
        public final n[] f18512c;

        public C0145a(UUID uuid, byte[] bArr, n[] nVarArr) {
            this.f18510a = uuid;
            this.f18511b = bArr;
            this.f18512c = nVarArr;
        }
    }

    /* compiled from: SsManifest */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f18513a;

        /* renamed from: b  reason: collision with root package name */
        public final String f18514b;

        /* renamed from: c  reason: collision with root package name */
        public final long f18515c;

        /* renamed from: d  reason: collision with root package name */
        public final String f18516d;

        /* renamed from: e  reason: collision with root package name */
        public final int f18517e;

        /* renamed from: f  reason: collision with root package name */
        public final int f18518f;

        /* renamed from: g  reason: collision with root package name */
        public final int f18519g;

        /* renamed from: h  reason: collision with root package name */
        public final int f18520h;

        /* renamed from: i  reason: collision with root package name */
        public final String f18521i;

        /* renamed from: j  reason: collision with root package name */
        public final b0[] f18522j;

        /* renamed from: k  reason: collision with root package name */
        public final int f18523k;

        /* renamed from: l  reason: collision with root package name */
        public final String f18524l;

        /* renamed from: m  reason: collision with root package name */
        public final String f18525m;

        /* renamed from: n  reason: collision with root package name */
        public final List<Long> f18526n;

        /* renamed from: o  reason: collision with root package name */
        public final long[] f18527o;

        /* renamed from: p  reason: collision with root package name */
        public final long f18528p;

        public b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, Format[] formatArr, List<Long> list, long[] jArr, long j11) {
            this.f18524l = str;
            this.f18525m = str2;
            this.f18513a = i10;
            this.f18514b = str3;
            this.f18515c = j10;
            this.f18516d = str4;
            this.f18517e = i11;
            this.f18518f = i12;
            this.f18519g = i13;
            this.f18520h = i14;
            this.f18521i = str5;
            this.f18522j = formatArr;
            this.f18526n = list;
            this.f18527o = jArr;
            this.f18528p = j11;
            this.f18523k = list.size();
        }

        public b a(b0[] b0VarArr) {
            String str = this.f18524l;
            return new b(str, this.f18525m, this.f18513a, this.f18514b, this.f18515c, this.f18516d, this.f18517e, this.f18518f, this.f18519g, this.f18520h, this.f18521i, b0VarArr, this.f18526n, this.f18527o, this.f18528p);
        }

        public long b(int i10) {
            if (i10 == this.f18523k - 1) {
                return this.f18528p;
            }
            long[] jArr = this.f18527o;
            return jArr[i10 + 1] - jArr[i10];
        }

        public int c(long j10) {
            return e0.f(this.f18527o, j10, true, true);
        }
    }

    public a(int i10, int i11, long j10, long j11, long j12, int i12, boolean z10, C0145a aVar, b[] bVarArr) {
        long j13 = -9223372036854775807L;
        long P = j11 == 0 ? -9223372036854775807L : e0.P(j11, 1000000, j10);
        j13 = j12 != 0 ? e0.P(j12, 1000000, j10) : j13;
        this.f18502a = i10;
        this.f18503b = i11;
        this.f18508g = P;
        this.f18509h = j13;
        this.f18504c = i12;
        this.f18505d = z10;
        this.f18506e = aVar;
        this.f18507f = bVarArr;
    }

    public Object a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            c cVar = (c) arrayList.get(i10);
            b bVar2 = this.f18507f[cVar.f28104b];
            if (!(bVar2 == bVar || bVar == null)) {
                arrayList2.add(bVar.a((b0[]) arrayList3.toArray(new b0[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f18522j[cVar.f28105c]);
            i10++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.a((b0[]) arrayList3.toArray(new b0[0])));
        }
        return new a(this.f18502a, this.f18503b, this.f18508g, this.f18509h, this.f18504c, this.f18505d, this.f18506e, (b[]) arrayList2.toArray(new b[0]));
    }

    public a(int i10, int i11, long j10, long j11, int i12, boolean z10, C0145a aVar, b[] bVarArr) {
        this.f18502a = i10;
        this.f18503b = i11;
        this.f18508g = j10;
        this.f18509h = j11;
        this.f18504c = i12;
        this.f18505d = z10;
        this.f18506e = aVar;
        this.f18507f = bVarArr;
    }
}

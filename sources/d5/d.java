package d5;

import android.support.v4.media.a;
import d5.x;
import java.util.Arrays;
import v6.e0;

/* compiled from: ChunkIndex */
public final class d implements x {

    /* renamed from: a  reason: collision with root package name */
    public final int f13014a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f13015b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f13016c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f13017d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f13018e;

    /* renamed from: f  reason: collision with root package name */
    public final long f13019f;

    public d(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f13015b = iArr;
        this.f13016c = jArr;
        this.f13017d = jArr2;
        this.f13018e = jArr3;
        int length = iArr.length;
        this.f13014a = length;
        if (length > 0) {
            this.f13019f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f13019f = 0;
        }
    }

    public boolean b() {
        return true;
    }

    public long c() {
        return this.f13019f;
    }

    public x.a j(long j10) {
        int f10 = e0.f(this.f13018e, j10, true, true);
        long[] jArr = this.f13018e;
        long j11 = jArr[f10];
        long[] jArr2 = this.f13016c;
        y yVar = new y(j11, jArr2[f10]);
        if (j11 >= j10 || f10 == this.f13014a - 1) {
            return new x.a(yVar);
        }
        int i10 = f10 + 1;
        return new x.a(yVar, new y(jArr[i10], jArr2[i10]));
    }

    public String toString() {
        StringBuilder a10 = a.a("ChunkIndex(length=");
        a10.append(this.f13014a);
        a10.append(", sizes=");
        a10.append(Arrays.toString(this.f13015b));
        a10.append(", offsets=");
        a10.append(Arrays.toString(this.f13016c));
        a10.append(", timeUs=");
        a10.append(Arrays.toString(this.f13018e));
        a10.append(", durationsUs=");
        a10.append(Arrays.toString(this.f13017d));
        a10.append(")");
        return a10.toString();
    }
}

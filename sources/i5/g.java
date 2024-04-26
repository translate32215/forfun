package i5;

import d5.j;
import java.io.IOException;

/* compiled from: VarintReader */
public final class g {

    /* renamed from: d  reason: collision with root package name */
    public static final long[] f19234d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f19235a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    public int f19236b;

    /* renamed from: c  reason: collision with root package name */
    public int f19237c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= f19234d[i10 - 1] ^ -1;
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public static int b(int i10) {
        int i11 = 0;
        while (true) {
            long[] jArr = f19234d;
            if (i11 >= jArr.length) {
                return -1;
            }
            if ((jArr[i11] & ((long) i10)) != 0) {
                return i11 + 1;
            }
            i11++;
        }
    }

    public long c(j jVar, boolean z10, boolean z11, int i10) throws IOException {
        if (this.f19236b == 0) {
            if (!jVar.d(this.f19235a, 0, 1, z10)) {
                return -1;
            }
            int b10 = b(this.f19235a[0] & 255);
            this.f19237c = b10;
            if (b10 != -1) {
                this.f19236b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i11 = this.f19237c;
        if (i11 > i10) {
            this.f19236b = 0;
            return -2;
        }
        if (i11 != 1) {
            jVar.readFully(this.f19235a, 1, i11 - 1);
        }
        this.f19236b = 0;
        return a(this.f19235a, this.f19237c, z11);
    }
}

package l5;

import java.util.Arrays;
import java.util.List;
import l5.h;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import v6.v;
import x4.b0;

/* compiled from: OpusReader */
public final class g extends h {

    /* renamed from: o  reason: collision with root package name */
    public static final byte[] f21074o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n  reason: collision with root package name */
    public boolean f21075n;

    public long c(v vVar) {
        byte[] bArr = vVar.f26518a;
        byte b10 = bArr[0] & 255;
        byte b11 = b10 & 3;
        byte b12 = 2;
        if (b11 == 0) {
            b12 = 1;
        } else if (!(b11 == 1 || b11 == 2)) {
            b12 = bArr[1] & 63;
        }
        int i10 = b10 >> 3;
        int i11 = i10 & 3;
        return a(((long) b12) * ((long) (i10 >= 16 ? 2500 << i11 : i10 >= 12 ? 10000 << (i11 & 1) : i11 == 3 ? 60000 : 10000 << i11)));
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public boolean d(v vVar, long j10, h.b bVar) {
        boolean z10 = true;
        if (!this.f21075n) {
            byte[] copyOf = Arrays.copyOf(vVar.f26518a, vVar.f26520c);
            List<byte[]> a10 = q.h.a(copyOf);
            b0.b bVar2 = new b0.b();
            bVar2.f27425k = "audio/opus";
            bVar2.f27438x = copyOf[9] & 255;
            bVar2.f27439y = 48000;
            bVar2.f27427m = a10;
            bVar.f21089a = bVar2.a();
            this.f21075n = true;
            return true;
        }
        bVar.f21089a.getClass();
        if (vVar.f() != 1332770163) {
            z10 = false;
        }
        vVar.D(0);
        return z10;
    }

    public void e(boolean z10) {
        super.e(z10);
        if (z10) {
            this.f21075n = false;
        }
    }
}

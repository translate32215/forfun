package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import le.c;
import ve.m;
import ve.p;
import ve.t;

public final class PublicSuffixDatabase {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f23721e = {42};

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f23722f = new String[0];

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f23723g = {"*"};

    /* renamed from: h  reason: collision with root package name */
    public static final PublicSuffixDatabase f23724h = new PublicSuffixDatabase();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f23725a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final CountDownLatch f23726b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    public byte[] f23727c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f23728d;

    public static String a(byte[] bArr, byte[][] bArr2, int i10) {
        int i11;
        boolean z10;
        byte b10;
        int i12;
        byte[] bArr3 = bArr;
        byte[][] bArr4 = bArr2;
        int length = bArr3.length;
        int i13 = 0;
        while (i13 < length) {
            int i14 = (i13 + length) / 2;
            while (i14 > -1 && bArr3[i14] != 10) {
                i14--;
            }
            int i15 = i14 + 1;
            int i16 = 1;
            while (true) {
                i11 = i15 + i16;
                if (bArr3[i11] == 10) {
                    break;
                }
                i16++;
            }
            int i17 = i11 - i15;
            int i18 = i10;
            boolean z11 = false;
            int i19 = 0;
            int i20 = 0;
            while (true) {
                if (z11) {
                    b10 = 46;
                    z10 = false;
                } else {
                    z10 = z11;
                    b10 = bArr4[i18][i19] & 255;
                }
                i12 = b10 - (bArr3[i15 + i20] & 255);
                if (i12 == 0) {
                    i20++;
                    i19++;
                    if (i20 == i17) {
                        break;
                    } else if (bArr4[i18].length != i19) {
                        z11 = z10;
                    } else if (i18 == bArr4.length - 1) {
                        break;
                    } else {
                        i18++;
                        z11 = true;
                        i19 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i12 >= 0) {
                if (i12 <= 0) {
                    int i21 = i17 - i20;
                    int length2 = bArr4[i18].length - i19;
                    while (true) {
                        i18++;
                        if (i18 >= bArr4.length) {
                            break;
                        }
                        length2 += bArr4[i18].length;
                    }
                    if (length2 >= i21) {
                        if (length2 <= i21) {
                            return new String(bArr3, i15, i17, c.f21269i);
                        }
                    }
                }
                i13 = i11 + 1;
            }
            length = i15 - 1;
        }
        return null;
    }

    public final void b() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream != null) {
            t tVar = new t(new m(p.c(resourceAsStream)));
            try {
                byte[] bArr = new byte[tVar.readInt()];
                tVar.d(bArr);
                byte[] bArr2 = new byte[tVar.readInt()];
                tVar.d(bArr2);
                synchronized (this) {
                    this.f23727c = bArr;
                    this.f23728d = bArr2;
                }
                this.f23726b.countDown();
            } finally {
                c.e(tVar);
            }
        }
    }
}

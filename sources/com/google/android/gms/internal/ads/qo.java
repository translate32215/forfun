package com.google.android.gms.internal.ads;

import e8.r60;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class qo implements ep {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f7982c = j(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: a  reason: collision with root package name */
    public int[] f7983a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7984b;

    public qo(byte[] bArr, int i10) throws InvalidKeyException {
        if (bArr.length == 32) {
            this.f7983a = j(bArr);
            this.f7984b = i10;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    public static int b(int i10, int i11) {
        return (i10 >>> (-i11)) | (i10 << i11);
    }

    public static void d(int[] iArr, int i10, int i11, int i12, int i13) {
        iArr[i10] = iArr[i10] + iArr[i11];
        iArr[i13] = b(iArr[i13] ^ iArr[i10], 16);
        iArr[i12] = iArr[i12] + iArr[i13];
        iArr[i11] = b(iArr[i11] ^ iArr[i12], 12);
        iArr[i10] = iArr[i10] + iArr[i11];
        iArr[i13] = b(iArr[i10] ^ iArr[i13], 8);
        iArr[i12] = iArr[i12] + iArr[i13];
        iArr[i11] = b(iArr[i11] ^ iArr[i12], 7);
    }

    public static void e(int[] iArr, int[] iArr2) {
        int[] iArr3 = f7982c;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    public static void h(int[] iArr) {
        int[] iArr2 = iArr;
        for (int i10 = 0; i10 < 10; i10++) {
            d(iArr2, 0, 4, 8, 12);
            d(iArr2, 1, 5, 9, 13);
            d(iArr2, 2, 6, 10, 14);
            d(iArr2, 3, 7, 11, 15);
            d(iArr2, 0, 5, 10, 15);
            d(iArr2, 1, 6, 11, 12);
            d(iArr2, 2, 7, 8, 13);
            d(iArr2, 3, 4, 9, 14);
        }
    }

    public static int[] j(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length <= Integer.MAX_VALUE - g()) {
            ByteBuffer allocate = ByteBuffer.allocate(g() + bArr.length);
            c(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public final void c(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
        if (byteBuffer.remaining() - g() >= bArr.length) {
            byte[] a10 = r60.a(g());
            byteBuffer.put(a10);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int remaining = wrap.remaining();
            int i10 = (remaining / 64) + 1;
            for (int i11 = 0; i11 < i10; i11++) {
                ByteBuffer i12 = i(a10, this.f7984b + i11);
                if (i11 == i10 - 1) {
                    g.a(byteBuffer, wrap, i12, remaining % 64);
                } else {
                    g.a(byteBuffer, wrap, i12, 64);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    public abstract int[] f(int[] iArr, int i10);

    public abstract int g();

    public final ByteBuffer i(byte[] bArr, int i10) {
        int[] f10 = f(j(bArr), i10);
        int[] iArr = (int[]) f10.clone();
        h(iArr);
        for (int i11 = 0; i11 < f10.length; i11++) {
            f10[i11] = f10[i11] + iArr[i11];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(f10, 0, 16);
        return order;
    }
}

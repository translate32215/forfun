package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class ro implements mi {

    /* renamed from: a  reason: collision with root package name */
    public final qo f8044a;

    /* renamed from: b  reason: collision with root package name */
    public final qo f8045b;

    public ro(byte[] bArr) throws InvalidKeyException {
        this.f8044a = b(bArr, 1);
        this.f8045b = b(bArr, 0);
    }

    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = bArr;
        if (bArr3.length <= (Integer.MAX_VALUE - this.f8044a.g()) - 16) {
            ByteBuffer allocate = ByteBuffer.allocate(this.f8044a.g() + bArr3.length + 16);
            if (allocate.remaining() >= this.f8044a.g() + bArr3.length + 16) {
                int position = allocate.position();
                this.f8044a.c(allocate, bArr3);
                allocate.position(position);
                byte[] bArr4 = new byte[this.f8044a.g()];
                allocate.get(bArr4);
                allocate.limit(allocate.limit() - 16);
                byte b10 = 0;
                byte[] bArr5 = bArr2 == null ? new byte[0] : bArr2;
                byte[] bArr6 = new byte[32];
                this.f8045b.i(bArr4, 0).get(bArr6);
                int length = bArr5.length % 16 == 0 ? bArr5.length : (bArr5.length + 16) - (bArr5.length % 16);
                int remaining = allocate.remaining();
                int i10 = remaining % 16;
                int i11 = (i10 == 0 ? remaining : (remaining + 16) - i10) + length;
                ByteBuffer order = ByteBuffer.allocate(i11 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr5);
                order.position(length);
                order.put(allocate);
                order.position(i11);
                order.putLong((long) bArr5.length);
                order.putLong((long) remaining);
                byte[] array = order.array();
                long M = (e.M(bArr6, 0) >> 0) & 67108863 & 67108863;
                long M2 = (e.M(bArr6, 3) >> 2) & 67108863 & 67108611;
                long M3 = (e.M(bArr6, 6) >> 4) & 67108863 & 67092735;
                long M4 = (e.M(bArr6, 9) >> 6) & 67108863 & 66076671;
                long M5 = (e.M(bArr6, 12) >> 8) & 67108863 & 1048575;
                long j10 = M2 * 5;
                long j11 = M3 * 5;
                long j12 = M4 * 5;
                long j13 = M5 * 5;
                int i12 = 17;
                byte[] bArr7 = new byte[17];
                long j14 = 0;
                long j15 = 0;
                long j16 = 0;
                long j17 = 0;
                long j18 = 0;
                int i13 = 0;
                while (i13 < array.length) {
                    int min = Math.min(16, array.length - i13);
                    System.arraycopy(array, i13, bArr7, b10, min);
                    bArr7[min] = 1;
                    if (min != 16) {
                        Arrays.fill(bArr7, min + 1, i12, b10);
                    }
                    long M6 = j18 + ((e.M(bArr7, b10) >> b10) & 67108863);
                    long M7 = j14 + ((e.M(bArr7, 3) >> 2) & 67108863);
                    long M8 = j15 + ((e.M(bArr7, 6) >> 4) & 67108863);
                    long M9 = j16 + ((e.M(bArr7, 9) >> 6) & 67108863);
                    long M10 = j17 + (((e.M(bArr7, 12) >> 8) & 67108863) | ((long) (bArr7[16] << 24)));
                    long j19 = (M10 * j10) + (M9 * j11) + (M8 * j12) + (M7 * j13) + (M6 * M);
                    long j20 = (M10 * j11) + (M9 * j12) + (M8 * j13) + (M7 * M) + (M6 * M2) + (j19 >> 26);
                    long j21 = (M10 * j12) + (M9 * j13) + (M8 * M) + (M7 * M2) + (M6 * M3) + (j20 >> 26);
                    long j22 = (M10 * j13) + (M9 * M) + (M8 * M2) + (M7 * M3) + (M6 * M4) + (j21 >> 26);
                    long j23 = (M10 * M) + (M9 * M2) + (M8 * M3) + (M7 * M4) + (M6 * M5) + (j22 >> 26);
                    long j24 = j23 >> 26;
                    j17 = j23 & 67108863;
                    long j25 = (j24 * 5) + (j19 & 67108863);
                    i13 += 16;
                    j15 = j21 & 67108863;
                    j16 = j22 & 67108863;
                    i12 = 17;
                    j18 = j25 & 67108863;
                    j14 = (j20 & 67108863) + (j25 >> 26);
                    b10 = 0;
                }
                long j26 = j15 + (j14 >> 26);
                long j27 = j26 & 67108863;
                long j28 = j16 + (j26 >> 26);
                long j29 = j28 & 67108863;
                long j30 = j17 + (j28 >> 26);
                long j31 = j30 & 67108863;
                long j32 = ((j30 >> 26) * 5) + j18;
                long j33 = j32 >> 26;
                long j34 = j32 & 67108863;
                long j35 = (j14 & 67108863) + j33;
                long j36 = j34 + 5;
                long j37 = j36 & 67108863;
                long j38 = j35 + (j36 >> 26);
                long j39 = j27 + (j38 >> 26);
                long j40 = j29 + (j39 >> 26);
                long j41 = (j31 + (j40 >> 26)) - 67108864;
                long j42 = j41 >> 63;
                long j43 = j34 & j42;
                long j44 = j35 & j42;
                long j45 = j27 & j42;
                long j46 = j29 & j42;
                long j47 = j31 & j42;
                long j48 = j42 ^ -1;
                long j49 = j44 | (j38 & 67108863 & j48);
                long j50 = j45 | (j39 & 67108863 & j48);
                long j51 = (j40 & 67108863 & j48) | j46;
                long j52 = (j41 & j48) | j47;
                long M11 = e.M(bArr6, 16) + ((j43 | (j37 & j48) | (j49 << 26)) & 4294967295L);
                long j53 = M11 & 4294967295L;
                long M12 = e.M(bArr6, 20) + (((j49 >> 6) | (j50 << 20)) & 4294967295L) + (M11 >> 32);
                long M13 = e.M(bArr6, 24) + (((j50 >> 12) | (j51 << 14)) & 4294967295L) + (M12 >> 32);
                long M14 = e.M(bArr6, 28);
                byte[] bArr8 = new byte[16];
                e.w(bArr8, j53, 0);
                e.w(bArr8, M12 & 4294967295L, 4);
                e.w(bArr8, M13 & 4294967295L, 8);
                e.w(bArr8, (M14 + (((j51 >> 18) | (j52 << 8)) & 4294967295L) + (M13 >> 32)) & 4294967295L, 12);
                allocate.limit(allocate.limit() + 16);
                allocate.put(bArr8);
                return allocate.array();
            }
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public abstract qo b(byte[] bArr, int i10) throws InvalidKeyException;
}

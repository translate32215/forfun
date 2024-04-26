package com.startapp;

import java.nio.ByteBuffer;
import java.util.Random;

/* compiled from: Sta */
public class b4 {

    /* renamed from: b  reason: collision with root package name */
    private static final int f10102b = 65507;

    /* renamed from: c  reason: collision with root package name */
    public static final byte f10103c = 8;

    /* renamed from: d  reason: collision with root package name */
    public static final byte f10104d = Byte.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    private static final byte f10105e = 0;

    /* renamed from: f  reason: collision with root package name */
    public static final int f10106f = 8;

    /* renamed from: a  reason: collision with root package name */
    private final byte f10107a;

    public b4(byte b10) {
        this.f10107a = b10;
    }

    public ByteBuffer a(short s10, short s11, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        } else if (bArr.length > f10102b) {
            bArr = a(f10102b);
        }
        int length = bArr.length + 8;
        byte[] bArr2 = new byte[length];
        ByteBuffer wrap = ByteBuffer.wrap(bArr2);
        wrap.put(this.f10107a);
        wrap.put(f10105e);
        int position = wrap.position();
        wrap.position(position + 2);
        wrap.putShort(s11);
        wrap.putShort(s10);
        wrap.put(bArr);
        wrap.putShort(position, a(bArr2, length));
        wrap.flip();
        return wrap;
    }

    private static short a(byte[] bArr, int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12 += 2) {
            int i13 = i11 + ((bArr[i12] & 255) << 8);
            i11 = (i13 >> 16) + (65535 & i13);
        }
        for (int i14 = 1; i14 < i10; i14 += 2) {
            int i15 = i11 + (bArr[i14] & 255);
            i11 = (i15 >> 16) + (i15 & 65535);
        }
        return (short) (((i11 & 65535) + (i11 >> 16)) ^ 65535);
    }

    public static byte[] a(int i10) {
        byte[] bArr = new byte[i10];
        new Random().nextBytes(bArr);
        return bArr;
    }
}

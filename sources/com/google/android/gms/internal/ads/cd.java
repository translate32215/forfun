package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ma;
import com.google.android.gms.internal.ads.ra;
import e8.ax;
import e8.cw;
import e8.t;
import e8.ti0;
import e8.vx;
import e8.w60;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class cd {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f6113a = false;

    /* renamed from: b  reason: collision with root package name */
    public static MessageDigest f6114b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f6115c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final Object f6116d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static CountDownLatch f6117e = new CountDownLatch(1);

    public static byte[] a(byte[] bArr, String str, boolean z10) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] bArr2;
        int i10 = z10 ? 239 : 255;
        if (bArr.length > i10) {
            ma.a V = ma.V();
            V.q((long) 4096);
            bArr = ((ma) ((aq) V.j())).f();
        }
        if (bArr.length < i10) {
            byte[] bArr3 = new byte[(i10 - bArr.length)];
            new SecureRandom().nextBytes(bArr3);
            bArr2 = ByteBuffer.allocate(i10 + 1).put((byte) bArr.length).put(bArr).put(bArr3).array();
        } else {
            bArr2 = ByteBuffer.allocate(i10 + 1).put((byte) bArr.length).put(bArr).array();
        }
        if (z10) {
            bArr2 = ByteBuffer.allocate(256).put(b(bArr2)).put(bArr2).array();
        }
        byte[] bArr4 = new byte[256];
        for (vx a10 : new ax().G2) {
            a10.a(bArr2, bArr4);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            w60 w60 = new w60(str.getBytes("UTF-8"), 0);
            int i11 = w60.f17221b;
            int i12 = w60.f17222c;
            for (int i13 = 0; i13 < 256; i13++) {
                i11 = (i11 + 1) & 255;
                byte[] bArr5 = w60.f17220a;
                i12 = (i12 + bArr5[i11]) & 255;
                byte b10 = bArr5[i11];
                bArr5[i11] = bArr5[i12];
                bArr5[i12] = b10;
                bArr4[i13] = (byte) (bArr5[(bArr5[i11] + bArr5[i12]) & 255] ^ bArr4[i13]);
            }
            w60.f17221b = i11;
            w60.f17222c = i12;
        }
        return bArr4;
    }

    public static byte[] b(byte[] bArr) throws NoSuchAlgorithmException {
        boolean z10;
        byte[] digest;
        synchronized (f6115c) {
            c();
            try {
                z10 = f6117e.await(2, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
                z10 = false;
            }
            MessageDigest messageDigest = null;
            if (z10) {
                MessageDigest messageDigest2 = f6114b;
                if (messageDigest2 != null) {
                    messageDigest = messageDigest2;
                }
            }
            if (messageDigest != null) {
                messageDigest.reset();
                messageDigest.update(bArr);
                digest = f6114b.digest();
            } else {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
        }
        return digest;
    }

    public static void c() {
        synchronized (f6116d) {
            if (!f6113a) {
                f6113a = true;
                new Thread(new cw((ji) null)).start();
            }
        }
    }

    public static String d(ma maVar, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] bArr;
        byte[] f10 = maVar.f();
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16664u1)).booleanValue()) {
            Vector vector = null;
            if (f10.length > 0) {
                int length = ((f10.length + 255) - 1) / 255;
                Vector vector2 = new Vector();
                int i10 = 0;
                while (i10 < length) {
                    int i11 = i10 * 255;
                    try {
                        vector2.add(Arrays.copyOfRange(f10, i11, f10.length - i11 > 255 ? i11 + 255 : f10.length));
                        i10++;
                    } catch (IndexOutOfBoundsException unused) {
                    }
                }
                vector = vector2;
            }
            if (vector == null || vector.size() == 0) {
                ma.a V = ma.V();
                V.q((long) 4096);
                bArr = a(((ma) ((aq) V.j())).f(), str, true);
            } else {
                ra.a B = ra.B();
                Iterator it = vector.iterator();
                while (it.hasNext()) {
                    byte[] a10 = a((byte[]) it.next(), str, false);
                    B.o(mp.I(a10, 0, a10.length));
                }
                mp L = mp.L(b(f10));
                if (B.f5971c) {
                    B.n();
                    B.f5971c = false;
                }
                ra.A((ra) B.f5970b, L);
                bArr = ((ra) ((aq) B.j())).f();
            }
        } else if (hr.f6893a != null) {
            byte[] a11 = hr.f6893a.a(f10, str != null ? str.getBytes() : new byte[0]);
            ra.a B2 = ra.B();
            B2.o(mp.L(a11));
            mb mbVar = mb.TINK_HYBRID;
            if (B2.f5971c) {
                B2.n();
                B2.f5971c = false;
            }
            ra.y((ra) B2.f5970b, mbVar);
            bArr = ((ra) ((aq) B2.j())).f();
        } else {
            throw new GeneralSecurityException();
        }
        return uc.a(bArr, true);
    }
}

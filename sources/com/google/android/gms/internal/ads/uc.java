package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import e8.ah;
import e8.c1;
import e8.fi;
import e8.gz;
import e8.h9;
import e8.i10;
import e8.l10;
import e8.o50;
import e8.t;
import e8.ti0;
import e8.tz;
import e8.uz;
import e8.v10;
import e8.w10;
import e8.yz;
import java.nio.ByteBuffer;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class uc {
    public static String a(byte[] bArr, boolean z10) {
        return Base64.encodeToString(bArr, z10 ? 11 : 2);
    }

    public static byte[] b(String str, boolean z10) throws IllegalArgumentException {
        byte[] decode = Base64.decode(str, z10 ? 11 : 2);
        if (decode.length != 0 || str.length() <= 0) {
            return decode;
        }
        throw new IllegalArgumentException(str.length() != 0 ? "Unable to decode ".concat(str) : new String("Unable to decode "));
    }

    public static <AppOpenAdRequestComponent extends fi<AppOpenAd>, AppOpenAd extends ah> yz<AppOpenAdRequestComponent, AppOpenAd> c(Context context, i10 i10, w10 w10) {
        if (((Integer) ti0.f16763j.f16769f.a(t.S3)).intValue() <= 0) {
            return new de();
        }
        v10 a10 = w10.a(cf.AppOpen, context, i10, new gz((yz) new tz()));
        fe feVar = new fe(new de());
        l10 l10 = a10.f17014a;
        o50 o50 = h9.f14881a;
        return new yd(feVar, new uz(l10, o50), a10.f17015b, o50);
    }

    public static void d(String str) {
        if (((Boolean) c1.f14074a.b()).booleanValue()) {
            e.E(str);
        }
    }

    public static long e(ByteBuffer byteBuffer) {
        long j10 = (long) byteBuffer.getInt();
        return j10 < 0 ? j10 + 4294967296L : j10;
    }

    public static int f(ByteBuffer byteBuffer) {
        int i10 = byteBuffer.get();
        if (i10 < 0) {
            i10 += 256;
        }
        int i11 = (i10 << 8) + 0;
        int i12 = byteBuffer.get();
        if (i12 < 0) {
            i12 += 256;
        }
        return i11 + i12;
    }

    public static long g(ByteBuffer byteBuffer) {
        long e10 = (e(byteBuffer) << 32) + 0;
        if (e10 >= 0) {
            return e(byteBuffer) + e10;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static double h(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d10 = (double) (0 | ((bArr[0] << 24) & -16777216) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255));
        Double.isNaN(d10);
        return d10 / 65536.0d;
    }

    public static double i(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d10 = (double) (0 | ((bArr[0] << 24) & -16777216) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255));
        Double.isNaN(d10);
        Double.isNaN(d10);
        return d10 / 1.073741824E9d;
    }
}

package com.google.android.gms.internal.ads;

import e8.p60;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class fp implements el {

    /* renamed from: a  reason: collision with root package name */
    public final ThreadLocal<Mac> f6470a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6471b;

    /* renamed from: c  reason: collision with root package name */
    public final Key f6472c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6473d;

    public fp(String str, Key key) throws GeneralSecurityException {
        p60 p60 = new p60(this);
        this.f6470a = p60;
        this.f6471b = str;
        this.f6472c = key;
        if (key.getEncoded().length >= 16) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1823053428:
                    if (str.equals("HMACSHA1")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 392315118:
                    if (str.equals("HMACSHA256")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 392316170:
                    if (str.equals("HMACSHA384")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 392317873:
                    if (str.equals("HMACSHA512")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    this.f6473d = 20;
                    break;
                case 1:
                    this.f6473d = 32;
                    break;
                case 2:
                    this.f6473d = 48;
                    break;
                case 3:
                    this.f6473d = 64;
                    break;
                default:
                    throw new NoSuchAlgorithmException(str.length() != 0 ? "unknown Hmac algorithm: ".concat(str) : new String("unknown Hmac algorithm: "));
            }
            p60.get();
            return;
        }
        throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
    }

    public final byte[] c(byte[] bArr, int i10) throws GeneralSecurityException {
        if (i10 <= this.f6473d) {
            this.f6470a.get().update(bArr);
            return Arrays.copyOf(this.f6470a.get().doFinal(), i10);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}

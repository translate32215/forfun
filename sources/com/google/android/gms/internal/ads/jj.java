package com.google.android.gms.internal.ads;

import e8.g60;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class jj {

    /* renamed from: a  reason: collision with root package name */
    public static final String f7152a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";

    /* renamed from: b  reason: collision with root package name */
    public static final String f7153b = "type.googleapis.com/google.crypto.tink.AesGcmKey";

    static {
        new lj();
        new sj();
        new xj();
        new rj();
        new dk();
        new hk();
        new yj();
        new ik();
        int i10 = eo.f6295a;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() throws GeneralSecurityException {
        boolean z10;
        int i10 = g60.f14709a;
        dj.d(new zk());
        dj.d(new yk());
        dj.e(new dl());
        dj.d(new lj());
        dj.d(new rj());
        dj.d(new sj());
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            z10 = true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            z10 = false;
        }
        if (z10) {
            dj.d(new xj());
        }
        dj.d(new yj());
        dj.d(new dk());
        dj.d(new hk());
        dj.d(new ik());
        dj.e(new ij());
    }
}

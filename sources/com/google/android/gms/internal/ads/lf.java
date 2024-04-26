package com.google.android.gms.internal.ads;

import android.os.Build;
import e8.qb0;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class lf {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f7386a = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f7387b = {16, 57, 56, -18, 69, 55, -27, -98, -114, -25, -110, -10, 84, 80, 79, -72, 52, 111, -58, -77, 70, -48, -69, -60, 65, 95, -61, 57, -4, -4, -114, -63};

    public final boolean a(File file) throws GeneralSecurityException {
        try {
            X509Certificate[][] k10 = g7.k(file.getAbsolutePath());
            if (k10.length == 1) {
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(k10[0][0].getEncoded());
                return Arrays.equals(f7386a, digest) || (!"user".equals(Build.TYPE) && Arrays.equals(f7387b, digest));
            }
            throw new GeneralSecurityException("APK has more than one signature.");
        } catch (qb0 e10) {
            throw new GeneralSecurityException("Package is not signed", e10);
        } catch (IOException | RuntimeException e11) {
            throw new GeneralSecurityException("Failed to verify signatures", e11);
        }
    }
}

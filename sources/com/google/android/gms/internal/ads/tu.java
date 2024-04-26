package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class tu {

    /* renamed from: b  reason: collision with root package name */
    public static MessageDigest f8219b;

    /* renamed from: a  reason: collision with root package name */
    public Object f8220a = new Object();

    public abstract byte[] a(String str);

    public final MessageDigest b() {
        synchronized (this.f8220a) {
            MessageDigest messageDigest = f8219b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i10 = 0; i10 < 2; i10++) {
                try {
                    f8219b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            MessageDigest messageDigest2 = f8219b;
            return messageDigest2;
        }
    }
}

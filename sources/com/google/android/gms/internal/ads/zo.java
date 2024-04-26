package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.yo;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import p.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class zo<T_WRAPPER extends yo<T_ENGINE>, T_ENGINE> {

    /* renamed from: c  reason: collision with root package name */
    public static final Logger f8717c = Logger.getLogger(zo.class.getName());

    /* renamed from: d  reason: collision with root package name */
    public static final List<Provider> f8718d;

    /* renamed from: e  reason: collision with root package name */
    public static final zo<ob, Cipher> f8719e = new zo<>(new ob(1));

    /* renamed from: f  reason: collision with root package name */
    public static final zo<dp, Mac> f8720f = new zo<>(new dp(0));

    /* renamed from: g  reason: collision with root package name */
    public static final zo<ap, KeyAgreement> f8721g = new zo<>(new ap(0));

    /* renamed from: h  reason: collision with root package name */
    public static final zo<bp, KeyPairGenerator> f8722h = new zo<>(new bp(0));

    /* renamed from: i  reason: collision with root package name */
    public static final zo<cp, KeyFactory> f8723i = new zo<>(new cp(0));

    /* renamed from: a  reason: collision with root package name */
    public T_WRAPPER f8724a;

    /* renamed from: b  reason: collision with root package name */
    public List<Provider> f8725b = f8718d;

    static {
        if (a.h()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < 2; i10++) {
                String str = strArr[i10];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f8717c.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{str}));
                }
            }
            f8718d = arrayList;
        } else {
            f8718d = new ArrayList();
        }
    }

    public zo(T_WRAPPER t_wrapper) {
        this.f8724a = t_wrapper;
    }

    public final T_ENGINE a(String str) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider b10 : this.f8725b) {
            try {
                return this.f8724a.b(str, b10);
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        return this.f8724a.b(str, (Provider) null);
    }
}

package com.startapp;

import android.content.Context;
import com.startapp.networkTest.enums.CtTestTypes;
import java.io.File;
import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: Sta */
public class c5 implements X509TrustManager {

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f10237e = false;

    /* renamed from: f  reason: collision with root package name */
    private static final String f10238f = "c5";

    /* renamed from: g  reason: collision with root package name */
    private static String f10239g = "";

    /* renamed from: h  reason: collision with root package name */
    private static boolean f10240h = false;

    /* renamed from: i  reason: collision with root package name */
    private static X509TrustManager f10241i = null;

    /* renamed from: j  reason: collision with root package name */
    private static X509TrustManager f10242j = null;

    /* renamed from: k  reason: collision with root package name */
    private static final String f10243k = "R_hqKukfFZxKn52";

    /* renamed from: l  reason: collision with root package name */
    private static final X509TrustManager f10244l = new a();

    /* renamed from: a  reason: collision with root package name */
    private X509TrustManager[] f10245a;

    /* renamed from: b  reason: collision with root package name */
    private CtTestTypes[] f10246b;

    /* renamed from: c  reason: collision with root package name */
    private String f10247c = "";

    /* renamed from: d  reason: collision with root package name */
    private CtTestTypes f10248d = CtTestTypes.Unknown;

    /* compiled from: Sta */
    public class a implements X509TrustManager {
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    static {
        Class<c5> cls = c5.class;
    }

    public c5(Context context, boolean z10) {
        a(context, z10);
        X509TrustManager[] x509TrustManagerArr = new X509TrustManager[3];
        this.f10245a = x509TrustManagerArr;
        CtTestTypes[] ctTestTypesArr = new CtTestTypes[3];
        this.f10246b = ctTestTypesArr;
        x509TrustManagerArr[0] = f10241i;
        ctTestTypesArr[0] = CtTestTypes.SSLOwnTs;
        x509TrustManagerArr[1] = f10242j;
        ctTestTypesArr[1] = CtTestTypes.SSLDeviceTs;
        x509TrustManagerArr[2] = f10244l;
        ctTestTypesArr[2] = CtTestTypes.SSLTrustAll;
        this.f10247c = f10239g;
    }

    public String a() {
        return this.f10247c;
    }

    public CtTestTypes b() {
        return this.f10248d;
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        int i10 = 0;
        while (true) {
            X509TrustManager[] x509TrustManagerArr = this.f10245a;
            if (i10 < x509TrustManagerArr.length) {
                X509TrustManager x509TrustManager = x509TrustManagerArr[i10];
                if (x509TrustManager != null) {
                    try {
                        this.f10248d = this.f10246b[i10];
                        x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                        return;
                    } catch (CertificateException e10) {
                        if (i10 == 0) {
                            this.f10247c += e10.getMessage();
                        }
                        if (i10 + 1 == this.f10245a.length) {
                            throw e10;
                        }
                    }
                } else {
                    i10++;
                }
            } else {
                return;
            }
        }
    }

    public X509Certificate[] getAcceptedIssuers() {
        return f10242j.getAcceptedIssuers();
    }

    private void a(Context context, boolean z10) {
        if (!f10240h || z10) {
            synchronized (c5.class) {
                if (!f10240h || z10) {
                    f10239g = "";
                    int i10 = 0;
                    try {
                        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        instance.init((KeyStore) null);
                        TrustManager[] trustManagers = instance.getTrustManagers();
                        int length = trustManagers.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                break;
                            }
                            TrustManager trustManager = trustManagers[i11];
                            if (trustManager instanceof X509TrustManager) {
                                f10242j = (X509TrustManager) trustManager;
                                break;
                            }
                            i11++;
                        }
                    } catch (Throwable th) {
                        x2.a(th);
                        f10239g += th.getMessage();
                    }
                    try {
                        File c10 = mb.c(context);
                        File d10 = mb.d(context);
                        if (!c10.exists() || !d10.exists()) {
                            throw new KeyStoreException("Downloaded truststore not available");
                        }
                        if (a5.b().CONNECTIVITY_TEST_VERIFY_TRUSTSTORE_SIGNATURE() ? mb.a(c10, d10) : true) {
                            FileInputStream fileInputStream = new FileInputStream(c10);
                            KeyStore instance2 = KeyStore.getInstance("BKS");
                            instance2.load(fileInputStream, f10243k.toCharArray());
                            fileInputStream.close();
                            TrustManagerFactory instance3 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                            instance3.init(instance2);
                            TrustManager[] trustManagers2 = instance3.getTrustManagers();
                            int length2 = trustManagers2.length;
                            while (true) {
                                if (i10 >= length2) {
                                    break;
                                }
                                TrustManager trustManager2 = trustManagers2[i10];
                                if (trustManager2 instanceof X509TrustManager) {
                                    f10241i = (X509TrustManager) trustManager2;
                                    break;
                                }
                                i10++;
                            }
                            f10240h = true;
                            return;
                        }
                        throw new KeyStoreException("Verification of downloaded truststore failed");
                    } catch (Throwable th2) {
                        x2.a(th2);
                        f10239g += th2.getMessage();
                    }
                } else {
                    return;
                }
            }
        } else {
            return;
        }
    }
}

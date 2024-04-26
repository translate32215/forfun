package ke;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import le.c;

/* compiled from: Handshake */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final g0 f20775a;

    /* renamed from: b  reason: collision with root package name */
    public final g f20776b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Certificate> f20777c;

    /* renamed from: d  reason: collision with root package name */
    public final List<Certificate> f20778d;

    public q(g0 g0Var, g gVar, List<Certificate> list, List<Certificate> list2) {
        this.f20775a = g0Var;
        this.f20776b = gVar;
        this.f20777c = list;
        this.f20778d = list2;
    }

    public static q a(SSLSession sSLSession) throws IOException {
        Certificate[] certificateArr;
        List list;
        List list2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        } else if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            g a10 = g.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            } else if (!"NONE".equals(protocol)) {
                g0 a11 = g0.a(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                if (certificateArr != null) {
                    list = c.p(certificateArr);
                } else {
                    list = Collections.emptyList();
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                if (localCertificates != null) {
                    list2 = c.p(localCertificates);
                } else {
                    list2 = Collections.emptyList();
                }
                return new q(a11, a10, list, list2);
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (!this.f20775a.equals(qVar.f20775a) || !this.f20776b.equals(qVar.f20776b) || !this.f20777c.equals(qVar.f20777c) || !this.f20778d.equals(qVar.f20778d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.f20776b.hashCode();
        int hashCode2 = this.f20777c.hashCode();
        return this.f20778d.hashCode() + ((hashCode2 + ((hashCode + ((this.f20775a.hashCode() + 527) * 31)) * 31)) * 31);
    }
}

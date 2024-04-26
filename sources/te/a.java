package te;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: BasicCertificateChainCleaner */
public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public final e f25908a;

    public a(e eVar) {
        this.f25908a = eVar;
    }

    public List<Certificate> a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z10 = false;
        for (int i10 = 0; i10 < 9; i10++) {
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate a10 = this.f25908a.a(x509Certificate);
            if (a10 != null) {
                if (arrayList.size() > 1 || !x509Certificate.equals(a10)) {
                    arrayList.add(a10);
                }
                if (b(a10, a10)) {
                    return arrayList;
                }
                z10 = true;
            } else {
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (b(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z10) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final boolean b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a) || !((a) obj).f25908a.equals(this.f25908a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f25908a.hashCode();
    }
}

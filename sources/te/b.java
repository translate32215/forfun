package te;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* compiled from: BasicTrustRootIndex */
public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public final Map<X500Principal, Set<X509Certificate>> f25909a = new LinkedHashMap();

    public b(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set set = this.f25909a.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet(1);
                this.f25909a.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    public X509Certificate a(X509Certificate x509Certificate) {
        Set<X509Certificate> set = this.f25909a.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b) || !((b) obj).f25909a.equals(this.f25909a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f25909a.hashCode();
    }
}

package ke;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import te.c;
import ve.i;

/* compiled from: CertificatePinner */
public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static final f f20697c = new f(new LinkedHashSet(new ArrayList()), (c) null);

    /* renamed from: a  reason: collision with root package name */
    public final Set<a> f20698a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final c f20699b;

    /* compiled from: CertificatePinner */
    public static final class a {
        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            throw null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            new StringBuilder().append((String) null);
            throw null;
        }
    }

    public f(Set<a> set, @Nullable c cVar) {
        this.f20698a = set;
        this.f20699b = cVar;
    }

    public static String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder a10 = android.support.v4.media.a.a("sha256/");
            a10.append(i.r(((X509Certificate) certificate).getPublicKey().getEncoded()).f("SHA-256").a());
            return a10.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    public void a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List emptyList = Collections.emptyList();
        Iterator<a> it = this.f20698a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw null;
        } else if (!emptyList.isEmpty()) {
            c cVar = this.f20699b;
            if (cVar != null) {
                list = cVar.a(list, str);
            }
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i10);
                if (emptyList.size() <= 0) {
                    i10++;
                } else {
                    ((a) emptyList.get(0)).getClass();
                    throw null;
                }
            }
            StringBuilder a10 = t.f.a("Certificate pinning failure!", "\n  Peer certificate chain:");
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i11);
                a10.append("\n    ");
                a10.append(b(x509Certificate2));
                a10.append(": ");
                a10.append(x509Certificate2.getSubjectDN().getName());
            }
            a10.append("\n  Pinned certificates for ");
            a10.append(str);
            a10.append(":");
            int size3 = emptyList.size();
            for (int i12 = 0; i12 < size3; i12++) {
                a10.append("\n    ");
                a10.append((a) emptyList.get(i12));
            }
            throw new SSLPeerUnverifiedException(a10.toString());
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (!le.c.l(this.f20699b, fVar.f20699b) || !this.f20698a.equals(fVar.f20698a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        c cVar = this.f20699b;
        return this.f20698a.hashCode() + ((cVar != null ? cVar.hashCode() : 0) * 31);
    }
}

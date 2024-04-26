package ke;

import androidx.appcompat.widget.d0;
import j.f;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import ke.s;
import le.c;

/* compiled from: Address */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final s f20630a;

    /* renamed from: b  reason: collision with root package name */
    public final m f20631b;

    /* renamed from: c  reason: collision with root package name */
    public final SocketFactory f20632c;

    /* renamed from: d  reason: collision with root package name */
    public final b f20633d;

    /* renamed from: e  reason: collision with root package name */
    public final List<x> f20634e;

    /* renamed from: f  reason: collision with root package name */
    public final List<i> f20635f;

    /* renamed from: g  reason: collision with root package name */
    public final ProxySelector f20636g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public final Proxy f20637h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public final SSLSocketFactory f20638i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final HostnameVerifier f20639j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public final f f20640k;

    public a(String str, int i10, m mVar, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable f fVar, b bVar, @Nullable Proxy proxy, List<x> list, List<i> list2, ProxySelector proxySelector) {
        int i11 = i10;
        m mVar2 = mVar;
        SocketFactory socketFactory2 = socketFactory;
        SSLSocketFactory sSLSocketFactory2 = sSLSocketFactory;
        b bVar2 = bVar;
        ProxySelector proxySelector2 = proxySelector;
        s.a aVar = new s.a();
        String str2 = sSLSocketFactory2 != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            aVar.f20791a = "http";
        } else if (str2.equalsIgnoreCase("https")) {
            aVar.f20791a = "https";
        } else {
            throw new IllegalArgumentException(f.a("unexpected scheme: ", str2));
        }
        String str3 = str;
        aVar.c(str);
        if (i11 <= 0 || i11 > 65535) {
            throw new IllegalArgumentException(d0.a("unexpected port: ", i10));
        }
        aVar.f20795e = i11;
        this.f20630a = aVar.a();
        if (mVar2 != null) {
            this.f20631b = mVar2;
            if (socketFactory2 != null) {
                this.f20632c = socketFactory2;
                if (bVar2 != null) {
                    this.f20633d = bVar2;
                    if (list != null) {
                        this.f20634e = c.o(list);
                        if (list2 != null) {
                            this.f20635f = c.o(list2);
                            if (proxySelector2 != null) {
                                this.f20636g = proxySelector2;
                                this.f20637h = proxy;
                                this.f20638i = sSLSocketFactory2;
                                this.f20639j = hostnameVerifier;
                                this.f20640k = fVar;
                                return;
                            }
                            throw new NullPointerException("proxySelector == null");
                        }
                        throw new NullPointerException("connectionSpecs == null");
                    }
                    throw new NullPointerException("protocols == null");
                }
                throw new NullPointerException("proxyAuthenticator == null");
            }
            throw new NullPointerException("socketFactory == null");
        }
        throw new NullPointerException("dns == null");
    }

    public boolean a(a aVar) {
        return this.f20631b.equals(aVar.f20631b) && this.f20633d.equals(aVar.f20633d) && this.f20634e.equals(aVar.f20634e) && this.f20635f.equals(aVar.f20635f) && this.f20636g.equals(aVar.f20636g) && c.l(this.f20637h, aVar.f20637h) && c.l(this.f20638i, aVar.f20638i) && c.l(this.f20639j, aVar.f20639j) && c.l(this.f20640k, aVar.f20640k) && this.f20630a.f20786e == aVar.f20630a.f20786e;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f20630a.equals(aVar.f20630a) && a(aVar);
        }
    }

    public int hashCode() {
        int hashCode = this.f20631b.hashCode();
        int hashCode2 = (this.f20636g.hashCode() + ((this.f20635f.hashCode() + ((this.f20634e.hashCode() + ((this.f20633d.hashCode() + ((hashCode + ((this.f20630a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Proxy proxy = this.f20637h;
        int i10 = 0;
        int hashCode3 = (hashCode2 + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f20638i;
        int hashCode4 = (hashCode3 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f20639j;
        int hashCode5 = (hashCode4 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        f fVar = this.f20640k;
        if (fVar != null) {
            i10 = fVar.hashCode();
        }
        return hashCode5 + i10;
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("Address{");
        a10.append(this.f20630a.f20785d);
        a10.append(":");
        a10.append(this.f20630a.f20786e);
        if (this.f20637h != null) {
            a10.append(", proxy=");
            a10.append(this.f20637h);
        } else {
            a10.append(", proxySelector=");
            a10.append(this.f20636g);
        }
        a10.append("}");
        return a10.toString();
    }
}

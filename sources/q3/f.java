package q3;

import android.net.Uri;
import android.text.TextUtils;
import e.e;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import k3.c;

/* compiled from: GlideUrl */
public class f implements c {

    /* renamed from: b  reason: collision with root package name */
    public final g f24081b;

    /* renamed from: c  reason: collision with root package name */
    public final URL f24082c;

    /* renamed from: d  reason: collision with root package name */
    public final String f24083d;

    /* renamed from: e  reason: collision with root package name */
    public String f24084e;

    /* renamed from: f  reason: collision with root package name */
    public URL f24085f;

    /* renamed from: g  reason: collision with root package name */
    public volatile byte[] f24086g;

    /* renamed from: h  reason: collision with root package name */
    public int f24087h;

    public f(URL url) {
        g gVar = g.f24088a;
        if (url != null) {
            this.f24082c = url;
            this.f24083d = null;
            if (gVar != null) {
                this.f24081b = gVar;
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    public void a(MessageDigest messageDigest) {
        if (this.f24086g == null) {
            this.f24086g = c().getBytes(c.f19887a);
        }
        messageDigest.update(this.f24086g);
    }

    public String c() {
        String str = this.f24083d;
        if (str != null) {
            return str;
        }
        URL url = this.f24082c;
        e.b(url);
        return url.toString();
    }

    public URL d() throws MalformedURLException {
        if (this.f24085f == null) {
            if (TextUtils.isEmpty(this.f24084e)) {
                String str = this.f24083d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f24082c;
                    e.b(url);
                    str = url.toString();
                }
                this.f24084e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f24085f = new URL(this.f24084e);
        }
        return this.f24085f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!c().equals(fVar.c()) || !this.f24081b.equals(fVar.f24081b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f24087h == 0) {
            int hashCode = c().hashCode();
            this.f24087h = hashCode;
            this.f24087h = this.f24081b.hashCode() + (hashCode * 31);
        }
        return this.f24087h;
    }

    public String toString() {
        return c();
    }

    public f(String str) {
        g gVar = g.f24088a;
        this.f24082c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f24083d = str;
            if (gVar != null) {
                this.f24081b = gVar;
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}

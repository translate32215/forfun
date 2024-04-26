package k3;

import android.text.TextUtils;
import java.security.MessageDigest;

/* compiled from: Option */
public final class d<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final b<Object> f19888e = new a();

    /* renamed from: a  reason: collision with root package name */
    public final T f19889a;

    /* renamed from: b  reason: collision with root package name */
    public final b<T> f19890b;

    /* renamed from: c  reason: collision with root package name */
    public final String f19891c;

    /* renamed from: d  reason: collision with root package name */
    public volatile byte[] f19892d;

    /* compiled from: Option */
    public class a implements b<Object> {
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* compiled from: Option */
    public interface b<T> {
        void a(byte[] bArr, T t10, MessageDigest messageDigest);
    }

    public d(String str, T t10, b<T> bVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f19891c = str;
            this.f19889a = t10;
            if (bVar != null) {
                this.f19890b = bVar;
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static <T> d<T> a(String str, T t10) {
        return new d<>(str, t10, f19888e);
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f19891c.equals(((d) obj).f19891c);
        }
        return false;
    }

    public int hashCode() {
        return this.f19891c.hashCode();
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("Option{key='");
        a10.append(this.f19891c);
        a10.append('\'');
        a10.append('}');
        return a10.toString();
    }
}

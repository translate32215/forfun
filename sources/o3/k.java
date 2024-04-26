package o3;

import e.e;
import g4.g;
import g4.j;
import h4.a;
import h4.d;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import k3.c;
import n0.d;

/* compiled from: SafeKeyGenerator */
public class k {

    /* renamed from: a  reason: collision with root package name */
    public final g<c, String> f22920a = new g<>(1000);

    /* renamed from: b  reason: collision with root package name */
    public final d<b> f22921b = h4.a.a(10, new a(this));

    /* compiled from: SafeKeyGenerator */
    public class a implements a.b<b> {
        public a(k kVar) {
        }

        public Object a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* compiled from: SafeKeyGenerator */
    public static final class b implements a.d {

        /* renamed from: a  reason: collision with root package name */
        public final MessageDigest f22922a;

        /* renamed from: b  reason: collision with root package name */
        public final h4.d f22923b = new d.b();

        public b(MessageDigest messageDigest) {
            this.f22922a = messageDigest;
        }

        public h4.d f() {
            return this.f22923b;
        }
    }

    public String a(c cVar) {
        String a10;
        synchronized (this.f22920a) {
            a10 = this.f22920a.a(cVar);
        }
        if (a10 == null) {
            b b10 = this.f22921b.b();
            e.b(b10);
            b bVar = b10;
            try {
                cVar.a(bVar.f22922a);
                byte[] digest = bVar.f22922a.digest();
                char[] cArr = j.f18468b;
                synchronized (cArr) {
                    for (int i10 = 0; i10 < digest.length; i10++) {
                        byte b11 = digest[i10] & 255;
                        int i11 = i10 * 2;
                        char[] cArr2 = j.f18467a;
                        cArr[i11] = cArr2[b11 >>> 4];
                        cArr[i11 + 1] = cArr2[b11 & 15];
                    }
                    a10 = new String(cArr);
                }
                this.f22921b.a(bVar);
            } catch (Throwable th) {
                this.f22921b.a(bVar);
                throw th;
            }
        }
        synchronized (this.f22920a) {
            this.f22920a.d(cVar, a10);
        }
        return a10;
    }
}

package q3;

import com.bumptech.glide.f;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import k3.e;
import q3.m;

/* compiled from: ByteArrayLoader */
public class b<Data> implements m<byte[], Data> {

    /* renamed from: a  reason: collision with root package name */
    public final C0221b<Data> f24067a;

    /* compiled from: ByteArrayLoader */
    public static class a implements n<byte[], ByteBuffer> {

        /* renamed from: q3.b$a$a  reason: collision with other inner class name */
        /* compiled from: ByteArrayLoader */
        public class C0220a implements C0221b<ByteBuffer> {
            public C0220a(a aVar) {
            }

            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            public Object b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        public m<byte[], ByteBuffer> a(q qVar) {
            return new b(new C0220a(this));
        }
    }

    /* renamed from: q3.b$b  reason: collision with other inner class name */
    /* compiled from: ByteArrayLoader */
    public interface C0221b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* compiled from: ByteArrayLoader */
    public static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f24068a;

        /* renamed from: b  reason: collision with root package name */
        public final C0221b<Data> f24069b;

        public c(byte[] bArr, C0221b<Data> bVar) {
            this.f24068a = bArr;
            this.f24069b = bVar;
        }

        public Class<Data> a() {
            return this.f24069b.a();
        }

        public void b() {
        }

        public void cancel() {
        }

        public com.bumptech.glide.load.a e() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        public void f(f fVar, d.a<? super Data> aVar) {
            aVar.d(this.f24069b.b(this.f24068a));
        }
    }

    /* compiled from: ByteArrayLoader */
    public static class d implements n<byte[], InputStream> {

        /* compiled from: ByteArrayLoader */
        public class a implements C0221b<InputStream> {
            public a(d dVar) {
            }

            public Class<InputStream> a() {
                return InputStream.class;
            }

            public Object b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        public m<byte[], InputStream> a(q qVar) {
            return new b(new a(this));
        }
    }

    public b(C0221b<Data> bVar) {
        this.f24067a = bVar;
    }

    public m.a a(Object obj, int i10, int i11, e eVar) {
        byte[] bArr = (byte[]) obj;
        return new m.a(new f4.b(bArr), new c(bArr, this.f24067a));
    }

    public /* bridge */ /* synthetic */ boolean b(Object obj) {
        byte[] bArr = (byte[]) obj;
        return true;
    }
}

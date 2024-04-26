package u3;

import m3.w;

/* compiled from: BytesResource */
public class b implements w<byte[]> {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f26025a;

    public b(byte[] bArr) {
        if (bArr != null) {
            this.f26025a = bArr;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public int a() {
        return this.f26025a.length;
    }

    public Class<byte[]> b() {
        return byte[].class;
    }

    public void c() {
    }

    public Object get() {
        return this.f26025a;
    }
}

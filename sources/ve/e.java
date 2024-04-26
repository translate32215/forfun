package ve;

import java.io.OutputStream;

/* compiled from: Buffer */
public class e extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f26737a;

    public e(f fVar) {
        this.f26737a = fVar;
    }

    public void close() {
    }

    public void flush() {
    }

    public String toString() {
        return this.f26737a + ".outputStream()";
    }

    public void write(int i10) {
        this.f26737a.q0((byte) i10);
    }

    public void write(byte[] bArr, int i10, int i11) {
        this.f26737a.o0(bArr, i10, i11);
    }
}

package a5;

import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: DecoderInputBuffer */
public class f extends a {

    /* renamed from: b  reason: collision with root package name */
    public final b f85b = new b();

    /* renamed from: c  reason: collision with root package name */
    public ByteBuffer f86c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f87d;

    /* renamed from: e  reason: collision with root package name */
    public long f88e;

    /* renamed from: f  reason: collision with root package name */
    public ByteBuffer f89f;

    /* renamed from: g  reason: collision with root package name */
    public final int f90g;

    /* renamed from: h  reason: collision with root package name */
    public final int f91h;

    /* compiled from: DecoderInputBuffer */
    public static final class a extends IllegalStateException {
        public a(int i10, int i11) {
            super("Buffer too small (" + i10 + " < " + i11 + ")");
        }
    }

    public f(int i10) {
        this.f90g = i10;
        this.f91h = 0;
    }

    public void t() {
        this.f61a = 0;
        ByteBuffer byteBuffer = this.f86c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f89f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f87d = false;
    }

    public final ByteBuffer u(int i10) {
        int i11 = this.f90g;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f86c;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    @EnsuresNonNull({"data"})
    public void v(int i10) {
        int i11 = i10 + this.f91h;
        ByteBuffer byteBuffer = this.f86c;
        if (byteBuffer == null) {
            this.f86c = u(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f86c = byteBuffer;
            return;
        }
        ByteBuffer u10 = u(i12);
        u10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            u10.put(byteBuffer);
        }
        this.f86c = u10;
    }

    public final void w() {
        ByteBuffer byteBuffer = this.f86c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f89f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean x() {
        return m(1073741824);
    }
}

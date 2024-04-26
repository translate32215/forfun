package u3;

import com.bumptech.glide.load.data.e;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferRewinder */
public class a implements e<ByteBuffer> {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f26024a;

    /* renamed from: u3.a$a  reason: collision with other inner class name */
    /* compiled from: ByteBufferRewinder */
    public static class C0256a implements e.a<ByteBuffer> {
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        public e b(Object obj) {
            return new a((ByteBuffer) obj);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f26024a = byteBuffer;
    }

    public Object a() throws IOException {
        this.f26024a.position(0);
        return this.f26024a;
    }

    public void b() {
    }
}

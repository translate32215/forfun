package z4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import v6.e0;

/* compiled from: AudioProcessor */
public interface g {

    /* renamed from: a  reason: collision with root package name */
    public static final ByteBuffer f28347a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* compiled from: AudioProcessor */
    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f28348e = new a(-1, -1, -1);

        /* renamed from: a  reason: collision with root package name */
        public final int f28349a;

        /* renamed from: b  reason: collision with root package name */
        public final int f28350b;

        /* renamed from: c  reason: collision with root package name */
        public final int f28351c;

        /* renamed from: d  reason: collision with root package name */
        public final int f28352d;

        public a(int i10, int i11, int i12) {
            this.f28349a = i10;
            this.f28350b = i11;
            this.f28351c = i12;
            this.f28352d = e0.H(i12) ? e0.y(i12, i11) : -1;
        }

        public String toString() {
            StringBuilder a10 = android.support.v4.media.a.a("AudioFormat[sampleRate=");
            a10.append(this.f28349a);
            a10.append(", channelCount=");
            a10.append(this.f28350b);
            a10.append(", encoding=");
            a10.append(this.f28351c);
            a10.append(']');
            return a10.toString();
        }
    }

    /* compiled from: AudioProcessor */
    public static final class b extends Exception {
        public b(a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    boolean a();

    void b();

    ByteBuffer c();

    boolean d();

    void e();

    void f(ByteBuffer byteBuffer);

    void flush();

    a g(a aVar) throws b;
}

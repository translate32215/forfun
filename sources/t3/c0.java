package t3;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;
import t3.b0;

/* compiled from: VideoDecoder */
public class c0 extends MediaDataSource {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f25617a;

    public c0(b0.d dVar, ByteBuffer byteBuffer) {
        this.f25617a = byteBuffer;
    }

    public void close() {
    }

    public long getSize() {
        return (long) this.f25617a.limit();
    }

    public int readAt(long j10, byte[] bArr, int i10, int i11) {
        if (j10 >= ((long) this.f25617a.limit())) {
            return -1;
        }
        this.f25617a.position((int) j10);
        int min = Math.min(i11, this.f25617a.remaining());
        this.f25617a.get(bArr, i10, min);
        return min;
    }
}

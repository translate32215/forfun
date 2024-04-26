package e8;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class bg extends ThreadLocal<ByteBuffer> {
    public final /* synthetic */ Object initialValue() {
        return ByteBuffer.allocate(32);
    }
}

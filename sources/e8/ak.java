package e8;

import com.google.android.gms.internal.ads.cr;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ak extends cr {
    public ak(String str) {
        super(str);
    }

    public final void e(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
    }
}

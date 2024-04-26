package e8;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.google.android.gms.internal.ads.uk;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ge0 implements de0 {
    public ge0(uk ukVar) {
    }

    public final MediaCodecInfo a(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    public final int b() {
        return MediaCodecList.getCodecCount();
    }

    public final boolean c() {
        return false;
    }

    public final boolean d(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }
}

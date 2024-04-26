package e8;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

@TargetApi(21)
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class fe0 implements de0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f14610a;

    /* renamed from: b  reason: collision with root package name */
    public MediaCodecInfo[] f14611b;

    public fe0(boolean z10) {
        this.f14610a = z10 ? 1 : 0;
    }

    public final MediaCodecInfo a(int i10) {
        if (this.f14611b == null) {
            this.f14611b = new MediaCodecList(this.f14610a).getCodecInfos();
        }
        return this.f14611b[i10];
    }

    public final int b() {
        if (this.f14611b == null) {
            this.f14611b = new MediaCodecList(this.f14610a).getCodecInfos();
        }
        return this.f14611b.length;
    }

    public final boolean c() {
        return true;
    }

    public final boolean d(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }
}

package e8;

import android.media.MediaCodec;
import com.google.android.gms.internal.ads.rq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class xc0 {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f17466a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f17467b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f17468c;

    /* renamed from: d  reason: collision with root package name */
    public final MediaCodec.CryptoInfo f17469d;

    /* renamed from: e  reason: collision with root package name */
    public final zc0 f17470e;

    public xc0() {
        int i10 = eg0.f14479a;
        zc0 zc0 = null;
        MediaCodec.CryptoInfo cryptoInfo = i10 >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.f17469d = cryptoInfo;
        this.f17470e = i10 >= 24 ? new zc0(cryptoInfo, (rq) null) : zc0;
    }
}

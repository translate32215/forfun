package e8;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

@TargetApi(19)
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class qc0 extends rc0 {

    /* renamed from: j  reason: collision with root package name */
    public final AudioTimestamp f16120j = new AudioTimestamp();

    /* renamed from: k  reason: collision with root package name */
    public long f16121k;

    /* renamed from: l  reason: collision with root package name */
    public long f16122l;

    /* renamed from: m  reason: collision with root package name */
    public long f16123m;

    public qc0() {
        super((pc0) null);
    }

    public final void a(AudioTrack audioTrack, boolean z10) {
        super.a(audioTrack, z10);
        this.f16121k = 0;
        this.f16122l = 0;
        this.f16123m = 0;
    }

    public final boolean b() {
        boolean timestamp = this.f16262a.getTimestamp(this.f16120j);
        if (timestamp) {
            long j10 = this.f16120j.framePosition;
            if (this.f16122l > j10) {
                this.f16121k++;
            }
            this.f16122l = j10;
            this.f16123m = j10 + (this.f16121k << 32);
        }
        return timestamp;
    }

    public final long c() {
        return this.f16120j.nanoTime;
    }

    public final long d() {
        return this.f16123m;
    }
}

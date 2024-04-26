package e8;

import android.media.AudioTrack;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class rc0 {

    /* renamed from: a  reason: collision with root package name */
    public AudioTrack f16262a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16263b;

    /* renamed from: c  reason: collision with root package name */
    public int f16264c;

    /* renamed from: d  reason: collision with root package name */
    public long f16265d;

    /* renamed from: e  reason: collision with root package name */
    public long f16266e;

    /* renamed from: f  reason: collision with root package name */
    public long f16267f;

    /* renamed from: g  reason: collision with root package name */
    public long f16268g;

    /* renamed from: h  reason: collision with root package name */
    public long f16269h;

    /* renamed from: i  reason: collision with root package name */
    public long f16270i;

    public rc0(pc0 pc0) {
    }

    public void a(AudioTrack audioTrack, boolean z10) {
        this.f16262a = audioTrack;
        this.f16263b = z10;
        this.f16268g = -9223372036854775807L;
        this.f16265d = 0;
        this.f16266e = 0;
        this.f16267f = 0;
        if (audioTrack != null) {
            this.f16264c = audioTrack.getSampleRate();
        }
    }

    public boolean b() {
        return false;
    }

    public long c() {
        throw new UnsupportedOperationException();
    }

    public long d() {
        throw new UnsupportedOperationException();
    }

    public final long e() {
        if (this.f16268g != -9223372036854775807L) {
            return Math.min(this.f16270i, this.f16269h + ((((SystemClock.elapsedRealtime() * 1000) - this.f16268g) * ((long) this.f16264c)) / 1000000));
        }
        int playState = this.f16262a.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) this.f16262a.getPlaybackHeadPosition());
        if (this.f16263b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f16267f = this.f16265d;
            }
            playbackHeadPosition += this.f16267f;
        }
        if (this.f16265d > playbackHeadPosition) {
            this.f16266e++;
        }
        this.f16265d = playbackHeadPosition;
        return playbackHeadPosition + (this.f16266e << 32);
    }
}

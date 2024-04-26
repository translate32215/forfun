package z4;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import v6.e0;

/* compiled from: AudioTimestampPoller */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final a f28372a;

    /* renamed from: b  reason: collision with root package name */
    public int f28373b;

    /* renamed from: c  reason: collision with root package name */
    public long f28374c;

    /* renamed from: d  reason: collision with root package name */
    public long f28375d;

    /* renamed from: e  reason: collision with root package name */
    public long f28376e;

    /* renamed from: f  reason: collision with root package name */
    public long f28377f;

    /* compiled from: AudioTimestampPoller */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final AudioTrack f28378a;

        /* renamed from: b  reason: collision with root package name */
        public final AudioTimestamp f28379b = new AudioTimestamp();

        /* renamed from: c  reason: collision with root package name */
        public long f28380c;

        /* renamed from: d  reason: collision with root package name */
        public long f28381d;

        /* renamed from: e  reason: collision with root package name */
        public long f28382e;

        public a(AudioTrack audioTrack) {
            this.f28378a = audioTrack;
        }
    }

    public m(AudioTrack audioTrack) {
        if (e0.f26436a >= 19) {
            this.f28372a = new a(audioTrack);
            a();
            return;
        }
        this.f28372a = null;
        b(3);
    }

    public void a() {
        if (this.f28372a != null) {
            b(0);
        }
    }

    public final void b(int i10) {
        this.f28373b = i10;
        if (i10 == 0) {
            this.f28376e = 0;
            this.f28377f = -1;
            this.f28374c = System.nanoTime() / 1000;
            this.f28375d = 10000;
        } else if (i10 == 1) {
            this.f28375d = 10000;
        } else if (i10 == 2 || i10 == 3) {
            this.f28375d = 10000000;
        } else if (i10 == 4) {
            this.f28375d = 500000;
        } else {
            throw new IllegalStateException();
        }
    }
}

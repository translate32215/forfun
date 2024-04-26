package x4;

import u6.f;
import v6.a;

/* compiled from: DefaultLoadControl */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public final f f27626a;

    /* renamed from: b  reason: collision with root package name */
    public final long f27627b;

    /* renamed from: c  reason: collision with root package name */
    public final long f27628c;

    /* renamed from: d  reason: collision with root package name */
    public final long f27629d = f.b((long) 2500);

    /* renamed from: e  reason: collision with root package name */
    public final long f27630e = f.b((long) 5000);

    /* renamed from: f  reason: collision with root package name */
    public final int f27631f = -1;

    /* renamed from: g  reason: collision with root package name */
    public final long f27632g = f.b((long) 0);

    /* renamed from: h  reason: collision with root package name */
    public int f27633h = 13107200;

    /* renamed from: i  reason: collision with root package name */
    public boolean f27634i;

    public j() {
        f fVar = new f(true, 65536);
        a(2500, 0, "bufferForPlaybackMs", "0");
        a(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        a(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.f27626a = fVar;
        long j10 = (long) 50000;
        this.f27627b = f.b(j10);
        this.f27628c = f.b(j10);
    }

    public static void a(int i10, int i11, String str, String str2) {
        boolean z10 = i10 >= i11;
        a.b(z10, str + " cannot be less than " + str2);
    }

    public final void b(boolean z10) {
        int i10 = this.f27631f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.f27633h = i10;
        this.f27634i = false;
        if (z10) {
            this.f27626a.b();
        }
    }
}

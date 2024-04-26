package x4;

/* compiled from: DefaultLivePlaybackSpeedControl */
public final class i implements d0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f27598a;

    /* renamed from: b  reason: collision with root package name */
    public final long f27599b;

    /* renamed from: c  reason: collision with root package name */
    public final float f27600c;

    /* renamed from: d  reason: collision with root package name */
    public long f27601d = -9223372036854775807L;

    /* renamed from: e  reason: collision with root package name */
    public long f27602e = -9223372036854775807L;

    /* renamed from: f  reason: collision with root package name */
    public long f27603f;

    /* renamed from: g  reason: collision with root package name */
    public long f27604g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    public long f27605h = -9223372036854775807L;

    /* renamed from: i  reason: collision with root package name */
    public long f27606i;

    /* renamed from: j  reason: collision with root package name */
    public float f27607j;

    /* renamed from: k  reason: collision with root package name */
    public float f27608k;

    /* renamed from: l  reason: collision with root package name */
    public float f27609l;

    /* renamed from: m  reason: collision with root package name */
    public long f27610m;

    /* renamed from: n  reason: collision with root package name */
    public long f27611n;

    /* renamed from: o  reason: collision with root package name */
    public long f27612o;

    public i(float f10, float f11, long j10, float f12, long j11, long j12, float f13, a aVar) {
        this.f27598a = j11;
        this.f27599b = j12;
        this.f27600c = f13;
        this.f27608k = f10;
        this.f27607j = f11;
        this.f27609l = 1.0f;
        this.f27610m = -9223372036854775807L;
        this.f27603f = -9223372036854775807L;
        this.f27606i = -9223372036854775807L;
        this.f27611n = -9223372036854775807L;
        this.f27612o = -9223372036854775807L;
    }

    public final void a() {
        long j10 = this.f27601d;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f27602e;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f27604g;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f27605h;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f27603f != j10) {
            this.f27603f = j10;
            this.f27606i = j10;
            this.f27611n = -9223372036854775807L;
            this.f27612o = -9223372036854775807L;
            this.f27610m = -9223372036854775807L;
        }
    }
}

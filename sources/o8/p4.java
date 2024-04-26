package o8;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class p4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f23387a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f23388b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f23389c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f23390d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f23391e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ s4 f23392f;

    public p4(s4 s4Var, g gVar, long j10, int i10, long j11, boolean z10) {
        this.f23392f = s4Var;
        this.f23387a = gVar;
        this.f23388b = j10;
        this.f23389c = i10;
        this.f23390d = j11;
        this.f23391e = z10;
    }

    public final void run() {
        this.f23392f.y(this.f23387a);
        this.f23392f.r(this.f23388b, false);
        s4.G(this.f23392f, this.f23387a, this.f23389c, this.f23390d, true, this.f23391e);
    }
}

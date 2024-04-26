package o8;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class q4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23407a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f23408b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f23409c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f23410d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f23411e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ s4 f23412f;

    public q4(s4 s4Var, g gVar, int i10, long j10, boolean z10, int i11) {
        this.f23407a = i11;
        if (i11 != 1) {
            this.f23412f = s4Var;
            this.f23408b = gVar;
            this.f23409c = i10;
            this.f23410d = j10;
            this.f23411e = z10;
            return;
        }
        this.f23412f = s4Var;
        this.f23408b = gVar;
        this.f23409c = i10;
        this.f23410d = j10;
        this.f23411e = z10;
    }

    public final void run() {
        switch (this.f23407a) {
            case 0:
                this.f23412f.y(this.f23408b);
                s4.G(this.f23412f, this.f23408b, this.f23409c, this.f23410d, false, this.f23411e);
                return;
            default:
                this.f23412f.y(this.f23408b);
                s4.G(this.f23412f, this.f23408b, this.f23409c, this.f23410d, false, this.f23411e);
                return;
        }
    }
}

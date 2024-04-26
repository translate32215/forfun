package e8;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class qa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16102a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final Object f16103b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f16104c;

    /* renamed from: d  reason: collision with root package name */
    public final long f16105d;

    public qa(ia iaVar, boolean z10, long j10) {
        this.f16103b = iaVar;
        this.f16104c = z10;
        this.f16105d = j10;
    }

    public final void run() {
        switch (this.f16102a) {
            case 0:
                ((oa) this.f16103b).f15749c.r0(this.f16104c, this.f16105d);
                return;
            default:
                ((ia) this.f16103b).r0(this.f16104c, this.f16105d);
                return;
        }
    }

    public qa(oa oaVar, boolean z10, long j10) {
        this.f16103b = oaVar;
        this.f16104c = z10;
        this.f16105d = j10;
    }
}

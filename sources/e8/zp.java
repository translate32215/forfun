package e8;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class zp implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17782a;

    /* renamed from: b  reason: collision with root package name */
    public final yp f17783b;

    public zp(yp ypVar, int i10) {
        this.f17782a = i10;
        if (i10 != 1) {
            this.f17783b = ypVar;
        } else {
            this.f17783b = ypVar;
        }
    }

    public final void run() {
        switch (this.f17782a) {
            case 0:
                yp ypVar = this.f17783b;
                ypVar.f17646b.execute(new zp(ypVar, 1));
                return;
            default:
                this.f17783b.a();
                return;
        }
    }
}

package e8;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class pg0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15999a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ yc0 f16000b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ gf0 f16001c;

    public pg0(gf0 gf0, yc0 yc0, int i10) {
        this.f15999a = i10;
        if (i10 != 1) {
            this.f16001c = gf0;
            this.f16000b = yc0;
            return;
        }
        this.f16001c = gf0;
        this.f16000b = yc0;
    }

    public final void run() {
        switch (this.f15999a) {
            case 0:
                ((og0) this.f16001c.f14777c).getClass();
                return;
            default:
                synchronized (this.f16000b) {
                }
                ((og0) this.f16001c.f14777c).getClass();
                return;
        }
    }
}

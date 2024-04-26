package e8;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class kv implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15338a;

    /* renamed from: b  reason: collision with root package name */
    public final jv f15339b;

    public kv(jv jvVar, int i10) {
        this.f15338a = i10;
        if (i10 != 1) {
            this.f15339b = jvVar;
        } else {
            this.f15339b = jvVar;
        }
    }

    public final void run() {
        switch (this.f15338a) {
            case 0:
                jv jvVar = this.f15339b;
                jvVar.f15198c.execute(new kv(jvVar, 1));
                return;
            default:
                this.f15339b.a();
                return;
        }
    }
}

package u7;

import t7.a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f26119a;

    public n(o oVar) {
        this.f26119a = oVar;
    }

    public final void run() {
        a.f fVar = this.f26119a.f26120a.f5780b;
        fVar.e(fVar.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}

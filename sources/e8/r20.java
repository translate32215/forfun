package e8;

import e7.i;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class r20 implements s20 {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f16225a;

    /* renamed from: b  reason: collision with root package name */
    public final c9 f16226b;

    public r20(Executor executor, c9 c9Var) {
        this.f16225a = executor;
        this.f16226b = c9Var;
    }

    public final void a(String str) {
        this.f16225a.execute(new i(this, str));
    }
}

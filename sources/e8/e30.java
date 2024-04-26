package e8;

import java.util.List;
import java.util.concurrent.Executor;
import r7.m;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class e30 {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f14359a;

    /* renamed from: b  reason: collision with root package name */
    public final c9 f14360b;

    public e30(Executor executor, c9 c9Var) {
        this.f14359a = executor;
        this.f14360b = c9Var;
    }

    public final void a(String str) {
        this.f14359a.execute(new m(this, str));
    }

    public final void b(List<String> list) {
        for (String a10 : list) {
            a(a10);
        }
    }
}

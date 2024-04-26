package e8;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class oq {

    /* renamed from: a  reason: collision with root package name */
    public final tq f15830a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f15831b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f15832c;

    public oq(tq tqVar, Executor executor) {
        this.f15830a = tqVar;
        tqVar.getClass();
        this.f15832c = new HashMap(tqVar.f16508a);
        this.f15831b = executor;
    }

    public final p9 a() {
        return new p9(this).k();
    }
}

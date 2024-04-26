package e8;

import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.ug;
import d7.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class cy<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Set<dy<? extends by<T>>> f14197a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f14198b;

    public cy(Executor executor, Set<dy<? extends by<T>>> set) {
        this.f14198b = executor;
        this.f14197a = set;
    }

    public final p50<T> a(T t10) {
        ArrayList arrayList = new ArrayList(this.f14197a.size());
        for (dy next : this.f14197a) {
            p50 b10 = next.b();
            if (((Boolean) v0.f17011a.b()).booleanValue()) {
                b10.a(new ey(next, l.B.f13193j.a()), h9.f14886f);
            }
            arrayList.add(b10);
        }
        return new rh(ug.A(arrayList), true, this.f14198b, new i7((List) arrayList, (Object) t10));
    }
}

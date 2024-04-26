package e8;

import com.google.android.gms.internal.ads.ob;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class gp<T> implements f3<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<T> f14812a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14813b;

    /* renamed from: c  reason: collision with root package name */
    public final f3<T> f14814c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ cp f14815d;

    public gp(cp cpVar, WeakReference weakReference, String str, f3 f3Var, ob obVar) {
        this.f14815d = cpVar;
        this.f14812a = weakReference;
        this.f14813b = str;
        this.f14814c = f3Var;
    }

    public final void f(Object obj, Map<String, String> map) {
        Object obj2 = this.f14812a.get();
        if (obj2 == null) {
            this.f14815d.d(this.f14813b, this);
        } else {
            this.f14814c.f(obj2, map);
        }
    }
}

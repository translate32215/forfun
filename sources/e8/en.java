package e8;

import com.google.android.gms.internal.ads.ca;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class en implements ta0<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14490a;

    /* renamed from: b  reason: collision with root package name */
    public final ab0<mn> f14491b;

    public en(p9 p9Var, ab0 ab0, int i10) {
        this.f14490a = i10;
        if (i10 == 1) {
            this.f14491b = ab0;
        } else if (i10 != 2) {
            this.f14491b = ab0;
        } else {
            this.f14491b = ab0;
        }
    }

    public final Object get() {
        switch (this.f14490a) {
            case 0:
                return this.f14491b.get().b();
            case 1:
                ca caVar = (ca) this.f14491b.get();
                jc0.b(caVar, "Cannot return null from a non-@Nullable @Provides method");
                return caVar;
            default:
                return new ul((Cdo) this.f14491b.get(), h9.f14886f);
        }
    }
}

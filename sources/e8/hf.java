package e8;

import com.google.android.gms.internal.ads.o8;
import com.google.android.gms.internal.ads.t7;
import java.util.concurrent.Executor;
import l0.e;
import org.json.JSONException;
import org.json.JSONObject;
import r7.m;
import z7.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class hf implements ug0 {

    /* renamed from: a  reason: collision with root package name */
    public t7 f14898a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f14899b;

    /* renamed from: c  reason: collision with root package name */
    public final o8 f14900c;

    /* renamed from: d  reason: collision with root package name */
    public final b f14901d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f14902e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f14903f = false;

    /* renamed from: g  reason: collision with root package name */
    public ef f14904g = new ef();

    public hf(Executor executor, o8 o8Var, b bVar) {
        this.f14899b = executor;
        this.f14900c = o8Var;
        this.f14901d = bVar;
    }

    public final void a() {
        try {
            JSONObject a10 = this.f14900c.c(this.f14904g);
            if (this.f14898a != null) {
                this.f14899b.execute(new m(this, a10));
            }
        } catch (JSONException e10) {
            e.v("Failed to call video active view js", e10);
        }
    }

    public final void t(vg0 vg0) {
        ef efVar = this.f14904g;
        efVar.f14455a = this.f14903f ? false : vg0.f17142j;
        efVar.f14457c = this.f14901d.a();
        this.f14904g.f14459e = vg0;
        if (this.f14902e) {
            a();
        }
    }
}

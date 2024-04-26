package e8;

import com.google.android.gms.internal.ads.g1;
import com.google.android.gms.internal.ads.g2;
import com.google.android.gms.internal.ads.md;
import com.google.android.gms.internal.ads.p6;
import com.google.android.gms.internal.ads.t7;
import d7.l;
import java.util.Locale;
import org.json.JSONObject;
import q.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class se implements ta0<p6> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16468a = 6;

    /* renamed from: b  reason: collision with root package name */
    public final Object f16469b;

    public se(g2 g2Var) {
        this.f16469b = g2Var;
    }

    public static qn a(ym ymVar) {
        qn qnVar = ymVar.f17640a;
        jc0.b(qnVar, "Cannot return null from a non-@Nullable @Provides method");
        return qnVar;
    }

    public final Object get() {
        switch (this.f16468a) {
            case 0:
                p6 p6Var = l.B.f13207x;
                jc0.b(p6Var, "Cannot return null from a non-@Nullable @Provides method");
                return p6Var;
            case 1:
                return ((zf) this.f16469b).f17739a;
            case 2:
                g1 g1Var = (g1) ((p9) this.f16469b).f15880b;
                jc0.b(g1Var, "Cannot return null from a non-@Nullable @Provides method");
                return g1Var;
            case 3:
                return (t7) ((gf0) this.f16469b).f14777c;
            case 4:
                return a((ym) this.f16469b);
            case 5:
                JSONObject jSONObject = (JSONObject) ((p9) this.f16469b).f15880b;
                jc0.b(jSONObject, "Cannot return null from a non-@Nullable @Provides method");
                return jSONObject;
            case 6:
                return null;
            case 7:
                fv fvVar = (fv) this.f16469b;
                fvVar.getClass();
                return fvVar;
            default:
                String lowerCase = ((md) this.f16469b).f7477a.toLowerCase(Locale.ROOT);
                jc0.b(lowerCase, "Cannot return null from a non-@Nullable @Provides method");
                return lowerCase;
        }
    }

    public se(md mdVar) {
        this.f16469b = mdVar;
    }

    public se(b5 b5Var) {
        this.f16469b = b5Var;
    }

    public se(p9 p9Var) {
        this.f16469b = p9Var;
    }

    public se(p9 p9Var, e eVar) {
        this.f16469b = p9Var;
    }

    public se(zf zfVar) {
        this.f16469b = zfVar;
    }

    public se(ym ymVar) {
        this.f16469b = ymVar;
    }

    public se(fv fvVar) {
        this.f16469b = fvVar;
    }

    public se(gf0 gf0) {
        this.f16469b = gf0;
    }
}

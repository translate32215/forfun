package e8;

import com.google.android.gms.internal.ads.ai;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.we;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class qo implements oh {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16190a;

    /* renamed from: b  reason: collision with root package name */
    public final p50 f16191b;

    public qo(p50 p50, int i10) {
        this.f16190a = i10;
        if (i10 == 1) {
            this.f16191b = p50;
        } else if (i10 != 2) {
            this.f16191b = p50;
        } else {
            this.f16191b = p50;
        }
    }

    public final p50 a(Object obj) {
        we weVar = we.INTERNAL_ERROR;
        switch (this.f16190a) {
            case 0:
                p50 p50 = this.f16191b;
                t7 t7Var = (t7) obj;
                if (t7Var != null && t7Var.o() != null) {
                    return p50;
                }
                throw new ru(weVar, "Retrieve video view in instream ad response failed.");
            case 1:
                return obj != null ? this.f16191b : new ai.a(new ru(weVar, "Retrieve required value in native ad response failed."));
            default:
                return this.f16191b;
        }
    }
}

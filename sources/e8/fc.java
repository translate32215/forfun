package e8;

import com.google.android.gms.internal.ads.aq;
import com.google.android.gms.internal.ads.cw;
import com.google.android.gms.internal.ads.mv;
import com.google.android.gms.internal.ads.uv;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class fc implements mv {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f14555a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14556b;

    public fc(boolean z10, int i10) {
        this.f14555a = z10;
        this.f14556b = i10;
    }

    public final void d(cw.a aVar) {
        boolean z10 = this.f14555a;
        int i10 = this.f14556b;
        uv.a B = uv.B();
        if (((uv) B.f5970b).A() != z10) {
            if (B.f5971c) {
                B.n();
                B.f5971c = false;
            }
            uv.z((uv) B.f5970b, z10);
        }
        if (B.f5971c) {
            B.n();
            B.f5971c = false;
        }
        uv.y((uv) B.f5970b, i10);
        uv uvVar = (uv) ((aq) B.j());
        if (aVar.f5971c) {
            aVar.n();
            aVar.f5971c = false;
        }
        cw.A((cw) aVar.f5970b, uvVar);
    }
}

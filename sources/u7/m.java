package u7;

import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.internal.ads.f7;
import com.google.android.gms.internal.ads.i7;
import e8.mc0;
import e8.oa;
import e8.t9;
import t1.c;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26116a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final int f26117b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f26118c;

    public m(e eVar, int i10) {
        this.f26118c = eVar;
        this.f26117b = i10;
    }

    public final void run() {
        switch (this.f26116a) {
            case 0:
                ((e) this.f26118c).g(this.f26117b);
                return;
            case 1:
                int i10 = this.f26117b;
                f7 f7Var = ((t9) this.f26118c).f16729x;
                if (f7Var != null) {
                    ((i7) f7Var).onWindowVisibilityChanged(i10);
                    return;
                }
                return;
            case 2:
                int i11 = this.f26117b;
                f7 f7Var2 = ((oa) this.f26118c).f15752f;
                if (f7Var2 != null) {
                    ((i7) f7Var2).onWindowVisibilityChanged(i11);
                    return;
                }
                return;
            default:
                ((mc0) ((c) this.f26118c).f25351c).getClass();
                return;
        }
    }

    public m(t9 t9Var, int i10) {
        this.f26118c = t9Var;
        this.f26117b = i10;
    }

    public m(oa oaVar, int i10) {
        this.f26118c = oaVar;
        this.f26117b = i10;
    }

    public m(c cVar, int i10) {
        this.f26118c = cVar;
        this.f26117b = i10;
    }
}

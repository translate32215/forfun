package e8;

import com.google.android.gms.internal.ads.ee;
import com.google.android.gms.internal.ads.g6;
import com.google.android.gms.internal.ads.t5;
import e.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class uf implements ee {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16945a;

    /* renamed from: b  reason: collision with root package name */
    public int f16946b;

    public uf() {
        this.f16945a = 4;
        this.f16946b = 2;
    }

    public void g(Object obj) {
        switch (this.f16945a) {
            case 1:
                ((g6) obj).x2(this.f16946b);
                return;
            default:
                ((t5) obj).F2(this.f16946b);
                return;
        }
    }

    public uf(int i10, int i11) {
        this.f16945a = i11;
        if (i11 == 1) {
            this.f16946b = i10;
        } else if (i11 != 2) {
            this.f16946b = i10;
        } else {
            this.f16946b = i10;
        }
    }

    public uf(uf ufVar, b bVar) {
        this.f16945a = 3;
        this.f16945a = 3;
        this.f16946b = ufVar.f16946b;
    }
}

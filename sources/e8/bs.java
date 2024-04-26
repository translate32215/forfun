package e8;

import android.os.Binder;
import com.google.android.gms.internal.ads.ai;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.j8;
import com.google.android.gms.internal.ads.l5;
import com.google.android.gms.internal.ads.we;
import f7.j;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class bs implements ds {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14051a;

    /* renamed from: b  reason: collision with root package name */
    public final j8 f14052b;

    public bs(j8 j8Var, int i10) {
        this.f14051a = i10;
        if (i10 != 1) {
            this.f14052b = j8Var;
        } else {
            this.f14052b = j8Var;
        }
    }

    public final p50 y(l5 l5Var) {
        p50 p50;
        switch (this.f14051a) {
            case 0:
                return ((cs) ((pa0) this.f14052b.f7136d).get()).w6(l5Var, Binder.getCallingUid());
            default:
                sr srVar = (sr) this.f14052b.f7135c;
                String str = l5Var.f7323r;
                synchronized (srVar.f15834b) {
                    int i10 = srVar.f16514h;
                    if (i10 != 1 && i10 != 3) {
                        p50 = new ai.a(new wr(we.INVALID_REQUEST));
                    } else if (srVar.f15835c) {
                        p50 = srVar.f15833a;
                    } else {
                        srVar.f16514h = 3;
                        srVar.f15835c = true;
                        srVar.f16513g = str;
                        srVar.f15838f.n();
                        d7<InputStream> d7Var = srVar.f15833a;
                        d7Var.f6188a.a(new j(srVar), h9.f14886f);
                        p50 = srVar.f15833a;
                    }
                }
                return p50;
        }
    }
}

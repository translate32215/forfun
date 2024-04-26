package t2;

import android.view.View;
import com.adcolony.sdk.f;
import com.adcolony.sdk.g;
import com.adcolony.sdk.h;
import com.adcolony.sdk.i;
import com.adcolony.sdk.k0;

public class q implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f25553a;

    public q(h hVar) {
        this.f25553a = hVar;
    }

    public void a(g gVar) {
        if (this.f25553a.b(gVar)) {
            h hVar = this.f25553a;
            hVar.getClass();
            int optInt = gVar.f4485b.optInt("id");
            View remove = hVar.f4509g.remove(Integer.valueOf(optInt));
            k0 remove2 = hVar.f4503a.remove(Integer.valueOf(optInt));
            boolean z10 = false;
            if (remove == null || remove2 == null) {
                i g10 = f.d().g();
                String str = gVar.f4484a;
                g10.b(str, "" + optInt);
                return;
            }
            if (remove2.S != null) {
                z10 = true;
            }
            if (z10) {
                remove2.e();
            }
            if (remove2.O != null) {
                remove2.F = true;
            }
            remove2.f4579b0.shutdown();
            hVar.removeView(remove2);
        }
    }
}

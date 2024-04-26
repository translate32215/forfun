package t2;

import android.view.View;
import com.adcolony.sdk.f;
import com.adcolony.sdk.g;
import com.adcolony.sdk.h;
import com.adcolony.sdk.i;

public class w implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f25591a;

    public w(h hVar) {
        this.f25591a = hVar;
    }

    public void a(g gVar) {
        if (this.f25591a.b(gVar)) {
            h hVar = this.f25591a;
            hVar.getClass();
            int optInt = gVar.f4485b.optInt("id");
            View remove = hVar.f4509g.remove(Integer.valueOf(optInt));
            t1 remove2 = hVar.f4507e.remove(Integer.valueOf(optInt));
            if (remove == null || remove2 == null) {
                i g10 = f.d().g();
                String str = gVar.f4484a;
                g10.b(str, "" + optInt);
                return;
            }
            hVar.removeView(remove2);
        }
    }
}

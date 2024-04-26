package t2;

import android.view.View;
import com.adcolony.sdk.f;
import com.adcolony.sdk.g;
import com.adcolony.sdk.h;
import com.adcolony.sdk.i;
import com.adcolony.sdk.j0;
import com.adcolony.sdk.o;
import com.adcolony.sdk.q0;

public class s implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f25563a;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f25564a;

        public a(g gVar) {
            this.f25564a = gVar;
        }

        public void run() {
            h hVar = s.this.f25563a;
            g gVar = this.f25564a;
            hVar.getClass();
            int optInt = gVar.f4485b.optInt("id");
            o d10 = f.d();
            View remove = hVar.f4509g.remove(Integer.valueOf(optInt));
            q0 remove2 = hVar.f4505c.remove(Integer.valueOf(optInt));
            if (remove2 == null || remove == null) {
                i g10 = d10.g();
                String str = gVar.f4484a;
                g10.b(str, "" + optInt);
                return;
            }
            d10.m().a(remove2.C);
            hVar.removeView(remove2);
        }
    }

    public s(h hVar) {
        this.f25563a = hVar;
    }

    public void a(g gVar) {
        if (this.f25563a.b(gVar)) {
            j0.h(new a(gVar));
        }
    }
}

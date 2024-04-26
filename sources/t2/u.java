package t2;

import android.view.View;
import android.widget.TextView;
import com.adcolony.sdk.f;
import com.adcolony.sdk.g;
import com.adcolony.sdk.h;
import com.adcolony.sdk.i;

public class u implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f25583a;

    public u(h hVar) {
        this.f25583a = hVar;
    }

    public void a(g gVar) {
        TextView textView;
        if (this.f25583a.b(gVar)) {
            h hVar = this.f25583a;
            hVar.getClass();
            int optInt = gVar.f4485b.optInt("id");
            View remove = hVar.f4509g.remove(Integer.valueOf(optInt));
            if (hVar.f4508f.remove(Integer.valueOf(optInt)).booleanValue()) {
                textView = hVar.f4506d.remove(Integer.valueOf(optInt));
            } else {
                textView = hVar.f4504b.remove(Integer.valueOf(optInt));
            }
            if (remove == null || textView == null) {
                i g10 = f.d().g();
                String str = gVar.f4484a;
                g10.b(str, "" + optInt);
                return;
            }
            hVar.removeView(textView);
        }
    }
}

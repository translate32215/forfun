package q1;

import androidx.fragment.app.a0;
import androidx.fragment.app.e0;
import androidx.fragment.app.p;
import java.util.Set;
import ud.k;
import ud.x;

public final /* synthetic */ class a implements e0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f24019a;

    public /* synthetic */ a(c cVar) {
        this.f24019a = cVar;
    }

    public final void a(a0 a0Var, p pVar) {
        c cVar = this.f24019a;
        k.f(cVar, "this$0");
        k.f(pVar, "childFragment");
        Set<String> set = cVar.f24023e;
        if (x.a(set).remove(pVar.H)) {
            pVar.f1793e0.a(cVar.f24024f);
        }
    }
}

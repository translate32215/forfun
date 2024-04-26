package bc;

import ad.i;
import android.view.View;
import androidx.fragment.app.a0;
import androidx.fragment.app.b;
import ud.k;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3869a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3870b;

    public /* synthetic */ a(i iVar) {
        this.f3870b = iVar;
    }

    public /* synthetic */ a(b bVar) {
        this.f3870b = bVar;
    }

    public final void onClick(View view) {
        switch (this.f3869a) {
            case 0:
                b bVar = (b) this.f3870b;
                int i10 = b.D0;
                k.f(bVar, "this$0");
                a0 y10 = bVar.y();
                b bVar2 = new b(y10);
                bVar2.o(bVar);
                bVar2.e();
                y10.y(new a0.o((String) null, -1, 0), false);
                return;
            default:
                int i11 = i.I0;
                ((i) this.f3870b).s0(false, false, false);
                return;
        }
    }
}

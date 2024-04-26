package ac;

import android.view.View;
import td.l;
import ud.k;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f263a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f264b;

    public /* synthetic */ a(l lVar, int i10) {
        this.f263a = i10;
        this.f264b = lVar;
    }

    public final void onClick(View view) {
        switch (this.f263a) {
            case 0:
                l lVar = this.f264b;
                k.f(lVar, "$tmp0");
                lVar.c(view);
                return;
            default:
                l lVar2 = this.f264b;
                k.f(lVar2, "$tmp0");
                lVar2.c(view);
                return;
        }
    }
}

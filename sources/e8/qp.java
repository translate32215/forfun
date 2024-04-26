package e8;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class qp implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final op f16192a;

    public qp(op opVar) {
        this.f16192a = opVar;
    }

    public final void onClick(View view) {
        op opVar = this.f16192a;
        opVar.f15821i.f5591b = true;
        h8 h8Var = opVar.f15823k;
        if (h8Var != null) {
            h8Var.f();
        }
    }
}

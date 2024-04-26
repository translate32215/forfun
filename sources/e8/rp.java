package e8;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class rp implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final op f16336a;

    public rp(op opVar) {
        this.f16336a = opVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        op opVar = this.f16336a;
        opVar.f15821i.f5591b = true;
        h8 h8Var = opVar.f15823k;
        if (h8Var == null) {
            return false;
        }
        h8Var.f();
        return false;
    }
}

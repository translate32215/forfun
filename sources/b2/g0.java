package b2;

import android.view.View;
import android.view.ViewGroup;
import com.startapp.startappsdk.R;

/* compiled from: Visibility */
public class g0 extends m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f3379a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f3380b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f3381c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h0 f3382d;

    public g0(h0 h0Var, ViewGroup viewGroup, View view, View view2) {
        this.f3382d = h0Var;
        this.f3379a = viewGroup;
        this.f3380b = view;
        this.f3381c = view2;
    }

    public void c(j jVar) {
        v.a(this.f3379a).z(this.f3380b);
    }

    public void d(j jVar) {
        if (this.f3380b.getParent() == null) {
            v.a(this.f3379a).b(this.f3380b);
        } else {
            this.f3382d.cancel();
        }
    }

    public void e(j jVar) {
        this.f3381c.setTag(R.id.save_overlay_view, (Object) null);
        v.a(this.f3379a).z(this.f3380b);
        jVar.x(this);
    }
}

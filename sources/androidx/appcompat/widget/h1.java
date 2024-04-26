package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;
import k.a;

/* compiled from: ToolbarWidgetWrapper */
public class h1 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final a f933a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i1 f934b;

    public h1(i1 i1Var) {
        this.f934b = i1Var;
        this.f933a = new a(i1Var.f941a.getContext(), 0, 16908332, 0, i1Var.f949i);
    }

    public void onClick(View view) {
        i1 i1Var = this.f934b;
        Window.Callback callback = i1Var.f952l;
        if (callback != null && i1Var.f953m) {
            callback.onMenuItemSelected(0, this.f933a);
        }
    }
}

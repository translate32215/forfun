package v8;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: ViewOffsetBehavior */
public class d<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public e f26624a;

    /* renamed from: b  reason: collision with root package name */
    public int f26625b = 0;

    public d() {
    }

    public boolean h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        t(coordinatorLayout, v10, i10);
        if (this.f26624a == null) {
            this.f26624a = new e(v10);
        }
        e eVar = this.f26624a;
        eVar.f26627b = eVar.f26626a.getTop();
        eVar.f26628c = eVar.f26626a.getLeft();
        this.f26624a.a();
        int i11 = this.f26625b;
        if (i11 == 0) {
            return true;
        }
        e eVar2 = this.f26624a;
        if (eVar2.f26629d != i11) {
            eVar2.f26629d = i11;
            eVar2.a();
        }
        this.f26625b = 0;
        return true;
    }

    public int s() {
        e eVar = this.f26624a;
        if (eVar != null) {
            return eVar.f26629d;
        }
        return 0;
    }

    public void t(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        coordinatorLayout.r(v10, i10);
    }

    public boolean u(int i10) {
        e eVar = this.f26624a;
        if (eVar == null) {
            this.f26625b = i10;
            return false;
        } else if (eVar.f26629d == i10) {
            return false;
        } else {
            eVar.f26629d = i10;
            eVar.a();
            return true;
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

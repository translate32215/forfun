package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: ListPopupWindow */
public class p0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q0 f1054a;

    public p0(q0 q0Var) {
        this.f1054a = q0Var;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        l0 l0Var;
        if (i10 != -1 && (l0Var = this.f1054a.f1060c) != null) {
            l0Var.setListSelectionHidden(false);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}

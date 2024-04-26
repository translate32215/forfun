package v9;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.q0;

/* compiled from: MaterialAutoCompleteTextView */
public class o implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f26672a;

    public o(p pVar) {
        this.f26672a = pVar;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        Object obj;
        p pVar = this.f26672a;
        if (i10 < 0) {
            q0 q0Var = pVar.f26673e;
            if (!q0Var.b()) {
                obj = null;
            } else {
                obj = q0Var.f1060c.getSelectedItem();
            }
        } else {
            obj = pVar.getAdapter().getItem(i10);
        }
        p.a(this.f26672a, obj);
        AdapterView.OnItemClickListener onItemClickListener = this.f26672a.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i10 < 0) {
                q0 q0Var2 = this.f26672a.f26673e;
                if (!q0Var2.b()) {
                    view = null;
                } else {
                    view = q0Var2.f1060c.getSelectedView();
                }
                q0 q0Var3 = this.f26672a.f26673e;
                if (!q0Var3.b()) {
                    i10 = -1;
                } else {
                    i10 = q0Var3.f1060c.getSelectedItemPosition();
                }
                q0 q0Var4 = this.f26672a.f26673e;
                if (!q0Var4.b()) {
                    j10 = Long.MIN_VALUE;
                } else {
                    j10 = q0Var4.f1060c.getSelectedItemId();
                }
            }
            onItemClickListener.onItemClick(this.f26672a.f26673e.f1060c, view, i10, j10);
        }
        this.f26672a.f26673e.dismiss();
    }
}

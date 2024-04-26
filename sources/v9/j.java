package v9;

import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.b;

/* compiled from: DropdownMenuEndIconDelegate */
public class j implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f26640a;

    public j(b bVar) {
        this.f26640a = bVar;
    }

    public void onDismiss() {
        b.h(this.f26640a);
        b.f(this.f26640a, false);
    }
}

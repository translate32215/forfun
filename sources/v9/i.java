package v9;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.b;

/* compiled from: DropdownMenuEndIconDelegate */
public class i implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AutoCompleteTextView f26638a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f26639b;

    public i(b bVar, AutoCompleteTextView autoCompleteTextView) {
        this.f26639b = bVar;
        this.f26638a = autoCompleteTextView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f26639b.k()) {
                this.f26639b.f9544j = false;
            }
            b.g(this.f26639b, this.f26638a);
            b.h(this.f26639b);
        }
        return false;
    }
}

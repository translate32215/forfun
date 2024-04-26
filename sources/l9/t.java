package l9;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: ViewUtils */
public class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f21176a;

    public t(View view) {
        this.f21176a = view;
    }

    public void run() {
        ((InputMethodManager) this.f21176a.getContext().getSystemService("input_method")).showSoftInput(this.f21176a, 1);
    }
}

package tc;

import android.view.View;
import android.webkit.WebView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* compiled from: ActivityWebBinding */
public abstract class g extends ViewDataBinding {

    /* renamed from: w  reason: collision with root package name */
    public final ConstraintLayout f25900w;

    /* renamed from: x  reason: collision with root package name */
    public final WebView f25901x;

    public g(Object obj, View view, int i10, ConstraintLayout constraintLayout, WebView webView) {
        super(obj, view, i10);
        this.f25900w = constraintLayout;
        this.f25901x = webView;
    }
}

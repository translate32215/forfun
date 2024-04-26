package c1;

import android.view.ViewGroup;
import androidx.fragment.app.p;

/* compiled from: FragmentReuseViolation.kt */
public final class a extends h {

    /* renamed from: b  reason: collision with root package name */
    public final Object f4014b;

    public a(p pVar, String str) {
        super(pVar, "Attempting to reuse fragment " + pVar + " with previous ID " + str);
    }

    public a(p pVar, ViewGroup viewGroup) {
        super(pVar, "Attempting to add fragment " + pVar + " to container " + viewGroup + " which is not a FragmentContainerView");
        this.f4014b = viewGroup;
    }
}

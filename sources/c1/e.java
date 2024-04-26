package c1;

import android.view.ViewGroup;
import androidx.fragment.app.p;

/* compiled from: FragmentTagUsageViolation.kt */
public final class e extends h {

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup f4036b;

    public e(p pVar, ViewGroup viewGroup) {
        super(pVar, "Attempting to use <fragment> tag to add fragment " + pVar + " to container " + viewGroup);
        this.f4036b = viewGroup;
    }
}

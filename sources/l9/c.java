package l9;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;
import o0.a;

/* compiled from: CheckableImageButton */
public class c extends a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ CheckableImageButton f21113d;

    public c(CheckableImageButton checkableImageButton) {
        this.f21113d = checkableImageButton;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f22536a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f21113d.isChecked());
    }

    public void d(View view, p0.c cVar) {
        this.f22536a.onInitializeAccessibilityNodeInfo(view, cVar.f23748a);
        cVar.f23748a.setCheckable(this.f21113d.f9313e);
        cVar.f23748a.setChecked(this.f21113d.isChecked());
    }
}

package p0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: AccessibilityClickableSpanCompat */
public final class a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final int f23744a;

    /* renamed from: b  reason: collision with root package name */
    public final c f23745b;

    /* renamed from: c  reason: collision with root package name */
    public final int f23746c;

    public a(int i10, c cVar, int i11) {
        this.f23744a = i10;
        this.f23745b = cVar;
        this.f23746c = i11;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f23744a);
        c cVar = this.f23745b;
        cVar.f23748a.performAction(this.f23746c, bundle);
    }
}

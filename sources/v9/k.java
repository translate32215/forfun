package v9;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: EndIconDelegate */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public TextInputLayout f26641a;

    /* renamed from: b  reason: collision with root package name */
    public Context f26642b;

    /* renamed from: c  reason: collision with root package name */
    public CheckableImageButton f26643c;

    /* renamed from: d  reason: collision with root package name */
    public final int f26644d;

    public k(TextInputLayout textInputLayout, int i10) {
        this.f26641a = textInputLayout;
        this.f26642b = textInputLayout.getContext();
        this.f26643c = textInputLayout.getEndIconView();
        this.f26644d = i10;
    }

    public abstract void a();

    public boolean b(int i10) {
        return true;
    }

    public void c(boolean z10) {
    }
}

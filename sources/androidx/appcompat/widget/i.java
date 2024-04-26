package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.core.graphics.drawable.a;

/* compiled from: AppCompatCheckedTextViewHelper */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public final CheckedTextView f935a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f936b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f937c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f938d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f939e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f940f;

    public i(CheckedTextView checkedTextView) {
        this.f935a = checkedTextView;
    }

    public void a() {
        Drawable checkMarkDrawable = this.f935a.getCheckMarkDrawable();
        if (checkMarkDrawable == null) {
            return;
        }
        if (this.f938d || this.f939e) {
            Drawable mutate = a.n(checkMarkDrawable).mutate();
            if (this.f938d) {
                a.l(mutate, this.f936b);
            }
            if (this.f939e) {
                a.m(mutate, this.f937c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f935a.getDrawableState());
            }
            this.f935a.setCheckMarkDrawable(mutate);
        }
    }
}

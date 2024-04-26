package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import e.l;
import g.a;
import s0.h;

/* compiled from: AppCompatPopupWindow */
public class t extends PopupWindow {

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f1093b = (Build.VERSION.SDK_INT < 21);

    /* renamed from: a  reason: collision with root package name */
    public boolean f1094a;

    public t(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f13520t, i10, i11);
        if (obtainStyledAttributes.hasValue(2)) {
            boolean z10 = obtainStyledAttributes.getBoolean(2, false);
            if (f1093b) {
                this.f1094a = z10;
            } else {
                h.a(this, z10);
            }
        }
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(0);
        } else {
            drawable = a.b(context, resourceId);
        }
        setBackgroundDrawable(drawable);
        obtainStyledAttributes.recycle();
    }

    public void showAsDropDown(View view, int i10, int i11) {
        if (f1093b && this.f1094a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f1093b && this.f1094a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }

    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f1093b && this.f1094a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }
}

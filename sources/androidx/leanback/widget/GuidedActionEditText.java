package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillValue;
import android.widget.EditText;
import android.widget.TextView;
import s0.i;

public class GuidedActionEditText extends EditText {

    /* renamed from: a  reason: collision with root package name */
    public w f2126a;

    /* renamed from: b  reason: collision with root package name */
    public r f2127b;

    /* renamed from: c  reason: collision with root package name */
    public final Drawable f2128c = getBackground();

    /* renamed from: d  reason: collision with root package name */
    public final Drawable f2129d;

    public static final class a extends Drawable {
        public void draw(Canvas canvas) {
        }

        public int getOpacity() {
            return -2;
        }

        public boolean getPadding(Rect rect) {
            rect.set(0, 0, 0, 0);
            return true;
        }

        public void setAlpha(int i10) {
        }

        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public GuidedActionEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842862);
        a aVar = new a();
        this.f2129d = aVar;
        setBackground(aVar);
    }

    public void autofill(AutofillValue autofillValue) {
        super.autofill(autofillValue);
        r rVar = this.f2127b;
        if (rVar != null) {
            rVar.a(this);
        }
    }

    public int getAutofillType() {
        return 1;
    }

    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (z10) {
            setBackground(this.f2128c);
        } else {
            setBackground(this.f2129d);
        }
        if (!z10) {
            setFocusable(false);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((isFocused() ? EditText.class : TextView.class).getName());
    }

    public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
        w wVar = this.f2126a;
        boolean a10 = wVar != null ? wVar.a(this, i10, keyEvent) : false;
        return !a10 ? super.onKeyPreIme(i10, keyEvent) : a10;
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.j(this, callback));
    }

    public void setImeKeyListener(w wVar) {
        this.f2126a = wVar;
    }

    public void setOnAutofillListener(r rVar) {
        this.f2127b = rVar;
    }
}

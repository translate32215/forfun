package v9;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.q0;
import com.google.android.material.textfield.TextInputLayout;
import com.startapp.startappsdk.R;
import java.util.Locale;
import l9.r;
import w9.a;

/* compiled from: MaterialAutoCompleteTextView */
public class p extends d {

    /* renamed from: e  reason: collision with root package name */
    public final q0 f26673e;

    /* renamed from: f  reason: collision with root package name */
    public final AccessibilityManager f26674f;

    /* renamed from: g  reason: collision with root package name */
    public final Rect f26675g = new Rect();

    /* renamed from: h  reason: collision with root package name */
    public final int f26676h;

    public p(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, R.attr.autoCompleteTextViewStyle);
        Context context2 = getContext();
        TypedArray d10 = r.d(context2, attributeSet, t8.a.f25848o, R.attr.autoCompleteTextViewStyle, 2132083487, new int[0]);
        if (d10.hasValue(0) && d10.getInt(0, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.f26676h = d10.getResourceId(1, R.layout.mtrl_auto_complete_simple_item);
        this.f26674f = (AccessibilityManager) context2.getSystemService("accessibility");
        q0 q0Var = new q0(context2, (AttributeSet) null, R.attr.listPopupWindowStyle, 0);
        this.f26673e = q0Var;
        q0Var.r(true);
        q0Var.f1072w = this;
        q0Var.G.setInputMethodMode(2);
        q0Var.o(getAdapter());
        q0Var.f1073x = new o(this);
        if (d10.hasValue(2)) {
            setSimpleItems(d10.getResourceId(2, 0));
        }
        d10.recycle();
    }

    public static void a(p pVar, Object obj) {
        pVar.setText(pVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public CharSequence getHint() {
        TextInputLayout b10 = b();
        if (b10 == null || !b10.M) {
            return super.getHint();
        }
        return b10.getHint();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b10 = b();
        if (b10 != null && b10.M && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    public void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b10 = b();
            int i13 = 0;
            if (!(adapter == null || b10 == null)) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                q0 q0Var = this.f26673e;
                if (!q0Var.b()) {
                    i12 = -1;
                } else {
                    i12 = q0Var.f1060c.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, i12) + 15);
                View view = null;
                int i14 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i13) {
                        view = null;
                        i13 = itemViewType;
                    }
                    view = adapter.getView(max, view, b10);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i14 = Math.max(i14, view.getMeasuredWidth());
                }
                Drawable e10 = this.f26673e.e();
                if (e10 != null) {
                    e10.getPadding(this.f26675g);
                    Rect rect = this.f26675g;
                    i14 += rect.left + rect.right;
                }
                i13 = b10.getEndIconView().getMeasuredWidth() + i14;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i13), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f26673e.o(getAdapter());
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f26674f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f26673e.S();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new ArrayAdapter(getContext(), this.f26676h, strArr));
    }
}

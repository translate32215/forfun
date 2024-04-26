package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.l;
import com.startapp.startappsdk.R;
import j.f;
import java.util.Locale;
import l9.r;
import w9.a;

public class TextInputEditText extends l {

    /* renamed from: f  reason: collision with root package name */
    public final Rect f9469f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public boolean f9470g;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.editTextStyle, 0), attributeSet, R.attr.editTextStyle);
        int[] iArr = t8.a.L;
        r.a(context, attributeSet, R.attr.editTextStyle, 2132083562);
        r.b(context, attributeSet, iArr, R.attr.editTextStyle, 2132083562, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.editTextStyle, 2132083562);
        setTextInputLayoutFocusedRectEnabled(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean b(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f9470g;
    }

    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (b(textInputLayout) && rect != null) {
            textInputLayout.getFocusedRect(this.f9469f);
            rect.bottom = this.f9469f.bottom;
        }
    }

    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (b(textInputLayout)) {
            return textInputLayout.getGlobalVisibleRect(rect, point);
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !textInputLayout.M) {
            return super.getHint();
        }
        return textInputLayout.getHint();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.M && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT < 23 && textInputLayout != null) {
            Editable text = getText();
            CharSequence hint = textInputLayout.getHint();
            boolean z10 = !TextUtils.isEmpty(text);
            String str = "";
            String charSequence = TextUtils.isEmpty(hint) ^ true ? hint.toString() : str;
            if (z10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(text);
                if (!TextUtils.isEmpty(charSequence)) {
                    str = f.a(", ", charSequence);
                }
                sb2.append(str);
                str = sb2.toString();
            } else if (!TextUtils.isEmpty(charSequence)) {
                str = charSequence;
            }
            accessibilityNodeInfo.setText(str);
        }
    }

    public boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!b(textInputLayout) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.f9469f.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.f9469f);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z10) {
        this.f9470g = z10;
    }
}

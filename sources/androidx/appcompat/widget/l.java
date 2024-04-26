package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.appcompat.widget.c0;
import com.startapp.startappsdk.R;
import o0.c;
import o0.u;
import o0.x;
import r0.a;
import r0.b;
import r0.d;
import s0.i;
import s0.j;
import s0.m;

/* compiled from: AppCompatEditText */
public class l extends EditText implements x, u, m {

    /* renamed from: a  reason: collision with root package name */
    public final e f989a;

    /* renamed from: b  reason: collision with root package name */
    public final e0 f990b;

    /* renamed from: c  reason: collision with root package name */
    public final c0 f991c;

    /* renamed from: d  reason: collision with root package name */
    public final j f992d;

    /* renamed from: e  reason: collision with root package name */
    public final m f993e;

    public l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public c a(c cVar) {
        return this.f992d.a(this, cVar);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f989a;
        if (eVar != null) {
            eVar.a();
        }
        e0 e0Var = this.f990b;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i.i(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f989a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f989a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f990b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f990b.e();
    }

    public TextClassifier getTextClassifier() {
        c0 c0Var;
        if (Build.VERSION.SDK_INT >= 28 || (c0Var = this.f991c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = c0Var.f863b;
        return textClassifier == null ? c0.a.a(c0Var.f862a) : textClassifier;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i10;
        String[] n10;
        InputConnection inputConnection;
        String[] strArr;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f990b.i(this, onCreateInputConnection, editorInfo);
        p.h(onCreateInputConnection, editorInfo, this);
        if (!(onCreateInputConnection == null || (i10 = Build.VERSION.SDK_INT) > 30 || (n10 = o0.c0.n(this)) == null)) {
            if (i10 >= 25) {
                editorInfo.contentMimeTypes = n10;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", n10);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", n10);
            }
            b bVar = new b((View) this);
            if (i10 >= 25) {
                inputConnection = new r0.c(onCreateInputConnection, false, bVar);
            } else {
                if (i10 >= 25) {
                    strArr = editorInfo.contentMimeTypes;
                    if (strArr == null) {
                        strArr = a.f24477a;
                    }
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle == null) {
                        strArr = a.f24477a;
                    } else {
                        strArr = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (strArr == null) {
                            strArr = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                        if (strArr == null) {
                            strArr = a.f24477a;
                        }
                    }
                }
                if (strArr.length != 0) {
                    inputConnection = new d(onCreateInputConnection, false, bVar);
                }
            }
            onCreateInputConnection = inputConnection;
        }
        return this.f993e.h(onCreateInputConnection, editorInfo);
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i10 < 31 && i10 >= 24 && dragEvent.getLocalState() == null && o0.c0.n(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z10 = x.a(dragEvent, this, activity);
            }
        }
        if (z10) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public boolean onTextContextMenuItem(int i10) {
        ClipData clipData;
        c.b bVar;
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 0;
        if (i11 < 31 && o0.c0.n(this) != null && (i10 == 16908322 || i10 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                clipData = null;
            } else {
                clipData = clipboardManager.getPrimaryClip();
            }
            if (clipData != null && clipData.getItemCount() > 0) {
                if (i11 >= 31) {
                    bVar = new c.a(clipData, 1);
                } else {
                    bVar = new c.C0199c(clipData, 1);
                }
                if (i10 != 16908322) {
                    i12 = 1;
                }
                bVar.d(i12);
                o0.c0.w(this, bVar.a());
            }
            i12 = 1;
        }
        if (i12 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f989a;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f989a;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        e0 e0Var = this.f990b;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        e0 e0Var = this.f990b;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.j(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        ((z0.a) this.f993e.f1022c).f28182a.c(z10);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f993e.f(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f989a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f989a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f990b.m(colorStateList);
        this.f990b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f990b.n(mode);
        this.f990b.b();
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        e0 e0Var = this.f990b;
        if (e0Var != null) {
            e0Var.h(context, i10);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        c0 c0Var;
        if (Build.VERSION.SDK_INT >= 28 || (c0Var = this.f991c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0Var.f863b = textClassifier;
        }
    }

    public l(Context context, AttributeSet attributeSet, int i10) {
        super(d1.a(context), attributeSet, i10);
        b1.a(this, getContext());
        e eVar = new e(this);
        this.f989a = eVar;
        eVar.d(attributeSet, i10);
        e0 e0Var = new e0(this);
        this.f990b = e0Var;
        e0Var.g(attributeSet, i10);
        e0Var.b();
        this.f991c = new c0(this);
        this.f992d = new j();
        m mVar = new m((EditText) this);
        this.f993e = mVar;
        mVar.g(attributeSet, i10);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener f10 = mVar.f(keyListener);
            if (f10 != keyListener) {
                super.setKeyListener(f10);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}

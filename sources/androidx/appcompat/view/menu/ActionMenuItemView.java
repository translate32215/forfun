package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.c;
import androidx.appcompat.widget.j1;
import androidx.appcompat.widget.n0;
import e.l;
import k.f;

public class ActionMenuItemView extends AppCompatTextView implements j.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: g  reason: collision with root package name */
    public g f455g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f456h;

    /* renamed from: i  reason: collision with root package name */
    public Drawable f457i;

    /* renamed from: r  reason: collision with root package name */
    public e.b f458r;

    /* renamed from: s  reason: collision with root package name */
    public n0 f459s;

    /* renamed from: t  reason: collision with root package name */
    public b f460t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f461u = e();

    /* renamed from: v  reason: collision with root package name */
    public boolean f462v;

    /* renamed from: w  reason: collision with root package name */
    public int f463w;

    /* renamed from: x  reason: collision with root package name */
    public int f464x;

    /* renamed from: y  reason: collision with root package name */
    public int f465y;

    public class a extends n0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        public f b() {
            c.a aVar;
            b bVar = ActionMenuItemView.this.f460t;
            if (bVar == null || (aVar = c.this.C) == null) {
                return null;
            }
            return aVar.a();
        }

        public boolean c() {
            f b10;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f458r;
            if (bVar == null || !bVar.a(actionMenuItemView.f455g) || (b10 = b()) == null || !b10.b()) {
                return false;
            }
            return true;
        }
    }

    public static abstract class b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f13503c, 0, 0);
        this.f463w = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f465y = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f464x = -1;
        setSaveEnabled(false);
    }

    public boolean a() {
        return c();
    }

    public boolean b() {
        return c() && this.f455g.getIcon() == null;
    }

    public boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    public void d(g gVar, int i10) {
        this.f455g = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.getTitleCondensed());
        setId(gVar.f564a);
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f459s == null) {
            this.f459s = new a();
        }
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void f() {
        CharSequence charSequence;
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f456h);
        if (this.f457i != null) {
            if (!((this.f455g.f588y & 4) == 4) || (!this.f461u && !this.f462v)) {
                z10 = false;
            }
        }
        boolean z12 = z11 & z10;
        CharSequence charSequence2 = null;
        setText(z12 ? this.f456h : null);
        CharSequence charSequence3 = this.f455g.f580q;
        if (TextUtils.isEmpty(charSequence3)) {
            if (z12) {
                charSequence = null;
            } else {
                charSequence = this.f455g.f568e;
            }
            setContentDescription(charSequence);
        } else {
            setContentDescription(charSequence3);
        }
        CharSequence charSequence4 = this.f455g.f581r;
        if (TextUtils.isEmpty(charSequence4)) {
            if (!z12) {
                charSequence2 = this.f455g.f568e;
            }
            j1.a(this, charSequence2);
            return;
        }
        j1.a(this, charSequence4);
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public g getItemData() {
        return this.f455g;
    }

    public void onClick(View view) {
        e.b bVar = this.f458r;
        if (bVar != null) {
            bVar.a(this.f455g);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f461u = e();
        f();
    }

    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        boolean c10 = c();
        if (c10 && (i13 = this.f464x) >= 0) {
            super.setPadding(i13, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i12 = Math.min(size, this.f463w);
        } else {
            i12 = this.f463w;
        }
        if (mode != 1073741824 && this.f463w > 0 && measuredWidth < i12) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
        }
        if (!c10 && this.f457i != null) {
            super.setPadding((getMeasuredWidth() - this.f457i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        n0 n0Var;
        if (!this.f455g.hasSubMenu() || (n0Var = this.f459s) == null || !n0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f462v != z10) {
            this.f462v = z10;
            g gVar = this.f455g;
            if (gVar != null) {
                e eVar = gVar.f577n;
                eVar.f547k = true;
                eVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f457i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f465y;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i10) / ((float) intrinsicWidth)));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i10) / ((float) intrinsicHeight)));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        f();
    }

    public void setItemInvoker(e.b bVar) {
        this.f458r = bVar;
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f464x = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f460t = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f456h = charSequence;
        f();
    }
}

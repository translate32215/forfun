package c9;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.g;
import com.startapp.startappsdk.R;
import e.d;
import l9.r;
import l9.u;
import s0.c;

/* compiled from: MaterialCheckBox */
public class a extends g {

    /* renamed from: h  reason: collision with root package name */
    public static final int[][] f4362h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f4363e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4364f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4365g;

    public a(Context context, AttributeSet attributeSet) {
        super(w9.a.a(context, attributeSet, R.attr.checkboxStyle, 2132083821), attributeSet, R.attr.checkboxStyle);
        Context context2 = getContext();
        TypedArray d10 = r.d(context2, attributeSet, t8.a.f25854u, R.attr.checkboxStyle, 2132083821, new int[0]);
        if (d10.hasValue(0)) {
            c.c(this, p9.c.a(context2, d10, 0));
        }
        this.f4364f = d10.getBoolean(2, false);
        this.f4365g = d10.getBoolean(1, true);
        d10.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f4363e == null) {
            int[][] iArr = f4362h;
            int[] iArr2 = new int[iArr.length];
            int g10 = d.g(this, R.attr.colorControlActivated);
            int g11 = d.g(this, R.attr.colorSurface);
            int g12 = d.g(this, R.attr.colorOnSurface);
            iArr2[0] = d.k(g11, g10, 1.0f);
            iArr2[1] = d.k(g11, g12, 0.54f);
            iArr2[2] = d.k(g11, g12, 0.38f);
            iArr2[3] = d.k(g11, g12, 0.38f);
            this.f4363e = new ColorStateList(iArr, iArr2);
        }
        return this.f4363e;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4364f && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void onDraw(Canvas canvas) {
        Drawable a10;
        if (!this.f4365g || !TextUtils.isEmpty(getText()) || (a10 = c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a10.getIntrinsicWidth()) / 2) * (u.c(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate((float) width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a10.getBounds();
            androidx.core.graphics.drawable.a.i(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f4365g = z10;
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f4364f = z10;
        if (z10) {
            c.c(this, getMaterialThemeColorsTintList());
        } else {
            c.c(this, (ColorStateList) null);
        }
    }
}

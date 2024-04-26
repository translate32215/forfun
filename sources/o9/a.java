package o9;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.v;
import com.startapp.startappsdk.R;
import e.d;
import l9.r;
import s0.c;

/* compiled from: MaterialRadioButton */
public class a extends v {

    /* renamed from: g  reason: collision with root package name */
    public static final int[][] f23651g = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f23652e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f23653f;

    public a(Context context, AttributeSet attributeSet) {
        super(w9.a.a(context, attributeSet, R.attr.radioButtonStyle, 2132083822), attributeSet, R.attr.radioButtonStyle);
        Context context2 = getContext();
        TypedArray d10 = r.d(context2, attributeSet, t8.a.f25855v, R.attr.radioButtonStyle, 2132083822, new int[0]);
        if (d10.hasValue(0)) {
            c.c(this, p9.c.a(context2, d10, 0));
        }
        this.f23653f = d10.getBoolean(1, false);
        d10.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f23652e == null) {
            int g10 = d.g(this, R.attr.colorControlActivated);
            int g11 = d.g(this, R.attr.colorOnSurface);
            int g12 = d.g(this, R.attr.colorSurface);
            int[][] iArr = f23651g;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = d.k(g12, g10, 1.0f);
            iArr2[1] = d.k(g12, g11, 0.54f);
            iArr2[2] = d.k(g12, g11, 0.38f);
            iArr2[3] = d.k(g12, g11, 0.38f);
            this.f23652e = new ColorStateList(iArr, iArr2);
        }
        return this.f23652e;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f23653f && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f23653f = z10;
        if (z10) {
            c.c(this, getMaterialThemeColorsTintList());
        } else {
            c.c(this, (ColorStateList) null);
        }
    }
}

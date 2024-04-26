package r;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.startapp.startappsdk.R;
import q.i;

/* compiled from: CardView */
public class a extends FrameLayout {

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f24436h = {16842801};

    /* renamed from: i  reason: collision with root package name */
    public static final f f24437i;

    /* renamed from: a  reason: collision with root package name */
    public boolean f24438a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f24439b;

    /* renamed from: c  reason: collision with root package name */
    public int f24440c;

    /* renamed from: d  reason: collision with root package name */
    public int f24441d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f24442e;

    /* renamed from: f  reason: collision with root package name */
    public final Rect f24443f;

    /* renamed from: g  reason: collision with root package name */
    public final e f24444g;

    /* renamed from: r.a$a  reason: collision with other inner class name */
    /* compiled from: CardView */
    public class C0230a implements e {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f24445a;

        public C0230a() {
        }

        public boolean a() {
            return a.this.getPreventCornerOverlap();
        }

        public void b(int i10, int i11, int i12, int i13) {
            a.this.f24443f.set(i10, i11, i12, i13);
            a aVar = a.this;
            Rect rect = aVar.f24442e;
            a.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f24437i = new c();
        } else {
            f24437i = new b();
        }
        f24437i.i();
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.cardViewStyle);
    }

    public ColorStateList getCardBackgroundColor() {
        return f24437i.e(this.f24444g);
    }

    public float getCardElevation() {
        return f24437i.g(this.f24444g);
    }

    public int getContentPaddingBottom() {
        return this.f24442e.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f24442e.left;
    }

    public int getContentPaddingRight() {
        return this.f24442e.right;
    }

    public int getContentPaddingTop() {
        return this.f24442e.top;
    }

    public float getMaxCardElevation() {
        return f24437i.n(this.f24444g);
    }

    public boolean getPreventCornerOverlap() {
        return this.f24439b;
    }

    public float getRadius() {
        return f24437i.h(this.f24444g);
    }

    public boolean getUseCompatPadding() {
        return this.f24438a;
    }

    public void onMeasure(int i10, int i11) {
        f fVar = f24437i;
        if (!(fVar instanceof c)) {
            int mode = View.MeasureSpec.getMode(i10);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) fVar.b(this.f24444g)), View.MeasureSpec.getSize(i10)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) fVar.c(this.f24444g)), View.MeasureSpec.getSize(i11)), mode2);
            }
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        f24437i.o(this.f24444g, ColorStateList.valueOf(i10));
    }

    public void setCardElevation(float f10) {
        f24437i.k(this.f24444g, f10);
    }

    public void setMaxCardElevation(float f10) {
        f24437i.m(this.f24444g, f10);
    }

    public void setMinimumHeight(int i10) {
        this.f24441d = i10;
        super.setMinimumHeight(i10);
    }

    public void setMinimumWidth(int i10) {
        this.f24440c = i10;
        super.setMinimumWidth(i10);
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f24439b) {
            this.f24439b = z10;
            f24437i.l(this.f24444g);
        }
    }

    public void setRadius(float f10) {
        f24437i.f(this.f24444g, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f24438a != z10) {
            this.f24438a = z10;
            f24437i.d(this.f24444g);
        }
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        int i11;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f24442e = rect;
        this.f24443f = new Rect();
        C0230a aVar = new C0230a();
        this.f24444g = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f24016a, i10, R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f24436h);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i11 = getResources().getColor(R.color.cardview_light_background);
            } else {
                i11 = getResources().getColor(R.color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(i11);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f24438a = obtainStyledAttributes.getBoolean(7, false);
        this.f24439b = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        float f10 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f24440c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f24441d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        f24437i.a(aVar, context, colorStateList, dimension, dimension2, f10);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f24437i.o(this.f24444g, colorStateList);
    }
}

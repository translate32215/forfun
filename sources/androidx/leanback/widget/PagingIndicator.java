package androidx.leanback.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.startapp.startappsdk.R;

public class PagingIndicator extends View {
    public static final TimeInterpolator E = new DecelerateInterpolator();
    public static final Property<d, Float> F;
    public static final Property<d, Float> G;
    public static final Property<d, Float> H;
    public Bitmap A;
    public Paint B;
    public final Rect C;
    public final float D;

    /* renamed from: a  reason: collision with root package name */
    public boolean f2157a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2158b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2159c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2160d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2161e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2162f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2163g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2164h;

    /* renamed from: i  reason: collision with root package name */
    public d[] f2165i;

    /* renamed from: r  reason: collision with root package name */
    public int[] f2166r;

    /* renamed from: s  reason: collision with root package name */
    public int[] f2167s;

    /* renamed from: t  reason: collision with root package name */
    public int[] f2168t;

    /* renamed from: u  reason: collision with root package name */
    public int f2169u;

    /* renamed from: v  reason: collision with root package name */
    public int f2170v;

    /* renamed from: w  reason: collision with root package name */
    public int f2171w;

    /* renamed from: x  reason: collision with root package name */
    public int f2172x;

    /* renamed from: y  reason: collision with root package name */
    public final Paint f2173y;

    /* renamed from: z  reason: collision with root package name */
    public final Paint f2174z;

    public static class a extends Property<d, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf(((d) obj).f2175a);
        }

        public void set(Object obj, Object obj2) {
            d dVar = (d) obj;
            dVar.f2175a = ((Float) obj2).floatValue();
            dVar.a();
            PagingIndicator.this.invalidate();
        }
    }

    public static class b extends Property<d, Float> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf(((d) obj).f2179e);
        }

        public void set(Object obj, Object obj2) {
            d dVar = (d) obj;
            float floatValue = ((Float) obj2).floatValue();
            dVar.f2179e = floatValue;
            float f10 = floatValue / 2.0f;
            dVar.f2180f = f10;
            PagingIndicator pagingIndicator = PagingIndicator.this;
            dVar.f2181g = f10 * pagingIndicator.D;
            pagingIndicator.invalidate();
        }
    }

    public static class c extends Property<d, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf(((d) obj).f2177c);
        }

        public void set(Object obj, Object obj2) {
            d dVar = (d) obj;
            dVar.f2177c = ((Float) obj2).floatValue() * dVar.f2182h * dVar.f2183i;
            PagingIndicator.this.invalidate();
        }
    }

    public class d {

        /* renamed from: a  reason: collision with root package name */
        public float f2175a;

        /* renamed from: b  reason: collision with root package name */
        public int f2176b;

        /* renamed from: c  reason: collision with root package name */
        public float f2177c;

        /* renamed from: d  reason: collision with root package name */
        public float f2178d;

        /* renamed from: e  reason: collision with root package name */
        public float f2179e;

        /* renamed from: f  reason: collision with root package name */
        public float f2180f;

        /* renamed from: g  reason: collision with root package name */
        public float f2181g;

        /* renamed from: h  reason: collision with root package name */
        public float f2182h = 1.0f;

        /* renamed from: i  reason: collision with root package name */
        public float f2183i;

        public d() {
            float f10 = 1.0f;
            this.f2183i = !PagingIndicator.this.f2157a ? -1.0f : f10;
        }

        public void a() {
            this.f2176b = Color.argb(Math.round(this.f2175a * 255.0f), Color.red(PagingIndicator.this.f2172x), Color.green(PagingIndicator.this.f2172x), Color.blue(PagingIndicator.this.f2172x));
        }

        public void b() {
            this.f2177c = 0.0f;
            this.f2178d = 0.0f;
            PagingIndicator pagingIndicator = PagingIndicator.this;
            this.f2179e = (float) pagingIndicator.f2158b;
            float f10 = (float) pagingIndicator.f2159c;
            this.f2180f = f10;
            this.f2181g = f10 * pagingIndicator.D;
            this.f2175a = 0.0f;
            a();
        }
    }

    static {
        Class<Float> cls = Float.class;
        F = new a(cls, "alpha");
        G = new b(cls, "diameter");
        H = new c(cls, "translation_x");
    }

    public PagingIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AnimatorSet animatorSet = new AnimatorSet();
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e1.a.f13529c, 0, 0);
        int f10 = f(obtainStyledAttributes, 6, R.dimen.lb_page_indicator_dot_radius);
        this.f2159c = f10;
        int i10 = f10 * 2;
        this.f2158b = i10;
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(2, getResources().getDimensionPixelOffset(R.dimen.lb_page_indicator_arrow_radius));
        this.f2162f = dimensionPixelOffset;
        int i11 = dimensionPixelOffset * 2;
        this.f2161e = i11;
        this.f2160d = obtainStyledAttributes.getDimensionPixelOffset(5, getResources().getDimensionPixelOffset(R.dimen.lb_page_indicator_dot_gap));
        this.f2163g = obtainStyledAttributes.getDimensionPixelOffset(4, getResources().getDimensionPixelOffset(R.dimen.lb_page_indicator_arrow_gap));
        int color = obtainStyledAttributes.getColor(3, getResources().getColor(R.color.lb_page_indicator_dot));
        Paint paint = new Paint(1);
        this.f2173y = paint;
        paint.setColor(color);
        this.f2172x = obtainStyledAttributes.getColor(0, getResources().getColor(R.color.lb_page_indicator_arrow_background));
        if (this.B == null && obtainStyledAttributes.hasValue(1)) {
            setArrowColor(obtainStyledAttributes.getColor(1, 0));
        }
        obtainStyledAttributes.recycle();
        this.f2157a = resources.getConfiguration().getLayoutDirection() == 0;
        int color2 = resources.getColor(R.color.lb_page_indicator_arrow_shadow);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.lb_page_indicator_arrow_shadow_radius);
        this.f2164h = dimensionPixelSize;
        Paint paint2 = new Paint(1);
        this.f2174z = paint2;
        float dimensionPixelSize2 = (float) resources.getDimensionPixelSize(R.dimen.lb_page_indicator_arrow_shadow_offset);
        paint2.setShadowLayer((float) dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, color2);
        this.A = g();
        this.C = new Rect(0, 0, this.A.getWidth(), this.A.getHeight());
        float f11 = (float) i11;
        this.D = ((float) this.A.getWidth()) / f11;
        AnimatorSet animatorSet2 = new AnimatorSet();
        float f12 = (float) i10;
        animatorSet2.playTogether(new Animator[]{c(0.0f, 1.0f), d(f12, f11), e()});
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(new Animator[]{c(1.0f, 0.0f), d(f11, f12), e()});
        animatorSet.playTogether(new Animator[]{animatorSet2, animatorSet3});
        setLayerType(1, (Paint) null);
    }

    private int getDesiredHeight() {
        return getPaddingBottom() + getPaddingTop() + this.f2161e + this.f2164h;
    }

    private int getDesiredWidth() {
        return getPaddingRight() + getPaddingLeft() + getRequiredWidth();
    }

    private int getRequiredWidth() {
        return ((this.f2170v - 3) * this.f2160d) + (this.f2163g * 2) + (this.f2159c * 2);
    }

    private void setSelectedPage(int i10) {
        if (i10 != this.f2171w) {
            this.f2171w = i10;
            a();
        }
    }

    public final void a() {
        int i10;
        float f10;
        int i11 = 0;
        while (true) {
            i10 = this.f2171w;
            f10 = -1.0f;
            if (i11 >= i10) {
                break;
            }
            this.f2165i[i11].b();
            d[] dVarArr = this.f2165i;
            d dVar = dVarArr[i11];
            if (i11 != 0) {
                f10 = 1.0f;
            }
            dVar.f2182h = f10;
            dVarArr[i11].f2178d = (float) this.f2167s[i11];
            i11++;
        }
        d dVar2 = this.f2165i[i10];
        dVar2.f2177c = 0.0f;
        dVar2.f2178d = 0.0f;
        PagingIndicator pagingIndicator = PagingIndicator.this;
        dVar2.f2179e = (float) pagingIndicator.f2161e;
        float f11 = (float) pagingIndicator.f2162f;
        dVar2.f2180f = f11;
        dVar2.f2181g = f11 * pagingIndicator.D;
        dVar2.f2175a = 1.0f;
        dVar2.a();
        d[] dVarArr2 = this.f2165i;
        int i12 = this.f2171w;
        d dVar3 = dVarArr2[i12];
        if (i12 <= 0) {
            f10 = 1.0f;
        }
        dVar3.f2182h = f10;
        dVarArr2[i12].f2178d = (float) this.f2166r[i12];
        while (true) {
            i12++;
            if (i12 < this.f2170v) {
                this.f2165i[i12].b();
                d[] dVarArr3 = this.f2165i;
                dVarArr3[i12].f2182h = 1.0f;
                dVarArr3[i12].f2178d = (float) this.f2168t[i12];
            } else {
                return;
            }
        }
    }

    public final void b() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int requiredWidth = getRequiredWidth();
        int i10 = (paddingLeft + width) / 2;
        int i11 = this.f2170v;
        int[] iArr = new int[i11];
        this.f2166r = iArr;
        int[] iArr2 = new int[i11];
        this.f2167s = iArr2;
        int[] iArr3 = new int[i11];
        this.f2168t = iArr3;
        int i12 = 1;
        if (this.f2157a) {
            int i13 = i10 - (requiredWidth / 2);
            int i14 = this.f2159c;
            int i15 = this.f2160d;
            int i16 = this.f2163g;
            iArr[0] = ((i13 + i14) - i15) + i16;
            iArr2[0] = i13 + i14;
            iArr3[0] = (i16 * 2) + ((i13 + i14) - (i15 * 2));
            while (i12 < this.f2170v) {
                int[] iArr4 = this.f2166r;
                int[] iArr5 = this.f2167s;
                int i17 = i12 - 1;
                int i18 = iArr5[i17];
                int i19 = this.f2163g;
                iArr4[i12] = i18 + i19;
                iArr5[i12] = iArr5[i17] + this.f2160d;
                this.f2168t[i12] = iArr4[i17] + i19;
                i12++;
            }
        } else {
            int i20 = (requiredWidth / 2) + i10;
            int i21 = this.f2159c;
            int i22 = this.f2160d;
            int i23 = this.f2163g;
            iArr[0] = ((i20 - i21) + i22) - i23;
            iArr2[0] = i20 - i21;
            iArr3[0] = ((i22 * 2) + (i20 - i21)) - (i23 * 2);
            while (i12 < this.f2170v) {
                int[] iArr6 = this.f2166r;
                int[] iArr7 = this.f2167s;
                int i24 = i12 - 1;
                int i25 = iArr7[i24];
                int i26 = this.f2163g;
                iArr6[i12] = i25 - i26;
                iArr7[i12] = iArr7[i24] - this.f2160d;
                this.f2168t[i12] = iArr6[i24] - i26;
                i12++;
            }
        }
        this.f2169u = paddingTop + this.f2162f;
        a();
    }

    public final Animator c(float f10, float f11) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, F, new float[]{f10, f11});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(E);
        return ofFloat;
    }

    public final Animator d(float f10, float f11) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, G, new float[]{f10, f11});
        ofFloat.setDuration(417);
        ofFloat.setInterpolator(E);
        return ofFloat;
    }

    public final Animator e() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, H, new float[]{(float) ((-this.f2163g) + this.f2160d), 0.0f});
        ofFloat.setDuration(417);
        ofFloat.setInterpolator(E);
        return ofFloat;
    }

    public final int f(TypedArray typedArray, int i10, int i11) {
        return typedArray.getDimensionPixelOffset(i10, getResources().getDimensionPixelOffset(i11));
    }

    public final Bitmap g() {
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.lb_ic_nav_arrow);
        if (this.f2157a) {
            return decodeResource;
        }
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(decodeResource, 0, 0, decodeResource.getWidth(), decodeResource.getHeight(), matrix, false);
    }

    public int[] getDotSelectedLeftX() {
        return this.f2167s;
    }

    public int[] getDotSelectedRightX() {
        return this.f2168t;
    }

    public int[] getDotSelectedX() {
        return this.f2166r;
    }

    public int getPageCount() {
        return this.f2170v;
    }

    public void onDraw(Canvas canvas) {
        for (int i10 = 0; i10 < this.f2170v; i10++) {
            d dVar = this.f2165i[i10];
            float f10 = dVar.f2178d + dVar.f2177c;
            PagingIndicator pagingIndicator = PagingIndicator.this;
            canvas.drawCircle(f10, (float) pagingIndicator.f2169u, dVar.f2180f, pagingIndicator.f2173y);
            if (dVar.f2175a > 0.0f) {
                PagingIndicator.this.f2174z.setColor(dVar.f2176b);
                PagingIndicator pagingIndicator2 = PagingIndicator.this;
                canvas.drawCircle(f10, (float) pagingIndicator2.f2169u, dVar.f2180f, pagingIndicator2.f2174z);
                PagingIndicator pagingIndicator3 = PagingIndicator.this;
                Bitmap bitmap = pagingIndicator3.A;
                Rect rect = pagingIndicator3.C;
                float f11 = dVar.f2181g;
                float f12 = (float) PagingIndicator.this.f2169u;
                canvas.drawBitmap(bitmap, rect, new Rect((int) (f10 - f11), (int) (f12 - f11), (int) (f10 + f11), (int) (f12 + f11)), PagingIndicator.this.B);
            }
        }
    }

    public void onMeasure(int i10, int i11) {
        int desiredHeight = getDesiredHeight();
        int mode = View.MeasureSpec.getMode(i11);
        if (mode == Integer.MIN_VALUE) {
            desiredHeight = Math.min(desiredHeight, View.MeasureSpec.getSize(i11));
        } else if (mode == 1073741824) {
            desiredHeight = View.MeasureSpec.getSize(i11);
        }
        int desiredWidth = getDesiredWidth();
        int mode2 = View.MeasureSpec.getMode(i10);
        if (mode2 == Integer.MIN_VALUE) {
            desiredWidth = Math.min(desiredWidth, View.MeasureSpec.getSize(i10));
        } else if (mode2 == 1073741824) {
            desiredWidth = View.MeasureSpec.getSize(i10);
        }
        setMeasuredDimension(desiredWidth, desiredHeight);
    }

    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = i10 == 0;
        if (this.f2157a != z10) {
            this.f2157a = z10;
            this.A = g();
            d[] dVarArr = this.f2165i;
            if (dVarArr != null) {
                for (d dVar : dVarArr) {
                    dVar.f2183i = PagingIndicator.this.f2157a ? 1.0f : -1.0f;
                }
            }
            b();
            invalidate();
        }
    }

    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        setMeasuredDimension(i10, i11);
        b();
    }

    public void setArrowBackgroundColor(int i10) {
        this.f2172x = i10;
    }

    public void setArrowColor(int i10) {
        if (this.B == null) {
            this.B = new Paint();
        }
        this.B.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
    }

    public void setDotBackgroundColor(int i10) {
        this.f2173y.setColor(i10);
    }

    public void setPageCount(int i10) {
        if (i10 > 0) {
            this.f2170v = i10;
            this.f2165i = new d[i10];
            for (int i11 = 0; i11 < this.f2170v; i11++) {
                this.f2165i[i11] = new d();
            }
            b();
            setSelectedPage(0);
            return;
        }
        throw new IllegalArgumentException("The page count should be a positive integer");
    }
}

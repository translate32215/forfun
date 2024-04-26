package c2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.a;
import g0.d;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: VectorDrawableCompat */
public class h extends g {

    /* renamed from: r  reason: collision with root package name */
    public static final PorterDuff.Mode f4066r = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    public C0058h f4067b;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuffColorFilter f4068c;

    /* renamed from: d  reason: collision with root package name */
    public ColorFilter f4069d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4070e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4071f;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f4072g;

    /* renamed from: h  reason: collision with root package name */
    public final Matrix f4073h;

    /* renamed from: i  reason: collision with root package name */
    public final Rect f4074i;

    /* compiled from: VectorDrawableCompat */
    public static class b extends f {
        public b() {
        }

        public b(b bVar) {
            super(bVar);
        }
    }

    /* compiled from: VectorDrawableCompat */
    public static abstract class e {
        public e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }

        public e(a aVar) {
        }
    }

    /* renamed from: c2.h$h  reason: collision with other inner class name */
    /* compiled from: VectorDrawableCompat */
    public static class C0058h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public int f4121a;

        /* renamed from: b  reason: collision with root package name */
        public g f4122b;

        /* renamed from: c  reason: collision with root package name */
        public ColorStateList f4123c;

        /* renamed from: d  reason: collision with root package name */
        public PorterDuff.Mode f4124d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f4125e;

        /* renamed from: f  reason: collision with root package name */
        public Bitmap f4126f;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f4127g;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f4128h;

        /* renamed from: i  reason: collision with root package name */
        public int f4129i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f4130j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f4131k;

        /* renamed from: l  reason: collision with root package name */
        public Paint f4132l;

        public C0058h(C0058h hVar) {
            this.f4123c = null;
            this.f4124d = h.f4066r;
            if (hVar != null) {
                this.f4121a = hVar.f4121a;
                g gVar = new g(hVar.f4122b);
                this.f4122b = gVar;
                if (hVar.f4122b.f4109e != null) {
                    gVar.f4109e = new Paint(hVar.f4122b.f4109e);
                }
                if (hVar.f4122b.f4108d != null) {
                    this.f4122b.f4108d = new Paint(hVar.f4122b.f4108d);
                }
                this.f4123c = hVar.f4123c;
                this.f4124d = hVar.f4124d;
                this.f4125e = hVar.f4125e;
            }
        }

        public boolean a() {
            g gVar = this.f4122b;
            if (gVar.f4119o == null) {
                gVar.f4119o = Boolean.valueOf(gVar.f4112h.a());
            }
            return gVar.f4119o.booleanValue();
        }

        public void b(int i10, int i11) {
            this.f4126f.eraseColor(0);
            Canvas canvas = new Canvas(this.f4126f);
            g gVar = this.f4122b;
            gVar.a(gVar.f4112h, g.f4104q, canvas, i10, i11, (ColorFilter) null);
        }

        public int getChangingConfigurations() {
            return this.f4121a;
        }

        public Drawable newDrawable() {
            return new h(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new h(this);
        }

        public C0058h() {
            this.f4123c = null;
            this.f4124d = h.f4066r;
            this.f4122b = new g();
        }
    }

    public h() {
        this.f4071f = true;
        this.f4072g = new float[9];
        this.f4073h = new Matrix();
        this.f4074i = new Rect();
        this.f4067b = new C0058h();
    }

    public static h a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = new h();
        hVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hVar;
    }

    public PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f4065a;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.b(drawable);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d3, code lost:
        if ((r1 == r7.getWidth() && r3 == r6.f4126f.getHeight()) == false) goto L_0x00d5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            android.graphics.drawable.Drawable r0 = r10.f4065a
            if (r0 == 0) goto L_0x0008
            r0.draw(r11)
            return
        L_0x0008:
            android.graphics.Rect r0 = r10.f4074i
            r10.copyBounds(r0)
            android.graphics.Rect r0 = r10.f4074i
            int r0 = r0.width()
            if (r0 <= 0) goto L_0x016b
            android.graphics.Rect r0 = r10.f4074i
            int r0 = r0.height()
            if (r0 > 0) goto L_0x001f
            goto L_0x016b
        L_0x001f:
            android.graphics.ColorFilter r0 = r10.f4069d
            if (r0 != 0) goto L_0x0025
            android.graphics.PorterDuffColorFilter r0 = r10.f4068c
        L_0x0025:
            android.graphics.Matrix r1 = r10.f4073h
            r11.getMatrix(r1)
            android.graphics.Matrix r1 = r10.f4073h
            float[] r2 = r10.f4072g
            r1.getValues(r2)
            float[] r1 = r10.f4072g
            r2 = 0
            r1 = r1[r2]
            float r1 = java.lang.Math.abs(r1)
            float[] r3 = r10.f4072g
            r4 = 4
            r3 = r3[r4]
            float r3 = java.lang.Math.abs(r3)
            float[] r4 = r10.f4072g
            r5 = 1
            r4 = r4[r5]
            float r4 = java.lang.Math.abs(r4)
            float[] r6 = r10.f4072g
            r7 = 3
            r6 = r6[r7]
            float r6 = java.lang.Math.abs(r6)
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0060
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0064
        L_0x0060:
            r1 = 1065353216(0x3f800000, float:1.0)
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x0064:
            android.graphics.Rect r4 = r10.f4074i
            int r4 = r4.width()
            float r4 = (float) r4
            float r4 = r4 * r1
            int r1 = (int) r4
            android.graphics.Rect r4 = r10.f4074i
            int r4 = r4.height()
            float r4 = (float) r4
            float r4 = r4 * r3
            int r3 = (int) r4
            r4 = 2048(0x800, float:2.87E-42)
            int r1 = java.lang.Math.min(r4, r1)
            int r3 = java.lang.Math.min(r4, r3)
            if (r1 <= 0) goto L_0x016b
            if (r3 > 0) goto L_0x0088
            goto L_0x016b
        L_0x0088:
            int r4 = r11.save()
            android.graphics.Rect r6 = r10.f4074i
            int r9 = r6.left
            float r9 = (float) r9
            int r6 = r6.top
            float r6 = (float) r6
            r11.translate(r9, r6)
            boolean r6 = r10.isAutoMirrored()
            if (r6 == 0) goto L_0x00a5
            int r6 = androidx.core.graphics.drawable.a.e(r10)
            if (r6 != r5) goto L_0x00a5
            r6 = 1
            goto L_0x00a6
        L_0x00a5:
            r6 = 0
        L_0x00a6:
            if (r6 == 0) goto L_0x00b7
            android.graphics.Rect r6 = r10.f4074i
            int r6 = r6.width()
            float r6 = (float) r6
            r11.translate(r6, r8)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11.scale(r6, r7)
        L_0x00b7:
            android.graphics.Rect r6 = r10.f4074i
            r6.offsetTo(r2, r2)
            c2.h$h r6 = r10.f4067b
            android.graphics.Bitmap r7 = r6.f4126f
            if (r7 == 0) goto L_0x00d5
            int r7 = r7.getWidth()
            if (r1 != r7) goto L_0x00d2
            android.graphics.Bitmap r7 = r6.f4126f
            int r7 = r7.getHeight()
            if (r3 != r7) goto L_0x00d2
            r7 = 1
            goto L_0x00d3
        L_0x00d2:
            r7 = 0
        L_0x00d3:
            if (r7 != 0) goto L_0x00df
        L_0x00d5:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r1, r3, r7)
            r6.f4126f = r7
            r6.f4131k = r5
        L_0x00df:
            boolean r6 = r10.f4071f
            if (r6 != 0) goto L_0x00e9
            c2.h$h r6 = r10.f4067b
            r6.b(r1, r3)
            goto L_0x012d
        L_0x00e9:
            c2.h$h r6 = r10.f4067b
            boolean r7 = r6.f4131k
            if (r7 != 0) goto L_0x010d
            android.content.res.ColorStateList r7 = r6.f4127g
            android.content.res.ColorStateList r8 = r6.f4123c
            if (r7 != r8) goto L_0x010d
            android.graphics.PorterDuff$Mode r7 = r6.f4128h
            android.graphics.PorterDuff$Mode r8 = r6.f4124d
            if (r7 != r8) goto L_0x010d
            boolean r7 = r6.f4130j
            boolean r8 = r6.f4125e
            if (r7 != r8) goto L_0x010d
            int r7 = r6.f4129i
            c2.h$g r6 = r6.f4122b
            int r6 = r6.getRootAlpha()
            if (r7 != r6) goto L_0x010d
            r6 = 1
            goto L_0x010e
        L_0x010d:
            r6 = 0
        L_0x010e:
            if (r6 != 0) goto L_0x012d
            c2.h$h r6 = r10.f4067b
            r6.b(r1, r3)
            c2.h$h r1 = r10.f4067b
            android.content.res.ColorStateList r3 = r1.f4123c
            r1.f4127g = r3
            android.graphics.PorterDuff$Mode r3 = r1.f4124d
            r1.f4128h = r3
            c2.h$g r3 = r1.f4122b
            int r3 = r3.getRootAlpha()
            r1.f4129i = r3
            boolean r3 = r1.f4125e
            r1.f4130j = r3
            r1.f4131k = r2
        L_0x012d:
            c2.h$h r1 = r10.f4067b
            android.graphics.Rect r3 = r10.f4074i
            c2.h$g r6 = r1.f4122b
            int r6 = r6.getRootAlpha()
            r7 = 255(0xff, float:3.57E-43)
            if (r6 >= r7) goto L_0x013c
            r2 = 1
        L_0x013c:
            r6 = 0
            if (r2 != 0) goto L_0x0143
            if (r0 != 0) goto L_0x0143
            r0 = r6
            goto L_0x0163
        L_0x0143:
            android.graphics.Paint r2 = r1.f4132l
            if (r2 != 0) goto L_0x0151
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r1.f4132l = r2
            r2.setFilterBitmap(r5)
        L_0x0151:
            android.graphics.Paint r2 = r1.f4132l
            c2.h$g r5 = r1.f4122b
            int r5 = r5.getRootAlpha()
            r2.setAlpha(r5)
            android.graphics.Paint r2 = r1.f4132l
            r2.setColorFilter(r0)
            android.graphics.Paint r0 = r1.f4132l
        L_0x0163:
            android.graphics.Bitmap r1 = r1.f4126f
            r11.drawBitmap(r1, r6, r3, r0)
            r11.restoreToCount(r4)
        L_0x016b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.h.draw(android.graphics.Canvas):void");
    }

    public int getAlpha() {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.d(drawable);
        }
        return this.f4067b.f4122b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f4067b.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f4065a;
        if (drawable == null) {
            return this.f4069d;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return a.b.c(drawable);
        }
        return null;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f4065a != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f4065a.getConstantState());
        }
        this.f4067b.f4121a = getChangingConfigurations();
        return this.f4067b;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f4067b.f4122b.f4114j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f4067b.f4122b.f4113i;
    }

    public int getOpacity() {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void invalidateSelf() {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.f(drawable);
        }
        return this.f4067b.f4125e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.f4067b.f4123c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.f4067b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f4065a
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            c2.h$h r0 = r1.f4067b
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x0028
            c2.h$h r0 = r1.f4067b
            android.content.res.ColorStateList r0 = r0.f4123c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.h.isStateful():boolean");
    }

    public Drawable mutate() {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f4070e && super.mutate() == this) {
            this.f4067b = new C0058h(this.f4067b);
            this.f4070e = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z10 = false;
        C0058h hVar = this.f4067b;
        ColorStateList colorStateList = hVar.f4123c;
        if (!(colorStateList == null || (mode = hVar.f4124d) == null)) {
            this.f4068c = b(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (hVar.a()) {
            boolean b10 = hVar.f4122b.f4112h.b(iArr);
            hVar.f4131k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    public void setAlpha(int i10) {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f4067b.f4122b.getRootAlpha() != i10) {
            this.f4067b.f4122b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, z10);
        } else {
            this.f4067b.f4125e = z10;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f4069d = colorFilter;
        invalidateSelf();
    }

    public void setTint(int i10) {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.l(drawable, colorStateList);
            return;
        }
        C0058h hVar = this.f4067b;
        if (hVar.f4123c != colorStateList) {
            hVar.f4123c = colorStateList;
            this.f4068c = b(colorStateList, hVar.f4124d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m(drawable, mode);
            return;
        }
        C0058h hVar = this.f4067b;
        if (hVar.f4124d != mode) {
            hVar.f4124d = mode;
            this.f4068c = b(hVar.f4123c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        return super.setVisible(z10, z11);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: VectorDrawableCompat */
    public static class i extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f4133a;

        public i(Drawable.ConstantState constantState) {
            this.f4133a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f4133a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f4133a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            h hVar = new h();
            hVar.f4065a = (VectorDrawable) this.f4133a.newDrawable();
            return hVar;
        }

        public Drawable newDrawable(Resources resources) {
            h hVar = new h();
            hVar.f4065a = (VectorDrawable) this.f4133a.newDrawable(resources);
            return hVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            h hVar = new h();
            hVar.f4065a = (VectorDrawable) this.f4133a.newDrawable(resources, theme);
            return hVar;
        }
    }

    /* compiled from: VectorDrawableCompat */
    public static abstract class f extends e {

        /* renamed from: a  reason: collision with root package name */
        public d.a[] f4100a = null;

        /* renamed from: b  reason: collision with root package name */
        public String f4101b;

        /* renamed from: c  reason: collision with root package name */
        public int f4102c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f4103d;

        public f() {
            super((a) null);
        }

        public d.a[] getPathData() {
            return this.f4100a;
        }

        public String getPathName() {
            return this.f4101b;
        }

        public void setPathData(d.a[] aVarArr) {
            if (!g0.d.a(this.f4100a, aVarArr)) {
                this.f4100a = g0.d.e(aVarArr);
                return;
            }
            d.a[] aVarArr2 = this.f4100a;
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                aVarArr2[i10].f18360a = aVarArr[i10].f18360a;
                for (int i11 = 0; i11 < aVarArr[i10].f18361b.length; i11++) {
                    aVarArr2[i10].f18361b[i11] = aVarArr[i10].f18361b[i11];
                }
            }
        }

        public f(f fVar) {
            super((a) null);
            this.f4101b = fVar.f4101b;
            this.f4103d = fVar.f4103d;
            this.f4100a = g0.d.e(fVar.f4100a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:203:0x04e6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void inflate(android.content.res.Resources r28, org.xmlpull.v1.XmlPullParser r29, android.util.AttributeSet r30, android.content.res.Resources.Theme r31) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            r9 = r29
            r10 = r30
            r11 = r31
            android.graphics.drawable.Drawable r0 = r1.f4065a
            if (r0 == 0) goto L_0x001c
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r3 < r4) goto L_0x0018
            androidx.core.graphics.drawable.a.b.d(r0, r2, r9, r10, r11)
            goto L_0x001b
        L_0x0018:
            r0.inflate(r2, r9, r10)
        L_0x001b:
            return
        L_0x001c:
            c2.h$h r12 = r1.f4067b
            c2.h$g r0 = new c2.h$g
            r0.<init>()
            r12.f4122b = r0
            int[] r0 = c2.a.f4038a
            android.content.res.TypedArray r3 = f0.m.d(r2, r11, r10, r0)
            c2.h$h r4 = r1.f4067b
            c2.h$g r5 = r4.f4122b
            java.lang.String r0 = "tintMode"
            boolean r0 = f0.m.c(r9, r0)
            r13 = 6
            r14 = -1
            if (r0 != 0) goto L_0x003b
            r0 = -1
            goto L_0x003f
        L_0x003b:
            int r0 = r3.getInt(r13, r14)
        L_0x003f:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_IN
            r15 = 9
            r8 = 5
            r7 = 3
            if (r0 == r7) goto L_0x005b
            if (r0 == r8) goto L_0x005d
            if (r0 == r15) goto L_0x0058
            switch(r0) {
                case 14: goto L_0x0055;
                case 15: goto L_0x0052;
                case 16: goto L_0x004f;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x005d
        L_0x004f:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.ADD
            goto L_0x005d
        L_0x0052:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SCREEN
            goto L_0x005d
        L_0x0055:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x005d
        L_0x0058:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_ATOP
            goto L_0x005d
        L_0x005b:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_OVER
        L_0x005d:
            r4.f4124d = r6
            java.lang.String r0 = "tint"
            boolean r0 = f0.m.c(r9, r0)
            r13 = 0
            r15 = 1
            r14 = 2
            if (r0 == 0) goto L_0x00c0
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r3.getValue(r15, r0)
            int r6 = r0.type
            if (r6 == r14) goto L_0x00a1
            r14 = 28
            if (r6 < r14) goto L_0x0085
            r14 = 31
            if (r6 > r14) goto L_0x0085
            int r0 = r0.data
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            goto L_0x00c1
        L_0x0085:
            android.content.res.Resources r0 = r3.getResources()
            int r6 = r3.getResourceId(r15, r13)
            java.lang.ThreadLocal<android.util.TypedValue> r14 = f0.c.f18029a
            android.content.res.XmlResourceParser r6 = r0.getXml(r6)     // Catch:{ Exception -> 0x0098 }
            android.content.res.ColorStateList r0 = f0.c.a(r0, r6, r11)     // Catch:{ Exception -> 0x0098 }
            goto L_0x00c1
        L_0x0098:
            r0 = move-exception
            java.lang.String r6 = "CSLCompat"
            java.lang.String r14 = "Failed to inflate ColorStateList."
            android.util.Log.e(r6, r14, r0)
            goto L_0x00c0
        L_0x00a1:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to resolve attribute at index "
            r3.append(r4)
            r3.append(r15)
            java.lang.String r4 = ": "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x00c0:
            r0 = 0
        L_0x00c1:
            if (r0 == 0) goto L_0x00c5
            r4.f4123c = r0
        L_0x00c5:
            boolean r0 = r4.f4125e
            java.lang.String r6 = "autoMirrored"
            boolean r6 = f0.m.c(r9, r6)
            if (r6 != 0) goto L_0x00d0
            goto L_0x00d4
        L_0x00d0:
            boolean r0 = r3.getBoolean(r8, r0)
        L_0x00d4:
            r4.f4125e = r0
            float r0 = r5.f4115k
            java.lang.String r4 = "viewportWidth"
            boolean r4 = f0.m.c(r9, r4)
            r14 = 7
            if (r4 != 0) goto L_0x00e2
            goto L_0x00e6
        L_0x00e2:
            float r0 = r3.getFloat(r14, r0)
        L_0x00e6:
            r5.f4115k = r0
            float r0 = r5.f4116l
            java.lang.String r4 = "viewportHeight"
            boolean r4 = f0.m.c(r9, r4)
            r6 = 8
            if (r4 != 0) goto L_0x00f5
            goto L_0x00f9
        L_0x00f5:
            float r0 = r3.getFloat(r6, r0)
        L_0x00f9:
            r5.f4116l = r0
            float r4 = r5.f4115k
            r19 = 0
            int r4 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r4 <= 0) goto L_0x04e6
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x04ca
            float r0 = r5.f4113i
            float r0 = r3.getDimension(r7, r0)
            r5.f4113i = r0
            float r0 = r5.f4114j
            r4 = 2
            float r0 = r3.getDimension(r4, r0)
            r5.f4114j = r0
            float r4 = r5.f4113i
            int r4 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r4 <= 0) goto L_0x04ae
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x0492
            float r0 = r5.getAlpha()
            java.lang.String r4 = "alpha"
            boolean r4 = f0.m.c(r9, r4)
            r14 = 4
            if (r4 != 0) goto L_0x0130
            goto L_0x0134
        L_0x0130:
            float r0 = r3.getFloat(r14, r0)
        L_0x0134:
            r5.setAlpha(r0)
            java.lang.String r0 = r3.getString(r13)
            if (r0 == 0) goto L_0x0144
            r5.f4118n = r0
            s.a<java.lang.String, java.lang.Object> r4 = r5.f4120p
            r4.put(r0, r5)
        L_0x0144:
            r3.recycle()
            int r0 = r27.getChangingConfigurations()
            r12.f4121a = r0
            r12.f4131k = r15
            c2.h$h r0 = r1.f4067b
            c2.h$g r5 = r0.f4122b
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            c2.h$d r3 = r5.f4112h
            r4.push(r3)
            int r3 = r29.getEventType()
            int r20 = r29.getDepth()
            int r14 = r20 + 1
            r20 = 1
        L_0x0169:
            if (r3 == r15) goto L_0x0479
            int r6 = r29.getDepth()
            if (r6 >= r14) goto L_0x0173
            if (r3 == r7) goto L_0x0479
        L_0x0173:
            java.lang.String r6 = "group"
            r7 = 2
            if (r3 != r7) goto L_0x044a
            java.lang.String r3 = r29.getName()
            java.lang.Object r7 = r4.peek()
            c2.h$d r7 = (c2.h.d) r7
            java.lang.String r8 = "path"
            boolean r8 = r8.equals(r3)
            java.lang.String r15 = "fillType"
            java.lang.String r13 = "pathData"
            if (r8 == 0) goto L_0x0320
            c2.h$c r8 = new c2.h$c
            r8.<init>()
            int[] r3 = c2.a.f4040c
            android.content.res.TypedArray r6 = f0.m.d(r2, r11, r10, r3)
            r3 = 0
            r8.f4075e = r3
            boolean r13 = f0.m.c(r9, r13)
            if (r13 != 0) goto L_0x01b3
            r24 = r4
            r25 = r5
            r1 = r6
            r13 = r8
            r18 = r14
            r17 = -1
            r21 = 8
            r22 = 9
            r14 = r7
            goto L_0x02f2
        L_0x01b3:
            r13 = 0
            java.lang.String r3 = r6.getString(r13)
            if (r3 == 0) goto L_0x01bc
            r8.f4101b = r3
        L_0x01bc:
            r3 = 2
            java.lang.String r13 = r6.getString(r3)
            if (r13 == 0) goto L_0x01c9
            g0.d$a[] r3 = g0.d.c(r13)
            r8.f4100a = r3
        L_0x01c9:
            r13 = 1
            r20 = 0
            java.lang.String r23 = "fillColor"
            r18 = 0
            r3 = r6
            r24 = r4
            r4 = r29
            r25 = r5
            r5 = r31
            r26 = r6
            r6 = r23
            r18 = r14
            r1 = 3
            r14 = r7
            r7 = r13
            r13 = r8
            r1 = 5
            r8 = r20
            f0.d r3 = f0.m.a(r3, r4, r5, r6, r7, r8)
            r13.f4078h = r3
            r3 = 12
            float r4 = r13.f4080j
            java.lang.String r5 = "fillAlpha"
            boolean r5 = f0.m.c(r9, r5)
            if (r5 != 0) goto L_0x01fb
            r8 = r26
            goto L_0x0201
        L_0x01fb:
            r8 = r26
            float r4 = r8.getFloat(r3, r4)
        L_0x0201:
            r13.f4080j = r4
            java.lang.String r3 = "strokeLineCap"
            boolean r3 = f0.m.c(r9, r3)
            if (r3 != 0) goto L_0x020f
            r3 = -1
            r7 = 8
            goto L_0x0217
        L_0x020f:
            r3 = -1
            r7 = 8
            int r4 = r8.getInt(r7, r3)
            r3 = r4
        L_0x0217:
            android.graphics.Paint$Cap r4 = r13.f4084n
            if (r3 == 0) goto L_0x0228
            r5 = 1
            if (r3 == r5) goto L_0x0225
            r5 = 2
            if (r3 == r5) goto L_0x0222
            goto L_0x022a
        L_0x0222:
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.SQUARE
            goto L_0x022a
        L_0x0225:
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.ROUND
            goto L_0x022a
        L_0x0228:
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.BUTT
        L_0x022a:
            r13.f4084n = r4
            java.lang.String r3 = "strokeLineJoin"
            boolean r3 = f0.m.c(r9, r3)
            if (r3 != 0) goto L_0x0239
            r3 = -1
            r5 = -1
            r6 = 9
            goto L_0x0240
        L_0x0239:
            r5 = -1
            r6 = 9
            int r3 = r8.getInt(r6, r5)
        L_0x0240:
            android.graphics.Paint$Join r4 = r13.f4085o
            if (r3 == 0) goto L_0x0251
            r5 = 1
            if (r3 == r5) goto L_0x024e
            r5 = 2
            if (r3 == r5) goto L_0x024b
            goto L_0x0253
        L_0x024b:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.BEVEL
            goto L_0x0253
        L_0x024e:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.ROUND
            goto L_0x0253
        L_0x0251:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.MITER
        L_0x0253:
            r13.f4085o = r4
            r3 = 10
            float r4 = r13.f4086p
            java.lang.String r5 = "strokeMiterLimit"
            boolean r5 = f0.m.c(r9, r5)
            if (r5 != 0) goto L_0x0262
            goto L_0x0266
        L_0x0262:
            float r4 = r8.getFloat(r3, r4)
        L_0x0266:
            r13.f4086p = r4
            r16 = 3
            r20 = 0
            java.lang.String r21 = "strokeColor"
            r3 = r8
            r4 = r29
            r17 = -1
            r5 = r31
            r22 = 9
            r6 = r21
            r21 = 8
            r7 = r16
            r1 = r8
            r8 = r20
            f0.d r3 = f0.m.a(r3, r4, r5, r6, r7, r8)
            r13.f4076f = r3
            r3 = 11
            float r4 = r13.f4079i
            java.lang.String r5 = "strokeAlpha"
            boolean r5 = f0.m.c(r9, r5)
            if (r5 != 0) goto L_0x0293
            goto L_0x0297
        L_0x0293:
            float r4 = r1.getFloat(r3, r4)
        L_0x0297:
            r13.f4079i = r4
            float r3 = r13.f4077g
            java.lang.String r4 = "strokeWidth"
            boolean r4 = f0.m.c(r9, r4)
            if (r4 != 0) goto L_0x02a4
            goto L_0x02a9
        L_0x02a4:
            r4 = 4
            float r3 = r1.getFloat(r4, r3)
        L_0x02a9:
            r13.f4077g = r3
            float r3 = r13.f4082l
            java.lang.String r4 = "trimPathEnd"
            boolean r4 = f0.m.c(r9, r4)
            if (r4 != 0) goto L_0x02b6
            goto L_0x02bb
        L_0x02b6:
            r4 = 6
            float r3 = r1.getFloat(r4, r3)
        L_0x02bb:
            r13.f4082l = r3
            float r3 = r13.f4083m
            java.lang.String r4 = "trimPathOffset"
            boolean r4 = f0.m.c(r9, r4)
            if (r4 != 0) goto L_0x02c8
            goto L_0x02cd
        L_0x02c8:
            r4 = 7
            float r3 = r1.getFloat(r4, r3)
        L_0x02cd:
            r13.f4083m = r3
            float r3 = r13.f4081k
            java.lang.String r4 = "trimPathStart"
            boolean r4 = f0.m.c(r9, r4)
            if (r4 != 0) goto L_0x02da
            goto L_0x02df
        L_0x02da:
            r4 = 5
            float r3 = r1.getFloat(r4, r3)
        L_0x02df:
            r13.f4081k = r3
            r3 = 13
            int r4 = r13.f4102c
            boolean r5 = f0.m.c(r9, r15)
            if (r5 != 0) goto L_0x02ec
            goto L_0x02f0
        L_0x02ec:
            int r4 = r1.getInt(r3, r4)
        L_0x02f0:
            r13.f4102c = r4
        L_0x02f2:
            r1.recycle()
            java.util.ArrayList<c2.h$e> r1 = r14.f4088b
            r1.add(r13)
            java.lang.String r1 = r13.getPathName()
            if (r1 == 0) goto L_0x030c
            r1 = r25
            s.a<java.lang.String, java.lang.Object> r3 = r1.f4120p
            java.lang.String r4 = r13.getPathName()
            r3.put(r4, r13)
            goto L_0x030e
        L_0x030c:
            r1 = r25
        L_0x030e:
            int r3 = r0.f4121a
            int r4 = r13.f4103d
            r3 = r3 | r4
            r0.f4121a = r3
            r4 = r24
            r6 = 0
            r7 = 5
            r8 = 1
            r13 = 2
            r15 = 4
            r20 = 0
            goto L_0x0447
        L_0x0320:
            r24 = r4
            r1 = r5
            r18 = r14
            r17 = -1
            r21 = 8
            r22 = 9
            r14 = r7
            java.lang.String r4 = "clip-path"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x038c
            c2.h$b r3 = new c2.h$b
            r3.<init>()
            boolean r4 = f0.m.c(r9, r13)
            if (r4 != 0) goto L_0x0340
            goto L_0x036f
        L_0x0340:
            int[] r4 = c2.a.f4041d
            android.content.res.TypedArray r4 = f0.m.d(r2, r11, r10, r4)
            r5 = 0
            java.lang.String r6 = r4.getString(r5)
            if (r6 == 0) goto L_0x034f
            r3.f4101b = r6
        L_0x034f:
            r5 = 1
            java.lang.String r6 = r4.getString(r5)
            if (r6 == 0) goto L_0x035c
            g0.d$a[] r5 = g0.d.c(r6)
            r3.f4100a = r5
        L_0x035c:
            boolean r5 = f0.m.c(r9, r15)
            if (r5 != 0) goto L_0x0364
            r13 = 0
            goto L_0x036a
        L_0x0364:
            r5 = 0
            r6 = 2
            int r13 = r4.getInt(r6, r5)
        L_0x036a:
            r3.f4102c = r13
            r4.recycle()
        L_0x036f:
            java.util.ArrayList<c2.h$e> r4 = r14.f4088b
            r4.add(r3)
            java.lang.String r4 = r3.getPathName()
            if (r4 == 0) goto L_0x0383
            s.a<java.lang.String, java.lang.Object> r4 = r1.f4120p
            java.lang.String r5 = r3.getPathName()
            r4.put(r5, r3)
        L_0x0383:
            int r4 = r0.f4121a
            int r3 = r3.f4103d
            r3 = r3 | r4
            r0.f4121a = r3
            goto L_0x0440
        L_0x038c:
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0440
            c2.h$d r3 = new c2.h$d
            r3.<init>()
            int[] r4 = c2.a.f4039b
            android.content.res.TypedArray r4 = f0.m.d(r2, r11, r10, r4)
            r5 = 0
            r3.f4098l = r5
            float r6 = r3.f4089c
            java.lang.String r7 = "rotation"
            boolean r7 = f0.m.c(r9, r7)
            if (r7 != 0) goto L_0x03ac
            r7 = 5
            goto L_0x03b1
        L_0x03ac:
            r7 = 5
            float r6 = r4.getFloat(r7, r6)
        L_0x03b1:
            r3.f4089c = r6
            float r6 = r3.f4090d
            r8 = 1
            float r6 = r4.getFloat(r8, r6)
            r3.f4090d = r6
            float r6 = r3.f4091e
            r13 = 2
            float r6 = r4.getFloat(r13, r6)
            r3.f4091e = r6
            float r6 = r3.f4092f
            java.lang.String r15 = "scaleX"
            boolean r15 = f0.m.c(r9, r15)
            if (r15 != 0) goto L_0x03d0
            goto L_0x03d5
        L_0x03d0:
            r15 = 3
            float r6 = r4.getFloat(r15, r6)
        L_0x03d5:
            r3.f4092f = r6
            float r6 = r3.f4093g
            java.lang.String r15 = "scaleY"
            boolean r15 = f0.m.c(r9, r15)
            if (r15 != 0) goto L_0x03e3
            r15 = 4
            goto L_0x03e8
        L_0x03e3:
            r15 = 4
            float r6 = r4.getFloat(r15, r6)
        L_0x03e8:
            r3.f4093g = r6
            float r6 = r3.f4094h
            java.lang.String r5 = "translateX"
            boolean r5 = f0.m.c(r9, r5)
            if (r5 != 0) goto L_0x03f6
            r5 = 6
            goto L_0x03fb
        L_0x03f6:
            r5 = 6
            float r6 = r4.getFloat(r5, r6)
        L_0x03fb:
            r3.f4094h = r6
            float r6 = r3.f4095i
            java.lang.String r5 = "translateY"
            boolean r5 = f0.m.c(r9, r5)
            if (r5 != 0) goto L_0x0409
            r5 = 7
            goto L_0x040e
        L_0x0409:
            r5 = 7
            float r6 = r4.getFloat(r5, r6)
        L_0x040e:
            r3.f4095i = r6
            r6 = 0
            java.lang.String r5 = r4.getString(r6)
            if (r5 == 0) goto L_0x0419
            r3.f4099m = r5
        L_0x0419:
            r3.c()
            r4.recycle()
            java.util.ArrayList<c2.h$e> r4 = r14.f4088b
            r4.add(r3)
            r4 = r24
            r4.push(r3)
            java.lang.String r5 = r3.getGroupName()
            if (r5 == 0) goto L_0x0438
            s.a<java.lang.String, java.lang.Object> r5 = r1.f4120p
            java.lang.String r14 = r3.getGroupName()
            r5.put(r14, r3)
        L_0x0438:
            int r5 = r0.f4121a
            int r3 = r3.f4097k
            r3 = r3 | r5
            r0.f4121a = r3
            goto L_0x0447
        L_0x0440:
            r4 = r24
            r6 = 0
            r7 = 5
            r8 = 1
            r13 = 2
            r15 = 4
        L_0x0447:
            r5 = 3
            r14 = 0
            goto L_0x0468
        L_0x044a:
            r1 = r5
            r18 = r14
            r5 = 3
            r7 = 5
            r8 = 1
            r13 = 2
            r14 = 0
            r15 = 4
            r17 = -1
            r21 = 8
            r22 = 9
            if (r3 != r5) goto L_0x0468
            java.lang.String r3 = r29.getName()
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0468
            r4.pop()
        L_0x0468:
            int r3 = r29.next()
            r6 = 8
            r7 = 3
            r8 = 5
            r13 = 0
            r15 = 1
            r5 = r1
            r14 = r18
            r1 = r27
            goto L_0x0169
        L_0x0479:
            if (r20 != 0) goto L_0x0488
            android.content.res.ColorStateList r0 = r12.f4123c
            android.graphics.PorterDuff$Mode r1 = r12.f4124d
            r2 = r27
            android.graphics.PorterDuffColorFilter r0 = r2.b(r0, r1)
            r2.f4068c = r0
            return
        L_0x0488:
            r2 = r27
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "no path defined"
            r0.<init>(r1)
            throw r0
        L_0x0492:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires height > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x04ae:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires width > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x04ca:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportHeight > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x04e6:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportWidth > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            goto L_0x0503
        L_0x0502:
            throw r0
        L_0x0503:
            goto L_0x0502
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.h.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public h(C0058h hVar) {
        this.f4071f = true;
        this.f4072g = new float[9];
        this.f4073h = new Matrix();
        this.f4074i = new Rect();
        this.f4067b = hVar;
        this.f4068c = b(hVar.f4123c, hVar.f4124d);
    }

    /* compiled from: VectorDrawableCompat */
    public static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        public int[] f4075e;

        /* renamed from: f  reason: collision with root package name */
        public f0.d f4076f;

        /* renamed from: g  reason: collision with root package name */
        public float f4077g = 0.0f;

        /* renamed from: h  reason: collision with root package name */
        public f0.d f4078h;

        /* renamed from: i  reason: collision with root package name */
        public float f4079i = 1.0f;

        /* renamed from: j  reason: collision with root package name */
        public float f4080j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f4081k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f4082l = 1.0f;

        /* renamed from: m  reason: collision with root package name */
        public float f4083m = 0.0f;

        /* renamed from: n  reason: collision with root package name */
        public Paint.Cap f4084n = Paint.Cap.BUTT;

        /* renamed from: o  reason: collision with root package name */
        public Paint.Join f4085o = Paint.Join.MITER;

        /* renamed from: p  reason: collision with root package name */
        public float f4086p = 4.0f;

        public c() {
        }

        public boolean a() {
            return this.f4078h.c() || this.f4076f.c();
        }

        public boolean b(int[] iArr) {
            return this.f4076f.d(iArr) | this.f4078h.d(iArr);
        }

        public float getFillAlpha() {
            return this.f4080j;
        }

        public int getFillColor() {
            return this.f4078h.f18032c;
        }

        public float getStrokeAlpha() {
            return this.f4079i;
        }

        public int getStrokeColor() {
            return this.f4076f.f18032c;
        }

        public float getStrokeWidth() {
            return this.f4077g;
        }

        public float getTrimPathEnd() {
            return this.f4082l;
        }

        public float getTrimPathOffset() {
            return this.f4083m;
        }

        public float getTrimPathStart() {
            return this.f4081k;
        }

        public void setFillAlpha(float f10) {
            this.f4080j = f10;
        }

        public void setFillColor(int i10) {
            this.f4078h.f18032c = i10;
        }

        public void setStrokeAlpha(float f10) {
            this.f4079i = f10;
        }

        public void setStrokeColor(int i10) {
            this.f4076f.f18032c = i10;
        }

        public void setStrokeWidth(float f10) {
            this.f4077g = f10;
        }

        public void setTrimPathEnd(float f10) {
            this.f4082l = f10;
        }

        public void setTrimPathOffset(float f10) {
            this.f4083m = f10;
        }

        public void setTrimPathStart(float f10) {
            this.f4081k = f10;
        }

        public c(c cVar) {
            super(cVar);
            this.f4075e = cVar.f4075e;
            this.f4076f = cVar.f4076f;
            this.f4077g = cVar.f4077g;
            this.f4079i = cVar.f4079i;
            this.f4078h = cVar.f4078h;
            this.f4102c = cVar.f4102c;
            this.f4080j = cVar.f4080j;
            this.f4081k = cVar.f4081k;
            this.f4082l = cVar.f4082l;
            this.f4083m = cVar.f4083m;
            this.f4084n = cVar.f4084n;
            this.f4085o = cVar.f4085o;
            this.f4086p = cVar.f4086p;
        }
    }

    /* compiled from: VectorDrawableCompat */
    public static class g {

        /* renamed from: q  reason: collision with root package name */
        public static final Matrix f4104q = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        public final Path f4105a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f4106b;

        /* renamed from: c  reason: collision with root package name */
        public final Matrix f4107c;

        /* renamed from: d  reason: collision with root package name */
        public Paint f4108d;

        /* renamed from: e  reason: collision with root package name */
        public Paint f4109e;

        /* renamed from: f  reason: collision with root package name */
        public PathMeasure f4110f;

        /* renamed from: g  reason: collision with root package name */
        public int f4111g;

        /* renamed from: h  reason: collision with root package name */
        public final d f4112h;

        /* renamed from: i  reason: collision with root package name */
        public float f4113i;

        /* renamed from: j  reason: collision with root package name */
        public float f4114j;

        /* renamed from: k  reason: collision with root package name */
        public float f4115k;

        /* renamed from: l  reason: collision with root package name */
        public float f4116l;

        /* renamed from: m  reason: collision with root package name */
        public int f4117m;

        /* renamed from: n  reason: collision with root package name */
        public String f4118n;

        /* renamed from: o  reason: collision with root package name */
        public Boolean f4119o;

        /* renamed from: p  reason: collision with root package name */
        public final s.a<String, Object> f4120p;

        public g() {
            this.f4107c = new Matrix();
            this.f4113i = 0.0f;
            this.f4114j = 0.0f;
            this.f4115k = 0.0f;
            this.f4116l = 0.0f;
            this.f4117m = 255;
            this.f4118n = null;
            this.f4119o = null;
            this.f4120p = new s.a<>();
            this.f4112h = new d();
            this.f4105a = new Path();
            this.f4106b = new Path();
        }

        /* JADX WARNING: type inference failed for: r11v0 */
        /* JADX WARNING: type inference failed for: r11v1, types: [boolean] */
        /* JADX WARNING: type inference failed for: r11v2 */
        public final void a(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            g gVar;
            g gVar2 = this;
            d dVar2 = dVar;
            Canvas canvas2 = canvas;
            ColorFilter colorFilter2 = colorFilter;
            dVar2.f4087a.set(matrix);
            dVar2.f4087a.preConcat(dVar2.f4096j);
            canvas.save();
            ? r11 = 0;
            int i12 = 0;
            while (i12 < dVar2.f4088b.size()) {
                e eVar = dVar2.f4088b.get(i12);
                if (eVar instanceof d) {
                    a((d) eVar, dVar2.f4087a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof f) {
                    f fVar = (f) eVar;
                    float f10 = ((float) i10) / gVar2.f4115k;
                    float f11 = ((float) i11) / gVar2.f4116l;
                    float min = Math.min(f10, f11);
                    Matrix matrix2 = dVar2.f4087a;
                    gVar2.f4107c.set(matrix2);
                    gVar2.f4107c.postScale(f10, f11);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float f12 = min;
                    float f13 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max((float) Math.hypot((double) fArr[r11], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
                    float abs = max > 0.0f ? Math.abs(f13) / max : 0.0f;
                    if (abs == 0.0f) {
                        gVar = this;
                    } else {
                        gVar = this;
                        Path path = gVar.f4105a;
                        fVar.getClass();
                        path.reset();
                        d.a[] aVarArr = fVar.f4100a;
                        if (aVarArr != null) {
                            d.a.b(aVarArr, path);
                        }
                        Path path2 = gVar.f4105a;
                        gVar.f4106b.reset();
                        if (fVar instanceof b) {
                            gVar.f4106b.setFillType(fVar.f4102c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            gVar.f4106b.addPath(path2, gVar.f4107c);
                            canvas2.clipPath(gVar.f4106b);
                        } else {
                            c cVar = (c) fVar;
                            float f14 = cVar.f4081k;
                            if (!(f14 == 0.0f && cVar.f4082l == 1.0f)) {
                                float f15 = cVar.f4083m;
                                float f16 = (f14 + f15) % 1.0f;
                                float f17 = (cVar.f4082l + f15) % 1.0f;
                                if (gVar.f4110f == null) {
                                    gVar.f4110f = new PathMeasure();
                                }
                                gVar.f4110f.setPath(gVar.f4105a, r11);
                                float length = gVar.f4110f.getLength();
                                float f18 = f16 * length;
                                float f19 = f17 * length;
                                path2.reset();
                                if (f18 > f19) {
                                    gVar.f4110f.getSegment(f18, length, path2, true);
                                    gVar.f4110f.getSegment(0.0f, f19, path2, true);
                                } else {
                                    gVar.f4110f.getSegment(f18, f19, path2, true);
                                }
                                path2.rLineTo(0.0f, 0.0f);
                            }
                            gVar.f4106b.addPath(path2, gVar.f4107c);
                            f0.d dVar3 = cVar.f4078h;
                            if (dVar3.b() || dVar3.f18032c != 0) {
                                f0.d dVar4 = cVar.f4078h;
                                if (gVar.f4109e == null) {
                                    Paint paint = new Paint(1);
                                    gVar.f4109e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = gVar.f4109e;
                                if (dVar4.b()) {
                                    Shader shader = dVar4.f18030a;
                                    shader.setLocalMatrix(gVar.f4107c);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(cVar.f4080j * 255.0f));
                                } else {
                                    paint2.setShader((Shader) null);
                                    paint2.setAlpha(255);
                                    int i13 = dVar4.f18032c;
                                    float f20 = cVar.f4080j;
                                    PorterDuff.Mode mode = h.f4066r;
                                    paint2.setColor((i13 & 16777215) | (((int) (((float) Color.alpha(i13)) * f20)) << 24));
                                }
                                paint2.setColorFilter(colorFilter2);
                                gVar.f4106b.setFillType(cVar.f4102c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas2.drawPath(gVar.f4106b, paint2);
                            }
                            f0.d dVar5 = cVar.f4076f;
                            if (dVar5.b() || dVar5.f18032c != 0) {
                                f0.d dVar6 = cVar.f4076f;
                                if (gVar.f4108d == null) {
                                    Paint paint3 = new Paint(1);
                                    gVar.f4108d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = gVar.f4108d;
                                Paint.Join join = cVar.f4085o;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = cVar.f4084n;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(cVar.f4086p);
                                if (dVar6.b()) {
                                    Shader shader2 = dVar6.f18030a;
                                    shader2.setLocalMatrix(gVar.f4107c);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(cVar.f4079i * 255.0f));
                                } else {
                                    paint4.setShader((Shader) null);
                                    paint4.setAlpha(255);
                                    int i14 = dVar6.f18032c;
                                    float f21 = cVar.f4079i;
                                    PorterDuff.Mode mode2 = h.f4066r;
                                    paint4.setColor((i14 & 16777215) | (((int) (((float) Color.alpha(i14)) * f21)) << 24));
                                }
                                paint4.setColorFilter(colorFilter2);
                                paint4.setStrokeWidth(cVar.f4077g * abs * f12);
                                canvas2.drawPath(gVar.f4106b, paint4);
                            }
                        }
                    }
                    i12++;
                    gVar2 = gVar;
                    r11 = 0;
                }
                int i15 = i10;
                int i16 = i11;
                gVar = gVar2;
                i12++;
                gVar2 = gVar;
                r11 = 0;
            }
            g gVar3 = gVar2;
            canvas.restore();
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f4117m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f4117m = i10;
        }

        public g(g gVar) {
            this.f4107c = new Matrix();
            this.f4113i = 0.0f;
            this.f4114j = 0.0f;
            this.f4115k = 0.0f;
            this.f4116l = 0.0f;
            this.f4117m = 255;
            this.f4118n = null;
            this.f4119o = null;
            s.a<String, Object> aVar = new s.a<>();
            this.f4120p = aVar;
            this.f4112h = new d(gVar.f4112h, aVar);
            this.f4105a = new Path(gVar.f4105a);
            this.f4106b = new Path(gVar.f4106b);
            this.f4113i = gVar.f4113i;
            this.f4114j = gVar.f4114j;
            this.f4115k = gVar.f4115k;
            this.f4116l = gVar.f4116l;
            this.f4111g = gVar.f4111g;
            this.f4117m = gVar.f4117m;
            this.f4118n = gVar.f4118n;
            String str = gVar.f4118n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f4119o = gVar.f4119o;
        }
    }

    /* compiled from: VectorDrawableCompat */
    public static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f4087a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<e> f4088b;

        /* renamed from: c  reason: collision with root package name */
        public float f4089c;

        /* renamed from: d  reason: collision with root package name */
        public float f4090d;

        /* renamed from: e  reason: collision with root package name */
        public float f4091e;

        /* renamed from: f  reason: collision with root package name */
        public float f4092f;

        /* renamed from: g  reason: collision with root package name */
        public float f4093g;

        /* renamed from: h  reason: collision with root package name */
        public float f4094h;

        /* renamed from: i  reason: collision with root package name */
        public float f4095i;

        /* renamed from: j  reason: collision with root package name */
        public final Matrix f4096j;

        /* renamed from: k  reason: collision with root package name */
        public int f4097k;

        /* renamed from: l  reason: collision with root package name */
        public int[] f4098l;

        /* renamed from: m  reason: collision with root package name */
        public String f4099m;

        public d(d dVar, s.a<String, Object> aVar) {
            super((a) null);
            f fVar;
            this.f4087a = new Matrix();
            this.f4088b = new ArrayList<>();
            this.f4089c = 0.0f;
            this.f4090d = 0.0f;
            this.f4091e = 0.0f;
            this.f4092f = 1.0f;
            this.f4093g = 1.0f;
            this.f4094h = 0.0f;
            this.f4095i = 0.0f;
            Matrix matrix = new Matrix();
            this.f4096j = matrix;
            this.f4099m = null;
            this.f4089c = dVar.f4089c;
            this.f4090d = dVar.f4090d;
            this.f4091e = dVar.f4091e;
            this.f4092f = dVar.f4092f;
            this.f4093g = dVar.f4093g;
            this.f4094h = dVar.f4094h;
            this.f4095i = dVar.f4095i;
            this.f4098l = dVar.f4098l;
            String str = dVar.f4099m;
            this.f4099m = str;
            this.f4097k = dVar.f4097k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f4096j);
            ArrayList<e> arrayList = dVar.f4088b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                e eVar = arrayList.get(i10);
                if (eVar instanceof d) {
                    this.f4088b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        fVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        fVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f4088b.add(fVar);
                    String str2 = fVar.f4101b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        public boolean a() {
            for (int i10 = 0; i10 < this.f4088b.size(); i10++) {
                if (this.f4088b.get(i10).a()) {
                    return true;
                }
            }
            return false;
        }

        public boolean b(int[] iArr) {
            boolean z10 = false;
            for (int i10 = 0; i10 < this.f4088b.size(); i10++) {
                z10 |= this.f4088b.get(i10).b(iArr);
            }
            return z10;
        }

        public final void c() {
            this.f4096j.reset();
            this.f4096j.postTranslate(-this.f4090d, -this.f4091e);
            this.f4096j.postScale(this.f4092f, this.f4093g);
            this.f4096j.postRotate(this.f4089c, 0.0f, 0.0f);
            this.f4096j.postTranslate(this.f4094h + this.f4090d, this.f4095i + this.f4091e);
        }

        public String getGroupName() {
            return this.f4099m;
        }

        public Matrix getLocalMatrix() {
            return this.f4096j;
        }

        public float getPivotX() {
            return this.f4090d;
        }

        public float getPivotY() {
            return this.f4091e;
        }

        public float getRotation() {
            return this.f4089c;
        }

        public float getScaleX() {
            return this.f4092f;
        }

        public float getScaleY() {
            return this.f4093g;
        }

        public float getTranslateX() {
            return this.f4094h;
        }

        public float getTranslateY() {
            return this.f4095i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f4090d) {
                this.f4090d = f10;
                c();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f4091e) {
                this.f4091e = f10;
                c();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f4089c) {
                this.f4089c = f10;
                c();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f4092f) {
                this.f4092f = f10;
                c();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f4093g) {
                this.f4093g = f10;
                c();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f4094h) {
                this.f4094h = f10;
                c();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f4095i) {
                this.f4095i = f10;
                c();
            }
        }

        public d() {
            super((a) null);
            this.f4087a = new Matrix();
            this.f4088b = new ArrayList<>();
            this.f4089c = 0.0f;
            this.f4090d = 0.0f;
            this.f4091e = 0.0f;
            this.f4092f = 1.0f;
            this.f4093g = 1.0f;
            this.f4094h = 0.0f;
            this.f4095i = 0.0f;
            this.f4096j = new Matrix();
            this.f4099m = null;
        }
    }
}

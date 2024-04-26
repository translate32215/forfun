package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;
import f0.g;
import g.a;

/* compiled from: TintTypedArray */
public class g1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f923a;

    /* renamed from: b  reason: collision with root package name */
    public final TypedArray f924b;

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f925c;

    public g1(Context context, TypedArray typedArray) {
        this.f923a = context;
        this.f924b = typedArray;
    }

    public static g1 q(Context context, AttributeSet attributeSet, int[] iArr) {
        return new g1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static g1 r(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new g1(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z10) {
        return this.f924b.getBoolean(i10, z10);
    }

    public int b(int i10, int i11) {
        return this.f924b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList a10;
        if (!this.f924b.hasValue(i10) || (resourceId = this.f924b.getResourceId(i10, 0)) == 0 || (a10 = a.a(this.f923a, resourceId)) == null) {
            return this.f924b.getColorStateList(i10);
        }
        return a10;
    }

    public float d(int i10, float f10) {
        return this.f924b.getDimension(i10, f10);
    }

    public int e(int i10, int i11) {
        return this.f924b.getDimensionPixelOffset(i10, i11);
    }

    public int f(int i10, int i11) {
        return this.f924b.getDimensionPixelSize(i10, i11);
    }

    public Drawable g(int i10) {
        int resourceId;
        if (!this.f924b.hasValue(i10) || (resourceId = this.f924b.getResourceId(i10, 0)) == 0) {
            return this.f924b.getDrawable(i10);
        }
        return a.b(this.f923a, resourceId);
    }

    public Drawable h(int i10) {
        int resourceId;
        Drawable g10;
        if (!this.f924b.hasValue(i10) || (resourceId = this.f924b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        k a10 = k.a();
        Context context = this.f923a;
        synchronized (a10) {
            g10 = a10.f968a.g(context, resourceId, true);
        }
        return g10;
    }

    public Typeface i(int i10, int i11, g.f fVar) {
        int resourceId = this.f924b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f925c == null) {
            this.f925c = new TypedValue();
        }
        Context context = this.f923a;
        TypedValue typedValue = this.f925c;
        ThreadLocal<TypedValue> threadLocal = g.f18046a;
        if (context.isRestricted()) {
            return null;
        }
        return g.c(context, resourceId, typedValue, i11, fVar, (Handler) null, true, false);
    }

    public int j(int i10, int i11) {
        return this.f924b.getInt(i10, i11);
    }

    public int k(int i10, int i11) {
        return this.f924b.getInteger(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f924b.getLayoutDimension(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f924b.getResourceId(i10, i11);
    }

    public String n(int i10) {
        return this.f924b.getString(i10);
    }

    public CharSequence o(int i10) {
        return this.f924b.getText(i10);
    }

    public boolean p(int i10) {
        return this.f924b.hasValue(i10);
    }
}

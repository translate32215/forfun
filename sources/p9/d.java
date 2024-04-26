package p9;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import f0.g;
import l.c;

/* compiled from: TextAppearance */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f23951a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23952b;

    /* renamed from: c  reason: collision with root package name */
    public final int f23953c;

    /* renamed from: d  reason: collision with root package name */
    public final int f23954d;

    /* renamed from: e  reason: collision with root package name */
    public final float f23955e;

    /* renamed from: f  reason: collision with root package name */
    public final float f23956f;

    /* renamed from: g  reason: collision with root package name */
    public final float f23957g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f23958h;

    /* renamed from: i  reason: collision with root package name */
    public final float f23959i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f23960j;

    /* renamed from: k  reason: collision with root package name */
    public float f23961k;

    /* renamed from: l  reason: collision with root package name */
    public final int f23962l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f23963m = false;

    /* renamed from: n  reason: collision with root package name */
    public Typeface f23964n;

    /* compiled from: TextAppearance */
    public class a extends g.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f23965a;

        public a(c cVar) {
            this.f23965a = cVar;
        }

        public void d(int i10) {
            d.this.f23963m = true;
            this.f23965a.c(i10);
        }

        public void e(Typeface typeface) {
            d dVar = d.this;
            dVar.f23964n = Typeface.create(typeface, dVar.f23953c);
            d dVar2 = d.this;
            dVar2.f23963m = true;
            this.f23965a.d(dVar2.f23964n, false);
        }
    }

    public d(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, t8.a.K);
        this.f23961k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f23960j = c.a(context, obtainStyledAttributes, 3);
        c.a(context, obtainStyledAttributes, 4);
        c.a(context, obtainStyledAttributes, 5);
        this.f23953c = obtainStyledAttributes.getInt(2, 0);
        this.f23954d = obtainStyledAttributes.getInt(1, 1);
        int i11 = !obtainStyledAttributes.hasValue(12) ? 10 : 12;
        this.f23962l = obtainStyledAttributes.getResourceId(i11, 0);
        this.f23952b = obtainStyledAttributes.getString(i11);
        obtainStyledAttributes.getBoolean(14, false);
        this.f23951a = c.a(context, obtainStyledAttributes, 6);
        this.f23955e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f23956f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f23957g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i10, t8.a.f25857x);
            this.f23958h = obtainStyledAttributes2.hasValue(0);
            this.f23959i = obtainStyledAttributes2.getFloat(0, 0.0f);
            obtainStyledAttributes2.recycle();
            return;
        }
        this.f23958h = false;
        this.f23959i = 0.0f;
    }

    public final void a() {
        String str;
        if (this.f23964n == null && (str = this.f23952b) != null) {
            this.f23964n = Typeface.create(str, this.f23953c);
        }
        if (this.f23964n == null) {
            int i10 = this.f23954d;
            if (i10 == 1) {
                this.f23964n = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f23964n = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f23964n = Typeface.DEFAULT;
            } else {
                this.f23964n = Typeface.MONOSPACE;
            }
            this.f23964n = Typeface.create(this.f23964n, this.f23953c);
        }
    }

    public Typeface b(Context context) {
        if (this.f23963m) {
            return this.f23964n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface b10 = g.b(context, this.f23962l);
                this.f23964n = b10;
                if (b10 != null) {
                    this.f23964n = Typeface.create(b10, this.f23953c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                StringBuilder a10 = android.support.v4.media.a.a("Error loading font ");
                a10.append(this.f23952b);
                Log.d("TextAppearance", a10.toString(), e10);
            }
        }
        a();
        this.f23963m = true;
        return this.f23964n;
    }

    public void c(Context context, c cVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i10 = this.f23962l;
        if (i10 == 0) {
            this.f23963m = true;
        }
        if (this.f23963m) {
            cVar.d(this.f23964n, true);
            return;
        }
        try {
            a aVar = new a(cVar);
            ThreadLocal<TypedValue> threadLocal = g.f18046a;
            if (context.isRestricted()) {
                aVar.a(-4, (Handler) null);
                return;
            }
            g.c(context, i10, new TypedValue(), 0, aVar, (Handler) null, false, false);
        } catch (Resources.NotFoundException unused) {
            this.f23963m = true;
            cVar.c(1);
        } catch (Exception e10) {
            StringBuilder a10 = android.support.v4.media.a.a("Error loading font ");
            a10.append(this.f23952b);
            Log.d("TextAppearance", a10.toString(), e10);
            this.f23963m = true;
            cVar.c(-3);
        }
    }

    public final boolean d(Context context) {
        int i10 = this.f23962l;
        Typeface typeface = null;
        if (i10 != 0) {
            ThreadLocal<TypedValue> threadLocal = g.f18046a;
            if (!context.isRestricted()) {
                typeface = g.c(context, i10, new TypedValue(), 0, (g.f) null, (Handler) null, false, true);
            }
        }
        return typeface != null;
    }

    public void e(Context context, TextPaint textPaint, c cVar) {
        f(context, textPaint, cVar);
        ColorStateList colorStateList = this.f23960j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f23957g;
        float f11 = this.f23955e;
        float f12 = this.f23956f;
        ColorStateList colorStateList2 = this.f23951a;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void f(Context context, TextPaint textPaint, c cVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f23964n);
        c(context, new e(this, context, textPaint, cVar));
    }

    public void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface a10 = f.a(context.getResources().getConfiguration(), typeface);
        if (a10 != null) {
            typeface = a10;
        }
        textPaint.setTypeface(typeface);
        int style = this.f23953c & (typeface.getStyle() ^ -1);
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f23961k);
        if (Build.VERSION.SDK_INT >= 21 && this.f23958h) {
            textPaint.setLetterSpacing(this.f23959i);
        }
    }
}

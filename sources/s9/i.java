package s9;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import x3.d;

/* compiled from: ShapeAppearanceModel */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public d f25121a;

    /* renamed from: b  reason: collision with root package name */
    public d f25122b;

    /* renamed from: c  reason: collision with root package name */
    public d f25123c;

    /* renamed from: d  reason: collision with root package name */
    public d f25124d;

    /* renamed from: e  reason: collision with root package name */
    public c f25125e;

    /* renamed from: f  reason: collision with root package name */
    public c f25126f;

    /* renamed from: g  reason: collision with root package name */
    public c f25127g;

    /* renamed from: h  reason: collision with root package name */
    public c f25128h;

    /* renamed from: i  reason: collision with root package name */
    public e f25129i;

    /* renamed from: j  reason: collision with root package name */
    public e f25130j;

    /* renamed from: k  reason: collision with root package name */
    public e f25131k;

    /* renamed from: l  reason: collision with root package name */
    public e f25132l;

    public i(b bVar, a aVar) {
        this.f25121a = bVar.f25133a;
        this.f25122b = bVar.f25134b;
        this.f25123c = bVar.f25135c;
        this.f25124d = bVar.f25136d;
        this.f25125e = bVar.f25137e;
        this.f25126f = bVar.f25138f;
        this.f25127g = bVar.f25139g;
        this.f25128h = bVar.f25140h;
        this.f25129i = bVar.f25141i;
        this.f25130j = bVar.f25142j;
        this.f25131k = bVar.f25143k;
        this.f25132l = bVar.f25144l;
    }

    public static b a(Context context, int i10, int i11) {
        return b(context, i10, i11, new a((float) 0));
    }

    public static b b(Context context, int i10, int i11, c cVar) {
        if (i11 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
            i10 = i11;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, t8.a.G);
        try {
            int i12 = obtainStyledAttributes.getInt(0, 0);
            int i13 = obtainStyledAttributes.getInt(3, i12);
            int i14 = obtainStyledAttributes.getInt(4, i12);
            int i15 = obtainStyledAttributes.getInt(2, i12);
            int i16 = obtainStyledAttributes.getInt(1, i12);
            c d10 = d(obtainStyledAttributes, 5, cVar);
            c d11 = d(obtainStyledAttributes, 8, d10);
            c d12 = d(obtainStyledAttributes, 9, d10);
            c d13 = d(obtainStyledAttributes, 7, d10);
            c d14 = d(obtainStyledAttributes, 6, d10);
            b bVar = new b();
            d a10 = q.d.a(i13);
            bVar.f25133a = a10;
            b.b(a10);
            bVar.f25137e = d11;
            d a11 = q.d.a(i14);
            bVar.f25134b = a11;
            b.b(a11);
            bVar.f25138f = d12;
            d a12 = q.d.a(i15);
            bVar.f25135c = a12;
            b.b(a12);
            bVar.f25139g = d13;
            d a13 = q.d.a(i16);
            bVar.f25136d = a13;
            b.b(a13);
            bVar.f25140h = d14;
            return bVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b c(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a((float) 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t8.a.f25856w, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, aVar);
    }

    public static c d(TypedArray typedArray, int i10, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue == null) {
            return cVar;
        }
        int i11 = peekValue.type;
        if (i11 == 5) {
            return new a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i11 == 6 ? new g(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public boolean e(RectF rectF) {
        Class<e> cls = e.class;
        boolean z10 = this.f25132l.getClass().equals(cls) && this.f25130j.getClass().equals(cls) && this.f25129i.getClass().equals(cls) && this.f25131k.getClass().equals(cls);
        float a10 = this.f25125e.a(rectF);
        boolean z11 = this.f25126f.a(rectF) == a10 && this.f25128h.a(rectF) == a10 && this.f25127g.a(rectF) == a10;
        boolean z12 = (this.f25122b instanceof h) && (this.f25121a instanceof h) && (this.f25123c instanceof h) && (this.f25124d instanceof h);
        if (!z10 || !z11 || !z12) {
            return false;
        }
        return true;
    }

    public i f(float f10) {
        b bVar = new b(this);
        bVar.c(f10);
        return bVar.a();
    }

    /* compiled from: ShapeAppearanceModel */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public d f25133a = new h();

        /* renamed from: b  reason: collision with root package name */
        public d f25134b = new h();

        /* renamed from: c  reason: collision with root package name */
        public d f25135c = new h();

        /* renamed from: d  reason: collision with root package name */
        public d f25136d = new h();

        /* renamed from: e  reason: collision with root package name */
        public c f25137e = new a(0.0f);

        /* renamed from: f  reason: collision with root package name */
        public c f25138f = new a(0.0f);

        /* renamed from: g  reason: collision with root package name */
        public c f25139g = new a(0.0f);

        /* renamed from: h  reason: collision with root package name */
        public c f25140h = new a(0.0f);

        /* renamed from: i  reason: collision with root package name */
        public e f25141i = q.d.b();

        /* renamed from: j  reason: collision with root package name */
        public e f25142j = q.d.b();

        /* renamed from: k  reason: collision with root package name */
        public e f25143k = q.d.b();

        /* renamed from: l  reason: collision with root package name */
        public e f25144l = q.d.b();

        public b() {
        }

        public static float b(d dVar) {
            if (dVar instanceof h) {
                ((h) dVar).getClass();
                return -1.0f;
            }
            if (dVar instanceof d) {
                ((d) dVar).getClass();
            }
            return -1.0f;
        }

        public i a() {
            return new i(this, (a) null);
        }

        public b c(float f10) {
            this.f25137e = new a(f10);
            this.f25138f = new a(f10);
            this.f25139g = new a(f10);
            this.f25140h = new a(f10);
            return this;
        }

        public b d(float f10) {
            this.f25140h = new a(f10);
            return this;
        }

        public b e(float f10) {
            this.f25139g = new a(f10);
            return this;
        }

        public b f(float f10) {
            this.f25137e = new a(f10);
            return this;
        }

        public b g(float f10) {
            this.f25138f = new a(f10);
            return this;
        }

        public b(i iVar) {
            this.f25133a = iVar.f25121a;
            this.f25134b = iVar.f25122b;
            this.f25135c = iVar.f25123c;
            this.f25136d = iVar.f25124d;
            this.f25137e = iVar.f25125e;
            this.f25138f = iVar.f25126f;
            this.f25139g = iVar.f25127g;
            this.f25140h = iVar.f25128h;
            this.f25141i = iVar.f25129i;
            this.f25142j = iVar.f25130j;
            this.f25143k = iVar.f25131k;
            this.f25144l = iVar.f25132l;
        }
    }

    public i() {
        this.f25121a = new h();
        this.f25122b = new h();
        this.f25123c = new h();
        this.f25124d = new h();
        this.f25125e = new a(0.0f);
        this.f25126f = new a(0.0f);
        this.f25127g = new a(0.0f);
        this.f25128h = new a(0.0f);
        this.f25129i = q.d.b();
        this.f25130j = q.d.b();
        this.f25131k = q.d.b();
        this.f25132l = q.d.b();
    }
}

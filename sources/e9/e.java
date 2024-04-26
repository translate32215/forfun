package e9;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.appcompat.widget.p;

/* compiled from: CircularRevealWidget */
public interface e {

    /* compiled from: CircularRevealWidget */
    public static class b implements TypeEvaluator<C0133e> {

        /* renamed from: b  reason: collision with root package name */
        public static final TypeEvaluator<C0133e> f17806b = new b();

        /* renamed from: a  reason: collision with root package name */
        public final C0133e f17807a = new C0133e((a) null);

        public Object evaluate(float f10, Object obj, Object obj2) {
            C0133e eVar = (C0133e) obj;
            C0133e eVar2 = (C0133e) obj2;
            C0133e eVar3 = this.f17807a;
            float g10 = p.g(eVar.f17810a, eVar2.f17810a, f10);
            float g11 = p.g(eVar.f17811b, eVar2.f17811b, f10);
            float g12 = p.g(eVar.f17812c, eVar2.f17812c, f10);
            eVar3.f17810a = g10;
            eVar3.f17811b = g11;
            eVar3.f17812c = g12;
            return this.f17807a;
        }
    }

    /* compiled from: CircularRevealWidget */
    public static class c extends Property<e, C0133e> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<e, C0133e> f17808a = new c("circularReveal");

        public c(String str) {
            super(C0133e.class, str);
        }

        public Object get(Object obj) {
            return ((e) obj).getRevealInfo();
        }

        public void set(Object obj, Object obj2) {
            ((e) obj).setRevealInfo((C0133e) obj2);
        }
    }

    /* compiled from: CircularRevealWidget */
    public static class d extends Property<e, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<e, Integer> f17809a = new d("circularRevealScrimColor");

        public d(String str) {
            super(Integer.class, str);
        }

        public Object get(Object obj) {
            return Integer.valueOf(((e) obj).getCircularRevealScrimColor());
        }

        public void set(Object obj, Object obj2) {
            ((e) obj).setCircularRevealScrimColor(((Integer) obj2).intValue());
        }
    }

    /* renamed from: e9.e$e  reason: collision with other inner class name */
    /* compiled from: CircularRevealWidget */
    public static class C0133e {

        /* renamed from: a  reason: collision with root package name */
        public float f17810a;

        /* renamed from: b  reason: collision with root package name */
        public float f17811b;

        /* renamed from: c  reason: collision with root package name */
        public float f17812c;

        public C0133e() {
        }

        public C0133e(a aVar) {
        }

        public C0133e(float f10, float f11, float f12) {
            this.f17810a = f10;
            this.f17811b = f11;
            this.f17812c = f12;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    C0133e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i10);

    void setRevealInfo(C0133e eVar);
}

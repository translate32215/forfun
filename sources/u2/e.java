package u2;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import c3.e;
import e3.s;
import f3.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import o1.p;

/* compiled from: LottieDrawable */
public class e extends Drawable implements Drawable.Callback, Animatable {
    public boolean A;

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f25934a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public d f25935b;

    /* renamed from: c  reason: collision with root package name */
    public final g3.d f25936c;

    /* renamed from: d  reason: collision with root package name */
    public float f25937d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f25938e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f25939f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<o> f25940g;

    /* renamed from: h  reason: collision with root package name */
    public ImageView.ScaleType f25941h;

    /* renamed from: i  reason: collision with root package name */
    public y2.b f25942i;

    /* renamed from: r  reason: collision with root package name */
    public String f25943r;

    /* renamed from: s  reason: collision with root package name */
    public b f25944s;

    /* renamed from: t  reason: collision with root package name */
    public y2.a f25945t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f25946u;

    /* renamed from: v  reason: collision with root package name */
    public c3.c f25947v;

    /* renamed from: w  reason: collision with root package name */
    public int f25948w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f25949x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f25950y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f25951z;

    /* compiled from: LottieDrawable */
    public class a implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25952a;

        public a(String str) {
            this.f25952a = str;
        }

        public void a(d dVar) {
            e.this.q(this.f25952a);
        }
    }

    /* compiled from: LottieDrawable */
    public class b implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f25954a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f25955b;

        public b(int i10, int i11) {
            this.f25954a = i10;
            this.f25955b = i11;
        }

        public void a(d dVar) {
            e.this.p(this.f25954a, this.f25955b);
        }
    }

    /* compiled from: LottieDrawable */
    public class c implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f25957a;

        public c(int i10) {
            this.f25957a = i10;
        }

        public void a(d dVar) {
            e.this.l(this.f25957a);
        }
    }

    /* compiled from: LottieDrawable */
    public class d implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f25959a;

        public d(float f10) {
            this.f25959a = f10;
        }

        public void a(d dVar) {
            e.this.u(this.f25959a);
        }
    }

    /* renamed from: u2.e$e  reason: collision with other inner class name */
    /* compiled from: LottieDrawable */
    public class C0255e implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z2.e f25961a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f25962b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ p f25963c;

        public C0255e(z2.e eVar, Object obj, p pVar) {
            this.f25961a = eVar;
            this.f25962b = obj;
            this.f25963c = pVar;
        }

        public void a(d dVar) {
            e.this.a(this.f25961a, this.f25962b, this.f25963c);
        }
    }

    /* compiled from: LottieDrawable */
    public class f implements ValueAnimator.AnimatorUpdateListener {
        public f() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            e eVar = e.this;
            c3.c cVar = eVar.f25947v;
            if (cVar != null) {
                cVar.q(eVar.f25936c.d());
            }
        }
    }

    /* compiled from: LottieDrawable */
    public class g implements o {
        public g() {
        }

        public void a(d dVar) {
            e.this.j();
        }
    }

    /* compiled from: LottieDrawable */
    public class h implements o {
        public h() {
        }

        public void a(d dVar) {
            e.this.k();
        }
    }

    /* compiled from: LottieDrawable */
    public class i implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f25968a;

        public i(int i10) {
            this.f25968a = i10;
        }

        public void a(d dVar) {
            e.this.r(this.f25968a);
        }
    }

    /* compiled from: LottieDrawable */
    public class j implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f25970a;

        public j(float f10) {
            this.f25970a = f10;
        }

        public void a(d dVar) {
            e.this.t(this.f25970a);
        }
    }

    /* compiled from: LottieDrawable */
    public class k implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f25972a;

        public k(int i10) {
            this.f25972a = i10;
        }

        public void a(d dVar) {
            e.this.m(this.f25972a);
        }
    }

    /* compiled from: LottieDrawable */
    public class l implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f25974a;

        public l(float f10) {
            this.f25974a = f10;
        }

        public void a(d dVar) {
            e.this.o(this.f25974a);
        }
    }

    /* compiled from: LottieDrawable */
    public class m implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25976a;

        public m(String str) {
            this.f25976a = str;
        }

        public void a(d dVar) {
            e.this.s(this.f25976a);
        }
    }

    /* compiled from: LottieDrawable */
    public class n implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25978a;

        public n(String str) {
            this.f25978a = str;
        }

        public void a(d dVar) {
            e.this.n(this.f25978a);
        }
    }

    /* compiled from: LottieDrawable */
    public interface o {
        void a(d dVar);
    }

    static {
        Class<e> cls = e.class;
    }

    public e() {
        g3.d dVar = new g3.d();
        this.f25936c = dVar;
        this.f25937d = 1.0f;
        this.f25938e = true;
        this.f25939f = false;
        new HashSet();
        this.f25940g = new ArrayList<>();
        f fVar = new f();
        this.f25948w = 255;
        this.f25951z = true;
        this.A = false;
        dVar.f18420a.add(fVar);
    }

    public <T> void a(z2.e eVar, T t10, p pVar) {
        List list;
        c3.c cVar = this.f25947v;
        if (cVar == null) {
            this.f25940g.add(new C0255e(eVar, t10, pVar));
            return;
        }
        z2.f fVar = eVar.f28235b;
        boolean z10 = true;
        if (fVar != null) {
            fVar.b(t10, pVar);
        } else {
            if (cVar == null) {
                g3.c.a("Cannot resolve KeyPath. Composition is not set yet.");
                list = Collections.emptyList();
            } else {
                ArrayList arrayList = new ArrayList();
                this.f25947v.e(eVar, 0, arrayList, new z2.e(new String[0]));
                list = arrayList;
            }
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((z2.e) list.get(i10)).f28235b.b(t10, pVar);
            }
            z10 = true ^ list.isEmpty();
        }
        if (z10) {
            invalidateSelf();
            if (t10 == j.A) {
                u(g());
            }
        }
    }

    public final void b() {
        d dVar = this.f25935b;
        c.a aVar = s.f13575a;
        Rect rect = dVar.f25928j;
        List emptyList = Collections.emptyList();
        e.a aVar2 = e.a.PRE_COMP;
        List emptyList2 = Collections.emptyList();
        a3.j jVar = r16;
        a3.j jVar2 = new a3.j((k1.c) null, (a3.k<PointF, PointF>) null, (a3.f) null, (a3.b) null, (a3.d) null, (a3.b) null, (a3.b) null, (a3.b) null, (a3.b) null);
        c3.e eVar = r2;
        c3.e eVar2 = new c3.e(emptyList, dVar, "__container", -1, aVar2, -1, (String) null, emptyList2, jVar, 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), (a3.i) null, (n2.g) null, Collections.emptyList(), 1, (a3.b) null, false);
        d dVar2 = this.f25935b;
        this.f25947v = new c3.c(this, eVar, dVar2.f25927i, dVar2);
    }

    public void c() {
        g3.d dVar = this.f25936c;
        if (dVar.f18432s) {
            dVar.cancel();
        }
        this.f25935b = null;
        this.f25947v = null;
        this.f25942i = null;
        g3.d dVar2 = this.f25936c;
        dVar2.f18431r = null;
        dVar2.f18429h = -2.14748365E9f;
        dVar2.f18430i = 2.14748365E9f;
        invalidateSelf();
    }

    public final void d(Canvas canvas) {
        float f10;
        float f11;
        int i10 = -1;
        if (ImageView.ScaleType.FIT_XY == this.f25941h) {
            if (this.f25947v != null) {
                Rect bounds = getBounds();
                float width = ((float) bounds.width()) / ((float) this.f25935b.f25928j.width());
                float height = ((float) bounds.height()) / ((float) this.f25935b.f25928j.height());
                if (this.f25951z) {
                    float min = Math.min(width, height);
                    if (min < 1.0f) {
                        f11 = 1.0f / min;
                        width /= f11;
                        height /= f11;
                    } else {
                        f11 = 1.0f;
                    }
                    if (f11 > 1.0f) {
                        i10 = canvas.save();
                        float width2 = ((float) bounds.width()) / 2.0f;
                        float height2 = ((float) bounds.height()) / 2.0f;
                        float f12 = width2 * min;
                        float f13 = min * height2;
                        canvas.translate(width2 - f12, height2 - f13);
                        canvas.scale(f11, f11, f12, f13);
                    }
                }
                this.f25934a.reset();
                this.f25934a.preScale(width, height);
                this.f25947v.h(canvas, this.f25934a, this.f25948w);
                if (i10 > 0) {
                    canvas.restoreToCount(i10);
                }
            }
        } else if (this.f25947v != null) {
            float f14 = this.f25937d;
            float min2 = Math.min(((float) canvas.getWidth()) / ((float) this.f25935b.f25928j.width()), ((float) canvas.getHeight()) / ((float) this.f25935b.f25928j.height()));
            if (f14 > min2) {
                f10 = this.f25937d / min2;
            } else {
                min2 = f14;
                f10 = 1.0f;
            }
            if (f10 > 1.0f) {
                i10 = canvas.save();
                float width3 = ((float) this.f25935b.f25928j.width()) / 2.0f;
                float height3 = ((float) this.f25935b.f25928j.height()) / 2.0f;
                float f15 = width3 * min2;
                float f16 = height3 * min2;
                float f17 = this.f25937d;
                canvas.translate((width3 * f17) - f15, (f17 * height3) - f16);
                canvas.scale(f10, f10, f15, f16);
            }
            this.f25934a.reset();
            this.f25934a.preScale(min2, min2);
            this.f25947v.h(canvas, this.f25934a, this.f25948w);
            if (i10 > 0) {
                canvas.restoreToCount(i10);
            }
        }
    }

    public void draw(Canvas canvas) {
        this.A = false;
        if (this.f25939f) {
            try {
                d(canvas);
            } catch (Throwable unused) {
                g3.c.f18423a.getClass();
            }
        } else {
            d(canvas);
        }
        c.a("Drawable#draw");
    }

    public float e() {
        return this.f25936c.e();
    }

    public float f() {
        return this.f25936c.f();
    }

    public float g() {
        return this.f25936c.d();
    }

    public int getAlpha() {
        return this.f25948w;
    }

    public int getIntrinsicHeight() {
        d dVar = this.f25935b;
        if (dVar == null) {
            return -1;
        }
        return (int) (((float) dVar.f25928j.height()) * this.f25937d);
    }

    public int getIntrinsicWidth() {
        d dVar = this.f25935b;
        if (dVar == null) {
            return -1;
        }
        return (int) (((float) dVar.f25928j.width()) * this.f25937d);
    }

    public int getOpacity() {
        return -3;
    }

    public int h() {
        return this.f25936c.getRepeatCount();
    }

    public boolean i() {
        g3.d dVar = this.f25936c;
        if (dVar == null) {
            return false;
        }
        return dVar.f18432s;
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void invalidateSelf() {
        if (!this.A) {
            this.A = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public boolean isRunning() {
        return i();
    }

    public void j() {
        if (this.f25947v == null) {
            this.f25940g.add(new g());
            return;
        }
        if (this.f25938e || h() == 0) {
            g3.d dVar = this.f25936c;
            dVar.f18432s = true;
            boolean g10 = dVar.g();
            for (Animator.AnimatorListener next : dVar.f18421b) {
                if (Build.VERSION.SDK_INT >= 26) {
                    next.onAnimationStart(dVar, g10);
                } else {
                    next.onAnimationStart(dVar);
                }
            }
            dVar.k((float) ((int) (dVar.g() ? dVar.e() : dVar.f())));
            dVar.f18426e = 0;
            dVar.f18428g = 0;
            dVar.h();
        }
        if (!this.f25938e) {
            l((int) (this.f25936c.f18424c < 0.0f ? f() : e()));
            this.f25936c.c();
        }
    }

    public void k() {
        if (this.f25947v == null) {
            this.f25940g.add(new h());
            return;
        }
        if (this.f25938e || h() == 0) {
            g3.d dVar = this.f25936c;
            dVar.f18432s = true;
            dVar.h();
            dVar.f18426e = 0;
            if (dVar.g() && dVar.f18427f == dVar.f()) {
                dVar.f18427f = dVar.e();
            } else if (!dVar.g() && dVar.f18427f == dVar.e()) {
                dVar.f18427f = dVar.f();
            }
        }
        if (!this.f25938e) {
            l((int) (this.f25936c.f18424c < 0.0f ? f() : e()));
            this.f25936c.c();
        }
    }

    public void l(int i10) {
        if (this.f25935b == null) {
            this.f25940g.add(new c(i10));
        } else {
            this.f25936c.k((float) i10);
        }
    }

    public void m(int i10) {
        if (this.f25935b == null) {
            this.f25940g.add(new k(i10));
            return;
        }
        g3.d dVar = this.f25936c;
        dVar.l(dVar.f18429h, ((float) i10) + 0.99f);
    }

    public void n(String str) {
        d dVar = this.f25935b;
        if (dVar == null) {
            this.f25940g.add(new n(str));
            return;
        }
        z2.h d10 = dVar.d(str);
        if (d10 != null) {
            m((int) (d10.f28239b + d10.f28240c));
            return;
        }
        throw new IllegalArgumentException(q.b.a("Cannot find marker with name ", str, "."));
    }

    public void o(float f10) {
        d dVar = this.f25935b;
        if (dVar == null) {
            this.f25940g.add(new l(f10));
        } else {
            m((int) g3.f.e(dVar.f25929k, dVar.f25930l, f10));
        }
    }

    public void p(int i10, int i11) {
        if (this.f25935b == null) {
            this.f25940g.add(new b(i10, i11));
        } else {
            this.f25936c.l((float) i10, ((float) i11) + 0.99f);
        }
    }

    public void q(String str) {
        d dVar = this.f25935b;
        if (dVar == null) {
            this.f25940g.add(new a(str));
            return;
        }
        z2.h d10 = dVar.d(str);
        if (d10 != null) {
            int i10 = (int) d10.f28239b;
            p(i10, ((int) d10.f28240c) + i10);
            return;
        }
        throw new IllegalArgumentException(q.b.a("Cannot find marker with name ", str, "."));
    }

    public void r(int i10) {
        if (this.f25935b == null) {
            this.f25940g.add(new i(i10));
            return;
        }
        g3.d dVar = this.f25936c;
        dVar.l((float) i10, (float) ((int) dVar.f18430i));
    }

    public void s(String str) {
        d dVar = this.f25935b;
        if (dVar == null) {
            this.f25940g.add(new m(str));
            return;
        }
        z2.h d10 = dVar.d(str);
        if (d10 != null) {
            r((int) d10.f28239b);
            return;
        }
        throw new IllegalArgumentException(q.b.a("Cannot find marker with name ", str, "."));
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    public void setAlpha(int i10) {
        this.f25948w = i10;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        g3.c.a("Use addColorFilter instead.");
    }

    public void start() {
        j();
    }

    public void stop() {
        this.f25940g.clear();
        this.f25936c.c();
    }

    public void t(float f10) {
        d dVar = this.f25935b;
        if (dVar == null) {
            this.f25940g.add(new j(f10));
        } else {
            r((int) g3.f.e(dVar.f25929k, dVar.f25930l, f10));
        }
    }

    public void u(float f10) {
        d dVar = this.f25935b;
        if (dVar == null) {
            this.f25940g.add(new d(f10));
            return;
        }
        this.f25936c.k(g3.f.e(dVar.f25929k, dVar.f25930l, f10));
        c.a("Drawable#setProgress");
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v() {
        d dVar = this.f25935b;
        if (dVar != null) {
            float f10 = this.f25937d;
            setBounds(0, 0, (int) (((float) dVar.f25928j.width()) * f10), (int) (((float) this.f25935b.f25928j.height()) * f10));
        }
    }
}

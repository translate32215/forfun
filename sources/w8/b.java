package w8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.startapp.startappsdk.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import l9.o;
import l9.r;
import o0.c0;
import p9.d;
import s9.f;
import w8.c;

/* compiled from: BadgeDrawable */
public class b extends Drawable implements o.b {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Context> f27137a;

    /* renamed from: b  reason: collision with root package name */
    public final f f27138b;

    /* renamed from: c  reason: collision with root package name */
    public final o f27139c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f27140d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final c f27141e;

    /* renamed from: f  reason: collision with root package name */
    public float f27142f;

    /* renamed from: g  reason: collision with root package name */
    public float f27143g;

    /* renamed from: h  reason: collision with root package name */
    public int f27144h;

    /* renamed from: i  reason: collision with root package name */
    public float f27145i;

    /* renamed from: r  reason: collision with root package name */
    public float f27146r;

    /* renamed from: s  reason: collision with root package name */
    public float f27147s;

    /* renamed from: t  reason: collision with root package name */
    public WeakReference<View> f27148t;

    /* renamed from: u  reason: collision with root package name */
    public WeakReference<FrameLayout> f27149u;

    public b(Context context, int i10, int i11, int i12, c.a aVar) {
        d dVar;
        Context context2;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.f27137a = weakReference;
        r.c(context, r.f21174b, "Theme.MaterialComponents");
        f fVar = new f();
        this.f27138b = fVar;
        o oVar = new o(this);
        this.f27139c = oVar;
        oVar.f21165a.setTextAlign(Paint.Align.CENTER);
        Context context3 = (Context) weakReference.get();
        if (!(context3 == null || oVar.f21170f == (dVar = new d(context3, 2132083234)) || (context2 = (Context) weakReference.get()) == null)) {
            oVar.b(dVar, context2);
            h();
        }
        c cVar = new c(context, i10, i11, i12, aVar);
        this.f27141e = cVar;
        double d10 = (double) cVar.f27151b.f27160f;
        Double.isNaN(d10);
        Double.isNaN(d10);
        Double.isNaN(d10);
        Double.isNaN(d10);
        Double.isNaN(d10);
        this.f27144h = ((int) Math.pow(10.0d, d10 - 1.0d)) - 1;
        oVar.f21168d = true;
        h();
        invalidateSelf();
        oVar.f21168d = true;
        h();
        invalidateSelf();
        oVar.f21165a.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(cVar.f27151b.f27156b.intValue());
        if (fVar.f25079a.f25101d != valueOf) {
            fVar.r(valueOf);
            invalidateSelf();
        }
        oVar.f21165a.setColor(cVar.f27151b.f27157c.intValue());
        invalidateSelf();
        WeakReference<View> weakReference2 = this.f27148t;
        if (!(weakReference2 == null || weakReference2.get() == null)) {
            View view = (View) this.f27148t.get();
            WeakReference<FrameLayout> weakReference3 = this.f27149u;
            g(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        h();
        boolean booleanValue = cVar.f27151b.f27166t.booleanValue();
        setVisible(booleanValue, false);
        if (d.f27173a && d() != null && !booleanValue) {
            ((ViewGroup) d().getParent()).invalidate();
        }
    }

    public void a() {
        invalidateSelf();
    }

    public final String b() {
        if (e() <= this.f27144h) {
            return NumberFormat.getInstance(this.f27141e.f27151b.f27161g).format((long) e());
        }
        Context context = (Context) this.f27137a.get();
        if (context == null) {
            return "";
        }
        return String.format(this.f27141e.f27151b.f27161g, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), new Object[]{Integer.valueOf(this.f27144h), "+"});
    }

    public CharSequence c() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!f()) {
            return this.f27141e.f27151b.f27162h;
        }
        if (this.f27141e.f27151b.f27163i == 0 || (context = (Context) this.f27137a.get()) == null) {
            return null;
        }
        int e10 = e();
        int i10 = this.f27144h;
        if (e10 <= i10) {
            return context.getResources().getQuantityString(this.f27141e.f27151b.f27163i, e(), new Object[]{Integer.valueOf(e())});
        }
        return context.getString(this.f27141e.f27151b.f27164r, new Object[]{Integer.valueOf(i10)});
    }

    public FrameLayout d() {
        WeakReference<FrameLayout> weakReference = this.f27149u;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f27138b.draw(canvas);
            if (f()) {
                Rect rect = new Rect();
                String b10 = b();
                this.f27139c.f21165a.getTextBounds(b10, 0, b10.length(), rect);
                canvas.drawText(b10, this.f27142f, this.f27143g + ((float) (rect.height() / 2)), this.f27139c.f21165a);
            }
        }
    }

    public int e() {
        if (f()) {
            return this.f27141e.f27151b.f27159e;
        }
        return 0;
    }

    public boolean f() {
        return this.f27141e.f27151b.f27159e != -1;
    }

    public void g(View view, FrameLayout frameLayout) {
        WeakReference<FrameLayout> weakReference;
        this.f27148t = new WeakReference<>(view);
        boolean z10 = d.f27173a;
        if (!z10 || frameLayout != null) {
            this.f27149u = new WeakReference<>(frameLayout);
        } else {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if ((viewGroup == null || viewGroup.getId() != R.id.mtrl_anchor_parent) && ((weakReference = this.f27149u) == null || weakReference.get() != viewGroup)) {
                ViewGroup viewGroup2 = (ViewGroup) view.getParent();
                viewGroup2.setClipChildren(false);
                viewGroup2.setClipToPadding(false);
                FrameLayout frameLayout2 = new FrameLayout(view.getContext());
                frameLayout2.setId(R.id.mtrl_anchor_parent);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                frameLayout2.setLayoutParams(view.getLayoutParams());
                frameLayout2.setMinimumWidth(view.getWidth());
                frameLayout2.setMinimumHeight(view.getHeight());
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(indexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout2.addView(view);
                viewGroup.addView(frameLayout2, indexOfChild);
                this.f27149u = new WeakReference<>(frameLayout2);
                frameLayout2.post(new a(this, view, frameLayout2));
            }
        }
        if (!z10) {
            ViewGroup viewGroup3 = (ViewGroup) view.getParent();
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
        h();
        invalidateSelf();
    }

    public int getAlpha() {
        return this.f27141e.f27151b.f27158d;
    }

    public int getIntrinsicHeight() {
        return this.f27140d.height();
    }

    public int getIntrinsicWidth() {
        return this.f27140d.width();
    }

    public int getOpacity() {
        return -3;
    }

    public final void h() {
        int i10;
        int i11;
        float f10;
        float f11;
        Context context = (Context) this.f27137a.get();
        WeakReference<View> weakReference = this.f27148t;
        ViewGroup viewGroup = null;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f27140d);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<FrameLayout> weakReference2 = this.f27149u;
            if (weakReference2 != null) {
                viewGroup = (FrameLayout) weakReference2.get();
            }
            if (viewGroup != null || d.f27173a) {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            if (f()) {
                i10 = this.f27141e.f27151b.f27170x.intValue();
            } else {
                i10 = this.f27141e.f27151b.f27168v.intValue();
            }
            int intValue = this.f27141e.f27151b.f27172z.intValue() + i10;
            int intValue2 = this.f27141e.f27151b.f27165s.intValue();
            if (intValue2 == 8388691 || intValue2 == 8388693) {
                this.f27143g = (float) (rect2.bottom - intValue);
            } else {
                this.f27143g = (float) (rect2.top + intValue);
            }
            if (e() <= 9) {
                float f12 = !f() ? this.f27141e.f27152c : this.f27141e.f27153d;
                this.f27145i = f12;
                this.f27147s = f12;
                this.f27146r = f12;
            } else {
                float f13 = this.f27141e.f27153d;
                this.f27145i = f13;
                this.f27147s = f13;
                this.f27146r = (this.f27139c.a(b()) / 2.0f) + this.f27141e.f27154e;
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(f() ? R.dimen.mtrl_badge_text_horizontal_edge_offset : R.dimen.mtrl_badge_horizontal_edge_offset);
            if (f()) {
                i11 = this.f27141e.f27151b.f27169w.intValue();
            } else {
                i11 = this.f27141e.f27151b.f27167u.intValue();
            }
            int intValue3 = this.f27141e.f27151b.f27171y.intValue() + i11;
            int intValue4 = this.f27141e.f27151b.f27165s.intValue();
            if (intValue4 == 8388659 || intValue4 == 8388691) {
                WeakHashMap<View, String> weakHashMap = c0.f22553a;
                if (c0.e.d(view) == 0) {
                    f10 = (((float) rect2.left) - this.f27146r) + ((float) dimensionPixelSize) + ((float) intValue3);
                } else {
                    f10 = ((((float) rect2.right) + this.f27146r) - ((float) dimensionPixelSize)) - ((float) intValue3);
                }
                this.f27142f = f10;
            } else {
                WeakHashMap<View, String> weakHashMap2 = c0.f22553a;
                if (c0.e.d(view) == 0) {
                    f11 = ((((float) rect2.right) + this.f27146r) - ((float) dimensionPixelSize)) - ((float) intValue3);
                } else {
                    f11 = (((float) rect2.left) - this.f27146r) + ((float) dimensionPixelSize) + ((float) intValue3);
                }
                this.f27142f = f11;
            }
            Rect rect3 = this.f27140d;
            float f14 = this.f27142f;
            float f15 = this.f27143g;
            float f16 = this.f27146r;
            float f17 = this.f27147s;
            boolean z10 = d.f27173a;
            rect3.set((int) (f14 - f16), (int) (f15 - f17), (int) (f14 + f16), (int) (f15 + f17));
            f fVar = this.f27138b;
            fVar.f25079a.f25098a = fVar.f25079a.f25098a.f(this.f27145i);
            fVar.invalidateSelf();
            if (!rect.equals(this.f27140d)) {
                this.f27138b.setBounds(this.f27140d);
            }
        }
    }

    public boolean isStateful() {
        return false;
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void setAlpha(int i10) {
        c cVar = this.f27141e;
        cVar.f27150a.f27158d = i10;
        cVar.f27151b.f27158d = i10;
        this.f27139c.f21165a.setAlpha(getAlpha());
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}

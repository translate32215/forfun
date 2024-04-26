package b9;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.startapp.startappsdk.R;
import java.util.WeakHashMap;
import o0.c0;
import q9.b;
import s9.f;
import s9.h;
import s9.i;
import x3.d;

/* compiled from: MaterialCardViewHelper */
public class a {

    /* renamed from: u  reason: collision with root package name */
    public static final double f3660u = Math.cos(Math.toRadians(45.0d));

    /* renamed from: v  reason: collision with root package name */
    public static final Drawable f3661v = (Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null);

    /* renamed from: a  reason: collision with root package name */
    public final MaterialCardView f3662a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f3663b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    public final f f3664c;

    /* renamed from: d  reason: collision with root package name */
    public final f f3665d;

    /* renamed from: e  reason: collision with root package name */
    public int f3666e;

    /* renamed from: f  reason: collision with root package name */
    public int f3667f;

    /* renamed from: g  reason: collision with root package name */
    public int f3668g;

    /* renamed from: h  reason: collision with root package name */
    public int f3669h;

    /* renamed from: i  reason: collision with root package name */
    public Drawable f3670i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f3671j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f3672k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f3673l;

    /* renamed from: m  reason: collision with root package name */
    public i f3674m;

    /* renamed from: n  reason: collision with root package name */
    public ColorStateList f3675n;

    /* renamed from: o  reason: collision with root package name */
    public Drawable f3676o;

    /* renamed from: p  reason: collision with root package name */
    public LayerDrawable f3677p;

    /* renamed from: q  reason: collision with root package name */
    public f f3678q;

    /* renamed from: r  reason: collision with root package name */
    public f f3679r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f3680s = false;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3681t;

    /* renamed from: b9.a$a  reason: collision with other inner class name */
    /* compiled from: MaterialCardViewHelper */
    public class C0051a extends InsetDrawable {
        public C0051a(a aVar, Drawable drawable, int i10, int i11, int i12, int i13) {
            super(drawable, i10, i11, i12, i13);
        }

        public int getMinimumHeight() {
            return -1;
        }

        public int getMinimumWidth() {
            return -1;
        }

        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    public a(MaterialCardView materialCardView, AttributeSet attributeSet, int i10, int i11) {
        this.f3662a = materialCardView;
        f fVar = new f(i.c(materialCardView.getContext(), attributeSet, i10, i11).a());
        this.f3664c = fVar;
        fVar.o(materialCardView.getContext());
        fVar.t(-12303292);
        i iVar = fVar.f25079a.f25098a;
        iVar.getClass();
        i.b bVar = new i.b(iVar);
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, t8.a.f25839f, i10, R.style.CardView);
        if (obtainStyledAttributes.hasValue(3)) {
            bVar.c(obtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.f3665d = new f();
        j(bVar.a());
        obtainStyledAttributes.recycle();
    }

    public final float a() {
        float b10 = b(this.f3674m.f25121a, this.f3664c.m());
        d dVar = this.f3674m.f25122b;
        f fVar = this.f3664c;
        float max = Math.max(b10, b(dVar, fVar.f25079a.f25098a.f25126f.a(fVar.i())));
        d dVar2 = this.f3674m.f25123c;
        f fVar2 = this.f3664c;
        float b11 = b(dVar2, fVar2.f25079a.f25098a.f25127g.a(fVar2.i()));
        d dVar3 = this.f3674m.f25124d;
        f fVar3 = this.f3664c;
        return Math.max(max, Math.max(b11, b(dVar3, fVar3.f25079a.f25098a.f25128h.a(fVar3.i()))));
    }

    public final float b(d dVar, float f10) {
        if (dVar instanceof h) {
            double d10 = (double) f10;
            Double.isNaN(d10);
            return (float) ((1.0d - f3660u) * d10);
        } else if (dVar instanceof s9.d) {
            return f10 / 2.0f;
        } else {
            return 0.0f;
        }
    }

    public final float c() {
        return this.f3662a.getMaxCardElevation() + (l() ? a() : 0.0f);
    }

    public final float d() {
        return (this.f3662a.getMaxCardElevation() * 1.5f) + (l() ? a() : 0.0f);
    }

    public final boolean e() {
        return Build.VERSION.SDK_INT >= 21 && this.f3664c.p();
    }

    public final Drawable f() {
        RippleDrawable rippleDrawable;
        if (this.f3676o == null) {
            if (b.f24232a) {
                this.f3679r = new f(this.f3674m);
                rippleDrawable = new RippleDrawable(this.f3672k, (Drawable) null, this.f3679r);
            } else {
                StateListDrawable stateListDrawable = new StateListDrawable();
                f fVar = new f(this.f3674m);
                this.f3678q = fVar;
                fVar.r(this.f3672k);
                stateListDrawable.addState(new int[]{16842919}, this.f3678q);
                rippleDrawable = stateListDrawable;
            }
            this.f3676o = rippleDrawable;
        }
        if (this.f3677p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f3676o, this.f3665d, this.f3671j});
            this.f3677p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f3677p;
    }

    public final Drawable g(Drawable drawable) {
        int i10;
        int i11;
        if ((Build.VERSION.SDK_INT < 21) || this.f3662a.getUseCompatPadding()) {
            int ceil = (int) Math.ceil((double) d());
            i11 = (int) Math.ceil((double) c());
            i10 = ceil;
        } else {
            i11 = 0;
            i10 = 0;
        }
        return new C0051a(this, drawable, i11, i10, i11, i10);
    }

    public void h(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        if (this.f3677p != null) {
            boolean z10 = false;
            if ((Build.VERSION.SDK_INT < 21) || this.f3662a.getUseCompatPadding()) {
                i13 = (int) Math.ceil((double) (d() * 2.0f));
                i12 = (int) Math.ceil((double) (c() * 2.0f));
            } else {
                i13 = 0;
                i12 = 0;
            }
            int i20 = this.f3668g;
            int i21 = i20 & 8388613;
            if (i21 == 8388613) {
                i14 = ((i10 - this.f3666e) - this.f3667f) - i12;
            } else {
                i14 = this.f3666e;
            }
            int i22 = i20 & 80;
            if (i22 == 80) {
                i15 = this.f3666e;
            } else {
                i15 = ((i11 - this.f3666e) - this.f3667f) - i13;
            }
            int i23 = i15;
            if (i21 == 8388613) {
                i16 = this.f3666e;
            } else {
                i16 = ((i10 - this.f3666e) - this.f3667f) - i12;
            }
            if (i22 == 80) {
                z10 = true;
            }
            if (z10) {
                i17 = ((i11 - this.f3666e) - this.f3667f) - i13;
            } else {
                i17 = this.f3666e;
            }
            MaterialCardView materialCardView = this.f3662a;
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            if (c0.e.d(materialCardView) == 1) {
                i19 = i16;
                i18 = i14;
            } else {
                i18 = i16;
                i19 = i14;
            }
            this.f3677p.setLayerInset(2, i19, i17, i18, i23);
        }
    }

    public void i(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = androidx.core.graphics.drawable.a.n(drawable).mutate();
            this.f3671j = mutate;
            androidx.core.graphics.drawable.a.l(mutate, this.f3673l);
            boolean isChecked = this.f3662a.isChecked();
            Drawable drawable2 = this.f3671j;
            if (drawable2 != null) {
                drawable2.setAlpha(isChecked ? 255 : 0);
            }
        } else {
            this.f3671j = f3661v;
        }
        LayerDrawable layerDrawable = this.f3677p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f3671j);
        }
    }

    public void j(i iVar) {
        this.f3674m = iVar;
        f fVar = this.f3664c;
        fVar.f25079a.f25098a = iVar;
        fVar.invalidateSelf();
        f fVar2 = this.f3664c;
        fVar2.E = !fVar2.p();
        f fVar3 = this.f3665d;
        if (fVar3 != null) {
            fVar3.f25079a.f25098a = iVar;
            fVar3.invalidateSelf();
        }
        f fVar4 = this.f3679r;
        if (fVar4 != null) {
            fVar4.f25079a.f25098a = iVar;
            fVar4.invalidateSelf();
        }
        f fVar5 = this.f3678q;
        if (fVar5 != null) {
            fVar5.f25079a.f25098a = iVar;
            fVar5.invalidateSelf();
        }
    }

    public final boolean k() {
        return this.f3662a.getPreventCornerOverlap() && !e();
    }

    public final boolean l() {
        return this.f3662a.getPreventCornerOverlap() && e() && this.f3662a.getUseCompatPadding();
    }

    public void m() {
        float f10 = 0.0f;
        float a10 = k() || l() ? a() : 0.0f;
        if (this.f3662a.getPreventCornerOverlap() && (Build.VERSION.SDK_INT < 21 || this.f3662a.getUseCompatPadding())) {
            double d10 = 1.0d - f3660u;
            double cardViewRadius = (double) this.f3662a.getCardViewRadius();
            Double.isNaN(cardViewRadius);
            Double.isNaN(cardViewRadius);
            f10 = (float) (d10 * cardViewRadius);
        }
        int i10 = (int) (a10 - f10);
        MaterialCardView materialCardView = this.f3662a;
        Rect rect = this.f3663b;
        materialCardView.f24442e.set(rect.left + i10, rect.top + i10, rect.right + i10, rect.bottom + i10);
        r.a.f24437i.j(materialCardView.f24444g);
    }

    public void n() {
        if (!this.f3680s) {
            this.f3662a.setBackgroundInternal(g(this.f3664c));
        }
        this.f3662a.setForeground(g(this.f3670i));
    }

    public final void o() {
        Drawable drawable;
        if (!b.f24232a || (drawable = this.f3676o) == null) {
            f fVar = this.f3678q;
            if (fVar != null) {
                fVar.r(this.f3672k);
                return;
            }
            return;
        }
        ((RippleDrawable) drawable).setColor(this.f3672k);
    }

    public void p() {
        this.f3665d.v((float) this.f3669h, this.f3675n);
    }
}

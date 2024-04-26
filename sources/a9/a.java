package a9;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.startapp.startappsdk.R;
import e.d;
import java.util.WeakHashMap;
import o0.c0;
import s9.f;
import s9.i;
import s9.m;

/* compiled from: MaterialButtonHelper */
public class a {

    /* renamed from: t  reason: collision with root package name */
    public static final boolean f150t;

    /* renamed from: u  reason: collision with root package name */
    public static final boolean f151u;

    /* renamed from: a  reason: collision with root package name */
    public final MaterialButton f152a;

    /* renamed from: b  reason: collision with root package name */
    public i f153b;

    /* renamed from: c  reason: collision with root package name */
    public int f154c;

    /* renamed from: d  reason: collision with root package name */
    public int f155d;

    /* renamed from: e  reason: collision with root package name */
    public int f156e;

    /* renamed from: f  reason: collision with root package name */
    public int f157f;

    /* renamed from: g  reason: collision with root package name */
    public int f158g;

    /* renamed from: h  reason: collision with root package name */
    public int f159h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuff.Mode f160i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f161j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f162k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f163l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f164m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f165n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f166o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f167p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f168q;

    /* renamed from: r  reason: collision with root package name */
    public LayerDrawable f169r;

    /* renamed from: s  reason: collision with root package name */
    public int f170s;

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = true;
        f150t = i10 >= 21;
        if (i10 < 21 || i10 > 22) {
            z10 = false;
        }
        f151u = z10;
    }

    public a(MaterialButton materialButton, i iVar) {
        this.f152a = materialButton;
        this.f153b = iVar;
    }

    public m a() {
        LayerDrawable layerDrawable = this.f169r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f169r.getNumberOfLayers() > 2) {
            return (m) this.f169r.getDrawable(2);
        }
        return (m) this.f169r.getDrawable(1);
    }

    public f b() {
        return c(false);
    }

    public final f c(boolean z10) {
        LayerDrawable layerDrawable = this.f169r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (f150t) {
            return (f) ((LayerDrawable) ((InsetDrawable) this.f169r.getDrawable(0)).getDrawable()).getDrawable(z10 ^ true ? 1 : 0);
        }
        return (f) this.f169r.getDrawable(z10 ^ true ? 1 : 0);
    }

    public final f d() {
        return c(true);
    }

    public void e(i iVar) {
        this.f153b = iVar;
        if (!f151u || this.f166o) {
            if (b() != null) {
                f b10 = b();
                b10.f25079a.f25098a = iVar;
                b10.invalidateSelf();
            }
            if (d() != null) {
                f d10 = d();
                d10.f25079a.f25098a = iVar;
                d10.invalidateSelf();
            }
            if (a() != null) {
                a().setShapeAppearanceModel(iVar);
                return;
            }
            return;
        }
        MaterialButton materialButton = this.f152a;
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        int f10 = c0.e.f(materialButton);
        int paddingTop = this.f152a.getPaddingTop();
        int e10 = c0.e.e(this.f152a);
        int paddingBottom = this.f152a.getPaddingBottom();
        g();
        c0.e.k(this.f152a, f10, paddingTop, e10, paddingBottom);
    }

    public final void f(int i10, int i11) {
        MaterialButton materialButton = this.f152a;
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        int f10 = c0.e.f(materialButton);
        int paddingTop = this.f152a.getPaddingTop();
        int e10 = c0.e.e(this.f152a);
        int paddingBottom = this.f152a.getPaddingBottom();
        int i12 = this.f156e;
        int i13 = this.f157f;
        this.f157f = i11;
        this.f156e = i10;
        if (!this.f166o) {
            g();
        }
        c0.e.k(this.f152a, f10, (paddingTop + i10) - i12, e10, (paddingBottom + i11) - i13);
    }

    /* JADX WARNING: type inference failed for: r4v9, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r14 = this;
            com.google.android.material.button.MaterialButton r0 = r14.f152a
            s9.f r1 = new s9.f
            s9.i r2 = r14.f153b
            r1.<init>((s9.i) r2)
            com.google.android.material.button.MaterialButton r2 = r14.f152a
            android.content.Context r2 = r2.getContext()
            r1.o(r2)
            android.content.res.ColorStateList r2 = r14.f161j
            androidx.core.graphics.drawable.a.l(r1, r2)
            android.graphics.PorterDuff$Mode r2 = r14.f160i
            if (r2 == 0) goto L_0x001e
            androidx.core.graphics.drawable.a.m(r1, r2)
        L_0x001e:
            int r2 = r14.f159h
            float r2 = (float) r2
            android.content.res.ColorStateList r3 = r14.f162k
            r1.v(r2, r3)
            s9.f r2 = new s9.f
            s9.i r3 = r14.f153b
            r2.<init>((s9.i) r3)
            r3 = 0
            r2.setTint(r3)
            int r4 = r14.f159h
            float r4 = (float) r4
            boolean r5 = r14.f165n
            if (r5 == 0) goto L_0x0042
            com.google.android.material.button.MaterialButton r5 = r14.f152a
            r6 = 2130968866(0x7f040122, float:1.7546398E38)
            int r5 = e.d.g(r5, r6)
            goto L_0x0043
        L_0x0042:
            r5 = 0
        L_0x0043:
            r2.u(r4, r5)
            boolean r4 = f150t
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0082
            s9.f r4 = new s9.f
            s9.i r7 = r14.f153b
            r4.<init>((s9.i) r7)
            r14.f164m = r4
            r7 = -1
            androidx.core.graphics.drawable.a.k(r4, r7)
            android.graphics.drawable.RippleDrawable r4 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r7 = r14.f163l
            android.content.res.ColorStateList r7 = q9.b.c(r7)
            android.graphics.drawable.LayerDrawable r9 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable[] r5 = new android.graphics.drawable.Drawable[r5]
            r5[r3] = r2
            r5[r6] = r1
            r9.<init>(r5)
            android.graphics.drawable.InsetDrawable r1 = new android.graphics.drawable.InsetDrawable
            int r10 = r14.f154c
            int r11 = r14.f156e
            int r12 = r14.f155d
            int r13 = r14.f157f
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13)
            android.graphics.drawable.Drawable r2 = r14.f164m
            r4.<init>(r7, r1, r2)
            r14.f169r = r4
            goto L_0x00b4
        L_0x0082:
            q9.a r4 = new q9.a
            s9.i r7 = r14.f153b
            r4.<init>(r7)
            r14.f164m = r4
            android.content.res.ColorStateList r7 = r14.f163l
            android.content.res.ColorStateList r7 = q9.b.c(r7)
            androidx.core.graphics.drawable.a.l(r4, r7)
            android.graphics.drawable.LayerDrawable r9 = new android.graphics.drawable.LayerDrawable
            r4 = 3
            android.graphics.drawable.Drawable[] r4 = new android.graphics.drawable.Drawable[r4]
            r4[r3] = r2
            r4[r6] = r1
            android.graphics.drawable.Drawable r1 = r14.f164m
            r4[r5] = r1
            r9.<init>(r4)
            r14.f169r = r9
            android.graphics.drawable.InsetDrawable r4 = new android.graphics.drawable.InsetDrawable
            int r10 = r14.f154c
            int r11 = r14.f156e
            int r12 = r14.f155d
            int r13 = r14.f157f
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13)
        L_0x00b4:
            r0.setInternalBackground(r4)
            s9.f r0 = r14.b()
            if (r0 == 0) goto L_0x00c3
            int r1 = r14.f170s
            float r1 = (float) r1
            r0.q(r1)
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.a.g():void");
    }

    public final void h() {
        f b10 = b();
        f d10 = d();
        if (b10 != null) {
            b10.v((float) this.f159h, this.f162k);
            if (d10 != null) {
                d10.u((float) this.f159h, this.f165n ? d.g(this.f152a, R.attr.colorSurface) : 0);
            }
        }
    }
}

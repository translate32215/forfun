package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.a;
import e.l;
import java.util.WeakHashMap;
import o0.c0;

/* compiled from: AppCompatSeekBarHelper */
public class z extends u {

    /* renamed from: d  reason: collision with root package name */
    public final SeekBar f1127d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f1128e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f1129f = null;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f1130g = null;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1131h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1132i = false;

    public z(SeekBar seekBar) {
        super(seekBar);
        this.f1127d = seekBar;
    }

    public void a(AttributeSet attributeSet, int i10) {
        super.a(attributeSet, i10);
        Context context = this.f1127d.getContext();
        int[] iArr = l.f13507g;
        g1 r10 = g1.r(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.f1127d;
        c0.B(seekBar, seekBar.getContext(), iArr, attributeSet, r10.f924b, i10, 0);
        Drawable h10 = r10.h(0);
        if (h10 != null) {
            this.f1127d.setThumb(h10);
        }
        Drawable g10 = r10.g(1);
        Drawable drawable = this.f1128e;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.f1128e = g10;
        if (g10 != null) {
            g10.setCallback(this.f1127d);
            SeekBar seekBar2 = this.f1127d;
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            a.j(g10, c0.e.d(seekBar2));
            if (g10.isStateful()) {
                g10.setState(this.f1127d.getDrawableState());
            }
            c();
        }
        this.f1127d.invalidate();
        if (r10.p(3)) {
            this.f1130g = k0.c(r10.j(3, -1), this.f1130g);
            this.f1132i = true;
        }
        if (r10.p(2)) {
            this.f1129f = r10.c(2);
            this.f1131h = true;
        }
        r10.f924b.recycle();
        c();
    }

    public final void c() {
        Drawable drawable = this.f1128e;
        if (drawable == null) {
            return;
        }
        if (this.f1131h || this.f1132i) {
            Drawable n10 = a.n(drawable.mutate());
            this.f1128e = n10;
            if (this.f1131h) {
                a.l(n10, this.f1129f);
            }
            if (this.f1132i) {
                a.m(this.f1128e, this.f1130g);
            }
            if (this.f1128e.isStateful()) {
                this.f1128e.setState(this.f1127d.getDrawableState());
            }
        }
    }

    public void d(Canvas canvas) {
        if (this.f1128e != null) {
            int max = this.f1127d.getMax();
            int i10 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1128e.getIntrinsicWidth();
                int intrinsicHeight = this.f1128e.getIntrinsicHeight();
                int i11 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i10 = intrinsicHeight / 2;
                }
                this.f1128e.setBounds(-i11, -i10, i11, i10);
                float width = ((float) ((this.f1127d.getWidth() - this.f1127d.getPaddingLeft()) - this.f1127d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f1127d.getPaddingLeft(), (float) (this.f1127d.getHeight() / 2));
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f1128e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}

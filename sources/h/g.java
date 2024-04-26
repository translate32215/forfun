package h;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import h.c;

@SuppressLint({"RestrictedAPI"})
/* compiled from: StateListDrawable */
public class g extends c {

    /* renamed from: v  reason: collision with root package name */
    public a f18768v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f18769w;

    /* compiled from: StateListDrawable */
    public static class a extends c.C0153c {
        public int[][] J;

        public a(a aVar, g gVar, Resources resources) {
            super(aVar, gVar, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[this.f18735g.length][];
            }
        }

        public void e() {
            int[][] iArr = this.J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.J = iArr2;
        }

        public int g(int[] iArr) {
            int[][] iArr2 = this.J;
            int i10 = this.f18736h;
            for (int i11 = 0; i11 < i10; i11++) {
                if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                    return i11;
                }
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new g(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new g(this, resources);
        }
    }

    public g(a aVar, Resources resources) {
        e(new a(aVar, this, resources));
        onStateChange(getState());
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    public void e(c.C0153c cVar) {
        this.f18715a = cVar;
        int i10 = this.f18721g;
        if (i10 >= 0) {
            Drawable d10 = cVar.d(i10);
            this.f18717c = d10;
            if (d10 != null) {
                c(d10);
            }
        }
        this.f18718d = null;
        if (cVar instanceof a) {
            this.f18768v = (a) cVar;
        }
    }

    /* renamed from: f */
    public a b() {
        return new a(this.f18768v, this, (Resources) null);
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        if (!this.f18769w) {
            super.mutate();
            this.f18768v.e();
            this.f18769w = true;
        }
        return this;
    }

    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int g10 = this.f18768v.g(iArr);
        if (g10 < 0) {
            g10 = this.f18768v.g(StateSet.WILD_CARD);
        }
        return d(g10) || onStateChange;
    }

    public g(a aVar) {
    }
}

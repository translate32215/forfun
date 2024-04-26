package androidx.leanback.app;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import com.startapp.startappsdk.R;
import java.lang.ref.WeakReference;

/* compiled from: BackgroundManager */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public Activity f1887a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f1888b = new Handler();

    /* renamed from: c  reason: collision with root package name */
    public View f1889c;

    /* renamed from: d  reason: collision with root package name */
    public c f1890d;

    /* renamed from: e  reason: collision with root package name */
    public int f1891e;

    /* renamed from: f  reason: collision with root package name */
    public a f1892f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f1893g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1894h;

    /* renamed from: i  reason: collision with root package name */
    public long f1895i;

    /* renamed from: j  reason: collision with root package name */
    public final ValueAnimator f1896j;

    /* renamed from: k  reason: collision with root package name */
    public h f1897k;

    /* renamed from: l  reason: collision with root package name */
    public int f1898l;

    /* renamed from: m  reason: collision with root package name */
    public e f1899m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1900n;

    /* compiled from: BackgroundManager */
    public class a implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f1901a = new C0022a();

        /* renamed from: androidx.leanback.app.b$a$a  reason: collision with other inner class name */
        /* compiled from: BackgroundManager */
        public class C0022a implements Runnable {
            public C0022a() {
            }

            public void run() {
                b.this.d();
            }
        }

        public a() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            b bVar = b.this;
            h hVar = bVar.f1897k;
            if (hVar != null) {
                hVar.a(R.id.background_imageout, bVar.f1887a);
            }
            b.this.f1888b.post(this.f1901a);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: androidx.leanback.app.b$b  reason: collision with other inner class name */
    /* compiled from: BackgroundManager */
    public class C0023b implements ValueAnimator.AnimatorUpdateListener {
        public C0023b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            b bVar = b.this;
            int i10 = bVar.f1898l;
            if (i10 != -1) {
                h hVar = bVar.f1897k;
                f[] fVarArr = hVar.f1919a;
                if (fVarArr[i10] != null) {
                    fVarArr[i10].f1917a = intValue;
                    hVar.invalidateSelf();
                }
            }
        }
    }

    /* compiled from: BackgroundManager */
    public static class c {

        /* renamed from: e  reason: collision with root package name */
        public static c f1905e = new c();

        /* renamed from: a  reason: collision with root package name */
        public Drawable f1906a = null;

        /* renamed from: b  reason: collision with root package name */
        public int f1907b;

        /* renamed from: c  reason: collision with root package name */
        public int f1908c;

        /* renamed from: d  reason: collision with root package name */
        public WeakReference<Drawable.ConstantState> f1909d;
    }

    /* compiled from: BackgroundManager */
    public final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable f1915a;

        public e(Drawable drawable) {
            this.f1915a = drawable;
        }

        public void run() {
            Drawable drawable;
            b bVar = b.this;
            h hVar = bVar.f1897k;
            if (hVar != null) {
                f fVar = hVar.f1919a[bVar.f1898l];
                if (fVar != null) {
                    if (!bVar.f(this.f1915a, fVar.f1918b)) {
                        b bVar2 = b.this;
                        bVar2.f1897k.a(R.id.background_imagein, bVar2.f1887a);
                        b.this.f1897k.c(R.id.background_imageout, fVar.f1918b);
                    }
                }
                b bVar3 = b.this;
                if (bVar3.f1894h) {
                    h hVar2 = bVar3.f1897k;
                    if ((hVar2 == null ? null : hVar2.f1919a[bVar3.f1898l]) == null && (drawable = this.f1915a) != null) {
                        hVar2.c(R.id.background_imagein, drawable);
                        b bVar4 = b.this;
                        h hVar3 = bVar4.f1897k;
                        int i10 = bVar4.f1898l;
                        f[] fVarArr = hVar3.f1919a;
                        if (fVarArr[i10] != null) {
                            fVarArr[i10].f1917a = 0;
                            hVar3.invalidateSelf();
                        }
                    }
                    b.this.f1896j.setDuration(500);
                    b.this.f1896j.start();
                }
            }
            b.this.f1899m = null;
        }
    }

    /* compiled from: BackgroundManager */
    public static class g extends d {
        public g(Resources resources) {
            super(resources, (Bitmap) null);
        }
    }

    /* compiled from: BackgroundManager */
    public static final class h extends LayerDrawable {

        /* renamed from: a  reason: collision with root package name */
        public f[] f1919a;

        /* renamed from: b  reason: collision with root package name */
        public int f1920b = 255;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1921c;

        /* renamed from: d  reason: collision with root package name */
        public WeakReference<b> f1922d;

        public h(b bVar, Drawable[] drawableArr) {
            super(drawableArr);
            this.f1922d = new WeakReference<>(bVar);
            int length = drawableArr.length;
            this.f1919a = new f[length];
            for (int i10 = 0; i10 < length; i10++) {
                this.f1919a[i10] = new f(drawableArr[i10]);
            }
        }

        public void a(int i10, Context context) {
            for (int i11 = 0; i11 < getNumberOfLayers(); i11++) {
                if (getId(i11) == i10) {
                    this.f1919a[i11] = null;
                    if (!(getDrawable(i11) instanceof g)) {
                        super.setDrawableByLayerId(i10, new g(context.getResources()));
                        return;
                    }
                    return;
                }
            }
        }

        public int b(int i10) {
            for (int i11 = 0; i11 < getNumberOfLayers(); i11++) {
                if (getId(i11) == i10) {
                    return i11;
                }
            }
            return -1;
        }

        public f c(int i10, Drawable drawable) {
            super.setDrawableByLayerId(i10, drawable);
            for (int i11 = 0; i11 < getNumberOfLayers(); i11++) {
                if (getId(i11) == i10) {
                    this.f1919a[i11] = new f(drawable);
                    invalidateSelf();
                    return this.f1919a[i11];
                }
            }
            return null;
        }

        /* JADX INFO: finally extract failed */
        public void draw(Canvas canvas) {
            Drawable drawable;
            int i10;
            int i11;
            int i12 = 0;
            while (true) {
                f[] fVarArr = this.f1919a;
                if (i12 < fVarArr.length) {
                    if (!(fVarArr[i12] == null || (drawable = fVarArr[i12].f1918b) == null)) {
                        int d10 = Build.VERSION.SDK_INT >= 19 ? androidx.core.graphics.drawable.a.d(drawable) : 255;
                        int i13 = this.f1920b;
                        if (i13 < 255) {
                            i11 = i13 * d10;
                            i10 = 1;
                        } else {
                            i11 = d10;
                            i10 = 0;
                        }
                        f[] fVarArr2 = this.f1919a;
                        if (fVarArr2[i12].f1917a < 255) {
                            i11 *= fVarArr2[i12].f1917a;
                            i10++;
                        }
                        if (i10 == 0) {
                            drawable.draw(canvas);
                        } else {
                            if (i10 == 1) {
                                i11 /= 255;
                            } else if (i10 == 2) {
                                i11 /= 65025;
                            }
                            try {
                                this.f1921c = true;
                                drawable.setAlpha(i11);
                                drawable.draw(canvas);
                                drawable.setAlpha(d10);
                                this.f1921c = false;
                            } catch (Throwable th) {
                                this.f1921c = false;
                                throw th;
                            }
                        }
                    }
                    i12++;
                } else {
                    return;
                }
            }
        }

        public int getAlpha() {
            return this.f1920b;
        }

        public int getOpacity() {
            return -3;
        }

        public void invalidateDrawable(Drawable drawable) {
            if (!this.f1921c) {
                super.invalidateDrawable(drawable);
            }
        }

        public Drawable mutate() {
            Drawable mutate = super.mutate();
            int numberOfLayers = getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                f[] fVarArr = this.f1919a;
                if (fVarArr[i10] != null) {
                    fVarArr[i10] = new f(fVarArr[i10], getDrawable(i10));
                }
            }
            return mutate;
        }

        public void setAlpha(int i10) {
            if (this.f1920b != i10) {
                this.f1920b = i10;
                invalidateSelf();
                b bVar = (b) this.f1922d.get();
                if (bVar != null) {
                    bVar.d();
                }
            }
        }

        public boolean setDrawableByLayerId(int i10, Drawable drawable) {
            return c(i10, drawable) != null;
        }
    }

    public b(Activity activity) {
        a aVar = new a();
        C0023b bVar = new C0023b();
        this.f1887a = activity;
        c cVar = c.f1905e;
        cVar.f1907b++;
        this.f1890d = cVar;
        int i10 = activity.getResources().getDisplayMetrics().heightPixels;
        int i11 = this.f1887a.getResources().getDisplayMetrics().widthPixels;
        d1.a aVar2 = new d1.a();
        AnimationUtils.loadInterpolator(this.f1887a, 17432581);
        AnimationUtils.loadInterpolator(this.f1887a, 17432582);
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 255});
        this.f1896j = ofInt;
        ofInt.addListener(aVar);
        ofInt.addUpdateListener(bVar);
        ofInt.setInterpolator(aVar2);
        TypedArray obtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{16842836});
        this.f1891e = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        a aVar3 = (a) activity.getFragmentManager().findFragmentByTag("androidx.leanback.app.b");
        if (aVar3 == null) {
            aVar3 = new a();
            activity.getFragmentManager().beginTransaction().add(aVar3, "androidx.leanback.app.b").commit();
        } else if (aVar3.f1886a != null) {
            throw new IllegalStateException("Created duplicated BackgroundManager for same activity, please use getInstance() instead");
        }
        aVar3.f1886a = this;
        this.f1892f = aVar3;
    }

    public static b c(Activity activity) {
        b bVar;
        a aVar = (a) activity.getFragmentManager().findFragmentByTag("androidx.leanback.app.b");
        if (aVar == null || (bVar = aVar.f1886a) == null) {
            return new b(activity);
        }
        return bVar;
    }

    public void a(Window window) {
        Drawable drawable;
        View decorView = window.getDecorView();
        if (!this.f1894h) {
            this.f1889c = decorView;
            this.f1894h = true;
            this.f1890d.getClass();
            Drawable drawable2 = this.f1890d.f1906a;
            if (drawable2 == null) {
                drawable = null;
            } else {
                drawable = drawable2.getConstantState().newDrawable().mutate();
            }
            this.f1893g = drawable;
            i();
            return;
        }
        StringBuilder a10 = android.support.v4.media.a.a("Already attached to ");
        a10.append(this.f1889c);
        throw new IllegalStateException(a10.toString());
    }

    public Drawable b() {
        Drawable.ConstantState constantState;
        int i10 = this.f1891e;
        Drawable drawable = null;
        if (i10 != -1) {
            c cVar = this.f1890d;
            Activity activity = this.f1887a;
            WeakReference<Drawable.ConstantState> weakReference = cVar.f1909d;
            if (!(weakReference == null || cVar.f1908c != i10 || (constantState = (Drawable.ConstantState) weakReference.get()) == null)) {
                drawable = constantState.newDrawable();
            }
            if (drawable == null) {
                drawable = d0.a.c(activity, i10);
                cVar.f1909d = new WeakReference<>(drawable.getConstantState());
                cVar.f1908c = i10;
            }
        }
        return drawable == null ? new g(this.f1887a.getResources()) : drawable;
    }

    public void d() {
        if (this.f1899m != null && this.f1900n && !this.f1896j.isStarted() && this.f1892f.isResumed() && this.f1897k.f1920b >= 255) {
            long max = Math.max(0, (this.f1895i + 500) - System.currentTimeMillis());
            this.f1895i = System.currentTimeMillis();
            this.f1888b.postDelayed(this.f1899m, max);
            this.f1900n = false;
        }
    }

    public void e() {
        e eVar = this.f1899m;
        if (eVar != null) {
            this.f1888b.removeCallbacks(eVar);
            this.f1899m = null;
        }
        if (this.f1896j.isStarted()) {
            this.f1896j.cancel();
        }
        h hVar = this.f1897k;
        if (hVar != null) {
            hVar.a(R.id.background_imagein, this.f1887a);
            this.f1897k.a(R.id.background_imageout, this.f1887a);
            this.f1897k = null;
        }
        this.f1893g = null;
    }

    public boolean f(Drawable drawable, Drawable drawable2) {
        if (drawable == null || drawable2 == null) {
            return false;
        }
        if (drawable == drawable2) {
            return true;
        }
        if ((drawable instanceof d) && (drawable2 instanceof d) && ((d) drawable).f1910a.f1912a.sameAs(((d) drawable2).f1910a.f1912a)) {
            return true;
        }
        if (!(drawable instanceof ColorDrawable) || !(drawable2 instanceof ColorDrawable) || ((ColorDrawable) drawable).getColor() != ((ColorDrawable) drawable2).getColor()) {
            return false;
        }
        return true;
    }

    public void g(Drawable drawable) {
        this.f1890d.f1906a = drawable;
        this.f1893g = drawable;
        if (this.f1897k != null) {
            if (drawable == null) {
                h(b());
            } else {
                h(drawable);
            }
        }
    }

    public final void h(Drawable drawable) {
        if (this.f1894h) {
            e eVar = this.f1899m;
            if (eVar != null) {
                if (!f(drawable, eVar.f1915a)) {
                    this.f1888b.removeCallbacks(this.f1899m);
                    this.f1899m = null;
                } else {
                    return;
                }
            }
            this.f1899m = new e(drawable);
            this.f1900n = true;
            d();
            return;
        }
        throw new IllegalStateException("Must attach before setting background drawable");
    }

    public final void i() {
        if (this.f1894h) {
            if (this.f1897k == null) {
                LayerDrawable layerDrawable = (LayerDrawable) d0.a.c(this.f1887a, R.drawable.lb_background).mutate();
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    drawableArr[i10] = layerDrawable.getDrawable(i10);
                }
                h hVar = new h(this, drawableArr);
                for (int i11 = 0; i11 < numberOfLayers; i11++) {
                    hVar.setId(i11, layerDrawable.getId(i11));
                }
                this.f1897k = hVar;
                this.f1898l = hVar.b(R.id.background_imagein);
                this.f1897k.b(R.id.background_imageout);
                View view = this.f1889c;
                h hVar2 = this.f1897k;
                if (Build.VERSION.SDK_INT >= 19) {
                    if (view.getBackground() != null) {
                        hVar2.setAlpha(view.getBackground().getAlpha());
                    }
                    view.setBackground(hVar2);
                } else {
                    view.setBackground(hVar2);
                }
            }
            Drawable drawable = this.f1893g;
            if (drawable == null) {
                this.f1897k.c(R.id.background_imagein, b());
            } else {
                this.f1897k.c(R.id.background_imagein, drawable);
            }
            this.f1897k.a(R.id.background_imageout, this.f1887a);
        }
    }

    /* compiled from: BackgroundManager */
    public static class d extends Drawable {

        /* renamed from: a  reason: collision with root package name */
        public a f1910a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1911b;

        public d(Resources resources, Bitmap bitmap) {
            this.f1910a = new a((Bitmap) null, (Matrix) null);
        }

        public void draw(Canvas canvas) {
            a aVar = this.f1910a;
            if (aVar.f1912a != null) {
                if (aVar.f1914c.getAlpha() >= 255 || this.f1910a.f1914c.getColorFilter() == null) {
                    a aVar2 = this.f1910a;
                    canvas.drawBitmap(aVar2.f1912a, aVar2.f1913b, aVar2.f1914c);
                    return;
                }
                throw new IllegalStateException("Can't draw with translucent alpha and color filter");
            }
        }

        public ColorFilter getColorFilter() {
            return this.f1910a.f1914c.getColorFilter();
        }

        public Drawable.ConstantState getConstantState() {
            return this.f1910a;
        }

        public int getOpacity() {
            return -3;
        }

        public Drawable mutate() {
            if (!this.f1911b) {
                this.f1911b = true;
                this.f1910a = new a(this.f1910a);
            }
            return this;
        }

        public void setAlpha(int i10) {
            mutate();
            if (this.f1910a.f1914c.getAlpha() != i10) {
                this.f1910a.f1914c.setAlpha(i10);
                invalidateSelf();
            }
        }

        public void setColorFilter(ColorFilter colorFilter) {
            mutate();
            this.f1910a.f1914c.setColorFilter(colorFilter);
            invalidateSelf();
        }

        public d(a aVar) {
            this.f1910a = aVar;
        }

        /* compiled from: BackgroundManager */
        public static final class a extends Drawable.ConstantState {

            /* renamed from: a  reason: collision with root package name */
            public final Bitmap f1912a;

            /* renamed from: b  reason: collision with root package name */
            public final Matrix f1913b;

            /* renamed from: c  reason: collision with root package name */
            public final Paint f1914c;

            public a(Bitmap bitmap, Matrix matrix) {
                Paint paint = new Paint();
                this.f1914c = paint;
                this.f1912a = bitmap;
                this.f1913b = matrix == null ? new Matrix() : matrix;
                paint.setFilterBitmap(true);
            }

            public int getChangingConfigurations() {
                return 0;
            }

            public Drawable newDrawable() {
                return new d(this);
            }

            public a(a aVar) {
                Paint paint = new Paint();
                this.f1914c = paint;
                this.f1912a = aVar.f1912a;
                this.f1913b = aVar.f1913b != null ? new Matrix(aVar.f1913b) : new Matrix();
                if (aVar.f1914c.getAlpha() != 255) {
                    paint.setAlpha(aVar.f1914c.getAlpha());
                }
                if (aVar.f1914c.getColorFilter() != null) {
                    paint.setColorFilter(aVar.f1914c.getColorFilter());
                }
                paint.setFilterBitmap(true);
            }
        }
    }

    /* compiled from: BackgroundManager */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public int f1917a = 255;

        /* renamed from: b  reason: collision with root package name */
        public final Drawable f1918b;

        public f(Drawable drawable) {
            this.f1918b = drawable;
        }

        public f(f fVar, Drawable drawable) {
            this.f1918b = drawable;
            this.f1917a = fVar.f1917a;
        }
    }
}

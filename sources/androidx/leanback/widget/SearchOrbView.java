package androidx.leanback.widget;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.startapp.startappsdk.R;
import h.e;
import java.util.WeakHashMap;
import o0.c0;

public class SearchOrbView extends FrameLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public View.OnClickListener f2232a;

    /* renamed from: b  reason: collision with root package name */
    public View f2233b;

    /* renamed from: c  reason: collision with root package name */
    public View f2234c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f2235d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f2236e;

    /* renamed from: f  reason: collision with root package name */
    public c f2237f;

    /* renamed from: g  reason: collision with root package name */
    public final float f2238g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2239h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2240i;

    /* renamed from: r  reason: collision with root package name */
    public final float f2241r;

    /* renamed from: s  reason: collision with root package name */
    public final float f2242s;

    /* renamed from: t  reason: collision with root package name */
    public ValueAnimator f2243t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2244u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2245v;

    /* renamed from: w  reason: collision with root package name */
    public final ArgbEvaluator f2246w;

    /* renamed from: x  reason: collision with root package name */
    public final ValueAnimator.AnimatorUpdateListener f2247x;

    /* renamed from: y  reason: collision with root package name */
    public ValueAnimator f2248y;

    /* renamed from: z  reason: collision with root package name */
    public final ValueAnimator.AnimatorUpdateListener f2249z;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SearchOrbView.this.setOrbViewColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SearchOrbView.this.setSearchOrbZ(valueAnimator.getAnimatedFraction());
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f2252a;

        /* renamed from: b  reason: collision with root package name */
        public int f2253b;

        /* renamed from: c  reason: collision with root package name */
        public int f2254c;

        public c(int i10, int i11, int i12) {
            this.f2252a = i10;
            if (i11 == i10) {
                i11 = Color.argb((int) ((((float) Color.alpha(i10)) * 0.85f) + 38.25f), (int) ((((float) Color.red(i10)) * 0.85f) + 38.25f), (int) ((((float) Color.green(i10)) * 0.85f) + 38.25f), (int) ((((float) Color.blue(i10)) * 0.85f) + 38.25f));
            }
            this.f2253b = i11;
            this.f2254c = i12;
        }
    }

    public SearchOrbView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchOrbViewStyle);
    }

    public void a(boolean z10) {
        float f10 = z10 ? this.f2238g : 1.0f;
        this.f2233b.animate().scaleX(f10).scaleY(f10).setDuration((long) this.f2240i).start();
        int i10 = this.f2240i;
        if (this.f2248y == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.f2248y = ofFloat;
            ofFloat.addUpdateListener(this.f2249z);
        }
        if (z10) {
            this.f2248y.start();
        } else {
            this.f2248y.reverse();
        }
        this.f2248y.setDuration((long) i10);
        this.f2244u = z10;
        c();
    }

    public void b(float f10) {
        this.f2234c.setScaleX(f10);
        this.f2234c.setScaleY(f10);
    }

    public final void c() {
        ValueAnimator valueAnimator = this.f2243t;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f2243t = null;
        }
        if (this.f2244u && this.f2245v) {
            ValueAnimator ofObject = ValueAnimator.ofObject(this.f2246w, new Object[]{Integer.valueOf(this.f2237f.f2252a), Integer.valueOf(this.f2237f.f2253b), Integer.valueOf(this.f2237f.f2252a)});
            this.f2243t = ofObject;
            ofObject.setRepeatCount(-1);
            this.f2243t.setDuration((long) (this.f2239h * 2));
            this.f2243t.addUpdateListener(this.f2247x);
            this.f2243t.start();
        }
    }

    public float getFocusedZoom() {
        return this.f2238g;
    }

    public int getLayoutResourceId() {
        return R.layout.lb_search_orb;
    }

    public int getOrbColor() {
        return this.f2237f.f2252a;
    }

    public c getOrbColors() {
        return this.f2237f;
    }

    public Drawable getOrbIcon() {
        return this.f2236e;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2245v = true;
        c();
    }

    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f2232a;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public void onDetachedFromWindow() {
        this.f2245v = false;
        c();
        super.onDetachedFromWindow();
    }

    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        a(z10);
    }

    public void setOnOrbClickedListener(View.OnClickListener onClickListener) {
        this.f2232a = onClickListener;
    }

    public void setOrbColor(int i10) {
        setOrbColors(new c(i10, i10, 0));
    }

    public void setOrbColors(c cVar) {
        this.f2237f = cVar;
        this.f2235d.setColorFilter(cVar.f2254c);
        if (this.f2243t == null) {
            setOrbViewColor(this.f2237f.f2252a);
            return;
        }
        this.f2244u = true;
        c();
    }

    public void setOrbIcon(Drawable drawable) {
        this.f2236e = drawable;
        this.f2235d.setImageDrawable(drawable);
    }

    public void setOrbViewColor(int i10) {
        if (this.f2234c.getBackground() instanceof GradientDrawable) {
            ((GradientDrawable) this.f2234c.getBackground()).setColor(i10);
        }
    }

    public void setSearchOrbZ(float f10) {
        View view = this.f2234c;
        float f11 = this.f2241r;
        float a10 = e.a(this.f2242s, f11, f10, f11);
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        if (Build.VERSION.SDK_INT >= 21) {
            c0.i.x(view, a10);
        }
    }

    public SearchOrbView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2246w = new ArgbEvaluator();
        this.f2247x = new a();
        this.f2249z = new b();
        Resources resources = context.getResources();
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutResourceId(), this, true);
        this.f2233b = inflate;
        this.f2234c = inflate.findViewById(R.id.search_orb);
        this.f2235d = (ImageView) this.f2233b.findViewById(R.id.icon);
        this.f2238g = context.getResources().getFraction(R.fraction.lb_search_orb_focused_zoom, 1, 1);
        this.f2239h = context.getResources().getInteger(R.integer.lb_search_orb_pulse_duration_ms);
        this.f2240i = context.getResources().getInteger(R.integer.lb_search_orb_scale_duration_ms);
        float dimensionPixelSize = (float) context.getResources().getDimensionPixelSize(R.dimen.lb_search_orb_focused_z);
        this.f2242s = dimensionPixelSize;
        this.f2241r = (float) context.getResources().getDimensionPixelSize(R.dimen.lb_search_orb_unfocused_z);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e1.a.f13537k, i10, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        setOrbIcon(drawable == null ? resources.getDrawable(R.drawable.lb_ic_in_app_search) : drawable);
        int color = obtainStyledAttributes.getColor(1, resources.getColor(R.color.lb_default_search_color));
        setOrbColors(new c(color, obtainStyledAttributes.getColor(0, color), obtainStyledAttributes.getColor(3, 0)));
        obtainStyledAttributes.recycle();
        setFocusable(true);
        setClipChildren(false);
        setOnClickListener(this);
        setSoundEffectsEnabled(false);
        setSearchOrbZ(0.0f);
        ImageView imageView = this.f2235d;
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        if (Build.VERSION.SDK_INT >= 21) {
            c0.i.x(imageView, dimensionPixelSize);
        }
    }
}

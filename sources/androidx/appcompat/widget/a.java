package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.e;
import com.startapp.startappsdk.R;
import e.l;
import o0.c0;
import o0.i0;
import o0.j0;

/* compiled from: AbsActionBarView */
public abstract class a extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public final C0011a f790a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f791b;

    /* renamed from: c  reason: collision with root package name */
    public ActionMenuView f792c;

    /* renamed from: d  reason: collision with root package name */
    public c f793d;

    /* renamed from: e  reason: collision with root package name */
    public int f794e;

    /* renamed from: f  reason: collision with root package name */
    public i0 f795f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f796g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f797h;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    /* compiled from: AbsActionBarView */
    public class C0011a implements j0 {

        /* renamed from: a  reason: collision with root package name */
        public boolean f798a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f799b;

        public C0011a() {
        }

        public void a(View view) {
            this.f798a = true;
        }

        public void b(View view) {
            if (!this.f798a) {
                a aVar = a.this;
                aVar.f795f = null;
                a.super.setVisibility(this.f799b);
            }
        }

        public void c(View view) {
            a.super.setVisibility(0);
            this.f798a = false;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    public int d(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = ((i12 - measuredHeight) / 2) + i11;
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public i0 e(int i10, long j10) {
        i0 i0Var = this.f795f;
        if (i0Var != null) {
            i0Var.b();
        }
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            i0 b10 = c0.b(this);
            b10.a(1.0f);
            b10.c(j10);
            C0011a aVar = this.f790a;
            a.this.f795f = b10;
            aVar.f799b = i10;
            View view = (View) b10.f22585a.get();
            if (view != null) {
                b10.e(view, aVar);
            }
            return b10;
        }
        i0 b11 = c0.b(this);
        b11.a(0.0f);
        b11.c(j10);
        C0011a aVar2 = this.f790a;
        a.this.f795f = b11;
        aVar2.f799b = i10;
        View view2 = (View) b11.f22585a.get();
        if (view2 != null) {
            b11.e(view2, aVar2);
        }
        return b11;
    }

    public int getAnimatedVisibility() {
        if (this.f795f != null) {
            return this.f790a.f799b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f794e;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, l.f13501a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f793d;
        if (cVar != null) {
            Configuration configuration2 = cVar.f487b.getResources().getConfiguration();
            int i10 = configuration2.screenWidthDp;
            int i11 = configuration2.screenHeightDp;
            cVar.f851y = (configuration2.smallestScreenWidthDp > 600 || i10 > 600 || (i10 > 960 && i11 > 720) || (i10 > 720 && i11 > 960)) ? 5 : (i10 >= 500 || (i10 > 640 && i11 > 480) || (i10 > 480 && i11 > 640)) ? 4 : i10 >= 360 ? 3 : 2;
            e eVar = cVar.f488c;
            if (eVar != null) {
                eVar.p(true);
            }
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f797h = false;
        }
        if (!this.f797h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f797h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f797h = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f796g = false;
        }
        if (!this.f796g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f796g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f796g = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i10);

    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            i0 i0Var = this.f795f;
            if (i0Var != null) {
                i0Var.b();
            }
            super.setVisibility(i10);
        }
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f790a = new C0011a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f791b = context;
        } else {
            this.f791b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}

package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import e.l;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {

    /* renamed from: a  reason: collision with root package name */
    public int f785a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f786b;

    /* renamed from: c  reason: collision with root package name */
    public WeakReference<View> f787c;

    /* renamed from: d  reason: collision with root package name */
    public LayoutInflater f788d;

    /* renamed from: e  reason: collision with root package name */
    public a f789e;

    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.B, 0, 0);
        this.f786b = obtainStyledAttributes.getResourceId(2, -1);
        this.f785a = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f785a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f788d;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f785a, viewGroup, false);
            int i10 = this.f786b;
            if (i10 != -1) {
                inflate.setId(i10);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f787c = new WeakReference<>(inflate);
            a aVar = this.f789e;
            if (aVar != null) {
                aVar.a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f786b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f788d;
    }

    public int getLayoutResource() {
        return this.f785a;
    }

    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i10) {
        this.f786b = i10;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f788d = layoutInflater;
    }

    public void setLayoutResource(int i10) {
        this.f785a = i10;
    }

    public void setOnInflateListener(a aVar) {
        this.f789e = aVar;
    }

    public void setVisibility(int i10) {
        WeakReference<View> weakReference = this.f787c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i10);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i10);
        if (i10 == 0 || i10 == 4) {
            a();
        }
    }
}

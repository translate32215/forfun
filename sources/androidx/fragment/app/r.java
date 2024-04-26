package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import o0.v;

/* compiled from: FragmentAnim */
public class r {
    public static int a(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i10});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* compiled from: FragmentAnim */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f1864a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f1865b;

        public a(Animation animation) {
            this.f1864a = animation;
            this.f1865b = null;
        }

        public a(Animator animator) {
            this.f1864a = null;
            this.f1865b = animator;
        }
    }

    /* compiled from: FragmentAnim */
    public static class b extends AnimationSet implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final ViewGroup f1866a;

        /* renamed from: b  reason: collision with root package name */
        public final View f1867b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1868c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1869d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1870e = true;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f1866a = viewGroup;
            this.f1867b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j10, Transformation transformation) {
            this.f1870e = true;
            if (this.f1868c) {
                return !this.f1869d;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f1868c = true;
                v.a(this.f1866a, this);
            }
            return true;
        }

        public void run() {
            if (this.f1868c || !this.f1870e) {
                this.f1866a.endViewTransition(this.f1867b);
                this.f1869d = true;
                return;
            }
            this.f1870e = false;
            this.f1866a.post(this);
        }

        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f1870e = true;
            if (this.f1868c) {
                return !this.f1869d;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f1868c = true;
                v.a(this.f1866a, this);
            }
            return true;
        }
    }
}

package v8;

import android.view.View;
import o0.c0;

/* compiled from: ViewOffsetHelper */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final View f26626a;

    /* renamed from: b  reason: collision with root package name */
    public int f26627b;

    /* renamed from: c  reason: collision with root package name */
    public int f26628c;

    /* renamed from: d  reason: collision with root package name */
    public int f26629d;

    /* renamed from: e  reason: collision with root package name */
    public int f26630e;

    public e(View view) {
        this.f26626a = view;
    }

    public void a() {
        View view = this.f26626a;
        c0.u(view, this.f26629d - (view.getTop() - this.f26627b));
        View view2 = this.f26626a;
        c0.t(view2, this.f26630e - (view2.getLeft() - this.f26628c));
    }
}

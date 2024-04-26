package androidx.leanback.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.transition.a;
import androidx.leanback.transition.b;

/* compiled from: TitleHelper */
public class o1 {

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f2454a;

    /* renamed from: b  reason: collision with root package name */
    public View f2455b;

    /* renamed from: c  reason: collision with root package name */
    public Object f2456c;

    /* renamed from: d  reason: collision with root package name */
    public Object f2457d;

    /* renamed from: e  reason: collision with root package name */
    public Object f2458e;

    /* renamed from: f  reason: collision with root package name */
    public Object f2459f;

    public o1(ViewGroup viewGroup, View view) {
        if (viewGroup == null || view == null) {
            throw new IllegalArgumentException("Views may not be null");
        }
        this.f2454a = viewGroup;
        this.f2455b = view;
        this.f2456c = a.b(viewGroup.getContext());
        this.f2457d = a.a(this.f2454a.getContext());
        this.f2458e = b.b(this.f2454a, new m1(this));
        this.f2459f = b.b(this.f2454a, new n1(this));
    }
}

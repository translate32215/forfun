package uc;

import ae.g;
import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.d;
import androidx.fragment.app.q;
import ud.k;

/* compiled from: Activity.kt */
public final class a implements wd.a<Activity, ViewDataBinding> {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a  reason: collision with root package name */
    public ViewDataBinding f26176a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f26177b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q f26178c;

    public a(int i10, q qVar) {
        this.f26177b = i10;
        this.f26178c = qVar;
    }

    public Object a(Object obj, g gVar) {
        Activity activity = (Activity) obj;
        k.f(gVar, "property");
        ViewDataBinding viewDataBinding = this.f26176a;
        if (viewDataBinding != null) {
            return viewDataBinding;
        }
        ViewDataBinding c10 = d.c(activity, this.f26177b);
        c10.m(this.f26178c);
        this.f26176a = c10;
        return c10;
    }
}

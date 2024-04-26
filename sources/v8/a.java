package v8;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import java.util.WeakHashMap;
import n0.b;
import o0.c0;
import o0.o0;
import o0.s;

/* compiled from: AppBarLayout */
public class a implements s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f26609a;

    public a(AppBarLayout appBarLayout) {
        this.f26609a = appBarLayout;
    }

    public o0 a(View view, o0 o0Var) {
        AppBarLayout appBarLayout = this.f26609a;
        appBarLayout.getClass();
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        o0 o0Var2 = c0.d.b(appBarLayout) ? o0Var : null;
        if (!b.a(appBarLayout.f8887g, o0Var2)) {
            appBarLayout.f8887g = o0Var2;
            appBarLayout.g();
            appBarLayout.requestLayout();
        }
        return o0Var;
    }
}

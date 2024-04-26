package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.o;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.startapp.startappsdk.R;
import ud.k;

/* compiled from: ComponentDialog.kt */
public class g extends Dialog implements t, i {

    /* renamed from: a  reason: collision with root package name */
    public u f369a;

    /* renamed from: b  reason: collision with root package name */
    public final OnBackPressedDispatcher f370b = new OnBackPressedDispatcher(new f(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Context context, int i10) {
        super(context, i10);
        k.f(context, "context");
    }

    public static void a(g gVar) {
        k.f(gVar, "this$0");
        super.onBackPressed();
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k.f(view, "view");
        f();
        super.addContentView(view, layoutParams);
    }

    public final u b() {
        u uVar = this.f369a;
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(this);
        this.f369a = uVar2;
        return uVar2;
    }

    public final o c() {
        return b();
    }

    public final OnBackPressedDispatcher d() {
        return this.f370b;
    }

    public final void f() {
        Window window = getWindow();
        k.c(window);
        window.getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        k.c(window2);
        View decorView = window2.getDecorView();
        k.e(decorView, "window!!.decorView");
        decorView.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    public void onBackPressed() {
        this.f370b.b();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b().f(o.b.ON_CREATE);
    }

    public void onStart() {
        super.onStart();
        b().f(o.b.ON_RESUME);
    }

    public void onStop() {
        b().f(o.b.ON_DESTROY);
        this.f369a = null;
        super.onStop();
    }

    public void setContentView(int i10) {
        f();
        super.setContentView(i10);
    }

    public void setContentView(View view) {
        k.f(view, "view");
        f();
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k.f(view, "view");
        f();
        super.setContentView(view, layoutParams);
    }
}

package c0;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.g0;
import androidx.lifecycle.o;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import o0.f;

/* compiled from: ComponentActivity */
public class i extends Activity implements t, f.a {

    /* renamed from: a  reason: collision with root package name */
    public u f3951a = new u(this);

    public boolean b(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !f.a(decorView, keyEvent)) {
            return f.b(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !f.a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g0.c(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        u uVar = this.f3951a;
        o.c cVar = o.c.CREATED;
        uVar.e("markState");
        uVar.e("setCurrentState");
        uVar.h(cVar);
        super.onSaveInstanceState(bundle);
    }
}

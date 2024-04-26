package f;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.m1;
import androidx.core.app.b;
import androidx.core.app.c;
import androidx.fragment.app.q;
import com.startapp.startappsdk.R;
import d0.a;
import j.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import s.c;
import u.b;

/* compiled from: AppCompatActivity */
public class i extends q implements j {
    public k B;

    public i() {
        this.f327e.f26867b.d("androidx:appcompat", new g(this));
        C(new h(this));
    }

    private void E() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        b.e(getWindow().getDecorView(), this);
    }

    public k H() {
        if (this.B == null) {
            c<WeakReference<k>> cVar = k.f17870a;
            this.B = new l(this, (Window) null, this, this);
        }
        return this.B;
    }

    public a I() {
        return H().i();
    }

    public Intent J() {
        return androidx.core.app.c.a(this);
    }

    public boolean K() {
        Intent a10 = androidx.core.app.c.a(this);
        if (a10 == null) {
            return false;
        }
        if (c.a.c(this, a10)) {
            ArrayList arrayList = new ArrayList();
            Intent J = J();
            if (J == null) {
                J = androidx.core.app.c.a(this);
            }
            if (J != null) {
                ComponentName component = J.getComponent();
                if (component == null) {
                    component = J.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent b10 = androidx.core.app.c.b(this, component);
                    while (b10 != null) {
                        arrayList.add(size, b10);
                        b10 = androidx.core.app.c.b(this, b10.getComponent());
                    }
                    arrayList.add(J);
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e10);
                }
            }
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                Object obj = a.f12940a;
                a.C0126a.a(this, intentArr, (Bundle) null);
                try {
                    int i10 = androidx.core.app.b.f1381c;
                    b.a.a(this);
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else {
            c.a.b(this, a10);
            return true;
        }
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        E();
        H().c(view, layoutParams);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(H().d(context));
    }

    public void closeOptionsMenu() {
        a I = I();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (I == null || !I.a()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a I = I();
        if (keyCode != 82 || I == null || !I.j(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public <T extends View> T findViewById(int i10) {
        return H().e(i10);
    }

    public MenuInflater getMenuInflater() {
        return H().h();
    }

    public Resources getResources() {
        int i10 = m1.f1023b;
        return super.getResources();
    }

    public void i(j.a aVar) {
    }

    public void invalidateOptionsMenu() {
        H().k();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        H().l(configuration);
    }

    public void onContentChanged() {
    }

    public void onDestroy() {
        super.onDestroy();
        H().n();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        r0 = getWindow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r2 = 1
            if (r0 >= r1) goto L_0x003f
            boolean r0 = r5.isCtrlPressed()
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getRepeatCount()
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L_0x003f
            android.view.Window r0 = r3.getWindow()
            if (r0 == 0) goto L_0x003f
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L_0x003f
            android.view.View r0 = r0.getDecorView()
            boolean r0 = r0.dispatchKeyShortcutEvent(r5)
            if (r0 == 0) goto L_0x003f
            r0 = 1
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            if (r0 == 0) goto L_0x0043
            return r2
        L_0x0043:
            boolean r4 = super.onKeyDown(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f.i.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        a I = I();
        if (menuItem.getItemId() != 16908332 || I == null || (I.d() & 4) == 0) {
            return false;
        }
        return K();
    }

    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        H().o(bundle);
    }

    public void onPostResume() {
        super.onPostResume();
        H().p();
    }

    public void onStart() {
        super.onStart();
        H().r();
    }

    public void onStop() {
        super.onStop();
        H().s();
    }

    public void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        H().A(charSequence);
    }

    public void openOptionsMenu() {
        a I = I();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (I == null || !I.k()) {
            super.openOptionsMenu();
        }
    }

    public j.a p(a.C0165a aVar) {
        return null;
    }

    public void setContentView(int i10) {
        E();
        H().v(i10);
    }

    public void setTheme(int i10) {
        super.setTheme(i10);
        H().z(i10);
    }

    public void u(j.a aVar) {
    }

    public void setContentView(View view) {
        E();
        H().w(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        E();
        H().x(view, layoutParams);
    }
}

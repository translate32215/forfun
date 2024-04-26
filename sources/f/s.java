package f;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.g;
import j.a;
import java.lang.ref.WeakReference;
import o0.f;
import s.c;

/* compiled from: AppCompatDialog */
public class s extends g implements j {

    /* renamed from: c  reason: collision with root package name */
    public k f17951c;

    /* renamed from: d  reason: collision with root package name */
    public final f.a f17952d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130968960(0x7f040180, float:1.7546588E38)
            if (r6 != 0) goto L_0x0015
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L_0x0016
        L_0x0015:
            r2 = r6
        L_0x0016:
            r4.<init>(r5, r2)
            f.r r2 = new f.r
            r2.<init>(r4)
            r4.f17952d = r2
            f.k r2 = r4.g()
            if (r6 != 0) goto L_0x0034
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L_0x0034:
            r2.z(r6)
            r5 = 0
            r2.m(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.s.<init>(android.content.Context, int):void");
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g().c(view, layoutParams);
    }

    public void dismiss() {
        super.dismiss();
        g().n();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return f.b(this.f17952d, getWindow().getDecorView(), this, keyEvent);
    }

    public <T extends View> T findViewById(int i10) {
        return g().e(i10);
    }

    public k g() {
        if (this.f17951c == null) {
            c<WeakReference<k>> cVar = k.f17870a;
            this.f17951c = new l(getContext(), getWindow(), this, this);
        }
        return this.f17951c;
    }

    public boolean h(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void i(a aVar) {
    }

    public void invalidateOptionsMenu() {
        g().k();
    }

    public boolean j(int i10) {
        return g().u(i10);
    }

    public void onCreate(Bundle bundle) {
        g().j();
        super.onCreate(bundle);
        g().m(bundle);
    }

    public void onStop() {
        super.onStop();
        g().s();
    }

    public a p(a.C0165a aVar) {
        return null;
    }

    public void setContentView(int i10) {
        g().v(i10);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        g().A(charSequence);
    }

    public void u(a aVar) {
    }

    public void setContentView(View view) {
        g().w(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g().x(view, layoutParams);
    }

    public void setTitle(int i10) {
        super.setTitle(i10);
        g().A(getContext().getString(i10));
    }
}

package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.fragment.app.i0;
import f2.a;

@Deprecated
/* compiled from: FragmentPagerAdapter */
public abstract class f0 extends a {

    /* renamed from: b  reason: collision with root package name */
    public final a0 f1667b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1668c;

    /* renamed from: d  reason: collision with root package name */
    public i0 f1669d = null;

    /* renamed from: e  reason: collision with root package name */
    public p f1670e = null;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1671f;

    @Deprecated
    public f0(a0 a0Var) {
        this.f1667b = a0Var;
        this.f1668c = 0;
    }

    public static String e(int i10, long j10) {
        return "android:switcher:" + i10 + ":" + j10;
    }

    public void a(ViewGroup viewGroup, int i10, Object obj) {
        p pVar = (p) obj;
        if (this.f1669d == null) {
            this.f1669d = new b(this.f1667b);
        }
        b bVar = (b) this.f1669d;
        bVar.getClass();
        a0 a0Var = pVar.B;
        if (a0Var == null || a0Var == bVar.f1621q) {
            bVar.c(new i0.a(6, pVar));
            if (pVar.equals(this.f1670e)) {
                this.f1670e = null;
                return;
            }
            return;
        }
        StringBuilder a10 = android.support.v4.media.a.a("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        a10.append(pVar.toString());
        a10.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(a10.toString());
    }

    /* JADX INFO: finally extract failed */
    public void b(ViewGroup viewGroup) {
        i0 i0Var = this.f1669d;
        if (i0Var != null) {
            if (!this.f1671f) {
                try {
                    this.f1671f = true;
                    i0Var.f();
                    this.f1671f = false;
                } catch (Throwable th) {
                    this.f1671f = false;
                    throw th;
                }
            }
            this.f1669d = null;
        }
    }

    public void d(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }
}

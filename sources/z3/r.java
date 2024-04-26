package z3;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.a0;
import androidx.fragment.app.p;
import com.bumptech.glide.b;
import com.bumptech.glide.i;
import java.util.HashSet;
import java.util.Set;

/* compiled from: SupportRequestManagerFragment */
public class r extends p {

    /* renamed from: n0  reason: collision with root package name */
    public final a f28270n0;

    /* renamed from: o0  reason: collision with root package name */
    public final p f28271o0 = new a();

    /* renamed from: p0  reason: collision with root package name */
    public final Set<r> f28272p0 = new HashSet();

    /* renamed from: q0  reason: collision with root package name */
    public r f28273q0;

    /* renamed from: r0  reason: collision with root package name */
    public i f28274r0;

    /* renamed from: s0  reason: collision with root package name */
    public p f28275s0;

    /* compiled from: SupportRequestManagerFragment */
    public class a implements p {
        public a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + r.this + "}";
        }
    }

    public r() {
        a aVar = new a();
        this.f28270n0 = aVar;
    }

    public void N(Context context) {
        super.N(context);
        p pVar = this;
        while (true) {
            p pVar2 = pVar.E;
            if (pVar2 == null) {
                break;
            }
            pVar = pVar2;
        }
        a0 a0Var = pVar.B;
        if (a0Var != null) {
            try {
                s0(q(), a0Var);
            } catch (IllegalStateException e10) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e10);
                }
            }
        } else if (Log.isLoggable("SupportRMFragment", 5)) {
            Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
        }
    }

    public void Q() {
        this.O = true;
        this.f28270n0.c();
        t0();
    }

    public void S() {
        this.O = true;
        this.f28275s0 = null;
        t0();
    }

    public void b0() {
        this.O = true;
        this.f28270n0.d();
    }

    public void c0() {
        this.O = true;
        this.f28270n0.e();
    }

    public final p r0() {
        p pVar = this.E;
        return pVar != null ? pVar : this.f28275s0;
    }

    public final void s0(Context context, a0 a0Var) {
        t0();
        r i10 = b.b(context).f4888f.i(a0Var, (p) null);
        this.f28273q0 = i10;
        if (!equals(i10)) {
            this.f28273q0.f28272p0.add(this);
        }
    }

    public final void t0() {
        r rVar = this.f28273q0;
        if (rVar != null) {
            rVar.f28272p0.remove(this);
            this.f28273q0 = null;
        }
    }

    public String toString() {
        return super.toString() + "{parent=" + r0() + "}";
    }
}

package z3;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.a0;
import androidx.fragment.app.p;
import com.bumptech.glide.c;
import com.bumptech.glide.e;
import com.bumptech.glide.i;
import g4.j;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import t3.q;

/* compiled from: RequestManagerRetriever */
public class o implements Handler.Callback {

    /* renamed from: r  reason: collision with root package name */
    public static final b f28257r = new a();

    /* renamed from: a  reason: collision with root package name */
    public volatile i f28258a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<FragmentManager, n> f28259b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<a0, r> f28260c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Handler f28261d;

    /* renamed from: e  reason: collision with root package name */
    public final b f28262e;

    /* renamed from: f  reason: collision with root package name */
    public final s.a<View, p> f28263f = new s.a<>();

    /* renamed from: g  reason: collision with root package name */
    public final s.a<View, Fragment> f28264g = new s.a<>();

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f28265h = new Bundle();

    /* renamed from: i  reason: collision with root package name */
    public final j f28266i;

    /* compiled from: RequestManagerRetriever */
    public class a implements b {
    }

    /* compiled from: RequestManagerRetriever */
    public interface b {
    }

    public o(b bVar, e eVar) {
        j jVar;
        this.f28262e = bVar == null ? f28257r : bVar;
        this.f28261d = new Handler(Looper.getMainLooper(), this);
        if (!q.f25654h || !q.f25653g) {
            jVar = new de.a0(1);
        } else {
            if (eVar.f4918a.containsKey(c.d.class)) {
                jVar = new h();
            } else {
                jVar = new i(0);
            }
        }
        this.f28266i = jVar;
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void c(Collection<p> collection, Map<View, p> map) {
        View view;
        if (collection != null) {
            for (p next : collection) {
                if (!(next == null || (view = next.Q) == null)) {
                    map.put(view, next);
                    c(next.p().K(), map);
                }
            }
        }
    }

    public static boolean j(Context context) {
        Activity a10 = a(context);
        return a10 == null || !a10.isFinishing();
    }

    @TargetApi(26)
    @Deprecated
    public final void b(FragmentManager fragmentManager, s.a<View, Fragment> aVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (Fragment next : fragmentManager.getFragments()) {
                if (next.getView() != null) {
                    aVar.put(next.getView(), next);
                    b(next.getChildFragmentManager(), aVar);
                }
            }
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            this.f28265h.putInt("key", i10);
            Fragment fragment = null;
            try {
                fragment = fragmentManager.getFragment(this.f28265h, "key");
            } catch (Exception unused) {
            }
            if (fragment != null) {
                if (fragment.getView() != null) {
                    aVar.put(fragment.getView(), fragment);
                    b(fragment.getChildFragmentManager(), aVar);
                }
                i10 = i11;
            } else {
                return;
            }
        }
    }

    @Deprecated
    public final i d(Context context, FragmentManager fragmentManager, Fragment fragment, boolean z10) {
        n h10 = h(fragmentManager, fragment);
        i iVar = h10.f28253d;
        if (iVar != null) {
            return iVar;
        }
        com.bumptech.glide.b b10 = com.bumptech.glide.b.b(context);
        b bVar = this.f28262e;
        a aVar = h10.f28250a;
        p pVar = h10.f28251b;
        ((a) bVar).getClass();
        i iVar2 = new i(b10, aVar, pVar, context);
        if (z10) {
            iVar2.v0();
        }
        h10.f28253d = iVar2;
        return iVar2;
    }

    public i e(Activity activity) {
        if (j.h()) {
            return f(activity.getApplicationContext());
        }
        if (activity instanceof androidx.fragment.app.q) {
            return g((androidx.fragment.app.q) activity);
        }
        if (!activity.isDestroyed()) {
            this.f28266i.a(activity);
            return d(activity, activity.getFragmentManager(), (Fragment) null, j(activity));
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    public i f(Context context) {
        if (context != null) {
            if (j.i() && !(context instanceof Application)) {
                if (context instanceof androidx.fragment.app.q) {
                    return g((androidx.fragment.app.q) context);
                }
                if (context instanceof Activity) {
                    return e((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return f(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.f28258a == null) {
                synchronized (this) {
                    if (this.f28258a == null) {
                        com.bumptech.glide.b b10 = com.bumptech.glide.b.b(context.getApplicationContext());
                        b bVar = this.f28262e;
                        b bVar2 = new b(0);
                        g gVar = new g(0);
                        Context applicationContext = context.getApplicationContext();
                        ((a) bVar).getClass();
                        this.f28258a = new i(b10, bVar2, gVar, applicationContext);
                    }
                }
            }
            return this.f28258a;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public i g(androidx.fragment.app.q qVar) {
        if (j.h()) {
            return f(qVar.getApplicationContext());
        }
        if (!qVar.isDestroyed()) {
            this.f28266i.a(qVar);
            return k(qVar, qVar.F(), (p) null, j(qVar));
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    public final n h(FragmentManager fragmentManager, Fragment fragment) {
        n nVar = (n) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (nVar == null && (nVar = this.f28259b.get(fragmentManager)) == null) {
            nVar = new n();
            nVar.f28255f = fragment;
            if (!(fragment == null || fragment.getActivity() == null)) {
                nVar.a(fragment.getActivity());
            }
            this.f28259b.put(fragmentManager, nVar);
            fragmentManager.beginTransaction().add(nVar, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f28261d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return nVar;
    }

    public boolean handleMessage(Message message) {
        Object obj;
        Object obj2;
        Object obj3;
        int i10 = message.what;
        Object obj4 = null;
        boolean z10 = true;
        if (i10 == 1) {
            obj3 = (FragmentManager) message.obj;
            obj2 = this.f28259b.remove(obj3);
        } else if (i10 != 2) {
            z10 = false;
            obj = null;
            if (z10 && obj4 == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
            }
            return z10;
        } else {
            obj3 = (a0) message.obj;
            obj2 = this.f28260c.remove(obj3);
        }
        Object obj5 = obj3;
        obj4 = obj2;
        obj = obj5;
        Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
        return z10;
    }

    public final r i(a0 a0Var, p pVar) {
        r rVar = (r) a0Var.G("com.bumptech.glide.manager");
        if (rVar == null && (rVar = this.f28260c.get(a0Var)) == null) {
            rVar = new r();
            rVar.f28275s0 = pVar;
            if (!(pVar == null || pVar.q() == null)) {
                p pVar2 = pVar;
                while (true) {
                    p pVar3 = pVar2.E;
                    if (pVar3 == null) {
                        break;
                    }
                    pVar2 = pVar3;
                }
                a0 a0Var2 = pVar2.B;
                if (a0Var2 != null) {
                    rVar.s0(pVar.q(), a0Var2);
                }
            }
            this.f28260c.put(a0Var, rVar);
            androidx.fragment.app.b bVar = new androidx.fragment.app.b(a0Var);
            bVar.g(0, rVar, "com.bumptech.glide.manager", 1);
            bVar.k();
            this.f28261d.obtainMessage(2, a0Var).sendToTarget();
        }
        return rVar;
    }

    public final i k(Context context, a0 a0Var, p pVar, boolean z10) {
        r i10 = i(a0Var, pVar);
        i iVar = i10.f28274r0;
        if (iVar != null) {
            return iVar;
        }
        com.bumptech.glide.b b10 = com.bumptech.glide.b.b(context);
        b bVar = this.f28262e;
        a aVar = i10.f28270n0;
        p pVar2 = i10.f28271o0;
        ((a) bVar).getClass();
        i iVar2 = new i(b10, aVar, pVar2, context);
        if (z10) {
            iVar2.v0();
        }
        i10.f28274r0 = iVar2;
        return iVar2;
    }
}

package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.d0;
import androidx.fragment.app.a0;
import androidx.fragment.app.p;
import com.startapp.startappsdk.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k0.d;
import o0.c0;
import t.f;

/* compiled from: SpecialEffectsController */
public abstract class q0 {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f1837a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<d> f1838b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<d> f1839c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f1840d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1841e = false;

    /* compiled from: SpecialEffectsController */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f1842a;

        public a(c cVar) {
            this.f1842a = cVar;
        }

        public void run() {
            if (q0.this.f1838b.contains(this.f1842a)) {
                c cVar = this.f1842a;
                cVar.f1847a.a(cVar.f1849c.Q);
            }
        }
    }

    /* compiled from: SpecialEffectsController */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f1844a;

        public b(c cVar) {
            this.f1844a = cVar;
        }

        public void run() {
            q0.this.f1838b.remove(this.f1844a);
            q0.this.f1839c.remove(this.f1844a);
        }
    }

    /* compiled from: SpecialEffectsController */
    public static class c extends d {

        /* renamed from: h  reason: collision with root package name */
        public final h0 f1846h;

        public c(d.c cVar, d.b bVar, h0 h0Var, k0.d dVar) {
            super(cVar, bVar, h0Var.f1694c, dVar);
            this.f1846h = h0Var;
        }

        public void b() {
            super.b();
            this.f1846h.k();
        }

        public void d() {
            float f10;
            d.b bVar = this.f1848b;
            if (bVar == d.b.ADDING) {
                p pVar = this.f1846h.f1694c;
                View findFocus = pVar.Q.findFocus();
                if (findFocus != null) {
                    pVar.n().f1828m = findFocus;
                    if (a0.N(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + pVar);
                    }
                }
                View i02 = this.f1849c.i0();
                if (i02.getParent() == null) {
                    this.f1846h.b();
                    i02.setAlpha(0.0f);
                }
                if (i02.getAlpha() == 0.0f && i02.getVisibility() == 0) {
                    i02.setVisibility(4);
                }
                p.d dVar = pVar.Z;
                if (dVar == null) {
                    f10 = 1.0f;
                } else {
                    f10 = dVar.f1827l;
                }
                i02.setAlpha(f10);
            } else if (bVar == d.b.REMOVING) {
                p pVar2 = this.f1846h.f1694c;
                View i03 = pVar2.i0();
                if (a0.N(2)) {
                    StringBuilder a10 = android.support.v4.media.a.a("Clearing focus ");
                    a10.append(i03.findFocus());
                    a10.append(" on view ");
                    a10.append(i03);
                    a10.append(" for Fragment ");
                    a10.append(pVar2);
                    Log.v("FragmentManager", a10.toString());
                }
                i03.clearFocus();
            }
        }
    }

    /* compiled from: SpecialEffectsController */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public c f1847a;

        /* renamed from: b  reason: collision with root package name */
        public b f1848b;

        /* renamed from: c  reason: collision with root package name */
        public final p f1849c;

        /* renamed from: d  reason: collision with root package name */
        public final List<Runnable> f1850d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final HashSet<k0.d> f1851e = new HashSet<>();

        /* renamed from: f  reason: collision with root package name */
        public boolean f1852f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1853g = false;

        /* compiled from: SpecialEffectsController */
        public class a implements d.a {
            public a() {
            }

            public void a() {
                d.this.a();
            }
        }

        /* compiled from: SpecialEffectsController */
        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* compiled from: SpecialEffectsController */
        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static c b(int i10) {
                if (i10 == 0) {
                    return VISIBLE;
                }
                if (i10 == 4) {
                    return INVISIBLE;
                }
                if (i10 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException(d0.a("Unknown visibility ", i10));
            }

            public static c c(View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return b(view.getVisibility());
            }

            public void a(View view) {
                int ordinal = ordinal();
                if (ordinal == 0) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (a0.N(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                    }
                } else if (ordinal == 1) {
                    if (a0.N(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                } else if (ordinal == 2) {
                    if (a0.N(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                } else if (ordinal == 3) {
                    if (a0.N(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                    }
                    view.setVisibility(4);
                }
            }
        }

        public d(c cVar, b bVar, p pVar, k0.d dVar) {
            this.f1847a = cVar;
            this.f1848b = bVar;
            this.f1849c = pVar;
            dVar.a(new a());
        }

        public final void a() {
            if (!this.f1852f) {
                this.f1852f = true;
                if (this.f1851e.isEmpty()) {
                    b();
                    return;
                }
                Iterator it = new ArrayList(this.f1851e).iterator();
                while (it.hasNext()) {
                    k0.d dVar = (k0.d) it.next();
                    synchronized (dVar) {
                        if (!dVar.f19865a) {
                            dVar.f19865a = true;
                            dVar.f19867c = true;
                            d.a aVar = dVar.f19866b;
                            if (aVar != null) {
                                try {
                                    aVar.a();
                                } catch (Throwable th) {
                                    synchronized (dVar) {
                                        dVar.f19867c = false;
                                        dVar.notifyAll();
                                        throw th;
                                    }
                                }
                            }
                            synchronized (dVar) {
                                dVar.f19867c = false;
                                dVar.notifyAll();
                            }
                        }
                    }
                }
            }
        }

        public void b() {
            if (!this.f1853g) {
                if (a0.N(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
                }
                this.f1853g = true;
                for (Runnable run : this.f1850d) {
                    run.run();
                }
            }
        }

        public final void c(c cVar, b bVar) {
            c cVar2 = c.REMOVED;
            int ordinal = bVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        if (a0.N(2)) {
                            StringBuilder a10 = android.support.v4.media.a.a("SpecialEffectsController: For fragment ");
                            a10.append(this.f1849c);
                            a10.append(" mFinalState = ");
                            a10.append(this.f1847a);
                            a10.append(" -> REMOVED. mLifecycleImpact  = ");
                            a10.append(this.f1848b);
                            a10.append(" to REMOVING.");
                            Log.v("FragmentManager", a10.toString());
                        }
                        this.f1847a = cVar2;
                        this.f1848b = b.REMOVING;
                    }
                } else if (this.f1847a == cVar2) {
                    if (a0.N(2)) {
                        StringBuilder a11 = android.support.v4.media.a.a("SpecialEffectsController: For fragment ");
                        a11.append(this.f1849c);
                        a11.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                        a11.append(this.f1848b);
                        a11.append(" to ADDING.");
                        Log.v("FragmentManager", a11.toString());
                    }
                    this.f1847a = c.VISIBLE;
                    this.f1848b = b.ADDING;
                }
            } else if (this.f1847a != cVar2) {
                if (a0.N(2)) {
                    StringBuilder a12 = android.support.v4.media.a.a("SpecialEffectsController: For fragment ");
                    a12.append(this.f1849c);
                    a12.append(" mFinalState = ");
                    a12.append(this.f1847a);
                    a12.append(" -> ");
                    a12.append(cVar);
                    a12.append(". ");
                    Log.v("FragmentManager", a12.toString());
                }
                this.f1847a = cVar;
            }
        }

        public void d() {
        }

        public String toString() {
            StringBuilder a10 = f.a("Operation ", "{");
            a10.append(Integer.toHexString(System.identityHashCode(this)));
            a10.append("} ");
            a10.append("{");
            a10.append("mFinalState = ");
            a10.append(this.f1847a);
            a10.append("} ");
            a10.append("{");
            a10.append("mLifecycleImpact = ");
            a10.append(this.f1848b);
            a10.append("} ");
            a10.append("{");
            a10.append("mFragment = ");
            a10.append(this.f1849c);
            a10.append("}");
            return a10.toString();
        }
    }

    public q0(ViewGroup viewGroup) {
        this.f1837a = viewGroup;
    }

    public static q0 f(ViewGroup viewGroup, a0 a0Var) {
        return g(viewGroup, a0Var.L());
    }

    public static q0 g(ViewGroup viewGroup, r0 r0Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof q0) {
            return (q0) tag;
        }
        ((a0.e) r0Var).getClass();
        f fVar = new f(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, fVar);
        return fVar;
    }

    public final void a(d.c cVar, d.b bVar, h0 h0Var) {
        synchronized (this.f1838b) {
            k0.d dVar = new k0.d();
            d d10 = d(h0Var.f1694c);
            if (d10 != null) {
                d10.c(cVar, bVar);
                return;
            }
            c cVar2 = new c(cVar, bVar, h0Var, dVar);
            this.f1838b.add(cVar2);
            cVar2.f1850d.add(new a(cVar2));
            cVar2.f1850d.add(new b(cVar2));
        }
    }

    public abstract void b(List<d> list, boolean z10);

    public void c() {
        if (!this.f1841e) {
            if (!c0.q(this.f1837a)) {
                e();
                this.f1840d = false;
                return;
            }
            synchronized (this.f1838b) {
                if (!this.f1838b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f1839c);
                    this.f1839c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        d dVar = (d) it.next();
                        if (a0.N(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + dVar);
                        }
                        dVar.a();
                        if (!dVar.f1853g) {
                            this.f1839c.add(dVar);
                        }
                    }
                    i();
                    ArrayList arrayList2 = new ArrayList(this.f1838b);
                    this.f1838b.clear();
                    this.f1839c.addAll(arrayList2);
                    if (a0.N(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((d) it2.next()).d();
                    }
                    b(arrayList2, this.f1840d);
                    this.f1840d = false;
                    if (a0.N(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            }
        }
    }

    public final d d(p pVar) {
        Iterator<d> it = this.f1838b.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (next.f1849c.equals(pVar) && !next.f1852f) {
                return next;
            }
        }
        return null;
    }

    public void e() {
        String str;
        String str2;
        if (a0.N(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean q10 = c0.q(this.f1837a);
        synchronized (this.f1838b) {
            i();
            Iterator<d> it = this.f1838b.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            Iterator it2 = new ArrayList(this.f1839c).iterator();
            while (it2.hasNext()) {
                d dVar = (d) it2.next();
                if (a0.N(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (q10) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f1837a + " is not attached to window. ";
                    }
                    sb2.append(str2);
                    sb2.append("Cancelling running operation ");
                    sb2.append(dVar);
                    Log.v("FragmentManager", sb2.toString());
                }
                dVar.a();
            }
            Iterator it3 = new ArrayList(this.f1838b).iterator();
            while (it3.hasNext()) {
                d dVar2 = (d) it3.next();
                if (a0.N(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    if (q10) {
                        str = "";
                    } else {
                        str = "Container " + this.f1837a + " is not attached to window. ";
                    }
                    sb3.append(str);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(dVar2);
                    Log.v("FragmentManager", sb3.toString());
                }
                dVar2.a();
            }
        }
    }

    public void h() {
        synchronized (this.f1838b) {
            i();
            this.f1841e = false;
            int size = this.f1838b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                d dVar = this.f1838b.get(size);
                d.c c10 = d.c.c(dVar.f1849c.Q);
                d.c cVar = dVar.f1847a;
                d.c cVar2 = d.c.VISIBLE;
                if (cVar == cVar2 && c10 != cVar2) {
                    p.d dVar2 = dVar.f1849c.Z;
                    this.f1841e = false;
                    break;
                }
            }
        }
    }

    public final void i() {
        Iterator<d> it = this.f1838b.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (next.f1848b == d.b.ADDING) {
                next.c(d.c.b(next.f1849c.i0().getVisibility()), d.b.NONE);
            }
        }
    }
}

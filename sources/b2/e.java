package b2;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.m0;
import androidx.fragment.app.p;
import b2.j;
import java.util.ArrayList;
import java.util.List;
import k0.d;

@SuppressLint({"RestrictedApi"})
/* compiled from: FragmentTransitionSupport */
public class e extends m0 {

    /* compiled from: FragmentTransitionSupport */
    public class a extends j.c {
        public a(e eVar, Rect rect) {
        }
    }

    /* compiled from: FragmentTransitionSupport */
    public class b implements j.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f3364a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f3365b;

        public b(e eVar, View view, ArrayList arrayList) {
            this.f3364a = view;
            this.f3365b = arrayList;
        }

        public void a(j jVar) {
            jVar.x(this);
            jVar.a(this);
        }

        public void b(j jVar) {
        }

        public void c(j jVar) {
        }

        public void d(j jVar) {
        }

        public void e(j jVar) {
            jVar.x(this);
            this.f3364a.setVisibility(8);
            int size = this.f3365b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f3365b.get(i10)).setVisibility(0);
            }
        }
    }

    /* compiled from: FragmentTransitionSupport */
    public class c extends m {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f3366a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f3367b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f3368c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ArrayList f3369d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f3370e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ArrayList f3371f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f3366a = obj;
            this.f3367b = arrayList;
            this.f3368c = obj2;
            this.f3369d = arrayList2;
            this.f3370e = obj3;
            this.f3371f = arrayList3;
        }

        public void a(j jVar) {
            Object obj = this.f3366a;
            if (obj != null) {
                e.this.u(obj, this.f3367b, (ArrayList<View>) null);
            }
            Object obj2 = this.f3368c;
            if (obj2 != null) {
                e.this.u(obj2, this.f3369d, (ArrayList<View>) null);
            }
            Object obj3 = this.f3370e;
            if (obj3 != null) {
                e.this.u(obj3, this.f3371f, (ArrayList<View>) null);
            }
        }

        public void e(j jVar) {
            jVar.x(this);
        }
    }

    /* compiled from: FragmentTransitionSupport */
    public class d implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j f3373a;

        public d(e eVar, j jVar) {
            this.f3373a = jVar;
        }

        public void a() {
            this.f3373a.cancel();
        }
    }

    /* renamed from: b2.e$e  reason: collision with other inner class name */
    /* compiled from: FragmentTransitionSupport */
    public class C0047e implements j.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f3374a;

        public C0047e(e eVar, Runnable runnable) {
            this.f3374a = runnable;
        }

        public void a(j jVar) {
        }

        public void b(j jVar) {
        }

        public void c(j jVar) {
        }

        public void d(j jVar) {
        }

        public void e(j jVar) {
            this.f3374a.run();
        }
    }

    /* compiled from: FragmentTransitionSupport */
    public class f extends j.c {
        public f(e eVar, Rect rect) {
        }
    }

    public static boolean t(j jVar) {
        return !m0.i(jVar.f3406e) || !m0.i((List) null) || !m0.i((List) null);
    }

    public void a(Object obj, View view) {
        ((j) obj).b(view);
    }

    public void b(Object obj, ArrayList<View> arrayList) {
        j jVar = (j) obj;
        if (jVar != null) {
            int i10 = 0;
            if (jVar instanceof p) {
                p pVar = (p) jVar;
                int size = pVar.F.size();
                while (i10 < size) {
                    b(pVar.L(i10), arrayList);
                    i10++;
                }
            } else if (!t(jVar) && m0.i(jVar.f3407f)) {
                int size2 = arrayList.size();
                while (i10 < size2) {
                    jVar.b(arrayList.get(i10));
                    i10++;
                }
            }
        }
    }

    public void c(ViewGroup viewGroup, Object obj) {
        n.a(viewGroup, (j) obj);
    }

    public boolean e(Object obj) {
        return obj instanceof j;
    }

    public Object f(Object obj) {
        if (obj != null) {
            return ((j) obj).clone();
        }
        return null;
    }

    public Object j(Object obj, Object obj2, Object obj3) {
        j jVar = (j) obj;
        j jVar2 = (j) obj2;
        j jVar3 = (j) obj3;
        if (jVar != null && jVar2 != null) {
            p pVar = new p();
            pVar.K(jVar);
            pVar.K(jVar2);
            pVar.Q(1);
            jVar = pVar;
        } else if (jVar == null) {
            jVar = jVar2 != null ? jVar2 : null;
        }
        if (jVar3 == null) {
            return jVar;
        }
        p pVar2 = new p();
        if (jVar != null) {
            pVar2.K(jVar);
        }
        pVar2.K(jVar3);
        return pVar2;
    }

    public Object k(Object obj, Object obj2, Object obj3) {
        p pVar = new p();
        if (obj != null) {
            pVar.K((j) obj);
        }
        pVar.K((j) obj2);
        return pVar;
    }

    public void l(Object obj, View view, ArrayList<View> arrayList) {
        ((j) obj).a(new b(this, view, arrayList));
    }

    public void m(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((j) obj).a(new c(obj2, arrayList, (Object) null, (ArrayList) null, obj4, arrayList3));
    }

    public void n(Object obj, Rect rect) {
        ((j) obj).C(new f(this, rect));
    }

    public void o(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((j) obj).C(new a(this, rect));
        }
    }

    public void p(p pVar, Object obj, k0.d dVar, Runnable runnable) {
        j jVar = (j) obj;
        dVar.a(new d(this, jVar));
        jVar.a(new C0047e(this, runnable));
    }

    public void q(Object obj, View view, ArrayList<View> arrayList) {
        p pVar = (p) obj;
        ArrayList<View> arrayList2 = pVar.f3407f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            m0.d(arrayList2, arrayList.get(i10));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(pVar, arrayList);
    }

    public void r(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        p pVar = (p) obj;
        if (pVar != null) {
            pVar.f3407f.clear();
            pVar.f3407f.addAll(arrayList2);
            u(pVar, arrayList, arrayList2);
        }
    }

    public Object s(Object obj) {
        if (obj == null) {
            return null;
        }
        p pVar = new p();
        pVar.K((j) obj);
        return pVar;
    }

    public void u(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i10;
        j jVar = (j) obj;
        int i11 = 0;
        if (jVar instanceof p) {
            p pVar = (p) jVar;
            int size = pVar.F.size();
            while (i11 < size) {
                u(pVar.L(i11), arrayList, arrayList2);
                i11++;
            }
        } else if (!t(jVar)) {
            ArrayList<View> arrayList3 = jVar.f3407f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i10 = 0;
                } else {
                    i10 = arrayList2.size();
                }
                while (i11 < i10) {
                    jVar.b(arrayList2.get(i11));
                    i11++;
                }
                int size2 = arrayList.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        jVar.y(arrayList.get(size2));
                    } else {
                        return;
                    }
                }
            }
        }
    }
}

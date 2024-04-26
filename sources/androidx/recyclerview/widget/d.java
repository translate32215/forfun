package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import o0.c0;

/* compiled from: DefaultItemAnimator */
public class d extends x {

    /* renamed from: s  reason: collision with root package name */
    public static TimeInterpolator f3017s;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<RecyclerView.a0> f3018h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<RecyclerView.a0> f3019i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<e> f3020j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<C0037d> f3021k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public ArrayList<ArrayList<RecyclerView.a0>> f3022l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<ArrayList<e>> f3023m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<ArrayList<C0037d>> f3024n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<RecyclerView.a0> f3025o = new ArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    public ArrayList<RecyclerView.a0> f3026p = new ArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<RecyclerView.a0> f3027q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    public ArrayList<RecyclerView.a0> f3028r = new ArrayList<>();

    /* compiled from: DefaultItemAnimator */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f3029a;

        public a(ArrayList arrayList) {
            this.f3029a = arrayList;
        }

        public void run() {
            Iterator it = this.f3029a.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                d dVar = d.this;
                RecyclerView.a0 a0Var = eVar.f3041a;
                int i10 = eVar.f3042b;
                int i11 = eVar.f3043c;
                int i12 = eVar.f3044d;
                int i13 = eVar.f3045e;
                dVar.getClass();
                View view = a0Var.f2842a;
                int i14 = i12 - i10;
                int i15 = i13 - i11;
                if (i14 != 0) {
                    view.animate().translationX(0.0f);
                }
                if (i15 != 0) {
                    view.animate().translationY(0.0f);
                }
                ViewPropertyAnimator animate = view.animate();
                dVar.f3026p.add(a0Var);
                animate.setDuration(dVar.f2870e).setListener(new g(dVar, a0Var, i14, view, i15, animate)).start();
            }
            this.f3029a.clear();
            d.this.f3023m.remove(this.f3029a);
        }
    }

    /* compiled from: DefaultItemAnimator */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f3031a;

        public b(ArrayList arrayList) {
            this.f3031a = arrayList;
        }

        public void run() {
            View view;
            Iterator it = this.f3031a.iterator();
            while (it.hasNext()) {
                C0037d dVar = (C0037d) it.next();
                d dVar2 = d.this;
                dVar2.getClass();
                RecyclerView.a0 a0Var = dVar.f3035a;
                View view2 = null;
                if (a0Var == null) {
                    view = null;
                } else {
                    view = a0Var.f2842a;
                }
                RecyclerView.a0 a0Var2 = dVar.f3036b;
                if (a0Var2 != null) {
                    view2 = a0Var2.f2842a;
                }
                if (view != null) {
                    ViewPropertyAnimator duration = view.animate().setDuration(dVar2.f2871f);
                    dVar2.f3028r.add(dVar.f3035a);
                    duration.translationX((float) (dVar.f3039e - dVar.f3037c));
                    duration.translationY((float) (dVar.f3040f - dVar.f3038d));
                    duration.alpha(0.0f).setListener(new h(dVar2, dVar, duration, view)).start();
                }
                if (view2 != null) {
                    ViewPropertyAnimator animate = view2.animate();
                    dVar2.f3028r.add(dVar.f3036b);
                    animate.translationX(0.0f).translationY(0.0f).setDuration(dVar2.f2871f).alpha(1.0f).setListener(new i(dVar2, dVar, animate, view2)).start();
                }
            }
            this.f3031a.clear();
            d.this.f3024n.remove(this.f3031a);
        }
    }

    /* compiled from: DefaultItemAnimator */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f3033a;

        public c(ArrayList arrayList) {
            this.f3033a = arrayList;
        }

        public void run() {
            Iterator it = this.f3033a.iterator();
            while (it.hasNext()) {
                RecyclerView.a0 a0Var = (RecyclerView.a0) it.next();
                d dVar = d.this;
                dVar.getClass();
                View view = a0Var.f2842a;
                ViewPropertyAnimator animate = view.animate();
                dVar.f3025o.add(a0Var);
                animate.alpha(1.0f).setDuration(dVar.f2868c).setListener(new f(dVar, a0Var, view, animate)).start();
            }
            this.f3033a.clear();
            d.this.f3022l.remove(this.f3033a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d  reason: collision with other inner class name */
    /* compiled from: DefaultItemAnimator */
    public static class C0037d {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.a0 f3035a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.a0 f3036b;

        /* renamed from: c  reason: collision with root package name */
        public int f3037c;

        /* renamed from: d  reason: collision with root package name */
        public int f3038d;

        /* renamed from: e  reason: collision with root package name */
        public int f3039e;

        /* renamed from: f  reason: collision with root package name */
        public int f3040f;

        public C0037d(RecyclerView.a0 a0Var, RecyclerView.a0 a0Var2, int i10, int i11, int i12, int i13) {
            this.f3035a = a0Var;
            this.f3036b = a0Var2;
            this.f3037c = i10;
            this.f3038d = i11;
            this.f3039e = i12;
            this.f3040f = i13;
        }

        public String toString() {
            StringBuilder a10 = android.support.v4.media.a.a("ChangeInfo{oldHolder=");
            a10.append(this.f3035a);
            a10.append(", newHolder=");
            a10.append(this.f3036b);
            a10.append(", fromX=");
            a10.append(this.f3037c);
            a10.append(", fromY=");
            a10.append(this.f3038d);
            a10.append(", toX=");
            a10.append(this.f3039e);
            a10.append(", toY=");
            a10.append(this.f3040f);
            a10.append('}');
            return a10.toString();
        }
    }

    /* compiled from: DefaultItemAnimator */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.a0 f3041a;

        /* renamed from: b  reason: collision with root package name */
        public int f3042b;

        /* renamed from: c  reason: collision with root package name */
        public int f3043c;

        /* renamed from: d  reason: collision with root package name */
        public int f3044d;

        /* renamed from: e  reason: collision with root package name */
        public int f3045e;

        public e(RecyclerView.a0 a0Var, int i10, int i11, int i12, int i13) {
            this.f3041a = a0Var;
            this.f3042b = i10;
            this.f3043c = i11;
            this.f3044d = i12;
            this.f3045e = i13;
        }
    }

    public boolean c(RecyclerView.a0 a0Var, List<Object> list) {
        return !list.isEmpty() || super.c(a0Var, list);
    }

    public void f(RecyclerView.a0 a0Var) {
        View view = a0Var.f2842a;
        view.animate().cancel();
        int size = this.f3020j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f3020j.get(size).f3041a == a0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                d(a0Var);
                this.f3020j.remove(size);
            }
        }
        q(this.f3021k, a0Var);
        if (this.f3018h.remove(a0Var)) {
            view.setAlpha(1.0f);
            d(a0Var);
        }
        if (this.f3019i.remove(a0Var)) {
            view.setAlpha(1.0f);
            d(a0Var);
        }
        int size2 = this.f3024n.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList = this.f3024n.get(size2);
            q(arrayList, a0Var);
            if (arrayList.isEmpty()) {
                this.f3024n.remove(size2);
            }
        }
        int size3 = this.f3023m.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList2 = this.f3023m.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((e) arrayList2.get(size4)).f3041a == a0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    d(a0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f3023m.remove(size3);
                    }
                }
            }
        }
        int size5 = this.f3022l.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList arrayList3 = this.f3022l.get(size5);
                if (arrayList3.remove(a0Var)) {
                    view.setAlpha(1.0f);
                    d(a0Var);
                    if (arrayList3.isEmpty()) {
                        this.f3022l.remove(size5);
                    }
                }
            } else {
                this.f3027q.remove(a0Var);
                this.f3025o.remove(a0Var);
                this.f3028r.remove(a0Var);
                this.f3026p.remove(a0Var);
                p();
                return;
            }
        }
    }

    public void g() {
        int size = this.f3020j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            e eVar = this.f3020j.get(size);
            View view = eVar.f3041a.f2842a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            d(eVar.f3041a);
            this.f3020j.remove(size);
        }
        int size2 = this.f3018h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            d(this.f3018h.get(size2));
            this.f3018h.remove(size2);
        }
        int size3 = this.f3019i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.a0 a0Var = this.f3019i.get(size3);
            a0Var.f2842a.setAlpha(1.0f);
            d(a0Var);
            this.f3019i.remove(size3);
        }
        int size4 = this.f3021k.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C0037d dVar = this.f3021k.get(size4);
            RecyclerView.a0 a0Var2 = dVar.f3035a;
            if (a0Var2 != null) {
                r(dVar, a0Var2);
            }
            RecyclerView.a0 a0Var3 = dVar.f3036b;
            if (a0Var3 != null) {
                r(dVar, a0Var3);
            }
        }
        this.f3021k.clear();
        if (h()) {
            int size5 = this.f3023m.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList arrayList = this.f3023m.get(size5);
                int size6 = arrayList.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        e eVar2 = (e) arrayList.get(size6);
                        View view2 = eVar2.f3041a.f2842a;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        d(eVar2.f3041a);
                        arrayList.remove(size6);
                        if (arrayList.isEmpty()) {
                            this.f3023m.remove(arrayList);
                        }
                    }
                }
            }
            int size7 = this.f3022l.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                ArrayList arrayList2 = this.f3022l.get(size7);
                int size8 = arrayList2.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        RecyclerView.a0 a0Var4 = (RecyclerView.a0) arrayList2.get(size8);
                        a0Var4.f2842a.setAlpha(1.0f);
                        d(a0Var4);
                        arrayList2.remove(size8);
                        if (arrayList2.isEmpty()) {
                            this.f3022l.remove(arrayList2);
                        }
                    }
                }
            }
            int size9 = this.f3024n.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    ArrayList arrayList3 = this.f3024n.get(size9);
                    int size10 = arrayList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            C0037d dVar2 = (C0037d) arrayList3.get(size10);
                            RecyclerView.a0 a0Var5 = dVar2.f3035a;
                            if (a0Var5 != null) {
                                r(dVar2, a0Var5);
                            }
                            RecyclerView.a0 a0Var6 = dVar2.f3036b;
                            if (a0Var6 != null) {
                                r(dVar2, a0Var6);
                            }
                            if (arrayList3.isEmpty()) {
                                this.f3024n.remove(arrayList3);
                            }
                        }
                    }
                } else {
                    o(this.f3027q);
                    o(this.f3026p);
                    o(this.f3025o);
                    o(this.f3028r);
                    e();
                    return;
                }
            }
        }
    }

    public boolean h() {
        return !this.f3019i.isEmpty() || !this.f3021k.isEmpty() || !this.f3020j.isEmpty() || !this.f3018h.isEmpty() || !this.f3026p.isEmpty() || !this.f3027q.isEmpty() || !this.f3025o.isEmpty() || !this.f3028r.isEmpty() || !this.f3023m.isEmpty() || !this.f3022l.isEmpty() || !this.f3024n.isEmpty();
    }

    public void j() {
        boolean z10 = !this.f3018h.isEmpty();
        boolean z11 = !this.f3020j.isEmpty();
        boolean z12 = !this.f3021k.isEmpty();
        boolean z13 = !this.f3019i.isEmpty();
        if (z10 || z11 || z13 || z12) {
            Iterator<RecyclerView.a0> it = this.f3018h.iterator();
            while (it.hasNext()) {
                RecyclerView.a0 next = it.next();
                View view = next.f2842a;
                ViewPropertyAnimator animate = view.animate();
                this.f3027q.add(next);
                animate.setDuration(this.f2869d).alpha(0.0f).setListener(new e(this, next, animate, view)).start();
            }
            this.f3018h.clear();
            if (z11) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f3020j);
                this.f3023m.add(arrayList);
                this.f3020j.clear();
                a aVar = new a(arrayList);
                if (z10) {
                    View view2 = ((e) arrayList.get(0)).f3041a.f2842a;
                    long j10 = this.f2869d;
                    WeakHashMap<View, String> weakHashMap = c0.f22553a;
                    c0.d.n(view2, aVar, j10);
                } else {
                    aVar.run();
                }
            }
            if (z12) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f3021k);
                this.f3024n.add(arrayList2);
                this.f3021k.clear();
                b bVar = new b(arrayList2);
                if (z10) {
                    View view3 = ((C0037d) arrayList2.get(0)).f3035a.f2842a;
                    long j11 = this.f2869d;
                    WeakHashMap<View, String> weakHashMap2 = c0.f22553a;
                    c0.d.n(view3, bVar, j11);
                } else {
                    bVar.run();
                }
            }
            if (z13) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f3019i);
                this.f3022l.add(arrayList3);
                this.f3019i.clear();
                c cVar = new c(arrayList3);
                if (z10 || z11 || z12) {
                    long j12 = 0;
                    long j13 = z10 ? this.f2869d : 0;
                    long j14 = z11 ? this.f2870e : 0;
                    if (z12) {
                        j12 = this.f2871f;
                    }
                    View view4 = ((RecyclerView.a0) arrayList3.get(0)).f2842a;
                    WeakHashMap<View, String> weakHashMap3 = c0.f22553a;
                    c0.d.n(view4, cVar, Math.max(j14, j12) + j13);
                    return;
                }
                cVar.run();
            }
        }
    }

    public boolean k(RecyclerView.a0 a0Var) {
        s(a0Var);
        a0Var.f2842a.setAlpha(0.0f);
        this.f3019i.add(a0Var);
        return true;
    }

    public boolean l(RecyclerView.a0 a0Var, RecyclerView.a0 a0Var2, int i10, int i11, int i12, int i13) {
        if (a0Var == a0Var2) {
            return m(a0Var, i10, i11, i12, i13);
        }
        float translationX = a0Var.f2842a.getTranslationX();
        float translationY = a0Var.f2842a.getTranslationY();
        float alpha = a0Var.f2842a.getAlpha();
        s(a0Var);
        a0Var.f2842a.setTranslationX(translationX);
        a0Var.f2842a.setTranslationY(translationY);
        a0Var.f2842a.setAlpha(alpha);
        s(a0Var2);
        a0Var2.f2842a.setTranslationX((float) (-((int) (((float) (i12 - i10)) - translationX))));
        a0Var2.f2842a.setTranslationY((float) (-((int) (((float) (i13 - i11)) - translationY))));
        a0Var2.f2842a.setAlpha(0.0f);
        this.f3021k.add(new C0037d(a0Var, a0Var2, i10, i11, i12, i13));
        return true;
    }

    public boolean m(RecyclerView.a0 a0Var, int i10, int i11, int i12, int i13) {
        View view = a0Var.f2842a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) a0Var.f2842a.getTranslationY());
        s(a0Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            d(a0Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX((float) (-i14));
        }
        if (i15 != 0) {
            view.setTranslationY((float) (-i15));
        }
        this.f3020j.add(new e(a0Var, translationX, translationY, i12, i13));
        return true;
    }

    public boolean n(RecyclerView.a0 a0Var) {
        s(a0Var);
        this.f3018h.add(a0Var);
        return true;
    }

    public void o(List<RecyclerView.a0> list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                list.get(size).f2842a.animate().cancel();
            } else {
                return;
            }
        }
    }

    public void p() {
        if (!h()) {
            e();
        }
    }

    public final void q(List<C0037d> list, RecyclerView.a0 a0Var) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                C0037d dVar = list.get(size);
                if (r(dVar, a0Var) && dVar.f3035a == null && dVar.f3036b == null) {
                    list.remove(dVar);
                }
            } else {
                return;
            }
        }
    }

    public final boolean r(C0037d dVar, RecyclerView.a0 a0Var) {
        if (dVar.f3036b == a0Var) {
            dVar.f3036b = null;
        } else if (dVar.f3035a != a0Var) {
            return false;
        } else {
            dVar.f3035a = null;
        }
        a0Var.f2842a.setAlpha(1.0f);
        a0Var.f2842a.setTranslationX(0.0f);
        a0Var.f2842a.setTranslationY(0.0f);
        d(a0Var);
        return true;
    }

    public final void s(RecyclerView.a0 a0Var) {
        if (f3017s == null) {
            f3017s = new ValueAnimator().getInterpolator();
        }
        a0Var.f2842a.animate().setInterpolator(f3017s);
        f(a0Var);
    }
}

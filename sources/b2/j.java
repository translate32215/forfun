package b2;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import o0.c0;
import p.g;
import s.e;
import s.f;

/* compiled from: Transition */
public abstract class j implements Cloneable {
    public static final int[] C = {2, 1, 3, 4};
    public static final g D = new a();
    public static ThreadLocal<s.a<Animator, b>> E = new ThreadLocal<>();
    public c A;
    public g B = D;

    /* renamed from: a  reason: collision with root package name */
    public String f3402a = getClass().getName();

    /* renamed from: b  reason: collision with root package name */
    public long f3403b = -1;

    /* renamed from: c  reason: collision with root package name */
    public long f3404c = -1;

    /* renamed from: d  reason: collision with root package name */
    public TimeInterpolator f3405d = null;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<Integer> f3406e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<View> f3407f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public g f3408g = new g(2);

    /* renamed from: h  reason: collision with root package name */
    public g f3409h = new g(2);

    /* renamed from: i  reason: collision with root package name */
    public p f3410i = null;

    /* renamed from: r  reason: collision with root package name */
    public int[] f3411r = C;

    /* renamed from: s  reason: collision with root package name */
    public ArrayList<r> f3412s;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList<r> f3413t;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList<Animator> f3414u = new ArrayList<>();

    /* renamed from: v  reason: collision with root package name */
    public int f3415v = 0;

    /* renamed from: w  reason: collision with root package name */
    public boolean f3416w = false;

    /* renamed from: x  reason: collision with root package name */
    public boolean f3417x = false;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<d> f3418y = null;

    /* renamed from: z  reason: collision with root package name */
    public ArrayList<Animator> f3419z = new ArrayList<>();

    /* compiled from: Transition */
    public class a extends g {
        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* compiled from: Transition */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public View f3420a;

        /* renamed from: b  reason: collision with root package name */
        public String f3421b;

        /* renamed from: c  reason: collision with root package name */
        public r f3422c;

        /* renamed from: d  reason: collision with root package name */
        public k0 f3423d;

        /* renamed from: e  reason: collision with root package name */
        public j f3424e;

        public b(View view, String str, j jVar, k0 k0Var, r rVar) {
            this.f3420a = view;
            this.f3421b = str;
            this.f3422c = rVar;
            this.f3423d = k0Var;
            this.f3424e = jVar;
        }
    }

    /* compiled from: Transition */
    public static abstract class c {
    }

    /* compiled from: Transition */
    public interface d {
        void a(j jVar);

        void b(j jVar);

        void c(j jVar);

        void d(j jVar);

        void e(j jVar);
    }

    public static void c(g gVar, View view, r rVar) {
        ((s.a) gVar.f23740a).put(view, rVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (((SparseArray) gVar.f23741b).indexOfKey(id2) >= 0) {
                ((SparseArray) gVar.f23741b).put(id2, (Object) null);
            } else {
                ((SparseArray) gVar.f23741b).put(id2, view);
            }
        }
        String p10 = c0.p(view);
        if (p10 != null) {
            if (((s.a) gVar.f23743d).e(p10) >= 0) {
                ((s.a) gVar.f23743d).put(p10, null);
            } else {
                ((s.a) gVar.f23743d).put(p10, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                f fVar = (f) gVar.f23742c;
                if (fVar.f24818a) {
                    fVar.d();
                }
                if (e.b(fVar.f24819b, fVar.f24821d, itemIdAtPosition) >= 0) {
                    View view2 = (View) ((f) gVar.f23742c).e(itemIdAtPosition);
                    if (view2 != null) {
                        c0.d.r(view2, false);
                        ((f) gVar.f23742c).h(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                c0.d.r(view, true);
                ((f) gVar.f23742c).h(itemIdAtPosition, view);
            }
        }
    }

    public static s.a<Animator, b> p() {
        s.a<Animator, b> aVar = E.get();
        if (aVar != null) {
            return aVar;
        }
        s.a<Animator, b> aVar2 = new s.a<>();
        E.set(aVar2);
        return aVar2;
    }

    public static boolean v(r rVar, r rVar2, String str) {
        Object obj = rVar.f3441a.get(str);
        Object obj2 = rVar2.f3441a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    public void A() {
        H();
        s.a<Animator, b> p10 = p();
        Iterator<Animator> it = this.f3419z.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (p10.containsKey(next)) {
                H();
                if (next != null) {
                    next.addListener(new k(this, p10));
                    long j10 = this.f3404c;
                    if (j10 >= 0) {
                        next.setDuration(j10);
                    }
                    long j11 = this.f3403b;
                    if (j11 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j11);
                    }
                    TimeInterpolator timeInterpolator = this.f3405d;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new l(this));
                    next.start();
                }
            }
        }
        this.f3419z.clear();
        n();
    }

    public j B(long j10) {
        this.f3404c = j10;
        return this;
    }

    public void C(c cVar) {
        this.A = cVar;
    }

    public j D(TimeInterpolator timeInterpolator) {
        this.f3405d = timeInterpolator;
        return this;
    }

    public void E(g gVar) {
        if (gVar == null) {
            this.B = D;
        } else {
            this.B = gVar;
        }
    }

    public void F(o oVar) {
    }

    public j G(long j10) {
        this.f3403b = j10;
        return this;
    }

    public void H() {
        if (this.f3415v == 0) {
            ArrayList<d> arrayList = this.f3418y;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f3418y.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((d) arrayList2.get(i10)).a(this);
                }
            }
            this.f3417x = false;
        }
        this.f3415v++;
    }

    public String I(String str) {
        StringBuilder a10 = android.support.v4.media.a.a(str);
        a10.append(getClass().getSimpleName());
        a10.append("@");
        a10.append(Integer.toHexString(hashCode()));
        a10.append(": ");
        String sb2 = a10.toString();
        if (this.f3404c != -1) {
            StringBuilder a11 = t.f.a(sb2, "dur(");
            a11.append(this.f3404c);
            a11.append(") ");
            sb2 = a11.toString();
        }
        if (this.f3403b != -1) {
            StringBuilder a12 = t.f.a(sb2, "dly(");
            a12.append(this.f3403b);
            a12.append(") ");
            sb2 = a12.toString();
        }
        if (this.f3405d != null) {
            StringBuilder a13 = t.f.a(sb2, "interp(");
            a13.append(this.f3405d);
            a13.append(") ");
            sb2 = a13.toString();
        }
        if (this.f3406e.size() <= 0 && this.f3407f.size() <= 0) {
            return sb2;
        }
        String a14 = j.f.a(sb2, "tgts(");
        if (this.f3406e.size() > 0) {
            for (int i10 = 0; i10 < this.f3406e.size(); i10++) {
                if (i10 > 0) {
                    a14 = j.f.a(a14, ", ");
                }
                StringBuilder a15 = android.support.v4.media.a.a(a14);
                a15.append(this.f3406e.get(i10));
                a14 = a15.toString();
            }
        }
        if (this.f3407f.size() > 0) {
            for (int i11 = 0; i11 < this.f3407f.size(); i11++) {
                if (i11 > 0) {
                    a14 = j.f.a(a14, ", ");
                }
                StringBuilder a16 = android.support.v4.media.a.a(a14);
                a16.append(this.f3407f.get(i11));
                a14 = a16.toString();
            }
        }
        return j.f.a(a14, ")");
    }

    public j a(d dVar) {
        if (this.f3418y == null) {
            this.f3418y = new ArrayList<>();
        }
        this.f3418y.add(dVar);
        return this;
    }

    public j b(View view) {
        this.f3407f.add(view);
        return this;
    }

    public void cancel() {
        for (int size = this.f3414u.size() - 1; size >= 0; size--) {
            this.f3414u.get(size).cancel();
        }
        ArrayList<d> arrayList = this.f3418y;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f3418y.clone();
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((d) arrayList2.get(i10)).b(this);
            }
        }
    }

    public abstract void d(r rVar);

    public final void e(View view, boolean z10) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                r rVar = new r(view);
                if (z10) {
                    g(rVar);
                } else {
                    d(rVar);
                }
                rVar.f3443c.add(this);
                f(rVar);
                if (z10) {
                    c(this.f3408g, view, rVar);
                } else {
                    c(this.f3409h, view, rVar);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    e(viewGroup.getChildAt(i10), z10);
                }
            }
        }
    }

    public void f(r rVar) {
    }

    public abstract void g(r rVar);

    public void h(ViewGroup viewGroup, boolean z10) {
        j(z10);
        if (this.f3406e.size() > 0 || this.f3407f.size() > 0) {
            for (int i10 = 0; i10 < this.f3406e.size(); i10++) {
                View findViewById = viewGroup.findViewById(this.f3406e.get(i10).intValue());
                if (findViewById != null) {
                    r rVar = new r(findViewById);
                    if (z10) {
                        g(rVar);
                    } else {
                        d(rVar);
                    }
                    rVar.f3443c.add(this);
                    f(rVar);
                    if (z10) {
                        c(this.f3408g, findViewById, rVar);
                    } else {
                        c(this.f3409h, findViewById, rVar);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f3407f.size(); i11++) {
                View view = this.f3407f.get(i11);
                r rVar2 = new r(view);
                if (z10) {
                    g(rVar2);
                } else {
                    d(rVar2);
                }
                rVar2.f3443c.add(this);
                f(rVar2);
                if (z10) {
                    c(this.f3408g, view, rVar2);
                } else {
                    c(this.f3409h, view, rVar2);
                }
            }
            return;
        }
        e(viewGroup, z10);
    }

    public void j(boolean z10) {
        if (z10) {
            ((s.a) this.f3408g.f23740a).clear();
            ((SparseArray) this.f3408g.f23741b).clear();
            ((f) this.f3408g.f23742c).b();
            return;
        }
        ((s.a) this.f3409h.f23740a).clear();
        ((SparseArray) this.f3409h.f23741b).clear();
        ((f) this.f3409h.f23742c).b();
    }

    /* renamed from: k */
    public j clone() {
        try {
            j jVar = (j) super.clone();
            jVar.f3419z = new ArrayList<>();
            jVar.f3408g = new g(2);
            jVar.f3409h = new g(2);
            jVar.f3412s = null;
            jVar.f3413t = null;
            return jVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator l(ViewGroup viewGroup, r rVar, r rVar2) {
        return null;
    }

    public void m(ViewGroup viewGroup, g gVar, g gVar2, ArrayList<r> arrayList, ArrayList<r> arrayList2) {
        int i10;
        Animator animator;
        r rVar;
        View view;
        r rVar2;
        Animator animator2;
        s.a<Animator, b> p10 = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            r rVar3 = arrayList.get(i11);
            r rVar4 = arrayList2.get(i11);
            if (rVar3 != null && !rVar3.f3443c.contains(this)) {
                rVar3 = null;
            }
            if (rVar4 != null && !rVar4.f3443c.contains(this)) {
                rVar4 = null;
            }
            if (!(rVar3 == null && rVar4 == null)) {
                if (rVar3 == null || rVar4 == null || t(rVar3, rVar4)) {
                    Animator l10 = l(viewGroup, rVar3, rVar4);
                    if (l10 != null) {
                        if (rVar4 != null) {
                            View view2 = rVar4.f3442b;
                            String[] q10 = q();
                            if (q10 != null && q10.length > 0) {
                                rVar2 = new r(view2);
                                r rVar5 = (r) ((s.a) gVar2.f23740a).get(view2);
                                if (rVar5 != null) {
                                    int i12 = 0;
                                    while (i12 < q10.length) {
                                        rVar2.f3441a.put(q10[i12], rVar5.f3441a.get(q10[i12]));
                                        i12++;
                                        l10 = l10;
                                        size = size;
                                        rVar5 = rVar5;
                                    }
                                }
                                Animator animator3 = l10;
                                i10 = size;
                                int i13 = p10.f24851c;
                                int i14 = 0;
                                while (true) {
                                    if (i14 >= i13) {
                                        animator2 = animator3;
                                        break;
                                    }
                                    b bVar = p10.get(p10.h(i14));
                                    if (bVar.f3422c != null && bVar.f3420a == view2 && bVar.f3421b.equals(this.f3402a) && bVar.f3422c.equals(rVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i14++;
                                }
                            } else {
                                g gVar3 = gVar2;
                                i10 = size;
                                animator2 = l10;
                                rVar2 = null;
                            }
                            view = view2;
                            animator = animator2;
                            rVar = rVar2;
                        } else {
                            g gVar4 = gVar2;
                            i10 = size;
                            view = rVar3.f3442b;
                            animator = l10;
                            rVar = null;
                        }
                        if (animator != null) {
                            p10.put(animator, new b(view, this.f3402a, this, z.b(viewGroup), rVar));
                            this.f3419z.add(animator);
                        }
                        i11++;
                        size = i10;
                    }
                    g gVar5 = gVar2;
                    i10 = size;
                    i11++;
                    size = i10;
                }
            }
            ViewGroup viewGroup2 = viewGroup;
            g gVar52 = gVar2;
            i10 = size;
            i11++;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i15 = 0; i15 < sparseIntArray.size(); i15++) {
                Animator animator4 = this.f3419z.get(sparseIntArray.keyAt(i15));
                animator4.setStartDelay(animator4.getStartDelay() + (((long) sparseIntArray.valueAt(i15)) - Long.MAX_VALUE));
            }
        }
    }

    public void n() {
        int i10 = this.f3415v - 1;
        this.f3415v = i10;
        if (i10 == 0) {
            ArrayList<d> arrayList = this.f3418y;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f3418y.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((d) arrayList2.get(i11)).e(this);
                }
            }
            for (int i12 = 0; i12 < ((f) this.f3408g.f23742c).j(); i12++) {
                View view = (View) ((f) this.f3408g.f23742c).k(i12);
                if (view != null) {
                    WeakHashMap<View, String> weakHashMap = c0.f22553a;
                    c0.d.r(view, false);
                }
            }
            for (int i13 = 0; i13 < ((f) this.f3409h.f23742c).j(); i13++) {
                View view2 = (View) ((f) this.f3409h.f23742c).k(i13);
                if (view2 != null) {
                    WeakHashMap<View, String> weakHashMap2 = c0.f22553a;
                    c0.d.r(view2, false);
                }
            }
            this.f3417x = true;
        }
    }

    public r o(View view, boolean z10) {
        p pVar = this.f3410i;
        if (pVar != null) {
            return pVar.o(view, z10);
        }
        ArrayList<r> arrayList = z10 ? this.f3412s : this.f3413t;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = -1;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            r rVar = arrayList.get(i11);
            if (rVar == null) {
                return null;
            }
            if (rVar.f3442b == view) {
                i10 = i11;
                break;
            }
            i11++;
        }
        if (i10 < 0) {
            return null;
        }
        return (z10 ? this.f3413t : this.f3412s).get(i10);
    }

    public String[] q() {
        return null;
    }

    public r r(View view, boolean z10) {
        p pVar = this.f3410i;
        if (pVar != null) {
            return pVar.r(view, z10);
        }
        return (r) ((s.a) (z10 ? this.f3408g : this.f3409h).f23740a).getOrDefault(view, null);
    }

    public boolean t(r rVar, r rVar2) {
        if (rVar == null || rVar2 == null) {
            return false;
        }
        String[] q10 = q();
        if (q10 != null) {
            int length = q10.length;
            int i10 = 0;
            while (i10 < length) {
                if (!v(rVar, rVar2, q10[i10])) {
                    i10++;
                }
            }
            return false;
        }
        for (String v10 : rVar.f3441a.keySet()) {
            if (v(rVar, rVar2, v10)) {
            }
        }
        return false;
        return true;
    }

    public String toString() {
        return I("");
    }

    public boolean u(View view) {
        int id2 = view.getId();
        if ((this.f3406e.size() != 0 || this.f3407f.size() != 0) && !this.f3406e.contains(Integer.valueOf(id2)) && !this.f3407f.contains(view)) {
            return false;
        }
        return true;
    }

    public void w(View view) {
        int i10;
        if (!this.f3417x) {
            int size = this.f3414u.size() - 1;
            while (true) {
                i10 = 0;
                if (size < 0) {
                    break;
                }
                Animator animator = this.f3414u.get(size);
                if (Build.VERSION.SDK_INT >= 19) {
                    animator.pause();
                } else {
                    ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
                    if (listeners != null) {
                        int size2 = listeners.size();
                        while (i10 < size2) {
                            Animator.AnimatorListener animatorListener = listeners.get(i10);
                            if (animatorListener instanceof a) {
                                ((a) animatorListener).onAnimationPause(animator);
                            }
                            i10++;
                        }
                    }
                }
                size--;
            }
            ArrayList<d> arrayList = this.f3418y;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f3418y.clone();
                int size3 = arrayList2.size();
                while (i10 < size3) {
                    ((d) arrayList2.get(i10)).c(this);
                    i10++;
                }
            }
            this.f3416w = true;
        }
    }

    public j x(d dVar) {
        ArrayList<d> arrayList = this.f3418y;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(dVar);
        if (this.f3418y.size() == 0) {
            this.f3418y = null;
        }
        return this;
    }

    public j y(View view) {
        this.f3407f.remove(view);
        return this;
    }

    public void z(View view) {
        if (this.f3416w) {
            if (!this.f3417x) {
                for (int size = this.f3414u.size() - 1; size >= 0; size--) {
                    Animator animator = this.f3414u.get(size);
                    if (Build.VERSION.SDK_INT >= 19) {
                        animator.resume();
                    } else {
                        ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
                        if (listeners != null) {
                            int size2 = listeners.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                Animator.AnimatorListener animatorListener = listeners.get(i10);
                                if (animatorListener instanceof a) {
                                    ((a) animatorListener).onAnimationResume(animator);
                                }
                            }
                        }
                    }
                }
                ArrayList<d> arrayList = this.f3418y;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f3418y.clone();
                    int size3 = arrayList2.size();
                    for (int i11 = 0; i11 < size3; i11++) {
                        ((d) arrayList2.get(i11)).d(this);
                    }
                }
            }
            this.f3416w = false;
        }
    }
}

package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FragmentTransitionCompat21 */
public class k0 extends m0 {

    /* compiled from: FragmentTransitionCompat21 */
    public class a extends Transition.EpicenterCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Rect f1737a;

        public a(k0 k0Var, Rect rect) {
            this.f1737a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f1737a;
        }
    }

    /* compiled from: FragmentTransitionCompat21 */
    public class b implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f1738a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1739b;

        public b(k0 k0Var, View view, ArrayList arrayList) {
            this.f1738a = view;
            this.f1739b = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f1738a.setVisibility(8);
            int size = this.f1739b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f1739b.get(i10)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* compiled from: FragmentTransitionCompat21 */
    public class c implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f1740a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1741b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f1742c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1743d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f1744e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1745f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f1740a = obj;
            this.f1741b = arrayList;
            this.f1742c = obj2;
            this.f1743d = arrayList2;
            this.f1744e = obj3;
            this.f1745f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f1740a;
            if (obj != null) {
                k0.this.u(obj, this.f1741b, (ArrayList<View>) null);
            }
            Object obj2 = this.f1742c;
            if (obj2 != null) {
                k0.this.u(obj2, this.f1743d, (ArrayList<View>) null);
            }
            Object obj3 = this.f1744e;
            if (obj3 != null) {
                k0.this.u(obj3, this.f1745f, (ArrayList<View>) null);
            }
        }
    }

    /* compiled from: FragmentTransitionCompat21 */
    public class d implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f1747a;

        public d(k0 k0Var, Runnable runnable) {
            this.f1747a = runnable;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f1747a.run();
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* compiled from: FragmentTransitionCompat21 */
    public class e extends Transition.EpicenterCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Rect f1748a;

        public e(k0 k0Var, Rect rect) {
            this.f1748a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f1748a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f1748a;
        }
    }

    public static boolean t(Transition transition) {
        return !m0.i(transition.getTargetIds()) || !m0.i(transition.getTargetNames()) || !m0.i(transition.getTargetTypes());
    }

    public void a(Object obj, View view) {
        ((Transition) obj).addTarget(view);
    }

    public void b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i10 = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i10 < transitionCount) {
                    b(transitionSet.getTransitionAt(i10), arrayList);
                    i10++;
                }
            } else if (!t(transition) && m0.i(transition.getTargets())) {
                int size = arrayList.size();
                while (i10 < size) {
                    transition.addTarget(arrayList.get(i10));
                    i10++;
                }
            }
        }
    }

    public void c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    public boolean e(Object obj) {
        return obj instanceof Transition;
    }

    public Object f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    public Object j(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    public Object k(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    public void l(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(this, view, arrayList));
    }

    public void m(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, (Object) null, (ArrayList) null, obj4, arrayList3));
    }

    public void n(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new e(this, rect));
    }

    public void o(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(this, rect));
        }
    }

    public void p(p pVar, Object obj, k0.d dVar, Runnable runnable) {
        ((Transition) obj).addListener(new d(this, runnable));
    }

    public void q(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            m0.d(targets, arrayList.get(i10));
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    public void r(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            u(transitionSet, arrayList, arrayList2);
        }
    }

    public Object s(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    public void u(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        int i10;
        Transition transition = (Transition) obj;
        int i11 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i11 < transitionCount) {
                u(transitionSet.getTransitionAt(i11), arrayList, arrayList2);
                i11++;
            }
        } else if (!t(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                i10 = 0;
            } else {
                i10 = arrayList2.size();
            }
            while (i11 < i10) {
                transition.addTarget(arrayList2.get(i11));
                i11++;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                transition.removeTarget(arrayList.get(size));
            }
        }
    }
}

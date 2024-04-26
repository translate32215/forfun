package b2;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.startapp.startappsdk.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import o0.c0;

/* compiled from: TransitionManager */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public static j f3429a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static ThreadLocal<WeakReference<s.a<ViewGroup, ArrayList<j>>>> f3430b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    public static ArrayList<ViewGroup> f3431c = new ArrayList<>();

    /* compiled from: TransitionManager */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public j f3432a;

        /* renamed from: b  reason: collision with root package name */
        public ViewGroup f3433b;

        /* renamed from: b2.n$a$a  reason: collision with other inner class name */
        /* compiled from: TransitionManager */
        public class C0048a extends m {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ s.a f3434a;

            public C0048a(s.a aVar) {
                this.f3434a = aVar;
            }

            public void e(j jVar) {
                ((ArrayList) this.f3434a.get(a.this.f3433b)).remove(jVar);
                jVar.x(this);
            }
        }

        public a(j jVar, ViewGroup viewGroup) {
            this.f3432a = jVar;
            this.f3433b = viewGroup;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: b2.r} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x024f  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:133:0x01ff A[EDGE_INSN: B:133:0x01ff->B:88:0x01ff ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x00a3  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x0204  */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x0225  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onPreDraw() {
            /*
                r19 = this;
                r0 = r19
                android.view.ViewGroup r1 = r0.f3433b
                android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
                r1.removeOnPreDrawListener(r0)
                android.view.ViewGroup r1 = r0.f3433b
                r1.removeOnAttachStateChangeListener(r0)
                java.util.ArrayList<android.view.ViewGroup> r1 = b2.n.f3431c
                android.view.ViewGroup r2 = r0.f3433b
                boolean r1 = r1.remove(r2)
                r2 = 1
                if (r1 != 0) goto L_0x001c
                return r2
            L_0x001c:
                s.a r1 = b2.n.b()
                android.view.ViewGroup r3 = r0.f3433b
                java.lang.Object r3 = r1.get(r3)
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                r4 = 0
                if (r3 != 0) goto L_0x0036
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                android.view.ViewGroup r5 = r0.f3433b
                r1.put(r5, r3)
                goto L_0x0042
            L_0x0036:
                int r5 = r3.size()
                if (r5 <= 0) goto L_0x0042
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r3)
                goto L_0x0043
            L_0x0042:
                r5 = r4
            L_0x0043:
                b2.j r6 = r0.f3432a
                r3.add(r6)
                b2.j r3 = r0.f3432a
                b2.n$a$a r6 = new b2.n$a$a
                r6.<init>(r1)
                r3.a(r6)
                b2.j r1 = r0.f3432a
                android.view.ViewGroup r3 = r0.f3433b
                r6 = 0
                r1.h(r3, r6)
                if (r5 == 0) goto L_0x0072
                java.util.Iterator r1 = r5.iterator()
            L_0x0060:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0072
                java.lang.Object r3 = r1.next()
                b2.j r3 = (b2.j) r3
                android.view.ViewGroup r5 = r0.f3433b
                r3.z(r5)
                goto L_0x0060
            L_0x0072:
                b2.j r1 = r0.f3432a
                android.view.ViewGroup r8 = r0.f3433b
                r1.getClass()
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.f3412s = r3
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.f3413t = r3
                p.g r3 = r1.f3408g
                p.g r5 = r1.f3409h
                s.a r7 = new s.a
                java.lang.Object r9 = r3.f23740a
                s.a r9 = (s.a) r9
                r7.<init>((s.i) r9)
                s.a r9 = new s.a
                java.lang.Object r10 = r5.f23740a
                s.a r10 = (s.a) r10
                r9.<init>((s.i) r10)
                r10 = 0
            L_0x009e:
                int[] r11 = r1.f3411r
                int r12 = r11.length
                if (r10 >= r12) goto L_0x01ff
                r11 = r11[r10]
                if (r11 == r2) goto L_0x01bf
                r12 = 2
                if (r11 == r12) goto L_0x016d
                r12 = 3
                if (r11 == r12) goto L_0x0115
                r12 = 4
                if (r11 == r12) goto L_0x00b3
            L_0x00b0:
                r17 = r3
                goto L_0x0111
            L_0x00b3:
                java.lang.Object r11 = r3.f23742c
                s.f r11 = (s.f) r11
                java.lang.Object r12 = r5.f23742c
                s.f r12 = (s.f) r12
                int r13 = r11.j()
                r14 = 0
            L_0x00c0:
                if (r14 >= r13) goto L_0x00b0
                java.lang.Object r15 = r11.k(r14)
                android.view.View r15 = (android.view.View) r15
                if (r15 == 0) goto L_0x0107
                boolean r16 = r1.u(r15)
                if (r16 == 0) goto L_0x0107
                r17 = r3
                long r2 = r11.g(r14)
                java.lang.Object r2 = r12.e(r2)
                android.view.View r2 = (android.view.View) r2
                if (r2 == 0) goto L_0x0109
                boolean r3 = r1.u(r2)
                if (r3 == 0) goto L_0x0109
                java.lang.Object r3 = r7.getOrDefault(r15, r4)
                b2.r r3 = (b2.r) r3
                java.lang.Object r18 = r9.getOrDefault(r2, r4)
                r6 = r18
                b2.r r6 = (b2.r) r6
                if (r3 == 0) goto L_0x0109
                if (r6 == 0) goto L_0x0109
                java.util.ArrayList<b2.r> r4 = r1.f3412s
                r4.add(r3)
                java.util.ArrayList<b2.r> r3 = r1.f3413t
                r3.add(r6)
                r7.remove(r15)
                r9.remove(r2)
                goto L_0x0109
            L_0x0107:
                r17 = r3
            L_0x0109:
                int r14 = r14 + 1
                r3 = r17
                r2 = 1
                r4 = 0
                r6 = 0
                goto L_0x00c0
            L_0x0111:
                r2 = r17
                goto L_0x01f5
            L_0x0115:
                r2 = r3
                java.lang.Object r3 = r2.f23741b
                android.util.SparseArray r3 = (android.util.SparseArray) r3
                java.lang.Object r4 = r5.f23741b
                android.util.SparseArray r4 = (android.util.SparseArray) r4
                int r6 = r3.size()
                r11 = 0
            L_0x0123:
                if (r11 >= r6) goto L_0x01f5
                java.lang.Object r12 = r3.valueAt(r11)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L_0x0168
                boolean r13 = r1.u(r12)
                if (r13 == 0) goto L_0x0168
                int r13 = r3.keyAt(r11)
                java.lang.Object r13 = r4.get(r13)
                android.view.View r13 = (android.view.View) r13
                if (r13 == 0) goto L_0x0168
                boolean r14 = r1.u(r13)
                if (r14 == 0) goto L_0x0168
                r14 = 0
                java.lang.Object r15 = r7.getOrDefault(r12, r14)
                b2.r r15 = (b2.r) r15
                java.lang.Object r17 = r9.getOrDefault(r13, r14)
                r14 = r17
                b2.r r14 = (b2.r) r14
                if (r15 == 0) goto L_0x0168
                if (r14 == 0) goto L_0x0168
                java.util.ArrayList<b2.r> r0 = r1.f3412s
                r0.add(r15)
                java.util.ArrayList<b2.r> r0 = r1.f3413t
                r0.add(r14)
                r7.remove(r12)
                r9.remove(r13)
            L_0x0168:
                int r11 = r11 + 1
                r0 = r19
                goto L_0x0123
            L_0x016d:
                r2 = r3
                java.lang.Object r0 = r2.f23743d
                s.a r0 = (s.a) r0
                java.lang.Object r3 = r5.f23743d
                s.a r3 = (s.a) r3
                int r4 = r0.f24851c
                r6 = 0
            L_0x0179:
                if (r6 >= r4) goto L_0x01f5
                java.lang.Object r11 = r0.l(r6)
                android.view.View r11 = (android.view.View) r11
                if (r11 == 0) goto L_0x01bc
                boolean r12 = r1.u(r11)
                if (r12 == 0) goto L_0x01bc
                java.lang.Object r12 = r0.h(r6)
                java.lang.Object r12 = r3.get(r12)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L_0x01bc
                boolean r13 = r1.u(r12)
                if (r13 == 0) goto L_0x01bc
                r13 = 0
                java.lang.Object r14 = r7.getOrDefault(r11, r13)
                b2.r r14 = (b2.r) r14
                java.lang.Object r15 = r9.getOrDefault(r12, r13)
                b2.r r15 = (b2.r) r15
                if (r14 == 0) goto L_0x01bc
                if (r15 == 0) goto L_0x01bc
                java.util.ArrayList<b2.r> r13 = r1.f3412s
                r13.add(r14)
                java.util.ArrayList<b2.r> r13 = r1.f3413t
                r13.add(r15)
                r7.remove(r11)
                r9.remove(r12)
            L_0x01bc:
                int r6 = r6 + 1
                goto L_0x0179
            L_0x01bf:
                r2 = r3
                int r0 = r7.f24851c
            L_0x01c2:
                int r0 = r0 + -1
                if (r0 < 0) goto L_0x01f5
                java.lang.Object r3 = r7.h(r0)
                android.view.View r3 = (android.view.View) r3
                if (r3 == 0) goto L_0x01c2
                boolean r4 = r1.u(r3)
                if (r4 == 0) goto L_0x01c2
                java.lang.Object r3 = r9.remove(r3)
                b2.r r3 = (b2.r) r3
                if (r3 == 0) goto L_0x01c2
                android.view.View r4 = r3.f3442b
                boolean r4 = r1.u(r4)
                if (r4 == 0) goto L_0x01c2
                java.lang.Object r4 = r7.j(r0)
                b2.r r4 = (b2.r) r4
                java.util.ArrayList<b2.r> r6 = r1.f3412s
                r6.add(r4)
                java.util.ArrayList<b2.r> r4 = r1.f3413t
                r4.add(r3)
                goto L_0x01c2
            L_0x01f5:
                int r10 = r10 + 1
                r0 = r19
                r3 = r2
                r2 = 1
                r4 = 0
                r6 = 0
                goto L_0x009e
            L_0x01ff:
                r0 = 0
            L_0x0200:
                int r2 = r7.f24851c
                if (r0 >= r2) goto L_0x0220
                java.lang.Object r2 = r7.l(r0)
                b2.r r2 = (b2.r) r2
                android.view.View r3 = r2.f3442b
                boolean r3 = r1.u(r3)
                if (r3 == 0) goto L_0x021d
                java.util.ArrayList<b2.r> r3 = r1.f3412s
                r3.add(r2)
                java.util.ArrayList<b2.r> r2 = r1.f3413t
                r3 = 0
                r2.add(r3)
            L_0x021d:
                int r0 = r0 + 1
                goto L_0x0200
            L_0x0220:
                r0 = 0
            L_0x0221:
                int r2 = r9.f24851c
                if (r0 >= r2) goto L_0x0241
                java.lang.Object r2 = r9.l(r0)
                b2.r r2 = (b2.r) r2
                android.view.View r3 = r2.f3442b
                boolean r3 = r1.u(r3)
                if (r3 == 0) goto L_0x023e
                java.util.ArrayList<b2.r> r3 = r1.f3413t
                r3.add(r2)
                java.util.ArrayList<b2.r> r2 = r1.f3412s
                r3 = 0
                r2.add(r3)
            L_0x023e:
                int r0 = r0 + 1
                goto L_0x0221
            L_0x0241:
                s.a r0 = b2.j.p()
                int r2 = r0.f24851c
                b2.k0 r3 = b2.z.b(r8)
                r4 = 1
                int r2 = r2 - r4
            L_0x024d:
                if (r2 < 0) goto L_0x02b2
                java.lang.Object r4 = r0.h(r2)
                android.animation.Animator r4 = (android.animation.Animator) r4
                r5 = 0
                if (r4 == 0) goto L_0x02af
                java.lang.Object r6 = r0.getOrDefault(r4, r5)
                b2.j$b r6 = (b2.j.b) r6
                if (r6 == 0) goto L_0x02af
                android.view.View r7 = r6.f3420a
                if (r7 == 0) goto L_0x02af
                b2.k0 r7 = r6.f3423d
                boolean r7 = r3.equals(r7)
                if (r7 == 0) goto L_0x02af
                b2.r r7 = r6.f3422c
                android.view.View r9 = r6.f3420a
                r10 = 1
                b2.r r11 = r1.r(r9, r10)
                b2.r r12 = r1.o(r9, r10)
                if (r11 != 0) goto L_0x028a
                if (r12 != 0) goto L_0x028a
                p.g r10 = r1.f3409h
                java.lang.Object r10 = r10.f23740a
                s.a r10 = (s.a) r10
                java.lang.Object r9 = r10.get(r9)
                r12 = r9
                b2.r r12 = (b2.r) r12
            L_0x028a:
                if (r11 != 0) goto L_0x028e
                if (r12 == 0) goto L_0x0298
            L_0x028e:
                b2.j r6 = r6.f3424e
                boolean r6 = r6.t(r7, r12)
                if (r6 == 0) goto L_0x0298
                r6 = 1
                goto L_0x0299
            L_0x0298:
                r6 = 0
            L_0x0299:
                if (r6 == 0) goto L_0x02af
                boolean r6 = r4.isRunning()
                if (r6 != 0) goto L_0x02ac
                boolean r6 = r4.isStarted()
                if (r6 == 0) goto L_0x02a8
                goto L_0x02ac
            L_0x02a8:
                r0.remove(r4)
                goto L_0x02af
            L_0x02ac:
                r4.cancel()
            L_0x02af:
                int r2 = r2 + -1
                goto L_0x024d
            L_0x02b2:
                p.g r9 = r1.f3408g
                p.g r10 = r1.f3409h
                java.util.ArrayList<b2.r> r11 = r1.f3412s
                java.util.ArrayList<b2.r> r12 = r1.f3413t
                r7 = r1
                r7.m(r8, r9, r10, r11, r12)
                r1.A()
                r0 = 1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: b2.n.a.onPreDraw():boolean");
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            this.f3433b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f3433b.removeOnAttachStateChangeListener(this);
            n.f3431c.remove(this.f3433b);
            ArrayList arrayList = n.b().get(this.f3433b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((j) it.next()).z(this.f3433b);
                }
            }
            this.f3432a.j(true);
        }
    }

    public static void a(ViewGroup viewGroup, j jVar) {
        if (!f3431c.contains(viewGroup) && c0.r(viewGroup)) {
            f3431c.add(viewGroup);
            if (jVar == null) {
                jVar = f3429a;
            }
            j k10 = jVar.clone();
            ArrayList orDefault = b().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator it = orDefault.iterator();
                while (it.hasNext()) {
                    ((j) it.next()).w(viewGroup);
                }
            }
            if (k10 != null) {
                k10.h(viewGroup, true);
            }
            if (((i) viewGroup.getTag(R.id.transition_current_scene)) == null) {
                viewGroup.setTag(R.id.transition_current_scene, (Object) null);
                if (k10 != null) {
                    a aVar = new a(k10, viewGroup);
                    viewGroup.addOnAttachStateChangeListener(aVar);
                    viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                    return;
                }
                return;
            }
            throw null;
        }
    }

    public static s.a<ViewGroup, ArrayList<j>> b() {
        s.a<ViewGroup, ArrayList<j>> aVar;
        WeakReference weakReference = f3430b.get();
        if (weakReference != null && (aVar = (s.a) weakReference.get()) != null) {
            return aVar;
        }
        s.a<ViewGroup, ArrayList<j>> aVar2 = new s.a<>();
        f3430b.set(new WeakReference(aVar2));
        return aVar2;
    }
}

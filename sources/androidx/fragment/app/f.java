package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.p;
import androidx.fragment.app.q0;
import androidx.fragment.app.r;
import com.startapp.startappsdk.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o0.c0;
import o0.f0;
import s.h;

/* compiled from: DefaultSpecialEffectsController */
public class f extends q0 {

    /* compiled from: DefaultSpecialEffectsController */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f1656a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ q0.d f1657b;

        public a(List list, q0.d dVar) {
            this.f1656a = list;
            this.f1657b = dVar;
        }

        public void run() {
            if (this.f1656a.contains(this.f1657b)) {
                this.f1656a.remove(this.f1657b);
                f fVar = f.this;
                q0.d dVar = this.f1657b;
                fVar.getClass();
                dVar.f1847a.a(dVar.f1849c.Q);
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    public static class b extends c {

        /* renamed from: c  reason: collision with root package name */
        public boolean f1659c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1660d = false;

        /* renamed from: e  reason: collision with root package name */
        public r.a f1661e;

        public b(q0.d dVar, k0.d dVar2, boolean z10) {
            super(dVar, dVar2);
            this.f1659c = z10;
        }

        public r.a c(Context context) {
            int i10;
            int i11;
            int i12;
            if (this.f1660d) {
                return this.f1661e;
            }
            q0.d dVar = this.f1662a;
            p pVar = dVar.f1849c;
            boolean z10 = false;
            boolean z11 = dVar.f1847a == q0.d.c.VISIBLE;
            boolean z12 = this.f1659c;
            p.d dVar2 = pVar.Z;
            if (dVar2 == null) {
                i10 = 0;
            } else {
                i10 = dVar2.f1821f;
            }
            if (z12) {
                if (z11) {
                    i11 = pVar.A();
                } else {
                    i11 = pVar.B();
                }
            } else if (z11) {
                i11 = pVar.r();
            } else {
                i11 = pVar.u();
            }
            pVar.k0(0, 0, 0, 0);
            ViewGroup viewGroup = pVar.P;
            r.a aVar = null;
            if (!(viewGroup == null || viewGroup.getTag(R.id.visible_removing_fragment_view_tag) == null)) {
                pVar.P.setTag(R.id.visible_removing_fragment_view_tag, (Object) null);
            }
            ViewGroup viewGroup2 = pVar.P;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                if (i11 == 0 && i10 != 0) {
                    if (i10 == 4097) {
                        i11 = z11 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                    } else if (i10 != 8194) {
                        if (i10 != 8197) {
                            if (i10 == 4099) {
                                i11 = z11 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                            } else if (i10 != 4100) {
                                i11 = -1;
                            } else if (z11) {
                                i12 = r.a(context, 16842936);
                            } else {
                                i12 = r.a(context, 16842937);
                            }
                        } else if (z11) {
                            i12 = r.a(context, 16842938);
                        } else {
                            i12 = r.a(context, 16842939);
                        }
                        i11 = i12;
                    } else {
                        i11 = z11 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                    }
                }
                if (i11 != 0) {
                    boolean equals = "anim".equals(context.getResources().getResourceTypeName(i11));
                    if (equals) {
                        try {
                            Animation loadAnimation = AnimationUtils.loadAnimation(context, i11);
                            if (loadAnimation != null) {
                                aVar = new r.a(loadAnimation);
                            } else {
                                z10 = true;
                            }
                        } catch (Resources.NotFoundException e10) {
                            throw e10;
                        } catch (RuntimeException unused) {
                        }
                    }
                    if (!z10) {
                        try {
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i11);
                            if (loadAnimator != null) {
                                aVar = new r.a(loadAnimator);
                            }
                        } catch (RuntimeException e11) {
                            if (!equals) {
                                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i11);
                                if (loadAnimation2 != null) {
                                    aVar = new r.a(loadAnimation2);
                                }
                            } else {
                                throw e11;
                            }
                        }
                    }
                }
            }
            this.f1661e = aVar;
            this.f1660d = true;
            return aVar;
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final q0.d f1662a;

        /* renamed from: b  reason: collision with root package name */
        public final k0.d f1663b;

        public c(q0.d dVar, k0.d dVar2) {
            this.f1662a = dVar;
            this.f1663b = dVar2;
        }

        public void a() {
            q0.d dVar = this.f1662a;
            if (dVar.f1851e.remove(this.f1663b) && dVar.f1851e.isEmpty()) {
                dVar.b();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
            r2 = androidx.fragment.app.q0.d.c.VISIBLE;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean b() {
            /*
                r3 = this;
                androidx.fragment.app.q0$d r0 = r3.f1662a
                androidx.fragment.app.p r0 = r0.f1849c
                android.view.View r0 = r0.Q
                androidx.fragment.app.q0$d$c r0 = androidx.fragment.app.q0.d.c.c(r0)
                androidx.fragment.app.q0$d r1 = r3.f1662a
                androidx.fragment.app.q0$d$c r1 = r1.f1847a
                if (r0 == r1) goto L_0x0019
                androidx.fragment.app.q0$d$c r2 = androidx.fragment.app.q0.d.c.VISIBLE
                if (r0 == r2) goto L_0x0017
                if (r1 == r2) goto L_0x0017
                goto L_0x0019
            L_0x0017:
                r0 = 0
                goto L_0x001a
            L_0x0019:
                r0 = 1
            L_0x001a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.f.c.b():boolean");
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    public static class d extends c {

        /* renamed from: c  reason: collision with root package name */
        public final Object f1664c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f1665d;

        /* renamed from: e  reason: collision with root package name */
        public final Object f1666e;

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
            if (r5 == androidx.fragment.app.p.f1783m0) goto L_0x0044;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
            if (r5 == androidx.fragment.app.p.f1783m0) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public d(androidx.fragment.app.q0.d r4, k0.d r5, boolean r6, boolean r7) {
            /*
                r3 = this;
                r3.<init>(r4, r5)
                androidx.fragment.app.q0$d$c r5 = r4.f1847a
                androidx.fragment.app.q0$d$c r0 = androidx.fragment.app.q0.d.c.VISIBLE
                r1 = 1
                r2 = 0
                if (r5 != r0) goto L_0x0030
                if (r6 == 0) goto L_0x001b
                androidx.fragment.app.p r5 = r4.f1849c
                androidx.fragment.app.p$d r5 = r5.Z
                if (r5 != 0) goto L_0x0014
                goto L_0x001f
            L_0x0014:
                java.lang.Object r5 = r5.f1825j
                java.lang.Object r0 = androidx.fragment.app.p.f1783m0
                if (r5 != r0) goto L_0x0020
                goto L_0x001f
            L_0x001b:
                androidx.fragment.app.p r5 = r4.f1849c
                androidx.fragment.app.p$d r5 = r5.Z
            L_0x001f:
                r5 = r2
            L_0x0020:
                r3.f1664c = r5
                if (r6 == 0) goto L_0x0029
                androidx.fragment.app.p r5 = r4.f1849c
                androidx.fragment.app.p$d r5 = r5.Z
                goto L_0x002d
            L_0x0029:
                androidx.fragment.app.p r5 = r4.f1849c
                androidx.fragment.app.p$d r5 = r5.Z
            L_0x002d:
                r3.f1665d = r1
                goto L_0x0049
            L_0x0030:
                if (r6 == 0) goto L_0x0040
                androidx.fragment.app.p r5 = r4.f1849c
                androidx.fragment.app.p$d r5 = r5.Z
                if (r5 != 0) goto L_0x0039
                goto L_0x0044
            L_0x0039:
                java.lang.Object r5 = r5.f1824i
                java.lang.Object r0 = androidx.fragment.app.p.f1783m0
                if (r5 != r0) goto L_0x0045
                goto L_0x0044
            L_0x0040:
                androidx.fragment.app.p r5 = r4.f1849c
                androidx.fragment.app.p$d r5 = r5.Z
            L_0x0044:
                r5 = r2
            L_0x0045:
                r3.f1664c = r5
                r3.f1665d = r1
            L_0x0049:
                if (r7 == 0) goto L_0x0066
                if (r6 == 0) goto L_0x005f
                androidx.fragment.app.p r4 = r4.f1849c
                androidx.fragment.app.p$d r4 = r4.Z
                if (r4 != 0) goto L_0x0054
                goto L_0x005c
            L_0x0054:
                java.lang.Object r4 = r4.f1826k
                java.lang.Object r5 = androidx.fragment.app.p.f1783m0
                if (r4 != r5) goto L_0x005b
                goto L_0x005c
            L_0x005b:
                r2 = r4
            L_0x005c:
                r3.f1666e = r2
                goto L_0x0068
            L_0x005f:
                androidx.fragment.app.p r4 = r4.f1849c
                androidx.fragment.app.p$d r4 = r4.Z
                r3.f1666e = r2
                goto L_0x0068
            L_0x0066:
                r3.f1666e = r2
            L_0x0068:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.f.d.<init>(androidx.fragment.app.q0$d, k0.d, boolean, boolean):void");
        }

        public final m0 c(Object obj) {
            if (obj == null) {
                return null;
            }
            m0 m0Var = j0.f1732a;
            if (m0Var != null) {
                ((k0) m0Var).getClass();
                if (obj instanceof Transition) {
                    return m0Var;
                }
            }
            m0 m0Var2 = j0.f1733b;
            if (m0Var2 != null && m0Var2.e(obj)) {
                return m0Var2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f1662a.f1849c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public f(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* JADX WARNING: Removed duplicated region for block: B:172:0x0579  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0584  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0592  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x059b  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0610  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0642  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x07b2  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x08a6  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x097d A[LOOP:20: B:295:0x0977->B:297:0x097d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0997  */
    /* JADX WARNING: Removed duplicated region for block: B:360:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(java.util.List<androidx.fragment.app.q0.d> r41, boolean r42) {
        /*
            r40 = this;
            r7 = r40
            r0 = r41
            r6 = r42
            androidx.fragment.app.q0$d$c r8 = androidx.fragment.app.q0.d.c.GONE
            androidx.fragment.app.q0$d$c r9 = androidx.fragment.app.q0.d.c.VISIBLE
            java.util.Iterator r1 = r41.iterator()
            r2 = 0
            r3 = 0
            r10 = r2
            r11 = r3
        L_0x0012:
            boolean r2 = r1.hasNext()
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0042
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.q0$d r2 = (androidx.fragment.app.q0.d) r2
            androidx.fragment.app.p r5 = r2.f1849c
            android.view.View r5 = r5.Q
            androidx.fragment.app.q0$d$c r5 = androidx.fragment.app.q0.d.c.c(r5)
            androidx.fragment.app.q0$d$c r12 = r2.f1847a
            int r12 = r12.ordinal()
            if (r12 == 0) goto L_0x003c
            if (r12 == r4) goto L_0x0038
            if (r12 == r3) goto L_0x003c
            r3 = 3
            if (r12 == r3) goto L_0x003c
            goto L_0x0012
        L_0x0038:
            if (r5 == r9) goto L_0x0012
            r11 = r2
            goto L_0x0012
        L_0x003c:
            if (r5 != r9) goto L_0x0012
            if (r10 != 0) goto L_0x0012
            r10 = r2
            goto L_0x0012
        L_0x0042:
            boolean r1 = androidx.fragment.app.a0.N(r3)
            java.lang.String r12 = " to "
            java.lang.String r13 = "FragmentManager"
            if (r1 == 0) goto L_0x0066
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Executing operations from "
            r1.append(r2)
            r1.append(r10)
            r1.append(r12)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r13, r1)
        L_0x0066:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            int r1 = r41.size()
            int r1 = r1 + -1
            java.lang.Object r1 = r0.get(r1)
            androidx.fragment.app.q0$d r1 = (androidx.fragment.app.q0.d) r1
            androidx.fragment.app.p r1 = r1.f1849c
            java.util.Iterator r2 = r41.iterator()
        L_0x0087:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00ac
            java.lang.Object r3 = r2.next()
            androidx.fragment.app.q0$d r3 = (androidx.fragment.app.q0.d) r3
            androidx.fragment.app.p r3 = r3.f1849c
            androidx.fragment.app.p$d r3 = r3.Z
            androidx.fragment.app.p$d r4 = r1.Z
            int r0 = r4.f1817b
            r3.f1817b = r0
            int r0 = r4.f1818c
            r3.f1818c = r0
            int r0 = r4.f1819d
            r3.f1819d = r0
            int r0 = r4.f1820e
            r3.f1820e = r0
            r0 = r41
            goto L_0x0087
        L_0x00ac:
            java.util.Iterator r0 = r41.iterator()
        L_0x00b0:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00fb
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.q0$d r1 = (androidx.fragment.app.q0.d) r1
            k0.d r2 = new k0.d
            r2.<init>()
            r1.d()
            java.util.HashSet<k0.d> r3 = r1.f1851e
            r3.add(r2)
            androidx.fragment.app.f$b r3 = new androidx.fragment.app.f$b
            r3.<init>(r1, r2, r6)
            r14.add(r3)
            k0.d r2 = new k0.d
            r2.<init>()
            r1.d()
            java.util.HashSet<k0.d> r3 = r1.f1851e
            r3.add(r2)
            androidx.fragment.app.f$d r3 = new androidx.fragment.app.f$d
            if (r6 == 0) goto L_0x00e5
            if (r1 != r10) goto L_0x00e9
            goto L_0x00e7
        L_0x00e5:
            if (r1 != r11) goto L_0x00e9
        L_0x00e7:
            r4 = 1
            goto L_0x00ea
        L_0x00e9:
            r4 = 0
        L_0x00ea:
            r3.<init>(r1, r2, r6, r4)
            r15.add(r3)
            androidx.fragment.app.f$a r2 = new androidx.fragment.app.f$a
            r2.<init>(r5, r1)
            java.util.List<java.lang.Runnable> r1 = r1.f1850d
            r1.add(r2)
            goto L_0x00b0
        L_0x00fb:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Iterator r0 = r15.iterator()
            r1 = 0
            r3 = r1
        L_0x0106:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0195
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.f$d r1 = (androidx.fragment.app.f.d) r1
            boolean r2 = r1.b()
            if (r2 == 0) goto L_0x011e
            r41 = r0
            r16 = r5
            goto L_0x018f
        L_0x011e:
            java.lang.Object r2 = r1.f1664c
            androidx.fragment.app.m0 r2 = r1.c(r2)
            r41 = r0
            java.lang.Object r0 = r1.f1666e
            androidx.fragment.app.m0 r0 = r1.c(r0)
            r16 = r5
            java.lang.String r5 = " returned Transition "
            java.lang.String r17 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            if (r2 == 0) goto L_0x0160
            if (r0 == 0) goto L_0x0160
            if (r2 != r0) goto L_0x0139
            goto L_0x0160
        L_0x0139:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = android.support.v4.media.a.a(r17)
            androidx.fragment.app.q0$d r3 = r1.f1662a
            androidx.fragment.app.p r3 = r3.f1849c
            r2.append(r3)
            r2.append(r5)
            java.lang.Object r3 = r1.f1664c
            r2.append(r3)
            java.lang.String r3 = " which uses a different Transition  type than its shared element transition "
            r2.append(r3)
            java.lang.Object r1 = r1.f1666e
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0160:
            if (r2 == 0) goto L_0x0163
            goto L_0x0164
        L_0x0163:
            r2 = r0
        L_0x0164:
            if (r3 != 0) goto L_0x0168
            r3 = r2
            goto L_0x018f
        L_0x0168:
            if (r2 == 0) goto L_0x018f
            if (r3 != r2) goto L_0x016d
            goto L_0x018f
        L_0x016d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = android.support.v4.media.a.a(r17)
            androidx.fragment.app.q0$d r3 = r1.f1662a
            androidx.fragment.app.p r3 = r3.f1849c
            r2.append(r3)
            r2.append(r5)
            java.lang.Object r1 = r1.f1664c
            r2.append(r1)
            java.lang.String r1 = " which uses a different Transition  type than other Fragments."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x018f:
            r0 = r41
            r5 = r16
            goto L_0x0106
        L_0x0195:
            r16 = r5
            if (r3 != 0) goto L_0x01c3
            java.util.Iterator r0 = r15.iterator()
        L_0x019d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01b4
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.f$d r1 = (androidx.fragment.app.f.d) r1
            androidx.fragment.app.q0$d r2 = r1.f1662a
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r4.put(r2, r3)
            r1.a()
            goto L_0x019d
        L_0x01b4:
            r34 = r10
            r33 = r11
            r24 = r12
            r6 = r13
            r26 = r14
            r5 = r16
            r14 = r8
            r8 = r4
            goto L_0x0668
        L_0x01c3:
            android.view.View r5 = new android.view.View
            android.view.ViewGroup r0 = r7.f1837a
            android.content.Context r0 = r0.getContext()
            r5.<init>(r0)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r24 = r12
            s.a r12 = new s.a
            r12.<init>()
            java.util.Iterator r25 = r15.iterator()
            r17 = 0
            r18 = 0
            r19 = 0
            r41 = r2
            r26 = r14
            r2 = r17
            r14 = r18
            r27 = 0
            r17 = r4
            r18 = r5
            r4 = r10
            r5 = r11
        L_0x01fe:
            boolean r19 = r25.hasNext()
            if (r19 == 0) goto L_0x0486
            java.lang.Object r19 = r25.next()
            r28 = r14
            r14 = r19
            androidx.fragment.app.f$d r14 = (androidx.fragment.app.f.d) r14
            java.lang.Object r14 = r14.f1666e
            if (r14 == 0) goto L_0x0215
            r19 = 1
            goto L_0x0217
        L_0x0215:
            r19 = 0
        L_0x0217:
            if (r19 == 0) goto L_0x0454
            if (r4 == 0) goto L_0x0454
            if (r5 == 0) goto L_0x0454
            java.lang.Object r2 = r3.f(r14)
            java.lang.Object r14 = r3.s(r2)
            androidx.fragment.app.p r2 = r5.f1849c
            androidx.fragment.app.p$d r2 = r2.Z
            if (r2 == 0) goto L_0x022f
            java.util.ArrayList<java.lang.String> r2 = r2.f1822g
            if (r2 != 0) goto L_0x0234
        L_0x022f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0234:
            r19 = r3
            androidx.fragment.app.p r3 = r4.f1849c
            androidx.fragment.app.p$d r3 = r3.Z
            if (r3 == 0) goto L_0x0240
            java.util.ArrayList<java.lang.String> r3 = r3.f1822g
            if (r3 != 0) goto L_0x0245
        L_0x0240:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x0245:
            r29 = r9
            androidx.fragment.app.p r9 = r4.f1849c
            androidx.fragment.app.p$d r9 = r9.Z
            if (r9 == 0) goto L_0x0251
            java.util.ArrayList<java.lang.String> r9 = r9.f1823h
            if (r9 != 0) goto L_0x0256
        L_0x0251:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x0256:
            r20 = 0
            r30 = r8
            r31 = r15
            r8 = 0
        L_0x025d:
            int r15 = r9.size()
            if (r8 >= r15) goto L_0x027e
            java.lang.Object r15 = r9.get(r8)
            int r15 = r2.indexOf(r15)
            r20 = r9
            r9 = -1
            if (r15 == r9) goto L_0x0279
            java.lang.Object r9 = r3.get(r8)
            java.lang.String r9 = (java.lang.String) r9
            r2.set(r15, r9)
        L_0x0279:
            int r8 = r8 + 1
            r9 = r20
            goto L_0x025d
        L_0x027e:
            androidx.fragment.app.p r3 = r5.f1849c
            androidx.fragment.app.p$d r3 = r3.Z
            if (r3 == 0) goto L_0x0288
            java.util.ArrayList<java.lang.String> r3 = r3.f1823h
            if (r3 != 0) goto L_0x028d
        L_0x0288:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x028d:
            r8 = r3
            if (r6 != 0) goto L_0x029a
            androidx.fragment.app.p r3 = r4.f1849c
            androidx.fragment.app.p$d r3 = r3.Z
            androidx.fragment.app.p r3 = r5.f1849c
            r3.s()
            goto L_0x02a3
        L_0x029a:
            androidx.fragment.app.p r3 = r4.f1849c
            r3.s()
            androidx.fragment.app.p r3 = r5.f1849c
            androidx.fragment.app.p$d r3 = r3.Z
        L_0x02a3:
            int r3 = r2.size()
            r9 = 0
        L_0x02a8:
            if (r9 >= r3) goto L_0x02c2
            java.lang.Object r15 = r2.get(r9)
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r20 = r8.get(r9)
            r21 = r3
            r3 = r20
            java.lang.String r3 = (java.lang.String) r3
            r12.put(r15, r3)
            int r9 = r9 + 1
            r3 = r21
            goto L_0x02a8
        L_0x02c2:
            r3 = 2
            boolean r3 = androidx.fragment.app.a0.N(r3)
            if (r3 == 0) goto L_0x0323
            java.lang.String r3 = ">>> entering view names <<<"
            android.util.Log.v(r13, r3)
            java.util.Iterator r3 = r8.iterator()
        L_0x02d2:
            boolean r9 = r3.hasNext()
            java.lang.String r15 = "Name: "
            if (r9 == 0) goto L_0x02f7
            java.lang.Object r9 = r3.next()
            java.lang.String r9 = (java.lang.String) r9
            r20 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r15)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r13, r3)
            r3 = r20
            goto L_0x02d2
        L_0x02f7:
            java.lang.String r3 = ">>> exiting view names <<<"
            android.util.Log.v(r13, r3)
            java.util.Iterator r3 = r2.iterator()
        L_0x0300:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x0323
            java.lang.Object r9 = r3.next()
            java.lang.String r9 = (java.lang.String) r9
            r20 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r15)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r13, r3)
            r3 = r20
            goto L_0x0300
        L_0x0323:
            s.a r9 = new s.a
            r9.<init>()
            androidx.fragment.app.p r3 = r4.f1849c
            android.view.View r3 = r3.Q
            r7.k(r9, r3)
            s.h.k(r9, r2)
            java.util.Set r3 = r9.keySet()
            s.h.k(r12, r3)
            s.a r15 = new s.a
            r15.<init>()
            androidx.fragment.app.p r3 = r5.f1849c
            android.view.View r3 = r3.Q
            r7.k(r15, r3)
            s.h.k(r15, r8)
            java.util.Collection r3 = r12.values()
            s.h.k(r15, r3)
            androidx.fragment.app.m0 r3 = androidx.fragment.app.j0.f1732a
            int r3 = r12.f24851c
            int r3 = r3 + -1
        L_0x0355:
            if (r3 < 0) goto L_0x036f
            java.lang.Object r20 = r12.l(r3)
            r21 = r2
            r2 = r20
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r15.containsKey(r2)
            if (r2 != 0) goto L_0x036a
            r12.j(r3)
        L_0x036a:
            int r3 = r3 + -1
            r2 = r21
            goto L_0x0355
        L_0x036f:
            r21 = r2
            java.util.Set r2 = r12.keySet()
            r7.l(r9, r2)
            java.util.Collection r2 = r12.values()
            r7.l(r15, r2)
            boolean r2 = r12.isEmpty()
            if (r2 == 0) goto L_0x039f
            r1.clear()
            r0.clear()
            r2 = 0
            r6 = r41
            r9 = r11
            r41 = r12
            r32 = r13
            r36 = r16
            r8 = r17
            r13 = r19
            r11 = r0
            r12 = r1
        L_0x039b:
            r0 = r18
            goto L_0x046a
        L_0x039f:
            androidx.fragment.app.p r2 = r5.f1849c
            androidx.fragment.app.p r3 = r4.f1849c
            androidx.fragment.app.m0 r4 = androidx.fragment.app.j0.f1732a
            if (r6 == 0) goto L_0x03ab
            r3.s()
            goto L_0x03ae
        L_0x03ab:
            r2.s()
        L_0x03ae:
            android.view.ViewGroup r5 = r7.f1837a
            androidx.fragment.app.k r4 = new androidx.fragment.app.k
            r3 = r0
            r0 = r4
            r2 = r1
            r1 = r40
            r6 = r41
            r41 = r12
            r12 = r2
            r2 = r11
            r33 = r11
            r32 = r13
            r13 = r19
            r11 = r3
            r3 = r10
            r34 = r10
            r35 = r17
            r10 = r4
            r4 = r42
            r38 = r6
            r36 = r16
            r37 = r18
            r6 = r5
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            o0.v.a(r6, r10)
            java.util.Collection r0 = r9.values()
            r12.addAll(r0)
            boolean r0 = r21.isEmpty()
            if (r0 != 0) goto L_0x03fa
            r0 = 0
            r2 = r21
            java.lang.Object r1 = r2.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r9.get(r1)
            android.view.View r1 = (android.view.View) r1
            r13.o(r14, r1)
            goto L_0x03fd
        L_0x03fa:
            r0 = 0
            r1 = r28
        L_0x03fd:
            java.util.Collection r2 = r15.values()
            r11.addAll(r2)
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L_0x0427
            java.lang.Object r0 = r8.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r15.get(r0)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x0427
            android.view.ViewGroup r2 = r7.f1837a
            androidx.fragment.app.l r3 = new androidx.fragment.app.l
            r6 = r38
            r3.<init>(r7, r13, r0, r6)
            o0.v.a(r2, r3)
            r27 = 1
            goto L_0x0429
        L_0x0427:
            r6 = r38
        L_0x0429:
            r0 = r37
            r13.q(r14, r0, r12)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r16 = r13
            r17 = r14
            r22 = r14
            r23 = r11
            r16.m(r17, r18, r19, r20, r21, r22, r23)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r10 = r34
            r8 = r35
            r8.put(r10, r2)
            r9 = r33
            r8.put(r9, r2)
            r5 = r9
            r4 = r10
            r2 = r14
            r14 = r1
            goto L_0x046c
        L_0x0454:
            r6 = r41
            r30 = r8
            r29 = r9
            r9 = r11
            r41 = r12
            r32 = r13
            r31 = r15
            r36 = r16
            r8 = r17
            r11 = r0
            r12 = r1
            r13 = r3
            goto L_0x039b
        L_0x046a:
            r14 = r28
        L_0x046c:
            r18 = r0
            r17 = r8
            r0 = r11
            r1 = r12
            r3 = r13
            r8 = r30
            r15 = r31
            r13 = r32
            r16 = r36
            r12 = r41
            r41 = r6
            r11 = r9
            r9 = r29
            r6 = r42
            goto L_0x01fe
        L_0x0486:
            r6 = r41
            r30 = r8
            r29 = r9
            r9 = r11
            r41 = r12
            r32 = r13
            r28 = r14
            r31 = r15
            r36 = r16
            r8 = r17
            r11 = r0
            r12 = r1
            r13 = r3
            r0 = r18
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r3 = r31.iterator()
            r14 = 0
            r15 = 0
        L_0x04a9:
            boolean r16 = r3.hasNext()
            if (r16 == 0) goto L_0x05b9
            java.lang.Object r16 = r3.next()
            r42 = r3
            r3 = r16
            androidx.fragment.app.f$d r3 = (androidx.fragment.app.f.d) r3
            boolean r16 = r3.b()
            if (r16 == 0) goto L_0x04d4
            r33 = r9
            androidx.fragment.app.q0$d r9 = r3.f1662a
            r34 = r10
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r8.put(r9, r10)
            r3.a()
            r3 = r42
            r9 = r33
            r10 = r34
            goto L_0x04a9
        L_0x04d4:
            r33 = r9
            r34 = r10
            java.lang.Object r9 = r3.f1664c
            java.lang.Object r9 = r13.f(r9)
            androidx.fragment.app.q0$d r10 = r3.f1662a
            if (r2 == 0) goto L_0x04e8
            if (r10 == r4) goto L_0x04e6
            if (r10 != r5) goto L_0x04e8
        L_0x04e6:
            r5 = 1
            goto L_0x04e9
        L_0x04e8:
            r5 = 0
        L_0x04e9:
            if (r9 != 0) goto L_0x0504
            if (r5 != 0) goto L_0x04f5
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r8.put(r10, r4)
            r3.a()
        L_0x04f5:
            r37 = r0
            r25 = r2
            r2 = r14
            r0 = r28
            r4 = r29
            r14 = r30
            r5 = r36
            goto L_0x05a2
        L_0x0504:
            r25 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r35 = r14
            androidx.fragment.app.p r14 = r10.f1849c
            android.view.View r14 = r14.Q
            r7.j(r2, r14)
            if (r5 == 0) goto L_0x051f
            if (r10 != r4) goto L_0x051c
            r2.removeAll(r12)
            goto L_0x051f
        L_0x051c:
            r2.removeAll(r11)
        L_0x051f:
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L_0x052f
            r13.a(r9, r0)
            r37 = r0
            r14 = r30
        L_0x052c:
            r5 = r36
            goto L_0x0573
        L_0x052f:
            r13.b(r9, r2)
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r16 = r13
            r17 = r9
            r18 = r9
            r19 = r2
            r16.m(r17, r18, r19, r20, r21, r22, r23)
            androidx.fragment.app.q0$d$c r4 = r10.f1847a
            r14 = r30
            if (r4 != r14) goto L_0x0570
            r5 = r36
            r5.remove(r10)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r2)
            r37 = r0
            androidx.fragment.app.p r0 = r10.f1849c
            android.view.View r0 = r0.Q
            r4.remove(r0)
            androidx.fragment.app.p r0 = r10.f1849c
            android.view.View r0 = r0.Q
            r13.l(r9, r0, r4)
            android.view.ViewGroup r0 = r7.f1837a
            androidx.fragment.app.m r4 = new androidx.fragment.app.m
            r4.<init>(r7, r2)
            o0.v.a(r0, r4)
            goto L_0x0573
        L_0x0570:
            r37 = r0
            goto L_0x052c
        L_0x0573:
            androidx.fragment.app.q0$d$c r0 = r10.f1847a
            r4 = r29
            if (r0 != r4) goto L_0x0584
            r1.addAll(r2)
            if (r27 == 0) goto L_0x0581
            r13.n(r9, r6)
        L_0x0581:
            r0 = r28
            goto L_0x0589
        L_0x0584:
            r0 = r28
            r13.o(r9, r0)
        L_0x0589:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r8.put(r10, r2)
            boolean r2 = r3.f1665d
            if (r2 == 0) goto L_0x059b
            r2 = 0
            java.lang.Object r2 = r13.k(r15, r9, r2)
            r15 = r2
            r2 = r35
            goto L_0x05a2
        L_0x059b:
            r2 = 0
            r3 = r35
            java.lang.Object r2 = r13.k(r3, r9, r2)
        L_0x05a2:
            r3 = r42
            r28 = r0
            r29 = r4
            r36 = r5
            r30 = r14
            r5 = r33
            r9 = r5
            r4 = r34
            r10 = r4
            r0 = r37
            r14 = r2
            r2 = r25
            goto L_0x04a9
        L_0x05b9:
            r33 = r9
            r34 = r10
            r3 = r14
            r14 = r30
            r5 = r36
            java.lang.Object r0 = r13.j(r15, r3, r2)
            if (r0 != 0) goto L_0x05cc
            r6 = r32
            goto L_0x0668
        L_0x05cc:
            java.util.Iterator r3 = r31.iterator()
        L_0x05d0:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x065e
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.f$d r4 = (androidx.fragment.app.f.d) r4
            boolean r6 = r4.b()
            if (r6 == 0) goto L_0x05e3
            goto L_0x05d0
        L_0x05e3:
            java.lang.Object r6 = r4.f1664c
            androidx.fragment.app.q0$d r9 = r4.f1662a
            if (r2 == 0) goto L_0x05f4
            r10 = r34
            r15 = r33
            if (r9 == r10) goto L_0x05f1
            if (r9 != r15) goto L_0x05f8
        L_0x05f1:
            r16 = 1
            goto L_0x05fa
        L_0x05f4:
            r15 = r33
            r10 = r34
        L_0x05f8:
            r16 = 0
        L_0x05fa:
            if (r6 != 0) goto L_0x0608
            if (r16 == 0) goto L_0x05ff
            goto L_0x0608
        L_0x05ff:
            r42 = r3
            r34 = r10
            r33 = r15
            r6 = r32
            goto L_0x0658
        L_0x0608:
            android.view.ViewGroup r6 = r7.f1837a
            boolean r6 = o0.c0.r(r6)
            if (r6 != 0) goto L_0x0642
            r6 = 2
            boolean r6 = androidx.fragment.app.a0.N(r6)
            if (r6 == 0) goto L_0x0636
            java.lang.String r6 = "SpecialEffectsController: Container "
            java.lang.StringBuilder r6 = android.support.v4.media.a.a(r6)
            r42 = r3
            android.view.ViewGroup r3 = r7.f1837a
            r6.append(r3)
            java.lang.String r3 = " has not been laid out. Completing operation "
            r6.append(r3)
            r6.append(r9)
            java.lang.String r3 = r6.toString()
            r6 = r32
            android.util.Log.v(r6, r3)
            goto L_0x063a
        L_0x0636:
            r42 = r3
            r6 = r32
        L_0x063a:
            r4.a()
            r34 = r10
            r33 = r15
            goto L_0x0658
        L_0x0642:
            r42 = r3
            r6 = r32
            androidx.fragment.app.q0$d r3 = r4.f1662a
            androidx.fragment.app.p r3 = r3.f1849c
            r33 = r15
            k0.d r15 = r4.f1663b
            r34 = r10
            androidx.fragment.app.n r10 = new androidx.fragment.app.n
            r10.<init>(r7, r4, r9)
            r13.p(r3, r0, r15, r10)
        L_0x0658:
            r3 = r42
            r32 = r6
            goto L_0x05d0
        L_0x065e:
            r6 = r32
            android.view.ViewGroup r3 = r7.f1837a
            boolean r3 = o0.c0.r(r3)
            if (r3 != 0) goto L_0x0670
        L_0x0668:
            r36 = r5
            r32 = r6
            r30 = r14
            goto L_0x0793
        L_0x0670:
            r3 = 4
            androidx.fragment.app.j0.a(r1, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r11.size()
            r9 = 0
        L_0x067e:
            if (r9 >= r4) goto L_0x0694
            java.lang.Object r10 = r11.get(r9)
            android.view.View r10 = (android.view.View) r10
            java.lang.String r15 = o0.c0.p(r10)
            r3.add(r15)
            r15 = 0
            o0.c0.L(r10, r15)
            int r9 = r9 + 1
            goto L_0x067e
        L_0x0694:
            r4 = 2
            boolean r4 = androidx.fragment.app.a0.N(r4)
            if (r4 == 0) goto L_0x0710
            java.lang.String r4 = ">>>>> Beginning transition <<<<<"
            android.util.Log.v(r6, r4)
            java.lang.String r4 = ">>>>> SharedElementFirstOutViews <<<<<"
            android.util.Log.v(r6, r4)
            java.util.Iterator r4 = r12.iterator()
        L_0x06a9:
            boolean r9 = r4.hasNext()
            java.lang.String r10 = " Name: "
            java.lang.String r15 = "View: "
            if (r9 == 0) goto L_0x06da
            java.lang.Object r9 = r4.next()
            android.view.View r9 = (android.view.View) r9
            r42 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r15)
            r4.append(r9)
            r4.append(r10)
            java.lang.String r9 = o0.c0.p(r9)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            android.util.Log.v(r6, r4)
            r4 = r42
            goto L_0x06a9
        L_0x06da:
            java.lang.String r4 = ">>>>> SharedElementLastInViews <<<<<"
            android.util.Log.v(r6, r4)
            java.util.Iterator r4 = r11.iterator()
        L_0x06e3:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x0710
            java.lang.Object r9 = r4.next()
            android.view.View r9 = (android.view.View) r9
            r42 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r15)
            r4.append(r9)
            r4.append(r10)
            java.lang.String r9 = o0.c0.p(r9)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            android.util.Log.v(r6, r4)
            r4 = r42
            goto L_0x06e3
        L_0x0710:
            android.view.ViewGroup r4 = r7.f1837a
            r13.c(r4, r0)
            android.view.ViewGroup r0 = r7.f1837a
            int r4 = r11.size()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r10 = 0
        L_0x0721:
            if (r10 >= r4) goto L_0x0770
            java.lang.Object r15 = r12.get(r10)
            android.view.View r15 = (android.view.View) r15
            r36 = r5
            java.lang.String r5 = o0.c0.p(r15)
            r9.add(r5)
            if (r5 != 0) goto L_0x0739
            r32 = r6
            r30 = r14
            goto L_0x0767
        L_0x0739:
            r30 = r14
            r14 = 0
            o0.c0.L(r15, r14)
            r15 = r41
            java.lang.Object r14 = r15.getOrDefault(r5, r14)
            java.lang.String r14 = (java.lang.String) r14
            r16 = 0
            r15 = 0
        L_0x074a:
            r32 = r6
            if (r15 >= r4) goto L_0x0767
            java.lang.Object r6 = r3.get(r15)
            boolean r6 = r14.equals(r6)
            if (r6 == 0) goto L_0x0762
            java.lang.Object r6 = r11.get(r15)
            android.view.View r6 = (android.view.View) r6
            o0.c0.L(r6, r5)
            goto L_0x0767
        L_0x0762:
            int r15 = r15 + 1
            r6 = r32
            goto L_0x074a
        L_0x0767:
            int r10 = r10 + 1
            r14 = r30
            r6 = r32
            r5 = r36
            goto L_0x0721
        L_0x0770:
            r36 = r5
            r32 = r6
            r30 = r14
            androidx.fragment.app.l0 r5 = new androidx.fragment.app.l0
            r16 = r5
            r17 = r13
            r18 = r4
            r19 = r11
            r20 = r3
            r21 = r12
            r22 = r9
            r16.<init>(r17, r18, r19, r20, r21, r22)
            o0.v.a(r0, r5)
            r0 = 0
            androidx.fragment.app.j0.a(r1, r0)
            r13.r(r2, r12, r11)
        L_0x0793:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r9 = r8.containsValue(r0)
            android.view.ViewGroup r10 = r7.f1837a
            android.content.Context r11 = r10.getContext()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r13 = r26.iterator()
            r0 = 0
            r6 = 0
        L_0x07aa:
            boolean r0 = r13.hasNext()
            java.lang.String r14 = " has started."
            if (r0 == 0) goto L_0x0898
            java.lang.Object r0 = r13.next()
            r15 = r0
            androidx.fragment.app.f$b r15 = (androidx.fragment.app.f.b) r15
            boolean r0 = r15.b()
            if (r0 == 0) goto L_0x07c3
            r15.a()
            goto L_0x07d4
        L_0x07c3:
            androidx.fragment.app.r$a r0 = r15.c(r11)
            if (r0 != 0) goto L_0x07cd
            r15.a()
            goto L_0x07d4
        L_0x07cd:
            android.animation.Animator r5 = r0.f1865b
            if (r5 != 0) goto L_0x07d7
            r12.add(r15)
        L_0x07d4:
            r3 = r32
            goto L_0x080f
        L_0x07d7:
            androidx.fragment.app.q0$d r4 = r15.f1662a
            androidx.fragment.app.p r0 = r4.f1849c
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Object r2 = r8.get(r4)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0812
            r1 = 2
            boolean r1 = androidx.fragment.app.a0.N(r1)
            if (r1 == 0) goto L_0x080a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Ignoring Animator set on "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " as this Fragment was involved in a Transition."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3 = r32
            android.util.Log.v(r3, r0)
            goto L_0x080c
        L_0x080a:
            r3 = r32
        L_0x080c:
            r15.a()
        L_0x080f:
            r32 = r3
            goto L_0x07aa
        L_0x0812:
            r3 = r32
            androidx.fragment.app.q0$d$c r1 = r4.f1847a
            r6 = r30
            if (r1 != r6) goto L_0x081e
            r1 = 1
            r16 = 1
            goto L_0x0821
        L_0x081e:
            r1 = 0
            r16 = 0
        L_0x0821:
            r2 = r36
            if (r16 == 0) goto L_0x0828
            r2.remove(r4)
        L_0x0828:
            android.view.View r1 = r0.Q
            r10.startViewTransition(r1)
            androidx.fragment.app.g r0 = new androidx.fragment.app.g
            r41 = r0
            r42 = r1
            r1 = r40
            r17 = r2
            r2 = r10
            r18 = r3
            r3 = r42
            r19 = r4
            r4 = r16
            r35 = r8
            r16 = r17
            r8 = r5
            r5 = r19
            r17 = r6
            r39 = r18
            r18 = r13
            r13 = r39
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.addListener(r0)
            r0 = r42
            r8.setTarget(r0)
            r8.start()
            r0 = 2
            boolean r0 = androidx.fragment.app.a0.N(r0)
            if (r0 == 0) goto L_0x087f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Animator from operation "
            r0.append(r1)
            r1 = r19
            r0.append(r1)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r13, r0)
            goto L_0x0881
        L_0x087f:
            r1 = r19
        L_0x0881:
            k0.d r0 = r15.f1663b
            androidx.fragment.app.h r2 = new androidx.fragment.app.h
            r2.<init>(r7, r8, r1)
            r0.a(r2)
            r6 = 1
            r32 = r13
            r36 = r16
            r30 = r17
            r13 = r18
            r8 = r35
            goto L_0x07aa
        L_0x0898:
            r13 = r32
            r16 = r36
            java.util.Iterator r8 = r12.iterator()
        L_0x08a0:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0973
            java.lang.Object r0 = r8.next()
            r12 = r0
            androidx.fragment.app.f$b r12 = (androidx.fragment.app.f.b) r12
            androidx.fragment.app.q0$d r15 = r12.f1662a
            androidx.fragment.app.p r0 = r15.f1849c
            java.lang.String r1 = "Ignoring Animation set on "
            if (r9 == 0) goto L_0x08d7
            r2 = 2
            boolean r2 = androidx.fragment.app.a0.N(r2)
            if (r2 == 0) goto L_0x08d3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = " as Animations cannot run alongside Transitions."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.v(r13, r0)
        L_0x08d3:
            r12.a()
            goto L_0x08a0
        L_0x08d7:
            if (r6 == 0) goto L_0x08fb
            r2 = 2
            boolean r2 = androidx.fragment.app.a0.N(r2)
            if (r2 == 0) goto L_0x08f7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = " as Animations cannot run alongside Animators."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.v(r13, r0)
        L_0x08f7:
            r12.a()
            goto L_0x08a0
        L_0x08fb:
            android.view.View r5 = r0.Q
            androidx.fragment.app.r$a r0 = r12.c(r11)
            r0.getClass()
            android.view.animation.Animation r0 = r0.f1864a
            r0.getClass()
            androidx.fragment.app.q0$d$c r1 = r15.f1847a
            androidx.fragment.app.q0$d$c r2 = androidx.fragment.app.q0.d.c.REMOVED
            if (r1 == r2) goto L_0x091b
            r5.startAnimation(r0)
            r12.a()
            r41 = r6
            r42 = r8
            r8 = r5
            goto L_0x095a
        L_0x091b:
            r10.startViewTransition(r5)
            androidx.fragment.app.r$b r4 = new androidx.fragment.app.r$b
            r4.<init>(r0, r10, r5)
            androidx.fragment.app.i r3 = new androidx.fragment.app.i
            r0 = r3
            r1 = r40
            r2 = r15
            r41 = r6
            r6 = r3
            r3 = r10
            r7 = r4
            r4 = r5
            r42 = r8
            r8 = r5
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r7.setAnimationListener(r6)
            r8.startAnimation(r7)
            r0 = 2
            boolean r0 = androidx.fragment.app.a0.N(r0)
            if (r0 == 0) goto L_0x095a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Animation from operation "
            r0.append(r1)
            r0.append(r15)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r13, r0)
        L_0x095a:
            k0.d r6 = r12.f1663b
            androidx.fragment.app.j r7 = new androidx.fragment.app.j
            r0 = r7
            r1 = r40
            r2 = r8
            r3 = r10
            r4 = r12
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
            r7 = r40
            r6 = r41
            r8 = r42
            goto L_0x08a0
        L_0x0973:
            java.util.Iterator r0 = r16.iterator()
        L_0x0977:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x098d
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.q0$d r1 = (androidx.fragment.app.q0.d) r1
            androidx.fragment.app.p r2 = r1.f1849c
            android.view.View r2 = r2.Q
            androidx.fragment.app.q0$d$c r1 = r1.f1847a
            r1.a(r2)
            goto L_0x0977
        L_0x098d:
            r16.clear()
            r0 = 2
            boolean r0 = androidx.fragment.app.a0.N(r0)
            if (r0 == 0) goto L_0x09b7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Completed executing operations from "
            r0.append(r1)
            r2 = r34
            r0.append(r2)
            r1 = r24
            r0.append(r1)
            r11 = r33
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r13, r0)
        L_0x09b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.f.b(java.util.List, boolean):void");
    }

    public void j(ArrayList<View> arrayList, View view) {
        boolean z10;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (Build.VERSION.SDK_INT >= 21) {
                z10 = f0.b(viewGroup);
            } else {
                Boolean bool = (Boolean) viewGroup.getTag(R.id.tag_transition_group);
                z10 = ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && c0.p(viewGroup) == null) ? false : true;
            }
            if (!z10) {
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        j(arrayList, childAt);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public void k(Map<String, View> map, View view) {
        String p10 = c0.p(view);
        if (p10 != null) {
            map.put(p10, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    k(map, childAt);
                }
            }
        }
    }

    public void l(s.a<String, View> aVar, Collection<String> collection) {
        Iterator it = ((h.b) aVar.entrySet()).iterator();
        while (true) {
            h.d dVar = (h.d) it;
            if (dVar.hasNext()) {
                dVar.next();
                if (!collection.contains(c0.p((View) dVar.getValue()))) {
                    dVar.remove();
                }
            } else {
                return;
            }
        }
    }
}

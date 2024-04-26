package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.e;
import androidx.fragment.app.p;
import androidx.fragment.app.q0;
import androidx.lifecycle.o;
import androidx.lifecycle.u;
import androidx.lifecycle.v0;
import c1.d;
import com.startapp.nd;
import com.startapp.startappsdk.R;
import e.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import l1.b;
import n2.g;
import o0.c0;
import ud.k;

/* compiled from: FragmentStateManager */
public class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final x f1692a;

    /* renamed from: b  reason: collision with root package name */
    public final g f1693b;

    /* renamed from: c  reason: collision with root package name */
    public final p f1694c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1695d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f1696e = -1;

    /* compiled from: FragmentStateManager */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f1697a;

        public a(h0 h0Var, View view) {
            this.f1697a = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.f1697a.removeOnAttachStateChangeListener(this);
            c0.A(this.f1697a);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public h0(x xVar, g gVar, p pVar) {
        this.f1692a = xVar;
        this.f1693b = gVar;
        this.f1694c = pVar;
    }

    public void a() {
        if (a0.N(3)) {
            StringBuilder a10 = android.support.v4.media.a.a("moveto ACTIVITY_CREATED: ");
            a10.append(this.f1694c);
            Log.d("FragmentManager", a10.toString());
        }
        p pVar = this.f1694c;
        Bundle bundle = pVar.f1786b;
        pVar.D.U();
        pVar.f1784a = 3;
        pVar.O = false;
        pVar.L(bundle);
        if (pVar.O) {
            if (a0.N(3)) {
                Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + pVar);
            }
            View view = pVar.Q;
            if (view != null) {
                Bundle bundle2 = pVar.f1786b;
                SparseArray<Parcelable> sparseArray = pVar.f1788c;
                if (sparseArray != null) {
                    view.restoreHierarchyState(sparseArray);
                    pVar.f1788c = null;
                }
                if (pVar.Q != null) {
                    n0 n0Var = pVar.f1795f0;
                    n0Var.f1763d.c(pVar.f1790d);
                    pVar.f1790d = null;
                }
                pVar.O = false;
                pVar.e0(bundle2);
                if (!pVar.O) {
                    throw new s0(c.a("Fragment ", pVar, " did not call through to super.onViewStateRestored()"));
                } else if (pVar.Q != null) {
                    pVar.f1795f0.a(o.b.ON_CREATE);
                }
            }
            pVar.f1786b = null;
            a0 a0Var = pVar.D;
            a0Var.G = false;
            a0Var.H = false;
            a0Var.N.f1653i = false;
            a0Var.u(4);
            x xVar = this.f1692a;
            p pVar2 = this.f1694c;
            xVar.a(pVar2, pVar2.f1786b, false);
            return;
        }
        throw new s0(c.a("Fragment ", pVar, " did not call through to super.onActivityCreated()"));
    }

    public void b() {
        View view;
        View view2;
        g gVar = this.f1693b;
        p pVar = this.f1694c;
        gVar.getClass();
        ViewGroup viewGroup = pVar.P;
        int i10 = -1;
        if (viewGroup != null) {
            int indexOf = ((ArrayList) gVar.f21850a).indexOf(pVar);
            int i11 = indexOf - 1;
            while (true) {
                if (i11 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= ((ArrayList) gVar.f21850a).size()) {
                            break;
                        }
                        p pVar2 = (p) ((ArrayList) gVar.f21850a).get(indexOf);
                        if (pVar2.P == viewGroup && (view = pVar2.Q) != null) {
                            i10 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    p pVar3 = (p) ((ArrayList) gVar.f21850a).get(i11);
                    if (pVar3.P == viewGroup && (view2 = pVar3.Q) != null) {
                        i10 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i11--;
                }
            }
        }
        p pVar4 = this.f1694c;
        pVar4.P.addView(pVar4.Q, i10);
    }

    public void c() {
        if (a0.N(3)) {
            StringBuilder a10 = android.support.v4.media.a.a("moveto ATTACHED: ");
            a10.append(this.f1694c);
            Log.d("FragmentManager", a10.toString());
        }
        p pVar = this.f1694c;
        p pVar2 = pVar.f1798h;
        h0 h0Var = null;
        if (pVar2 != null) {
            h0 i10 = this.f1693b.i(pVar2.f1794f);
            if (i10 != null) {
                p pVar3 = this.f1694c;
                pVar3.f1800i = pVar3.f1798h.f1794f;
                pVar3.f1798h = null;
                h0Var = i10;
            } else {
                StringBuilder a11 = android.support.v4.media.a.a("Fragment ");
                a11.append(this.f1694c);
                a11.append(" declared target fragment ");
                a11.append(this.f1694c.f1798h);
                a11.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(a11.toString());
            }
        } else {
            String str = pVar.f1800i;
            if (str != null && (h0Var = this.f1693b.i(str)) == null) {
                StringBuilder a12 = android.support.v4.media.a.a("Fragment ");
                a12.append(this.f1694c);
                a12.append(" declared target fragment ");
                throw new IllegalStateException(e.a(a12, this.f1694c.f1800i, " that does not belong to this FragmentManager!"));
            }
        }
        if (h0Var != null) {
            h0Var.k();
        }
        p pVar4 = this.f1694c;
        a0 a0Var = pVar4.B;
        pVar4.C = a0Var.f1598v;
        pVar4.E = a0Var.f1600x;
        this.f1692a.g(pVar4, false);
        p pVar5 = this.f1694c;
        Iterator<p.f> it = pVar5.f1803k0.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        pVar5.f1803k0.clear();
        pVar5.D.b(pVar5.C, pVar5.k(), pVar5);
        pVar5.f1784a = 0;
        pVar5.O = false;
        pVar5.N(pVar5.C.f1874b);
        if (pVar5.O) {
            a0 a0Var2 = pVar5.B;
            Iterator<e0> it2 = a0Var2.f1591o.iterator();
            while (it2.hasNext()) {
                it2.next().a(a0Var2, pVar5);
            }
            a0 a0Var3 = pVar5.D;
            a0Var3.G = false;
            a0Var3.H = false;
            a0Var3.N.f1653i = false;
            a0Var3.u(0);
            this.f1692a.b(this.f1694c, false);
            return;
        }
        throw new s0(c.a("Fragment ", pVar5, " did not call through to super.onAttach()"));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: androidx.fragment.app.q0$d$b} */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r9v4, types: [androidx.fragment.app.q0$d$b] */
    /* JADX WARNING: type inference failed for: r8v6, types: [androidx.fragment.app.q0$d$b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int d() {
        /*
            r13 = this;
            androidx.fragment.app.p r0 = r13.f1694c
            androidx.fragment.app.a0 r1 = r0.B
            if (r1 != 0) goto L_0x0009
            int r0 = r0.f1784a
            return r0
        L_0x0009:
            int r1 = r13.f1696e
            androidx.lifecycle.o$c r0 = r0.f1791d0
            int r0 = r0.ordinal()
            r2 = -1
            r3 = 5
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            if (r0 == r7) goto L_0x002e
            if (r0 == r6) goto L_0x0029
            if (r0 == r4) goto L_0x0024
            if (r0 == r5) goto L_0x0033
            int r1 = java.lang.Math.min(r1, r2)
            goto L_0x0033
        L_0x0024:
            int r1 = java.lang.Math.min(r1, r3)
            goto L_0x0033
        L_0x0029:
            int r1 = java.lang.Math.min(r1, r7)
            goto L_0x0033
        L_0x002e:
            r0 = 0
            int r1 = java.lang.Math.min(r1, r0)
        L_0x0033:
            androidx.fragment.app.p r0 = r13.f1694c
            boolean r8 = r0.f1810w
            if (r8 == 0) goto L_0x0063
            boolean r8 = r0.f1811x
            if (r8 == 0) goto L_0x0054
            int r0 = r13.f1696e
            int r1 = java.lang.Math.max(r0, r6)
            androidx.fragment.app.p r0 = r13.f1694c
            android.view.View r0 = r0.Q
            if (r0 == 0) goto L_0x0063
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0063
            int r1 = java.lang.Math.min(r1, r6)
            goto L_0x0063
        L_0x0054:
            int r8 = r13.f1696e
            if (r8 >= r5) goto L_0x005f
            int r0 = r0.f1784a
            int r1 = java.lang.Math.min(r1, r0)
            goto L_0x0063
        L_0x005f:
            int r1 = java.lang.Math.min(r1, r7)
        L_0x0063:
            androidx.fragment.app.p r0 = r13.f1694c
            boolean r0 = r0.f1807t
            if (r0 != 0) goto L_0x006d
            int r1 = java.lang.Math.min(r1, r7)
        L_0x006d:
            androidx.fragment.app.p r0 = r13.f1694c
            android.view.ViewGroup r8 = r0.P
            r9 = 0
            if (r8 == 0) goto L_0x00bc
            androidx.fragment.app.a0 r0 = r0.y()
            androidx.fragment.app.r0 r0 = r0.L()
            androidx.fragment.app.q0 r0 = androidx.fragment.app.q0.g(r8, r0)
            r0.getClass()
            androidx.fragment.app.p r8 = r13.f1694c
            androidx.fragment.app.q0$d r8 = r0.d(r8)
            if (r8 == 0) goto L_0x008e
            androidx.fragment.app.q0$d$b r8 = r8.f1848b
            goto L_0x008f
        L_0x008e:
            r8 = r9
        L_0x008f:
            androidx.fragment.app.p r10 = r13.f1694c
            java.util.ArrayList<androidx.fragment.app.q0$d> r0 = r0.f1839c
            java.util.Iterator r0 = r0.iterator()
        L_0x0097:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x00b0
            java.lang.Object r11 = r0.next()
            androidx.fragment.app.q0$d r11 = (androidx.fragment.app.q0.d) r11
            androidx.fragment.app.p r12 = r11.f1849c
            boolean r12 = r12.equals(r10)
            if (r12 == 0) goto L_0x0097
            boolean r12 = r11.f1852f
            if (r12 != 0) goto L_0x0097
            r9 = r11
        L_0x00b0:
            if (r9 == 0) goto L_0x00bb
            if (r8 == 0) goto L_0x00b8
            androidx.fragment.app.q0$d$b r0 = androidx.fragment.app.q0.d.b.NONE
            if (r8 != r0) goto L_0x00bb
        L_0x00b8:
            androidx.fragment.app.q0$d$b r9 = r9.f1848b
            goto L_0x00bc
        L_0x00bb:
            r9 = r8
        L_0x00bc:
            androidx.fragment.app.q0$d$b r0 = androidx.fragment.app.q0.d.b.ADDING
            if (r9 != r0) goto L_0x00c6
            r0 = 6
            int r1 = java.lang.Math.min(r1, r0)
            goto L_0x00e4
        L_0x00c6:
            androidx.fragment.app.q0$d$b r0 = androidx.fragment.app.q0.d.b.REMOVING
            if (r9 != r0) goto L_0x00cf
            int r1 = java.lang.Math.max(r1, r4)
            goto L_0x00e4
        L_0x00cf:
            androidx.fragment.app.p r0 = r13.f1694c
            boolean r4 = r0.f1808u
            if (r4 == 0) goto L_0x00e4
            boolean r0 = r0.K()
            if (r0 == 0) goto L_0x00e0
            int r1 = java.lang.Math.min(r1, r7)
            goto L_0x00e4
        L_0x00e0:
            int r1 = java.lang.Math.min(r1, r2)
        L_0x00e4:
            androidx.fragment.app.p r0 = r13.f1694c
            boolean r2 = r0.R
            if (r2 == 0) goto L_0x00f2
            int r0 = r0.f1784a
            if (r0 >= r3) goto L_0x00f2
            int r1 = java.lang.Math.min(r1, r5)
        L_0x00f2:
            boolean r0 = androidx.fragment.app.a0.N(r6)
            if (r0 == 0) goto L_0x010e
            java.lang.String r0 = "computeExpectedState() of "
            java.lang.String r2 = " for "
            java.lang.StringBuilder r0 = androidx.appcompat.widget.y0.a(r0, r1, r2)
            androidx.fragment.app.p r2 = r13.f1694c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r0)
        L_0x010e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.h0.d():int");
    }

    public void e() {
        if (a0.N(3)) {
            StringBuilder a10 = android.support.v4.media.a.a("moveto CREATED: ");
            a10.append(this.f1694c);
            Log.d("FragmentManager", a10.toString());
        }
        p pVar = this.f1694c;
        if (!pVar.f1787b0) {
            this.f1692a.h(pVar, pVar.f1786b, false);
            p pVar2 = this.f1694c;
            Bundle bundle = pVar2.f1786b;
            pVar2.D.U();
            pVar2.f1784a = 1;
            pVar2.O = false;
            if (Build.VERSION.SDK_INT >= 19) {
                pVar2.f1793e0.a(new Fragment$6(pVar2));
            }
            pVar2.f1801i0.c(bundle);
            pVar2.O(bundle);
            pVar2.f1787b0 = true;
            if (pVar2.O) {
                pVar2.f1793e0.f(o.b.ON_CREATE);
                x xVar = this.f1692a;
                p pVar3 = this.f1694c;
                xVar.c(pVar3, pVar3.f1786b, false);
                return;
            }
            throw new s0(c.a("Fragment ", pVar2, " did not call through to super.onCreate()"));
        }
        pVar.j0(pVar.f1786b);
        this.f1694c.f1784a = 1;
    }

    public void f() {
        String str;
        if (!this.f1694c.f1810w) {
            if (a0.N(3)) {
                StringBuilder a10 = android.support.v4.media.a.a("moveto CREATE_VIEW: ");
                a10.append(this.f1694c);
                Log.d("FragmentManager", a10.toString());
            }
            p pVar = this.f1694c;
            LayoutInflater T = pVar.T(pVar.f1786b);
            ViewGroup viewGroup = null;
            p pVar2 = this.f1694c;
            ViewGroup viewGroup2 = pVar2.P;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i10 = pVar2.G;
                if (i10 != 0) {
                    if (i10 != -1) {
                        viewGroup = (ViewGroup) pVar2.B.f1599w.b(i10);
                        if (viewGroup == null) {
                            p pVar3 = this.f1694c;
                            if (!pVar3.f1812y) {
                                try {
                                    str = pVar3.C().getResourceName(this.f1694c.G);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                StringBuilder a11 = android.support.v4.media.a.a("No view found for id 0x");
                                a11.append(Integer.toHexString(this.f1694c.G));
                                a11.append(" (");
                                a11.append(str);
                                a11.append(") for fragment ");
                                a11.append(this.f1694c);
                                throw new IllegalArgumentException(a11.toString());
                            }
                        } else if (!(viewGroup instanceof FragmentContainerView)) {
                            p pVar4 = this.f1694c;
                            d dVar = d.f4021a;
                            k.f(pVar4, "fragment");
                            c1.a aVar = new c1.a(pVar4, viewGroup);
                            d dVar2 = d.f4021a;
                            d.c(aVar);
                            d.c a12 = d.a(pVar4);
                            if (a12.f4033a.contains(d.a.DETECT_WRONG_FRAGMENT_CONTAINER) && d.f(a12, pVar4.getClass(), c1.a.class)) {
                                d.b(a12, aVar);
                            }
                        }
                    } else {
                        StringBuilder a13 = android.support.v4.media.a.a("Cannot create fragment ");
                        a13.append(this.f1694c);
                        a13.append(" for a container view with no id");
                        throw new IllegalArgumentException(a13.toString());
                    }
                }
            }
            p pVar5 = this.f1694c;
            pVar5.P = viewGroup;
            pVar5.f0(T, viewGroup, pVar5.f1786b);
            View view = this.f1694c.Q;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                p pVar6 = this.f1694c;
                pVar6.Q.setTag(R.id.fragment_container_view_tag, pVar6);
                if (viewGroup != null) {
                    b();
                }
                p pVar7 = this.f1694c;
                if (pVar7.I) {
                    pVar7.Q.setVisibility(8);
                }
                if (c0.q(this.f1694c.Q)) {
                    c0.A(this.f1694c.Q);
                } else {
                    View view2 = this.f1694c.Q;
                    view2.addOnAttachStateChangeListener(new a(this, view2));
                }
                p pVar8 = this.f1694c;
                pVar8.d0(pVar8.Q, pVar8.f1786b);
                pVar8.D.u(2);
                x xVar = this.f1692a;
                p pVar9 = this.f1694c;
                xVar.m(pVar9, pVar9.Q, pVar9.f1786b, false);
                int visibility = this.f1694c.Q.getVisibility();
                this.f1694c.n().f1827l = this.f1694c.Q.getAlpha();
                p pVar10 = this.f1694c;
                if (pVar10.P != null && visibility == 0) {
                    View findFocus = pVar10.Q.findFocus();
                    if (findFocus != null) {
                        this.f1694c.n().f1828m = findFocus;
                        if (a0.N(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f1694c);
                        }
                    }
                    this.f1694c.Q.setAlpha(0.0f);
                }
            }
            this.f1694c.f1784a = 2;
        }
    }

    public void g() {
        p e10;
        if (a0.N(3)) {
            StringBuilder a10 = android.support.v4.media.a.a("movefrom CREATED: ");
            a10.append(this.f1694c);
            Log.d("FragmentManager", a10.toString());
        }
        p pVar = this.f1694c;
        boolean z10 = true;
        boolean z11 = pVar.f1808u && !pVar.K();
        if (z11) {
            p pVar2 = this.f1694c;
            if (!pVar2.f1809v) {
                this.f1693b.u(pVar2.f1794f, (g0) null);
            }
        }
        if (z11 || ((d0) this.f1693b.f21853d).j(this.f1694c)) {
            v<?> vVar = this.f1694c.C;
            if (vVar instanceof v0) {
                z10 = ((d0) this.f1693b.f21853d).f1652h;
            } else {
                Context context = vVar.f1874b;
                if (context instanceof Activity) {
                    z10 = true ^ ((Activity) context).isChangingConfigurations();
                }
            }
            if ((z11 && !this.f1694c.f1809v) || z10) {
                ((d0) this.f1693b.f21853d).g(this.f1694c);
            }
            p pVar3 = this.f1694c;
            pVar3.D.l();
            pVar3.f1793e0.f(o.b.ON_DESTROY);
            pVar3.f1784a = 0;
            pVar3.O = false;
            pVar3.f1787b0 = false;
            pVar3.Q();
            if (pVar3.O) {
                this.f1692a.d(this.f1694c, false);
                Iterator it = ((ArrayList) this.f1693b.g()).iterator();
                while (it.hasNext()) {
                    h0 h0Var = (h0) it.next();
                    if (h0Var != null) {
                        p pVar4 = h0Var.f1694c;
                        if (this.f1694c.f1794f.equals(pVar4.f1800i)) {
                            pVar4.f1798h = this.f1694c;
                            pVar4.f1800i = null;
                        }
                    }
                }
                p pVar5 = this.f1694c;
                String str = pVar5.f1800i;
                if (str != null) {
                    pVar5.f1798h = this.f1693b.e(str);
                }
                this.f1693b.n(this);
                return;
            }
            throw new s0(c.a("Fragment ", pVar3, " did not call through to super.onDestroy()"));
        }
        String str2 = this.f1694c.f1800i;
        if (!(str2 == null || (e10 = this.f1693b.e(str2)) == null || !e10.K)) {
            this.f1694c.f1798h = e10;
        }
        this.f1694c.f1784a = 0;
    }

    public void h() {
        View view;
        if (a0.N(3)) {
            StringBuilder a10 = android.support.v4.media.a.a("movefrom CREATE_VIEW: ");
            a10.append(this.f1694c);
            Log.d("FragmentManager", a10.toString());
        }
        p pVar = this.f1694c;
        ViewGroup viewGroup = pVar.P;
        if (!(viewGroup == null || (view = pVar.Q) == null)) {
            viewGroup.removeView(view);
        }
        p pVar2 = this.f1694c;
        pVar2.D.u(1);
        if (pVar2.Q != null) {
            n0 n0Var = pVar2.f1795f0;
            n0Var.b();
            if (n0Var.f1762c.f2726b.compareTo(o.c.CREATED) >= 0) {
                pVar2.f1795f0.a(o.b.ON_DESTROY);
            }
        }
        pVar2.f1784a = 1;
        pVar2.O = false;
        pVar2.R();
        if (pVar2.O) {
            b.C0180b bVar = ((b) l1.a.b(pVar2)).f21010b;
            int k10 = bVar.f21012d.k();
            for (int i10 = 0; i10 < k10; i10++) {
                bVar.f21012d.l(i10).getClass();
            }
            pVar2.f1813z = false;
            this.f1692a.n(this.f1694c, false);
            p pVar3 = this.f1694c;
            pVar3.P = null;
            pVar3.Q = null;
            pVar3.f1795f0 = null;
            pVar3.f1797g0.l(null);
            this.f1694c.f1811x = false;
            return;
        }
        throw new s0(c.a("Fragment ", pVar2, " did not call through to super.onDestroyView()"));
    }

    public void i() {
        if (a0.N(3)) {
            StringBuilder a10 = android.support.v4.media.a.a("movefrom ATTACHED: ");
            a10.append(this.f1694c);
            Log.d("FragmentManager", a10.toString());
        }
        p pVar = this.f1694c;
        pVar.f1784a = -1;
        boolean z10 = false;
        pVar.O = false;
        pVar.S();
        if (pVar.O) {
            a0 a0Var = pVar.D;
            if (!a0Var.I) {
                a0Var.l();
                pVar.D = new b0();
            }
            this.f1692a.e(this.f1694c, false);
            p pVar2 = this.f1694c;
            pVar2.f1784a = -1;
            pVar2.C = null;
            pVar2.E = null;
            pVar2.B = null;
            if (pVar2.f1808u && !pVar2.K()) {
                z10 = true;
            }
            if (z10 || ((d0) this.f1693b.f21853d).j(this.f1694c)) {
                if (a0.N(3)) {
                    StringBuilder a11 = android.support.v4.media.a.a("initState called for fragment: ");
                    a11.append(this.f1694c);
                    Log.d("FragmentManager", a11.toString());
                }
                this.f1694c.H();
                return;
            }
            return;
        }
        throw new s0(c.a("Fragment ", pVar, " did not call through to super.onDetach()"));
    }

    public void j() {
        p pVar = this.f1694c;
        if (pVar.f1810w && pVar.f1811x && !pVar.f1813z) {
            if (a0.N(3)) {
                StringBuilder a10 = android.support.v4.media.a.a("moveto CREATE_VIEW: ");
                a10.append(this.f1694c);
                Log.d("FragmentManager", a10.toString());
            }
            p pVar2 = this.f1694c;
            pVar2.f0(pVar2.T(pVar2.f1786b), (ViewGroup) null, this.f1694c.f1786b);
            View view = this.f1694c.Q;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                p pVar3 = this.f1694c;
                pVar3.Q.setTag(R.id.fragment_container_view_tag, pVar3);
                p pVar4 = this.f1694c;
                if (pVar4.I) {
                    pVar4.Q.setVisibility(8);
                }
                p pVar5 = this.f1694c;
                pVar5.d0(pVar5.Q, pVar5.f1786b);
                pVar5.D.u(2);
                x xVar = this.f1692a;
                p pVar6 = this.f1694c;
                xVar.m(pVar6, pVar6.Q, pVar6.f1786b, false);
                this.f1694c.f1784a = 2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        q0.d.b bVar = q0.d.b.NONE;
        if (!this.f1695d) {
            try {
                this.f1695d = true;
                boolean z10 = false;
                while (true) {
                    int d10 = d();
                    p pVar = this.f1694c;
                    int i10 = pVar.f1784a;
                    if (d10 != i10) {
                        if (d10 <= i10) {
                            switch (i10 - 1) {
                                case nd.f10913j /*-1*/:
                                    i();
                                    break;
                                case 0:
                                    if (pVar.f1809v) {
                                        g gVar = this.f1693b;
                                        if (((g0) ((HashMap) gVar.f21852c).get(pVar.f1794f)) == null) {
                                            o();
                                        }
                                    }
                                    g();
                                    break;
                                case 1:
                                    h();
                                    this.f1694c.f1784a = 1;
                                    break;
                                case 2:
                                    pVar.f1811x = false;
                                    pVar.f1784a = 2;
                                    break;
                                case 3:
                                    if (a0.N(3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f1694c);
                                    }
                                    p pVar2 = this.f1694c;
                                    if (pVar2.f1809v) {
                                        o();
                                    } else if (pVar2.Q != null && pVar2.f1788c == null) {
                                        p();
                                    }
                                    p pVar3 = this.f1694c;
                                    if (!(pVar3.Q == null || (viewGroup2 = pVar3.P) == null)) {
                                        q0 g10 = q0.g(viewGroup2, pVar3.y().L());
                                        g10.getClass();
                                        if (a0.N(2)) {
                                            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + this.f1694c);
                                        }
                                        g10.a(q0.d.c.REMOVED, q0.d.b.REMOVING, this);
                                    }
                                    this.f1694c.f1784a = 3;
                                    break;
                                case 4:
                                    r();
                                    break;
                                case 5:
                                    pVar.f1784a = 5;
                                    break;
                                case 6:
                                    l();
                                    break;
                            }
                        } else {
                            switch (i10 + 1) {
                                case 0:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(pVar.Q == null || (viewGroup3 = pVar.P) == null)) {
                                        q0 g11 = q0.g(viewGroup3, pVar.y().L());
                                        q0.d.c b10 = q0.d.c.b(this.f1694c.Q.getVisibility());
                                        g11.getClass();
                                        if (a0.N(2)) {
                                            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + this.f1694c);
                                        }
                                        g11.a(b10, q0.d.b.ADDING, this);
                                    }
                                    this.f1694c.f1784a = 4;
                                    break;
                                case 5:
                                    q();
                                    break;
                                case 6:
                                    pVar.f1784a = 6;
                                    break;
                                case 7:
                                    n();
                                    break;
                            }
                        }
                        z10 = true;
                    } else {
                        if (!z10 && i10 == -1 && pVar.f1808u && !pVar.K() && !this.f1694c.f1809v) {
                            if (a0.N(3)) {
                                Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f1694c);
                            }
                            ((d0) this.f1693b.f21853d).g(this.f1694c);
                            this.f1693b.n(this);
                            if (a0.N(3)) {
                                Log.d("FragmentManager", "initState called for fragment: " + this.f1694c);
                            }
                            this.f1694c.H();
                        }
                        p pVar4 = this.f1694c;
                        if (pVar4.f1785a0) {
                            if (!(pVar4.Q == null || (viewGroup = pVar4.P) == null)) {
                                q0 g12 = q0.g(viewGroup, pVar4.y().L());
                                if (this.f1694c.I) {
                                    g12.getClass();
                                    if (a0.N(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + this.f1694c);
                                    }
                                    g12.a(q0.d.c.GONE, bVar, this);
                                } else {
                                    g12.getClass();
                                    if (a0.N(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + this.f1694c);
                                    }
                                    g12.a(q0.d.c.VISIBLE, bVar, this);
                                }
                            }
                            p pVar5 = this.f1694c;
                            a0 a0Var = pVar5.B;
                            if (a0Var != null) {
                                a0Var.getClass();
                                if (pVar5.f1807t && a0Var.O(pVar5)) {
                                    a0Var.F = true;
                                }
                            }
                            p pVar6 = this.f1694c;
                            pVar6.f1785a0 = false;
                            boolean z11 = pVar6.I;
                            pVar6.getClass();
                            this.f1694c.D.o();
                        }
                        this.f1695d = false;
                        return;
                    }
                }
            } catch (Throwable th) {
                this.f1695d = false;
                throw th;
            }
        } else if (a0.N(2)) {
            StringBuilder a10 = android.support.v4.media.a.a("Ignoring re-entrant call to moveToExpectedState() for ");
            a10.append(this.f1694c);
            Log.v("FragmentManager", a10.toString());
        }
    }

    public void l() {
        if (a0.N(3)) {
            StringBuilder a10 = android.support.v4.media.a.a("movefrom RESUMED: ");
            a10.append(this.f1694c);
            Log.d("FragmentManager", a10.toString());
        }
        p pVar = this.f1694c;
        pVar.D.u(5);
        if (pVar.Q != null) {
            pVar.f1795f0.a(o.b.ON_PAUSE);
        }
        pVar.f1793e0.f(o.b.ON_PAUSE);
        pVar.f1784a = 6;
        pVar.O = false;
        pVar.V();
        if (pVar.O) {
            this.f1692a.f(this.f1694c, false);
            return;
        }
        throw new s0(c.a("Fragment ", pVar, " did not call through to super.onPause()"));
    }

    public void m(ClassLoader classLoader) {
        Bundle bundle = this.f1694c.f1786b;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            p pVar = this.f1694c;
            pVar.f1788c = pVar.f1786b.getSparseParcelableArray("android:view_state");
            p pVar2 = this.f1694c;
            pVar2.f1790d = pVar2.f1786b.getBundle("android:view_registry_state");
            p pVar3 = this.f1694c;
            pVar3.f1800i = pVar3.f1786b.getString("android:target_state");
            p pVar4 = this.f1694c;
            if (pVar4.f1800i != null) {
                pVar4.f1805r = pVar4.f1786b.getInt("android:target_req_state", 0);
            }
            p pVar5 = this.f1694c;
            Boolean bool = pVar5.f1792e;
            if (bool != null) {
                pVar5.S = bool.booleanValue();
                this.f1694c.f1792e = null;
            } else {
                pVar5.S = pVar5.f1786b.getBoolean("android:user_visible_hint", true);
            }
            p pVar6 = this.f1694c;
            if (!pVar6.S) {
                pVar6.R = true;
            }
        }
    }

    public void n() {
        View view;
        boolean z10;
        if (a0.N(3)) {
            StringBuilder a10 = android.support.v4.media.a.a("moveto RESUMED: ");
            a10.append(this.f1694c);
            Log.d("FragmentManager", a10.toString());
        }
        p pVar = this.f1694c;
        p.d dVar = pVar.Z;
        if (dVar == null) {
            view = null;
        } else {
            view = dVar.f1828m;
        }
        if (view != null) {
            if (view != pVar.Q) {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent == null) {
                        z10 = false;
                        break;
                    } else if (parent == this.f1694c.Q) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            z10 = true;
            if (z10) {
                boolean requestFocus = view.requestFocus();
                if (a0.N(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("requestFocus: Restoring focused view ");
                    sb2.append(view);
                    sb2.append(" ");
                    sb2.append(requestFocus ? "succeeded" : "failed");
                    sb2.append(" on Fragment ");
                    sb2.append(this.f1694c);
                    sb2.append(" resulting in focused view ");
                    sb2.append(this.f1694c.Q.findFocus());
                    Log.v("FragmentManager", sb2.toString());
                }
            }
        }
        this.f1694c.m0((View) null);
        p pVar2 = this.f1694c;
        pVar2.D.U();
        pVar2.D.A(true);
        pVar2.f1784a = 7;
        pVar2.O = false;
        pVar2.Z();
        if (pVar2.O) {
            u uVar = pVar2.f1793e0;
            o.b bVar = o.b.ON_RESUME;
            uVar.f(bVar);
            if (pVar2.Q != null) {
                pVar2.f1795f0.a(bVar);
            }
            a0 a0Var = pVar2.D;
            a0Var.G = false;
            a0Var.H = false;
            a0Var.N.f1653i = false;
            a0Var.u(7);
            this.f1692a.i(this.f1694c, false);
            p pVar3 = this.f1694c;
            pVar3.f1786b = null;
            pVar3.f1788c = null;
            pVar3.f1790d = null;
            return;
        }
        throw new s0(c.a("Fragment ", pVar2, " did not call through to super.onResume()"));
    }

    public void o() {
        g0 g0Var = new g0(this.f1694c);
        p pVar = this.f1694c;
        if (pVar.f1784a <= -1 || g0Var.f1689u != null) {
            g0Var.f1689u = pVar.f1786b;
        } else {
            Bundle bundle = new Bundle();
            p pVar2 = this.f1694c;
            pVar2.a0(bundle);
            pVar2.f1801i0.d(bundle);
            Bundle d02 = pVar2.D.d0();
            if (d02 != null) {
                bundle.putParcelable("android:support:fragments", d02);
            }
            this.f1692a.j(this.f1694c, bundle, false);
            if (bundle.isEmpty()) {
                bundle = null;
            }
            if (this.f1694c.Q != null) {
                p();
            }
            if (this.f1694c.f1788c != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putSparseParcelableArray("android:view_state", this.f1694c.f1788c);
            }
            if (this.f1694c.f1790d != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("android:view_registry_state", this.f1694c.f1790d);
            }
            if (!this.f1694c.S) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android:user_visible_hint", this.f1694c.S);
            }
            g0Var.f1689u = bundle;
            if (this.f1694c.f1800i != null) {
                if (bundle == null) {
                    g0Var.f1689u = new Bundle();
                }
                g0Var.f1689u.putString("android:target_state", this.f1694c.f1800i);
                int i10 = this.f1694c.f1805r;
                if (i10 != 0) {
                    g0Var.f1689u.putInt("android:target_req_state", i10);
                }
            }
        }
        this.f1693b.u(this.f1694c.f1794f, g0Var);
    }

    public void p() {
        if (this.f1694c.Q != null) {
            if (a0.N(2)) {
                StringBuilder a10 = android.support.v4.media.a.a("Saving view state for fragment ");
                a10.append(this.f1694c);
                a10.append(" with view ");
                a10.append(this.f1694c.Q);
                Log.v("FragmentManager", a10.toString());
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f1694c.Q.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f1694c.f1788c = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f1694c.f1795f0.f1763d.d(bundle);
            if (!bundle.isEmpty()) {
                this.f1694c.f1790d = bundle;
            }
        }
    }

    public void q() {
        if (a0.N(3)) {
            StringBuilder a10 = android.support.v4.media.a.a("moveto STARTED: ");
            a10.append(this.f1694c);
            Log.d("FragmentManager", a10.toString());
        }
        p pVar = this.f1694c;
        pVar.D.U();
        pVar.D.A(true);
        pVar.f1784a = 5;
        pVar.O = false;
        pVar.b0();
        if (pVar.O) {
            u uVar = pVar.f1793e0;
            o.b bVar = o.b.ON_START;
            uVar.f(bVar);
            if (pVar.Q != null) {
                pVar.f1795f0.a(bVar);
            }
            a0 a0Var = pVar.D;
            a0Var.G = false;
            a0Var.H = false;
            a0Var.N.f1653i = false;
            a0Var.u(5);
            this.f1692a.k(this.f1694c, false);
            return;
        }
        throw new s0(c.a("Fragment ", pVar, " did not call through to super.onStart()"));
    }

    public void r() {
        if (a0.N(3)) {
            StringBuilder a10 = android.support.v4.media.a.a("movefrom STARTED: ");
            a10.append(this.f1694c);
            Log.d("FragmentManager", a10.toString());
        }
        p pVar = this.f1694c;
        a0 a0Var = pVar.D;
        a0Var.H = true;
        a0Var.N.f1653i = true;
        a0Var.u(4);
        if (pVar.Q != null) {
            pVar.f1795f0.a(o.b.ON_STOP);
        }
        pVar.f1793e0.f(o.b.ON_STOP);
        pVar.f1784a = 4;
        pVar.O = false;
        pVar.c0();
        if (pVar.O) {
            this.f1692a.l(this.f1694c, false);
            return;
        }
        throw new s0(c.a("Fragment ", pVar, " did not call through to super.onStop()"));
    }

    public h0(x xVar, g gVar, ClassLoader classLoader, u uVar, g0 g0Var) {
        this.f1692a = xVar;
        this.f1693b = gVar;
        p a10 = g0Var.a(uVar, classLoader);
        this.f1694c = a10;
        if (a0.N(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a10);
        }
    }

    public h0(x xVar, g gVar, p pVar, g0 g0Var) {
        this.f1692a = xVar;
        this.f1693b = gVar;
        this.f1694c = pVar;
        pVar.f1788c = null;
        pVar.f1790d = null;
        pVar.A = 0;
        pVar.f1811x = false;
        pVar.f1807t = false;
        p pVar2 = pVar.f1798h;
        pVar.f1800i = pVar2 != null ? pVar2.f1794f : null;
        pVar.f1798h = null;
        Bundle bundle = g0Var.f1689u;
        if (bundle != null) {
            pVar.f1786b = bundle;
        } else {
            pVar.f1786b = new Bundle();
        }
    }
}

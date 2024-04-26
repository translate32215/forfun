package androidx.navigation.fragment;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.i;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.a0;
import androidx.fragment.app.b;
import androidx.fragment.app.p;
import androidx.lifecycle.o;
import androidx.lifecycle.t;
import androidx.lifecycle.u0;
import com.startapp.startappsdk.R;
import j.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import o1.c0;
import o1.d0;
import o1.e0;
import o1.g0;
import o1.h;
import o1.m;
import o1.v;
import o1.w;
import q1.c;
import q1.d;
import q1.e;
import ud.k;

/* compiled from: NavHostFragment.kt */
public class NavHostFragment extends p {

    /* renamed from: n0  reason: collision with root package name */
    public v f2752n0;

    /* renamed from: o0  reason: collision with root package name */
    public Boolean f2753o0;

    /* renamed from: p0  reason: collision with root package name */
    public View f2754p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f2755q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f2756r0;

    public void N(Context context) {
        k.f(context, "context");
        super.N(context);
        if (this.f2756r0) {
            b bVar = new b(y());
            bVar.p(this);
            bVar.e();
        }
    }

    public void O(Bundle bundle) {
        Bundle bundle2;
        o c10;
        Context h02 = h0();
        v vVar = new v(h02);
        this.f2752n0 = vVar;
        if (!k.a(this, vVar.f22730n)) {
            t tVar = vVar.f22730n;
            if (!(tVar == null || (c10 = tVar.c()) == null)) {
                c10.c(vVar.f22735s);
            }
            vVar.f22730n = this;
            this.f1793e0.a(vVar.f22735s);
        }
        while (true) {
            if (!(h02 instanceof ContextWrapper)) {
                break;
            } else if (h02 instanceof i) {
                v vVar2 = this.f2752n0;
                k.c(vVar2);
                OnBackPressedDispatcher d10 = ((i) h02).d();
                k.e(d10, "context as OnBackPressed…).onBackPressedDispatcher");
                if (!k.a(d10, vVar2.f22731o)) {
                    t tVar2 = vVar2.f22730n;
                    if (tVar2 != null) {
                        vVar2.f22736t.b();
                        vVar2.f22731o = d10;
                        d10.a(tVar2, vVar2.f22736t);
                        o c11 = tVar2.c();
                        c11.c(vVar2.f22735s);
                        c11.a(vVar2.f22735s);
                    } else {
                        throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()".toString());
                    }
                }
            } else {
                h02 = ((ContextWrapper) h02).getBaseContext();
                k.e(h02, "context.baseContext");
            }
        }
        v vVar3 = this.f2752n0;
        k.c(vVar3);
        Boolean bool = this.f2753o0;
        int i10 = 0;
        vVar3.f22737u = bool != null && bool.booleanValue();
        vVar3.x();
        Bundle bundle3 = null;
        this.f2753o0 = null;
        v vVar4 = this.f2752n0;
        k.c(vVar4);
        u0 v10 = v();
        m mVar = vVar4.f22732p;
        m mVar2 = m.f22768e;
        if (!k.a(mVar, m.f(v10))) {
            if (vVar4.f22723g.isEmpty()) {
                vVar4.f22732p = m.f(v10);
            } else {
                throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
            }
        }
        v vVar5 = this.f2752n0;
        k.c(vVar5);
        e0 e0Var = vVar5.f22738v;
        Context h03 = h0();
        a0 p10 = p();
        k.e(p10, "childFragmentManager");
        e0Var.a(new c(h03, p10));
        e0 e0Var2 = vVar5.f22738v;
        Context h04 = h0();
        a0 p11 = p();
        k.e(p11, "childFragmentManager");
        int i11 = this.F;
        if (i11 == 0 || i11 == -1) {
            i11 = R.id.nav_host_fragment_container;
        }
        e0Var2.a(new d(h04, p11, i11));
        if (bundle != null) {
            bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
            if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                this.f2756r0 = true;
                b bVar = new b(y());
                bVar.p(this);
                bVar.e();
            }
            this.f2755q0 = bundle.getInt("android-support-nav:fragment:graphId");
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            v vVar6 = this.f2752n0;
            k.c(vVar6);
            bundle2.setClassLoader(vVar6.f22717a.getClassLoader());
            vVar6.f22720d = bundle2.getBundle("android-support-nav:controller:navigatorState");
            vVar6.f22721e = bundle2.getParcelableArray("android-support-nav:controller:backStack");
            vVar6.f22729m.clear();
            int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
            if (!(intArray == null || stringArrayList == null)) {
                int length = intArray.length;
                int i12 = 0;
                int i13 = 0;
                while (i12 < length) {
                    vVar6.f22728l.put(Integer.valueOf(intArray[i12]), stringArrayList.get(i13));
                    i12++;
                    i13++;
                }
            }
            ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
            if (stringArrayList2 != null) {
                for (String str : stringArrayList2) {
                    Parcelable[] parcelableArray = bundle2.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                    if (parcelableArray != null) {
                        Map<String, ld.c<o1.i>> map = vVar6.f22729m;
                        k.e(str, "id");
                        ld.c cVar = new ld.c(parcelableArray.length);
                        int i14 = 0;
                        while (true) {
                            if (!(i14 < parcelableArray.length)) {
                                map.put(str, cVar);
                                break;
                            }
                            int i15 = i14 + 1;
                            try {
                                Parcelable parcelable = parcelableArray[i14];
                                if (parcelable != null) {
                                    cVar.f((o1.i) parcelable);
                                    i14 = i15;
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                                }
                            } catch (ArrayIndexOutOfBoundsException e10) {
                                throw new NoSuchElementException(e10.getMessage());
                            }
                        }
                    }
                }
            }
            vVar6.f22722f = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled");
        }
        if (this.f2755q0 != 0) {
            v vVar7 = this.f2752n0;
            k.c(vVar7);
            vVar7.u(((w) vVar7.C.getValue()).c(this.f2755q0), (Bundle) null);
        } else {
            Bundle bundle4 = this.f1796g;
            if (bundle4 != null) {
                i10 = bundle4.getInt("android-support-nav:fragment:graphId");
            }
            if (bundle4 != null) {
                bundle3 = bundle4.getBundle("android-support-nav:fragment:startDestinationArgs");
            }
            if (i10 != 0) {
                v vVar8 = this.f2752n0;
                k.c(vVar8);
                vVar8.u(((w) vVar8.C.getValue()).c(i10), bundle3);
            }
        }
        super.O(bundle);
    }

    public View P(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.f(layoutInflater, "inflater");
        Context context = layoutInflater.getContext();
        k.e(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int i10 = this.F;
        if (i10 == 0 || i10 == -1) {
            i10 = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(i10);
        return fragmentContainerView;
    }

    public void R() {
        this.O = true;
        View view = this.f2754p0;
        if (view != null && c0.a(view) == this.f2752n0) {
            c0.c(view, (o1.k) null);
        }
        this.f2754p0 = null;
    }

    public void U(Context context, AttributeSet attributeSet, Bundle bundle) {
        k.f(context, "context");
        super.U(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g0.f22692b);
        k.e(obtainStyledAttributes, "context.obtainStyledAttr…yleable.NavHost\n        )");
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f2755q0 = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, e.f24033c);
        k.e(obtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (obtainStyledAttributes2.getBoolean(0, false)) {
            this.f2756r0 = true;
        }
        obtainStyledAttributes2.recycle();
    }

    public void X(boolean z10) {
        v vVar = this.f2752n0;
        if (vVar != null) {
            vVar.f22737u = z10;
            vVar.x();
            return;
        }
        this.f2753o0 = Boolean.valueOf(z10);
    }

    public void a0(Bundle bundle) {
        Bundle bundle2;
        k.f(bundle, "outState");
        v vVar = this.f2752n0;
        k.c(vVar);
        ArrayList arrayList = new ArrayList();
        Bundle bundle3 = new Bundle();
        for (Map.Entry next : ld.t.e(vVar.f22738v.f22678a).entrySet()) {
            String str = (String) next.getKey();
            Bundle h10 = ((d0) next.getValue()).h();
            if (h10 != null) {
                arrayList.add(str);
                bundle3.putBundle(str, h10);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle2 = new Bundle();
            bundle3.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle2.putBundle("android-support-nav:controller:navigatorState", bundle3);
        } else {
            bundle2 = null;
        }
        if (!vVar.f22723g.isEmpty()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[vVar.f22723g.size()];
            Iterator<h> it = vVar.f22723g.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                parcelableArr[i10] = new o1.i(it.next());
                i10++;
            }
            bundle2.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (!vVar.f22728l.isEmpty()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            int[] iArr = new int[vVar.f22728l.size()];
            ArrayList arrayList2 = new ArrayList();
            int i11 = 0;
            for (Map.Entry next2 : vVar.f22728l.entrySet()) {
                iArr[i11] = ((Number) next2.getKey()).intValue();
                arrayList2.add((String) next2.getValue());
                i11++;
            }
            bundle2.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle2.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        if (!vVar.f22729m.isEmpty()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            ArrayList arrayList3 = new ArrayList();
            for (Map.Entry next3 : vVar.f22729m.entrySet()) {
                String str2 = (String) next3.getKey();
                ld.c cVar = (ld.c) next3.getValue();
                arrayList3.add(str2);
                Parcelable[] parcelableArr2 = new Parcelable[cVar.size()];
                Iterator it2 = cVar.iterator();
                int i12 = 0;
                while (it2.hasNext()) {
                    Object next4 = it2.next();
                    int i13 = i12 + 1;
                    if (i12 >= 0) {
                        parcelableArr2[i12] = (o1.i) next4;
                        i12 = i13;
                    } else {
                        ld.h.e();
                        throw null;
                    }
                }
                bundle2.putParcelableArray(f.a("android-support-nav:controller:backStackStates:", str2), parcelableArr2);
            }
            bundle2.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (vVar.f22722f) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android-support-nav:controller:deepLinkHandled", vVar.f22722f);
        }
        if (bundle2 != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", bundle2);
        }
        if (this.f2756r0) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i14 = this.f2755q0;
        if (i14 != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i14);
        }
    }

    public void d0(View view, Bundle bundle) {
        k.f(view, "view");
        if (view instanceof ViewGroup) {
            view.setTag(R.id.nav_controller_view_tag, this.f2752n0);
            if (view.getParent() != null) {
                ViewParent parent = view.getParent();
                if (parent != null) {
                    View view2 = (View) parent;
                    this.f2754p0 = view2;
                    if (view2.getId() == this.F) {
                        View view3 = this.f2754p0;
                        k.c(view3);
                        view3.setTag(R.id.nav_controller_view_tag, this.f2752n0);
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            return;
        }
        throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
    }
}

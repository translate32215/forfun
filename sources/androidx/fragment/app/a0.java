package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.y0;
import androidx.appcompat.widget.z0;
import androidx.fragment.app.i0;
import androidx.fragment.app.p;
import androidx.lifecycle.o;
import androidx.lifecycle.v0;
import c0.r;
import com.startapp.startappsdk.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FragmentManager */
public abstract class a0 {
    public r0 A = new e(this);
    public androidx.activity.result.c<Intent> B;
    public androidx.activity.result.c<androidx.activity.result.g> C;
    public androidx.activity.result.c<String[]> D;
    public ArrayDeque<l> E = new ArrayDeque<>();
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public ArrayList<b> K;
    public ArrayList<Boolean> L;
    public ArrayList<p> M;
    public d0 N;
    public Runnable O = new f();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<n> f1577a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f1578b;

    /* renamed from: c  reason: collision with root package name */
    public final n2.g f1579c = new n2.g(2);

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<b> f1580d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<p> f1581e;

    /* renamed from: f  reason: collision with root package name */
    public final w f1582f = new w(this);

    /* renamed from: g  reason: collision with root package name */
    public OnBackPressedDispatcher f1583g;

    /* renamed from: h  reason: collision with root package name */
    public final androidx.activity.h f1584h = new b(false);

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f1585i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, e> f1586j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, Bundle> f1587k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    public final Map<String, Object> f1588l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<m> f1589m;

    /* renamed from: n  reason: collision with root package name */
    public final x f1590n = new x(this);

    /* renamed from: o  reason: collision with root package name */
    public final CopyOnWriteArrayList<e0> f1591o = new CopyOnWriteArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    public final n0.a<Configuration> f1592p = new y(this, 0);

    /* renamed from: q  reason: collision with root package name */
    public final n0.a<Integer> f1593q = new z(this, 0);

    /* renamed from: r  reason: collision with root package name */
    public final n0.a<c0.j> f1594r = new y(this, 1);

    /* renamed from: s  reason: collision with root package name */
    public final n0.a<r> f1595s = new z(this, 1);

    /* renamed from: t  reason: collision with root package name */
    public final o0.l f1596t = new c();

    /* renamed from: u  reason: collision with root package name */
    public int f1597u = -1;

    /* renamed from: v  reason: collision with root package name */
    public v<?> f1598v;

    /* renamed from: w  reason: collision with root package name */
    public s f1599w;

    /* renamed from: x  reason: collision with root package name */
    public p f1600x;

    /* renamed from: y  reason: collision with root package name */
    public p f1601y;

    /* renamed from: z  reason: collision with root package name */
    public u f1602z = new d();

    /* compiled from: FragmentManager */
    public class a implements androidx.activity.result.b<Map<String, Boolean>> {
        public a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void a(Object obj) {
            Map map = (Map) obj;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            l pollFirst = a0.this.E.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.f1611a;
            int i11 = pollFirst.f1612b;
            p f10 = a0.this.f1579c.f(str);
            if (f10 == null) {
                z0.a("Permission request result delivered for unknown Fragment ", str, "FragmentManager");
            } else {
                f10.Y(i11, strArr, iArr);
            }
        }
    }

    /* compiled from: FragmentManager */
    public class b extends androidx.activity.h {
        public b(boolean z10) {
            super(z10);
        }

        public void a() {
            a0 a0Var = a0.this;
            a0Var.A(true);
            if (a0Var.f1584h.f371a) {
                a0Var.W();
            } else {
                a0Var.f1583g.b();
            }
        }
    }

    /* compiled from: FragmentManager */
    public class c implements o0.l {
        public c() {
        }

        public boolean a(MenuItem menuItem) {
            return a0.this.p(menuItem);
        }

        public void b(Menu menu) {
            a0.this.q(menu);
        }

        public void c(Menu menu, MenuInflater menuInflater) {
            a0.this.k(menu, menuInflater);
        }

        public void d(Menu menu) {
            a0.this.t(menu);
        }
    }

    /* compiled from: FragmentManager */
    public class d extends u {
        public d() {
        }

        public p a(ClassLoader classLoader, String str) {
            v<?> vVar = a0.this.f1598v;
            Context context = vVar.f1874b;
            vVar.getClass();
            Object obj = p.f1783m0;
            try {
                return (p) u.c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (InstantiationException e10) {
                throw new p.e(q.b.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
            } catch (IllegalAccessException e11) {
                throw new p.e(q.b.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
            } catch (NoSuchMethodException e12) {
                throw new p.e(q.b.a("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
            } catch (InvocationTargetException e13) {
                throw new p.e(q.b.a("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
            }
        }
    }

    /* compiled from: FragmentManager */
    public class e implements r0 {
        public e(a0 a0Var) {
        }
    }

    /* compiled from: FragmentManager */
    public class f implements Runnable {
        public f() {
        }

        public void run() {
            a0.this.A(true);
        }
    }

    /* compiled from: FragmentManager */
    public class g implements e0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f1608a;

        public g(a0 a0Var, p pVar) {
            this.f1608a = pVar;
        }

        public void a(a0 a0Var, p pVar) {
            this.f1608a.getClass();
        }
    }

    /* compiled from: FragmentManager */
    public class h implements androidx.activity.result.b<androidx.activity.result.a> {
        public h() {
        }

        public void a(Object obj) {
            androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
            l pollFirst = a0.this.E.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f1611a;
            int i10 = pollFirst.f1612b;
            p f10 = a0.this.f1579c.f(str);
            if (f10 == null) {
                z0.a("Activity result delivered for unknown Fragment ", str, "FragmentManager");
            } else {
                f10.M(i10, aVar.f373a, aVar.f374b);
            }
        }
    }

    /* compiled from: FragmentManager */
    public class i implements androidx.activity.result.b<androidx.activity.result.a> {
        public i() {
        }

        public void a(Object obj) {
            androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
            l pollFirst = a0.this.E.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f1611a;
            int i10 = pollFirst.f1612b;
            p f10 = a0.this.f1579c.f(str);
            if (f10 == null) {
                z0.a("Intent Sender result delivered for unknown Fragment ", str, "FragmentManager");
            } else {
                f10.M(i10, aVar.f373a, aVar.f374b);
            }
        }
    }

    /* compiled from: FragmentManager */
    public interface j {
        String a();

        int getId();
    }

    /* compiled from: FragmentManager */
    public static class k extends d.a<androidx.activity.result.g, androidx.activity.result.a> {
        public Intent a(Context context, Object obj) {
            Bundle bundleExtra;
            androidx.activity.result.g gVar = (androidx.activity.result.g) obj;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = gVar.f389b;
            if (!(intent2 == null || (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    gVar = new androidx.activity.result.g(gVar.f388a, (Intent) null, gVar.f390c, gVar.f391d);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", gVar);
            if (a0.N(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        public Object c(int i10, Intent intent) {
            return new androidx.activity.result.a(i10, intent);
        }
    }

    /* compiled from: FragmentManager */
    public interface m {
        void a();
    }

    /* compiled from: FragmentManager */
    public interface n {
        boolean b(ArrayList<b> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* compiled from: FragmentManager */
    public class o implements n {

        /* renamed from: a  reason: collision with root package name */
        public final String f1613a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1614b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1615c;

        public o(String str, int i10, int i11) {
            this.f1613a = str;
            this.f1614b = i10;
            this.f1615c = i11;
        }

        public boolean b(ArrayList<b> arrayList, ArrayList<Boolean> arrayList2) {
            p pVar = a0.this.f1601y;
            if (pVar != null && this.f1614b < 0 && this.f1613a == null && pVar.p().W()) {
                return false;
            }
            return a0.this.Z(arrayList, arrayList2, this.f1613a, this.f1614b, this.f1615c);
        }
    }

    /* compiled from: FragmentManager */
    public class p implements n {

        /* renamed from: a  reason: collision with root package name */
        public final String f1617a;

        public p(String str) {
            this.f1617a = str;
        }

        public boolean b(ArrayList<b> arrayList, ArrayList<Boolean> arrayList2) {
            a0 a0Var = a0.this;
            e remove = a0Var.f1586j.remove(this.f1617a);
            boolean z10 = false;
            if (remove != null) {
                HashMap hashMap = new HashMap();
                Iterator<b> it = arrayList.iterator();
                while (it.hasNext()) {
                    b next = it.next();
                    if (next.f1624t) {
                        Iterator<i0.a> it2 = next.f1703a.iterator();
                        while (it2.hasNext()) {
                            p pVar = it2.next().f1720b;
                            if (pVar != null) {
                                hashMap.put(pVar.f1794f, pVar);
                            }
                        }
                    }
                }
                HashMap hashMap2 = new HashMap(remove.f1654a.size());
                for (String next2 : remove.f1654a) {
                    p pVar2 = (p) hashMap.get(next2);
                    if (pVar2 != null) {
                        hashMap2.put(pVar2.f1794f, pVar2);
                    } else {
                        g0 u10 = a0Var.f1579c.u(next2, (g0) null);
                        if (u10 != null) {
                            p a10 = u10.a(a0Var.J(), a0Var.f1598v.f1874b.getClassLoader());
                            hashMap2.put(a10.f1794f, a10);
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (d next3 : remove.f1655b) {
                    next3.getClass();
                    b bVar = new b(a0Var);
                    next3.a(bVar);
                    for (int i10 = 0; i10 < next3.f1634b.size(); i10++) {
                        String str = next3.f1634b.get(i10);
                        if (str != null) {
                            p pVar3 = (p) hashMap2.get(str);
                            if (pVar3 != null) {
                                bVar.f1703a.get(i10).f1720b = pVar3;
                            } else {
                                throw new IllegalStateException(c.a(android.support.v4.media.a.a("Restoring FragmentTransaction "), next3.f1638f, " failed due to missing saved state for Fragment (", str, ")"));
                            }
                        }
                    }
                    arrayList3.add(bVar);
                }
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    ((b) it3.next()).b(arrayList, arrayList2);
                    z10 = true;
                }
            }
            return z10;
        }
    }

    /* compiled from: FragmentManager */
    public class q implements n {

        /* renamed from: a  reason: collision with root package name */
        public final String f1619a;

        public q(String str) {
            this.f1619a = str;
        }

        public boolean b(ArrayList<b> arrayList, ArrayList<Boolean> arrayList2) {
            String str;
            int i10;
            a0 a0Var = a0.this;
            String str2 = this.f1619a;
            int E = a0Var.E(str2, -1, true);
            if (E < 0) {
                return false;
            }
            int i11 = E;
            while (i11 < a0Var.f1580d.size()) {
                b bVar = a0Var.f1580d.get(i11);
                if (bVar.f1718p) {
                    i11++;
                } else {
                    a0Var.l0(new IllegalArgumentException("saveBackStack(\"" + str2 + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + bVar + " that did not use setReorderingAllowed(true)."));
                    throw null;
                }
            }
            HashSet hashSet = new HashSet();
            int i12 = E;
            while (true) {
                int i13 = 2;
                if (i12 < a0Var.f1580d.size()) {
                    b bVar2 = a0Var.f1580d.get(i12);
                    HashSet hashSet2 = new HashSet();
                    HashSet hashSet3 = new HashSet();
                    Iterator<i0.a> it = bVar2.f1703a.iterator();
                    while (it.hasNext()) {
                        i0.a next = it.next();
                        p pVar = next.f1720b;
                        if (pVar != null) {
                            if (!next.f1721c || (i10 = next.f1719a) == 1 || i10 == i13 || i10 == 8) {
                                hashSet.add(pVar);
                                hashSet2.add(pVar);
                            }
                            int i14 = next.f1719a;
                            if (i14 == 1 || i14 == 2) {
                                hashSet3.add(pVar);
                            }
                            i13 = 2;
                        }
                    }
                    hashSet2.removeAll(hashSet3);
                    if (!hashSet2.isEmpty()) {
                        StringBuilder a10 = androidx.activity.result.d.a("saveBackStack(\"", str2, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                        if (hashSet2.size() == 1) {
                            StringBuilder a11 = android.support.v4.media.a.a(" ");
                            a11.append(hashSet2.iterator().next());
                            str = a11.toString();
                        } else {
                            str = "s " + hashSet2;
                        }
                        a10.append(str);
                        a10.append(" in ");
                        a10.append(bVar2);
                        a10.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                        a0Var.l0(new IllegalArgumentException(a10.toString()));
                        throw null;
                    }
                    i12++;
                } else {
                    ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                    while (!arrayDeque.isEmpty()) {
                        p pVar2 = (p) arrayDeque.removeFirst();
                        if (pVar2.K) {
                            StringBuilder a12 = androidx.activity.result.d.a("saveBackStack(\"", str2, "\") must not contain retained fragments. Found ");
                            a12.append(hashSet.contains(pVar2) ? "direct reference to retained " : "retained child ");
                            a12.append("fragment ");
                            a12.append(pVar2);
                            a0Var.l0(new IllegalArgumentException(a12.toString()));
                            throw null;
                        }
                        Iterator it2 = ((ArrayList) pVar2.D.f1579c.h()).iterator();
                        while (it2.hasNext()) {
                            p pVar3 = (p) it2.next();
                            if (pVar3 != null) {
                                arrayDeque.addLast(pVar3);
                            }
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = hashSet.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((p) it3.next()).f1794f);
                    }
                    ArrayList arrayList4 = new ArrayList(a0Var.f1580d.size() - E);
                    for (int i15 = E; i15 < a0Var.f1580d.size(); i15++) {
                        arrayList4.add((Object) null);
                    }
                    e eVar = new e(arrayList3, arrayList4);
                    for (int size = a0Var.f1580d.size() - 1; size >= E; size--) {
                        b remove = a0Var.f1580d.remove(size);
                        b bVar3 = new b(remove);
                        int size2 = bVar3.f1703a.size();
                        while (true) {
                            size2--;
                            if (size2 < 0) {
                                break;
                            }
                            i0.a aVar = bVar3.f1703a.get(size2);
                            if (aVar.f1721c) {
                                if (aVar.f1719a == 8) {
                                    aVar.f1721c = false;
                                    size2--;
                                    bVar3.f1703a.remove(size2);
                                } else {
                                    int i16 = aVar.f1720b.G;
                                    aVar.f1719a = 2;
                                    aVar.f1721c = false;
                                    for (int i17 = size2 - 1; i17 >= 0; i17--) {
                                        i0.a aVar2 = bVar3.f1703a.get(i17);
                                        if (aVar2.f1721c && aVar2.f1720b.G == i16) {
                                            bVar3.f1703a.remove(i17);
                                            size2--;
                                        }
                                    }
                                }
                            }
                        }
                        arrayList4.set(size - E, new d(bVar3));
                        remove.f1624t = true;
                        arrayList.add(remove);
                        arrayList2.add(Boolean.TRUE);
                    }
                    a0Var.f1586j.put(str2, eVar);
                    return true;
                }
            }
        }
    }

    public static boolean N(int i10) {
        return Log.isLoggable("FragmentManager", i10);
    }

    /* JADX INFO: finally extract failed */
    public boolean A(boolean z10) {
        boolean z11;
        z(z10);
        boolean z12 = false;
        while (true) {
            ArrayList<b> arrayList = this.K;
            ArrayList<Boolean> arrayList2 = this.L;
            synchronized (this.f1577a) {
                if (this.f1577a.isEmpty()) {
                    z11 = false;
                } else {
                    try {
                        int size = this.f1577a.size();
                        z11 = false;
                        for (int i10 = 0; i10 < size; i10++) {
                            z11 |= this.f1577a.get(i10).b(arrayList, arrayList2);
                        }
                    } finally {
                        this.f1577a.clear();
                        this.f1598v.f1875c.removeCallbacks(this.O);
                    }
                }
            }
            if (z11) {
                this.f1578b = true;
                try {
                    b0(this.K, this.L);
                    d();
                    z12 = true;
                } catch (Throwable th) {
                    d();
                    throw th;
                }
            } else {
                m0();
                v();
                this.f1579c.c();
                return z12;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void B(n nVar, boolean z10) {
        if (!z10 || (this.f1598v != null && !this.I)) {
            z(z10);
            ((b) nVar).b(this.K, this.L);
            this.f1578b = true;
            try {
                b0(this.K, this.L);
                d();
                m0();
                v();
                this.f1579c.c();
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0151, code lost:
        r6 = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C(java.util.ArrayList<androidx.fragment.app.b> r18, java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            java.lang.Object r5 = r1.get(r3)
            androidx.fragment.app.b r5 = (androidx.fragment.app.b) r5
            boolean r5 = r5.f1718p
            java.util.ArrayList<androidx.fragment.app.p> r6 = r0.M
            if (r6 != 0) goto L_0x001e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0.M = r6
            goto L_0x0021
        L_0x001e:
            r6.clear()
        L_0x0021:
            java.util.ArrayList<androidx.fragment.app.p> r6 = r0.M
            n2.g r7 = r0.f1579c
            java.util.List r7 = r7.j()
            r6.addAll(r7)
            androidx.fragment.app.p r6 = r0.f1601y
            r7 = 0
            r8 = r3
        L_0x0030:
            r9 = 1
            if (r8 >= r4) goto L_0x017a
            java.lang.Object r10 = r1.get(r8)
            androidx.fragment.app.b r10 = (androidx.fragment.app.b) r10
            java.lang.Object r11 = r2.get(r8)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r12 = 3
            if (r11 != 0) goto L_0x0129
            java.util.ArrayList<androidx.fragment.app.p> r11 = r0.M
            r13 = 0
        L_0x0049:
            java.util.ArrayList<androidx.fragment.app.i0$a> r14 = r10.f1703a
            int r14 = r14.size()
            if (r13 >= r14) goto L_0x0162
            java.util.ArrayList<androidx.fragment.app.i0$a> r14 = r10.f1703a
            java.lang.Object r14 = r14.get(r13)
            androidx.fragment.app.i0$a r14 = (androidx.fragment.app.i0.a) r14
            int r15 = r14.f1719a
            if (r15 == r9) goto L_0x0116
            r9 = 2
            r3 = 9
            if (r15 == r9) goto L_0x009c
            if (r15 == r12) goto L_0x0083
            r9 = 6
            if (r15 == r9) goto L_0x0083
            r9 = 7
            if (r15 == r9) goto L_0x0116
            r9 = 8
            if (r15 == r9) goto L_0x0070
            goto L_0x010b
        L_0x0070:
            java.util.ArrayList<androidx.fragment.app.i0$a> r9 = r10.f1703a
            androidx.fragment.app.i0$a r12 = new androidx.fragment.app.i0$a
            r15 = 1
            r12.<init>((int) r3, (androidx.fragment.app.p) r6, (boolean) r15)
            r9.add(r13, r12)
            r14.f1721c = r15
            int r13 = r13 + 1
            androidx.fragment.app.p r6 = r14.f1720b
            goto L_0x010b
        L_0x0083:
            androidx.fragment.app.p r9 = r14.f1720b
            r11.remove(r9)
            androidx.fragment.app.p r9 = r14.f1720b
            if (r9 != r6) goto L_0x010b
            java.util.ArrayList<androidx.fragment.app.i0$a> r6 = r10.f1703a
            androidx.fragment.app.i0$a r12 = new androidx.fragment.app.i0$a
            r12.<init>(r3, r9)
            r6.add(r13, r12)
            int r13 = r13 + 1
            r3 = 1
            r6 = 0
            goto L_0x011c
        L_0x009c:
            androidx.fragment.app.p r3 = r14.f1720b
            int r9 = r3.G
            int r12 = r11.size()
            int r12 = r12 + -1
            r15 = 0
        L_0x00a7:
            if (r12 < 0) goto L_0x0102
            java.lang.Object r16 = r11.get(r12)
            r2 = r16
            androidx.fragment.app.p r2 = (androidx.fragment.app.p) r2
            int r1 = r2.G
            if (r1 != r9) goto L_0x00f5
            if (r2 != r3) goto L_0x00bc
            r1 = 1
            r16 = r9
            r15 = 1
            goto L_0x00f7
        L_0x00bc:
            if (r2 != r6) goto L_0x00d1
            java.util.ArrayList<androidx.fragment.app.i0$a> r1 = r10.f1703a
            androidx.fragment.app.i0$a r6 = new androidx.fragment.app.i0$a
            r16 = r9
            r9 = 1
            r4 = 9
            r6.<init>((int) r4, (androidx.fragment.app.p) r2, (boolean) r9)
            r1.add(r13, r6)
            int r13 = r13 + 1
            r6 = 0
            goto L_0x00d4
        L_0x00d1:
            r16 = r9
            r9 = 1
        L_0x00d4:
            androidx.fragment.app.i0$a r1 = new androidx.fragment.app.i0$a
            r4 = 3
            r1.<init>((int) r4, (androidx.fragment.app.p) r2, (boolean) r9)
            int r4 = r14.f1722d
            r1.f1722d = r4
            int r4 = r14.f1724f
            r1.f1724f = r4
            int r4 = r14.f1723e
            r1.f1723e = r4
            int r4 = r14.f1725g
            r1.f1725g = r4
            java.util.ArrayList<androidx.fragment.app.i0$a> r4 = r10.f1703a
            r4.add(r13, r1)
            r11.remove(r2)
            int r13 = r13 + 1
            goto L_0x00f7
        L_0x00f5:
            r16 = r9
        L_0x00f7:
            int r12 = r12 + -1
            r1 = r18
            r2 = r19
            r4 = r21
            r9 = r16
            goto L_0x00a7
        L_0x0102:
            if (r15 == 0) goto L_0x010d
            java.util.ArrayList<androidx.fragment.app.i0$a> r1 = r10.f1703a
            r1.remove(r13)
            int r13 = r13 + -1
        L_0x010b:
            r3 = 1
            goto L_0x011c
        L_0x010d:
            r1 = 1
            r14.f1719a = r1
            r14.f1721c = r1
            r11.add(r3)
            goto L_0x010b
        L_0x0116:
            r3 = 1
            androidx.fragment.app.p r1 = r14.f1720b
            r11.add(r1)
        L_0x011c:
            int r13 = r13 + r3
            r9 = 1
            r12 = 3
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            goto L_0x0049
        L_0x0129:
            r1 = 1
            java.util.ArrayList<androidx.fragment.app.p> r2 = r0.M
            java.util.ArrayList<androidx.fragment.app.i0$a> r3 = r10.f1703a
            int r3 = r3.size()
            int r3 = r3 - r1
        L_0x0133:
            if (r3 < 0) goto L_0x0162
            java.util.ArrayList<androidx.fragment.app.i0$a> r4 = r10.f1703a
            java.lang.Object r4 = r4.get(r3)
            androidx.fragment.app.i0$a r4 = (androidx.fragment.app.i0.a) r4
            int r9 = r4.f1719a
            if (r9 == r1) goto L_0x0159
            r1 = 3
            if (r9 == r1) goto L_0x0153
            switch(r9) {
                case 6: goto L_0x0153;
                case 7: goto L_0x0159;
                case 8: goto L_0x0150;
                case 9: goto L_0x014d;
                case 10: goto L_0x0148;
                default: goto L_0x0147;
            }
        L_0x0147:
            goto L_0x015e
        L_0x0148:
            androidx.lifecycle.o$c r1 = r4.f1726h
            r4.f1727i = r1
            goto L_0x015e
        L_0x014d:
            androidx.fragment.app.p r1 = r4.f1720b
            goto L_0x0151
        L_0x0150:
            r1 = 0
        L_0x0151:
            r6 = r1
            goto L_0x015e
        L_0x0153:
            androidx.fragment.app.p r1 = r4.f1720b
            r2.add(r1)
            goto L_0x015e
        L_0x0159:
            androidx.fragment.app.p r1 = r4.f1720b
            r2.remove(r1)
        L_0x015e:
            int r3 = r3 + -1
            r1 = 1
            goto L_0x0133
        L_0x0162:
            if (r7 != 0) goto L_0x016c
            boolean r1 = r10.f1709g
            if (r1 == 0) goto L_0x0169
            goto L_0x016c
        L_0x0169:
            r1 = 0
            r7 = 0
            goto L_0x016e
        L_0x016c:
            r1 = 1
            r7 = 1
        L_0x016e:
            int r8 = r8 + 1
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            goto L_0x0030
        L_0x017a:
            java.util.ArrayList<androidx.fragment.app.p> r1 = r0.M
            r1.clear()
            if (r5 != 0) goto L_0x01bb
            int r1 = r0.f1597u
            r2 = 1
            if (r1 < r2) goto L_0x01bb
            r2 = r20
            r1 = r21
        L_0x018a:
            r3 = r18
            if (r2 >= r1) goto L_0x01bf
            java.lang.Object r4 = r3.get(r2)
            androidx.fragment.app.b r4 = (androidx.fragment.app.b) r4
            java.util.ArrayList<androidx.fragment.app.i0$a> r4 = r4.f1703a
            java.util.Iterator r4 = r4.iterator()
        L_0x019a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01b8
            java.lang.Object r5 = r4.next()
            androidx.fragment.app.i0$a r5 = (androidx.fragment.app.i0.a) r5
            androidx.fragment.app.p r5 = r5.f1720b
            if (r5 == 0) goto L_0x019a
            androidx.fragment.app.a0 r6 = r5.B
            if (r6 == 0) goto L_0x019a
            androidx.fragment.app.h0 r5 = r0.f(r5)
            n2.g r6 = r0.f1579c
            r6.l(r5)
            goto L_0x019a
        L_0x01b8:
            int r2 = r2 + 1
            goto L_0x018a
        L_0x01bb:
            r3 = r18
            r1 = r21
        L_0x01bf:
            r2 = r20
        L_0x01c1:
            if (r2 >= r1) goto L_0x03d1
            java.lang.Object r4 = r3.get(r2)
            androidx.fragment.app.b r4 = (androidx.fragment.app.b) r4
            r5 = r19
            java.lang.Object r6 = r5.get(r2)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.String r8 = "Unknown cmd: "
            if (r6 == 0) goto L_0x02e4
            r6 = -1
            r4.j(r6)
            java.util.ArrayList<androidx.fragment.app.i0$a> r6 = r4.f1703a
            int r6 = r6.size()
            r9 = 1
            int r6 = r6 - r9
        L_0x01e5:
            if (r6 < 0) goto L_0x03cd
            java.util.ArrayList<androidx.fragment.app.i0$a> r10 = r4.f1703a
            java.lang.Object r10 = r10.get(r6)
            androidx.fragment.app.i0$a r10 = (androidx.fragment.app.i0.a) r10
            androidx.fragment.app.p r11 = r10.f1720b
            if (r11 == 0) goto L_0x0238
            boolean r12 = r4.f1624t
            r11.f1809v = r12
            r11.o0(r9)
            int r9 = r4.f1708f
            r12 = 4097(0x1001, float:5.741E-42)
            r13 = 4099(0x1003, float:5.744E-42)
            r14 = 8197(0x2005, float:1.1486E-41)
            r15 = 8194(0x2002, float:1.1482E-41)
            if (r9 == r12) goto L_0x021b
            if (r9 == r15) goto L_0x021d
            if (r9 == r14) goto L_0x0218
            if (r9 == r13) goto L_0x0215
            r12 = 4100(0x1004, float:5.745E-42)
            if (r9 == r12) goto L_0x0212
            r12 = 0
            goto L_0x021d
        L_0x0212:
            r12 = 8197(0x2005, float:1.1486E-41)
            goto L_0x021d
        L_0x0215:
            r12 = 4099(0x1003, float:5.744E-42)
            goto L_0x021d
        L_0x0218:
            r12 = 4100(0x1004, float:5.745E-42)
            goto L_0x021d
        L_0x021b:
            r12 = 8194(0x2002, float:1.1482E-41)
        L_0x021d:
            androidx.fragment.app.p$d r9 = r11.Z
            if (r9 != 0) goto L_0x0224
            if (r12 != 0) goto L_0x0224
            goto L_0x022b
        L_0x0224:
            r11.n()
            androidx.fragment.app.p$d r9 = r11.Z
            r9.f1821f = r12
        L_0x022b:
            java.util.ArrayList<java.lang.String> r9 = r4.f1717o
            java.util.ArrayList<java.lang.String> r12 = r4.f1716n
            r11.n()
            androidx.fragment.app.p$d r13 = r11.Z
            r13.f1822g = r9
            r13.f1823h = r12
        L_0x0238:
            int r9 = r10.f1719a
            switch(r9) {
                case 1: goto L_0x02c9;
                case 2: goto L_0x023d;
                case 3: goto L_0x02b8;
                case 4: goto L_0x02a7;
                case 5: goto L_0x0290;
                case 6: goto L_0x027f;
                case 7: goto L_0x0268;
                case 8: goto L_0x0260;
                case 9: goto L_0x0259;
                case 10: goto L_0x0250;
                default: goto L_0x023d;
            }
        L_0x023d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = android.support.v4.media.a.a(r8)
            int r3 = r10.f1719a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0250:
            androidx.fragment.app.a0 r9 = r4.f1621q
            androidx.lifecycle.o$c r10 = r10.f1726h
            r9.g0(r11, r10)
            goto L_0x02df
        L_0x0259:
            androidx.fragment.app.a0 r9 = r4.f1621q
            r9.h0(r11)
            goto L_0x02df
        L_0x0260:
            androidx.fragment.app.a0 r9 = r4.f1621q
            r10 = 0
            r9.h0(r10)
            goto L_0x02df
        L_0x0268:
            int r9 = r10.f1722d
            int r12 = r10.f1723e
            int r13 = r10.f1724f
            int r10 = r10.f1725g
            r11.k0(r9, r12, r13, r10)
            androidx.fragment.app.a0 r9 = r4.f1621q
            r10 = 1
            r9.f0(r11, r10)
            androidx.fragment.app.a0 r9 = r4.f1621q
            r9.g(r11)
            goto L_0x02df
        L_0x027f:
            int r9 = r10.f1722d
            int r12 = r10.f1723e
            int r13 = r10.f1724f
            int r10 = r10.f1725g
            r11.k0(r9, r12, r13, r10)
            androidx.fragment.app.a0 r9 = r4.f1621q
            r9.c(r11)
            goto L_0x02df
        L_0x0290:
            int r9 = r10.f1722d
            int r12 = r10.f1723e
            int r13 = r10.f1724f
            int r10 = r10.f1725g
            r11.k0(r9, r12, r13, r10)
            androidx.fragment.app.a0 r9 = r4.f1621q
            r10 = 1
            r9.f0(r11, r10)
            androidx.fragment.app.a0 r9 = r4.f1621q
            r9.M(r11)
            goto L_0x02df
        L_0x02a7:
            int r9 = r10.f1722d
            int r12 = r10.f1723e
            int r13 = r10.f1724f
            int r10 = r10.f1725g
            r11.k0(r9, r12, r13, r10)
            androidx.fragment.app.a0 r9 = r4.f1621q
            r9.j0(r11)
            goto L_0x02df
        L_0x02b8:
            int r9 = r10.f1722d
            int r12 = r10.f1723e
            int r13 = r10.f1724f
            int r10 = r10.f1725g
            r11.k0(r9, r12, r13, r10)
            androidx.fragment.app.a0 r9 = r4.f1621q
            r9.a(r11)
            goto L_0x02df
        L_0x02c9:
            int r9 = r10.f1722d
            int r12 = r10.f1723e
            int r13 = r10.f1724f
            int r10 = r10.f1725g
            r11.k0(r9, r12, r13, r10)
            androidx.fragment.app.a0 r9 = r4.f1621q
            r10 = 1
            r9.f0(r11, r10)
            androidx.fragment.app.a0 r9 = r4.f1621q
            r9.a0(r11)
        L_0x02df:
            int r6 = r6 + -1
            r9 = 1
            goto L_0x01e5
        L_0x02e4:
            r6 = 1
            r4.j(r6)
            java.util.ArrayList<androidx.fragment.app.i0$a> r6 = r4.f1703a
            int r6 = r6.size()
            r9 = 0
        L_0x02ef:
            if (r9 >= r6) goto L_0x03cd
            java.util.ArrayList<androidx.fragment.app.i0$a> r10 = r4.f1703a
            java.lang.Object r10 = r10.get(r9)
            androidx.fragment.app.i0$a r10 = (androidx.fragment.app.i0.a) r10
            androidx.fragment.app.p r11 = r10.f1720b
            if (r11 == 0) goto L_0x0322
            boolean r12 = r4.f1624t
            r11.f1809v = r12
            r12 = 0
            r11.o0(r12)
            int r12 = r4.f1708f
            androidx.fragment.app.p$d r13 = r11.Z
            if (r13 != 0) goto L_0x030e
            if (r12 != 0) goto L_0x030e
            goto L_0x0315
        L_0x030e:
            r11.n()
            androidx.fragment.app.p$d r13 = r11.Z
            r13.f1821f = r12
        L_0x0315:
            java.util.ArrayList<java.lang.String> r12 = r4.f1716n
            java.util.ArrayList<java.lang.String> r13 = r4.f1717o
            r11.n()
            androidx.fragment.app.p$d r14 = r11.Z
            r14.f1822g = r12
            r14.f1823h = r13
        L_0x0322:
            int r12 = r10.f1719a
            switch(r12) {
                case 1: goto L_0x03b3;
                case 2: goto L_0x0327;
                case 3: goto L_0x03a2;
                case 4: goto L_0x0391;
                case 5: goto L_0x037a;
                case 6: goto L_0x0369;
                case 7: goto L_0x0352;
                case 8: goto L_0x034b;
                case 9: goto L_0x0343;
                case 10: goto L_0x033a;
                default: goto L_0x0327;
            }
        L_0x0327:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = android.support.v4.media.a.a(r8)
            int r3 = r10.f1719a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x033a:
            androidx.fragment.app.a0 r12 = r4.f1621q
            androidx.lifecycle.o$c r10 = r10.f1727i
            r12.g0(r11, r10)
            goto L_0x03c9
        L_0x0343:
            androidx.fragment.app.a0 r10 = r4.f1621q
            r11 = 0
            r10.h0(r11)
            goto L_0x03c9
        L_0x034b:
            androidx.fragment.app.a0 r10 = r4.f1621q
            r10.h0(r11)
            goto L_0x03c9
        L_0x0352:
            int r12 = r10.f1722d
            int r13 = r10.f1723e
            int r14 = r10.f1724f
            int r10 = r10.f1725g
            r11.k0(r12, r13, r14, r10)
            androidx.fragment.app.a0 r10 = r4.f1621q
            r12 = 0
            r10.f0(r11, r12)
            androidx.fragment.app.a0 r10 = r4.f1621q
            r10.c(r11)
            goto L_0x03c9
        L_0x0369:
            int r12 = r10.f1722d
            int r13 = r10.f1723e
            int r14 = r10.f1724f
            int r10 = r10.f1725g
            r11.k0(r12, r13, r14, r10)
            androidx.fragment.app.a0 r10 = r4.f1621q
            r10.g(r11)
            goto L_0x03c9
        L_0x037a:
            int r12 = r10.f1722d
            int r13 = r10.f1723e
            int r14 = r10.f1724f
            int r10 = r10.f1725g
            r11.k0(r12, r13, r14, r10)
            androidx.fragment.app.a0 r10 = r4.f1621q
            r12 = 0
            r10.f0(r11, r12)
            androidx.fragment.app.a0 r10 = r4.f1621q
            r10.j0(r11)
            goto L_0x03c9
        L_0x0391:
            int r12 = r10.f1722d
            int r13 = r10.f1723e
            int r14 = r10.f1724f
            int r10 = r10.f1725g
            r11.k0(r12, r13, r14, r10)
            androidx.fragment.app.a0 r10 = r4.f1621q
            r10.M(r11)
            goto L_0x03c9
        L_0x03a2:
            int r12 = r10.f1722d
            int r13 = r10.f1723e
            int r14 = r10.f1724f
            int r10 = r10.f1725g
            r11.k0(r12, r13, r14, r10)
            androidx.fragment.app.a0 r10 = r4.f1621q
            r10.a0(r11)
            goto L_0x03c9
        L_0x03b3:
            int r12 = r10.f1722d
            int r13 = r10.f1723e
            int r14 = r10.f1724f
            int r10 = r10.f1725g
            r11.k0(r12, r13, r14, r10)
            androidx.fragment.app.a0 r10 = r4.f1621q
            r12 = 0
            r10.f0(r11, r12)
            androidx.fragment.app.a0 r10 = r4.f1621q
            r10.a(r11)
        L_0x03c9:
            int r9 = r9 + 1
            goto L_0x02ef
        L_0x03cd:
            int r2 = r2 + 1
            goto L_0x01c1
        L_0x03d1:
            r5 = r19
            int r2 = r1 + -1
            java.lang.Object r2 = r5.get(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r4 = r20
        L_0x03e1:
            if (r4 >= r1) goto L_0x042c
            java.lang.Object r6 = r3.get(r4)
            androidx.fragment.app.b r6 = (androidx.fragment.app.b) r6
            if (r2 == 0) goto L_0x040b
            java.util.ArrayList<androidx.fragment.app.i0$a> r8 = r6.f1703a
            int r8 = r8.size()
            int r8 = r8 + -1
        L_0x03f3:
            if (r8 < 0) goto L_0x0429
            java.util.ArrayList<androidx.fragment.app.i0$a> r9 = r6.f1703a
            java.lang.Object r9 = r9.get(r8)
            androidx.fragment.app.i0$a r9 = (androidx.fragment.app.i0.a) r9
            androidx.fragment.app.p r9 = r9.f1720b
            if (r9 == 0) goto L_0x0408
            androidx.fragment.app.h0 r9 = r0.f(r9)
            r9.k()
        L_0x0408:
            int r8 = r8 + -1
            goto L_0x03f3
        L_0x040b:
            java.util.ArrayList<androidx.fragment.app.i0$a> r6 = r6.f1703a
            java.util.Iterator r6 = r6.iterator()
        L_0x0411:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0429
            java.lang.Object r8 = r6.next()
            androidx.fragment.app.i0$a r8 = (androidx.fragment.app.i0.a) r8
            androidx.fragment.app.p r8 = r8.f1720b
            if (r8 == 0) goto L_0x0411
            androidx.fragment.app.h0 r8 = r0.f(r8)
            r8.k()
            goto L_0x0411
        L_0x0429:
            int r4 = r4 + 1
            goto L_0x03e1
        L_0x042c:
            int r4 = r0.f1597u
            r6 = 1
            r0.T(r4, r6)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r6 = r20
        L_0x0439:
            if (r6 >= r1) goto L_0x046a
            java.lang.Object r8 = r3.get(r6)
            androidx.fragment.app.b r8 = (androidx.fragment.app.b) r8
            java.util.ArrayList<androidx.fragment.app.i0$a> r8 = r8.f1703a
            java.util.Iterator r8 = r8.iterator()
        L_0x0447:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0467
            java.lang.Object r9 = r8.next()
            androidx.fragment.app.i0$a r9 = (androidx.fragment.app.i0.a) r9
            androidx.fragment.app.p r9 = r9.f1720b
            if (r9 == 0) goto L_0x0447
            android.view.ViewGroup r9 = r9.P
            if (r9 == 0) goto L_0x0447
            androidx.fragment.app.r0 r10 = r17.L()
            androidx.fragment.app.q0 r9 = androidx.fragment.app.q0.g(r9, r10)
            r4.add(r9)
            goto L_0x0447
        L_0x0467:
            int r6 = r6 + 1
            goto L_0x0439
        L_0x046a:
            java.util.Iterator r4 = r4.iterator()
        L_0x046e:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0483
            java.lang.Object r6 = r4.next()
            androidx.fragment.app.q0 r6 = (androidx.fragment.app.q0) r6
            r6.f1840d = r2
            r6.h()
            r6.c()
            goto L_0x046e
        L_0x0483:
            r2 = r20
        L_0x0485:
            if (r2 >= r1) goto L_0x04a6
            java.lang.Object r4 = r3.get(r2)
            androidx.fragment.app.b r4 = (androidx.fragment.app.b) r4
            java.lang.Object r6 = r5.get(r2)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x04a0
            int r6 = r4.f1623s
            if (r6 < 0) goto L_0x04a0
            r6 = -1
            r4.f1623s = r6
        L_0x04a0:
            r4.getClass()
            int r2 = r2 + 1
            goto L_0x0485
        L_0x04a6:
            if (r7 == 0) goto L_0x04c3
            java.util.ArrayList<androidx.fragment.app.a0$m> r1 = r0.f1589m
            if (r1 == 0) goto L_0x04c3
            r1 = 0
        L_0x04ad:
            java.util.ArrayList<androidx.fragment.app.a0$m> r2 = r0.f1589m
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x04c3
            java.util.ArrayList<androidx.fragment.app.a0$m> r2 = r0.f1589m
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.a0$m r2 = (androidx.fragment.app.a0.m) r2
            r2.a()
            int r1 = r1 + 1
            goto L_0x04ad
        L_0x04c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a0.C(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public p D(String str) {
        return this.f1579c.e(str);
    }

    public final int E(String str, int i10, boolean z10) {
        ArrayList<b> arrayList = this.f1580d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str != null || i10 >= 0) {
            int size = this.f1580d.size() - 1;
            while (size >= 0) {
                b bVar = this.f1580d.get(size);
                if ((str != null && str.equals(bVar.f1711i)) || (i10 >= 0 && i10 == bVar.f1623s)) {
                    break;
                }
                size--;
            }
            if (size < 0) {
                return size;
            }
            if (z10) {
                while (size > 0) {
                    b bVar2 = this.f1580d.get(size - 1);
                    if ((str == null || !str.equals(bVar2.f1711i)) && (i10 < 0 || i10 != bVar2.f1623s)) {
                        return size;
                    }
                    size--;
                }
                return size;
            } else if (size == this.f1580d.size() - 1) {
                return -1;
            } else {
                return size + 1;
            }
        } else if (z10) {
            return 0;
        } else {
            return this.f1580d.size() - 1;
        }
    }

    public p F(int i10) {
        n2.g gVar = this.f1579c;
        int size = ((ArrayList) gVar.f21850a).size();
        while (true) {
            size--;
            if (size >= 0) {
                p pVar = (p) ((ArrayList) gVar.f21850a).get(size);
                if (pVar != null && pVar.F == i10) {
                    return pVar;
                }
            } else {
                for (h0 h0Var : ((HashMap) gVar.f21851b).values()) {
                    if (h0Var != null) {
                        p pVar2 = h0Var.f1694c;
                        if (pVar2.F == i10) {
                            return pVar2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public p G(String str) {
        n2.g gVar = this.f1579c;
        gVar.getClass();
        if (str != null) {
            int size = ((ArrayList) gVar.f21850a).size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                p pVar = (p) ((ArrayList) gVar.f21850a).get(size);
                if (pVar != null && str.equals(pVar.H)) {
                    return pVar;
                }
            }
        }
        if (str != null) {
            for (h0 h0Var : ((HashMap) gVar.f21851b).values()) {
                if (h0Var != null) {
                    p pVar2 = h0Var.f1694c;
                    if (str.equals(pVar2.H)) {
                        return pVar2;
                    }
                }
            }
        }
        return null;
    }

    public int H() {
        ArrayList<b> arrayList = this.f1580d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final ViewGroup I(p pVar) {
        ViewGroup viewGroup = pVar.P;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (pVar.G > 0 && this.f1599w.i()) {
            View b10 = this.f1599w.b(pVar.G);
            if (b10 instanceof ViewGroup) {
                return (ViewGroup) b10;
            }
        }
        return null;
    }

    public u J() {
        p pVar = this.f1600x;
        if (pVar != null) {
            return pVar.B.J();
        }
        return this.f1602z;
    }

    public List<p> K() {
        return this.f1579c.j();
    }

    public r0 L() {
        p pVar = this.f1600x;
        if (pVar != null) {
            return pVar.B.L();
        }
        return this.A;
    }

    public void M(p pVar) {
        if (N(2)) {
            Log.v("FragmentManager", "hide: " + pVar);
        }
        if (!pVar.I) {
            pVar.I = true;
            pVar.f1785a0 = true ^ pVar.f1785a0;
            i0(pVar);
        }
    }

    public final boolean O(p pVar) {
        boolean z10;
        if (pVar.M && pVar.N) {
            return true;
        }
        a0 a0Var = pVar.D;
        Iterator it = ((ArrayList) a0Var.f1579c.h()).iterator();
        boolean z11 = false;
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            p pVar2 = (p) it.next();
            if (pVar2 != null) {
                z11 = a0Var.O(pVar2);
                continue;
            }
            if (z11) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            return true;
        }
        return false;
    }

    public final boolean P() {
        p pVar = this.f1600x;
        if (pVar == null) {
            return true;
        }
        if (!pVar.I() || !this.f1600x.y().P()) {
            return false;
        }
        return true;
    }

    public boolean Q(p pVar) {
        a0 a0Var;
        if (pVar == null) {
            return true;
        }
        if (!pVar.N || ((a0Var = pVar.B) != null && !a0Var.Q(pVar.E))) {
            return false;
        }
        return true;
    }

    public boolean R(p pVar) {
        if (pVar == null) {
            return true;
        }
        a0 a0Var = pVar.B;
        if (!pVar.equals(a0Var.f1601y) || !R(a0Var.f1600x)) {
            return false;
        }
        return true;
    }

    public boolean S() {
        return this.G || this.H;
    }

    public void T(int i10, boolean z10) {
        v<?> vVar;
        if (this.f1598v == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z10 || i10 != this.f1597u) {
            this.f1597u = i10;
            n2.g gVar = this.f1579c;
            Iterator it = ((ArrayList) gVar.f21850a).iterator();
            while (it.hasNext()) {
                h0 h0Var = (h0) ((HashMap) gVar.f21851b).get(((p) it.next()).f1794f);
                if (h0Var != null) {
                    h0Var.k();
                }
            }
            Iterator it2 = ((HashMap) gVar.f21851b).values().iterator();
            while (true) {
                boolean z11 = false;
                if (!it2.hasNext()) {
                    break;
                }
                h0 h0Var2 = (h0) it2.next();
                if (h0Var2 != null) {
                    h0Var2.k();
                    p pVar = h0Var2.f1694c;
                    if (pVar.f1808u && !pVar.K()) {
                        z11 = true;
                    }
                    if (z11) {
                        if (pVar.f1809v && !((HashMap) gVar.f21852c).containsKey(pVar.f1794f)) {
                            h0Var2.o();
                        }
                        gVar.n(h0Var2);
                    }
                }
            }
            k0();
            if (this.F && (vVar = this.f1598v) != null && this.f1597u == 7) {
                vVar.p();
                this.F = false;
            }
        }
    }

    public void U() {
        if (this.f1598v != null) {
            this.G = false;
            this.H = false;
            this.N.f1653i = false;
            for (p next : this.f1579c.j()) {
                if (next != null) {
                    next.D.U();
                }
            }
        }
    }

    public void V(h0 h0Var) {
        p pVar = h0Var.f1694c;
        if (!pVar.R) {
            return;
        }
        if (this.f1578b) {
            this.J = true;
            return;
        }
        pVar.R = false;
        h0Var.k();
    }

    public boolean W() {
        return Y((String) null, -1, 0);
    }

    public boolean X(int i10, int i11) {
        if (i10 >= 0) {
            return Y((String) null, i10, i11);
        }
        throw new IllegalArgumentException(d0.a("Bad id: ", i10));
    }

    public final boolean Y(String str, int i10, int i11) {
        A(false);
        z(true);
        p pVar = this.f1601y;
        if (pVar != null && i10 < 0 && pVar.p().W()) {
            return true;
        }
        boolean Z = Z(this.K, this.L, (String) null, i10, i11);
        if (Z) {
            this.f1578b = true;
            try {
                b0(this.K, this.L);
            } finally {
                d();
            }
        }
        m0();
        v();
        this.f1579c.c();
        return Z;
    }

    public boolean Z(ArrayList<b> arrayList, ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        int E2 = E(str, i10, (i11 & 1) != 0);
        if (E2 < 0) {
            return false;
        }
        for (int size = this.f1580d.size() - 1; size >= E2; size--) {
            arrayList.add(this.f1580d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public h0 a(p pVar) {
        String str = pVar.f1789c0;
        if (str != null) {
            c1.d.d(pVar, str);
        }
        if (N(2)) {
            Log.v("FragmentManager", "add: " + pVar);
        }
        h0 f10 = f(pVar);
        pVar.B = this;
        this.f1579c.l(f10);
        if (!pVar.J) {
            this.f1579c.a(pVar);
            pVar.f1808u = false;
            if (pVar.Q == null) {
                pVar.f1785a0 = false;
            }
            if (O(pVar)) {
                this.F = true;
            }
        }
        return f10;
    }

    public void a0(p pVar) {
        if (N(2)) {
            Log.v("FragmentManager", "remove: " + pVar + " nesting=" + pVar.A);
        }
        boolean z10 = !pVar.K();
        if (!pVar.J || z10) {
            this.f1579c.t(pVar);
            if (O(pVar)) {
                this.F = true;
            }
            pVar.f1808u = true;
            i0(pVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: androidx.activity.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: androidx.fragment.app.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: androidx.fragment.app.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v41, resolved type: androidx.fragment.app.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(androidx.fragment.app.v<?> r4, androidx.fragment.app.s r5, androidx.fragment.app.p r6) {
        /*
            r3 = this;
            androidx.fragment.app.v<?> r0 = r3.f1598v
            if (r0 != 0) goto L_0x016b
            r3.f1598v = r4
            r3.f1599w = r5
            r3.f1600x = r6
            if (r6 == 0) goto L_0x0017
            androidx.fragment.app.a0$g r5 = new androidx.fragment.app.a0$g
            r5.<init>(r3, r6)
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.e0> r0 = r3.f1591o
            r0.add(r5)
            goto L_0x0023
        L_0x0017:
            boolean r5 = r4 instanceof androidx.fragment.app.e0
            if (r5 == 0) goto L_0x0023
            r5 = r4
            androidx.fragment.app.e0 r5 = (androidx.fragment.app.e0) r5
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.e0> r0 = r3.f1591o
            r0.add(r5)
        L_0x0023:
            androidx.fragment.app.p r5 = r3.f1600x
            if (r5 == 0) goto L_0x002a
            r3.m0()
        L_0x002a:
            boolean r5 = r4 instanceof androidx.activity.i
            if (r5 == 0) goto L_0x003f
            r5 = r4
            androidx.activity.i r5 = (androidx.activity.i) r5
            androidx.activity.OnBackPressedDispatcher r0 = r5.d()
            r3.f1583g = r0
            if (r6 == 0) goto L_0x003a
            r5 = r6
        L_0x003a:
            androidx.activity.h r1 = r3.f1584h
            r0.a(r5, r1)
        L_0x003f:
            if (r6 == 0) goto L_0x0062
            androidx.fragment.app.a0 r4 = r6.B
            androidx.fragment.app.d0 r4 = r4.N
            java.util.HashMap<java.lang.String, androidx.fragment.app.d0> r5 = r4.f1649e
            java.lang.String r0 = r6.f1794f
            java.lang.Object r5 = r5.get(r0)
            androidx.fragment.app.d0 r5 = (androidx.fragment.app.d0) r5
            if (r5 != 0) goto L_0x005f
            androidx.fragment.app.d0 r5 = new androidx.fragment.app.d0
            boolean r0 = r4.f1651g
            r5.<init>(r0)
            java.util.HashMap<java.lang.String, androidx.fragment.app.d0> r4 = r4.f1649e
            java.lang.String r0 = r6.f1794f
            r4.put(r0, r5)
        L_0x005f:
            r3.N = r5
            goto L_0x0092
        L_0x0062:
            boolean r5 = r4 instanceof androidx.lifecycle.v0
            if (r5 == 0) goto L_0x008a
            androidx.lifecycle.v0 r4 = (androidx.lifecycle.v0) r4
            androidx.lifecycle.u0 r4 = r4.v()
            androidx.lifecycle.s0 r5 = new androidx.lifecycle.s0
            androidx.lifecycle.s0$b r0 = androidx.fragment.app.d0.f1647j
            java.lang.String r1 = "store"
            ud.k.f(r4, r1)
            java.lang.String r1 = "factory"
            ud.k.f(r0, r1)
            k1.a$a r1 = k1.a.C0172a.f19874b
            r5.<init>(r4, r0, r1)
            java.lang.Class<androidx.fragment.app.d0> r4 = androidx.fragment.app.d0.class
            androidx.lifecycle.q0 r4 = r5.a(r4)
            androidx.fragment.app.d0 r4 = (androidx.fragment.app.d0) r4
            r3.N = r4
            goto L_0x0092
        L_0x008a:
            androidx.fragment.app.d0 r4 = new androidx.fragment.app.d0
            r5 = 0
            r4.<init>(r5)
            r3.N = r4
        L_0x0092:
            androidx.fragment.app.d0 r4 = r3.N
            boolean r5 = r3.S()
            r4.f1653i = r5
            n2.g r4 = r3.f1579c
            androidx.fragment.app.d0 r5 = r3.N
            r4.f21853d = r5
            androidx.fragment.app.v<?> r4 = r3.f1598v
            boolean r5 = r4 instanceof w1.c
            if (r5 == 0) goto L_0x00c1
            if (r6 != 0) goto L_0x00c1
            w1.c r4 = (w1.c) r4
            w1.a r4 = r4.e()
            androidx.activity.d r5 = new androidx.activity.d
            r5.<init>((androidx.fragment.app.a0) r3)
            java.lang.String r0 = "android:support:fragments"
            r4.d(r0, r5)
            android.os.Bundle r4 = r4.a(r0)
            if (r4 == 0) goto L_0x00c1
            r3.c0(r4)
        L_0x00c1:
            androidx.fragment.app.v<?> r4 = r3.f1598v
            boolean r5 = r4 instanceof androidx.activity.result.f
            if (r5 == 0) goto L_0x0127
            androidx.activity.result.f r4 = (androidx.activity.result.f) r4
            androidx.activity.result.e r4 = r4.q()
            if (r6 == 0) goto L_0x00dd
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = r6.f1794f
            java.lang.String r1 = ":"
            java.lang.String r5 = androidx.activity.e.a(r5, r0, r1)
            goto L_0x00df
        L_0x00dd:
            java.lang.String r5 = ""
        L_0x00df:
            java.lang.String r0 = "FragmentManager:"
            java.lang.String r5 = j.f.a(r0, r5)
            java.lang.String r0 = "StartActivityForResult"
            java.lang.String r0 = j.f.a(r5, r0)
            d.c r1 = new d.c
            r1.<init>()
            androidx.fragment.app.a0$h r2 = new androidx.fragment.app.a0$h
            r2.<init>()
            androidx.activity.result.c r0 = r4.c(r0, r1, r2)
            r3.B = r0
            java.lang.String r0 = "StartIntentSenderForResult"
            java.lang.String r0 = j.f.a(r5, r0)
            androidx.fragment.app.a0$k r1 = new androidx.fragment.app.a0$k
            r1.<init>()
            androidx.fragment.app.a0$i r2 = new androidx.fragment.app.a0$i
            r2.<init>()
            androidx.activity.result.c r0 = r4.c(r0, r1, r2)
            r3.C = r0
            java.lang.String r0 = "RequestPermissions"
            java.lang.String r5 = j.f.a(r5, r0)
            d.b r0 = new d.b
            r0.<init>()
            androidx.fragment.app.a0$a r1 = new androidx.fragment.app.a0$a
            r1.<init>()
            androidx.activity.result.c r4 = r4.c(r5, r0, r1)
            r3.D = r4
        L_0x0127:
            androidx.fragment.app.v<?> r4 = r3.f1598v
            boolean r5 = r4 instanceof d0.b
            if (r5 == 0) goto L_0x0134
            d0.b r4 = (d0.b) r4
            n0.a<android.content.res.Configuration> r5 = r3.f1592p
            r4.k(r5)
        L_0x0134:
            androidx.fragment.app.v<?> r4 = r3.f1598v
            boolean r5 = r4 instanceof d0.c
            if (r5 == 0) goto L_0x0141
            d0.c r4 = (d0.c) r4
            n0.a<java.lang.Integer> r5 = r3.f1593q
            r4.f(r5)
        L_0x0141:
            androidx.fragment.app.v<?> r4 = r3.f1598v
            boolean r5 = r4 instanceof c0.o
            if (r5 == 0) goto L_0x014e
            c0.o r4 = (c0.o) r4
            n0.a<c0.j> r5 = r3.f1594r
            r4.A(r5)
        L_0x014e:
            androidx.fragment.app.v<?> r4 = r3.f1598v
            boolean r5 = r4 instanceof c0.p
            if (r5 == 0) goto L_0x015b
            c0.p r4 = (c0.p) r4
            n0.a<c0.r> r5 = r3.f1595s
            r4.s(r5)
        L_0x015b:
            androidx.fragment.app.v<?> r4 = r3.f1598v
            boolean r5 = r4 instanceof o0.i
            if (r5 == 0) goto L_0x016a
            if (r6 != 0) goto L_0x016a
            o0.i r4 = (o0.i) r4
            o0.l r5 = r3.f1596t
            r4.g(r5)
        L_0x016a:
            return
        L_0x016b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Already attached"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a0.b(androidx.fragment.app.v, androidx.fragment.app.s, androidx.fragment.app.p):void");
    }

    public final void b0(ArrayList<b> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i10 < size) {
                    if (!arrayList.get(i10).f1718p) {
                        if (i11 != i10) {
                            C(arrayList, arrayList2, i11, i10);
                        }
                        i11 = i10 + 1;
                        if (arrayList2.get(i10).booleanValue()) {
                            while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f1718p) {
                                i11++;
                            }
                        }
                        C(arrayList, arrayList2, i10, i11);
                        i10 = i11 - 1;
                    }
                    i10++;
                }
                if (i11 != size) {
                    C(arrayList, arrayList2, i11, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    public void c(p pVar) {
        if (N(2)) {
            Log.v("FragmentManager", "attach: " + pVar);
        }
        if (pVar.J) {
            pVar.J = false;
            if (!pVar.f1807t) {
                this.f1579c.a(pVar);
                if (N(2)) {
                    Log.v("FragmentManager", "add from attach: " + pVar);
                }
                if (O(pVar)) {
                    this.F = true;
                }
            }
        }
    }

    public void c0(Parcelable parcelable) {
        int i10;
        h0 h0Var;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f1598v.f1874b.getClassLoader());
                this.f1587k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f1598v.f1874b.getClassLoader());
                arrayList.add((g0) bundle.getParcelable("state"));
            }
        }
        n2.g gVar = this.f1579c;
        ((HashMap) gVar.f21852c).clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g0 g0Var = (g0) it.next();
            ((HashMap) gVar.f21852c).put(g0Var.f1678b, g0Var);
        }
        c0 c0Var = (c0) bundle3.getParcelable("state");
        if (c0Var != null) {
            ((HashMap) this.f1579c.f21851b).clear();
            Iterator<String> it2 = c0Var.f1625a.iterator();
            while (it2.hasNext()) {
                g0 u10 = this.f1579c.u(it2.next(), (g0) null);
                if (u10 != null) {
                    d0 d0Var = this.N;
                    p pVar = d0Var.f1648d.get(u10.f1678b);
                    if (pVar != null) {
                        if (N(2)) {
                            Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + pVar);
                        }
                        h0Var = new h0(this.f1590n, this.f1579c, pVar, u10);
                    } else {
                        h0Var = new h0(this.f1590n, this.f1579c, this.f1598v.f1874b.getClassLoader(), J(), u10);
                    }
                    p pVar2 = h0Var.f1694c;
                    pVar2.B = this;
                    if (N(2)) {
                        StringBuilder a10 = android.support.v4.media.a.a("restoreSaveState: active (");
                        a10.append(pVar2.f1794f);
                        a10.append("): ");
                        a10.append(pVar2);
                        Log.v("FragmentManager", a10.toString());
                    }
                    h0Var.m(this.f1598v.f1874b.getClassLoader());
                    this.f1579c.l(h0Var);
                    h0Var.f1696e = this.f1597u;
                }
            }
            d0 d0Var2 = this.N;
            d0Var2.getClass();
            Iterator it3 = new ArrayList(d0Var2.f1648d.values()).iterator();
            while (true) {
                i10 = 0;
                if (!it3.hasNext()) {
                    break;
                }
                p pVar3 = (p) it3.next();
                n2.g gVar2 = this.f1579c;
                if (((HashMap) gVar2.f21851b).get(pVar3.f1794f) != null) {
                    i10 = 1;
                }
                if (i10 == 0) {
                    if (N(2)) {
                        Log.v("FragmentManager", "Discarding retained Fragment " + pVar3 + " that was not found in the set of active Fragments " + c0Var.f1625a);
                    }
                    this.N.i(pVar3);
                    pVar3.B = this;
                    h0 h0Var2 = new h0(this.f1590n, this.f1579c, pVar3);
                    h0Var2.f1696e = 1;
                    h0Var2.k();
                    pVar3.f1808u = true;
                    h0Var2.k();
                }
            }
            n2.g gVar3 = this.f1579c;
            ArrayList<String> arrayList2 = c0Var.f1626b;
            ((ArrayList) gVar3.f21850a).clear();
            if (arrayList2 != null) {
                for (String next : arrayList2) {
                    p e10 = gVar3.e(next);
                    if (e10 != null) {
                        if (N(2)) {
                            Log.v("FragmentManager", "restoreSaveState: added (" + next + "): " + e10);
                        }
                        gVar3.a(e10);
                    } else {
                        throw new IllegalStateException(q.b.a("No instantiated fragment for (", next, ")"));
                    }
                }
            }
            if (c0Var.f1627c != null) {
                this.f1580d = new ArrayList<>(c0Var.f1627c.length);
                int i11 = 0;
                while (true) {
                    d[] dVarArr = c0Var.f1627c;
                    if (i11 >= dVarArr.length) {
                        break;
                    }
                    d dVar = dVarArr[i11];
                    dVar.getClass();
                    b bVar = new b(this);
                    dVar.a(bVar);
                    bVar.f1623s = dVar.f1639g;
                    for (int i12 = 0; i12 < dVar.f1634b.size(); i12++) {
                        String str3 = dVar.f1634b.get(i12);
                        if (str3 != null) {
                            bVar.f1703a.get(i12).f1720b = this.f1579c.e(str3);
                        }
                    }
                    bVar.j(1);
                    if (N(2)) {
                        StringBuilder a11 = y0.a("restoreAllState: back stack #", i11, " (index ");
                        a11.append(bVar.f1623s);
                        a11.append("): ");
                        a11.append(bVar);
                        Log.v("FragmentManager", a11.toString());
                        PrintWriter printWriter = new PrintWriter(new p0("FragmentManager"));
                        bVar.n("  ", printWriter, false);
                        printWriter.close();
                    }
                    this.f1580d.add(bVar);
                    i11++;
                }
            } else {
                this.f1580d = null;
            }
            this.f1585i.set(c0Var.f1628d);
            String str4 = c0Var.f1629e;
            if (str4 != null) {
                p e11 = this.f1579c.e(str4);
                this.f1601y = e11;
                r(e11);
            }
            ArrayList<String> arrayList3 = c0Var.f1630f;
            if (arrayList3 != null) {
                while (i10 < arrayList3.size()) {
                    this.f1586j.put(arrayList3.get(i10), c0Var.f1631g.get(i10));
                    i10++;
                }
            }
            this.E = new ArrayDeque<>(c0Var.f1632h);
        }
    }

    public final void d() {
        this.f1578b = false;
        this.L.clear();
        this.K.clear();
    }

    public Bundle d0() {
        int i10;
        d[] dVarArr;
        ArrayList<String> arrayList;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = ((HashSet) e()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            q0 q0Var = (q0) it.next();
            if (q0Var.f1841e) {
                if (N(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                q0Var.f1841e = false;
                q0Var.c();
            }
        }
        x();
        A(true);
        this.G = true;
        this.N.f1653i = true;
        n2.g gVar = this.f1579c;
        gVar.getClass();
        ArrayList<String> arrayList2 = new ArrayList<>(((HashMap) gVar.f21851b).size());
        for (h0 h0Var : ((HashMap) gVar.f21851b).values()) {
            if (h0Var != null) {
                p pVar = h0Var.f1694c;
                h0Var.o();
                arrayList2.add(pVar.f1794f);
                if (N(2)) {
                    Log.v("FragmentManager", "Saved state of " + pVar + ": " + pVar.f1786b);
                }
            }
        }
        n2.g gVar2 = this.f1579c;
        gVar2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) gVar2.f21852c).values());
        if (!arrayList3.isEmpty()) {
            n2.g gVar3 = this.f1579c;
            synchronized (((ArrayList) gVar3.f21850a)) {
                dVarArr = null;
                if (((ArrayList) gVar3.f21850a).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(((ArrayList) gVar3.f21850a).size());
                    Iterator it2 = ((ArrayList) gVar3.f21850a).iterator();
                    while (it2.hasNext()) {
                        p pVar2 = (p) it2.next();
                        arrayList.add(pVar2.f1794f);
                        if (N(2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + pVar2.f1794f + "): " + pVar2);
                        }
                    }
                }
            }
            ArrayList<b> arrayList4 = this.f1580d;
            if (arrayList4 != null && (size = arrayList4.size()) > 0) {
                dVarArr = new d[size];
                for (i10 = 0; i10 < size; i10++) {
                    dVarArr[i10] = new d(this.f1580d.get(i10));
                    if (N(2)) {
                        StringBuilder a10 = y0.a("saveAllState: adding back stack #", i10, ": ");
                        a10.append(this.f1580d.get(i10));
                        Log.v("FragmentManager", a10.toString());
                    }
                }
            }
            c0 c0Var = new c0();
            c0Var.f1625a = arrayList2;
            c0Var.f1626b = arrayList;
            c0Var.f1627c = dVarArr;
            c0Var.f1628d = this.f1585i.get();
            p pVar3 = this.f1601y;
            if (pVar3 != null) {
                c0Var.f1629e = pVar3.f1794f;
            }
            c0Var.f1630f.addAll(this.f1586j.keySet());
            c0Var.f1631g.addAll(this.f1586j.values());
            c0Var.f1632h = new ArrayList<>(this.E);
            bundle.putParcelable("state", c0Var);
            for (String next : this.f1587k.keySet()) {
                bundle.putBundle(j.f.a("result_", next), this.f1587k.get(next));
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                g0 g0Var = (g0) it3.next();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", g0Var);
                StringBuilder a11 = android.support.v4.media.a.a("fragment_");
                a11.append(g0Var.f1678b);
                bundle.putBundle(a11.toString(), bundle2);
            }
        } else if (N(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final Set<q0> e() {
        HashSet hashSet = new HashSet();
        Iterator it = ((ArrayList) this.f1579c.g()).iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((h0) it.next()).f1694c.P;
            if (viewGroup != null) {
                hashSet.add(q0.g(viewGroup, L()));
            }
        }
        return hashSet;
    }

    public void e0() {
        synchronized (this.f1577a) {
            boolean z10 = true;
            if (this.f1577a.size() != 1) {
                z10 = false;
            }
            if (z10) {
                this.f1598v.f1875c.removeCallbacks(this.O);
                this.f1598v.f1875c.post(this.O);
                m0();
            }
        }
    }

    public h0 f(p pVar) {
        h0 i10 = this.f1579c.i(pVar.f1794f);
        if (i10 != null) {
            return i10;
        }
        h0 h0Var = new h0(this.f1590n, this.f1579c, pVar);
        h0Var.m(this.f1598v.f1874b.getClassLoader());
        h0Var.f1696e = this.f1597u;
        return h0Var;
    }

    public void f0(p pVar, boolean z10) {
        ViewGroup I2 = I(pVar);
        if (I2 != null && (I2 instanceof FragmentContainerView)) {
            ((FragmentContainerView) I2).setDrawDisappearingViewsLast(!z10);
        }
    }

    public void g(p pVar) {
        if (N(2)) {
            Log.v("FragmentManager", "detach: " + pVar);
        }
        if (!pVar.J) {
            pVar.J = true;
            if (pVar.f1807t) {
                if (N(2)) {
                    Log.v("FragmentManager", "remove from detach: " + pVar);
                }
                this.f1579c.t(pVar);
                if (O(pVar)) {
                    this.F = true;
                }
                i0(pVar);
            }
        }
    }

    public void g0(p pVar, o.c cVar) {
        if (!pVar.equals(D(pVar.f1794f)) || !(pVar.C == null || pVar.B == this)) {
            throw new IllegalArgumentException("Fragment " + pVar + " is not an active fragment of FragmentManager " + this);
        }
        pVar.f1791d0 = cVar;
    }

    public void h(Configuration configuration, boolean z10) {
        if (!z10 || !(this.f1598v instanceof d0.b)) {
            for (p next : this.f1579c.j()) {
                if (next != null) {
                    next.onConfigurationChanged(configuration);
                    if (z10) {
                        next.D.h(configuration, true);
                    }
                }
            }
            return;
        }
        l0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        throw null;
    }

    public void h0(p pVar) {
        if (pVar == null || (pVar.equals(D(pVar.f1794f)) && (pVar.C == null || pVar.B == this))) {
            p pVar2 = this.f1601y;
            this.f1601y = pVar;
            r(pVar2);
            r(this.f1601y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + pVar + " is not an active fragment of FragmentManager " + this);
    }

    public boolean i(MenuItem menuItem) {
        if (this.f1597u < 1) {
            return false;
        }
        for (p next : this.f1579c.j()) {
            if (next != null) {
                if (!next.I ? next.D.i(menuItem) : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void i0(p pVar) {
        boolean z10;
        ViewGroup I2 = I(pVar);
        if (I2 != null) {
            if (pVar.B() + pVar.A() + pVar.u() + pVar.r() > 0) {
                if (I2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    I2.setTag(R.id.visible_removing_fragment_view_tag, pVar);
                }
                p pVar2 = (p) I2.getTag(R.id.visible_removing_fragment_view_tag);
                p.d dVar = pVar.Z;
                if (dVar == null) {
                    z10 = false;
                } else {
                    z10 = dVar.f1816a;
                }
                pVar2.o0(z10);
            }
        }
    }

    public void j() {
        this.G = false;
        this.H = false;
        this.N.f1653i = false;
        u(1);
    }

    public void j0(p pVar) {
        if (N(2)) {
            Log.v("FragmentManager", "show: " + pVar);
        }
        if (pVar.I) {
            pVar.I = false;
            pVar.f1785a0 = !pVar.f1785a0;
        }
    }

    public boolean k(Menu menu, MenuInflater menuInflater) {
        boolean z10;
        if (this.f1597u < 1) {
            return false;
        }
        ArrayList<p> arrayList = null;
        boolean z11 = false;
        for (p next : this.f1579c.j()) {
            if (next != null && Q(next)) {
                if (!next.I) {
                    z10 = (next.M && next.N) | next.D.k(menu, menuInflater);
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(next);
                    z11 = true;
                }
            }
        }
        if (this.f1581e != null) {
            for (int i10 = 0; i10 < this.f1581e.size(); i10++) {
                p pVar = this.f1581e.get(i10);
                if (arrayList == null || !arrayList.contains(pVar)) {
                    pVar.getClass();
                }
            }
        }
        this.f1581e = arrayList;
        return z11;
    }

    public final void k0() {
        Iterator it = ((ArrayList) this.f1579c.g()).iterator();
        while (it.hasNext()) {
            V((h0) it.next());
        }
    }

    public void l() {
        boolean z10 = true;
        this.I = true;
        A(true);
        x();
        v<?> vVar = this.f1598v;
        if (vVar instanceof v0) {
            z10 = ((d0) this.f1579c.f21853d).f1652h;
        } else {
            Context context = vVar.f1874b;
            if (context instanceof Activity) {
                z10 = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z10) {
            for (e eVar : this.f1586j.values()) {
                for (String next : eVar.f1654a) {
                    d0 d0Var = (d0) this.f1579c.f21853d;
                    d0Var.getClass();
                    if (N(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + next);
                    }
                    d0Var.h(next);
                }
            }
        }
        u(-1);
        v<?> vVar2 = this.f1598v;
        if (vVar2 instanceof d0.c) {
            ((d0.c) vVar2).h(this.f1593q);
        }
        v<?> vVar3 = this.f1598v;
        if (vVar3 instanceof d0.b) {
            ((d0.b) vVar3).m(this.f1592p);
        }
        v<?> vVar4 = this.f1598v;
        if (vVar4 instanceof c0.o) {
            ((c0.o) vVar4).y(this.f1594r);
        }
        v<?> vVar5 = this.f1598v;
        if (vVar5 instanceof c0.p) {
            ((c0.p) vVar5).n(this.f1595s);
        }
        v<?> vVar6 = this.f1598v;
        if (vVar6 instanceof o0.i) {
            ((o0.i) vVar6).r(this.f1596t);
        }
        this.f1598v = null;
        this.f1599w = null;
        this.f1600x = null;
        if (this.f1583g != null) {
            this.f1584h.b();
            this.f1583g = null;
        }
        androidx.activity.result.c<Intent> cVar = this.B;
        if (cVar != null) {
            cVar.b();
            this.C.b();
            this.D.b();
        }
    }

    public final void l0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new p0("FragmentManager"));
        v<?> vVar = this.f1598v;
        if (vVar != null) {
            try {
                vVar.j("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
            }
        } else {
            try {
                w("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e11) {
                Log.e("FragmentManager", "Failed dumping state", e11);
            }
        }
        throw runtimeException;
    }

    public void m(boolean z10) {
        if (!z10 || !(this.f1598v instanceof d0.c)) {
            for (p next : this.f1579c.j()) {
                if (next != null) {
                    next.onLowMemory();
                    if (z10) {
                        next.D.m(true);
                    }
                }
            }
            return;
        }
        l0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (H() <= 0) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (R(r3.f1600x) == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        r0.f371a = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r0 = r3.f1584h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m0() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.a0$n> r0 = r3.f1577a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.a0$n> r1 = r3.f1577a     // Catch:{ all -> 0x0028 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0028 }
            r2 = 1
            if (r1 != 0) goto L_0x0012
            androidx.activity.h r1 = r3.f1584h     // Catch:{ all -> 0x0028 }
            r1.f371a = r2     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0012:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            androidx.activity.h r0 = r3.f1584h
            int r1 = r3.H()
            if (r1 <= 0) goto L_0x0024
            androidx.fragment.app.p r1 = r3.f1600x
            boolean r1 = r3.R(r1)
            if (r1 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            r0.f371a = r2
            return
        L_0x0028:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a0.m0():void");
    }

    public void n(boolean z10, boolean z11) {
        if (!z11 || !(this.f1598v instanceof c0.o)) {
            for (p next : this.f1579c.j()) {
                if (next != null && z11) {
                    next.D.n(z10, true);
                }
            }
            return;
        }
        l0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        throw null;
    }

    public void o() {
        Iterator it = ((ArrayList) this.f1579c.h()).iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            if (pVar != null) {
                pVar.J();
                pVar.D.o();
            }
        }
    }

    public boolean p(MenuItem menuItem) {
        if (this.f1597u < 1) {
            return false;
        }
        for (p next : this.f1579c.j()) {
            if (next != null) {
                if (!next.I ? next.D.p(menuItem) : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public void q(Menu menu) {
        if (this.f1597u >= 1) {
            for (p next : this.f1579c.j()) {
                if (next != null && !next.I) {
                    next.D.q(menu);
                }
            }
        }
    }

    public final void r(p pVar) {
        if (pVar != null && pVar.equals(D(pVar.f1794f))) {
            boolean R = pVar.B.R(pVar);
            Boolean bool = pVar.f1806s;
            if (bool == null || bool.booleanValue() != R) {
                pVar.f1806s = Boolean.valueOf(R);
                pVar.X(R);
                a0 a0Var = pVar.D;
                a0Var.m0();
                a0Var.r(a0Var.f1601y);
            }
        }
    }

    public void s(boolean z10, boolean z11) {
        if (!z11 || !(this.f1598v instanceof c0.p)) {
            for (p next : this.f1579c.j()) {
                if (next != null && z11) {
                    next.D.s(z10, true);
                }
            }
            return;
        }
        l0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        throw null;
    }

    public boolean t(Menu menu) {
        boolean z10;
        boolean z11;
        if (this.f1597u < 1) {
            return false;
        }
        boolean z12 = false;
        for (p next : this.f1579c.j()) {
            if (next != null && Q(next)) {
                if (!next.I) {
                    if (!next.M || !next.N) {
                        z11 = false;
                    } else {
                        next.W(menu);
                        z11 = true;
                    }
                    z10 = next.D.t(menu) | z11;
                } else {
                    z10 = false;
                }
                if (z10) {
                    z12 = true;
                }
            }
        }
        return z12;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        p pVar = this.f1600x;
        if (pVar != null) {
            sb2.append(pVar.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f1600x)));
            sb2.append("}");
        } else {
            v<?> vVar = this.f1598v;
            if (vVar != null) {
                sb2.append(vVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f1598v)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    /* JADX INFO: finally extract failed */
    public final void u(int i10) {
        try {
            this.f1578b = true;
            for (h0 h0Var : ((HashMap) this.f1579c.f21851b).values()) {
                if (h0Var != null) {
                    h0Var.f1696e = i10;
                }
            }
            T(i10, false);
            Iterator it = ((HashSet) e()).iterator();
            while (it.hasNext()) {
                ((q0) it.next()).e();
            }
            this.f1578b = false;
            A(true);
        } catch (Throwable th) {
            this.f1578b = false;
            throw th;
        }
    }

    public final void v() {
        if (this.J) {
            this.J = false;
            k0();
        }
    }

    public void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String a10 = j.f.a(str, "    ");
        n2.g gVar = this.f1579c;
        gVar.getClass();
        String str2 = str + "    ";
        if (!((HashMap) gVar.f21851b).isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (h0 h0Var : ((HashMap) gVar.f21851b).values()) {
                printWriter.print(str);
                if (h0Var != null) {
                    p pVar = h0Var.f1694c;
                    printWriter.println(pVar);
                    pVar.m(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = ((ArrayList) gVar.f21850a).size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size3; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(((p) ((ArrayList) gVar.f21850a).get(i10)).toString());
            }
        }
        ArrayList<p> arrayList = this.f1581e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size2; i11++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(this.f1581e.get(i11).toString());
            }
        }
        ArrayList<b> arrayList2 = this.f1580d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size; i12++) {
                b bVar = this.f1580d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(bVar.toString());
                bVar.n(a10, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1585i.get());
        synchronized (this.f1577a) {
            int size4 = this.f1577a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i13 = 0; i13 < size4; i13++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i13);
                    printWriter.print(": ");
                    printWriter.println(this.f1577a.get(i13));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1598v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1599w);
        if (this.f1600x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1600x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1597u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.G);
        printWriter.print(" mStopped=");
        printWriter.print(this.H);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.I);
        if (this.F) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.F);
        }
    }

    public final void x() {
        Iterator it = ((HashSet) e()).iterator();
        while (it.hasNext()) {
            ((q0) it.next()).e();
        }
    }

    public void y(n nVar, boolean z10) {
        if (!z10) {
            if (this.f1598v == null) {
                if (this.I) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (S()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1577a) {
            if (this.f1598v != null) {
                this.f1577a.add(nVar);
                e0();
            } else if (!z10) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public final void z(boolean z10) {
        if (this.f1578b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f1598v == null) {
            if (this.I) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() != this.f1598v.f1875c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (!z10 && S()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.K == null) {
            this.K = new ArrayList<>();
            this.L = new ArrayList<>();
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* compiled from: FragmentManager */
    public static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public String f1611a;

        /* renamed from: b  reason: collision with root package name */
        public int f1612b;

        /* compiled from: FragmentManager */
        public class a implements Parcelable.Creator<l> {
            public Object createFromParcel(Parcel parcel) {
                return new l(parcel);
            }

            public Object[] newArray(int i10) {
                return new l[i10];
            }
        }

        public l(String str, int i10) {
            this.f1611a = str;
            this.f1612b = i10;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f1611a);
            parcel.writeInt(this.f1612b);
        }

        public l(Parcel parcel) {
            this.f1611a = parcel.readString();
            this.f1612b = parcel.readInt();
        }
    }
}

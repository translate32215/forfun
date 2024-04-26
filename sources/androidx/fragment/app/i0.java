package androidx.fragment.app;

import androidx.lifecycle.o;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: FragmentTransaction */
public abstract class i0 {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<a> f1703a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public int f1704b;

    /* renamed from: c  reason: collision with root package name */
    public int f1705c;

    /* renamed from: d  reason: collision with root package name */
    public int f1706d;

    /* renamed from: e  reason: collision with root package name */
    public int f1707e;

    /* renamed from: f  reason: collision with root package name */
    public int f1708f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1709g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1710h = true;

    /* renamed from: i  reason: collision with root package name */
    public String f1711i;

    /* renamed from: j  reason: collision with root package name */
    public int f1712j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f1713k;

    /* renamed from: l  reason: collision with root package name */
    public int f1714l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f1715m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<String> f1716n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<String> f1717o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1718p = false;

    /* compiled from: FragmentTransaction */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f1719a;

        /* renamed from: b  reason: collision with root package name */
        public p f1720b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1721c;

        /* renamed from: d  reason: collision with root package name */
        public int f1722d;

        /* renamed from: e  reason: collision with root package name */
        public int f1723e;

        /* renamed from: f  reason: collision with root package name */
        public int f1724f;

        /* renamed from: g  reason: collision with root package name */
        public int f1725g;

        /* renamed from: h  reason: collision with root package name */
        public o.c f1726h;

        /* renamed from: i  reason: collision with root package name */
        public o.c f1727i;

        public a() {
        }

        public a(int i10, p pVar) {
            this.f1719a = i10;
            this.f1720b = pVar;
            this.f1721c = false;
            o.c cVar = o.c.RESUMED;
            this.f1726h = cVar;
            this.f1727i = cVar;
        }

        public a(int i10, p pVar, boolean z10) {
            this.f1719a = i10;
            this.f1720b = pVar;
            this.f1721c = z10;
            o.c cVar = o.c.RESUMED;
            this.f1726h = cVar;
            this.f1727i = cVar;
        }

        public a(int i10, p pVar, o.c cVar) {
            this.f1719a = i10;
            this.f1720b = pVar;
            this.f1721c = false;
            this.f1726h = pVar.f1791d0;
            this.f1727i = cVar;
        }

        public a(a aVar) {
            this.f1719a = aVar.f1719a;
            this.f1720b = aVar.f1720b;
            this.f1721c = aVar.f1721c;
            this.f1722d = aVar.f1722d;
            this.f1723e = aVar.f1723e;
            this.f1724f = aVar.f1724f;
            this.f1725g = aVar.f1725g;
            this.f1726h = aVar.f1726h;
            this.f1727i = aVar.f1727i;
        }
    }

    public i0(u uVar, ClassLoader classLoader) {
    }

    public void c(a aVar) {
        this.f1703a.add(aVar);
        aVar.f1722d = this.f1704b;
        aVar.f1723e = this.f1705c;
        aVar.f1724f = this.f1706d;
        aVar.f1725g = this.f1707e;
    }

    public i0 d(String str) {
        if (this.f1710h) {
            this.f1709g = true;
            this.f1711i = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public abstract int e();

    public abstract void f();

    public abstract void g(int i10, p pVar, String str, int i11);

    public i0 h(int i10, p pVar) {
        if (i10 != 0) {
            g(i10, pVar, (String) null, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public abstract i0 i(p pVar, o.c cVar);

    public i0(u uVar, ClassLoader classLoader, i0 i0Var) {
        Iterator<a> it = i0Var.f1703a.iterator();
        while (it.hasNext()) {
            this.f1703a.add(new a(it.next()));
        }
        this.f1704b = i0Var.f1704b;
        this.f1705c = i0Var.f1705c;
        this.f1706d = i0Var.f1706d;
        this.f1707e = i0Var.f1707e;
        this.f1708f = i0Var.f1708f;
        this.f1709g = i0Var.f1709g;
        this.f1710h = i0Var.f1710h;
        this.f1711i = i0Var.f1711i;
        this.f1714l = i0Var.f1714l;
        this.f1715m = i0Var.f1715m;
        this.f1712j = i0Var.f1712j;
        this.f1713k = i0Var.f1713k;
        if (i0Var.f1716n != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.f1716n = arrayList;
            arrayList.addAll(i0Var.f1716n);
        }
        if (i0Var.f1717o != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.f1717o = arrayList2;
            arrayList2.addAll(i0Var.f1717o);
        }
        this.f1718p = i0Var.f1718p;
    }
}

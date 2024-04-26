package o1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import be.f;
import be.g;
import ce.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import ld.e;
import o1.r;
import s.j;
import s.k;
import ud.k;
import ud.l;

/* compiled from: NavGraph.kt */
public class t extends r implements Iterable<r>, vd.a {

    /* renamed from: s  reason: collision with root package name */
    public final j<r> f22814s = new j<>();

    /* renamed from: t  reason: collision with root package name */
    public int f22815t;

    /* renamed from: u  reason: collision with root package name */
    public String f22816u;

    /* renamed from: v  reason: collision with root package name */
    public String f22817v;

    /* compiled from: NavGraph.kt */
    public static final class a extends l implements td.l<r, r> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f22818b = new a();

        public a() {
            super(1);
        }

        public Object c(Object obj) {
            r rVar = (r) obj;
            k.f(rVar, "it");
            if (!(rVar instanceof t)) {
                return null;
            }
            t tVar = (t) rVar;
            return tVar.B(tVar.f22815t);
        }
    }

    /* compiled from: NavGraph.kt */
    public static final class b implements Iterator<r>, vd.a {

        /* renamed from: a  reason: collision with root package name */
        public int f22819a = -1;

        /* renamed from: b  reason: collision with root package name */
        public boolean f22820b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ t f22821c;

        public b(t tVar) {
            this.f22821c = tVar;
        }

        public boolean hasNext() {
            if (this.f22819a + 1 < this.f22821c.f22814s.k()) {
                return true;
            }
            return false;
        }

        public Object next() {
            if (hasNext()) {
                this.f22820b = true;
                j<r> jVar = this.f22821c.f22814s;
                int i10 = this.f22819a + 1;
                this.f22819a = i10;
                r l10 = jVar.l(i10);
                k.e(l10, "nodes.valueAt(++index)");
                return l10;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f22820b) {
                j<r> jVar = this.f22821c.f22814s;
                jVar.l(this.f22819a).f22800b = null;
                int i10 = this.f22819a;
                Object[] objArr = jVar.f24855c;
                Object obj = objArr[i10];
                Object obj2 = j.f24852e;
                if (obj != obj2) {
                    objArr[i10] = obj2;
                    jVar.f24853a = true;
                }
                this.f22819a = i10 - 1;
                this.f22820b = false;
                return;
            }
            throw new IllegalStateException("You must call next() before you can remove an element".toString());
        }
    }

    public t(d0<? extends t> d0Var) {
        super(d0Var);
    }

    public static final r F(t tVar) {
        k.f(tVar, "<this>");
        f c10 = g.c(tVar.B(tVar.f22815t), a.f22818b);
        k.f(c10, "<this>");
        Iterator it = c10.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return (r) next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public final void A(r rVar) {
        k.f(rVar, "node");
        int i10 = rVar.f22806h;
        String str = rVar.f22807i;
        boolean z10 = false;
        if ((i10 == 0 && str == null) ? false : true) {
            String str2 = this.f22807i;
            if (str2 == null || (!k.a(str, str2))) {
                if (i10 != this.f22806h) {
                    r d10 = this.f22814s.d(i10);
                    if (d10 != rVar) {
                        if (rVar.f22800b == null) {
                            z10 = true;
                        }
                        if (z10) {
                            if (d10 != null) {
                                d10.f22800b = null;
                            }
                            rVar.f22800b = this;
                            this.f22814s.h(rVar.f22806h, rVar);
                            return;
                        }
                        throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
                    }
                    return;
                }
                throw new IllegalArgumentException(("Destination " + rVar + " cannot have the same id as graph " + this).toString());
            }
            throw new IllegalArgumentException(("Destination " + rVar + " cannot have the same route as graph " + this).toString());
        }
        throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
    }

    public final r B(int i10) {
        return C(i10, true);
    }

    public final r C(int i10, boolean z10) {
        t tVar;
        r e10 = this.f22814s.e(i10, null);
        if (e10 != null) {
            return e10;
        }
        if (!z10 || (tVar = this.f22800b) == null) {
            return null;
        }
        k.c(tVar);
        return tVar.B(i10);
    }

    public final r D(String str) {
        if (!(str == null || i.d(str))) {
            return E(str, true);
        }
        return null;
    }

    public final r E(String str, boolean z10) {
        t tVar;
        k.f(str, "route");
        r d10 = this.f22814s.d(("android-app://androidx.navigation/" + str).hashCode());
        if (d10 != null) {
            return d10;
        }
        if (!z10 || (tVar = this.f22800b) == null) {
            return null;
        }
        k.c(tVar);
        return tVar.D(str);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof t)) {
            return false;
        }
        List<T> j10 = be.i.j(g.b(s.k.a(this.f22814s)));
        t tVar = (t) obj;
        Iterator<T> a10 = s.k.a(tVar.f22814s);
        while (true) {
            k.a aVar = (k.a) a10;
            if (!aVar.hasNext()) {
                break;
            }
            ((ArrayList) j10).remove((r) aVar.next());
        }
        if (!super.equals(obj) || this.f22814s.k() != tVar.f22814s.k() || this.f22815t != tVar.f22815t || !((ArrayList) j10).isEmpty()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10 = this.f22815t;
        j<r> jVar = this.f22814s;
        int k10 = jVar.k();
        for (int i11 = 0; i11 < k10; i11++) {
            i10 = (((i10 * 31) + jVar.g(i11)) * 31) + jVar.l(i11).hashCode();
        }
        return i10;
    }

    public final Iterator<r> iterator() {
        return new b(this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        r D = D(this.f22817v);
        if (D == null) {
            D = B(this.f22815t);
        }
        sb2.append(" startDestination=");
        if (D == null) {
            String str = this.f22817v;
            if (str != null) {
                sb2.append(str);
            } else {
                String str2 = this.f22816u;
                if (str2 != null) {
                    sb2.append(str2);
                } else {
                    StringBuilder a10 = android.support.v4.media.a.a("0x");
                    a10.append(Integer.toHexString(this.f22815t));
                    sb2.append(a10.toString());
                }
            }
        } else {
            sb2.append("{");
            sb2.append(D.toString());
            sb2.append("}");
        }
        String sb3 = sb2.toString();
        ud.k.e(sb3, "sb.toString()");
        return sb3;
    }

    public r.b x(p pVar) {
        r.b x10 = super.x(pVar);
        ArrayList arrayList = new ArrayList();
        b bVar = new b(this);
        while (bVar.hasNext()) {
            r.b x11 = ((r) bVar.next()).x(pVar);
            if (x11 != null) {
                arrayList.add(x11);
            }
        }
        return (r.b) ld.l.p(e.f(new r.b[]{x10, (r.b) ld.l.p(arrayList)}));
    }

    public void y(Context context, AttributeSet attributeSet) {
        String str;
        ud.k.f(context, "context");
        ud.k.f(attributeSet, "attrs");
        super.y(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, p1.a.f23774d);
        ud.k.e(obtainAttributes, "context.resources.obtain…vGraphNavigator\n        )");
        int resourceId = obtainAttributes.getResourceId(0, 0);
        if (resourceId != this.f22806h) {
            if (this.f22817v != null) {
                this.f22815t = 0;
                this.f22817v = null;
            }
            this.f22815t = resourceId;
            this.f22816u = null;
            ud.k.f(context, "context");
            if (resourceId <= 16777215) {
                str = String.valueOf(resourceId);
            } else {
                try {
                    str = context.getResources().getResourceName(resourceId);
                } catch (Resources.NotFoundException unused) {
                    str = String.valueOf(resourceId);
                }
                ud.k.e(str, "try {\n                co….toString()\n            }");
            }
            this.f22816u = str;
            obtainAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException(("Start destination " + resourceId + " cannot use the same id as the graph " + this).toString());
    }
}

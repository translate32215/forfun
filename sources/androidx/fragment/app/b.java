package androidx.fragment.app;

import android.support.v4.media.a;
import android.util.Log;
import androidx.fragment.app.a0;
import androidx.fragment.app.i0;
import androidx.lifecycle.o;
import c1.d;
import com.startapp.b4;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: BackStackRecord */
public final class b extends i0 implements a0.j, a0.n {

    /* renamed from: q  reason: collision with root package name */
    public final a0 f1621q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1622r;

    /* renamed from: s  reason: collision with root package name */
    public int f1623s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1624t;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(androidx.fragment.app.a0 r3) {
        /*
            r2 = this;
            androidx.fragment.app.u r0 = r3.J()
            androidx.fragment.app.v<?> r1 = r3.f1598v
            if (r1 == 0) goto L_0x000f
            android.content.Context r1 = r1.f1874b
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            r2.<init>(r0, r1)
            r0 = -1
            r2.f1623s = r0
            r0 = 0
            r2.f1624t = r0
            r2.f1621q = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.b.<init>(androidx.fragment.app.a0):void");
    }

    public String a() {
        return this.f1711i;
    }

    public boolean b(ArrayList<b> arrayList, ArrayList<Boolean> arrayList2) {
        if (a0.N(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1709g) {
            return true;
        }
        a0 a0Var = this.f1621q;
        if (a0Var.f1580d == null) {
            a0Var.f1580d = new ArrayList<>();
        }
        a0Var.f1580d.add(this);
        return true;
    }

    public int e() {
        return l(false);
    }

    public void f() {
        if (!this.f1709g) {
            this.f1710h = false;
            this.f1621q.B(this, true);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public void g(int i10, p pVar, String str, int i11) {
        String str2 = pVar.f1789c0;
        if (str2 != null) {
            d.d(pVar, str2);
        }
        Class<?> cls = pVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder a10 = a.a("Fragment ");
            a10.append(cls.getCanonicalName());
            a10.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(a10.toString());
        }
        if (str != null) {
            String str3 = pVar.H;
            if (str3 == null || str.equals(str3)) {
                pVar.H = str;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't change tag of fragment ");
                sb2.append(pVar);
                sb2.append(": was ");
                throw new IllegalStateException(a.a(sb2, pVar.H, " now ", str));
            }
        }
        if (i10 != 0) {
            if (i10 != -1) {
                int i12 = pVar.F;
                if (i12 == 0 || i12 == i10) {
                    pVar.F = i10;
                    pVar.G = i10;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + pVar + ": was " + pVar.F + " now " + i10);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + pVar + " with tag " + str + " to container view with no id");
            }
        }
        c(new i0.a(i11, pVar));
        pVar.B = this.f1621q;
    }

    public int getId() {
        return this.f1623s;
    }

    public i0 i(p pVar, o.c cVar) {
        if (pVar.B != this.f1621q) {
            StringBuilder a10 = a.a("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            a10.append(this.f1621q);
            throw new IllegalArgumentException(a10.toString());
        } else if (cVar == o.c.INITIALIZED && pVar.f1784a > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + " after the Fragment has been created");
        } else if (cVar != o.c.DESTROYED) {
            c(new i0.a(10, pVar, cVar));
            return this;
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
    }

    public void j(int i10) {
        if (this.f1709g) {
            if (a0.N(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f1703a.size();
            for (int i11 = 0; i11 < size; i11++) {
                i0.a aVar = this.f1703a.get(i11);
                p pVar = aVar.f1720b;
                if (pVar != null) {
                    pVar.A += i10;
                    if (a0.N(2)) {
                        StringBuilder a10 = a.a("Bump nesting of ");
                        a10.append(aVar.f1720b);
                        a10.append(" to ");
                        a10.append(aVar.f1720b.A);
                        Log.v("FragmentManager", a10.toString());
                    }
                }
            }
        }
    }

    public int k() {
        return l(true);
    }

    public int l(boolean z10) {
        if (!this.f1622r) {
            if (a0.N(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new p0("FragmentManager"));
                n("  ", printWriter, true);
                printWriter.close();
            }
            this.f1622r = true;
            if (this.f1709g) {
                this.f1623s = this.f1621q.f1585i.getAndIncrement();
            } else {
                this.f1623s = -1;
            }
            this.f1621q.y(this, z10);
            return this.f1623s;
        }
        throw new IllegalStateException("commit already called");
    }

    public void m() {
        if (!this.f1709g) {
            this.f1710h = false;
            this.f1621q.B(this, false);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public void n(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1711i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1623s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1622r);
            if (this.f1708f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1708f));
            }
            if (!(this.f1704b == 0 && this.f1705c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1704b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1705c));
            }
            if (!(this.f1706d == 0 && this.f1707e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1706d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1707e));
            }
            if (!(this.f1712j == 0 && this.f1713k == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1712j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1713k);
            }
            if (!(this.f1714l == 0 && this.f1715m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1714l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1715m);
            }
        }
        if (!this.f1703a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f1703a.size();
            for (int i10 = 0; i10 < size; i10++) {
                i0.a aVar = this.f1703a.get(i10);
                switch (aVar.f1719a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case b4.f10106f /*8*/:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder a10 = a.a("cmd=");
                        a10.append(aVar.f1719a);
                        str2 = a10.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f1720b);
                if (z10) {
                    if (!(aVar.f1722d == 0 && aVar.f1723e == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1722d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1723e));
                    }
                    if (aVar.f1724f != 0 || aVar.f1725g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1724f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1725g));
                    }
                }
            }
        }
    }

    public i0 o(p pVar) {
        a0 a0Var = pVar.B;
        if (a0Var == null || a0Var == this.f1621q) {
            c(new i0.a(3, pVar));
            return this;
        }
        StringBuilder a10 = a.a("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        a10.append(pVar.toString());
        a10.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(a10.toString());
    }

    public i0 p(p pVar) {
        a0 a0Var = pVar.B;
        if (a0Var == null || a0Var == this.f1621q) {
            c(new i0.a(8, pVar));
            return this;
        }
        StringBuilder a10 = a.a("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment ");
        a10.append(pVar.toString());
        a10.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(a10.toString());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1623s >= 0) {
            sb2.append(" #");
            sb2.append(this.f1623s);
        }
        if (this.f1711i != null) {
            sb2.append(" ");
            sb2.append(this.f1711i);
        }
        sb2.append("}");
        return sb2.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(androidx.fragment.app.b r3) {
        /*
            r2 = this;
            androidx.fragment.app.a0 r0 = r3.f1621q
            androidx.fragment.app.u r0 = r0.J()
            androidx.fragment.app.a0 r1 = r3.f1621q
            androidx.fragment.app.v<?> r1 = r1.f1598v
            if (r1 == 0) goto L_0x0013
            android.content.Context r1 = r1.f1874b
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            r2.<init>(r0, r1, r3)
            r0 = -1
            r2.f1623s = r0
            r0 = 0
            r2.f1624t = r0
            androidx.fragment.app.a0 r0 = r3.f1621q
            r2.f1621q = r0
            boolean r0 = r3.f1622r
            r2.f1622r = r0
            int r0 = r3.f1623s
            r2.f1623s = r0
            boolean r3 = r3.f1624t
            r2.f1624t = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.b.<init>(androidx.fragment.app.b):void");
    }
}

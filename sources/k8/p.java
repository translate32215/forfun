package k8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n2.g;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class p implements o {

    /* renamed from: a  reason: collision with root package name */
    public final String f20397a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<o> f20398b;

    public p(String str, List<o> list) {
        this.f20397a = str;
        ArrayList<o> arrayList = new ArrayList<>();
        this.f20398b = arrayList;
        arrayList.addAll(list);
    }

    public final Double a() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final Iterator<o> c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        String str = this.f20397a;
        if (str == null ? pVar.f20397a == null : str.equals(pVar.f20397a)) {
            return this.f20398b.equals(pVar.f20398b);
        }
        return false;
    }

    public final o f() {
        return this;
    }

    public final int hashCode() {
        String str = this.f20397a;
        return this.f20398b.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    public final Boolean j() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final String q() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final o s(String str, g gVar, List<o> list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}

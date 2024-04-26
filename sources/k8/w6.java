package k8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class w6 extends h5<String> implements RandomAccess, x6 {

    /* renamed from: b  reason: collision with root package name */
    public final List<Object> f20524b;

    static {
        new w6(10).f20240a = false;
    }

    public w6() {
        this(10);
    }

    public static String h(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof p5)) {
            return new String((byte[]) obj, r6.f20450a);
        }
        p5 p5Var = (p5) obj;
        return p5Var.h() == 0 ? "" : p5Var.o(r6.f20450a);
    }

    public final List<?> a() {
        return Collections.unmodifiableList(this.f20524b);
    }

    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        c();
        this.f20524b.add(i10, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i10, Collection<? extends String> collection) {
        c();
        if (collection instanceof x6) {
            collection = ((x6) collection).a();
        }
        boolean addAll = this.f20524b.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }

    public final x6 b() {
        return this.f20240a ? new o8(this) : this;
    }

    public final void clear() {
        c();
        this.f20524b.clear();
        this.modCount++;
    }

    /* renamed from: f */
    public final String get(int i10) {
        Object obj = this.f20524b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof p5) {
            p5 p5Var = (p5) obj;
            String o10 = p5Var.h() == 0 ? "" : p5Var.o(r6.f20450a);
            if (p5Var.s()) {
                this.f20524b.set(i10, o10);
            }
            return o10;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, r6.f20450a);
        if (v8.f20511a.a(bArr, 0, bArr.length)) {
            this.f20524b.set(i10, str);
        }
        return str;
    }

    public final /* bridge */ /* synthetic */ q6 g(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f20524b);
            return new w6((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        Object remove = this.f20524b.remove(i10);
        this.modCount++;
        return h(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        c();
        return h(this.f20524b.set(i10, (String) obj));
    }

    public final int size() {
        return this.f20524b.size();
    }

    public final Object u(int i10) {
        return this.f20524b.get(i10);
    }

    public final void v(p5 p5Var) {
        c();
        this.f20524b.add(p5Var);
        this.modCount++;
    }

    public w6(int i10) {
        this.f20524b = new ArrayList(i10);
    }

    public w6(ArrayList<Object> arrayList) {
        this.f20524b = arrayList;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}

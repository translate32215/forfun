package e8;

import com.google.android.gms.internal.ads.mp;
import com.google.android.gms.internal.ads.qq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class l80 extends d70<String> implements k80, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    public final List<Object> f15370b;

    static {
        new l80(10).f14227a = false;
    }

    public l80(int i10) {
        this.f15370b = new ArrayList(i10);
    }

    public static String f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof mp)) {
            return new String((byte[]) obj, v70.f17029a);
        }
        mp mpVar = (mp) obj;
        mpVar.getClass();
        return mpVar.size() == 0 ? "" : mpVar.h(v70.f17029a);
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        c();
        this.f15370b.add(i10, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final void clear() {
        c();
        this.f15370b.clear();
        this.modCount++;
    }

    public final Object get(int i10) {
        Object obj = this.f15370b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof mp) {
            mp mpVar = (mp) obj;
            mpVar.getClass();
            String h10 = mpVar.size() == 0 ? "" : mpVar.h(v70.f17029a);
            if (mpVar.y()) {
                this.f15370b.set(i10, h10);
            }
            return h10;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, v70.f17029a);
        boolean z10 = false;
        if (qq.f7993a.b(0, bArr, 0, bArr.length) == 0) {
            z10 = true;
        }
        if (z10) {
            this.f15370b.set(i10, str);
        }
        return str;
    }

    public final k80 m() {
        return this.f14227a ? new aa0(this) : this;
    }

    public final void n(mp mpVar) {
        c();
        this.f15370b.add(mpVar);
        this.modCount++;
    }

    public final Object p(int i10) {
        return this.f15370b.get(i10);
    }

    public final /* synthetic */ c80 r(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f15370b);
            return new l80((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object remove(int i10) {
        c();
        Object remove = this.f15370b.remove(i10);
        this.modCount++;
        return f(remove);
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        c();
        return f(this.f15370b.set(i10, (String) obj));
    }

    public final int size() {
        return this.f15370b.size();
    }

    public final List<?> w() {
        return Collections.unmodifiableList(this.f15370b);
    }

    public final boolean addAll(int i10, Collection<? extends String> collection) {
        c();
        if (collection instanceof k80) {
            collection = ((k80) collection).w();
        }
        boolean addAll = this.f15370b.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }

    public l80(ArrayList<Object> arrayList) {
        this.f15370b = arrayList;
    }
}

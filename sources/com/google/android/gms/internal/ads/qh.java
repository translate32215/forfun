package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.lh;
import e.h;
import e8.g50;
import e8.k50;
import e8.x40;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class qh<V, C> extends lh<V, C> {

    /* renamed from: x  reason: collision with root package name */
    public List<k50<V>> f7976x;

    public qh(sg sgVar) {
        super(sgVar, true, true);
        List<k50<V>> list;
        if (sgVar.isEmpty()) {
            g50<Object> g50 = ug.f8246b;
            list = x40.f17440e;
        } else {
            int size = sgVar.size();
            h.f(size, "initialArraySize");
            list = new ArrayList<>(size);
        }
        for (int i10 = 0; i10 < sgVar.size(); i10++) {
            list.add((Object) null);
        }
        this.f7976x = list;
    }

    public final void u(lh.a aVar) {
        super.u(aVar);
        this.f7976x = null;
    }

    public final void x(int i10, @NullableDecl V v10) {
        List<k50<V>> list = this.f7976x;
        if (list != null) {
            list.set(i10, new k50(v10));
        }
    }

    public final void z() {
        List<k50<V>> list = this.f7976x;
        if (list != null) {
            int size = list.size();
            h.f(size, "initialArraySize");
            ArrayList arrayList = new ArrayList(size);
            Iterator<k50<V>> it = list.iterator();
            while (it.hasNext()) {
                k50 next = it.next();
                arrayList.add(next != null ? next.f15240a : null);
            }
            i(Collections.unmodifiableList(arrayList));
        }
    }
}

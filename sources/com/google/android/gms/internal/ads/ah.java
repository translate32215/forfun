package com.google.android.gms.internal.ads;

import e8.d50;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class ah<K> extends vg<K> {

    /* renamed from: d  reason: collision with root package name */
    public final transient wg<K, ?> f5963d;

    /* renamed from: e  reason: collision with root package name */
    public final transient ug<K> f5964e;

    public ah(wg<K, ?> wgVar, ug<K> ugVar) {
        this.f5963d = wgVar;
        this.f5964e = ugVar;
    }

    public final int c(Object[] objArr, int i10) {
        return this.f5964e.c(objArr, i10);
    }

    public final boolean contains(@NullableDecl Object obj) {
        return this.f5963d.get(obj) != null;
    }

    /* renamed from: f */
    public final d50<K> iterator() {
        return (d50) this.f5964e.iterator();
    }

    public final ug<K> o() {
        return this.f5964e;
    }

    public final boolean q() {
        return true;
    }

    public final int size() {
        return ((zg) this.f5963d).f8714f;
    }
}

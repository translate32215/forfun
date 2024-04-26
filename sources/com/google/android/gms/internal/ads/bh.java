package com.google.android.gms.internal.ads;

import e8.d50;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class bh<E> extends vg<E> {

    /* renamed from: i  reason: collision with root package name */
    public static final bh<Object> f6022i = new bh(new Object[0], 0, (Object[]) null, 0, 0);

    /* renamed from: d  reason: collision with root package name */
    public final transient Object[] f6023d;

    /* renamed from: e  reason: collision with root package name */
    public final transient Object[] f6024e;

    /* renamed from: f  reason: collision with root package name */
    public final transient int f6025f;

    /* renamed from: g  reason: collision with root package name */
    public final transient int f6026g;

    /* renamed from: h  reason: collision with root package name */
    public final transient int f6027h;

    public bh(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f6023d = objArr;
        this.f6024e = objArr2;
        this.f6025f = i11;
        this.f6026g = i10;
        this.f6027h = i12;
    }

    public final int c(Object[] objArr, int i10) {
        System.arraycopy(this.f6023d, 0, objArr, i10, this.f6027h);
        return i10 + this.f6027h;
    }

    public final boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.f6024e;
        if (obj == null || objArr == null) {
            return false;
        }
        int r10 = g7.r(obj.hashCode());
        while (true) {
            int i10 = r10 & this.f6025f;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            r10 = i10 + 1;
        }
    }

    /* renamed from: f */
    public final d50<E> iterator() {
        return (d50) o().iterator();
    }

    public final Object[] h() {
        return this.f6023d;
    }

    public final int hashCode() {
        return this.f6026g;
    }

    public final int i() {
        return 0;
    }

    public final int j() {
        return this.f6027h;
    }

    public final boolean q() {
        return false;
    }

    public final int size() {
        return this.f6027h;
    }

    public final ug<E> z() {
        return ug.z(this.f6023d, this.f6027h);
    }
}

package com.google.android.gms.internal.ads;

import e.h;
import e8.o40;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public class tg<E> extends o40<E> {

    /* renamed from: a  reason: collision with root package name */
    public Object[] f8201a;

    /* renamed from: b  reason: collision with root package name */
    public int f8202b = 0;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8203c;

    public tg(int i10) {
        h.f(i10, "initialCapacity");
        this.f8201a = new Object[i10];
    }

    public tg<E> b(E e10) {
        e10.getClass();
        c(this.f8202b + 1);
        Object[] objArr = this.f8201a;
        int i10 = this.f8202b;
        this.f8202b = i10 + 1;
        objArr[i10] = e10;
        return this;
    }

    public final void c(int i10) {
        Object[] objArr = this.f8201a;
        if (objArr.length < i10) {
            int length = objArr.length;
            if (i10 >= 0) {
                int i11 = length + (length >> 1) + 1;
                if (i11 < i10) {
                    i11 = Integer.highestOneBit(i10 - 1) << 1;
                }
                if (i11 < 0) {
                    i11 = Integer.MAX_VALUE;
                }
                this.f8201a = Arrays.copyOf(objArr, i11);
                this.f8203c = false;
                return;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        } else if (this.f8203c) {
            this.f8201a = (Object[]) objArr.clone();
            this.f8203c = false;
        }
    }

    public o40<E> d(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            c(collection.size() + this.f8202b);
            if (collection instanceof sg) {
                this.f8202b = ((sg) collection).c(this.f8201a, this.f8202b);
                return this;
            }
        }
        for (Object a10 : iterable) {
            a(a10);
        }
        return this;
    }
}

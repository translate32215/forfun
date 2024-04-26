package com.google.android.gms.internal.ads;

import e8.l40;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class kg<T> implements Iterator<T> {

    /* renamed from: a  reason: collision with root package name */
    public int f7247a = 2;
    @NullableDecl

    /* renamed from: b  reason: collision with root package name */
    public T f7248b;

    public final boolean hasNext() {
        T t10;
        int i10;
        int i11 = this.f7247a;
        if (i11 != 4) {
            int i12 = jg.f7151a[i11 - 1];
            if (i12 == 1) {
                return false;
            }
            if (i12 == 2) {
                return true;
            }
            this.f7247a = 4;
            l40 l40 = (l40) this;
            int i13 = l40.f15360e;
            while (true) {
                int i14 = l40.f15360e;
                if (i14 == -1) {
                    l40.f7247a = 3;
                    t10 = null;
                    break;
                }
                int a10 = ((lg) l40.f15362g.f14835b).a(l40.f15358c, i14);
                if (a10 == -1) {
                    a10 = l40.f15358c.length();
                    l40.f15360e = -1;
                } else {
                    l40.f15360e = a10 + 1;
                }
                int i15 = l40.f15360e;
                if (i15 == i13) {
                    int i16 = i15 + 1;
                    l40.f15360e = i16;
                    if (i16 > l40.f15358c.length()) {
                        l40.f15360e = -1;
                    }
                } else {
                    while (i13 < a10 && l40.f15359d.d(l40.f15358c.charAt(i13))) {
                        i13++;
                    }
                    while (i10 > i13) {
                        int i17 = i10 - 1;
                        if (!l40.f15359d.d(l40.f15358c.charAt(i17))) {
                            break;
                        }
                        a10 = i17;
                    }
                    int i18 = l40.f15361f;
                    if (i18 == 1) {
                        i10 = l40.f15358c.length();
                        l40.f15360e = -1;
                        while (i10 > i13) {
                            int i19 = i10 - 1;
                            if (!l40.f15359d.d(l40.f15358c.charAt(i19))) {
                                break;
                            }
                            i10 = i19;
                        }
                    } else {
                        l40.f15361f = i18 - 1;
                    }
                    t10 = l40.f15358c.subSequence(i13, i10).toString();
                }
            }
            this.f7248b = t10;
            if (this.f7247a == 3) {
                return false;
            }
            this.f7247a = 1;
            return true;
        }
        throw new IllegalStateException();
    }

    public final T next() {
        if (hasNext()) {
            this.f7247a = 2;
            T t10 = this.f7248b;
            this.f7248b = null;
            return t10;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

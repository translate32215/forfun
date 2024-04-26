package e8;

import com.google.android.gms.internal.ads.hq;
import com.google.android.gms.internal.ads.mp;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class m90 implements Iterator<k70> {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque<hq> f15473a;

    /* renamed from: b  reason: collision with root package name */
    public k70 f15474b;

    public m90(mp mpVar, l90 l90) {
        if (mpVar instanceof hq) {
            hq hqVar = (hq) mpVar;
            ArrayDeque<hq> arrayDeque = new ArrayDeque<>(hqVar.f6892h);
            this.f15473a = arrayDeque;
            arrayDeque.push(hqVar);
            mp mpVar2 = hqVar.f6889e;
            while (mpVar2 instanceof hq) {
                hq hqVar2 = (hq) mpVar2;
                this.f15473a.push(hqVar2);
                mpVar2 = hqVar2.f6889e;
            }
            this.f15474b = (k70) mpVar2;
            return;
        }
        this.f15473a = null;
        this.f15474b = (k70) mpVar;
    }

    public final boolean hasNext() {
        return this.f15474b != null;
    }

    public final Object next() {
        k70 k70;
        boolean z10;
        k70 k702 = this.f15474b;
        if (k702 != null) {
            while (true) {
                ArrayDeque<hq> arrayDeque = this.f15473a;
                if (arrayDeque != null && !arrayDeque.isEmpty()) {
                    mp mpVar = this.f15473a.pop().f6890f;
                    while (mpVar instanceof hq) {
                        hq hqVar = (hq) mpVar;
                        this.f15473a.push(hqVar);
                        mpVar = hqVar.f6889e;
                    }
                    k70 = (k70) mpVar;
                    if (k70.size() == 0) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (!z10) {
                        break;
                    }
                } else {
                    k70 = null;
                }
            }
            this.f15474b = k70;
            return k702;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

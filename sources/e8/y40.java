package e8;

import com.google.android.gms.internal.ads.pg;
import com.google.android.gms.internal.ads.ug;
import java.util.AbstractMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class y40 extends ug<Map.Entry<K, V>> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ z40 f17576c;

    public y40(z40 z40) {
        this.f17576c = z40;
    }

    public final /* synthetic */ Object get(int i10) {
        pg.f(i10, this.f17576c.f17691f);
        Object[] objArr = this.f17576c.f17690e;
        int i11 = i10 * 2;
        return new AbstractMap.SimpleImmutableEntry(objArr[i11], objArr[i11 + 1]);
    }

    public final boolean q() {
        return true;
    }

    public final int size() {
        return this.f17576c.f17691f;
    }
}

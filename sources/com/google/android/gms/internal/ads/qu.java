package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.o;
import d7.l;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import l0.e;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class qu {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7997a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public int f7998b;

    /* renamed from: c  reason: collision with root package name */
    public List<ou> f7999c = new LinkedList();

    public final boolean a(ou ouVar) {
        synchronized (this.f7997a) {
            Iterator<ou> it = this.f7999c.iterator();
            while (it.hasNext()) {
                ou next = it.next();
                if (!((o) l.B.f13190g.f()).x()) {
                    if (ouVar != next && next.f7750o.equals(ouVar.f7750o)) {
                        it.remove();
                        return true;
                    }
                } else if (!((o) l.B.f13190g.f()).y() && ouVar != next && next.f7752q.equals(ouVar.f7752q)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final void b(ou ouVar) {
        int i10;
        synchronized (this.f7997a) {
            if (this.f7999c.size() >= 10) {
                int size = this.f7999c.size();
                StringBuilder sb2 = new StringBuilder(41);
                sb2.append("Queue is full, current size = ");
                sb2.append(size);
                e.E(sb2.toString());
                this.f7999c.remove(0);
            }
            int i11 = this.f7998b;
            this.f7998b = i11 + 1;
            ouVar.f7747l = i11;
            synchronized (ouVar.f7742g) {
                int i12 = ouVar.f7746k;
                int i13 = ouVar.f7747l;
                if (ouVar.f7739d) {
                    i10 = ouVar.f7737b;
                } else {
                    i10 = (i12 * ouVar.f7736a) + (i13 * ouVar.f7737b);
                }
                if (i10 > ouVar.f7749n) {
                    ouVar.f7749n = i10;
                }
            }
            this.f7999c.add(ouVar);
        }
    }
}

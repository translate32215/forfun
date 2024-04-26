package e8;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.a;
import com.google.android.gms.internal.ads.gx;
import com.google.android.gms.internal.ads.vt;
import com.google.android.gms.internal.ads.wx;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class o1 {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f15726a = new AtomicInteger();

    /* renamed from: b  reason: collision with root package name */
    public final Set<a<?>> f15727b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public final PriorityBlockingQueue<a<?>> f15728c = new PriorityBlockingQueue<>();

    /* renamed from: d  reason: collision with root package name */
    public final PriorityBlockingQueue<a<?>> f15729d = new PriorityBlockingQueue<>();

    /* renamed from: e  reason: collision with root package name */
    public final gd0 f15730e;

    /* renamed from: f  reason: collision with root package name */
    public final wx f15731f;

    /* renamed from: g  reason: collision with root package name */
    public final y10 f15732g;

    /* renamed from: h  reason: collision with root package name */
    public final gx[] f15733h;

    /* renamed from: i  reason: collision with root package name */
    public vt f15734i;

    /* renamed from: j  reason: collision with root package name */
    public final List<a2> f15735j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public final List<m2> f15736k = new ArrayList();

    public o1(gd0 gd0, wx wxVar) {
        y10 y10 = new y10(new Handler(Looper.getMainLooper()));
        this.f15730e = gd0;
        this.f15731f = wxVar;
        this.f15733h = new gx[4];
        this.f15732g = y10;
    }

    public final void a() {
        vt vtVar = this.f15734i;
        if (vtVar != null) {
            vtVar.f8411e = true;
            vtVar.interrupt();
        }
        for (gx gxVar : this.f15733h) {
            if (gxVar != null) {
                gxVar.f6724e = true;
                gxVar.interrupt();
            }
        }
        vt vtVar2 = new vt(this.f15728c, this.f15729d, this.f15730e, this.f15732g);
        this.f15734i = vtVar2;
        vtVar2.start();
        for (int i10 = 0; i10 < this.f15733h.length; i10++) {
            gx gxVar2 = new gx(this.f15729d, this.f15731f, this.f15730e, this.f15732g);
            this.f15733h[i10] = gxVar2;
            gxVar2.start();
        }
    }

    public final void b(a<?> aVar, int i10) {
        synchronized (this.f15736k) {
            for (m2 a10 : this.f15736k) {
                a10.a(aVar, i10);
            }
        }
    }

    public final <T> a<T> c(a<T> aVar) {
        aVar.f5927h = this;
        synchronized (this.f15727b) {
            this.f15727b.add(aVar);
        }
        aVar.f5926g = Integer.valueOf(this.f15726a.incrementAndGet());
        aVar.m("add-to-queue");
        b(aVar, 0);
        if (!aVar.f5928i) {
            this.f15729d.add(aVar);
            return aVar;
        }
        this.f15728c.add(aVar);
        return aVar;
    }
}

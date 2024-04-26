package m3;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.data.e;
import h4.a;
import h4.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m3.g;
import m3.j;
import m3.l;
import m3.m;
import m3.q;
import t3.l;

/* compiled from: DecodeJob */
public class i<R> implements g.a, Runnable, Comparable<i<?>>, a.d {
    public f A;
    public long B;
    public boolean C;
    public Object D;
    public Thread E;
    public k3.c F;
    public k3.c G;
    public Object H;
    public com.bumptech.glide.load.a I;
    public com.bumptech.glide.load.data.d<?> J;
    public volatile g K;
    public volatile boolean L;
    public volatile boolean M;
    public boolean N;

    /* renamed from: a  reason: collision with root package name */
    public final h<R> f21546a = new h<>();

    /* renamed from: b  reason: collision with root package name */
    public final List<Throwable> f21547b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final h4.d f21548c = new d.b();

    /* renamed from: d  reason: collision with root package name */
    public final d f21549d;

    /* renamed from: e  reason: collision with root package name */
    public final n0.d<i<?>> f21550e;

    /* renamed from: f  reason: collision with root package name */
    public final c<?> f21551f = new c<>();

    /* renamed from: g  reason: collision with root package name */
    public final e f21552g = new e();

    /* renamed from: h  reason: collision with root package name */
    public com.bumptech.glide.d f21553h;

    /* renamed from: i  reason: collision with root package name */
    public k3.c f21554i;

    /* renamed from: r  reason: collision with root package name */
    public com.bumptech.glide.f f21555r;

    /* renamed from: s  reason: collision with root package name */
    public o f21556s;

    /* renamed from: t  reason: collision with root package name */
    public int f21557t;

    /* renamed from: u  reason: collision with root package name */
    public int f21558u;

    /* renamed from: v  reason: collision with root package name */
    public k f21559v;

    /* renamed from: w  reason: collision with root package name */
    public k3.e f21560w;

    /* renamed from: x  reason: collision with root package name */
    public a<R> f21561x;

    /* renamed from: y  reason: collision with root package name */
    public int f21562y;

    /* renamed from: z  reason: collision with root package name */
    public g f21563z;

    /* compiled from: DecodeJob */
    public interface a<R> {
    }

    /* compiled from: DecodeJob */
    public final class b<Z> implements j.a<Z> {

        /* renamed from: a  reason: collision with root package name */
        public final com.bumptech.glide.load.a f21564a;

        public b(com.bumptech.glide.load.a aVar) {
            this.f21564a = aVar;
        }
    }

    /* compiled from: DecodeJob */
    public static class c<Z> {

        /* renamed from: a  reason: collision with root package name */
        public k3.c f21566a;

        /* renamed from: b  reason: collision with root package name */
        public k3.f<Z> f21567b;

        /* renamed from: c  reason: collision with root package name */
        public v<Z> f21568c;
    }

    /* compiled from: DecodeJob */
    public interface d {
    }

    /* compiled from: DecodeJob */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public boolean f21569a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f21570b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f21571c;

        public final boolean a(boolean z10) {
            return (this.f21571c || z10 || this.f21570b) && this.f21569a;
        }
    }

    /* compiled from: DecodeJob */
    public enum f {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* compiled from: DecodeJob */
    public enum g {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public i(d dVar, n0.d<i<?>> dVar2) {
        this.f21549d = dVar;
        this.f21550e = dVar2;
    }

    public void a() {
        this.A = f.SWITCH_TO_SOURCE_SERVICE;
        ((m) this.f21561x).i(this);
    }

    public void b(k3.c cVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, com.bumptech.glide.load.a aVar, k3.c cVar2) {
        this.F = cVar;
        this.H = obj;
        this.J = dVar;
        this.I = aVar;
        this.G = cVar2;
        boolean z10 = false;
        if (cVar != this.f21546a.a().get(0)) {
            z10 = true;
        }
        this.N = z10;
        if (Thread.currentThread() != this.E) {
            this.A = f.DECODE_DATA;
            ((m) this.f21561x).i(this);
            return;
        }
        o();
    }

    public void c(k3.c cVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, com.bumptech.glide.load.a aVar) {
        dVar.b();
        r rVar = new r("Fetching data failed", (Throwable) exc);
        Class<?> a10 = dVar.a();
        rVar.f21659b = cVar;
        rVar.f21660c = aVar;
        rVar.f21661d = a10;
        this.f21547b.add(rVar);
        if (Thread.currentThread() != this.E) {
            this.A = f.SWITCH_TO_SOURCE_SERVICE;
            ((m) this.f21561x).i(this);
            return;
        }
        v();
    }

    public int compareTo(Object obj) {
        i iVar = (i) obj;
        int ordinal = this.f21555r.ordinal() - iVar.f21555r.ordinal();
        return ordinal == 0 ? this.f21562y - iVar.f21562y : ordinal;
    }

    public h4.d f() {
        return this.f21548c;
    }

    public final <Data> w<R> i(com.bumptech.glide.load.data.d<?> dVar, Data data, com.bumptech.glide.load.a aVar) throws r {
        if (data == null) {
            dVar.b();
            return null;
        }
        try {
            int i10 = g4.f.f18457b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            w<R> m10 = m(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                s("Decoded result " + m10, elapsedRealtimeNanos, (String) null);
            }
            return m10;
        } finally {
            dVar.b();
        }
    }

    public final <Data> w<R> m(Data data, com.bumptech.glide.load.a aVar) throws r {
        com.bumptech.glide.load.data.e<?> b10;
        u<Data, ?, R> d10 = this.f21546a.d(data.getClass());
        k3.e eVar = this.f21560w;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z10 = aVar == com.bumptech.glide.load.a.RESOURCE_DISK_CACHE || this.f21546a.f21545r;
            k3.d dVar = l.f25639i;
            Boolean bool = (Boolean) eVar.c(dVar);
            if (bool == null || (bool.booleanValue() && !z10)) {
                eVar = new k3.e();
                eVar.d(this.f21560w);
                eVar.f19893b.put(dVar, Boolean.valueOf(z10));
            }
        }
        k3.e eVar2 = eVar;
        com.bumptech.glide.load.data.f fVar = this.f21553h.f4909b.f4929e;
        synchronized (fVar) {
            e.a<?> aVar2 = fVar.f4975a.get(data.getClass());
            if (aVar2 == null) {
                Iterator<e.a<?>> it = fVar.f4975a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a<?> next = it.next();
                    if (next.a().isAssignableFrom(data.getClass())) {
                        aVar2 = next;
                        break;
                    }
                }
            }
            if (aVar2 == null) {
                aVar2 = com.bumptech.glide.load.data.f.f4974b;
            }
            b10 = aVar2.b(data);
        }
        try {
            return d10.a(b10, eVar2, this.f21557t, this.f21558u, new b(aVar));
        } finally {
            b10.b();
        }
    }

    public final void o() {
        w<R> wVar;
        c<?> cVar;
        boolean a10;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j10 = this.B;
            StringBuilder a11 = android.support.v4.media.a.a("data: ");
            a11.append(this.H);
            a11.append(", cache key: ");
            a11.append(this.F);
            a11.append(", fetcher: ");
            a11.append(this.J);
            s("Retrieved data", j10, a11.toString());
        }
        v<R> vVar = null;
        try {
            wVar = i(this.J, this.H, this.I);
        } catch (r e10) {
            k3.c cVar2 = this.G;
            com.bumptech.glide.load.a aVar = this.I;
            e10.f21659b = cVar2;
            e10.f21660c = aVar;
            e10.f21661d = null;
            this.f21547b.add(e10);
            wVar = null;
        }
        if (wVar != null) {
            com.bumptech.glide.load.a aVar2 = this.I;
            boolean z10 = this.N;
            if (wVar instanceof s) {
                ((s) wVar).P();
            }
            if (this.f21551f.f21568c != null) {
                vVar = v.d(wVar);
                wVar = vVar;
            }
            x();
            m mVar = (m) this.f21561x;
            synchronized (mVar) {
                mVar.f21632y = wVar;
                mVar.f21633z = aVar2;
                mVar.G = z10;
            }
            synchronized (mVar) {
                mVar.f21617b.a();
                if (mVar.F) {
                    mVar.f21632y.c();
                    mVar.g();
                } else if (mVar.f21616a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                } else if (!mVar.A) {
                    m.c cVar3 = mVar.f21620e;
                    w<?> wVar2 = mVar.f21632y;
                    boolean z11 = mVar.f21628u;
                    k3.c cVar4 = mVar.f21627t;
                    q.a aVar3 = mVar.f21618c;
                    cVar3.getClass();
                    mVar.D = new q(wVar2, z11, true, cVar4, aVar3);
                    mVar.A = true;
                    m.e eVar = mVar.f21616a;
                    eVar.getClass();
                    ArrayList arrayList = new ArrayList(eVar.f21640a);
                    mVar.d(arrayList.size() + 1);
                    k3.c cVar5 = mVar.f21627t;
                    q<?> qVar = mVar.D;
                    ((l) mVar.f21621f).e(mVar, cVar5, qVar);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        m.d dVar = (m.d) it.next();
                        dVar.f21639b.execute(new m.b(dVar.f21638a));
                    }
                    mVar.c();
                } else {
                    throw new IllegalStateException("Already have resource");
                }
            }
            this.f21563z = g.ENCODE;
            try {
                cVar = this.f21551f;
                if (cVar.f21568c != null) {
                    ((l.c) this.f21549d).a().a(cVar.f21566a, new f(cVar.f21567b, cVar.f21568c, this.f21560w));
                    cVar.f21568c.e();
                }
                if (vVar != null) {
                    vVar.e();
                }
                e eVar2 = this.f21552g;
                synchronized (eVar2) {
                    eVar2.f21570b = true;
                    a10 = eVar2.a(false);
                }
                if (a10) {
                    u();
                }
            } catch (Throwable th) {
                if (vVar != null) {
                    vVar.e();
                }
                throw th;
            }
        } else {
            v();
        }
    }

    public final g q() {
        int ordinal = this.f21563z.ordinal();
        if (ordinal == 1) {
            return new x(this.f21546a, this);
        }
        if (ordinal == 2) {
            return new d(this.f21546a, this);
        }
        if (ordinal == 3) {
            return new b0(this.f21546a, this);
        }
        if (ordinal == 5) {
            return null;
        }
        StringBuilder a10 = android.support.v4.media.a.a("Unrecognized stage: ");
        a10.append(this.f21563z);
        throw new IllegalStateException(a10.toString());
    }

    public final g r(g gVar) {
        g gVar2 = g.RESOURCE_CACHE;
        g gVar3 = g.DATA_CACHE;
        g gVar4 = g.FINISHED;
        int ordinal = gVar.ordinal();
        if (ordinal == 0) {
            return this.f21559v.b() ? gVar2 : r(gVar2);
        }
        if (ordinal == 1) {
            return this.f21559v.a() ? gVar3 : r(gVar3);
        }
        if (ordinal == 2) {
            return this.C ? gVar4 : g.SOURCE;
        }
        if (ordinal == 3 || ordinal == 5) {
            return gVar4;
        }
        throw new IllegalArgumentException("Unrecognized stage: " + gVar);
    }

    public void run() {
        com.bumptech.glide.load.data.d<?> dVar = this.J;
        try {
            if (this.M) {
                t();
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            w();
            if (dVar != null) {
                dVar.b();
            }
        } catch (c e10) {
            throw e10;
        } catch (Throwable th) {
            if (dVar != null) {
                dVar.b();
            }
            throw th;
        }
    }

    public final void s(String str, long j10, String str2) {
        StringBuilder a10 = t.f.a(str, " in ");
        a10.append(g4.f.a(j10));
        a10.append(", load key: ");
        a10.append(this.f21556s);
        a10.append(str2 != null ? j.f.a(", ", str2) : "");
        a10.append(", thread: ");
        a10.append(Thread.currentThread().getName());
        Log.v("DecodeJob", a10.toString());
    }

    public final void t() {
        boolean a10;
        x();
        r rVar = new r("Failed to load resource", (List<Throwable>) new ArrayList(this.f21547b));
        m mVar = (m) this.f21561x;
        synchronized (mVar) {
            mVar.B = rVar;
        }
        synchronized (mVar) {
            mVar.f21617b.a();
            if (mVar.F) {
                mVar.g();
            } else if (mVar.f21616a.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            } else if (!mVar.C) {
                mVar.C = true;
                k3.c cVar = mVar.f21627t;
                m.e eVar = mVar.f21616a;
                eVar.getClass();
                ArrayList arrayList = new ArrayList(eVar.f21640a);
                mVar.d(arrayList.size() + 1);
                ((l) mVar.f21621f).e(mVar, cVar, (q<?>) null);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m.d dVar = (m.d) it.next();
                    dVar.f21639b.execute(new m.a(dVar.f21638a));
                }
                mVar.c();
            } else {
                throw new IllegalStateException("Already failed once");
            }
        }
        e eVar2 = this.f21552g;
        synchronized (eVar2) {
            eVar2.f21571c = true;
            a10 = eVar2.a(false);
        }
        if (a10) {
            u();
        }
    }

    public final void u() {
        e eVar = this.f21552g;
        synchronized (eVar) {
            eVar.f21570b = false;
            eVar.f21569a = false;
            eVar.f21571c = false;
        }
        c<?> cVar = this.f21551f;
        cVar.f21566a = null;
        cVar.f21567b = null;
        cVar.f21568c = null;
        h<R> hVar = this.f21546a;
        hVar.f21530c = null;
        hVar.f21531d = null;
        hVar.f21541n = null;
        hVar.f21534g = null;
        hVar.f21538k = null;
        hVar.f21536i = null;
        hVar.f21542o = null;
        hVar.f21537j = null;
        hVar.f21543p = null;
        hVar.f21528a.clear();
        hVar.f21539l = false;
        hVar.f21529b.clear();
        hVar.f21540m = false;
        this.L = false;
        this.f21553h = null;
        this.f21554i = null;
        this.f21560w = null;
        this.f21555r = null;
        this.f21556s = null;
        this.f21561x = null;
        this.f21563z = null;
        this.K = null;
        this.E = null;
        this.F = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.B = 0;
        this.M = false;
        this.D = null;
        this.f21547b.clear();
        this.f21550e.a(this);
    }

    public final void v() {
        this.E = Thread.currentThread();
        int i10 = g4.f.f18457b;
        this.B = SystemClock.elapsedRealtimeNanos();
        boolean z10 = false;
        while (!this.M && this.K != null && !(z10 = this.K.e())) {
            this.f21563z = r(this.f21563z);
            this.K = q();
            if (this.f21563z == g.SOURCE) {
                this.A = f.SWITCH_TO_SOURCE_SERVICE;
                ((m) this.f21561x).i(this);
                return;
            }
        }
        if ((this.f21563z == g.FINISHED || this.M) && !z10) {
            t();
        }
    }

    public final void w() {
        int ordinal = this.A.ordinal();
        if (ordinal == 0) {
            this.f21563z = r(g.INITIALIZE);
            this.K = q();
            v();
        } else if (ordinal == 1) {
            v();
        } else if (ordinal == 2) {
            o();
        } else {
            StringBuilder a10 = android.support.v4.media.a.a("Unrecognized run reason: ");
            a10.append(this.A);
            throw new IllegalStateException(a10.toString());
        }
    }

    public final void x() {
        Throwable th;
        this.f21548c.a();
        if (this.L) {
            if (this.f21547b.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.f21547b;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.L = true;
    }
}

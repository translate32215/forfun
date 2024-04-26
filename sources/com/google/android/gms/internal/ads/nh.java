package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.gh;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class nh<OutputT> extends gh.i<OutputT> {

    /* renamed from: r  reason: collision with root package name */
    public static final a f7583r;

    /* renamed from: s  reason: collision with root package name */
    public static final Logger f7584s = Logger.getLogger(nh.class.getName());

    /* renamed from: h  reason: collision with root package name */
    public volatile Set<Throwable> f7585h = null;

    /* renamed from: i  reason: collision with root package name */
    public volatile int f7586i;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static abstract class a {
        public a(u.b bVar) {
        }

        public abstract void a(nh nhVar, Set<Throwable> set, Set<Throwable> set2);

        public abstract int b(nh nhVar);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class b extends a {
        public b(u.b bVar) {
            super((u.b) null);
        }

        public final void a(nh nhVar, Set<Throwable> set, Set<Throwable> set2) {
            synchronized (nhVar) {
                if (nhVar.f7585h == null) {
                    nhVar.f7585h = set2;
                }
            }
        }

        public final int b(nh nhVar) {
            int i10;
            synchronized (nhVar) {
                i10 = nhVar.f7586i - 1;
                nhVar.f7586i = i10;
            }
            return i10;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class c extends a {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<nh, Set<Throwable>> f7587a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicIntegerFieldUpdater<nh> f7588b;

        public c(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super((u.b) null);
            this.f7587a = atomicReferenceFieldUpdater;
            this.f7588b = atomicIntegerFieldUpdater;
        }

        public final void a(nh nhVar, Set<Throwable> set, Set<Throwable> set2) {
            this.f7587a.compareAndSet(nhVar, (Object) null, set2);
        }

        public final int b(nh nhVar) {
            return this.f7588b.decrementAndGet(nhVar);
        }
    }

    static {
        Throwable th;
        a aVar;
        try {
            aVar = new c(AtomicReferenceFieldUpdater.newUpdater(nh.class, Set.class, "h"), AtomicIntegerFieldUpdater.newUpdater(nh.class, "i"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            aVar = new b((u.b) null);
        }
        f7583r = aVar;
        if (th != null) {
            f7584s.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public nh(int i10) {
        this.f7586i = i10;
    }
}

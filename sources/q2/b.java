package q2;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: AbstractFuture */
public abstract class b<V> implements ea.a<V> {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f24034d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e  reason: collision with root package name */
    public static final Logger f24035e = Logger.getLogger(b.class.getName());

    /* renamed from: f  reason: collision with root package name */
    public static final C0218b f24036f;

    /* renamed from: g  reason: collision with root package name */
    public static final Object f24037g = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f24038a;

    /* renamed from: b  reason: collision with root package name */
    public volatile e f24039b;

    /* renamed from: c  reason: collision with root package name */
    public volatile i f24040c;

    /* renamed from: q2.b$b  reason: collision with other inner class name */
    /* compiled from: AbstractFuture */
    public static abstract class C0218b {
        public C0218b(a aVar) {
        }

        public abstract boolean a(b<?> bVar, e eVar, e eVar2);

        public abstract boolean b(b<?> bVar, Object obj, Object obj2);

        public abstract boolean c(b<?> bVar, i iVar, i iVar2);

        public abstract void d(i iVar, i iVar2);

        public abstract void e(i iVar, Thread thread);
    }

    /* compiled from: AbstractFuture */
    public static final class c {

        /* renamed from: c  reason: collision with root package name */
        public static final c f24041c;

        /* renamed from: d  reason: collision with root package name */
        public static final c f24042d;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f24043a;

        /* renamed from: b  reason: collision with root package name */
        public final Throwable f24044b;

        static {
            if (b.f24034d) {
                f24042d = null;
                f24041c = null;
                return;
            }
            f24042d = new c(false, (Throwable) null);
            f24041c = new c(true, (Throwable) null);
        }

        public c(boolean z10, Throwable th) {
            this.f24043a = z10;
            this.f24044b = th;
        }
    }

    /* compiled from: AbstractFuture */
    public static final class d {

        /* renamed from: b  reason: collision with root package name */
        public static final d f24045b = new d(new a("Failure occurred while trying to finish a future."));

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f24046a;

        /* compiled from: AbstractFuture */
        public static class a extends Throwable {
            public a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th) {
            boolean z10 = b.f24034d;
            th.getClass();
            this.f24046a = th;
        }
    }

    /* compiled from: AbstractFuture */
    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        public static final e f24047d = new e((Runnable) null, (Executor) null);

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f24048a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f24049b;

        /* renamed from: c  reason: collision with root package name */
        public e f24050c;

        public e(Runnable runnable, Executor executor) {
            this.f24048a = runnable;
            this.f24049b = executor;
        }
    }

    /* compiled from: AbstractFuture */
    public static final class f extends C0218b {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<i, Thread> f24051a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<i, i> f24052b;

        /* renamed from: c  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<b, i> f24053c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<b, e> f24054d;

        /* renamed from: e  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<b, Object> f24055e;

        public f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<b, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<b, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<b, Object> atomicReferenceFieldUpdater5) {
            super((a) null);
            this.f24051a = atomicReferenceFieldUpdater;
            this.f24052b = atomicReferenceFieldUpdater2;
            this.f24053c = atomicReferenceFieldUpdater3;
            this.f24054d = atomicReferenceFieldUpdater4;
            this.f24055e = atomicReferenceFieldUpdater5;
        }

        public boolean a(b<?> bVar, e eVar, e eVar2) {
            return this.f24054d.compareAndSet(bVar, eVar, eVar2);
        }

        public boolean b(b<?> bVar, Object obj, Object obj2) {
            return this.f24055e.compareAndSet(bVar, obj, obj2);
        }

        public boolean c(b<?> bVar, i iVar, i iVar2) {
            return this.f24053c.compareAndSet(bVar, iVar, iVar2);
        }

        public void d(i iVar, i iVar2) {
            this.f24052b.lazySet(iVar, iVar2);
        }

        public void e(i iVar, Thread thread) {
            this.f24051a.lazySet(iVar, thread);
        }
    }

    /* compiled from: AbstractFuture */
    public static final class g<V> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final b<V> f24056a;

        /* renamed from: b  reason: collision with root package name */
        public final ea.a<? extends V> f24057b;

        public g(b<V> bVar, ea.a<? extends V> aVar) {
            this.f24056a = bVar;
            this.f24057b = aVar;
        }

        public void run() {
            if (this.f24056a.f24038a == this) {
                if (b.f24036f.b(this.f24056a, this, b.f(this.f24057b))) {
                    b.c(this.f24056a);
                }
            }
        }
    }

    /* compiled from: AbstractFuture */
    public static final class h extends C0218b {
        public h() {
            super((a) null);
        }

        public boolean a(b<?> bVar, e eVar, e eVar2) {
            synchronized (bVar) {
                if (bVar.f24039b != eVar) {
                    return false;
                }
                bVar.f24039b = eVar2;
                return true;
            }
        }

        public boolean b(b<?> bVar, Object obj, Object obj2) {
            synchronized (bVar) {
                if (bVar.f24038a != obj) {
                    return false;
                }
                bVar.f24038a = obj2;
                return true;
            }
        }

        public boolean c(b<?> bVar, i iVar, i iVar2) {
            synchronized (bVar) {
                if (bVar.f24040c != iVar) {
                    return false;
                }
                bVar.f24040c = iVar2;
                return true;
            }
        }

        public void d(i iVar, i iVar2) {
            iVar.f24060b = iVar2;
        }

        public void e(i iVar, Thread thread) {
            iVar.f24059a = thread;
        }
    }

    /* compiled from: AbstractFuture */
    public static final class i {

        /* renamed from: c  reason: collision with root package name */
        public static final i f24058c = new i(false);

        /* renamed from: a  reason: collision with root package name */
        public volatile Thread f24059a;

        /* renamed from: b  reason: collision with root package name */
        public volatile i f24060b;

        public i(boolean z10) {
        }

        public i() {
            b.f24036f.e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: q2.b$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: q2.b$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: q2.b$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: q2.b$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<q2.b$i> r0 = q2.b.i.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f24034d = r1
            java.lang.Class<q2.b> r1 = q2.b.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f24035e = r1
            q2.b$f r1 = new q2.b$f     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<q2.b> r2 = q2.b.class
            java.lang.String r5 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<q2.b> r0 = q2.b.class
            java.lang.Class<q2.b$e> r2 = q2.b.e.class
            java.lang.String r6 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<q2.b> r0 = q2.b.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            q2.b$h r1 = new q2.b$h
            r1.<init>()
        L_0x0054:
            f24036f = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = f24035e
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f24037g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.b.<clinit>():void");
    }

    public static void c(b<?> bVar) {
        b<V> bVar2;
        e eVar;
        e eVar2;
        e eVar3 = null;
        b<?> bVar3 = bVar;
        while (true) {
            i iVar = bVar3.f24040c;
            if (f24036f.c(bVar3, iVar, i.f24058c)) {
                while (iVar != null) {
                    Thread thread = iVar.f24059a;
                    if (thread != null) {
                        iVar.f24059a = null;
                        LockSupport.unpark(thread);
                    }
                    iVar = iVar.f24060b;
                }
                do {
                    eVar = bVar3.f24039b;
                } while (!f24036f.a(bVar3, eVar, e.f24047d));
                while (true) {
                    eVar2 = eVar3;
                    eVar3 = eVar;
                    if (eVar3 == null) {
                        break;
                    }
                    eVar = eVar3.f24050c;
                    eVar3.f24050c = eVar2;
                }
                while (eVar2 != null) {
                    eVar3 = eVar2.f24050c;
                    Runnable runnable = eVar2.f24048a;
                    if (runnable instanceof g) {
                        g gVar = (g) runnable;
                        b<V> bVar4 = gVar.f24056a;
                        if (bVar4.f24038a == gVar) {
                            if (f24036f.b(bVar4, gVar, f(gVar.f24057b))) {
                                bVar2 = bVar4;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, eVar2.f24049b);
                    }
                    eVar2 = eVar3;
                }
                return;
            }
            bVar2 = bVar3;
            bVar3 = bVar2;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f24035e;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e10);
        }
    }

    public static Object f(ea.a<?> aVar) {
        if (aVar instanceof b) {
            Object obj = ((b) aVar).f24038a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (cVar.f24043a) {
                return cVar.f24044b != null ? new c(false, cVar.f24044b) : c.f24042d;
            }
            return obj;
        }
        boolean z10 = ((b) aVar).f24038a instanceof c;
        if ((!f24034d) && z10) {
            return c.f24042d;
        }
        try {
            Object g10 = g(aVar);
            return g10 == null ? f24037g : g10;
        } catch (ExecutionException e10) {
            return new d(e10.getCause());
        } catch (CancellationException e11) {
            if (z10) {
                return new c(false, e11);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e11));
        } catch (Throwable th) {
            return new d(th);
        }
    }

    public static <V> V g(Future<V> future) throws ExecutionException {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = ((b) future).get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        e eVar = this.f24039b;
        if (eVar != e.f24047d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f24050c = eVar;
                if (!f24036f.a(this, eVar, eVar2)) {
                    eVar = this.f24039b;
                } else {
                    return;
                }
            } while (eVar != e.f24047d);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb2) {
        String str;
        try {
            Object g10 = g(this);
            sb2.append("SUCCESS, result=[");
            if (g10 == this) {
                str = "this future";
            } else {
                str = String.valueOf(g10);
            }
            sb2.append(str);
            sb2.append("]");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [ea.a<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f24038a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof q2.b.g
            r3 = r3 | r4
            if (r3 == 0) goto L_0x005e
            boolean r3 = f24034d
            if (r3 == 0) goto L_0x001f
            q2.b$c r3 = new q2.b$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            q2.b$c r3 = q2.b.c.f24041c
            goto L_0x0026
        L_0x0024:
            q2.b$c r3 = q2.b.c.f24042d
        L_0x0026:
            r5 = 0
            r4 = r7
        L_0x0028:
            q2.b$b r6 = f24036f
            boolean r6 = r6.b(r4, r0, r3)
            if (r6 == 0) goto L_0x0056
            c(r4)
            boolean r4 = r0 instanceof q2.b.g
            if (r4 == 0) goto L_0x005f
            q2.b$g r0 = (q2.b.g) r0
            ea.a<? extends V> r0 = r0.f24057b
            boolean r4 = r0 instanceof q2.b
            if (r4 == 0) goto L_0x0050
            r4 = r0
            q2.b r4 = (q2.b) r4
            java.lang.Object r0 = r4.f24038a
            if (r0 != 0) goto L_0x0048
            r5 = 1
            goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            boolean r6 = r0 instanceof q2.b.g
            r5 = r5 | r6
            if (r5 == 0) goto L_0x005f
            r5 = 1
            goto L_0x0028
        L_0x0050:
            q2.b r0 = (q2.b) r0
            r0.cancel(r8)
            goto L_0x005f
        L_0x0056:
            java.lang.Object r0 = r4.f24038a
            boolean r6 = r0 instanceof q2.b.g
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x005f
        L_0x005e:
            r1 = 0
        L_0x005f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.b.cancel(boolean):boolean");
    }

    public final V e(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            Throwable th = ((c) obj).f24044b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f24046a);
        } else if (obj == f24037g) {
            return null;
        } else {
            return obj;
        }
    }

    public final V get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f24038a;
            if ((obj != null) && (!(obj instanceof g))) {
                return e(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                i iVar = this.f24040c;
                if (iVar != i.f24058c) {
                    i iVar2 = new i();
                    do {
                        C0218b bVar = f24036f;
                        bVar.d(iVar2, iVar);
                        if (bVar.c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f24038a;
                                    if ((obj2 != null) && (!(obj2 instanceof g))) {
                                        return e(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    i(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            i(iVar2);
                        } else {
                            iVar = this.f24040c;
                        }
                    } while (iVar != i.f24058c);
                }
                return e(this.f24038a);
            }
            while (nanos > 0) {
                Object obj3 = this.f24038a;
                if ((obj3 != null) && (!(obj3 instanceof g))) {
                    return e(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String bVar2 = toString();
            String timeUnit2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = timeUnit2.toLowerCase(locale);
            String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String a10 = j.f.a(str, " (plus ");
                long j11 = -nanos;
                long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
                long nanos2 = j11 - timeUnit.toNanos(convert);
                boolean z10 = convert == 0 || nanos2 > 1000;
                if (convert > 0) {
                    String str2 = a10 + convert + " " + lowerCase;
                    if (z10) {
                        str2 = j.f.a(str2, ",");
                    }
                    a10 = j.f.a(str2, " ");
                }
                if (z10) {
                    a10 = a.a(a10, nanos2, " nanoseconds ");
                }
                str = j.f.a(a10, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(j.f.a(str, " but future completed as timeout expired"));
            }
            throw new TimeoutException(q.b.a(str, " for ", bVar2));
        }
        throw new InterruptedException();
    }

    public String h() {
        String str;
        Object obj = this.f24038a;
        if (obj instanceof g) {
            StringBuilder a10 = android.support.v4.media.a.a("setFuture=[");
            ea.a<? extends V> aVar = ((g) obj).f24057b;
            if (aVar == this) {
                str = "this future";
            } else {
                str = String.valueOf(aVar);
            }
            return androidx.activity.e.a(a10, str, "]");
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            StringBuilder a11 = android.support.v4.media.a.a("remaining delay=[");
            a11.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            a11.append(" ms]");
            return a11.toString();
        }
    }

    public final void i(i iVar) {
        iVar.f24059a = null;
        while (true) {
            i iVar2 = this.f24040c;
            if (iVar2 != i.f24058c) {
                i iVar3 = null;
                while (iVar2 != null) {
                    i iVar4 = iVar2.f24060b;
                    if (iVar2.f24059a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.f24060b = iVar4;
                        if (iVar3.f24059a == null) {
                        }
                    } else if (!f24036f.c(this, iVar2, iVar4)) {
                    }
                    iVar2 = iVar4;
                }
                return;
            }
            return;
        }
    }

    public final boolean isCancelled() {
        return this.f24038a instanceof c;
    }

    public final boolean isDone() {
        Object obj = this.f24038a;
        return (!(obj instanceof g)) & (obj != null);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f24038a instanceof c) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                str = h();
            } catch (RuntimeException e10) {
                StringBuilder a10 = android.support.v4.media.a.a("Exception thrown from implementation: ");
                a10.append(e10.getClass());
                str = a10.toString();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f24038a;
            if ((obj2 != null) && (!(obj2 instanceof g))) {
                return e(obj2);
            }
            i iVar = this.f24040c;
            if (iVar != i.f24058c) {
                i iVar2 = new i();
                do {
                    C0218b bVar = f24036f;
                    bVar.d(iVar2, iVar);
                    if (bVar.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f24038a;
                            } else {
                                i(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return e(obj);
                    }
                    iVar = this.f24040c;
                } while (iVar != i.f24058c);
            }
            return e(this.f24038a);
        }
        throw new InterruptedException();
    }
}

package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.o;
import e8.j40;
import e8.p50;
import e8.w50;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
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
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class gh<V> extends w50 implements p50<V> {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f6644d;

    /* renamed from: e  reason: collision with root package name */
    public static final Logger f6645e = Logger.getLogger(gh.class.getName());

    /* renamed from: f  reason: collision with root package name */
    public static final c f6646f;

    /* renamed from: g  reason: collision with root package name */
    public static final Object f6647g = new Object();
    @NullableDecl

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f6648a;
    @NullableDecl

    /* renamed from: b  reason: collision with root package name */
    public volatile f f6649b;
    @NullableDecl

    /* renamed from: c  reason: collision with root package name */
    public volatile l f6650c;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class b {

        /* renamed from: c  reason: collision with root package name */
        public static final b f6651c;

        /* renamed from: d  reason: collision with root package name */
        public static final b f6652d;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f6653a;
        @NullableDecl

        /* renamed from: b  reason: collision with root package name */
        public final Throwable f6654b;

        static {
            if (gh.f6644d) {
                f6652d = null;
                f6651c = null;
                return;
            }
            f6652d = new b(false, (Throwable) null);
            f6651c = new b(true, (Throwable) null);
        }

        public b(boolean z10, @NullableDecl Throwable th) {
            this.f6653a = z10;
            this.f6654b = th;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static abstract class c {
        public c(a aVar) {
        }

        public abstract void a(l lVar, l lVar2);

        public abstract void b(l lVar, Thread thread);

        public abstract boolean c(gh<?> ghVar, f fVar, f fVar2);

        public abstract boolean d(gh<?> ghVar, l lVar, l lVar2);

        public abstract boolean e(gh<?> ghVar, Object obj, Object obj2);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class d {

        /* renamed from: b  reason: collision with root package name */
        public static final d f6655b = new d(new a("Failure occurred while trying to finish a future."));

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f6656a;

        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        public class a extends Throwable {
            public a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th) {
            th.getClass();
            this.f6656a = th;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class e extends c {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<l, Thread> f6657a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<l, l> f6658b;

        /* renamed from: c  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<gh, l> f6659c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<gh, f> f6660d;

        /* renamed from: e  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<gh, Object> f6661e;

        public e(AtomicReferenceFieldUpdater<l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<l, l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<gh, l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<gh, f> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<gh, Object> atomicReferenceFieldUpdater5) {
            super((a) null);
            this.f6657a = atomicReferenceFieldUpdater;
            this.f6658b = atomicReferenceFieldUpdater2;
            this.f6659c = atomicReferenceFieldUpdater3;
            this.f6660d = atomicReferenceFieldUpdater4;
            this.f6661e = atomicReferenceFieldUpdater5;
        }

        public final void a(l lVar, l lVar2) {
            this.f6658b.lazySet(lVar, lVar2);
        }

        public final void b(l lVar, Thread thread) {
            this.f6657a.lazySet(lVar, thread);
        }

        public final boolean c(gh<?> ghVar, f fVar, f fVar2) {
            return this.f6660d.compareAndSet(ghVar, fVar, fVar2);
        }

        public final boolean d(gh<?> ghVar, l lVar, l lVar2) {
            return this.f6659c.compareAndSet(ghVar, lVar, lVar2);
        }

        public final boolean e(gh<?> ghVar, Object obj, Object obj2) {
            return this.f6661e.compareAndSet(ghVar, obj, obj2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class f {

        /* renamed from: d  reason: collision with root package name */
        public static final f f6662d = new f((Runnable) null, (Executor) null);

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f6663a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f6664b;
        @NullableDecl

        /* renamed from: c  reason: collision with root package name */
        public f f6665c;

        public f(Runnable runnable, Executor executor) {
            this.f6663a = runnable;
            this.f6664b = executor;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class g extends c {
        public g(a aVar) {
            super((a) null);
        }

        public final void a(l lVar, l lVar2) {
            lVar.f6676b = lVar2;
        }

        public final void b(l lVar, Thread thread) {
            lVar.f6675a = thread;
        }

        public final boolean c(gh<?> ghVar, f fVar, f fVar2) {
            synchronized (ghVar) {
                if (ghVar.f6649b != fVar) {
                    return false;
                }
                ghVar.f6649b = fVar2;
                return true;
            }
        }

        public final boolean d(gh<?> ghVar, l lVar, l lVar2) {
            synchronized (ghVar) {
                if (ghVar.f6650c != lVar) {
                    return false;
                }
                ghVar.f6650c = lVar2;
                return true;
            }
        }

        public final boolean e(gh<?> ghVar, Object obj, Object obj2) {
            synchronized (ghVar) {
                if (ghVar.f6648a != obj) {
                    return false;
                }
                ghVar.f6648a = obj2;
                return true;
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class h<V> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final gh<V> f6666a;

        /* renamed from: b  reason: collision with root package name */
        public final p50<? extends V> f6667b;

        public h(gh<V> ghVar, p50<? extends V> p50) {
            this.f6666a = ghVar;
            this.f6667b = p50;
        }

        public final void run() {
            if (this.f6666a.f6648a == this) {
                if (gh.f6646f.e(this.f6666a, this, gh.d(this.f6667b))) {
                    gh.n(this.f6666a);
                }
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static abstract class i<V> extends gh<V> implements j<V> {
        public final V get(long j10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return gh.super.get(j10, timeUnit);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public interface j<V> extends p50<V> {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class k extends c {

        /* renamed from: a  reason: collision with root package name */
        public static final Unsafe f6668a;

        /* renamed from: b  reason: collision with root package name */
        public static final long f6669b;

        /* renamed from: c  reason: collision with root package name */
        public static final long f6670c;

        /* renamed from: d  reason: collision with root package name */
        public static final long f6671d;

        /* renamed from: e  reason: collision with root package name */
        public static final long f6672e;

        /* renamed from: f  reason: collision with root package name */
        public static final long f6673f;

        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        public class a implements PrivilegedExceptionAction<Unsafe> {
            public /* synthetic */ Object run() throws Exception {
                Class<Unsafe> cls = Unsafe.class;
                for (Field field : cls.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get((Object) null);
                    if (cls.isInstance(obj)) {
                        return cls.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
            r1 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.ads.gh.k.a());
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
        static {
            /*
                java.lang.Class<com.google.android.gms.internal.ads.gh$l> r0 = com.google.android.gms.internal.ads.gh.l.class
                sun.misc.Unsafe r1 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0007 }
                goto L_0x0012
            L_0x0007:
                com.google.android.gms.internal.ads.gh$k$a r1 = new com.google.android.gms.internal.ads.gh$k$a     // Catch:{ PrivilegedActionException -> 0x006a }
                r1.<init>()     // Catch:{ PrivilegedActionException -> 0x006a }
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch:{ PrivilegedActionException -> 0x006a }
                sun.misc.Unsafe r1 = (sun.misc.Unsafe) r1     // Catch:{ PrivilegedActionException -> 0x006a }
            L_0x0012:
                java.lang.Class<com.google.android.gms.internal.ads.gh> r2 = com.google.android.gms.internal.ads.gh.class
                java.lang.String r3 = "c"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
                f6670c = r3     // Catch:{ Exception -> 0x0053 }
                java.lang.String r3 = "b"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
                f6669b = r3     // Catch:{ Exception -> 0x0053 }
                java.lang.String r3 = "a"
                java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
                f6671d = r2     // Catch:{ Exception -> 0x0053 }
                java.lang.String r2 = "a"
                java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
                f6672e = r2     // Catch:{ Exception -> 0x0053 }
                java.lang.String r2 = "b"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
                f6673f = r2     // Catch:{ Exception -> 0x0053 }
                f6668a = r1     // Catch:{ Exception -> 0x0053 }
                return
            L_0x0053:
                r0 = move-exception
                java.lang.Object r1 = com.google.android.gms.internal.ads.rg.f8038a
                boolean r1 = r0 instanceof java.lang.RuntimeException
                if (r1 != 0) goto L_0x0067
                boolean r1 = r0 instanceof java.lang.Error
                if (r1 != 0) goto L_0x0064
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L_0x0064:
                java.lang.Error r0 = (java.lang.Error) r0
                throw r0
            L_0x0067:
                java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
                throw r0
            L_0x006a:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.Throwable r0 = r0.getCause()
                java.lang.String r2 = "Could not initialize intrinsics"
                r1.<init>(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gh.k.<clinit>():void");
        }

        public k(a aVar) {
            super((a) null);
        }

        public final void a(l lVar, l lVar2) {
            f6668a.putObject(lVar, f6673f, lVar2);
        }

        public final void b(l lVar, Thread thread) {
            f6668a.putObject(lVar, f6672e, thread);
        }

        public final boolean c(gh<?> ghVar, f fVar, f fVar2) {
            return f6668a.compareAndSwapObject(ghVar, f6669b, fVar, fVar2);
        }

        public final boolean d(gh<?> ghVar, l lVar, l lVar2) {
            return f6668a.compareAndSwapObject(ghVar, f6670c, lVar, lVar2);
        }

        public final boolean e(gh<?> ghVar, Object obj, Object obj2) {
            return f6668a.compareAndSwapObject(ghVar, f6671d, obj, obj2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class l {

        /* renamed from: c  reason: collision with root package name */
        public static final l f6674c = new l(false);
        @NullableDecl

        /* renamed from: a  reason: collision with root package name */
        public volatile Thread f6675a;
        @NullableDecl

        /* renamed from: b  reason: collision with root package name */
        public volatile l f6676b;

        public l(boolean z10) {
        }

        public l() {
            gh.f6646f.b(this, Thread.currentThread());
        }
    }

    static {
        boolean z10;
        Throwable th;
        Throwable th2;
        c cVar;
        Class<l> cls = l.class;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f6644d = z10;
        try {
            cVar = new k((a) null);
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            th = th3;
            th2 = th;
            cVar = new g((a) null);
        }
        f6646f = cVar;
        if (th != null) {
            Logger logger = f6645e;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public static Object d(p50<?> p50) {
        Throwable b10;
        if (p50 instanceof j) {
            Object obj = ((gh) p50).f6648a;
            if (!(obj instanceof b)) {
                return obj;
            }
            b bVar = (b) obj;
            if (!bVar.f6653a) {
                return obj;
            }
            if (bVar.f6654b != null) {
                return new b(false, bVar.f6654b);
            }
            return b.f6652d;
        } else if ((p50 instanceof w50) && (b10 = ((w50) p50).b()) != null) {
            return new d(b10);
        } else {
            boolean isCancelled = p50.isCancelled();
            if ((!f6644d) && isCancelled) {
                return b.f6652d;
            }
            try {
                Object e10 = e(p50);
                if (!isCancelled) {
                    return e10 == null ? f6647g : e10;
                }
                String valueOf = String.valueOf(p50);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 84);
                sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb2.append(valueOf);
                return new b(false, new IllegalArgumentException(sb2.toString()));
            } catch (ExecutionException e11) {
                if (!isCancelled) {
                    return new d(e11.getCause());
                }
                String valueOf2 = String.valueOf(p50);
                return new b(false, new IllegalArgumentException(e.f.a(valueOf2.length() + 84, "get() did not throw CancellationException, despite reporting isCancelled() == true: ", valueOf2), e11));
            } catch (CancellationException e12) {
                if (isCancelled) {
                    return new b(false, e12);
                }
                String valueOf3 = String.valueOf(p50);
                return new d(new IllegalArgumentException(e.f.a(valueOf3.length() + 77, "get() threw CancellationException, despite reporting isCancelled() == false: ", valueOf3), e12));
            } catch (Throwable th) {
                return new d(th);
            }
        }
    }

    public static <V> V e(Future<V> future) throws ExecutionException {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
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

    public static void n(gh<?> ghVar) {
        gh<V> ghVar2;
        f fVar;
        f fVar2;
        f fVar3 = null;
        gh<?> ghVar3 = ghVar;
        while (true) {
            l lVar = ghVar3.f6650c;
            if (f6646f.d(ghVar3, lVar, l.f6674c)) {
                while (lVar != null) {
                    Thread thread = lVar.f6675a;
                    if (thread != null) {
                        lVar.f6675a = null;
                        LockSupport.unpark(thread);
                    }
                    lVar = lVar.f6676b;
                }
                ghVar3.c();
                do {
                    fVar = ghVar3.f6649b;
                } while (!f6646f.c(ghVar3, fVar, f.f6662d));
                while (true) {
                    fVar2 = fVar3;
                    fVar3 = fVar;
                    if (fVar3 == null) {
                        break;
                    }
                    fVar = fVar3.f6665c;
                    fVar3.f6665c = fVar2;
                }
                while (fVar2 != null) {
                    fVar3 = fVar2.f6665c;
                    Runnable runnable = fVar2.f6663a;
                    if (runnable instanceof h) {
                        h hVar = (h) runnable;
                        gh<V> ghVar4 = hVar.f6666a;
                        if (ghVar4.f6648a == hVar) {
                            if (f6646f.e(ghVar4, hVar, d(hVar.f6667b))) {
                                ghVar2 = ghVar4;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        o(runnable, fVar2.f6664b);
                    }
                    fVar2 = fVar3;
                }
                return;
            }
            ghVar2 = ghVar3;
            ghVar3 = ghVar2;
        }
    }

    public static void o(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f6645e;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + valueOf.length() + 57);
            sb2.append("RuntimeException while executing runnable ");
            sb2.append(valueOf);
            sb2.append(" with executor ");
            sb2.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb2.toString(), e10);
        }
    }

    public static V r(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            Throwable th = ((b) obj).f6654b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f6656a);
        } else if (obj == f6647g) {
            return null;
        } else {
            return obj;
        }
    }

    public void a(Runnable runnable, Executor executor) {
        f fVar;
        pg.b(runnable, "Runnable was null.");
        pg.b(executor, "Executor was null.");
        if (isDone() || (fVar = this.f6649b) == f.f6662d) {
            o(runnable, executor);
        }
        f fVar2 = new f(runnable, executor);
        do {
            fVar2.f6665c = fVar;
            if (!f6646f.c(this, fVar, fVar2)) {
                fVar = this.f6649b;
            } else {
                return;
            }
        } while (fVar != f.f6662d);
        o(runnable, executor);
    }

    @NullableDecl
    public final Throwable b() {
        if (!(this instanceof j)) {
            return null;
        }
        Object obj = this.f6648a;
        if (obj instanceof d) {
            return ((d) obj).f6656a;
        }
        return null;
    }

    public void c() {
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, e8.p50<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f6648a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.gh.h
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = f6644d
            if (r3 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.gh$b r3 = new com.google.android.gms.internal.ads.gh$b
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.gh$b r3 = com.google.android.gms.internal.ads.gh.b.f6651c
            goto L_0x0026
        L_0x0024:
            com.google.android.gms.internal.ads.gh$b r3 = com.google.android.gms.internal.ads.gh.b.f6652d
        L_0x0026:
            r5 = 0
            r4 = r7
        L_0x0028:
            com.google.android.gms.internal.ads.gh$c r6 = f6646f
            boolean r6 = r6.e(r4, r0, r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.f()
        L_0x0035:
            n(r4)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.gh.h
            if (r4 == 0) goto L_0x0062
            com.google.android.gms.internal.ads.gh$h r0 = (com.google.android.gms.internal.ads.gh.h) r0
            e8.p50<? extends V> r0 = r0.f6667b
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.gh.j
            if (r4 == 0) goto L_0x0055
            r4 = r0
            com.google.android.gms.internal.ads.gh r4 = (com.google.android.gms.internal.ads.gh) r4
            java.lang.Object r0 = r4.f6648a
            if (r0 != 0) goto L_0x004d
            r5 = 1
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.gh.h
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = 1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.f6648a
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.gh.h
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = 0
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gh.cancel(boolean):boolean");
    }

    public void f() {
    }

    public final void g(@NullableDecl Future<?> future) {
        if ((future != null) && (this.f6648a instanceof b)) {
            future.cancel(l());
        }
    }

    public V get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f6648a;
            if ((obj != null) && (!(obj instanceof h))) {
                return r(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                l lVar = this.f6650c;
                if (lVar != l.f6674c) {
                    l lVar2 = new l();
                    do {
                        c cVar = f6646f;
                        cVar.a(lVar2, lVar);
                        if (cVar.d(this, lVar, lVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f6648a;
                                    if ((obj2 != null) && (!(obj2 instanceof h))) {
                                        return r(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m(lVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m(lVar2);
                        } else {
                            lVar = this.f6650c;
                        }
                    } while (lVar != l.f6674c);
                }
                return r(this.f6648a);
            }
            while (nanos > 0) {
                Object obj3 = this.f6648a;
                if ((obj3 != null) && (!(obj3 instanceof h))) {
                    return r(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String ghVar = toString();
            String timeUnit2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = timeUnit2.toLowerCase(locale);
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb2 = new StringBuilder(o.a(lowerCase2, 28));
            sb2.append("Waited ");
            sb2.append(j10);
            sb2.append(" ");
            sb2.append(lowerCase2);
            String sb3 = sb2.toString();
            if (nanos + 1000 < 0) {
                String concat = String.valueOf(sb3).concat(" (plus ");
                long j11 = -nanos;
                long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
                long nanos2 = j11 - timeUnit.toNanos(convert);
                boolean z10 = convert == 0 || nanos2 > 1000;
                if (convert > 0) {
                    String valueOf = String.valueOf(concat);
                    StringBuilder sb4 = new StringBuilder(o.a(lowerCase, valueOf.length() + 21));
                    sb4.append(valueOf);
                    sb4.append(convert);
                    sb4.append(" ");
                    sb4.append(lowerCase);
                    String sb5 = sb4.toString();
                    if (z10) {
                        sb5 = String.valueOf(sb5).concat(",");
                    }
                    concat = String.valueOf(sb5).concat(" ");
                }
                if (z10) {
                    String valueOf2 = String.valueOf(concat);
                    StringBuilder sb6 = new StringBuilder(valueOf2.length() + 33);
                    sb6.append(valueOf2);
                    sb6.append(nanos2);
                    sb6.append(" nanoseconds ");
                    concat = sb6.toString();
                }
                sb3 = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(sb3).concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(e.g.a(o.a(ghVar, o.a(sb3, 5)), sb3, " for ", ghVar));
        }
        throw new InterruptedException();
    }

    @NullableDecl
    public String h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("remaining delay=[");
        sb2.append(delay);
        sb2.append(" ms]");
        return sb2.toString();
    }

    public boolean i(@NullableDecl V v10) {
        if (v10 == null) {
            v10 = f6647g;
        }
        if (!f6646f.e(this, (Object) null, v10)) {
            return false;
        }
        n(this);
        return true;
    }

    public boolean isCancelled() {
        return this.f6648a instanceof b;
    }

    public boolean isDone() {
        Object obj = this.f6648a;
        return (!(obj instanceof h)) & (obj != null);
    }

    public boolean j(Throwable th) {
        th.getClass();
        if (!f6646f.e(this, (Object) null, new d(th))) {
            return false;
        }
        n(this);
        return true;
    }

    public final boolean k(p50<? extends V> p50) {
        h hVar;
        d dVar;
        p50.getClass();
        Object obj = this.f6648a;
        if (obj == null) {
            if (p50.isDone()) {
                if (!f6646f.e(this, (Object) null, d(p50))) {
                    return false;
                }
                n(this);
                return true;
            }
            hVar = new h(this, p50);
            if (f6646f.e(this, (Object) null, hVar)) {
                try {
                    p50.a(hVar, uh.f8247a);
                } catch (Throwable unused) {
                    dVar = d.f6655b;
                }
                return true;
            }
            obj = this.f6648a;
        }
        if (obj instanceof b) {
            p50.cancel(((b) obj).f6653a);
        }
        return false;
        f6646f.e(this, hVar, dVar);
        return true;
    }

    public final boolean l() {
        Object obj = this.f6648a;
        return (obj instanceof b) && ((b) obj).f6653a;
    }

    public final void m(l lVar) {
        lVar.f6675a = null;
        while (true) {
            l lVar2 = this.f6650c;
            if (lVar2 != l.f6674c) {
                l lVar3 = null;
                while (lVar2 != null) {
                    l lVar4 = lVar2.f6676b;
                    if (lVar2.f6675a != null) {
                        lVar3 = lVar2;
                    } else if (lVar3 != null) {
                        lVar3.f6676b = lVar4;
                        if (lVar3.f6675a == null) {
                        }
                    } else if (f6646f.d(this, lVar2, lVar4)) {
                    }
                    lVar2 = lVar4;
                }
                return;
            }
            return;
        }
    }

    public final void p(StringBuilder sb2) {
        try {
            Object e10 = e(this);
            sb2.append("SUCCESS, result=[");
            q(sb2, e10);
            sb2.append("]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e12) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e12.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    public final void q(StringBuilder sb2, Object obj) {
        if (obj == this) {
            try {
                sb2.append("this future");
            } catch (RuntimeException | StackOverflowError e10) {
                sb2.append("Exception thrown from implementation: ");
                sb2.append(e10.getClass());
            }
        } else {
            sb2.append(obj);
        }
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            p(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.f6648a;
            if (obj instanceof h) {
                sb2.append(", setFuture=[");
                q(sb2, ((h) obj).f6667b);
                sb2.append("]");
            } else {
                try {
                    str = h();
                    int i10 = j40.f15091a;
                    if (str == null || str.isEmpty()) {
                        str = null;
                    }
                } catch (RuntimeException | StackOverflowError e10) {
                    String valueOf = String.valueOf(e10.getClass());
                    str = e.f.a(valueOf.length() + 38, "Exception thrown from implementation: ", valueOf);
                }
                if (str != null) {
                    sb2.append(", info=[");
                    sb2.append(str);
                    sb2.append("]");
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                p(sb2);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f6648a;
            if ((obj2 != null) && (!(obj2 instanceof h))) {
                return r(obj2);
            }
            l lVar = this.f6650c;
            if (lVar != l.f6674c) {
                l lVar2 = new l();
                do {
                    c cVar = f6646f;
                    cVar.a(lVar2, lVar);
                    if (cVar.d(this, lVar, lVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f6648a;
                            } else {
                                m(lVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof h))));
                        return r(obj);
                    }
                    lVar = this.f6650c;
                } while (lVar != l.f6674c);
            }
            return r(this.f6648a);
        }
        throw new InterruptedException();
    }
}

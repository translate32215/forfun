package com.google.firebase.remoteconfig.internal;

import db.g;
import eb.f;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import s8.c;
import s8.e;
import s8.i;
import s8.l;

/* compiled from: ConfigCacheClient */
public class a {

    /* renamed from: d  reason: collision with root package name */
    public static final Map<String, a> f9770d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final Executor f9771e = eb.b.f17815a;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f9772a;

    /* renamed from: b  reason: collision with root package name */
    public final f f9773b;

    /* renamed from: c  reason: collision with root package name */
    public i<b> f9774c = null;

    /* compiled from: ConfigCacheClient */
    public static class b<TResult> implements s8.f<TResult>, e, c {

        /* renamed from: a  reason: collision with root package name */
        public final CountDownLatch f9775a = new CountDownLatch(1);

        public b(C0108a aVar) {
        }

        public void a(TResult tresult) {
            this.f9775a.countDown();
        }

        public void b() {
            this.f9775a.countDown();
        }

        public void d(Exception exc) {
            this.f9775a.countDown();
        }
    }

    public a(ExecutorService executorService, f fVar) {
        this.f9772a = executorService;
        this.f9773b = fVar;
    }

    public static <TResult> TResult a(i<TResult> iVar, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        b bVar = new b((C0108a) null);
        Executor executor = f9771e;
        iVar.d(executor, bVar);
        iVar.c(executor, bVar);
        iVar.a(executor, bVar);
        if (!bVar.f9775a.await(j10, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        } else if (iVar.l()) {
            return iVar.h();
        } else {
            throw new ExecutionException(iVar.g());
        }
    }

    public synchronized i<b> b() {
        i<b> iVar = this.f9774c;
        if (iVar == null || (iVar.k() && !this.f9774c.l())) {
            ExecutorService executorService = this.f9772a;
            f fVar = this.f9773b;
            fVar.getClass();
            this.f9774c = l.c(executorService, new g(fVar));
        }
        return this.f9774c;
    }

    public i<b> c(b bVar) {
        return l.c(this.f9772a, new eb.a(this, bVar)).m(this.f9772a, new eb.c(this, true, bVar));
    }
}

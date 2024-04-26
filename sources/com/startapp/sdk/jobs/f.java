package com.startapp.sdk.jobs;

import android.content.Context;
import android.os.Bundle;
import com.startapp.k9;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.jobs.b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class f implements k9 {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Context> f12571a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Integer, Future<?>> f12572b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledExecutorService f12573c = Executors.newScheduledThreadPool(1, ComponentLocator.b("scheduler"));

    /* compiled from: Sta */
    public class a extends a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JobRequest f12574a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ long f12575b;

        public a(JobRequest jobRequest, long j10) {
            this.f12574a = jobRequest;
            this.f12575b = j10;
        }

        public void a(b bVar) {
            f fVar = f.this;
            int a10 = JobRequest.a(this.f12574a.f12549a);
            long j10 = this.f12575b;
            synchronized (fVar) {
                fVar.f12572b.put(Integer.valueOf(a10), fVar.f12573c.scheduleAtFixedRate(bVar, j10, j10, TimeUnit.MILLISECONDS));
            }
        }
    }

    /* compiled from: Sta */
    public class b implements b.a {
        public b(f fVar, JobRequest jobRequest) {
        }

        public void a(b bVar, boolean z10) {
        }
    }

    /* compiled from: Sta */
    public class c extends a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JobRequest f12577a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ long f12578b;

        public c(JobRequest jobRequest, long j10) {
            this.f12577a = jobRequest;
            this.f12578b = j10;
        }

        public void a(b bVar) {
            f fVar = f.this;
            int a10 = JobRequest.a(this.f12577a.f12549a);
            long j10 = this.f12578b;
            synchronized (fVar) {
                fVar.f12572b.put(Integer.valueOf(a10), fVar.f12573c.schedule(bVar, j10, TimeUnit.MILLISECONDS));
            }
        }
    }

    /* compiled from: Sta */
    public class d implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JobRequest f12580a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ long f12581b;

        public d(JobRequest jobRequest, long j10) {
            this.f12580a = jobRequest;
            this.f12581b = j10;
        }

        public void a(b bVar, boolean z10) {
            if (z10) {
                f fVar = f.this;
                int a10 = JobRequest.a(this.f12580a.f12549a);
                long j10 = this.f12581b;
                synchronized (fVar) {
                    fVar.f12572b.put(Integer.valueOf(a10), fVar.f12573c.schedule(bVar, j10, TimeUnit.MILLISECONDS));
                }
                return;
            }
            synchronized (this) {
                f.this.f12572b.remove(Integer.valueOf(JobRequest.a(this.f12580a.f12549a)));
            }
        }
    }

    public f(Context context) {
        this.f12571a = new WeakReference<>(context);
    }

    public boolean a(JobRequest jobRequest, long j10) {
        Context context = (Context) this.f12571a.get();
        if (context == null) {
            return false;
        }
        return new a(jobRequest, j10).a(context, jobRequest.f12549a, new b(this, jobRequest), (Bundle) null);
    }

    public boolean a(JobRequest jobRequest, Long l10, Long l11) {
        Context context = (Context) this.f12571a.get();
        if (context == null) {
            return false;
        }
        long longValue = l10 != null ? l10.longValue() : 0;
        return new c(jobRequest, longValue).a(context, jobRequest.f12549a, new d(jobRequest, longValue), (Bundle) null);
    }

    public synchronized boolean a(int i10) {
        Future future = this.f12572b.get(Integer.valueOf(i10));
        if (future == null) {
            return false;
        }
        this.f12572b.remove(Integer.valueOf(i10));
        return future.cancel(true);
    }
}

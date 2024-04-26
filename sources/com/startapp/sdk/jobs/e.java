package com.startapp.sdk.jobs;

import com.startapp.k9;
import com.startapp.sdk.jobs.JobRequest;

/* compiled from: Sta */
public final class e extends JobRequest {

    /* renamed from: e  reason: collision with root package name */
    public final Long f12569e;

    /* compiled from: Sta */
    public static final class a extends JobRequest.a<a> {

        /* renamed from: d  reason: collision with root package name */
        public Long f12570d;

        public a(Class<? extends b> cls) {
            super(cls);
        }
    }

    public e(a aVar) {
        super(aVar);
        this.f12569e = aVar.f12570d;
    }

    public boolean a(k9 k9Var) {
        return k9Var.a(this, this.f12569e.longValue());
    }
}

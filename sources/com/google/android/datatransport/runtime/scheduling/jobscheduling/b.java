package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.c;
import j.f;
import java.util.Set;

/* compiled from: AutoValue_SchedulerConfig_ConfigValue */
public final class b extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public final long f5016a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5017b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<c.b> f5018c;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.b$b  reason: collision with other inner class name */
    /* compiled from: AutoValue_SchedulerConfig_ConfigValue */
    public static final class C0073b extends c.a.C0074a {

        /* renamed from: a  reason: collision with root package name */
        public Long f5019a;

        /* renamed from: b  reason: collision with root package name */
        public Long f5020b;

        /* renamed from: c  reason: collision with root package name */
        public Set<c.b> f5021c;

        public c.a a() {
            String str = this.f5019a == null ? " delta" : "";
            if (this.f5020b == null) {
                str = f.a(str, " maxAllowedDelay");
            }
            if (this.f5021c == null) {
                str = f.a(str, " flags");
            }
            if (str.isEmpty()) {
                return new b(this.f5019a.longValue(), this.f5020b.longValue(), this.f5021c, (a) null);
            }
            throw new IllegalStateException(f.a("Missing required properties:", str));
        }

        public c.a.C0074a b(long j10) {
            this.f5019a = Long.valueOf(j10);
            return this;
        }

        public c.a.C0074a c(long j10) {
            this.f5020b = Long.valueOf(j10);
            return this;
        }
    }

    public b(long j10, long j11, Set set, a aVar) {
        this.f5016a = j10;
        this.f5017b = j11;
        this.f5018c = set;
    }

    public long b() {
        return this.f5016a;
    }

    public Set<c.b> c() {
        return this.f5018c;
    }

    public long d() {
        return this.f5017b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c.a)) {
            return false;
        }
        c.a aVar = (c.a) obj;
        if (this.f5016a == aVar.b() && this.f5017b == aVar.d() && this.f5018c.equals(aVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f5016a;
        long j11 = this.f5017b;
        return this.f5018c.hashCode() ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("ConfigValue{delta=");
        a10.append(this.f5016a);
        a10.append(", maxAllowedDelay=");
        a10.append(this.f5017b);
        a10.append(", flags=");
        a10.append(this.f5018c);
        a10.append("}");
        return a10.toString();
    }
}

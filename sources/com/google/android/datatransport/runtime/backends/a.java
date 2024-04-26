package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.c;

/* compiled from: AutoValue_BackendResponse */
public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public final c.a f5006a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5007b;

    public a(c.a aVar, long j10) {
        if (aVar != null) {
            this.f5006a = aVar;
            this.f5007b = j10;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public long b() {
        return this.f5007b;
    }

    public c.a c() {
        return this.f5006a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f5006a.equals(cVar.c()) || this.f5007b != cVar.b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j10 = this.f5007b;
        return ((this.f5006a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("BackendResponse{status=");
        a10.append(this.f5006a);
        a10.append(", nextRequestWaitMillis=");
        a10.append(this.f5007b);
        a10.append("}");
        return a10.toString();
    }
}

package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.c;
import java.util.Map;
import l4.d;

/* compiled from: AutoValue_SchedulerConfig */
public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public final v4.a f5014a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<d, c.a> f5015b;

    public a(v4.a aVar, Map<d, c.a> map) {
        if (aVar != null) {
            this.f5014a = aVar;
            if (map != null) {
                this.f5015b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    public v4.a a() {
        return this.f5014a;
    }

    public Map<d, c.a> c() {
        return this.f5015b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f5014a.equals(cVar.a()) || !this.f5015b.equals(cVar.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f5014a.hashCode() ^ 1000003) * 1000003) ^ this.f5015b.hashCode();
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("SchedulerConfig{clock=");
        a10.append(this.f5014a);
        a10.append(", values=");
        a10.append(this.f5015b);
        a10.append("}");
        return a10.toString();
    }
}

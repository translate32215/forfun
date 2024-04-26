package de;

import android.support.v4.media.a;
import kd.o;
import td.l;
import ud.k;

/* compiled from: CancellableContinuationImpl.kt */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Object f13305a;

    /* renamed from: b  reason: collision with root package name */
    public final d f13306b;

    /* renamed from: c  reason: collision with root package name */
    public final l<Throwable, o> f13307c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f13308d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f13309e;

    public m(Object obj, d dVar, l<? super Throwable, o> lVar, Object obj2, Throwable th) {
        this.f13305a = obj;
        this.f13306b = dVar;
        this.f13307c = lVar;
        this.f13308d = obj2;
        this.f13309e = th;
    }

    public static m a(m mVar, Object obj, d dVar, l lVar, Object obj2, Throwable th, int i10) {
        Object obj3 = null;
        Object obj4 = (i10 & 1) != 0 ? mVar.f13305a : null;
        if ((i10 & 2) != 0) {
            dVar = mVar.f13306b;
        }
        d dVar2 = dVar;
        l<Throwable, o> lVar2 = (i10 & 4) != 0 ? mVar.f13307c : null;
        if ((i10 & 8) != 0) {
            obj3 = mVar.f13308d;
        }
        Object obj5 = obj3;
        if ((i10 & 16) != 0) {
            th = mVar.f13309e;
        }
        mVar.getClass();
        return new m(obj4, dVar2, lVar2, obj5, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return k.a(this.f13305a, mVar.f13305a) && k.a(this.f13306b, mVar.f13306b) && k.a(this.f13307c, mVar.f13307c) && k.a(this.f13308d, mVar.f13308d) && k.a(this.f13309e, mVar.f13309e);
    }

    public int hashCode() {
        Object obj = this.f13305a;
        int i10 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        d dVar = this.f13306b;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        l<Throwable, o> lVar = this.f13307c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f13308d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f13309e;
        if (th != null) {
            i10 = th.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        StringBuilder a10 = a.a("CompletedContinuation(result=");
        a10.append(this.f13305a);
        a10.append(", cancelHandler=");
        a10.append(this.f13306b);
        a10.append(", onCancellation=");
        a10.append(this.f13307c);
        a10.append(", idempotentResume=");
        a10.append(this.f13308d);
        a10.append(", cancelCause=");
        a10.append(this.f13309e);
        a10.append(')');
        return a10.toString();
    }

    public m(Object obj, d dVar, l<Throwable, o> lVar, Object obj2, Throwable th, int i10) {
        dVar = (i10 & 2) != 0 ? null : dVar;
        lVar = (i10 & 4) != 0 ? null : lVar;
        obj2 = (i10 & 8) != 0 ? null : obj2;
        th = (i10 & 16) != 0 ? null : th;
        this.f13305a = obj;
        this.f13306b = dVar;
        this.f13307c = lVar;
        this.f13308d = obj2;
        this.f13309e = th;
    }
}

package de;

import android.support.v4.media.a;
import td.l;
import ud.k;

/* compiled from: CompletionState.kt */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final Object f13317a;

    /* renamed from: b  reason: collision with root package name */
    public final l<Throwable, kd.o> f13318b;

    public o(Object obj, l<? super Throwable, kd.o> lVar) {
        this.f13317a = obj;
        this.f13318b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return k.a(this.f13317a, oVar.f13317a) && k.a(this.f13318b, oVar.f13318b);
    }

    public int hashCode() {
        Object obj = this.f13317a;
        return this.f13318b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder a10 = a.a("CompletedWithCancellation(result=");
        a10.append(this.f13317a);
        a10.append(", onCancellation=");
        a10.append(this.f13318b);
        a10.append(')');
        return a10.toString();
    }
}

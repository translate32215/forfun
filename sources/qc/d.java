package qc;

import android.support.v4.media.a;
import ud.f;
import ud.k;

/* compiled from: CoreApiService.kt */
public final class d<T> extends e<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f24271a;

    public d(String str) {
        super((f) null);
        this.f24271a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && k.a(this.f24271a, ((d) obj).f24271a);
    }

    public int hashCode() {
        return this.f24271a.hashCode();
    }

    public String toString() {
        StringBuilder a10 = a.a("ApiErrorResponse(errorMessage=");
        a10.append(this.f24271a);
        a10.append(')');
        return a10.toString();
    }
}

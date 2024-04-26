package qc;

import android.support.v4.media.a;
import java.util.Date;
import ud.k;

/* compiled from: CoreApiService.kt */
public final class f<T> extends e<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f24272a;

    /* renamed from: b  reason: collision with root package name */
    public final Date f24273b;

    public f(T t10, Date date) {
        super((ud.f) null);
        this.f24272a = t10;
        this.f24273b = date;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k.a(this.f24272a, fVar.f24272a) && k.a(this.f24273b, fVar.f24273b);
    }

    public int hashCode() {
        T t10 = this.f24272a;
        int i10 = 0;
        int hashCode = (t10 == null ? 0 : t10.hashCode()) * 31;
        Date date = this.f24273b;
        if (date != null) {
            i10 = date.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        StringBuilder a10 = a.a("ApiSuccessResponse(body=");
        a10.append(this.f24272a);
        a10.append(", time=");
        a10.append(this.f24273b);
        a10.append(')');
        return a10.toString();
    }
}

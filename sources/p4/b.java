package p4;

import android.content.Context;
import androidx.activity.e;
import com.google.android.datatransport.runtime.backends.d;
import v4.a;

/* compiled from: AutoValue_CreationContext */
public final class b extends d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f23815a;

    /* renamed from: b  reason: collision with root package name */
    public final a f23816b;

    /* renamed from: c  reason: collision with root package name */
    public final a f23817c;

    /* renamed from: d  reason: collision with root package name */
    public final String f23818d;

    public b(Context context, a aVar, a aVar2, String str) {
        if (context != null) {
            this.f23815a = context;
            if (aVar != null) {
                this.f23816b = aVar;
                if (aVar2 != null) {
                    this.f23817c = aVar2;
                    if (str != null) {
                        this.f23818d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public Context a() {
        return this.f23815a;
    }

    public String b() {
        return this.f23818d;
    }

    public a c() {
        return this.f23817c;
    }

    public a d() {
        return this.f23816b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f23815a.equals(dVar.a()) || !this.f23816b.equals(dVar.d()) || !this.f23817c.equals(dVar.c()) || !this.f23818d.equals(dVar.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.f23815a.hashCode() ^ 1000003) * 1000003) ^ this.f23816b.hashCode()) * 1000003) ^ this.f23817c.hashCode()) * 1000003) ^ this.f23818d.hashCode();
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("CreationContext{applicationContext=");
        a10.append(this.f23815a);
        a10.append(", wallClock=");
        a10.append(this.f23816b);
        a10.append(", monotonicClock=");
        a10.append(this.f23817c);
        a10.append(", backendName=");
        return e.a(a10, this.f23818d, "}");
    }
}

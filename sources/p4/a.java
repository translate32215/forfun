package p4;

import com.google.android.datatransport.runtime.backends.b;
import java.util.Arrays;
import o4.f;

/* compiled from: AutoValue_BackendRequest */
public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public final Iterable<f> f23813a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f23814b;

    public a(Iterable iterable, byte[] bArr, C0212a aVar) {
        this.f23813a = iterable;
        this.f23814b = bArr;
    }

    public Iterable<f> a() {
        return this.f23813a;
    }

    public byte[] b() {
        return this.f23814b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f23813a.equals(bVar.a())) {
            if (Arrays.equals(this.f23814b, bVar instanceof a ? ((a) bVar).f23814b : bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f23813a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f23814b);
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("BackendRequest{events=");
        a10.append(this.f23813a);
        a10.append(", extras=");
        a10.append(Arrays.toString(this.f23814b));
        a10.append("}");
        return a10.toString();
    }
}

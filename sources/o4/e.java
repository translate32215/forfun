package o4;

import android.support.v4.media.a;
import java.util.Arrays;
import l4.b;

/* compiled from: EncodedPayload */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final b f22947a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f22948b;

    public e(b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.f22947a = bVar;
            this.f22948b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f22947a.equals(eVar.f22947a)) {
            return false;
        }
        return Arrays.equals(this.f22948b, eVar.f22948b);
    }

    public int hashCode() {
        return ((this.f22947a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f22948b);
    }

    public String toString() {
        StringBuilder a10 = a.a("EncodedPayload{encoding=");
        a10.append(this.f22947a);
        a10.append(", bytes=[...]}");
        return a10.toString();
    }
}

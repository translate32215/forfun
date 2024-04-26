package o4;

import j.f;
import java.util.Arrays;
import l4.d;
import o4.i;

/* compiled from: AutoValue_TransportContext */
public final class b extends i {

    /* renamed from: a  reason: collision with root package name */
    public final String f22936a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f22937b;

    /* renamed from: c  reason: collision with root package name */
    public final d f22938c;

    /* renamed from: o4.b$b  reason: collision with other inner class name */
    /* compiled from: AutoValue_TransportContext */
    public static final class C0204b extends i.a {

        /* renamed from: a  reason: collision with root package name */
        public String f22939a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f22940b;

        /* renamed from: c  reason: collision with root package name */
        public d f22941c;

        public i.a a(String str) {
            if (str != null) {
                this.f22939a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        public i b() {
            String str = this.f22939a == null ? " backendName" : "";
            if (this.f22941c == null) {
                str = f.a(str, " priority");
            }
            if (str.isEmpty()) {
                return new b(this.f22939a, this.f22940b, this.f22941c, (a) null);
            }
            throw new IllegalStateException(f.a("Missing required properties:", str));
        }
    }

    public b(String str, byte[] bArr, d dVar, a aVar) {
        this.f22936a = str;
        this.f22937b = bArr;
        this.f22938c = dVar;
    }

    public String b() {
        return this.f22936a;
    }

    public byte[] c() {
        return this.f22937b;
    }

    public d d() {
        return this.f22938c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f22936a.equals(iVar.b())) {
            if (!Arrays.equals(this.f22937b, iVar instanceof b ? ((b) iVar).f22937b : iVar.c()) || !this.f22938c.equals(iVar.d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f22936a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f22937b)) * 1000003) ^ this.f22938c.hashCode();
    }
}

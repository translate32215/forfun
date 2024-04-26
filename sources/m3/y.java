package m3;

import android.support.v4.media.a;
import g4.g;
import g4.j;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import k3.c;
import k3.e;
import n3.b;

/* compiled from: ResourceCacheKey */
public final class y implements c {

    /* renamed from: j  reason: collision with root package name */
    public static final g<Class<?>, byte[]> f21685j = new g<>(50);

    /* renamed from: b  reason: collision with root package name */
    public final b f21686b;

    /* renamed from: c  reason: collision with root package name */
    public final c f21687c;

    /* renamed from: d  reason: collision with root package name */
    public final c f21688d;

    /* renamed from: e  reason: collision with root package name */
    public final int f21689e;

    /* renamed from: f  reason: collision with root package name */
    public final int f21690f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f21691g;

    /* renamed from: h  reason: collision with root package name */
    public final e f21692h;

    /* renamed from: i  reason: collision with root package name */
    public final k3.g<?> f21693i;

    public y(b bVar, c cVar, c cVar2, int i10, int i11, k3.g<?> gVar, Class<?> cls, e eVar) {
        this.f21686b = bVar;
        this.f21687c = cVar;
        this.f21688d = cVar2;
        this.f21689e = i10;
        this.f21690f = i11;
        this.f21693i = gVar;
        this.f21691g = cls;
        this.f21692h = eVar;
    }

    public void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f21686b.e(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f21689e).putInt(this.f21690f).array();
        this.f21688d.a(messageDigest);
        this.f21687c.a(messageDigest);
        messageDigest.update(bArr);
        k3.g<?> gVar = this.f21693i;
        if (gVar != null) {
            gVar.a(messageDigest);
        }
        this.f21692h.a(messageDigest);
        g<Class<?>, byte[]> gVar2 = f21685j;
        byte[] a10 = gVar2.a(this.f21691g);
        if (a10 == null) {
            a10 = this.f21691g.getName().getBytes(c.f19887a);
            gVar2.d(this.f21691g, a10);
        }
        messageDigest.update(a10);
        this.f21686b.put(bArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f21690f != yVar.f21690f || this.f21689e != yVar.f21689e || !j.b(this.f21693i, yVar.f21693i) || !this.f21691g.equals(yVar.f21691g) || !this.f21687c.equals(yVar.f21687c) || !this.f21688d.equals(yVar.f21688d) || !this.f21692h.equals(yVar.f21692h)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = ((((this.f21688d.hashCode() + (this.f21687c.hashCode() * 31)) * 31) + this.f21689e) * 31) + this.f21690f;
        k3.g<?> gVar = this.f21693i;
        if (gVar != null) {
            hashCode = (hashCode * 31) + gVar.hashCode();
        }
        int hashCode2 = this.f21691g.hashCode();
        return this.f21692h.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public String toString() {
        StringBuilder a10 = a.a("ResourceCacheKey{sourceKey=");
        a10.append(this.f21687c);
        a10.append(", signature=");
        a10.append(this.f21688d);
        a10.append(", width=");
        a10.append(this.f21689e);
        a10.append(", height=");
        a10.append(this.f21690f);
        a10.append(", decodedResourceClass=");
        a10.append(this.f21691g);
        a10.append(", transformation='");
        a10.append(this.f21693i);
        a10.append('\'');
        a10.append(", options=");
        a10.append(this.f21692h);
        a10.append('}');
        return a10.toString();
    }
}

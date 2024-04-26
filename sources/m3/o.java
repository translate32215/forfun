package m3;

import android.support.v4.media.a;
import java.security.MessageDigest;
import java.util.Map;
import k3.c;
import k3.e;
import k3.g;

/* compiled from: EngineKey */
public class o implements c {

    /* renamed from: b  reason: collision with root package name */
    public final Object f21641b;

    /* renamed from: c  reason: collision with root package name */
    public final int f21642c;

    /* renamed from: d  reason: collision with root package name */
    public final int f21643d;

    /* renamed from: e  reason: collision with root package name */
    public final Class<?> f21644e;

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f21645f;

    /* renamed from: g  reason: collision with root package name */
    public final c f21646g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<Class<?>, g<?>> f21647h;

    /* renamed from: i  reason: collision with root package name */
    public final e f21648i;

    /* renamed from: j  reason: collision with root package name */
    public int f21649j;

    public o(Object obj, c cVar, int i10, int i11, Map<Class<?>, g<?>> map, Class<?> cls, Class<?> cls2, e eVar) {
        if (obj != null) {
            this.f21641b = obj;
            if (cVar != null) {
                this.f21646g = cVar;
                this.f21642c = i10;
                this.f21643d = i11;
                if (map != null) {
                    this.f21647h = map;
                    if (cls != null) {
                        this.f21644e = cls;
                        if (cls2 != null) {
                            this.f21645f = cls2;
                            if (eVar != null) {
                                this.f21648i = eVar;
                                return;
                            }
                            throw new NullPointerException("Argument must not be null");
                        }
                        throw new NullPointerException("Transcode class must not be null");
                    }
                    throw new NullPointerException("Resource class must not be null");
                }
                throw new NullPointerException("Argument must not be null");
            }
            throw new NullPointerException("Signature must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    public void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!this.f21641b.equals(oVar.f21641b) || !this.f21646g.equals(oVar.f21646g) || this.f21643d != oVar.f21643d || this.f21642c != oVar.f21642c || !this.f21647h.equals(oVar.f21647h) || !this.f21644e.equals(oVar.f21644e) || !this.f21645f.equals(oVar.f21645f) || !this.f21648i.equals(oVar.f21648i)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f21649j == 0) {
            int hashCode = this.f21641b.hashCode();
            this.f21649j = hashCode;
            int hashCode2 = this.f21646g.hashCode() + (hashCode * 31);
            this.f21649j = hashCode2;
            int i10 = (hashCode2 * 31) + this.f21642c;
            this.f21649j = i10;
            int i11 = (i10 * 31) + this.f21643d;
            this.f21649j = i11;
            int hashCode3 = this.f21647h.hashCode() + (i11 * 31);
            this.f21649j = hashCode3;
            int hashCode4 = this.f21644e.hashCode() + (hashCode3 * 31);
            this.f21649j = hashCode4;
            int hashCode5 = this.f21645f.hashCode() + (hashCode4 * 31);
            this.f21649j = hashCode5;
            this.f21649j = this.f21648i.hashCode() + (hashCode5 * 31);
        }
        return this.f21649j;
    }

    public String toString() {
        StringBuilder a10 = a.a("EngineKey{model=");
        a10.append(this.f21641b);
        a10.append(", width=");
        a10.append(this.f21642c);
        a10.append(", height=");
        a10.append(this.f21643d);
        a10.append(", resourceClass=");
        a10.append(this.f21644e);
        a10.append(", transcodeClass=");
        a10.append(this.f21645f);
        a10.append(", signature=");
        a10.append(this.f21646g);
        a10.append(", hashCode=");
        a10.append(this.f21649j);
        a10.append(", transformations=");
        a10.append(this.f21647h);
        a10.append(", options=");
        a10.append(this.f21648i);
        a10.append('}');
        return a10.toString();
    }
}

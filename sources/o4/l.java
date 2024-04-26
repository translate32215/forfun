package o4;

import ab.s;
import j8.j;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import l4.b;
import l4.c;
import l4.d;
import l4.e;
import l4.f;
import o4.a;
import o4.b;
import o4.i;

/* compiled from: TransportImpl */
public final class l<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final i f22957a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22958b;

    /* renamed from: c  reason: collision with root package name */
    public final b f22959c;

    /* renamed from: d  reason: collision with root package name */
    public final e<T, byte[]> f22960d;

    /* renamed from: e  reason: collision with root package name */
    public final m f22961e;

    public l(i iVar, String str, b bVar, e<T, byte[]> eVar, m mVar) {
        this.f22957a = iVar;
        this.f22958b = str;
        this.f22959c = bVar;
        this.f22960d = eVar;
        this.f22961e = mVar;
    }

    public void a(c<T> cVar) {
        k kVar = k.f22955a;
        m mVar = this.f22961e;
        i iVar = this.f22957a;
        if (iVar != null) {
            String str = this.f22958b;
            if (str != null) {
                e<T, byte[]> eVar = this.f22960d;
                if (eVar != null) {
                    b bVar = this.f22959c;
                    if (bVar != null) {
                        n nVar = (n) mVar;
                        r4.c cVar2 = nVar.f22965c;
                        d dVar = d.VERY_LOW;
                        i.a a10 = i.a();
                        a10.a(iVar.b());
                        b.C0204b bVar2 = (b.C0204b) a10;
                        bVar2.f22941c = dVar;
                        bVar2.f22940b = iVar.c();
                        i b10 = bVar2.b();
                        a.b bVar3 = new a.b();
                        bVar3.f22935f = new HashMap();
                        bVar3.e(nVar.f22963a.a());
                        bVar3.g(nVar.f22964b.a());
                        bVar3.f22930a = str;
                        s sVar = (s) eVar;
                        bb.b bVar4 = (bb.b) ((l4.a) cVar).f21034a;
                        bVar4.getClass();
                        j8.f fVar = j.f19668a;
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            fVar.a(bVar4, byteArrayOutputStream);
                        } catch (IOException unused) {
                        }
                        bVar3.f22932c = new e(bVar, byteArrayOutputStream.toByteArray());
                        bVar3.f22931b = null;
                        cVar2.a(b10, bVar3.b(), kVar);
                        return;
                    }
                    throw new NullPointerException("Null encoding");
                }
                throw new NullPointerException("Null transformer");
            }
            throw new NullPointerException("Null transportName");
        }
        throw new NullPointerException("Null transportContext");
    }
}

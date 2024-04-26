package x3;

import j3.a;
import n3.e;

/* compiled from: GifBitmapProvider */
public final class b implements a.C0166a {

    /* renamed from: a  reason: collision with root package name */
    public final e f27303a;

    /* renamed from: b  reason: collision with root package name */
    public final n3.b f27304b;

    public b(e eVar, n3.b bVar) {
        this.f27303a = eVar;
        this.f27304b = bVar;
    }

    public byte[] a(int i10) {
        n3.b bVar = this.f27304b;
        if (bVar == null) {
            return new byte[i10];
        }
        return (byte[]) bVar.f(i10, byte[].class);
    }
}

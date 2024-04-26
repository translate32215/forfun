package r3;

import com.bumptech.glide.load.data.j;
import java.io.InputStream;
import k3.d;
import k3.e;
import q3.f;
import q3.l;
import q3.m;
import q3.n;
import q3.q;

/* compiled from: HttpGlideUrlLoader */
public class a implements m<f, InputStream> {

    /* renamed from: b  reason: collision with root package name */
    public static final d<Integer> f24504b = d.a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a  reason: collision with root package name */
    public final l<f, f> f24505a;

    /* renamed from: r3.a$a  reason: collision with other inner class name */
    /* compiled from: HttpGlideUrlLoader */
    public static class C0231a implements n<f, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final l<f, f> f24506a = new l<>(500);

        public m<f, InputStream> a(q qVar) {
            return new a(this.f24506a);
        }
    }

    public a(l<f, f> lVar) {
        this.f24505a = lVar;
    }

    public m.a a(Object obj, int i10, int i11, e eVar) {
        f fVar = (f) obj;
        l<f, f> lVar = this.f24505a;
        if (lVar != null) {
            l.b a10 = l.b.a(fVar, 0, 0);
            B a11 = lVar.f24099a.a(a10);
            a10.b();
            f fVar2 = (f) a11;
            if (fVar2 == null) {
                l<f, f> lVar2 = this.f24505a;
                lVar2.getClass();
                lVar2.f24099a.d(l.b.a(fVar, 0, 0), fVar);
            } else {
                fVar = fVar2;
            }
        }
        return new m.a(fVar, new j(fVar, ((Integer) eVar.c(f24504b)).intValue()));
    }

    public /* bridge */ /* synthetic */ boolean b(Object obj) {
        f fVar = (f) obj;
        return true;
    }
}

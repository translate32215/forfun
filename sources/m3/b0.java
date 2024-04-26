package m3;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.a;
import com.bumptech.glide.load.data.d;
import g4.f;
import java.util.Collections;
import java.util.List;
import k3.c;
import m3.g;
import q3.m;

/* compiled from: SourceGenerator */
public class b0 implements g, g.a {

    /* renamed from: a  reason: collision with root package name */
    public final h<?> f21507a;

    /* renamed from: b  reason: collision with root package name */
    public final g.a f21508b;

    /* renamed from: c  reason: collision with root package name */
    public int f21509c;

    /* renamed from: d  reason: collision with root package name */
    public d f21510d;

    /* renamed from: e  reason: collision with root package name */
    public Object f21511e;

    /* renamed from: f  reason: collision with root package name */
    public volatile m.a<?> f21512f;

    /* renamed from: g  reason: collision with root package name */
    public e f21513g;

    public b0(h<?> hVar, g.a aVar) {
        this.f21507a = hVar;
        this.f21508b = aVar;
    }

    public void a() {
        throw new UnsupportedOperationException();
    }

    public void b(c cVar, Object obj, d<?> dVar, a aVar, c cVar2) {
        this.f21508b.b(cVar, obj, dVar, this.f21512f.f24106c.e(), cVar);
    }

    public void c(c cVar, Exception exc, d<?> dVar, a aVar) {
        this.f21508b.c(cVar, exc, dVar, this.f21512f.f24106c.e());
    }

    public void cancel() {
        m.a<?> aVar = this.f21512f;
        if (aVar != null) {
            aVar.f24106c.cancel();
        }
    }

    /* JADX INFO: finally extract failed */
    public boolean e() {
        Object obj = this.f21511e;
        if (obj != null) {
            this.f21511e = null;
            int i10 = f.f18457b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            try {
                k3.a<X> e10 = this.f21507a.e(obj);
                f fVar = new f(e10, obj, this.f21507a.f21536i);
                c cVar = this.f21512f.f24104a;
                h<?> hVar = this.f21507a;
                this.f21513g = new e(cVar, hVar.f21541n);
                hVar.b().a(this.f21513g, fVar);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f21513g + ", data: " + obj + ", encoder: " + e10 + ", duration: " + f.a(elapsedRealtimeNanos));
                }
                this.f21512f.f24106c.b();
                this.f21510d = new d(Collections.singletonList(this.f21512f.f24104a), this.f21507a, this);
            } catch (Throwable th) {
                this.f21512f.f24106c.b();
                throw th;
            }
        }
        d dVar = this.f21510d;
        if (dVar != null && dVar.e()) {
            return true;
        }
        this.f21510d = null;
        this.f21512f = null;
        boolean z10 = false;
        while (!z10) {
            if (!(this.f21509c < this.f21507a.c().size())) {
                break;
            }
            List<m.a<?>> c10 = this.f21507a.c();
            int i11 = this.f21509c;
            this.f21509c = i11 + 1;
            this.f21512f = c10.get(i11);
            if (this.f21512f != null && (this.f21507a.f21543p.c(this.f21512f.f24106c.e()) || this.f21507a.g(this.f21512f.f24106c.a()))) {
                this.f21512f.f24106c.f(this.f21507a.f21542o, new a0(this, this.f21512f));
                z10 = true;
            }
        }
        return z10;
    }
}

package r4;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import o4.f;
import o4.i;
import o4.n;
import p4.d;
import s4.k;
import t4.c;
import z5.s;

/* compiled from: DefaultScheduler */
public class b implements c {

    /* renamed from: f  reason: collision with root package name */
    public static final Logger f24533f = Logger.getLogger(n.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final k f24534a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f24535b;

    /* renamed from: c  reason: collision with root package name */
    public final d f24536c;

    /* renamed from: d  reason: collision with root package name */
    public final c f24537d;

    /* renamed from: e  reason: collision with root package name */
    public final u4.b f24538e;

    public b(Executor executor, d dVar, k kVar, c cVar, u4.b bVar) {
        this.f24535b = executor;
        this.f24536c = dVar;
        this.f24534a = kVar;
        this.f24537d = cVar;
        this.f24538e = bVar;
    }

    public void a(i iVar, f fVar, o4.k kVar) {
        this.f24535b.execute(new s(this, iVar, kVar, fVar));
    }
}

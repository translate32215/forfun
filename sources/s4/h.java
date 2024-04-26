package s4;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import l0.e;
import o4.i;
import p4.a;
import p4.d;
import t4.c;
import u4.b;
import v4.a;

/* compiled from: Uploader */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f24937a;

    /* renamed from: b  reason: collision with root package name */
    public final d f24938b;

    /* renamed from: c  reason: collision with root package name */
    public final c f24939c;

    /* renamed from: d  reason: collision with root package name */
    public final k f24940d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f24941e;

    /* renamed from: f  reason: collision with root package name */
    public final b f24942f;

    /* renamed from: g  reason: collision with root package name */
    public final a f24943g;

    public h(Context context, d dVar, c cVar, k kVar, Executor executor, b bVar, a aVar) {
        this.f24937a = context;
        this.f24938b = dVar;
        this.f24939c = cVar;
        this.f24940d = kVar;
        this.f24941e = executor;
        this.f24942f = bVar;
        this.f24943g = aVar;
    }

    public void a(i iVar, int i10) {
        com.google.android.datatransport.runtime.backends.c a10;
        p4.h a11 = this.f24938b.a(iVar.b());
        Iterable<t4.h> iterable = (Iterable) this.f24942f.a(new g(this, iVar));
        if (iterable.iterator().hasNext()) {
            if (a11 == null) {
                e.c("Uploader", "Unknown backend for %s, deleting event batch for it...", iVar);
                a10 = com.google.android.datatransport.runtime.backends.c.a();
            } else {
                ArrayList arrayList = new ArrayList();
                for (t4.h a12 : iterable) {
                    arrayList.add(a12.a());
                }
                a10 = a11.a(new p4.a(arrayList, iVar.c(), (a.C0212a) null));
            }
            this.f24942f.a(new e(this, a10, iterable, iVar, i10));
        }
    }
}

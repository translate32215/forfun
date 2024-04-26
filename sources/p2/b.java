package p2;

import androidx.work.impl.WorkDatabase;
import h2.e;
import h2.h;
import java.util.ArrayList;
import java.util.Iterator;
import o2.l;

/* compiled from: CancelWorkRunnable */
public final class b extends c {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f23778b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f23779c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f23780d;

    public b(h hVar, String str, boolean z10) {
        this.f23778b = hVar;
        this.f23779c = str;
        this.f23780d = z10;
    }

    /* JADX INFO: finally extract failed */
    public void b() {
        WorkDatabase workDatabase = this.f23778b.f18830c;
        workDatabase.c();
        try {
            Iterator it = ((ArrayList) ((l) workDatabase.n()).f(this.f23779c)).iterator();
            while (it.hasNext()) {
                a(this.f23778b, (String) it.next());
            }
            workDatabase.j();
            workDatabase.g();
            if (this.f23780d) {
                h hVar = this.f23778b;
                e.a(hVar.f18829b, hVar.f18830c, hVar.f18832e);
            }
        } catch (Throwable th) {
            workDatabase.g();
            throw th;
        }
    }
}

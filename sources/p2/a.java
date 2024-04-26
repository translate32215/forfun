package p2;

import androidx.work.impl.WorkDatabase;
import h2.e;
import h2.h;
import java.util.ArrayList;
import java.util.Iterator;
import o2.l;

/* compiled from: CancelWorkRunnable */
public final class a extends c {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f23776b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f23777c;

    public a(h hVar, String str) {
        this.f23776b = hVar;
        this.f23777c = str;
    }

    /* JADX INFO: finally extract failed */
    public void b() {
        WorkDatabase workDatabase = this.f23776b.f18830c;
        workDatabase.c();
        try {
            Iterator it = ((ArrayList) ((l) workDatabase.n()).g(this.f23777c)).iterator();
            while (it.hasNext()) {
                a(this.f23776b, (String) it.next());
            }
            workDatabase.j();
            workDatabase.g();
            h hVar = this.f23776b;
            e.a(hVar.f18829b, hVar.f18830c, hVar.f18832e);
        } catch (Throwable th) {
            workDatabase.g();
            throw th;
        }
    }
}

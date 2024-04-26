package i2;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import g2.e;
import h2.d;
import h2.h;
import java.util.ArrayList;
import java.util.List;
import l2.c;
import o2.j;
import p2.i;
import r2.b;

/* compiled from: GreedyScheduler */
public class a implements d, c, h2.a {

    /* renamed from: f  reason: collision with root package name */
    public static final String f19100f = e.e("GreedyScheduler");

    /* renamed from: a  reason: collision with root package name */
    public h f19101a;

    /* renamed from: b  reason: collision with root package name */
    public l2.d f19102b;

    /* renamed from: c  reason: collision with root package name */
    public List<j> f19103c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f19104d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f19105e;

    public a(Context context, r2.a aVar, h hVar) {
        this.f19101a = hVar;
        this.f19102b = new l2.d(context, aVar, this);
        this.f19105e = new Object();
    }

    public void a(String str, boolean z10) {
        synchronized (this.f19105e) {
            int size = this.f19103c.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                } else if (this.f19103c.get(i10).f22864a.equals(str)) {
                    e.c().a(f19100f, String.format("Stopping tracking for %s", new Object[]{str}), new Throwable[0]);
                    this.f19103c.remove(i10);
                    this.f19102b.b(this.f19103c);
                    break;
                } else {
                    i10++;
                }
            }
        }
    }

    public void b(String str) {
        if (!this.f19104d) {
            this.f19101a.f18833f.b(this);
            this.f19104d = true;
        }
        e.c().a(f19100f, String.format("Cancelling work ID %s", new Object[]{str}), new Throwable[0]);
        h hVar = this.f19101a;
        r2.a aVar = hVar.f18831d;
        ((b) aVar).f24500a.execute(new p2.j(hVar, str));
    }

    public void c(List<String> list) {
        for (String next : list) {
            e.c().a(f19100f, String.format("Constraints not met: Cancelling work ID %s", new Object[]{next}), new Throwable[0]);
            this.f19101a.f(next);
        }
    }

    public void d(j... jVarArr) {
        if (!this.f19104d) {
            this.f19101a.f18833f.b(this);
            this.f19104d = true;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (j jVar : jVarArr) {
            if (jVar.f22865b == androidx.work.d.ENQUEUED && !jVar.d() && jVar.f22870g == 0 && !jVar.c()) {
                if (jVar.b()) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        if (jVar.f22873j.f18401h.a() > 0) {
                        }
                    }
                    arrayList.add(jVar);
                    arrayList2.add(jVar.f22864a);
                } else {
                    e.c().a(f19100f, String.format("Starting work for %s", new Object[]{jVar.f22864a}), new Throwable[0]);
                    h hVar = this.f19101a;
                    ((b) hVar.f18831d).f24500a.execute(new i(hVar, jVar.f22864a, (WorkerParameters.a) null));
                }
            }
        }
        synchronized (this.f19105e) {
            if (!arrayList.isEmpty()) {
                e.c().a(f19100f, String.format("Starting tracking for [%s]", new Object[]{TextUtils.join(",", arrayList2)}), new Throwable[0]);
                this.f19103c.addAll(arrayList);
                this.f19102b.b(this.f19103c);
            }
        }
    }

    public void e(List<String> list) {
        for (String next : list) {
            e.c().a(f19100f, String.format("Constraints met: Scheduling work ID %s", new Object[]{next}), new Throwable[0]);
            h hVar = this.f19101a;
            r2.a aVar = hVar.f18831d;
            ((b) aVar).f24500a.execute(new i(hVar, next, (WorkerParameters.a) null));
        }
    }
}

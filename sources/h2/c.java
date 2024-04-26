package h2;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import g2.e;
import h2.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import q2.b;
import q2.d;

/* compiled from: Processor */
public class c implements a {

    /* renamed from: r  reason: collision with root package name */
    public static final String f18801r = e.e("Processor");

    /* renamed from: a  reason: collision with root package name */
    public Context f18802a;

    /* renamed from: b  reason: collision with root package name */
    public g2.a f18803b;

    /* renamed from: c  reason: collision with root package name */
    public r2.a f18804c;

    /* renamed from: d  reason: collision with root package name */
    public WorkDatabase f18805d;

    /* renamed from: e  reason: collision with root package name */
    public Map<String, k> f18806e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public List<d> f18807f;

    /* renamed from: g  reason: collision with root package name */
    public Set<String> f18808g;

    /* renamed from: h  reason: collision with root package name */
    public final List<a> f18809h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f18810i;

    /* compiled from: Processor */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public a f18811a;

        /* renamed from: b  reason: collision with root package name */
        public String f18812b;

        /* renamed from: c  reason: collision with root package name */
        public ea.a<Boolean> f18813c;

        public a(a aVar, String str, ea.a<Boolean> aVar2) {
            this.f18811a = aVar;
            this.f18812b = str;
            this.f18813c = aVar2;
        }

        public void run() {
            boolean z10;
            try {
                z10 = ((Boolean) ((b) this.f18813c).get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z10 = true;
            }
            this.f18811a.a(this.f18812b, z10);
        }
    }

    public c(Context context, g2.a aVar, r2.a aVar2, WorkDatabase workDatabase, List<d> list) {
        this.f18802a = context;
        this.f18803b = aVar;
        this.f18804c = aVar2;
        this.f18805d = workDatabase;
        this.f18807f = list;
        this.f18808g = new HashSet();
        this.f18809h = new ArrayList();
        this.f18810i = new Object();
    }

    public void a(String str, boolean z10) {
        synchronized (this.f18810i) {
            this.f18806e.remove(str);
            e.c().a(f18801r, String.format("%s %s executed; reschedule = %s", new Object[]{c.class.getSimpleName(), str, Boolean.valueOf(z10)}), new Throwable[0]);
            for (a a10 : this.f18809h) {
                a10.a(str, z10);
            }
        }
    }

    public void b(a aVar) {
        synchronized (this.f18810i) {
            this.f18809h.add(aVar);
        }
    }

    public boolean c(String str, WorkerParameters.a aVar) {
        synchronized (this.f18810i) {
            if (this.f18806e.containsKey(str)) {
                e.c().a(f18801r, String.format("Work %s is already enqueued for processing", new Object[]{str}), new Throwable[0]);
                return false;
            }
            k.a aVar2 = new k.a(this.f18802a, this.f18803b, this.f18804c, this.f18805d, str);
            aVar2.f18865f = this.f18807f;
            if (aVar != null) {
                aVar2.f18866g = aVar;
            }
            k kVar = new k(aVar2);
            d<Boolean> dVar = kVar.f18857x;
            dVar.a(new a(this, str, dVar), ((r2.b) this.f18804c).f24502c);
            this.f18806e.put(str, kVar);
            ((r2.b) this.f18804c).f24500a.execute(kVar);
            e.c().a(f18801r, String.format("%s: processing %s", new Object[]{c.class.getSimpleName(), str}), new Throwable[0]);
            return true;
        }
    }

    public boolean d(String str) {
        synchronized (this.f18810i) {
            e c10 = e.c();
            String str2 = f18801r;
            c10.a(str2, String.format("Processor stopping %s", new Object[]{str}), new Throwable[0]);
            k remove = this.f18806e.remove(str);
            if (remove != null) {
                remove.b();
                e.c().a(str2, String.format("WorkerWrapper stopped for %s", new Object[]{str}), new Throwable[0]);
                return true;
            }
            e.c().a(str2, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
            return false;
        }
    }
}

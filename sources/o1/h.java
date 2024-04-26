package o1;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import java.util.Set;
import java.util.UUID;
import ud.f;
import ud.k;
import ud.l;

/* compiled from: NavBackStackEntry.kt */
public final class h implements t, v0, n, w1.c {

    /* renamed from: v  reason: collision with root package name */
    public static final a f22694v = new a((f) null);

    /* renamed from: a  reason: collision with root package name */
    public final Context f22695a;

    /* renamed from: b  reason: collision with root package name */
    public r f22696b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f22697c;

    /* renamed from: d  reason: collision with root package name */
    public o.c f22698d;

    /* renamed from: e  reason: collision with root package name */
    public final b0 f22699e;

    /* renamed from: f  reason: collision with root package name */
    public final String f22700f;

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f22701g;

    /* renamed from: h  reason: collision with root package name */
    public u f22702h = new u(this);

    /* renamed from: i  reason: collision with root package name */
    public final w1.b f22703i = new w1.b(this, (f) null);

    /* renamed from: r  reason: collision with root package name */
    public boolean f22704r;

    /* renamed from: s  reason: collision with root package name */
    public final kd.d f22705s = kd.e.b(new d(this));

    /* renamed from: t  reason: collision with root package name */
    public final kd.d f22706t = kd.e.b(new e(this));

    /* renamed from: u  reason: collision with root package name */
    public o.c f22707u = o.c.INITIALIZED;

    /* compiled from: NavBackStackEntry.kt */
    public static final class a {
        public a(f fVar) {
        }

        public static /* synthetic */ h b(a aVar, Context context, r rVar, Bundle bundle, o.c cVar, b0 b0Var, String str, Bundle bundle2, int i10) {
            String str2 = null;
            Bundle bundle3 = (i10 & 4) != 0 ? null : bundle;
            o.c cVar2 = (i10 & 8) != 0 ? o.c.CREATED : cVar;
            b0 b0Var2 = (i10 & 16) != 0 ? null : b0Var;
            if ((i10 & 32) != 0) {
                str2 = UUID.randomUUID().toString();
                k.e(str2, "randomUUID().toString()");
            }
            return aVar.a(context, rVar, bundle3, cVar2, b0Var2, str2, (Bundle) null);
        }

        public final h a(Context context, r rVar, Bundle bundle, o.c cVar, b0 b0Var, String str, Bundle bundle2) {
            r rVar2 = rVar;
            k.f(rVar, "destination");
            o.c cVar2 = cVar;
            k.f(cVar, "hostLifecycleState");
            String str2 = str;
            k.f(str, "id");
            return new h(context, rVar, bundle, cVar, b0Var, str, bundle2);
        }
    }

    /* compiled from: NavBackStackEntry.kt */
    public static final class b extends androidx.lifecycle.a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(w1.c cVar) {
            super(cVar, (Bundle) null);
            k.f(cVar, "owner");
        }
    }

    /* compiled from: NavBackStackEntry.kt */
    public static final class c extends q0 {

        /* renamed from: d  reason: collision with root package name */
        public final i0 f22708d;

        public c(i0 i0Var) {
            k.f(i0Var, "handle");
            this.f22708d = i0Var;
        }
    }

    /* compiled from: NavBackStackEntry.kt */
    public static final class d extends l implements td.a<m0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ h f22709b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(h hVar) {
            super(0);
            this.f22709b = hVar;
        }

        public Object d() {
            Context context = this.f22709b.f22695a;
            Application application = null;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
            }
            h hVar = this.f22709b;
            return new m0(application, hVar, hVar.f22697c);
        }
    }

    /* compiled from: NavBackStackEntry.kt */
    public static final class e extends l implements td.a<i0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ h f22710b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(h hVar) {
            super(0);
            this.f22710b = hVar;
        }

        public Object d() {
            h hVar = this.f22710b;
            if (hVar.f22704r) {
                if (hVar.f22702h.f2726b != o.c.DESTROYED) {
                    return ((c) new s0(hVar, new b(hVar)).a(c.class)).f22708d;
                }
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.".toString());
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
    }

    public h(Context context, r rVar, Bundle bundle, o.c cVar, b0 b0Var, String str, Bundle bundle2) {
        this.f22695a = context;
        this.f22696b = rVar;
        this.f22697c = bundle;
        this.f22698d = cVar;
        this.f22699e = b0Var;
        this.f22700f = str;
        this.f22701g = bundle2;
    }

    public final void a(o.c cVar) {
        k.f(cVar, "maxState");
        this.f22707u = cVar;
        b();
    }

    public final void b() {
        if (!this.f22704r) {
            this.f22703i.b();
            this.f22704r = true;
            if (this.f22699e != null) {
                j0.b(this);
            }
            this.f22703i.c(this.f22701g);
        }
        if (this.f22698d.ordinal() < this.f22707u.ordinal()) {
            this.f22702h.j(this.f22698d);
        } else {
            this.f22702h.j(this.f22707u);
        }
    }

    public o c() {
        return this.f22702h;
    }

    public w1.a e() {
        return this.f22703i.f26867b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L_0x0083
            boolean r1 = r7 instanceof o1.h
            if (r1 != 0) goto L_0x0009
            goto L_0x0083
        L_0x0009:
            java.lang.String r1 = r6.f22700f
            o1.h r7 = (o1.h) r7
            java.lang.String r2 = r7.f22700f
            boolean r1 = ud.k.a(r1, r2)
            r2 = 1
            if (r1 == 0) goto L_0x0083
            o1.r r1 = r6.f22696b
            o1.r r3 = r7.f22696b
            boolean r1 = ud.k.a(r1, r3)
            if (r1 == 0) goto L_0x0083
            androidx.lifecycle.u r1 = r6.f22702h
            androidx.lifecycle.u r3 = r7.f22702h
            boolean r1 = ud.k.a(r1, r3)
            if (r1 == 0) goto L_0x0083
            w1.b r1 = r6.f22703i
            w1.a r1 = r1.f26867b
            w1.b r3 = r7.f22703i
            w1.a r3 = r3.f26867b
            boolean r1 = ud.k.a(r1, r3)
            if (r1 == 0) goto L_0x0083
            android.os.Bundle r1 = r6.f22697c
            android.os.Bundle r3 = r7.f22697c
            boolean r1 = ud.k.a(r1, r3)
            if (r1 != 0) goto L_0x0082
            android.os.Bundle r1 = r6.f22697c
            if (r1 == 0) goto L_0x007f
            java.util.Set r1 = r1.keySet()
            if (r1 == 0) goto L_0x007f
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x0054
        L_0x0052:
            r7 = 1
            goto L_0x007b
        L_0x0054:
            java.util.Iterator r1 = r1.iterator()
        L_0x0058:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0052
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            android.os.Bundle r4 = r6.f22697c
            java.lang.Object r4 = r4.get(r3)
            android.os.Bundle r5 = r7.f22697c
            if (r5 == 0) goto L_0x0073
            java.lang.Object r3 = r5.get(r3)
            goto L_0x0074
        L_0x0073:
            r3 = 0
        L_0x0074:
            boolean r3 = ud.k.a(r4, r3)
            if (r3 != 0) goto L_0x0058
            r7 = 0
        L_0x007b:
            if (r7 != r2) goto L_0x007f
            r7 = 1
            goto L_0x0080
        L_0x007f:
            r7 = 0
        L_0x0080:
            if (r7 == 0) goto L_0x0083
        L_0x0082:
            r0 = 1
        L_0x0083:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.h.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Set<String> keySet;
        int hashCode = this.f22696b.hashCode() + (this.f22700f.hashCode() * 31);
        Bundle bundle = this.f22697c;
        if (!(bundle == null || (keySet = bundle.keySet()) == null)) {
            for (String str : keySet) {
                int i10 = hashCode * 31;
                Object obj = this.f22697c.get(str);
                hashCode = i10 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.f22703i.f26867b.hashCode() + ((this.f22702h.hashCode() + (hashCode * 31)) * 31);
    }

    public k1.a l() {
        Application application = null;
        k1.d dVar = new k1.d((k1.a) null, 1);
        Context context = this.f22695a;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext instanceof Application) {
            application = (Application) applicationContext;
        }
        if (application != null) {
            s0.a.C0032a aVar = s0.a.f2718d;
            dVar.f19873a.put(s0.a.C0032a.C0033a.f2721a, application);
        }
        dVar.f19873a.put(j0.f2671a, this);
        dVar.f19873a.put(j0.f2672b, this);
        Bundle bundle = this.f22697c;
        if (bundle != null) {
            dVar.f19873a.put(j0.f2673c, bundle);
        }
        return dVar;
    }

    public u0 v() {
        if (this.f22704r) {
            if (this.f22702h.f2726b != o.c.DESTROYED) {
                b0 b0Var = this.f22699e;
                if (b0Var != null) {
                    return b0Var.a(this.f22700f);
                }
                throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
    }
}

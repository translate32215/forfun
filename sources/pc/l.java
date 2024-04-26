package pc;

import android.app.Application;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.google.gson.internal.Excluder;
import com.google.gson.s;
import com.startapp.startappsdk.R;
import dev.pankaj.ytvclib.utils.C;
import gf.j0;
import gf.l;
import java.util.Collections;
import jf.m;
import jf.n;
import jf.w;
import kd.o;
import n7.c;
import n7.h;
import sc.f;
import sc.g;
import ud.k;
import ze.e;

/* compiled from: CoreApp.kt */
public abstract class l extends Application {

    /* renamed from: g  reason: collision with root package name */
    public static l f23977g;

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f23978a;

    /* renamed from: b  reason: collision with root package name */
    public Gson f23979b;

    /* renamed from: c  reason: collision with root package name */
    public c f23980c;

    /* renamed from: d  reason: collision with root package name */
    public h f23981d;

    /* renamed from: e  reason: collision with root package name */
    public final l.g f23982e = new l.g("coreModule", false, (String) null, a.f23984b, 6);

    /* renamed from: f  reason: collision with root package name */
    public e f23983f;

    /* compiled from: CoreApp.kt */
    public static final class a extends ud.l implements td.l<l.b, o> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f23984b = new a();

        public a() {
            super(1);
        }

        public Object c(Object obj) {
            l.b bVar = (l.b) obj;
            k.f(bVar, "$this$$receiver");
            bVar.e((Object) null, (Boolean) null).a(new w(bVar.b(), bVar.a(), j0.a(new i()), (n) null, true, a.f23973b));
            bVar.e((Object) null, (Boolean) null).a(new w(bVar.b(), bVar.a(), j0.a(new j()), (n) null, true, c.f23974b));
            bVar.e((Object) null, (Boolean) null).a(new w(bVar.b(), bVar.a(), j0.a(new k()), (n) null, true, e.f23975b));
            bVar.e((Object) null, (Boolean) null).a(new m(bVar.a(), j0.a(new h()), g.f23976b));
            return o.f20627a;
        }
    }

    public l() {
        Gson gson = r1;
        Gson gson2 = new Gson(Excluder.f9833f, com.google.gson.c.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, s.DEFAULT, (String) null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
        this.f23979b = gson;
    }

    public static final l g() {
        l lVar = f23977g;
        if (lVar != null) {
            return lVar;
        }
        k.l("instance");
        throw null;
    }

    public final long a() {
        SharedPreferences sharedPreferences = this.f23978a;
        k.c(sharedPreferences);
        return sharedPreferences.getLong("cfa_count", 0);
    }

    public final long b() {
        SharedPreferences sharedPreferences = this.f23978a;
        k.c(sharedPreferences);
        return sharedPreferences.getLong("cfa_time", 0);
    }

    public final f c() {
        SharedPreferences sharedPreferences = this.f23978a;
        k.c(sharedPreferences);
        String string = sharedPreferences.getString("config", (String) null);
        if (string == null) {
            return null;
        }
        try {
            return (f) this.f23979b.b(C.a(C.f13466a, string, (String) null, 2), f.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public final g d() {
        SharedPreferences sharedPreferences = this.f23978a;
        k.c(sharedPreferences);
        String string = sharedPreferences.getString("coupon", (String) null);
        if (string == null) {
            return null;
        }
        return (g) this.f23979b.b(C.a(C.f13466a, string, (String) null, 2), g.class);
    }

    public final synchronized h e() {
        h hVar;
        h hVar2;
        if (this.f23981d == null) {
            if (f() == null) {
                hVar2 = null;
            } else {
                c cVar = this.f23980c;
                if (cVar != null) {
                    String f10 = f();
                    k.c(f10);
                    hVar2 = cVar.c(f10);
                } else {
                    k.l("sAnalytics");
                    throw null;
                }
            }
            if (hVar2 == null) {
                c cVar2 = this.f23980c;
                if (cVar2 != null) {
                    hVar2 = cVar2.b(R.xml.global_tracker);
                } else {
                    k.l("sAnalytics");
                    throw null;
                }
            }
            this.f23981d = hVar2;
        }
        hVar = this.f23981d;
        k.c(hVar);
        return hVar;
    }

    public abstract String f();

    public final void h(f fVar) {
        k.f(fVar, "config");
        String f10 = this.f23979b.f(fVar);
        SharedPreferences sharedPreferences = this.f23978a;
        k.c(sharedPreferences);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        k.e(edit, "editor");
        C c10 = C.f13466a;
        k.e(f10, "data");
        edit.putString("config", C.b(c10, f10, (String) null, 2));
        edit.apply();
        SharedPreferences sharedPreferences2 = this.f23978a;
        k.c(sharedPreferences2);
        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
        k.e(edit2, "editor");
        edit2.putLong("fetched_time", System.currentTimeMillis() / ((long) 1000));
        edit2.apply();
    }

    public final void i(long j10) {
        SharedPreferences sharedPreferences = this.f23978a;
        k.c(sharedPreferences);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        k.e(edit, "editor");
        edit.putLong("cfa_count", j10);
        edit.apply();
    }

    public final void k() {
        SharedPreferences sharedPreferences = this.f23978a;
        k.c(sharedPreferences);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        k.e(edit, "editor");
        edit.putLong("cfa_time", System.currentTimeMillis() / ((long) 1000));
        edit.apply();
    }

    public void onCreate() {
        super.onCreate();
        f23977g = this;
        this.f23978a = getSharedPreferences("app", 0);
        c a10 = c.a(this);
        k.e(a10, "getInstance(this)");
        this.f23980c = a10;
    }
}

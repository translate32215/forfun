package dev.pankaj.yacinetv.ui.splash;

import ae.g;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import dev.pankaj.yacinetv.app.MainApp;
import gf.e0;
import gf.j0;
import gf.p;
import kotlin.reflect.KProperty;
import t4.m;
import t4.r;
import td.l;
import ud.j;
import ud.k;
import ud.q;
import ud.v;

/* compiled from: SplashActivity.kt */
public final class SplashActivity extends gc.a<zb.b> {
    public static final /* synthetic */ KProperty<Object>[] M;
    public final kd.d K;
    public final kd.d L = new r0(v.a(id.a.class), new c(this), new e(this), new d((td.a) null, this));

    /* compiled from: SplashActivity.kt */
    public /* synthetic */ class a extends j implements l<LayoutInflater, zb.b> {

        /* renamed from: i  reason: collision with root package name */
        public static final a f13422i = new a();

        public a() {
            super(1, zb.b.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Ldev/pankaj/yacinetv/databinding/ActivitySplashBinding;", 0);
        }

        public Object c(Object obj) {
            LayoutInflater layoutInflater = (LayoutInflater) obj;
            k.f(layoutInflater, "p0");
            return zb.b.b(layoutInflater);
        }
    }

    /* compiled from: types.kt */
    public static final class b extends e0<id.b> {
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class c extends ud.l implements td.a<u0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f13423b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f13423b = componentActivity;
        }

        public Object d() {
            u0 v10 = this.f13423b.v();
            k.e(v10, "viewModelStore");
            return v10;
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class d extends ud.l implements td.a<k1.a> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f13424b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(td.a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f13424b = componentActivity;
        }

        public Object d() {
            return this.f13424b.l();
        }
    }

    /* compiled from: SplashActivity.kt */
    public static final class e extends ud.l implements td.a<s0.b> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ SplashActivity f13425b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(SplashActivity splashActivity) {
            super(0);
            this.f13425b = splashActivity;
        }

        public Object d() {
            return (id.b) this.f13425b.K.getValue();
        }
    }

    static {
        q qVar = new q(SplashActivity.class, "viewModelFactory", "getViewModelFactory()Ldev/pankaj/ytvlib/ui/splash/viewmodel/SplashViewModelFactory;", 0);
        v.f26198a.getClass();
        M = new g[]{qVar};
    }

    public SplashActivity() {
        super(a.f13422i);
        b bVar = new b();
        k.g(bVar, "ref");
        this.K = p.a(this, j0.b(bVar.f18662a), (Object) null).a(this, M[0]);
    }

    public final id.a N() {
        return (id.a) this.L.getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        N().f19359e.f(this, new s4.g(this, MainApp.l()));
    }

    public void onResume() {
        super.onResume();
        com.google.firebase.remoteconfig.a aVar = (com.google.firebase.remoteconfig.a) this.I.getValue();
        com.google.firebase.remoteconfig.internal.c cVar = aVar.f9758g;
        cVar.f9788e.b().f(cVar.f9786c, new m(cVar, cVar.f9790g.f9797a.getLong("minimum_fetch_interval_in_seconds", com.google.firebase.remoteconfig.internal.c.f9782i))).n(r.f25724b).m(aVar.f9754c, new r0.b(aVar)).b(new r0.b(this));
    }
}

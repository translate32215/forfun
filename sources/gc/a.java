package gc;

import ae.g;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import com.startapp.startappsdk.R;
import dev.pankaj.yacinetv.app.MainApp;
import e2.a;
import f.i;
import gf.e0;
import gf.j0;
import gf.o;
import gf.p;
import gf.s;
import gf.x;
import kd.d;
import kd.e;
import kotlin.reflect.KProperty;
import n7.h;
import sc.f;
import td.l;
import ud.k;
import ud.q;
import ud.v;
import ud.w;

/* compiled from: BaseActivity.kt */
public abstract class a<T extends e2.a> extends i implements o {
    public static final /* synthetic */ KProperty<Object>[] J;
    public final l<LayoutInflater, T> C;
    public final d D = e.b(new hf.a(this));
    public f E;
    public final d F = e.b(new C0147a(this));
    public Dialog G;
    public Dialog H;
    public final d I;

    /* renamed from: gc.a$a  reason: collision with other inner class name */
    /* compiled from: BaseActivity.kt */
    public static final class C0147a extends ud.l implements td.a<T> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a<T> f18615b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0147a(a<T> aVar) {
            super(0);
            this.f18615b = aVar;
        }

        public Object d() {
            a<T> aVar = this.f18615b;
            l<LayoutInflater, T> lVar = aVar.C;
            LayoutInflater layoutInflater = aVar.getLayoutInflater();
            k.e(layoutInflater, "layoutInflater");
            return (e2.a) lVar.c(layoutInflater);
        }
    }

    /* compiled from: BaseActivity.kt */
    public static final class b extends ud.l implements l<View, kd.o> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ td.a<kd.o> f18616b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(td.a<kd.o> aVar) {
            super(1);
            this.f18616b = aVar;
        }

        public Object c(Object obj) {
            k.f((View) obj, "it");
            this.f18616b.d();
            return kd.o.f20627a;
        }
    }

    /* compiled from: types.kt */
    public static final class c extends e0<com.google.firebase.remoteconfig.a> {
    }

    static {
        Class<a> cls = a.class;
        q qVar = new q(cls, "kodein", "getKodein()Lorg/kodein/di/Kodein;", 0);
        w wVar = v.f26198a;
        wVar.getClass();
        q qVar2 = new q(cls, "fbConfig", "getFbConfig()Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", 0);
        wVar.getClass();
        J = new g[]{qVar, qVar2};
    }

    public a(l<? super LayoutInflater, ? extends T> lVar) {
        this.C = lVar;
        g[] gVarArr = J;
        g gVar = gVarArr[0];
        c cVar = new c();
        g[] gVarArr2 = j0.f18667a;
        this.I = p.a(this, j0.b(cVar.f18662a), (Object) null).a(this, gVarArr[1]);
    }

    public final T L() {
        return (e2.a) this.F.getValue();
    }

    public final void M(boolean z10, td.a<kd.o> aVar) {
        Dialog dialog = this.G;
        if (dialog != null) {
            View findViewById = dialog.findViewById(R.id.retry);
            k.e(findViewById, "noInternet.findViewById<Button>(R.id.retry)");
            b8.a.h(findViewById, new b(aVar));
            if (z10) {
                Dialog dialog2 = this.G;
                if (dialog2 == null) {
                    k.l("noInternet");
                    throw null;
                } else if (!dialog2.isShowing()) {
                    Dialog dialog3 = this.H;
                    if (dialog3 != null) {
                        if (dialog3.isShowing()) {
                            Dialog dialog4 = this.H;
                            if (dialog4 != null) {
                                dialog4.dismiss();
                            } else {
                                k.l("loader");
                                throw null;
                            }
                        }
                        Dialog dialog5 = this.G;
                        if (dialog5 != null) {
                            dialog5.show();
                            return;
                        } else {
                            k.l("noInternet");
                            throw null;
                        }
                    } else {
                        k.l("loader");
                        throw null;
                    }
                }
            }
            Dialog dialog6 = this.G;
            if (dialog6 == null) {
                k.l("noInternet");
                throw null;
            } else if (dialog6.isShowing()) {
                Dialog dialog7 = this.G;
                if (dialog7 != null) {
                    dialog7.dismiss();
                } else {
                    k.l("noInternet");
                    throw null;
                }
            }
        } else {
            k.l("noInternet");
            throw null;
        }
    }

    public gf.l j() {
        return (gf.l) this.D.getValue();
    }

    public void onCreate(Bundle bundle) {
        MainApp l10 = MainApp.l();
        h e10 = l10.e();
        e10.o("&cd", "MAIN");
        e10.i(new n7.f().a());
        this.E = l10.c();
        super.onCreate(bundle);
        setContentView(L().a());
        if (this.H == null) {
            Dialog dialog = new Dialog(this);
            this.H = dialog;
            Window window = dialog.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            Dialog dialog2 = this.H;
            if (dialog2 != null) {
                dialog2.setContentView(R.layout.custom_loader);
                Dialog dialog3 = this.H;
                if (dialog3 != null) {
                    dialog3.setCanceledOnTouchOutside(false);
                    Dialog dialog4 = this.H;
                    if (dialog4 != null) {
                        dialog4.setCancelable(false);
                    } else {
                        k.l("loader");
                        throw null;
                    }
                } else {
                    k.l("loader");
                    throw null;
                }
            } else {
                k.l("loader");
                throw null;
            }
        }
        if (this.G == null) {
            Dialog dialog5 = new Dialog(this);
            this.G = dialog5;
            Window window2 = dialog5.getWindow();
            if (window2 != null) {
                window2.setBackgroundDrawable(new ColorDrawable(0));
            }
            Dialog dialog6 = this.G;
            if (dialog6 != null) {
                dialog6.setContentView(R.layout.no_internet);
            } else {
                k.l("noInternet");
                throw null;
            }
        }
    }

    public x w() {
        return null;
    }

    public s<?> z() {
        gf.g gVar = gf.g.f18665b;
        return gf.g.f18664a;
    }
}

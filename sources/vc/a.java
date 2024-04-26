package vc;

import ae.g;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.databinding.ViewDataBinding;
import com.startapp.startappsdk.R;
import f.i;
import gf.o;
import gf.s;
import gf.x;
import kd.d;
import kd.e;
import kotlin.reflect.KProperty;
import n7.h;
import sc.f;
import ud.k;
import ud.l;
import ud.q;
import ud.v;
import ud.w;

/* compiled from: DataBindingAppCompatActivity.kt */
public abstract class a<T extends ViewDataBinding> extends i implements o {
    public static final /* synthetic */ KProperty<Object>[] H;
    public final d C = e.b(new hf.a(this));
    public f D;
    public final wd.a E;
    public Dialog F;
    public Dialog G;

    /* renamed from: vc.a$a  reason: collision with other inner class name */
    /* compiled from: DataBindingAppCompatActivity.kt */
    public static final class C0267a extends l implements td.a<kd.o> {

        /* renamed from: b  reason: collision with root package name */
        public static final C0267a f26723b = new C0267a();

        public C0267a() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object d() {
            return kd.o.f20627a;
        }
    }

    /* compiled from: DataBindingAppCompatActivity.kt */
    public static final class b extends l implements td.l<View, kd.o> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ td.a<kd.o> f26724b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(td.a<kd.o> aVar) {
            super(1);
            this.f26724b = aVar;
        }

        public Object c(Object obj) {
            k.f((View) obj, "it");
            this.f26724b.d();
            return kd.o.f20627a;
        }
    }

    static {
        Class<a> cls = a.class;
        q qVar = new q(cls, "kodein", "getKodein()Lorg/kodein/di/Kodein;", 0);
        w wVar = v.f26198a;
        wVar.getClass();
        q qVar2 = new q(cls, "binding", "getBinding()Landroidx/databinding/ViewDataBinding;", 0);
        wVar.getClass();
        H = new g[]{qVar, qVar2};
    }

    public a(int i10) {
        KProperty<Object> kProperty = H[0];
        this.E = new uc.a(i10, this);
    }

    public final T L() {
        return (ViewDataBinding) this.E.a(this, H[1]);
    }

    public final void M(boolean z10) {
        if (z10) {
            Dialog dialog = this.F;
            if (dialog == null) {
                k.l("loader");
                throw null;
            } else if (!dialog.isShowing()) {
                N(false, C0267a.f26723b);
                Dialog dialog2 = this.F;
                if (dialog2 != null) {
                    dialog2.show();
                    return;
                } else {
                    k.l("loader");
                    throw null;
                }
            }
        }
        Dialog dialog3 = this.F;
        if (dialog3 == null) {
            k.l("loader");
            throw null;
        } else if (dialog3.isShowing()) {
            Dialog dialog4 = this.F;
            if (dialog4 != null) {
                dialog4.dismiss();
            } else {
                k.l("loader");
                throw null;
            }
        }
    }

    public final void N(boolean z10, td.a<kd.o> aVar) {
        Dialog dialog = this.G;
        if (dialog != null) {
            View findViewById = dialog.findViewById(R.id.retry);
            k.e(findViewById, "noInternet.findViewById<Button>(R.id.retry)");
            findViewById.setOnClickListener(new ac.a(new b(aVar), 1));
            if (z10) {
                Dialog dialog2 = this.G;
                if (dialog2 == null) {
                    k.l("noInternet");
                    throw null;
                } else if (!dialog2.isShowing()) {
                    M(false);
                    Dialog dialog3 = this.G;
                    if (dialog3 != null) {
                        dialog3.show();
                        return;
                    } else {
                        k.l("noInternet");
                        throw null;
                    }
                }
            }
            Dialog dialog4 = this.G;
            if (dialog4 == null) {
                k.l("noInternet");
                throw null;
            } else if (dialog4.isShowing()) {
                Dialog dialog5 = this.G;
                if (dialog5 != null) {
                    dialog5.dismiss();
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
        return (gf.l) this.C.getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        pc.l g10 = pc.l.g();
        h e10 = g10.e();
        e10.o("&cd", "MAIN");
        e10.i(new n7.f().a());
        this.D = g10.c();
        if (this.F == null) {
            Dialog dialog = new Dialog(this);
            this.F = dialog;
            Window window = dialog.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            Dialog dialog2 = this.F;
            if (dialog2 != null) {
                dialog2.setContentView(R.layout.custom_loader);
                Dialog dialog3 = this.F;
                if (dialog3 != null) {
                    dialog3.setCanceledOnTouchOutside(false);
                    Dialog dialog4 = this.F;
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

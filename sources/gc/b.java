package gc;

import ad.e;
import ae.g;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import androidx.fragment.app.p;
import com.startapp.sdk.ads.banner.Banner;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.startappsdk.R;
import dev.pankaj.yacinetv.app.MainApp;
import dev.pankaj.ytvlib.ui.base.FragmentViewBindingDelegate;
import e2.a;
import gf.o;
import gf.s;
import gf.x;
import hf.c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import kd.d;
import kotlin.reflect.KProperty;
import sc.f;
import t2.q0;
import ud.k;
import ud.l;
import ud.q;
import ud.v;
import ud.w;
import y6.c;

/* compiled from: BaseFragment.kt */
public abstract class b<T extends e2.a> extends p implements o {

    /* renamed from: t0  reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f18617t0;

    /* renamed from: n0  reason: collision with root package name */
    public final d f18618n0 = new c(new p000if.b(this)).a(this, f18617t0[0]);

    /* renamed from: o0  reason: collision with root package name */
    public final FragmentViewBindingDelegate f18619o0;

    /* renamed from: p0  reason: collision with root package name */
    public Dialog f18620p0;

    /* renamed from: q0  reason: collision with root package name */
    public Dialog f18621q0;

    /* renamed from: r0  reason: collision with root package name */
    public f f18622r0;

    /* renamed from: s0  reason: collision with root package name */
    public dev.pankaj.ytvclib.utils.b f18623s0;

    /* compiled from: BaseFragment.kt */
    public static final class a extends l implements td.a<kd.o> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f18624b = new a();

        public a() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object d() {
            return kd.o.f20627a;
        }
    }

    /* renamed from: gc.b$b  reason: collision with other inner class name */
    /* compiled from: BaseFragment.kt */
    public static final class C0148b extends l implements td.l<View, kd.o> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ td.a<kd.o> f18625b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0148b(td.a<kd.o> aVar) {
            super(1);
            this.f18625b = aVar;
        }

        public Object c(Object obj) {
            k.f((View) obj, "it");
            this.f18625b.d();
            return kd.o.f20627a;
        }
    }

    static {
        q qVar = new q(b.class, "kodein", "getKodein()Lorg/kodein/di/Kodein;", 0);
        w wVar = v.f26198a;
        wVar.getClass();
        q qVar2 = new q(b.class, "binding", "getBinding()Landroidx/viewbinding/ViewBinding;", 0);
        wVar.getClass();
        f18617t0 = new g[]{qVar, qVar2};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(int i10, td.l<? super View, ? extends T> lVar) {
        super(i10);
        k.f(lVar, "viewBindingFactory");
        this.f18619o0 = new FragmentViewBindingDelegate(this, lVar);
    }

    public void O(Bundle bundle) {
        super.O(bundle);
        this.f18622r0 = MainApp.l().c();
        this.f18623s0 = dev.pankaj.ytvclib.utils.b.f13468i.a(h0(), this.f18622r0);
        if (this.f18620p0 == null) {
            Dialog dialog = new Dialog(h0());
            this.f18620p0 = dialog;
            Window window = dialog.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            Dialog dialog2 = this.f18620p0;
            if (dialog2 != null) {
                dialog2.setContentView(R.layout.custom_loader);
                Dialog dialog3 = this.f18620p0;
                if (dialog3 != null) {
                    dialog3.setCanceledOnTouchOutside(false);
                    Dialog dialog4 = this.f18620p0;
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
        if (this.f18621q0 == null) {
            Dialog dialog5 = new Dialog(h0());
            this.f18621q0 = dialog5;
            Window window2 = dialog5.getWindow();
            if (window2 != null) {
                window2.setBackgroundDrawable(new ColorDrawable(0));
            }
            Dialog dialog6 = this.f18621q0;
            if (dialog6 != null) {
                dialog6.setContentView(R.layout.no_internet);
            } else {
                k.l("noInternet");
                throw null;
            }
        }
    }

    public gf.l j() {
        return (gf.l) this.f18618n0.getValue();
    }

    public final T r0() {
        return this.f18619o0.a(this, f18617t0[1]);
    }

    public final void s0(ViewGroup viewGroup) {
        dev.pankaj.ytvclib.utils.b bVar = this.f18623s0;
        if (bVar != null) {
            androidx.fragment.app.q g02 = g0();
            int i10 = bVar.f13471b;
            if (i10 == 1) {
                f fVar = bVar.f13470a;
                if (fVar != null) {
                    String a10 = fVar.a().f().a();
                    ad.d dVar = new ad.d(viewGroup);
                    k.f(a10, "data");
                    if (a10.length() > 0) {
                        WebView webView = new WebView(g02);
                        webView.loadData(k.j("<meta name=\"viewport\" content=\"width=device-width, user-scalable=no\" />", a10), "text/html", "UTF-8");
                        webView.setBackgroundColor(0);
                        webView.getSettings().setUseWideViewPort(true);
                        webView.getSettings().setJavaScriptEnabled(true);
                        webView.setWebViewClient(new ad.g(dVar));
                    }
                }
            } else if (i10 == 2) {
                f fVar2 = bVar.f13470a;
                if (fVar2 != null) {
                    y6.f fVar3 = new y6.f(g02);
                    fVar3.setAdSize(y6.d.f28116l);
                    fVar3.setAdUnitId(fVar2.a().c().a());
                    fVar3.setAdListener(new ad.c(viewGroup));
                    fVar3.a(new y6.c(new c.a()));
                    viewGroup.removeAllViews();
                    viewGroup.addView(fVar3);
                }
            } else if (i10 == 3) {
                viewGroup.addView(new Banner((Activity) g02, (BannerListener) new e(viewGroup)));
            } else if (i10 == 5) {
                f fVar4 = bVar.f13470a;
                if (fVar4 != null) {
                    ad.a aVar = new ad.a(viewGroup);
                    String b10 = fVar4.a().a().b();
                    t2.e eVar = t2.e.f25451a;
                    ExecutorService executorService = com.adcolony.sdk.a.f4411a;
                    if (!com.adcolony.sdk.f.f4480c) {
                        p.f.a(0, 1, "Ignoring call to requestAdView as AdColony has not yet been configured.", false);
                        com.adcolony.sdk.a.b(aVar, b10);
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("zone_id", b10);
                    if (q0.a(1, bundle)) {
                        com.adcolony.sdk.a.b(aVar, b10);
                        return;
                    }
                    try {
                        com.adcolony.sdk.a.f4411a.execute(new t2.c(aVar, b10, eVar));
                    } catch (RejectedExecutionException unused) {
                        com.adcolony.sdk.a.b(aVar, b10);
                    }
                }
            } else if (i10 == 6) {
                bVar.e(g02, viewGroup);
            } else if (i10 == 7) {
                bVar.i(g02, viewGroup);
            }
        } else {
            k.l("adUtil");
            throw null;
        }
    }

    public final void t0(boolean z10) {
        if (z10) {
            Dialog dialog = this.f18620p0;
            if (dialog == null) {
                k.l("loader");
                throw null;
            } else if (!dialog.isShowing()) {
                u0(false, a.f18624b);
                Dialog dialog2 = this.f18620p0;
                if (dialog2 != null) {
                    dialog2.show();
                    return;
                } else {
                    k.l("loader");
                    throw null;
                }
            }
        }
        Dialog dialog3 = this.f18620p0;
        if (dialog3 == null) {
            k.l("loader");
            throw null;
        } else if (dialog3.isShowing()) {
            Dialog dialog4 = this.f18620p0;
            if (dialog4 != null) {
                dialog4.dismiss();
            } else {
                k.l("loader");
                throw null;
            }
        }
    }

    public final void u0(boolean z10, td.a<kd.o> aVar) {
        Dialog dialog = this.f18621q0;
        if (dialog != null) {
            View findViewById = dialog.findViewById(R.id.retry);
            k.e(findViewById, "noInternet.findViewById<Button>(R.id.retry)");
            b8.a.h(findViewById, new C0148b(aVar));
            if (z10) {
                Dialog dialog2 = this.f18621q0;
                if (dialog2 == null) {
                    k.l("noInternet");
                    throw null;
                } else if (!dialog2.isShowing()) {
                    t0(false);
                    Dialog dialog3 = this.f18621q0;
                    if (dialog3 != null) {
                        dialog3.show();
                        return;
                    } else {
                        k.l("noInternet");
                        throw null;
                    }
                }
            }
            Dialog dialog4 = this.f18621q0;
            if (dialog4 == null) {
                k.l("noInternet");
                throw null;
            } else if (dialog4.isShowing()) {
                Dialog dialog5 = this.f18621q0;
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

    public x w() {
        return null;
    }

    public s<?> z() {
        gf.g gVar = gf.g.f18665b;
        return gf.g.f18664a;
    }
}

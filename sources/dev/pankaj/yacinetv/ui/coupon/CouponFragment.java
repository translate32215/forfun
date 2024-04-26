package dev.pankaj.yacinetv.ui.coupon;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.o0;
import androidx.fragment.app.p;
import androidx.lifecycle.n;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import com.google.android.material.textfield.TextInputLayout;
import com.startapp.startappsdk.R;
import dev.pankaj.yacinetv.app.MainApp;
import dev.pankaj.ytvlib.ui.base.FragmentViewBindingDelegate;
import gf.e0;
import gf.j0;
import gf.o;
import gf.s;
import gf.x;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import k1.a;
import kotlin.reflect.KProperty;
import qc.m;
import td.l;
import ud.j;
import ud.k;
import ud.q;
import ud.v;
import ud.w;

/* compiled from: CouponFragment.kt */
public final class CouponFragment extends com.google.android.material.bottomsheet.b implements o {
    public static final /* synthetic */ KProperty<Object>[] I0;
    public final kd.d D0;
    public final FragmentViewBindingDelegate E0 = new FragmentViewBindingDelegate(this, a.f13360i);
    public final kd.d F0;
    public final kd.d G0;
    public sc.f H0;

    /* compiled from: CouponFragment.kt */
    public /* synthetic */ class a extends j implements l<View, zb.e> {

        /* renamed from: i  reason: collision with root package name */
        public static final a f13360i = new a();

        public a() {
            super(1, zb.e.class, "bind", "bind(Landroid/view/View;)Ldev/pankaj/yacinetv/databinding/FragmentCouponBinding;", 0);
        }

        public Object c(Object obj) {
            View view = (View) obj;
            k.f(view, "p0");
            int i10 = R.id.apply;
            Button button = (Button) b8.a.d(view, R.id.apply);
            if (button != null) {
                i10 = R.id.coupon;
                TextInputLayout textInputLayout = (TextInputLayout) b8.a.d(view, R.id.coupon);
                if (textInputLayout != null) {
                    i10 = R.id.description;
                    TextView textView = (TextView) b8.a.d(view, R.id.description);
                    if (textView != null) {
                        i10 = R.id.guideline_end;
                        Guideline guideline = (Guideline) b8.a.d(view, R.id.guideline_end);
                        if (guideline != null) {
                            i10 = R.id.guideline_start;
                            Guideline guideline2 = (Guideline) b8.a.d(view, R.id.guideline_start);
                            if (guideline2 != null) {
                                i10 = R.id.loading;
                                ProgressBar progressBar = (ProgressBar) b8.a.d(view, R.id.loading);
                                if (progressBar != null) {
                                    i10 = R.id.status;
                                    TextView textView2 = (TextView) b8.a.d(view, R.id.status);
                                    if (textView2 != null) {
                                        i10 = R.id.title;
                                        TextView textView3 = (TextView) b8.a.d(view, R.id.title);
                                        if (textView3 != null) {
                                            return new zb.e((ConstraintLayout) view, button, textInputLayout, textView, guideline, guideline2, progressBar, textView2, textView3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
        }
    }

    /* compiled from: CouponFragment.kt */
    public static final class b extends ud.l implements l<View, kd.o> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ CouponFragment f13361b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(CouponFragment couponFragment) {
            super(1);
            this.f13361b = couponFragment;
        }

        public Object c(Object obj) {
            k.f((View) obj, "it");
            CouponFragment couponFragment = this.f13361b;
            KProperty<Object>[] kPropertyArr = CouponFragment.I0;
            EditText editText = couponFragment.x0().f28794c.getEditText();
            String str = null;
            Editable text = editText != null ? editText.getText() : null;
            TextInputLayout textInputLayout = this.f13361b.x0().f28794c;
            if (text == null || text.length() == 0) {
                str = this.f13361b.D(R.string.premium_enter_coupon);
            } else {
                ed.b bVar = (ed.b) this.f13361b.G0.getValue();
                String obj2 = text.toString();
                bVar.getClass();
                k.f(obj2, "coupon");
                m.b bVar2 = new m.b((Object) null, 1);
                if (!k.a(bVar.f17838e.d(), bVar2)) {
                    bVar.f17838e.l(bVar2);
                }
                e.j.b(o.a.f(bVar), (md.f) null, 0, new ed.a(bVar, obj2, (md.d<? super ed.a>) null), 3, (Object) null);
            }
            textInputLayout.setError(str);
            return kd.o.f20627a;
        }
    }

    /* compiled from: types.kt */
    public static final class c extends e0<ed.c> {
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class d extends ud.l implements td.a<p> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ p f13362b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(p pVar) {
            super(0);
            this.f13362b = pVar;
        }

        public Object d() {
            return this.f13362b;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class e extends ud.l implements td.a<v0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ td.a f13363b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(td.a aVar) {
            super(0);
            this.f13363b = aVar;
        }

        public Object d() {
            return (v0) this.f13363b.d();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class f extends ud.l implements td.a<u0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ kd.d f13364b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(kd.d dVar) {
            super(0);
            this.f13364b = dVar;
        }

        public Object d() {
            u0 v10 = o0.a(this.f13364b).v();
            k.e(v10, "owner.viewModelStore");
            return v10;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class g extends ud.l implements td.a<k1.a> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ kd.d f13365b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(td.a aVar, kd.d dVar) {
            super(0);
            this.f13365b = dVar;
        }

        public Object d() {
            v0 a10 = o0.a(this.f13365b);
            k1.a aVar = null;
            n nVar = a10 instanceof n ? (n) a10 : null;
            if (nVar != null) {
                aVar = nVar.l();
            }
            return aVar == null ? a.C0172a.f19874b : aVar;
        }
    }

    /* compiled from: CouponFragment.kt */
    public static final class h extends ud.l implements td.a<s0.b> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ CouponFragment f13366b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(CouponFragment couponFragment) {
            super(0);
            this.f13366b = couponFragment;
        }

        public Object d() {
            return (ed.c) this.f13366b.F0.getValue();
        }
    }

    static {
        q qVar = new q(CouponFragment.class, "kodein", "getKodein()Lorg/kodein/di/Kodein;", 0);
        w wVar = v.f26198a;
        wVar.getClass();
        q qVar2 = new q(CouponFragment.class, "binding", "getBinding()Ldev/pankaj/yacinetv/databinding/FragmentCouponBinding;", 0);
        wVar.getClass();
        q qVar3 = new q(CouponFragment.class, "viewModelFactory", "getViewModelFactory()Ldev/pankaj/ytvlib/ui/coupon/viewmodel/CouponViewModelFactory;", 0);
        wVar.getClass();
        I0 = new ae.g[]{qVar, qVar2, qVar3};
    }

    public CouponFragment() {
        hf.c cVar = new hf.c(new p000if.b(this));
        ae.g[] gVarArr = I0;
        this.D0 = cVar.a(this, gVarArr[0]);
        c cVar2 = new c();
        ae.g[] gVarArr2 = j0.f18667a;
        this.F0 = gf.p.a(this, j0.b(cVar2.f18662a), (Object) null).a(this, gVarArr[2]);
        h hVar = new h(this);
        kd.d a10 = kd.e.a(kd.f.NONE, new e(new d(this)));
        this.G0 = new r0(v.a(ed.b.class), new f(a10), hVar, new g((td.a) null, a10));
    }

    public void O(Bundle bundle) {
        super.O(bundle);
        this.H0 = MainApp.l().c();
    }

    public View P(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_coupon, viewGroup, false);
    }

    public void d0(View view, Bundle bundle) {
        sc.g e10;
        k.f(view, "view");
        MainApp l10 = MainApp.l();
        sc.f fVar = this.H0;
        if (fVar == null || (e10 = fVar.e()) == null) {
            TextView textView = x0().f28796e;
            textView.setText(R.string.premium_no);
            textView.setTextColor(-7829368);
        } else if (e10.b() > System.currentTimeMillis() / ((long) 1000)) {
            TextView textView2 = x0().f28796e;
            String format = new SimpleDateFormat("d/M/y HH:mm", Locale.US).format(new Date(e10.b() * 1000));
            k.e(format, "SimpleDateFormat(pattern….format(Date(timeMillis))");
            textView2.setText(E(R.string.premium_until, format));
            textView2.setTextColor(-16711936);
        } else {
            TextView textView3 = x0().f28796e;
            String format2 = new SimpleDateFormat("d/M/y HH:mm", Locale.US).format(new Date(e10.b() * 1000));
            k.e(format2, "SimpleDateFormat(pattern….format(Date(timeMillis))");
            textView3.setText(E(R.string.premium_expired, format2));
            textView3.setTextColor(-65536);
        }
        ((ed.b) this.G0.getValue()).f17838e.f(F(), new s4.g(this, l10));
        Button button = x0().f28793b;
        k.e(button, "binding.apply");
        b8.a.h(button, new b(this));
    }

    public gf.l j() {
        return (gf.l) this.D0.getValue();
    }

    public x w() {
        return null;
    }

    public final zb.e x0() {
        return (zb.e) this.E0.a(this, I0[1]);
    }

    public final void y0(boolean z10) {
        Button button = x0().f28793b;
        k.e(button, "binding.apply");
        int i10 = 4;
        button.setVisibility(z10 ? 4 : 0);
        ProgressBar progressBar = x0().f28795d;
        k.e(progressBar, "binding.loading");
        if (!(!z10)) {
            i10 = 0;
        }
        progressBar.setVisibility(i10);
    }

    public s<?> z() {
        gf.g gVar = gf.g.f18665b;
        return gf.g.f18664a;
    }
}

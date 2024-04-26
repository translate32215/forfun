package e8;

import android.os.Bundle;
import androidx.appcompat.widget.o;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.Cif;
import com.google.android.gms.internal.ads.ai;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.ff;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.ub;
import com.google.android.gms.internal.ads.vb;
import e8.kj;
import java.util.Iterator;
import n2.g;
import x6.c;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class zu<AdT, AdapterT, ListenerT extends kj> implements lt<AdT> {

    /* renamed from: a  reason: collision with root package name */
    public final ub<AdapterT, ListenerT> f17794a;

    /* renamed from: b  reason: collision with root package name */
    public final vb<AdT, AdapterT, ListenerT> f17795b;

    /* renamed from: c  reason: collision with root package name */
    public final n20 f17796c;

    /* renamed from: d  reason: collision with root package name */
    public final o50 f17797d;

    public zu(n20 n20, o50 o50, ub<AdapterT, ListenerT> ubVar, vb<AdT, AdapterT, ListenerT> vbVar) {
        this.f17796c = n20;
        this.f17797d = o50;
        this.f17795b = vbVar;
        this.f17794a = ubVar;
    }

    public static String c(String str, int i10) {
        StringBuilder sb2 = new StringBuilder(o.a(str, 31));
        sb2.append("Error from: ");
        sb2.append(str);
        sb2.append(", code: ");
        sb2.append(i10);
        return sb2.toString();
    }

    public final boolean a(t00 t00, qe qeVar) {
        return !qeVar.f7966s.isEmpty();
    }

    public final p50<AdT> b(t00 t00, qe qeVar) {
        mt<AdapterT, ListenerT> mtVar;
        Class<AdMobAdapter> cls = AdMobAdapter.class;
        Iterator<String> it = qeVar.f7966s.iterator();
        while (true) {
            if (!it.hasNext()) {
                mtVar = null;
                break;
            }
            try {
                mtVar = this.f17794a.a(it.next(), qeVar.f7968u);
                break;
            } catch (b10 unused) {
            }
        }
        if (mtVar == null) {
            return new ai.a(new mu("unable to instantiate mediation adapter class"));
        }
        d7 d7Var = new d7();
        mtVar.f15551c.m(new c(this, mtVar, d7Var));
        if (qeVar.H) {
            Bundle bundle = ((w00) t00.f16700a.f8042b).f17190d.f14643u;
            Bundle bundle2 = bundle.getBundle(cls.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(cls.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        t1.c c10 = this.f17796c.c(Cif.ADAPTER_LOAD_AD_SYN);
        mr mrVar = new mr(this, t00, qeVar, (mt) mtVar);
        dv h10 = c10.h(new wy((ff) mrVar), this.f17797d);
        dv g10 = ((k20) h10.f14338f).b(Cif.ADAPTER_LOAD_AD_ACK, h10.e()).g(d7Var);
        return ((k20) g10.f14338f).b(Cif.ADAPTER_WRAP_ADAPTER, g10.e()).f(new g(this, t00, qeVar, (mt) mtVar)).e();
    }
}

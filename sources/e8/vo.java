package e8;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.internal.ads.gf;
import com.google.android.gms.internal.ads.j8;
import com.google.android.gms.internal.ads.ld;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.re;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.ri;
import com.google.android.gms.internal.ads.s7;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.ug;
import com.google.android.gms.internal.ads.vg;
import com.google.android.gms.internal.ads.w6;
import com.google.android.gms.internal.ads.yh;
import d7.l;
import e7.i;
import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class vo implements oh {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17155a = 5;

    /* renamed from: b  reason: collision with root package name */
    public final Object f17156b;

    public vo(ld ldVar) {
        this.f17156b = ldVar;
    }

    public final p50 a(Object obj) {
        switch (this.f17155a) {
            case 0:
                uo uoVar = (uo) this.f17156b;
                t7 a10 = uoVar.f16979c.a(li0.j(), (qe) null, (re) null);
                m9 m9Var = new m9(a10);
                uoVar.a(a10);
                ((s7) a10.H()).f8096h = new bc(m9Var, 2);
                a10.loadUrl((String) ti0.f16763j.f16769f.a(t.H1));
                return m9Var;
            case 1:
                return yh.h(new t00(new ri((w00) ((mr) this.f17156b).f15538c), j8.f(new StringReader(((JSONObject) obj).toString()))));
            case 2:
                qd qdVar = (qd) this.f17156b;
                qdVar.getClass();
                o50 a11 = me.a();
                vg<dy> x10 = vg.x(new px(new ow((o8) new w6(), me.a(), kf.a(qdVar.f16124a)), 0, qdVar.f16144u.f15632m.get()), new px(new ow((m6) new l6(), qdVar.f16144u.f15632m.get(), zc.a(qdVar.f16144u.f15610b)), ((Long) ti0.f16763j.f16769f.a(t.W1)).longValue(), qdVar.f16144u.f15632m.get()), new px(new my(new q8(), zc.a(qdVar.f16144u.f15610b), qdVar.f16144u.f15632m.get(), me.a(), qdVar.f16124a.f8121a), 0, qdVar.f16144u.f15632m.get()), new px(new cz(me.a()), 0, qdVar.f16144u.f15632m.get()), az.f13859a, new fw((f7) null, zc.a(qdVar.f16144u.f15610b), kf.a(qdVar.f16124a), me.a()), new ow((mh0) new oh0(), me.a(), zc.a(qdVar.f16144u.f15610b)), qdVar.a(), qdVar.b(), new sy(new q8(), qdVar.f16124a.f8121a, zc.a(qdVar.f16144u.f15610b), qdVar.f16144u.R.get(), qdVar.f16144u.f15632m.get(), me.a()), (dy) qdVar.f16144u.S.get());
                JSONObject v10 = l.B.f13186c.v((Bundle) obj);
                ArrayList arrayList = new ArrayList(x10.size());
                for (dy dyVar : x10) {
                    p50 b10 = dyVar.b();
                    if (((Boolean) v0.f17011a.b()).booleanValue()) {
                        b10.a(new ey(dyVar, l.B.f13193j.a()), h9.f14886f);
                    }
                    arrayList.add(b10);
                }
                return new rh(ug.A(arrayList), true, a11, new i7((List) arrayList, (Object) v10));
            case 3:
                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                ParcelFileDescriptor parcelFileDescriptor2 = createPipe[1];
                o50 o50 = h9.f14881a;
                ((k9) o50).f15244a.execute(new i((InputStream) obj, parcelFileDescriptor2));
                return yh.h(parcelFileDescriptor);
            case 4:
                ld ldVar = (ld) this.f17156b;
                return yh.i(ldVar.v6("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new bw(ldVar, (ArrayList) obj), ldVar.f7373f);
            default:
                return yh.h(((gf) this.f17156b).apply((Throwable) obj));
        }
    }

    public vo(gf gfVar) {
        this.f17156b = gfVar;
    }

    public vo(qd qdVar) {
        this.f17156b = qdVar;
    }

    public vo(uo uoVar) {
        this.f17156b = uoVar;
    }

    public vo(mr mrVar) {
        this.f17156b = mrVar;
    }

    public vo(cs csVar) {
        this.f17156b = csVar;
    }
}

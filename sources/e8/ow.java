package e8;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.widget.p;
import com.google.android.gms.ads.internal.util.q;
import com.google.android.gms.internal.ads.gb;
import com.google.android.gms.internal.ads.p6;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.ug;
import com.google.android.gms.internal.ads.yh;
import f7.h0;
import java.math.BigInteger;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import q.e;
import q.f;
import q.g;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ow implements dy<nw> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15851a = 3;

    /* renamed from: b  reason: collision with root package name */
    public Object f15852b;

    /* renamed from: c  reason: collision with root package name */
    public Object f15853c;

    /* renamed from: d  reason: collision with root package name */
    public Object f15854d;

    public ow(p6 p6Var, o50 o50, Context context) {
        this.f15852b = p6Var;
        this.f15853c = o50;
        this.f15854d = context;
    }

    public final p50 b() {
        boolean z10 = true;
        switch (this.f15851a) {
            case 0:
                if (new BigInteger((String) this.f15852b).equals(BigInteger.ONE)) {
                    String str = (String) ti0.f16763j.f16769f.a(t.O0);
                    int i10 = j40.f15091a;
                    if (str != null && !str.isEmpty()) {
                        z10 = false;
                    }
                    if (!z10) {
                        return ((o50) this.f15853c).i(new h0(this));
                    }
                }
                return yh.h(new nw(new Bundle(), (p) null));
            case 1:
                return ((o50) this.f15853c).i(new wy(this, (e) null));
            case 2:
                return ((o50) this.f15853c).i(new wy(this, (f) null));
            case 3:
                return ((o50) this.f15853c).i(new h0(this, (e) null));
            case 4:
                return ((o50) this.f15853c).i(new wy(this, (g) null));
            case 5:
                return ((o50) this.f15853c).i(new h0(this, (f) null));
            case 6:
                p50<String> h10 = yh.h(null);
                if (((Boolean) ti0.f16763j.f16769f.a(t.f16582g3)).booleanValue()) {
                    h10 = ((o8) this.f15854d).a((String) this.f15852b);
                }
                p50<String> b10 = ((o8) this.f15854d).b((String) this.f15852b);
                return new rh(ug.y(new p50[]{h10, b10}), true, h9.f14881a, new q((p50) h10, (p50) b10));
            case 7:
                return ((o50) this.f15853c).i(new wy(this));
            default:
                return yh.i(yh.e(((m6) this.f15852b).a((Context) this.f15854d), ((Long) ti0.f16763j.f16769f.a(t.W1)).longValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) this.f15853c), xy.f17538a, h9.f14881a);
        }
    }

    public ow(j jVar, o50 o50, List list) {
        this.f15852b = jVar;
        this.f15853c = o50;
        this.f15854d = list;
    }

    public ow(m6 m6Var, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.f15852b = m6Var;
        this.f15853c = scheduledExecutorService;
        this.f15854d = context;
    }

    public ow(o8 o8Var, o50 o50, String str) {
        this.f15854d = o8Var;
        this.f15853c = o50;
        this.f15852b = str;
    }

    public ow(o50 o50, Context context, f9 f9Var) {
        this.f15853c = o50;
        this.f15852b = context;
        this.f15854d = f9Var;
    }

    public ow(o50 o50, Context context, Set set) {
        this.f15853c = o50;
        this.f15852b = context;
        this.f15854d = set;
    }

    public ow(o50 o50, w00 w00, f9 f9Var) {
        this.f15853c = o50;
        this.f15852b = w00;
        this.f15854d = f9Var;
    }

    public ow(mh0 mh0, o50 o50, Context context) {
        this.f15852b = mh0;
        this.f15853c = o50;
        this.f15854d = context;
    }

    public ow(String str, o50 o50, gb gbVar) {
        this.f15852b = str;
        this.f15853c = o50;
        this.f15854d = gbVar;
    }
}

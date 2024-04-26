package e8;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.widget.m;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.j;
import com.google.android.gms.internal.ads.k;
import d7.l;
import f7.q;
import f7.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import l0.e;
import x2.g;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ka {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15249a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15250b;

    /* renamed from: c  reason: collision with root package name */
    public final f9 f15251c;

    /* renamed from: d  reason: collision with root package name */
    public final j f15252d;

    /* renamed from: e  reason: collision with root package name */
    public final k f15253e;

    /* renamed from: f  reason: collision with root package name */
    public final q f15254f;

    /* renamed from: g  reason: collision with root package name */
    public final long[] f15255g;

    /* renamed from: h  reason: collision with root package name */
    public final String[] f15256h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f15257i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f15258j = false;

    /* renamed from: k  reason: collision with root package name */
    public boolean f15259k = false;

    /* renamed from: l  reason: collision with root package name */
    public boolean f15260l = false;

    /* renamed from: m  reason: collision with root package name */
    public boolean f15261m;

    /* renamed from: n  reason: collision with root package name */
    public aa f15262n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f15263o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f15264p;

    /* renamed from: q  reason: collision with root package name */
    public long f15265q = -1;

    public ka(Context context, f9 f9Var, String str, k kVar, j jVar) {
        g gVar = new g();
        g gVar2 = gVar;
        gVar2.a("min_1", Double.MIN_VALUE, 1.0d);
        gVar2.a("1_5", 1.0d, 5.0d);
        gVar2.a("5_10", 5.0d, 10.0d);
        gVar2.a("10_20", 10.0d, 20.0d);
        gVar2.a("20_30", 20.0d, 30.0d);
        gVar2.a("30_max", 30.0d, Double.MAX_VALUE);
        this.f15254f = new q(gVar);
        this.f15249a = context;
        this.f15251c = f9Var;
        this.f15250b = str;
        this.f15253e = kVar;
        this.f15252d = jVar;
        String str2 = (String) ti0.f16763j.f16769f.a(t.f16644r);
        if (str2 == null) {
            this.f15256h = new String[0];
            this.f15255g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        this.f15256h = new String[split.length];
        this.f15255g = new long[split.length];
        for (int i10 = 0; i10 < split.length; i10++) {
            try {
                this.f15255g[i10] = Long.parseLong(split[i10]);
            } catch (NumberFormatException e10) {
                e.D("Unable to parse frame hash target time number.", e10);
                this.f15255g[i10] = -1;
            }
        }
    }

    public final void a() {
        if (((Boolean) i1.f14968a.b()).booleanValue() && !this.f15263o) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.f15250b);
            bundle.putString("player", this.f15262n.l());
            q qVar = this.f15254f;
            qVar.getClass();
            ArrayList arrayList = new ArrayList(((String[]) qVar.f18309a).length);
            int i10 = 0;
            while (true) {
                String[] strArr = (String[]) qVar.f18309a;
                if (i10 >= strArr.length) {
                    break;
                }
                String str = strArr[i10];
                double d10 = ((double[]) qVar.f18311c)[i10];
                double d11 = ((double[]) qVar.f18310b)[i10];
                int[] iArr = (int[]) qVar.f18312d;
                double d12 = (double) iArr[i10];
                int i11 = i10;
                double d13 = (double) qVar.f18313e;
                Double.isNaN(d12);
                Double.isNaN(d13);
                Double.isNaN(d12);
                Double.isNaN(d13);
                arrayList.add(new s(str, d10, d11, d12 / d13, iArr[i11]));
                i10 = i11 + 1;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                s sVar = (s) it.next();
                String valueOf = String.valueOf(sVar.f18314a);
                bundle.putString(valueOf.length() != 0 ? "fps_c_".concat(valueOf) : new String("fps_c_"), Integer.toString(sVar.f18318e));
                String valueOf2 = String.valueOf(sVar.f18314a);
                bundle.putString(valueOf2.length() != 0 ? "fps_p_".concat(valueOf2) : new String("fps_p_"), Double.toString(sVar.f18317d));
            }
            int i12 = 0;
            while (true) {
                long[] jArr = this.f15255g;
                if (i12 < jArr.length) {
                    String str2 = this.f15256h[i12];
                    if (str2 != null) {
                        String valueOf3 = String.valueOf(Long.valueOf(jArr[i12]));
                        StringBuilder sb2 = new StringBuilder(valueOf3.length() + 3);
                        sb2.append("fh_");
                        sb2.append(valueOf3);
                        bundle.putString(sb2.toString(), str2);
                    }
                    i12++;
                } else {
                    p pVar = l.B.f13186c;
                    Context context = this.f15249a;
                    String str3 = this.f15251c.f14544a;
                    pVar.getClass();
                    p pVar2 = l.B.f13186c;
                    bundle.putString("device", p.L());
                    bundle.putString("eids", TextUtils.join(",", t.b()));
                    y8 y8Var = ti0.f16763j.f16764a;
                    y8.b(context, str3, "gmob-apps", bundle, new m(context, str3));
                    this.f15263o = true;
                    return;
                }
            }
        }
    }

    public final void b() {
        this.f15261m = true;
        if (this.f15258j && !this.f15259k) {
            com.google.android.gms.internal.ads.g.b(this.f15253e, this.f15252d, "vfp2");
            this.f15259k = true;
        }
    }

    public final void c(aa aaVar) {
        com.google.android.gms.internal.ads.g.b(this.f15253e, this.f15252d, "vpc2");
        this.f15257i = true;
        k kVar = this.f15253e;
        if (kVar != null) {
            kVar.b("vpn", aaVar.l());
        }
        this.f15262n = aaVar;
    }

    public final void d(aa aaVar) {
        if (this.f15259k && !this.f15260l) {
            if (e.O() && !this.f15260l) {
                e.H("VideoMetricsMixin first frame");
            }
            com.google.android.gms.internal.ads.g.b(this.f15253e, this.f15252d, "vff2");
            this.f15260l = true;
        }
        long c10 = l.B.f13193j.c();
        if (this.f15261m && this.f15264p && this.f15265q != -1) {
            double nanos = (double) TimeUnit.SECONDS.toNanos(1);
            double d10 = (double) (c10 - this.f15265q);
            Double.isNaN(nanos);
            Double.isNaN(d10);
            Double.isNaN(nanos);
            Double.isNaN(d10);
            double d11 = nanos / d10;
            q qVar = this.f15254f;
            qVar.f18313e++;
            int i10 = 0;
            while (true) {
                double[] dArr = (double[]) qVar.f18311c;
                if (i10 < dArr.length) {
                    if (dArr[i10] <= d11 && d11 < ((double[]) qVar.f18310b)[i10]) {
                        int[] iArr = (int[]) qVar.f18312d;
                        iArr[i10] = iArr[i10] + 1;
                    }
                    if (d11 < dArr[i10]) {
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
        }
        this.f15264p = this.f15261m;
        this.f15265q = c10;
        long longValue = ((Long) ti0.f16763j.f16769f.a(t.f16650s)).longValue();
        long currentPosition = (long) aaVar.getCurrentPosition();
        int i11 = 0;
        while (true) {
            String[] strArr = this.f15256h;
            if (i11 >= strArr.length) {
                return;
            }
            if (strArr[i11] != null || longValue <= Math.abs(currentPosition - this.f15255g[i11])) {
                aa aaVar2 = aaVar;
                i11++;
            } else {
                String[] strArr2 = this.f15256h;
                int i12 = 8;
                Bitmap bitmap = aaVar.getBitmap(8, 8);
                long j10 = 63;
                int i13 = 0;
                long j11 = 0;
                while (i13 < i12) {
                    int i14 = 0;
                    while (i14 < i12) {
                        int pixel = bitmap.getPixel(i14, i13);
                        j11 |= (Color.green(pixel) + (Color.red(pixel) + Color.blue(pixel)) > 128 ? 1 : 0) << ((int) j10);
                        i14++;
                        j10--;
                        i12 = 8;
                    }
                    i13++;
                    i12 = 8;
                }
                strArr2[i11] = String.format("%016X", new Object[]{Long.valueOf(j11)});
                return;
            }
        }
    }

    public final void e() {
        if (this.f15257i && !this.f15258j) {
            com.google.android.gms.internal.ads.g.b(this.f15253e, this.f15252d, "vfr2");
            this.f15258j = true;
        }
    }
}

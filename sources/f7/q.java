package f7;

import com.google.android.gms.internal.ads.Cdo;
import com.google.android.gms.internal.ads.ln;
import java.util.Arrays;
import java.util.List;
import x2.g;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final Object f18309a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f18310b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f18311c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f18312d;

    /* renamed from: e  reason: collision with root package name */
    public int f18313e;

    public q(Object obj, byte[] bArr, ln lnVar, Cdo doVar, int i10) {
        this.f18309a = obj;
        this.f18310b = Arrays.copyOf(bArr, bArr.length);
        this.f18311c = lnVar;
        this.f18312d = doVar;
        this.f18313e = i10;
    }

    public static double[] b(List<Double> list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = list.get(i10).doubleValue();
        }
        return dArr;
    }

    public byte[] a() {
        Object obj = this.f18310b;
        if (((byte[]) obj) == null) {
            return null;
        }
        return Arrays.copyOf((byte[]) obj, ((byte[]) obj).length);
    }

    public q(g gVar) {
        int size = gVar.f27266b.size();
        this.f18309a = (String[]) gVar.f27265a.toArray(new String[size]);
        this.f18310b = b(gVar.f27266b);
        this.f18311c = b(gVar.f27267c);
        this.f18312d = new int[size];
        this.f18313e = 0;
    }
}

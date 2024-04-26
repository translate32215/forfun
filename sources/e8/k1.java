package e8;

import android.graphics.Color;
import com.google.android.gms.internal.ads.t;
import com.google.android.gms.internal.ads.w;
import com.google.android.gms.internal.ads.z;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class k1 extends w {

    /* renamed from: i  reason: collision with root package name */
    public static final int f15210i = Color.rgb(204, 204, 204);

    /* renamed from: r  reason: collision with root package name */
    public static final int f15211r;

    /* renamed from: a  reason: collision with root package name */
    public final String f15212a;

    /* renamed from: b  reason: collision with root package name */
    public final List<t> f15213b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final List<z> f15214c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final int f15215d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15216e;

    /* renamed from: f  reason: collision with root package name */
    public final int f15217f;

    /* renamed from: g  reason: collision with root package name */
    public final int f15218g;

    /* renamed from: h  reason: collision with root package name */
    public final int f15219h;

    static {
        int rgb = Color.rgb(12, 174, 206);
        f15211r = rgb;
    }

    public k1(String str, List<t> list, Integer num, Integer num2, Integer num3, int i10, int i11, boolean z10) {
        this.f15212a = str;
        for (int i12 = 0; i12 < list.size(); i12++) {
            t tVar = list.get(i12);
            this.f15213b.add(tVar);
            this.f15214c.add(tVar);
        }
        this.f15215d = num != null ? num.intValue() : f15210i;
        this.f15216e = num2 != null ? num2.intValue() : f15211r;
        this.f15217f = num3 != null ? num3.intValue() : 12;
        this.f15218g = i10;
        this.f15219h = i11;
    }

    public final String J1() {
        return this.f15212a;
    }

    public final List<z> Q0() {
        return this.f15214c;
    }
}

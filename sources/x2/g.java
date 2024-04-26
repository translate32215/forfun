package x2;

import android.graphics.Path;
import b3.f;
import b3.j;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MaskKeyframeAnimation */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final List<a<j, Path>> f27265a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a<Integer, Integer>> f27266b;

    /* renamed from: c  reason: collision with root package name */
    public final List<f> f27267c;

    public g() {
        this.f27265a = new ArrayList();
        this.f27266b = new ArrayList();
        this.f27267c = new ArrayList();
    }

    public g a(String str, double d10, double d11) {
        int i10 = 0;
        while (i10 < this.f27265a.size()) {
            double doubleValue = ((Double) this.f27267c.get(i10)).doubleValue();
            double doubleValue2 = ((Double) this.f27266b.get(i10)).doubleValue();
            if (d10 < doubleValue || (doubleValue == d10 && d11 < doubleValue2)) {
                break;
            }
            i10++;
        }
        this.f27265a.add(i10, str);
        this.f27267c.add(i10, Double.valueOf(d10));
        this.f27266b.add(i10, Double.valueOf(d11));
        return this;
    }

    public g(List list) {
        this.f27267c = list;
        this.f27265a = new ArrayList(list.size());
        this.f27266b = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f27265a.add(((f) list.get(i10)).f3489b.a());
            this.f27266b.add(((f) list.get(i10)).f3490c.a());
        }
    }
}

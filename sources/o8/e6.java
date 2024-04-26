package o8;

import com.google.android.gms.measurement.internal.q;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k8.fa;
import k8.m3;
import k8.n3;
import k8.o3;
import k8.p3;
import k8.t2;
import k8.u2;
import k8.v2;
import k8.w2;
import s.a;
import s.h;
import s.i;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class e6 {

    /* renamed from: a  reason: collision with root package name */
    public String f23182a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f23183b;

    /* renamed from: c  reason: collision with root package name */
    public n3 f23184c;

    /* renamed from: d  reason: collision with root package name */
    public BitSet f23185d;

    /* renamed from: e  reason: collision with root package name */
    public BitSet f23186e;

    /* renamed from: f  reason: collision with root package name */
    public Map<Integer, Long> f23187f;

    /* renamed from: g  reason: collision with root package name */
    public Map<Integer, List<Long>> f23188g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ i6 f23189h;

    public /* synthetic */ e6(i6 i6Var, String str) {
        this.f23189h = i6Var;
        this.f23182a = str;
        this.f23183b = true;
        this.f23185d = new BitSet();
        this.f23186e = new BitSet();
        this.f23187f = new a();
        this.f23188g = new a();
    }

    public final u2 a(int i10) {
        ArrayList arrayList;
        List list;
        t2 t10 = u2.t();
        if (t10.f20243c) {
            t10.h();
            t10.f20243c = false;
        }
        u2.x((u2) t10.f20242b, i10);
        boolean z10 = this.f23183b;
        if (t10.f20243c) {
            t10.h();
            t10.f20243c = false;
        }
        u2.A((u2) t10.f20242b, z10);
        n3 n3Var = this.f23184c;
        if (n3Var != null) {
            if (t10.f20243c) {
                t10.h();
                t10.f20243c = false;
            }
            u2.z((u2) t10.f20242b, n3Var);
        }
        m3 x10 = n3.x();
        List<Long> H = q.H(this.f23185d);
        if (x10.f20243c) {
            x10.h();
            x10.f20243c = false;
        }
        n3.H((n3) x10.f20242b, H);
        List<Long> H2 = q.H(this.f23186e);
        if (x10.f20243c) {
            x10.h();
            x10.f20243c = false;
        }
        n3.F((n3) x10.f20242b, H2);
        Map<Integer, Long> map = this.f23187f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer intValue : this.f23187f.keySet()) {
                int intValue2 = intValue.intValue();
                Long l10 = this.f23187f.get(Integer.valueOf(intValue2));
                if (l10 != null) {
                    v2 u10 = w2.u();
                    if (u10.f20243c) {
                        u10.h();
                        u10.f20243c = false;
                    }
                    w2.w((w2) u10.f20242b, intValue2);
                    long longValue = l10.longValue();
                    if (u10.f20243c) {
                        u10.h();
                        u10.f20243c = false;
                    }
                    w2.x((w2) u10.f20242b, longValue);
                    arrayList2.add((w2) u10.f());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            if (x10.f20243c) {
                x10.h();
                x10.f20243c = false;
            }
            n3.J((n3) x10.f20242b, arrayList);
        }
        Map<Integer, List<Long>> map2 = this.f23188g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer next : this.f23188g.keySet()) {
                o3 v10 = p3.v();
                int intValue3 = next.intValue();
                if (v10.f20243c) {
                    v10.h();
                    v10.f20243c = false;
                }
                p3.y((p3) v10.f20242b, intValue3);
                List list2 = this.f23188g.get(next);
                if (list2 != null) {
                    Collections.sort(list2);
                    if (v10.f20243c) {
                        v10.h();
                        v10.f20243c = false;
                    }
                    p3.z((p3) v10.f20242b, list2);
                }
                arrayList3.add((p3) v10.f());
            }
            list = arrayList3;
        }
        if (x10.f20243c) {
            x10.h();
            x10.f20243c = false;
        }
        n3.L((n3) x10.f20242b, list);
        if (t10.f20243c) {
            t10.h();
            t10.f20243c = false;
        }
        u2.y((u2) t10.f20242b, (n3) x10.f());
        return (u2) t10.f();
    }

    public final void b(g6 g6Var) {
        int a10 = g6Var.a();
        Boolean bool = g6Var.f23226c;
        if (bool != null) {
            this.f23186e.set(a10, bool.booleanValue());
        }
        Boolean bool2 = g6Var.f23227d;
        if (bool2 != null) {
            this.f23185d.set(a10, bool2.booleanValue());
        }
        if (g6Var.f23228e != null) {
            Map<Integer, Long> map = this.f23187f;
            Integer valueOf = Integer.valueOf(a10);
            Long l10 = map.get(valueOf);
            long longValue = g6Var.f23228e.longValue() / 1000;
            if (l10 == null || longValue > l10.longValue()) {
                this.f23187f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (g6Var.f23229f != null) {
            Map<Integer, List<Long>> map2 = this.f23188g;
            Integer valueOf2 = Integer.valueOf(a10);
            List list = map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f23188g.put(valueOf2, list);
            }
            if (g6Var.c()) {
                list.clear();
            }
            fa.b();
            f fVar = this.f23189h.f8864a.f8843g;
            String str = this.f23182a;
            u2<Boolean> u2Var = v2.Y;
            if (fVar.v(str, u2Var) && g6Var.b()) {
                list.clear();
            }
            fa.b();
            if (this.f23189h.f8864a.f8843g.v(this.f23182a, u2Var)) {
                Long valueOf3 = Long.valueOf(g6Var.f23229f.longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(g6Var.f23229f.longValue() / 1000));
        }
    }

    public /* synthetic */ e6(i6 i6Var, String str, n3 n3Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2) {
        this.f23189h = i6Var;
        this.f23182a = str;
        this.f23185d = bitSet;
        this.f23186e = bitSet2;
        this.f23187f = map;
        this.f23188g = new a();
        Iterator it = ((h.c) ((a) map2).keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) ((i) map2).get(num));
            this.f23188g.put(num, arrayList);
        }
        this.f23183b = false;
        this.f23184c = n3Var;
    }
}

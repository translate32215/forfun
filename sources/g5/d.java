package g5;

import d5.h;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import v6.v;

/* compiled from: ScriptTagPayloadReader */
public final class d extends e {

    /* renamed from: b  reason: collision with root package name */
    public long f18492b = -9223372036854775807L;

    /* renamed from: c  reason: collision with root package name */
    public long[] f18493c = new long[0];

    /* renamed from: d  reason: collision with root package name */
    public long[] f18494d = new long[0];

    public d() {
        super(new h());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v4, types: [int] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object d(v6.v r4, int r5) {
        /*
            if (r5 == 0) goto L_0x0082
            r0 = 0
            r1 = 1
            if (r5 == r1) goto L_0x0076
            r1 = 2
            if (r5 == r1) goto L_0x0071
            r2 = 3
            if (r5 == r2) goto L_0x0055
            r2 = 8
            if (r5 == r2) goto L_0x0050
            r2 = 10
            if (r5 == r2) goto L_0x0034
            r0 = 11
            if (r5 == r0) goto L_0x001a
            r4 = 0
            return r4
        L_0x001a:
            java.util.Date r5 = new java.util.Date
            long r2 = r4.m()
            double r2 = java.lang.Double.longBitsToDouble(r2)
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            double r2 = r0.doubleValue()
            long r2 = (long) r2
            r5.<init>(r2)
            r4.E(r1)
            return r5
        L_0x0034:
            int r5 = r4.v()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r5)
        L_0x003d:
            if (r0 >= r5) goto L_0x004f
            int r2 = r4.s()
            java.lang.Object r2 = d(r4, r2)
            if (r2 == 0) goto L_0x004c
            r1.add(r2)
        L_0x004c:
            int r0 = r0 + 1
            goto L_0x003d
        L_0x004f:
            return r1
        L_0x0050:
            java.util.HashMap r4 = e(r4)
            return r4
        L_0x0055:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
        L_0x005a:
            java.lang.String r0 = f(r4)
            int r1 = r4.s()
            r2 = 9
            if (r1 != r2) goto L_0x0067
            return r5
        L_0x0067:
            java.lang.Object r1 = d(r4, r1)
            if (r1 == 0) goto L_0x005a
            r5.put(r0, r1)
            goto L_0x005a
        L_0x0071:
            java.lang.String r4 = f(r4)
            return r4
        L_0x0076:
            int r4 = r4.s()
            if (r4 != r1) goto L_0x007d
            r0 = 1
        L_0x007d:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x0082:
            long r4 = r4.m()
            double r4 = java.lang.Double.longBitsToDouble(r4)
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.d.d(v6.v, int):java.lang.Object");
    }

    public static HashMap<String, Object> e(v vVar) {
        int v10 = vVar.v();
        HashMap<String, Object> hashMap = new HashMap<>(v10);
        for (int i10 = 0; i10 < v10; i10++) {
            String f10 = f(vVar);
            Object d10 = d(vVar, vVar.s());
            if (d10 != null) {
                hashMap.put(f10, d10);
            }
        }
        return hashMap;
    }

    public static String f(v vVar) {
        int x10 = vVar.x();
        int i10 = vVar.f26519b;
        vVar.E(x10);
        return new String(vVar.f26518a, i10, x10);
    }

    public boolean b(v vVar) {
        return true;
    }

    public boolean c(v vVar, long j10) {
        if (vVar.s() != 2 || !"onMetaData".equals(f(vVar)) || vVar.s() != 8) {
            return false;
        }
        HashMap<String, Object> e10 = e(vVar);
        Object obj = e10.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f18492b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = e10.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f18493c = new long[size];
                this.f18494d = new long[size];
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f18493c = new long[0];
                        this.f18494d = new long[0];
                    } else {
                        this.f18493c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f18494d[i10] = ((Double) obj5).longValue();
                        i10++;
                    }
                }
                this.f18493c = new long[0];
                this.f18494d = new long[0];
            }
        }
        return false;
    }
}

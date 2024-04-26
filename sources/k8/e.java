package k8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import l0.d;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class e implements Iterable<o>, o, k {

    /* renamed from: a  reason: collision with root package name */
    public final SortedMap<Integer, o> f20134a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, o> f20135b;

    public e() {
        this.f20134a = new TreeMap();
        this.f20135b = new TreeMap();
    }

    public final Iterator<Integer> A() {
        return this.f20134a.keySet().iterator();
    }

    public final List<o> B() {
        ArrayList arrayList = new ArrayList(x());
        for (int i10 = 0; i10 < x(); i10++) {
            arrayList.add(y(i10));
        }
        return arrayList;
    }

    public final void C(int i10) {
        int intValue = this.f20134a.lastKey().intValue();
        if (i10 <= intValue && i10 >= 0) {
            this.f20134a.remove(Integer.valueOf(i10));
            if (i10 == intValue) {
                SortedMap<Integer, o> sortedMap = this.f20134a;
                int i11 = i10 - 1;
                Integer valueOf = Integer.valueOf(i11);
                if (!sortedMap.containsKey(valueOf) && i11 >= 0) {
                    this.f20134a.put(valueOf, o.f20381n);
                    return;
                }
                return;
            }
            while (true) {
                i10++;
                if (i10 <= this.f20134a.lastKey().intValue()) {
                    SortedMap<Integer, o> sortedMap2 = this.f20134a;
                    Integer valueOf2 = Integer.valueOf(i10);
                    o oVar = (o) sortedMap2.get(valueOf2);
                    if (oVar != null) {
                        this.f20134a.put(Integer.valueOf(i10 - 1), oVar);
                        this.f20134a.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    @RequiresNonNull({"elements"})
    public final void D(int i10, o oVar) {
        if (i10 > 32468) {
            throw new IllegalStateException("Array too large");
        } else if (i10 < 0) {
            throw new IndexOutOfBoundsException(d.a(32, "Out of bounds index: ", i10));
        } else if (oVar == null) {
            this.f20134a.remove(Integer.valueOf(i10));
        } else {
            this.f20134a.put(Integer.valueOf(i10), oVar);
        }
    }

    public final boolean E(int i10) {
        if (i10 >= 0 && i10 <= this.f20134a.lastKey().intValue()) {
            return this.f20134a.containsKey(Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(d.a(32, "Out of bounds index: ", i10));
    }

    public final Double a() {
        if (this.f20134a.size() == 1) {
            return y(0).a();
        }
        if (this.f20134a.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    public final Iterator<o> c() {
        return new d(this.f20134a.keySet().iterator(), this.f20135b.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (x() != eVar.x()) {
            return false;
        }
        if (this.f20134a.isEmpty()) {
            return eVar.f20134a.isEmpty();
        }
        for (int intValue = this.f20134a.firstKey().intValue(); intValue <= this.f20134a.lastKey().intValue(); intValue++) {
            if (!y(intValue).equals(eVar.y(intValue))) {
                return false;
            }
        }
        return true;
    }

    public final o f() {
        e eVar = new e();
        for (Map.Entry next : this.f20134a.entrySet()) {
            if (next.getValue() instanceof k) {
                eVar.f20134a.put((Integer) next.getKey(), (o) next.getValue());
            } else {
                eVar.f20134a.put((Integer) next.getKey(), ((o) next.getValue()).f());
            }
        }
        return eVar;
    }

    public final boolean h(String str) {
        return "length".equals(str) || this.f20135b.containsKey(str);
    }

    public final int hashCode() {
        return this.f20134a.hashCode() * 31;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        r3 = r2.f20135b.get(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final k8.o i(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "length"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0017
            k8.h r3 = new k8.h
            int r0 = r2.x()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r3.<init>(r0)
            return r3
        L_0x0017:
            boolean r0 = r2.h(r3)
            if (r0 == 0) goto L_0x0028
            java.util.Map<java.lang.String, k8.o> r0 = r2.f20135b
            java.lang.Object r3 = r0.get(r3)
            k8.o r3 = (k8.o) r3
            if (r3 == 0) goto L_0x0028
            return r3
        L_0x0028:
            k8.o r3 = k8.o.f20381n
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.e.i(java.lang.String):k8.o");
    }

    public final Iterator<o> iterator() {
        return new q(this);
    }

    public final Boolean j() {
        return Boolean.TRUE;
    }

    public final void o(String str, o oVar) {
        if (oVar == null) {
            this.f20135b.remove(str);
        } else {
            this.f20135b.put(str, oVar);
        }
    }

    public final String q() {
        return z(",");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v113, resolved type: k8.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v136, resolved type: k8.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v137, resolved type: k8.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v138, resolved type: k8.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v140, resolved type: k8.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v141, resolved type: k8.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v142, resolved type: k8.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v143, resolved type: k8.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v144, resolved type: k8.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v146, resolved type: k8.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v151, resolved type: k8.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v156, resolved type: k8.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v157, resolved type: k8.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v158, resolved type: k8.h} */
    /* JADX WARNING: type inference failed for: r1v108, types: [k8.o] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0197, code lost:
        r5 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x019a, code lost:
        r5 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01a8, code lost:
        r1 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01a9, code lost:
        r18 = r2;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01b0, code lost:
        switch(r1) {
            case 0: goto L_0x084b;
            case 1: goto L_0x0805;
            case 2: goto L_0x07a4;
            case 3: goto L_0x076c;
            case 4: goto L_0x06d2;
            case 5: goto L_0x068f;
            case 6: goto L_0x05dd;
            case 7: goto L_0x05a9;
            case com.startapp.b4.f :int: goto L_0x058b;
            case 9: goto L_0x0553;
            case 10: goto L_0x0546;
            case 11: goto L_0x0539;
            case 12: goto L_0x0500;
            case 13: goto L_0x04e4;
            case 14: goto L_0x044f;
            case 15: goto L_0x03d6;
            case 16: goto L_0x0377;
            case 17: goto L_0x0267;
            case 18: goto L_0x0252;
            case 19: goto L_0x01bd;
            default: goto L_0x01b3;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01b3, code lost:
        r0 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01bc, code lost:
        throw new java.lang.IllegalArgumentException("Command not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01c1, code lost:
        if (r23.isEmpty() != false) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01c3, code lost:
        r0 = new k8.e();
        r1 = r23.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01d0, code lost:
        if (r1.hasNext() == false) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01d2, code lost:
        r2 = r22.y(r1.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01e0, code lost:
        if ((r2 instanceof k8.g) != false) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01e2, code lost:
        r0.D(r0.x(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01f1, code lost:
        throw new java.lang.IllegalStateException("Argument evaluation failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01f2, code lost:
        r1 = r0.x();
        r2 = A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01fe, code lost:
        if (r2.hasNext() == false) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0200, code lost:
        r3 = r2.next();
        r0.D(r3.intValue() + r1, y(r3.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0219, code lost:
        r9 = r20;
        r9.f20134a.clear();
        r1 = r0.A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0228, code lost:
        if (r1.hasNext() == false) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x022a, code lost:
        r2 = r1.next();
        r9.D(r2.intValue(), r0.y(r2.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0240, code lost:
        r9 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0242, code lost:
        r0 = new k8.h(java.lang.Double.valueOf((double) x()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0252, code lost:
        r9 = r20;
        x.f.n(r5, 0, r23);
        r0 = new k8.r(r9.z(","));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0267, code lost:
        r9 = r20;
        r3 = r22;
        r1 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0272, code lost:
        if (r23.isEmpty() == false) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0274, code lost:
        r0 = new k8.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x027b, code lost:
        r4 = (int) x.f.e(r3.y(r1.get(0)).a().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0292, code lost:
        if (r4 >= 0) goto L_0x029e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0294, code lost:
        r4 = java.lang.Math.max(0, x() + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02a2, code lost:
        if (r4 <= x()) goto L_0x02a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02a4, code lost:
        r4 = x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02a8, code lost:
        r0 = x();
        r5 = new k8.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02b6, code lost:
        if (r23.size() <= 1) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02b8, code lost:
        r2 = java.lang.Math.max(0, (int) x.f.e(r3.y(r1.get(1)).a().doubleValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02d4, code lost:
        if (r2 <= 0) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02d6, code lost:
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02dd, code lost:
        if (r6 >= java.lang.Math.min(r0, r4 + r2)) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02df, code lost:
        r5.D(r5.x(), r9.y(r4));
        r9.C(r4);
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02f5, code lost:
        if (r23.size() <= 2) goto L_0x0374;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02f7, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02fc, code lost:
        if (r0 >= r23.size()) goto L_0x0374;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02fe, code lost:
        r2 = r3.y(r1.get(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x030a, code lost:
        if ((r2 instanceof k8.g) != false) goto L_0x0359;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x030c, code lost:
        r6 = (r4 + r0) - 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0310, code lost:
        if (r6 < 0) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0316, code lost:
        if (r6 < x()) goto L_0x031c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0318, code lost:
        r9.D(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x031c, code lost:
        r7 = r9.f20134a.lastKey().intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0328, code lost:
        if (r7 < r6) goto L_0x0345;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x032a, code lost:
        r8 = r9.f20134a;
        r10 = java.lang.Integer.valueOf(r7);
        r8 = (k8.o) r8.get(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0336, code lost:
        if (r8 == null) goto L_0x0342;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0338, code lost:
        r9.D(r7 + 1, r8);
        r9.f20134a.remove(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0342, code lost:
        r7 = r7 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0345, code lost:
        r9.D(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0348, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0358, code lost:
        throw new java.lang.IllegalArgumentException(l0.d.a(32, "Invalid value index: ", r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0360, code lost:
        throw new java.lang.IllegalArgumentException("Failed to parse elements to add");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0361, code lost:
        if (r4 >= r0) goto L_0x0374;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0363, code lost:
        r5.D(r5.x(), r9.y(r4));
        r9.D(r4, (k8.o) null);
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0374, code lost:
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0377, code lost:
        r9 = r20;
        r3 = r22;
        r1 = r23;
        x.f.p("sort", 1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0386, code lost:
        if (x() >= 2) goto L_0x038a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x038a, code lost:
        r0 = B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0392, code lost:
        if (r23.isEmpty() != false) goto L_0x03af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0394, code lost:
        r1 = r3.y(r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03a1, code lost:
        if ((r1 instanceof k8.i) == false) goto L_0x03a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03a3, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03ae, code lost:
        throw new java.lang.IllegalArgumentException("Comparator should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03af, code lost:
        java.util.Collections.sort(r0, new k8.x(r2, r3));
        r9.f20134a.clear();
        r0 = ((java.util.ArrayList) r0).iterator();
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03c7, code lost:
        if (r0.hasNext() == false) goto L_0x0536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03c9, code lost:
        r9.D(r1, (k8.o) r0.next());
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03d6, code lost:
        r9 = r20;
        r3 = r22;
        r1 = r23;
        x.f.n("some", 1, r1);
        r0 = r3.y(r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03ed, code lost:
        if ((r0 instanceof k8.i) == false) goto L_0x0449;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03f3, code lost:
        if (x() != 0) goto L_0x03f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03f5, code lost:
        r0 = k8.o.V;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x03f9, code lost:
        r0 = (k8.i) r0;
        r1 = A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0403, code lost:
        if (r1.hasNext() == false) goto L_0x0445;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0405, code lost:
        r2 = r1.next().intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0413, code lost:
        if (r9.E(r2) == false) goto L_0x03ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x043f, code lost:
        if (r0.b(r3, java.util.Arrays.asList(new k8.o[]{r9.y(r2), new k8.h(java.lang.Double.valueOf((double) r2)), r9})).j().booleanValue() == false) goto L_0x03ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0441, code lost:
        r0 = k8.o.U;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0445, code lost:
        r0 = k8.o.V;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x044e, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x044f, code lost:
        r9 = r20;
        r3 = r22;
        r1 = r23;
        x.f.p(r0, 2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x045d, code lost:
        if (r23.isEmpty() == false) goto L_0x0465;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x045f, code lost:
        r0 = f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0465, code lost:
        r4 = (double) x();
        r6 = x.f.e(r3.y(r1.get(0)).a().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0485, code lost:
        if (r6 >= 0.0d) goto L_0x0493;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0487, code lost:
        java.lang.Double.isNaN(r4);
        java.lang.Double.isNaN(r4);
        r6 = java.lang.Math.max(r6 + r4, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0493, code lost:
        r6 = java.lang.Math.min(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x049c, code lost:
        if (r23.size() != 2) goto L_0x04cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x049e, code lost:
        r0 = x.f.e(r3.y(r1.get(1)).a().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04b9, code lost:
        if (r0 >= 0.0d) goto L_0x04c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04bb, code lost:
        java.lang.Double.isNaN(r4);
        java.lang.Double.isNaN(r4);
        r4 = java.lang.Math.max(r4 + r0, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04c7, code lost:
        r4 = java.lang.Math.min(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04cb, code lost:
        r0 = new k8.e();
        r1 = (int) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04d4, code lost:
        if (((double) r1) >= r4) goto L_0x0797;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04d6, code lost:
        r0.D(r0.x(), r9.y(r1));
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04e4, code lost:
        r9 = r20;
        x.f.n(r3, 0, r23);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04f1, code lost:
        if (x() != 0) goto L_0x04f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04f3, code lost:
        r0 = k8.o.f20381n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x04f7, code lost:
        r0 = r9.y(0);
        r9.C(0);
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0500, code lost:
        r9 = r20;
        x.f.n("reverse", 0, r23);
        r0 = x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x050c, code lost:
        if (r0 == 0) goto L_0x0536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x050e, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0511, code lost:
        if (r1 >= (r0 / 2)) goto L_0x0536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0517, code lost:
        if (r9.E(r1) == false) goto L_0x0533;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0519, code lost:
        r3 = r9.y(r1);
        r9.D(r1, (k8.o) null);
        r4 = (r0 - 1) - r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0527, code lost:
        if (r9.E(r4) == false) goto L_0x0530;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0529, code lost:
        r9.D(r1, r9.y(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0530, code lost:
        r9.D(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0533, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0536, code lost:
        r0 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0539, code lost:
        r9 = r20;
        r0 = l0.e.B(r9, r22, r23, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0546, code lost:
        r9 = r20;
        r0 = l0.e.B(r9, r22, r23, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0553, code lost:
        r9 = r20;
        r3 = r22;
        r1 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x055d, code lost:
        if (r23.isEmpty() != false) goto L_0x057b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x055f, code lost:
        r0 = r23.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0567, code lost:
        if (r0.hasNext() == false) goto L_0x057b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0569, code lost:
        r9.D(x(), r3.y(r0.next()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x057b, code lost:
        r0 = new k8.h(java.lang.Double.valueOf((double) x()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x058b, code lost:
        r9 = r20;
        x.f.n("pop", 0, r23);
        r0 = x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0597, code lost:
        if (r0 != 0) goto L_0x059d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0599, code lost:
        r0 = k8.o.f20381n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x059d, code lost:
        r0 = r0 - 1;
        r1 = r9.y(r0);
        r9.C(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x05a6, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x05a9, code lost:
        r9 = r20;
        r3 = r22;
        r1 = r23;
        x.f.n("map", 1, r1);
        r0 = r3.y(r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05c0, code lost:
        if ((r0 instanceof k8.n) == false) goto L_0x05d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x05c6, code lost:
        if (x() != 0) goto L_0x05cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x05c8, code lost:
        r0 = new k8.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x05cf, code lost:
        r0 = l0.e.z(r9, r3, (k8.n) r0, (java.lang.Boolean) null, (java.lang.Boolean) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x05dc, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x05dd, code lost:
        r9 = r20;
        r3 = r22;
        r1 = r23;
        x.f.p("lastIndexOf", 2, r1);
        r0 = k8.o.f20381n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x05ed, code lost:
        if (r23.isEmpty() != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x05ef, code lost:
        r0 = r3.y(r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x05fa, code lost:
        r4 = (double) (x() - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0606, code lost:
        if (r23.size() <= 1) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0608, code lost:
        r1 = r3.y(r1.get(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x061e, code lost:
        if (java.lang.Double.isNaN(r1.a().doubleValue()) == false) goto L_0x0628;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0620, code lost:
        r1 = (double) (x() - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0628, code lost:
        r1 = x.f.e(r1.a().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0634, code lost:
        r4 = r1;
        r1 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0639, code lost:
        if (r4 >= 0.0d) goto L_0x064a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x063b, code lost:
        r6 = (double) x();
        java.lang.Double.isNaN(r6);
        java.lang.Double.isNaN(r6);
        r4 = r4 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0648, code lost:
        r1 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x064c, code lost:
        if (r4 >= r1) goto L_0x0659;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x064e, code lost:
        r0 = new k8.h(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0659, code lost:
        r1 = (int) java.lang.Math.min((double) x(), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0663, code lost:
        if (r1 < 0) goto L_0x0684;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0669, code lost:
        if (r9.E(r1) == false) goto L_0x0681;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0673, code lost:
        if (x.f.r(r9.y(r1), r0) == false) goto L_0x0681;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0675, code lost:
        r0 = new k8.h(java.lang.Double.valueOf((double) r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0681, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0684, code lost:
        r0 = new k8.h(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x068f, code lost:
        r9 = r20;
        r3 = r22;
        r1 = r23;
        x.f.p("join", 1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x069d, code lost:
        if (x() != 0) goto L_0x06a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x069f, code lost:
        r0 = k8.o.W;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x06a7, code lost:
        if (r23.size() <= 0) goto L_0x06c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x06a9, code lost:
        r0 = r3.y(r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x06b6, code lost:
        if ((r0 instanceof k8.m) != false) goto L_0x06c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x06ba, code lost:
        if ((r0 instanceof k8.s) == false) goto L_0x06bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x06bd, code lost:
        r0 = r0.q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x06c2, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x06c5, code lost:
        r0 = ",";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x06c7, code lost:
        r1 = new k8.r(r9.z(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x06d2, code lost:
        r9 = r20;
        r3 = r22;
        r1 = r23;
        x.f.p("indexOf", 2, r1);
        r0 = k8.o.f20381n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x06e2, code lost:
        if (r23.isEmpty() != false) goto L_0x06ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x06e4, code lost:
        r0 = r3.y(r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x06f4, code lost:
        if (r23.size() <= 1) goto L_0x0733;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x06f6, code lost:
        r1 = x.f.e(r3.y(r1.get(1)).a().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0713, code lost:
        if (r1 < ((double) x())) goto L_0x0720;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0715, code lost:
        r0 = new k8.h(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0724, code lost:
        if (r1 >= 0.0d) goto L_0x0735;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0726, code lost:
        r3 = (double) x();
        java.lang.Double.isNaN(r3);
        java.lang.Double.isNaN(r3);
        r1 = r1 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0733, code lost:
        r1 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0735, code lost:
        r3 = A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x073d, code lost:
        if (r3.hasNext() == false) goto L_0x0762;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x073f, code lost:
        r4 = r3.next().intValue();
        r5 = (double) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x074c, code lost:
        if (r5 < r1) goto L_0x0739;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0756, code lost:
        if (x.f.r(r9.y(r4), r0) == false) goto L_0x0739;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0758, code lost:
        r0 = new k8.h(java.lang.Double.valueOf(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0762, code lost:
        r0 = new k8.h(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x076c, code lost:
        r9 = r20;
        r3 = r22;
        r1 = r23;
        x.f.n("forEach", 1, r1);
        r0 = r3.y(r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0783, code lost:
        if ((r0 instanceof k8.n) == false) goto L_0x079e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x078b, code lost:
        if (r9.f20134a.size() != 0) goto L_0x0790;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x078d, code lost:
        r0 = k8.o.f20381n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0790, code lost:
        l0.e.z(r9, r3, (k8.n) r0, (java.lang.Boolean) null, (java.lang.Boolean) null);
        r0 = k8.o.f20381n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0797, code lost:
        r19 = r9;
        r9 = r0;
        r0 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x07a3, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x07a4, code lost:
        r0 = r20;
        r3 = r22;
        r1 = r23;
        x.f.n("filter", 1, r1);
        r1 = r3.y(r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x07bb, code lost:
        if ((r1 instanceof k8.n) == false) goto L_0x07ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x07c3, code lost:
        if (r0.f20134a.size() != 0) goto L_0x07cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x07c5, code lost:
        r1 = new k8.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x07cb, code lost:
        r4 = f();
        r1 = l0.e.z(r0, r3, (k8.n) r1, (java.lang.Boolean) null, java.lang.Boolean.TRUE);
        r9 = new k8.e();
        r1 = r1.A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x07e4, code lost:
        if (r1.hasNext() == false) goto L_0x08ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x07e6, code lost:
        r9.D(r9.x(), ((k8.e) r4).y(r1.next().intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0804, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0805, code lost:
        r0 = r20;
        r3 = r22;
        r1 = r23;
        x.f.n(r18, 1, r1);
        r1 = r3.y(r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x081e, code lost:
        if ((r1 instanceof k8.n) == false) goto L_0x0845;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0824, code lost:
        if (x() != 0) goto L_0x082b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0826, code lost:
        r1 = k8.o.U;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x083d, code lost:
        if (l0.e.z(r0, r3, (k8.n) r1, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).x() == x()) goto L_0x0842;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x083f, code lost:
        r1 = k8.o.V;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0842, code lost:
        r1 = k8.o.U;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x084a, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x084b, code lost:
        r0 = r20;
        r3 = r22;
        r1 = r23;
        r9 = f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0859, code lost:
        if (r23.isEmpty() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x085b, code lost:
        r1 = r23.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0863, code lost:
        if (r1.hasNext() == false) goto L_0x08ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0865, code lost:
        r2 = r3.y(r1.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0871, code lost:
        if ((r2 instanceof k8.g) != false) goto L_0x08a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0873, code lost:
        r4 = (k8.e) r9;
        r5 = r4.x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x087c, code lost:
        if ((r2 instanceof k8.e) == false) goto L_0x08a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x087e, code lost:
        r2 = (k8.e) r2;
        r6 = r2.A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0888, code lost:
        if (r6.hasNext() == false) goto L_0x085f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x088a, code lost:
        r7 = r6.next();
        r4.D(r7.intValue() + r5, r2.y(r7.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x08a1, code lost:
        r4.D(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x08ac, code lost:
        throw new java.lang.IllegalStateException("Failed evaluation of arguments");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0797, code lost:
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:?, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:?, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:?, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:?, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:?, code lost:
        return r9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x017d  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final k8.o s(java.lang.String r21, n2.g r22, java.util.List<k8.o> r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            java.lang.String r4 = "concat"
            boolean r5 = r4.equals(r1)
            java.lang.String r6 = "splice"
            java.lang.String r7 = "reduce"
            java.lang.String r8 = "toString"
            java.lang.String r9 = "filter"
            java.lang.String r10 = "forEach"
            java.lang.String r11 = "lastIndexOf"
            java.lang.String r12 = "map"
            java.lang.String r13 = "pop"
            java.lang.String r14 = "join"
            java.lang.String r15 = "some"
            r16 = r4
            java.lang.String r4 = "sort"
            java.lang.String r0 = "every"
            java.lang.String r2 = "shift"
            java.lang.String r3 = "slice"
            r17 = r8
            java.lang.String r8 = "reverse"
            r18 = r6
            java.lang.String r6 = "indexOf"
            if (r5 != 0) goto L_0x00d4
            boolean r5 = r0.equals(r1)
            if (r5 != 0) goto L_0x00d4
            boolean r5 = r9.equals(r1)
            if (r5 != 0) goto L_0x00d4
            boolean r5 = r10.equals(r1)
            if (r5 != 0) goto L_0x00d4
            boolean r5 = r6.equals(r1)
            if (r5 != 0) goto L_0x00d4
            boolean r5 = r14.equals(r1)
            if (r5 != 0) goto L_0x00d4
            boolean r5 = r11.equals(r1)
            if (r5 != 0) goto L_0x00d4
            boolean r5 = r12.equals(r1)
            if (r5 != 0) goto L_0x00d4
            boolean r5 = r13.equals(r1)
            if (r5 != 0) goto L_0x00d4
            java.lang.String r5 = "push"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x00d4
            boolean r5 = r7.equals(r1)
            if (r5 != 0) goto L_0x00d4
            java.lang.String r5 = "reduceRight"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x00d4
            boolean r5 = r8.equals(r1)
            if (r5 != 0) goto L_0x00d4
            boolean r5 = r2.equals(r1)
            if (r5 != 0) goto L_0x00d4
            boolean r5 = r3.equals(r1)
            if (r5 != 0) goto L_0x00d4
            boolean r5 = r15.equals(r1)
            if (r5 != 0) goto L_0x00d4
            boolean r5 = r4.equals(r1)
            if (r5 != 0) goto L_0x00d4
            r5 = r18
            boolean r18 = r5.equals(r1)
            if (r18 != 0) goto L_0x00d6
            r18 = r0
            r0 = r17
            boolean r17 = r0.equals(r1)
            if (r17 != 0) goto L_0x00cd
            r17 = r2
            java.lang.String r2 = "unshift"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x00bd
            r2 = r18
            r19 = r17
            r17 = r0
            goto L_0x00d9
        L_0x00bd:
            k8.r r0 = new k8.r
            r0.<init>(r1)
            r2 = r20
            r3 = r22
            r1 = r23
            k8.o r0 = e.j.e(r2, r0, r3, r1)
            return r0
        L_0x00cd:
            r17 = r0
            r0 = r3
            r3 = r2
            r2 = r18
            goto L_0x00dc
        L_0x00d4:
            r5 = r18
        L_0x00d6:
            r19 = r2
            r2 = r0
        L_0x00d9:
            r0 = r3
            r3 = r19
        L_0x00dc:
            int r18 = r21.hashCode()
            switch(r18) {
                case -1776922004: goto L_0x019d;
                case -1354795244: goto L_0x018e;
                case -1274492040: goto L_0x0186;
                case -934873754: goto L_0x017d;
                case -895859076: goto L_0x0174;
                case -678635926: goto L_0x016c;
                case -467511597: goto L_0x0164;
                case -277637751: goto L_0x0159;
                case 107868: goto L_0x0151;
                case 111185: goto L_0x0148;
                case 3267882: goto L_0x0140;
                case 3452698: goto L_0x0135;
                case 3536116: goto L_0x012b;
                case 3536286: goto L_0x0121;
                case 96891675: goto L_0x0118;
                case 109407362: goto L_0x010e;
                case 109526418: goto L_0x0104;
                case 965561430: goto L_0x00f8;
                case 1099846370: goto L_0x00ee;
                case 1943291465: goto L_0x00e5;
                default: goto L_0x00e3;
            }
        L_0x00e3:
            goto L_0x019a
        L_0x00e5:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x019a
            r1 = 4
            goto L_0x0197
        L_0x00ee:
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x019a
            r1 = 12
            goto L_0x0197
        L_0x00f8:
            java.lang.String r5 = "reduceRight"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x019a
            r1 = 11
            goto L_0x0197
        L_0x0104:
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x019a
            r1 = 14
            goto L_0x0197
        L_0x010e:
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x019a
            r1 = 13
            goto L_0x0197
        L_0x0118:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x019a
            r1 = 1
            goto L_0x0197
        L_0x0121:
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x019a
            r1 = 16
            goto L_0x0197
        L_0x012b:
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L_0x019a
            r1 = 15
            goto L_0x0197
        L_0x0135:
            java.lang.String r5 = "push"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x019a
            r1 = 9
            goto L_0x0197
        L_0x0140:
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L_0x019a
            r1 = 5
            goto L_0x0197
        L_0x0148:
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x019a
            r1 = 8
            goto L_0x0197
        L_0x0151:
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x019a
            r1 = 7
            goto L_0x0197
        L_0x0159:
            java.lang.String r5 = "unshift"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x019a
            r1 = 19
            goto L_0x0197
        L_0x0164:
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x019a
            r1 = 6
            goto L_0x0197
        L_0x016c:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x019a
            r1 = 3
            goto L_0x0197
        L_0x0174:
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x019a
            r1 = 17
            goto L_0x0197
        L_0x017d:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x019a
            r1 = 10
            goto L_0x0197
        L_0x0186:
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x019a
            r1 = 2
            goto L_0x0197
        L_0x018e:
            r5 = r16
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x019a
            r1 = 0
        L_0x0197:
            r5 = r17
            goto L_0x01a9
        L_0x019a:
            r5 = r17
            goto L_0x01a8
        L_0x019d:
            r5 = r17
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x01a8
            r1 = 18
            goto L_0x01a9
        L_0x01a8:
            r1 = -1
        L_0x01a9:
            r16 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.String r7 = "Callback should be a method"
            r18 = r2
            r2 = 0
            switch(r1) {
                case 0: goto L_0x084b;
                case 1: goto L_0x0805;
                case 2: goto L_0x07a4;
                case 3: goto L_0x076c;
                case 4: goto L_0x06d2;
                case 5: goto L_0x068f;
                case 6: goto L_0x05dd;
                case 7: goto L_0x05a9;
                case 8: goto L_0x058b;
                case 9: goto L_0x0553;
                case 10: goto L_0x0546;
                case 11: goto L_0x0539;
                case 12: goto L_0x0500;
                case 13: goto L_0x04e4;
                case 14: goto L_0x044f;
                case 15: goto L_0x03d6;
                case 16: goto L_0x0377;
                case 17: goto L_0x0267;
                case 18: goto L_0x0252;
                case 19: goto L_0x01bd;
                default: goto L_0x01b3;
            }
        L_0x01b3:
            r0 = r20
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Command not supported"
            r1.<init>(r2)
            throw r1
        L_0x01bd:
            boolean r0 = r23.isEmpty()
            if (r0 != 0) goto L_0x0240
            k8.e r0 = new k8.e
            r0.<init>()
            java.util.Iterator r1 = r23.iterator()
        L_0x01cc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01f2
            java.lang.Object r2 = r1.next()
            k8.o r2 = (k8.o) r2
            r3 = r22
            k8.o r2 = r3.y(r2)
            boolean r4 = r2 instanceof k8.g
            if (r4 != 0) goto L_0x01ea
            int r4 = r0.x()
            r0.D(r4, r2)
            goto L_0x01cc
        L_0x01ea:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Argument evaluation failed"
            r0.<init>(r1)
            throw r0
        L_0x01f2:
            int r1 = r0.x()
            java.util.Iterator r2 = r20.A()
        L_0x01fa:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0219
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r4 = r3.intValue()
            int r4 = r4 + r1
            int r3 = r3.intValue()
            r9 = r20
            k8.o r3 = r9.y(r3)
            r0.D(r4, r3)
            goto L_0x01fa
        L_0x0219:
            r9 = r20
            java.util.SortedMap<java.lang.Integer, k8.o> r1 = r9.f20134a
            r1.clear()
            java.util.Iterator r1 = r0.A()
        L_0x0224:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0242
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r3 = r2.intValue()
            int r2 = r2.intValue()
            k8.o r2 = r0.y(r2)
            r9.D(r3, r2)
            goto L_0x0224
        L_0x0240:
            r9 = r20
        L_0x0242:
            k8.h r0 = new k8.h
            int r1 = r20.x()
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            goto L_0x0797
        L_0x0252:
            r9 = r20
            r0 = 0
            r1 = r23
            x.f.n(r5, r0, r1)
            k8.r r0 = new k8.r
            java.lang.String r1 = ","
            java.lang.String r1 = r9.z(r1)
            r0.<init>(r1)
            goto L_0x0797
        L_0x0267:
            r9 = r20
            r3 = r22
            r1 = r23
            r0 = 0
            boolean r4 = r23.isEmpty()
            if (r4 == 0) goto L_0x027b
            k8.e r0 = new k8.e
            r0.<init>()
            goto L_0x0797
        L_0x027b:
            java.lang.Object r4 = r1.get(r0)
            k8.o r4 = (k8.o) r4
            k8.o r4 = r3.y(r4)
            java.lang.Double r4 = r4.a()
            double r4 = r4.doubleValue()
            double r4 = x.f.e(r4)
            int r4 = (int) r4
            if (r4 >= 0) goto L_0x029e
            int r5 = r20.x()
            int r5 = r5 + r4
            int r4 = java.lang.Math.max(r0, r5)
            goto L_0x02a8
        L_0x029e:
            int r0 = r20.x()
            if (r4 <= r0) goto L_0x02a8
            int r4 = r20.x()
        L_0x02a8:
            int r0 = r20.x()
            k8.e r5 = new k8.e
            r5.<init>()
            int r6 = r23.size()
            r7 = 1
            if (r6 <= r7) goto L_0x0361
            java.lang.Object r2 = r1.get(r7)
            k8.o r2 = (k8.o) r2
            k8.o r2 = r3.y(r2)
            java.lang.Double r2 = r2.a()
            double r6 = r2.doubleValue()
            double r6 = x.f.e(r6)
            int r2 = (int) r6
            r6 = 0
            int r2 = java.lang.Math.max(r6, r2)
            if (r2 <= 0) goto L_0x02f0
            r6 = r4
        L_0x02d7:
            int r7 = r4 + r2
            int r7 = java.lang.Math.min(r0, r7)
            if (r6 >= r7) goto L_0x02f0
            k8.o r7 = r9.y(r4)
            int r8 = r5.x()
            r5.D(r8, r7)
            r9.C(r4)
            int r6 = r6 + 1
            goto L_0x02d7
        L_0x02f0:
            int r0 = r23.size()
            r2 = 2
            if (r0 <= r2) goto L_0x0374
            r0 = 2
        L_0x02f8:
            int r2 = r23.size()
            if (r0 >= r2) goto L_0x0374
            java.lang.Object r2 = r1.get(r0)
            k8.o r2 = (k8.o) r2
            k8.o r2 = r3.y(r2)
            boolean r6 = r2 instanceof k8.g
            if (r6 != 0) goto L_0x0359
            int r6 = r4 + r0
            int r6 = r6 + -2
            if (r6 < 0) goto L_0x034b
            int r7 = r20.x()
            if (r6 < r7) goto L_0x031c
            r9.D(r6, r2)
            goto L_0x0348
        L_0x031c:
            java.util.SortedMap<java.lang.Integer, k8.o> r7 = r9.f20134a
            java.lang.Object r7 = r7.lastKey()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
        L_0x0328:
            if (r7 < r6) goto L_0x0345
            java.util.SortedMap<java.lang.Integer, k8.o> r8 = r9.f20134a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            java.lang.Object r8 = r8.get(r10)
            k8.o r8 = (k8.o) r8
            if (r8 == 0) goto L_0x0342
            int r11 = r7 + 1
            r9.D(r11, r8)
            java.util.SortedMap<java.lang.Integer, k8.o> r8 = r9.f20134a
            r8.remove(r10)
        L_0x0342:
            int r7 = r7 + -1
            goto L_0x0328
        L_0x0345:
            r9.D(r6, r2)
        L_0x0348:
            int r0 = r0 + 1
            goto L_0x02f8
        L_0x034b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 32
            java.lang.String r2 = "Invalid value index: "
            java.lang.String r1 = l0.d.a(r1, r2, r6)
            r0.<init>(r1)
            throw r0
        L_0x0359:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed to parse elements to add"
            r0.<init>(r1)
            throw r0
        L_0x0361:
            if (r4 >= r0) goto L_0x0374
            k8.o r1 = r9.y(r4)
            int r3 = r5.x()
            r5.D(r3, r1)
            r9.D(r4, r2)
            int r4 = r4 + 1
            goto L_0x0361
        L_0x0374:
            r0 = r5
            goto L_0x0797
        L_0x0377:
            r9 = r20
            r3 = r22
            r1 = r23
            r0 = 1
            x.f.p(r4, r0, r1)
            int r0 = r20.x()
            r4 = 2
            if (r0 >= r4) goto L_0x038a
            goto L_0x0536
        L_0x038a:
            java.util.List r0 = r20.B()
            boolean r4 = r23.isEmpty()
            if (r4 != 0) goto L_0x03af
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            k8.o r1 = (k8.o) r1
            k8.o r1 = r3.y(r1)
            boolean r2 = r1 instanceof k8.i
            if (r2 == 0) goto L_0x03a7
            r2 = r1
            k8.i r2 = (k8.i) r2
            goto L_0x03af
        L_0x03a7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Comparator should be a method"
            r0.<init>(r1)
            throw r0
        L_0x03af:
            k8.x r1 = new k8.x
            r1.<init>(r2, r3)
            java.util.Collections.sort(r0, r1)
            java.util.SortedMap<java.lang.Integer, k8.o> r1 = r9.f20134a
            r1.clear()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x03c3:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0536
            int r2 = r1 + 1
            java.lang.Object r3 = r0.next()
            k8.o r3 = (k8.o) r3
            r9.D(r1, r3)
            r1 = r2
            goto L_0x03c3
        L_0x03d6:
            r9 = r20
            r3 = r22
            r1 = r23
            r0 = 1
            x.f.n(r15, r0, r1)
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            k8.o r0 = (k8.o) r0
            k8.o r0 = r3.y(r0)
            boolean r1 = r0 instanceof k8.i
            if (r1 == 0) goto L_0x0449
            int r1 = r20.x()
            if (r1 != 0) goto L_0x03f9
            k8.o r0 = k8.o.V
            goto L_0x0797
        L_0x03f9:
            k8.i r0 = (k8.i) r0
            java.util.Iterator r1 = r20.A()
        L_0x03ff:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0445
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            boolean r4 = r9.E(r2)
            if (r4 == 0) goto L_0x03ff
            r4 = 3
            k8.o[] r4 = new k8.o[r4]
            k8.o r5 = r9.y(r2)
            r6 = 0
            r4[r6] = r5
            k8.h r5 = new k8.h
            double r6 = (double) r2
            java.lang.Double r2 = java.lang.Double.valueOf(r6)
            r5.<init>(r2)
            r2 = 1
            r4[r2] = r5
            r2 = 2
            r4[r2] = r9
            java.util.List r2 = java.util.Arrays.asList(r4)
            k8.o r2 = r0.b(r3, r2)
            java.lang.Boolean r2 = r2.j()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x03ff
            k8.o r0 = k8.o.U
            goto L_0x0797
        L_0x0445:
            k8.o r0 = k8.o.V
            goto L_0x0797
        L_0x0449:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r7)
            throw r0
        L_0x044f:
            r9 = r20
            r3 = r22
            r1 = r23
            r2 = 2
            x.f.p(r0, r2, r1)
            boolean r0 = r23.isEmpty()
            if (r0 == 0) goto L_0x0465
            k8.o r0 = r20.f()
            goto L_0x0797
        L_0x0465:
            int r0 = r20.x()
            double r4 = (double) r0
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            k8.o r0 = (k8.o) r0
            k8.o r0 = r3.y(r0)
            java.lang.Double r0 = r0.a()
            double r6 = r0.doubleValue()
            double r6 = x.f.e(r6)
            r10 = 0
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x0493
            java.lang.Double.isNaN(r4)
            java.lang.Double.isNaN(r4)
            double r6 = r6 + r4
            double r6 = java.lang.Math.max(r6, r10)
            goto L_0x0497
        L_0x0493:
            double r6 = java.lang.Math.min(r6, r4)
        L_0x0497:
            int r0 = r23.size()
            r2 = 2
            if (r0 != r2) goto L_0x04cb
            r0 = 1
            java.lang.Object r0 = r1.get(r0)
            k8.o r0 = (k8.o) r0
            k8.o r0 = r3.y(r0)
            java.lang.Double r0 = r0.a()
            double r0 = r0.doubleValue()
            double r0 = x.f.e(r0)
            r2 = 0
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 >= 0) goto L_0x04c7
            java.lang.Double.isNaN(r4)
            java.lang.Double.isNaN(r4)
            double r4 = r4 + r0
            double r4 = java.lang.Math.max(r4, r2)
            goto L_0x04cb
        L_0x04c7:
            double r4 = java.lang.Math.min(r4, r0)
        L_0x04cb:
            k8.e r0 = new k8.e
            r0.<init>()
            int r1 = (int) r6
        L_0x04d1:
            double r2 = (double) r1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0797
            k8.o r2 = r9.y(r1)
            int r3 = r0.x()
            r0.D(r3, r2)
            int r1 = r1 + 1
            goto L_0x04d1
        L_0x04e4:
            r9 = r20
            r1 = r23
            r0 = r3
            r2 = 0
            x.f.n(r0, r2, r1)
            int r0 = r20.x()
            if (r0 != 0) goto L_0x04f7
            k8.o r0 = k8.o.f20381n
            goto L_0x0797
        L_0x04f7:
            k8.o r0 = r9.y(r2)
            r9.C(r2)
            goto L_0x0797
        L_0x0500:
            r9 = r20
            r1 = r23
            r0 = 0
            x.f.n(r8, r0, r1)
            int r0 = r20.x()
            if (r0 == 0) goto L_0x0536
            r1 = 0
        L_0x050f:
            int r3 = r0 / 2
            if (r1 >= r3) goto L_0x0536
            boolean r3 = r9.E(r1)
            if (r3 == 0) goto L_0x0533
            k8.o r3 = r9.y(r1)
            r9.D(r1, r2)
            int r4 = r0 + -1
            int r4 = r4 - r1
            boolean r5 = r9.E(r4)
            if (r5 == 0) goto L_0x0530
            k8.o r5 = r9.y(r4)
            r9.D(r1, r5)
        L_0x0530:
            r9.D(r4, r3)
        L_0x0533:
            int r1 = r1 + 1
            goto L_0x050f
        L_0x0536:
            r0 = r9
            goto L_0x08ad
        L_0x0539:
            r9 = r20
            r3 = r22
            r1 = r23
            r0 = 0
            k8.o r0 = l0.e.B(r9, r3, r1, r0)
            goto L_0x0797
        L_0x0546:
            r9 = r20
            r3 = r22
            r1 = r23
            r0 = 1
            k8.o r0 = l0.e.B(r9, r3, r1, r0)
            goto L_0x0797
        L_0x0553:
            r9 = r20
            r3 = r22
            r1 = r23
            boolean r0 = r23.isEmpty()
            if (r0 != 0) goto L_0x057b
            java.util.Iterator r0 = r23.iterator()
        L_0x0563:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x057b
            java.lang.Object r1 = r0.next()
            k8.o r1 = (k8.o) r1
            k8.o r1 = r3.y(r1)
            int r2 = r20.x()
            r9.D(r2, r1)
            goto L_0x0563
        L_0x057b:
            k8.h r0 = new k8.h
            int r1 = r20.x()
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            goto L_0x0797
        L_0x058b:
            r9 = r20
            r1 = r23
            r0 = 0
            x.f.n(r13, r0, r1)
            int r0 = r20.x()
            if (r0 != 0) goto L_0x059d
            k8.o r0 = k8.o.f20381n
            goto L_0x0797
        L_0x059d:
            int r0 = r0 + -1
            k8.o r1 = r9.y(r0)
            r9.C(r0)
        L_0x05a6:
            r0 = r1
            goto L_0x0797
        L_0x05a9:
            r9 = r20
            r3 = r22
            r1 = r23
            r0 = 0
            r4 = 1
            x.f.n(r12, r4, r1)
            java.lang.Object r0 = r1.get(r0)
            k8.o r0 = (k8.o) r0
            k8.o r0 = r3.y(r0)
            boolean r1 = r0 instanceof k8.n
            if (r1 == 0) goto L_0x05d7
            int r1 = r20.x()
            if (r1 != 0) goto L_0x05cf
            k8.e r0 = new k8.e
            r0.<init>()
            goto L_0x0797
        L_0x05cf:
            k8.n r0 = (k8.n) r0
            k8.e r0 = l0.e.z(r9, r3, r0, r2, r2)
            goto L_0x0797
        L_0x05d7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r7)
            throw r0
        L_0x05dd:
            r9 = r20
            r3 = r22
            r1 = r23
            r0 = 2
            x.f.p(r11, r0, r1)
            k8.o r0 = k8.o.f20381n
            boolean r2 = r23.isEmpty()
            if (r2 != 0) goto L_0x05fa
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            k8.o r0 = (k8.o) r0
            k8.o r0 = r3.y(r0)
        L_0x05fa:
            int r2 = r20.x()
            int r2 = r2 + -1
            double r4 = (double) r2
            int r2 = r23.size()
            r6 = 1
            if (r2 <= r6) goto L_0x0648
            java.lang.Object r1 = r1.get(r6)
            k8.o r1 = (k8.o) r1
            k8.o r1 = r3.y(r1)
            java.lang.Double r2 = r1.a()
            double r2 = r2.doubleValue()
            boolean r2 = java.lang.Double.isNaN(r2)
            if (r2 == 0) goto L_0x0628
            int r1 = r20.x()
            int r1 = r1 + -1
            double r1 = (double) r1
            goto L_0x0634
        L_0x0628:
            java.lang.Double r1 = r1.a()
            double r1 = r1.doubleValue()
            double r1 = x.f.e(r1)
        L_0x0634:
            r4 = r1
            r1 = 0
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x064a
            int r3 = r20.x()
            double r6 = (double) r3
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r6)
            double r4 = r4 + r6
            goto L_0x064a
        L_0x0648:
            r1 = 0
        L_0x064a:
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x0659
            k8.h r0 = new k8.h
            java.lang.Double r1 = java.lang.Double.valueOf(r16)
            r0.<init>(r1)
            goto L_0x0797
        L_0x0659:
            int r1 = r20.x()
            double r1 = (double) r1
            double r1 = java.lang.Math.min(r1, r4)
            int r1 = (int) r1
        L_0x0663:
            if (r1 < 0) goto L_0x0684
            boolean r2 = r9.E(r1)
            if (r2 == 0) goto L_0x0681
            k8.o r2 = r9.y(r1)
            boolean r2 = x.f.r(r2, r0)
            if (r2 == 0) goto L_0x0681
            k8.h r0 = new k8.h
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            goto L_0x0797
        L_0x0681:
            int r1 = r1 + -1
            goto L_0x0663
        L_0x0684:
            k8.h r0 = new k8.h
            java.lang.Double r1 = java.lang.Double.valueOf(r16)
            r0.<init>(r1)
            goto L_0x0797
        L_0x068f:
            r9 = r20
            r3 = r22
            r1 = r23
            r0 = 1
            x.f.p(r14, r0, r1)
            int r0 = r20.x()
            if (r0 != 0) goto L_0x06a3
            k8.o r0 = k8.o.W
            goto L_0x0797
        L_0x06a3:
            int r0 = r23.size()
            if (r0 <= 0) goto L_0x06c5
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            k8.o r0 = (k8.o) r0
            k8.o r0 = r3.y(r0)
            boolean r1 = r0 instanceof k8.m
            if (r1 != 0) goto L_0x06c2
            boolean r1 = r0 instanceof k8.s
            if (r1 == 0) goto L_0x06bd
            goto L_0x06c2
        L_0x06bd:
            java.lang.String r0 = r0.q()
            goto L_0x06c7
        L_0x06c2:
            java.lang.String r0 = ""
            goto L_0x06c7
        L_0x06c5:
            java.lang.String r0 = ","
        L_0x06c7:
            k8.r r1 = new k8.r
            java.lang.String r0 = r9.z(r0)
            r1.<init>(r0)
            goto L_0x05a6
        L_0x06d2:
            r9 = r20
            r3 = r22
            r1 = r23
            r0 = 2
            x.f.p(r6, r0, r1)
            k8.o r0 = k8.o.f20381n
            boolean r2 = r23.isEmpty()
            if (r2 != 0) goto L_0x06ef
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            k8.o r0 = (k8.o) r0
            k8.o r0 = r3.y(r0)
        L_0x06ef:
            int r2 = r23.size()
            r4 = 1
            if (r2 <= r4) goto L_0x0733
            java.lang.Object r1 = r1.get(r4)
            k8.o r1 = (k8.o) r1
            k8.o r1 = r3.y(r1)
            java.lang.Double r1 = r1.a()
            double r1 = r1.doubleValue()
            double r1 = x.f.e(r1)
            int r3 = r20.x()
            double r3 = (double) r3
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0720
            k8.h r0 = new k8.h
            java.lang.Double r1 = java.lang.Double.valueOf(r16)
            r0.<init>(r1)
            goto L_0x0797
        L_0x0720:
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0735
            int r3 = r20.x()
            double r3 = (double) r3
            java.lang.Double.isNaN(r3)
            java.lang.Double.isNaN(r3)
            double r1 = r1 + r3
            goto L_0x0735
        L_0x0733:
            r1 = 0
        L_0x0735:
            java.util.Iterator r3 = r20.A()
        L_0x0739:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0762
            java.lang.Object r4 = r3.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            double r5 = (double) r4
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 < 0) goto L_0x0739
            k8.o r4 = r9.y(r4)
            boolean r4 = x.f.r(r4, r0)
            if (r4 == 0) goto L_0x0739
            k8.h r0 = new k8.h
            java.lang.Double r1 = java.lang.Double.valueOf(r5)
            r0.<init>(r1)
            goto L_0x0797
        L_0x0762:
            k8.h r0 = new k8.h
            java.lang.Double r1 = java.lang.Double.valueOf(r16)
            r0.<init>(r1)
            goto L_0x0797
        L_0x076c:
            r9 = r20
            r3 = r22
            r1 = r23
            r0 = 1
            x.f.n(r10, r0, r1)
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            k8.o r0 = (k8.o) r0
            k8.o r0 = r3.y(r0)
            boolean r1 = r0 instanceof k8.n
            if (r1 == 0) goto L_0x079e
            java.util.SortedMap<java.lang.Integer, k8.o> r1 = r9.f20134a
            int r1 = r1.size()
            if (r1 != 0) goto L_0x0790
            k8.o r0 = k8.o.f20381n
            goto L_0x0797
        L_0x0790:
            k8.n r0 = (k8.n) r0
            l0.e.z(r9, r3, r0, r2, r2)
            k8.o r0 = k8.o.f20381n
        L_0x0797:
            r19 = r9
            r9 = r0
            r0 = r19
            goto L_0x08ad
        L_0x079e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r7)
            throw r0
        L_0x07a4:
            r0 = r20
            r3 = r22
            r1 = r23
            r4 = 1
            x.f.n(r9, r4, r1)
            r4 = 0
            java.lang.Object r1 = r1.get(r4)
            k8.o r1 = (k8.o) r1
            k8.o r1 = r3.y(r1)
            boolean r4 = r1 instanceof k8.n
            if (r4 == 0) goto L_0x07ff
            java.util.SortedMap<java.lang.Integer, k8.o> r4 = r0.f20134a
            int r4 = r4.size()
            if (r4 != 0) goto L_0x07cb
            k8.e r1 = new k8.e
            r1.<init>()
            goto L_0x0828
        L_0x07cb:
            k8.o r4 = r20.f()
            k8.n r1 = (k8.n) r1
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            k8.e r1 = l0.e.z(r0, r3, r1, r2, r5)
            k8.e r9 = new k8.e
            r9.<init>()
            java.util.Iterator r1 = r1.A()
        L_0x07e0:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x08ad
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r4
            k8.e r3 = (k8.e) r3
            k8.o r2 = r3.y(r2)
            int r3 = r9.x()
            r9.D(r3, r2)
            goto L_0x07e0
        L_0x07ff:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r7)
            throw r1
        L_0x0805:
            r0 = r20
            r3 = r22
            r1 = r23
            r2 = r18
            r4 = 1
            x.f.n(r2, r4, r1)
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            k8.o r1 = (k8.o) r1
            k8.o r1 = r3.y(r1)
            boolean r2 = r1 instanceof k8.n
            if (r2 == 0) goto L_0x0845
            int r2 = r20.x()
            if (r2 != 0) goto L_0x082b
            k8.o r1 = k8.o.U
        L_0x0828:
            r9 = r1
            goto L_0x08ad
        L_0x082b:
            k8.n r1 = (k8.n) r1
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            k8.e r1 = l0.e.z(r0, r3, r1, r2, r4)
            int r1 = r1.x()
            int r2 = r20.x()
            if (r1 == r2) goto L_0x0842
            k8.o r1 = k8.o.V
            goto L_0x0828
        L_0x0842:
            k8.o r1 = k8.o.U
            goto L_0x0828
        L_0x0845:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r7)
            throw r1
        L_0x084b:
            r0 = r20
            r3 = r22
            r1 = r23
            k8.o r9 = r20.f()
            boolean r2 = r23.isEmpty()
            if (r2 != 0) goto L_0x08ad
            java.util.Iterator r1 = r23.iterator()
        L_0x085f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x08ad
            java.lang.Object r2 = r1.next()
            k8.o r2 = (k8.o) r2
            k8.o r2 = r3.y(r2)
            boolean r4 = r2 instanceof k8.g
            if (r4 != 0) goto L_0x08a5
            r4 = r9
            k8.e r4 = (k8.e) r4
            int r5 = r4.x()
            boolean r6 = r2 instanceof k8.e
            if (r6 == 0) goto L_0x08a1
            k8.e r2 = (k8.e) r2
            java.util.Iterator r6 = r2.A()
        L_0x0884:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x085f
            java.lang.Object r7 = r6.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r8 = r7.intValue()
            int r7 = r7.intValue()
            k8.o r7 = r2.y(r7)
            int r8 = r8 + r5
            r4.D(r8, r7)
            goto L_0x0884
        L_0x08a1:
            r4.D(r5, r2)
            goto L_0x085f
        L_0x08a5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Failed evaluation of arguments"
            r1.<init>(r2)
            throw r1
        L_0x08ad:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.e.s(java.lang.String, n2.g, java.util.List):k8.o");
    }

    public final String toString() {
        return z(",");
    }

    public final int x() {
        if (this.f20134a.isEmpty()) {
            return 0;
        }
        return this.f20134a.lastKey().intValue() + 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r2 = (k8.o) r1.f20134a.get(java.lang.Integer.valueOf(r2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final k8.o y(int r2) {
        /*
            r1 = this;
            int r0 = r1.x()
            if (r2 >= r0) goto L_0x001e
            boolean r0 = r1.E(r2)
            if (r0 == 0) goto L_0x001b
            java.util.SortedMap<java.lang.Integer, k8.o> r0 = r1.f20134a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            k8.o r2 = (k8.o) r2
            if (r2 == 0) goto L_0x001b
            return r2
        L_0x001b:
            k8.o r2 = k8.o.f20381n
            return r2
        L_0x001e:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "Attempting to get element outside of current array"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.e.y(int):k8.o");
    }

    public final String z(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        if (!this.f20134a.isEmpty()) {
            for (int i10 = 0; i10 < x(); i10++) {
                o y10 = y(i10);
                sb2.append(str);
                if (!(y10 instanceof s) && !(y10 instanceof m)) {
                    sb2.append(y10.q());
                }
            }
            sb2.delete(0, str.length());
        }
        return sb2.toString();
    }

    public e(List<o> list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                D(i10, list.get(i10));
            }
        }
    }
}

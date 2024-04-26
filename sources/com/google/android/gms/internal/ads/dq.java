package com.google.android.gms.internal.ads;

import e8.w90;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class dq {
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01e5, code lost:
        if (((java.lang.Boolean) r4).booleanValue() == false) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01f3, code lost:
        if (((java.lang.Integer) r4).intValue() == 0) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0204, code lost:
        if (((java.lang.Float) r4).floatValue() == 0.0f) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0216, code lost:
        if (((java.lang.Double) r4).doubleValue() == 0.0d) goto L_0x024a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0250  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.google.android.gms.internal.ads.cq r13, java.lang.StringBuilder r14, int r15) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.TreeSet r2 = new java.util.TreeSet
            r2.<init>()
            java.lang.Class r3 = r13.getClass()
            java.lang.reflect.Method[] r3 = r3.getDeclaredMethods()
            int r4 = r3.length
            r5 = 0
            r6 = 0
        L_0x001a:
            java.lang.String r7 = "get"
            if (r6 >= r4) goto L_0x0049
            r8 = r3[r6]
            java.lang.String r9 = r8.getName()
            r1.put(r9, r8)
            java.lang.Class[] r9 = r8.getParameterTypes()
            int r9 = r9.length
            if (r9 != 0) goto L_0x0046
            java.lang.String r9 = r8.getName()
            r0.put(r9, r8)
            java.lang.String r9 = r8.getName()
            boolean r7 = r9.startsWith(r7)
            if (r7 == 0) goto L_0x0046
            java.lang.String r7 = r8.getName()
            r2.add(r7)
        L_0x0046:
            int r6 = r6 + 1
            goto L_0x001a
        L_0x0049:
            java.util.Iterator r2 = r2.iterator()
        L_0x004d:
            boolean r3 = r2.hasNext()
            r4 = 3
            if (r3 == 0) goto L_0x0269
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r6 = r3.startsWith(r7)
            if (r6 == 0) goto L_0x0065
            java.lang.String r6 = r3.substring(r4)
            goto L_0x0066
        L_0x0065:
            r6 = r3
        L_0x0066:
            java.lang.String r8 = "List"
            boolean r9 = r6.endsWith(r8)
            r10 = 1
            if (r9 == 0) goto L_0x00ca
            java.lang.String r9 = "OrBuilderList"
            boolean r9 = r6.endsWith(r9)
            if (r9 != 0) goto L_0x00ca
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L_0x00ca
            java.lang.String r8 = r6.substring(r5, r10)
            java.lang.String r8 = r8.toLowerCase()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r9 = r6.length()
            int r9 = r9 + -4
            java.lang.String r9 = r6.substring(r10, r9)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r11 = r9.length()
            if (r11 == 0) goto L_0x00a2
            java.lang.String r8 = r8.concat(r9)
            goto L_0x00a8
        L_0x00a2:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r8)
            r8 = r9
        L_0x00a8:
            java.lang.Object r9 = r0.get(r3)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r9 == 0) goto L_0x00ca
            java.lang.Class r11 = r9.getReturnType()
            java.lang.Class<java.util.List> r12 = java.util.List.class
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x00ca
            java.lang.String r3 = c(r8)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Object r4 = com.google.android.gms.internal.ads.aq.r(r9, r13, r4)
            b(r14, r15, r3, r4)
            goto L_0x004d
        L_0x00ca:
            java.lang.String r8 = "Map"
            boolean r9 = r6.endsWith(r8)
            if (r9 == 0) goto L_0x0136
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L_0x0136
            java.lang.String r8 = r6.substring(r5, r10)
            java.lang.String r8 = r8.toLowerCase()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r9 = r6.length()
            int r9 = r9 - r4
            java.lang.String r4 = r6.substring(r10, r9)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r9 = r4.length()
            if (r9 == 0) goto L_0x00fc
            java.lang.String r4 = r8.concat(r4)
            goto L_0x0101
        L_0x00fc:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r8)
        L_0x0101:
            java.lang.Object r3 = r0.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L_0x0136
            java.lang.Class r8 = r3.getReturnType()
            java.lang.Class<java.util.Map> r9 = java.util.Map.class
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0136
            java.lang.Class<java.lang.Deprecated> r8 = java.lang.Deprecated.class
            boolean r8 = r3.isAnnotationPresent(r8)
            if (r8 != 0) goto L_0x0136
            int r8 = r3.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isPublic(r8)
            if (r8 == 0) goto L_0x0136
            java.lang.String r4 = c(r4)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Object r3 = com.google.android.gms.internal.ads.aq.r(r3, r13, r6)
            b(r14, r15, r4, r3)
            goto L_0x004d
        L_0x0136:
            java.lang.String r3 = "set"
            int r4 = r6.length()
            if (r4 == 0) goto L_0x0143
            java.lang.String r3 = r3.concat(r6)
            goto L_0x0149
        L_0x0143:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            r3 = r4
        L_0x0149:
            java.lang.Object r3 = r1.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L_0x004d
            java.lang.String r3 = "Bytes"
            boolean r3 = r6.endsWith(r3)
            if (r3 == 0) goto L_0x017d
            int r3 = r6.length()
            int r3 = r3 + -5
            java.lang.String r3 = r6.substring(r5, r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            if (r4 == 0) goto L_0x0172
            java.lang.String r3 = r7.concat(r3)
            goto L_0x0177
        L_0x0172:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r7)
        L_0x0177:
            boolean r3 = r0.containsKey(r3)
            if (r3 != 0) goto L_0x004d
        L_0x017d:
            java.lang.String r3 = r6.substring(r5, r10)
            java.lang.String r3 = r3.toLowerCase()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = r6.substring(r10)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r8 = r4.length()
            if (r8 == 0) goto L_0x019c
            java.lang.String r3 = r3.concat(r4)
            goto L_0x01a2
        L_0x019c:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            r3 = r4
        L_0x01a2:
            int r4 = r6.length()
            if (r4 == 0) goto L_0x01ad
            java.lang.String r4 = r7.concat(r6)
            goto L_0x01b2
        L_0x01ad:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r7)
        L_0x01b2:
            java.lang.Object r4 = r0.get(r4)
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r8 = "has"
            int r9 = r6.length()
            if (r9 == 0) goto L_0x01c5
            java.lang.String r6 = r8.concat(r6)
            goto L_0x01ca
        L_0x01c5:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r8)
        L_0x01ca:
            java.lang.Object r6 = r0.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r4 == 0) goto L_0x004d
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r4 = com.google.android.gms.internal.ads.aq.r(r4, r13, r8)
            if (r6 != 0) goto L_0x0252
            boolean r6 = r4 instanceof java.lang.Boolean
            if (r6 == 0) goto L_0x01e8
            r6 = r4
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x024c
            goto L_0x024a
        L_0x01e8:
            boolean r6 = r4 instanceof java.lang.Integer
            if (r6 == 0) goto L_0x01f6
            r6 = r4
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 != 0) goto L_0x024c
            goto L_0x024a
        L_0x01f6:
            boolean r6 = r4 instanceof java.lang.Float
            if (r6 == 0) goto L_0x0207
            r6 = r4
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x024c
            goto L_0x024a
        L_0x0207:
            boolean r6 = r4 instanceof java.lang.Double
            if (r6 == 0) goto L_0x0219
            r6 = r4
            java.lang.Double r6 = (java.lang.Double) r6
            double r8 = r6.doubleValue()
            r11 = 0
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x024c
            goto L_0x024a
        L_0x0219:
            boolean r6 = r4 instanceof java.lang.String
            if (r6 == 0) goto L_0x0224
            java.lang.String r6 = ""
            boolean r6 = r4.equals(r6)
            goto L_0x024d
        L_0x0224:
            boolean r6 = r4 instanceof com.google.android.gms.internal.ads.mp
            if (r6 == 0) goto L_0x022f
            com.google.android.gms.internal.ads.mp r6 = com.google.android.gms.internal.ads.mp.f7494b
            boolean r6 = r4.equals(r6)
            goto L_0x024d
        L_0x022f:
            boolean r6 = r4 instanceof com.google.android.gms.internal.ads.cq
            if (r6 == 0) goto L_0x023d
            r6 = r4
            com.google.android.gms.internal.ads.cq r6 = (com.google.android.gms.internal.ads.cq) r6
            com.google.android.gms.internal.ads.cq r6 = r6.e()
            if (r4 != r6) goto L_0x024c
            goto L_0x024a
        L_0x023d:
            boolean r6 = r4 instanceof java.lang.Enum
            if (r6 == 0) goto L_0x024c
            r6 = r4
            java.lang.Enum r6 = (java.lang.Enum) r6
            int r6 = r6.ordinal()
            if (r6 != 0) goto L_0x024c
        L_0x024a:
            r6 = 1
            goto L_0x024d
        L_0x024c:
            r6 = 0
        L_0x024d:
            if (r6 != 0) goto L_0x0250
            goto L_0x025e
        L_0x0250:
            r10 = 0
            goto L_0x025e
        L_0x0252:
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r6 = com.google.android.gms.internal.ads.aq.r(r6, r13, r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r10 = r6.booleanValue()
        L_0x025e:
            if (r10 == 0) goto L_0x004d
            java.lang.String r3 = c(r3)
            b(r14, r15, r3, r4)
            goto L_0x004d
        L_0x0269:
            boolean r0 = r13 instanceof com.google.android.gms.internal.ads.aq.d
            if (r0 == 0) goto L_0x028f
            r0 = r13
            com.google.android.gms.internal.ads.aq$d r0 = (com.google.android.gms.internal.ads.aq.d) r0
            com.google.android.gms.internal.ads.xp<com.google.android.gms.internal.ads.aq$c> r0 = r0.zzipb
            java.util.Iterator r0 = r0.b()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L_0x027d
            goto L_0x028f
        L_0x027d:
            java.lang.Object r13 = r0.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r13 = r13.getKey()
            com.google.android.gms.internal.ads.aq$c r13 = (com.google.android.gms.internal.ads.aq.c) r13
            java.lang.NoSuchMethodError r13 = new java.lang.NoSuchMethodError
            r13.<init>()
            throw r13
        L_0x028f:
            com.google.android.gms.internal.ads.aq r13 = (com.google.android.gms.internal.ads.aq) r13
            com.google.android.gms.internal.ads.nq r13 = r13.zziou
            if (r13 == 0) goto L_0x02ac
        L_0x0295:
            int r0 = r13.f7604a
            if (r5 >= r0) goto L_0x02ac
            int[] r0 = r13.f7605b
            r0 = r0[r5]
            int r0 = r0 >>> r4
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object[] r1 = r13.f7606c
            r1 = r1[r5]
            b(r14, r15, r0, r1)
            int r5 = r5 + 1
            goto L_0x0295
        L_0x02ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dq.a(com.google.android.gms.internal.ads.cq, java.lang.StringBuilder, int):void");
    }

    public static final void b(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b10 : (List) obj) {
                b(sb2, i10, str, b10);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b11 : ((Map) obj).entrySet()) {
                b(sb2, i10, str, b11);
            }
        } else {
            sb2.append(10);
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                sb2.append(' ');
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                sb2.append(w90.a(mp.J((String) obj)));
                sb2.append('\"');
            } else if (obj instanceof mp) {
                sb2.append(": \"");
                sb2.append(w90.a((mp) obj));
                sb2.append('\"');
            } else if (obj instanceof aq) {
                sb2.append(" {");
                a((aq) obj, sb2, i10 + 2);
                sb2.append("\n");
                while (i11 < i10) {
                    sb2.append(' ');
                    i11++;
                }
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                sb2.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i13 = i10 + 2;
                b(sb2, i13, "key", entry.getKey());
                b(sb2, i13, "value", entry.getValue());
                sb2.append("\n");
                while (i11 < i10) {
                    sb2.append(' ');
                    i11++;
                }
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj.toString());
            }
        }
    }

    public static final String c(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }
}

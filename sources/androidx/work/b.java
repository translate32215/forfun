package androidx.work;

import g2.e;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Data */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final String f3238b = e.e("Data");

    /* renamed from: c  reason: collision with root package name */
    public static final b f3239c;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Object> f3240a;

    /* compiled from: Data */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public Map<String, Object> f3241a = new HashMap();

        public b a() {
            b bVar = new b((Map<String, ?>) this.f3241a);
            b.c(bVar);
            return bVar;
        }

        public a b(Map<String, Object> map) {
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                Object value = next.getValue();
                if (value == null) {
                    this.f3241a.put(str, (Object) null);
                } else {
                    Class<?> cls = value.getClass();
                    if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                        this.f3241a.put(str, value);
                    } else {
                        int i10 = 0;
                        if (cls == boolean[].class) {
                            Map<String, Object> map2 = this.f3241a;
                            boolean[] zArr = (boolean[]) value;
                            String str2 = b.f3238b;
                            Boolean[] boolArr = new Boolean[zArr.length];
                            while (i10 < zArr.length) {
                                boolArr[i10] = Boolean.valueOf(zArr[i10]);
                                i10++;
                            }
                            map2.put(str, boolArr);
                        } else if (cls == byte[].class) {
                            Map<String, Object> map3 = this.f3241a;
                            byte[] bArr = (byte[]) value;
                            String str3 = b.f3238b;
                            Byte[] bArr2 = new Byte[bArr.length];
                            while (i10 < bArr.length) {
                                bArr2[i10] = Byte.valueOf(bArr[i10]);
                                i10++;
                            }
                            map3.put(str, bArr2);
                        } else if (cls == int[].class) {
                            Map<String, Object> map4 = this.f3241a;
                            int[] iArr = (int[]) value;
                            String str4 = b.f3238b;
                            Integer[] numArr = new Integer[iArr.length];
                            while (i10 < iArr.length) {
                                numArr[i10] = Integer.valueOf(iArr[i10]);
                                i10++;
                            }
                            map4.put(str, numArr);
                        } else if (cls == long[].class) {
                            Map<String, Object> map5 = this.f3241a;
                            long[] jArr = (long[]) value;
                            String str5 = b.f3238b;
                            Long[] lArr = new Long[jArr.length];
                            while (i10 < jArr.length) {
                                lArr[i10] = Long.valueOf(jArr[i10]);
                                i10++;
                            }
                            map5.put(str, lArr);
                        } else if (cls == float[].class) {
                            Map<String, Object> map6 = this.f3241a;
                            float[] fArr = (float[]) value;
                            String str6 = b.f3238b;
                            Float[] fArr2 = new Float[fArr.length];
                            while (i10 < fArr.length) {
                                fArr2[i10] = Float.valueOf(fArr[i10]);
                                i10++;
                            }
                            map6.put(str, fArr2);
                        } else if (cls == double[].class) {
                            Map<String, Object> map7 = this.f3241a;
                            double[] dArr = (double[]) value;
                            String str7 = b.f3238b;
                            Double[] dArr2 = new Double[dArr.length];
                            while (i10 < dArr.length) {
                                dArr2[i10] = Double.valueOf(dArr[i10]);
                                i10++;
                            }
                            map7.put(str, dArr2);
                        } else {
                            throw new IllegalArgumentException(String.format("Key %s has invalid type %s", new Object[]{str, cls}));
                        }
                    }
                }
            }
            return this;
        }
    }

    static {
        b bVar = new b((Map<String, ?>) new HashMap());
        c(bVar);
        f3239c = bVar;
    }

    public b() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050 A[SYNTHETIC, Splitter:B:25:0x0050] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a A[SYNTHETIC, Splitter:B:34:0x006a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.work.b a(byte[] r7) throws java.lang.IllegalStateException {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto L_0x007f
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0045, ClassNotFoundException -> 0x0043, all -> 0x0041 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0045, ClassNotFoundException -> 0x0043, all -> 0x0041 }
            int r7 = r3.readInt()     // Catch:{ IOException -> 0x003f, ClassNotFoundException -> 0x003d }
        L_0x001b:
            if (r7 <= 0) goto L_0x002b
            java.lang.String r4 = r3.readUTF()     // Catch:{ IOException -> 0x003f, ClassNotFoundException -> 0x003d }
            java.lang.Object r5 = r3.readObject()     // Catch:{ IOException -> 0x003f, ClassNotFoundException -> 0x003d }
            r1.put(r4, r5)     // Catch:{ IOException -> 0x003f, ClassNotFoundException -> 0x003d }
            int r7 = r7 + -1
            goto L_0x001b
        L_0x002b:
            r3.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0035
        L_0x002f:
            r7 = move-exception
            java.lang.String r3 = f3238b
            android.util.Log.e(r3, r0, r7)
        L_0x0035:
            r2.close()     // Catch:{ IOException -> 0x0039 }
            goto L_0x0060
        L_0x0039:
            r7 = move-exception
            goto L_0x005b
        L_0x003b:
            r7 = move-exception
            goto L_0x0066
        L_0x003d:
            r7 = move-exception
            goto L_0x0049
        L_0x003f:
            r7 = move-exception
            goto L_0x0049
        L_0x0041:
            r1 = move-exception
            goto L_0x0068
        L_0x0043:
            r3 = move-exception
            goto L_0x0046
        L_0x0045:
            r3 = move-exception
        L_0x0046:
            r6 = r3
            r3 = r7
            r7 = r6
        L_0x0049:
            java.lang.String r4 = f3238b     // Catch:{ all -> 0x003b }
            android.util.Log.e(r4, r0, r7)     // Catch:{ all -> 0x003b }
            if (r3 == 0) goto L_0x0035
            r3.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0035
        L_0x0054:
            r7 = move-exception
            java.lang.String r3 = f3238b
            android.util.Log.e(r3, r0, r7)
            goto L_0x0035
        L_0x005b:
            java.lang.String r2 = f3238b
            android.util.Log.e(r2, r0, r7)
        L_0x0060:
            androidx.work.b r7 = new androidx.work.b
            r7.<init>((java.util.Map<java.lang.String, ?>) r1)
            return r7
        L_0x0066:
            r1 = r7
            r7 = r3
        L_0x0068:
            if (r7 == 0) goto L_0x0074
            r7.close()     // Catch:{ IOException -> 0x006e }
            goto L_0x0074
        L_0x006e:
            r7 = move-exception
            java.lang.String r3 = f3238b
            android.util.Log.e(r3, r0, r7)
        L_0x0074:
            r2.close()     // Catch:{ IOException -> 0x0078 }
            goto L_0x007e
        L_0x0078:
            r7 = move-exception
            java.lang.String r2 = f3238b
            android.util.Log.e(r2, r0, r7)
        L_0x007e:
            throw r1
        L_0x007f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r7.<init>(r0)
            goto L_0x0088
        L_0x0087:
            throw r7
        L_0x0088:
            goto L_0x0087
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.b.a(byte[]):androidx.work.b");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c A[SYNTHETIC, Splitter:B:31:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0093 A[SYNTHETIC, Splitter:B:41:0x0093] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] c(androidx.work.b r5) throws java.lang.IllegalStateException {
        /*
            java.lang.String r0 = "Error in Data#toByteArray: "
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 0
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0070 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0070 }
            java.util.Map<java.lang.String, java.lang.Object> r2 = r5.f3240a     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            int r2 = r2.size()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            r3.writeInt(r2)     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.util.Map<java.lang.String, java.lang.Object> r5 = r5.f3240a     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
        L_0x0020:
            boolean r2 = r5.hasNext()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            if (r2 == 0) goto L_0x003d
            java.lang.Object r2 = r5.next()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.lang.Object r4 = r2.getKey()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            r3.writeUTF(r4)     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            r3.writeObject(r2)     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            goto L_0x0020
        L_0x003d:
            r3.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0047
        L_0x0041:
            r5 = move-exception
            java.lang.String r2 = f3238b
            android.util.Log.e(r2, r0, r5)
        L_0x0047:
            r1.close()     // Catch:{ IOException -> 0x004b }
            goto L_0x0051
        L_0x004b:
            r5 = move-exception
            java.lang.String r2 = f3238b
            android.util.Log.e(r2, r0, r5)
        L_0x0051:
            int r5 = r1.size()
            r0 = 10240(0x2800, float:1.4349E-41)
            if (r5 > r0) goto L_0x005e
            byte[] r5 = r1.toByteArray()
            return r5
        L_0x005e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r5.<init>(r0)
            throw r5
        L_0x0066:
            r5 = move-exception
            goto L_0x006a
        L_0x0068:
            r5 = move-exception
            goto L_0x006c
        L_0x006a:
            r2 = r3
            goto L_0x0091
        L_0x006c:
            r2 = r3
            goto L_0x0071
        L_0x006e:
            r5 = move-exception
            goto L_0x0091
        L_0x0070:
            r5 = move-exception
        L_0x0071:
            java.lang.String r3 = f3238b     // Catch:{ all -> 0x006e }
            android.util.Log.e(r3, r0, r5)     // Catch:{ all -> 0x006e }
            byte[] r5 = r1.toByteArray()     // Catch:{ all -> 0x006e }
            if (r2 == 0) goto L_0x0086
            r2.close()     // Catch:{ IOException -> 0x0080 }
            goto L_0x0086
        L_0x0080:
            r2 = move-exception
            java.lang.String r3 = f3238b
            android.util.Log.e(r3, r0, r2)
        L_0x0086:
            r1.close()     // Catch:{ IOException -> 0x008a }
            goto L_0x0090
        L_0x008a:
            r1 = move-exception
            java.lang.String r2 = f3238b
            android.util.Log.e(r2, r0, r1)
        L_0x0090:
            return r5
        L_0x0091:
            if (r2 == 0) goto L_0x009d
            r2.close()     // Catch:{ IOException -> 0x0097 }
            goto L_0x009d
        L_0x0097:
            r2 = move-exception
            java.lang.String r3 = f3238b
            android.util.Log.e(r3, r0, r2)
        L_0x009d:
            r1.close()     // Catch:{ IOException -> 0x00a1 }
            goto L_0x00a7
        L_0x00a1:
            r1 = move-exception
            java.lang.String r2 = f3238b
            android.util.Log.e(r2, r0, r1)
        L_0x00a7:
            goto L_0x00a9
        L_0x00a8:
            throw r5
        L_0x00a9:
            goto L_0x00a8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.b.c(androidx.work.b):byte[]");
    }

    public String b(String str) {
        Object obj = this.f3240a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return this.f3240a.equals(((b) obj).f3240a);
    }

    public int hashCode() {
        return this.f3240a.hashCode() * 31;
    }

    public b(b bVar) {
        this.f3240a = new HashMap(bVar.f3240a);
    }

    public b(Map<String, ?> map) {
        this.f3240a = new HashMap(map);
    }
}

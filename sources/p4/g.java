package p4;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MetadataBackendRegistry */
public class g implements d {

    /* renamed from: a  reason: collision with root package name */
    public final a f23826a;

    /* renamed from: b  reason: collision with root package name */
    public final e f23827b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, h> f23828c = new HashMap();

    /* compiled from: MetadataBackendRegistry */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Context f23829a;

        /* renamed from: b  reason: collision with root package name */
        public Map<String, String> f23830b = null;

        public a(Context context) {
            this.f23829a = context;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p4.c a(java.lang.String r15) {
            /*
                r14 = this;
                java.lang.String r0 = "Could not instantiate %s"
                java.lang.String r1 = "Could not instantiate %s."
                java.util.Map<java.lang.String, java.lang.String> r2 = r14.f23830b
                r3 = 0
                java.lang.String r4 = "BackendRegistry"
                r5 = 0
                if (r2 != 0) goto L_0x0096
                android.content.Context r2 = r14.f23829a
                android.content.pm.PackageManager r6 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0032 }
                if (r6 != 0) goto L_0x001a
                java.lang.String r2 = "Context has no PackageManager."
                android.util.Log.w(r4, r2)     // Catch:{ NameNotFoundException -> 0x0032 }
                goto L_0x0037
            L_0x001a:
                android.content.ComponentName r7 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0032 }
                java.lang.Class<com.google.android.datatransport.runtime.backends.TransportBackendDiscovery> r8 = com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.class
                r7.<init>(r2, r8)     // Catch:{ NameNotFoundException -> 0x0032 }
                r2 = 128(0x80, float:1.794E-43)
                android.content.pm.ServiceInfo r2 = r6.getServiceInfo(r7, r2)     // Catch:{ NameNotFoundException -> 0x0032 }
                if (r2 != 0) goto L_0x002f
                java.lang.String r2 = "TransportBackendDiscovery has no service info."
                android.util.Log.w(r4, r2)     // Catch:{ NameNotFoundException -> 0x0032 }
                goto L_0x0037
            L_0x002f:
                android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0032 }
                goto L_0x0038
            L_0x0032:
                java.lang.String r2 = "Application info not found."
                android.util.Log.w(r4, r2)
            L_0x0037:
                r2 = r3
            L_0x0038:
                if (r2 != 0) goto L_0x0044
                java.lang.String r2 = "Could not retrieve metadata, returning empty list of transport backends."
                android.util.Log.w(r4, r2)
                java.util.Map r2 = java.util.Collections.emptyMap()
                goto L_0x0094
            L_0x0044:
                java.util.HashMap r6 = new java.util.HashMap
                r6.<init>()
                java.util.Set r7 = r2.keySet()
                java.util.Iterator r7 = r7.iterator()
            L_0x0051:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x0093
                java.lang.Object r8 = r7.next()
                java.lang.String r8 = (java.lang.String) r8
                java.lang.Object r9 = r2.get(r8)
                boolean r10 = r9 instanceof java.lang.String
                if (r10 == 0) goto L_0x0051
                java.lang.String r10 = "backend:"
                boolean r10 = r8.startsWith(r10)
                if (r10 == 0) goto L_0x0051
                java.lang.String r9 = (java.lang.String) r9
                r10 = -1
                java.lang.String r11 = ","
                java.lang.String[] r9 = r9.split(r11, r10)
                int r10 = r9.length
                r11 = 0
            L_0x0078:
                if (r11 >= r10) goto L_0x0051
                r12 = r9[r11]
                java.lang.String r12 = r12.trim()
                boolean r13 = r12.isEmpty()
                if (r13 == 0) goto L_0x0087
                goto L_0x0090
            L_0x0087:
                r13 = 8
                java.lang.String r13 = r8.substring(r13)
                r6.put(r12, r13)
            L_0x0090:
                int r11 = r11 + 1
                goto L_0x0078
            L_0x0093:
                r2 = r6
            L_0x0094:
                r14.f23830b = r2
            L_0x0096:
                java.util.Map<java.lang.String, java.lang.String> r2 = r14.f23830b
                java.lang.Object r15 = r2.get(r15)
                java.lang.String r15 = (java.lang.String) r15
                if (r15 != 0) goto L_0x00a1
                return r3
            L_0x00a1:
                r2 = 1
                java.lang.Class r6 = java.lang.Class.forName(r15)     // Catch:{ ClassNotFoundException -> 0x00ef, IllegalAccessException -> 0x00e2, InstantiationException -> 0x00d5, NoSuchMethodException -> 0x00c8, InvocationTargetException -> 0x00bb }
                java.lang.Class<p4.c> r7 = p4.c.class
                java.lang.Class r6 = r6.asSubclass(r7)     // Catch:{ ClassNotFoundException -> 0x00ef, IllegalAccessException -> 0x00e2, InstantiationException -> 0x00d5, NoSuchMethodException -> 0x00c8, InvocationTargetException -> 0x00bb }
                java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x00ef, IllegalAccessException -> 0x00e2, InstantiationException -> 0x00d5, NoSuchMethodException -> 0x00c8, InvocationTargetException -> 0x00bb }
                java.lang.reflect.Constructor r6 = r6.getDeclaredConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x00ef, IllegalAccessException -> 0x00e2, InstantiationException -> 0x00d5, NoSuchMethodException -> 0x00c8, InvocationTargetException -> 0x00bb }
                java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x00ef, IllegalAccessException -> 0x00e2, InstantiationException -> 0x00d5, NoSuchMethodException -> 0x00c8, InvocationTargetException -> 0x00bb }
                java.lang.Object r6 = r6.newInstance(r7)     // Catch:{ ClassNotFoundException -> 0x00ef, IllegalAccessException -> 0x00e2, InstantiationException -> 0x00d5, NoSuchMethodException -> 0x00c8, InvocationTargetException -> 0x00bb }
                p4.c r6 = (p4.c) r6     // Catch:{ ClassNotFoundException -> 0x00ef, IllegalAccessException -> 0x00e2, InstantiationException -> 0x00d5, NoSuchMethodException -> 0x00c8, InvocationTargetException -> 0x00bb }
                return r6
            L_0x00bb:
                r1 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r5] = r15
                java.lang.String r15 = java.lang.String.format(r0, r2)
                android.util.Log.w(r4, r15, r1)
                goto L_0x00fd
            L_0x00c8:
                r1 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r5] = r15
                java.lang.String r15 = java.lang.String.format(r0, r2)
                android.util.Log.w(r4, r15, r1)
                goto L_0x00fd
            L_0x00d5:
                r0 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r5] = r15
                java.lang.String r15 = java.lang.String.format(r1, r2)
                android.util.Log.w(r4, r15, r0)
                goto L_0x00fd
            L_0x00e2:
                r0 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r5] = r15
                java.lang.String r15 = java.lang.String.format(r1, r2)
                android.util.Log.w(r4, r15, r0)
                goto L_0x00fd
            L_0x00ef:
                r0 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r1[r5] = r15
                java.lang.String r15 = "Class %s is not found."
                java.lang.String r15 = java.lang.String.format(r15, r1)
                android.util.Log.w(r4, r15, r0)
            L_0x00fd:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p4.g.a.a(java.lang.String):p4.c");
        }
    }

    public g(Context context, e eVar) {
        a aVar = new a(context);
        this.f23826a = aVar;
        this.f23827b = eVar;
    }

    public synchronized h a(String str) {
        if (this.f23828c.containsKey(str)) {
            return this.f23828c.get(str);
        }
        c a10 = this.f23826a.a(str);
        if (a10 == null) {
            return null;
        }
        e eVar = this.f23827b;
        h create = a10.create(new b(eVar.f23819a, eVar.f23820b, eVar.f23821c, str));
        this.f23828c.put(str, create);
        return create;
    }
}

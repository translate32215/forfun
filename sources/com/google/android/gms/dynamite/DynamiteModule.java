package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.util.DynamiteApi;
import d8.c;
import d8.d;
import java.lang.reflect.Field;
import javax.annotation.concurrent.GuardedBy;
import s7.e;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class DynamiteModule {

    /* renamed from: b  reason: collision with root package name */
    public static final b f5902b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final b f5903c = new d();

    /* renamed from: d  reason: collision with root package name */
    public static final b f5904d = new e();
    @GuardedBy("DynamiteModule.class")

    /* renamed from: e  reason: collision with root package name */
    public static Boolean f5905e = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: f  reason: collision with root package name */
    public static String f5906f = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: g  reason: collision with root package name */
    public static boolean f5907g = false;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: h  reason: collision with root package name */
    public static int f5908h = -1;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: i  reason: collision with root package name */
    public static Boolean f5909i;

    /* renamed from: j  reason: collision with root package name */
    public static final ThreadLocal f5910j = new ThreadLocal();

    /* renamed from: k  reason: collision with root package name */
    public static final ThreadLocal f5911k = new c();

    /* renamed from: l  reason: collision with root package name */
    public static final b.a f5912l = new b();
    @GuardedBy("DynamiteModule.class")

    /* renamed from: m  reason: collision with root package name */
    public static g f5913m;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: n  reason: collision with root package name */
    public static h f5914n;

    /* renamed from: a  reason: collision with root package name */
    public final Context f5915a;

    @DynamiteApi
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static class DynamiteLoaderClassLoader {
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static class a extends Exception {
        public /* synthetic */ a(String str) {
            super(str);
        }

        public /* synthetic */ a(String str, Throwable th) {
            super(str, th);
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface b {

        /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
        public interface a {
            int a(Context context, String str);

            int b(Context context, String str, boolean z10) throws a;
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
        public static class C0084b {

            /* renamed from: a  reason: collision with root package name */
            public int f5916a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f5917b = 0;

            /* renamed from: c  reason: collision with root package name */
            public int f5918c = 0;
        }

        C0084b a(Context context, String str, a aVar) throws a;
    }

    public DynamiteModule(Context context) {
        if (context != null) {
            this.f5915a = context;
            return;
        }
        throw new NullPointerException("null reference");
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (h.a(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            Log.e("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    public static int b(Context context, String str) {
        return e(context, str, false);
    }

    public static DynamiteModule d(Context context, b bVar, String str) throws a {
        int i10;
        Boolean bool;
        DynamiteModule dynamiteModule;
        c8.a aVar;
        h hVar;
        Boolean valueOf;
        c8.a aVar2;
        Context context2 = context;
        b bVar2 = bVar;
        String str2 = str;
        Class<DynamiteModule> cls = DynamiteModule.class;
        ThreadLocal threadLocal = f5910j;
        d dVar = (d) threadLocal.get();
        d dVar2 = new d((e.a) null);
        threadLocal.set(dVar2);
        ThreadLocal threadLocal2 = f5911k;
        long longValue = ((Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            b.C0084b a10 = bVar2.a(context2, str2, f5912l);
            int i11 = a10.f5916a;
            int i12 = a10.f5917b;
            Log.i("DynamiteModule", "Considering local module " + str2 + ":" + i11 + " and remote module " + str2 + ":" + i12);
            int i13 = a10.f5918c;
            if (i13 != 0) {
                if (i13 == -1) {
                    if (a10.f5916a != 0) {
                        i13 = -1;
                    }
                }
                if (!(i13 == 1 && a10.f5917b == 0)) {
                    if (i13 == -1) {
                        DynamiteModule g10 = g(context2, str2);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(longValue));
                        }
                        Cursor cursor = dVar2.f13217a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(dVar);
                        return g10;
                    } else if (i13 == 1) {
                        try {
                            int i14 = a10.f5917b;
                            try {
                                synchronized (cls) {
                                    if (j(context)) {
                                        bool = f5905e;
                                    } else {
                                        throw new a("Remote loading disabled");
                                    }
                                }
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        Log.i("DynamiteModule", "Selected remote version of " + str2 + ", version >= " + i14);
                                        synchronized (cls) {
                                            hVar = f5914n;
                                        }
                                        if (hVar != null) {
                                            d dVar3 = (d) threadLocal.get();
                                            if (dVar3 == null || dVar3.f13217a == null) {
                                                throw new a("No result cursor");
                                            }
                                            Context applicationContext = context.getApplicationContext();
                                            Cursor cursor2 = dVar3.f13217a;
                                            new c8.b((Object) null);
                                            synchronized (cls) {
                                                valueOf = Boolean.valueOf(f5908h >= 2);
                                            }
                                            if (valueOf.booleanValue()) {
                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                aVar2 = hVar.E1(new c8.b(applicationContext), str2, i14, new c8.b(cursor2));
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                aVar2 = hVar.z0(new c8.b(applicationContext), str2, i14, new c8.b(cursor2));
                                            }
                                            Context context3 = (Context) c8.b.z0(aVar2);
                                            if (context3 != null) {
                                                dynamiteModule = new DynamiteModule(context3);
                                            } else {
                                                throw new a("Failed to get module context");
                                            }
                                        } else {
                                            throw new a("DynamiteLoaderV2 was not cached.");
                                        }
                                    } else {
                                        Log.i("DynamiteModule", "Selected remote version of " + str2 + ", version >= " + i14);
                                        g k10 = k(context);
                                        if (k10 != null) {
                                            Parcel m10 = k10.m(6, k10.Y());
                                            int readInt = m10.readInt();
                                            m10.recycle();
                                            if (readInt >= 3) {
                                                d dVar4 = (d) threadLocal.get();
                                                if (dVar4 != null) {
                                                    aVar = k10.E1(new c8.b(context2), str2, i14, new c8.b(dVar4.f13217a));
                                                } else {
                                                    throw new a("No cached result cursor holder");
                                                }
                                            } else if (readInt == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                aVar = k10.G1(new c8.b(context2), str2, i14);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                aVar = k10.z0(new c8.b(context2), str2, i14);
                                            }
                                            Object z02 = c8.b.z0(aVar);
                                            if (z02 != null) {
                                                dynamiteModule = new DynamiteModule((Context) z02);
                                            } else {
                                                throw new a("Failed to load remote module.");
                                            }
                                        } else {
                                            throw new a("Failed to create IDynamiteLoader.");
                                        }
                                    }
                                    if (longValue == 0) {
                                        threadLocal2.remove();
                                    } else {
                                        threadLocal2.set(Long.valueOf(longValue));
                                    }
                                    Cursor cursor3 = dVar2.f13217a;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    threadLocal.set(dVar);
                                    return dynamiteModule;
                                }
                                throw new a("Failed to determine which loading route to use.");
                            } catch (RemoteException e10) {
                                throw new a("Failed to load remote module.", e10);
                            } catch (a e11) {
                                throw e11;
                            } catch (Throwable th) {
                                z7.d.a(context2, th);
                                throw new a("Failed to load remote module.", th);
                            }
                        } catch (a e12) {
                            String message = e12.getMessage();
                            Log.w("DynamiteModule", "Failed to load remote module: " + message);
                            int i15 = a10.f5916a;
                            if (i15 != 0) {
                                if (bVar.a(context2, str2, new f(i15)).f5918c == -1) {
                                    DynamiteModule g11 = g(context2, str2);
                                    if (i10 != 0) {
                                        f5911k.set(Long.valueOf(longValue));
                                    }
                                    return g11;
                                }
                            }
                            throw new a("Remote load failed. No local fallback found.", e12);
                        }
                    } else {
                        throw new a("VersionPolicy returned invalid code:" + i13);
                    }
                }
            }
            int i16 = a10.f5916a;
            int i17 = a10.f5917b;
            throw new a("No acceptable module " + str2 + " found. Local version is " + i16 + " and remote version is " + i17 + ".");
        } finally {
            if (longValue == 0) {
                f5911k.remove();
            } else {
                f5911k.set(Long.valueOf(longValue));
            }
            Cursor cursor4 = dVar2.f13217a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f5910j.set(dVar);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x0056=Splitter:B:31:0x0056, B:50:0x009a=Splitter:B:50:0x009a, B:17:0x003b=Splitter:B:17:0x003b} */
    public static int e(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x01fb }
            java.lang.Boolean r1 = f5905e     // Catch:{ all -> 0x01f8 }
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x00d8
            android.content.Context r1 = r10.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r4 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r4 = r4.getName()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Class r1 = r1.loadClass(r4)     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.String r4 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r4)     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Class r4 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            monitor-enter(r4)     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Object r5 = r1.get(r2)     // Catch:{ all -> 0x00b2 }
            java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5     // Catch:{ all -> 0x00b2 }
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b2 }
            if (r5 != r6) goto L_0x0036
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b2 }
            goto L_0x00b0
        L_0x0036:
            if (r5 == 0) goto L_0x003f
            h(r5)     // Catch:{ a -> 0x003b }
        L_0x003b:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00b2 }
            goto L_0x00b0
        L_0x003f:
            boolean r5 = j(r10)     // Catch:{ all -> 0x00b2 }
            if (r5 != 0) goto L_0x0048
            monitor-exit(r4)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r0)     // Catch:{ all -> 0x01f8 }
            return r3
        L_0x0048:
            boolean r5 = f5907g     // Catch:{ all -> 0x00b2 }
            if (r5 != 0) goto L_0x00a7
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00b2 }
            boolean r6 = r5.equals(r2)     // Catch:{ all -> 0x00b2 }
            if (r6 == 0) goto L_0x0055
            goto L_0x00a7
        L_0x0055:
            r6 = 1
            int r6 = f(r10, r11, r12, r6)     // Catch:{ a -> 0x009d }
            java.lang.String r7 = f5906f     // Catch:{ a -> 0x009d }
            if (r7 == 0) goto L_0x009a
            boolean r7 = r7.isEmpty()     // Catch:{ a -> 0x009d }
            if (r7 == 0) goto L_0x0065
            goto L_0x009a
        L_0x0065:
            java.lang.ClassLoader r7 = d8.b.a()     // Catch:{ a -> 0x009d }
            if (r7 == 0) goto L_0x006c
            goto L_0x008f
        L_0x006c:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ a -> 0x009d }
            r8 = 29
            if (r7 < r8) goto L_0x0081
            dalvik.system.DelegateLastClassLoader r7 = new dalvik.system.DelegateLastClassLoader     // Catch:{ a -> 0x009d }
            java.lang.String r8 = f5906f     // Catch:{ a -> 0x009d }
            com.google.android.gms.common.internal.i.h(r8)     // Catch:{ a -> 0x009d }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x009d }
            r7.<init>(r8, r9)     // Catch:{ a -> 0x009d }
            goto L_0x008f
        L_0x0081:
            com.google.android.gms.dynamite.a r7 = new com.google.android.gms.dynamite.a     // Catch:{ a -> 0x009d }
            java.lang.String r8 = f5906f     // Catch:{ a -> 0x009d }
            com.google.android.gms.common.internal.i.h(r8)     // Catch:{ a -> 0x009d }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x009d }
            r7.<init>(r8, r9)     // Catch:{ a -> 0x009d }
        L_0x008f:
            h(r7)     // Catch:{ a -> 0x009d }
            r1.set(r2, r7)     // Catch:{ a -> 0x009d }
            f5905e = r5     // Catch:{ a -> 0x009d }
            monitor-exit(r4)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r0)     // Catch:{ all -> 0x01f8 }
            return r6
        L_0x009a:
            monitor-exit(r4)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r0)     // Catch:{ all -> 0x01f8 }
            return r6
        L_0x009d:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b2 }
            r1.set(r2, r5)     // Catch:{ all -> 0x00b2 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b2 }
            goto L_0x00b0
        L_0x00a7:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b2 }
            r1.set(r2, r5)     // Catch:{ all -> 0x00b2 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b2 }
        L_0x00b0:
            monitor-exit(r4)     // Catch:{ all -> 0x00b2 }
            goto L_0x00d6
        L_0x00b2:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00b2 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
        L_0x00b5:
            r1 = move-exception
            goto L_0x00ba
        L_0x00b7:
            r1 = move-exception
            goto L_0x00ba
        L_0x00b9:
            r1 = move-exception
        L_0x00ba:
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01f8 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f8 }
            r4.<init>()     // Catch:{ all -> 0x01f8 }
            java.lang.String r5 = "Failed to load module via V2: "
            r4.append(r5)     // Catch:{ all -> 0x01f8 }
            r4.append(r1)     // Catch:{ all -> 0x01f8 }
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01f8 }
            android.util.Log.w(r1, r4)     // Catch:{ all -> 0x01f8 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01f8 }
        L_0x00d6:
            f5905e = r1     // Catch:{ all -> 0x01f8 }
        L_0x00d8:
            monitor-exit(r0)     // Catch:{ all -> 0x01f8 }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x01fb }
            if (r0 == 0) goto L_0x0100
            int r10 = f(r10, r11, r12, r3)     // Catch:{ a -> 0x00e4 }
            return r10
        L_0x00e4:
            r11 = move-exception
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x01fb }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fb }
            r12.<init>()     // Catch:{ all -> 0x01fb }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            r12.append(r0)     // Catch:{ all -> 0x01fb }
            r12.append(r11)     // Catch:{ all -> 0x01fb }
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x01fb }
            android.util.Log.w(r11, r12)     // Catch:{ all -> 0x01fb }
            return r3
        L_0x0100:
            com.google.android.gms.dynamite.g r4 = k(r10)     // Catch:{ all -> 0x01fb }
            if (r4 != 0) goto L_0x0108
            goto L_0x01ef
        L_0x0108:
            android.os.Parcel r0 = r4.Y()     // Catch:{ RemoteException -> 0x01ce }
            r1 = 6
            android.os.Parcel r0 = r4.m(r1, r0)     // Catch:{ RemoteException -> 0x01ce }
            int r1 = r0.readInt()     // Catch:{ RemoteException -> 0x01ce }
            r0.recycle()     // Catch:{ RemoteException -> 0x01ce }
            r0 = 3
            if (r1 < r0) goto L_0x017d
            java.lang.ThreadLocal r0 = f5910j     // Catch:{ RemoteException -> 0x01ce }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x01ce }
            d8.d r0 = (d8.d) r0     // Catch:{ RemoteException -> 0x01ce }
            if (r0 == 0) goto L_0x012f
            android.database.Cursor r0 = r0.f13217a     // Catch:{ RemoteException -> 0x01ce }
            if (r0 == 0) goto L_0x012f
            int r3 = r0.getInt(r3)     // Catch:{ RemoteException -> 0x01ce }
            goto L_0x01ef
        L_0x012f:
            c8.b r5 = new c8.b     // Catch:{ RemoteException -> 0x01ce }
            r5.<init>(r10)     // Catch:{ RemoteException -> 0x01ce }
            java.lang.ThreadLocal r0 = f5911k     // Catch:{ RemoteException -> 0x01ce }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x01ce }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x01ce }
            long r8 = r0.longValue()     // Catch:{ RemoteException -> 0x01ce }
            r6 = r11
            r7 = r12
            c8.a r11 = r4.H1(r5, r6, r7, r8)     // Catch:{ RemoteException -> 0x01ce }
            java.lang.Object r11 = c8.b.z0(r11)     // Catch:{ RemoteException -> 0x01ce }
            android.database.Cursor r11 = (android.database.Cursor) r11     // Catch:{ RemoteException -> 0x01ce }
            if (r11 == 0) goto L_0x0169
            boolean r12 = r11.moveToFirst()     // Catch:{ RemoteException -> 0x017a, all -> 0x0177 }
            if (r12 != 0) goto L_0x0155
            goto L_0x0169
        L_0x0155:
            int r12 = r11.getInt(r3)     // Catch:{ RemoteException -> 0x017a, all -> 0x0177 }
            if (r12 <= 0) goto L_0x0162
            boolean r0 = i(r11)     // Catch:{ RemoteException -> 0x017a, all -> 0x0177 }
            if (r0 == 0) goto L_0x0162
            goto L_0x0163
        L_0x0162:
            r2 = r11
        L_0x0163:
            if (r2 == 0) goto L_0x01ca
            r2.close()     // Catch:{ all -> 0x01fb }
            goto L_0x01ca
        L_0x0169:
            java.lang.String r12 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r12, r0)     // Catch:{ RemoteException -> 0x017a, all -> 0x0177 }
            if (r11 == 0) goto L_0x01ef
            r11.close()     // Catch:{ all -> 0x01fb }
            goto L_0x01ef
        L_0x0177:
            r12 = move-exception
            goto L_0x01f2
        L_0x017a:
            r12 = move-exception
            r2 = r11
            goto L_0x01d0
        L_0x017d:
            r5 = 2
            if (r1 != r5) goto L_0x01a6
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r1 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r0, r1)     // Catch:{ RemoteException -> 0x01ce }
            c8.b r0 = new c8.b     // Catch:{ RemoteException -> 0x01ce }
            r0.<init>(r10)     // Catch:{ RemoteException -> 0x01ce }
            android.os.Parcel r1 = r4.Y()     // Catch:{ RemoteException -> 0x01ce }
            i8.c.d(r1, r0)     // Catch:{ RemoteException -> 0x01ce }
            r1.writeString(r11)     // Catch:{ RemoteException -> 0x01ce }
            r1.writeInt(r12)     // Catch:{ RemoteException -> 0x01ce }
            r11 = 5
            android.os.Parcel r11 = r4.m(r11, r1)     // Catch:{ RemoteException -> 0x01ce }
            int r12 = r11.readInt()     // Catch:{ RemoteException -> 0x01ce }
            r11.recycle()     // Catch:{ RemoteException -> 0x01ce }
            goto L_0x01ca
        L_0x01a6:
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r5 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r1, r5)     // Catch:{ RemoteException -> 0x01ce }
            c8.b r1 = new c8.b     // Catch:{ RemoteException -> 0x01ce }
            r1.<init>(r10)     // Catch:{ RemoteException -> 0x01ce }
            android.os.Parcel r5 = r4.Y()     // Catch:{ RemoteException -> 0x01ce }
            i8.c.d(r5, r1)     // Catch:{ RemoteException -> 0x01ce }
            r5.writeString(r11)     // Catch:{ RemoteException -> 0x01ce }
            r5.writeInt(r12)     // Catch:{ RemoteException -> 0x01ce }
            android.os.Parcel r11 = r4.m(r0, r5)     // Catch:{ RemoteException -> 0x01ce }
            int r12 = r11.readInt()     // Catch:{ RemoteException -> 0x01ce }
            r11.recycle()     // Catch:{ RemoteException -> 0x01ce }
        L_0x01ca:
            r3 = r12
            goto L_0x01ef
        L_0x01cc:
            r11 = move-exception
            goto L_0x01f0
        L_0x01ce:
            r11 = move-exception
            r12 = r11
        L_0x01d0:
            java.lang.String r11 = r12.getMessage()     // Catch:{ all -> 0x01cc }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cc }
            r12.<init>()     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            r12.append(r0)     // Catch:{ all -> 0x01cc }
            r12.append(r11)     // Catch:{ all -> 0x01cc }
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x01cc }
            android.util.Log.w(r11, r12)     // Catch:{ all -> 0x01cc }
            if (r2 == 0) goto L_0x01ef
            r2.close()     // Catch:{ all -> 0x01fb }
        L_0x01ef:
            return r3
        L_0x01f0:
            r12 = r11
            r11 = r2
        L_0x01f2:
            if (r11 == 0) goto L_0x01f7
            r11.close()     // Catch:{ all -> 0x01fb }
        L_0x01f7:
            throw r12     // Catch:{ all -> 0x01fb }
        L_0x01f8:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01f8 }
            throw r11     // Catch:{ all -> 0x01fb }
        L_0x01fb:
            r11 = move-exception
            z7.d.a(r10, r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        if (i(r10) != false) goto L_0x008e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int f(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) throws com.google.android.gms.dynamite.DynamiteModule.a {
        /*
            r0 = 0
            java.lang.ThreadLocal r1 = f5911k     // Catch:{ Exception -> 0x009d }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x009d }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x009d }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x009d }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x009d }
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L_0x0019
            r10 = r4
        L_0x0019:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x009d }
            r12.<init>()     // Catch:{ Exception -> 0x009d }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch:{ Exception -> 0x009d }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch:{ Exception -> 0x009d }
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch:{ Exception -> 0x009d }
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch:{ Exception -> 0x009d }
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x009d }
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch:{ Exception -> 0x009d }
            android.net.Uri r4 = r10.build()     // Catch:{ Exception -> 0x009d }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x009d }
            if (r10 == 0) goto L_0x00a5
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            if (r11 == 0) goto L_0x00a5
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            if (r12 <= 0) goto L_0x008d
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch:{ all -> 0x008a }
            f5906f = r2     // Catch:{ all -> 0x008a }
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008a }
            if (r2 < 0) goto L_0x006f
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008a }
            f5908h = r2     // Catch:{ all -> 0x008a }
        L_0x006f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader2"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008a }
            if (r2 < 0) goto L_0x0082
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008a }
            if (r2 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r9 = 0
        L_0x007f:
            f5907g = r9     // Catch:{ all -> 0x008a }
            r11 = r9
        L_0x0082:
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            boolean r1 = i(r10)     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            if (r1 == 0) goto L_0x008d
            goto L_0x008e
        L_0x008a:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            throw r11     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
        L_0x008d:
            r0 = r10
        L_0x008e:
            if (r13 == 0) goto L_0x009f
            if (r11 != 0) goto L_0x0093
            goto L_0x009f
        L_0x0093:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x009d }
            java.lang.String r11 = "forcing fallback to container DynamiteLoader impl"
            r10.<init>(r11)     // Catch:{ Exception -> 0x009d }
            throw r10     // Catch:{ Exception -> 0x009d }
        L_0x009b:
            r10 = move-exception
            goto L_0x00c9
        L_0x009d:
            r10 = move-exception
            goto L_0x00bb
        L_0x009f:
            if (r0 == 0) goto L_0x00a4
            r0.close()
        L_0x00a4:
            return r12
        L_0x00a5:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12)     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            throw r11     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
        L_0x00b4:
            r11 = move-exception
            r0 = r10
            r10 = r11
            goto L_0x00c9
        L_0x00b8:
            r11 = move-exception
            r0 = r10
            r10 = r11
        L_0x00bb:
            boolean r11 = r10 instanceof com.google.android.gms.dynamite.DynamiteModule.a     // Catch:{ all -> 0x009b }
            if (r11 == 0) goto L_0x00c1
            throw r10     // Catch:{ all -> 0x009b }
        L_0x00c1:
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x009b }
            java.lang.String r12 = "V2 version check failed"
            r11.<init>(r12, r10)     // Catch:{ all -> 0x009b }
            throw r11     // Catch:{ all -> 0x009b }
        L_0x00c9:
            if (r0 == 0) goto L_0x00ce
            r0.close()
        L_0x00ce:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.f(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    public static DynamiteModule g(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context.getApplicationContext());
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @javax.annotation.concurrent.GuardedBy("DynamiteModule.class")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void h(java.lang.ClassLoader r2) throws com.google.android.gms.dynamite.DynamiteModule.a {
        /*
            java.lang.String r0 = "com.google.android.gms.dynamiteloader.DynamiteLoaderV2"
            java.lang.Class r2 = r2.loadClass(r0)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r1)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            java.lang.Object r2 = r2.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            if (r2 != 0) goto L_0x0019
            r2 = 0
            goto L_0x002d
        L_0x0019:
            java.lang.String r0 = "com.google.android.gms.dynamite.IDynamiteLoaderV2"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            boolean r1 = r0 instanceof com.google.android.gms.dynamite.h     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            if (r1 == 0) goto L_0x0027
            r2 = r0
            com.google.android.gms.dynamite.h r2 = (com.google.android.gms.dynamite.h) r2     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            goto L_0x002d
        L_0x0027:
            com.google.android.gms.dynamite.h r0 = new com.google.android.gms.dynamite.h     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            r0.<init>(r2)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            r2 = r0
        L_0x002d:
            f5914n = r2     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            return
        L_0x0030:
            r2 = move-exception
            goto L_0x0039
        L_0x0032:
            r2 = move-exception
            goto L_0x0039
        L_0x0034:
            r2 = move-exception
            goto L_0x0039
        L_0x0036:
            r2 = move-exception
            goto L_0x0039
        L_0x0038:
            r2 = move-exception
        L_0x0039:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a
            java.lang.String r1 = "Failed to instantiate dynamite loader"
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.h(java.lang.ClassLoader):void");
    }

    public static boolean i(Cursor cursor) {
        d dVar = (d) f5910j.get();
        if (dVar == null || dVar.f13217a != null) {
            return false;
        }
        dVar.f13217a = cursor;
        return true;
    }

    @GuardedBy("DynamiteModule.class")
    public static boolean j(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals((Object) null) || bool.equals(f5909i)) {
            return true;
        }
        boolean z10 = false;
        if (f5909i == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (e.f25013b.d(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z10 = true;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            f5909i = valueOf;
            z10 = valueOf.booleanValue();
            if (z10 && resolveContentProvider != null && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f5907g = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    public static g k(Context context) {
        g gVar;
        synchronized (DynamiteModule.class) {
            g gVar2 = f5913m;
            if (gVar2 != null) {
                return gVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    gVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    gVar = queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
                }
                if (gVar != null) {
                    f5913m = gVar;
                    return gVar;
                }
            } catch (Exception e10) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e10.getMessage());
            }
        }
        return null;
    }

    public IBinder c(String str) throws a {
        try {
            return (IBinder) this.f5915a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e10);
        }
    }
}

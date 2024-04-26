package n1;

import android.content.Context;
import android.support.v4.media.a;
import android.util.Log;
import androidx.activity.result.d;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import t.f;

/* compiled from: MultiDex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<File> f21818a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f21819b;

    static {
        String property = System.getProperty("java.vm.version");
        boolean z10 = false;
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ".");
            String str = null;
            String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreTokens()) {
                str = stringTokenizer.nextToken();
            }
            if (!(nextToken == null || str == null)) {
                try {
                    int parseInt = Integer.parseInt(nextToken);
                    int parseInt2 = Integer.parseInt(str);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z10 = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder a10 = f.a("VM with version ", property);
        a10.append(z10 ? " has multidex support" : " does not have multidex support");
        Log.i("MultiDex", a10.toString());
        f21819b = z10;
    }

    public static void a(Object obj, String str, Object[] objArr) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field d10 = d(obj, str);
        Object[] objArr2 = (Object[]) d10.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        d10.set(obj, objArr3);
    }

    public static void b(Context context) throws Exception {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            StringBuilder a10 = a.a("Clearing old secondary dex dir (");
            a10.append(file.getPath());
            a10.append(").");
            Log.i("MultiDex", a10.toString());
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                StringBuilder a11 = a.a("Failed to list secondary dex dir content (");
                a11.append(file.getPath());
                a11.append(").");
                Log.w("MultiDex", a11.toString());
                return;
            }
            for (File file2 : listFiles) {
                StringBuilder a12 = a.a("Trying to delete old file ");
                a12.append(file2.getPath());
                a12.append(" of size ");
                a12.append(file2.length());
                Log.i("MultiDex", a12.toString());
                if (!file2.delete()) {
                    StringBuilder a13 = a.a("Failed to delete old file ");
                    a13.append(file2.getPath());
                    Log.w("MultiDex", a13.toString());
                } else {
                    StringBuilder a14 = a.a("Deleted old file ");
                    a14.append(file2.getPath());
                    Log.i("MultiDex", a14.toString());
                }
            }
            if (!file.delete()) {
                StringBuilder a15 = a.a("Failed to delete secondary dex dir ");
                a15.append(file.getPath());
                Log.w("MultiDex", a15.toString());
                return;
            }
            StringBuilder a16 = a.a("Deleted old secondary dex dir ");
            a16.append(file.getPath());
            Log.i("MultiDex", a16.toString());
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0083 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x00c6 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a A[Catch:{ RuntimeException -> 0x0061 }, DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c A[SYNTHETIC, Splitter:B:25:0x006c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(android.content.Context r6, java.io.File r7, java.io.File r8, java.lang.String r9, java.lang.String r10, boolean r11) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.InstantiationException {
        /*
            java.util.Set<java.io.File> r0 = f21818a
            monitor-enter(r0)
            boolean r1 = r0.contains(r7)     // Catch:{ all -> 0x00c7 }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            return
        L_0x000b:
            r0.add(r7)     // Catch:{ all -> 0x00c7 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00c7 }
            r2 = 20
            if (r1 <= r2) goto L_0x004f
            java.lang.String r3 = "MultiDex"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c7 }
            r4.<init>()     // Catch:{ all -> 0x00c7 }
            java.lang.String r5 = "MultiDex is not guaranteed to work in SDK version "
            r4.append(r5)     // Catch:{ all -> 0x00c7 }
            r4.append(r1)     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = ": SDK version higher than "
            r4.append(r1)     // Catch:{ all -> 0x00c7 }
            r4.append(r2)     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = " should be backed by "
            r4.append(r1)     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = "runtime with built-in multidex capabilty but it's not the "
            r4.append(r1)     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = "case here: java.vm.version=\""
            r4.append(r1)     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = "java.vm.version"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch:{ all -> 0x00c7 }
            r4.append(r1)     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = "\""
            r4.append(r1)     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00c7 }
            android.util.Log.w(r3, r1)     // Catch:{ all -> 0x00c7 }
        L_0x004f:
            java.lang.String r1 = "MultiDex"
            r2 = 0
            java.lang.ClassLoader r3 = r6.getClassLoader()     // Catch:{ RuntimeException -> 0x0061 }
            boolean r4 = r3 instanceof dalvik.system.BaseDexClassLoader     // Catch:{ all -> 0x00c7 }
            if (r4 == 0) goto L_0x005b
            goto L_0x0068
        L_0x005b:
            java.lang.String r3 = "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching."
            android.util.Log.e(r1, r3)     // Catch:{ all -> 0x00c7 }
            goto L_0x0067
        L_0x0061:
            r3 = move-exception
            java.lang.String r4 = "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching."
            android.util.Log.w(r1, r4, r3)     // Catch:{ all -> 0x00c7 }
        L_0x0067:
            r3 = r2
        L_0x0068:
            if (r3 != 0) goto L_0x006c
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            return
        L_0x006c:
            b(r6)     // Catch:{ all -> 0x0070 }
            goto L_0x0078
        L_0x0070:
            r1 = move-exception
            java.lang.String r4 = "MultiDex"
            java.lang.String r5 = "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning."
            android.util.Log.w(r4, r5, r1)     // Catch:{ all -> 0x00c7 }
        L_0x0078:
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x00c7 }
            java.lang.String r4 = "code_cache"
            r1.<init>(r8, r4)     // Catch:{ all -> 0x00c7 }
            f(r1)     // Catch:{ IOException -> 0x0083 }
            goto L_0x008f
        L_0x0083:
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x00c7 }
            java.io.File r8 = r6.getFilesDir()     // Catch:{ all -> 0x00c7 }
            r1.<init>(r8, r4)     // Catch:{ all -> 0x00c7 }
            f(r1)     // Catch:{ all -> 0x00c7 }
        L_0x008f:
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x00c7 }
            r8.<init>(r1, r9)     // Catch:{ all -> 0x00c7 }
            f(r8)     // Catch:{ all -> 0x00c7 }
            n1.g r9 = new n1.g     // Catch:{ all -> 0x00c7 }
            r9.<init>(r7, r8)     // Catch:{ all -> 0x00c7 }
            r7 = 0
            java.util.List r7 = r9.s(r6, r10, r7)     // Catch:{ all -> 0x00c2 }
            e(r3, r8, r7)     // Catch:{ IOException -> 0x00a5 }
            goto L_0x00b7
        L_0x00a5:
            r7 = move-exception
            if (r11 == 0) goto L_0x00c1
            java.lang.String r11 = "MultiDex"
            java.lang.String r1 = "Failed to install extracted secondary dex files, retrying with forced extraction"
            android.util.Log.w(r11, r1, r7)     // Catch:{ all -> 0x00c2 }
            r7 = 1
            java.util.List r6 = r9.s(r6, r10, r7)     // Catch:{ all -> 0x00c2 }
            e(r3, r8, r6)     // Catch:{ all -> 0x00c2 }
        L_0x00b7:
            r9.close()     // Catch:{ IOException -> 0x00bb }
            goto L_0x00bc
        L_0x00bb:
            r2 = move-exception
        L_0x00bc:
            if (r2 != 0) goto L_0x00c0
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            return
        L_0x00c0:
            throw r2     // Catch:{ all -> 0x00c7 }
        L_0x00c1:
            throw r7     // Catch:{ all -> 0x00c2 }
        L_0x00c2:
            r6 = move-exception
            r9.close()     // Catch:{ IOException -> 0x00c6 }
        L_0x00c6:
            throw r6     // Catch:{ all -> 0x00c7 }
        L_0x00c7:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.e.c(android.content.Context, java.io.File, java.io.File, java.lang.String, java.lang.String, boolean):void");
    }

    public static Field d(Object obj, String str) throws NoSuchFieldException {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder a10 = d.a("Field ", str, " not found in ");
        a10.append(obj.getClass());
        throw new NoSuchFieldException(a10.toString());
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00fa */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e(java.lang.ClassLoader r12, java.io.File r13, java.util.List<? extends java.io.File> r14) throws java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.io.IOException, java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.InstantiationException {
        /*
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x0160
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            java.lang.String r2 = "MultiDex"
            java.lang.String r3 = "dexElements"
            java.lang.String r4 = "pathList"
            r5 = 0
            if (r0 < r1) goto L_0x00e6
            java.lang.reflect.Field r0 = d(r12, r4)
            java.lang.Object r12 = r0.get(r12)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r14)
            r14 = 3
            java.lang.Class[] r4 = new java.lang.Class[r14]
            java.lang.Class<java.util.ArrayList> r6 = java.util.ArrayList.class
            r4[r5] = r6
            java.lang.Class<java.io.File> r6 = java.io.File.class
            r7 = 1
            r4[r7] = r6
            java.lang.Class<java.util.ArrayList> r6 = java.util.ArrayList.class
            r8 = 2
            r4[r8] = r6
            java.lang.Class r6 = r12.getClass()
        L_0x003a:
            java.lang.String r9 = "makeDexElements"
            if (r6 == 0) goto L_0x00c1
            java.lang.reflect.Method r9 = r6.getDeclaredMethod(r9, r4)     // Catch:{ NoSuchMethodException -> 0x00bb }
            boolean r10 = r9.isAccessible()     // Catch:{ NoSuchMethodException -> 0x00bb }
            if (r10 != 0) goto L_0x004b
            r9.setAccessible(r7)     // Catch:{ NoSuchMethodException -> 0x00bb }
        L_0x004b:
            java.lang.Object[] r14 = new java.lang.Object[r14]
            r14[r5] = r1
            r14[r7] = r13
            r14[r8] = r0
            java.lang.Object r13 = r9.invoke(r12, r14)
            java.lang.Object[] r13 = (java.lang.Object[]) r13
            a(r12, r3, r13)
            int r13 = r0.size()
            if (r13 <= 0) goto L_0x0160
            java.util.Iterator r13 = r0.iterator()
        L_0x0066:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0078
            java.lang.Object r14 = r13.next()
            java.io.IOException r14 = (java.io.IOException) r14
            java.lang.String r1 = "Exception in makeDexElement"
            android.util.Log.w(r2, r1, r14)
            goto L_0x0066
        L_0x0078:
            java.lang.String r13 = "dexElementsSuppressedExceptions"
            java.lang.reflect.Field r13 = d(r12, r13)
            java.lang.Object r14 = r13.get(r12)
            java.io.IOException[] r14 = (java.io.IOException[]) r14
            if (r14 != 0) goto L_0x0093
            int r14 = r0.size()
            java.io.IOException[] r14 = new java.io.IOException[r14]
            java.lang.Object[] r14 = r0.toArray(r14)
            java.io.IOException[] r14 = (java.io.IOException[]) r14
            goto L_0x00a7
        L_0x0093:
            int r1 = r0.size()
            int r2 = r14.length
            int r1 = r1 + r2
            java.io.IOException[] r1 = new java.io.IOException[r1]
            r0.toArray(r1)
            int r2 = r0.size()
            int r3 = r14.length
            java.lang.System.arraycopy(r14, r5, r1, r2, r3)
            r14 = r1
        L_0x00a7:
            r13.set(r12, r14)
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "I/O exception during makeDexElement"
            r12.<init>(r13)
            java.lang.Object r13 = r0.get(r5)
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            r12.initCause(r13)
            throw r12
        L_0x00bb:
            java.lang.Class r6 = r6.getSuperclass()
            goto L_0x003a
        L_0x00c1:
            java.lang.NoSuchMethodException r13 = new java.lang.NoSuchMethodException
            java.lang.String r14 = "Method "
            java.lang.String r0 = " with parameters "
            java.lang.StringBuilder r14 = androidx.activity.result.d.a(r14, r9, r0)
            java.util.List r0 = java.util.Arrays.asList(r4)
            r14.append(r0)
            java.lang.String r0 = " not found in "
            r14.append(r0)
            java.lang.Class r12 = r12.getClass()
            r14.append(r12)
            java.lang.String r12 = r14.toString()
            r13.<init>(r12)
            throw r13
        L_0x00e6:
            java.lang.reflect.Field r13 = d(r12, r4)
            java.lang.Object r12 = r13.get(r12)
            java.lang.String r13 = "dalvik.system.DexPathList$Element"
            java.lang.Class r13 = java.lang.Class.forName(r13)
            n1.b r0 = new n1.b     // Catch:{ NoSuchMethodException -> 0x00fa }
            r0.<init>(r13)     // Catch:{ NoSuchMethodException -> 0x00fa }
            goto L_0x0105
        L_0x00fa:
            n1.c r0 = new n1.c     // Catch:{ NoSuchMethodException -> 0x0100 }
            r0.<init>(r13)     // Catch:{ NoSuchMethodException -> 0x0100 }
            goto L_0x0105
        L_0x0100:
            n1.d r0 = new n1.d
            r0.<init>(r13)
        L_0x0105:
            int r13 = r14.size()
            java.lang.Object[] r1 = new java.lang.Object[r13]
            r4 = 0
        L_0x010c:
            if (r4 >= r13) goto L_0x0151
            java.lang.Object r6 = r14.get(r4)
            java.io.File r6 = (java.io.File) r6
            java.lang.String r7 = r6.getPath()
            java.io.File r8 = r6.getParentFile()
            java.lang.String r9 = r6.getName()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            int r11 = r9.length()
            int r11 = r11 + -4
            java.lang.String r9 = r9.substring(r5, r11)
            r10.append(r9)
            java.lang.String r9 = ".dex"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            java.io.File r10 = new java.io.File
            r10.<init>(r8, r9)
            java.lang.String r8 = r10.getPath()
            dalvik.system.DexFile r7 = dalvik.system.DexFile.loadDex(r7, r8, r5)
            java.lang.Object r6 = r0.a(r6, r7)
            r1[r4] = r6
            int r4 = r4 + 1
            goto L_0x010c
        L_0x0151:
            a(r12, r3, r1)     // Catch:{ NoSuchFieldException -> 0x0155 }
            goto L_0x0160
        L_0x0155:
            r13 = move-exception
            java.lang.String r14 = "Failed find field 'dexElements' attempting 'pathElements'"
            android.util.Log.w(r2, r14, r13)
            java.lang.String r13 = "pathElements"
            a(r12, r13, r1)
        L_0x0160:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.e.e(java.lang.ClassLoader, java.io.File, java.util.List):void");
    }

    public static void f(File file) throws IOException {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                StringBuilder a10 = a.a("Failed to create dir ");
                a10.append(file.getPath());
                a10.append(". Parent file is null.");
                Log.e("MultiDex", a10.toString());
            } else {
                StringBuilder a11 = a.a("Failed to create dir ");
                a11.append(file.getPath());
                a11.append(". parent file is a dir ");
                a11.append(parentFile.isDirectory());
                a11.append(", a file ");
                a11.append(parentFile.isFile());
                a11.append(", exists ");
                a11.append(parentFile.exists());
                a11.append(", readable ");
                a11.append(parentFile.canRead());
                a11.append(", writable ");
                a11.append(parentFile.canWrite());
                Log.e("MultiDex", a11.toString());
            }
            StringBuilder a12 = a.a("Failed to create directory ");
            a12.append(file.getPath());
            throw new IOException(a12.toString());
        }
    }
}

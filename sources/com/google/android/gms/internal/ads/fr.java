package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.ConditionVariable;
import android.util.Log;
import android.util.Pair;
import b7.a;
import dalvik.system.DexClassLoader;
import e8.fb0;
import e8.ib0;
import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class fr {

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ int f6478r = 0;

    /* renamed from: a  reason: collision with root package name */
    public Context f6479a;

    /* renamed from: b  reason: collision with root package name */
    public ExecutorService f6480b;

    /* renamed from: c  reason: collision with root package name */
    public DexClassLoader f6481c;

    /* renamed from: d  reason: collision with root package name */
    public no f6482d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f6483e;

    /* renamed from: f  reason: collision with root package name */
    public volatile a f6484f = null;

    /* renamed from: g  reason: collision with root package name */
    public volatile boolean f6485g;

    /* renamed from: h  reason: collision with root package name */
    public Future f6486h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6487i;

    /* renamed from: j  reason: collision with root package name */
    public volatile ma f6488j;

    /* renamed from: k  reason: collision with root package name */
    public Future f6489k;

    /* renamed from: l  reason: collision with root package name */
    public pf f6490l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6491m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f6492n;

    /* renamed from: o  reason: collision with root package name */
    public Map<Pair<String, String>, hs> f6493o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f6494p;

    /* renamed from: q  reason: collision with root package name */
    public fb0 f6495q;

    public fr(Context context) {
        boolean z10 = false;
        this.f6485g = false;
        this.f6486h = null;
        this.f6488j = null;
        this.f6489k = null;
        this.f6491m = false;
        this.f6492n = false;
        this.f6494p = false;
        Context applicationContext = context.getApplicationContext();
        z10 = applicationContext != null ? true : z10;
        this.f6487i = z10;
        this.f6479a = z10 ? applicationContext : context;
        this.f6493o = new HashMap();
        if (this.f6495q == null) {
            this.f6495q = new fb0(this.f6479a);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|(1:4)|5|6|7|8|(1:10)(1:11)|12|(1:14)(1:15)|16|17|18|(1:20)(1:21)|(2:23|(1:25)(2:26|27))|28|29|30|(13:31|32|(2:34|(1:36)(2:37|38))|39|(1:41)|42|43|44|45|46|47|48|69)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004d */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c A[Catch:{ m70 -> 0x013a, eb0 -> 0x0141 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e A[Catch:{ m70 -> 0x013a, eb0 -> 0x0141 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0061 A[Catch:{ m70 -> 0x013a, eb0 -> 0x0141 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0091 A[Catch:{ all -> 0x0109, FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bc A[Catch:{ all -> 0x0109, FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.fr a(android.content.Context r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            java.lang.String r0 = "%s/%s.dex"
            com.google.android.gms.internal.ads.fr r1 = new com.google.android.gms.internal.ads.fr
            r1.<init>(r9)
            e8.hb0 r9 = new e8.hb0     // Catch:{ eb0 -> 0x0141 }
            r9.<init>()     // Catch:{ eb0 -> 0x0141 }
            java.util.concurrent.ExecutorService r9 = java.util.concurrent.Executors.newCachedThreadPool(r9)     // Catch:{ eb0 -> 0x0141 }
            r1.f6480b = r9     // Catch:{ eb0 -> 0x0141 }
            r1.f6485g = r12     // Catch:{ eb0 -> 0x0141 }
            if (r12 == 0) goto L_0x0023
            java.util.concurrent.ExecutorService r9 = r1.f6480b     // Catch:{ eb0 -> 0x0141 }
            e8.qz r12 = new e8.qz     // Catch:{ eb0 -> 0x0141 }
            r12.<init>((com.google.android.gms.internal.ads.fr) r1)     // Catch:{ eb0 -> 0x0141 }
            java.util.concurrent.Future r9 = r9.submit(r12)     // Catch:{ eb0 -> 0x0141 }
            r1.f6486h = r9     // Catch:{ eb0 -> 0x0141 }
        L_0x0023:
            java.util.concurrent.ExecutorService r9 = r1.f6480b     // Catch:{ eb0 -> 0x0141 }
            e8.s30 r12 = new e8.s30     // Catch:{ eb0 -> 0x0141 }
            r12.<init>((com.google.android.gms.internal.ads.fr) r1)     // Catch:{ eb0 -> 0x0141 }
            r9.execute(r12)     // Catch:{ eb0 -> 0x0141 }
            r9 = 0
            r12 = 1
            s7.e r2 = s7.e.f25013b     // Catch:{ all -> 0x004d }
            android.content.Context r3 = r1.f6479a     // Catch:{ all -> 0x004d }
            int r3 = r2.a(r3)     // Catch:{ all -> 0x004d }
            if (r3 <= 0) goto L_0x003b
            r3 = 1
            goto L_0x003c
        L_0x003b:
            r3 = 0
        L_0x003c:
            r1.f6491m = r3     // Catch:{ all -> 0x004d }
            android.content.Context r3 = r1.f6479a     // Catch:{ all -> 0x004d }
            int r4 = s7.e.f25012a     // Catch:{ all -> 0x004d }
            int r2 = r2.d(r3, r4)     // Catch:{ all -> 0x004d }
            if (r2 != 0) goto L_0x004a
            r2 = 1
            goto L_0x004b
        L_0x004a:
            r2 = 0
        L_0x004b:
            r1.f6492n = r2     // Catch:{ all -> 0x004d }
        L_0x004d:
            r1.c(r9, r12)     // Catch:{ eb0 -> 0x0141 }
            int r2 = e8.lb0.f15378a     // Catch:{ eb0 -> 0x0141 }
            android.os.Looper r2 = android.os.Looper.myLooper()     // Catch:{ eb0 -> 0x0141 }
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch:{ eb0 -> 0x0141 }
            if (r2 != r3) goto L_0x005e
            r2 = 1
            goto L_0x005f
        L_0x005e:
            r2 = 0
        L_0x005f:
            if (r2 == 0) goto L_0x007c
            e8.l<java.lang.Boolean> r2 = e8.t.f16670v1     // Catch:{ eb0 -> 0x0141 }
            e8.ti0 r3 = e8.ti0.f16763j     // Catch:{ eb0 -> 0x0141 }
            com.google.android.gms.internal.ads.e r3 = r3.f16769f     // Catch:{ eb0 -> 0x0141 }
            java.lang.Object r2 = r3.a(r2)     // Catch:{ eb0 -> 0x0141 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ eb0 -> 0x0141 }
            boolean r2 = r2.booleanValue()     // Catch:{ eb0 -> 0x0141 }
            if (r2 != 0) goto L_0x0074
            goto L_0x007c
        L_0x0074:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ eb0 -> 0x0141 }
            java.lang.String r10 = "Task Context initialization must not be called from the UI thread."
            r9.<init>(r10)     // Catch:{ eb0 -> 0x0141 }
            throw r9     // Catch:{ eb0 -> 0x0141 }
        L_0x007c:
            com.google.android.gms.internal.ads.no r2 = new com.google.android.gms.internal.ads.no     // Catch:{ eb0 -> 0x0141 }
            r2.<init>()     // Catch:{ eb0 -> 0x0141 }
            r1.f6482d = r2     // Catch:{ eb0 -> 0x0141 }
            byte[] r10 = r2.c(r10)     // Catch:{ m70 -> 0x013a }
            r1.f6483e = r10     // Catch:{ m70 -> 0x013a }
            android.content.Context r10 = r1.f6479a     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            java.io.File r10 = r10.getCacheDir()     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            if (r10 != 0) goto L_0x00a2
            android.content.Context r10 = r1.f6479a     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            java.lang.String r2 = "dex"
            java.io.File r10 = r10.getDir(r2, r9)     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            if (r10 == 0) goto L_0x009c
            goto L_0x00a2
        L_0x009c:
            e8.eb0 r9 = new e8.eb0     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            r9.<init>()     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            throw r9     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
        L_0x00a2:
            java.lang.String r2 = "1598581401714"
            java.io.File r3 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            java.lang.String r4 = "%s/%s.jar"
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            r6[r9] = r10     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            r6[r12] = r2     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            java.lang.String r4 = java.lang.String.format(r4, r6)     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            boolean r4 = r3.exists()     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            if (r4 != 0) goto L_0x00d3
            com.google.android.gms.internal.ads.no r4 = r1.f6482d     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            byte[] r6 = r1.f6483e     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            byte[] r11 = r4.b(r6, r11)     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            r3.createNewFile()     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            r4.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            int r6 = r11.length     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            r4.write(r11, r9, r6)     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            r4.close()     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
        L_0x00d3:
            r1.g(r10, r2)     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            dalvik.system.DexClassLoader r11 = new dalvik.system.DexClassLoader     // Catch:{ all -> 0x0109 }
            java.lang.String r4 = r3.getAbsolutePath()     // Catch:{ all -> 0x0109 }
            java.lang.String r6 = r10.getAbsolutePath()     // Catch:{ all -> 0x0109 }
            r7 = 0
            android.content.Context r8 = r1.f6479a     // Catch:{ all -> 0x0109 }
            java.lang.ClassLoader r8 = r8.getClassLoader()     // Catch:{ all -> 0x0109 }
            r11.<init>(r4, r6, r7, r8)     // Catch:{ all -> 0x0109 }
            r1.f6481c = r11     // Catch:{ all -> 0x0109 }
            i(r3)     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            r1.d(r10, r2)     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            r11[r9] = r10     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            r11[r12] = r2     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            java.lang.String r9 = java.lang.String.format(r0, r11)     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            f(r9)     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            com.google.android.gms.internal.ads.pf r9 = new com.google.android.gms.internal.ads.pf     // Catch:{ eb0 -> 0x0141 }
            r9.<init>(r1)     // Catch:{ eb0 -> 0x0141 }
            r1.f6490l = r9     // Catch:{ eb0 -> 0x0141 }
            r1.f6494p = r12     // Catch:{ eb0 -> 0x0141 }
            goto L_0x0141
        L_0x0109:
            r11 = move-exception
            i(r3)     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            r1.d(r10, r2)     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            r3[r9] = r10     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            r3[r12] = r2     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            java.lang.String r9 = java.lang.String.format(r0, r3)     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            f(r9)     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
            throw r11     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x012c, m70 -> 0x0125, NullPointerException -> 0x011e }
        L_0x011e:
            r9 = move-exception
            e8.eb0 r10 = new e8.eb0     // Catch:{ eb0 -> 0x0141 }
            r10.<init>(r9)     // Catch:{ eb0 -> 0x0141 }
            throw r10     // Catch:{ eb0 -> 0x0141 }
        L_0x0125:
            r9 = move-exception
            e8.eb0 r10 = new e8.eb0     // Catch:{ eb0 -> 0x0141 }
            r10.<init>(r9)     // Catch:{ eb0 -> 0x0141 }
            throw r10     // Catch:{ eb0 -> 0x0141 }
        L_0x012c:
            r9 = move-exception
            e8.eb0 r10 = new e8.eb0     // Catch:{ eb0 -> 0x0141 }
            r10.<init>(r9)     // Catch:{ eb0 -> 0x0141 }
            throw r10     // Catch:{ eb0 -> 0x0141 }
        L_0x0133:
            r9 = move-exception
            e8.eb0 r10 = new e8.eb0     // Catch:{ eb0 -> 0x0141 }
            r10.<init>(r9)     // Catch:{ eb0 -> 0x0141 }
            throw r10     // Catch:{ eb0 -> 0x0141 }
        L_0x013a:
            r9 = move-exception
            e8.eb0 r10 = new e8.eb0     // Catch:{ eb0 -> 0x0141 }
            r10.<init>(r9)     // Catch:{ eb0 -> 0x0141 }
            throw r10     // Catch:{ eb0 -> 0x0141 }
        L_0x0141:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fr.a(android.content.Context, java.lang.String, java.lang.String, boolean):com.google.android.gms.internal.ads.fr");
    }

    public static void f(String str) {
        i(new File(str));
    }

    public static void i(File file) {
        if (!file.exists()) {
            Log.d("fr", String.format("File %s not found. No need for deletion", new Object[]{file.getAbsolutePath()}));
            return;
        }
        file.delete();
    }

    public final Method b(String str, String str2) {
        hs hsVar = this.f6493o.get(new Pair(str, str2));
        if (hsVar == null) {
            return null;
        }
        if (hsVar.f6897d != null) {
            return hsVar.f6897d;
        }
        try {
            if (!hsVar.f6899f.await(2, TimeUnit.SECONDS)) {
                return null;
            }
            return hsVar.f6897d;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public final void c(int i10, boolean z10) {
        if (this.f6492n) {
            Future<?> submit = this.f6480b.submit(new ib0(this, i10, z10));
            if (i10 == 0) {
                this.f6489k = submit;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: type inference failed for: r10v7, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r10v8 */
    /* JADX WARNING: type inference failed for: r10v9, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r10v11 */
    /* JADX WARNING: type inference failed for: r10v12 */
    /* JADX WARNING: type inference failed for: r10v13 */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:22|23|24|25|26|27|28|30) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00bd */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d6 A[SYNTHETIC, Splitter:B:43:0x00d6] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00dd A[SYNTHETIC, Splitter:B:47:0x00dd] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e7 A[SYNTHETIC, Splitter:B:55:0x00e7] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ee A[SYNTHETIC, Splitter:B:59:0x00ee] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(java.io.File r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "test"
            java.io.File r1 = new java.io.File
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r10
            r5 = 1
            r3[r5] = r11
            java.lang.String r6 = "%s/%s.tmp"
            java.lang.String r3 = java.lang.String.format(r6, r3)
            r1.<init>(r3)
            boolean r3 = r1.exists()
            if (r3 == 0) goto L_0x001d
            return
        L_0x001d:
            java.io.File r3 = new java.io.File
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r10
            r2[r5] = r11
            java.lang.String r10 = "%s/%s.dex"
            java.lang.String r10 = java.lang.String.format(r10, r2)
            r3.<init>(r10)
            boolean r10 = r3.exists()
            if (r10 != 0) goto L_0x0035
            return
        L_0x0035:
            long r5 = r3.length()
            r7 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 > 0) goto L_0x0040
            return
        L_0x0040:
            int r10 = (int) r5
            byte[] r10 = new byte[r10]
            r2 = 0
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e4, all -> 0x00d1 }
            r5.<init>(r3)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e4, all -> 0x00d1 }
            int r6 = r5.read(r10)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00c9 }
            if (r6 > 0) goto L_0x0056
            r5.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            i(r3)
            return
        L_0x0056:
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00c9 }
            r6.print(r0)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00c9 }
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00c9 }
            r6.print(r0)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00c9 }
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00c9 }
            r6.print(r0)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00c9 }
            com.google.android.gms.internal.ads.oa$a r0 = com.google.android.gms.internal.ads.oa.F()     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00c9 }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00c9 }
            byte[] r6 = r6.getBytes()     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00c9 }
            com.google.android.gms.internal.ads.mp r6 = com.google.android.gms.internal.ads.mp.L(r6)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00c9 }
            r0.r(r6)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00c9 }
            byte[] r11 = r11.getBytes()     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00c9 }
            com.google.android.gms.internal.ads.mp r11 = com.google.android.gms.internal.ads.mp.L(r11)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00c9 }
            r0.q(r11)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00c9 }
            com.google.android.gms.internal.ads.no r11 = r9.f6482d     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00c9 }
            byte[] r6 = r9.f6483e     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00c9 }
            java.lang.String r10 = r11.d(r6, r10)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00c9 }
            byte[] r10 = r10.getBytes()     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00c9 }
            com.google.android.gms.internal.ads.mp r11 = com.google.android.gms.internal.ads.mp.L(r10)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00c9 }
            r0.o(r11)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00c9 }
            byte[] r10 = com.google.android.gms.internal.ads.cd.b(r10)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00c9 }
            com.google.android.gms.internal.ads.mp r10 = com.google.android.gms.internal.ads.mp.L(r10)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00c9 }
            r0.p(r10)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00c9 }
            r1.createNewFile()     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00c9 }
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00c9 }
            r10.<init>(r1)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00c9 }
            com.google.android.gms.internal.ads.cq r11 = r0.j()     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00c7, all -> 0x00c4 }
            com.google.android.gms.internal.ads.aq r11 = (com.google.android.gms.internal.ads.aq) r11     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00c7, all -> 0x00c4 }
            com.google.android.gms.internal.ads.oa r11 = (com.google.android.gms.internal.ads.oa) r11     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00c7, all -> 0x00c4 }
            byte[] r11 = r11.f()     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00c7, all -> 0x00c4 }
            int r0 = r11.length     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00c7, all -> 0x00c4 }
            r10.write(r11, r4, r0)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00c7, all -> 0x00c4 }
            r10.close()     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00c7, all -> 0x00c4 }
            r5.close()     // Catch:{ IOException -> 0x00bd }
        L_0x00bd:
            r10.close()     // Catch:{ IOException -> 0x00c0 }
        L_0x00c0:
            i(r3)
            return
        L_0x00c4:
            r11 = move-exception
            r2 = r10
            goto L_0x00cb
        L_0x00c7:
            r2 = r10
            goto L_0x00ce
        L_0x00c9:
            r10 = move-exception
            r11 = r10
        L_0x00cb:
            r10 = r2
            r2 = r5
            goto L_0x00d4
        L_0x00ce:
            r10 = r2
            r2 = r5
            goto L_0x00e5
        L_0x00d1:
            r10 = move-exception
            r11 = r10
            r10 = r2
        L_0x00d4:
            if (r2 == 0) goto L_0x00db
            r2.close()     // Catch:{ IOException -> 0x00da }
            goto L_0x00db
        L_0x00da:
        L_0x00db:
            if (r10 == 0) goto L_0x00e0
            r10.close()     // Catch:{ IOException -> 0x00e0 }
        L_0x00e0:
            i(r3)
            throw r11
        L_0x00e4:
            r10 = r2
        L_0x00e5:
            if (r2 == 0) goto L_0x00ec
            r2.close()     // Catch:{ IOException -> 0x00eb }
            goto L_0x00ec
        L_0x00eb:
        L_0x00ec:
            if (r10 == 0) goto L_0x00f1
            r10.close()     // Catch:{ IOException -> 0x00f1 }
        L_0x00f1:
            i(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fr.d(java.io.File, java.lang.String):void");
    }

    public final boolean e(String str, String str2, Class<?>... clsArr) {
        if (this.f6493o.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.f6493o.put(new Pair(str, str2), new hs(this, str, str2, clsArr));
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: type inference failed for: r11v1, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r11v3, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: type inference failed for: r11v6 */
    /* JADX WARNING: type inference failed for: r11v8 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00cc */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ea A[SYNTHETIC, Splitter:B:55:0x00ea] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f1 A[SYNTHETIC, Splitter:B:59:0x00f1] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f8 A[SYNTHETIC, Splitter:B:66:0x00f8] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ff A[SYNTHETIC, Splitter:B:70:0x00ff] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(java.io.File r10, java.lang.String r11) {
        /*
            r9 = this;
            java.io.File r0 = new java.io.File
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r10
            r4 = 1
            r2[r4] = r11
            java.lang.String r5 = "%s/%s.tmp"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 != 0) goto L_0x001b
            return r3
        L_0x001b:
            java.io.File r2 = new java.io.File
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r10
            r1[r4] = r11
            java.lang.String r10 = "%s/%s.dex"
            java.lang.String r10 = java.lang.String.format(r10, r1)
            r2.<init>(r10)
            boolean r10 = r2.exists()
            if (r10 == 0) goto L_0x0033
            return r3
        L_0x0033:
            r10 = 0
            long r5 = r0.length()     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00f5, all -> 0x00e5 }
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x0042
            i(r0)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00f5, all -> 0x00e5 }
            return r3
        L_0x0042:
            int r1 = (int) r5     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00f5, all -> 0x00e5 }
            byte[] r1 = new byte[r1]     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00f5, all -> 0x00e5 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00f5, all -> 0x00e5 }
            r5.<init>(r0)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00f5, all -> 0x00e5 }
            int r6 = r5.read(r1)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            if (r6 > 0) goto L_0x005e
            java.lang.String r11 = "fr"
            java.lang.String r1 = "Cannot read the cache data."
            android.util.Log.d(r11, r1)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            i(r0)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            r5.close()     // Catch:{ IOException -> 0x005d }
        L_0x005d:
            return r3
        L_0x005e:
            com.google.android.gms.internal.ads.up r6 = com.google.android.gms.internal.ads.up.b()     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            com.google.android.gms.internal.ads.oa r1 = com.google.android.gms.internal.ads.oa.z(r1, r6)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            java.lang.String r6 = new java.lang.String     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            com.google.android.gms.internal.ads.mp r7 = r1.D()     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            byte[] r7 = r7.c()     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            r6.<init>(r7)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            boolean r11 = r11.equals(r6)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            if (r11 == 0) goto L_0x00d6
            com.google.android.gms.internal.ads.mp r11 = r1.C()     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            byte[] r11 = r11.c()     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            com.google.android.gms.internal.ads.mp r6 = r1.B()     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            byte[] r6 = r6.c()     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            byte[] r6 = com.google.android.gms.internal.ads.cd.b(r6)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            boolean r11 = java.util.Arrays.equals(r11, r6)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            if (r11 == 0) goto L_0x00d6
            com.google.android.gms.internal.ads.mp r11 = r1.E()     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            byte[] r11 = r11.c()     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            byte[] r6 = r6.getBytes()     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            boolean r11 = java.util.Arrays.equals(r11, r6)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            if (r11 != 0) goto L_0x00a8
            goto L_0x00d6
        L_0x00a8:
            com.google.android.gms.internal.ads.no r11 = r9.f6482d     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            byte[] r0 = r9.f6483e     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            java.lang.String r6 = new java.lang.String     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            com.google.android.gms.internal.ads.mp r1 = r1.B()     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            byte[] r1 = r1.c()     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            r6.<init>(r1)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            byte[] r11 = r11.b(r0, r6)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            r2.createNewFile()     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            r0.<init>(r2)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            int r10 = r11.length     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00d4, all -> 0x00d0 }
            r0.write(r11, r3, r10)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00d4, all -> 0x00d0 }
            r5.close()     // Catch:{ IOException -> 0x00cc }
        L_0x00cc:
            r0.close()     // Catch:{ IOException -> 0x00cf }
        L_0x00cf:
            return r4
        L_0x00d0:
            r10 = move-exception
            r11 = r10
            r10 = r0
            goto L_0x00de
        L_0x00d4:
            r10 = r0
            goto L_0x00e2
        L_0x00d6:
            i(r0)     // Catch:{ m70 | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00dd }
            r5.close()     // Catch:{ IOException -> 0x00dc }
        L_0x00dc:
            return r3
        L_0x00dd:
            r11 = move-exception
        L_0x00de:
            r0 = r11
            r11 = r10
            r10 = r5
            goto L_0x00e8
        L_0x00e2:
            r11 = r10
            r10 = r5
            goto L_0x00f6
        L_0x00e5:
            r11 = move-exception
            r0 = r11
            r11 = r10
        L_0x00e8:
            if (r10 == 0) goto L_0x00ef
            r10.close()     // Catch:{ IOException -> 0x00ee }
            goto L_0x00ef
        L_0x00ee:
        L_0x00ef:
            if (r11 == 0) goto L_0x00f4
            r11.close()     // Catch:{ IOException -> 0x00f4 }
        L_0x00f4:
            throw r0
        L_0x00f5:
            r11 = r10
        L_0x00f6:
            if (r10 == 0) goto L_0x00fd
            r10.close()     // Catch:{ IOException -> 0x00fc }
            goto L_0x00fd
        L_0x00fc:
        L_0x00fd:
            if (r11 == 0) goto L_0x0102
            r11.close()     // Catch:{ IOException -> 0x0102 }
        L_0x0102:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fr.g(java.io.File, java.lang.String):boolean");
    }

    public final int h() {
        if (this.f6490l == null) {
            return Integer.MIN_VALUE;
        }
        ConditionVariable conditionVariable = pf.f7857c;
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return ThreadLocalRandom.current().nextInt();
            }
            return pf.b().nextInt();
        } catch (RuntimeException unused) {
            return pf.b().nextInt();
        }
    }
}

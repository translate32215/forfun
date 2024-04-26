package i3;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import j.f;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: DiskLruCache */
public final class a implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final File f19106a;

    /* renamed from: b  reason: collision with root package name */
    public final File f19107b;

    /* renamed from: c  reason: collision with root package name */
    public final File f19108c;

    /* renamed from: d  reason: collision with root package name */
    public final File f19109d;

    /* renamed from: e  reason: collision with root package name */
    public final int f19110e;

    /* renamed from: f  reason: collision with root package name */
    public long f19111f;

    /* renamed from: g  reason: collision with root package name */
    public final int f19112g;

    /* renamed from: h  reason: collision with root package name */
    public long f19113h = 0;

    /* renamed from: i  reason: collision with root package name */
    public Writer f19114i;

    /* renamed from: r  reason: collision with root package name */
    public final LinkedHashMap<String, d> f19115r = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: s  reason: collision with root package name */
    public int f19116s;

    /* renamed from: t  reason: collision with root package name */
    public long f19117t = 0;

    /* renamed from: u  reason: collision with root package name */
    public final ThreadPoolExecutor f19118u = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b((C0159a) null));

    /* renamed from: v  reason: collision with root package name */
    public final Callable<Void> f19119v = new C0159a();

    /* renamed from: i3.a$a  reason: collision with other inner class name */
    /* compiled from: DiskLruCache */
    public class C0159a implements Callable<Void> {
        public C0159a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call() throws java.lang.Exception {
            /*
                r3 = this;
                i3.a r0 = i3.a.this
                monitor-enter(r0)
                i3.a r1 = i3.a.this     // Catch:{ all -> 0x0023 }
                java.io.Writer r2 = r1.f19114i     // Catch:{ all -> 0x0023 }
                if (r2 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
                goto L_0x0021
            L_0x000b:
                r1.V()     // Catch:{ all -> 0x0023 }
                i3.a r1 = i3.a.this     // Catch:{ all -> 0x0023 }
                boolean r1 = r1.v()     // Catch:{ all -> 0x0023 }
                if (r1 == 0) goto L_0x0020
                i3.a r1 = i3.a.this     // Catch:{ all -> 0x0023 }
                r1.N()     // Catch:{ all -> 0x0023 }
                i3.a r1 = i3.a.this     // Catch:{ all -> 0x0023 }
                r2 = 0
                r1.f19116s = r2     // Catch:{ all -> 0x0023 }
            L_0x0020:
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            L_0x0021:
                r0 = 0
                return r0
            L_0x0023:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: i3.a.C0159a.call():java.lang.Object");
        }
    }

    /* compiled from: DiskLruCache */
    public static final class b implements ThreadFactory {
        public b(C0159a aVar) {
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* compiled from: DiskLruCache */
    public final class c {

        /* renamed from: a  reason: collision with root package name */
        public final d f19121a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f19122b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f19123c;

        public c(d dVar, C0159a aVar) {
            boolean[] zArr;
            this.f19121a = dVar;
            if (dVar.f19129e) {
                zArr = null;
            } else {
                zArr = new boolean[a.this.f19112g];
            }
            this.f19122b = zArr;
        }

        public void a() throws IOException {
            a.a(a.this, this, false);
        }

        public File b(int i10) throws IOException {
            File file;
            synchronized (a.this) {
                d dVar = this.f19121a;
                if (dVar.f19130f == this) {
                    if (!dVar.f19129e) {
                        this.f19122b[i10] = true;
                    }
                    file = dVar.f19128d[i10];
                    a.this.f19106a.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            }
            return file;
        }
    }

    /* compiled from: DiskLruCache */
    public final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f19125a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f19126b;

        /* renamed from: c  reason: collision with root package name */
        public File[] f19127c;

        /* renamed from: d  reason: collision with root package name */
        public File[] f19128d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f19129e;

        /* renamed from: f  reason: collision with root package name */
        public c f19130f;

        /* renamed from: g  reason: collision with root package name */
        public long f19131g;

        public d(String str, C0159a aVar) {
            this.f19125a = str;
            int i10 = a.this.f19112g;
            this.f19126b = new long[i10];
            this.f19127c = new File[i10];
            this.f19128d = new File[i10];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i11 = 0; i11 < a.this.f19112g; i11++) {
                sb2.append(i11);
                this.f19127c[i11] = new File(a.this.f19106a, sb2.toString());
                sb2.append(".tmp");
                this.f19128d[i11] = new File(a.this.f19106a, sb2.toString());
                sb2.setLength(length);
            }
        }

        public String a() throws IOException {
            StringBuilder sb2 = new StringBuilder();
            for (long append : this.f19126b) {
                sb2.append(' ');
                sb2.append(append);
            }
            return sb2.toString();
        }

        public final IOException b(String[] strArr) throws IOException {
            StringBuilder a10 = android.support.v4.media.a.a("unexpected journal line: ");
            a10.append(Arrays.toString(strArr));
            throw new IOException(a10.toString());
        }
    }

    /* compiled from: DiskLruCache */
    public final class e {

        /* renamed from: a  reason: collision with root package name */
        public final File[] f19133a;

        public e(a aVar, String str, long j10, File[] fileArr, long[] jArr, C0159a aVar2) {
            this.f19133a = fileArr;
        }
    }

    public a(File file, int i10, int i11, long j10) {
        File file2 = file;
        this.f19106a = file2;
        this.f19110e = i10;
        this.f19107b = new File(file2, "journal");
        this.f19108c = new File(file2, "journal.tmp");
        this.f19109d = new File(file2, "journal.bkp");
        this.f19112g = i11;
        this.f19111f = j10;
    }

    public static a G(File file, int i10, int i11, long j10) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i11 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    T(file2, file3, false);
                }
            }
            a aVar = new a(file, i10, i11, j10);
            if (aVar.f19107b.exists()) {
                try {
                    aVar.J();
                    aVar.H();
                    return aVar;
                } catch (IOException e10) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                    aVar.close();
                    c.a(aVar.f19106a);
                }
            }
            file.mkdirs();
            a aVar2 = new a(file, i10, i11, j10);
            aVar2.N();
            return aVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    public static void T(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            o(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(i3.a r9, i3.a.c r10, boolean r11) throws java.io.IOException {
        /*
            monitor-enter(r9)
            i3.a$d r0 = r10.f19121a     // Catch:{ all -> 0x00f8 }
            i3.a$c r1 = r0.f19130f     // Catch:{ all -> 0x00f8 }
            if (r1 != r10) goto L_0x00f2
            r1 = 0
            if (r11 == 0) goto L_0x0046
            boolean r2 = r0.f19129e     // Catch:{ all -> 0x00f8 }
            if (r2 != 0) goto L_0x0046
            r2 = 0
        L_0x000f:
            int r3 = r9.f19112g     // Catch:{ all -> 0x00f8 }
            if (r2 >= r3) goto L_0x0046
            boolean[] r3 = r10.f19122b     // Catch:{ all -> 0x00f8 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00f8 }
            if (r3 == 0) goto L_0x002c
            java.io.File[] r3 = r0.f19128d     // Catch:{ all -> 0x00f8 }
            r3 = r3[r2]     // Catch:{ all -> 0x00f8 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x00f8 }
            if (r3 != 0) goto L_0x0029
            r10.a()     // Catch:{ all -> 0x00f8 }
            monitor-exit(r9)
            goto L_0x00f1
        L_0x0029:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002c:
            r10.a()     // Catch:{ all -> 0x00f8 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f8 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f8 }
            r11.<init>()     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x00f8 }
            r11.append(r2)     // Catch:{ all -> 0x00f8 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00f8 }
            r10.<init>(r11)     // Catch:{ all -> 0x00f8 }
            throw r10     // Catch:{ all -> 0x00f8 }
        L_0x0046:
            int r10 = r9.f19112g     // Catch:{ all -> 0x00f8 }
            if (r1 >= r10) goto L_0x0076
            java.io.File[] r10 = r0.f19128d     // Catch:{ all -> 0x00f8 }
            r10 = r10[r1]     // Catch:{ all -> 0x00f8 }
            if (r11 == 0) goto L_0x0070
            boolean r2 = r10.exists()     // Catch:{ all -> 0x00f8 }
            if (r2 == 0) goto L_0x0073
            java.io.File[] r2 = r0.f19127c     // Catch:{ all -> 0x00f8 }
            r2 = r2[r1]     // Catch:{ all -> 0x00f8 }
            r10.renameTo(r2)     // Catch:{ all -> 0x00f8 }
            long[] r10 = r0.f19126b     // Catch:{ all -> 0x00f8 }
            r3 = r10[r1]     // Catch:{ all -> 0x00f8 }
            long r5 = r2.length()     // Catch:{ all -> 0x00f8 }
            long[] r10 = r0.f19126b     // Catch:{ all -> 0x00f8 }
            r10[r1] = r5     // Catch:{ all -> 0x00f8 }
            long r7 = r9.f19113h     // Catch:{ all -> 0x00f8 }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f19113h = r7     // Catch:{ all -> 0x00f8 }
            goto L_0x0073
        L_0x0070:
            o(r10)     // Catch:{ all -> 0x00f8 }
        L_0x0073:
            int r1 = r1 + 1
            goto L_0x0046
        L_0x0076:
            int r10 = r9.f19116s     // Catch:{ all -> 0x00f8 }
            r1 = 1
            int r10 = r10 + r1
            r9.f19116s = r10     // Catch:{ all -> 0x00f8 }
            r10 = 0
            r0.f19130f = r10     // Catch:{ all -> 0x00f8 }
            boolean r10 = r0.f19129e     // Catch:{ all -> 0x00f8 }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00b7
            r0.f19129e = r1     // Catch:{ all -> 0x00f8 }
            java.io.Writer r10 = r9.f19114i     // Catch:{ all -> 0x00f8 }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x00f8 }
            java.io.Writer r10 = r9.f19114i     // Catch:{ all -> 0x00f8 }
            r10.append(r3)     // Catch:{ all -> 0x00f8 }
            java.io.Writer r10 = r9.f19114i     // Catch:{ all -> 0x00f8 }
            java.lang.String r1 = r0.f19125a     // Catch:{ all -> 0x00f8 }
            r10.append(r1)     // Catch:{ all -> 0x00f8 }
            java.io.Writer r10 = r9.f19114i     // Catch:{ all -> 0x00f8 }
            java.lang.String r1 = r0.a()     // Catch:{ all -> 0x00f8 }
            r10.append(r1)     // Catch:{ all -> 0x00f8 }
            java.io.Writer r10 = r9.f19114i     // Catch:{ all -> 0x00f8 }
            r10.append(r2)     // Catch:{ all -> 0x00f8 }
            if (r11 == 0) goto L_0x00d6
            long r10 = r9.f19117t     // Catch:{ all -> 0x00f8 }
            r1 = 1
            long r1 = r1 + r10
            r9.f19117t = r1     // Catch:{ all -> 0x00f8 }
            r0.f19131g = r10     // Catch:{ all -> 0x00f8 }
            goto L_0x00d6
        L_0x00b7:
            java.util.LinkedHashMap<java.lang.String, i3.a$d> r10 = r9.f19115r     // Catch:{ all -> 0x00f8 }
            java.lang.String r11 = r0.f19125a     // Catch:{ all -> 0x00f8 }
            r10.remove(r11)     // Catch:{ all -> 0x00f8 }
            java.io.Writer r10 = r9.f19114i     // Catch:{ all -> 0x00f8 }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x00f8 }
            java.io.Writer r10 = r9.f19114i     // Catch:{ all -> 0x00f8 }
            r10.append(r3)     // Catch:{ all -> 0x00f8 }
            java.io.Writer r10 = r9.f19114i     // Catch:{ all -> 0x00f8 }
            java.lang.String r11 = r0.f19125a     // Catch:{ all -> 0x00f8 }
            r10.append(r11)     // Catch:{ all -> 0x00f8 }
            java.io.Writer r10 = r9.f19114i     // Catch:{ all -> 0x00f8 }
            r10.append(r2)     // Catch:{ all -> 0x00f8 }
        L_0x00d6:
            java.io.Writer r10 = r9.f19114i     // Catch:{ all -> 0x00f8 }
            t(r10)     // Catch:{ all -> 0x00f8 }
            long r10 = r9.f19113h     // Catch:{ all -> 0x00f8 }
            long r0 = r9.f19111f     // Catch:{ all -> 0x00f8 }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00e9
            boolean r10 = r9.v()     // Catch:{ all -> 0x00f8 }
            if (r10 == 0) goto L_0x00f0
        L_0x00e9:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f19118u     // Catch:{ all -> 0x00f8 }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f19119v     // Catch:{ all -> 0x00f8 }
            r10.submit(r11)     // Catch:{ all -> 0x00f8 }
        L_0x00f0:
            monitor-exit(r9)
        L_0x00f1:
            return
        L_0x00f2:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f8 }
            r10.<init>()     // Catch:{ all -> 0x00f8 }
            throw r10     // Catch:{ all -> 0x00f8 }
        L_0x00f8:
            r10 = move-exception
            monitor-exit(r9)
            goto L_0x00fc
        L_0x00fb:
            throw r10
        L_0x00fc:
            goto L_0x00fb
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.a.a(i3.a, i3.a$c, boolean):void");
    }

    @TargetApi(26)
    public static void i(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void o(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void t(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final void H() throws IOException {
        o(this.f19108c);
        Iterator<d> it = this.f19115r.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i10 = 0;
            if (next.f19130f == null) {
                while (i10 < this.f19112g) {
                    this.f19113h += next.f19126b[i10];
                    i10++;
                }
            } else {
                next.f19130f = null;
                while (i10 < this.f19112g) {
                    o(next.f19127c[i10]);
                    o(next.f19128d[i10]);
                    i10++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:16|17|(1:19)|(1:21)(1:22)|23|24|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f19116s = r2 - r9.f19115r.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006d, code lost:
        if (r1.f19138e == -1) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006f, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        if (r0 != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        N();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        r9.f19114i = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f19107b, true), i3.c.f19140a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0060 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0060=Splitter:B:16:0x0060, B:28:0x0091=Splitter:B:28:0x0091} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void J() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            i3.b r1 = new i3.b
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f19107b
            r2.<init>(r3)
            java.nio.charset.Charset r3 = i3.c.f19140a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.d()     // Catch:{ all -> 0x00bf }
            java.lang.String r3 = r1.d()     // Catch:{ all -> 0x00bf }
            java.lang.String r4 = r1.d()     // Catch:{ all -> 0x00bf }
            java.lang.String r5 = r1.d()     // Catch:{ all -> 0x00bf }
            java.lang.String r6 = r1.d()     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00bf }
            if (r7 == 0) goto L_0x0091
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00bf }
            if (r7 == 0) goto L_0x0091
            int r7 = r9.f19110e     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00bf }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00bf }
            if (r4 == 0) goto L_0x0091
            int r4 = r9.f19112g     // Catch:{ all -> 0x00bf }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00bf }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00bf }
            if (r4 == 0) goto L_0x0091
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00bf }
            if (r4 == 0) goto L_0x0091
            r0 = 0
            r2 = 0
        L_0x0056:
            java.lang.String r3 = r1.d()     // Catch:{ EOFException -> 0x0060 }
            r9.M(r3)     // Catch:{ EOFException -> 0x0060 }
            int r2 = r2 + 1
            goto L_0x0056
        L_0x0060:
            java.util.LinkedHashMap<java.lang.String, i3.a$d> r3 = r9.f19115r     // Catch:{ all -> 0x00bf }
            int r3 = r3.size()     // Catch:{ all -> 0x00bf }
            int r2 = r2 - r3
            r9.f19116s = r2     // Catch:{ all -> 0x00bf }
            int r2 = r1.f19138e     // Catch:{ all -> 0x00bf }
            r3 = -1
            r4 = 1
            if (r2 != r3) goto L_0x0070
            r0 = 1
        L_0x0070:
            if (r0 == 0) goto L_0x0076
            r9.N()     // Catch:{ all -> 0x00bf }
            goto L_0x008b
        L_0x0076:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00bf }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00bf }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00bf }
            java.io.File r5 = r9.f19107b     // Catch:{ all -> 0x00bf }
            r3.<init>(r5, r4)     // Catch:{ all -> 0x00bf }
            java.nio.charset.Charset r4 = i3.c.f19140a     // Catch:{ all -> 0x00bf }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00bf }
            r0.<init>(r2)     // Catch:{ all -> 0x00bf }
            r9.f19114i = r0     // Catch:{ all -> 0x00bf }
        L_0x008b:
            r1.close()     // Catch:{ RuntimeException -> 0x008f, Exception -> 0x008e }
        L_0x008e:
            return
        L_0x008f:
            r0 = move-exception
            throw r0
        L_0x0091:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00bf }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bf }
            r7.<init>()     // Catch:{ all -> 0x00bf }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00bf }
            r7.append(r2)     // Catch:{ all -> 0x00bf }
            r7.append(r0)     // Catch:{ all -> 0x00bf }
            r7.append(r3)     // Catch:{ all -> 0x00bf }
            r7.append(r0)     // Catch:{ all -> 0x00bf }
            r7.append(r5)     // Catch:{ all -> 0x00bf }
            r7.append(r0)     // Catch:{ all -> 0x00bf }
            r7.append(r6)     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00bf }
            r4.<init>(r0)     // Catch:{ all -> 0x00bf }
            throw r4     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            r0 = move-exception
            r1.close()     // Catch:{ RuntimeException -> 0x00c4, Exception -> 0x00c3 }
        L_0x00c3:
            throw r0
        L_0x00c4:
            r0 = move-exception
            goto L_0x00c7
        L_0x00c6:
            throw r0
        L_0x00c7:
            goto L_0x00c6
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.a.J():void");
    }

    public final void M(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i10);
            if (indexOf2 == -1) {
                str2 = str.substring(i10);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f19115r.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i10, indexOf2);
            }
            d dVar = this.f19115r.get(str2);
            if (dVar == null) {
                dVar = new d(str2, (C0159a) null);
                this.f19115r.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f19129e = true;
                dVar.f19130f = null;
                if (split.length == a.this.f19112g) {
                    int i11 = 0;
                    while (i11 < split.length) {
                        try {
                            dVar.f19126b[i11] = Long.parseLong(split[i11]);
                            i11++;
                        } catch (NumberFormatException unused) {
                            dVar.b(split);
                            throw null;
                        }
                    }
                    return;
                }
                dVar.b(split);
                throw null;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f19130f = new c(dVar, (C0159a) null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException(f.a("unexpected journal line: ", str));
            }
        } else {
            throw new IOException(f.a("unexpected journal line: ", str));
        }
    }

    public final synchronized void N() throws IOException {
        Writer writer = this.f19114i;
        if (writer != null) {
            i(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f19108c), c.f19140a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f19110e));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f19112g));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d next : this.f19115r.values()) {
                if (next.f19130f != null) {
                    bufferedWriter.write("DIRTY " + next.f19125a + 10);
                } else {
                    bufferedWriter.write("CLEAN " + next.f19125a + next.a() + 10);
                }
            }
            i(bufferedWriter);
            if (this.f19107b.exists()) {
                T(this.f19107b, this.f19109d, true);
            }
            T(this.f19108c, this.f19107b, false);
            this.f19109d.delete();
            this.f19114i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f19107b, true), c.f19140a));
        } finally {
            i(bufferedWriter);
        }
    }

    public final void V() throws IOException {
        while (this.f19113h > this.f19111f) {
            String str = (String) this.f19115r.entrySet().iterator().next().getKey();
            synchronized (this) {
                d();
                d dVar = this.f19115r.get(str);
                if (dVar != null) {
                    if (dVar.f19130f == null) {
                        for (int i10 = 0; i10 < this.f19112g; i10++) {
                            File file = dVar.f19127c[i10];
                            if (file.exists()) {
                                if (!file.delete()) {
                                    throw new IOException("failed to delete " + file);
                                }
                            }
                            long j10 = this.f19113h;
                            long[] jArr = dVar.f19126b;
                            this.f19113h = j10 - jArr[i10];
                            jArr[i10] = 0;
                        }
                        this.f19116s++;
                        this.f19114i.append("REMOVE");
                        this.f19114i.append(' ');
                        this.f19114i.append(str);
                        this.f19114i.append(10);
                        this.f19115r.remove(str);
                        if (v()) {
                            this.f19118u.submit(this.f19119v);
                        }
                    }
                }
            }
        }
    }

    public synchronized void close() throws IOException {
        if (this.f19114i != null) {
            Iterator it = new ArrayList(this.f19115r.values()).iterator();
            while (it.hasNext()) {
                c cVar = ((d) it.next()).f19130f;
                if (cVar != null) {
                    cVar.a();
                }
            }
            V();
            i(this.f19114i);
            this.f19114i = null;
        }
    }

    public final void d() {
        if (this.f19114i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public c s(String str) throws IOException {
        synchronized (this) {
            d();
            d dVar = this.f19115r.get(str);
            if (dVar == null) {
                dVar = new d(str, (C0159a) null);
                this.f19115r.put(str, dVar);
            } else if (dVar.f19130f != null) {
                return null;
            }
            c cVar = new c(dVar, (C0159a) null);
            dVar.f19130f = cVar;
            this.f19114i.append("DIRTY");
            this.f19114i.append(' ');
            this.f19114i.append(str);
            this.f19114i.append(10);
            t(this.f19114i);
            return cVar;
        }
    }

    public synchronized e u(String str) throws IOException {
        d();
        d dVar = this.f19115r.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f19129e) {
            return null;
        }
        for (File exists : dVar.f19127c) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.f19116s++;
        this.f19114i.append("READ");
        this.f19114i.append(' ');
        this.f19114i.append(str);
        this.f19114i.append(10);
        if (v()) {
            this.f19118u.submit(this.f19119v);
        }
        return new e(this, str, dVar.f19131g, dVar.f19127c, dVar.f19126b, (C0159a) null);
    }

    public final boolean v() {
        int i10 = this.f19116s;
        return i10 >= 2000 && i10 >= this.f19115r.size();
    }
}

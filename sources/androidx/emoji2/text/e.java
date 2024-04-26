package androidx.emoji2.text;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: EmojiCompat */
public class e {

    /* renamed from: j  reason: collision with root package name */
    public static final Object f1506j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public static volatile e f1507k;

    /* renamed from: a  reason: collision with root package name */
    public final ReadWriteLock f1508a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<C0021e> f1509b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f1510c = 3;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f1511d;

    /* renamed from: e  reason: collision with root package name */
    public final b f1512e;

    /* renamed from: f  reason: collision with root package name */
    public final g f1513f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1514g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1515h;

    /* renamed from: i  reason: collision with root package name */
    public final d f1516i;

    /* compiled from: EmojiCompat */
    public static final class a extends b {

        /* renamed from: b  reason: collision with root package name */
        public volatile i f1517b;

        /* renamed from: c  reason: collision with root package name */
        public volatile m f1518c;

        /* renamed from: androidx.emoji2.text.e$a$a  reason: collision with other inner class name */
        /* compiled from: EmojiCompat */
        public class C0020a extends h {
            public C0020a() {
            }

            public void a(Throwable th) {
                a.this.f1520a.f(th);
            }

            public void b(m mVar) {
                a aVar = a.this;
                if (mVar == null) {
                    aVar.f1520a.f(new IllegalArgumentException("metadataRepo cannot be null"));
                    return;
                }
                aVar.f1518c = mVar;
                m mVar2 = aVar.f1518c;
                i iVar = new i();
                e eVar = aVar.f1520a;
                d dVar = eVar.f1516i;
                eVar.getClass();
                aVar.f1517b = new i(mVar2, iVar, dVar, false, (int[]) null);
                aVar.f1520a.g();
            }
        }

        public a(e eVar) {
            super(eVar);
        }

        public void a() {
            try {
                this.f1520a.f1513f.a(new C0020a());
            } catch (Throwable th) {
                this.f1520a.f(th);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
            return r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x0159, code lost:
            if (r6 != false) goto L_0x015e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x015c, code lost:
            if (r6 == false) goto L_0x0164;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x015e, code lost:
            ((androidx.emoji2.text.n) r1).b();
         */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0047 A[Catch:{ all -> 0x0166 }] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0076 A[Catch:{ all -> 0x0166 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.CharSequence b(java.lang.CharSequence r17, int r18, int r19, int r20, boolean r21) {
            /*
                r16 = this;
                r1 = r17
                r0 = r18
                r2 = r19
                r3 = r20
                r4 = r16
                androidx.emoji2.text.i r5 = r4.f1517b
                r5.getClass()
                boolean r6 = r1 instanceof androidx.emoji2.text.n
                if (r6 == 0) goto L_0x0019
                r7 = r1
                androidx.emoji2.text.n r7 = (androidx.emoji2.text.n) r7
                r7.a()
            L_0x0019:
                r7 = 0
                if (r6 != 0) goto L_0x003c
                boolean r8 = r1 instanceof android.text.Spannable     // Catch:{ all -> 0x0166 }
                if (r8 == 0) goto L_0x0021
                goto L_0x003c
            L_0x0021:
                boolean r8 = r1 instanceof android.text.Spanned     // Catch:{ all -> 0x0166 }
                if (r8 == 0) goto L_0x003a
                r8 = r1
                android.text.Spanned r8 = (android.text.Spanned) r8     // Catch:{ all -> 0x0166 }
                int r9 = r0 + -1
                int r10 = r2 + 1
                java.lang.Class<androidx.emoji2.text.j> r11 = androidx.emoji2.text.j.class
                int r8 = r8.nextSpanTransition(r9, r10, r11)     // Catch:{ all -> 0x0166 }
                if (r8 > r2) goto L_0x003a
                androidx.emoji2.text.p r8 = new androidx.emoji2.text.p     // Catch:{ all -> 0x0166 }
                r8.<init>((java.lang.CharSequence) r1)     // Catch:{ all -> 0x0166 }
                goto L_0x0044
            L_0x003a:
                r8 = r7
                goto L_0x0044
            L_0x003c:
                androidx.emoji2.text.p r8 = new androidx.emoji2.text.p     // Catch:{ all -> 0x0166 }
                r9 = r1
                android.text.Spannable r9 = (android.text.Spannable) r9     // Catch:{ all -> 0x0166 }
                r8.<init>((android.text.Spannable) r9)     // Catch:{ all -> 0x0166 }
            L_0x0044:
                r9 = 0
                if (r8 == 0) goto L_0x0074
                java.lang.Class<androidx.emoji2.text.j> r10 = androidx.emoji2.text.j.class
                android.text.Spannable r11 = r8.f1571b     // Catch:{ all -> 0x0166 }
                java.lang.Object[] r10 = r11.getSpans(r0, r2, r10)     // Catch:{ all -> 0x0166 }
                androidx.emoji2.text.j[] r10 = (androidx.emoji2.text.j[]) r10     // Catch:{ all -> 0x0166 }
                if (r10 == 0) goto L_0x0074
                int r11 = r10.length     // Catch:{ all -> 0x0166 }
                if (r11 <= 0) goto L_0x0074
                int r11 = r10.length     // Catch:{ all -> 0x0166 }
                r12 = 0
            L_0x0058:
                if (r12 >= r11) goto L_0x0074
                r13 = r10[r12]     // Catch:{ all -> 0x0166 }
                int r14 = r8.getSpanStart(r13)     // Catch:{ all -> 0x0166 }
                int r15 = r8.getSpanEnd(r13)     // Catch:{ all -> 0x0166 }
                if (r14 == r2) goto L_0x0069
                r8.removeSpan(r13)     // Catch:{ all -> 0x0166 }
            L_0x0069:
                int r0 = java.lang.Math.min(r14, r0)     // Catch:{ all -> 0x0166 }
                int r2 = java.lang.Math.max(r15, r2)     // Catch:{ all -> 0x0166 }
                int r12 = r12 + 1
                goto L_0x0058
            L_0x0074:
                if (r0 == r2) goto L_0x015c
                int r10 = r17.length()     // Catch:{ all -> 0x0166 }
                if (r0 < r10) goto L_0x007e
                goto L_0x015c
            L_0x007e:
                r10 = 2147483647(0x7fffffff, float:NaN)
                if (r3 == r10) goto L_0x0093
                if (r8 == 0) goto L_0x0093
                int r10 = r8.length()     // Catch:{ all -> 0x0166 }
                java.lang.Class<androidx.emoji2.text.j> r11 = androidx.emoji2.text.j.class
                java.lang.Object[] r10 = r8.getSpans(r9, r10, r11)     // Catch:{ all -> 0x0166 }
                androidx.emoji2.text.j[] r10 = (androidx.emoji2.text.j[]) r10     // Catch:{ all -> 0x0166 }
                int r10 = r10.length     // Catch:{ all -> 0x0166 }
                int r3 = r3 - r10
            L_0x0093:
                androidx.emoji2.text.i$a r10 = new androidx.emoji2.text.i$a     // Catch:{ all -> 0x0166 }
                androidx.emoji2.text.m r11 = r5.f1537b     // Catch:{ all -> 0x0166 }
                androidx.emoji2.text.m$a r11 = r11.f1562c     // Catch:{ all -> 0x0166 }
                r10.<init>(r11, r9, r7)     // Catch:{ all -> 0x0166 }
                int r7 = java.lang.Character.codePointAt(r1, r0)     // Catch:{ all -> 0x0166 }
                r11 = 0
            L_0x00a1:
                r12 = r7
                r7 = r0
            L_0x00a3:
                r13 = 33
                r14 = 2
                r15 = 1
                if (r0 >= r2) goto L_0x0108
                if (r11 >= r3) goto L_0x0108
                int r9 = r10.a(r12)     // Catch:{ all -> 0x0166 }
                if (r9 == r15) goto L_0x00f6
                if (r9 == r14) goto L_0x00ea
                r14 = 3
                if (r9 == r14) goto L_0x00b7
                goto L_0x0106
            L_0x00b7:
                if (r21 != 0) goto L_0x00c3
                androidx.emoji2.text.m$a r9 = r10.f1542d     // Catch:{ all -> 0x0166 }
                androidx.emoji2.text.h r9 = r9.f1565b     // Catch:{ all -> 0x0166 }
                boolean r9 = r5.b(r1, r7, r0, r9)     // Catch:{ all -> 0x0166 }
                if (r9 != 0) goto L_0x00e7
            L_0x00c3:
                if (r8 != 0) goto L_0x00cf
                androidx.emoji2.text.p r8 = new androidx.emoji2.text.p     // Catch:{ all -> 0x0166 }
                android.text.SpannableString r9 = new android.text.SpannableString     // Catch:{ all -> 0x0166 }
                r9.<init>(r1)     // Catch:{ all -> 0x0166 }
                r8.<init>((android.text.Spannable) r9)     // Catch:{ all -> 0x0166 }
            L_0x00cf:
                androidx.emoji2.text.m$a r9 = r10.f1542d     // Catch:{ all -> 0x0166 }
                androidx.emoji2.text.h r9 = r9.f1565b     // Catch:{ all -> 0x0166 }
                androidx.emoji2.text.e$i r14 = r5.f1536a     // Catch:{ all -> 0x0166 }
                r14.getClass()     // Catch:{ all -> 0x0166 }
                androidx.emoji2.text.o r14 = new androidx.emoji2.text.o     // Catch:{ all -> 0x0166 }
                r14.<init>(r9)     // Catch:{ all -> 0x0166 }
                r8.a()     // Catch:{ all -> 0x0166 }
                android.text.Spannable r9 = r8.f1571b     // Catch:{ all -> 0x0166 }
                r9.setSpan(r14, r7, r0, r13)     // Catch:{ all -> 0x0166 }
                int r11 = r11 + 1
            L_0x00e7:
                r7 = r12
                r9 = 0
                goto L_0x00a1
            L_0x00ea:
                int r9 = java.lang.Character.charCount(r12)     // Catch:{ all -> 0x0166 }
                int r0 = r0 + r9
                if (r0 >= r2) goto L_0x0106
                int r12 = java.lang.Character.codePointAt(r1, r0)     // Catch:{ all -> 0x0166 }
                goto L_0x0106
            L_0x00f6:
                int r0 = java.lang.Character.codePointAt(r1, r7)     // Catch:{ all -> 0x0166 }
                int r0 = java.lang.Character.charCount(r0)     // Catch:{ all -> 0x0166 }
                int r0 = r0 + r7
                if (r0 >= r2) goto L_0x0105
                int r12 = java.lang.Character.codePointAt(r1, r0)     // Catch:{ all -> 0x0166 }
            L_0x0105:
                r7 = r0
            L_0x0106:
                r9 = 0
                goto L_0x00a3
            L_0x0108:
                int r2 = r10.f1539a     // Catch:{ all -> 0x0166 }
                if (r2 != r14) goto L_0x011e
                androidx.emoji2.text.m$a r2 = r10.f1541c     // Catch:{ all -> 0x0166 }
                androidx.emoji2.text.h r2 = r2.f1565b     // Catch:{ all -> 0x0166 }
                if (r2 == 0) goto L_0x011e
                int r2 = r10.f1544f     // Catch:{ all -> 0x0166 }
                if (r2 > r15) goto L_0x011c
                boolean r2 = r10.c()     // Catch:{ all -> 0x0166 }
                if (r2 == 0) goto L_0x011e
            L_0x011c:
                r9 = 1
                goto L_0x011f
            L_0x011e:
                r9 = 0
            L_0x011f:
                if (r9 == 0) goto L_0x014d
                if (r11 >= r3) goto L_0x014d
                if (r21 != 0) goto L_0x012f
                androidx.emoji2.text.m$a r2 = r10.f1541c     // Catch:{ all -> 0x0166 }
                androidx.emoji2.text.h r2 = r2.f1565b     // Catch:{ all -> 0x0166 }
                boolean r2 = r5.b(r1, r7, r0, r2)     // Catch:{ all -> 0x0166 }
                if (r2 != 0) goto L_0x014d
            L_0x012f:
                if (r8 != 0) goto L_0x0137
                androidx.emoji2.text.p r2 = new androidx.emoji2.text.p     // Catch:{ all -> 0x0166 }
                r2.<init>((java.lang.CharSequence) r1)     // Catch:{ all -> 0x0166 }
                r8 = r2
            L_0x0137:
                androidx.emoji2.text.m$a r2 = r10.f1541c     // Catch:{ all -> 0x0166 }
                androidx.emoji2.text.h r2 = r2.f1565b     // Catch:{ all -> 0x0166 }
                androidx.emoji2.text.e$i r3 = r5.f1536a     // Catch:{ all -> 0x0166 }
                r3.getClass()     // Catch:{ all -> 0x0166 }
                androidx.emoji2.text.o r3 = new androidx.emoji2.text.o     // Catch:{ all -> 0x0166 }
                r3.<init>(r2)     // Catch:{ all -> 0x0166 }
                r8.a()     // Catch:{ all -> 0x0166 }
                android.text.Spannable r2 = r8.f1571b     // Catch:{ all -> 0x0166 }
                r2.setSpan(r3, r7, r0, r13)     // Catch:{ all -> 0x0166 }
            L_0x014d:
                if (r8 == 0) goto L_0x0159
                android.text.Spannable r0 = r8.f1571b     // Catch:{ all -> 0x0166 }
                if (r6 == 0) goto L_0x0165
                androidx.emoji2.text.n r1 = (androidx.emoji2.text.n) r1
                r1.b()
                goto L_0x0165
            L_0x0159:
                if (r6 == 0) goto L_0x0164
                goto L_0x015e
            L_0x015c:
                if (r6 == 0) goto L_0x0164
            L_0x015e:
                r0 = r1
                androidx.emoji2.text.n r0 = (androidx.emoji2.text.n) r0
                r0.b()
            L_0x0164:
                r0 = r1
            L_0x0165:
                return r0
            L_0x0166:
                r0 = move-exception
                if (r6 == 0) goto L_0x016e
                androidx.emoji2.text.n r1 = (androidx.emoji2.text.n) r1
                r1.b()
            L_0x016e:
                goto L_0x0170
            L_0x016f:
                throw r0
            L_0x0170:
                goto L_0x016f
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.e.a.b(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
        }

        public void c(EditorInfo editorInfo) {
            Bundle bundle = editorInfo.extras;
            y0.b bVar = this.f1518c.f1560a;
            int a10 = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a10 != 0 ? bVar.f27976b.getInt(a10 + bVar.f27975a) : 0);
            Bundle bundle2 = editorInfo.extras;
            this.f1520a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    /* compiled from: EmojiCompat */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final e f1520a;

        public b(e eVar) {
            this.f1520a = eVar;
        }

        public void a() {
            this.f1520a.g();
        }

        public CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return charSequence;
        }

        public void c(EditorInfo editorInfo) {
        }
    }

    /* compiled from: EmojiCompat */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final g f1521a;

        /* renamed from: b  reason: collision with root package name */
        public int f1522b = 0;

        /* renamed from: c  reason: collision with root package name */
        public d f1523c = new d();

        public c(g gVar) {
            this.f1521a = gVar;
        }
    }

    /* compiled from: EmojiCompat */
    public interface d {
    }

    /* renamed from: androidx.emoji2.text.e$e  reason: collision with other inner class name */
    /* compiled from: EmojiCompat */
    public static abstract class C0021e {
        public void a() {
        }
    }

    /* compiled from: EmojiCompat */
    public static class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final List<C0021e> f1524a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1525b;

        public f(Collection<C0021e> collection, int i10, Throwable th) {
            q.a.f(collection, "initCallbacks cannot be null");
            this.f1524a = new ArrayList(collection);
            this.f1525b = i10;
        }

        public void run() {
            int size = this.f1524a.size();
            int i10 = 0;
            if (this.f1525b != 1) {
                while (i10 < size) {
                    this.f1524a.get(i10).getClass();
                    i10++;
                }
                return;
            }
            while (i10 < size) {
                this.f1524a.get(i10).a();
                i10++;
            }
        }
    }

    /* compiled from: EmojiCompat */
    public interface g {
        void a(h hVar);
    }

    /* compiled from: EmojiCompat */
    public static abstract class h {
        public abstract void a(Throwable th);

        public abstract void b(m mVar);
    }

    /* compiled from: EmojiCompat */
    public static class i {
    }

    public e(c cVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1508a = reentrantReadWriteLock;
        cVar.getClass();
        this.f1514g = -16711936;
        this.f1513f = cVar.f1521a;
        int i10 = cVar.f1522b;
        this.f1515h = i10;
        this.f1516i = cVar.f1523c;
        this.f1511d = new Handler(Looper.getMainLooper());
        this.f1509b = new s.c(0);
        b bVar = Build.VERSION.SDK_INT < 19 ? new b(this) : new a(this);
        this.f1512e = bVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f1510c = 0;
            } catch (Throwable th) {
                this.f1508a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            bVar.a();
        }
    }

    public static e a() {
        e eVar;
        synchronized (f1506j) {
            eVar = f1507k;
            q.a.g(eVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return eVar;
    }

    public static boolean c() {
        return f1507k != null;
    }

    public int b() {
        this.f1508a.readLock().lock();
        try {
            return this.f1510c;
        } finally {
            this.f1508a.readLock().unlock();
        }
    }

    public final boolean d() {
        return b() == 1;
    }

    public void e() {
        boolean z10 = true;
        if (this.f1515h != 1) {
            z10 = false;
        }
        q.a.g(z10, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (!d()) {
            this.f1508a.writeLock().lock();
            try {
                if (this.f1510c != 0) {
                    this.f1510c = 0;
                    this.f1508a.writeLock().unlock();
                    this.f1512e.a();
                }
            } finally {
                this.f1508a.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1508a.writeLock().lock();
        try {
            this.f1510c = 2;
            arrayList.addAll(this.f1509b);
            this.f1509b.clear();
            this.f1508a.writeLock().unlock();
            this.f1511d.post(new f(arrayList, this.f1510c, th));
        } catch (Throwable th2) {
            this.f1508a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    public void g() {
        ArrayList arrayList = new ArrayList();
        this.f1508a.writeLock().lock();
        try {
            this.f1510c = 1;
            arrayList.addAll(this.f1509b);
            this.f1509b.clear();
            this.f1508a.writeLock().unlock();
            this.f1511d.post(new f(arrayList, this.f1510c, (Throwable) null));
        } catch (Throwable th) {
            this.f1508a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, 0, charSequence == null ? 0 : charSequence.length(), Integer.MAX_VALUE, 0);
    }

    public CharSequence i(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        q.a.g(d(), "Not initialized yet");
        q.a.e(i10, "start cannot be negative");
        q.a.e(i11, "end cannot be negative");
        q.a.e(i12, "maxEmojiCount cannot be negative");
        q.a.c(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        q.a.c(i10 <= charSequence.length(), "start should be < than charSequence length");
        q.a.c(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        return this.f1512e.b(charSequence, i10, i11, i12, i13 == 1);
    }

    public void j(C0021e eVar) {
        q.a.f(eVar, "initCallback cannot be null");
        this.f1508a.writeLock().lock();
        try {
            if (this.f1510c != 1) {
                if (this.f1510c != 2) {
                    this.f1509b.add(eVar);
                }
            }
            Handler handler = this.f1511d;
            int i10 = this.f1510c;
            q.a.f(eVar, "initCallback cannot be null");
            handler.post(new f(Arrays.asList(new C0021e[]{eVar}), i10, (Throwable) null));
        } finally {
            this.f1508a.writeLock().unlock();
        }
    }
}

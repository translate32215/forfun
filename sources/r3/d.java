package r3;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.f;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import k3.e;
import q3.m;
import q3.n;
import q3.q;

/* compiled from: QMediaStoreUriLoader */
public final class d<DataT> implements m<Uri, DataT> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f24511a;

    /* renamed from: b  reason: collision with root package name */
    public final m<File, DataT> f24512b;

    /* renamed from: c  reason: collision with root package name */
    public final m<Uri, DataT> f24513c;

    /* renamed from: d  reason: collision with root package name */
    public final Class<DataT> f24514d;

    /* compiled from: QMediaStoreUriLoader */
    public static abstract class a<DataT> implements n<Uri, DataT> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f24515a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<DataT> f24516b;

        public a(Context context, Class<DataT> cls) {
            this.f24515a = context;
            this.f24516b = cls;
        }

        public final m<Uri, DataT> a(q qVar) {
            return new d(this.f24515a, qVar.b(File.class, this.f24516b), qVar.b(Uri.class, this.f24516b), this.f24516b);
        }
    }

    /* compiled from: QMediaStoreUriLoader */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* compiled from: QMediaStoreUriLoader */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: r3.d$d  reason: collision with other inner class name */
    /* compiled from: QMediaStoreUriLoader */
    public static final class C0232d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: s  reason: collision with root package name */
        public static final String[] f24517s = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        public final Context f24518a;

        /* renamed from: b  reason: collision with root package name */
        public final m<File, DataT> f24519b;

        /* renamed from: c  reason: collision with root package name */
        public final m<Uri, DataT> f24520c;

        /* renamed from: d  reason: collision with root package name */
        public final Uri f24521d;

        /* renamed from: e  reason: collision with root package name */
        public final int f24522e;

        /* renamed from: f  reason: collision with root package name */
        public final int f24523f;

        /* renamed from: g  reason: collision with root package name */
        public final e f24524g;

        /* renamed from: h  reason: collision with root package name */
        public final Class<DataT> f24525h;

        /* renamed from: i  reason: collision with root package name */
        public volatile boolean f24526i;

        /* renamed from: r  reason: collision with root package name */
        public volatile com.bumptech.glide.load.data.d<DataT> f24527r;

        public C0232d(Context context, m<File, DataT> mVar, m<Uri, DataT> mVar2, Uri uri, int i10, int i11, e eVar, Class<DataT> cls) {
            this.f24518a = context.getApplicationContext();
            this.f24519b = mVar;
            this.f24520c = mVar2;
            this.f24521d = uri;
            this.f24522e = i10;
            this.f24523f = i11;
            this.f24524g = eVar;
            this.f24525h = cls;
        }

        public Class<DataT> a() {
            return this.f24525h;
        }

        public void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f24527r;
            if (dVar != null) {
                dVar.b();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bumptech.glide.load.data.d<DataT> c() throws java.io.FileNotFoundException {
            /*
                r9 = this;
                boolean r0 = android.os.Environment.isExternalStorageLegacy()
                r1 = 0
                if (r0 == 0) goto L_0x007e
                q3.m<java.io.File, DataT> r0 = r9.f24519b
                android.net.Uri r8 = r9.f24521d
                android.content.Context r2 = r9.f24518a     // Catch:{ all -> 0x0077 }
                android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x0077 }
                java.lang.String[] r4 = f24517s     // Catch:{ all -> 0x0077 }
                r5 = 0
                r6 = 0
                r7 = 0
                r3 = r8
                android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0077 }
                if (r2 == 0) goto L_0x005d
                boolean r3 = r2.moveToFirst()     // Catch:{ all -> 0x0074 }
                if (r3 == 0) goto L_0x005d
                java.lang.String r3 = "_data"
                int r3 = r2.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0074 }
                java.lang.String r3 = r2.getString(r3)     // Catch:{ all -> 0x0074 }
                boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0074 }
                if (r4 != 0) goto L_0x0046
                java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0074 }
                r4.<init>(r3)     // Catch:{ all -> 0x0074 }
                r2.close()
                int r2 = r9.f24522e
                int r3 = r9.f24523f
                k3.e r5 = r9.f24524g
                q3.m$a r0 = r0.a(r4, r2, r3, r5)
                goto L_0x00a2
            L_0x0046:
                java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0074 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
                r1.<init>()     // Catch:{ all -> 0x0074 }
                java.lang.String r3 = "File path was empty in media store for: "
                r1.append(r3)     // Catch:{ all -> 0x0074 }
                r1.append(r8)     // Catch:{ all -> 0x0074 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0074 }
                r0.<init>(r1)     // Catch:{ all -> 0x0074 }
                throw r0     // Catch:{ all -> 0x0074 }
            L_0x005d:
                java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0074 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
                r1.<init>()     // Catch:{ all -> 0x0074 }
                java.lang.String r3 = "Failed to media store entry for: "
                r1.append(r3)     // Catch:{ all -> 0x0074 }
                r1.append(r8)     // Catch:{ all -> 0x0074 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0074 }
                r0.<init>(r1)     // Catch:{ all -> 0x0074 }
                throw r0     // Catch:{ all -> 0x0074 }
            L_0x0074:
                r0 = move-exception
                r1 = r2
                goto L_0x0078
            L_0x0077:
                r0 = move-exception
            L_0x0078:
                if (r1 == 0) goto L_0x007d
                r1.close()
            L_0x007d:
                throw r0
            L_0x007e:
                android.content.Context r0 = r9.f24518a
                java.lang.String r2 = "android.permission.ACCESS_MEDIA_LOCATION"
                int r0 = r0.checkSelfPermission(r2)
                if (r0 != 0) goto L_0x008a
                r0 = 1
                goto L_0x008b
            L_0x008a:
                r0 = 0
            L_0x008b:
                if (r0 == 0) goto L_0x0094
                android.net.Uri r0 = r9.f24521d
                android.net.Uri r0 = android.provider.MediaStore.setRequireOriginal(r0)
                goto L_0x0096
            L_0x0094:
                android.net.Uri r0 = r9.f24521d
            L_0x0096:
                q3.m<android.net.Uri, DataT> r2 = r9.f24520c
                int r3 = r9.f24522e
                int r4 = r9.f24523f
                k3.e r5 = r9.f24524g
                q3.m$a r0 = r2.a(r0, r3, r4, r5)
            L_0x00a2:
                if (r0 == 0) goto L_0x00a6
                com.bumptech.glide.load.data.d<Data> r1 = r0.f24106c
            L_0x00a6:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: r3.d.C0232d.c():com.bumptech.glide.load.data.d");
        }

        public void cancel() {
            this.f24526i = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f24527r;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        public com.bumptech.glide.load.a e() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        public void f(f fVar, d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> c10 = c();
                if (c10 == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f24521d));
                    return;
                }
                this.f24527r = c10;
                if (this.f24526i) {
                    cancel();
                } else {
                    c10.f(fVar, aVar);
                }
            } catch (FileNotFoundException e10) {
                aVar.c(e10);
            }
        }
    }

    public d(Context context, m<File, DataT> mVar, m<Uri, DataT> mVar2, Class<DataT> cls) {
        this.f24511a = context.getApplicationContext();
        this.f24512b = mVar;
        this.f24513c = mVar2;
        this.f24514d = cls;
    }

    public m.a a(Object obj, int i10, int i11, e eVar) {
        Uri uri = (Uri) obj;
        return new m.a(new f4.b(uri), new C0232d(this.f24511a, this.f24512b, this.f24513c, uri, i10, i11, eVar, this.f24514d));
    }

    public boolean b(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && e.d.i((Uri) obj);
    }
}

package l3;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.f;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ThumbFetcher */
public class a implements d<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f21021a;

    /* renamed from: b  reason: collision with root package name */
    public final c f21022b;

    /* renamed from: c  reason: collision with root package name */
    public InputStream f21023c;

    /* renamed from: l3.a$a  reason: collision with other inner class name */
    /* compiled from: ThumbFetcher */
    public static class C0181a implements b {

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f21024b = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f21025a;

        public C0181a(ContentResolver contentResolver) {
            this.f21025a = contentResolver;
        }

        public Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f21025a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f21024b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    /* compiled from: ThumbFetcher */
    public static class b implements b {

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f21026b = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f21027a;

        public b(ContentResolver contentResolver) {
            this.f21027a = contentResolver;
        }

        public Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f21027a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f21026b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    public a(Uri uri, c cVar) {
        this.f21021a = uri;
        this.f21022b = cVar;
    }

    public static a c(Context context, Uri uri, b bVar) {
        return new a(uri, new c(com.bumptech.glide.b.b(context).f4886d.e(), bVar, com.bumptech.glide.b.b(context).f4887e, context.getContentResolver()));
    }

    public Class<InputStream> a() {
        return InputStream.class;
    }

    public void b() {
        InputStream inputStream = this.f21023c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public void cancel() {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r6 != null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r6 == null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[Catch:{ all -> 0x0022 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.InputStream d() throws java.io.FileNotFoundException {
        /*
            r12 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            l3.c r1 = r12.f21022b
            android.net.Uri r2 = r12.f21021a
            r1.getClass()
            r3 = 0
            r4 = 3
            r5 = 0
            l3.b r6 = r1.f21030b     // Catch:{ SecurityException -> 0x002e, all -> 0x002b }
            android.database.Cursor r6 = r6.a(r2)     // Catch:{ SecurityException -> 0x002e, all -> 0x002b }
            if (r6 == 0) goto L_0x0028
            boolean r7 = r6.moveToFirst()     // Catch:{ SecurityException -> 0x0026 }
            if (r7 == 0) goto L_0x0028
            java.lang.String r7 = r6.getString(r3)     // Catch:{ SecurityException -> 0x0026 }
            r6.close()
            goto L_0x0051
        L_0x0022:
            r0 = move-exception
            r5 = r6
            goto L_0x0106
        L_0x0026:
            r7 = move-exception
            goto L_0x0031
        L_0x0028:
            if (r6 == 0) goto L_0x0050
            goto L_0x004d
        L_0x002b:
            r0 = move-exception
            goto L_0x0106
        L_0x002e:
            r6 = move-exception
            r7 = r6
            r6 = r5
        L_0x0031:
            boolean r8 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x0022 }
            if (r8 == 0) goto L_0x004b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0022 }
            r8.<init>()     // Catch:{ all -> 0x0022 }
            java.lang.String r9 = "Failed to query for thumbnail for Uri: "
            r8.append(r9)     // Catch:{ all -> 0x0022 }
            r8.append(r2)     // Catch:{ all -> 0x0022 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0022 }
            android.util.Log.d(r0, r8, r7)     // Catch:{ all -> 0x0022 }
        L_0x004b:
            if (r6 == 0) goto L_0x0050
        L_0x004d:
            r6.close()
        L_0x0050:
            r7 = r5
        L_0x0051:
            boolean r6 = android.text.TextUtils.isEmpty(r7)
            if (r6 == 0) goto L_0x0059
        L_0x0057:
            r1 = r5
            goto L_0x008b
        L_0x0059:
            androidx.databinding.a r6 = r1.f21029a
            r6.getClass()
            java.io.File r6 = new java.io.File
            r6.<init>(r7)
            androidx.databinding.a r7 = r1.f21029a
            r7.getClass()
            boolean r7 = r6.exists()
            if (r7 == 0) goto L_0x007e
            r7 = 0
            androidx.databinding.a r9 = r1.f21029a
            r9.getClass()
            long r9 = r6.length()
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x007e
            r3 = 1
        L_0x007e:
            if (r3 != 0) goto L_0x0081
            goto L_0x0057
        L_0x0081:
            android.net.Uri r3 = android.net.Uri.fromFile(r6)
            android.content.ContentResolver r1 = r1.f21032d     // Catch:{ NullPointerException -> 0x00e0 }
            java.io.InputStream r1 = r1.openInputStream(r3)     // Catch:{ NullPointerException -> 0x00e0 }
        L_0x008b:
            r2 = -1
            if (r1 == 0) goto L_0x00d6
            l3.c r3 = r12.f21022b
            android.net.Uri r6 = r12.f21021a
            r3.getClass()
            android.content.ContentResolver r7 = r3.f21032d     // Catch:{ IOException -> 0x00af, NullPointerException -> 0x00ad }
            java.io.InputStream r5 = r7.openInputStream(r6)     // Catch:{ IOException -> 0x00af, NullPointerException -> 0x00ad }
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r7 = r3.f21033e     // Catch:{ IOException -> 0x00af, NullPointerException -> 0x00ad }
            n3.b r3 = r3.f21031c     // Catch:{ IOException -> 0x00af, NullPointerException -> 0x00ad }
            int r0 = com.bumptech.glide.load.d.a(r7, r5, r3)     // Catch:{ IOException -> 0x00af, NullPointerException -> 0x00ad }
            if (r5 == 0) goto L_0x00d7
            r5.close()     // Catch:{ IOException -> 0x00a9 }
            goto L_0x00d7
        L_0x00a9:
            goto L_0x00d7
        L_0x00ab:
            r0 = move-exception
            goto L_0x00d0
        L_0x00ad:
            r3 = move-exception
            goto L_0x00b0
        L_0x00af:
            r3 = move-exception
        L_0x00b0:
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x00ab }
            if (r4 == 0) goto L_0x00ca
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r4.<init>()     // Catch:{ all -> 0x00ab }
            java.lang.String r7 = "Failed to open uri: "
            r4.append(r7)     // Catch:{ all -> 0x00ab }
            r4.append(r6)     // Catch:{ all -> 0x00ab }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00ab }
            android.util.Log.d(r0, r4, r3)     // Catch:{ all -> 0x00ab }
        L_0x00ca:
            if (r5 == 0) goto L_0x00d6
            r5.close()     // Catch:{ IOException -> 0x00d6 }
            goto L_0x00d6
        L_0x00d0:
            if (r5 == 0) goto L_0x00d5
            r5.close()     // Catch:{ IOException -> 0x00d5 }
        L_0x00d5:
            throw r0
        L_0x00d6:
            r0 = -1
        L_0x00d7:
            if (r0 == r2) goto L_0x00df
            com.bumptech.glide.load.data.g r2 = new com.bumptech.glide.load.data.g
            r2.<init>(r1, r0)
            r1 = r2
        L_0x00df:
            return r1
        L_0x00e0:
            r0 = move-exception
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "NPE opening uri: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " -> "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2)
            java.lang.Throwable r0 = r1.initCause(r0)
            java.io.FileNotFoundException r0 = (java.io.FileNotFoundException) r0
            throw r0
        L_0x0106:
            if (r5 == 0) goto L_0x010b
            r5.close()
        L_0x010b:
            goto L_0x010d
        L_0x010c:
            throw r0
        L_0x010d:
            goto L_0x010c
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.a.d():java.io.InputStream");
    }

    public com.bumptech.glide.load.a e() {
        return com.bumptech.glide.load.a.LOCAL;
    }

    public void f(f fVar, d.a<? super InputStream> aVar) {
        try {
            InputStream d10 = d();
            this.f21023c = d10;
            aVar.d(d10);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e10);
            }
            aVar.c(e10);
        }
    }
}

package t3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.d;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: ImageReader */
public interface r {

    /* compiled from: ImageReader */
    public static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        public final k f25664a;

        /* renamed from: b  reason: collision with root package name */
        public final n3.b f25665b;

        /* renamed from: c  reason: collision with root package name */
        public final List<ImageHeaderParser> f25666c;

        public a(InputStream inputStream, List<ImageHeaderParser> list, n3.b bVar) {
            if (bVar != null) {
                this.f25665b = bVar;
                if (list != null) {
                    this.f25666c = list;
                    this.f25664a = new k(inputStream, bVar);
                    return;
                }
                throw new NullPointerException("Argument must not be null");
            }
            throw new NullPointerException("Argument must not be null");
        }

        public Bitmap a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f25664a.a(), (Rect) null, options);
        }

        public void b() {
            v vVar = this.f25664a.f4987a;
            synchronized (vVar) {
                vVar.f25676c = vVar.f25674a.length;
            }
        }

        public int c() throws IOException {
            return d.a(this.f25666c, this.f25664a.a(), this.f25665b);
        }

        public ImageHeaderParser.ImageType d() throws IOException {
            return d.b(this.f25666c, this.f25664a.a(), this.f25665b);
        }
    }

    /* compiled from: ImageReader */
    public static final class b implements r {

        /* renamed from: a  reason: collision with root package name */
        public final n3.b f25667a;

        /* renamed from: b  reason: collision with root package name */
        public final List<ImageHeaderParser> f25668b;

        /* renamed from: c  reason: collision with root package name */
        public final ParcelFileDescriptorRewinder f25669c;

        public b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, n3.b bVar) {
            if (bVar != null) {
                this.f25667a = bVar;
                if (list != null) {
                    this.f25668b = list;
                    this.f25669c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
                    return;
                }
                throw new NullPointerException("Argument must not be null");
            }
            throw new NullPointerException("Argument must not be null");
        }

        public Bitmap a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f25669c.a().getFileDescriptor(), (Rect) null, options);
        }

        public void b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0040 A[SYNTHETIC, Splitter:B:19:0x0040] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int c() throws java.io.IOException {
            /*
                r11 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r11.f25668b
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r1 = r11.f25669c
                n3.b r2 = r11.f25667a
                int r3 = r0.size()
                r4 = 0
            L_0x000b:
                r5 = -1
                if (r4 >= r3) goto L_0x0047
                java.lang.Object r6 = r0.get(r4)
                com.bumptech.glide.load.ImageHeaderParser r6 = (com.bumptech.glide.load.ImageHeaderParser) r6
                r7 = 0
                t3.v r8 = new t3.v     // Catch:{ all -> 0x003d }
                java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ all -> 0x003d }
                android.os.ParcelFileDescriptor r10 = r1.a()     // Catch:{ all -> 0x003d }
                java.io.FileDescriptor r10 = r10.getFileDescriptor()     // Catch:{ all -> 0x003d }
                r9.<init>(r10)     // Catch:{ all -> 0x003d }
                r8.<init>(r9, r2)     // Catch:{ all -> 0x003d }
                int r6 = r6.c(r8, r2)     // Catch:{ all -> 0x003a }
                r8.close()     // Catch:{ IOException -> 0x002f }
                goto L_0x0030
            L_0x002f:
            L_0x0030:
                r1.a()
                if (r6 == r5) goto L_0x0037
                r5 = r6
                goto L_0x0047
            L_0x0037:
                int r4 = r4 + 1
                goto L_0x000b
            L_0x003a:
                r0 = move-exception
                r7 = r8
                goto L_0x003e
            L_0x003d:
                r0 = move-exception
            L_0x003e:
                if (r7 == 0) goto L_0x0043
                r7.close()     // Catch:{ IOException -> 0x0043 }
            L_0x0043:
                r1.a()
                throw r0
            L_0x0047:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: t3.r.b.c():int");
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0040 A[SYNTHETIC, Splitter:B:17:0x0040] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.bumptech.glide.load.ImageHeaderParser.ImageType d() throws java.io.IOException {
            /*
                r10 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r10.f25668b
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r1 = r10.f25669c
                n3.b r2 = r10.f25667a
                int r3 = r0.size()
                r4 = 0
            L_0x000b:
                if (r4 >= r3) goto L_0x0047
                java.lang.Object r5 = r0.get(r4)
                com.bumptech.glide.load.ImageHeaderParser r5 = (com.bumptech.glide.load.ImageHeaderParser) r5
                r6 = 0
                t3.v r7 = new t3.v     // Catch:{ all -> 0x003d }
                java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ all -> 0x003d }
                android.os.ParcelFileDescriptor r9 = r1.a()     // Catch:{ all -> 0x003d }
                java.io.FileDescriptor r9 = r9.getFileDescriptor()     // Catch:{ all -> 0x003d }
                r8.<init>(r9)     // Catch:{ all -> 0x003d }
                r7.<init>(r8, r2)     // Catch:{ all -> 0x003d }
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r5.b(r7)     // Catch:{ all -> 0x003a }
                r7.close()     // Catch:{ IOException -> 0x002e }
                goto L_0x002f
            L_0x002e:
            L_0x002f:
                r1.a()
                com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
                if (r5 == r6) goto L_0x0037
                goto L_0x0049
            L_0x0037:
                int r4 = r4 + 1
                goto L_0x000b
            L_0x003a:
                r0 = move-exception
                r6 = r7
                goto L_0x003e
            L_0x003d:
                r0 = move-exception
            L_0x003e:
                if (r6 == 0) goto L_0x0043
                r6.close()     // Catch:{ IOException -> 0x0043 }
            L_0x0043:
                r1.a()
                throw r0
            L_0x0047:
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            L_0x0049:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: t3.r.b.d():com.bumptech.glide.load.ImageHeaderParser$ImageType");
        }
    }

    Bitmap a(BitmapFactory.Options options) throws IOException;

    void b();

    int c() throws IOException;

    ImageHeaderParser.ImageType d() throws IOException;
}

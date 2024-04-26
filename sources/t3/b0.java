package t3;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import k3.d;
import m3.w;

/* compiled from: VideoDecoder */
public class b0<T> implements com.bumptech.glide.load.f<T, Bitmap> {

    /* renamed from: d  reason: collision with root package name */
    public static final k3.d<Long> f25608d = new k3.d<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e  reason: collision with root package name */
    public static final k3.d<Integer> f25609e = new k3.d<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f  reason: collision with root package name */
    public static final e f25610f = new e();

    /* renamed from: a  reason: collision with root package name */
    public final f<T> f25611a;

    /* renamed from: b  reason: collision with root package name */
    public final n3.e f25612b;

    /* renamed from: c  reason: collision with root package name */
    public final e f25613c;

    /* compiled from: VideoDecoder */
    public class a implements d.b<Long> {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f25614a = ByteBuffer.allocate(8);

        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
            Long l10 = (Long) obj;
            messageDigest.update(bArr);
            synchronized (this.f25614a) {
                this.f25614a.position(0);
                messageDigest.update(this.f25614a.putLong(l10.longValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder */
    public class b implements d.b<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f25615a = ByteBuffer.allocate(4);

        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
            Integer num = (Integer) obj;
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f25615a) {
                    this.f25615a.position(0);
                    messageDigest.update(this.f25615a.putInt(num.intValue()).array());
                }
            }
        }
    }

    /* compiled from: VideoDecoder */
    public static final class c implements f<AssetFileDescriptor> {
        public c(a aVar) {
        }

        public void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    /* compiled from: VideoDecoder */
    public static final class d implements f<ByteBuffer> {
        public void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            mediaMetadataRetriever.setDataSource(new c0(this, (ByteBuffer) obj));
        }
    }

    /* compiled from: VideoDecoder */
    public static class e {
    }

    /* compiled from: VideoDecoder */
    public interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t10);
    }

    /* compiled from: VideoDecoder */
    public static final class g implements f<ParcelFileDescriptor> {
        public void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
        }
    }

    /* compiled from: VideoDecoder */
    public static final class h extends RuntimeException {
        public h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public b0(n3.e eVar, f<T> fVar) {
        e eVar2 = f25610f;
        this.f25612b = eVar;
        this.f25611a = fVar;
        this.f25613c = eVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap c(android.media.MediaMetadataRetriever r9, long r10, int r12, int r13, int r14, t3.k r15) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L_0x0062
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 == r0) goto L_0x0062
            if (r14 == r0) goto L_0x0062
            t3.k r0 = t3.k.f25632d
            if (r15 == r0) goto L_0x0062
            r0 = 18
            java.lang.String r0 = r9.extractMetadata(r0)     // Catch:{ all -> 0x0053 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0053 }
            r1 = 19
            java.lang.String r1 = r9.extractMetadata(r1)     // Catch:{ all -> 0x0053 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x0053 }
            r2 = 24
            java.lang.String r2 = r9.extractMetadata(r2)     // Catch:{ all -> 0x0053 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ all -> 0x0053 }
            r3 = 90
            if (r2 == r3) goto L_0x0036
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 != r3) goto L_0x0039
        L_0x0036:
            r8 = r1
            r1 = r0
            r0 = r8
        L_0x0039:
            float r13 = r15.b(r0, r1, r13, r14)     // Catch:{ all -> 0x0053 }
            float r14 = (float) r0     // Catch:{ all -> 0x0053 }
            float r14 = r14 * r13
            int r6 = java.lang.Math.round(r14)     // Catch:{ all -> 0x0053 }
            float r14 = (float) r1     // Catch:{ all -> 0x0053 }
            float r13 = r13 * r14
            int r7 = java.lang.Math.round(r13)     // Catch:{ all -> 0x0053 }
            r2 = r9
            r3 = r10
            r5 = r12
            android.graphics.Bitmap r13 = r2.getScaledFrameAtTime(r3, r5, r6, r7)     // Catch:{ all -> 0x0053 }
            goto L_0x0063
        L_0x0053:
            r13 = move-exception
            r14 = 3
            java.lang.String r15 = "VideoDecoder"
            boolean r14 = android.util.Log.isLoggable(r15, r14)
            if (r14 == 0) goto L_0x0062
            java.lang.String r14 = "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame"
            android.util.Log.d(r15, r14, r13)
        L_0x0062:
            r13 = 0
        L_0x0063:
            if (r13 != 0) goto L_0x0069
            android.graphics.Bitmap r13 = r9.getFrameAtTime(r10, r12)
        L_0x0069:
            if (r13 == 0) goto L_0x006c
            return r13
        L_0x006c:
            t3.b0$h r9 = new t3.b0$h
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.b0.c(android.media.MediaMetadataRetriever, long, int, int, int, t3.k):android.graphics.Bitmap");
    }

    /* JADX INFO: finally extract failed */
    public w<Bitmap> a(T t10, int i10, int i11, k3.e eVar) throws IOException {
        long longValue = ((Long) eVar.c(f25608d)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) eVar.c(f25609e);
            if (num == null) {
                num = 2;
            }
            k kVar = (k) eVar.c(k.f25634f);
            if (kVar == null) {
                kVar = k.f25633e;
            }
            k kVar2 = kVar;
            this.f25613c.getClass();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                this.f25611a.a(mediaMetadataRetriever, t10);
                Bitmap c10 = c(mediaMetadataRetriever, longValue, num.intValue(), i10, i11, kVar2);
                mediaMetadataRetriever.release();
                return d.d(c10, this.f25612b);
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
                throw th;
            }
        } else {
            throw new IllegalArgumentException(a0.a("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", longValue));
        }
    }

    public boolean b(T t10, k3.e eVar) {
        return true;
    }
}

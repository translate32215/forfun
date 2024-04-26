package t3;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.e;
import g4.j;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import k3.d;
import m3.w;
import t3.r;

/* compiled from: Downsampler */
public final class l {

    /* renamed from: f  reason: collision with root package name */
    public static final d<com.bumptech.glide.load.b> f25636f = d.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", com.bumptech.glide.load.b.PREFER_ARGB_8888);

    /* renamed from: g  reason: collision with root package name */
    public static final d<e> f25637g = d.a("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", e.SRGB);

    /* renamed from: h  reason: collision with root package name */
    public static final d<Boolean> f25638h;

    /* renamed from: i  reason: collision with root package name */
    public static final d<Boolean> f25639i;

    /* renamed from: j  reason: collision with root package name */
    public static final Set<String> f25640j = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));

    /* renamed from: k  reason: collision with root package name */
    public static final b f25641k = new a();

    /* renamed from: l  reason: collision with root package name */
    public static final Set<ImageHeaderParser.ImageType> f25642l = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));

    /* renamed from: m  reason: collision with root package name */
    public static final Queue<BitmapFactory.Options> f25643m = new ArrayDeque(0);

    /* renamed from: a  reason: collision with root package name */
    public final n3.e f25644a;

    /* renamed from: b  reason: collision with root package name */
    public final DisplayMetrics f25645b;

    /* renamed from: c  reason: collision with root package name */
    public final n3.b f25646c;

    /* renamed from: d  reason: collision with root package name */
    public final List<ImageHeaderParser> f25647d;

    /* renamed from: e  reason: collision with root package name */
    public final q f25648e = q.a();

    /* compiled from: Downsampler */
    public class a implements b {
        public void a(n3.e eVar, Bitmap bitmap) {
        }

        public void b() {
        }
    }

    /* compiled from: Downsampler */
    public interface b {
        void a(n3.e eVar, Bitmap bitmap) throws IOException;

        void b();
    }

    static {
        d<k> dVar = k.f25634f;
        Boolean bool = Boolean.FALSE;
        f25638h = d.a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f25639i = d.a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        char[] cArr = j.f18467a;
    }

    public l(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, n3.e eVar, n3.b bVar) {
        this.f25647d = list;
        if (displayMetrics != null) {
            this.f25645b = displayMetrics;
            if (eVar != null) {
                this.f25644a = eVar;
                if (bVar != null) {
                    this.f25646c = bVar;
                    return;
                }
                throw new NullPointerException("Argument must not be null");
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0046 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap d(t3.r r5, android.graphics.BitmapFactory.Options r6, t3.l.b r7, n3.e r8) throws java.io.IOException {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto L_0x000c
            r7.b()
            r5.b()
        L_0x000c:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = t3.y.f25687b
            r4.lock()
            android.graphics.Bitmap r5 = r5.a(r6)     // Catch:{ IllegalArgumentException -> 0x0021 }
            r4.unlock()
            return r5
        L_0x001f:
            r5 = move-exception
            goto L_0x0048
        L_0x0021:
            r4 = move-exception
            java.io.IOException r1 = i(r4, r1, r2, r3, r6)     // Catch:{ all -> 0x001f }
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x001f }
            if (r2 == 0) goto L_0x0032
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch:{ all -> 0x001f }
        L_0x0032:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0047
            r8.b(r0)     // Catch:{ IOException -> 0x0046 }
            r0 = 0
            r6.inBitmap = r0     // Catch:{ IOException -> 0x0046 }
            android.graphics.Bitmap r5 = d(r5, r6, r7, r8)     // Catch:{ IOException -> 0x0046 }
            java.util.concurrent.locks.Lock r6 = t3.y.f25687b
            r6.unlock()
            return r5
        L_0x0046:
            throw r1     // Catch:{ all -> 0x001f }
        L_0x0047:
            throw r1     // Catch:{ all -> 0x001f }
        L_0x0048:
            java.util.concurrent.locks.Lock r6 = t3.y.f25687b
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.l.d(t3.r, android.graphics.BitmapFactory$Options, t3.l$b, n3.e):android.graphics.Bitmap");
    }

    @TargetApi(19)
    public static String e(Bitmap bitmap) {
        String str;
        if (bitmap == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            StringBuilder a10 = android.support.v4.media.a.a(" (");
            a10.append(bitmap.getAllocationByteCount());
            a10.append(")");
            str = a10.toString();
        } else {
            str = "";
        }
        StringBuilder a11 = android.support.v4.media.a.a("[");
        a11.append(bitmap.getWidth());
        a11.append("x");
        a11.append(bitmap.getHeight());
        a11.append("] ");
        a11.append(bitmap.getConfig());
        a11.append(str);
        return a11.toString();
    }

    public static int f(double d10) {
        if (d10 > 1.0d) {
            d10 = 1.0d / d10;
        }
        return (int) Math.round(d10 * 2.147483647E9d);
    }

    public static int[] g(r rVar, BitmapFactory.Options options, b bVar, n3.e eVar) throws IOException {
        options.inJustDecodeBounds = true;
        d(rVar, options, bVar, eVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    public static boolean h(int i10) {
        return i10 == 90 || i10 == 270;
    }

    public static IOException i(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + e(options.inBitmap), illegalArgumentException);
    }

    public static void j(BitmapFactory.Options options) {
        k(options);
        Queue<BitmapFactory.Options> queue = f25643m;
        synchronized (queue) {
            ((ArrayDeque) queue).offer(options);
        }
    }

    public static void k(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public static int l(double d10) {
        return (int) (d10 + 0.5d);
    }

    public w<Bitmap> a(InputStream inputStream, int i10, int i11, k3.e eVar, b bVar) throws IOException {
        return b(new r.a(inputStream, this.f25647d, this.f25646c), i10, i11, eVar, bVar);
    }

    public final w<Bitmap> b(r rVar, int i10, int i11, k3.e eVar, b bVar) throws IOException {
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        k3.e eVar2 = eVar;
        byte[] bArr = (byte[]) this.f25646c.f(65536, byte[].class);
        synchronized (l.class) {
            Queue<BitmapFactory.Options> queue = f25643m;
            synchronized (queue) {
                options = (BitmapFactory.Options) ((ArrayDeque) queue).poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                k(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        com.bumptech.glide.load.b bVar2 = (com.bumptech.glide.load.b) eVar2.c(f25636f);
        e eVar3 = (e) eVar2.c(f25637g);
        k kVar = (k) eVar2.c(k.f25634f);
        boolean booleanValue = ((Boolean) eVar2.c(f25638h)).booleanValue();
        d dVar = f25639i;
        try {
            return d.d(c(rVar, options2, kVar, bVar2, eVar3, eVar2.c(dVar) != null && ((Boolean) eVar2.c(dVar)).booleanValue(), i10, i11, booleanValue, bVar), this.f25644a);
        } finally {
            j(options2);
            this.f25646c.put(bArr);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0387  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x039f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0458  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0479  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0499  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x051d  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x05b9 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0295  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap c(t3.r r32, android.graphics.BitmapFactory.Options r33, t3.k r34, com.bumptech.glide.load.b r35, com.bumptech.glide.load.e r36, boolean r37, int r38, int r39, boolean r40, t3.l.b r41) throws java.io.IOException {
        /*
            r31 = this;
            r1 = r31
            r2 = r32
            r3 = r33
            r0 = r34
            r4 = r35
            r5 = r38
            r6 = r39
            r7 = r41
            int r8 = g4.f.f18457b
            long r8 = android.os.SystemClock.elapsedRealtimeNanos()
            n3.e r10 = r1.f25644a
            int[] r10 = g(r2, r3, r7, r10)
            r11 = 0
            r11 = r10[r11]
            r12 = 1
            r10 = r10[r12]
            java.lang.String r12 = r3.outMimeType
            r13 = -1
            if (r11 == r13) goto L_0x002d
            if (r10 != r13) goto L_0x002a
            goto L_0x002d
        L_0x002a:
            r13 = r37
            goto L_0x002e
        L_0x002d:
            r13 = 0
        L_0x002e:
            int r14 = r32.c()
            switch(r14) {
                case 3: goto L_0x003d;
                case 4: goto L_0x003d;
                case 5: goto L_0x003a;
                case 6: goto L_0x003a;
                case 7: goto L_0x0037;
                case 8: goto L_0x0037;
                default: goto L_0x0035;
            }
        L_0x0035:
            r15 = 0
            goto L_0x003f
        L_0x0037:
            r15 = 270(0x10e, float:3.78E-43)
            goto L_0x003f
        L_0x003a:
            r15 = 90
            goto L_0x003f
        L_0x003d:
            r15 = 180(0xb4, float:2.52E-43)
        L_0x003f:
            switch(r14) {
                case 2: goto L_0x004a;
                case 3: goto L_0x004a;
                case 4: goto L_0x004a;
                case 5: goto L_0x004a;
                case 6: goto L_0x004a;
                case 7: goto L_0x004a;
                case 8: goto L_0x004a;
                default: goto L_0x0042;
            }
        L_0x0042:
            r16 = 0
            r16 = r8
            r37 = r14
            r14 = 0
            goto L_0x0051
        L_0x004a:
            r16 = 1
            r16 = r8
            r37 = r14
            r14 = 1
        L_0x0051:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != r8) goto L_0x005f
            boolean r9 = h(r15)
            if (r9 == 0) goto L_0x005d
            r9 = r10
            goto L_0x0060
        L_0x005d:
            r9 = r11
            goto L_0x0060
        L_0x005f:
            r9 = r5
        L_0x0060:
            if (r6 != r8) goto L_0x006c
            boolean r8 = h(r15)
            if (r8 == 0) goto L_0x006a
            r8 = r11
            goto L_0x006d
        L_0x006a:
            r8 = r10
            goto L_0x006d
        L_0x006c:
            r8 = r6
        L_0x006d:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = r32.d()
            n3.e r5 = r1.f25644a
            r18 = r12
            java.lang.String r12 = "]"
            java.lang.String r4 = ", target density: "
            r19 = r13
            java.lang.String r13 = ", density: "
            r20 = r14
            java.lang.String r14 = "x"
            java.lang.String r1 = "Downsampler"
            if (r11 <= 0) goto L_0x02ec
            if (r10 > 0) goto L_0x0094
            r0 = 3
            r15 = r6
            r7 = r10
            r5 = r13
            r6 = r14
            r10 = r9
            r30 = r12
            r12 = r8
            r8 = r30
            goto L_0x02f7
        L_0x0094:
            boolean r21 = h(r15)
            r23 = r4
            if (r21 == 0) goto L_0x00a3
            r21 = r12
            r22 = r13
            r12 = r10
            r13 = r11
            goto L_0x00a9
        L_0x00a3:
            r21 = r12
            r22 = r13
            r13 = r10
            r12 = r11
        L_0x00a9:
            float r4 = r0.b(r12, r13, r9, r8)
            r24 = 0
            int r24 = (r4 > r24 ? 1 : (r4 == r24 ? 0 : -1))
            if (r24 <= 0) goto L_0x02a7
            r24 = r15
            int r15 = r0.a(r12, r13, r9, r8)
            if (r15 == 0) goto L_0x029f
            r25 = r10
            float r10 = (float) r12
            r26 = r14
            float r14 = r4 * r10
            r27 = r1
            double r0 = (double) r14
            int r0 = l(r0)
            float r1 = (float) r13
            float r14 = r4 * r1
            r29 = r8
            r28 = r9
            double r8 = (double) r14
            int r8 = l(r8)
            int r0 = r12 / r0
            int r8 = r13 / r8
            r9 = 1
            if (r15 != r9) goto L_0x00e1
            int r0 = java.lang.Math.max(r0, r8)
            goto L_0x00e5
        L_0x00e1:
            int r0 = java.lang.Math.min(r0, r8)
        L_0x00e5:
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 23
            if (r8 > r9) goto L_0x00f7
            java.util.Set<java.lang.String> r9 = f25640j
            java.lang.String r14 = r3.outMimeType
            boolean r9 = r9.contains(r14)
            if (r9 == 0) goto L_0x00f7
            r0 = 1
            goto L_0x010c
        L_0x00f7:
            int r0 = java.lang.Integer.highestOneBit(r0)
            r9 = 1
            int r0 = java.lang.Math.max(r9, r0)
            if (r15 != r9) goto L_0x010c
            float r9 = (float) r0
            r14 = 1065353216(0x3f800000, float:1.0)
            float r14 = r14 / r4
            int r9 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r9 >= 0) goto L_0x010c
            int r0 = r0 << 1
        L_0x010c:
            r3.inSampleSize = r0
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG
            if (r6 != r9) goto L_0x012e
            r5 = 8
            int r5 = java.lang.Math.min(r0, r5)
            float r5 = (float) r5
            float r10 = r10 / r5
            double r9 = (double) r10
            double r9 = java.lang.Math.ceil(r9)
            int r9 = (int) r9
            float r1 = r1 / r5
            double r12 = (double) r1
            double r12 = java.lang.Math.ceil(r12)
            int r1 = (int) r12
            int r5 = r0 / 8
            if (r5 <= 0) goto L_0x018d
            int r9 = r9 / r5
            int r1 = r1 / r5
            goto L_0x018d
        L_0x012e:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG
            if (r6 == r9) goto L_0x017e
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A
            if (r6 != r9) goto L_0x0137
            goto L_0x017e
        L_0x0137:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP
            if (r6 == r9) goto L_0x015f
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A
            if (r6 != r9) goto L_0x0140
            goto L_0x015f
        L_0x0140:
            int r1 = r12 % r0
            if (r1 != 0) goto L_0x014e
            int r1 = r13 % r0
            if (r1 == 0) goto L_0x0149
            goto L_0x014e
        L_0x0149:
            int r9 = r12 / r0
            int r1 = r13 / r0
            goto L_0x018d
        L_0x014e:
            int[] r1 = g(r2, r3, r7, r5)
            r5 = 0
            r5 = r1[r5]
            r9 = 1
            r1 = r1[r9]
            r9 = r34
            r10 = r28
            r12 = r29
            goto L_0x0194
        L_0x015f:
            r5 = 24
            if (r8 < r5) goto L_0x016f
            float r5 = (float) r0
            float r10 = r10 / r5
            int r9 = java.lang.Math.round(r10)
            float r1 = r1 / r5
            int r1 = java.lang.Math.round(r1)
            goto L_0x018d
        L_0x016f:
            float r5 = (float) r0
            float r10 = r10 / r5
            double r9 = (double) r10
            double r9 = java.lang.Math.floor(r9)
            int r9 = (int) r9
            float r1 = r1 / r5
            double r12 = (double) r1
            double r12 = java.lang.Math.floor(r12)
            goto L_0x018c
        L_0x017e:
            float r5 = (float) r0
            float r10 = r10 / r5
            double r9 = (double) r10
            double r9 = java.lang.Math.floor(r9)
            int r9 = (int) r9
            float r1 = r1 / r5
            double r12 = (double) r1
            double r12 = java.lang.Math.floor(r12)
        L_0x018c:
            int r1 = (int) r12
        L_0x018d:
            r5 = r9
            r10 = r28
            r12 = r29
            r9 = r34
        L_0x0194:
            float r9 = r9.b(r5, r1, r10, r12)
            double r13 = (double) r9
            r9 = 19
            if (r8 < r9) goto L_0x01f9
            int r8 = f(r13)
            r15 = r6
            double r6 = (double) r8
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r13)
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r13)
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r13)
            double r6 = r6 * r13
            int r6 = l(r6)
            float r7 = (float) r6
            float r8 = (float) r8
            float r7 = r7 / r8
            double r7 = (double) r7
            java.lang.Double.isNaN(r7)
            java.lang.Double.isNaN(r13)
            java.lang.Double.isNaN(r7)
            java.lang.Double.isNaN(r13)
            java.lang.Double.isNaN(r7)
            java.lang.Double.isNaN(r13)
            java.lang.Double.isNaN(r7)
            double r7 = r13 / r7
            r21 = r0
            r28 = r1
            double r0 = (double) r6
            java.lang.Double.isNaN(r0)
            java.lang.Double.isNaN(r0)
            java.lang.Double.isNaN(r0)
            java.lang.Double.isNaN(r0)
            double r7 = r7 * r0
            int r0 = l(r7)
            r3.inTargetDensity = r0
            int r0 = f(r13)
            r3.inDensity = r0
            goto L_0x01fe
        L_0x01f9:
            r21 = r0
            r28 = r1
            r15 = r6
        L_0x01fe:
            int r0 = r3.inTargetDensity
            if (r0 <= 0) goto L_0x020a
            int r1 = r3.inDensity
            if (r1 <= 0) goto L_0x020a
            if (r0 == r1) goto L_0x020a
            r0 = 1
            goto L_0x020b
        L_0x020a:
            r0 = 0
        L_0x020b:
            if (r0 == 0) goto L_0x0211
            r0 = 1
            r3.inScaled = r0
            goto L_0x0216
        L_0x0211:
            r0 = 0
            r3.inTargetDensity = r0
            r3.inDensity = r0
        L_0x0216:
            r0 = 2
            r1 = r27
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L_0x0295
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Calculate scaling, source: ["
            r0.append(r6)
            r0.append(r11)
            r6 = r26
            r0.append(r6)
            r7 = r25
            r0.append(r7)
            java.lang.String r8 = "], degreesToRotate: "
            r0.append(r8)
            r8 = r24
            r0.append(r8)
            java.lang.String r8 = ", target: ["
            r0.append(r8)
            r0.append(r10)
            r0.append(r6)
            r0.append(r12)
            java.lang.String r8 = "], power of two scaled: ["
            r0.append(r8)
            r0.append(r5)
            r0.append(r6)
            r5 = r28
            r0.append(r5)
            java.lang.String r5 = "], exact scale factor: "
            r0.append(r5)
            r0.append(r4)
            java.lang.String r4 = ", power of 2 sample size: "
            r0.append(r4)
            r4 = r21
            r0.append(r4)
            java.lang.String r4 = ", adjusted scale factor: "
            r0.append(r4)
            r0.append(r13)
            r4 = r23
            r0.append(r4)
            int r5 = r3.inTargetDensity
            r0.append(r5)
            r5 = r22
            r0.append(r5)
            int r8 = r3.inDensity
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r1, r0)
            goto L_0x0324
        L_0x0295:
            r5 = r22
            r4 = r23
            r7 = r25
            r6 = r26
            goto L_0x0324
        L_0x029f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot round with null rounding"
            r0.<init>(r1)
            throw r0
        L_0x02a7:
            r12 = r8
            r7 = r10
            r6 = r14
            r10 = r9
            r9 = r0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot scale with factor: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = " from: "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = ", source: ["
            r1.append(r2)
            r1.append(r11)
            r1.append(r6)
            r1.append(r7)
            java.lang.String r2 = "], target: ["
            r1.append(r2)
            r1.append(r10)
            r1.append(r6)
            r1.append(r12)
            r8 = r21
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x02ec:
            r15 = r6
            r7 = r10
            r5 = r13
            r6 = r14
            r10 = r9
            r30 = r12
            r12 = r8
            r8 = r30
            r0 = 3
        L_0x02f7:
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L_0x0324
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = "Unable to determine dimensions for: "
            r0.append(r9)
            r9 = r15
            r0.append(r9)
            java.lang.String r13 = " with target ["
            r0.append(r13)
            r0.append(r10)
            r0.append(r6)
            r0.append(r12)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
            goto L_0x0325
        L_0x0324:
            r9 = r15
        L_0x0325:
            r8 = r1
            r1 = r31
            t3.q r0 = r1.f25648e
            r13 = r19
            r14 = r20
            boolean r0 = r0.b(r10, r12, r13, r14)
            if (r0 == 0) goto L_0x033b
            android.graphics.Bitmap$Config r13 = android.graphics.Bitmap.Config.HARDWARE
            r3.inPreferredConfig = r13
            r13 = 0
            r3.inMutable = r13
        L_0x033b:
            if (r0 == 0) goto L_0x033f
            r13 = r4
            goto L_0x0381
        L_0x033f:
            com.bumptech.glide.load.b r0 = com.bumptech.glide.load.b.PREFER_ARGB_8888
            r13 = r4
            r4 = r35
            if (r4 == r0) goto L_0x037d
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = r32.d()     // Catch:{ IOException -> 0x034f }
            boolean r0 = r0.hasAlpha()     // Catch:{ IOException -> 0x034f }
            goto L_0x036c
        L_0x034f:
            r0 = move-exception
            r14 = 3
            boolean r14 = android.util.Log.isLoggable(r8, r14)
            if (r14 == 0) goto L_0x036b
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Cannot determine whether the image has alpha or not from header, format "
            r14.append(r15)
            r14.append(r4)
            java.lang.String r4 = r14.toString()
            android.util.Log.d(r8, r4, r0)
        L_0x036b:
            r0 = 0
        L_0x036c:
            if (r0 == 0) goto L_0x0371
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            goto L_0x0373
        L_0x0371:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
        L_0x0373:
            r3.inPreferredConfig = r0
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.RGB_565
            if (r0 != r4) goto L_0x0381
            r0 = 1
            r3.inDither = r0
            goto L_0x0381
        L_0x037d:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r3.inPreferredConfig = r0
        L_0x0381:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 19
            if (r0 < r4) goto L_0x0389
            r4 = 1
            goto L_0x038a
        L_0x0389:
            r4 = 0
        L_0x038a:
            int r14 = r3.inSampleSize
            r15 = 1
            if (r14 == r15) goto L_0x0391
            if (r4 == 0) goto L_0x0454
        L_0x0391:
            r14 = 19
            if (r0 < r14) goto L_0x0397
            r9 = 1
            goto L_0x039d
        L_0x0397:
            java.util.Set<com.bumptech.glide.load.ImageHeaderParser$ImageType> r14 = f25642l
            boolean r9 = r14.contains(r9)
        L_0x039d:
            if (r9 == 0) goto L_0x0454
            if (r11 < 0) goto L_0x03aa
            if (r7 < 0) goto L_0x03aa
            if (r40 == 0) goto L_0x03aa
            if (r4 == 0) goto L_0x03aa
        L_0x03a7:
            r9 = r10
            goto L_0x0435
        L_0x03aa:
            int r4 = r3.inTargetDensity
            if (r4 <= 0) goto L_0x03b6
            int r9 = r3.inDensity
            if (r9 <= 0) goto L_0x03b6
            if (r4 == r9) goto L_0x03b6
            r9 = 1
            goto L_0x03b7
        L_0x03b6:
            r9 = 0
        L_0x03b7:
            if (r9 == 0) goto L_0x03bf
            float r4 = (float) r4
            int r9 = r3.inDensity
            float r9 = (float) r9
            float r4 = r4 / r9
            goto L_0x03c1
        L_0x03bf:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x03c1:
            int r9 = r3.inSampleSize
            float r10 = (float) r11
            float r12 = (float) r9
            float r10 = r10 / r12
            double r14 = (double) r10
            double r14 = java.lang.Math.ceil(r14)
            int r10 = (int) r14
            float r14 = (float) r7
            float r14 = r14 / r12
            double r14 = (double) r14
            double r14 = java.lang.Math.ceil(r14)
            int r12 = (int) r14
            float r10 = (float) r10
            float r10 = r10 * r4
            int r10 = java.lang.Math.round(r10)
            float r12 = (float) r12
            float r12 = r12 * r4
            int r12 = java.lang.Math.round(r12)
            r14 = 2
            boolean r14 = android.util.Log.isLoggable(r8, r14)
            if (r14 == 0) goto L_0x03a7
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Calculated target ["
            r14.append(r15)
            r14.append(r10)
            r14.append(r6)
            r14.append(r12)
            java.lang.String r15 = "] for source ["
            r14.append(r15)
            r14.append(r11)
            r14.append(r6)
            r14.append(r7)
            java.lang.String r15 = "], sampleSize: "
            r14.append(r15)
            r14.append(r9)
            java.lang.String r9 = ", targetDensity: "
            r14.append(r9)
            int r9 = r3.inTargetDensity
            r14.append(r9)
            r14.append(r5)
            int r9 = r3.inDensity
            r14.append(r9)
            java.lang.String r9 = ", density multiplier: "
            r14.append(r9)
            r14.append(r4)
            java.lang.String r4 = r14.toString()
            android.util.Log.v(r8, r4)
            goto L_0x03a7
        L_0x0435:
            if (r9 <= 0) goto L_0x0454
            if (r12 <= 0) goto L_0x0454
            n3.e r4 = r1.f25644a
            r10 = 26
            if (r0 < r10) goto L_0x0449
            android.graphics.Bitmap$Config r10 = r3.inPreferredConfig
            android.graphics.Bitmap$Config r14 = android.graphics.Bitmap.Config.HARDWARE
            if (r10 != r14) goto L_0x0446
            goto L_0x0454
        L_0x0446:
            android.graphics.Bitmap$Config r10 = r3.outConfig
            goto L_0x044a
        L_0x0449:
            r10 = 0
        L_0x044a:
            if (r10 != 0) goto L_0x044e
            android.graphics.Bitmap$Config r10 = r3.inPreferredConfig
        L_0x044e:
            android.graphics.Bitmap r4 = r4.e(r9, r12, r10)
            r3.inBitmap = r4
        L_0x0454:
            r4 = 28
            if (r0 < r4) goto L_0x0479
            com.bumptech.glide.load.e r0 = com.bumptech.glide.load.e.DISPLAY_P3
            r4 = r36
            if (r4 != r0) goto L_0x046a
            android.graphics.ColorSpace r0 = r3.outColorSpace
            if (r0 == 0) goto L_0x046a
            boolean r0 = r0.isWideGamut()
            if (r0 == 0) goto L_0x046a
            r0 = 1
            goto L_0x046b
        L_0x046a:
            r0 = 0
        L_0x046b:
            if (r0 == 0) goto L_0x0470
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.DISPLAY_P3
            goto L_0x0472
        L_0x0470:
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
        L_0x0472:
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r3.inPreferredColorSpace = r0
            goto L_0x0485
        L_0x0479:
            r4 = 26
            if (r0 < r4) goto L_0x0485
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r3.inPreferredColorSpace = r0
        L_0x0485:
            n3.e r0 = r1.f25644a
            r4 = r41
            android.graphics.Bitmap r0 = d(r2, r3, r4, r0)
            n3.e r2 = r1.f25644a
            r4.a(r2, r0)
            r2 = 2
            boolean r2 = android.util.Log.isLoggable(r8, r2)
            if (r2 == 0) goto L_0x051b
            java.lang.String r2 = "Decoded "
            java.lang.StringBuilder r2 = android.support.v4.media.a.a(r2)
            java.lang.String r4 = e(r0)
            r2.append(r4)
            java.lang.String r4 = " from ["
            r2.append(r4)
            r2.append(r11)
            r2.append(r6)
            r2.append(r7)
            java.lang.String r4 = "] "
            r2.append(r4)
            r4 = r18
            r2.append(r4)
            java.lang.String r4 = " with inBitmap "
            r2.append(r4)
            android.graphics.Bitmap r4 = r3.inBitmap
            java.lang.String r4 = e(r4)
            r2.append(r4)
            java.lang.String r4 = " for ["
            r2.append(r4)
            r4 = r38
            r2.append(r4)
            r2.append(r6)
            r4 = r39
            r2.append(r4)
            java.lang.String r4 = "], sample size: "
            r2.append(r4)
            int r4 = r3.inSampleSize
            r2.append(r4)
            r2.append(r5)
            int r4 = r3.inDensity
            r2.append(r4)
            r2.append(r13)
            int r3 = r3.inTargetDensity
            r2.append(r3)
            java.lang.String r3 = ", thread: "
            r2.append(r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r3 = ", duration: "
            r2.append(r3)
            double r3 = g4.f.a(r16)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r8, r2)
        L_0x051b:
            if (r0 == 0) goto L_0x05b9
            android.util.DisplayMetrics r2 = r1.f25645b
            int r2 = r2.densityDpi
            r0.setDensity(r2)
            n3.e r2 = r1.f25644a
            switch(r37) {
                case 2: goto L_0x052b;
                case 3: goto L_0x052b;
                case 4: goto L_0x052b;
                case 5: goto L_0x052b;
                case 6: goto L_0x052b;
                case 7: goto L_0x052b;
                case 8: goto L_0x052b;
                default: goto L_0x0529;
            }
        L_0x0529:
            r3 = 0
            goto L_0x052c
        L_0x052b:
            r3 = 1
        L_0x052c:
            if (r3 != 0) goto L_0x0531
            r15 = r0
            goto L_0x05ad
        L_0x0531:
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r4 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r5 = 1119092736(0x42b40000, float:90.0)
            r6 = 1127481344(0x43340000, float:180.0)
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r37) {
                case 2: goto L_0x0569;
                case 3: goto L_0x0565;
                case 4: goto L_0x055c;
                case 5: goto L_0x0553;
                case 6: goto L_0x054f;
                case 7: goto L_0x0546;
                case 8: goto L_0x0542;
                default: goto L_0x0541;
            }
        L_0x0541:
            goto L_0x056e
        L_0x0542:
            r3.setRotate(r4)
            goto L_0x056e
        L_0x0546:
            r3.setRotate(r4)
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.postScale(r7, r4)
            goto L_0x056e
        L_0x054f:
            r3.setRotate(r5)
            goto L_0x056e
        L_0x0553:
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.setRotate(r5)
            r3.postScale(r7, r4)
            goto L_0x056e
        L_0x055c:
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.setRotate(r6)
            r3.postScale(r7, r4)
            goto L_0x056e
        L_0x0565:
            r3.setRotate(r6)
            goto L_0x056e
        L_0x0569:
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.setScale(r7, r4)
        L_0x056e:
            android.graphics.RectF r4 = new android.graphics.RectF
            int r5 = r0.getWidth()
            float r5 = (float) r5
            int r6 = r0.getHeight()
            float r6 = (float) r6
            r7 = 0
            r4.<init>(r7, r7, r5, r6)
            r3.mapRect(r4)
            float r5 = r4.width()
            int r5 = java.lang.Math.round(r5)
            float r6 = r4.height()
            int r6 = java.lang.Math.round(r6)
            android.graphics.Bitmap$Config r7 = t3.y.c(r0)
            android.graphics.Bitmap r2 = r2.a(r5, r6, r7)
            float r5 = r4.left
            float r5 = -r5
            float r4 = r4.top
            float r4 = -r4
            r3.postTranslate(r5, r4)
            boolean r4 = r0.hasAlpha()
            r2.setHasAlpha(r4)
            t3.y.a(r0, r2, r3)
            r15 = r2
        L_0x05ad:
            boolean r2 = r0.equals(r15)
            if (r2 != 0) goto L_0x05ba
            n3.e r2 = r1.f25644a
            r2.b(r0)
            goto L_0x05ba
        L_0x05b9:
            r15 = 0
        L_0x05ba:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.l.c(t3.r, android.graphics.BitmapFactory$Options, t3.k, com.bumptech.glide.load.b, com.bumptech.glide.load.e, boolean, int, int, boolean, t3.l$b):android.graphics.Bitmap");
    }
}

package t3;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* compiled from: DefaultImageHeaderParser */
public final class j implements ImageHeaderParser {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f25624a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f25625b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* compiled from: DefaultImageHeaderParser */
    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f25626a;

        public a(ByteBuffer byteBuffer) {
            this.f25626a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public long b(long j10) {
            int min = (int) Math.min((long) this.f25626a.remaining(), j10);
            ByteBuffer byteBuffer = this.f25626a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }

        public int c(byte[] bArr, int i10) {
            int min = Math.min(i10, this.f25626a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f25626a.get(bArr, 0, min);
            return min;
        }

        public short d() throws c.a {
            if (this.f25626a.remaining() >= 1) {
                return (short) (this.f25626a.get() & 255);
            }
            throw new c.a();
        }

        public int e() throws c.a {
            return (d() << 8) | d();
        }
    }

    /* compiled from: DefaultImageHeaderParser */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f25627a;

        public b(byte[] bArr, int i10) {
            this.f25627a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        public short a(int i10) {
            if (this.f25627a.remaining() - i10 >= 2) {
                return this.f25627a.getShort(i10);
            }
            return -1;
        }

        public int b(int i10) {
            if (this.f25627a.remaining() - i10 >= 4) {
                return this.f25627a.getInt(i10);
            }
            return -1;
        }
    }

    /* compiled from: DefaultImageHeaderParser */
    public interface c {

        /* compiled from: DefaultImageHeaderParser */
        public static final class a extends IOException {
            public a() {
                super("Unexpectedly reached end of a file");
            }
        }

        long b(long j10) throws IOException;

        int c(byte[] bArr, int i10) throws IOException;

        short d() throws IOException;

        int e() throws IOException;
    }

    /* compiled from: DefaultImageHeaderParser */
    public static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        public final InputStream f25628a;

        public d(InputStream inputStream) {
            this.f25628a = inputStream;
        }

        public long b(long j10) throws IOException {
            if (j10 < 0) {
                return 0;
            }
            long j11 = j10;
            while (j11 > 0) {
                long skip = this.f25628a.skip(j11);
                if (skip <= 0) {
                    if (this.f25628a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j11 -= skip;
            }
            return j10 - j11;
        }

        public int c(byte[] bArr, int i10) throws IOException {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10 && (i12 = this.f25628a.read(bArr, i11, i10 - i11)) != -1) {
                i11 += i12;
            }
            if (i11 != 0 || i12 != -1) {
                return i11;
            }
            throw new c.a();
        }

        public short d() throws IOException {
            int read = this.f25628a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new c.a();
        }

        public int e() throws IOException {
            return (d() << 8) | d();
        }
    }

    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            return d(new a(byteBuffer));
        }
        throw new NullPointerException("Argument must not be null");
    }

    public ImageHeaderParser.ImageType b(InputStream inputStream) throws IOException {
        if (inputStream != null) {
            return d(new d(inputStream));
        }
        throw new NullPointerException("Argument must not be null");
    }

    public int c(InputStream inputStream, n3.b bVar) throws IOException {
        byte[] bArr;
        if (inputStream != null) {
            d dVar = new d(inputStream);
            if (bVar != null) {
                try {
                    int e10 = dVar.e();
                    if ((e10 & 65496) == 65496 || e10 == 19789 || e10 == 18761) {
                        int e11 = e(dVar);
                        if (e11 != -1) {
                            bArr = (byte[]) bVar.f(e11, byte[].class);
                            int f10 = f(dVar, bArr, e11);
                            bVar.put(bArr);
                            return f10;
                        } else if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                            return -1;
                        } else {
                            Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                            return -1;
                        }
                    } else if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                        return -1;
                    } else {
                        Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + e10);
                        return -1;
                    }
                } catch (c.a unused) {
                    return -1;
                } catch (Throwable th) {
                    bVar.put(bArr);
                    throw th;
                }
            } else {
                throw new NullPointerException("Argument must not be null");
            }
        } else {
            throw new NullPointerException("Argument must not be null");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bumptech.glide.load.ImageHeaderParser.ImageType d(t3.j.c r6) throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r6.e()     // Catch:{ a -> 0x00a0 }
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto L_0x000c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x000c:
            int r0 = r0 << 8
            short r1 = r6.d()     // Catch:{ a -> 0x00a0 }
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L_0x001b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x001b:
            int r0 = r0 << 8
            short r1 = r6.d()     // Catch:{ a -> 0x00a0 }
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L_0x003c
            r0 = 21
            r6.b(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.d()     // Catch:{ a -> 0x0039 }
            r0 = 3
            if (r6 < r0) goto L_0x0036
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A     // Catch:{ a -> 0x0039 }
            goto L_0x0038
        L_0x0036:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x0039 }
        L_0x0038:
            return r6
        L_0x0039:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x003c:
            r1 = 1380533830(0x52494646, float:2.16116855E11)
            if (r0 == r1) goto L_0x0044
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x0044:
            r0 = 4
            r6.b(r0)     // Catch:{ a -> 0x00a0 }
            int r2 = r6.e()     // Catch:{ a -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r6.e()     // Catch:{ a -> 0x00a0 }
            r2 = r2 | r3
            r3 = 1464156752(0x57454250, float:2.16888601E14)
            if (r2 == r3) goto L_0x005c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x005c:
            int r2 = r6.e()     // Catch:{ a -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r6.e()     // Catch:{ a -> 0x00a0 }
            r2 = r2 | r3
            r3 = r2 & -256(0xffffffffffffff00, float:NaN)
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r3 == r4) goto L_0x0071
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x0071:
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 88
            if (r2 != r3) goto L_0x0088
            r6.b(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.d()     // Catch:{ a -> 0x00a0 }
            r6 = r6 & 16
            if (r6 == 0) goto L_0x0085
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00a0 }
            goto L_0x0087
        L_0x0085:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
        L_0x0087:
            return r6
        L_0x0088:
            r3 = 76
            if (r2 != r3) goto L_0x009d
            r6.b(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.d()     // Catch:{ a -> 0x00a0 }
            r6 = r6 & 8
            if (r6 == 0) goto L_0x009a
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00a0 }
            goto L_0x009c
        L_0x009a:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
        L_0x009c:
            return r6
        L_0x009d:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x00a0:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.j.d(t3.j$c):com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    public final int e(c cVar) throws IOException {
        short d10;
        int e10;
        long j10;
        long b10;
        do {
            short d11 = cVar.d();
            if (d11 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + d11);
                }
                return -1;
            }
            d10 = cVar.d();
            if (d10 == 218) {
                return -1;
            }
            if (d10 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            e10 = cVar.e() - 2;
            if (d10 == 225) {
                return e10;
            }
            j10 = (long) e10;
            b10 = cVar.b(j10);
        } while (b10 == j10);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + d10 + ", wanted to skip: " + e10 + ", but actually skipped: " + b10);
        }
        return -1;
    }

    public final int f(c cVar, byte[] bArr, int i10) throws IOException {
        ByteOrder byteOrder;
        int c10 = cVar.c(bArr, i10);
        if (c10 != i10) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i10 + ", actually read: " + c10);
            }
            return -1;
        }
        boolean z10 = bArr != null && i10 > f25624a.length;
        if (z10) {
            int i11 = 0;
            while (true) {
                byte[] bArr2 = f25624a;
                if (i11 >= bArr2.length) {
                    break;
                } else if (bArr[i11] != bArr2[i11]) {
                    z10 = false;
                    break;
                } else {
                    i11++;
                }
            }
        }
        if (z10) {
            b bVar = new b(bArr, i10);
            short a10 = bVar.a(6);
            if (a10 == 18761) {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            } else if (a10 != 19789) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + a10);
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.BIG_ENDIAN;
            }
            bVar.f25627a.order(byteOrder);
            int b10 = bVar.b(10) + 6;
            short a11 = bVar.a(b10);
            for (int i12 = 0; i12 < a11; i12++) {
                int i13 = (i12 * 12) + b10 + 2;
                short a12 = bVar.a(i13);
                if (a12 == 274) {
                    short a13 = bVar.a(i13 + 2);
                    if (a13 >= 1 && a13 <= 12) {
                        int b11 = bVar.b(i13 + 4);
                        if (b11 >= 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got tagIndex=" + i12 + " tagType=" + a12 + " formatCode=" + a13 + " componentCount=" + b11);
                            }
                            int i14 = b11 + f25625b[a13];
                            if (i14 <= 4) {
                                int i15 = i13 + 8;
                                if (i15 < 0 || i15 > bVar.f25627a.remaining()) {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i15 + " tagType=" + a12);
                                    }
                                } else if (i14 >= 0 && i14 + i15 <= bVar.f25627a.remaining()) {
                                    return bVar.a(i15);
                                } else {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + a12);
                                    }
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + a13);
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Got invalid format code = " + a13);
                    }
                }
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }
}

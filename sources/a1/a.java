package a1;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.y0;
import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* compiled from: ExifInterface */
public class a {
    public static final byte[] A = {73, 72, 68, 82};
    public static final byte[] B = {73, 69, 78, 68};
    public static final byte[] C = {82, 73, 70, 70};
    public static final byte[] D = {87, 69, 66, 80};
    public static final byte[] E = {69, 88, 73, 70};
    public static final String[] F = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] G = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] H = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final d I = new d("StripOffsets", 273, 3);
    public static final d[][] J;
    public static final d[] K = {new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
    public static final HashMap<Integer, ExifInterface.ExifTag>[] L = new HashMap[10];
    public static final HashMap<String, ExifInterface.ExifTag>[] M = new HashMap[10];
    public static final HashSet<String> N = new HashSet<>(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
    public static final HashMap<Integer, Integer> O = new HashMap<>();
    public static final Charset P;
    public static final byte[] Q;
    public static final byte[] R;

    /* renamed from: n  reason: collision with root package name */
    public static final boolean f4n = Log.isLoggable("ExifInterface", 3);

    /* renamed from: o  reason: collision with root package name */
    public static final List<Integer> f5o = Arrays.asList(new Integer[]{1, 6, 3, 8});

    /* renamed from: p  reason: collision with root package name */
    public static final List<Integer> f6p = Arrays.asList(new Integer[]{2, 7, 4, 5});

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f7q = {8, 8, 8};

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f8r = {8};

    /* renamed from: s  reason: collision with root package name */
    public static final byte[] f9s = {-1, -40, -1};

    /* renamed from: t  reason: collision with root package name */
    public static final byte[] f10t = {102, 116, 121, 112};

    /* renamed from: u  reason: collision with root package name */
    public static final byte[] f11u = {109, 105, 102, 49};

    /* renamed from: v  reason: collision with root package name */
    public static final byte[] f12v = {104, 101, 105, 99};

    /* renamed from: w  reason: collision with root package name */
    public static final byte[] f13w = {79, 76, 89, 77, 80, 0};

    /* renamed from: x  reason: collision with root package name */
    public static final byte[] f14x = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: y  reason: collision with root package name */
    public static final byte[] f15y = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: z  reason: collision with root package name */
    public static final byte[] f16z = {101, 88, 73, 102};

    /* renamed from: a  reason: collision with root package name */
    public FileDescriptor f17a;

    /* renamed from: b  reason: collision with root package name */
    public AssetManager.AssetInputStream f18b;

    /* renamed from: c  reason: collision with root package name */
    public int f19c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f20d;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<String, ExifInterface.ExifAttribute>[] f21e;

    /* renamed from: f  reason: collision with root package name */
    public Set<Integer> f22f;

    /* renamed from: g  reason: collision with root package name */
    public ByteOrder f23g = ByteOrder.BIG_ENDIAN;

    /* renamed from: h  reason: collision with root package name */
    public boolean f24h;

    /* renamed from: i  reason: collision with root package name */
    public int f25i;

    /* renamed from: j  reason: collision with root package name */
    public int f26j;

    /* renamed from: k  reason: collision with root package name */
    public int f27k;

    /* renamed from: l  reason: collision with root package name */
    public int f28l;

    /* renamed from: m  reason: collision with root package name */
    public int f29m;

    /* renamed from: a1.a$a  reason: collision with other inner class name */
    /* compiled from: ExifInterface */
    public class C0002a extends MediaDataSource {

        /* renamed from: a  reason: collision with root package name */
        public long f30a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b f31b;

        public C0002a(a aVar, b bVar) {
            this.f31b = bVar;
        }

        public void close() throws IOException {
        }

        public long getSize() throws IOException {
            return -1;
        }

        public int readAt(long j10, byte[] bArr, int i10, int i11) throws IOException {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f30a;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + ((long) this.f31b.available())) {
                        return -1;
                    }
                    this.f31b.d(j10);
                    this.f30a = j10;
                }
                if (i11 > this.f31b.available()) {
                    i11 = this.f31b.available();
                }
                b bVar = this.f31b;
                int read = bVar.f34a.read(bArr, i10, i11);
                bVar.f37d += read;
                if (read >= 0) {
                    this.f30a += (long) read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f30a = -1;
            return -1;
        }
    }

    /* compiled from: ExifInterface */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final long f45a;

        /* renamed from: b  reason: collision with root package name */
        public final long f46b;

        public e(long j10, long j11) {
            if (j11 == 0) {
                this.f45a = 0;
                this.f46b = 1;
                return;
            }
            this.f45a = j10;
            this.f46b = j11;
        }

        public String toString() {
            return this.f45a + "/" + this.f46b;
        }
    }

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        "XMP ".getBytes(Charset.defaultCharset());
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        J = new d[][]{dVarArr, new d[]{new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)}, new d[]{new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)}, new d[]{new d("InteroperabilityIndex", 1, 2)}, new d[]{new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)}, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        Charset forName = Charset.forName("US-ASCII");
        P = forName;
        Q = "Exif\u0000\u0000".getBytes(forName);
        R = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            d[][] dVarArr2 = J;
            if (i10 < dVarArr2.length) {
                L[i10] = new HashMap<>();
                M[i10] = new HashMap<>();
                for (d dVar : dVarArr2[i10]) {
                    L[i10].put(Integer.valueOf(dVar.f41a), dVar);
                    M[i10].put(dVar.f42b, dVar);
                }
                i10++;
            } else {
                HashMap<Integer, Integer> hashMap = O;
                d[] dVarArr3 = K;
                hashMap.put(Integer.valueOf(dVarArr3[0].f41a), 5);
                hashMap.put(Integer.valueOf(dVarArr3[1].f41a), 1);
                hashMap.put(Integer.valueOf(dVarArr3[2].f41a), 2);
                hashMap.put(Integer.valueOf(dVarArr3[3].f41a), 3);
                hashMap.put(Integer.valueOf(dVarArr3[4].f41a), 7);
                hashMap.put(Integer.valueOf(dVarArr3[5].f41a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(java.io.InputStream r10) throws java.io.IOException {
        /*
            r9 = this;
            r9.<init>()
            a1.a$d[][] r0 = J
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r9.f21e = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r9.f22f = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r9.f23g = r0
            if (r10 == 0) goto L_0x00dd
            r0 = 0
            r1 = 5000(0x1388, float:7.006E-42)
            java.lang.String r2 = "ExifInterface"
            boolean r3 = r10 instanceof android.content.res.AssetManager.AssetInputStream
            r4 = 0
            if (r3 == 0) goto L_0x002a
            r3 = r10
            android.content.res.AssetManager$AssetInputStream r3 = (android.content.res.AssetManager.AssetInputStream) r3
            r9.f18b = r3
            r9.f17a = r0
            goto L_0x005e
        L_0x002a:
            boolean r3 = r10 instanceof java.io.FileInputStream
            if (r3 == 0) goto L_0x005a
            r3 = r10
            java.io.FileInputStream r3 = (java.io.FileInputStream) r3
            java.io.FileDescriptor r5 = r3.getFD()
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 21
            if (r6 < r7) goto L_0x004e
            r6 = 0
            int r8 = android.system.OsConstants.SEEK_CUR     // Catch:{ Exception -> 0x0044 }
            android.system.Os.lseek(r5, r6, r8)     // Catch:{ Exception -> 0x0044 }
            r5 = 1
            goto L_0x004f
        L_0x0044:
            boolean r5 = f4n
            if (r5 == 0) goto L_0x004e
            java.lang.String r5 = "The file descriptor for the given input is not seekable"
            android.util.Log.d(r2, r5)
        L_0x004e:
            r5 = 0
        L_0x004f:
            if (r5 == 0) goto L_0x005a
            r9.f18b = r0
            java.io.FileDescriptor r0 = r3.getFD()
            r9.f17a = r0
            goto L_0x005e
        L_0x005a:
            r9.f18b = r0
            r9.f17a = r0
        L_0x005e:
            r0 = 0
        L_0x005f:
            a1.a$d[][] r3 = J     // Catch:{ IOException -> 0x00bf }
            int r3 = r3.length     // Catch:{ IOException -> 0x00bf }
            if (r0 >= r3) goto L_0x0070
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r9.f21e     // Catch:{ IOException -> 0x00bf }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ IOException -> 0x00bf }
            r5.<init>()     // Catch:{ IOException -> 0x00bf }
            r3[r0] = r5     // Catch:{ IOException -> 0x00bf }
            int r0 = r0 + 1
            goto L_0x005f
        L_0x0070:
            boolean r0 = r9.f20d     // Catch:{ IOException -> 0x00bf }
            if (r0 != 0) goto L_0x0080
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x00bf }
            r0.<init>(r10, r1)     // Catch:{ IOException -> 0x00bf }
            int r10 = r9.h(r0)     // Catch:{ IOException -> 0x00bf }
            r9.f19c = r10     // Catch:{ IOException -> 0x00bf }
            r10 = r0
        L_0x0080:
            a1.a$b r0 = new a1.a$b     // Catch:{ IOException -> 0x00bf }
            r0.<init>((java.io.InputStream) r10)     // Catch:{ IOException -> 0x00bf }
            boolean r10 = r9.f20d     // Catch:{ IOException -> 0x00bf }
            if (r10 != 0) goto L_0x00af
            int r10 = r9.f19c     // Catch:{ IOException -> 0x00bf }
            switch(r10) {
                case 0: goto L_0x00ab;
                case 1: goto L_0x00ab;
                case 2: goto L_0x00ab;
                case 3: goto L_0x00ab;
                case 4: goto L_0x00a7;
                case 5: goto L_0x00ab;
                case 6: goto L_0x00ab;
                case 7: goto L_0x00a3;
                case 8: goto L_0x00ab;
                case 9: goto L_0x009f;
                case 10: goto L_0x009b;
                case 11: goto L_0x00ab;
                case 12: goto L_0x0097;
                case 13: goto L_0x0093;
                case 14: goto L_0x008f;
                default: goto L_0x008e;
            }     // Catch:{ IOException -> 0x00bf }
        L_0x008e:
            goto L_0x00b2
        L_0x008f:
            r9.o(r0)     // Catch:{ IOException -> 0x00bf }
            goto L_0x00b2
        L_0x0093:
            r9.j(r0)     // Catch:{ IOException -> 0x00bf }
            goto L_0x00b2
        L_0x0097:
            r9.f(r0)     // Catch:{ IOException -> 0x00bf }
            goto L_0x00b2
        L_0x009b:
            r9.m(r0)     // Catch:{ IOException -> 0x00bf }
            goto L_0x00b2
        L_0x009f:
            r9.k(r0)     // Catch:{ IOException -> 0x00bf }
            goto L_0x00b2
        L_0x00a3:
            r9.i(r0)     // Catch:{ IOException -> 0x00bf }
            goto L_0x00b2
        L_0x00a7:
            r9.g(r0, r4, r4)     // Catch:{ IOException -> 0x00bf }
            goto L_0x00b2
        L_0x00ab:
            r9.l(r0)     // Catch:{ IOException -> 0x00bf }
            goto L_0x00b2
        L_0x00af:
            r9.n(r0)     // Catch:{ IOException -> 0x00bf }
        L_0x00b2:
            r9.w(r0)     // Catch:{ IOException -> 0x00bf }
            r9.a()
            boolean r10 = f4n
            if (r10 == 0) goto L_0x00d1
            goto L_0x00ce
        L_0x00bd:
            r10 = move-exception
            goto L_0x00d2
        L_0x00bf:
            r10 = move-exception
            boolean r0 = f4n     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x00c9
            java.lang.String r1 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r2, r1, r10)     // Catch:{ all -> 0x00bd }
        L_0x00c9:
            r9.a()
            if (r0 == 0) goto L_0x00d1
        L_0x00ce:
            r9.s()
        L_0x00d1:
            return
        L_0x00d2:
            r9.a()
            boolean r0 = f4n
            if (r0 == 0) goto L_0x00dc
            r9.s()
        L_0x00dc:
            throw r10
        L_0x00dd:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r0 = "inputStream cannot be null"
            r10.<init>(r0)
            goto L_0x00e6
        L_0x00e5:
            throw r10
        L_0x00e6:
            goto L_0x00e5
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.a.<init>(java.io.InputStream):void");
    }

    public static String b(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sb2.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i10])}));
        }
        return sb2.toString();
    }

    public static long[] c(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                jArr[i10] = (long) iArr[i10];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    public static boolean x(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr2.length; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void A() throws IOException {
        y(0, 5);
        y(0, 4);
        y(5, 4);
        c cVar = this.f21e[1].get("PixelXDimension");
        c cVar2 = this.f21e[1].get("PixelYDimension");
        if (!(cVar == null || cVar2 == null)) {
            this.f21e[0].put("ImageWidth", cVar);
            this.f21e[0].put("ImageLength", cVar2);
        }
        if (this.f21e[4].isEmpty() && q(this.f21e[5])) {
            HashMap<String, ExifInterface.ExifAttribute>[] hashMapArr = this.f21e;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!q(this.f21e[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
    }

    public final void a() {
        String d10 = d("DateTimeOriginal");
        if (d10 != null && d("DateTime") == null) {
            this.f21e[0].put("DateTime", c.a(d10));
        }
        if (d("ImageWidth") == null) {
            this.f21e[0].put("ImageWidth", c.b(0, this.f23g));
        }
        if (d("ImageLength") == null) {
            this.f21e[0].put("ImageLength", c.b(0, this.f23g));
        }
        if (d("Orientation") == null) {
            this.f21e[0].put("Orientation", c.b(0, this.f23g));
        }
        if (d("LightSource") == null) {
            this.f21e[1].put("LightSource", c.b(0, this.f23g));
        }
    }

    public String d(String str) {
        c e10 = e(str);
        if (e10 != null) {
            if (!N.contains(str)) {
                return e10.g(this.f23g);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = e10.f38a;
                if (i10 == 5 || i10 == 10) {
                    e[] eVarArr = (e[]) e10.h(this.f23g);
                    if (eVarArr == null || eVarArr.length != 3) {
                        StringBuilder a10 = android.support.v4.media.a.a("Invalid GPS Timestamp array. array=");
                        a10.append(Arrays.toString(eVarArr));
                        Log.w("ExifInterface", a10.toString());
                        return null;
                    }
                    return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) eVarArr[0].f45a) / ((float) eVarArr[0].f46b))), Integer.valueOf((int) (((float) eVarArr[1].f45a) / ((float) eVarArr[1].f46b))), Integer.valueOf((int) (((float) eVarArr[2].f45a) / ((float) eVarArr[2].f46b)))});
                }
                StringBuilder a11 = android.support.v4.media.a.a("GPS Timestamp format is not rational. format=");
                a11.append(e10.f38a);
                Log.w("ExifInterface", a11.toString());
                return null;
            }
            try {
                return Double.toString(e10.e(this.f23g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c e(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f4n) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < J.length; i10++) {
            c cVar = this.f21e[i10].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void f(b bVar) throws IOException {
        String str;
        String str2;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                mediaMetadataRetriever.setDataSource(new C0002a(this, bVar));
            } else {
                FileDescriptor fileDescriptor = this.f17a;
                if (fileDescriptor != null) {
                    mediaMetadataRetriever.setDataSource(fileDescriptor);
                } else {
                    mediaMetadataRetriever.release();
                    return;
                }
            }
            String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
            String str3 = null;
            if ("yes".equals(extractMetadata3)) {
                str3 = mediaMetadataRetriever.extractMetadata(29);
                str2 = mediaMetadataRetriever.extractMetadata(30);
                str = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(extractMetadata4)) {
                str3 = mediaMetadataRetriever.extractMetadata(18);
                str2 = mediaMetadataRetriever.extractMetadata(19);
                str = mediaMetadataRetriever.extractMetadata(24);
            } else {
                str2 = null;
                str = null;
            }
            if (str3 != null) {
                this.f21e[0].put("ImageWidth", c.d(Integer.parseInt(str3), this.f23g));
            }
            if (str2 != null) {
                this.f21e[0].put("ImageLength", c.d(Integer.parseInt(str2), this.f23g));
            }
            if (str != null) {
                int i10 = 1;
                int parseInt = Integer.parseInt(str);
                if (parseInt == 90) {
                    i10 = 6;
                } else if (parseInt == 180) {
                    i10 = 3;
                } else if (parseInt == 270) {
                    i10 = 8;
                }
                this.f21e[0].put("Orientation", c.d(i10, this.f23g));
            }
            if (!(extractMetadata == null || extractMetadata2 == null)) {
                int parseInt2 = Integer.parseInt(extractMetadata);
                int parseInt3 = Integer.parseInt(extractMetadata2);
                if (parseInt3 > 6) {
                    bVar.d((long) parseInt2);
                    byte[] bArr = new byte[6];
                    if (bVar.read(bArr) == 6) {
                        int i11 = parseInt2 + 6;
                        int i12 = parseInt3 - 6;
                        if (Arrays.equals(bArr, Q)) {
                            byte[] bArr2 = new byte[i12];
                            if (bVar.read(bArr2) == i12) {
                                this.f25i = i11;
                                u(bArr2, 0);
                            } else {
                                throw new IOException("Can't read exif");
                            }
                        } else {
                            throw new IOException("Invalid identifier");
                        }
                    } else {
                        throw new IOException("Can't read identifier");
                    }
                } else {
                    throw new IOException("Invalid exif length");
                }
            }
            if (f4n) {
                Log.d("ExifInterface", "Heif meta: " + str3 + "x" + str2 + ", rotation " + str);
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0178 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e9 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(a1.a.b r18, int r19, int r20) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            boolean r4 = f4n
            java.lang.String r5 = "ExifInterface"
            if (r4 == 0) goto L_0x0022
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "getJpegAttributes starting with: "
            r4.append(r6)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r5, r4)
        L_0x0022:
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN
            r1.f35b = r4
            long r6 = (long) r2
            r1.d(r6)
            byte r4 = r18.readByte()
            java.lang.String r6 = "Invalid marker: "
            r7 = -1
            if (r4 != r7) goto L_0x01b9
            r8 = 1
            int r2 = r2 + r8
            byte r9 = r18.readByte()
            r10 = -40
            if (r9 != r10) goto L_0x01a2
            int r2 = r2 + r8
        L_0x003e:
            byte r4 = r18.readByte()
            if (r4 != r7) goto L_0x0189
            int r2 = r2 + r8
            byte r4 = r18.readByte()
            boolean r6 = f4n
            if (r6 == 0) goto L_0x0063
            java.lang.String r7 = "Found JPEG segment indicator: "
            java.lang.StringBuilder r7 = android.support.v4.media.a.a(r7)
            r9 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r5, r7)
        L_0x0063:
            int r2 = r2 + r8
            r7 = -39
            if (r4 == r7) goto L_0x0184
            r7 = -38
            if (r4 != r7) goto L_0x006e
            goto L_0x0184
        L_0x006e:
            int r7 = r18.readUnsignedShort()
            int r7 = r7 + -2
            int r2 = r2 + 2
            if (r6 == 0) goto L_0x009d
            java.lang.String r6 = "JPEG segment: "
            java.lang.StringBuilder r6 = android.support.v4.media.a.a(r6)
            r9 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r6.append(r9)
            java.lang.String r9 = " (length: "
            r6.append(r9)
            int r9 = r7 + 2
            r6.append(r9)
            java.lang.String r9 = ")"
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
        L_0x009d:
            java.lang.String r6 = "Invalid length"
            if (r7 < 0) goto L_0x017e
            r9 = -31
            r10 = 0
            if (r4 == r9) goto L_0x011c
            r9 = -2
            if (r4 == r9) goto L_0x00f1
            switch(r4) {
                case -64: goto L_0x00b7;
                case -63: goto L_0x00b7;
                case -62: goto L_0x00b7;
                case -61: goto L_0x00b7;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            switch(r4) {
                case -59: goto L_0x00b7;
                case -58: goto L_0x00b7;
                case -57: goto L_0x00b7;
                default: goto L_0x00af;
            }
        L_0x00af:
            switch(r4) {
                case -55: goto L_0x00b7;
                case -54: goto L_0x00b7;
                case -53: goto L_0x00b7;
                default: goto L_0x00b2;
            }
        L_0x00b2:
            switch(r4) {
                case -51: goto L_0x00b7;
                case -50: goto L_0x00b7;
                case -49: goto L_0x00b7;
                default: goto L_0x00b5;
            }
        L_0x00b5:
            goto L_0x0163
        L_0x00b7:
            int r4 = r1.skipBytes(r8)
            if (r4 != r8) goto L_0x00e9
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.f21e
            r4 = r4[r3]
            int r8 = r18.readUnsignedShort()
            long r8 = (long) r8
            java.nio.ByteOrder r10 = r0.f23g
            a1.a$c r8 = a1.a.c.b(r8, r10)
            java.lang.String r9 = "ImageLength"
            r4.put(r9, r8)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.f21e
            r4 = r4[r3]
            int r8 = r18.readUnsignedShort()
            long r8 = (long) r8
            java.nio.ByteOrder r10 = r0.f23g
            a1.a$c r8 = a1.a.c.b(r8, r10)
            java.lang.String r9 = "ImageWidth"
            r4.put(r9, r8)
            int r7 = r7 + -5
            goto L_0x0163
        L_0x00e9:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid SOFx"
            r1.<init>(r2)
            throw r1
        L_0x00f1:
            byte[] r4 = new byte[r7]
            int r9 = r1.read(r4)
            if (r9 != r7) goto L_0x0114
            java.lang.String r7 = "UserComment"
            java.lang.String r9 = r0.d(r7)
            if (r9 != 0) goto L_0x0162
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r9 = r0.f21e
            r8 = r9[r8]
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = P
            r9.<init>(r4, r10)
            a1.a$c r4 = a1.a.c.a(r9)
            r8.put(r7, r4)
            goto L_0x0162
        L_0x0114:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid exif"
            r1.<init>(r2)
            throw r1
        L_0x011c:
            byte[] r4 = new byte[r7]
            r1.readFully(r4)
            int r8 = r2 + r7
            byte[] r9 = Q
            boolean r11 = x(r4, r9)
            if (r11 == 0) goto L_0x0138
            int r10 = r9.length
            int r2 = r2 + r10
            int r9 = r9.length
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r9, r7)
            r0.f25i = r2
            r0.u(r4, r3)
            goto L_0x0161
        L_0x0138:
            byte[] r9 = R
            boolean r11 = x(r4, r9)
            if (r11 == 0) goto L_0x0161
            int r11 = r9.length
            int r2 = r2 + r11
            int r9 = r9.length
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r9, r7)
            java.lang.String r7 = "Xmp"
            java.lang.String r9 = r0.d(r7)
            if (r9 != 0) goto L_0x0161
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r9 = r0.f21e
            r9 = r9[r10]
            a1.a$c r10 = new a1.a$c
            r12 = 1
            int r13 = r4.length
            long r14 = (long) r2
            r11 = r10
            r16 = r4
            r11.<init>(r12, r13, r14, r16)
            r9.put(r7, r10)
        L_0x0161:
            r2 = r8
        L_0x0162:
            r7 = 0
        L_0x0163:
            if (r7 < 0) goto L_0x0178
            int r4 = r1.skipBytes(r7)
            if (r4 != r7) goto L_0x0170
            int r2 = r2 + r7
            r7 = -1
            r8 = 1
            goto L_0x003e
        L_0x0170:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid JPEG segment"
            r1.<init>(r2)
            throw r1
        L_0x0178:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r6)
            throw r1
        L_0x017e:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r6)
            throw r1
        L_0x0184:
            java.nio.ByteOrder r2 = r0.f23g
            r1.f35b = r2
            return
        L_0x0189:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid marker:"
            java.lang.StringBuilder r2 = android.support.v4.media.a.a(r2)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01a2:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = android.support.v4.media.a.a(r6)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01b9:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = android.support.v4.media.a.a(r6)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            goto L_0x01d1
        L_0x01d0:
            throw r1
        L_0x01d1:
            goto L_0x01d0
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.a.g(a1.a$b, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00ce, code lost:
        if (r8 == null) goto L_0x00d3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0144 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c7 A[Catch:{ all -> 0x018b }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0110 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0112 A[SYNTHETIC, Splitter:B:99:0x0112] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int h(java.io.BufferedInputStream r18) throws java.io.IOException {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = 5000(0x1388, float:7.006E-42)
            r0.mark(r2)
            byte[] r3 = new byte[r2]
            r0.read(r3)
            r18.reset()
            r4 = 0
            r0 = 0
        L_0x0013:
            byte[] r5 = f9s
            int r6 = r5.length
            if (r0 >= r6) goto L_0x0023
            byte r6 = r3[r0]
            byte r5 = r5[r0]
            if (r6 == r5) goto L_0x0020
            r0 = 0
            goto L_0x0024
        L_0x0020:
            int r0 = r0 + 1
            goto L_0x0013
        L_0x0023:
            r0 = 1
        L_0x0024:
            r5 = 4
            if (r0 == 0) goto L_0x0028
            return r5
        L_0x0028:
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r6 = "FUJIFILMCCD-RAW"
            byte[] r0 = r6.getBytes(r0)
            r6 = 0
        L_0x0033:
            int r8 = r0.length
            if (r6 >= r8) goto L_0x0041
            byte r8 = r3[r6]
            byte r9 = r0[r6]
            if (r8 == r9) goto L_0x003e
            r0 = 0
            goto L_0x0042
        L_0x003e:
            int r6 = r6 + 1
            goto L_0x0033
        L_0x0041:
            r0 = 1
        L_0x0042:
            if (r0 == 0) goto L_0x0047
            r0 = 9
            return r0
        L_0x0047:
            a1.a$b r8 = new a1.a$b     // Catch:{ Exception -> 0x00c1, all -> 0x00bd }
            r8.<init>((byte[]) r3)     // Catch:{ Exception -> 0x00c1, all -> 0x00bd }
            int r0 = r8.readInt()     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            long r9 = (long) r0     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            byte[] r0 = new byte[r5]     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            r8.read(r0)     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            byte[] r11 = f10t     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            boolean r0 = java.util.Arrays.equals(r0, r11)     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            if (r0 != 0) goto L_0x0060
            goto L_0x00d0
        L_0x0060:
            r11 = 16
            r13 = 8
            r15 = 1
            int r0 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x0073
            long r9 = r8.readLong()     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0074
            goto L_0x00d0
        L_0x0073:
            r11 = r13
        L_0x0074:
            long r6 = (long) r2     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x007a
            r9 = r6
        L_0x007a:
            long r9 = r9 - r11
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x0080
            goto L_0x00d0
        L_0x0080:
            byte[] r0 = new byte[r5]     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            r6 = 0
            r2 = 0
            r11 = 0
        L_0x0086:
            r12 = 4
            long r12 = r9 / r12
            int r14 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r14 >= 0) goto L_0x00d0
            int r12 = r8.read(r0)     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            if (r12 == r5) goto L_0x0095
            goto L_0x00d0
        L_0x0095:
            int r12 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r12 != 0) goto L_0x009a
            goto L_0x00b6
        L_0x009a:
            byte[] r12 = f11u     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            boolean r12 = java.util.Arrays.equals(r0, r12)     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            if (r12 == 0) goto L_0x00a4
            r2 = 1
            goto L_0x00ad
        L_0x00a4:
            byte[] r12 = f12v     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            boolean r12 = java.util.Arrays.equals(r0, r12)     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            if (r12 == 0) goto L_0x00ad
            r11 = 1
        L_0x00ad:
            if (r2 == 0) goto L_0x00b6
            if (r11 == 0) goto L_0x00b6
            r8.close()
            r0 = 1
            goto L_0x00d4
        L_0x00b6:
            long r6 = r6 + r15
            goto L_0x0086
        L_0x00b8:
            r0 = move-exception
            goto L_0x018e
        L_0x00bb:
            r0 = move-exception
            goto L_0x00c3
        L_0x00bd:
            r0 = move-exception
            r6 = 0
            goto L_0x018d
        L_0x00c1:
            r0 = move-exception
            r8 = 0
        L_0x00c3:
            boolean r2 = f4n     // Catch:{ all -> 0x018b }
            if (r2 == 0) goto L_0x00ce
            java.lang.String r2 = "ExifInterface"
            java.lang.String r6 = "Exception parsing HEIF file type box."
            android.util.Log.d(r2, r6, r0)     // Catch:{ all -> 0x018b }
        L_0x00ce:
            if (r8 == 0) goto L_0x00d3
        L_0x00d0:
            r8.close()
        L_0x00d3:
            r0 = 0
        L_0x00d4:
            if (r0 == 0) goto L_0x00d9
            r0 = 12
            return r0
        L_0x00d9:
            a1.a$b r2 = new a1.a$b     // Catch:{ Exception -> 0x0107, all -> 0x00ff }
            r2.<init>((byte[]) r3)     // Catch:{ Exception -> 0x0107, all -> 0x00ff }
            java.nio.ByteOrder r0 = r1.t(r2)     // Catch:{ Exception -> 0x00fd, all -> 0x00fa }
            r1.f23g = r0     // Catch:{ Exception -> 0x00fd, all -> 0x00fa }
            r2.f35b = r0     // Catch:{ Exception -> 0x00fd, all -> 0x00fa }
            short r0 = r2.readShort()     // Catch:{ Exception -> 0x00fd, all -> 0x00fa }
            r6 = 20306(0x4f52, float:2.8455E-41)
            if (r0 == r6) goto L_0x00f5
            r6 = 21330(0x5352, float:2.989E-41)
            if (r0 != r6) goto L_0x00f3
            goto L_0x00f5
        L_0x00f3:
            r0 = 0
            goto L_0x00f6
        L_0x00f5:
            r0 = 1
        L_0x00f6:
            r2.close()
            goto L_0x010e
        L_0x00fa:
            r0 = move-exception
            r6 = r2
            goto L_0x0101
        L_0x00fd:
            goto L_0x0108
        L_0x00ff:
            r0 = move-exception
            r6 = 0
        L_0x0101:
            if (r6 == 0) goto L_0x0106
            r6.close()
        L_0x0106:
            throw r0
        L_0x0107:
            r2 = 0
        L_0x0108:
            if (r2 == 0) goto L_0x010d
            r2.close()
        L_0x010d:
            r0 = 0
        L_0x010e:
            if (r0 == 0) goto L_0x0112
            r0 = 7
            return r0
        L_0x0112:
            a1.a$b r2 = new a1.a$b     // Catch:{ Exception -> 0x013b, all -> 0x0133 }
            r2.<init>((byte[]) r3)     // Catch:{ Exception -> 0x013b, all -> 0x0133 }
            java.nio.ByteOrder r0 = r1.t(r2)     // Catch:{ Exception -> 0x0131, all -> 0x012e }
            r1.f23g = r0     // Catch:{ Exception -> 0x0131, all -> 0x012e }
            r2.f35b = r0     // Catch:{ Exception -> 0x0131, all -> 0x012e }
            short r0 = r2.readShort()     // Catch:{ Exception -> 0x0131, all -> 0x012e }
            r6 = 85
            if (r0 != r6) goto L_0x0129
            r0 = 1
            goto L_0x012a
        L_0x0129:
            r0 = 0
        L_0x012a:
            r2.close()
            goto L_0x0142
        L_0x012e:
            r0 = move-exception
            r6 = r2
            goto L_0x0135
        L_0x0131:
            r6 = r2
            goto L_0x013c
        L_0x0133:
            r0 = move-exception
            r6 = 0
        L_0x0135:
            if (r6 == 0) goto L_0x013a
            r6.close()
        L_0x013a:
            throw r0
        L_0x013b:
            r6 = 0
        L_0x013c:
            if (r6 == 0) goto L_0x0141
            r6.close()
        L_0x0141:
            r0 = 0
        L_0x0142:
            if (r0 == 0) goto L_0x0147
            r0 = 10
            return r0
        L_0x0147:
            r0 = 0
        L_0x0148:
            byte[] r2 = f15y
            int r6 = r2.length
            if (r0 >= r6) goto L_0x0158
            byte r6 = r3[r0]
            byte r2 = r2[r0]
            if (r6 == r2) goto L_0x0155
            r0 = 0
            goto L_0x0159
        L_0x0155:
            int r0 = r0 + 1
            goto L_0x0148
        L_0x0158:
            r0 = 1
        L_0x0159:
            if (r0 == 0) goto L_0x015e
            r0 = 13
            return r0
        L_0x015e:
            r0 = 0
        L_0x015f:
            byte[] r2 = C
            int r6 = r2.length
            if (r0 >= r6) goto L_0x016e
            byte r6 = r3[r0]
            byte r2 = r2[r0]
            if (r6 == r2) goto L_0x016b
            goto L_0x017f
        L_0x016b:
            int r0 = r0 + 1
            goto L_0x015f
        L_0x016e:
            r0 = 0
        L_0x016f:
            byte[] r2 = D
            int r6 = r2.length
            if (r0 >= r6) goto L_0x0184
            byte[] r6 = C
            int r6 = r6.length
            int r6 = r6 + r0
            int r6 = r6 + r5
            byte r6 = r3[r6]
            byte r2 = r2[r0]
            if (r6 == r2) goto L_0x0181
        L_0x017f:
            r7 = 0
            goto L_0x0185
        L_0x0181:
            int r0 = r0 + 1
            goto L_0x016f
        L_0x0184:
            r7 = 1
        L_0x0185:
            if (r7 == 0) goto L_0x018a
            r0 = 14
            return r0
        L_0x018a:
            return r4
        L_0x018b:
            r0 = move-exception
            r6 = r8
        L_0x018d:
            r8 = r6
        L_0x018e:
            if (r8 == 0) goto L_0x0193
            r8.close()
        L_0x0193:
            goto L_0x0195
        L_0x0194:
            throw r0
        L_0x0195:
            goto L_0x0194
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.a.h(java.io.BufferedInputStream):int");
    }

    public final void i(b bVar) throws IOException {
        l(bVar);
        c cVar = this.f21e[1].get("MakerNote");
        if (cVar != null) {
            b bVar2 = new b(cVar.f40c);
            bVar2.f35b = this.f23g;
            byte[] bArr = f13w;
            byte[] bArr2 = new byte[bArr.length];
            bVar2.readFully(bArr2);
            bVar2.d(0);
            byte[] bArr3 = f14x;
            byte[] bArr4 = new byte[bArr3.length];
            bVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                bVar2.d(8);
            } else if (Arrays.equals(bArr4, bArr3)) {
                bVar2.d(12);
            }
            v(bVar2, 6);
            c cVar2 = this.f21e[7].get("PreviewImageStart");
            c cVar3 = this.f21e[7].get("PreviewImageLength");
            if (!(cVar2 == null || cVar3 == null)) {
                this.f21e[5].put("JPEGInterchangeFormat", cVar2);
                this.f21e[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = this.f21e[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.h(this.f23g);
                if (iArr == null || iArr.length != 4) {
                    StringBuilder a10 = android.support.v4.media.a.a("Invalid aspect frame values. frame=");
                    a10.append(Arrays.toString(iArr));
                    Log.w("ExifInterface", a10.toString());
                } else if (iArr[2] > iArr[0] && iArr[3] > iArr[1]) {
                    int i10 = (iArr[2] - iArr[0]) + 1;
                    int i11 = (iArr[3] - iArr[1]) + 1;
                    if (i10 < i11) {
                        int i12 = i10 + i11;
                        i11 = i12 - i11;
                        i10 = i12 - i11;
                    }
                    c d10 = c.d(i10, this.f23g);
                    c d11 = c.d(i11, this.f23g);
                    this.f21e[0].put("ImageWidth", d10);
                    this.f21e[0].put("ImageLength", d11);
                }
            }
        }
    }

    public final void j(b bVar) throws IOException {
        if (f4n) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f35b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f15y;
        bVar.skipBytes(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i10 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i11 = i10 + 4;
                    if (i11 == 16) {
                        if (!Arrays.equals(bArr2, A)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                    }
                    if (!Arrays.equals(bArr2, B)) {
                        if (Arrays.equals(bArr2, f16z)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f25i = i11;
                                    u(bArr3, 0);
                                    A();
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr2));
                        }
                        int i12 = readInt + 4;
                        bVar.skipBytes(i12);
                        length = i11 + i12;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void k(b bVar) throws IOException {
        bVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        bVar.read(bArr);
        bVar.skipBytes(4);
        bVar.read(bArr2);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        g(bVar, i10, 5);
        bVar.d((long) i11);
        bVar.f35b = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        if (f4n) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i12 = 0; i12 < readInt; i12++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == I.f41a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c d10 = c.d(readShort, this.f23g);
                c d11 = c.d(readShort2, this.f23g);
                this.f21e[0].put("ImageLength", d10);
                this.f21e[0].put("ImageWidth", d11);
                if (f4n) {
                    Log.d("ExifInterface", "Updated to length: " + readShort + ", width: " + readShort2);
                    return;
                }
                return;
            }
            bVar.skipBytes(readUnsignedShort2);
        }
    }

    public final void l(b bVar) throws IOException {
        c cVar;
        r(bVar, bVar.available());
        v(bVar, 0);
        z(bVar, 0);
        z(bVar, 5);
        z(bVar, 4);
        A();
        if (this.f19c == 8 && (cVar = this.f21e[1].get("MakerNote")) != null) {
            b bVar2 = new b(cVar.f40c);
            bVar2.f35b = this.f23g;
            bVar2.d(6);
            v(bVar2, 9);
            c cVar2 = this.f21e[9].get("ColorSpace");
            if (cVar2 != null) {
                this.f21e[1].put("ColorSpace", cVar2);
            }
        }
    }

    public final void m(b bVar) throws IOException {
        l(bVar);
        if (this.f21e[0].get("JpgFromRaw") != null) {
            g(bVar, this.f29m, 5);
        }
        c cVar = this.f21e[0].get("ISO");
        c cVar2 = this.f21e[1].get("PhotographicSensitivity");
        if (cVar != null && cVar2 == null) {
            this.f21e[1].put("PhotographicSensitivity", cVar);
        }
    }

    public final void n(b bVar) throws IOException {
        byte[] bArr = Q;
        bVar.skipBytes(bArr.length);
        byte[] bArr2 = new byte[bVar.available()];
        bVar.readFully(bArr2);
        this.f25i = bArr.length;
        u(bArr2, 0);
    }

    public final void o(b bVar) throws IOException {
        if (f4n) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f35b = ByteOrder.LITTLE_ENDIAN;
        bVar.skipBytes(C.length);
        int readInt = bVar.readInt() + 8;
        int skipBytes = bVar.skipBytes(D.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (bVar.read(bArr) == 4) {
                    int readInt2 = bVar.readInt();
                    int i10 = skipBytes + 4 + 4;
                    if (Arrays.equals(E, bArr)) {
                        byte[] bArr2 = new byte[readInt2];
                        if (bVar.read(bArr2) == readInt2) {
                            this.f25i = i10;
                            u(bArr2, 0);
                            this.f25i = i10;
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    int i11 = i10 + readInt2;
                    if (i11 != readInt) {
                        if (i11 <= readInt) {
                            int skipBytes2 = bVar.skipBytes(readInt2);
                            if (skipBytes2 == readInt2) {
                                skipBytes = i10 + skipBytes2;
                            } else {
                                throw new IOException("Encountered WebP file with invalid chunk size");
                            }
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void p(b bVar, HashMap hashMap) throws IOException {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar != null && cVar2 != null) {
            int f10 = cVar.f(this.f23g);
            int f11 = cVar2.f(this.f23g);
            if (this.f19c == 7) {
                f10 += this.f26j;
            }
            int min = Math.min(f11, bVar.f36c - f10);
            if (f10 > 0 && min > 0) {
                int i10 = this.f25i + f10;
                if (this.f18b == null && this.f17a == null) {
                    bVar.d((long) i10);
                    bVar.readFully(new byte[min]);
                }
            }
            if (f4n) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + f10 + ", length: " + min);
            }
        }
    }

    public final boolean q(HashMap hashMap) throws IOException {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.f(this.f23g) <= 512 && cVar2.f(this.f23g) <= 512;
    }

    public final void r(b bVar, int i10) throws IOException {
        ByteOrder t10 = t(bVar);
        this.f23g = t10;
        bVar.f35b = t10;
        int readUnsignedShort = bVar.readUnsignedShort();
        int i11 = this.f19c;
        if (i11 == 7 || i11 == 10 || readUnsignedShort == 42) {
            int readInt = bVar.readInt();
            if (readInt < 8 || readInt >= i10) {
                throw new IOException(d0.a("Invalid first Ifd offset: ", readInt));
            }
            int i12 = readInt - 8;
            if (i12 > 0 && bVar.skipBytes(i12) != i12) {
                throw new IOException(d0.a("Couldn't jump to first Ifd: ", i12));
            }
            return;
        }
        StringBuilder a10 = android.support.v4.media.a.a("Invalid start code: ");
        a10.append(Integer.toHexString(readUnsignedShort));
        throw new IOException(a10.toString());
    }

    public final void s() {
        for (int i10 = 0; i10 < this.f21e.length; i10++) {
            StringBuilder a10 = y0.a("The size of tag group[", i10, "]: ");
            a10.append(this.f21e[i10].size());
            Log.d("ExifInterface", a10.toString());
            for (Map.Entry next : this.f21e[i10].entrySet()) {
                c cVar = (c) next.getValue();
                StringBuilder a11 = android.support.v4.media.a.a("tagName: ");
                a11.append((String) next.getKey());
                a11.append(", tagType: ");
                a11.append(cVar.toString());
                a11.append(", tagValue: '");
                a11.append(cVar.g(this.f23g));
                a11.append("'");
                Log.d("ExifInterface", a11.toString());
            }
        }
    }

    public final ByteOrder t(b bVar) throws IOException {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f4n) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (f4n) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            StringBuilder a10 = android.support.v4.media.a.a("Invalid byte order: ");
            a10.append(Integer.toHexString(readShort));
            throw new IOException(a10.toString());
        }
    }

    public final void u(byte[] bArr, int i10) throws IOException {
        b bVar = new b(bArr);
        r(bVar, bArr.length);
        v(bVar, i10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:122:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0177  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(a1.a.b r24, int r25) throws java.io.IOException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            java.util.Set<java.lang.Integer> r3 = r0.f22f
            int r4 = r1.f37d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            int r3 = r1.f37d
            int r3 = r3 + 2
            int r4 = r1.f36c
            if (r3 <= r4) goto L_0x001a
            return
        L_0x001a:
            short r3 = r24.readShort()
            boolean r4 = f4n
            java.lang.String r5 = "ExifInterface"
            if (r4 == 0) goto L_0x0038
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "numberOfDirectoryEntry: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r5, r4)
        L_0x0038:
            int r4 = r1.f37d
            int r6 = r3 * 12
            int r6 = r6 + r4
            int r4 = r1.f36c
            if (r6 > r4) goto L_0x0424
            if (r3 > 0) goto L_0x0045
            goto L_0x0424
        L_0x0045:
            r4 = 0
            r6 = 0
        L_0x0047:
            r7 = 5
            if (r6 >= r3) goto L_0x039d
            int r8 = r24.readUnsignedShort()
            int r9 = r24.readUnsignedShort()
            int r12 = r24.readInt()
            int r10 = r1.f37d
            long r10 = (long) r10
            r13 = 4
            long r10 = r10 + r13
            java.util.HashMap<java.lang.Integer, androidx.exifinterface.media.ExifInterface$ExifTag>[] r15 = L
            r15 = r15[r2]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            java.lang.Object r13 = r15.get(r13)
            r15 = r13
            a1.a$d r15 = (a1.a.d) r15
            boolean r13 = f4n
            r14 = 3
            if (r13 == 0) goto L_0x00a0
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r18 = java.lang.Integer.valueOf(r25)
            r7[r4] = r18
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r18 = 1
            r7[r18] = r4
            if (r15 == 0) goto L_0x0085
            java.lang.String r4 = r15.f42b
            goto L_0x0086
        L_0x0085:
            r4 = 0
        L_0x0086:
            r18 = 2
            r7[r18] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r7[r14] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r14 = 4
            r7[r14] = r4
            java.lang.String r4 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String r4 = java.lang.String.format(r4, r7)
            android.util.Log.d(r5, r4)
        L_0x00a0:
            r4 = 7
            if (r15 != 0) goto L_0x00bd
            if (r13 == 0) goto L_0x00b9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "Skip the tag entry since tag number is not defined: "
            r4.append(r7)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r5, r4)
        L_0x00b9:
            r18 = r3
            goto L_0x011c
        L_0x00bd:
            if (r9 <= 0) goto L_0x0153
            int[] r7 = G
            int r14 = r7.length
            if (r9 < r14) goto L_0x00c6
            goto L_0x0153
        L_0x00c6:
            int r14 = r15.f43c
            if (r14 == r4) goto L_0x00f7
            if (r9 != r4) goto L_0x00cd
            goto L_0x00f7
        L_0x00cd:
            if (r14 == r9) goto L_0x00f7
            int r4 = r15.f44d
            if (r4 != r9) goto L_0x00d4
            goto L_0x00f7
        L_0x00d4:
            r18 = r3
            r3 = 4
            if (r14 == r3) goto L_0x00db
            if (r4 != r3) goto L_0x00df
        L_0x00db:
            r3 = 3
            if (r9 != r3) goto L_0x00df
            goto L_0x00f9
        L_0x00df:
            r3 = 9
            if (r14 == r3) goto L_0x00e5
            if (r4 != r3) goto L_0x00ea
        L_0x00e5:
            r3 = 8
            if (r9 != r3) goto L_0x00ea
            goto L_0x00f9
        L_0x00ea:
            r3 = 12
            if (r14 == r3) goto L_0x00f0
            if (r4 != r3) goto L_0x00f5
        L_0x00f0:
            r3 = 11
            if (r9 != r3) goto L_0x00f5
            goto L_0x00f9
        L_0x00f5:
            r3 = 0
            goto L_0x00fa
        L_0x00f7:
            r18 = r3
        L_0x00f9:
            r3 = 1
        L_0x00fa:
            if (r3 != 0) goto L_0x011f
            if (r13 == 0) goto L_0x011c
            java.lang.String r3 = "Skip the tag entry since data format ("
            java.lang.StringBuilder r3 = android.support.v4.media.a.a(r3)
            java.lang.String[] r4 = F
            r4 = r4[r9]
            r3.append(r4)
            java.lang.String r4 = ") is unexpected for tag: "
            r3.append(r4)
            java.lang.String r4 = r15.f42b
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r5, r3)
        L_0x011c:
            r19 = r6
            goto L_0x016d
        L_0x011f:
            r3 = 7
            if (r9 != r3) goto L_0x0123
            r9 = r14
        L_0x0123:
            long r3 = (long) r12
            r7 = r7[r9]
            r19 = r6
            long r6 = (long) r7
            long r3 = r3 * r6
            r6 = 0
            int r14 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r14 < 0) goto L_0x013b
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r14 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r14 <= 0) goto L_0x0139
            goto L_0x013b
        L_0x0139:
            r6 = 1
            goto L_0x0170
        L_0x013b:
            if (r13 == 0) goto L_0x0151
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since the number of components is invalid: "
            r6.append(r7)
            r6.append(r12)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
        L_0x0151:
            r6 = 0
            goto L_0x0170
        L_0x0153:
            r18 = r3
            r19 = r6
            if (r13 == 0) goto L_0x016d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip the tag entry since data format is invalid: "
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r5, r3)
        L_0x016d:
            r6 = 0
            r3 = 0
        L_0x0170:
            if (r6 != 0) goto L_0x0177
            r1.d(r10)
            goto L_0x0393
        L_0x0177:
            java.lang.String r6 = "Compression"
            r16 = 4
            int r7 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r7 <= 0) goto L_0x0240
            int r7 = r24.readInt()
            if (r13 == 0) goto L_0x019c
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r16 = r9
            java.lang.String r9 = "seek to data offset: "
            r14.append(r9)
            r14.append(r7)
            java.lang.String r9 = r14.toString()
            android.util.Log.d(r5, r9)
            goto L_0x019e
        L_0x019c:
            r16 = r9
        L_0x019e:
            int r9 = r0.f19c
            r14 = 7
            if (r9 != r14) goto L_0x01fc
            java.lang.String r9 = r15.f42b
            java.lang.String r14 = "MakerNote"
            boolean r9 = r14.equals(r9)
            if (r9 == 0) goto L_0x01b0
            r0.f26j = r7
            goto L_0x01f8
        L_0x01b0:
            r9 = 6
            if (r2 != r9) goto L_0x01f8
            java.lang.String r9 = r15.f42b
            java.lang.String r14 = "ThumbnailImage"
            boolean r9 = r14.equals(r9)
            if (r9 == 0) goto L_0x01f8
            r0.f27k = r7
            r0.f28l = r12
            java.nio.ByteOrder r9 = r0.f23g
            r14 = 6
            a1.a$c r9 = a1.a.c.d(r14, r9)
            int r14 = r0.f27k
            r20 = r10
            long r10 = (long) r14
            java.nio.ByteOrder r14 = r0.f23g
            a1.a$c r10 = a1.a.c.b(r10, r14)
            int r11 = r0.f28l
            r14 = r12
            long r11 = (long) r11
            java.nio.ByteOrder r2 = r0.f23g
            a1.a$c r2 = a1.a.c.b(r11, r2)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r11 = r0.f21e
            r12 = 4
            r11 = r11[r12]
            r11.put(r6, r9)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r9 = r0.f21e
            r9 = r9[r12]
            java.lang.String r11 = "JPEGInterchangeFormat"
            r9.put(r11, r10)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r9 = r0.f21e
            r9 = r9[r12]
            java.lang.String r10 = "JPEGInterchangeFormatLength"
            r9.put(r10, r2)
            goto L_0x020f
        L_0x01f8:
            r20 = r10
            r14 = r12
            goto L_0x020f
        L_0x01fc:
            r20 = r10
            r14 = r12
            r2 = 10
            if (r9 != r2) goto L_0x020f
            java.lang.String r2 = r15.f42b
            java.lang.String r9 = "JpgFromRaw"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L_0x020f
            r0.f29m = r7
        L_0x020f:
            long r9 = (long) r7
            long r11 = r9 + r3
            int r2 = r1.f36c
            r22 = r14
            r17 = r15
            long r14 = (long) r2
            int r2 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r2 > 0) goto L_0x0223
            r1.d(r9)
            r10 = r20
            goto L_0x0246
        L_0x0223:
            if (r13 == 0) goto L_0x0239
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Skip the tag entry since data offset is invalid: "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r5, r2)
        L_0x0239:
            r10 = r20
            r1.d(r10)
            goto L_0x0393
        L_0x0240:
            r16 = r9
            r22 = r12
            r17 = r15
        L_0x0246:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r2 = O
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            java.lang.Object r2 = r2.get(r7)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r13 == 0) goto L_0x0270
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "nextIfdType: "
            r7.append(r8)
            r7.append(r2)
            java.lang.String r8 = " byteCount: "
            r7.append(r8)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r5, r7)
        L_0x0270:
            if (r2 == 0) goto L_0x031d
            r3 = -1
            r6 = 3
            r9 = r16
            if (r9 == r6) goto L_0x0298
            r6 = 4
            if (r9 == r6) goto L_0x0293
            r6 = 8
            if (r9 == r6) goto L_0x028e
            r6 = 9
            if (r9 == r6) goto L_0x0289
            r6 = 13
            if (r9 == r6) goto L_0x0289
            goto L_0x029d
        L_0x0289:
            int r3 = r24.readInt()
            goto L_0x029c
        L_0x028e:
            short r3 = r24.readShort()
            goto L_0x029c
        L_0x0293:
            long r3 = r24.a()
            goto L_0x029d
        L_0x0298:
            int r3 = r24.readUnsignedShort()
        L_0x029c:
            long r3 = (long) r3
        L_0x029d:
            r6 = 2
            if (r13 == 0) goto L_0x02b9
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            r8 = 0
            r6[r8] = r7
            r7 = r17
            java.lang.String r7 = r7.f42b
            r8 = 1
            r6[r8] = r7
            java.lang.String r7 = "Offset: %d, tagName: %s"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            android.util.Log.d(r5, r6)
        L_0x02b9:
            r6 = 0
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0302
            int r6 = r1.f36c
            long r6 = (long) r6
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0302
            java.util.Set<java.lang.Integer> r6 = r0.f22f
            int r7 = (int) r3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x02de
            r1.d(r3)
            int r2 = r2.intValue()
            r0.v(r1, r2)
            goto L_0x0318
        L_0x02de:
            if (r13 == 0) goto L_0x0318
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip jump into the IFD since it has already been read: IfdType "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = " (at "
            r6.append(r2)
            r6.append(r3)
            java.lang.String r2 = ")"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            android.util.Log.d(r5, r2)
            goto L_0x0318
        L_0x0302:
            if (r13 == 0) goto L_0x0318
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "Skip jump into the IFD since its offset is invalid: "
            r2.append(r6)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r5, r2)
        L_0x0318:
            r1.d(r10)
            goto L_0x0393
        L_0x031d:
            r9 = r16
            r7 = r17
            int r2 = r1.f37d
            int r8 = r0.f25i
            int r2 = r2 + r8
            int r4 = (int) r3
            byte[] r15 = new byte[r4]
            r1.readFully(r15)
            a1.a$c r3 = new a1.a$c
            long r13 = (long) r2
            r11 = r10
            r10 = r3
            r7 = r11
            r11 = r9
            r12 = r22
            r2 = r17
            r10.<init>(r11, r12, r13, r15)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.f21e
            r4 = r4[r25]
            java.lang.String r9 = r2.f42b
            r4.put(r9, r3)
            java.lang.String r4 = r2.f42b
            java.lang.String r9 = "DNGVersion"
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L_0x0350
            r4 = 3
            r0.f19c = r4
        L_0x0350:
            java.lang.String r4 = r2.f42b
            java.lang.String r9 = "Make"
            boolean r4 = r9.equals(r4)
            if (r4 != 0) goto L_0x0364
            java.lang.String r4 = r2.f42b
            java.lang.String r9 = "Model"
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L_0x0372
        L_0x0364:
            java.nio.ByteOrder r4 = r0.f23g
            java.lang.String r4 = r3.g(r4)
            java.lang.String r9 = "PENTAX"
            boolean r4 = r4.contains(r9)
            if (r4 != 0) goto L_0x0385
        L_0x0372:
            java.lang.String r2 = r2.f42b
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x0389
            java.nio.ByteOrder r2 = r0.f23g
            int r2 = r3.f(r2)
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r3) goto L_0x0389
        L_0x0385:
            r2 = 8
            r0.f19c = r2
        L_0x0389:
            int r2 = r1.f37d
            long r2 = (long) r2
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0393
            r1.d(r7)
        L_0x0393:
            int r6 = r19 + 1
            short r6 = (short) r6
            r4 = 0
            r2 = r25
            r3 = r18
            goto L_0x0047
        L_0x039d:
            int r2 = r1.f37d
            int r2 = r2 + 4
            int r3 = r1.f36c
            if (r2 > r3) goto L_0x0424
            int r2 = r24.readInt()
            boolean r3 = f4n
            if (r3 == 0) goto L_0x03c0
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r8 = 0
            r4[r8] = r6
            java.lang.String r6 = "nextIfdOffset: %d"
            java.lang.String r4 = java.lang.String.format(r6, r4)
            android.util.Log.d(r5, r4)
        L_0x03c0:
            long r8 = (long) r2
            r10 = 0
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 <= 0) goto L_0x040e
            int r4 = r1.f36c
            if (r2 >= r4) goto L_0x040e
            java.util.Set<java.lang.Integer> r4 = r0.f22f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r4 = r4.contains(r6)
            if (r4 != 0) goto L_0x03f7
            r1.d(r8)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.f21e
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x03e9
            r0.v(r1, r3)
            goto L_0x0424
        L_0x03e9:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.f21e
            r2 = r2[r7]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0424
            r0.v(r1, r7)
            goto L_0x0424
        L_0x03f7:
            if (r3 == 0) goto L_0x0424
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r5, r1)
            goto L_0x0424
        L_0x040e:
            if (r3 == 0) goto L_0x0424
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r5, r1)
        L_0x0424:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.a.v(a1.a$b, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w(a1.a.b r19) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.f21e
            r3 = 4
            r2 = r2[r3]
            java.lang.String r3 = "Compression"
            java.lang.Object r3 = r2.get(r3)
            a1.a$c r3 = (a1.a.c) r3
            if (r3 == 0) goto L_0x0115
            java.nio.ByteOrder r4 = r0.f23g
            int r3 = r3.f(r4)
            r4 = 1
            r5 = 6
            if (r3 == r4) goto L_0x0029
            if (r3 == r5) goto L_0x0024
            r6 = 7
            if (r3 == r6) goto L_0x0029
            goto L_0x0118
        L_0x0024:
            r0.p(r1, r2)
            goto L_0x0118
        L_0x0029:
            java.lang.String r3 = "BitsPerSample"
            java.lang.Object r3 = r2.get(r3)
            a1.a$c r3 = (a1.a.c) r3
            java.lang.String r6 = "ExifInterface"
            r7 = 0
            if (r3 == 0) goto L_0x0070
            java.nio.ByteOrder r8 = r0.f23g
            java.lang.Object r3 = r3.h(r8)
            int[] r3 = (int[]) r3
            int[] r8 = f7q
            boolean r9 = java.util.Arrays.equals(r8, r3)
            if (r9 == 0) goto L_0x0047
            goto L_0x006e
        L_0x0047:
            int r9 = r0.f19c
            r10 = 3
            if (r9 != r10) goto L_0x0070
            java.lang.String r9 = "PhotometricInterpretation"
            java.lang.Object r9 = r2.get(r9)
            a1.a$c r9 = (a1.a.c) r9
            if (r9 == 0) goto L_0x0070
            java.nio.ByteOrder r10 = r0.f23g
            int r9 = r9.f(r10)
            if (r9 != r4) goto L_0x0066
            int[] r10 = f8r
            boolean r10 = java.util.Arrays.equals(r3, r10)
            if (r10 != 0) goto L_0x006e
        L_0x0066:
            if (r9 != r5) goto L_0x0070
            boolean r3 = java.util.Arrays.equals(r3, r8)
            if (r3 == 0) goto L_0x0070
        L_0x006e:
            r3 = 1
            goto L_0x007a
        L_0x0070:
            boolean r3 = f4n
            if (r3 == 0) goto L_0x0079
            java.lang.String r3 = "Unsupported data type value"
            android.util.Log.d(r6, r3)
        L_0x0079:
            r3 = 0
        L_0x007a:
            if (r3 == 0) goto L_0x0118
            java.lang.String r3 = "StripOffsets"
            java.lang.Object r3 = r2.get(r3)
            a1.a$c r3 = (a1.a.c) r3
            java.lang.String r5 = "StripByteCounts"
            java.lang.Object r2 = r2.get(r5)
            a1.a$c r2 = (a1.a.c) r2
            if (r3 == 0) goto L_0x0118
            if (r2 == 0) goto L_0x0118
            java.nio.ByteOrder r5 = r0.f23g
            java.lang.Object r3 = r3.h(r5)
            long[] r3 = c(r3)
            java.nio.ByteOrder r5 = r0.f23g
            java.lang.Object r2 = r2.h(r5)
            long[] r2 = c(r2)
            if (r3 == 0) goto L_0x010f
            int r5 = r3.length
            if (r5 != 0) goto L_0x00aa
            goto L_0x010f
        L_0x00aa:
            if (r2 == 0) goto L_0x0109
            int r5 = r2.length
            if (r5 != 0) goto L_0x00b0
            goto L_0x0109
        L_0x00b0:
            int r5 = r3.length
            int r8 = r2.length
            if (r5 == r8) goto L_0x00ba
            java.lang.String r1 = "stripOffsets and stripByteCounts should have same length."
            android.util.Log.w(r6, r1)
            goto L_0x0118
        L_0x00ba:
            r8 = 0
            int r5 = r2.length
            r10 = 0
        L_0x00be:
            if (r10 >= r5) goto L_0x00c6
            r11 = r2[r10]
            long r8 = r8 + r11
            int r10 = r10 + 1
            goto L_0x00be
        L_0x00c6:
            int r5 = (int) r8
            byte[] r5 = new byte[r5]
            r0.f24h = r4
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x00ce:
            int r11 = r3.length
            if (r8 >= r11) goto L_0x0102
            r11 = r3[r8]
            int r12 = (int) r11
            r13 = r2[r8]
            int r11 = (int) r13
            int r13 = r3.length
            int r13 = r13 - r4
            if (r8 >= r13) goto L_0x00e8
            int r13 = r12 + r11
            long r13 = (long) r13
            int r15 = r8 + 1
            r15 = r3[r15]
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 == 0) goto L_0x00e8
            r0.f24h = r7
        L_0x00e8:
            int r12 = r12 - r9
            if (r12 >= 0) goto L_0x00f0
            java.lang.String r13 = "Invalid strip offset value"
            android.util.Log.d(r6, r13)
        L_0x00f0:
            long r13 = (long) r12
            r1.d(r13)
            int r9 = r9 + r12
            byte[] r12 = new byte[r11]
            r1.read(r12)
            int r9 = r9 + r11
            java.lang.System.arraycopy(r12, r7, r5, r10, r11)
            int r10 = r10 + r11
            int r8 = r8 + 1
            goto L_0x00ce
        L_0x0102:
            boolean r1 = r0.f24h
            if (r1 == 0) goto L_0x0118
            r1 = r3[r7]
            goto L_0x0118
        L_0x0109:
            java.lang.String r1 = "stripByteCounts should not be null or have zero length."
            android.util.Log.w(r6, r1)
            goto L_0x0118
        L_0x010f:
            java.lang.String r1 = "stripOffsets should not be null or have zero length."
            android.util.Log.w(r6, r1)
            goto L_0x0118
        L_0x0115:
            r0.p(r1, r2)
        L_0x0118:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.a.w(a1.a$b):void");
    }

    public final void y(int i10, int i11) throws IOException {
        if (!this.f21e[i10].isEmpty() && !this.f21e[i11].isEmpty()) {
            c cVar = this.f21e[i10].get("ImageLength");
            c cVar2 = this.f21e[i10].get("ImageWidth");
            c cVar3 = this.f21e[i11].get("ImageLength");
            c cVar4 = this.f21e[i11].get("ImageWidth");
            if (cVar == null || cVar2 == null) {
                if (f4n) {
                    Log.d("ExifInterface", "First image does not contain valid size information");
                }
            } else if (cVar3 != null && cVar4 != null) {
                int f10 = cVar.f(this.f23g);
                int f11 = cVar2.f(this.f23g);
                int f12 = cVar3.f(this.f23g);
                int f13 = cVar4.f(this.f23g);
                if (f10 < f12 && f11 < f13) {
                    HashMap<String, ExifInterface.ExifAttribute>[] hashMapArr = this.f21e;
                    HashMap<String, ExifInterface.ExifAttribute> hashMap = hashMapArr[i10];
                    hashMapArr[i10] = hashMapArr[i11];
                    hashMapArr[i11] = hashMap;
                }
            } else if (f4n) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
            }
        } else if (f4n) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void z(b bVar, int i10) throws IOException {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4 = this.f21e[i10].get("DefaultCropSize");
        c cVar5 = this.f21e[i10].get("SensorTopBorder");
        c cVar6 = this.f21e[i10].get("SensorLeftBorder");
        c cVar7 = this.f21e[i10].get("SensorBottomBorder");
        c cVar8 = this.f21e[i10].get("SensorRightBorder");
        if (cVar4 != null) {
            if (cVar4.f38a == 5) {
                e[] eVarArr = (e[]) cVar4.h(this.f23g);
                if (eVarArr == null || eVarArr.length != 2) {
                    StringBuilder a10 = android.support.v4.media.a.a("Invalid crop size values. cropSize=");
                    a10.append(Arrays.toString(eVarArr));
                    Log.w("ExifInterface", a10.toString());
                    return;
                }
                cVar3 = c.c(eVarArr[0], this.f23g);
                cVar2 = c.c(eVarArr[1], this.f23g);
            } else {
                int[] iArr = (int[]) cVar4.h(this.f23g);
                if (iArr == null || iArr.length != 2) {
                    StringBuilder a11 = android.support.v4.media.a.a("Invalid crop size values. cropSize=");
                    a11.append(Arrays.toString(iArr));
                    Log.w("ExifInterface", a11.toString());
                    return;
                }
                cVar3 = c.d(iArr[0], this.f23g);
                cVar2 = c.d(iArr[1], this.f23g);
            }
            this.f21e[i10].put("ImageWidth", cVar3);
            this.f21e[i10].put("ImageLength", cVar2);
        } else if (cVar5 == null || cVar6 == null || cVar7 == null || cVar8 == null) {
            c cVar9 = this.f21e[i10].get("ImageLength");
            c cVar10 = this.f21e[i10].get("ImageWidth");
            if ((cVar9 == null || cVar10 == null) && (cVar = this.f21e[i10].get("JPEGInterchangeFormat")) != null) {
                g(bVar, cVar.f(this.f23g), i10);
            }
        } else {
            int f10 = cVar5.f(this.f23g);
            int f11 = cVar7.f(this.f23g);
            int f12 = cVar8.f(this.f23g);
            int f13 = cVar6.f(this.f23g);
            if (f11 > f10 && f12 > f13) {
                c d10 = c.d(f11 - f10, this.f23g);
                c d11 = c.d(f12 - f13, this.f23g);
                this.f21e[i10].put("ImageLength", d10);
                this.f21e[i10].put("ImageWidth", d11);
            }
        }
    }

    /* compiled from: ExifInterface */
    public static class b extends InputStream implements DataInput {

        /* renamed from: e  reason: collision with root package name */
        public static final ByteOrder f32e = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: f  reason: collision with root package name */
        public static final ByteOrder f33f = ByteOrder.BIG_ENDIAN;

        /* renamed from: a  reason: collision with root package name */
        public DataInputStream f34a;

        /* renamed from: b  reason: collision with root package name */
        public ByteOrder f35b;

        /* renamed from: c  reason: collision with root package name */
        public final int f36c;

        /* renamed from: d  reason: collision with root package name */
        public int f37d;

        public b(InputStream inputStream) throws IOException {
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            this.f35b = byteOrder;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f34a = dataInputStream;
            int available = dataInputStream.available();
            this.f36c = available;
            this.f37d = 0;
            this.f34a.mark(available);
            this.f35b = byteOrder;
        }

        public long a() throws IOException {
            return ((long) readInt()) & 4294967295L;
        }

        public int available() throws IOException {
            return this.f34a.available();
        }

        public void d(long j10) throws IOException {
            int i10 = this.f37d;
            if (((long) i10) > j10) {
                this.f37d = 0;
                this.f34a.reset();
                this.f34a.mark(this.f36c);
            } else {
                j10 -= (long) i10;
            }
            int i11 = (int) j10;
            if (skipBytes(i11) != i11) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public int read() throws IOException {
            this.f37d++;
            return this.f34a.read();
        }

        public boolean readBoolean() throws IOException {
            this.f37d++;
            return this.f34a.readBoolean();
        }

        public byte readByte() throws IOException {
            int i10 = this.f37d + 1;
            this.f37d = i10;
            if (i10 <= this.f36c) {
                int read = this.f34a.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public char readChar() throws IOException {
            this.f37d += 2;
            return this.f34a.readChar();
        }

        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        public void readFully(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f37d + i11;
            this.f37d = i12;
            if (i12 > this.f36c) {
                throw new EOFException();
            } else if (this.f34a.read(bArr, i10, i11) != i11) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public int readInt() throws IOException {
            int i10 = this.f37d + 4;
            this.f37d = i10;
            if (i10 <= this.f36c) {
                int read = this.f34a.read();
                int read2 = this.f34a.read();
                int read3 = this.f34a.read();
                int read4 = this.f34a.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f35b;
                    if (byteOrder == f32e) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f33f) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    StringBuilder a10 = android.support.v4.media.a.a("Invalid byte order: ");
                    a10.append(this.f35b);
                    throw new IOException(a10.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        public long readLong() throws IOException {
            int i10 = this.f37d + 8;
            this.f37d = i10;
            if (i10 <= this.f36c) {
                int read = this.f34a.read();
                int read2 = this.f34a.read();
                int read3 = this.f34a.read();
                int read4 = this.f34a.read();
                int read5 = this.f34a.read();
                int read6 = this.f34a.read();
                int read7 = this.f34a.read();
                int read8 = this.f34a.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f35b;
                    if (byteOrder == f32e) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    if (byteOrder == f33f) {
                        return (((long) read) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    StringBuilder a10 = android.support.v4.media.a.a("Invalid byte order: ");
                    a10.append(this.f35b);
                    throw new IOException(a10.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public short readShort() throws IOException {
            int i10 = this.f37d + 2;
            this.f37d = i10;
            if (i10 <= this.f36c) {
                int read = this.f34a.read();
                int read2 = this.f34a.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f35b;
                    if (byteOrder == f32e) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f33f) {
                        return (short) ((read << 8) + read2);
                    }
                    StringBuilder a10 = android.support.v4.media.a.a("Invalid byte order: ");
                    a10.append(this.f35b);
                    throw new IOException(a10.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readUTF() throws IOException {
            this.f37d += 2;
            return this.f34a.readUTF();
        }

        public int readUnsignedByte() throws IOException {
            this.f37d++;
            return this.f34a.readUnsignedByte();
        }

        public int readUnsignedShort() throws IOException {
            int i10 = this.f37d + 2;
            this.f37d = i10;
            if (i10 <= this.f36c) {
                int read = this.f34a.read();
                int read2 = this.f34a.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f35b;
                    if (byteOrder == f32e) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f33f) {
                        return (read << 8) + read2;
                    }
                    StringBuilder a10 = android.support.v4.media.a.a("Invalid byte order: ");
                    a10.append(this.f35b);
                    throw new IOException(a10.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public int skipBytes(int i10) throws IOException {
            int min = Math.min(i10, this.f36c - this.f37d);
            int i11 = 0;
            while (i11 < min) {
                i11 += this.f34a.skipBytes(min - i11);
            }
            this.f37d += i11;
            return i11;
        }

        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int read = this.f34a.read(bArr, i10, i11);
            this.f37d += read;
            return read;
        }

        public void readFully(byte[] bArr) throws IOException {
            int length = this.f37d + bArr.length;
            this.f37d = length;
            if (length > this.f36c) {
                throw new EOFException();
            } else if (this.f34a.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public b(byte[] bArr) throws IOException {
            this((InputStream) new ByteArrayInputStream(bArr));
        }
    }

    /* compiled from: ExifInterface */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f38a;

        /* renamed from: b  reason: collision with root package name */
        public final int f39b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f40c;

        public c(int i10, int i11, long j10, byte[] bArr) {
            this.f38a = i10;
            this.f39b = i11;
            this.f40c = bArr;
        }

        public static c a(String str) {
            byte[] bytes = (str + 0).getBytes(a.P);
            return new c(2, bytes.length, bytes);
        }

        public static c b(long j10, ByteOrder byteOrder) {
            long[] jArr = {j10};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.G[4] * 1)]);
            wrap.order(byteOrder);
            for (int i10 = 0; i10 < 1; i10++) {
                wrap.putInt((int) jArr[i10]);
            }
            return new c(4, 1, wrap.array());
        }

        public static c c(e eVar, ByteOrder byteOrder) {
            e[] eVarArr = {eVar};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.G[5] * 1)]);
            wrap.order(byteOrder);
            for (int i10 = 0; i10 < 1; i10++) {
                e eVar2 = eVarArr[i10];
                wrap.putInt((int) eVar2.f45a);
                wrap.putInt((int) eVar2.f46b);
            }
            return new c(5, 1, wrap.array());
        }

        public static c d(int i10, ByteOrder byteOrder) {
            int[] iArr = {i10};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.G[3] * 1)]);
            wrap.order(byteOrder);
            for (int i11 = 0; i11 < 1; i11++) {
                wrap.putShort((short) iArr[i11]);
            }
            return new c(3, 1, wrap.array());
        }

        public double e(ByteOrder byteOrder) {
            Object h10 = h(byteOrder);
            if (h10 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (h10 instanceof String) {
                return Double.parseDouble((String) h10);
            } else {
                if (h10 instanceof long[]) {
                    long[] jArr = (long[]) h10;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h10 instanceof int[]) {
                    int[] iArr = (int[]) h10;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h10 instanceof double[]) {
                    double[] dArr = (double[]) h10;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h10 instanceof e[]) {
                    e[] eVarArr = (e[]) h10;
                    if (eVarArr.length == 1) {
                        e eVar = eVarArr[0];
                        double d10 = (double) eVar.f45a;
                        double d11 = (double) eVar.f46b;
                        Double.isNaN(d10);
                        Double.isNaN(d11);
                        Double.isNaN(d10);
                        Double.isNaN(d11);
                        return d10 / d11;
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        public int f(ByteOrder byteOrder) {
            Object h10 = h(byteOrder);
            if (h10 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (h10 instanceof String) {
                return Integer.parseInt((String) h10);
            } else {
                if (h10 instanceof long[]) {
                    long[] jArr = (long[]) h10;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h10 instanceof int[]) {
                    int[] iArr = (int[]) h10;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        public String g(ByteOrder byteOrder) {
            Object h10 = h(byteOrder);
            if (h10 == null) {
                return null;
            }
            if (h10 instanceof String) {
                return (String) h10;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (h10 instanceof long[]) {
                long[] jArr = (long[]) h10;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (h10 instanceof int[]) {
                int[] iArr = (int[]) h10;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (h10 instanceof double[]) {
                double[] dArr = (double[]) h10;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (!(h10 instanceof e[])) {
                return null;
            } else {
                e[] eVarArr = (e[]) h10;
                while (i10 < eVarArr.length) {
                    sb2.append(eVarArr[i10].f45a);
                    sb2.append('/');
                    sb2.append(eVarArr[i10].f46b);
                    i10++;
                    if (i10 != eVarArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:164:0x019e A[SYNTHETIC, Splitter:B:164:0x019e] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object h(java.nio.ByteOrder r11) {
            /*
                r10 = this;
                java.lang.String r0 = "IOException occurred while closing InputStream"
                java.lang.String r1 = "ExifInterface"
                r2 = 0
                a1.a$b r3 = new a1.a$b     // Catch:{ IOException -> 0x0188, all -> 0x0186 }
                byte[] r4 = r10.f40c     // Catch:{ IOException -> 0x0188, all -> 0x0186 }
                r3.<init>((byte[]) r4)     // Catch:{ IOException -> 0x0188, all -> 0x0186 }
                r3.f35b = r11     // Catch:{ IOException -> 0x0184 }
                int r11 = r10.f38a     // Catch:{ IOException -> 0x0184 }
                r4 = 1
                r5 = 0
                switch(r11) {
                    case 1: goto L_0x0147;
                    case 2: goto L_0x00fc;
                    case 3: goto L_0x00e2;
                    case 4: goto L_0x00c8;
                    case 5: goto L_0x00a5;
                    case 6: goto L_0x0147;
                    case 7: goto L_0x00fc;
                    case 8: goto L_0x008b;
                    case 9: goto L_0x0071;
                    case 10: goto L_0x004c;
                    case 11: goto L_0x0031;
                    case 12: goto L_0x0017;
                    default: goto L_0x0015;
                }     // Catch:{ IOException -> 0x0184 }
            L_0x0015:
                goto L_0x017b
            L_0x0017:
                int r11 = r10.f39b     // Catch:{ IOException -> 0x0184 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0184 }
            L_0x001b:
                int r4 = r10.f39b     // Catch:{ IOException -> 0x0184 }
                if (r5 >= r4) goto L_0x0028
                double r6 = r3.readDouble()     // Catch:{ IOException -> 0x0184 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0184 }
                int r5 = r5 + 1
                goto L_0x001b
            L_0x0028:
                r3.close()     // Catch:{ IOException -> 0x002c }
                goto L_0x0030
            L_0x002c:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0030:
                return r11
            L_0x0031:
                int r11 = r10.f39b     // Catch:{ IOException -> 0x0184 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0184 }
            L_0x0035:
                int r4 = r10.f39b     // Catch:{ IOException -> 0x0184 }
                if (r5 >= r4) goto L_0x0043
                float r4 = r3.readFloat()     // Catch:{ IOException -> 0x0184 }
                double r6 = (double) r4     // Catch:{ IOException -> 0x0184 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0184 }
                int r5 = r5 + 1
                goto L_0x0035
            L_0x0043:
                r3.close()     // Catch:{ IOException -> 0x0047 }
                goto L_0x004b
            L_0x0047:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x004b:
                return r11
            L_0x004c:
                int r11 = r10.f39b     // Catch:{ IOException -> 0x0184 }
                a1.a$e[] r11 = new a1.a.e[r11]     // Catch:{ IOException -> 0x0184 }
            L_0x0050:
                int r4 = r10.f39b     // Catch:{ IOException -> 0x0184 }
                if (r5 >= r4) goto L_0x0068
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0184 }
                long r6 = (long) r4     // Catch:{ IOException -> 0x0184 }
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0184 }
                long r8 = (long) r4     // Catch:{ IOException -> 0x0184 }
                a1.a$e r4 = new a1.a$e     // Catch:{ IOException -> 0x0184 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0184 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0184 }
                int r5 = r5 + 1
                goto L_0x0050
            L_0x0068:
                r3.close()     // Catch:{ IOException -> 0x006c }
                goto L_0x0070
            L_0x006c:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0070:
                return r11
            L_0x0071:
                int r11 = r10.f39b     // Catch:{ IOException -> 0x0184 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0184 }
            L_0x0075:
                int r4 = r10.f39b     // Catch:{ IOException -> 0x0184 }
                if (r5 >= r4) goto L_0x0082
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0184 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0184 }
                int r5 = r5 + 1
                goto L_0x0075
            L_0x0082:
                r3.close()     // Catch:{ IOException -> 0x0086 }
                goto L_0x008a
            L_0x0086:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x008a:
                return r11
            L_0x008b:
                int r11 = r10.f39b     // Catch:{ IOException -> 0x0184 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0184 }
            L_0x008f:
                int r4 = r10.f39b     // Catch:{ IOException -> 0x0184 }
                if (r5 >= r4) goto L_0x009c
                short r4 = r3.readShort()     // Catch:{ IOException -> 0x0184 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0184 }
                int r5 = r5 + 1
                goto L_0x008f
            L_0x009c:
                r3.close()     // Catch:{ IOException -> 0x00a0 }
                goto L_0x00a4
            L_0x00a0:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00a4:
                return r11
            L_0x00a5:
                int r11 = r10.f39b     // Catch:{ IOException -> 0x0184 }
                a1.a$e[] r11 = new a1.a.e[r11]     // Catch:{ IOException -> 0x0184 }
            L_0x00a9:
                int r4 = r10.f39b     // Catch:{ IOException -> 0x0184 }
                if (r5 >= r4) goto L_0x00bf
                long r6 = r3.a()     // Catch:{ IOException -> 0x0184 }
                long r8 = r3.a()     // Catch:{ IOException -> 0x0184 }
                a1.a$e r4 = new a1.a$e     // Catch:{ IOException -> 0x0184 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0184 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0184 }
                int r5 = r5 + 1
                goto L_0x00a9
            L_0x00bf:
                r3.close()     // Catch:{ IOException -> 0x00c3 }
                goto L_0x00c7
            L_0x00c3:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00c7:
                return r11
            L_0x00c8:
                int r11 = r10.f39b     // Catch:{ IOException -> 0x0184 }
                long[] r11 = new long[r11]     // Catch:{ IOException -> 0x0184 }
            L_0x00cc:
                int r4 = r10.f39b     // Catch:{ IOException -> 0x0184 }
                if (r5 >= r4) goto L_0x00d9
                long r6 = r3.a()     // Catch:{ IOException -> 0x0184 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0184 }
                int r5 = r5 + 1
                goto L_0x00cc
            L_0x00d9:
                r3.close()     // Catch:{ IOException -> 0x00dd }
                goto L_0x00e1
            L_0x00dd:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00e1:
                return r11
            L_0x00e2:
                int r11 = r10.f39b     // Catch:{ IOException -> 0x0184 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0184 }
            L_0x00e6:
                int r4 = r10.f39b     // Catch:{ IOException -> 0x0184 }
                if (r5 >= r4) goto L_0x00f3
                int r4 = r3.readUnsignedShort()     // Catch:{ IOException -> 0x0184 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0184 }
                int r5 = r5 + 1
                goto L_0x00e6
            L_0x00f3:
                r3.close()     // Catch:{ IOException -> 0x00f7 }
                goto L_0x00fb
            L_0x00f7:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00fb:
                return r11
            L_0x00fc:
                int r11 = r10.f39b     // Catch:{ IOException -> 0x0184 }
                byte[] r6 = a1.a.H     // Catch:{ IOException -> 0x0184 }
                int r6 = r6.length     // Catch:{ IOException -> 0x0184 }
                if (r11 < r6) goto L_0x0119
                r11 = 0
            L_0x0104:
                byte[] r6 = a1.a.H     // Catch:{ IOException -> 0x0184 }
                int r7 = r6.length     // Catch:{ IOException -> 0x0184 }
                if (r11 >= r7) goto L_0x0116
                byte[] r7 = r10.f40c     // Catch:{ IOException -> 0x0184 }
                byte r7 = r7[r11]     // Catch:{ IOException -> 0x0184 }
                byte r8 = r6[r11]     // Catch:{ IOException -> 0x0184 }
                if (r7 == r8) goto L_0x0113
                r4 = 0
                goto L_0x0116
            L_0x0113:
                int r11 = r11 + 1
                goto L_0x0104
            L_0x0116:
                if (r4 == 0) goto L_0x0119
                int r5 = r6.length     // Catch:{ IOException -> 0x0184 }
            L_0x0119:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0184 }
                r11.<init>()     // Catch:{ IOException -> 0x0184 }
            L_0x011e:
                int r4 = r10.f39b     // Catch:{ IOException -> 0x0184 }
                if (r5 >= r4) goto L_0x013a
                byte[] r4 = r10.f40c     // Catch:{ IOException -> 0x0184 }
                byte r4 = r4[r5]     // Catch:{ IOException -> 0x0184 }
                if (r4 != 0) goto L_0x0129
                goto L_0x013a
            L_0x0129:
                r6 = 32
                if (r4 < r6) goto L_0x0132
                char r4 = (char) r4     // Catch:{ IOException -> 0x0184 }
                r11.append(r4)     // Catch:{ IOException -> 0x0184 }
                goto L_0x0137
            L_0x0132:
                r4 = 63
                r11.append(r4)     // Catch:{ IOException -> 0x0184 }
            L_0x0137:
                int r5 = r5 + 1
                goto L_0x011e
            L_0x013a:
                java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0184 }
                r3.close()     // Catch:{ IOException -> 0x0142 }
                goto L_0x0146
            L_0x0142:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0146:
                return r11
            L_0x0147:
                byte[] r11 = r10.f40c     // Catch:{ IOException -> 0x0184 }
                int r6 = r11.length     // Catch:{ IOException -> 0x0184 }
                if (r6 != r4) goto L_0x016b
                byte r6 = r11[r5]     // Catch:{ IOException -> 0x0184 }
                if (r6 < 0) goto L_0x016b
                byte r6 = r11[r5]     // Catch:{ IOException -> 0x0184 }
                if (r6 > r4) goto L_0x016b
                java.lang.String r6 = new java.lang.String     // Catch:{ IOException -> 0x0184 }
                char[] r4 = new char[r4]     // Catch:{ IOException -> 0x0184 }
                byte r11 = r11[r5]     // Catch:{ IOException -> 0x0184 }
                int r11 = r11 + 48
                char r11 = (char) r11     // Catch:{ IOException -> 0x0184 }
                r4[r5] = r11     // Catch:{ IOException -> 0x0184 }
                r6.<init>(r4)     // Catch:{ IOException -> 0x0184 }
                r3.close()     // Catch:{ IOException -> 0x0166 }
                goto L_0x016a
            L_0x0166:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x016a:
                return r6
            L_0x016b:
                java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x0184 }
                java.nio.charset.Charset r5 = a1.a.P     // Catch:{ IOException -> 0x0184 }
                r4.<init>(r11, r5)     // Catch:{ IOException -> 0x0184 }
                r3.close()     // Catch:{ IOException -> 0x0176 }
                goto L_0x017a
            L_0x0176:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x017a:
                return r4
            L_0x017b:
                r3.close()     // Catch:{ IOException -> 0x017f }
                goto L_0x0183
            L_0x017f:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x0183:
                return r2
            L_0x0184:
                r11 = move-exception
                goto L_0x018a
            L_0x0186:
                r11 = move-exception
                goto L_0x019c
            L_0x0188:
                r11 = move-exception
                r3 = r2
            L_0x018a:
                java.lang.String r4 = "IOException occurred during reading a value"
                android.util.Log.w(r1, r4, r11)     // Catch:{ all -> 0x019a }
                if (r3 == 0) goto L_0x0199
                r3.close()     // Catch:{ IOException -> 0x0195 }
                goto L_0x0199
            L_0x0195:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x0199:
                return r2
            L_0x019a:
                r11 = move-exception
                r2 = r3
            L_0x019c:
                if (r2 == 0) goto L_0x01a6
                r2.close()     // Catch:{ IOException -> 0x01a2 }
                goto L_0x01a6
            L_0x01a2:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x01a6:
                goto L_0x01a8
            L_0x01a7:
                throw r11
            L_0x01a8:
                goto L_0x01a7
            */
            throw new UnsupportedOperationException("Method not decompiled: a1.a.c.h(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            StringBuilder a10 = android.support.v4.media.a.a("(");
            a10.append(a.F[this.f38a]);
            a10.append(", data length:");
            return v.e.a(a10, this.f40c.length, ")");
        }

        public c(int i10, int i11, byte[] bArr) {
            this.f38a = i10;
            this.f39b = i11;
            this.f40c = bArr;
        }
    }

    /* compiled from: ExifInterface */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f41a;

        /* renamed from: b  reason: collision with root package name */
        public final String f42b;

        /* renamed from: c  reason: collision with root package name */
        public final int f43c;

        /* renamed from: d  reason: collision with root package name */
        public final int f44d;

        public d(String str, int i10, int i11) {
            this.f42b = str;
            this.f41a = i10;
            this.f43c = i11;
            this.f44d = -1;
        }

        public d(String str, int i10, int i11, int i12) {
            this.f42b = str;
            this.f41a = i10;
            this.f43c = i11;
            this.f44d = i12;
        }
    }
}

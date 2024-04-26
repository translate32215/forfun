package p5;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Log;
import com.startapp.b4;
import d5.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import o1.q;
import o4.k;
import v6.e0;

@SuppressLint({"InlinedApi"})
/* compiled from: MediaCodecUtil */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f23924a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap<b, List<k>> f23925b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public static int f23926c = -1;

    /* compiled from: MediaCodecUtil */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f23927a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f23928b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f23929c;

        public b(String str, boolean z10, boolean z11) {
            this.f23927a = str;
            this.f23928b = z10;
            this.f23929c = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            if (TextUtils.equals(this.f23927a, bVar.f23927a) && this.f23928b == bVar.f23928b && this.f23929c == bVar.f23929c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10 = 1231;
            int a10 = (q.a(this.f23927a, 31, 31) + (this.f23928b ? 1231 : 1237)) * 31;
            if (!this.f23929c) {
                i10 = 1237;
            }
            return a10 + i10;
        }
    }

    /* compiled from: MediaCodecUtil */
    public static class c extends Exception {
        public c(Throwable th, a aVar) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* compiled from: MediaCodecUtil */
    public interface d {
        MediaCodecInfo a(int i10);

        int b();

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean e();
    }

    /* compiled from: MediaCodecUtil */
    public static final class e implements d {
        public e(a aVar) {
        }

        public MediaCodecInfo a(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        public int b() {
            return MediaCodecList.getCodecCount();
        }

        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        public boolean d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        public boolean e() {
            return false;
        }
    }

    /* compiled from: MediaCodecUtil */
    public static final class f implements d {

        /* renamed from: a  reason: collision with root package name */
        public final int f23930a;

        /* renamed from: b  reason: collision with root package name */
        public MediaCodecInfo[] f23931b;

        public f(boolean z10, boolean z11) {
            this.f23930a = (z10 || z11) ? 1 : 0;
        }

        public MediaCodecInfo a(int i10) {
            if (this.f23931b == null) {
                this.f23931b = new MediaCodecList(this.f23930a).getCodecInfos();
            }
            return this.f23931b[i10];
        }

        public int b() {
            if (this.f23931b == null) {
                this.f23931b = new MediaCodecList(this.f23930a).getCodecInfos();
            }
            return this.f23931b.length;
        }

        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        public boolean d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        public boolean e() {
            return true;
        }
    }

    /* compiled from: MediaCodecUtil */
    public interface g<T> {
        int c(T t10);
    }

    public static void a(String str, List<k> list) {
        if ("audio/raw".equals(str)) {
            if (e0.f26436a < 26 && e0.f26437b.equals("R9") && list.size() == 1 && list.get(0).f23877a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(k.i("OMX.google.raw.decoder", "audio/raw", "audio/raw", (MediaCodecInfo.CodecCapabilities) null, false, true, false, false, false));
            }
            j(list, k.f22956b);
        }
        int i10 = e0.f26436a;
        if (i10 < 21 && list.size() > 1) {
            String str2 = list.get(0).f23877a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                j(list, m.f13037a);
            }
        }
        if (i10 < 30 && list.size() > 1 && "OMX.qti.audio.decoder.flac".equals(list.get(0).f23877a)) {
            list.add(list.remove(0));
        }
    }

    public static String b(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (!str2.equals("audio/flac") || !"OMX.lge.flac.decoder".equals(str)) {
                return null;
            }
            return "audio/x-lg-flac";
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x076c, code lost:
        r15 = r15.f27025c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x03a0 A[Catch:{ NumberFormatException -> 0x03b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:508:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> c(x4.b0 r15) {
        /*
            java.lang.String r0 = r15.f27405i
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r1 = "\\."
            java.lang.String[] r0 = r0.split(r1)
            java.lang.String r1 = r15.f27408t
            java.lang.String r2 = "video/dolby-vision"
            boolean r1 = r2.equals(r1)
            r2 = 512(0x200, float:7.175E-43)
            r3 = 256(0x100, float:3.59E-43)
            r4 = 128(0x80, float:1.794E-43)
            java.lang.String r5 = "MediaCodecUtil"
            r6 = 3
            r7 = 1
            if (r1 == 0) goto L_0x0214
            java.lang.String r15 = r15.f27405i
            int r1 = r0.length
            java.lang.String r8 = "Ignoring malformed Dolby Vision codec string: "
            if (r1 >= r6) goto L_0x002c
            androidx.appcompat.widget.z0.a(r8, r15, r5)
            goto L_0x020c
        L_0x002c:
            java.util.regex.Pattern r1 = f23924a
            r6 = r0[r7]
            java.util.regex.Matcher r1 = r1.matcher(r6)
            boolean r6 = r1.matches()
            if (r6 != 0) goto L_0x003f
            androidx.appcompat.widget.z0.a(r8, r15, r5)
            goto L_0x020c
        L_0x003f:
            java.lang.String r15 = r1.group(r7)
            java.lang.String r1 = "09"
            java.lang.String r6 = "08"
            java.lang.String r7 = "07"
            java.lang.String r8 = "06"
            java.lang.String r9 = "05"
            java.lang.String r10 = "04"
            java.lang.String r11 = "03"
            java.lang.String r12 = "02"
            java.lang.String r13 = "01"
            if (r15 != 0) goto L_0x0059
            goto L_0x0104
        L_0x0059:
            int r14 = r15.hashCode()
            switch(r14) {
                case 1536: goto L_0x00b7;
                case 1537: goto L_0x00ae;
                case 1538: goto L_0x00a5;
                case 1539: goto L_0x009c;
                case 1540: goto L_0x0093;
                case 1541: goto L_0x008a;
                case 1542: goto L_0x0081;
                case 1543: goto L_0x0078;
                case 1544: goto L_0x006e;
                case 1545: goto L_0x0062;
                default: goto L_0x0060;
            }
        L_0x0060:
            goto L_0x00c2
        L_0x0062:
            boolean r14 = r15.equals(r1)
            if (r14 != 0) goto L_0x006a
            goto L_0x00c2
        L_0x006a:
            r14 = 9
            goto L_0x00c3
        L_0x006e:
            boolean r14 = r15.equals(r6)
            if (r14 != 0) goto L_0x0075
            goto L_0x00c2
        L_0x0075:
            r14 = 8
            goto L_0x00c3
        L_0x0078:
            boolean r14 = r15.equals(r7)
            if (r14 != 0) goto L_0x007f
            goto L_0x00c2
        L_0x007f:
            r14 = 7
            goto L_0x00c3
        L_0x0081:
            boolean r14 = r15.equals(r8)
            if (r14 != 0) goto L_0x0088
            goto L_0x00c2
        L_0x0088:
            r14 = 6
            goto L_0x00c3
        L_0x008a:
            boolean r14 = r15.equals(r9)
            if (r14 != 0) goto L_0x0091
            goto L_0x00c2
        L_0x0091:
            r14 = 5
            goto L_0x00c3
        L_0x0093:
            boolean r14 = r15.equals(r10)
            if (r14 != 0) goto L_0x009a
            goto L_0x00c2
        L_0x009a:
            r14 = 4
            goto L_0x00c3
        L_0x009c:
            boolean r14 = r15.equals(r11)
            if (r14 != 0) goto L_0x00a3
            goto L_0x00c2
        L_0x00a3:
            r14 = 3
            goto L_0x00c3
        L_0x00a5:
            boolean r14 = r15.equals(r12)
            if (r14 != 0) goto L_0x00ac
            goto L_0x00c2
        L_0x00ac:
            r14 = 2
            goto L_0x00c3
        L_0x00ae:
            boolean r14 = r15.equals(r13)
            if (r14 != 0) goto L_0x00b5
            goto L_0x00c2
        L_0x00b5:
            r14 = 1
            goto L_0x00c3
        L_0x00b7:
            java.lang.String r14 = "00"
            boolean r14 = r15.equals(r14)
            if (r14 != 0) goto L_0x00c0
            goto L_0x00c2
        L_0x00c0:
            r14 = 0
            goto L_0x00c3
        L_0x00c2:
            r14 = -1
        L_0x00c3:
            switch(r14) {
                case 0: goto L_0x00fe;
                case 1: goto L_0x00f8;
                case 2: goto L_0x00f2;
                case 3: goto L_0x00eb;
                case 4: goto L_0x00e4;
                case 5: goto L_0x00dd;
                case 6: goto L_0x00d6;
                case 7: goto L_0x00d1;
                case 8: goto L_0x00cc;
                case 9: goto L_0x00c7;
                default: goto L_0x00c6;
            }
        L_0x00c6:
            goto L_0x0104
        L_0x00c7:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r2)
            goto L_0x0105
        L_0x00cc:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
            goto L_0x0105
        L_0x00d1:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)
            goto L_0x0105
        L_0x00d6:
            r14 = 64
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x0105
        L_0x00dd:
            r14 = 32
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x0105
        L_0x00e4:
            r14 = 16
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x0105
        L_0x00eb:
            r14 = 8
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x0105
        L_0x00f2:
            r14 = 4
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x0105
        L_0x00f8:
            r14 = 2
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x0105
        L_0x00fe:
            r14 = 1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x0105
        L_0x0104:
            r14 = 0
        L_0x0105:
            if (r14 != 0) goto L_0x010e
            java.lang.String r0 = "Unknown Dolby Vision profile string: "
            androidx.appcompat.widget.z0.a(r0, r15, r5)
            goto L_0x020c
        L_0x010e:
            r15 = 2
            r15 = r0[r15]
            if (r15 != 0) goto L_0x0115
            goto L_0x0204
        L_0x0115:
            int r0 = r15.hashCode()
            switch(r0) {
                case 1537: goto L_0x0174;
                case 1538: goto L_0x016b;
                case 1539: goto L_0x0162;
                case 1540: goto L_0x0159;
                case 1541: goto L_0x014e;
                case 1542: goto L_0x0143;
                case 1543: goto L_0x0138;
                case 1544: goto L_0x012d;
                case 1545: goto L_0x0121;
                default: goto L_0x011c;
            }
        L_0x011c:
            switch(r0) {
                case 1567: goto L_0x01a1;
                case 1568: goto L_0x0195;
                case 1569: goto L_0x0189;
                case 1570: goto L_0x017d;
                default: goto L_0x011f;
            }
        L_0x011f:
            goto L_0x01ad
        L_0x0121:
            boolean r0 = r15.equals(r1)
            if (r0 != 0) goto L_0x0129
            goto L_0x01ad
        L_0x0129:
            r0 = 8
            goto L_0x01ae
        L_0x012d:
            boolean r0 = r15.equals(r6)
            if (r0 != 0) goto L_0x0135
            goto L_0x01ad
        L_0x0135:
            r0 = 7
            goto L_0x01ae
        L_0x0138:
            boolean r0 = r15.equals(r7)
            if (r0 != 0) goto L_0x0140
            goto L_0x01ad
        L_0x0140:
            r0 = 6
            goto L_0x01ae
        L_0x0143:
            boolean r0 = r15.equals(r8)
            if (r0 != 0) goto L_0x014b
            goto L_0x01ad
        L_0x014b:
            r0 = 5
            goto L_0x01ae
        L_0x014e:
            boolean r0 = r15.equals(r9)
            if (r0 != 0) goto L_0x0156
            goto L_0x01ad
        L_0x0156:
            r0 = 4
            goto L_0x01ae
        L_0x0159:
            boolean r0 = r15.equals(r10)
            if (r0 != 0) goto L_0x0160
            goto L_0x01ad
        L_0x0160:
            r0 = 3
            goto L_0x01ae
        L_0x0162:
            boolean r0 = r15.equals(r11)
            if (r0 != 0) goto L_0x0169
            goto L_0x01ad
        L_0x0169:
            r0 = 2
            goto L_0x01ae
        L_0x016b:
            boolean r0 = r15.equals(r12)
            if (r0 != 0) goto L_0x0172
            goto L_0x01ad
        L_0x0172:
            r0 = 1
            goto L_0x01ae
        L_0x0174:
            boolean r0 = r15.equals(r13)
            if (r0 != 0) goto L_0x017b
            goto L_0x01ad
        L_0x017b:
            r0 = 0
            goto L_0x01ae
        L_0x017d:
            java.lang.String r0 = "13"
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L_0x0186
            goto L_0x01ad
        L_0x0186:
            r0 = 12
            goto L_0x01ae
        L_0x0189:
            java.lang.String r0 = "12"
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L_0x0192
            goto L_0x01ad
        L_0x0192:
            r0 = 11
            goto L_0x01ae
        L_0x0195:
            java.lang.String r0 = "11"
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L_0x019e
            goto L_0x01ad
        L_0x019e:
            r0 = 10
            goto L_0x01ae
        L_0x01a1:
            java.lang.String r0 = "10"
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L_0x01aa
            goto L_0x01ad
        L_0x01aa:
            r0 = 9
            goto L_0x01ae
        L_0x01ad:
            r0 = -1
        L_0x01ae:
            switch(r0) {
                case 0: goto L_0x01fe;
                case 1: goto L_0x01f8;
                case 2: goto L_0x01f2;
                case 3: goto L_0x01eb;
                case 4: goto L_0x01e4;
                case 5: goto L_0x01dd;
                case 6: goto L_0x01d6;
                case 7: goto L_0x01d1;
                case 8: goto L_0x01cc;
                case 9: goto L_0x01c7;
                case 10: goto L_0x01c0;
                case 11: goto L_0x01b9;
                case 12: goto L_0x01b2;
                default: goto L_0x01b1;
            }
        L_0x01b1:
            goto L_0x0204
        L_0x01b2:
            r0 = 4096(0x1000, float:5.74E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0205
        L_0x01b9:
            r0 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0205
        L_0x01c0:
            r0 = 1024(0x400, float:1.435E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0205
        L_0x01c7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x0205
        L_0x01cc:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto L_0x0205
        L_0x01d1:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x0205
        L_0x01d6:
            r0 = 64
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0205
        L_0x01dd:
            r0 = 32
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0205
        L_0x01e4:
            r0 = 16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0205
        L_0x01eb:
            r0 = 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0205
        L_0x01f2:
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0205
        L_0x01f8:
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0205
        L_0x01fe:
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0205
        L_0x0204:
            r0 = 0
        L_0x0205:
            if (r0 != 0) goto L_0x020e
            java.lang.String r0 = "Unknown Dolby Vision level string: "
            androidx.appcompat.widget.z0.a(r0, r15, r5)
        L_0x020c:
            r15 = 0
            goto L_0x0213
        L_0x020e:
            android.util.Pair r15 = new android.util.Pair
            r15.<init>(r14, r0)
        L_0x0213:
            return r15
        L_0x0214:
            r1 = 0
            r1 = r0[r1]
            r1.getClass()
            int r6 = r1.hashCode()
            switch(r6) {
                case 3004662: goto L_0x0264;
                case 3006243: goto L_0x0259;
                case 3006244: goto L_0x024e;
                case 3199032: goto L_0x0243;
                case 3214780: goto L_0x0238;
                case 3356560: goto L_0x022d;
                case 3624515: goto L_0x0222;
                default: goto L_0x0221;
            }
        L_0x0221:
            goto L_0x026f
        L_0x0222:
            java.lang.String r6 = "vp09"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x022b
            goto L_0x026f
        L_0x022b:
            r1 = 6
            goto L_0x0270
        L_0x022d:
            java.lang.String r6 = "mp4a"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0236
            goto L_0x026f
        L_0x0236:
            r1 = 5
            goto L_0x0270
        L_0x0238:
            java.lang.String r6 = "hvc1"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0241
            goto L_0x026f
        L_0x0241:
            r1 = 4
            goto L_0x0270
        L_0x0243:
            java.lang.String r6 = "hev1"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x024c
            goto L_0x026f
        L_0x024c:
            r1 = 3
            goto L_0x0270
        L_0x024e:
            java.lang.String r6 = "avc2"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0257
            goto L_0x026f
        L_0x0257:
            r1 = 2
            goto L_0x0270
        L_0x0259:
            java.lang.String r6 = "avc1"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0262
            goto L_0x026f
        L_0x0262:
            r1 = 1
            goto L_0x0270
        L_0x0264:
            java.lang.String r6 = "av01"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x026d
            goto L_0x026f
        L_0x026d:
            r1 = 0
            goto L_0x0270
        L_0x026f:
            r1 = -1
        L_0x0270:
            switch(r1) {
                case 0: goto L_0x071f;
                case 1: goto L_0x0629;
                case 2: goto L_0x0629;
                case 3: goto L_0x03b4;
                case 4: goto L_0x03b4;
                case 5: goto L_0x0326;
                case 6: goto L_0x0275;
                default: goto L_0x0273;
            }
        L_0x0273:
            r15 = 0
            return r15
        L_0x0275:
            r1 = 0
            java.lang.String r15 = r15.f27405i
            int r2 = r0.length
            java.lang.String r3 = "Ignoring malformed VP9 codec string: "
            r4 = 3
            if (r2 >= r4) goto L_0x0283
            androidx.appcompat.widget.z0.a(r3, r15, r5)
            goto L_0x0325
        L_0x0283:
            r2 = 1
            r4 = r0[r2]     // Catch:{ NumberFormatException -> 0x0322 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x0322 }
            r6 = 2
            r0 = r0[r6]     // Catch:{ NumberFormatException -> 0x0322 }
            int r15 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0322 }
            if (r4 == 0) goto L_0x02a3
            if (r4 == r2) goto L_0x02a1
            if (r4 == r6) goto L_0x029f
            r0 = 3
            if (r4 == r0) goto L_0x029c
            r0 = -1
            goto L_0x02a4
        L_0x029c:
            r0 = 8
            goto L_0x02a4
        L_0x029f:
            r0 = 4
            goto L_0x02a4
        L_0x02a1:
            r0 = 2
            goto L_0x02a4
        L_0x02a3:
            r0 = 1
        L_0x02a4:
            r2 = -1
            if (r0 != r2) goto L_0x02ae
            java.lang.String r15 = "Unknown VP9 profile: "
            f0.j.a(r15, r4, r5)
            goto L_0x0325
        L_0x02ae:
            r2 = 10
            if (r15 == r2) goto L_0x030a
            r2 = 11
            if (r15 == r2) goto L_0x0307
            r2 = 20
            if (r15 == r2) goto L_0x0304
            r2 = 21
            if (r15 == r2) goto L_0x0300
            r2 = 30
            if (r15 == r2) goto L_0x02fc
            r2 = 31
            if (r15 == r2) goto L_0x02f8
            r2 = 40
            if (r15 == r2) goto L_0x02f4
            r2 = 41
            if (r15 == r2) goto L_0x02f0
            r2 = 50
            if (r15 == r2) goto L_0x02ec
            r2 = 51
            if (r15 == r2) goto L_0x02e8
            switch(r15) {
                case 60: goto L_0x02e4;
                case 61: goto L_0x02e0;
                case 62: goto L_0x02dc;
                default: goto L_0x02d9;
            }
        L_0x02d9:
            r3 = -1
            r2 = -1
            goto L_0x030c
        L_0x02dc:
            r2 = 8192(0x2000, float:1.14794E-41)
            r3 = -1
            goto L_0x030c
        L_0x02e0:
            r3 = -1
            r2 = 4096(0x1000, float:5.74E-42)
            goto L_0x030c
        L_0x02e4:
            r3 = -1
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x030c
        L_0x02e8:
            r3 = -1
            r2 = 512(0x200, float:7.175E-43)
            goto L_0x030c
        L_0x02ec:
            r3 = -1
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x030c
        L_0x02f0:
            r3 = -1
            r2 = 128(0x80, float:1.794E-43)
            goto L_0x030c
        L_0x02f4:
            r3 = -1
            r2 = 64
            goto L_0x030c
        L_0x02f8:
            r3 = -1
            r2 = 32
            goto L_0x030c
        L_0x02fc:
            r3 = -1
            r2 = 16
            goto L_0x030c
        L_0x0300:
            r3 = -1
            r2 = 8
            goto L_0x030c
        L_0x0304:
            r3 = -1
            r2 = 4
            goto L_0x030c
        L_0x0307:
            r3 = -1
            r2 = 2
            goto L_0x030c
        L_0x030a:
            r3 = -1
            r2 = 1
        L_0x030c:
            if (r2 != r3) goto L_0x0314
            java.lang.String r0 = "Unknown VP9 level: "
            f0.j.a(r0, r15, r5)
            goto L_0x0325
        L_0x0314:
            android.util.Pair r1 = new android.util.Pair
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.<init>(r15, r0)
            goto L_0x0325
        L_0x0322:
            androidx.appcompat.widget.z0.a(r3, r15, r5)
        L_0x0325:
            return r1
        L_0x0326:
            r1 = 0
            java.lang.String r15 = r15.f27405i
            int r2 = r0.length
            java.lang.String r3 = "Ignoring malformed MP4A codec string: "
            r4 = 3
            if (r2 == r4) goto L_0x0334
            androidx.appcompat.widget.z0.a(r3, r15, r5)
            goto L_0x03b3
        L_0x0334:
            r2 = 1
            r2 = r0[r2]     // Catch:{ NumberFormatException -> 0x03b0 }
            r4 = 16
            int r2 = java.lang.Integer.parseInt(r2, r4)     // Catch:{ NumberFormatException -> 0x03b0 }
            java.lang.String r2 = v6.s.f(r2)     // Catch:{ NumberFormatException -> 0x03b0 }
            java.lang.String r4 = "audio/mp4a-latm"
            boolean r2 = r4.equals(r2)     // Catch:{ NumberFormatException -> 0x03b0 }
            if (r2 == 0) goto L_0x03b3
            r2 = 2
            r0 = r0[r2]     // Catch:{ NumberFormatException -> 0x03b0 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x03b0 }
            r2 = 17
            if (r0 == r2) goto L_0x0399
            r2 = 20
            if (r0 == r2) goto L_0x0394
            r2 = 23
            if (r0 == r2) goto L_0x038f
            r2 = 29
            if (r0 == r2) goto L_0x038a
            r2 = 39
            if (r0 == r2) goto L_0x0385
            r2 = 42
            if (r0 == r2) goto L_0x0380
            switch(r0) {
                case 1: goto L_0x037d;
                case 2: goto L_0x037a;
                case 3: goto L_0x0377;
                case 4: goto L_0x0374;
                case 5: goto L_0x0371;
                case 6: goto L_0x036e;
                default: goto L_0x036b;
            }     // Catch:{ NumberFormatException -> 0x03b0 }
        L_0x036b:
            r0 = -1
            r2 = -1
            goto L_0x039e
        L_0x036e:
            r0 = -1
            r2 = 6
            goto L_0x039e
        L_0x0371:
            r0 = -1
            r2 = 5
            goto L_0x039e
        L_0x0374:
            r0 = -1
            r2 = 4
            goto L_0x039e
        L_0x0377:
            r0 = -1
            r2 = 3
            goto L_0x039e
        L_0x037a:
            r0 = -1
            r2 = 2
            goto L_0x039e
        L_0x037d:
            r0 = -1
            r2 = 1
            goto L_0x039e
        L_0x0380:
            r0 = 42
            r2 = 42
            goto L_0x039d
        L_0x0385:
            r0 = 39
            r2 = 39
            goto L_0x039d
        L_0x038a:
            r0 = 29
            r2 = 29
            goto L_0x039d
        L_0x038f:
            r0 = 23
            r2 = 23
            goto L_0x039d
        L_0x0394:
            r0 = 20
            r2 = 20
            goto L_0x039d
        L_0x0399:
            r0 = 17
            r2 = 17
        L_0x039d:
            r0 = -1
        L_0x039e:
            if (r2 == r0) goto L_0x03b3
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x03b0 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x03b0 }
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x03b0 }
            r0.<init>(r2, r4)     // Catch:{ NumberFormatException -> 0x03b0 }
            r1 = r0
            goto L_0x03b3
        L_0x03b0:
            androidx.appcompat.widget.z0.a(r3, r15, r5)
        L_0x03b3:
            return r1
        L_0x03b4:
            r1 = 0
            java.lang.String r15 = r15.f27405i
            int r6 = r0.length
            java.lang.String r7 = "Ignoring malformed HEVC codec string: "
            r8 = 4
            if (r6 >= r8) goto L_0x03c2
            androidx.appcompat.widget.z0.a(r7, r15, r5)
            goto L_0x0628
        L_0x03c2:
            java.util.regex.Pattern r6 = f23924a
            r8 = 1
            r9 = r0[r8]
            java.util.regex.Matcher r6 = r6.matcher(r9)
            boolean r9 = r6.matches()
            if (r9 != 0) goto L_0x03d6
            androidx.appcompat.widget.z0.a(r7, r15, r5)
            goto L_0x0628
        L_0x03d6:
            java.lang.String r15 = r6.group(r8)
            java.lang.String r6 = "1"
            boolean r6 = r6.equals(r15)
            if (r6 == 0) goto L_0x03e4
            r15 = 1
            goto L_0x03ed
        L_0x03e4:
            java.lang.String r6 = "2"
            boolean r6 = r6.equals(r15)
            if (r6 == 0) goto L_0x0623
            r15 = 2
        L_0x03ed:
            r6 = 3
            r0 = r0[r6]
            if (r0 != 0) goto L_0x03f4
            goto L_0x0610
        L_0x03f4:
            int r6 = r0.hashCode()
            switch(r6) {
                case 70821: goto L_0x0546;
                case 70914: goto L_0x053b;
                case 70917: goto L_0x0530;
                case 71007: goto L_0x0525;
                case 71010: goto L_0x051a;
                case 74665: goto L_0x050f;
                case 74758: goto L_0x0504;
                case 74761: goto L_0x04f9;
                case 74851: goto L_0x04eb;
                case 74854: goto L_0x04dd;
                case 2193639: goto L_0x04cf;
                case 2193642: goto L_0x04c1;
                case 2193732: goto L_0x04b3;
                case 2193735: goto L_0x04a5;
                case 2193738: goto L_0x0497;
                case 2193825: goto L_0x0489;
                case 2193828: goto L_0x047b;
                case 2193831: goto L_0x046d;
                case 2312803: goto L_0x045f;
                case 2312806: goto L_0x0451;
                case 2312896: goto L_0x0443;
                case 2312899: goto L_0x0435;
                case 2312902: goto L_0x0427;
                case 2312989: goto L_0x0419;
                case 2312992: goto L_0x040b;
                case 2312995: goto L_0x03fd;
                default: goto L_0x03fb;
            }
        L_0x03fb:
            goto L_0x0551
        L_0x03fd:
            java.lang.String r6 = "L186"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x0407
            goto L_0x0551
        L_0x0407:
            r6 = 25
            goto L_0x0552
        L_0x040b:
            java.lang.String r6 = "L183"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x0415
            goto L_0x0551
        L_0x0415:
            r6 = 24
            goto L_0x0552
        L_0x0419:
            java.lang.String r6 = "L180"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x0423
            goto L_0x0551
        L_0x0423:
            r6 = 23
            goto L_0x0552
        L_0x0427:
            java.lang.String r6 = "L156"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x0431
            goto L_0x0551
        L_0x0431:
            r6 = 22
            goto L_0x0552
        L_0x0435:
            java.lang.String r6 = "L153"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x043f
            goto L_0x0551
        L_0x043f:
            r6 = 21
            goto L_0x0552
        L_0x0443:
            java.lang.String r6 = "L150"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x044d
            goto L_0x0551
        L_0x044d:
            r6 = 20
            goto L_0x0552
        L_0x0451:
            java.lang.String r6 = "L123"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x045b
            goto L_0x0551
        L_0x045b:
            r6 = 19
            goto L_0x0552
        L_0x045f:
            java.lang.String r6 = "L120"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x0469
            goto L_0x0551
        L_0x0469:
            r6 = 18
            goto L_0x0552
        L_0x046d:
            java.lang.String r6 = "H186"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x0477
            goto L_0x0551
        L_0x0477:
            r6 = 17
            goto L_0x0552
        L_0x047b:
            java.lang.String r6 = "H183"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x0485
            goto L_0x0551
        L_0x0485:
            r6 = 16
            goto L_0x0552
        L_0x0489:
            java.lang.String r6 = "H180"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x0493
            goto L_0x0551
        L_0x0493:
            r6 = 15
            goto L_0x0552
        L_0x0497:
            java.lang.String r6 = "H156"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x04a1
            goto L_0x0551
        L_0x04a1:
            r6 = 14
            goto L_0x0552
        L_0x04a5:
            java.lang.String r6 = "H153"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x04af
            goto L_0x0551
        L_0x04af:
            r6 = 13
            goto L_0x0552
        L_0x04b3:
            java.lang.String r6 = "H150"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x04bd
            goto L_0x0551
        L_0x04bd:
            r6 = 12
            goto L_0x0552
        L_0x04c1:
            java.lang.String r6 = "H123"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x04cb
            goto L_0x0551
        L_0x04cb:
            r6 = 11
            goto L_0x0552
        L_0x04cf:
            java.lang.String r6 = "H120"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x04d9
            goto L_0x0551
        L_0x04d9:
            r6 = 10
            goto L_0x0552
        L_0x04dd:
            java.lang.String r6 = "L93"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x04e7
            goto L_0x0551
        L_0x04e7:
            r6 = 9
            goto L_0x0552
        L_0x04eb:
            java.lang.String r6 = "L90"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x04f5
            goto L_0x0551
        L_0x04f5:
            r6 = 8
            goto L_0x0552
        L_0x04f9:
            java.lang.String r6 = "L63"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x0502
            goto L_0x0551
        L_0x0502:
            r6 = 7
            goto L_0x0552
        L_0x0504:
            java.lang.String r6 = "L60"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x050d
            goto L_0x0551
        L_0x050d:
            r6 = 6
            goto L_0x0552
        L_0x050f:
            java.lang.String r6 = "L30"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x0518
            goto L_0x0551
        L_0x0518:
            r6 = 5
            goto L_0x0552
        L_0x051a:
            java.lang.String r6 = "H93"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x0523
            goto L_0x0551
        L_0x0523:
            r6 = 4
            goto L_0x0552
        L_0x0525:
            java.lang.String r6 = "H90"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x052e
            goto L_0x0551
        L_0x052e:
            r6 = 3
            goto L_0x0552
        L_0x0530:
            java.lang.String r6 = "H63"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x0539
            goto L_0x0551
        L_0x0539:
            r6 = 2
            goto L_0x0552
        L_0x053b:
            java.lang.String r6 = "H60"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x0544
            goto L_0x0551
        L_0x0544:
            r6 = 1
            goto L_0x0552
        L_0x0546:
            java.lang.String r6 = "H30"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x054f
            goto L_0x0551
        L_0x054f:
            r6 = 0
            goto L_0x0552
        L_0x0551:
            r6 = -1
        L_0x0552:
            switch(r6) {
                case 0: goto L_0x060a;
                case 1: goto L_0x0603;
                case 2: goto L_0x05fc;
                case 3: goto L_0x05f7;
                case 4: goto L_0x05f2;
                case 5: goto L_0x05ec;
                case 6: goto L_0x05e6;
                case 7: goto L_0x05df;
                case 8: goto L_0x05d8;
                case 9: goto L_0x05d3;
                case 10: goto L_0x05cc;
                case 11: goto L_0x05c5;
                case 12: goto L_0x05bd;
                case 13: goto L_0x05b6;
                case 14: goto L_0x05af;
                case 15: goto L_0x05a7;
                case 16: goto L_0x059f;
                case 17: goto L_0x0597;
                case 18: goto L_0x058f;
                case 19: goto L_0x0587;
                case 20: goto L_0x057f;
                case 21: goto L_0x0577;
                case 22: goto L_0x056f;
                case 23: goto L_0x0567;
                case 24: goto L_0x055f;
                case 25: goto L_0x0557;
                default: goto L_0x0555;
            }
        L_0x0555:
            goto L_0x0610
        L_0x0557:
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0611
        L_0x055f:
            r2 = 4194304(0x400000, float:5.877472E-39)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0611
        L_0x0567:
            r2 = 1048576(0x100000, float:1.469368E-39)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0611
        L_0x056f:
            r2 = 262144(0x40000, float:3.67342E-40)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0611
        L_0x0577:
            r2 = 65536(0x10000, float:9.18355E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0611
        L_0x057f:
            r2 = 16384(0x4000, float:2.2959E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0611
        L_0x0587:
            r2 = 4096(0x1000, float:5.74E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0611
        L_0x058f:
            r2 = 1024(0x400, float:1.435E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0611
        L_0x0597:
            r2 = 33554432(0x2000000, float:9.403955E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0611
        L_0x059f:
            r2 = 8388608(0x800000, float:1.17549435E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0611
        L_0x05a7:
            r2 = 2097152(0x200000, float:2.938736E-39)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0611
        L_0x05af:
            r2 = 524288(0x80000, float:7.34684E-40)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0611
        L_0x05b6:
            r2 = 131072(0x20000, float:1.83671E-40)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0611
        L_0x05bd:
            r2 = 32768(0x8000, float:4.5918E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0611
        L_0x05c5:
            r2 = 8192(0x2000, float:1.14794E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0611
        L_0x05cc:
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0611
        L_0x05d3:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            goto L_0x0611
        L_0x05d8:
            r2 = 64
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0611
        L_0x05df:
            r2 = 16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0611
        L_0x05e6:
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0611
        L_0x05ec:
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0611
        L_0x05f2:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0611
        L_0x05f7:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            goto L_0x0611
        L_0x05fc:
            r2 = 32
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0611
        L_0x0603:
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0611
        L_0x060a:
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0611
        L_0x0610:
            r2 = r1
        L_0x0611:
            if (r2 != 0) goto L_0x0619
            java.lang.String r15 = "Unknown HEVC level string: "
            androidx.appcompat.widget.z0.a(r15, r0, r5)
            goto L_0x0628
        L_0x0619:
            android.util.Pair r1 = new android.util.Pair
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r1.<init>(r15, r2)
            goto L_0x0628
        L_0x0623:
            java.lang.String r0 = "Unknown HEVC profile string: "
            androidx.appcompat.widget.z0.a(r0, r15, r5)
        L_0x0628:
            return r1
        L_0x0629:
            r1 = 0
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.String r15 = r15.f27405i
            int r3 = r0.length
            java.lang.String r4 = "Ignoring malformed AVC codec string: "
            r6 = 2
            if (r3 >= r6) goto L_0x0639
            androidx.appcompat.widget.z0.a(r4, r15, r5)
            goto L_0x071e
        L_0x0639:
            r1 = 1
            r3 = r0[r1]     // Catch:{ NumberFormatException -> 0x071a }
            int r3 = r3.length()     // Catch:{ NumberFormatException -> 0x071a }
            r6 = 6
            if (r3 != r6) goto L_0x065d
            r3 = r0[r1]     // Catch:{ NumberFormatException -> 0x071a }
            r6 = 2
            r7 = 0
            java.lang.String r3 = r3.substring(r7, r6)     // Catch:{ NumberFormatException -> 0x071a }
            r6 = 16
            int r3 = java.lang.Integer.parseInt(r3, r6)     // Catch:{ NumberFormatException -> 0x071a }
            r0 = r0[r1]     // Catch:{ NumberFormatException -> 0x071a }
            r1 = 4
            java.lang.String r0 = r0.substring(r1)     // Catch:{ NumberFormatException -> 0x071a }
            int r15 = java.lang.Integer.parseInt(r0, r6)     // Catch:{ NumberFormatException -> 0x071a }
            goto L_0x066f
        L_0x065d:
            int r1 = r0.length     // Catch:{ NumberFormatException -> 0x071a }
            r3 = 3
            if (r1 < r3) goto L_0x0707
            r1 = 1
            r1 = r0[r1]     // Catch:{ NumberFormatException -> 0x071a }
            int r3 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x071a }
            r1 = 2
            r0 = r0[r1]     // Catch:{ NumberFormatException -> 0x071a }
            int r15 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x071a }
        L_0x066f:
            r0 = 66
            if (r3 == r0) goto L_0x069d
            r0 = 77
            if (r3 == r0) goto L_0x069b
            r0 = 88
            if (r3 == r0) goto L_0x0699
            r0 = 100
            if (r3 == r0) goto L_0x0696
            r0 = 110(0x6e, float:1.54E-43)
            if (r3 == r0) goto L_0x0693
            r0 = 122(0x7a, float:1.71E-43)
            if (r3 == r0) goto L_0x0690
            r0 = 244(0xf4, float:3.42E-43)
            if (r3 == r0) goto L_0x068d
            r0 = -1
            goto L_0x069e
        L_0x068d:
            r0 = 64
            goto L_0x069e
        L_0x0690:
            r0 = 32
            goto L_0x069e
        L_0x0693:
            r0 = 16
            goto L_0x069e
        L_0x0696:
            r0 = 8
            goto L_0x069e
        L_0x0699:
            r0 = 4
            goto L_0x069e
        L_0x069b:
            r0 = 2
            goto L_0x069e
        L_0x069d:
            r0 = 1
        L_0x069e:
            r1 = -1
            if (r0 != r1) goto L_0x06a8
            java.lang.String r15 = "Unknown AVC profile: "
            f0.j.a(r15, r3, r5)
            goto L_0x071d
        L_0x06a8:
            switch(r15) {
                case 10: goto L_0x06c5;
                case 11: goto L_0x06c2;
                case 12: goto L_0x06be;
                case 13: goto L_0x06ba;
                default: goto L_0x06ab;
            }
        L_0x06ab:
            switch(r15) {
                case 20: goto L_0x06d0;
                case 21: goto L_0x06cc;
                case 22: goto L_0x06c8;
                default: goto L_0x06ae;
            }
        L_0x06ae:
            switch(r15) {
                case 30: goto L_0x06dc;
                case 31: goto L_0x06d8;
                case 32: goto L_0x06d4;
                default: goto L_0x06b1;
            }
        L_0x06b1:
            switch(r15) {
                case 40: goto L_0x06f0;
                case 41: goto L_0x06e3;
                case 42: goto L_0x06e0;
                default: goto L_0x06b4;
            }
        L_0x06b4:
            switch(r15) {
                case 50: goto L_0x06ee;
                case 51: goto L_0x06ea;
                case 52: goto L_0x06e7;
                default: goto L_0x06b7;
            }
        L_0x06b7:
            r1 = -1
            r2 = -1
            goto L_0x06f1
        L_0x06ba:
            r1 = -1
            r2 = 16
            goto L_0x06f1
        L_0x06be:
            r1 = -1
            r2 = 8
            goto L_0x06f1
        L_0x06c2:
            r1 = -1
            r2 = 4
            goto L_0x06f1
        L_0x06c5:
            r1 = -1
            r2 = 1
            goto L_0x06f1
        L_0x06c8:
            r1 = -1
            r2 = 128(0x80, float:1.794E-43)
            goto L_0x06f1
        L_0x06cc:
            r1 = -1
            r2 = 64
            goto L_0x06f1
        L_0x06d0:
            r1 = -1
            r2 = 32
            goto L_0x06f1
        L_0x06d4:
            r1 = -1
            r2 = 1024(0x400, float:1.435E-42)
            goto L_0x06f1
        L_0x06d8:
            r1 = -1
            r2 = 512(0x200, float:7.175E-43)
            goto L_0x06f1
        L_0x06dc:
            r1 = -1
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x06f1
        L_0x06e0:
            r2 = 8192(0x2000, float:1.14794E-41)
            goto L_0x06f0
        L_0x06e3:
            r1 = -1
            r2 = 4096(0x1000, float:5.74E-42)
            goto L_0x06f1
        L_0x06e7:
            r2 = 65536(0x10000, float:9.18355E-41)
            goto L_0x06f0
        L_0x06ea:
            r2 = 32768(0x8000, float:4.5918E-41)
            goto L_0x06f0
        L_0x06ee:
            r2 = 16384(0x4000, float:2.2959E-41)
        L_0x06f0:
            r1 = -1
        L_0x06f1:
            if (r2 != r1) goto L_0x06f9
            java.lang.String r0 = "Unknown AVC level: "
            f0.j.a(r0, r15, r5)
            goto L_0x071d
        L_0x06f9:
            android.util.Pair r1 = new android.util.Pair
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.<init>(r15, r0)
            goto L_0x071e
        L_0x0707:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x071a }
            r0.<init>()     // Catch:{ NumberFormatException -> 0x071a }
            r0.append(r4)     // Catch:{ NumberFormatException -> 0x071a }
            r0.append(r15)     // Catch:{ NumberFormatException -> 0x071a }
            java.lang.String r0 = r0.toString()     // Catch:{ NumberFormatException -> 0x071a }
            android.util.Log.w(r5, r0)     // Catch:{ NumberFormatException -> 0x071a }
            goto L_0x071d
        L_0x071a:
            androidx.appcompat.widget.z0.a(r4, r15, r5)
        L_0x071d:
            r1 = 0
        L_0x071e:
            return r1
        L_0x071f:
            java.lang.String r1 = r15.f27405i
            w6.b r15 = r15.F
            int r2 = r0.length
            java.lang.String r3 = "Ignoring malformed AV1 codec string: "
            r4 = 4
            if (r2 >= r4) goto L_0x072e
            androidx.appcompat.widget.z0.a(r3, r1, r5)
            goto L_0x07dc
        L_0x072e:
            r2 = 1
            r2 = r0[r2]     // Catch:{ NumberFormatException -> 0x07d9 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x07d9 }
            r4 = 2
            r6 = r0[r4]     // Catch:{ NumberFormatException -> 0x07d9 }
            r7 = 0
            java.lang.String r4 = r6.substring(r7, r4)     // Catch:{ NumberFormatException -> 0x07d9 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x07d9 }
            r6 = 3
            r0 = r0[r6]     // Catch:{ NumberFormatException -> 0x07d9 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x07d9 }
            if (r2 == 0) goto L_0x0751
            java.lang.String r15 = "Unknown AV1 profile: "
            f0.j.a(r15, r2, r5)
            goto L_0x07dc
        L_0x0751:
            r1 = 8
            if (r0 == r1) goto L_0x0762
            r1 = 10
            if (r0 == r1) goto L_0x0760
            java.lang.String r15 = "Unknown AV1 bit depth: "
            f0.j.a(r15, r0, r5)
            goto L_0x07dc
        L_0x0760:
            r1 = 8
        L_0x0762:
            if (r0 != r1) goto L_0x0766
            r15 = 1
            goto L_0x0778
        L_0x0766:
            if (r15 == 0) goto L_0x0777
            byte[] r0 = r15.f27026d
            if (r0 != 0) goto L_0x0774
            int r15 = r15.f27025c
            r0 = 7
            if (r15 == r0) goto L_0x0774
            r0 = 6
            if (r15 != r0) goto L_0x0777
        L_0x0774:
            r15 = 4096(0x1000, float:5.74E-42)
            goto L_0x0778
        L_0x0777:
            r15 = 2
        L_0x0778:
            switch(r4) {
                case 0: goto L_0x07c1;
                case 1: goto L_0x07bf;
                case 2: goto L_0x07bd;
                case 3: goto L_0x07ba;
                case 4: goto L_0x07b7;
                case 5: goto L_0x07b4;
                case 6: goto L_0x07b1;
                case 7: goto L_0x07ae;
                case 8: goto L_0x07ab;
                case 9: goto L_0x07a8;
                case 10: goto L_0x07a5;
                case 11: goto L_0x07a2;
                case 12: goto L_0x079f;
                case 13: goto L_0x079c;
                case 14: goto L_0x0799;
                case 15: goto L_0x0795;
                case 16: goto L_0x0792;
                case 17: goto L_0x078f;
                case 18: goto L_0x078c;
                case 19: goto L_0x0789;
                case 20: goto L_0x0786;
                case 21: goto L_0x0783;
                case 22: goto L_0x0780;
                case 23: goto L_0x077d;
                default: goto L_0x077b;
            }
        L_0x077b:
            r0 = -1
            goto L_0x07c2
        L_0x077d:
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x07c2
        L_0x0780:
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x07c2
        L_0x0783:
            r0 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x07c2
        L_0x0786:
            r0 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x07c2
        L_0x0789:
            r0 = 524288(0x80000, float:7.34684E-40)
            goto L_0x07c2
        L_0x078c:
            r0 = 262144(0x40000, float:3.67342E-40)
            goto L_0x07c2
        L_0x078f:
            r0 = 131072(0x20000, float:1.83671E-40)
            goto L_0x07c2
        L_0x0792:
            r0 = 65536(0x10000, float:9.18355E-41)
            goto L_0x07c2
        L_0x0795:
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L_0x07c2
        L_0x0799:
            r0 = 16384(0x4000, float:2.2959E-41)
            goto L_0x07c2
        L_0x079c:
            r0 = 8192(0x2000, float:1.14794E-41)
            goto L_0x07c2
        L_0x079f:
            r0 = 4096(0x1000, float:5.74E-42)
            goto L_0x07c2
        L_0x07a2:
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x07c2
        L_0x07a5:
            r0 = 1024(0x400, float:1.435E-42)
            goto L_0x07c2
        L_0x07a8:
            r0 = 512(0x200, float:7.175E-43)
            goto L_0x07c2
        L_0x07ab:
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x07c2
        L_0x07ae:
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x07c2
        L_0x07b1:
            r0 = 64
            goto L_0x07c2
        L_0x07b4:
            r0 = 32
            goto L_0x07c2
        L_0x07b7:
            r0 = 16
            goto L_0x07c2
        L_0x07ba:
            r0 = 8
            goto L_0x07c2
        L_0x07bd:
            r0 = 4
            goto L_0x07c2
        L_0x07bf:
            r0 = 2
            goto L_0x07c2
        L_0x07c1:
            r0 = 1
        L_0x07c2:
            r1 = -1
            if (r0 != r1) goto L_0x07cb
            java.lang.String r15 = "Unknown AV1 level: "
            f0.j.a(r15, r4, r5)
            goto L_0x07dc
        L_0x07cb:
            android.util.Pair r1 = new android.util.Pair
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.<init>(r15, r0)
            goto L_0x07dd
        L_0x07d9:
            androidx.appcompat.widget.z0.a(r3, r1, r5)
        L_0x07dc:
            r1 = 0
        L_0x07dd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.p.c(x4.b0):android.util.Pair");
    }

    public static k d(String str, boolean z10, boolean z11) throws c {
        List<k> e10 = e(str, z10, z11);
        if (e10.isEmpty()) {
            return null;
        }
        return e10.get(0);
    }

    public static synchronized List<k> e(String str, boolean z10, boolean z11) throws c {
        d dVar;
        synchronized (p.class) {
            b bVar = new b(str, z10, z11);
            HashMap<b, List<k>> hashMap = f23925b;
            List<k> list = hashMap.get(bVar);
            if (list != null) {
                return list;
            }
            int i10 = e0.f26436a;
            if (i10 >= 21) {
                dVar = new f(z10, z11);
            } else {
                dVar = new e((a) null);
            }
            ArrayList<k> f10 = f(bVar, dVar);
            if (z10 && f10.isEmpty() && 21 <= i10 && i10 <= 23) {
                f10 = f(bVar, new e((a) null));
                if (!f10.isEmpty()) {
                    Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + f10.get(0).f23877a);
                }
            }
            a(str, f10);
            List<k> unmodifiableList = Collections.unmodifiableList(f10);
            hashMap.put(bVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: int} */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c8, code lost:
        if (r1.f23928b == false) goto L_0x00ca;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x014b A[SYNTHETIC, Splitter:B:80:0x014b] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0174 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<p5.k> f(p5.p.b r25, p5.p.d r26) throws p5.p.c {
        /*
            r1 = r25
            r2 = r26
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x0199 }
            r5.<init>()     // Catch:{ Exception -> 0x0199 }
            java.lang.String r15 = r1.f23927a     // Catch:{ Exception -> 0x0199 }
            int r14 = r26.b()     // Catch:{ Exception -> 0x0199 }
            boolean r13 = r26.e()     // Catch:{ Exception -> 0x0199 }
            r16 = 0
            r12 = 0
        L_0x001a:
            if (r12 >= r14) goto L_0x0198
            android.media.MediaCodecInfo r0 = r2.a(r12)     // Catch:{ Exception -> 0x0199 }
            int r6 = v6.e0.f26436a     // Catch:{ Exception -> 0x0199 }
            r7 = 29
            if (r6 < r7) goto L_0x002e
            boolean r9 = r0.isAlias()     // Catch:{ Exception -> 0x0199 }
            if (r9 == 0) goto L_0x002e
            r9 = 1
            goto L_0x002f
        L_0x002e:
            r9 = 0
        L_0x002f:
            if (r9 == 0) goto L_0x0032
            goto L_0x006d
        L_0x0032:
            java.lang.String r11 = r0.getName()     // Catch:{ Exception -> 0x0199 }
            boolean r9 = g(r0, r11, r13, r15)     // Catch:{ Exception -> 0x0199 }
            if (r9 != 0) goto L_0x003d
            goto L_0x006d
        L_0x003d:
            java.lang.String r10 = b(r0, r11, r15)     // Catch:{ Exception -> 0x0199 }
            if (r10 != 0) goto L_0x0044
            goto L_0x006d
        L_0x0044:
            android.media.MediaCodecInfo$CodecCapabilities r9 = r0.getCapabilitiesForType(r10)     // Catch:{ Exception -> 0x0139 }
            boolean r17 = r2.d(r4, r10, r9)     // Catch:{ Exception -> 0x0139 }
            boolean r18 = r2.c(r4, r10, r9)     // Catch:{ Exception -> 0x0139 }
            boolean r8 = r1.f23929c     // Catch:{ Exception -> 0x0139 }
            if (r8 != 0) goto L_0x0056
            if (r18 != 0) goto L_0x006d
        L_0x0056:
            if (r8 == 0) goto L_0x005b
            if (r17 != 0) goto L_0x005b
            goto L_0x006d
        L_0x005b:
            boolean r8 = r2.d(r3, r10, r9)     // Catch:{ Exception -> 0x0139 }
            boolean r17 = r2.c(r3, r10, r9)     // Catch:{ Exception -> 0x0139 }
            boolean r7 = r1.f23928b     // Catch:{ Exception -> 0x0139 }
            if (r7 != 0) goto L_0x0069
            if (r17 != 0) goto L_0x006d
        L_0x0069:
            if (r7 == 0) goto L_0x0075
            if (r8 != 0) goto L_0x0075
        L_0x006d:
            r23 = r12
            r24 = r13
            r17 = r14
            goto L_0x016a
        L_0x0075:
            r7 = 29
            if (r6 < r7) goto L_0x0082
            boolean r7 = r0.isHardwareAccelerated()     // Catch:{ Exception -> 0x0139 }
            r19 = r7
            r17 = 1
            goto L_0x008c
        L_0x0082:
            boolean r7 = h(r0)     // Catch:{ Exception -> 0x0139 }
            r17 = 1
            r7 = r7 ^ 1
            r19 = r7
        L_0x008c:
            boolean r20 = h(r0)     // Catch:{ Exception -> 0x0139 }
            r7 = 29
            if (r6 < r7) goto L_0x0099
            boolean r0 = r0.isVendor()     // Catch:{ Exception -> 0x0139 }
            goto L_0x00be
        L_0x0099:
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x0139 }
            java.lang.String r0 = v6.e0.V(r0)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r6 = "omx.google."
            boolean r6 = r0.startsWith(r6)     // Catch:{ Exception -> 0x0139 }
            if (r6 != 0) goto L_0x00ba
            java.lang.String r6 = "c2.android."
            boolean r6 = r0.startsWith(r6)     // Catch:{ Exception -> 0x0139 }
            if (r6 != 0) goto L_0x00ba
            java.lang.String r6 = "c2.google."
            boolean r0 = r0.startsWith(r6)     // Catch:{ Exception -> 0x0139 }
            if (r0 != 0) goto L_0x00ba
            goto L_0x00bc
        L_0x00ba:
            r17 = 0
        L_0x00bc:
            r0 = r17
        L_0x00be:
            if (r13 == 0) goto L_0x00c4
            boolean r6 = r1.f23928b     // Catch:{ Exception -> 0x0139 }
            if (r6 == r8) goto L_0x00ca
        L_0x00c4:
            if (r13 != 0) goto L_0x00fb
            boolean r6 = r1.f23928b     // Catch:{ Exception -> 0x00ed }
            if (r6 != 0) goto L_0x00fb
        L_0x00ca:
            r17 = 0
            r18 = 0
            r6 = r11
            r7 = r15
            r8 = r10
            r21 = r10
            r10 = r19
            r22 = r11
            r11 = r20
            r23 = r12
            r12 = r0
            r24 = r13
            r13 = r17
            r17 = r14
            r14 = r18
            p5.k r0 = p5.k.i(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0137 }
            r5.add(r0)     // Catch:{ Exception -> 0x0137 }
            goto L_0x016a
        L_0x00ed:
            r0 = move-exception
            r21 = r10
            r22 = r11
            r23 = r12
            r24 = r13
            r17 = r14
        L_0x00f8:
            r1 = r22
            goto L_0x0143
        L_0x00fb:
            r21 = r10
            r22 = r11
            r23 = r12
            r24 = r13
            r17 = r14
            if (r24 != 0) goto L_0x016a
            if (r8 == 0) goto L_0x016a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0137 }
            r6.<init>()     // Catch:{ Exception -> 0x0137 }
            r14 = r22
            r6.append(r14)     // Catch:{ Exception -> 0x0134 }
            java.lang.String r7 = ".secure"
            r6.append(r7)     // Catch:{ Exception -> 0x0134 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0134 }
            r13 = 0
            r18 = 1
            r7 = r15
            r8 = r21
            r10 = r19
            r11 = r20
            r12 = r0
            r1 = r14
            r14 = r18
            p5.k r0 = p5.k.i(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0132 }
            r5.add(r0)     // Catch:{ Exception -> 0x0132 }
            return r5
        L_0x0132:
            r0 = move-exception
            goto L_0x0143
        L_0x0134:
            r0 = move-exception
            r1 = r14
            goto L_0x0143
        L_0x0137:
            r0 = move-exception
            goto L_0x00f8
        L_0x0139:
            r0 = move-exception
            r21 = r10
            r1 = r11
            r23 = r12
            r24 = r13
            r17 = r14
        L_0x0143:
            int r6 = v6.e0.f26436a     // Catch:{ Exception -> 0x0199 }
            r7 = 23
            java.lang.String r8 = "MediaCodecUtil"
            if (r6 > r7) goto L_0x0174
            boolean r6 = r5.isEmpty()     // Catch:{ Exception -> 0x0199 }
            if (r6 != 0) goto L_0x0174
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0199 }
            r0.<init>()     // Catch:{ Exception -> 0x0199 }
            java.lang.String r6 = "Skipping codec "
            r0.append(r6)     // Catch:{ Exception -> 0x0199 }
            r0.append(r1)     // Catch:{ Exception -> 0x0199 }
            java.lang.String r1 = " (failed to query capabilities)"
            r0.append(r1)     // Catch:{ Exception -> 0x0199 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0199 }
            android.util.Log.e(r8, r0)     // Catch:{ Exception -> 0x0199 }
        L_0x016a:
            int r12 = r23 + 1
            r1 = r25
            r14 = r17
            r13 = r24
            goto L_0x001a
        L_0x0174:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0199 }
            r2.<init>()     // Catch:{ Exception -> 0x0199 }
            java.lang.String r3 = "Failed to query codec "
            r2.append(r3)     // Catch:{ Exception -> 0x0199 }
            r2.append(r1)     // Catch:{ Exception -> 0x0199 }
            java.lang.String r1 = " ("
            r2.append(r1)     // Catch:{ Exception -> 0x0199 }
            r1 = r21
            r2.append(r1)     // Catch:{ Exception -> 0x0199 }
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch:{ Exception -> 0x0199 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x0199 }
            android.util.Log.e(r8, r1)     // Catch:{ Exception -> 0x0199 }
            throw r0     // Catch:{ Exception -> 0x0199 }
        L_0x0198:
            return r5
        L_0x0199:
            r0 = move-exception
            p5.p$c r1 = new p5.p$c
            r2 = 0
            r1.<init>(r0, r2)
            goto L_0x01a2
        L_0x01a1:
            throw r1
        L_0x01a2:
            goto L_0x01a1
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.p.f(p5.p$b, p5.p$d):java.util.ArrayList");
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = e0.f26436a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = e0.f26437b;
            if ("a70".equals(str3) || ("Xiaomi".equals(e0.f26438c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = e0.f26437b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = e0.f26437b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(e0.f26438c))) {
            String str6 = e0.f26437b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(e0.f26438c)) {
            String str7 = e0.f26437b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i10 <= 19 && e0.f26437b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        if (!"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo) {
        if (e0.f26436a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        String V = e0.V(mediaCodecInfo.getName());
        if (V.startsWith("arc.")) {
            return false;
        }
        if (V.startsWith("omx.google.") || V.startsWith("omx.ffmpeg.") || ((V.startsWith("omx.sec.") && V.contains(".sw.")) || V.equals("omx.qcom.video.decoder.hevcswvdec") || V.startsWith("c2.android.") || V.startsWith("c2.google.") || (!V.startsWith("omx.") && !V.startsWith("c2.")))) {
            return true;
        }
        return false;
    }

    public static int i() throws c {
        int i10;
        if (f23926c == -1) {
            int i11 = 0;
            k d10 = d("video/avc", false, false);
            if (d10 != null) {
                MediaCodecInfo.CodecProfileLevel[] d11 = d10.d();
                int length = d11.length;
                int i12 = 0;
                while (i11 < length) {
                    int i13 = d11[i11].level;
                    if (i13 != 1 && i13 != 2) {
                        switch (i13) {
                            case b4.f10106f:
                            case 16:
                            case 32:
                                i10 = 101376;
                                break;
                            case 64:
                                i10 = 202752;
                                break;
                            case 128:
                            case 256:
                                i10 = 414720;
                                break;
                            case 512:
                                i10 = 921600;
                                break;
                            case 1024:
                                i10 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i10 = 2097152;
                                break;
                            case 8192:
                                i10 = 2228224;
                                break;
                            case 16384:
                                i10 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i10 = 9437184;
                                break;
                            default:
                                i10 = -1;
                                break;
                        }
                    } else {
                        i10 = 25344;
                    }
                    i12 = Math.max(i10, i12);
                    i11++;
                }
                i11 = Math.max(i12, e0.f26436a >= 21 ? 345600 : 172800);
            }
            f23926c = i11;
        }
        return f23926c;
    }

    public static <T> void j(List<T> list, g<T> gVar) {
        Collections.sort(list, new o(gVar));
    }
}

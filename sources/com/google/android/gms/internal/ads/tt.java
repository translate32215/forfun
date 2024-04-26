package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import com.startapp.b4;
import e8.be0;
import e8.ee0;
import e8.eg0;
import e8.fe0;
import e8.ge0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import v6.d;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class tt {

    /* renamed from: a  reason: collision with root package name */
    public static final be0 f8210a = new be0("OMX.google.raw.decoder", (String) null, (MediaCodecInfo.CodecCapabilities) null, false, false);

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f8211b = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap<a, List<be0>> f8212c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public static final SparseIntArray f8213d;

    /* renamed from: e  reason: collision with root package name */
    public static final SparseIntArray f8214e;

    /* renamed from: f  reason: collision with root package name */
    public static final Map<String, Integer> f8215f;

    /* renamed from: g  reason: collision with root package name */
    public static int f8216g = -1;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f8217a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f8218b;

        public a(String str, boolean z10) {
            this.f8217a = str;
            this.f8218b = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == a.class) {
                a aVar = (a) obj;
                return TextUtils.equals(this.f8217a, aVar.f8217a) && this.f8218b == aVar.f8218b;
            }
        }

        public final int hashCode() {
            String str = this.f8217a;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f8218b ? 1231 : 1237);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8213d = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f8214e = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap hashMap = new HashMap();
        f8215f = hashMap;
        hashMap.put("L30", 1);
        hashMap.put("L60", 4);
        hashMap.put("L63", 16);
        hashMap.put("L90", 64);
        d.a(256, hashMap, "L93", 1024, "L120", 4096, "L123", 16384, "L150");
        d.a(65536, hashMap, "L153", 262144, "L156", 1048576, "L180", 4194304, "L183");
        d.a(16777216, hashMap, "L186", 2, "H30", 8, "H60", 32, "H63");
        d.a(128, hashMap, "H90", 512, "H93", 2048, "H120", 8192, "H123");
        d.a(32768, hashMap, "H150", 131072, "H153", 524288, "H156", 2097152, "H180");
        hashMap.put("H183", 8388608);
        hashMap.put("H186", 33554432);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01e0, code lost:
        if (r1.f8218b == false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0128, code lost:
        if ("C1605".equals(r5) == false) goto L_0x012b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0184 A[Catch:{ Exception -> 0x02c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01de A[SYNTHETIC, Splitter:B:131:0x01de] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x024b A[SYNTHETIC, Splitter:B:160:0x024b] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0275 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x02be A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<e8.be0> a(com.google.android.gms.internal.ads.tt.a r22, e8.de0 r23) throws e8.ee0 {
        /*
            r1 = r22
            r2 = r23
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x02c7 }
            r3.<init>()     // Catch:{ Exception -> 0x02c7 }
            java.lang.String r10 = r1.f8217a     // Catch:{ Exception -> 0x02c7 }
            int r11 = r23.b()     // Catch:{ Exception -> 0x02c7 }
            boolean r12 = r23.c()     // Catch:{ Exception -> 0x02c7 }
            r14 = 0
        L_0x0014:
            if (r14 >= r11) goto L_0x02c6
            android.media.MediaCodecInfo r15 = r2.a(r14)     // Catch:{ Exception -> 0x02c7 }
            java.lang.String r9 = r15.getName()     // Catch:{ Exception -> 0x02c7 }
            boolean r0 = r15.isEncoder()     // Catch:{ Exception -> 0x02c7 }
            java.lang.String r8 = ".secure"
            r16 = 1
            if (r0 != 0) goto L_0x0181
            if (r12 != 0) goto L_0x0032
            boolean r0 = r9.endsWith(r8)     // Catch:{ Exception -> 0x02c7 }
            if (r0 == 0) goto L_0x0032
            goto L_0x0181
        L_0x0032:
            int r0 = e8.eg0.f14479a     // Catch:{ Exception -> 0x02c7 }
            r4 = 21
            if (r0 >= r4) goto L_0x006a
            java.lang.String r4 = "CIPAACDecoder"
            boolean r4 = r4.equals(r9)     // Catch:{ Exception -> 0x02c7 }
            if (r4 != 0) goto L_0x0181
            java.lang.String r4 = "CIPMP3Decoder"
            boolean r4 = r4.equals(r9)     // Catch:{ Exception -> 0x02c7 }
            if (r4 != 0) goto L_0x0181
            java.lang.String r4 = "CIPVorbisDecoder"
            boolean r4 = r4.equals(r9)     // Catch:{ Exception -> 0x02c7 }
            if (r4 != 0) goto L_0x0181
            java.lang.String r4 = "CIPAMRNBDecoder"
            boolean r4 = r4.equals(r9)     // Catch:{ Exception -> 0x02c7 }
            if (r4 != 0) goto L_0x0181
            java.lang.String r4 = "AACDecoder"
            boolean r4 = r4.equals(r9)     // Catch:{ Exception -> 0x02c7 }
            if (r4 != 0) goto L_0x0181
            java.lang.String r4 = "MP3Decoder"
            boolean r4 = r4.equals(r9)     // Catch:{ Exception -> 0x02c7 }
            if (r4 == 0) goto L_0x006a
            goto L_0x0181
        L_0x006a:
            r4 = 18
            if (r0 >= r4) goto L_0x0078
            java.lang.String r5 = "OMX.SEC.MP3.Decoder"
            boolean r5 = r5.equals(r9)     // Catch:{ Exception -> 0x02c7 }
            if (r5 == 0) goto L_0x0078
            goto L_0x0181
        L_0x0078:
            if (r0 >= r4) goto L_0x008e
            java.lang.String r4 = "OMX.MTK.AUDIO.DECODER.AAC"
            boolean r4 = r4.equals(r9)     // Catch:{ Exception -> 0x02c7 }
            if (r4 == 0) goto L_0x008e
            java.lang.String r4 = "a70"
            java.lang.String r5 = e8.eg0.f14480b     // Catch:{ Exception -> 0x02c7 }
            boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x02c7 }
            if (r4 == 0) goto L_0x008e
            goto L_0x0181
        L_0x008e:
            r4 = 16
            if (r0 != r4) goto L_0x00fe
            java.lang.String r5 = "OMX.qcom.audio.decoder.mp3"
            boolean r5 = r5.equals(r9)     // Catch:{ Exception -> 0x02c7 }
            if (r5 == 0) goto L_0x00fe
            java.lang.String r5 = "dlxu"
            java.lang.String r6 = e8.eg0.f14480b     // Catch:{ Exception -> 0x02c7 }
            boolean r5 = r5.equals(r6)     // Catch:{ Exception -> 0x02c7 }
            if (r5 != 0) goto L_0x0181
            java.lang.String r5 = "protou"
            boolean r5 = r5.equals(r6)     // Catch:{ Exception -> 0x02c7 }
            if (r5 != 0) goto L_0x0181
            java.lang.String r5 = "ville"
            boolean r5 = r5.equals(r6)     // Catch:{ Exception -> 0x02c7 }
            if (r5 != 0) goto L_0x0181
            java.lang.String r5 = "villeplus"
            boolean r5 = r5.equals(r6)     // Catch:{ Exception -> 0x02c7 }
            if (r5 != 0) goto L_0x0181
            java.lang.String r5 = "villec2"
            boolean r5 = r5.equals(r6)     // Catch:{ Exception -> 0x02c7 }
            if (r5 != 0) goto L_0x0181
            java.lang.String r5 = "gee"
            boolean r5 = r6.startsWith(r5)     // Catch:{ Exception -> 0x02c7 }
            if (r5 != 0) goto L_0x0181
            java.lang.String r5 = "C6602"
            boolean r5 = r5.equals(r6)     // Catch:{ Exception -> 0x02c7 }
            if (r5 != 0) goto L_0x0181
            java.lang.String r5 = "C6603"
            boolean r5 = r5.equals(r6)     // Catch:{ Exception -> 0x02c7 }
            if (r5 != 0) goto L_0x0181
            java.lang.String r5 = "C6606"
            boolean r5 = r5.equals(r6)     // Catch:{ Exception -> 0x02c7 }
            if (r5 != 0) goto L_0x0181
            java.lang.String r5 = "C6616"
            boolean r5 = r5.equals(r6)     // Catch:{ Exception -> 0x02c7 }
            if (r5 != 0) goto L_0x0181
            java.lang.String r5 = "L36h"
            boolean r5 = r5.equals(r6)     // Catch:{ Exception -> 0x02c7 }
            if (r5 != 0) goto L_0x0181
            java.lang.String r5 = "SO-02E"
            boolean r5 = r5.equals(r6)     // Catch:{ Exception -> 0x02c7 }
            if (r5 == 0) goto L_0x00fe
            goto L_0x0181
        L_0x00fe:
            if (r0 != r4) goto L_0x012b
            java.lang.String r4 = "OMX.qcom.audio.decoder.aac"
            boolean r4 = r4.equals(r9)     // Catch:{ Exception -> 0x02c7 }
            if (r4 == 0) goto L_0x012b
            java.lang.String r4 = "C1504"
            java.lang.String r5 = e8.eg0.f14480b     // Catch:{ Exception -> 0x02c7 }
            boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x02c7 }
            if (r4 != 0) goto L_0x0181
            java.lang.String r4 = "C1505"
            boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x02c7 }
            if (r4 != 0) goto L_0x0181
            java.lang.String r4 = "C1604"
            boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x02c7 }
            if (r4 != 0) goto L_0x0181
            java.lang.String r4 = "C1605"
            boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x02c7 }
            if (r4 == 0) goto L_0x012b
            goto L_0x0181
        L_0x012b:
            java.lang.String r4 = "jflte"
            r5 = 19
            if (r0 > r5) goto L_0x016c
            java.lang.String r6 = "OMX.SEC.vp8.dec"
            boolean r6 = r6.equals(r9)     // Catch:{ Exception -> 0x02c7 }
            if (r6 == 0) goto L_0x016c
            java.lang.String r6 = "samsung"
            java.lang.String r7 = e8.eg0.f14481c     // Catch:{ Exception -> 0x02c7 }
            boolean r6 = r6.equals(r7)     // Catch:{ Exception -> 0x02c7 }
            if (r6 == 0) goto L_0x016c
            java.lang.String r6 = e8.eg0.f14480b     // Catch:{ Exception -> 0x02c7 }
            java.lang.String r7 = "d2"
            boolean r7 = r6.startsWith(r7)     // Catch:{ Exception -> 0x02c7 }
            if (r7 != 0) goto L_0x0181
            java.lang.String r7 = "serrano"
            boolean r7 = r6.startsWith(r7)     // Catch:{ Exception -> 0x02c7 }
            if (r7 != 0) goto L_0x0181
            boolean r7 = r6.startsWith(r4)     // Catch:{ Exception -> 0x02c7 }
            if (r7 != 0) goto L_0x0181
            java.lang.String r7 = "santos"
            boolean r7 = r6.startsWith(r7)     // Catch:{ Exception -> 0x02c7 }
            if (r7 != 0) goto L_0x0181
            java.lang.String r7 = "t0"
            boolean r6 = r6.startsWith(r7)     // Catch:{ Exception -> 0x02c7 }
            if (r6 == 0) goto L_0x016c
            goto L_0x0181
        L_0x016c:
            if (r0 > r5) goto L_0x017f
            java.lang.String r0 = e8.eg0.f14480b     // Catch:{ Exception -> 0x02c7 }
            boolean r0 = r0.startsWith(r4)     // Catch:{ Exception -> 0x02c7 }
            if (r0 == 0) goto L_0x017f
            java.lang.String r0 = "OMX.qcom.video.decoder.vp8"
            boolean r0 = r0.equals(r9)     // Catch:{ Exception -> 0x02c7 }
            if (r0 == 0) goto L_0x017f
            goto L_0x0181
        L_0x017f:
            r0 = 1
            goto L_0x0182
        L_0x0181:
            r0 = 0
        L_0x0182:
            if (r0 == 0) goto L_0x02be
            java.lang.String[] r7 = r15.getSupportedTypes()     // Catch:{ Exception -> 0x02c7 }
            int r6 = r7.length     // Catch:{ Exception -> 0x02c7 }
            r5 = 0
        L_0x018a:
            if (r5 >= r6) goto L_0x02be
            r4 = r7[r5]     // Catch:{ Exception -> 0x02c7 }
            boolean r0 = r4.equalsIgnoreCase(r10)     // Catch:{ Exception -> 0x02c7 }
            if (r0 == 0) goto L_0x02a8
            android.media.MediaCodecInfo$CodecCapabilities r0 = r15.getCapabilitiesForType(r4)     // Catch:{ Exception -> 0x0238 }
            boolean r13 = r2.d(r10, r0)     // Catch:{ Exception -> 0x0238 }
            int r2 = e8.eg0.f14479a     // Catch:{ Exception -> 0x0238 }
            r17 = r4
            r4 = 22
            if (r2 > r4) goto L_0x01d5
            java.lang.String r2 = e8.eg0.f14482d     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r4 = "ODROID-XU3"
            boolean r4 = r2.equals(r4)     // Catch:{ Exception -> 0x01c8 }
            if (r4 != 0) goto L_0x01b6
            java.lang.String r4 = "Nexus 10"
            boolean r2 = r2.equals(r4)     // Catch:{ Exception -> 0x01c8 }
            if (r2 == 0) goto L_0x01d5
        L_0x01b6:
            java.lang.String r2 = "OMX.Exynos.AVC.Decoder"
            boolean r2 = r2.equals(r9)     // Catch:{ Exception -> 0x01c8 }
            if (r2 != 0) goto L_0x01c6
            java.lang.String r2 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r2 = r2.equals(r9)     // Catch:{ Exception -> 0x01c8 }
            if (r2 == 0) goto L_0x01d5
        L_0x01c6:
            r2 = 1
            goto L_0x01d6
        L_0x01c8:
            r0 = move-exception
            r19 = r5
            r20 = r6
            r21 = r7
            r1 = r8
            r2 = r9
            r18 = r17
            goto L_0x0243
        L_0x01d5:
            r2 = 0
        L_0x01d6:
            if (r12 == 0) goto L_0x01dc
            boolean r4 = r1.f8218b     // Catch:{ Exception -> 0x01c8 }
            if (r4 == r13) goto L_0x01e2
        L_0x01dc:
            if (r12 != 0) goto L_0x020f
            boolean r4 = r1.f8218b     // Catch:{ Exception -> 0x0204 }
            if (r4 != 0) goto L_0x020f
        L_0x01e2:
            r13 = 0
            e8.be0 r4 = new e8.be0     // Catch:{ Exception -> 0x01c8 }
            r18 = r17
            r17 = r4
            r4 = r17
            r19 = r5
            r5 = r9
            r20 = r6
            r6 = r10
            r21 = r7
            r7 = r0
            r1 = r8
            r8 = r2
            r2 = r9
            r9 = r13
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0202 }
            r0 = r17
            r3.add(r0)     // Catch:{ Exception -> 0x0202 }
            goto L_0x02b0
        L_0x0202:
            r0 = move-exception
            goto L_0x0243
        L_0x0204:
            r0 = move-exception
            r19 = r5
            r20 = r6
            r21 = r7
            r1 = r8
            r18 = r17
            goto L_0x0236
        L_0x020f:
            r19 = r5
            r20 = r6
            r21 = r7
            r1 = r8
            r18 = r17
            if (r12 != 0) goto L_0x02af
            if (r13 == 0) goto L_0x02af
            java.lang.String r4 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x0235 }
            java.lang.String r5 = r4.concat(r1)     // Catch:{ Exception -> 0x0235 }
            r13 = 1
            e8.be0 r8 = new e8.be0     // Catch:{ Exception -> 0x0235 }
            r4 = r8
            r6 = r10
            r7 = r0
            r0 = r8
            r8 = r2
            r2 = r9
            r9 = r13
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0202 }
            r3.add(r0)     // Catch:{ Exception -> 0x0202 }
            return r3
        L_0x0235:
            r0 = move-exception
        L_0x0236:
            r2 = r9
            goto L_0x0243
        L_0x0238:
            r0 = move-exception
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r7
            r1 = r8
            goto L_0x0236
        L_0x0243:
            int r4 = e8.eg0.f14479a     // Catch:{ Exception -> 0x02c7 }
            r5 = 23
            java.lang.String r6 = "MediaCodecUtil"
            if (r4 > r5) goto L_0x0275
            boolean r4 = r3.isEmpty()     // Catch:{ Exception -> 0x02c7 }
            if (r4 != 0) goto L_0x0275
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x02c7 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x02c7 }
            int r0 = r0 + 46
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02c7 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x02c7 }
            java.lang.String r0 = "Skipping codec "
            r4.append(r0)     // Catch:{ Exception -> 0x02c7 }
            r4.append(r2)     // Catch:{ Exception -> 0x02c7 }
            java.lang.String r0 = " (failed to query capabilities)"
            r4.append(r0)     // Catch:{ Exception -> 0x02c7 }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x02c7 }
            android.util.Log.e(r6, r0)     // Catch:{ Exception -> 0x02c7 }
            goto L_0x02b0
        L_0x0275:
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x02c7 }
            int r1 = r1.length()     // Catch:{ Exception -> 0x02c7 }
            int r1 = r1 + 25
            int r3 = r18.length()     // Catch:{ Exception -> 0x02c7 }
            int r1 = r1 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02c7 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x02c7 }
            java.lang.String r1 = "Failed to query codec "
            r3.append(r1)     // Catch:{ Exception -> 0x02c7 }
            r3.append(r2)     // Catch:{ Exception -> 0x02c7 }
            java.lang.String r1 = " ("
            r3.append(r1)     // Catch:{ Exception -> 0x02c7 }
            r1 = r18
            r3.append(r1)     // Catch:{ Exception -> 0x02c7 }
            java.lang.String r1 = ")"
            r3.append(r1)     // Catch:{ Exception -> 0x02c7 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x02c7 }
            android.util.Log.e(r6, r1)     // Catch:{ Exception -> 0x02c7 }
            throw r0     // Catch:{ Exception -> 0x02c7 }
        L_0x02a8:
            r19 = r5
            r20 = r6
            r21 = r7
            r1 = r8
        L_0x02af:
            r2 = r9
        L_0x02b0:
            int r5 = r19 + 1
            r8 = r1
            r9 = r2
            r6 = r20
            r7 = r21
            r1 = r22
            r2 = r23
            goto L_0x018a
        L_0x02be:
            int r14 = r14 + 1
            r1 = r22
            r2 = r23
            goto L_0x0014
        L_0x02c6:
            return r3
        L_0x02c7:
            r0 = move-exception
            e8.ee0 r1 = new e8.ee0
            r2 = 0
            r1.<init>(r0, r2)
            goto L_0x02d0
        L_0x02cf:
            throw r1
        L_0x02d0:
            goto L_0x02cf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tt.a(com.google.android.gms.internal.ads.tt$a, e8.de0):java.util.List");
    }

    public static be0 b(String str, boolean z10) throws ee0 {
        List<T> list;
        synchronized (tt.class) {
            a aVar = new a(str, z10);
            HashMap<a, List<be0>> hashMap = f8212c;
            list = hashMap.get(aVar);
            if (list == null) {
                int i10 = eg0.f14479a;
                List<be0> a10 = a(aVar, i10 >= 21 ? new fe0(z10) : new ge0((uk) null));
                if (z10 && ((ArrayList) a10).isEmpty() && 21 <= i10 && i10 <= 23) {
                    a10 = a(aVar, new ge0((uk) null));
                    ArrayList arrayList = (ArrayList) a10;
                    if (!arrayList.isEmpty()) {
                        String str2 = ((be0) arrayList.get(0)).f13988a;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                        sb2.append("MediaCodecList API didn't list secure decoder for: ");
                        sb2.append(str);
                        sb2.append(". Assuming: ");
                        sb2.append(str2);
                        Log.w("MediaCodecUtil", sb2.toString());
                    }
                }
                list = Collections.unmodifiableList(a10);
                hashMap.put(aVar, list);
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return (be0) list.get(0);
    }

    public static int c() throws ee0 {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        if (f8216g == -1) {
            int i10 = 0;
            be0 b10 = b("video/avc", false);
            if (b10 != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = b10.f13993f;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = codecProfileLevelArr[i10].level;
                    int i13 = 9437184;
                    if (i12 != 1 && i12 != 2) {
                        switch (i12) {
                            case b4.f10106f /*8*/:
                            case 16:
                            case 32:
                                i13 = 101376;
                                break;
                            case 64:
                                i13 = 202752;
                                break;
                            case 128:
                            case 256:
                                i13 = 414720;
                                break;
                            case 512:
                                i13 = 921600;
                                break;
                            case 1024:
                                i13 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i13 = 2097152;
                                break;
                            case 8192:
                                i13 = 2228224;
                                break;
                            case 16384:
                                i13 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                break;
                            default:
                                i13 = -1;
                                break;
                        }
                    } else {
                        i13 = 25344;
                    }
                    i11 = Math.max(i13, i11);
                    i10++;
                }
                i10 = Math.max(i11, eg0.f14479a >= 21 ? 345600 : 172800);
            }
            f8216g = i10;
        }
        return f8216g;
    }
}

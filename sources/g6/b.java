package g6;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import c5.f;
import com.google.android.exoplayer2.upstream.p;
import g6.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import k5.j;
import k5.n;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import v6.e0;
import x4.b0;
import x4.m0;

/* compiled from: SsManifestParser */
public class b implements p.a<a> {

    /* renamed from: a  reason: collision with root package name */
    public final XmlPullParserFactory f18529a;

    /* compiled from: SsManifestParser */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f18530a;

        /* renamed from: b  reason: collision with root package name */
        public final String f18531b;

        /* renamed from: c  reason: collision with root package name */
        public final a f18532c;

        /* renamed from: d  reason: collision with root package name */
        public final List<Pair<String, Object>> f18533d = new LinkedList();

        public a(a aVar, String str, String str2) {
            this.f18532c = aVar;
            this.f18530a = str;
            this.f18531b = str2;
        }

        public void a(Object obj) {
        }

        public abstract Object b();

        public final Object c(String str) {
            for (int i10 = 0; i10 < this.f18533d.size(); i10++) {
                Pair pair = this.f18533d.get(i10);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.f18532c;
            if (aVar == null) {
                return null;
            }
            return aVar.c(str);
        }

        public boolean d(String str) {
            return false;
        }

        public final Object e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                a aVar = null;
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f18531b.equals(name)) {
                        k(xmlPullParser);
                        z10 = true;
                    } else if (z10) {
                        if (i10 > 0) {
                            i10++;
                        } else if (d(name)) {
                            k(xmlPullParser);
                        } else {
                            String str = this.f18530a;
                            if ("QualityLevel".equals(name)) {
                                aVar = new d(this, str);
                            } else if ("Protection".equals(name)) {
                                aVar = new c(this, str);
                            } else if ("StreamIndex".equals(name)) {
                                aVar = new f(this, str);
                            }
                            if (aVar == null) {
                                i10 = 1;
                            } else {
                                a(aVar.e(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z10 && i10 == 0) {
                        l(xmlPullParser);
                    }
                } else if (!z10) {
                    continue;
                } else if (i10 > 0) {
                    i10--;
                } else {
                    String name2 = xmlPullParser.getName();
                    f(xmlPullParser);
                    if (!d(name2)) {
                        return b();
                    }
                }
                xmlPullParser.next();
            }
        }

        public void f(XmlPullParser xmlPullParser) {
        }

        public final int g(XmlPullParser xmlPullParser, String str, int i10) throws m0 {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue == null) {
                return i10;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e10) {
                throw new m0((Throwable) e10);
            }
        }

        public final long h(XmlPullParser xmlPullParser, String str, long j10) throws m0 {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue == null) {
                return j10;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e10) {
                throw new m0((Throwable) e10);
            }
        }

        public final int i(XmlPullParser xmlPullParser, String str) throws m0 {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue != null) {
                try {
                    return Integer.parseInt(attributeValue);
                } catch (NumberFormatException e10) {
                    throw new m0((Throwable) e10);
                }
            } else {
                throw new C0146b(str);
            }
        }

        public final String j(XmlPullParser xmlPullParser, String str) throws C0146b {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new C0146b(str);
        }

        public abstract void k(XmlPullParser xmlPullParser) throws m0;

        public void l(XmlPullParser xmlPullParser) {
        }
    }

    /* renamed from: g6.b$b  reason: collision with other inner class name */
    /* compiled from: SsManifestParser */
    public static class C0146b extends m0 {
        public C0146b(String str) {
            super(j.f.a("Missing required field: ", str));
        }
    }

    /* compiled from: SsManifestParser */
    public static class c extends a {

        /* renamed from: e  reason: collision with root package name */
        public boolean f18534e;

        /* renamed from: f  reason: collision with root package name */
        public UUID f18535f;

        /* renamed from: g  reason: collision with root package name */
        public byte[] f18536g;

        public c(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        public static void m(byte[] bArr, int i10, int i11) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }

        public Object b() {
            UUID uuid = this.f18535f;
            byte[] a10 = j.a(uuid, this.f18536g);
            byte[] bArr = this.f18536g;
            n[] nVarArr = new n[1];
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < bArr.length; i10 += 2) {
                sb2.append((char) bArr[i10]);
            }
            String sb3 = sb2.toString();
            byte[] decode = Base64.decode(sb3.substring(sb3.indexOf("<KID>") + 5, sb3.indexOf("</KID>")), 0);
            m(decode, 0, 3);
            byte b10 = decode[1];
            decode[1] = decode[2];
            decode[2] = b10;
            byte b11 = decode[4];
            decode[4] = decode[5];
            decode[5] = b11;
            byte b12 = decode[6];
            decode[6] = decode[7];
            decode[7] = b12;
            nVarArr[0] = new n(true, (String) null, 8, decode, 0, 0, (byte[]) null);
            return new a.C0145a(uuid, a10, nVarArr);
        }

        public boolean d(String str) {
            return "ProtectionHeader".equals(str);
        }

        public void f(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f18534e = false;
            }
        }

        public void k(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f18534e = true;
                String attributeValue = xmlPullParser.getAttributeValue((String) null, "SystemID");
                if (attributeValue.charAt(0) == '{' && attributeValue.charAt(attributeValue.length() - 1) == '}') {
                    attributeValue = attributeValue.substring(1, attributeValue.length() - 1);
                }
                this.f18535f = UUID.fromString(attributeValue);
            }
        }

        public void l(XmlPullParser xmlPullParser) {
            if (this.f18534e) {
                this.f18536g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    /* compiled from: SsManifestParser */
    public static class d extends a {

        /* renamed from: e  reason: collision with root package name */
        public b0 f18537e;

        public d(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        public static List<byte[]> m(String str) {
            byte[][] bArr;
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                int i10 = e0.f26436a;
                int length = str.length() / 2;
                byte[] bArr2 = new byte[length];
                for (int i11 = 0; i11 < length; i11++) {
                    int i12 = i11 * 2;
                    bArr2[i11] = (byte) (Character.digit(str.charAt(i12 + 1), 16) + (Character.digit(str.charAt(i12), 16) << 4));
                }
                if (!v6.c.c(bArr2, 0)) {
                    bArr = null;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = 0;
                    do {
                        arrayList2.add(Integer.valueOf(i13));
                        byte[] bArr3 = v6.c.f26429a;
                        i13 += bArr3.length;
                        int length2 = length - bArr3.length;
                        while (true) {
                            if (i13 > length2) {
                                i13 = -1;
                                continue;
                                break;
                            } else if (v6.c.c(bArr2, i13)) {
                                continue;
                                break;
                            } else {
                                i13++;
                            }
                        }
                    } while (i13 != -1);
                    byte[][] bArr4 = new byte[arrayList2.size()][];
                    int i14 = 0;
                    while (i14 < arrayList2.size()) {
                        int intValue = ((Integer) arrayList2.get(i14)).intValue();
                        int intValue2 = (i14 < arrayList2.size() + -1 ? ((Integer) arrayList2.get(i14 + 1)).intValue() : length) - intValue;
                        byte[] bArr5 = new byte[intValue2];
                        System.arraycopy(bArr2, intValue, bArr5, 0, intValue2);
                        bArr4[i14] = bArr5;
                        i14++;
                    }
                    bArr = bArr4;
                }
                if (bArr == null) {
                    arrayList.add(bArr2);
                } else {
                    Collections.addAll(arrayList, bArr);
                }
            }
            return arrayList;
        }

        public Object b() {
            return this.f18537e;
        }

        public void k(XmlPullParser xmlPullParser) throws m0 {
            String str;
            b0.b bVar = new b0.b();
            String j10 = j(xmlPullParser, "FourCC");
            if (j10.equalsIgnoreCase("H264") || j10.equalsIgnoreCase("X264") || j10.equalsIgnoreCase("AVC1") || j10.equalsIgnoreCase("DAVC")) {
                str = "video/avc";
            } else {
                str = (j10.equalsIgnoreCase("AAC") || j10.equalsIgnoreCase("AACL") || j10.equalsIgnoreCase("AACH") || j10.equalsIgnoreCase("AACP")) ? "audio/mp4a-latm" : (j10.equalsIgnoreCase("TTML") || j10.equalsIgnoreCase("DFXP")) ? "application/ttml+xml" : (j10.equalsIgnoreCase("ac-3") || j10.equalsIgnoreCase("dac3")) ? "audio/ac3" : (j10.equalsIgnoreCase("ec-3") || j10.equalsIgnoreCase("dec3")) ? "audio/eac3" : j10.equalsIgnoreCase("dtsc") ? "audio/vnd.dts" : (j10.equalsIgnoreCase("dtsh") || j10.equalsIgnoreCase("dtsl")) ? "audio/vnd.dts.hd" : j10.equalsIgnoreCase("dtse") ? "audio/vnd.dts.hd;profile=lbr" : j10.equalsIgnoreCase("opus") ? "audio/opus" : null;
            }
            int intValue = ((Integer) c("Type")).intValue();
            if (intValue == 2) {
                List<byte[]> m10 = m(xmlPullParser.getAttributeValue((String) null, "CodecPrivateData"));
                bVar.f27424j = "video/mp4";
                bVar.f27430p = i(xmlPullParser, "MaxWidth");
                bVar.f27431q = i(xmlPullParser, "MaxHeight");
                bVar.f27427m = m10;
            } else {
                int i10 = 0;
                if (intValue == 1) {
                    if (str == null) {
                        str = "audio/mp4a-latm";
                    }
                    int i11 = i(xmlPullParser, "Channels");
                    int i12 = i(xmlPullParser, "SamplingRate");
                    List<byte[]> m11 = m(xmlPullParser.getAttributeValue((String) null, "CodecPrivateData"));
                    if (((ArrayList) m11).isEmpty() && "audio/mp4a-latm".equals(str)) {
                        int i13 = 0;
                        int i14 = -1;
                        while (true) {
                            int[] iArr = z4.a.f28278a;
                            if (i13 >= iArr.length) {
                                break;
                            }
                            if (i12 == iArr[i13]) {
                                i14 = i13;
                            }
                            i13++;
                        }
                        int i15 = -1;
                        while (true) {
                            int[] iArr2 = z4.a.f28279b;
                            if (i10 >= iArr2.length) {
                                break;
                            }
                            if (i11 == iArr2[i10]) {
                                i15 = i10;
                            }
                            i10++;
                        }
                        if (i12 == -1 || i15 == -1) {
                            throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i12 + ", " + i11);
                        }
                        m11 = Collections.singletonList(z4.a.a(2, i14, i15));
                    }
                    bVar.f27424j = "audio/mp4";
                    bVar.f27438x = i11;
                    bVar.f27439y = i12;
                    bVar.f27427m = m11;
                } else if (intValue == 3) {
                    String str2 = (String) c("Subtype");
                    if (str2 != null) {
                        if (str2.equals("CAPT")) {
                            i10 = 64;
                        } else if (str2.equals("DESC")) {
                            i10 = 1024;
                        }
                    }
                    bVar.f27424j = "application/mp4";
                    bVar.f27419e = i10;
                } else {
                    bVar.f27424j = "application/mp4";
                }
            }
            bVar.f27415a = xmlPullParser.getAttributeValue((String) null, "Index");
            bVar.f27416b = (String) c("Name");
            bVar.f27425k = str;
            bVar.f27420f = i(xmlPullParser, "Bitrate");
            bVar.f27417c = (String) c("Language");
            this.f18537e = bVar.a();
        }
    }

    /* compiled from: SsManifestParser */
    public static class e extends a {

        /* renamed from: e  reason: collision with root package name */
        public final List<a.b> f18538e = new LinkedList();

        /* renamed from: f  reason: collision with root package name */
        public int f18539f;

        /* renamed from: g  reason: collision with root package name */
        public int f18540g;

        /* renamed from: h  reason: collision with root package name */
        public long f18541h;

        /* renamed from: i  reason: collision with root package name */
        public long f18542i;

        /* renamed from: j  reason: collision with root package name */
        public long f18543j;

        /* renamed from: k  reason: collision with root package name */
        public int f18544k = -1;

        /* renamed from: l  reason: collision with root package name */
        public boolean f18545l;

        /* renamed from: m  reason: collision with root package name */
        public a.C0145a f18546m = null;

        public e(a aVar, String str) {
            super((a) null, str, "SmoothStreamingMedia");
        }

        public void a(Object obj) {
            if (obj instanceof a.b) {
                this.f18538e.add((a.b) obj);
            } else if (obj instanceof a.C0145a) {
                v6.a.d(this.f18546m == null);
                this.f18546m = (a.C0145a) obj;
            }
        }

        public Object b() {
            int size = this.f18538e.size();
            a.b[] bVarArr = new a.b[size];
            this.f18538e.toArray(bVarArr);
            a.C0145a aVar = this.f18546m;
            if (aVar != null) {
                c5.f fVar = new c5.f((String) null, true, new f.b(aVar.f18510a, (String) null, "video/mp4", aVar.f18511b));
                for (int i10 = 0; i10 < size; i10++) {
                    a.b bVar = bVarArr[i10];
                    int i11 = bVar.f18513a;
                    if (i11 == 2 || i11 == 1) {
                        b0[] b0VarArr = bVar.f18522j;
                        for (int i12 = 0; i12 < b0VarArr.length; i12++) {
                            b0.b a10 = b0VarArr[i12].a();
                            a10.f27428n = fVar;
                            b0VarArr[i12] = a10.a();
                        }
                    }
                }
            }
            return new a(this.f18539f, this.f18540g, this.f18541h, this.f18542i, this.f18543j, this.f18544k, this.f18545l, this.f18546m, bVarArr);
        }

        public void k(XmlPullParser xmlPullParser) throws m0 {
            this.f18539f = i(xmlPullParser, "MajorVersion");
            this.f18540g = i(xmlPullParser, "MinorVersion");
            this.f18541h = h(xmlPullParser, "TimeScale", 10000000);
            String attributeValue = xmlPullParser.getAttributeValue((String) null, "Duration");
            if (attributeValue != null) {
                try {
                    this.f18542i = Long.parseLong(attributeValue);
                    this.f18543j = h(xmlPullParser, "DVRWindowLength", 0);
                    this.f18544k = g(xmlPullParser, "LookaheadCount", -1);
                    boolean z10 = false;
                    String attributeValue2 = xmlPullParser.getAttributeValue((String) null, "IsLive");
                    if (attributeValue2 != null) {
                        z10 = Boolean.parseBoolean(attributeValue2);
                    }
                    this.f18545l = z10;
                    this.f18533d.add(Pair.create("TimeScale", Long.valueOf(this.f18541h)));
                } catch (NumberFormatException e10) {
                    throw new m0((Throwable) e10);
                }
            } else {
                throw new C0146b("Duration");
            }
        }
    }

    /* compiled from: SsManifestParser */
    public static class f extends a {

        /* renamed from: e  reason: collision with root package name */
        public final String f18547e;

        /* renamed from: f  reason: collision with root package name */
        public final List<b0> f18548f = new LinkedList();

        /* renamed from: g  reason: collision with root package name */
        public int f18549g;

        /* renamed from: h  reason: collision with root package name */
        public String f18550h;

        /* renamed from: i  reason: collision with root package name */
        public long f18551i;

        /* renamed from: j  reason: collision with root package name */
        public String f18552j;

        /* renamed from: k  reason: collision with root package name */
        public String f18553k;

        /* renamed from: l  reason: collision with root package name */
        public int f18554l;

        /* renamed from: m  reason: collision with root package name */
        public int f18555m;

        /* renamed from: n  reason: collision with root package name */
        public int f18556n;

        /* renamed from: o  reason: collision with root package name */
        public int f18557o;

        /* renamed from: p  reason: collision with root package name */
        public String f18558p;

        /* renamed from: q  reason: collision with root package name */
        public ArrayList<Long> f18559q;

        /* renamed from: r  reason: collision with root package name */
        public long f18560r;

        public f(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f18547e = str;
        }

        public void a(Object obj) {
            if (obj instanceof b0) {
                this.f18548f.add((b0) obj);
            }
        }

        public Object b() {
            String str;
            String str2;
            String str3;
            b0[] b0VarArr = new b0[this.f18548f.size()];
            this.f18548f.toArray(b0VarArr);
            String str4 = this.f18547e;
            String str5 = this.f18553k;
            int i10 = this.f18549g;
            String str6 = this.f18550h;
            long j10 = this.f18551i;
            String str7 = this.f18552j;
            int i11 = this.f18554l;
            int i12 = this.f18555m;
            int i13 = this.f18556n;
            int i14 = this.f18557o;
            String str8 = this.f18558p;
            ArrayList<Long> arrayList = this.f18559q;
            int i15 = i13;
            int i16 = i14;
            long j11 = this.f18560r;
            int i17 = e0.f26436a;
            int size = arrayList.size();
            b0[] b0VarArr2 = b0VarArr;
            long[] jArr = new long[size];
            int i18 = i11;
            int i19 = i12;
            if (j10 < 1000000 || j10 % 1000000 != 0) {
                str2 = str7;
                if (j10 >= 1000000 || 1000000 % j10 != 0) {
                    double d10 = (double) 1000000;
                    str = str6;
                    str3 = str8;
                    double d11 = (double) j10;
                    Double.isNaN(d10);
                    Double.isNaN(d11);
                    Double.isNaN(d10);
                    Double.isNaN(d11);
                    Double.isNaN(d10);
                    Double.isNaN(d11);
                    double d12 = d10 / d11;
                    int i20 = 0;
                    while (i20 < size) {
                        double longValue = (double) arrayList.get(i20).longValue();
                        Double.isNaN(longValue);
                        Double.isNaN(longValue);
                        Double.isNaN(longValue);
                        jArr[i20] = (long) (longValue * d12);
                        i20++;
                        arrayList = arrayList;
                    }
                    return new a.b(str4, str5, i10, str, j10, str2, i18, i19, i15, i16, str3, b0VarArr2, arrayList, jArr, e0.P(j11, 1000000, j10));
                }
                long j12 = 1000000 / j10;
                for (int i21 = 0; i21 < size; i21++) {
                    jArr[i21] = arrayList.get(i21).longValue() * j12;
                }
            } else {
                long j13 = j10 / 1000000;
                str2 = str7;
                for (int i22 = 0; i22 < size; i22++) {
                    jArr[i22] = arrayList.get(i22).longValue() / j13;
                }
            }
            str = str6;
            str3 = str8;
            return new a.b(str4, str5, i10, str, j10, str2, i18, i19, i15, i16, str3, b0VarArr2, arrayList, jArr, e0.P(j11, 1000000, j10));
        }

        public boolean d(String str) {
            return "c".equals(str);
        }

        public void k(XmlPullParser xmlPullParser) throws m0 {
            int i10 = 1;
            if ("c".equals(xmlPullParser.getName())) {
                int size = this.f18559q.size();
                long h10 = h(xmlPullParser, "t", -9223372036854775807L);
                if (h10 == -9223372036854775807L) {
                    if (size == 0) {
                        h10 = 0;
                    } else if (this.f18560r != -1) {
                        h10 = this.f18560r + this.f18559q.get(size - 1).longValue();
                    } else {
                        throw new m0("Unable to infer start time");
                    }
                }
                this.f18559q.add(Long.valueOf(h10));
                this.f18560r = h(xmlPullParser, "d", -9223372036854775807L);
                long h11 = h(xmlPullParser, "r", 1);
                if (h11 <= 1 || this.f18560r != -9223372036854775807L) {
                    while (true) {
                        long j10 = (long) i10;
                        if (j10 < h11) {
                            this.f18559q.add(Long.valueOf((this.f18560r * j10) + h10));
                            i10++;
                        } else {
                            return;
                        }
                    }
                } else {
                    throw new m0("Repeated chunk with unspecified duration");
                }
            } else {
                String attributeValue = xmlPullParser.getAttributeValue((String) null, "Type");
                if (attributeValue != null) {
                    if (!"audio".equalsIgnoreCase(attributeValue)) {
                        if ("video".equalsIgnoreCase(attributeValue)) {
                            i10 = 2;
                        } else if ("text".equalsIgnoreCase(attributeValue)) {
                            i10 = 3;
                        } else {
                            throw new m0(q.b.a("Invalid key value[", attributeValue, "]"));
                        }
                    }
                    this.f18549g = i10;
                    this.f18533d.add(Pair.create("Type", Integer.valueOf(i10)));
                    if (this.f18549g == 3) {
                        this.f18550h = j(xmlPullParser, "Subtype");
                    } else {
                        this.f18550h = xmlPullParser.getAttributeValue((String) null, "Subtype");
                    }
                    this.f18533d.add(Pair.create("Subtype", this.f18550h));
                    this.f18552j = xmlPullParser.getAttributeValue((String) null, "Name");
                    this.f18553k = j(xmlPullParser, "Url");
                    this.f18554l = g(xmlPullParser, "MaxWidth", -1);
                    this.f18555m = g(xmlPullParser, "MaxHeight", -1);
                    this.f18556n = g(xmlPullParser, "DisplayWidth", -1);
                    this.f18557o = g(xmlPullParser, "DisplayHeight", -1);
                    String attributeValue2 = xmlPullParser.getAttributeValue((String) null, "Language");
                    this.f18558p = attributeValue2;
                    this.f18533d.add(Pair.create("Language", attributeValue2));
                    long g10 = (long) g(xmlPullParser, "TimeScale", -1);
                    this.f18551i = g10;
                    if (g10 == -1) {
                        this.f18551i = ((Long) c("TimeScale")).longValue();
                    }
                    this.f18559q = new ArrayList<>();
                    return;
                }
                throw new C0146b("Type");
            }
        }
    }

    public b() {
        try {
            this.f18529a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public Object a(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser newPullParser = this.f18529a.newPullParser();
            newPullParser.setInput(inputStream, (String) null);
            return (a) new e((a) null, uri.toString()).e(newPullParser);
        } catch (XmlPullParserException e10) {
            throw new m0((Throwable) e10);
        }
    }
}

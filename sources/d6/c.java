package d6;

import android.net.Uri;
import android.text.TextUtils;
import androidx.activity.e;
import c5.f;
import com.google.android.exoplayer2.upstream.p;
import com.startapp.b4;
import d6.j;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import v6.c0;
import v6.e0;
import v6.f0;
import x4.b0;
import x4.m0;

/* compiled from: DashManifestParser */
public class c extends DefaultHandler implements p.a<b> {

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f13090b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f13091c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f13092d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f13093e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a  reason: collision with root package name */
    public final XmlPullParserFactory f13094a;

    /* compiled from: DashManifestParser */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final b0 f13095a;

        /* renamed from: b  reason: collision with root package name */
        public final String f13096b;

        /* renamed from: c  reason: collision with root package name */
        public final j f13097c;

        /* renamed from: d  reason: collision with root package name */
        public final String f13098d;

        /* renamed from: e  reason: collision with root package name */
        public final ArrayList<f.b> f13099e;

        /* renamed from: f  reason: collision with root package name */
        public final ArrayList<d> f13100f;

        /* renamed from: g  reason: collision with root package name */
        public final long f13101g;

        public a(b0 b0Var, String str, j jVar, String str2, ArrayList<f.b> arrayList, ArrayList<d> arrayList2, long j10) {
            this.f13095a = b0Var;
            this.f13096b = str;
            this.f13097c = jVar;
            this.f13098d = str2;
            this.f13099e = arrayList;
            this.f13100f = arrayList2;
            this.f13101g = j10;
        }
    }

    public c() {
        try {
            this.f13094a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static int c(int i10, int i11) {
        if (i10 == -1) {
            return i11;
        }
        if (i11 == -1) {
            return i10;
        }
        v6.a.d(i10 == i11);
        return i10;
    }

    public static long d(long j10, long j11) {
        if (j11 != -9223372036854775807L) {
            j10 = j11;
        }
        if (j10 == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j10;
    }

    public static void e(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        if (f0.c(xmlPullParser)) {
            int i10 = 1;
            while (i10 != 0) {
                xmlPullParser.next();
                if (f0.c(xmlPullParser)) {
                    i10++;
                } else {
                    if (xmlPullParser.getEventType() == 3) {
                        i10--;
                    }
                }
            }
        }
    }

    public static d k(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String str2 = null;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue((String) null, "id");
        if (attributeValue3 != null) {
            str2 = attributeValue3;
        }
        do {
            xmlPullParser.next();
        } while (!f0.b(xmlPullParser, str));
        return new d(attributeValue, attributeValue2, str2);
    }

    public static long l(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return j10;
        }
        Matcher matcher = e0.f26443h.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double d10 = 0.0d;
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        if (group6 != null) {
            d10 = Double.parseDouble(group6);
        }
        long j11 = (long) ((parseDouble5 + d10) * 1000.0d);
        if (isEmpty) {
            return -j11;
        }
        return j11;
    }

    public static float m(XmlPullParser xmlPullParser, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "frameRate");
        if (attributeValue == null) {
            return f10;
        }
        Matcher matcher = f13090b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f10;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        String group = matcher.group(2);
        return !TextUtils.isEmpty(group) ? ((float) parseInt) / ((float) Integer.parseInt(group)) : (float) parseInt;
    }

    public static int n(XmlPullParser xmlPullParser, String str, int i10) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? i10 : Integer.parseInt(attributeValue);
    }

    public static long o(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? j10 : Long.parseLong(attributeValue);
    }

    public static String x(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                e(xmlPullParser);
            }
        } while (!f0.b(xmlPullParser, str));
        return str2;
    }

    public Object a(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser newPullParser = this.f13094a.newPullParser();
            newPullParser.setInput(inputStream, (String) null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return p(newPullParser, uri.toString());
            }
            throw new m0("inputStream does not contain a valid media presentation description");
        } catch (XmlPullParserException e10) {
            throw new m0((Throwable) e10);
        }
    }

    public final long b(List<j.d> list, long j10, long j11, int i10, long j12) {
        int i11;
        if (i10 >= 0) {
            i11 = i10 + 1;
        } else {
            int i12 = e0.f26436a;
            i11 = (int) ((((j12 - j10) + j11) - 1) / j11);
        }
        for (int i13 = 0; i13 < i11; i13++) {
            list.add(new j.d(j10, j11));
            j10 += j11;
        }
        return j10;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (r1 != 3) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009b, code lost:
        if (r0.equals("4000") == false) goto L_0x009d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int f(org.xmlpull.v1.XmlPullParser r9) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            java.lang.String r1 = "schemeIdUri"
            java.lang.String r1 = r9.getAttributeValue(r0, r1)
            if (r1 != 0) goto L_0x000a
            r1 = r0
        L_0x000a:
            r1.getClass()
            int r2 = r1.hashCode()
            r3 = 0
            r4 = -1
            r5 = 2
            r6 = 3
            r7 = 1
            switch(r2) {
                case -1352850286: goto L_0x003b;
                case -1138141449: goto L_0x0030;
                case -986633423: goto L_0x0025;
                case 2036691300: goto L_0x001a;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x0046
        L_0x001a:
            java.lang.String r2 = "urn:dolby:dash:audio_channel_configuration:2011"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0023
            goto L_0x0046
        L_0x0023:
            r1 = 3
            goto L_0x0047
        L_0x0025:
            java.lang.String r2 = "urn:mpeg:mpegB:cicp:ChannelConfiguration"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x002e
            goto L_0x0046
        L_0x002e:
            r1 = 2
            goto L_0x0047
        L_0x0030:
            java.lang.String r2 = "tag:dolby.com,2014:dash:audio_channel_configuration:2011"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0039
            goto L_0x0046
        L_0x0039:
            r1 = 1
            goto L_0x0047
        L_0x003b:
            java.lang.String r2 = "urn:mpeg:dash:23003:3:audio_channel_configuration:2011"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r1 = 0
            goto L_0x0047
        L_0x0046:
            r1 = -1
        L_0x0047:
            java.lang.String r2 = "value"
            if (r1 == 0) goto L_0x00b3
            if (r1 == r7) goto L_0x0061
            if (r1 == r5) goto L_0x0053
            if (r1 == r6) goto L_0x0061
            goto L_0x00b7
        L_0x0053:
            int r0 = n(r9, r2, r4)
            if (r0 < 0) goto L_0x00b7
            int[] r1 = f13093e
            int r2 = r1.length
            if (r0 >= r2) goto L_0x00b7
            r4 = r1[r0]
            goto L_0x00b7
        L_0x0061:
            java.lang.String r0 = r9.getAttributeValue(r0, r2)
            java.lang.String r0 = v6.e0.V(r0)
            if (r0 != 0) goto L_0x006c
            goto L_0x00b7
        L_0x006c:
            int r1 = r0.hashCode()
            switch(r1) {
                case 1596796: goto L_0x0095;
                case 2937391: goto L_0x008a;
                case 3094035: goto L_0x007f;
                case 3133436: goto L_0x0074;
                default: goto L_0x0073;
            }
        L_0x0073:
            goto L_0x009d
        L_0x0074:
            java.lang.String r1 = "fa01"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x007d
            goto L_0x009d
        L_0x007d:
            r3 = 3
            goto L_0x009e
        L_0x007f:
            java.lang.String r1 = "f801"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0088
            goto L_0x009d
        L_0x0088:
            r3 = 2
            goto L_0x009e
        L_0x008a:
            java.lang.String r1 = "a000"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0093
            goto L_0x009d
        L_0x0093:
            r3 = 1
            goto L_0x009e
        L_0x0095:
            java.lang.String r1 = "4000"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x009e
        L_0x009d:
            r3 = -1
        L_0x009e:
            if (r3 == 0) goto L_0x00b1
            if (r3 == r7) goto L_0x00af
            if (r3 == r5) goto L_0x00ac
            if (r3 == r6) goto L_0x00a7
            goto L_0x00b7
        L_0x00a7:
            r0 = 8
            r4 = 8
            goto L_0x00b7
        L_0x00ac:
            r0 = 6
            r4 = 6
            goto L_0x00b7
        L_0x00af:
            r4 = 2
            goto L_0x00b7
        L_0x00b1:
            r4 = 1
            goto L_0x00b7
        L_0x00b3:
            int r4 = n(r9, r2, r4)
        L_0x00b7:
            r9.next()
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = v6.f0.b(r9, r0)
            if (r0 == 0) goto L_0x00b7
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.c.f(org.xmlpull.v1.XmlPullParser):int");
    }

    public long g(XmlPullParser xmlPullParser, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j10;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public String h(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        return c0.c(str, x(xmlPullParser, "BaseURL"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0150  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair<java.lang.String, c5.f.b> i(org.xmlpull.v1.XmlPullParser r14) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r13 = this;
            r0 = 0
            java.lang.String r1 = "schemeIdUri"
            java.lang.String r1 = r14.getAttributeValue(r0, r1)
            r2 = -1
            r3 = 0
            r4 = 1
            r5 = 58
            if (r1 == 0) goto L_0x00b8
            java.lang.String r1 = v6.e0.V(r1)
            r1.getClass()
            int r6 = r1.hashCode()
            r7 = 489446379(0x1d2c5beb, float:2.281153E-21)
            r8 = 2
            if (r6 == r7) goto L_0x0040
            r7 = 755418770(0x2d06c692, float:7.66111E-12)
            if (r6 == r7) goto L_0x0035
            r7 = 1812765994(0x6c0c9d2a, float:6.799672E26)
            if (r6 == r7) goto L_0x002a
            goto L_0x0048
        L_0x002a:
            java.lang.String r6 = "urn:mpeg:dash:mp4protection:2011"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0033
            goto L_0x0048
        L_0x0033:
            r1 = 2
            goto L_0x004b
        L_0x0035:
            java.lang.String r6 = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x003e
            goto L_0x0048
        L_0x003e:
            r1 = 1
            goto L_0x004b
        L_0x0040:
            java.lang.String r6 = "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x004a
        L_0x0048:
            r1 = -1
            goto L_0x004b
        L_0x004a:
            r1 = 0
        L_0x004b:
            if (r1 == 0) goto L_0x00b3
            if (r1 == r4) goto L_0x00b0
            if (r1 == r8) goto L_0x0053
            goto L_0x00b8
        L_0x0053:
            java.lang.String r1 = "value"
            java.lang.String r1 = r14.getAttributeValue(r0, r1)
            int r6 = r14.getAttributeCount()
            r7 = 0
        L_0x005e:
            if (r7 >= r6) goto L_0x0081
            java.lang.String r8 = r14.getAttributeName(r7)
            int r9 = r8.indexOf(r5)
            if (r9 != r2) goto L_0x006b
            goto L_0x0071
        L_0x006b:
            int r9 = r9 + 1
            java.lang.String r8 = r8.substring(r9)
        L_0x0071:
            java.lang.String r9 = "default_KID"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x007e
            java.lang.String r6 = r14.getAttributeValue(r7)
            goto L_0x0082
        L_0x007e:
            int r7 = r7 + 1
            goto L_0x005e
        L_0x0081:
            r6 = r0
        L_0x0082:
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x00b9
            java.lang.String r7 = "00000000-0000-0000-0000-000000000000"
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L_0x00b9
            java.lang.String r7 = "\\s+"
            java.lang.String[] r6 = r6.split(r7)
            int r7 = r6.length
            java.util.UUID[] r7 = new java.util.UUID[r7]
            r8 = 0
        L_0x009a:
            int r9 = r6.length
            if (r8 >= r9) goto L_0x00a8
            r9 = r6[r8]
            java.util.UUID r9 = java.util.UUID.fromString(r9)
            r7[r8] = r9
            int r8 = r8 + 1
            goto L_0x009a
        L_0x00a8:
            java.util.UUID r6 = x4.f.f27567b
            byte[] r7 = k5.j.b(r6, r7, r0)
            r8 = r0
            goto L_0x00bc
        L_0x00b0:
            java.util.UUID r1 = x4.f.f27569d
            goto L_0x00b5
        L_0x00b3:
            java.util.UUID r1 = x4.f.f27570e
        L_0x00b5:
            r6 = r1
            r1 = r0
            goto L_0x00ba
        L_0x00b8:
            r1 = r0
        L_0x00b9:
            r6 = r0
        L_0x00ba:
            r7 = r0
            r8 = r7
        L_0x00bc:
            r14.next()
            java.lang.String r9 = "ms:laurl"
            boolean r9 = v6.f0.d(r14, r9)
            if (r9 == 0) goto L_0x00cf
            java.lang.String r8 = "licenseUrl"
            java.lang.String r8 = r14.getAttributeValue(r0, r8)
            goto L_0x0146
        L_0x00cf:
            r9 = 4
            if (r7 != 0) goto L_0x011e
            boolean r10 = v6.f0.c(r14)
            if (r10 == 0) goto L_0x00f3
            java.lang.String r10 = r14.getName()
            int r11 = r10.indexOf(r5)
            if (r11 != r2) goto L_0x00e3
            goto L_0x00e9
        L_0x00e3:
            int r11 = r11 + 1
            java.lang.String r10 = r10.substring(r11)
        L_0x00e9:
            java.lang.String r11 = "pssh"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x00f3
            r10 = 1
            goto L_0x00f4
        L_0x00f3:
            r10 = 0
        L_0x00f4:
            if (r10 == 0) goto L_0x011e
            int r10 = r14.next()
            if (r10 != r9) goto L_0x011e
            java.lang.String r6 = r14.getText()
            byte[] r6 = android.util.Base64.decode(r6, r3)
            k5.j$a r7 = k5.j.c(r6)
            if (r7 != 0) goto L_0x010c
            r7 = r0
            goto L_0x010e
        L_0x010c:
            java.util.UUID r7 = r7.f19984a
        L_0x010e:
            if (r7 != 0) goto L_0x011a
            java.lang.String r6 = "MpdParser"
            java.lang.String r9 = "Skipping malformed cenc:pssh data"
            android.util.Log.w(r6, r9)
            r6 = r7
            r7 = r0
            goto L_0x0146
        L_0x011a:
            r12 = r7
            r7 = r6
            r6 = r12
            goto L_0x0146
        L_0x011e:
            if (r7 != 0) goto L_0x0143
            java.util.UUID r10 = x4.f.f27570e
            boolean r11 = r10.equals(r6)
            if (r11 == 0) goto L_0x0143
            java.lang.String r11 = "mspr:pro"
            boolean r11 = v6.f0.d(r14, r11)
            if (r11 == 0) goto L_0x0143
            int r11 = r14.next()
            if (r11 != r9) goto L_0x0143
            java.lang.String r7 = r14.getText()
            byte[] r7 = android.util.Base64.decode(r7, r3)
            byte[] r7 = k5.j.a(r10, r7)
            goto L_0x0146
        L_0x0143:
            e(r14)
        L_0x0146:
            java.lang.String r9 = "ContentProtection"
            boolean r9 = v6.f0.b(r14, r9)
            if (r9 == 0) goto L_0x00bc
            if (r6 == 0) goto L_0x0157
            c5.f$b r0 = new c5.f$b
            java.lang.String r14 = "video/mp4"
            r0.<init>(r6, r8, r14, r7)
        L_0x0157:
            android.util.Pair r14 = android.util.Pair.create(r1, r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.c.i(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public int j(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "contentType");
        if (!TextUtils.isEmpty(attributeValue)) {
            if ("audio".equals(attributeValue)) {
                return 1;
            }
            if ("video".equals(attributeValue)) {
                return 2;
            }
            if ("text".equals(attributeValue)) {
                return 3;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r105v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r78v6, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r97v9, types: [d6.i$b] */
    /* JADX WARNING: type inference failed for: r97v10, types: [d6.i$c] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x07e6  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x082a  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x0a6c A[LOOP:5: B:150:0x0540->B:349:0x0a6c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0c58 A[LOOP:15: B:390:0x0c2b->B:403:0x0c58, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x0ced A[LOOP:4: B:99:0x035b->B:418:0x0ced, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:499:0x100f A[LOOP:3: B:91:0x024b->B:499:0x100f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:520:0x107d A[LOOP:0: B:25:0x008d->B:520:0x107d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:521:0x104b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:525:0x01e6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:526:0x0faa A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:527:0x0be1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:528:0x0772 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:538:0x085a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:565:0x0c54 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01f1 A[LOOP:2: B:63:0x0167->B:82:0x01f1, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d6.b p(org.xmlpull.v1.XmlPullParser r134, java.lang.String r135) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r133 = this;
            r14 = r133
            r15 = r134
            r0 = 0
            java.lang.String r1 = "availabilityStartTime"
            java.lang.String r1 = r15.getAttributeValue(r0, r1)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x0015
            r16 = r2
            goto L_0x001b
        L_0x0015:
            long r4 = v6.e0.M(r1)
            r16 = r4
        L_0x001b:
            java.lang.String r1 = "mediaPresentationDuration"
            long r18 = l(r15, r1, r2)
            java.lang.String r1 = "minBufferTime"
            long r20 = l(r15, r1, r2)
            java.lang.String r1 = "type"
            java.lang.String r1 = r15.getAttributeValue(r0, r1)
            java.lang.String r4 = "dynamic"
            boolean r22 = r4.equals(r1)
            if (r22 == 0) goto L_0x003e
            java.lang.String r1 = "minimumUpdatePeriod"
            long r4 = l(r15, r1, r2)
            r23 = r4
            goto L_0x0040
        L_0x003e:
            r23 = r2
        L_0x0040:
            if (r22 == 0) goto L_0x004b
            java.lang.String r1 = "timeShiftBufferDepth"
            long r4 = l(r15, r1, r2)
            r25 = r4
            goto L_0x004d
        L_0x004b:
            r25 = r2
        L_0x004d:
            if (r22 == 0) goto L_0x0058
            java.lang.String r1 = "suggestedPresentationDelay"
            long r4 = l(r15, r1, r2)
            r27 = r4
            goto L_0x005a
        L_0x0058:
            r27 = r2
        L_0x005a:
            java.lang.String r1 = "publishTime"
            java.lang.String r1 = r15.getAttributeValue(r0, r1)
            if (r1 != 0) goto L_0x0065
            r29 = r2
            goto L_0x006b
        L_0x0065:
            long r4 = v6.e0.M(r1)
            r29 = r4
        L_0x006b:
            if (r22 == 0) goto L_0x0070
            r4 = 0
            goto L_0x0071
        L_0x0070:
            r4 = r2
        L_0x0071:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            if (r22 == 0) goto L_0x0079
            goto L_0x007b
        L_0x0079:
            r2 = 0
        L_0x007b:
            r1 = 0
            r6 = 0
            r11 = r135
            r31 = r0
            r32 = r31
            r33 = r32
            r34 = r33
            r9 = r2
            r7 = r4
            r35 = 0
            r36 = 0
        L_0x008d:
            r134.next()
            java.lang.String r12 = "BaseURL"
            boolean r1 = v6.f0.d(r15, r12)
            if (r1 == 0) goto L_0x00b2
            if (r35 != 0) goto L_0x00a9
            long r0 = r14.g(r15, r7)
            java.lang.String r2 = r14.h(r15, r11)
            r3 = 1
            r7 = r0
            r11 = r2
            r35 = 1
            goto L_0x01ed
        L_0x00a9:
            r66 = r7
            r63 = r9
            r87 = r11
            r4 = r13
            goto L_0x1037
        L_0x00b2:
            java.lang.String r1 = "ProgramInformation"
            boolean r2 = v6.f0.d(r15, r1)
            java.lang.String r5 = "lang"
            if (r2 == 0) goto L_0x011a
            java.lang.String r2 = "moreInformationURL"
            java.lang.String r2 = r15.getAttributeValue(r0, r2)
            if (r2 != 0) goto L_0x00c7
            r41 = r0
            goto L_0x00c9
        L_0x00c7:
            r41 = r2
        L_0x00c9:
            java.lang.String r2 = r15.getAttributeValue(r0, r5)
            if (r2 != 0) goto L_0x00d2
            r42 = r0
            goto L_0x00d4
        L_0x00d2:
            r42 = r2
        L_0x00d4:
            r2 = r0
            r3 = r2
        L_0x00d6:
            r134.next()
            java.lang.String r4 = "Title"
            boolean r4 = v6.f0.d(r15, r4)
            if (r4 == 0) goto L_0x00e6
            java.lang.String r0 = r134.nextText()
            goto L_0x0103
        L_0x00e6:
            java.lang.String r4 = "Source"
            boolean r4 = v6.f0.d(r15, r4)
            if (r4 == 0) goto L_0x00f3
            java.lang.String r2 = r134.nextText()
            goto L_0x0103
        L_0x00f3:
            java.lang.String r4 = "Copyright"
            boolean r4 = v6.f0.d(r15, r4)
            if (r4 == 0) goto L_0x0100
            java.lang.String r3 = r134.nextText()
            goto L_0x0103
        L_0x0100:
            e(r134)
        L_0x0103:
            boolean r4 = v6.f0.b(r15, r1)
            if (r4 == 0) goto L_0x00d6
            d6.g r1 = new d6.g
            r37 = r1
            r38 = r0
            r39 = r2
            r40 = r3
            r37.<init>(r38, r39, r40, r41, r42)
            r31 = r1
            goto L_0x01ed
        L_0x011a:
            java.lang.String r1 = "UTCTiming"
            boolean r1 = v6.f0.d(r15, r1)
            java.lang.String r6 = "value"
            java.lang.String r3 = "schemeIdUri"
            if (r1 == 0) goto L_0x0138
            java.lang.String r1 = r15.getAttributeValue(r0, r3)
            java.lang.String r0 = r15.getAttributeValue(r0, r6)
            d6.m r2 = new d6.m
            r3 = 0
            r2.<init>(r1, r0, r3)
            r32 = r2
            goto L_0x01ed
        L_0x0138:
            java.lang.String r0 = "Location"
            boolean r0 = v6.f0.d(r15, r0)
            if (r0 == 0) goto L_0x014a
            java.lang.String r0 = r134.nextText()
            android.net.Uri r34 = android.net.Uri.parse(r0)
            goto L_0x01ed
        L_0x014a:
            java.lang.String r0 = "ServiceDescription"
            boolean r1 = v6.f0.d(r15, r0)
            if (r1 == 0) goto L_0x01fd
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r37 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0167:
            r134.next()
            java.lang.String r12 = "Latency"
            boolean r12 = v6.f0.d(r15, r12)
            r135 = r1
            java.lang.String r1 = "max"
            r33 = r2
            java.lang.String r2 = "min"
            if (r12 == 0) goto L_0x019c
            java.lang.String r3 = "target"
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r37 = o(r15, r3, r4)
            long r2 = o(r15, r2, r4)
            long r4 = o(r15, r1, r4)
            r1 = r135
            r129 = r2
            r2 = r33
            r131 = r4
            r3 = r37
            r5 = r129
            r37 = r131
            goto L_0x01d6
        L_0x019c:
            java.lang.String r12 = "PlaybackRate"
            boolean r12 = v6.f0.d(r15, r12)
            if (r12 == 0) goto L_0x01d2
            r12 = 0
            java.lang.String r2 = r15.getAttributeValue(r12, r2)
            if (r2 != 0) goto L_0x01af
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            goto L_0x01b3
        L_0x01af:
            float r2 = java.lang.Float.parseFloat(r2)
        L_0x01b3:
            java.lang.String r1 = r15.getAttributeValue(r12, r1)
            if (r1 != 0) goto L_0x01c8
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r46 = r2
            r40 = r3
            r42 = r5
            r44 = r37
            r47 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            goto L_0x01e0
        L_0x01c8:
            float r1 = java.lang.Float.parseFloat(r1)
            r129 = r2
            r2 = r1
            r1 = r129
            goto L_0x01d6
        L_0x01d2:
            r1 = r135
            r2 = r33
        L_0x01d6:
            r46 = r1
            r47 = r2
            r40 = r3
            r42 = r5
            r44 = r37
        L_0x01e0:
            boolean r1 = v6.f0.b(r15, r0)
            if (r1 == 0) goto L_0x01f1
            d6.k r33 = new d6.k
            r39 = r33
            r39.<init>(r40, r42, r44, r46, r47)
        L_0x01ed:
            r0 = 0
            r4 = r13
            goto L_0x1041
        L_0x01f1:
            r3 = r40
            r5 = r42
            r37 = r44
            r1 = r46
            r2 = r47
            goto L_0x0167
        L_0x01fd:
            java.lang.String r4 = "Period"
            boolean r0 = v6.f0.d(r15, r4)
            if (r0 == 0) goto L_0x102c
            if (r36 != 0) goto L_0x102c
            java.lang.String r2 = "id"
            r0 = 0
            java.lang.String r38 = r15.getAttributeValue(r0, r2)
            java.lang.String r0 = "start"
            long r39 = l(r15, r0, r9)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r37 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r37 == 0) goto L_0x0220
            long r41 = r16 + r39
            goto L_0x0222
        L_0x0220:
            r41 = r0
        L_0x0222:
            java.lang.String r14 = "duration"
            long r44 = l(r15, r14, r0)
            r135 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r43 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r37 = 0
            r46 = 0
            r47 = 0
            r51 = r3
            r50 = r14
            r48 = r46
            r49 = r47
            r3 = r133
            r46 = r0
            r0 = r11
            r1 = r15
            r14 = r7
        L_0x024b:
            r134.next()
            boolean r52 = v6.f0.d(r1, r12)
            if (r52 == 0) goto L_0x02a9
            if (r37 != 0) goto L_0x0281
            long r14 = r3.g(r1, r14)
            java.lang.String r0 = r3.h(r1, r0)
            r37 = 1
            r52 = 0
            r65 = r5
            r56 = r6
            r66 = r7
            r63 = r9
            r87 = r11
            r83 = r12
            r55 = r13
            r53 = r14
            r59 = r43
            r58 = r50
            r57 = r51
            r14 = r133
            r43 = r135
            r50 = r2
            r2 = r4
            goto L_0x0fa4
        L_0x0281:
            r52 = 0
            r118 = r4
            r65 = r5
            r56 = r6
            r66 = r7
            r63 = r9
            r87 = r11
            r83 = r12
            r55 = r13
            r53 = r14
            r59 = r43
            r58 = r50
            r57 = r51
            r14 = r133
            r43 = r135
            r50 = r2
            r129 = r52
            r52 = r0
            r0 = r129
            goto L_0x0f9c
        L_0x02a9:
            java.lang.String r3 = "AdaptationSet"
            boolean r52 = v6.f0.d(r1, r3)
            r53 = r14
            java.lang.String r14 = "SegmentTemplate"
            java.lang.String r15 = "SegmentList"
            r55 = r13
            java.lang.String r13 = "SegmentBase"
            if (r52 == 0) goto L_0x0d29
            r52 = r0
            r0 = -1
            int r57 = n(r1, r2, r0)
            int r0 = r133.j(r134)
            r56 = r14
            java.lang.String r14 = "mimeType"
            r58 = r0
            r0 = 0
            java.lang.String r59 = r1.getAttributeValue(r0, r14)
            r60 = r11
            java.lang.String r11 = "codecs"
            java.lang.String r61 = r1.getAttributeValue(r0, r11)
            java.lang.String r0 = "width"
            r62 = r3
            r3 = -1
            r63 = r9
            int r9 = n(r1, r0, r3)
            java.lang.String r10 = "height"
            int r3 = n(r1, r10, r3)
            r65 = r4
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = m(r1, r4)
            r66 = r7
            java.lang.String r7 = "audioSamplingRate"
            r8 = -1
            int r8 = n(r1, r7, r8)
            r68 = r6
            r6 = 0
            java.lang.String r69 = r1.getAttributeValue(r6, r5)
            r70 = r15
            java.lang.String r15 = "label"
            java.lang.String r1 = r1.getAttributeValue(r6, r15)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r71 = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r72 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r73 = r13
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r74 = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r75 = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r76 = -1
            r77 = 0
            r78 = 0
            r82 = r0
            r79 = r8
            r80 = r9
            r81 = r10
            r83 = r11
            r84 = r46
            r86 = r48
            r11 = r52
            r9 = r53
            r8 = r58
            r0 = r133
            r58 = r4
            r4 = r69
            r69 = r3
            r3 = r134
        L_0x035b:
            r134.next()
            boolean r87 = v6.f0.d(r3, r12)
            if (r87 == 0) goto L_0x0378
            if (r77 != 0) goto L_0x0372
            long r9 = r0.g(r3, r9)
            java.lang.String r11 = r0.h(r3, r11)
            r77 = 1
            goto L_0x03e1
        L_0x0372:
            r88 = r9
            r87 = r11
            goto L_0x043c
        L_0x0378:
            r87 = r11
            java.lang.String r11 = "ContentProtection"
            boolean r88 = v6.f0.d(r3, r11)
            if (r88 == 0) goto L_0x039a
            android.util.Pair r11 = r133.i(r134)
            r88 = r9
            java.lang.Object r9 = r11.first
            if (r9 == 0) goto L_0x0390
            r78 = r9
            java.lang.String r78 = (java.lang.String) r78
        L_0x0390:
            java.lang.Object r9 = r11.second
            if (r9 == 0) goto L_0x03dd
            c5.f$b r9 = (c5.f.b) r9
            r15.add(r9)
            goto L_0x03dd
        L_0x039a:
            r88 = r9
            java.lang.String r9 = "ContentComponent"
            boolean r9 = v6.f0.d(r3, r9)
            if (r9 == 0) goto L_0x03c0
            r9 = 0
            java.lang.String r9 = r3.getAttributeValue(r9, r5)
            if (r4 != 0) goto L_0x03ad
            r4 = r9
            goto L_0x03b7
        L_0x03ad:
            if (r9 != 0) goto L_0x03b0
            goto L_0x03b7
        L_0x03b0:
            boolean r9 = r4.equals(r9)
            v6.a.d(r9)
        L_0x03b7:
            int r9 = r133.j(r134)
            int r8 = c(r8, r9)
            goto L_0x03dd
        L_0x03c0:
            java.lang.String r9 = "Role"
            boolean r10 = v6.f0.d(r3, r9)
            if (r10 == 0) goto L_0x03d1
            d6.d r9 = k(r3, r9)
            r1.add(r9)
            goto L_0x043c
        L_0x03d1:
            java.lang.String r9 = "AudioChannelConfiguration"
            boolean r10 = v6.f0.d(r3, r9)
            if (r10 == 0) goto L_0x041d
            int r76 = r133.f(r134)
        L_0x03dd:
            r11 = r87
            r9 = r88
        L_0x03e1:
            r112 = r1
            r96 = r2
            r92 = r13
            r95 = r14
            r90 = r15
            r117 = r51
            r87 = r60
            r118 = r65
            r122 = r68
            r51 = r69
            r15 = r70
            r2 = r71
            r1 = r72
            r128 = r73
            r69 = r74
            r71 = r75
            r124 = r79
            r74 = r80
            r79 = r81
            r70 = r82
            r60 = r83
            r14 = r134
            r65 = r5
            r75 = r6
            r73 = r7
            r83 = r12
            r80 = r56
            r5 = r62
            r62 = r58
            goto L_0x0bdb
        L_0x041d:
            java.lang.String r10 = "Accessibility"
            boolean r90 = v6.f0.d(r3, r10)
            if (r90 == 0) goto L_0x042d
            d6.d r9 = k(r3, r10)
            r6.add(r9)
            goto L_0x043c
        L_0x042d:
            java.lang.String r10 = "EssentialProperty"
            boolean r90 = v6.f0.d(r3, r10)
            if (r90 == 0) goto L_0x043f
            d6.d r9 = k(r3, r10)
            r13.add(r9)
        L_0x043c:
            r90 = r15
            goto L_0x0450
        L_0x043f:
            r90 = r15
            java.lang.String r15 = "SupplementalProperty"
            boolean r91 = v6.f0.d(r3, r15)
            if (r91 == 0) goto L_0x0493
            d6.d r9 = k(r3, r15)
            r7.add(r9)
        L_0x0450:
            r112 = r1
            r96 = r2
            r92 = r13
            r95 = r14
            r117 = r51
            r119 = r62
            r118 = r65
            r122 = r68
            r51 = r69
            r15 = r70
            r2 = r71
            r128 = r73
            r69 = r74
            r71 = r75
            r124 = r79
            r74 = r80
            r79 = r81
            r70 = r82
            r98 = r87
            r14 = r134
            r65 = r5
            r75 = r6
            r73 = r7
            r68 = r8
            r80 = r56
            r62 = r58
            r87 = r60
            r60 = r83
            r56 = r0
            r0 = r3
            r58 = r4
            r83 = r12
            r3 = r84
            goto L_0x0bca
        L_0x0493:
            r91 = r15
            java.lang.String r15 = "Representation"
            boolean r92 = v6.f0.d(r3, r15)
            r93 = r15
            java.lang.String r15 = "InbandEventStream"
            if (r92 == 0) goto L_0x0aca
            r92 = r1
            r1 = 0
            r94 = r15
            java.lang.String r15 = r3.getAttributeValue(r1, r2)
            java.lang.String r1 = "bandwidth"
            r96 = r2
            r2 = -1
            int r2 = n(r3, r1, r2)
            r1 = 0
            java.lang.String r95 = r3.getAttributeValue(r1, r14)
            if (r95 != 0) goto L_0x04bd
            r97 = r59
            goto L_0x04bf
        L_0x04bd:
            r97 = r95
        L_0x04bf:
            r129 = r83
            r83 = r11
            r11 = r129
            java.lang.String r1 = r3.getAttributeValue(r1, r11)
            r95 = r14
            if (r1 != 0) goto L_0x04d6
            r1 = r82
            r82 = r10
            r10 = r80
            r80 = r61
            goto L_0x04e0
        L_0x04d6:
            r129 = r80
            r80 = r1
            r1 = r82
            r82 = r10
            r10 = r129
        L_0x04e0:
            int r14 = n(r3, r1, r10)
            r98 = r10
            r10 = r81
            r81 = r14
            r129 = r69
            r69 = r4
            r4 = r129
            int r14 = n(r3, r10, r4)
            r99 = r4
            r4 = r58
            r58 = r14
            float r14 = m(r3, r4)
            r100 = r8
            r8 = r74
            r74 = r10
            r10 = r75
            r75 = r14
            int r14 = n(r3, r8, r10)
            r101 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r102 = r15
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r107 = r15
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>(r13)
            r103 = r15
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>(r7)
            r104 = 0
            r105 = 0
            r112 = r1
            r111 = r2
            r108 = r13
            r109 = r14
            r106 = r15
            r113 = r76
            r1 = r84
            r110 = r86
            r15 = r87
            r13 = r88
        L_0x0540:
            r134.next()
            boolean r114 = v6.f0.d(r3, r12)
            if (r114 == 0) goto L_0x05a4
            if (r104 != 0) goto L_0x0557
            long r13 = r0.g(r3, r13)
            java.lang.String r15 = r0.h(r3, r15)
            r104 = 1
            goto L_0x05ae
        L_0x0557:
            r115 = r13
            r114 = r15
            r117 = r51
            r119 = r62
            r118 = r65
            r122 = r68
            r121 = r69
            r120 = r70
            r123 = r71
            r14 = r73
            r124 = r79
            r51 = r99
            r125 = r100
            r70 = r112
            r15 = r3
            r62 = r4
            r65 = r5
            r68 = r6
            r73 = r7
            r69 = r8
            r71 = r10
            r79 = r74
            r7 = r82
            r3 = r83
            r112 = r92
            r5 = r94
            r74 = r98
            r8 = r103
            r10 = r106
            r6 = r107
            r92 = r108
            r4 = r109
            r82 = r9
            r83 = r12
            r98 = r87
            r9 = r91
            r87 = r60
            r60 = r11
            goto L_0x0768
        L_0x05a4:
            boolean r114 = v6.f0.d(r3, r9)
            if (r114 == 0) goto L_0x05b5
            int r113 = r133.f(r134)
        L_0x05ae:
            r114 = r15
            r15 = r73
            r73 = r4
            goto L_0x05c9
        L_0x05b5:
            r114 = r15
            r15 = r73
            boolean r73 = v6.f0.d(r3, r15)
            if (r73 == 0) goto L_0x0617
            r73 = r4
            r4 = r110
            d6.j$e r4 = (d6.j.e) r4
            d6.j$e r110 = r0.t(r3, r4)
        L_0x05c9:
            r115 = r13
            r14 = r15
            r117 = r51
            r119 = r62
            r118 = r65
            r122 = r68
            r121 = r69
            r120 = r70
            r123 = r71
            r62 = r73
            r124 = r79
            r51 = r99
            r125 = r100
            r4 = r109
            r70 = r112
            r0 = r113
            r15 = r3
            r65 = r5
            r68 = r6
            r73 = r7
            r69 = r8
            r71 = r10
            r79 = r74
            r7 = r82
            r3 = r83
            r112 = r92
            r5 = r94
            r74 = r98
            r8 = r103
            r10 = r106
            r6 = r107
            r92 = r108
            r82 = r9
            r83 = r12
            r98 = r87
            r9 = r91
            r87 = r60
            r60 = r11
            r11 = r93
            goto L_0x076c
        L_0x0617:
            r73 = r4
            r4 = r70
            boolean r70 = v6.f0.d(r3, r4)
            if (r70 == 0) goto L_0x0685
            long r115 = r0.g(r3, r1)
            r2 = r110
            d6.j$b r2 = (d6.j.b) r2
            r70 = r112
            r0 = r133
            r112 = r92
            r1 = r134
            r92 = r15
            r15 = r111
            r120 = r4
            r117 = r51
            r119 = r62
            r118 = r65
            r121 = r69
            r62 = r73
            r51 = r99
            r15 = r3
            r3 = r41
            r65 = r5
            r122 = r68
            r123 = r71
            r68 = r6
            r5 = r44
            r73 = r7
            r69 = r8
            r71 = r10
            r124 = r79
            r10 = r100
            r7 = r13
            r125 = r10
            r79 = r74
            r126 = r82
            r74 = r98
            r82 = r9
            r9 = r115
            r127 = r83
            r98 = r87
            r83 = r12
            r87 = r60
            r60 = r11
            r11 = r25
            d6.j$b r110 = r0.u(r1, r2, r3, r5, r7, r9, r11)
            r4 = r109
            r1 = r115
            r3 = r127
            r115 = r13
            r14 = r92
            r92 = r108
            goto L_0x071a
        L_0x0685:
            r120 = r4
            r117 = r51
            r119 = r62
            r118 = r65
            r122 = r68
            r121 = r69
            r123 = r71
            r62 = r73
            r124 = r79
            r126 = r82
            r127 = r83
            r51 = r99
            r125 = r100
            r70 = r112
            r65 = r5
            r68 = r6
            r73 = r7
            r69 = r8
            r82 = r9
            r71 = r10
            r83 = r12
            r12 = r56
            r79 = r74
            r112 = r92
            r74 = r98
            r92 = r15
            r98 = r87
            r15 = r3
            r87 = r60
            r60 = r11
            boolean r3 = v6.f0.d(r15, r12)
            if (r3 == 0) goto L_0x06f0
            long r99 = r0.g(r15, r1)
            r2 = r110
            d6.j$c r2 = (d6.j.c) r2
            r0 = r133
            r1 = r134
            r3 = r73
            r4 = r41
            r6 = r44
            r8 = r13
            r10 = r99
            r56 = r12
            r115 = r13
            r14 = r92
            r92 = r108
            r12 = r25
            d6.j$c r110 = r0.v(r1, r2, r3, r4, r6, r8, r10, r12)
            r1 = r99
            r4 = r109
            r3 = r127
            goto L_0x071a
        L_0x06f0:
            r56 = r12
            r115 = r13
            r14 = r92
            r92 = r108
            r3 = r127
            boolean r0 = v6.f0.d(r15, r3)
            if (r0 == 0) goto L_0x071f
            android.util.Pair r0 = r133.i(r134)
            java.lang.Object r4 = r0.first
            if (r4 == 0) goto L_0x070c
            r105 = r4
            java.lang.String r105 = (java.lang.String) r105
        L_0x070c:
            java.lang.Object r0 = r0.second
            if (r0 == 0) goto L_0x0718
            c5.f$b r0 = (c5.f.b) r0
            r4 = r109
            r4.add(r0)
            goto L_0x071a
        L_0x0718:
            r4 = r109
        L_0x071a:
            r5 = r94
            r6 = r107
            goto L_0x0732
        L_0x071f:
            r5 = r94
            r4 = r109
            boolean r0 = v6.f0.d(r15, r5)
            if (r0 == 0) goto L_0x0737
            d6.d r0 = k(r15, r5)
            r6 = r107
            r6.add(r0)
        L_0x0732:
            r8 = r103
            r7 = r126
            goto L_0x074a
        L_0x0737:
            r6 = r107
            r7 = r126
            boolean r0 = v6.f0.d(r15, r7)
            if (r0 == 0) goto L_0x074f
            d6.d r0 = k(r15, r7)
            r8 = r103
            r8.add(r0)
        L_0x074a:
            r9 = r91
            r10 = r106
            goto L_0x0768
        L_0x074f:
            r9 = r91
            r8 = r103
            boolean r0 = v6.f0.d(r15, r9)
            if (r0 == 0) goto L_0x0763
            d6.d r0 = k(r15, r9)
            r10 = r106
            r10.add(r0)
            goto L_0x0768
        L_0x0763:
            r10 = r106
            e(r134)
        L_0x0768:
            r11 = r93
            r0 = r113
        L_0x076c:
            boolean r12 = v6.f0.b(r15, r11)
            if (r12 == 0) goto L_0x0a6c
            boolean r1 = v6.s.k(r97)
            if (r1 == 0) goto L_0x077d
            java.lang.String r1 = v6.s.b(r80)
            goto L_0x0787
        L_0x077d:
            boolean r1 = v6.s.m(r97)
            if (r1 == 0) goto L_0x078c
            java.lang.String r1 = v6.s.j(r80)
        L_0x0787:
            r13 = r80
            r12 = r97
            goto L_0x07de
        L_0x078c:
            boolean r1 = v6.s.l(r97)
            if (r1 == 0) goto L_0x07bf
            java.lang.String r1 = "application/x-rawcc"
            r12 = r97
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x07bb
            r13 = r80
            if (r13 != 0) goto L_0x07a1
            goto L_0x07da
        L_0x07a1:
            java.lang.String[] r1 = v6.e0.T(r13)
            int r2 = r1.length
            r3 = 0
        L_0x07a7:
            if (r3 >= r2) goto L_0x07da
            r5 = r1[r3]
            java.lang.String r97 = v6.s.e(r5)
            if (r97 == 0) goto L_0x07b8
            boolean r5 = v6.s.l(r97)
            if (r5 == 0) goto L_0x07b8
            goto L_0x07dc
        L_0x07b8:
            int r3 = r3 + 1
            goto L_0x07a7
        L_0x07bb:
            r13 = r80
            r1 = r12
            goto L_0x07de
        L_0x07bf:
            r13 = r80
            r12 = r97
            java.lang.String r1 = "application/mp4"
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x07da
            java.lang.String r1 = v6.s.e(r13)
            java.lang.String r2 = "text/vtt"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x07de
            java.lang.String r97 = "application/x-mp4-vtt"
            goto L_0x07dc
        L_0x07da:
            r97 = 0
        L_0x07dc:
            r1 = r97
        L_0x07de:
            java.lang.String r2 = "audio/eac3"
            boolean r3 = r2.equals(r1)
            if (r3 == 0) goto L_0x0820
            r1 = 0
        L_0x07e7:
            int r3 = r10.size()
            if (r1 >= r3) goto L_0x081f
            java.lang.Object r3 = r10.get(r1)
            d6.d r3 = (d6.d) r3
            java.lang.String r5 = r3.f13102a
            java.lang.String r7 = "tag:dolby.com,2018:dash:EC3_ExtensionType:2018"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x0807
            java.lang.String r7 = r3.f13103b
            java.lang.String r9 = "JOC"
            boolean r7 = r9.equals(r7)
            if (r7 != 0) goto L_0x0819
        L_0x0807:
            java.lang.String r7 = "tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x081c
            java.lang.String r3 = r3.f13103b
            java.lang.String r5 = "ec+3"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x081c
        L_0x0819:
            java.lang.String r1 = "audio/eac3-joc"
            goto L_0x0820
        L_0x081c:
            int r1 = r1 + 1
            goto L_0x07e7
        L_0x081f:
            r1 = r2
        L_0x0820:
            r2 = 0
            r3 = 0
        L_0x0822:
            int r5 = r112.size()
            java.lang.String r7 = "urn:mpeg:dash:role:2011"
            if (r2 >= r5) goto L_0x085a
            r15 = r112
            java.lang.Object r5 = r15.get(r2)
            d6.d r5 = (d6.d) r5
            java.lang.String r9 = r5.f13102a
            boolean r7 = e.a.e(r7, r9)
            if (r7 == 0) goto L_0x0855
            java.lang.String r5 = r5.f13103b
            if (r5 != 0) goto L_0x083f
            goto L_0x084f
        L_0x083f:
            java.lang.String r7 = "forced_subtitle"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L_0x0853
            java.lang.String r7 = "main"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x0851
        L_0x084f:
            r5 = 0
            goto L_0x0854
        L_0x0851:
            r5 = 1
            goto L_0x0854
        L_0x0853:
            r5 = 2
        L_0x0854:
            r3 = r3 | r5
        L_0x0855:
            int r2 = r2 + 1
            r112 = r15
            goto L_0x0822
        L_0x085a:
            r15 = r112
            r2 = 0
            r5 = 0
        L_0x085e:
            int r9 = r15.size()
            if (r2 >= r9) goto L_0x088d
            java.lang.Object r9 = r15.get(r2)
            d6.d r9 = (d6.d) r9
            java.lang.String r11 = r9.f13102a
            boolean r11 = e.a.e(r7, r11)
            if (r11 == 0) goto L_0x0880
            java.lang.String r9 = r9.f13103b
            r11 = r133
            r112 = r15
            r15 = r135
            int r9 = r11.r(r9)
            r5 = r5 | r9
            goto L_0x0886
        L_0x0880:
            r11 = r133
            r112 = r15
            r15 = r135
        L_0x0886:
            int r2 = r2 + 1
            r135 = r15
            r15 = r112
            goto L_0x085e
        L_0x088d:
            r11 = r133
            r112 = r15
            r15 = r135
            r2 = 0
            r9 = 0
        L_0x0895:
            int r15 = r68.size()
            if (r2 >= r15) goto L_0x0937
            r15 = r68
            java.lang.Object r68 = r15.get(r2)
            r80 = r14
            r14 = r68
            d6.d r14 = (d6.d) r14
            r107 = r6
            java.lang.String r6 = r14.f13102a
            boolean r6 = e.a.e(r7, r6)
            if (r6 == 0) goto L_0x08bc
            java.lang.String r6 = r14.f13103b
            int r6 = r11.r(r6)
            r9 = r9 | r6
            r68 = r7
            goto L_0x092b
        L_0x08bc:
            java.lang.String r6 = r14.f13102a
            r68 = r7
            java.lang.String r7 = "urn:tva:metadata:cs:AudioPurposeCS:2007"
            boolean r6 = e.a.e(r7, r6)
            if (r6 == 0) goto L_0x092b
            java.lang.String r6 = r14.f13103b
            if (r6 != 0) goto L_0x08cd
            goto L_0x091b
        L_0x08cd:
            int r7 = r6.hashCode()
            r14 = 3
            switch(r7) {
                case 49: goto L_0x0902;
                case 50: goto L_0x08f7;
                case 51: goto L_0x08ec;
                case 52: goto L_0x08e1;
                case 53: goto L_0x08d5;
                case 54: goto L_0x08d6;
                default: goto L_0x08d5;
            }
        L_0x08d5:
            goto L_0x090d
        L_0x08d6:
            java.lang.String r7 = "6"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x08df
            goto L_0x090d
        L_0x08df:
            r6 = 4
            goto L_0x090e
        L_0x08e1:
            java.lang.String r7 = "4"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x08ea
            goto L_0x090d
        L_0x08ea:
            r6 = 3
            goto L_0x090e
        L_0x08ec:
            java.lang.String r7 = "3"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x08f5
            goto L_0x090d
        L_0x08f5:
            r6 = 2
            goto L_0x090e
        L_0x08f7:
            java.lang.String r7 = "2"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0900
            goto L_0x090d
        L_0x0900:
            r6 = 1
            goto L_0x090e
        L_0x0902:
            java.lang.String r7 = "1"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x090b
            goto L_0x090d
        L_0x090b:
            r6 = 0
            goto L_0x090e
        L_0x090d:
            r6 = -1
        L_0x090e:
            if (r6 == 0) goto L_0x0927
            r7 = 1
            if (r6 == r7) goto L_0x0924
            r7 = 2
            if (r6 == r7) goto L_0x0922
            if (r6 == r14) goto L_0x091f
            r7 = 4
            if (r6 == r7) goto L_0x091d
        L_0x091b:
            r6 = 0
            goto L_0x0929
        L_0x091d:
            r6 = 1
            goto L_0x0929
        L_0x091f:
            r6 = 8
            goto L_0x0929
        L_0x0922:
            r6 = 4
            goto L_0x0929
        L_0x0924:
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0929
        L_0x0927:
            r6 = 512(0x200, float:7.175E-43)
        L_0x0929:
            r6 = r6 | r9
            r9 = r6
        L_0x092b:
            int r2 = r2 + 1
            r7 = r68
            r14 = r80
            r6 = r107
            r68 = r15
            goto L_0x0895
        L_0x0937:
            r107 = r6
            r80 = r14
            r15 = r68
            r2 = r5 | r9
            int r5 = r11.s(r8)
            r2 = r2 | r5
            int r5 = r11.s(r10)
            r2 = r2 | r5
            x4.b0$b r5 = new x4.b0$b
            r5.<init>()
            r6 = r102
            r5.f27415a = r6
            r5.f27424j = r12
            r5.f27425k = r1
            r5.f27422h = r13
            r14 = r111
            r5.f27421g = r14
            r5.f27418d = r3
            r5.f27419e = r2
            r2 = r121
            r5.f27417c = r2
            boolean r3 = v6.s.m(r1)
            if (r3 == 0) goto L_0x0978
            r3 = r81
            r5.f27430p = r3
            r0 = r58
            r5.f27431q = r0
            r0 = r75
            r5.f27432r = r0
            goto L_0x0a2d
        L_0x0978:
            boolean r3 = v6.s.k(r1)
            if (r3 == 0) goto L_0x0986
            r5.f27438x = r0
            r0 = r101
            r5.f27439y = r0
            goto L_0x0a2d
        L_0x0986:
            boolean r0 = v6.s.l(r1)
            if (r0 == 0) goto L_0x0a2d
            java.lang.String r0 = "application/cea-608"
            boolean r0 = r0.equals(r1)
            java.lang.String r3 = "MpdParser"
            if (r0 == 0) goto L_0x09dc
            r0 = 0
        L_0x0997:
            int r1 = r15.size()
            if (r0 >= r1) goto L_0x0a2a
            java.lang.Object r1 = r15.get(r0)
            d6.d r1 = (d6.d) r1
            java.lang.String r6 = r1.f13102a
            java.lang.String r7 = "urn:scte:dash:cc:cea-608:2015"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x09d9
            java.lang.String r6 = r1.f13103b
            if (r6 == 0) goto L_0x09d9
            java.util.regex.Pattern r7 = f13091c
            java.util.regex.Matcher r6 = r7.matcher(r6)
            boolean r7 = r6.matches()
            if (r7 == 0) goto L_0x09c7
            r0 = 1
            java.lang.String r0 = r6.group(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            goto L_0x0a2b
        L_0x09c7:
            java.lang.String r6 = "Unable to parse CEA-608 channel number from: "
            java.lang.StringBuilder r6 = android.support.v4.media.a.a(r6)
            java.lang.String r1 = r1.f13103b
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            android.util.Log.w(r3, r1)
        L_0x09d9:
            int r0 = r0 + 1
            goto L_0x0997
        L_0x09dc:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0a2a
            r0 = 0
        L_0x09e5:
            int r1 = r15.size()
            if (r0 >= r1) goto L_0x0a2a
            java.lang.Object r1 = r15.get(r0)
            d6.d r1 = (d6.d) r1
            java.lang.String r6 = r1.f13102a
            java.lang.String r7 = "urn:scte:dash:cc:cea-708:2015"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0a27
            java.lang.String r6 = r1.f13103b
            if (r6 == 0) goto L_0x0a27
            java.util.regex.Pattern r7 = f13092d
            java.util.regex.Matcher r6 = r7.matcher(r6)
            boolean r7 = r6.matches()
            if (r7 == 0) goto L_0x0a15
            r0 = 1
            java.lang.String r0 = r6.group(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            goto L_0x0a2b
        L_0x0a15:
            java.lang.String r6 = "Unable to parse CEA-708 service block number from: "
            java.lang.StringBuilder r6 = android.support.v4.media.a.a(r6)
            java.lang.String r1 = r1.f13103b
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            android.util.Log.w(r3, r1)
        L_0x0a27:
            int r0 = r0 + 1
            goto L_0x09e5
        L_0x0a2a:
            r0 = -1
        L_0x0a2b:
            r5.C = r0
        L_0x0a2d:
            x4.b0 r0 = r5.a()
            if (r110 == 0) goto L_0x0a36
            r104 = r110
            goto L_0x0a3d
        L_0x0a36:
            d6.j$e r1 = new d6.j$e
            r1.<init>()
            r104 = r1
        L_0x0a3d:
            d6.c$a r1 = new d6.c$a
            r108 = -1
            r101 = r1
            r102 = r0
            r103 = r114
            r106 = r4
            r101.<init>(r102, r103, r104, r105, r106, r107, r108)
            java.lang.String r0 = r0.f27408t
            int r0 = v6.s.i(r0)
            r3 = r125
            int r8 = c(r3, r0)
            r0 = r124
            r0.add(r1)
            r14 = r134
            r58 = r2
            r0 = r11
            r75 = r15
            r128 = r80
            r15 = r120
            r80 = r56
            goto L_0x0b8c
        L_0x0a6c:
            r107 = r6
            r15 = r68
            r91 = r75
            r13 = r80
            r80 = r14
            r14 = r133
            r113 = r0
            r109 = r4
            r94 = r5
            r103 = r8
            r106 = r10
            r93 = r11
            r0 = r14
            r6 = r15
            r99 = r51
            r11 = r60
            r4 = r62
            r5 = r65
            r8 = r69
            r10 = r71
            r12 = r83
            r60 = r87
            r108 = r92
            r87 = r98
            r92 = r112
            r15 = r114
            r51 = r117
            r65 = r118
            r62 = r119
            r69 = r121
            r68 = r122
            r71 = r123
            r100 = r125
            r83 = r3
            r91 = r9
            r112 = r70
            r98 = r74
            r74 = r79
            r9 = r82
            r70 = r120
            r79 = r124
            r3 = r134
            r82 = r7
            r7 = r73
            r73 = r80
            r80 = r13
            r13 = r115
            goto L_0x0540
        L_0x0aca:
            r112 = r1
            r96 = r2
            r92 = r13
            r95 = r14
            r117 = r51
            r119 = r62
            r118 = r65
            r122 = r68
            r51 = r69
            r120 = r70
            r123 = r71
            r1 = r73
            r69 = r74
            r71 = r75
            r124 = r79
            r74 = r80
            r79 = r81
            r70 = r82
            r98 = r87
            r14 = r133
            r2 = r134
            r65 = r5
            r73 = r7
            r68 = r8
            r5 = r15
            r62 = r58
            r87 = r60
            r60 = r83
            r58 = r4
            r15 = r6
            r83 = r12
            boolean r3 = v6.f0.d(r2, r1)
            if (r3 == 0) goto L_0x0b21
            r3 = r86
            d6.j$e r3 = (d6.j.e) r3
            d6.j$e r3 = r0.t(r2, r3)
            r128 = r1
            r14 = r2
            r75 = r15
            r80 = r56
            r15 = r120
            r56 = r0
            goto L_0x0b86
        L_0x0b21:
            r13 = r120
            boolean r3 = v6.f0.d(r2, r13)
            if (r3 == 0) goto L_0x0b55
            r3 = r84
            long r84 = r0.g(r2, r3)
            r3 = r86
            d6.j$b r3 = (d6.j.b) r3
            r11 = r0
            r0 = r133
            r12 = r1
            r1 = r134
            r9 = r2
            r2 = r3
            r3 = r41
            r5 = r44
            r7 = r88
            r14 = r9
            r9 = r84
            r128 = r12
            r75 = r15
            r15 = r11
            r11 = r25
            d6.j$b r3 = r0.u(r1, r2, r3, r5, r7, r9, r11)
            r80 = r56
            r56 = r15
            r15 = r13
            goto L_0x0b86
        L_0x0b55:
            r128 = r1
            r14 = r2
            r75 = r15
            r12 = r56
            r3 = r84
            r15 = r0
            boolean r0 = v6.f0.d(r14, r12)
            if (r0 == 0) goto L_0x0b9a
            long r84 = r15.g(r14, r3)
            r2 = r86
            d6.j$c r2 = (d6.j.c) r2
            r0 = r133
            r1 = r134
            r3 = r73
            r4 = r41
            r6 = r44
            r8 = r88
            r10 = r84
            r80 = r12
            r56 = r15
            r15 = r13
            r12 = r25
            d6.j$c r3 = r0.v(r1, r2, r3, r4, r6, r8, r10, r12)
        L_0x0b86:
            r86 = r3
            r0 = r56
            r8 = r68
        L_0x0b8c:
            r3 = r14
            r4 = r58
            r1 = r72
            r9 = r88
            r11 = r98
            r5 = r119
            r2 = r123
            goto L_0x0bdb
        L_0x0b9a:
            r80 = r12
            r56 = r15
            r15 = r13
            boolean r0 = v6.f0.d(r14, r5)
            if (r0 == 0) goto L_0x0baf
            d6.d r0 = k(r14, r5)
            r2 = r123
            r2.add(r0)
            goto L_0x0bc9
        L_0x0baf:
            r2 = r123
            java.lang.String r0 = "Label"
            boolean r1 = v6.f0.d(r14, r0)
            if (r1 == 0) goto L_0x0bc0
            java.lang.String r0 = x(r14, r0)
            r72 = r0
            goto L_0x0bc9
        L_0x0bc0:
            boolean r0 = v6.f0.c(r134)
            if (r0 == 0) goto L_0x0bc9
            e(r134)
        L_0x0bc9:
            r0 = r14
        L_0x0bca:
            r84 = r3
            r4 = r58
            r8 = r68
            r1 = r72
            r9 = r88
            r11 = r98
            r5 = r119
            r3 = r0
            r0 = r56
        L_0x0bdb:
            boolean r6 = v6.f0.b(r3, r5)
            if (r6 == 0) goto L_0x0ced
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r124.size()
            r0.<init>(r3)
            r3 = 0
        L_0x0beb:
            int r4 = r124.size()
            if (r3 >= r4) goto L_0x0ccc
            r6 = r124
            java.lang.Object r4 = r6.get(r3)
            d6.c$a r4 = (d6.c.a) r4
            x4.b0 r5 = r4.f13095a
            x4.b0$b r5 = r5.a()
            if (r1 == 0) goto L_0x0c03
            r5.f27416b = r1
        L_0x0c03:
            java.lang.String r7 = r4.f13098d
            if (r7 != 0) goto L_0x0c09
            r7 = r78
        L_0x0c09:
            java.util.ArrayList<c5.f$b> r9 = r4.f13099e
            r12 = r90
            r9.addAll(r12)
            boolean r10 = r9.isEmpty()
            if (r10 != 0) goto L_0x0c77
            int r10 = r9.size()
            int r10 = r10 + -1
        L_0x0c1c:
            if (r10 < 0) goto L_0x0c64
            java.lang.Object r11 = r9.get(r10)
            c5.f$b r11 = (c5.f.b) r11
            boolean r13 = r11.a()
            if (r13 != 0) goto L_0x0c5d
            r13 = 0
        L_0x0c2b:
            int r15 = r9.size()
            if (r13 >= r15) goto L_0x0c5d
            java.lang.Object r15 = r9.get(r13)
            c5.f$b r15 = (c5.f.b) r15
            boolean r51 = r15.a()
            if (r51 == 0) goto L_0x0c4f
            boolean r51 = r11.a()
            if (r51 != 0) goto L_0x0c4f
            r56 = r1
            java.util.UUID r1 = r11.f4320b
            boolean r1 = r15.b(r1)
            if (r1 == 0) goto L_0x0c51
            r1 = 1
            goto L_0x0c52
        L_0x0c4f:
            r56 = r1
        L_0x0c51:
            r1 = 0
        L_0x0c52:
            if (r1 == 0) goto L_0x0c58
            r9.remove(r10)
            goto L_0x0c5f
        L_0x0c58:
            int r13 = r13 + 1
            r1 = r56
            goto L_0x0c2b
        L_0x0c5d:
            r56 = r1
        L_0x0c5f:
            int r10 = r10 + -1
            r1 = r56
            goto L_0x0c1c
        L_0x0c64:
            r56 = r1
            c5.f r1 = new c5.f
            r10 = 0
            c5.f$b[] r11 = new c5.f.b[r10]
            java.lang.Object[] r9 = r9.toArray(r11)
            c5.f$b[] r9 = (c5.f.b[]) r9
            r1.<init>(r7, r10, r9)
            r5.f27428n = r1
            goto L_0x0c79
        L_0x0c77:
            r56 = r1
        L_0x0c79:
            java.util.ArrayList<d6.d> r1 = r4.f13100f
            r1.addAll(r2)
            long r9 = r4.f13101g
            x4.b0 r100 = r5.a()
            java.lang.String r5 = r4.f13096b
            d6.j r4 = r4.f13097c
            boolean r7 = r4 instanceof d6.j.e
            if (r7 == 0) goto L_0x0ca2
            d6.i$c r7 = new d6.i$c
            r102 = r4
            d6.j$e r102 = (d6.j.e) r102
            r105 = -1
            r104 = 0
            r97 = r7
            r98 = r9
            r101 = r5
            r103 = r1
            r97.<init>(r98, r100, r101, r102, r103, r104, r105)
            goto L_0x0cb7
        L_0x0ca2:
            boolean r7 = r4 instanceof d6.j.a
            if (r7 == 0) goto L_0x0cc4
            d6.i$b r7 = new d6.i$b
            r102 = r4
            d6.j$a r102 = (d6.j.a) r102
            r97 = r7
            r98 = r9
            r101 = r5
            r103 = r1
            r97.<init>(r98, r100, r101, r102, r103)
        L_0x0cb7:
            r0.add(r7)
            int r3 = r3 + 1
            r124 = r6
            r90 = r12
            r1 = r56
            goto L_0x0beb
        L_0x0cc4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "segmentBase must be of type SingleSegmentBase or MultiSegmentBase"
            r0.<init>(r1)
            throw r0
        L_0x0ccc:
            d6.a r1 = new d6.a
            r56 = r1
            r58 = r8
            r59 = r0
            r60 = r75
            r61 = r92
            r62 = r73
            r56.<init>(r57, r58, r59, r60, r61, r62)
            r13 = r43
            r13.add(r1)
            r43 = r135
            r1 = r14
            r11 = r50
            r15 = r96
            r12 = r122
            goto L_0x0ee5
        L_0x0ced:
            r56 = r1
            r72 = r56
            r58 = r62
            r82 = r70
            r7 = r73
            r6 = r75
            r81 = r79
            r56 = r80
            r12 = r83
            r13 = r92
            r14 = r95
            r1 = r112
            r68 = r122
            r79 = r124
            r73 = r128
            r62 = r5
            r70 = r15
            r83 = r60
            r5 = r65
            r75 = r71
            r80 = r74
            r60 = r87
            r15 = r90
            r65 = r118
            r71 = r2
            r74 = r69
            r2 = r96
            r69 = r51
            r51 = r117
            goto L_0x035b
        L_0x0d29:
            r52 = r0
            r96 = r2
            r118 = r4
            r65 = r5
            r122 = r6
            r66 = r7
            r63 = r9
            r87 = r11
            r83 = r12
            r128 = r13
            r80 = r14
            r13 = r43
            r117 = r51
            r14 = r134
            java.lang.String r0 = "EventStream"
            boolean r2 = v6.f0.d(r1, r0)
            if (r2 == 0) goto L_0x0efa
            r2 = 0
            r11 = r117
            java.lang.String r3 = r1.getAttributeValue(r2, r11)
            java.lang.String r4 = ""
            if (r3 != 0) goto L_0x0d5b
            r57 = r4
            goto L_0x0d5d
        L_0x0d5b:
            r57 = r3
        L_0x0d5d:
            r12 = r122
            java.lang.String r2 = r1.getAttributeValue(r2, r12)
            if (r2 != 0) goto L_0x0d68
            r58 = r4
            goto L_0x0d6a
        L_0x0d68:
            r58 = r2
        L_0x0d6a:
            r2 = 1
            java.lang.String r4 = "timescale"
            long r59 = o(r1, r4, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r4 = 512(0x200, float:7.175E-43)
            r3.<init>(r4)
        L_0x0d7e:
            r134.next()
            java.lang.String r4 = "Event"
            boolean r5 = v6.f0.d(r1, r4)
            if (r5 == 0) goto L_0x0e9a
            r5 = 0
            r15 = r96
            long r73 = o(r1, r15, r5)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = r135
            long r5 = o(r1, r9, r5)
            java.lang.String r7 = "presentationTime"
            r8 = 0
            long r61 = o(r1, r7, r8)
            r7 = 1000(0x3e8, double:4.94E-321)
            r43 = r135
            r9 = r59
            long r71 = v6.e0.P(r5, r7, r9)
            r7 = 1000000(0xf4240, double:4.940656E-318)
            r5 = r61
            long r5 = v6.e0.P(r5, r7, r9)
            java.lang.String r7 = "messageData"
            r8 = 0
            java.lang.String r7 = r1.getAttributeValue(r8, r7)
            if (r7 != 0) goto L_0x0dc1
            r7 = 0
        L_0x0dc1:
            r3.reset()
            org.xmlpull.v1.XmlSerializer r8 = android.util.Xml.newSerializer()
            java.nio.charset.Charset r9 = aa.c.f178c
            java.lang.String r9 = r9.name()
            r8.setOutput(r3, r9)
            r134.nextToken()
        L_0x0dd4:
            boolean r9 = v6.f0.b(r1, r4)
            if (r9 != 0) goto L_0x0e71
            int r9 = r134.getEventType()
            switch(r9) {
                case 0: goto L_0x0e5e;
                case 1: goto L_0x0e56;
                case 2: goto L_0x0e2a;
                case 3: goto L_0x0e1e;
                case 4: goto L_0x0e12;
                case 5: goto L_0x0e0a;
                case 6: goto L_0x0e02;
                case 7: goto L_0x0dfa;
                case 8: goto L_0x0df2;
                case 9: goto L_0x0dea;
                case 10: goto L_0x0de2;
                default: goto L_0x0de1;
            }
        L_0x0de1:
            goto L_0x0e19
        L_0x0de2:
            java.lang.String r9 = r134.getText()
            r8.docdecl(r9)
            goto L_0x0e19
        L_0x0dea:
            java.lang.String r9 = r134.getText()
            r8.comment(r9)
            goto L_0x0e19
        L_0x0df2:
            java.lang.String r9 = r134.getText()
            r8.processingInstruction(r9)
            goto L_0x0e19
        L_0x0dfa:
            java.lang.String r9 = r134.getText()
            r8.ignorableWhitespace(r9)
            goto L_0x0e19
        L_0x0e02:
            java.lang.String r9 = r134.getText()
            r8.entityRef(r9)
            goto L_0x0e19
        L_0x0e0a:
            java.lang.String r9 = r134.getText()
            r8.cdsect(r9)
            goto L_0x0e19
        L_0x0e12:
            java.lang.String r9 = r134.getText()
            r8.text(r9)
        L_0x0e19:
            r135 = r4
            r117 = r11
            goto L_0x0e68
        L_0x0e1e:
            java.lang.String r9 = r134.getNamespace()
            java.lang.String r10 = r134.getName()
            r8.endTag(r9, r10)
            goto L_0x0e19
        L_0x0e2a:
            java.lang.String r9 = r134.getNamespace()
            java.lang.String r10 = r134.getName()
            r8.startTag(r9, r10)
            r9 = 0
        L_0x0e36:
            int r10 = r134.getAttributeCount()
            if (r9 >= r10) goto L_0x0e19
            java.lang.String r10 = r1.getAttributeNamespace(r9)
            r135 = r4
            java.lang.String r4 = r1.getAttributeName(r9)
            r117 = r11
            java.lang.String r11 = r1.getAttributeValue(r9)
            r8.attribute(r10, r4, r11)
            int r9 = r9 + 1
            r4 = r135
            r11 = r117
            goto L_0x0e36
        L_0x0e56:
            r135 = r4
            r117 = r11
            r8.endDocument()
            goto L_0x0e68
        L_0x0e5e:
            r135 = r4
            r117 = r11
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r9 = 0
            r8.startDocument(r9, r4)
        L_0x0e68:
            r134.nextToken()
            r4 = r135
            r11 = r117
            goto L_0x0dd4
        L_0x0e71:
            r117 = r11
            r8.flush()
            byte[] r4 = r3.toByteArray()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            if (r7 != 0) goto L_0x0e81
            goto L_0x0e85
        L_0x0e81:
            byte[] r4 = v6.e0.D(r7)
        L_0x0e85:
            r75 = r4
            s5.a r4 = new s5.a
            r68 = r4
            r69 = r57
            r70 = r58
            r68.<init>(r69, r70, r71, r73, r75)
            android.util.Pair r4 = android.util.Pair.create(r5, r4)
            r2.add(r4)
            goto L_0x0ea3
        L_0x0e9a:
            r43 = r135
            r117 = r11
            r15 = r96
            e(r134)
        L_0x0ea3:
            boolean r4 = v6.f0.b(r1, r0)
            if (r4 == 0) goto L_0x0ef2
            int r0 = r2.size()
            long[] r0 = new long[r0]
            int r3 = r2.size()
            s5.a[] r3 = new s5.a[r3]
            r4 = 0
        L_0x0eb6:
            int r5 = r2.size()
            if (r4 >= r5) goto L_0x0ed5
            java.lang.Object r5 = r2.get(r4)
            android.util.Pair r5 = (android.util.Pair) r5
            java.lang.Object r6 = r5.first
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            r0[r4] = r6
            java.lang.Object r5 = r5.second
            s5.a r5 = (s5.a) r5
            r3[r4] = r5
            int r4 = r4 + 1
            goto L_0x0eb6
        L_0x0ed5:
            d6.e r2 = new d6.e
            r56 = r2
            r61 = r0
            r62 = r3
            r56.<init>(r57, r58, r59, r61, r62)
            r11 = r50
            r11.add(r2)
        L_0x0ee5:
            r0 = 0
            r3 = r133
            r14 = r3
            r58 = r11
            r56 = r12
            r59 = r13
            r50 = r15
            goto L_0x0f1b
        L_0x0ef2:
            r96 = r15
            r135 = r43
            r11 = r117
            goto L_0x0d7e
        L_0x0efa:
            r43 = r135
            r11 = r50
            r50 = r96
            r12 = r122
            r4 = r128
            boolean r0 = v6.f0.d(r1, r4)
            if (r0 == 0) goto L_0x0f1f
            r0 = 0
            r9 = r14
            r14 = r133
            d6.j$e r2 = r14.t(r1, r0)
            r48 = r2
            r58 = r11
            r56 = r12
            r59 = r13
            r3 = r14
        L_0x0f1b:
            r57 = r117
            goto L_0x0f9c
        L_0x0f1f:
            r9 = r14
            r14 = r133
            r51 = 0
            boolean r0 = v6.f0.d(r1, r15)
            if (r0 == 0) goto L_0x0f52
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r46 = r14.g(r1, r2)
            r2 = 0
            r0 = r133
            r15 = r1
            r1 = r134
            r3 = r41
            r5 = r44
            r7 = r53
            r9 = r46
            r58 = r11
            r56 = r12
            r57 = r117
            r11 = r25
            d6.j$b r0 = r0.u(r1, r2, r3, r5, r7, r9, r11)
            r48 = r0
            r59 = r13
            goto L_0x0f98
        L_0x0f52:
            r15 = r1
            r58 = r11
            r56 = r12
            r0 = r80
            r57 = r117
            boolean r0 = v6.f0.d(r15, r0)
            if (r0 == 0) goto L_0x0f86
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r46 = r14.g(r15, r0)
            r2 = 0
            ba.a<java.lang.Object> r0 = ba.s.f3795b
            ba.s<java.lang.Object> r3 = ba.o0.f3765e
            r0 = r133
            r1 = r134
            r4 = r41
            r6 = r44
            r8 = r53
            r10 = r46
            r59 = r13
            r12 = r25
            d6.j$c r0 = r0.v(r1, r2, r3, r4, r6, r8, r10, r12)
            r48 = r0
            goto L_0x0f98
        L_0x0f86:
            r59 = r13
            java.lang.String r0 = "AssetIdentifier"
            boolean r1 = v6.f0.d(r15, r0)
            if (r1 == 0) goto L_0x0f95
            d6.d r49 = k(r15, r0)
            goto L_0x0f98
        L_0x0f95:
            e(r134)
        L_0x0f98:
            r3 = r14
            r1 = r15
            r0 = r51
        L_0x0f9c:
            r2 = r118
            r129 = r52
            r52 = r0
            r0 = r129
        L_0x0fa4:
            boolean r4 = v6.f0.b(r1, r2)
            if (r4 == 0) goto L_0x100f
            d6.f r0 = new d6.f
            r37 = r0
            r41 = r59
            r42 = r58
            r43 = r49
            r37.<init>(r38, r39, r41, r42, r43)
            java.lang.Long r1 = java.lang.Long.valueOf(r44)
            android.util.Pair r0 = android.util.Pair.create(r0, r1)
            java.lang.Object r1 = r0.first
            d6.f r1 = (d6.f) r1
            long r2 = r1.f13110b
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0fed
            if (r22 == 0) goto L_0x0fd6
            r36 = 1
            r4 = r55
            goto L_0x1039
        L_0x0fd6:
            x4.m0 r0 = new x4.m0
            java.lang.String r1 = "Unable to determine start of period "
            java.lang.StringBuilder r1 = android.support.v4.media.a.a(r1)
            int r2 = r55.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0fed:
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x1005
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = r2
            goto L_0x1009
        L_0x1005:
            long r4 = r1.f13110b
            long r4 = r4 + r2
            r9 = r4
        L_0x1009:
            r4 = r55
            r4.add(r1)
            goto L_0x103b
        L_0x100f:
            r4 = r2
            r135 = r43
            r2 = r50
            r14 = r53
            r13 = r55
            r6 = r56
            r51 = r57
            r50 = r58
            r43 = r59
            r9 = r63
            r5 = r65
            r7 = r66
            r12 = r83
            r11 = r87
            goto L_0x024b
        L_0x102c:
            r66 = r7
            r63 = r9
            r87 = r11
            r4 = r13
            r0 = 0
            e(r134)
        L_0x1037:
            r52 = r0
        L_0x1039:
            r9 = r63
        L_0x103b:
            r0 = r52
            r7 = r66
            r11 = r87
        L_0x1041:
            java.lang.String r1 = "MPD"
            r2 = r134
            boolean r1 = v6.f0.b(r2, r1)
            if (r1 == 0) goto L_0x107d
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x1066
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x105b
            r18 = r9
            goto L_0x1066
        L_0x105b:
            if (r22 == 0) goto L_0x105e
            goto L_0x1066
        L_0x105e:
            x4.m0 r0 = new x4.m0
            java.lang.String r1 = "Unable to determine duration of static manifest."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x1066:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x1075
            d6.b r0 = new d6.b
            r15 = r0
            r35 = r4
            r15.<init>(r16, r18, r20, r22, r23, r25, r27, r29, r31, r32, r33, r34, r35)
            return r0
        L_0x1075:
            x4.m0 r0 = new x4.m0
            java.lang.String r1 = "No periods found."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x107d:
            r15 = r2
            r13 = r4
            goto L_0x008d
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.c.p(org.xmlpull.v1.XmlPullParser, java.lang.String):d6.b");
    }

    public h q(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        long j11;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j10 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j11 = (Long.parseLong(split[1]) - j10) + 1;
                return new h(attributeValue, j10, j11);
            }
        } else {
            j10 = 0;
        }
        j11 = -1;
        return new h(attributeValue, j10, j11);
    }

    public int r(String str) {
        if (str == null) {
            return 0;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2060497896:
                if (str.equals("subtitle")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1724546052:
                if (str.equals("description")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1580883024:
                if (str.equals("enhanced-audio-intelligibility")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1574842690:
                if (str.equals("forced_subtitle")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1408024454:
                if (str.equals("alternate")) {
                    c10 = 4;
                    break;
                }
                break;
            case 99825:
                if (str.equals("dub")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3343801:
                if (str.equals("main")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3530173:
                if (str.equals("sign")) {
                    c10 = 7;
                    break;
                }
                break;
            case 552573414:
                if (str.equals("caption")) {
                    c10 = 8;
                    break;
                }
                break;
            case 899152809:
                if (str.equals("commentary")) {
                    c10 = 9;
                    break;
                }
                break;
            case 1629013393:
                if (str.equals("emergency")) {
                    c10 = 10;
                    break;
                }
                break;
            case 1855372047:
                if (str.equals("supplementary")) {
                    c10 = 11;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 3:
                return 128;
            case 1:
                return 512;
            case 2:
                return 2048;
            case 4:
                return 2;
            case 5:
                return 16;
            case 6:
                return 1;
            case 7:
                return 256;
            case b4.f10106f:
                return 64;
            case 9:
                return 8;
            case 10:
                return 32;
            case 11:
                return 4;
            default:
                return 0;
        }
    }

    public int s(List<d> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (e.a.e("http://dashif.org/guidelines/trickmode", list.get(i11).f13102a)) {
                i10 |= 16384;
            }
        }
        return i10;
    }

    public j.e t(XmlPullParser xmlPullParser, j.e eVar) throws XmlPullParserException, IOException {
        long j10;
        long j11;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        j.e eVar2 = eVar;
        long o10 = o(xmlPullParser2, "timescale", eVar2 != null ? eVar2.f13132b : 1);
        long j12 = 0;
        long o11 = o(xmlPullParser2, "presentationTimeOffset", eVar2 != null ? eVar2.f13133c : 0);
        long j13 = eVar2 != null ? eVar2.f13146d : 0;
        if (eVar2 != null) {
            j12 = eVar2.f13147e;
        }
        h hVar = null;
        String attributeValue = xmlPullParser2.getAttributeValue((String) null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong = Long.parseLong(split[0]);
            j10 = (Long.parseLong(split[1]) - parseLong) + 1;
            j11 = parseLong;
        } else {
            j10 = j12;
            j11 = j13;
        }
        if (eVar2 != null) {
            hVar = eVar2.f13131a;
        }
        do {
            xmlPullParser.next();
            if (f0.d(xmlPullParser2, "Initialization")) {
                hVar = q(xmlPullParser2, "sourceURL", "range");
            } else {
                e(xmlPullParser);
            }
        } while (!f0.b(xmlPullParser2, "SegmentBase"));
        return new j.e(hVar, o10, o11, j11, j10);
    }

    public j.b u(XmlPullParser xmlPullParser, j.b bVar, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        List list;
        List<j.d> list2;
        h hVar;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        j.b bVar2 = bVar;
        long j15 = 1;
        long o10 = o(xmlPullParser2, "timescale", bVar2 != null ? bVar2.f13132b : 1);
        long o11 = o(xmlPullParser2, "presentationTimeOffset", bVar2 != null ? bVar2.f13133c : 0);
        long o12 = o(xmlPullParser2, "duration", bVar2 != null ? bVar2.f13135e : -9223372036854775807L);
        if (bVar2 != null) {
            j15 = bVar2.f13134d;
        }
        long o13 = o(xmlPullParser2, "startNumber", j15);
        long d10 = d(j12, j13);
        List<j.d> list3 = null;
        List list4 = null;
        h hVar2 = null;
        do {
            xmlPullParser.next();
            if (f0.d(xmlPullParser2, "Initialization")) {
                hVar2 = q(xmlPullParser2, "sourceURL", "range");
            } else if (f0.d(xmlPullParser2, "SegmentTimeline")) {
                list3 = w(xmlPullParser, o10, j11);
            } else if (f0.d(xmlPullParser2, "SegmentURL")) {
                if (list4 == null) {
                    list4 = new ArrayList();
                }
                List list5 = list4;
                list5.add(q(xmlPullParser2, "media", "mediaRange"));
                list4 = list5;
            } else {
                e(xmlPullParser);
            }
        } while (!f0.b(xmlPullParser2, "SegmentList"));
        if (bVar2 != null) {
            if (hVar2 == null) {
                hVar2 = bVar2.f13131a;
            }
            if (list3 == null) {
                list3 = bVar2.f13136f;
            }
            if (list4 == null) {
                List list6 = bVar2.f13140j;
                list2 = list3;
                hVar = hVar2;
                list = list6;
                return new j.b(hVar, o10, o11, o13, o12, list2, d10, list, x4.f.b(j14), x4.f.b(j10));
            }
        }
        hVar = hVar2;
        list = list4;
        list2 = list3;
        return new j.b(hVar, o10, o11, o13, o12, list2, d10, list, x4.f.b(j14), x4.f.b(j10));
    }

    public j.c v(XmlPullParser xmlPullParser, j.c cVar, List<d> list, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long j15;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        j.c cVar2 = cVar;
        long j16 = 1;
        long o10 = o(xmlPullParser2, "timescale", cVar2 != null ? cVar2.f13132b : 1);
        long o11 = o(xmlPullParser2, "presentationTimeOffset", cVar2 != null ? cVar2.f13133c : 0);
        long o12 = o(xmlPullParser2, "duration", cVar2 != null ? cVar2.f13135e : -9223372036854775807L);
        if (cVar2 != null) {
            j16 = cVar2.f13134d;
        }
        long o13 = o(xmlPullParser2, "startNumber", j16);
        int i10 = 0;
        while (true) {
            if (i10 >= list.size()) {
                j15 = -1;
                break;
            }
            d dVar = list.get(i10);
            if (e.a.e("http://dashif.org/guidelines/last-segment-number", dVar.f13102a)) {
                j15 = Long.parseLong(dVar.f13103b);
                break;
            }
            i10++;
        }
        long j17 = j15;
        long d10 = d(j12, j13);
        List<j.d> list2 = null;
        l y10 = y(xmlPullParser2, "media", cVar2 != null ? cVar2.f13142k : null);
        l y11 = y(xmlPullParser2, "initialization", cVar2 != null ? cVar2.f13141j : null);
        h hVar = null;
        do {
            xmlPullParser.next();
            if (f0.d(xmlPullParser2, "Initialization")) {
                hVar = q(xmlPullParser2, "sourceURL", "range");
            } else if (f0.d(xmlPullParser2, "SegmentTimeline")) {
                list2 = w(xmlPullParser, o10, j11);
            } else {
                e(xmlPullParser);
            }
        } while (!f0.b(xmlPullParser2, "SegmentTemplate"));
        if (cVar2 != null) {
            if (hVar == null) {
                hVar = cVar2.f13131a;
            }
            if (list2 == null) {
                list2 = cVar2.f13136f;
            }
        }
        return new j.c(hVar, o10, o11, o13, j17, o12, list2, d10, y11, y10, x4.f.b(j14), x4.f.b(j10));
    }

    public List<j.d> w(XmlPullParser xmlPullParser, long j10, long j11) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        ArrayList arrayList = new ArrayList();
        long j12 = 0;
        long j13 = -9223372036854775807L;
        boolean z10 = false;
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (f0.d(xmlPullParser2, "S")) {
                long o10 = o(xmlPullParser2, "t", -9223372036854775807L);
                if (z10) {
                    j12 = b(arrayList, j12, j13, i10, o10);
                }
                if (o10 == -9223372036854775807L) {
                    o10 = j12;
                }
                j13 = o(xmlPullParser2, "d", -9223372036854775807L);
                i10 = n(xmlPullParser2, "r", 0);
                j12 = o10;
                z10 = true;
            } else {
                e(xmlPullParser);
            }
        } while (!f0.b(xmlPullParser2, "SegmentTimeline"));
        if (z10) {
            b(arrayList, j12, j13, i10, e0.P(j11, j10, 1000));
        }
        return arrayList;
    }

    public l y(XmlPullParser xmlPullParser, String str, l lVar) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return lVar;
        }
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        strArr[0] = "";
        int i10 = 0;
        int i11 = 0;
        while (i10 < attributeValue.length()) {
            int indexOf = attributeValue.indexOf("$", i10);
            if (indexOf == -1) {
                strArr[i11] = strArr[i11] + attributeValue.substring(i10);
                i10 = attributeValue.length();
            } else if (indexOf != i10) {
                strArr[i11] = strArr[i11] + attributeValue.substring(i10, indexOf);
                i10 = indexOf;
            } else if (attributeValue.startsWith("$$", i10)) {
                strArr[i11] = e.a(new StringBuilder(), strArr[i11], "$");
                i10 += 2;
            } else {
                int i12 = i10 + 1;
                int indexOf2 = attributeValue.indexOf("$", i12);
                String substring = attributeValue.substring(i12, indexOf2);
                if (substring.equals("RepresentationID")) {
                    iArr[i11] = 1;
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d") && !str2.endsWith("x")) {
                            str2 = j.f.a(str2, "d");
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    substring.getClass();
                    substring.hashCode();
                    char c10 = 65535;
                    switch (substring.hashCode()) {
                        case -1950496919:
                            if (substring.equals("Number")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 2606829:
                            if (substring.equals("Time")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 38199441:
                            if (substring.equals("Bandwidth")) {
                                c10 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            iArr[i11] = 2;
                            break;
                        case 1:
                            iArr[i11] = 4;
                            break;
                        case 2:
                            iArr[i11] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException(j.f.a("Invalid template: ", attributeValue));
                    }
                    strArr2[i11] = str2;
                }
                i11++;
                strArr[i11] = "";
                i10 = indexOf2 + 1;
            }
        }
        return new l(strArr, iArr, strArr2, i11);
    }
}

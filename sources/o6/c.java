package o6;

import android.util.Log;
import androidx.appcompat.widget.z0;
import h6.g;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import v.e;
import v6.e0;
import v6.f0;
import v6.p;

/* compiled from: TtmlDecoder */
public final class c extends h6.c {

    /* renamed from: o  reason: collision with root package name */
    public static final Pattern f23022o = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: p  reason: collision with root package name */
    public static final Pattern f23023p = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: q  reason: collision with root package name */
    public static final Pattern f23024q = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: r  reason: collision with root package name */
    public static final Pattern f23025r = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: s  reason: collision with root package name */
    public static final Pattern f23026s = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: t  reason: collision with root package name */
    public static final Pattern f23027t = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: u  reason: collision with root package name */
    public static final Pattern f23028u = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: v  reason: collision with root package name */
    public static final b f23029v = new b(30.0f, 1, 1);

    /* renamed from: w  reason: collision with root package name */
    public static final a f23030w = new a(32, 15);

    /* renamed from: n  reason: collision with root package name */
    public final XmlPullParserFactory f23031n;

    /* compiled from: TtmlDecoder */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f23032a;

        public a(int i10, int i11) {
            this.f23032a = i11;
        }
    }

    /* compiled from: TtmlDecoder */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final float f23033a;

        /* renamed from: b  reason: collision with root package name */
        public final int f23034b;

        /* renamed from: c  reason: collision with root package name */
        public final int f23035c;

        public b(float f10, int i10, int i11) {
            this.f23033a = f10;
            this.f23034b = i10;
            this.f23035c = i11;
        }
    }

    /* renamed from: o6.c$c  reason: collision with other inner class name */
    /* compiled from: TtmlDecoder */
    public static final class C0206c {

        /* renamed from: a  reason: collision with root package name */
        public final int f23036a;

        /* renamed from: b  reason: collision with root package name */
        public final int f23037b;

        public C0206c(int i10, int i11) {
            this.f23036a = i10;
            this.f23037b = i11;
        }
    }

    public c() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f23031n = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static f l(f fVar) {
        return fVar == null ? new f() : fVar;
    }

    public static boolean m(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static a n(XmlPullParser xmlPullParser, a aVar) throws g {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f23028u.matcher(attributeValue);
        if (!matcher.matches()) {
            z0.a("Ignoring malformed cell resolution: ", attributeValue, "TtmlDecoder");
            return aVar;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt != 0 && parseInt2 != 0) {
                return new a(parseInt, parseInt2);
            }
            throw new g("Invalid cell resolution " + parseInt + " " + parseInt2);
        } catch (NumberFormatException unused) {
            z0.a("Ignoring malformed cell resolution: ", attributeValue, "TtmlDecoder");
            return aVar;
        }
    }

    public static void o(String str, f fVar) throws g {
        Matcher matcher;
        int i10 = e0.f26436a;
        String[] split = str.split("\\s+", -1);
        if (split.length == 1) {
            matcher = f23024q.matcher(str);
        } else if (split.length == 2) {
            matcher = f23024q.matcher(split[1]);
            Log.w("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new g(e.a(android.support.v4.media.a.a("Invalid number of entries for fontSize: "), split.length, "."));
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            group.getClass();
            group.hashCode();
            char c10 = 65535;
            switch (group.hashCode()) {
                case 37:
                    if (group.equals("%")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (group.equals("em")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (group.equals("px")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    fVar.f23070j = 3;
                    break;
                case 1:
                    fVar.f23070j = 2;
                    break;
                case 2:
                    fVar.f23070j = 1;
                    break;
                default:
                    throw new g(q.b.a("Invalid unit for fontSize: '", group, "'."));
            }
            String group2 = matcher.group(1);
            group2.getClass();
            fVar.f23071k = Float.parseFloat(group2);
            return;
        }
        throw new g(q.b.a("Invalid expression for fontSize: '", str, "'."));
    }

    public static b p(XmlPullParser xmlPullParser) throws g {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f10 = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i10 = e0.f26436a;
            String[] split = attributeValue2.split(" ", -1);
            if (split.length == 2) {
                f10 = ((float) Integer.parseInt(split[0])) / ((float) Integer.parseInt(split[1]));
            } else {
                throw new g("frameRateMultiplier doesn't have 2 parts");
            }
        }
        b bVar = f23029v;
        int i11 = bVar.f23034b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = bVar.f23035c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new b(((float) parseInt) * f10, i11, i12);
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01ac A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, o6.f> q(org.xmlpull.v1.XmlPullParser r18, java.util.Map<java.lang.String, o6.f> r19, o6.c.a r20, o6.c.C0206c r21, java.util.Map<java.lang.String, o6.e> r22, java.util.Map<java.lang.String, java.lang.String> r23) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            r0 = r18
            r1 = r19
            r2 = r21
        L_0x0006:
            r18.next()
            java.lang.String r3 = "style"
            boolean r4 = v6.f0.d(r0, r3)
            if (r4 == 0) goto L_0x0041
            java.lang.String r3 = v6.f0.a(r0, r3)
            o6.f r4 = new o6.f
            r4.<init>()
            o6.f r4 = s(r0, r4)
            if (r3 == 0) goto L_0x0036
            java.lang.String[] r3 = t(r3)
            int r5 = r3.length
            r6 = 0
        L_0x0026:
            if (r6 >= r5) goto L_0x0036
            r7 = r3[r6]
            java.lang.Object r7 = r1.get(r7)
            o6.f r7 = (o6.f) r7
            r4.a(r7)
            int r6 = r6 + 1
            goto L_0x0026
        L_0x0036:
            java.lang.String r3 = r4.f23072l
            if (r3 == 0) goto L_0x003d
            r1.put(r3, r4)
        L_0x003d:
            r5 = r22
            goto L_0x0224
        L_0x0041:
            java.lang.String r3 = "region"
            boolean r3 = v6.f0.d(r0, r3)
            java.lang.String r4 = "id"
            if (r3 == 0) goto L_0x01f6
            java.lang.String r6 = v6.f0.a(r0, r4)
            if (r6 != 0) goto L_0x0053
            goto L_0x01e8
        L_0x0053:
            java.lang.String r3 = "origin"
            java.lang.String r3 = v6.f0.a(r0, r3)
            java.lang.String r4 = "TtmlDecoder"
            if (r3 == 0) goto L_0x01e3
            java.util.regex.Pattern r5 = f23026s
            java.util.regex.Matcher r7 = r5.matcher(r3)
            java.util.regex.Pattern r8 = f23027t
            java.util.regex.Matcher r9 = r8.matcher(r3)
            boolean r10 = r7.matches()
            java.lang.String r11 = "Ignoring region with malformed origin: "
            java.lang.String r12 = "Ignoring region with missing tts:extent: "
            r13 = 1120403456(0x42c80000, float:100.0)
            r14 = 2
            r15 = 1
            if (r10 == 0) goto L_0x0095
            java.lang.String r9 = r7.group(r15)     // Catch:{ NumberFormatException -> 0x0090 }
            r9.getClass()     // Catch:{ NumberFormatException -> 0x0090 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0090 }
            float r9 = r9 / r13
            java.lang.String r7 = r7.group(r14)     // Catch:{ NumberFormatException -> 0x0090 }
            r7.getClass()     // Catch:{ NumberFormatException -> 0x0090 }
            float r7 = java.lang.Float.parseFloat(r7)     // Catch:{ NumberFormatException -> 0x0090 }
            float r7 = r7 / r13
            goto L_0x00c7
        L_0x0090:
            androidx.appcompat.widget.z0.a(r11, r3, r4)
            goto L_0x01e8
        L_0x0095:
            boolean r7 = r9.matches()
            if (r7 == 0) goto L_0x01dd
            if (r2 != 0) goto L_0x00a2
            androidx.appcompat.widget.z0.a(r12, r3, r4)
            goto L_0x01e8
        L_0x00a2:
            java.lang.String r7 = r9.group(r15)     // Catch:{ NumberFormatException -> 0x01d9 }
            r7.getClass()     // Catch:{ NumberFormatException -> 0x01d9 }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x01d9 }
            java.lang.String r9 = r9.group(r14)     // Catch:{ NumberFormatException -> 0x01d9 }
            r9.getClass()     // Catch:{ NumberFormatException -> 0x01d9 }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x01d9 }
            float r7 = (float) r7     // Catch:{ NumberFormatException -> 0x01d9 }
            int r10 = r2.f23036a     // Catch:{ NumberFormatException -> 0x01d9 }
            float r10 = (float) r10     // Catch:{ NumberFormatException -> 0x01d9 }
            float r7 = r7 / r10
            float r9 = (float) r9     // Catch:{ NumberFormatException -> 0x01d9 }
            int r10 = r2.f23037b     // Catch:{ NumberFormatException -> 0x01d9 }
            float r10 = (float) r10
            float r9 = r9 / r10
            r17 = r9
            r9 = r7
            r7 = r17
        L_0x00c7:
            java.lang.String r10 = "extent"
            java.lang.String r10 = v6.f0.a(r0, r10)
            if (r10 == 0) goto L_0x01d3
            java.util.regex.Matcher r5 = r5.matcher(r10)
            java.util.regex.Matcher r8 = r8.matcher(r10)
            boolean r10 = r5.matches()
            java.lang.String r11 = "Ignoring region with malformed extent: "
            if (r10 == 0) goto L_0x00ff
            java.lang.String r8 = r5.group(r15)     // Catch:{ NumberFormatException -> 0x00fa }
            r8.getClass()     // Catch:{ NumberFormatException -> 0x00fa }
            float r8 = java.lang.Float.parseFloat(r8)     // Catch:{ NumberFormatException -> 0x00fa }
            float r8 = r8 / r13
            java.lang.String r5 = r5.group(r14)     // Catch:{ NumberFormatException -> 0x00fa }
            r5.getClass()     // Catch:{ NumberFormatException -> 0x00fa }
            float r3 = java.lang.Float.parseFloat(r5)     // Catch:{ NumberFormatException -> 0x00fa }
            float r3 = r3 / r13
            r12 = r3
            r11 = r8
            goto L_0x012e
        L_0x00fa:
            androidx.appcompat.widget.z0.a(r11, r3, r4)
            goto L_0x01e8
        L_0x00ff:
            boolean r5 = r8.matches()
            if (r5 == 0) goto L_0x01cd
            if (r2 != 0) goto L_0x010c
            androidx.appcompat.widget.z0.a(r12, r3, r4)
            goto L_0x01e8
        L_0x010c:
            java.lang.String r5 = r8.group(r15)     // Catch:{ NumberFormatException -> 0x01c9 }
            r5.getClass()     // Catch:{ NumberFormatException -> 0x01c9 }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x01c9 }
            java.lang.String r8 = r8.group(r14)     // Catch:{ NumberFormatException -> 0x01c9 }
            r8.getClass()     // Catch:{ NumberFormatException -> 0x01c9 }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x01c9 }
            float r5 = (float) r5     // Catch:{ NumberFormatException -> 0x01c9 }
            int r10 = r2.f23036a     // Catch:{ NumberFormatException -> 0x01c9 }
            float r10 = (float) r10     // Catch:{ NumberFormatException -> 0x01c9 }
            float r5 = r5 / r10
            float r8 = (float) r8     // Catch:{ NumberFormatException -> 0x01c9 }
            int r3 = r2.f23037b     // Catch:{ NumberFormatException -> 0x01c9 }
            float r3 = (float) r3
            float r8 = r8 / r3
            r11 = r5
            r12 = r8
        L_0x012e:
            java.lang.String r3 = "displayAlign"
            java.lang.String r3 = v6.f0.a(r0, r3)
            if (r3 == 0) goto L_0x015c
            java.lang.String r3 = v6.e0.V(r3)
            r3.getClass()
            java.lang.String r4 = "center"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x0153
            java.lang.String r4 = "after"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x014e
            goto L_0x015c
        L_0x014e:
            float r7 = r7 + r12
            r3 = 2
            r8 = r7
            r10 = 2
            goto L_0x015f
        L_0x0153:
            r3 = 1073741824(0x40000000, float:2.0)
            float r3 = r12 / r3
            float r3 = r3 + r7
            r4 = 1
            r8 = r3
            r10 = 1
            goto L_0x015f
        L_0x015c:
            r3 = 0
            r8 = r7
            r10 = 0
        L_0x015f:
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = r20
            int r5 = r4.f23032a
            float r5 = (float) r5
            float r3 = r3 / r5
            java.lang.String r5 = "writingMode"
            java.lang.String r5 = v6.f0.a(r0, r5)
            if (r5 == 0) goto L_0x01b7
            java.lang.String r5 = v6.e0.V(r5)
            r5.getClass()
            int r7 = r5.hashCode()
            r13 = 3694(0xe6e, float:5.176E-42)
            if (r7 == r13) goto L_0x019f
            r13 = 3553396(0x363874, float:4.979368E-39)
            if (r7 == r13) goto L_0x0194
            r13 = 3553576(0x363928, float:4.97962E-39)
            if (r7 == r13) goto L_0x0189
            goto L_0x01a7
        L_0x0189:
            java.lang.String r7 = "tbrl"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x0192
            goto L_0x01a7
        L_0x0192:
            r5 = 2
            goto L_0x01aa
        L_0x0194:
            java.lang.String r7 = "tblr"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x019d
            goto L_0x01a7
        L_0x019d:
            r5 = 1
            goto L_0x01aa
        L_0x019f:
            java.lang.String r7 = "tb"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x01a9
        L_0x01a7:
            r5 = -1
            goto L_0x01aa
        L_0x01a9:
            r5 = 0
        L_0x01aa:
            if (r5 == 0) goto L_0x01b4
            if (r5 == r15) goto L_0x01b4
            if (r5 == r14) goto L_0x01b1
            goto L_0x01b7
        L_0x01b1:
            r5 = 1
            r15 = 1
            goto L_0x01bb
        L_0x01b4:
            r5 = 2
            r15 = 2
            goto L_0x01bb
        L_0x01b7:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x01bb:
            o6.e r16 = new o6.e
            r13 = 0
            r14 = 1
            r5 = r16
            r7 = r9
            r9 = r13
            r13 = r14
            r14 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x01ea
        L_0x01c9:
            androidx.appcompat.widget.z0.a(r11, r3, r4)
            goto L_0x01e8
        L_0x01cd:
            java.lang.String r5 = "Ignoring region with unsupported extent: "
            androidx.appcompat.widget.z0.a(r5, r3, r4)
            goto L_0x01e8
        L_0x01d3:
            java.lang.String r3 = "Ignoring region without an extent"
            android.util.Log.w(r4, r3)
            goto L_0x01e8
        L_0x01d9:
            androidx.appcompat.widget.z0.a(r11, r3, r4)
            goto L_0x01e8
        L_0x01dd:
            java.lang.String r5 = "Ignoring region with unsupported origin: "
            androidx.appcompat.widget.z0.a(r5, r3, r4)
            goto L_0x01e8
        L_0x01e3:
            java.lang.String r3 = "Ignoring region without an origin"
            android.util.Log.w(r4, r3)
        L_0x01e8:
            r16 = 0
        L_0x01ea:
            r3 = r16
            if (r3 == 0) goto L_0x003d
            java.lang.String r4 = r3.f23051a
            r5 = r22
            r5.put(r4, r3)
            goto L_0x0224
        L_0x01f6:
            r5 = r22
            java.lang.String r3 = "metadata"
            boolean r6 = v6.f0.d(r0, r3)
            if (r6 == 0) goto L_0x0224
        L_0x0200:
            r18.next()
            java.lang.String r6 = "image"
            boolean r6 = v6.f0.d(r0, r6)
            if (r6 == 0) goto L_0x021b
            java.lang.String r6 = v6.f0.a(r0, r4)
            if (r6 == 0) goto L_0x021b
            java.lang.String r7 = r18.nextText()
            r8 = r23
            r8.put(r6, r7)
            goto L_0x021d
        L_0x021b:
            r8 = r23
        L_0x021d:
            boolean r6 = v6.f0.b(r0, r3)
            if (r6 == 0) goto L_0x0200
            goto L_0x0226
        L_0x0224:
            r8 = r23
        L_0x0226:
            java.lang.String r3 = "head"
            boolean r3 = v6.f0.b(r0, r3)
            if (r3 == 0) goto L_0x0006
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.c.q(org.xmlpull.v1.XmlPullParser, java.util.Map, o6.c$a, o6.c$c, java.util.Map, java.util.Map):java.util.Map");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o6.d r(org.xmlpull.v1.XmlPullParser r18, o6.d r19, java.util.Map<java.lang.String, o6.e> r20, o6.c.b r21) throws h6.g {
        /*
            r0 = r18
            r11 = r19
            r1 = r21
            int r2 = r18.getAttributeCount()
            r3 = 0
            o6.f r7 = s(r0, r3)
            java.lang.String r8 = ""
            r10 = r3
            r9 = r8
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r10
            r3 = 0
        L_0x0024:
            if (r3 >= r2) goto L_0x00c8
            java.lang.String r4 = r0.getAttributeName(r3)
            java.lang.String r5 = r0.getAttributeValue(r3)
            r4.getClass()
            int r6 = r4.hashCode()
            r0 = 1
            switch(r6) {
                case -934795532: goto L_0x0071;
                case 99841: goto L_0x0066;
                case 100571: goto L_0x005b;
                case 93616297: goto L_0x0050;
                case 109780401: goto L_0x0045;
                case 1292595405: goto L_0x003a;
                default: goto L_0x0039;
            }
        L_0x0039:
            goto L_0x007c
        L_0x003a:
            java.lang.String r6 = "backgroundImage"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0043
            goto L_0x007c
        L_0x0043:
            r4 = 5
            goto L_0x007d
        L_0x0045:
            java.lang.String r6 = "style"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x004e
            goto L_0x007c
        L_0x004e:
            r4 = 4
            goto L_0x007d
        L_0x0050:
            java.lang.String r6 = "begin"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0059
            goto L_0x007c
        L_0x0059:
            r4 = 3
            goto L_0x007d
        L_0x005b:
            java.lang.String r6 = "end"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0064
            goto L_0x007c
        L_0x0064:
            r4 = 2
            goto L_0x007d
        L_0x0066:
            java.lang.String r6 = "dur"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x006f
            goto L_0x007c
        L_0x006f:
            r4 = 1
            goto L_0x007d
        L_0x0071:
            java.lang.String r6 = "region"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x007a
            goto L_0x007c
        L_0x007a:
            r4 = 0
            goto L_0x007d
        L_0x007c:
            r4 = -1
        L_0x007d:
            if (r4 == 0) goto L_0x00b9
            if (r4 == r0) goto L_0x00b0
            r6 = 2
            if (r4 == r6) goto L_0x00aa
            r6 = 3
            if (r4 == r6) goto L_0x00a4
            r6 = 4
            if (r4 == r6) goto L_0x009b
            r6 = 5
            if (r4 == r6) goto L_0x008e
            goto L_0x00b6
        L_0x008e:
            java.lang.String r4 = "#"
            boolean r4 = r5.startsWith(r4)
            if (r4 == 0) goto L_0x00b6
            java.lang.String r10 = r5.substring(r0)
            goto L_0x00b6
        L_0x009b:
            java.lang.String[] r0 = t(r5)
            int r4 = r0.length
            if (r4 <= 0) goto L_0x00b6
            r8 = r0
            goto L_0x00b6
        L_0x00a4:
            long r4 = u(r5, r1)
            r12 = r4
            goto L_0x00b6
        L_0x00aa:
            long r4 = u(r5, r1)
            r14 = r4
            goto L_0x00b6
        L_0x00b0:
            long r4 = u(r5, r1)
            r16 = r4
        L_0x00b6:
            r0 = r20
            goto L_0x00c2
        L_0x00b9:
            r0 = r20
            boolean r4 = r0.containsKey(r5)
            if (r4 == 0) goto L_0x00c2
            r9 = r5
        L_0x00c2:
            int r3 = r3 + 1
            r0 = r18
            goto L_0x0024
        L_0x00c8:
            if (r11 == 0) goto L_0x00e0
            long r0 = r11.f23041d
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00e5
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00da
            long r12 = r12 + r0
        L_0x00da:
            int r4 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00e5
            long r14 = r14 + r0
            goto L_0x00e5
        L_0x00e0:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00e5:
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x00fc
            int r0 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00f2
            long r16 = r12 + r16
            r5 = r16
            goto L_0x00fd
        L_0x00f2:
            if (r11 == 0) goto L_0x00fc
            long r0 = r11.f23042e
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00fc
            r5 = r0
            goto L_0x00fd
        L_0x00fc:
            r5 = r14
        L_0x00fd:
            java.lang.String r1 = r18.getName()
            o6.d r14 = new o6.d
            r2 = 0
            r0 = r14
            r3 = r12
            r11 = r19
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.c.r(org.xmlpull.v1.XmlPullParser, o6.d, java.util.Map, o6.c$b):o6.d");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01cb, code lost:
        if (r3.equals("auto") != false) goto L_0x01cf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o6.f s(org.xmlpull.v1.XmlPullParser r13, o6.f r14) {
        /*
            int r0 = r13.getAttributeCount()
            r1 = 0
            r2 = 0
        L_0x0006:
            if (r2 >= r0) goto L_0x0492
            java.lang.String r3 = r13.getAttributeValue(r2)
            java.lang.String r4 = r13.getAttributeName(r2)
            r4.getClass()
            int r5 = r4.hashCode()
            r6 = 4
            r7 = -1
            r8 = 2
            r9 = 1
            switch(r5) {
                case -1550943582: goto L_0x00c1;
                case -1224696685: goto L_0x00b6;
                case -1065511464: goto L_0x00ab;
                case -879295043: goto L_0x00a0;
                case -734428249: goto L_0x0095;
                case 3355: goto L_0x008a;
                case 3511770: goto L_0x007f;
                case 94842723: goto L_0x0074;
                case 109403361: goto L_0x0066;
                case 110138194: goto L_0x0058;
                case 365601008: goto L_0x004a;
                case 921125321: goto L_0x003c;
                case 1115953443: goto L_0x002e;
                case 1287124693: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x00cc
        L_0x0020:
            java.lang.String r5 = "backgroundColor"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x002a
            goto L_0x00cc
        L_0x002a:
            r4 = 13
            goto L_0x00cd
        L_0x002e:
            java.lang.String r5 = "rubyPosition"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0038
            goto L_0x00cc
        L_0x0038:
            r4 = 12
            goto L_0x00cd
        L_0x003c:
            java.lang.String r5 = "textEmphasis"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0046
            goto L_0x00cc
        L_0x0046:
            r4 = 11
            goto L_0x00cd
        L_0x004a:
            java.lang.String r5 = "fontSize"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0054
            goto L_0x00cc
        L_0x0054:
            r4 = 10
            goto L_0x00cd
        L_0x0058:
            java.lang.String r5 = "textCombine"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0062
            goto L_0x00cc
        L_0x0062:
            r4 = 9
            goto L_0x00cd
        L_0x0066:
            java.lang.String r5 = "shear"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0070
            goto L_0x00cc
        L_0x0070:
            r4 = 8
            goto L_0x00cd
        L_0x0074:
            java.lang.String r5 = "color"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x007d
            goto L_0x00cc
        L_0x007d:
            r4 = 7
            goto L_0x00cd
        L_0x007f:
            java.lang.String r5 = "ruby"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0088
            goto L_0x00cc
        L_0x0088:
            r4 = 6
            goto L_0x00cd
        L_0x008a:
            java.lang.String r5 = "id"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0093
            goto L_0x00cc
        L_0x0093:
            r4 = 5
            goto L_0x00cd
        L_0x0095:
            java.lang.String r5 = "fontWeight"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x009e
            goto L_0x00cc
        L_0x009e:
            r4 = 4
            goto L_0x00cd
        L_0x00a0:
            java.lang.String r5 = "textDecoration"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00a9
            goto L_0x00cc
        L_0x00a9:
            r4 = 3
            goto L_0x00cd
        L_0x00ab:
            java.lang.String r5 = "textAlign"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00b4
            goto L_0x00cc
        L_0x00b4:
            r4 = 2
            goto L_0x00cd
        L_0x00b6:
            java.lang.String r5 = "fontFamily"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00bf
            goto L_0x00cc
        L_0x00bf:
            r4 = 1
            goto L_0x00cd
        L_0x00c1:
            java.lang.String r5 = "fontStyle"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00ca
            goto L_0x00cc
        L_0x00ca:
            r4 = 0
            goto L_0x00cd
        L_0x00cc:
            r4 = -1
        L_0x00cd:
            java.lang.String r5 = "after"
            java.lang.String r10 = "before"
            java.lang.String r11 = "none"
            java.lang.String r12 = "TtmlDecoder"
            switch(r4) {
                case 0: goto L_0x0482;
                case 1: goto L_0x047b;
                case 2: goto L_0x0413;
                case 3: goto L_0x03b0;
                case 4: goto L_0x03a2;
                case 5: goto L_0x038e;
                case 6: goto L_0x030e;
                case 7: goto L_0x02f9;
                case 8: goto L_0x02af;
                case 9: goto L_0x0288;
                case 10: goto L_0x0278;
                case 11: goto L_0x0114;
                case 12: goto L_0x00ef;
                case 13: goto L_0x00da;
                default: goto L_0x00d8;
            }
        L_0x00d8:
            goto L_0x048e
        L_0x00da:
            o6.f r14 = l(r14)
            int r4 = v6.e.a(r3, r1)     // Catch:{ IllegalArgumentException -> 0x00e8 }
            r14.f23064d = r4     // Catch:{ IllegalArgumentException -> 0x00e8 }
            r14.f23065e = r9     // Catch:{ IllegalArgumentException -> 0x00e8 }
            goto L_0x048e
        L_0x00e8:
            java.lang.String r4 = "Failed parsing background value: "
            androidx.appcompat.widget.z0.a(r4, r3, r12)
            goto L_0x048e
        L_0x00ef:
            java.lang.String r3 = v6.e0.V(r3)
            r3.getClass()
            boolean r4 = r3.equals(r10)
            if (r4 != 0) goto L_0x010c
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0104
            goto L_0x048e
        L_0x0104:
            o6.f r14 = l(r14)
            r14.f23074n = r8
            goto L_0x048e
        L_0x010c:
            o6.f r14 = l(r14)
            r14.f23074n = r9
            goto L_0x048e
        L_0x0114:
            o6.f r14 = l(r14)
            java.lang.String r3 = v6.e0.V(r3)
            java.util.regex.Pattern r4 = o6.b.f23014d
            r4 = 0
            if (r3 != 0) goto L_0x0123
            goto L_0x0274
        L_0x0123:
            java.lang.String r3 = r3.trim()
            boolean r6 = r3.isEmpty()
            if (r6 == 0) goto L_0x012f
            goto L_0x0274
        L_0x012f:
            java.util.regex.Pattern r4 = o6.b.f23014d
            java.lang.String[] r3 = android.text.TextUtils.split(r3, r4)
            int r4 = r3.length
            if (r4 == 0) goto L_0x014f
            if (r4 == r9) goto L_0x0146
            int r4 = r3.length
            java.lang.Object r3 = r3.clone()
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            ba.x r3 = ba.x.x(r4, r3)
            goto L_0x0151
        L_0x0146:
            r3 = r3[r1]
            ba.w0 r4 = new ba.w0
            r4.<init>(r3)
            r3 = r4
            goto L_0x0151
        L_0x014f:
            ba.q0<java.lang.Object> r3 = ba.q0.f3786i
        L_0x0151:
            ba.x<java.lang.String> r4 = o6.b.f23018h
            ba.v0$c r4 = ba.v0.b(r4, r3)
            java.lang.String r6 = "outside"
            java.lang.Object r4 = ba.y.a(r4, r6)
            java.lang.String r4 = (java.lang.String) r4
            int r8 = r4.hashCode()
            r12 = -1392885889(0xffffffffacfa3f7f, float:-7.112477E-12)
            if (r8 == r12) goto L_0x0183
            r10 = -1106037339(0xffffffffbe1335a5, float:-0.14375933)
            if (r8 == r10) goto L_0x017b
            r6 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r8 == r6) goto L_0x0173
            goto L_0x018b
        L_0x0173:
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x018b
            r4 = 0
            goto L_0x018c
        L_0x017b:
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x018b
            r4 = 1
            goto L_0x018c
        L_0x0183:
            boolean r4 = r4.equals(r10)
            if (r4 == 0) goto L_0x018b
            r4 = 2
            goto L_0x018c
        L_0x018b:
            r4 = -1
        L_0x018c:
            if (r4 == 0) goto L_0x0194
            if (r4 == r9) goto L_0x0192
            r4 = 1
            goto L_0x0195
        L_0x0192:
            r4 = -2
            goto L_0x0195
        L_0x0194:
            r4 = 2
        L_0x0195:
            ba.x<java.lang.String> r5 = o6.b.f23015e
            ba.v0$c r5 = ba.v0.b(r5, r3)
            ba.v0$a r5 = (ba.v0.a) r5
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x01d9
            ba.u0 r3 = new ba.u0
            r3.<init>(r5)
            java.lang.Object r3 = r3.next()
            java.lang.String r3 = (java.lang.String) r3
            int r5 = r3.hashCode()
            r6 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r5 == r6) goto L_0x01c5
            r6 = 3387192(0x33af38, float:4.746467E-39)
            if (r5 == r6) goto L_0x01bd
            goto L_0x01ce
        L_0x01bd:
            boolean r3 = r3.equals(r11)
            if (r3 == 0) goto L_0x01ce
            r9 = 0
            goto L_0x01cf
        L_0x01c5:
            java.lang.String r5 = "auto"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x01ce
            goto L_0x01cf
        L_0x01ce:
            r9 = -1
        L_0x01cf:
            if (r9 == 0) goto L_0x01d2
            goto L_0x01d3
        L_0x01d2:
            r7 = 0
        L_0x01d3:
            o6.b r3 = new o6.b
            r3.<init>(r7, r1, r4)
            goto L_0x01fc
        L_0x01d9:
            ba.x<java.lang.String> r5 = o6.b.f23017g
            ba.v0$c r5 = ba.v0.b(r5, r3)
            ba.x<java.lang.String> r6 = o6.b.f23016f
            ba.v0$c r3 = ba.v0.b(r6, r3)
            r6 = r5
            ba.v0$a r6 = (ba.v0.a) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x01ff
            r6 = r3
            ba.v0$a r6 = (ba.v0.a) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x01ff
            o6.b r3 = new o6.b
            r3.<init>(r7, r1, r4)
        L_0x01fc:
            r4 = r3
            goto L_0x0274
        L_0x01ff:
            java.lang.String r6 = "filled"
            java.lang.Object r5 = ba.y.a(r5, r6)
            java.lang.String r5 = (java.lang.String) r5
            int r8 = r5.hashCode()
            r10 = -1274499742(0xffffffffb408ad62, float:-1.2729063E-7)
            if (r8 == r10) goto L_0x0220
            r6 = 3417674(0x34264a, float:4.789181E-39)
            if (r8 == r6) goto L_0x0216
            goto L_0x0228
        L_0x0216:
            java.lang.String r6 = "open"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0228
            r5 = 0
            goto L_0x0229
        L_0x0220:
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0228
            r5 = 1
            goto L_0x0229
        L_0x0228:
            r5 = -1
        L_0x0229:
            if (r5 == 0) goto L_0x022d
            r5 = 1
            goto L_0x022e
        L_0x022d:
            r5 = 2
        L_0x022e:
            java.lang.String r6 = "circle"
            java.lang.Object r3 = ba.y.a(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            int r8 = r3.hashCode()
            r10 = -1360216880(0xffffffffaeecbcd0, float:-1.0765577E-10)
            if (r8 == r10) goto L_0x025e
            r6 = -905816648(0xffffffffca0255b8, float:-2135406.0)
            if (r8 == r6) goto L_0x0254
            r6 = 99657(0x18549, float:1.39649E-40)
            if (r8 == r6) goto L_0x024a
            goto L_0x0265
        L_0x024a:
            java.lang.String r6 = "dot"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x0265
            r7 = 0
            goto L_0x0265
        L_0x0254:
            java.lang.String r6 = "sesame"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x0265
            r7 = 1
            goto L_0x0265
        L_0x025e:
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x0265
            r7 = 2
        L_0x0265:
            if (r7 == 0) goto L_0x026d
            if (r7 == r9) goto L_0x026b
            r3 = 1
            goto L_0x026e
        L_0x026b:
            r3 = 3
            goto L_0x026e
        L_0x026d:
            r3 = 2
        L_0x026e:
            o6.b r6 = new o6.b
            r6.<init>(r3, r5, r4)
            r4 = r6
        L_0x0274:
            r14.f23077q = r4
            goto L_0x048e
        L_0x0278:
            o6.f r14 = l(r14)     // Catch:{ g -> 0x0281 }
            o(r3, r14)     // Catch:{ g -> 0x0281 }
            goto L_0x048e
        L_0x0281:
            java.lang.String r4 = "Failed parsing fontSize value: "
            androidx.appcompat.widget.z0.a(r4, r3, r12)
            goto L_0x048e
        L_0x0288:
            java.lang.String r3 = v6.e0.V(r3)
            r3.getClass()
            java.lang.String r4 = "all"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x02a7
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L_0x029f
            goto L_0x048e
        L_0x029f:
            o6.f r14 = l(r14)
            r14.f23076p = r1
            goto L_0x048e
        L_0x02a7:
            o6.f r14 = l(r14)
            r14.f23076p = r9
            goto L_0x048e
        L_0x02af:
            o6.f r14 = l(r14)
            java.util.regex.Pattern r4 = f23025r
            java.util.regex.Matcher r4 = r4.matcher(r3)
            boolean r5 = r4.matches()
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            if (r5 != 0) goto L_0x02c8
            java.lang.String r4 = "Invalid value for shear: "
            androidx.appcompat.widget.z0.a(r4, r3, r12)
            goto L_0x02f5
        L_0x02c8:
            java.lang.String r4 = r4.group(r9)     // Catch:{ NumberFormatException -> 0x02e0 }
            r4.getClass()     // Catch:{ NumberFormatException -> 0x02e0 }
            float r4 = java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x02e0 }
            r5 = -1027080192(0xffffffffc2c80000, float:-100.0)
            float r4 = java.lang.Math.max(r5, r4)     // Catch:{ NumberFormatException -> 0x02e0 }
            r5 = 1120403456(0x42c80000, float:100.0)
            float r6 = java.lang.Math.min(r5, r4)     // Catch:{ NumberFormatException -> 0x02e0 }
            goto L_0x02f5
        L_0x02e0:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Failed to parse shear: "
            r5.append(r7)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            v6.p.d(r12, r3, r4)
        L_0x02f5:
            r14.f23078r = r6
            goto L_0x048e
        L_0x02f9:
            o6.f r14 = l(r14)
            int r4 = v6.e.a(r3, r1)     // Catch:{ IllegalArgumentException -> 0x0307 }
            r14.f23062b = r4     // Catch:{ IllegalArgumentException -> 0x0307 }
            r14.f23063c = r9     // Catch:{ IllegalArgumentException -> 0x0307 }
            goto L_0x048e
        L_0x0307:
            java.lang.String r4 = "Failed parsing color value: "
            androidx.appcompat.widget.z0.a(r4, r3, r12)
            goto L_0x048e
        L_0x030e:
            java.lang.String r3 = v6.e0.V(r3)
            r3.getClass()
            int r4 = r3.hashCode()
            switch(r4) {
                case -618561360: goto L_0x0354;
                case -410956671: goto L_0x0349;
                case -250518009: goto L_0x033e;
                case -136074796: goto L_0x0333;
                case 3016401: goto L_0x0328;
                case 3556653: goto L_0x031d;
                default: goto L_0x031c;
            }
        L_0x031c:
            goto L_0x035e
        L_0x031d:
            java.lang.String r4 = "text"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0326
            goto L_0x035e
        L_0x0326:
            r7 = 5
            goto L_0x035e
        L_0x0328:
            java.lang.String r4 = "base"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0331
            goto L_0x035e
        L_0x0331:
            r7 = 4
            goto L_0x035e
        L_0x0333:
            java.lang.String r4 = "textContainer"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x033c
            goto L_0x035e
        L_0x033c:
            r7 = 3
            goto L_0x035e
        L_0x033e:
            java.lang.String r4 = "delimiter"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0347
            goto L_0x035e
        L_0x0347:
            r7 = 2
            goto L_0x035e
        L_0x0349:
            java.lang.String r4 = "container"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0352
            goto L_0x035e
        L_0x0352:
            r7 = 1
            goto L_0x035e
        L_0x0354:
            java.lang.String r4 = "baseContainer"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x035d
            goto L_0x035e
        L_0x035d:
            r7 = 0
        L_0x035e:
            if (r7 == 0) goto L_0x0386
            if (r7 == r9) goto L_0x037e
            if (r7 == r8) goto L_0x0376
            r3 = 3
            if (r7 == r3) goto L_0x036e
            if (r7 == r6) goto L_0x0386
            r4 = 5
            if (r7 == r4) goto L_0x036e
            goto L_0x048e
        L_0x036e:
            o6.f r14 = l(r14)
            r14.f23073m = r3
            goto L_0x048e
        L_0x0376:
            o6.f r14 = l(r14)
            r14.f23073m = r6
            goto L_0x048e
        L_0x037e:
            o6.f r14 = l(r14)
            r14.f23073m = r9
            goto L_0x048e
        L_0x0386:
            o6.f r14 = l(r14)
            r14.f23073m = r8
            goto L_0x048e
        L_0x038e:
            java.lang.String r4 = r13.getName()
            java.lang.String r5 = "style"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x048e
            o6.f r14 = l(r14)
            r14.f23072l = r3
            goto L_0x048e
        L_0x03a2:
            o6.f r14 = l(r14)
            java.lang.String r4 = "bold"
            boolean r3 = r4.equalsIgnoreCase(r3)
            r14.f23068h = r3
            goto L_0x048e
        L_0x03b0:
            java.lang.String r3 = v6.e0.V(r3)
            r3.getClass()
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case -1461280213: goto L_0x03e4;
                case -1026963764: goto L_0x03d9;
                case 913457136: goto L_0x03ce;
                case 1679736913: goto L_0x03c3;
                default: goto L_0x03c2;
            }
        L_0x03c2:
            goto L_0x03ee
        L_0x03c3:
            java.lang.String r5 = "linethrough"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x03cc
            goto L_0x03ee
        L_0x03cc:
            r4 = 3
            goto L_0x03ee
        L_0x03ce:
            java.lang.String r5 = "nolinethrough"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x03d7
            goto L_0x03ee
        L_0x03d7:
            r4 = 2
            goto L_0x03ee
        L_0x03d9:
            java.lang.String r5 = "underline"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x03e2
            goto L_0x03ee
        L_0x03e2:
            r4 = 1
            goto L_0x03ee
        L_0x03e4:
            java.lang.String r5 = "nounderline"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x03ed
            goto L_0x03ee
        L_0x03ed:
            r4 = 0
        L_0x03ee:
            switch(r4) {
                case 0: goto L_0x040b;
                case 1: goto L_0x0403;
                case 2: goto L_0x03fb;
                case 3: goto L_0x03f3;
                default: goto L_0x03f1;
            }
        L_0x03f1:
            goto L_0x048e
        L_0x03f3:
            o6.f r14 = l(r14)
            r14.f23066f = r9
            goto L_0x048e
        L_0x03fb:
            o6.f r14 = l(r14)
            r14.f23066f = r1
            goto L_0x048e
        L_0x0403:
            o6.f r14 = l(r14)
            r14.f23067g = r9
            goto L_0x048e
        L_0x040b:
            o6.f r14 = l(r14)
            r14.f23067g = r1
            goto L_0x048e
        L_0x0413:
            java.lang.String r3 = v6.e0.V(r3)
            r3.getClass()
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case -1364013995: goto L_0x0452;
                case 100571: goto L_0x0447;
                case 3317767: goto L_0x043c;
                case 108511772: goto L_0x0431;
                case 109757538: goto L_0x0426;
                default: goto L_0x0425;
            }
        L_0x0425:
            goto L_0x045c
        L_0x0426:
            java.lang.String r5 = "start"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x042f
            goto L_0x045c
        L_0x042f:
            r4 = 4
            goto L_0x045c
        L_0x0431:
            java.lang.String r5 = "right"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x043a
            goto L_0x045c
        L_0x043a:
            r4 = 3
            goto L_0x045c
        L_0x043c:
            java.lang.String r5 = "left"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0445
            goto L_0x045c
        L_0x0445:
            r4 = 2
            goto L_0x045c
        L_0x0447:
            java.lang.String r5 = "end"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0450
            goto L_0x045c
        L_0x0450:
            r4 = 1
            goto L_0x045c
        L_0x0452:
            java.lang.String r5 = "center"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x045b
            goto L_0x045c
        L_0x045b:
            r4 = 0
        L_0x045c:
            switch(r4) {
                case 0: goto L_0x0472;
                case 1: goto L_0x0469;
                case 2: goto L_0x0460;
                case 3: goto L_0x0469;
                case 4: goto L_0x0460;
                default: goto L_0x045f;
            }
        L_0x045f:
            goto L_0x048e
        L_0x0460:
            o6.f r14 = l(r14)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
            r14.f23075o = r3
            goto L_0x048e
        L_0x0469:
            o6.f r14 = l(r14)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            r14.f23075o = r3
            goto L_0x048e
        L_0x0472:
            o6.f r14 = l(r14)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
            r14.f23075o = r3
            goto L_0x048e
        L_0x047b:
            o6.f r14 = l(r14)
            r14.f23061a = r3
            goto L_0x048e
        L_0x0482:
            o6.f r14 = l(r14)
            java.lang.String r4 = "italic"
            boolean r3 = r4.equalsIgnoreCase(r3)
            r14.f23069i = r3
        L_0x048e:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x0492:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.c.s(org.xmlpull.v1.XmlPullParser, o6.f):o6.f");
    }

    public static String[] t(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        int i10 = e0.f26436a;
        return trim.split("\\s+", -1);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00bd, code lost:
        if (r13.equals("ms") == false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0106, code lost:
        r7 = r7 * r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010f, code lost:
        r7 = r7 / r13;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long u(java.lang.String r13, o6.c.b r14) throws h6.g {
        /*
            java.util.regex.Pattern r0 = f23022o
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r1 = r0.matches()
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L_0x0091
            java.lang.String r13 = r0.group(r7)
            r13.getClass()
            long r7 = java.lang.Long.parseLong(r13)
            r9 = 3600(0xe10, double:1.7786E-320)
            long r7 = r7 * r9
            double r7 = (double) r7
            java.lang.String r13 = r0.group(r6)
            r13.getClass()
            long r9 = java.lang.Long.parseLong(r13)
            r11 = 60
            long r9 = r9 * r11
            double r9 = (double) r9
            java.lang.Double.isNaN(r7)
            java.lang.Double.isNaN(r9)
            double r7 = r7 + r9
            java.lang.String r13 = r0.group(r5)
            r13.getClass()
            long r5 = java.lang.Long.parseLong(r13)
            double r5 = (double) r5
            java.lang.Double.isNaN(r5)
            double r7 = r7 + r5
            java.lang.String r13 = r0.group(r4)
            r4 = 0
            if (r13 == 0) goto L_0x0059
            double r9 = java.lang.Double.parseDouble(r13)
            goto L_0x005a
        L_0x0059:
            r9 = r4
        L_0x005a:
            double r7 = r7 + r9
            r13 = 5
            java.lang.String r13 = r0.group(r13)
            if (r13 == 0) goto L_0x006c
            long r9 = java.lang.Long.parseLong(r13)
            float r13 = (float) r9
            float r1 = r14.f23033a
            float r13 = r13 / r1
            double r9 = (double) r13
            goto L_0x006d
        L_0x006c:
            r9 = r4
        L_0x006d:
            double r7 = r7 + r9
            r13 = 6
            java.lang.String r13 = r0.group(r13)
            if (r13 == 0) goto L_0x008c
            long r0 = java.lang.Long.parseLong(r13)
            double r0 = (double) r0
            int r13 = r14.f23034b
            double r4 = (double) r13
            java.lang.Double.isNaN(r0)
            java.lang.Double.isNaN(r4)
            double r0 = r0 / r4
            float r13 = r14.f23033a
            double r13 = (double) r13
            java.lang.Double.isNaN(r13)
            double r4 = r0 / r13
        L_0x008c:
            double r7 = r7 + r4
        L_0x008d:
            double r7 = r7 * r2
            long r13 = (long) r7
            return r13
        L_0x0091:
            java.util.regex.Pattern r0 = f23023p
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L_0x0112
            java.lang.String r13 = r0.group(r7)
            r13.getClass()
            double r7 = java.lang.Double.parseDouble(r13)
            java.lang.String r13 = r0.group(r6)
            r13.getClass()
            int r0 = r13.hashCode()
            switch(r0) {
                case 102: goto L_0x00e1;
                case 104: goto L_0x00d6;
                case 109: goto L_0x00cb;
                case 116: goto L_0x00c0;
                case 3494: goto L_0x00b7;
                default: goto L_0x00b6;
            }
        L_0x00b6:
            goto L_0x00ec
        L_0x00b7:
            java.lang.String r0 = "ms"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00ed
            goto L_0x00ec
        L_0x00c0:
            java.lang.String r0 = "t"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00c9
            goto L_0x00ec
        L_0x00c9:
            r4 = 3
            goto L_0x00ed
        L_0x00cb:
            java.lang.String r0 = "m"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00d4
            goto L_0x00ec
        L_0x00d4:
            r4 = 2
            goto L_0x00ed
        L_0x00d6:
            java.lang.String r0 = "h"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00df
            goto L_0x00ec
        L_0x00df:
            r4 = 1
            goto L_0x00ed
        L_0x00e1:
            java.lang.String r0 = "f"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00ea
            goto L_0x00ec
        L_0x00ea:
            r4 = 0
            goto L_0x00ed
        L_0x00ec:
            r4 = -1
        L_0x00ed:
            switch(r4) {
                case 0: goto L_0x0109;
                case 1: goto L_0x0101;
                case 2: goto L_0x00fe;
                case 3: goto L_0x00f7;
                case 4: goto L_0x00f1;
                default: goto L_0x00f0;
            }
        L_0x00f0:
            goto L_0x008d
        L_0x00f1:
            r13 = 4652007308841189376(0x408f400000000000, double:1000.0)
            goto L_0x010f
        L_0x00f7:
            int r13 = r14.f23035c
            double r13 = (double) r13
            java.lang.Double.isNaN(r13)
            goto L_0x010f
        L_0x00fe:
            r13 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L_0x0106
        L_0x0101:
            r13 = 4660134898793709568(0x40ac200000000000, double:3600.0)
        L_0x0106:
            double r7 = r7 * r13
            goto L_0x008d
        L_0x0109:
            float r13 = r14.f23033a
            double r13 = (double) r13
            java.lang.Double.isNaN(r13)
        L_0x010f:
            double r7 = r7 / r13
            goto L_0x008d
        L_0x0112:
            h6.g r14 = new h6.g
            java.lang.String r0 = "Malformed time expression: "
            java.lang.String r13 = j.f.a(r0, r13)
            r14.<init>((java.lang.String) r13)
            goto L_0x011f
        L_0x011e:
            throw r14
        L_0x011f:
            goto L_0x011e
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.c.u(java.lang.String, o6.c$b):long");
    }

    public static C0206c v(XmlPullParser xmlPullParser) {
        String a10 = f0.a(xmlPullParser, "extent");
        if (a10 == null) {
            return null;
        }
        Matcher matcher = f23027t.matcher(a10);
        if (!matcher.matches()) {
            z0.a("Ignoring non-pixel tts extent: ", a10, "TtmlDecoder");
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new C0206c(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            z0.a("Ignoring malformed tts extent: ", a10, "TtmlDecoder");
            return null;
        }
    }

    public h6.e k(byte[] bArr, int i10, boolean z10) throws g {
        b bVar;
        try {
            XmlPullParser newPullParser = this.f23031n.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new e("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            C0206c cVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), (String) null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVar2 = f23029v;
            a aVar = f23030w;
            g gVar = null;
            int i11 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                d dVar = (d) arrayDeque.peek();
                if (i11 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar2 = p(newPullParser);
                            aVar = n(newPullParser, f23030w);
                            cVar = v(newPullParser);
                        }
                        C0206c cVar2 = cVar;
                        b bVar3 = bVar2;
                        a aVar2 = aVar;
                        if (!m(name)) {
                            Log.i("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            i11++;
                            bVar = bVar3;
                        } else if ("head".equals(name)) {
                            bVar = bVar3;
                            q(newPullParser, hashMap, aVar2, cVar2, hashMap2, hashMap3);
                        } else {
                            bVar = bVar3;
                            try {
                                d r10 = r(newPullParser, dVar, hashMap2, bVar);
                                arrayDeque.push(r10);
                                if (dVar != null) {
                                    dVar.a(r10);
                                }
                            } catch (g e10) {
                                p.d("TtmlDecoder", "Suppressing parser error", e10);
                                i11++;
                            }
                        }
                        bVar2 = bVar;
                        cVar = cVar2;
                        aVar = aVar2;
                    } else if (eventType == 4) {
                        dVar.getClass();
                        d b10 = d.b(newPullParser.getText());
                        if (dVar.f23050m == null) {
                            dVar.f23050m = new ArrayList();
                        }
                        dVar.f23050m.add(b10);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            d dVar2 = (d) arrayDeque.peek();
                            dVar2.getClass();
                            gVar = new g(dVar2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i11++;
                } else if (eventType == 3) {
                    i11--;
                }
                newPullParser.next();
            }
            if (gVar != null) {
                return gVar;
            }
            throw new g("No TTML subtitles found");
        } catch (XmlPullParserException e11) {
            throw new g("Unable to decode source", e11);
        } catch (IOException e12) {
            throw new IllegalStateException("Unexpected error when reading input.", e12);
        }
    }
}

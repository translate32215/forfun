package h5;

import ba.a;
import ba.h;
import ba.o0;
import ba.q;
import ba.s;
import h5.b;
import j.f;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import v6.f0;

/* compiled from: XmpMotionPhotoDescriptionParser */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f18911a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f18912b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f18913c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        if (r10 == -1) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        r10 = -9223372036854775807L;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static h5.b a(java.lang.String r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()
            java.io.StringReader r1 = new java.io.StringReader
            r2 = r25
            r1.<init>(r2)
            r0.setInput(r1)
            r0.next()
            java.lang.String r1 = "x:xmpmeta"
            boolean r2 = v6.f0.d(r0, r1)
            if (r2 == 0) goto L_0x00e8
            ba.a<java.lang.Object> r2 = ba.s.f3795b
            ba.s<java.lang.Object> r2 = ba.o0.f3765e
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r3
        L_0x0027:
            r0.next()
            java.lang.String r7 = "rdf:Description"
            boolean r7 = v6.f0.d(r0, r7)
            r8 = 0
            if (r7 == 0) goto L_0x00b4
            java.lang.String[] r2 = f18911a
            int r5 = r2.length
            r6 = 0
            r7 = 0
        L_0x0038:
            r9 = 1
            if (r7 >= r5) goto L_0x004b
            r10 = r2[r7]
            java.lang.String r10 = v6.f0.a(r0, r10)
            if (r10 == 0) goto L_0x004d
            int r2 = java.lang.Integer.parseInt(r10)
            if (r2 != r9) goto L_0x004b
            r2 = 1
            goto L_0x0050
        L_0x004b:
            r2 = 0
            goto L_0x0050
        L_0x004d:
            int r7 = r7 + 1
            goto L_0x0038
        L_0x0050:
            if (r2 != 0) goto L_0x0053
            return r8
        L_0x0053:
            java.lang.String[] r2 = f18912b
            int r5 = r2.length
            r7 = 0
        L_0x0057:
            if (r7 >= r5) goto L_0x006b
            r10 = r2[r7]
            java.lang.String r10 = v6.f0.a(r0, r10)
            if (r10 == 0) goto L_0x006d
            long r10 = java.lang.Long.parseLong(r10)
            r12 = -1
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0070
        L_0x006b:
            r10 = r3
            goto L_0x0070
        L_0x006d:
            int r7 = r7 + 1
            goto L_0x0057
        L_0x0070:
            java.lang.String[] r2 = f18913c
            int r5 = r2.length
            r7 = 0
        L_0x0074:
            if (r7 >= r5) goto L_0x00ae
            r12 = r2[r7]
            java.lang.String r12 = v6.f0.a(r0, r12)
            if (r12 == 0) goto L_0x00ab
            long r16 = java.lang.Long.parseLong(r12)
            h5.b$a r2 = new h5.b$a
            r21 = 0
            r23 = 0
            java.lang.String r19 = "image/jpeg"
            java.lang.String r20 = "Primary"
            r18 = r2
            r18.<init>(r19, r20, r21, r23)
            h5.b$a r5 = new h5.b$a
            r18 = 0
            java.lang.String r14 = "video/mp4"
            java.lang.String r15 = "MotionPhoto"
            r13 = r5
            r13.<init>(r14, r15, r16, r18)
            ba.a<java.lang.Object> r7 = ba.s.f3795b
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r6] = r2
            r7[r9] = r5
            ba.s r2 = ba.s.y(r7)
            goto L_0x00b2
        L_0x00ab:
            int r7 = r7 + 1
            goto L_0x0074
        L_0x00ae:
            ba.a<java.lang.Object> r2 = ba.s.f3795b
            ba.s<java.lang.Object> r2 = ba.o0.f3765e
        L_0x00b2:
            r5 = r10
            goto L_0x00d5
        L_0x00b4:
            java.lang.String r7 = "Container:Directory"
            boolean r7 = v6.f0.d(r0, r7)
            if (r7 == 0) goto L_0x00c5
            java.lang.String r2 = "Container"
            java.lang.String r7 = "Item"
            ba.s r2 = b(r0, r2, r7)
            goto L_0x00d5
        L_0x00c5:
            java.lang.String r7 = "GContainer:Directory"
            boolean r7 = v6.f0.d(r0, r7)
            if (r7 == 0) goto L_0x00d5
            java.lang.String r2 = "GContainer"
            java.lang.String r7 = "GContainerItem"
            ba.s r2 = b(r0, r2, r7)
        L_0x00d5:
            boolean r7 = v6.f0.b(r0, r1)
            if (r7 == 0) goto L_0x0027
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x00e2
            return r8
        L_0x00e2:
            h5.b r0 = new h5.b
            r0.<init>(r5, r2)
            return r0
        L_0x00e8:
            x4.m0 r0 = new x4.m0
            java.lang.String r1 = "Couldn't find xmp metadata"
            r0.<init>((java.lang.String) r1)
            goto L_0x00f1
        L_0x00f0:
            throw r0
        L_0x00f1:
            goto L_0x00f0
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.e.a(java.lang.String):h5.b");
    }

    public static s<b.a> b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String str3 = str;
        String str4 = str2;
        a<Object> aVar = s.f3795b;
        h.b(4, "initialCapacity");
        Object[] objArr = new Object[4];
        String a10 = f.a(str3, ":Item");
        String a11 = f.a(str3, ":Directory");
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (f0.d(xmlPullParser2, a10)) {
                String a12 = f.a(str4, ":Mime");
                String a13 = f.a(str4, ":Semantic");
                String a14 = f.a(str4, ":Length");
                String a15 = f.a(str4, ":Padding");
                String a16 = f0.a(xmlPullParser2, a12);
                String a17 = f0.a(xmlPullParser2, a13);
                String a18 = f0.a(xmlPullParser2, a14);
                String a19 = f0.a(xmlPullParser2, a15);
                if (a16 == null || a17 == null) {
                    return o0.f3765e;
                }
                b.a aVar2 = new b.a(a16, a17, a18 != null ? Long.parseLong(a18) : 0, a19 != null ? Long.parseLong(a19) : 0);
                int i11 = i10 + 1;
                if (objArr.length < i11) {
                    objArr = Arrays.copyOf(objArr, q.b.a(objArr.length, i11));
                }
                objArr[i10] = aVar2;
                i10 = i11;
            }
        } while (!f0.b(xmlPullParser2, a11));
        return s.x(objArr, i10);
    }
}

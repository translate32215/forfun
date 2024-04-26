package f0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l0.h;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: FontResourcesParserCompat */
public class e {

    /* compiled from: FontResourcesParserCompat */
    public static class a {
        public static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    /* compiled from: FontResourcesParserCompat */
    public interface b {
    }

    /* compiled from: FontResourcesParserCompat */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final d[] f18033a;

        public c(d[] dVarArr) {
            this.f18033a = dVarArr;
        }
    }

    /* compiled from: FontResourcesParserCompat */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f18034a;

        /* renamed from: b  reason: collision with root package name */
        public final int f18035b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f18036c;

        /* renamed from: d  reason: collision with root package name */
        public final String f18037d;

        /* renamed from: e  reason: collision with root package name */
        public final int f18038e;

        /* renamed from: f  reason: collision with root package name */
        public final int f18039f;

        public d(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f18034a = str;
            this.f18035b = i10;
            this.f18036c = z10;
            this.f18037d = str2;
            this.f18038e = i11;
            this.f18039f = i12;
        }
    }

    /* renamed from: f0.e$e  reason: collision with other inner class name */
    /* compiled from: FontResourcesParserCompat */
    public static final class C0137e implements b {

        /* renamed from: a  reason: collision with root package name */
        public final h f18040a;

        /* renamed from: b  reason: collision with root package name */
        public final int f18041b;

        /* renamed from: c  reason: collision with root package name */
        public final int f18042c;

        /* renamed from: d  reason: collision with root package name */
        public final String f18043d;

        public C0137e(h hVar, int i10, int i11, String str) {
            this.f18040a = hVar;
            this.f18042c = i10;
            this.f18041b = i11;
            this.f18043d = str;
        }
    }

    public static b a(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        Resources resources2 = resources;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlPullParser.require(2, (String) null, "font-family");
            if (xmlPullParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources2.obtainAttributes(Xml.asAttributeSet(xmlPullParser), b0.a.f3340b);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string == null || string2 == null || string3 == null) {
                    ArrayList arrayList = new ArrayList();
                    while (xmlPullParser.next() != 3) {
                        if (xmlPullParser.getEventType() == 2) {
                            if (xmlPullParser.getName().equals("font")) {
                                TypedArray obtainAttributes2 = resources2.obtainAttributes(Xml.asAttributeSet(xmlPullParser), b0.a.f3341c);
                                int i10 = 8;
                                if (!obtainAttributes2.hasValue(8)) {
                                    i10 = 1;
                                }
                                int i11 = obtainAttributes2.getInt(i10, 400);
                                boolean z10 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                                int i12 = 9;
                                if (!obtainAttributes2.hasValue(9)) {
                                    i12 = 3;
                                }
                                int i13 = 7;
                                if (!obtainAttributes2.hasValue(7)) {
                                    i13 = 4;
                                }
                                String string5 = obtainAttributes2.getString(i13);
                                int i14 = obtainAttributes2.getInt(i12, 0);
                                int i15 = obtainAttributes2.hasValue(5) ? 5 : 0;
                                int resourceId2 = obtainAttributes2.getResourceId(i15, 0);
                                String string6 = obtainAttributes2.getString(i15);
                                obtainAttributes2.recycle();
                                while (xmlPullParser.next() != 3) {
                                    c(xmlPullParser);
                                }
                                arrayList.add(new d(string6, i11, z10, string5, i14, resourceId2));
                            } else {
                                c(xmlPullParser);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return new c((d[]) arrayList.toArray(new d[0]));
                    }
                } else {
                    while (xmlPullParser.next() != 3) {
                        c(xmlPullParser);
                    }
                    return new C0137e(new h(string, string2, string3, b(resources2, resourceId)), integer, integer2, string4);
                }
            } else {
                c(xmlPullParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> b(Resources resources, int i10) {
        int i11;
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 21) {
                i11 = a.a(obtainTypedArray, 0);
            } else {
                TypedValue typedValue = new TypedValue();
                obtainTypedArray.getValue(0, typedValue);
                i11 = typedValue.type;
            }
            if (i11 == 1) {
                for (int i12 = 0; i12 < obtainTypedArray.length(); i12++) {
                    int resourceId = obtainTypedArray.getResourceId(i12, 0);
                    if (resourceId != 0) {
                        arrayList.add(d(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(d(resources.getStringArray(i10)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public static List<byte[]> d(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }
}

package v6;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: XmlPullParserUtil */
public final class f0 {
    public static String a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static boolean b(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        if (!(xmlPullParser.getEventType() == 3) || !xmlPullParser.getName().equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean c(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean d(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return c(xmlPullParser) && xmlPullParser.getName().equals(str);
    }
}

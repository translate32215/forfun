package ze;

import androidx.activity.e;
import androidx.leanback.widget.s;
import ff.a;
import org.cybergarage.xml.Parser;

/* compiled from: UPnP */
public class l {

    /* renamed from: a  reason: collision with root package name */
    public static Parser f28874a;

    public static final String a() {
        long currentTimeMillis = System.currentTimeMillis();
        double currentTimeMillis2 = (double) System.currentTimeMillis();
        double random = Math.random();
        Double.isNaN(currentTimeMillis2);
        long j10 = (long) (random * currentTimeMillis2);
        return String.valueOf(d((int) (currentTimeMillis & 65535))) + "-" + d(((int) ((currentTimeMillis >> 32) | 40960)) & 65535) + "-" + d((int) (65535 & j10)) + "-" + d(65535 & ((int) ((j10 >> 32) | 57344)));
    }

    public static final String b() {
        String property = System.getProperty("os.name");
        String property2 = System.getProperty("os.version");
        StringBuilder sb2 = new StringBuilder(String.valueOf(property));
        s.a(sb2, "/", property2, " UPnP/1.0 ", "CyberLinkJava");
        return e.a(sb2, "/", "1.8");
    }

    public static final Parser c() {
        Parser parser;
        if (f28874a == null) {
            int i10 = 0;
            String[] strArr = {System.getProperty("cyberlink.upnp.xml.parser"), "org.cybergarage.xml.parser.XmlPullParser", "org.cybergarage.xml.parser.JaxpParser", "org.cybergarage.xml.parser.kXML2Parser", "org.cybergarage.xml.parser.XercesParser"};
            while (true) {
                if (i10 >= 5) {
                    parser = null;
                    break;
                }
                if (strArr[i10] != null) {
                    try {
                        parser = (Parser) Class.forName(strArr[i10]).newInstance();
                        break;
                    } catch (Throwable th) {
                        a.c("Unable to load " + strArr[i10] + " as XMLParser due to " + th);
                    }
                }
                i10++;
            }
            f28874a = parser;
            if (parser != null) {
                e.a.f13500a = parser;
            } else {
                throw new RuntimeException("No XML parser defined. And unable to laod any. \nTry to invoke UPnP.setXMLParser before UPnP.getXMLParser");
            }
        }
        return f28874a;
    }

    public static final String d(int i10) {
        String num = Integer.toString(i10 & 65535, 16);
        String str = "";
        for (int i11 = 0; i11 < 4 - num.length(); i11++) {
            str = String.valueOf(str) + "0";
        }
        return String.valueOf(str) + num;
    }
}

package ce;

import java.nio.charset.Charset;
import ud.k;

/* compiled from: Charsets.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f4384a;

    static {
        Charset forName = Charset.forName("UTF-8");
        k.e(forName, "forName(\"UTF-8\")");
        f4384a = forName;
        k.e(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
        k.e(Charset.forName("UTF-16BE"), "forName(\"UTF-16BE\")");
        k.e(Charset.forName("UTF-16LE"), "forName(\"UTF-16LE\")");
        k.e(Charset.forName("US-ASCII"), "forName(\"US-ASCII\")");
        k.e(Charset.forName("ISO-8859-1"), "forName(\"ISO-8859-1\")");
    }
}

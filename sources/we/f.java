package we;

import a6.b;
import androidx.leanback.widget.s;
import d7.m;

/* compiled from: HTTPResponse */
public class f extends m {

    /* renamed from: f  reason: collision with root package name */
    public int f27220f = 0;

    public f() {
        this.f13211b = "1.1";
        s("Content-Type", "text/html; charset=\"utf-8\"");
        String property = System.getProperty("os.name");
        String property2 = System.getProperty("os.version");
        StringBuilder sb2 = new StringBuilder(String.valueOf(property));
        s.a(sb2, "/", property2, " ", "CyberHTTP");
        sb2.append("/");
        sb2.append("1.0");
        s("Server", sb2.toString());
        o("");
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(x());
        stringBuffer.append(f());
        stringBuffer.append("\r\n");
        stringBuffer.append(b());
        return stringBuffer.toString();
    }

    public String v() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(x());
        stringBuffer.append(f());
        return stringBuffer.toString();
    }

    public int w() {
        int i10 = this.f27220f;
        if (i10 != 0) {
            return i10;
        }
        return new b(this.f13213d).f124b;
    }

    public String x() {
        return "HTTP/" + this.f13211b + " " + w() + " " + b.a(this.f27220f) + "\r\n";
    }

    public boolean y() {
        int w10 = w();
        return 200 <= w10 && w10 < 300;
    }

    public f(f fVar) {
        m(fVar);
    }
}

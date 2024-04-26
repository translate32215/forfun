package we;

import ff.a;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.StringReader;

/* compiled from: HTTPHeader */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public String f27212a;

    /* renamed from: b  reason: collision with root package name */
    public String f27213b;

    public c(String str, String str2) {
        this.f27212a = str;
        this.f27213b = str2;
    }

    public static final String a(byte[] bArr, String str) {
        String str2 = new String(bArr);
        LineNumberReader lineNumberReader = new LineNumberReader(new StringReader(str2), Math.min(str2.length(), 1024));
        String upperCase = str.toUpperCase();
        try {
            String readLine = lineNumberReader.readLine();
            while (true) {
                if (readLine == null) {
                    break;
                } else if (readLine.length() <= 0) {
                    break;
                } else {
                    c cVar = new c(readLine);
                    if (!cVar.b()) {
                        readLine = lineNumberReader.readLine();
                    } else if (cVar.f27212a.toUpperCase().equals(upperCase)) {
                        return cVar.f27213b;
                    } else {
                        readLine = lineNumberReader.readLine();
                    }
                }
            }
        } catch (IOException e10) {
            a.b(e10);
        }
        return "";
    }

    public boolean b() {
        String str = this.f27212a;
        return str != null && str.length() > 0;
    }

    public c(String str) {
        this.f27212a = "";
        this.f27213b = "";
        int indexOf = str.indexOf(58);
        if (indexOf >= 0) {
            String str2 = new String(str.getBytes(), 0, indexOf);
            String str3 = new String(str.getBytes(), indexOf + 1, (str.length() - indexOf) - 1);
            this.f27212a = str2.trim();
            this.f27213b = str3.trim();
        }
    }
}

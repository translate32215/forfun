package oe;

import j.f;
import java.io.IOException;
import java.net.ProtocolException;
import ke.x;

/* compiled from: StatusLine */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final x f23718a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23719b;

    /* renamed from: c  reason: collision with root package name */
    public final String f23720c;

    public j(x xVar, int i10, String str) {
        this.f23718a = xVar;
        this.f23719b = i10;
        this.f23720c = str;
    }

    public static j a(String str) throws IOException {
        String str2;
        x xVar = x.HTTP_1_0;
        int i10 = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(f.a("Unexpected status line: ", str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt == 1) {
                    xVar = x.HTTP_1_1;
                } else {
                    throw new ProtocolException(f.a("Unexpected status line: ", str));
                }
            }
        } else if (str.startsWith("ICY ")) {
            i10 = 4;
        } else {
            throw new ProtocolException(f.a("Unexpected status line: ", str));
        }
        int i11 = i10 + 3;
        if (str.length() >= i11) {
            try {
                int parseInt = Integer.parseInt(str.substring(i10, i11));
                if (str.length() <= i11) {
                    str2 = "";
                } else if (str.charAt(i11) == ' ') {
                    str2 = str.substring(i10 + 4);
                } else {
                    throw new ProtocolException(f.a("Unexpected status line: ", str));
                }
                return new j(xVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(f.a("Unexpected status line: ", str));
            }
        } else {
            throw new ProtocolException(f.a("Unexpected status line: ", str));
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f23718a == x.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb2.append(' ');
        sb2.append(this.f23719b);
        if (this.f23720c != null) {
            sb2.append(' ');
            sb2.append(this.f23720c);
        }
        return sb2.toString();
    }
}

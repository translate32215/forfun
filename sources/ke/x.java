package ke;

import j.f;
import java.io.IOException;

/* compiled from: Protocol */
public enum x {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: a  reason: collision with root package name */
    public final String f20869a;

    /* access modifiers changed from: public */
    x(String str) {
        this.f20869a = str;
    }

    public static x a(String str) throws IOException {
        x xVar = HTTP_1_0;
        if (str.equals("http/1.0")) {
            return xVar;
        }
        x xVar2 = HTTP_1_1;
        if (str.equals("http/1.1")) {
            return xVar2;
        }
        x xVar3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals("h2_prior_knowledge")) {
            return xVar3;
        }
        x xVar4 = HTTP_2;
        if (str.equals("h2")) {
            return xVar4;
        }
        x xVar5 = SPDY_3;
        if (str.equals("spdy/3.1")) {
            return xVar5;
        }
        x xVar6 = QUIC;
        if (str.equals("quic")) {
            return xVar6;
        }
        throw new IOException(f.a("Unexpected protocol: ", str));
    }

    public String toString() {
        return this.f20869a;
    }
}

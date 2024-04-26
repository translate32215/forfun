package q5;

import j.f;
import r5.b;
import v5.g;
import x4.b0;
import x5.c;

/* compiled from: MetadataDecoderFactory */
public interface d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f24151a = new a();

    /* compiled from: MetadataDecoderFactory */
    public class a implements d {
        public boolean h(b0 b0Var) {
            String str = b0Var.f27408t;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        public c i(b0 b0Var) {
            String str = b0Var.f27408t;
            if (str != null) {
                str.hashCode();
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1354451219:
                        if (str.equals("application/vnd.dvb.ait")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1348231605:
                        if (str.equals("application/x-icy")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str.equals("application/id3")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str.equals("application/x-emsg")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str.equals("application/x-scte35")) {
                            c10 = 4;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        return new b();
                    case 1:
                        return new u5.a();
                    case 2:
                        return new g();
                    case 3:
                        return new s5.b();
                    case 4:
                        return new c();
                }
            }
            throw new IllegalArgumentException(f.a("Attempted to create decoder for unsupported MIME type: ", str));
        }
    }

    boolean h(b0 b0Var);

    c i(b0 b0Var);
}

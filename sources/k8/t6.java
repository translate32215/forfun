package k8;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public class t6 extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f20476a = 0;

    public t6(String str) {
        super(str);
    }

    public static t6 a() {
        return new t6("Protocol message had invalid UTF-8.");
    }

    public static t6 b() {
        return new t6("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static t6 c() {
        return new t6("Failed to parse the message.");
    }

    public static t6 d() {
        return new t6("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}

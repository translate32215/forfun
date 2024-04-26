package e8;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public class f80 extends IOException {
    public f80(String str) {
        super(str);
    }

    public static f80 a() {
        return new f80("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static f80 b() {
        return new f80("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static f80 c() {
        return new f80("CodedInputStream encountered a malformed varint.");
    }

    public static f80 d() {
        return new f80("Protocol message contained an invalid tag (zero).");
    }

    public static f80 e() {
        return new f80("Protocol message end-group tag did not match expected tag.");
    }

    public static e80 f() {
        return new e80("Protocol message tag had invalid wire type.");
    }

    public static f80 g() {
        return new f80("Failed to parse the message.");
    }

    public static f80 h() {
        return new f80("Protocol message had invalid UTF-8.");
    }
}

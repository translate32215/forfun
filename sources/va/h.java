package va;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* compiled from: RandomFidGenerator */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public static final byte f26695a = Byte.parseByte("01110000", 2);

    /* renamed from: b  reason: collision with root package name */
    public static final byte f26696b = Byte.parseByte("00001111", 2);

    public String a() {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[17]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        byte[] array = wrap.array();
        array[16] = array[0];
        array[0] = (byte) ((f26696b & array[0]) | f26695a);
        return new String(Base64.encode(array, 11), Charset.defaultCharset()).substring(0, 22);
    }
}

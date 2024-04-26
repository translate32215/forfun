package u5;

import aa.c;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q5.e;
import q5.h;
import v6.e0;

/* compiled from: IcyDecoder */
public final class a extends h {

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f26026c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a  reason: collision with root package name */
    public final CharsetDecoder f26027a = c.f178c.newDecoder();

    /* renamed from: b  reason: collision with root package name */
    public final CharsetDecoder f26028b = c.f177b.newDecoder();

    /* JADX INFO: finally extract failed */
    public q5.a b(e eVar, ByteBuffer byteBuffer) {
        String str;
        String str2 = null;
        try {
            str = this.f26027a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                str = this.f26028b.decode(byteBuffer).toString();
                this.f26028b.reset();
                byteBuffer.rewind();
            } catch (CharacterCodingException unused2) {
                this.f26028b.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                this.f26028b.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.f26027a.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new q5.a(new c(bArr, (String) null, (String) null));
        }
        Matcher matcher = f26026c.matcher(str);
        String str3 = null;
        for (int i10 = 0; matcher.find(i10); i10 = matcher.end()) {
            String V = e0.V(matcher.group(1));
            String group = matcher.group(2);
            if (V != null) {
                if (V.equals("streamurl")) {
                    str3 = group;
                } else if (V.equals("streamtitle")) {
                    str2 = group;
                }
            }
        }
        return new q5.a(new c(bArr, str2, str3));
    }
}

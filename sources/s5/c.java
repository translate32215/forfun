package s5;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: EventMessageEncoder */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final ByteArrayOutputStream f24963a;

    /* renamed from: b  reason: collision with root package name */
    public final DataOutputStream f24964b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f24963a = byteArrayOutputStream;
        this.f24964b = new DataOutputStream(byteArrayOutputStream);
    }

    public static void b(DataOutputStream dataOutputStream, long j10) throws IOException {
        dataOutputStream.writeByte(((int) (j10 >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j10 >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j10 >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j10) & 255);
    }

    public byte[] a(a aVar) {
        this.f24963a.reset();
        try {
            DataOutputStream dataOutputStream = this.f24964b;
            dataOutputStream.writeBytes(aVar.f24957a);
            dataOutputStream.writeByte(0);
            String str = aVar.f24958b;
            if (str == null) {
                str = "";
            }
            DataOutputStream dataOutputStream2 = this.f24964b;
            dataOutputStream2.writeBytes(str);
            dataOutputStream2.writeByte(0);
            b(this.f24964b, aVar.f24959c);
            b(this.f24964b, aVar.f24960d);
            this.f24964b.write(aVar.f24961e);
            this.f24964b.flush();
            return this.f24963a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}

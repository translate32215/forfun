package k5;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.UUID;
import v6.v;

/* compiled from: PsshAtomUtil */
public final class j {

    /* compiled from: PsshAtomUtil */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final UUID f19984a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19985b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f19986c;

        public a(UUID uuid, int i10, byte[] bArr) {
            this.f19984a = uuid;
            this.f19985b = i10;
            this.f19986c = bArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, (UUID[]) null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (!(bArr == null || bArr.length == 0)) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static a c(byte[] bArr) {
        v vVar = new v(bArr);
        if (vVar.f26520c < 32) {
            return null;
        }
        vVar.D(0);
        if (vVar.f() != vVar.a() + 4 || vVar.f() != 1886614376) {
            return null;
        }
        int f10 = (vVar.f() >> 24) & 255;
        if (f10 > 1) {
            f0.j.a("Unsupported pssh version: ", f10, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(vVar.m(), vVar.m());
        if (f10 == 1) {
            vVar.E(vVar.v() * 16);
        }
        int v10 = vVar.v();
        if (v10 != vVar.a()) {
            return null;
        }
        byte[] bArr2 = new byte[v10];
        System.arraycopy(vVar.f26518a, vVar.f26519b, bArr2, 0, v10);
        vVar.f26519b += v10;
        return new a(uuid, f10, bArr2);
    }

    public static byte[] d(byte[] bArr, UUID uuid) {
        a c10 = c(bArr);
        if (c10 == null) {
            return null;
        }
        if (uuid.equals(c10.f19984a)) {
            return c10.f19986c;
        }
        Log.w("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + c10.f19984a + ".");
        return null;
    }
}

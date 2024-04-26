package c5;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import c5.f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: ExoMediaDrm */
public interface q {

    /* compiled from: ExoMediaDrm */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f4337a;

        /* renamed from: b  reason: collision with root package name */
        public final String f4338b;

        public a(byte[] bArr, String str, int i10) {
            this.f4337a = bArr;
            this.f4338b = str;
        }
    }

    /* compiled from: ExoMediaDrm */
    public interface b {
    }

    /* compiled from: ExoMediaDrm */
    public interface c {
        q a(UUID uuid);
    }

    /* compiled from: ExoMediaDrm */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f4339a;

        /* renamed from: b  reason: collision with root package name */
        public final String f4340b;

        public d(byte[] bArr, String str) {
            this.f4339a = bArr;
            this.f4340b = str;
        }
    }

    void a();

    Class<? extends p> b();

    void c(byte[] bArr, byte[] bArr2);

    Map<String, String> d(byte[] bArr);

    void e(byte[] bArr);

    byte[] f(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    p g(byte[] bArr) throws MediaCryptoException;

    d h();

    void i(byte[] bArr) throws DeniedByServerException;

    a j(byte[] bArr, List<f.b> list, int i10, HashMap<String, String> hashMap) throws NotProvisionedException;

    void k(b bVar);

    byte[] l() throws MediaDrmException;
}

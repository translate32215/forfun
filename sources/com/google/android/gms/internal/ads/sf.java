package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import b7.a;
import com.google.android.gms.internal.ads.ma;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.UUID;
import s7.f;
import s7.g;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class sf implements uf {

    /* renamed from: a  reason: collision with root package name */
    public static final ma f8123a = ma.W();

    public final ma a() {
        return f8123a;
    }

    public final ma b(Context context) throws IOException, f, g {
        ma.a V = ma.V();
        a aVar = new a(context, 30000, false, false);
        aVar.d(true);
        a.C0050a f10 = aVar.f(-1);
        String str = f10.f3648a;
        if (str != null && str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(str);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            str = Base64.encodeToString(bArr, 11);
        }
        if (str != null) {
            V.p(str);
            boolean z10 = f10.f3649b;
            if (V.f5971c) {
                V.n();
                V.f5971c = false;
            }
            ma.G((ma) V.f5970b, z10);
            ma.c cVar = ma.c.DEVICE_IDENTIFIER_ANDROID_AD_ID;
            if (V.f5971c) {
                V.n();
                V.f5971c = false;
            }
            ma.B((ma) V.f5970b, cVar);
        }
        return (ma) ((aq) V.j());
    }
}

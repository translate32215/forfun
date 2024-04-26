package e8;

import com.google.android.gms.internal.ads.a9;
import com.google.android.gms.internal.ads.v8;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ya extends v8 {

    /* renamed from: c  reason: collision with root package name */
    public static final ya f17588c = new ya();

    public final a9 b(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new ti();
        }
        if ("mvhd".equals(str)) {
            return new kk();
        }
        return new ak(str);
    }
}

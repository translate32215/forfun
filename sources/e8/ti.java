package e8;

import com.google.android.gms.internal.ads.a9;
import com.google.android.gms.internal.ads.dr;
import com.google.android.gms.internal.ads.o7;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ti extends dr implements a9 {

    /* renamed from: h  reason: collision with root package name */
    public String f16761h = "moov";

    /* renamed from: i  reason: collision with root package name */
    public boolean f16762i;

    public final void a(o7 o7Var, ByteBuffer byteBuffer, long j10, oh ohVar) {
        o7Var.a();
        byteBuffer.remaining();
        this.f16762i = byteBuffer.remaining() == 16;
        s(o7Var, j10, ohVar);
    }

    public final /* bridge */ /* synthetic */ void d(lj ljVar) {
    }

    public final String o() {
        return this.f16761h;
    }

    public final void s(o7 o7Var, long j10, oh ohVar) {
        this.f6234b = o7Var;
        this.f6236d = o7Var.a();
        o7Var.d(o7Var.a() + j10);
        this.f6237e = o7Var.a();
        this.f6233a = ohVar;
    }
}

package e8;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.internal.ads.k5;
import f7.n;
import f7.p;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class qr extends k5 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ or f16197a;

    public qr(or orVar) {
        this.f16197a = orVar;
    }

    public final void d6(n nVar) {
        this.f16197a.f15833a.c(new p(nVar.f18306a, nVar.f18307b));
    }

    public final void f1(ParcelFileDescriptor parcelFileDescriptor) {
        this.f16197a.f15833a.b(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}

package e8;

import android.os.Parcel;
import com.google.android.gms.internal.ads.ky;
import com.google.android.gms.internal.ads.os;
import z6.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class qi0 extends os implements ky {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f16176b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final a f16177a;

    public qi0(a aVar) {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
        this.f16177a = aVar;
    }

    public final void a(String str, String str2) {
        this.f16177a.a(str, str2);
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        this.f16177a.a(parcel.readString(), parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}

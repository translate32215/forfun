package e8;

import android.os.Parcel;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.os;
import com.google.android.gms.internal.ads.v1;
import d7.l;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ar extends os implements v1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f13741a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f13742b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f13743c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d7 f13744d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ yq f13745e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ar(yq yqVar, Object obj, String str, long j10, d7 d7Var) {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        this.f13745e = yqVar;
        this.f13741a = obj;
        this.f13742b = str;
        this.f13743c = j10;
        this.f13744d = d7Var;
    }

    public final void M3(String str) {
        synchronized (this.f13741a) {
            yq.a(this.f13745e, this.f13742b, false, str, (int) (l.B.f13193j.a() - this.f13743c));
            this.f13745e.f17659k.e(this.f13742b, "error");
            this.f13745e.f17662n.g(this.f13742b, "error");
            this.f13744d.b(Boolean.FALSE);
        }
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            synchronized (this.f13741a) {
                yq.a(this.f13745e, this.f13742b, true, "", (int) (l.B.f13193j.a() - this.f13743c));
                this.f13745e.f17659k.d(this.f13742b);
                fl flVar = this.f13745e.f17662n;
                String str = this.f13742b;
                flVar.getClass();
                flVar.I0(new l8(str, 2));
                this.f13744d.b(Boolean.TRUE);
            }
        } else if (i10 != 3) {
            return false;
        } else {
            M3(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}

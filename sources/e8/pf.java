package e8;

import com.google.android.gms.internal.ads.Cif;
import com.google.android.gms.internal.ads.f9;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class pf implements ta0<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15998a;

    public pf(int i10) {
        this.f15998a = i10;
    }

    public final Object get() {
        switch (this.f15998a) {
            case 0:
                return "app_open_ad";
            case 1:
                return new f9();
            default:
                return new ss("ttc", Cif.SIGNALS, Cif.RENDERER);
        }
    }
}

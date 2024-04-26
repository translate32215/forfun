package e8;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.a4;
import com.google.android.gms.internal.ads.hz;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.y8;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class yt implements y8 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17666a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f17667b;

    public yt(t7 t7Var) {
        this.f17667b = t7Var;
    }

    public final hz getVideoController() {
        switch (this.f17666a) {
            case 0:
                return ((t7) this.f17667b).o();
            default:
                try {
                    return ((a4) ((mt) this.f17667b).f15550b).getVideoController();
                } catch (RemoteException e10) {
                    throw new b10(e10);
                }
        }
    }

    public yt(mt mtVar) {
        this.f17667b = mtVar;
    }
}

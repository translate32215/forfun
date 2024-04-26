package e8;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.fr;
import com.google.android.gms.internal.ads.ji;
import com.google.android.gms.internal.ads.ma;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ib0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15011a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f15012b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ fr f15013c;

    public ib0(fr frVar, int i10, boolean z10) {
        this.f15013c = frVar;
        this.f15011a = i10;
        this.f15012b = z10;
    }

    public final void run() {
        ma maVar;
        fr frVar = this.f15013c;
        int i10 = this.f15011a;
        boolean z10 = this.f15012b;
        frVar.getClass();
        if (i10 > 0 && z10) {
            try {
                Thread.sleep((long) (i10 * 1000));
            } catch (InterruptedException unused) {
            }
        }
        boolean z11 = false;
        try {
            PackageInfo packageInfo = frVar.f6479a.getPackageManager().getPackageInfo(frVar.f6479a.getPackageName(), 0);
            Context context = frVar.f6479a;
            maVar = ji.c(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            maVar = null;
        }
        this.f15013c.f6488j = maVar;
        if (this.f15011a < 4 && (maVar == null || !maVar.P() || maVar.M().equals("0000000000000000000000000000000000000000000000000000000000000000") || !maVar.T() || !maVar.U().y() || maVar.U().z() == -2)) {
            z11 = true;
        }
        if (z11) {
            this.f15013c.c(this.f15011a + 1, this.f15012b);
        }
    }
}

package f7;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.util.p;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class l implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f18301a;

    public l(m mVar) {
        this.f18301a = mVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        p pVar = d7.l.B.f13186c;
        p.q(this.f18301a.f18302a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}

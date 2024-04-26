package f7;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.p;
import d7.l;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class h implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final g f18282a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18283b;

    public h(g gVar, String str) {
        this.f18282a = gVar;
        this.f18283b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        g gVar = this.f18282a;
        String str = this.f18283b;
        gVar.getClass();
        p pVar = l.B.f13186c;
        p.e(gVar.f18269a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }
}

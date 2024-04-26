package e8;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class g6 implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f6 f14708a;

    public g6(f6 f6Var) {
        this.f14708a = f6Var;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f14708a.s("User canceled the download.");
    }
}

package e8;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class c6 implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a6 f14086a;

    public c6(a6 a6Var) {
        this.f14086a = a6Var;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f14086a.s("Operation denied by user.");
    }
}

package xc;

import android.content.DialogInterface;
import dev.pankaj.ytvclib.ui.main.PlayerActivity;
import ud.k;

public final /* synthetic */ class b implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f27927a;

    public /* synthetic */ b(PlayerActivity playerActivity) {
        this.f27927a = playerActivity;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        PlayerActivity playerActivity = this.f27927a;
        PlayerActivity.a aVar = PlayerActivity.f13437n0;
        k.f(playerActivity, "this$0");
        playerActivity.S = false;
    }
}

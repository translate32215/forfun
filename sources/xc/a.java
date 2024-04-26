package xc;

import android.content.DialogInterface;
import android.content.Intent;
import dev.pankaj.ytvclib.ui.dlna.ControlActivity;
import dev.pankaj.ytvclib.ui.main.PlayerActivity;
import java.util.List;
import ud.k;
import wc.j;
import ze.f;

public final /* synthetic */ class a implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List f27925a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f27926b;

    public /* synthetic */ a(List list, PlayerActivity playerActivity) {
        this.f27925a = list;
        this.f27926b = playerActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        List list = this.f27925a;
        PlayerActivity playerActivity = this.f27926b;
        PlayerActivity.a aVar = PlayerActivity.f13437n0;
        k.f(list, "$devices");
        k.f(playerActivity, "this$0");
        j jVar = j.f27200c;
        j.f27201d.f27203b = (f) list.get(i10);
        Intent intent = new Intent(playerActivity.getApplicationContext(), ControlActivity.class);
        intent.putExtra("channel", playerActivity.K);
        playerActivity.startActivity(intent);
        playerActivity.finish();
    }
}

package oc;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import com.startapp.startappsdk.R;
import dev.pankaj.ytvclib.ui.main.PlayerActivity;
import sc.k;

/* compiled from: Utils.kt */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f23682a = new e();

    public final void a(Context context, int i10, long j10, k kVar) {
        Intent intent;
        ud.k.f(context, "context");
        Integer valueOf = kVar != null ? Integer.valueOf(kVar.e()) : null;
        if (valueOf != null && valueOf.intValue() == 2) {
            intent = new Intent("android.intent.action.VIEW");
            intent.setClassName(kVar.d(), "dev.pankaj.ytvplayer.ui.splash.SplashActivity");
        } else {
            intent = new Intent(context, PlayerActivity.class);
        }
        intent.putExtra("id", j10);
        intent.putExtra("type", i10);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e10) {
            e10.printStackTrace();
            if (kVar != null) {
                b.a aVar = new b.a(context, 2132083267);
                AlertController.b bVar = aVar.f441a;
                bVar.f424d = bVar.f421a.getText(R.string.important);
                aVar.f441a.f426f = kVar.c();
                aVar.setPositiveButton(R.string.get_app, new a(context, kVar));
                aVar.setNegativeButton(R.string.close, d.f23681a);
                aVar.create().show();
            }
        }
    }
}

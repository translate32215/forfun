package t2;

import android.app.AlertDialog;
import com.adcolony.sdk.d;
import com.adcolony.sdk.f;
import com.adcolony.sdk.i;
import com.adcolony.sdk.z;

public class a0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f25410a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f25411b;

    public a0(i iVar, d dVar, i iVar2) {
        this.f25410a = dVar;
        this.f25411b = iVar2;
    }

    public void run() {
        this.f25410a.f4470i = true;
        this.f25411b.getClass();
        z j10 = f.d().j();
        AlertDialog alertDialog = j10.f4828b;
        if (alertDialog != null) {
            alertDialog.dismiss();
            j10.f4828b = null;
        }
    }
}

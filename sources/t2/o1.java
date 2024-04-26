package t2;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.adcolony.sdk.f;
import com.adcolony.sdk.j0;
import com.adcolony.sdk.q0;

public class o1 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q0 f25545a;

    public o1(q0 q0Var) {
        this.f25545a = q0Var;
    }

    public void onClick(View view) {
        j0.f(new Intent("android.intent.action.VIEW", Uri.parse(this.f25545a.f4726i)));
        f.d().r().d(this.f25545a.f4722e);
    }
}

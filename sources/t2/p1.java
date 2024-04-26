package t2;

import androidx.activity.result.d;
import com.adcolony.sdk.q0;
import org.json.JSONArray;

public class p1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q0 f25552a;

    public p1(q0 q0Var) {
        this.f25552a = q0Var;
    }

    public void run() {
        String str = "";
        synchronized (this.f25552a.f4720c0) {
            if (this.f25552a.P.length() > 0) {
                q0 q0Var = this.f25552a;
                if (q0Var.G) {
                    str = q0Var.P.toString();
                }
                this.f25552a.P = new JSONArray();
            }
        }
        q0 q0Var2 = this.f25552a;
        if (q0Var2.G) {
            StringBuilder a10 = d.a("NativeLayer.dispatch_messages(ADC3_update(", str, "), '");
            a10.append(this.f25552a.f4728s);
            a10.append("');");
            q0Var2.m(a10.toString());
        }
    }
}

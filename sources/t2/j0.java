package t2;

import android.content.Context;
import com.adcolony.sdk.g;
import com.adcolony.sdk.o;
import com.adcolony.sdk.q0;

public class j0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f25488a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f25489b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f25490c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ o f25491d;

    public j0(o oVar, Context context, boolean z10, g gVar) {
        this.f25491d = oVar;
        this.f25488a = context;
        this.f25489b = z10;
        this.f25490c = gVar;
    }

    public void run() {
        q0 q0Var = new q0(this.f25488a.getApplicationContext(), this.f25491d.f4657a.f(), this.f25489b);
        q0Var.i(true, this.f25490c);
        this.f25491d.f4676t.put(Integer.valueOf(q0Var.C), q0Var);
    }
}

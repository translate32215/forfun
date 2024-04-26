package t2;

import android.content.Context;
import com.adcolony.sdk.b;
import com.adcolony.sdk.g;
import com.adcolony.sdk.i;

public class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f25597a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f25598b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f25599c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f25600d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ i f25601e;

    public z(i iVar, Context context, g gVar, f fVar, String str) {
        this.f25601e = iVar;
        this.f25597a = context;
        this.f25598b = gVar;
        this.f25599c = fVar;
        this.f25600d = str;
    }

    public void run() {
        b bVar = new b(this.f25597a, this.f25598b, this.f25599c);
        this.f25601e.f4528d.put(this.f25600d, bVar);
        bVar.setOmidManager(this.f25599c.f25473c);
        if (bVar.f4433i != null) {
            bVar.getWebView().q();
        }
        f fVar = this.f25599c;
        fVar.f25473c = null;
        fVar.a(bVar);
    }
}

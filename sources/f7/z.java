package f7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.google.android.gms.ads.internal.util.n;
import e8.mb0;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class z extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18325a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f18326b;

    public z(n nVar) {
        this.f18326b = nVar;
    }

    public final void onReceive(Context context, Intent intent) {
        switch (this.f18325a) {
            case 0:
                n nVar = (n) this.f18326b;
                synchronized (nVar) {
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry next : nVar.f5675b.entrySet()) {
                        if (((IntentFilter) next.getValue()).hasAction(intent.getAction())) {
                            arrayList.add((BroadcastReceiver) next.getKey());
                        }
                    }
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((BroadcastReceiver) obj).onReceive(context, intent);
                    }
                }
                return;
            default:
                Handler handler = mb0.f15482u;
                ((mb0) this.f18326b).d();
                return;
        }
    }

    public z(mb0 mb0) {
        this.f18326b = mb0;
    }
}

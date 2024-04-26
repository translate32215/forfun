package s4;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import l0.e;
import o4.i;
import t4.c;

/* compiled from: AlarmManagerScheduler */
public class a implements k {

    /* renamed from: a  reason: collision with root package name */
    public final Context f24913a;

    /* renamed from: b  reason: collision with root package name */
    public final c f24914b;

    /* renamed from: c  reason: collision with root package name */
    public AlarmManager f24915c;

    /* renamed from: d  reason: collision with root package name */
    public final com.google.android.datatransport.runtime.scheduling.jobscheduling.c f24916d;

    /* renamed from: e  reason: collision with root package name */
    public final v4.a f24917e;

    public a(Context context, c cVar, v4.a aVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar2) {
        this.f24913a = context;
        this.f24914b = cVar;
        this.f24915c = (AlarmManager) context.getSystemService("alarm");
        this.f24917e = aVar;
        this.f24916d = cVar2;
    }

    public void a(i iVar, int i10) {
        b(iVar, i10, false);
    }

    public void b(i iVar, int i10, boolean z10) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", iVar.b());
        builder.appendQueryParameter("priority", String.valueOf(w4.a.a(iVar.d())));
        if (iVar.c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(iVar.c(), 0));
        }
        Intent intent = new Intent(this.f24913a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i10);
        if (!z10) {
            if (PendingIntent.getBroadcast(this.f24913a, 0, intent, 536870912) != null) {
                e.c("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", iVar);
                return;
            }
        }
        long U = this.f24914b.U(iVar);
        long b10 = this.f24916d.b(iVar.d(), U, i10);
        e.d("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", iVar, Long.valueOf(b10), Long.valueOf(U), Integer.valueOf(i10));
        this.f24915c.set(3, this.f24917e.a() + b10, PendingIntent.getBroadcast(this.f24913a, 0, intent, 0));
    }
}

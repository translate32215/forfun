package e8;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract;
import com.google.android.gms.ads.internal.util.p;
import d7.l;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class z5 implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a6 f17692a;

    public z5(a6 a6Var) {
        this.f17692a = a6Var;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        a6 a6Var = this.f17692a;
        a6Var.getClass();
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", a6Var.f13659f);
        data.putExtra("eventLocation", a6Var.f13663r);
        data.putExtra("description", a6Var.f13662i);
        long j10 = a6Var.f13660g;
        if (j10 > -1) {
            data.putExtra("beginTime", j10);
        }
        long j11 = a6Var.f13661h;
        if (j11 > -1) {
            data.putExtra("endTime", j11);
        }
        data.setFlags(268435456);
        p pVar = l.B.f13186c;
        p.e(this.f17692a.f13658e, data);
    }
}

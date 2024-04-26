package o8;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.measurement.internal.j;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class i3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f23257a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23258b;

    /* renamed from: c  reason: collision with root package name */
    public final String f23259c;

    /* renamed from: d  reason: collision with root package name */
    public final long f23260d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ j f23261e;

    public /* synthetic */ i3(j jVar, long j10) {
        this.f23261e = jVar;
        i.e("health_monitor");
        i.a(j10 > 0);
        this.f23257a = "health_monitor:start";
        this.f23258b = "health_monitor:count";
        this.f23259c = "health_monitor:value";
        this.f23260d = j10;
    }

    public final void a() {
        this.f23261e.h();
        long b10 = this.f23261e.f8864a.f8850n.b();
        SharedPreferences.Editor edit = this.f23261e.o().edit();
        edit.remove(this.f23258b);
        edit.remove(this.f23259c);
        edit.putLong(this.f23257a, b10);
        edit.apply();
    }
}

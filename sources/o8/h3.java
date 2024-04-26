package o8;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.measurement.internal.j;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class h3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f23238a;

    /* renamed from: b  reason: collision with root package name */
    public final long f23239b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f23240c;

    /* renamed from: d  reason: collision with root package name */
    public long f23241d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ j f23242e;

    public h3(j jVar, String str, long j10) {
        this.f23242e = jVar;
        i.e(str);
        this.f23238a = str;
        this.f23239b = j10;
    }

    public final long a() {
        if (!this.f23240c) {
            this.f23240c = true;
            this.f23241d = this.f23242e.o().getLong(this.f23238a, this.f23239b);
        }
        return this.f23241d;
    }

    public final void b(long j10) {
        SharedPreferences.Editor edit = this.f23242e.o().edit();
        edit.putLong(this.f23238a, j10);
        edit.apply();
        this.f23241d = j10;
    }
}

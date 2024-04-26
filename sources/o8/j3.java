package o8;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.measurement.internal.j;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class j3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f23290a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f23291b;

    /* renamed from: c  reason: collision with root package name */
    public String f23292c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ j f23293d;

    public j3(j jVar, String str) {
        this.f23293d = jVar;
        i.e(str);
        this.f23290a = str;
    }

    public final String a() {
        if (!this.f23291b) {
            this.f23291b = true;
            this.f23292c = this.f23293d.o().getString(this.f23290a, (String) null);
        }
        return this.f23292c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.f23293d.o().edit();
        edit.putString(this.f23290a, str);
        edit.apply();
        this.f23292c = str;
    }
}

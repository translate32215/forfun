package o8;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.measurement.internal.j;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class f3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f23196a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f23197b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f23198c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f23199d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ j f23200e;

    public f3(j jVar, String str, boolean z10) {
        this.f23200e = jVar;
        i.e(str);
        this.f23196a = str;
        this.f23197b = z10;
    }

    public final void a(boolean z10) {
        SharedPreferences.Editor edit = this.f23200e.o().edit();
        edit.putBoolean(this.f23196a, z10);
        edit.apply();
        this.f23199d = z10;
    }

    public final boolean b() {
        if (!this.f23198c) {
            this.f23198c = true;
            this.f23199d = this.f23200e.o().getBoolean(this.f23196a, this.f23197b);
        }
        return this.f23199d;
    }
}

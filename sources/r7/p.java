package r7;

import android.os.Bundle;
import android.util.Log;
import s8.j;
import x4.a0;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public abstract class p<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f24724a;

    /* renamed from: b  reason: collision with root package name */
    public final j<T> f24725b = new j<>();

    /* renamed from: c  reason: collision with root package name */
    public final int f24726c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f24727d;

    public p(int i10, int i11, Bundle bundle) {
        this.f24724a = i10;
        this.f24726c = i11;
        this.f24727d = bundle;
    }

    public abstract void a(Bundle bundle);

    public final void b(T t10) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t10);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + valueOf.length() + 16);
            sb2.append("Finishing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f24725b.f25035a.p(t10);
    }

    public final void c(a0 a0Var) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(a0Var);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + valueOf.length() + 14);
            sb2.append("Failing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f24725b.f25035a.o(a0Var);
    }

    public abstract boolean d();

    public String toString() {
        int i10 = this.f24726c;
        int i11 = this.f24724a;
        boolean d10 = d();
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Request { what=");
        sb2.append(i10);
        sb2.append(" id=");
        sb2.append(i11);
        sb2.append(" oneWay=");
        sb2.append(d10);
        sb2.append("}");
        return sb2.toString();
    }
}

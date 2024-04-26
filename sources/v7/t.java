package v7;

import android.os.Bundle;
import com.google.android.gms.common.internal.b;
import s7.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class t extends w {

    /* renamed from: d  reason: collision with root package name */
    public final int f26596d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f26597e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ b f26598f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(b bVar, int i10, Bundle bundle) {
        super(bVar, Boolean.TRUE);
        this.f26598f = bVar;
        this.f26596d = i10;
        this.f26597e = bundle;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void a(java.lang.Object r3) {
        /*
            r2 = this;
            int r3 = r2.f26596d
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L_0x001c
            boolean r3 = r2.e()
            if (r3 != 0) goto L_0x001b
            com.google.android.gms.common.internal.b r3 = r2.f26598f
            r3.D(r0, r1)
            s7.a r3 = new s7.a
            r0 = 8
            r3.<init>(r0, r1)
            r2.d(r3)
        L_0x001b:
            return
        L_0x001c:
            com.google.android.gms.common.internal.b r3 = r2.f26598f
            r3.D(r0, r1)
            android.os.Bundle r3 = r2.f26597e
            if (r3 == 0) goto L_0x002e
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            r1 = r3
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
        L_0x002e:
            s7.a r3 = new s7.a
            int r0 = r2.f26596d
            r3.<init>(r0, r1)
            r2.d(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.t.a(java.lang.Object):void");
    }

    public final void b() {
    }

    public abstract void d(a aVar);

    public abstract boolean e();
}

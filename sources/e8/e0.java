package e8;

import com.google.android.gms.internal.ads.n;
import com.google.android.gms.internal.ads.os;
import com.google.android.gms.internal.ads.ri;
import z6.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class e0 extends os implements n {

    /* renamed from: a  reason: collision with root package name */
    public final b f14343a;

    public e0(b bVar) {
        super("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        this.f14343a = bVar;
    }

    public final void L3(c0 c0Var) {
        this.f14343a.a(new ri(c0Var));
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r6(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) {
        /*
            r1 = this;
            r5 = 1
            if (r2 != r5) goto L_0x0026
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x000b
            r2 = 0
            goto L_0x001f
        L_0x000b:
            java.lang.String r3 = "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r0 = r3 instanceof e8.c0
            if (r0 == 0) goto L_0x0019
            r2 = r3
            e8.c0 r2 = (e8.c0) r2
            goto L_0x001f
        L_0x0019:
            e8.d0 r3 = new e8.d0
            r3.<init>(r2)
            r2 = r3
        L_0x001f:
            r1.L3(r2)
            r4.writeNoException()
            goto L_0x0027
        L_0x0026:
            r5 = 0
        L_0x0027:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.e0.r6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}

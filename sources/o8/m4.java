package o8;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class m4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f23339a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f23340b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f23341c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Bundle f23342d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f23343e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f23344f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ boolean f23345g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f23346h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ s4 f23347i;

    public m4(s4 s4Var, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        this.f23347i = s4Var;
        this.f23339a = str;
        this.f23340b = str2;
        this.f23341c = j10;
        this.f23342d = bundle;
        this.f23343e = z10;
        this.f23344f = z11;
        this.f23345g = z12;
        this.f23346h = str3;
    }

    public final void run() {
        this.f23347i.q(this.f23339a, this.f23340b, this.f23341c, this.f23342d, this.f23343e, this.f23344f, this.f23345g, this.f23346h);
    }
}

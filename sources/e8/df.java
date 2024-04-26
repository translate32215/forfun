package e8;

import android.content.Context;
import com.google.android.gms.internal.ads.b8;
import com.google.android.gms.internal.ads.le;
import com.google.android.gms.internal.ads.me;
import com.google.android.gms.internal.ads.n;
import com.google.android.gms.internal.ads.o8;
import com.google.android.gms.internal.ads.p8;
import com.google.android.gms.internal.ads.wd;
import com.google.android.gms.internal.ads.xe;
import com.startapp.b4;
import f7.d0;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import z7.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class df implements ta0<p8> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14263a;

    /* renamed from: b  reason: collision with root package name */
    public final ab0<c5> f14264b;

    /* renamed from: c  reason: collision with root package name */
    public final ab0<o8> f14265c;

    /* renamed from: d  reason: collision with root package name */
    public final ab0<Executor> f14266d;

    /* renamed from: e  reason: collision with root package name */
    public final ab0<af> f14267e;

    /* renamed from: f  reason: collision with root package name */
    public final ab0<b> f14268f;

    public df(ab0 ab0, ab0 ab02, ab0 ab03, ab0 ab04, ab0 ab05, int i10) {
        this.f14263a = i10;
        switch (i10) {
            case 1:
                this.f14264b = ab0;
                this.f14265c = ab02;
                this.f14266d = ab03;
                this.f14267e = ab04;
                this.f14268f = ab05;
                return;
            case 2:
                this.f14264b = ab0;
                this.f14265c = ab02;
                this.f14266d = ab03;
                this.f14267e = ab04;
                this.f14268f = ab05;
                return;
            case 3:
                this.f14264b = ab0;
                this.f14265c = ab02;
                this.f14266d = ab03;
                this.f14267e = ab04;
                this.f14268f = ab05;
                return;
            case 4:
                this.f14264b = ab0;
                this.f14265c = ab02;
                this.f14266d = ab03;
                this.f14267e = ab04;
                this.f14268f = ab05;
                return;
            case 5:
                this.f14264b = ab0;
                this.f14265c = ab02;
                this.f14266d = ab03;
                this.f14267e = ab04;
                this.f14268f = ab05;
                return;
            case 6:
                this.f14264b = ab0;
                this.f14265c = ab02;
                this.f14266d = ab03;
                this.f14267e = ab04;
                this.f14268f = ab05;
                return;
            case 7:
                this.f14264b = ab0;
                this.f14265c = ab02;
                this.f14266d = ab03;
                this.f14267e = ab04;
                this.f14268f = ab05;
                return;
            case b4.f10106f:
                this.f14264b = ab0;
                this.f14265c = ab02;
                this.f14266d = ab03;
                this.f14267e = ab04;
                this.f14268f = ab05;
                return;
            case 9:
                this.f14264b = ab0;
                this.f14265c = ab02;
                this.f14266d = ab03;
                this.f14267e = ab04;
                this.f14268f = ab05;
                return;
            case 10:
                this.f14264b = ab0;
                this.f14265c = ab02;
                this.f14266d = ab03;
                this.f14267e = ab04;
                this.f14268f = ab05;
                return;
            default:
                this.f14264b = ab0;
                this.f14265c = ab02;
                this.f14266d = ab03;
                this.f14267e = ab04;
                this.f14268f = ab05;
                return;
        }
    }

    public static df a(ab0<c5> ab0, ab0<o8> ab02, ab0<Executor> ab03, ab0<af> ab04, ab0<b> ab05) {
        return new df(ab0, ab02, ab03, ab04, ab05, 0);
    }

    public static df b(ab0<Context> ab0, ab0<w00> ab02, ab0<f9> ab03, ab0<d0> ab04, ab0<yq> ab05) {
        return new df(ab0, ab02, ab03, ab04, ab05, 1);
    }

    public static df c(ab0<w00> ab0, ab0<dr> ab02, ab0<o50> ab03, ab0<ScheduledExecutorService> ab04, ab0<xs> ab05) {
        return new df(ab0, ab02, ab03, ab04, ab05, 3);
    }

    public static df d(ab0<String> ab0, ab0<String> ab02, ab0<uh> ab03, ab0<xe> ab04, ab0<w00> ab05) {
        return new df(ab0, ab02, ab03, ab04, ab05, 7);
    }

    public final /* synthetic */ Object get() {
        switch (this.f14263a) {
            case 0:
                return new p8(this.f14264b.get(), this.f14265c.get(), this.f14266d.get(), this.f14267e.get(), this.f14268f.get());
            case 1:
                return new zh((Context) this.f14264b.get(), (w00) this.f14265c.get(), (f9) this.f14266d.get(), (d0) this.f14267e.get(), (yq) this.f14268f.get());
            case 2:
                return new wm((Map) this.f14264b.get(), (Map) this.f14265c.get(), (Map) this.f14266d.get(), this.f14267e, (qn) this.f14268f.get());
            case 3:
                return new kr((w00) this.f14264b.get(), (dr) this.f14265c.get(), (o50) this.f14266d.get(), (ScheduledExecutorService) this.f14267e.get(), (xs) this.f14268f.get());
            case 4:
                return new et((Context) this.f14264b.get(), (dt) this.f14265c.get(), (c9) this.f14266d.get(), (oq) this.f14267e.get(), (t20) this.f14268f.get());
            case 5:
                return new cu((pg) this.f14264b.get(), (xt) this.f14265c.get(), (ni) this.f14266d.get(), (ScheduledExecutorService) this.f14267e.get(), (o50) this.f14268f.get());
            case 6:
                return new bv((Context) this.f14264b.get(), (pg) this.f14265c.get(), (n20) this.f14266d.get(), (o50) this.f14267e.get(), (n) this.f14268f.get());
            case 7:
                return new rw((String) this.f14264b.get(), (String) this.f14265c.get(), (uh) this.f14266d.get(), (xe) this.f14267e.get(), (w00) this.f14268f.get());
            case b4.f10106f:
                return new my((r8) this.f14264b.get(), (Context) this.f14265c.get(), (ScheduledExecutorService) this.f14266d.get(), (Executor) this.f14267e.get(), ((Integer) this.f14268f.get()).intValue());
            case 9:
                return new wd((b8) this.f14264b.get(), (Context) this.f14265c.get(), (String) this.f14266d.get(), (pz) this.f14267e.get(), (hz) this.f14268f.get());
            default:
                return new me((String) this.f14264b.get(), (le) this.f14265c.get(), (Context) this.f14266d.get(), (e00) this.f14267e.get(), (v00) this.f14268f.get());
        }
    }
}

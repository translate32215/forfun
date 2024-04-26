package e8;

import com.google.android.gms.internal.ads.b9;
import com.google.android.gms.internal.ads.i8;
import com.google.android.gms.internal.ads.i9;
import com.google.android.gms.internal.ads.l2;
import com.google.android.gms.internal.ads.q2;
import com.google.android.gms.internal.ads.zd;
import s9.e;
import y3.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class td implements ei {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16733a;

    /* renamed from: b  reason: collision with root package name */
    public i9 f16734b;

    /* renamed from: c  reason: collision with root package name */
    public b9 f16735c;

    /* renamed from: d  reason: collision with root package name */
    public t00 f16736d;

    /* renamed from: e  reason: collision with root package name */
    public c00 f16737e;

    /* renamed from: f  reason: collision with root package name */
    public zd f16738f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ nd f16739g;

    public td(nd ndVar, int i10) {
        this.f16733a = i10;
        if (i10 == 1) {
            this.f16739g = ndVar;
        } else if (i10 != 2) {
            this.f16739g = ndVar;
        } else {
            this.f16739g = ndVar;
        }
    }

    public final /* synthetic */ ei a(c00 c00) {
        switch (this.f16733a) {
            case 0:
                this.f16737e = c00;
                return this;
            case 1:
                this.f16737e = c00;
                return this;
            default:
                this.f16737e = c00;
                return this;
        }
    }

    public final /* synthetic */ Object b() {
        Class<b9> cls = b9.class;
        Class<i9> cls2 = i9.class;
        switch (this.f16733a) {
            case 0:
                jc0.f(this.f16734b, cls2);
                jc0.f(this.f16735c, cls);
                return new sd(this.f16739g, new b(1), new e(2), new q2(1), new q2(2), this.f16734b, this.f16735c, new l2(1), this.f16736d, this.f16737e, this.f16738f, (u.b) null);
            case 1:
                jc0.f(this.f16734b, cls2);
                jc0.f(this.f16735c, cls);
                return new wd(this.f16739g, new b(1), new e(2), new q2(1), new q2(2), this.f16734b, this.f16735c, new l2(1), this.f16736d, this.f16737e, this.f16738f, (u.b) null);
            default:
                return e();
        }
    }

    public final /* synthetic */ ei c(t00 t00) {
        switch (this.f16733a) {
            case 0:
                this.f16736d = t00;
                return this;
            case 1:
                this.f16736d = t00;
                return this;
            default:
                this.f16736d = t00;
                return this;
        }
    }

    public final /* synthetic */ ei d(zd zdVar) {
        switch (this.f16733a) {
            case 0:
                this.f16738f = zdVar;
                return this;
            case 1:
                this.f16738f = zdVar;
                return this;
            default:
                this.f16738f = zdVar;
                return this;
        }
    }

    public kp e() {
        jc0.f(this.f16734b, i9.class);
        jc0.f(this.f16735c, b9.class);
        return new i8(this.f16739g, new b(1), new e(2), new q2(1), new q2(2), this.f16734b, this.f16735c, new l2(1), this.f16736d, this.f16737e, this.f16738f, (u.b) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ td(nd ndVar, u.b bVar, int i10) {
        this(ndVar, 0);
        this.f16733a = i10;
        if (i10 == 1) {
            this(ndVar, 1);
        } else if (i10 != 2) {
        } else {
            this(ndVar, 2);
        }
    }
}

package o8;

import com.google.android.gms.common.internal.i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23086a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f23087b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f23088c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ y1 f23089d;

    public a(y1 y1Var, String str, long j10, int i10) {
        this.f23086a = i10;
        if (i10 != 1) {
            this.f23089d = y1Var;
            this.f23087b = str;
            this.f23088c = j10;
            return;
        }
        this.f23089d = y1Var;
        this.f23087b = str;
        this.f23088c = j10;
    }

    public final void run() {
        switch (this.f23086a) {
            case 0:
                y1 y1Var = this.f23089d;
                String str = this.f23087b;
                long j10 = this.f23088c;
                y1Var.h();
                i.e(str);
                if (y1Var.f23610c.isEmpty()) {
                    y1Var.f23611d = j10;
                }
                Integer num = y1Var.f23610c.get(str);
                if (num != null) {
                    y1Var.f23610c.put(str, Integer.valueOf(num.intValue() + 1));
                    return;
                } else if (y1Var.f23610c.size() >= 100) {
                    y1Var.f8864a.d().f8800i.a("Too many ads visible");
                    return;
                } else {
                    y1Var.f23610c.put(str, 1);
                    y1Var.f23609b.put(str, Long.valueOf(j10));
                    return;
                }
            default:
                y1 y1Var2 = this.f23089d;
                String str2 = this.f23087b;
                long j11 = this.f23088c;
                y1Var2.h();
                i.e(str2);
                Integer num2 = y1Var2.f23610c.get(str2);
                if (num2 != null) {
                    x4 o10 = y1Var2.f8864a.x().o(false);
                    int intValue = num2.intValue() - 1;
                    if (intValue == 0) {
                        y1Var2.f23610c.remove(str2);
                        Long l10 = y1Var2.f23609b.get(str2);
                        if (l10 == null) {
                            y1Var2.f8864a.d().f8797f.a("First ad unit exposure time was never set");
                        } else {
                            long longValue = l10.longValue();
                            y1Var2.f23609b.remove(str2);
                            y1Var2.m(str2, j11 - longValue, o10);
                        }
                        if (y1Var2.f23610c.isEmpty()) {
                            long j12 = y1Var2.f23611d;
                            if (j12 == 0) {
                                y1Var2.f8864a.d().f8797f.a("First ad exposure time was never set");
                                return;
                            }
                            y1Var2.l(j11 - j12, o10);
                            y1Var2.f23611d = 0;
                            return;
                        }
                        return;
                    }
                    y1Var2.f23610c.put(str2, Integer.valueOf(intValue));
                    return;
                }
                y1Var2.f8864a.d().f8797f.b("Call to endAdUnitExposure for unknown ad unit id", str2);
                return;
        }
    }
}

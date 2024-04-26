package w2;

import android.graphics.Path;
import android.graphics.PointF;
import b3.h;
import c3.b;
import g3.f;
import java.util.List;
import k1.c;
import o1.p;
import t.g;
import u2.e;
import u2.j;
import x2.a;

/* compiled from: PolystarContent */
public class m implements l, a.b, j {

    /* renamed from: a  reason: collision with root package name */
    public final Path f26948a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final String f26949b;

    /* renamed from: c  reason: collision with root package name */
    public final e f26950c;

    /* renamed from: d  reason: collision with root package name */
    public final int f26951d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f26952e;

    /* renamed from: f  reason: collision with root package name */
    public final a<?, Float> f26953f;

    /* renamed from: g  reason: collision with root package name */
    public final a<?, PointF> f26954g;

    /* renamed from: h  reason: collision with root package name */
    public final a<?, Float> f26955h;

    /* renamed from: i  reason: collision with root package name */
    public final a<?, Float> f26956i;

    /* renamed from: j  reason: collision with root package name */
    public final a<?, Float> f26957j;

    /* renamed from: k  reason: collision with root package name */
    public final a<?, Float> f26958k;

    /* renamed from: l  reason: collision with root package name */
    public final a<?, Float> f26959l;

    /* renamed from: m  reason: collision with root package name */
    public c f26960m = new c(1);

    /* renamed from: n  reason: collision with root package name */
    public boolean f26961n;

    public m(e eVar, b bVar, h hVar) {
        this.f26950c = eVar;
        this.f26949b = hVar.f3501a;
        int i10 = hVar.f3502b;
        this.f26951d = i10;
        this.f26952e = hVar.f3510j;
        a<Float, Float> a10 = hVar.f3503c.a();
        this.f26953f = a10;
        a<PointF, PointF> a11 = hVar.f3504d.a();
        this.f26954g = a11;
        a<Float, Float> a12 = hVar.f3505e.a();
        this.f26955h = a12;
        a<Float, Float> a13 = hVar.f3507g.a();
        this.f26957j = a13;
        a<Float, Float> a14 = hVar.f3509i.a();
        this.f26959l = a14;
        if (i10 == 1) {
            this.f26956i = hVar.f3506f.a();
            this.f26958k = hVar.f3508h.a();
        } else {
            this.f26956i = null;
            this.f26958k = null;
        }
        bVar.g(a10);
        bVar.g(a11);
        bVar.g(a12);
        bVar.g(a13);
        bVar.g(a14);
        if (i10 == 1) {
            bVar.g(this.f26956i);
            bVar.g(this.f26958k);
        }
        a10.f27249a.add(this);
        a11.f27249a.add(this);
        a12.f27249a.add(this);
        a13.f27249a.add(this);
        a14.f27249a.add(this);
        if (i10 == 1) {
            this.f26956i.f27249a.add(this);
            this.f26958k.f27249a.add(this);
        }
    }

    public String a() {
        return this.f26949b;
    }

    public <T> void b(T t10, p pVar) {
        a<?, Float> aVar;
        a<?, Float> aVar2;
        if (t10 == j.f26003s) {
            this.f26953f.i(pVar);
        } else if (t10 == j.f26004t) {
            this.f26955h.i(pVar);
        } else if (t10 == j.f25994j) {
            this.f26954g.i(pVar);
        } else if (t10 == j.f26005u && (aVar2 = this.f26956i) != null) {
            aVar2.i(pVar);
        } else if (t10 == j.f26006v) {
            this.f26957j.i(pVar);
        } else if (t10 == j.f26007w && (aVar = this.f26958k) != null) {
            aVar.i(pVar);
        } else if (t10 == j.f26008x) {
            this.f26959l.i(pVar);
        }
    }

    public void d() {
        this.f26961n = false;
        this.f26950c.invalidateSelf();
    }

    public void e(z2.e eVar, int i10, List<z2.e> list, z2.e eVar2) {
        f.f(eVar, i10, list, eVar2, this);
    }

    public void f(List<b> list, List<b> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            b bVar = list.get(i10);
            if (bVar instanceof r) {
                r rVar = (r) bVar;
                if (rVar.f26995c == 1) {
                    this.f26960m.f19876a.add(rVar);
                    rVar.f26994b.add(this);
                }
            }
        }
    }

    public Path i() {
        float f10;
        float f11;
        float f12;
        float f13;
        double d10;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        double d11;
        float f19;
        float f20;
        float f21;
        double d12;
        double d13;
        double d14;
        if (this.f26961n) {
            return this.f26948a;
        }
        this.f26948a.reset();
        if (this.f26952e) {
            this.f26961n = true;
            return this.f26948a;
        }
        int f22 = g.f(this.f26951d);
        double d15 = 0.0d;
        if (f22 == 0) {
            float floatValue = this.f26953f.e().floatValue();
            a<?, Float> aVar = this.f26955h;
            if (aVar != null) {
                d15 = (double) aVar.e().floatValue();
            }
            double radians = Math.toRadians(d15 - 90.0d);
            double d16 = (double) floatValue;
            Double.isNaN(d16);
            Double.isNaN(d16);
            Double.isNaN(d16);
            float f23 = (float) (6.283185307179586d / d16);
            float f24 = f23 / 2.0f;
            float f25 = floatValue - ((float) ((int) floatValue));
            if (f25 != 0.0f) {
                double d17 = (double) ((1.0f - f25) * f24);
                Double.isNaN(d17);
                Double.isNaN(d17);
                Double.isNaN(d17);
                radians += d17;
            }
            float floatValue2 = this.f26957j.e().floatValue();
            float floatValue3 = this.f26956i.e().floatValue();
            a<?, Float> aVar2 = this.f26958k;
            float floatValue4 = aVar2 != null ? aVar2.e().floatValue() / 100.0f : 0.0f;
            a<?, Float> aVar3 = this.f26959l;
            float floatValue5 = aVar3 != null ? aVar3.e().floatValue() / 100.0f : 0.0f;
            if (f25 != 0.0f) {
                f14 = h.e.a(floatValue2, floatValue3, f25, floatValue3);
                double d18 = (double) f14;
                double cos = Math.cos(radians);
                Double.isNaN(d18);
                Double.isNaN(d18);
                Double.isNaN(d18);
                f11 = floatValue3;
                f10 = floatValue4;
                f13 = (float) (cos * d18);
                double sin = Math.sin(radians);
                Double.isNaN(d18);
                Double.isNaN(d18);
                Double.isNaN(d18);
                f12 = (float) (d18 * sin);
                this.f26948a.moveTo(f13, f12);
                double d19 = (double) ((f23 * f25) / 2.0f);
                Double.isNaN(d19);
                Double.isNaN(d19);
                Double.isNaN(d19);
                d10 = radians + d19;
            } else {
                f11 = floatValue3;
                f10 = floatValue4;
                double d20 = (double) floatValue2;
                double cos2 = Math.cos(radians);
                Double.isNaN(d20);
                Double.isNaN(d20);
                Double.isNaN(d20);
                float f26 = (float) (cos2 * d20);
                double sin2 = Math.sin(radians);
                Double.isNaN(d20);
                Double.isNaN(d20);
                Double.isNaN(d20);
                f12 = (float) (sin2 * d20);
                this.f26948a.moveTo(f26, f12);
                double d21 = (double) f24;
                Double.isNaN(d21);
                Double.isNaN(d21);
                Double.isNaN(d21);
                d10 = radians + d21;
                f13 = f26;
                f14 = 0.0f;
            }
            double ceil = Math.ceil(d16) * 2.0d;
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                double d22 = (double) i10;
                if (d22 >= ceil) {
                    break;
                }
                float f27 = z10 ? floatValue2 : f11;
                if (f14 == 0.0f || d22 != ceil - 2.0d) {
                    f15 = f23;
                    f16 = f24;
                } else {
                    f15 = f23;
                    f16 = (f23 * f25) / 2.0f;
                }
                if (f14 == 0.0f || d22 != ceil - 1.0d) {
                    f17 = f14;
                    f14 = f27;
                } else {
                    f17 = f14;
                }
                float f28 = f24;
                double d23 = (double) f14;
                double cos3 = Math.cos(d10);
                Double.isNaN(d23);
                Double.isNaN(d23);
                Double.isNaN(d23);
                double d24 = d22;
                float f29 = (float) (cos3 * d23);
                double sin3 = Math.sin(d10);
                Double.isNaN(d23);
                Double.isNaN(d23);
                Double.isNaN(d23);
                float f30 = (float) (d23 * sin3);
                if (f10 == 0.0f && floatValue5 == 0.0f) {
                    this.f26948a.lineTo(f29, f30);
                    f21 = f16;
                    f18 = f30;
                    f19 = floatValue2;
                    d11 = d10;
                    f20 = floatValue5;
                } else {
                    f19 = floatValue2;
                    d11 = d10;
                    double atan2 = (double) ((float) (Math.atan2((double) f12, (double) f13) - 1.5707963267948966d));
                    float cos4 = (float) Math.cos(atan2);
                    float sin4 = (float) Math.sin(atan2);
                    float f31 = f12;
                    f20 = floatValue5;
                    float f32 = f16;
                    f18 = f30;
                    double atan22 = (double) ((float) (Math.atan2((double) f30, (double) f29) - 1.5707963267948966d));
                    float cos5 = (float) Math.cos(atan22);
                    float sin5 = (float) Math.sin(atan22);
                    float f33 = z10 ? f10 : f20;
                    float f34 = z10 ? f20 : f10;
                    float f35 = (z10 ? f11 : f19) * f33 * 0.47829f;
                    float f36 = cos4 * f35;
                    float f37 = f35 * sin4;
                    float f38 = (z10 ? f19 : f11) * f34 * 0.47829f;
                    float f39 = cos5 * f38;
                    float f40 = f38 * sin5;
                    if (f25 != 0.0f) {
                        if (i10 == 0) {
                            f36 *= f25;
                            f37 *= f25;
                        } else if (d24 == ceil - 1.0d) {
                            f39 *= f25;
                            f40 *= f25;
                        }
                    }
                    this.f26948a.cubicTo(f13 - f36, f31 - f37, f29 + f39, f18 + f40, f29, f18);
                    f21 = f32;
                }
                double d25 = (double) f21;
                Double.isNaN(d25);
                Double.isNaN(d25);
                Double.isNaN(d25);
                d10 = d11 + d25;
                z10 = !z10;
                i10++;
                floatValue5 = f20;
                f13 = f29;
                floatValue2 = f19;
                f24 = f28;
                f23 = f15;
                f14 = f17;
                f12 = f18;
            }
            PointF e10 = this.f26954g.e();
            this.f26948a.offset(e10.x, e10.y);
            this.f26948a.close();
        } else if (f22 == 1) {
            int floor = (int) Math.floor((double) this.f26953f.e().floatValue());
            a<?, Float> aVar4 = this.f26955h;
            if (aVar4 != null) {
                d15 = (double) aVar4.e().floatValue();
            }
            double radians2 = Math.toRadians(d15 - 90.0d);
            double d26 = (double) floor;
            Double.isNaN(d26);
            Double.isNaN(d26);
            Double.isNaN(d26);
            float floatValue6 = this.f26959l.e().floatValue() / 100.0f;
            float floatValue7 = this.f26957j.e().floatValue();
            double d27 = (double) floatValue7;
            double cos6 = Math.cos(radians2);
            Double.isNaN(d27);
            Double.isNaN(d27);
            Double.isNaN(d27);
            float f41 = (float) (cos6 * d27);
            double sin6 = Math.sin(radians2);
            Double.isNaN(d27);
            Double.isNaN(d27);
            Double.isNaN(d27);
            float f42 = (float) (sin6 * d27);
            this.f26948a.moveTo(f41, f42);
            double d28 = (double) ((float) (6.283185307179586d / d26));
            Double.isNaN(d28);
            Double.isNaN(d28);
            Double.isNaN(d28);
            double d29 = radians2 + d28;
            double ceil2 = Math.ceil(d26);
            int i11 = 0;
            while (((double) i11) < ceil2) {
                double cos7 = Math.cos(d29);
                Double.isNaN(d27);
                Double.isNaN(d27);
                Double.isNaN(d27);
                float f43 = (float) (cos7 * d27);
                double sin7 = Math.sin(d29);
                Double.isNaN(d27);
                Double.isNaN(d27);
                Double.isNaN(d27);
                double d30 = ceil2;
                float f44 = (float) (sin7 * d27);
                if (floatValue6 != 0.0f) {
                    d14 = d27;
                    d13 = d29;
                    double atan23 = (double) ((float) (Math.atan2((double) f42, (double) f41) - 1.5707963267948966d));
                    float cos8 = (float) Math.cos(atan23);
                    d12 = d28;
                    double atan24 = (double) ((float) (Math.atan2((double) f44, (double) f43) - 1.5707963267948966d));
                    float f45 = floatValue7 * floatValue6 * 0.25f;
                    this.f26948a.cubicTo(f41 - (cos8 * f45), f42 - (((float) Math.sin(atan23)) * f45), f43 + (((float) Math.cos(atan24)) * f45), f44 + (f45 * ((float) Math.sin(atan24))), f43, f44);
                } else {
                    d13 = d29;
                    d14 = d27;
                    d12 = d28;
                    this.f26948a.lineTo(f43, f44);
                }
                Double.isNaN(d12);
                Double.isNaN(d12);
                Double.isNaN(d12);
                d29 = d13 + d12;
                i11++;
                f42 = f44;
                f41 = f43;
                ceil2 = d30;
                d27 = d14;
                d28 = d12;
            }
            PointF e11 = this.f26954g.e();
            this.f26948a.offset(e11.x, e11.y);
            this.f26948a.close();
        }
        this.f26948a.close();
        this.f26960m.d(this.f26948a);
        this.f26961n = true;
        return this.f26948a;
    }
}

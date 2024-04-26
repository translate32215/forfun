package c3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import b3.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n2.g;
import o1.p;
import s.f;
import u2.e;
import u2.j;
import w2.c;
import x2.m;
import x2.o;
import z2.d;

/* compiled from: TextLayer */
public class i extends b {
    public final Paint A = new a(this, 1);
    public final Paint B = new b(this, 1);
    public final Map<d, List<c>> C = new HashMap();
    public final f<String> D = new f<>(10);
    public final m E;
    public final e F;
    public final u2.d G;
    public x2.a<Integer, Integer> H;
    public x2.a<Integer, Integer> I;
    public x2.a<Integer, Integer> J;
    public x2.a<Integer, Integer> K;
    public x2.a<Float, Float> L;
    public x2.a<Float, Float> M;
    public x2.a<Float, Float> N;
    public x2.a<Float, Float> O;
    public x2.a<Float, Float> P;

    /* renamed from: x  reason: collision with root package name */
    public final StringBuilder f4194x = new StringBuilder(2);

    /* renamed from: y  reason: collision with root package name */
    public final RectF f4195y = new RectF();

    /* renamed from: z  reason: collision with root package name */
    public final Matrix f4196z = new Matrix();

    /* compiled from: TextLayer */
    public class a extends Paint {
        public a(i iVar, int i10) {
            super(i10);
            setStyle(Paint.Style.FILL);
        }
    }

    /* compiled from: TextLayer */
    public class b extends Paint {
        public b(i iVar, int i10) {
            super(i10);
            setStyle(Paint.Style.STROKE);
        }
    }

    public i(e eVar, e eVar2) {
        super(eVar, eVar2);
        a3.b bVar;
        a3.b bVar2;
        a3.a aVar;
        a3.a aVar2;
        this.F = eVar;
        this.G = eVar2.f4165b;
        m mVar = new m(eVar2.f4180q.f60a);
        this.E = mVar;
        mVar.f27249a.add(this);
        g(mVar);
        g gVar = eVar2.f4181r;
        if (!(gVar == null || (aVar2 = (a3.a) gVar.f21850a) == null)) {
            x2.a<Integer, Integer> a10 = aVar2.a();
            this.H = a10;
            a10.f27249a.add(this);
            g(this.H);
        }
        if (!(gVar == null || (aVar = (a3.a) gVar.f21851b) == null)) {
            x2.a<Integer, Integer> a11 = aVar.a();
            this.J = a11;
            a11.f27249a.add(this);
            g(this.J);
        }
        if (!(gVar == null || (bVar2 = (a3.b) gVar.f21852c) == null)) {
            x2.a<Float, Float> a12 = bVar2.a();
            this.L = a12;
            a12.f27249a.add(this);
            g(this.L);
        }
        if (gVar != null && (bVar = (a3.b) gVar.f21853d) != null) {
            x2.a<Float, Float> a13 = bVar.a();
            this.N = a13;
            a13.f27249a.add(this);
            g(this.N);
        }
    }

    public <T> void b(T t10, p pVar) {
        this.f4156v.c(t10, pVar);
        if (t10 == j.f25985a) {
            x2.a<Integer, Integer> aVar = this.I;
            if (aVar != null) {
                this.f4155u.remove(aVar);
            }
            if (pVar == null) {
                this.I = null;
                return;
            }
            o oVar = new o(pVar, null);
            this.I = oVar;
            oVar.f27249a.add(this);
            g(this.I);
        } else if (t10 == j.f25986b) {
            x2.a<Integer, Integer> aVar2 = this.K;
            if (aVar2 != null) {
                this.f4155u.remove(aVar2);
            }
            if (pVar == null) {
                this.K = null;
                return;
            }
            o oVar2 = new o(pVar, null);
            this.K = oVar2;
            oVar2.f27249a.add(this);
            g(this.K);
        } else if (t10 == j.f25999o) {
            x2.a<Float, Float> aVar3 = this.M;
            if (aVar3 != null) {
                this.f4155u.remove(aVar3);
            }
            if (pVar == null) {
                this.M = null;
                return;
            }
            o oVar3 = new o(pVar, null);
            this.M = oVar3;
            oVar3.f27249a.add(this);
            g(this.M);
        } else if (t10 == j.f26000p) {
            x2.a<Float, Float> aVar4 = this.O;
            if (aVar4 != null) {
                this.f4155u.remove(aVar4);
            }
            if (pVar == null) {
                this.O = null;
                return;
            }
            o oVar4 = new o(pVar, null);
            this.O = oVar4;
            oVar4.f27249a.add(this);
            g(this.O);
        } else if (t10 == j.B) {
            x2.a<Float, Float> aVar5 = this.P;
            if (aVar5 != null) {
                this.f4155u.remove(aVar5);
            }
            if (pVar == null) {
                this.P = null;
                return;
            }
            o oVar5 = new o(pVar, null);
            this.P = oVar5;
            oVar5.f27249a.add(this);
            g(this.P);
        }
    }

    public void c(RectF rectF, Matrix matrix, boolean z10) {
        super.c(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, (float) this.G.f25928j.width(), (float) this.G.f25928j.height());
    }

    public void l(Canvas canvas, Matrix matrix, int i10) {
        int i11;
        y2.a aVar;
        float f10;
        String str;
        float f11;
        float f12;
        List<String> list;
        int i12;
        String str2;
        List list2;
        float f13;
        String str3;
        int i13;
        float f14;
        Canvas canvas2 = canvas;
        canvas.save();
        if (!(this.F.f25935b.f25925g.k() > 0)) {
            canvas.setMatrix(matrix);
        }
        z2.b bVar = (z2.b) this.E.e();
        z2.c cVar = this.G.f25923e.get(bVar.f28216b);
        if (cVar == null) {
            canvas.restore();
            return;
        }
        x2.a<Integer, Integer> aVar2 = this.I;
        if (aVar2 != null) {
            this.A.setColor(aVar2.e().intValue());
        } else {
            x2.a<Integer, Integer> aVar3 = this.H;
            if (aVar3 != null) {
                this.A.setColor(aVar3.e().intValue());
            } else {
                this.A.setColor(bVar.f28222h);
            }
        }
        x2.a<Integer, Integer> aVar4 = this.K;
        if (aVar4 != null) {
            this.B.setColor(aVar4.e().intValue());
        } else {
            x2.a<Integer, Integer> aVar5 = this.J;
            if (aVar5 != null) {
                this.B.setColor(aVar5.e().intValue());
            } else {
                this.B.setColor(bVar.f28223i);
            }
        }
        x2.a<Integer, Integer> aVar6 = this.f4156v.f27289j;
        if (aVar6 == null) {
            i11 = 100;
        } else {
            i11 = aVar6.e().intValue();
        }
        int i14 = (i11 * 255) / 100;
        this.A.setAlpha(i14);
        this.B.setAlpha(i14);
        x2.a<Float, Float> aVar7 = this.M;
        if (aVar7 != null) {
            this.B.setStrokeWidth(aVar7.e().floatValue());
        } else {
            x2.a<Float, Float> aVar8 = this.L;
            if (aVar8 != null) {
                this.B.setStrokeWidth(aVar8.e().floatValue());
            } else {
                this.B.setStrokeWidth(g3.g.c() * bVar.f28224j * g3.g.d(matrix));
            }
        }
        if (this.F.f25935b.f25925g.k() > 0) {
            x2.a<Float, Float> aVar9 = this.P;
            if (aVar9 != null) {
                f12 = aVar9.e().floatValue();
            } else {
                f12 = bVar.f28217c;
            }
            float f15 = f12 / 100.0f;
            float d10 = g3.g.d(matrix);
            String str4 = bVar.f28215a;
            float c10 = g3.g.c() * bVar.f28220f;
            List<String> v10 = v(str4);
            int size = v10.size();
            int i15 = 0;
            while (i15 < size) {
                String str5 = v10.get(i15);
                float f16 = 0.0f;
                int i16 = 0;
                while (i16 < str5.length()) {
                    d d11 = this.G.f25925g.d(d.a(str5.charAt(i16), cVar.f28226a, cVar.f28228c));
                    if (d11 == null) {
                        f14 = c10;
                        i13 = i15;
                        str3 = str5;
                    } else {
                        double d12 = (double) f16;
                        str3 = str5;
                        double d13 = d11.f28231c;
                        f14 = c10;
                        i13 = i15;
                        double d14 = (double) f15;
                        Double.isNaN(d14);
                        Double.isNaN(d14);
                        Double.isNaN(d14);
                        Double.isNaN(d14);
                        double d15 = d13 * d14;
                        double c11 = (double) g3.g.c();
                        Double.isNaN(c11);
                        Double.isNaN(c11);
                        Double.isNaN(c11);
                        Double.isNaN(c11);
                        double d16 = d15 * c11;
                        double d17 = (double) d10;
                        Double.isNaN(d17);
                        Double.isNaN(d17);
                        Double.isNaN(d17);
                        Double.isNaN(d17);
                        Double.isNaN(d12);
                        Double.isNaN(d12);
                        Double.isNaN(d12);
                        Double.isNaN(d12);
                        f16 = (float) ((d16 * d17) + d12);
                    }
                    i16++;
                    str5 = str3;
                    c10 = f14;
                    i15 = i13;
                }
                float f17 = c10;
                String str6 = str5;
                canvas.save();
                s(bVar.f28218d, canvas2, f16);
                int i17 = i15;
                canvas2.translate(0.0f, (((float) i17) * f17) - ((((float) (size - 1)) * f17) / 2.0f));
                int i18 = 0;
                while (i18 < str6.length()) {
                    String str7 = str6;
                    d d18 = this.G.f25925g.d(d.a(str7.charAt(i18), cVar.f28226a, cVar.f28228c));
                    if (d18 == null) {
                        Matrix matrix2 = matrix;
                        list = v10;
                        i12 = size;
                        str2 = str7;
                    } else {
                        if (this.C.containsKey(d18)) {
                            list2 = this.C.get(d18);
                            list = v10;
                            i12 = size;
                            str2 = str7;
                        } else {
                            List<l> list3 = d18.f28229a;
                            int size2 = list3.size();
                            ArrayList arrayList = new ArrayList(size2);
                            list = v10;
                            int i19 = 0;
                            while (i19 < size2) {
                                arrayList.add(new c(this.F, this, list3.get(i19)));
                                i19++;
                                str7 = str7;
                                size = size;
                                list3 = list3;
                            }
                            i12 = size;
                            str2 = str7;
                            this.C.put(d18, arrayList);
                            list2 = arrayList;
                        }
                        int i20 = 0;
                        while (i20 < list2.size()) {
                            Path i21 = ((c) list2.get(i20)).i();
                            i21.computeBounds(this.f4195y, false);
                            this.f4196z.set(matrix);
                            List list4 = list2;
                            this.f4196z.preTranslate(0.0f, (-bVar.f28221g) * g3.g.c());
                            this.f4196z.preScale(f15, f15);
                            i21.transform(this.f4196z);
                            if (bVar.f28225k) {
                                u(i21, this.A, canvas2);
                                u(i21, this.B, canvas2);
                            } else {
                                u(i21, this.B, canvas2);
                                u(i21, this.A, canvas2);
                            }
                            i20++;
                            list2 = list4;
                        }
                        Matrix matrix3 = matrix;
                        float c12 = g3.g.c() * ((float) d18.f28231c) * f15 * d10;
                        float f18 = ((float) bVar.f28219e) / 10.0f;
                        x2.a<Float, Float> aVar10 = this.O;
                        if (aVar10 != null) {
                            f13 = aVar10.e().floatValue();
                        } else {
                            x2.a<Float, Float> aVar11 = this.N;
                            if (aVar11 != null) {
                                f13 = aVar11.e().floatValue();
                            }
                            canvas2.translate((f18 * d10) + c12, 0.0f);
                        }
                        f18 += f13;
                        canvas2.translate((f18 * d10) + c12, 0.0f);
                    }
                    i18++;
                    v10 = list;
                    str6 = str2;
                    size = i12;
                }
                Matrix matrix4 = matrix;
                List<String> list5 = v10;
                int i22 = size;
                canvas.restore();
                i15 = i17 + 1;
                c10 = f17;
            }
        } else {
            Matrix matrix5 = matrix;
            float d19 = g3.g.d(matrix);
            e eVar = this.F;
            String str8 = cVar.f28226a;
            String str9 = cVar.f28228c;
            Typeface typeface = null;
            if (eVar.getCallback() == null) {
                aVar = null;
            } else {
                if (eVar.f25945t == null) {
                    eVar.f25945t = new y2.a(eVar.getCallback());
                }
                aVar = eVar.f25945t;
            }
            if (aVar != null) {
                androidx.appcompat.widget.m mVar = aVar.f27991a;
                mVar.f1021b = str8;
                mVar.f1022c = str9;
                typeface = aVar.f27992b.get(mVar);
                if (typeface == null) {
                    Typeface typeface2 = aVar.f27993c.get(str8);
                    if (typeface2 == null) {
                        StringBuilder a10 = t.f.a("fonts/", str8);
                        a10.append(aVar.f27995e);
                        typeface2 = Typeface.createFromAsset(aVar.f27994d, a10.toString());
                        aVar.f27993c.put(str8, typeface2);
                    }
                    boolean contains = str9.contains("Italic");
                    boolean contains2 = str9.contains("Bold");
                    int i23 = (!contains || !contains2) ? contains ? 2 : contains2 ? 1 : 0 : 3;
                    if (typeface2.getStyle() == i23) {
                        typeface = typeface2;
                    } else {
                        typeface = Typeface.create(typeface2, i23);
                    }
                    aVar.f27992b.put(aVar.f27991a, typeface);
                }
            }
            if (typeface != null) {
                String str10 = bVar.f28215a;
                this.F.getClass();
                this.A.setTypeface(typeface);
                x2.a<Float, Float> aVar12 = this.P;
                if (aVar12 != null) {
                    f10 = aVar12.e().floatValue();
                } else {
                    f10 = bVar.f28217c;
                }
                this.A.setTextSize(g3.g.c() * f10);
                this.B.setTypeface(this.A.getTypeface());
                this.B.setTextSize(this.A.getTextSize());
                float c13 = g3.g.c() * bVar.f28220f;
                List<String> v11 = v(str10);
                int size3 = v11.size();
                for (int i24 = 0; i24 < size3; i24++) {
                    String str11 = v11.get(i24);
                    s(bVar.f28218d, canvas2, this.B.measureText(str11));
                    canvas2.translate(0.0f, (((float) i24) * c13) - ((((float) (size3 - 1)) * c13) / 2.0f));
                    int i25 = 0;
                    while (i25 < str11.length()) {
                        int codePointAt = str11.codePointAt(i25);
                        int charCount = Character.charCount(codePointAt) + i25;
                        while (charCount < str11.length()) {
                            int codePointAt2 = str11.codePointAt(charCount);
                            if (!(Character.getType(codePointAt2) == 16 || Character.getType(codePointAt2) == 27 || Character.getType(codePointAt2) == 6 || Character.getType(codePointAt2) == 28 || Character.getType(codePointAt2) == 19)) {
                                break;
                            }
                            charCount += Character.charCount(codePointAt2);
                            codePointAt = (codePointAt * 31) + codePointAt2;
                        }
                        f<String> fVar = this.D;
                        int i26 = size3;
                        float f19 = c13;
                        long j10 = (long) codePointAt;
                        if (fVar.f24818a) {
                            fVar.d();
                        }
                        if (s.e.b(fVar.f24819b, fVar.f24821d, j10) >= 0) {
                            str = this.D.e(j10);
                        } else {
                            this.f4194x.setLength(0);
                            int i27 = i25;
                            while (i27 < charCount) {
                                int codePointAt3 = str11.codePointAt(i27);
                                this.f4194x.appendCodePoint(codePointAt3);
                                i27 += Character.charCount(codePointAt3);
                            }
                            String sb2 = this.f4194x.toString();
                            this.D.h(j10, sb2);
                            str = sb2;
                        }
                        i25 += str.length();
                        if (bVar.f28225k) {
                            t(str, this.A, canvas2);
                            t(str, this.B, canvas2);
                        } else {
                            t(str, this.B, canvas2);
                            t(str, this.A, canvas2);
                        }
                        float measureText = this.A.measureText(str, 0, 1);
                        float f20 = ((float) bVar.f28219e) / 10.0f;
                        x2.a<Float, Float> aVar13 = this.O;
                        if (aVar13 != null) {
                            f11 = aVar13.e().floatValue();
                        } else {
                            x2.a<Float, Float> aVar14 = this.N;
                            if (aVar14 != null) {
                                f11 = aVar14.e().floatValue();
                            } else {
                                canvas2.translate((f20 * d19) + measureText, 0.0f);
                                c13 = f19;
                                size3 = i26;
                            }
                        }
                        f20 += f11;
                        canvas2.translate((f20 * d19) + measureText, 0.0f);
                        c13 = f19;
                        size3 = i26;
                    }
                    int i28 = size3;
                    float f21 = c13;
                    canvas.setMatrix(matrix);
                }
            }
        }
        canvas.restore();
    }

    public final void s(int i10, Canvas canvas, float f10) {
        int f11 = t.g.f(i10);
        if (f11 == 1) {
            canvas.translate(-f10, 0.0f);
        } else if (f11 == 2) {
            canvas.translate((-f10) / 2.0f, 0.0f);
        }
    }

    public final void t(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
            }
        }
    }

    public final void u(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    public final List<String> v(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }
}

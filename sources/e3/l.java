package e3;

import android.graphics.Color;
import android.graphics.PointF;
import b3.c;
import f3.c;
import g3.f;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: GradientColorParser */
public class l implements h0<c> {

    /* renamed from: a  reason: collision with root package name */
    public int f13563a;

    public l(int i10) {
        this.f13563a = i10;
    }

    public Object a(f3.c cVar, float f10) throws IOException {
        int i10;
        double d10;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        boolean z10 = cVar.M() == c.b.BEGIN_ARRAY;
        if (z10) {
            cVar.a();
        }
        while (cVar.t()) {
            arrayList.add(Float.valueOf((float) cVar.v()));
        }
        if (z10) {
            cVar.i();
        }
        if (this.f13563a == -1) {
            this.f13563a = arrayList.size() / 4;
        }
        int i12 = this.f13563a;
        float[] fArr = new float[i12];
        int[] iArr = new int[i12];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = this.f13563a * 4;
            if (i13 >= i10) {
                break;
            }
            int i16 = i13 / 4;
            double floatValue = (double) ((Float) arrayList.get(i13)).floatValue();
            int i17 = i13 % 4;
            if (i17 == 0) {
                fArr[i16] = (float) floatValue;
            } else if (i17 == 1) {
                Double.isNaN(floatValue);
                Double.isNaN(floatValue);
                i14 = (int) (floatValue * 255.0d);
            } else if (i17 == 2) {
                Double.isNaN(floatValue);
                Double.isNaN(floatValue);
                i15 = (int) (floatValue * 255.0d);
            } else if (i17 == 3) {
                Double.isNaN(floatValue);
                Double.isNaN(floatValue);
                iArr[i16] = Color.argb(255, i14, i15, (int) (floatValue * 255.0d));
            }
            i13++;
        }
        b3.c cVar2 = new b3.c(fArr, iArr);
        if (arrayList.size() > i10) {
            int size = (arrayList.size() - i10) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i18 = 0;
            while (i10 < arrayList.size()) {
                if (i10 % 2 == 0) {
                    dArr[i18] = (double) ((Float) arrayList.get(i10)).floatValue();
                } else {
                    dArr2[i18] = (double) ((Float) arrayList.get(i10)).floatValue();
                    i18++;
                }
                i10++;
            }
            while (true) {
                int[] iArr2 = cVar2.f3466b;
                if (i11 >= iArr2.length) {
                    break;
                }
                int i19 = iArr2[i11];
                double d11 = (double) cVar2.f3465a[i11];
                int i20 = 1;
                while (true) {
                    if (i20 >= size) {
                        d10 = dArr2[size - 1];
                        break;
                    }
                    int i21 = i20 - 1;
                    double d12 = dArr[i21];
                    double d13 = dArr[i20];
                    if (dArr[i20] >= d11) {
                        Double.isNaN(d11);
                        Double.isNaN(d11);
                        Double.isNaN(d11);
                        double d14 = dArr2[i21];
                        double d15 = dArr2[i20];
                        PointF pointF = f.f18435a;
                        d10 = ((d15 - d14) * ((d11 - d12) / (d13 - d12))) + d14;
                        break;
                    }
                    i20++;
                }
                cVar2.f3466b[i11] = Color.argb((int) (d10 * 255.0d), Color.red(i19), Color.green(i19), Color.blue(i19));
                i11++;
            }
        }
        return cVar2;
    }
}

package c2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.v4.media.a;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import f0.m;
import g0.d;
import h.e;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PathInterpolatorCompat */
public class f implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public float[] f4063a;

    /* renamed from: b  reason: collision with root package name */
    public float[] f4064b;

    public f(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        float f10;
        float f11;
        float f12;
        float f13;
        TypedArray d10 = m.d(context.getResources(), context.getTheme(), attributeSet, a.f4049l);
        if (m.c(xmlPullParser, "pathData")) {
            String b10 = m.b(d10, xmlPullParser, "pathData", 4);
            Path d11 = d.d(b10);
            if (d11 != null) {
                a(d11);
            } else {
                throw new InflateException(j.f.a("The path is null, which is created from ", b10));
            }
        } else if (!m.c(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (m.c(xmlPullParser, "controlY1")) {
            if (!m.c(xmlPullParser, "controlX1")) {
                f10 = 0.0f;
            } else {
                f10 = d10.getFloat(0, 0.0f);
            }
            if (!m.c(xmlPullParser, "controlY1")) {
                f11 = 0.0f;
            } else {
                f11 = d10.getFloat(1, 0.0f);
            }
            boolean c10 = m.c(xmlPullParser, "controlX2");
            if (c10 != m.c(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!c10) {
                Path path = new Path();
                path.moveTo(0.0f, 0.0f);
                path.quadTo(f10, f11, 1.0f, 1.0f);
                a(path);
            } else {
                if (!m.c(xmlPullParser, "controlX2")) {
                    f12 = 0.0f;
                } else {
                    f12 = d10.getFloat(2, 0.0f);
                }
                if (!m.c(xmlPullParser, "controlY2")) {
                    f13 = 0.0f;
                } else {
                    f13 = d10.getFloat(3, 0.0f);
                }
                Path path2 = new Path();
                path2.moveTo(0.0f, 0.0f);
                path2.cubicTo(f10, f11, f12, f13, 1.0f, 1.0f);
                a(path2);
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        d10.recycle();
    }

    public final void a(Path path) {
        int i10 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f4063a = new float[min];
            this.f4064b = new float[min];
            float[] fArr = new float[2];
            for (int i11 = 0; i11 < min; i11++) {
                pathMeasure.getPosTan((((float) i11) * length) / ((float) (min - 1)), fArr, (float[]) null);
                this.f4063a[i11] = fArr[0];
                this.f4064b[i11] = fArr[1];
            }
            if (((double) Math.abs(this.f4063a[0])) <= 1.0E-5d && ((double) Math.abs(this.f4064b[0])) <= 1.0E-5d) {
                int i12 = min - 1;
                if (((double) Math.abs(this.f4063a[i12] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.f4064b[i12] - 1.0f)) <= 1.0E-5d) {
                    float f10 = 0.0f;
                    int i13 = 0;
                    while (i10 < min) {
                        float[] fArr2 = this.f4063a;
                        int i14 = i13 + 1;
                        float f11 = fArr2[i13];
                        if (f11 >= f10) {
                            fArr2[i10] = f11;
                            i10++;
                            f10 = f11;
                            i13 = i14;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f11);
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder a10 = a.a("The Path must start at (0,0) and end at (1,1) start: ");
            a10.append(this.f4063a[0]);
            a10.append(",");
            a10.append(this.f4064b[0]);
            a10.append(" end:");
            int i15 = min - 1;
            a10.append(this.f4063a[i15]);
            a10.append(",");
            a10.append(this.f4064b[i15]);
            throw new IllegalArgumentException(a10.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    public float getInterpolation(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        int i10 = 0;
        int length = this.f4063a.length - 1;
        while (length - i10 > 1) {
            int i11 = (i10 + length) / 2;
            if (f10 < this.f4063a[i11]) {
                length = i11;
            } else {
                i10 = i11;
            }
        }
        float[] fArr = this.f4063a;
        float f11 = fArr[length] - fArr[i10];
        if (f11 == 0.0f) {
            return this.f4064b[i10];
        }
        float[] fArr2 = this.f4064b;
        float f12 = fArr2[i10];
        return e.a(fArr2[length], f12, (f10 - fArr[i10]) / f11, f12);
    }
}

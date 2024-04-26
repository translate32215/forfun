package e;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import g0.a;
import java.util.Map;
import mb.f;
import mb.h;
import p9.b;

public class d {
    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void c(h hVar) {
        if (hVar.f21785g) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static void d(h hVar) {
        if (!hVar.f21784f) {
            throw new IllegalStateException("AdSession is not started");
        } else if (hVar.f21785g) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static void e(h hVar) {
        if (!(f.NATIVE == ((f) hVar.f21780b.f14053a))) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    public static int f(Context context, int i10, int i11) {
        TypedValue a10 = b.a(context, i10);
        return a10 != null ? a10.data : i11;
    }

    public static int g(View view, int i10) {
        return b.c(view.getContext(), i10, view.getClass().getCanonicalName());
    }

    public static boolean h(int i10) {
        double d10;
        double d11;
        double d12;
        if (i10 != 0) {
            ThreadLocal<double[]> threadLocal = a.f18353a;
            double[] dArr = threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i10);
            int green = Color.green(i10);
            int blue = Color.blue(i10);
            if (dArr.length == 3) {
                double d13 = (double) red;
                Double.isNaN(d13);
                Double.isNaN(d13);
                Double.isNaN(d13);
                Double.isNaN(d13);
                double d14 = d13 / 255.0d;
                if (d14 < 0.04045d) {
                    d10 = d14 / 12.92d;
                } else {
                    d10 = Math.pow((d14 + 0.055d) / 1.055d, 2.4d);
                }
                double d15 = (double) green;
                Double.isNaN(d15);
                Double.isNaN(d15);
                Double.isNaN(d15);
                Double.isNaN(d15);
                double d16 = d15 / 255.0d;
                if (d16 < 0.04045d) {
                    d11 = d16 / 12.92d;
                } else {
                    d11 = Math.pow((d16 + 0.055d) / 1.055d, 2.4d);
                }
                double[] dArr2 = dArr;
                double d17 = (double) blue;
                Double.isNaN(d17);
                Double.isNaN(d17);
                Double.isNaN(d17);
                Double.isNaN(d17);
                double d18 = d17 / 255.0d;
                if (d18 < 0.04045d) {
                    d12 = d18 / 12.92d;
                } else {
                    d12 = Math.pow((d18 + 0.055d) / 1.055d, 2.4d);
                }
                double d19 = d12;
                dArr2[0] = ((0.1805d * d19) + (0.3576d * d11) + (0.4124d * d10)) * 100.0d;
                dArr2[1] = ((0.0722d * d19) + (0.7152d * d11) + (0.2126d * d10)) * 100.0d;
                double d20 = d19 * 0.9505d;
                dArr2[2] = (d20 + (d11 * 0.1192d) + (d10 * 0.0193d)) * 100.0d;
                if (dArr2[1] / 100.0d > 0.5d) {
                    return true;
                }
            } else {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
        }
        return false;
    }

    public static boolean i(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean j(int i10, int i11) {
        return i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && i10 <= 512 && i11 <= 384;
    }

    public static int k(int i10, int i11, float f10) {
        return a.b(a.e(i11, Math.round(((float) Color.alpha(i11)) * f10)), i10);
    }

    public static o6.f l(o6.f fVar, String[] strArr, Map<String, o6.f> map) {
        int i10 = 0;
        if (fVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                o6.f fVar2 = new o6.f();
                int length = strArr.length;
                while (i10 < length) {
                    fVar2.a(map.get(strArr[i10]));
                    i10++;
                }
                return fVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            fVar.a(map.get(strArr[0]));
            return fVar;
        } else if (strArr != null && strArr.length > 1) {
            int length2 = strArr.length;
            while (i10 < length2) {
                fVar.a(map.get(strArr[i10]));
                i10++;
            }
        }
        return fVar;
    }

    public static float m(int i10, float f10, int i11, int i12) {
        float f11;
        if (f10 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f11 = (float) i12;
        } else if (i10 == 1) {
            f11 = (float) i11;
        } else if (i10 != 2) {
            return -3.4028235E38f;
        } else {
            return f10;
        }
        return f10 * f11;
    }
}

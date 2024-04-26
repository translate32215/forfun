package t;

import android.graphics.Paint;

public /* synthetic */ class g {

    /* renamed from: a  reason: collision with root package name */
    public static /* synthetic */ int[] f25306a;

    /* renamed from: b  reason: collision with root package name */
    public static /* synthetic */ int[] f25307b;

    /* renamed from: c  reason: collision with root package name */
    public static /* synthetic */ int[] f25308c;

    /* renamed from: d  reason: collision with root package name */
    public static /* synthetic */ int[] f25309d;

    /* renamed from: e  reason: collision with root package name */
    public static /* synthetic */ int[] f25310e;

    public static synchronized /* synthetic */ int[] a() {
        int[] iArr;
        synchronized (g.class) {
            if (f25306a == null) {
                f25306a = g(3);
            }
            iArr = f25306a;
        }
        return iArr;
    }

    public static synchronized /* synthetic */ int[] b() {
        int[] iArr;
        synchronized (g.class) {
            if (f25307b == null) {
                f25307b = g(2);
            }
            iArr = f25307b;
        }
        return iArr;
    }

    public static synchronized /* synthetic */ int[] c() {
        int[] iArr;
        synchronized (g.class) {
            if (f25308c == null) {
                f25308c = g(3);
            }
            iArr = f25308c;
        }
        return iArr;
    }

    public static int[] com$airbnb$lottie$model$DocumentData$Justification$s$values() {
        return (int[]) a().clone();
    }

    public static int[] com$airbnb$lottie$model$content$PolystarShape$Type$s$values() {
        return (int[]) b().clone();
    }

    public static int[] com$airbnb$lottie$model$content$ShapeStroke$LineCapType$s$values() {
        return (int[]) c().clone();
    }

    public static int[] com$airbnb$lottie$model$content$ShapeStroke$LineJoinType$s$values() {
        return (int[]) d().clone();
    }

    public static int[] com$airbnb$lottie$model$layer$Layer$MatteType$s$values() {
        return (int[]) e().clone();
    }

    public static synchronized /* synthetic */ int[] d() {
        int[] iArr;
        synchronized (g.class) {
            if (f25309d == null) {
                f25309d = g(3);
            }
            iArr = f25309d;
        }
        return iArr;
    }

    public static synchronized /* synthetic */ int[] e() {
        int[] iArr;
        synchronized (g.class) {
            if (f25310e == null) {
                f25310e = g(4);
            }
            iArr = f25310e;
        }
        return iArr;
    }

    public static /* synthetic */ int f(int i10) {
        if (i10 != 0) {
            return i10 - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] g(int i10) {
        int[] iArr = new int[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = i11 + 1;
            iArr[i11] = i12;
            i11 = i12;
        }
        return iArr;
    }

    public static /* synthetic */ void h(int i10) {
        if (i10 == 0) {
            throw null;
        }
    }

    public static Paint.Cap i(int i10) {
        int f10 = f(i10);
        if (f10 == 0) {
            return Paint.Cap.BUTT;
        }
        if (f10 != 1) {
            return Paint.Cap.SQUARE;
        }
        return Paint.Cap.ROUND;
    }

    public static Paint.Join j(int i10) {
        int f10 = f(i10);
        if (f10 == 0) {
            return Paint.Join.MITER;
        }
        if (f10 == 1) {
            return Paint.Join.ROUND;
        }
        if (f10 != 2) {
            return null;
        }
        return Paint.Join.BEVEL;
    }

    public static /* synthetic */ boolean k(int i10) {
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return false;
        }
        if (i10 == 4 || i10 == 5) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ int l(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        throw null;
    }
}

package g2;

import android.util.Log;

/* compiled from: Logger */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static e f18408a;

    /* compiled from: Logger */
    public static class a extends e {

        /* renamed from: b  reason: collision with root package name */
        public int f18409b;

        public a(int i10) {
            this.f18409b = i10;
        }

        public void a(String str, String str2, Throwable... thArr) {
            if (this.f18409b > 3) {
                return;
            }
            if (thArr.length >= 1) {
                Log.d(str, str2, thArr[0]);
            } else {
                Log.d(str, str2);
            }
        }

        public void b(String str, String str2, Throwable... thArr) {
            if (this.f18409b > 6) {
                return;
            }
            if (thArr.length >= 1) {
                Log.e(str, str2, thArr[0]);
            } else {
                Log.e(str, str2);
            }
        }

        public void d(String str, String str2, Throwable... thArr) {
            if (this.f18409b > 4) {
                return;
            }
            if (thArr.length >= 1) {
                Log.i(str, str2, thArr[0]);
            } else {
                Log.i(str, str2);
            }
        }

        public void f(String str, String str2, Throwable... thArr) {
            if (this.f18409b > 5) {
                return;
            }
            if (thArr.length >= 1) {
                Log.w(str, str2, thArr[0]);
            } else {
                Log.w(str, str2);
            }
        }
    }

    public static synchronized e c() {
        e eVar;
        synchronized (e.class) {
            if (f18408a == null) {
                f18408a = new a(3);
            }
            eVar = f18408a;
        }
        return eVar;
    }

    public static String e(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void f(String str, String str2, Throwable... thArr);
}

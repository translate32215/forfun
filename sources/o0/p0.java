package o0;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: WindowInsetsControllerCompat */
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    public final e f22627a;

    /* compiled from: WindowInsetsControllerCompat */
    public static class a extends e {

        /* renamed from: a  reason: collision with root package name */
        public final Window f22628a;

        /* renamed from: b  reason: collision with root package name */
        public final View f22629b;

        public a(Window window, View view) {
            this.f22628a = window;
            this.f22629b = view;
        }
    }

    /* compiled from: WindowInsetsControllerCompat */
    public static class b extends a {
        public b(Window window, View view) {
            super(window, view);
        }

        public void b(boolean z10) {
            if (z10) {
                this.f22628a.clearFlags(67108864);
                this.f22628a.addFlags(Integer.MIN_VALUE);
                View decorView = this.f22628a.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                return;
            }
            View decorView2 = this.f22628a.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -8193);
        }
    }

    /* compiled from: WindowInsetsControllerCompat */
    public static class c extends b {
        public c(Window window, View view) {
            super(window, view);
        }

        public void a(boolean z10) {
            if (z10) {
                this.f22628a.clearFlags(134217728);
                this.f22628a.addFlags(Integer.MIN_VALUE);
                View decorView = this.f22628a.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                return;
            }
            View decorView2 = this.f22628a.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -17);
        }
    }

    /* compiled from: WindowInsetsControllerCompat */
    public static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        public final WindowInsetsController f22630a;

        /* renamed from: b  reason: collision with root package name */
        public Window f22631b;

        public d(Window window, p0 p0Var) {
            this.f22630a = window.getInsetsController();
            this.f22631b = window;
        }

        public void a(boolean z10) {
            if (z10) {
                Window window = this.f22631b;
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                }
                this.f22630a.setSystemBarsAppearance(16, 16);
                return;
            }
            Window window2 = this.f22631b;
            if (window2 != null) {
                View decorView2 = window2.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -17);
            }
            this.f22630a.setSystemBarsAppearance(0, 16);
        }

        public void b(boolean z10) {
            if (z10) {
                Window window = this.f22631b;
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                }
                this.f22630a.setSystemBarsAppearance(8, 8);
                return;
            }
            Window window2 = this.f22631b;
            if (window2 != null) {
                View decorView2 = window2.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -8193);
            }
            this.f22630a.setSystemBarsAppearance(0, 8);
        }
    }

    /* compiled from: WindowInsetsControllerCompat */
    public static class e {
        public void a(boolean z10) {
        }

        public void b(boolean z10) {
        }
    }

    public p0(Window window, View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f22627a = new d(window, this);
        } else if (i10 >= 26) {
            this.f22627a = new c(window, view);
        } else if (i10 >= 23) {
            this.f22627a = new b(window, view);
        } else if (i10 >= 20) {
            this.f22627a = new a(window, view);
        } else {
            this.f22627a = new e();
        }
    }
}

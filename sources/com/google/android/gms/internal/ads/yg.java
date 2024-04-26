package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.ma;
import e8.b60;
import e8.db0;
import e8.eb0;
import e8.f60;
import e8.jb0;
import e8.lb0;
import e8.mb0;
import e8.q10;
import e8.qz;
import e8.t;
import e8.t60;
import e8.ti0;
import f7.f0;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class yg extends hh {
    public static q10 G = null;
    public static ExecutorService H = null;
    public static mf I = null;
    public static final Object J = new Object();
    public static boolean K = false;
    public static long L;
    public boolean C = false;
    public String D;
    public mb0 E;
    public int F = 1;

    public yg(Context context, String str, boolean z10, int i10) {
        super(context);
        this.D = str;
        this.C = z10;
        this.F = i10;
    }

    public static jb0 k(fr frVar, MotionEvent motionEvent, DisplayMetrics displayMetrics) throws eb0 {
        Method b10 = frVar.b("tsMTpDI8fyODSarIijCE1L1+x7u+f9NgWgzvKaIqmjKzRpEzVG9oFV1DR37Gu8R+", "FtN51S+payiCWbYnMqpVPDjZ/oSC0jTjl5E/vnc7TJ4=");
        if (b10 == null || motionEvent == null) {
            throw new eb0();
        }
        try {
            return new jb0((String) b10.invoke((Object) null, new Object[]{motionEvent, displayMetrics}));
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new eb0(e10);
        }
    }

    public static void n(List<Callable<Void>> list) {
        ExecutorService executorService;
        if (hh.B != null && (executorService = hh.B.f6480b) != null && !list.isEmpty()) {
            try {
                executorService.invokeAll(list, ((Long) ti0.f16763j.f16769f.a(t.f16616m1)).longValue(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException e10) {
                int i10 = lb0.f15378a;
                StringWriter stringWriter = new StringWriter();
                t60.f16708a.a(e10, new PrintWriter(stringWriter));
                Log.d("yg", String.format("class methods got exception: %s", new Object[]{stringWriter.toString()}));
            }
        }
    }

    public static fr o(Context context, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        if (hh.B == null) {
            synchronized (J) {
                if (hh.B == null) {
                    fr a10 = fr.a(context, "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", z10);
                    if (a10.f6494p) {
                        try {
                            z11 = ((Boolean) ti0.f16763j.f16769f.a(t.f16652s1)).booleanValue();
                        } catch (IllegalStateException unused) {
                            z11 = false;
                        }
                        if (z11) {
                            a10.e("LSN2SsuAiZt66Ly6gZRukDC2DTjf04tC/Nsuivd3hcf60QwmLtKfA3vzupcozm4l", "5ygsPobYt1X5WrczOXkjmvRKWvB07MQMJHpWX2yDXBY=", new Class[0]);
                        }
                        a10.e("OWd9rVZHQHX0ZS0khfLk9EbaV5B3660u9zEaKwzJiuzlEk0jPLbdFO63rEPIwHWE", "XTJhw9owXn6RPlXdkw8MehSfVDAvl+AxD3gfvf4NYBI=", Context.class);
                        a10.e("swMoGPiYWmOaYsBrXlbRTk2xY6t7IeutWiSU6jJs4l7KUZ7U49HJBw8eYWHOz9Bh", "SaHODimbUpJ6mY/fLguLdMJxF8OIYUrixvGtXUWpBJo=", Context.class);
                        a10.e("x7P77leKfFYr4j4i3CLCBDNgP3pFNdYonwHsyKoAc17n8v9lny7xt541iCBBLU/Z", "IvHYIWKXYkH/x/6pbM2Aw+Upqbpz7J/VSATO+q5xqzc=", Context.class);
                        a10.e("uaXo1dGCYoBTXzBmbXxi3b0inzn5tdACUzmycOuAkUUHMDuSUrdTXSMwC/sV5iyl", "IWvVlD7XDGJT+R0Pmz7Bfi1B+mNDWBkptqA/1DggT6Y=", Context.class);
                        a10.e("RXiJGJdNEl7KURgTALxq3toAekiXr7on2IaHhdkHTqrfEG3Hg9fTaSEFzwQWN0O7", "2p8pGGxBUyM0tkZKKdDHYuiATKux+mYAGEUtBWqt6Z4=", Context.class);
                        Class cls = Boolean.TYPE;
                        a10.e("QiHtazJy0fTLaV7btNXPabAuf1Q4F0Nyub9QYk5ytOY9IAoutP7A5naNhYnFRxEF", "QZB2SscfASrdMUjwfQhEivbeqU7IzpBqT2jnC70TeUo=", Context.class, cls);
                        a10.e("ih2bgj03Fn/jCX/5J0vX41fU/2kxECdMoZoIxI7lQ0VRlZ2Tm/2Ktk2OBC37WWdQ", "SC2Dps5y0LYSj5lmbRLCKeuOpq1ahMPNAM/09kUTkbA=", Context.class);
                        a10.e("0kghzsq4d5KkJhXyQHICWjzzhayB3Pf1MtXvQ0GJQnVrFUbS0rnbBIDCslmxnHt5", "lm1fz5cB+kFLkl+VM20/pNpkXaVJxMkVHBNlzH/QaeU=", Context.class);
                        a10.e("tsMTpDI8fyODSarIijCE1L1+x7u+f9NgWgzvKaIqmjKzRpEzVG9oFV1DR37Gu8R+", "FtN51S+payiCWbYnMqpVPDjZ/oSC0jTjl5E/vnc7TJ4=", MotionEvent.class, DisplayMetrics.class);
                        a10.e("bZ5kSlhJ1XrzSa9OtgNBKblj5lluC2OJ8ab8KD8XBPMS38pA7up9HAOk8mdBX560", "WgS/yqRTzuePlocEVINhxMekmQj5qknBOOY0/T78I+U=", MotionEvent.class, DisplayMetrics.class);
                        a10.e("DOe3W9WTDibsU5nlZSfTjFad6KIPoFDy87OyGRCVcEgByjdMDK067u2DiuZT6TWL", "7BUz0OBf7+ML48TB+mqZg7eDQ7HJG1RXX9OKwUgsRpo=", new Class[0]);
                        a10.e("7gPOzbYPbY9l09njZifP9g8ThZdbF3fuCt6RGghbPQ+cWFSph4jCFHE8TlwT0u+4", "Hly5o4dGNQoHW2LZnWgI2Gqf+SwKx5WDF2FtVpJbRZY=", new Class[0]);
                        a10.e("hGLcUZy7QJxpIFFoHaFrsCRQgikzvfzIB3nOrkbIskWYbM4LpXHnEs8Z3KQSkRP+", "eLtpQvxytvRqA/n+HcvMnWbOC2DK/MHgGHjSXCUDZcI=", new Class[0]);
                        a10.e("30sGXhJhqECSbxBrxpYs+eqbFsLbmnk0gEA/3txqs+yRgEdkRS85JZuwwk3OwiXu", "wT8+YTIwl8aegKTiNtlGd9JdiuZ5AtxnN0Fij8jx+D8=", new Class[0]);
                        a10.e("t98sFdZCf+2yY3X2rWDcXGDFZPmYGQAAueQ1SiFuRbO/5aRalN9g+/de1ZaXnrfc", "GrfTFgpt7sSDkcfpMLAhzrTbjYtAChN4F2zsV6BP/K8=", new Class[0]);
                        a10.e("3/2EVHID/CaZ2gn/aGWl9erm8g/u6hHJA+GqphFVZPfR29kGmaPZXpJ2YJZ6rZxD", "TQh3XeDTGSgUnDDxQSiz+gVlXWmppEL1MQ20cYDnGRc=", new Class[0]);
                        a10.e("aCCZCbS+9NJFv/YAVF7TpEKg0nYUkVoW2AYXpByZbcIsxqmcM0FWYUY0WIw1JfrU", "BRdGeugnAVglW45lVGjb00YHnTumJRQBRLhwBQiv+gg=", Context.class, cls);
                        a10.e("2OT9joYVrtTFTzezyKMktw58CZQmMC35eJC+g1DHtwiSJr7noWsTHqhuY6WR+06T", "1wYR8NMMHfWVGRf8RctC3KcGQzbPb/adZ5AefPK64XU=", StackTraceElement[].class);
                        a10.e("4IM85+6v3LeUlrQpLyUYglzhWSXBRNhKw3jh1MpUR1QvY2mS/I7/7C3SpZg9WTtv", "bbyFmZEyJYCRokt7AiYGwLMj+QsOY/g8bHL496ENJG4=", View.class, DisplayMetrics.class, cls);
                        a10.e("5x95xviEfbAhIbYzSrGYR99NaTdv0p2F2c0uD4HKF00w0mXjhn6+rMzEq1UuK7Sf", "MBkPgAnoaWunTXErk+t/JkidpIKZWqWzPbH1kKd+NAo=", Context.class, cls);
                        a10.e("wyomtAf9aaDe4uh3HjP+w/SAflo1aMf7H19nx9VUSz0R8wyUCMRB6eUzyTQ6kBJm", "9v6/WbN4SwoX0dkLbN30Zt9YVZerxrY9kvPYKpvvHRw=", View.class, Activity.class, cls);
                        a10.e("O0wRBO+iMnRO+Ddb8OSO41ojlKBxPu1wLxRRvhtDAFc9BIrQG5HyWkGaF3x5ZQwY", "Jmojlt8BV+HNELIbIaohRB5/i70XlTf3BS5d4N7mO2A=", Long.TYPE);
                        try {
                            z12 = ((Boolean) ti0.f16763j.f16769f.a(t.f16682x1)).booleanValue();
                        } catch (IllegalStateException unused2) {
                            z12 = false;
                        }
                        if (z12) {
                            a10.e("A05+fOGklvEwCTFJ6ISB85BcMQZ7zvRhP4JRWwMAEEmWGE8SgtWzeK5oJDqN1Mr4", "PGaBuV/PRgCSSO8HeKm5FHoGzUyOVD8Erwj9ggcBmCI=", Context.class);
                        }
                        a10.e("IMcWE4yaSiuoPOIQYVeDDfvQ+r1BlnlQh1wSO7pBCPYrDJXPlm5yzVGcP/WnLuXO", "5CXnDu/RZt1ax7TO9HVEaIgTQqf4CPw+qY72xI6bmuE=", Context.class);
                        try {
                            z13 = ((Boolean) ti0.f16763j.f16769f.a(t.f16688y1)).booleanValue();
                        } catch (IllegalStateException unused3) {
                            z13 = false;
                        }
                        if (z13) {
                            a10.e("SQqXKCmI1E5h4Er+ccgj0aFE7Xvk5c9d4Lbb1PtR6Om1y1e4nsTnFo9mpsW10lXC", "M1ea2BbF7H0ixZb8Wl1WAHYykoSJipCxJ9j0CCAQeZs=", Context.class);
                        }
                    }
                    hh.B = a10;
                }
            }
        }
        return hh.B;
    }

    public static boolean q(int i10) {
        if (i10 == 1) {
            try {
                if (((Boolean) ti0.f16763j.f16769f.a(t.f16580g1)).booleanValue()) {
                    return true;
                }
            } catch (IllegalStateException unused) {
            }
        }
        return false;
    }

    public final void a(View view) {
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16634p1)).booleanValue()) {
            if (this.E == null) {
                fr frVar = hh.B;
                this.E = new mb0(frVar.f6479a, frVar.f6495q);
            }
            this.E.e(view);
        }
    }

    public final void b(int i10, int i11, int i12) {
        int i13 = i10;
        int i14 = i11;
        int i15 = i12;
        if (q(this.F)) {
            H.execute(new f60(i15, i13, i14));
        }
        if (this.f6865a != null) {
            if (((Boolean) ti0.f16763j.f16769f.a(t.f16598j1)).booleanValue()) {
                i();
            } else {
                this.f6865a.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.A;
        if (displayMetrics != null) {
            long j10 = (long) i15;
            float f10 = displayMetrics.density;
            this.f6865a = MotionEvent.obtain(0, j10, 1, ((float) i13) * f10, ((float) i14) * f10, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.f6865a = null;
        }
        this.f6882z = false;
    }

    public final String c(Context context) {
        if (q(this.F)) {
            H.execute(new qz(context));
        }
        int i10 = lb0.f15378a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return h(context, (String) null, 1, (View) null, (Activity) null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    public final String d(Context context, View view, Activity activity) {
        if (q(this.F)) {
            H.execute(new f0(context, view, activity));
        }
        return h(context, (String) null, 2, view, activity);
    }

    public final void f(MotionEvent motionEvent) {
        if (q(this.F)) {
            H.execute(new qz(motionEvent));
        }
        boolean z10 = false;
        if (this.f6881y) {
            i();
            this.f6881y = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f6874r = 0.0d;
            this.f6875s = (double) motionEvent.getRawX();
            this.f6876t = (double) motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = (double) motionEvent.getRawX();
            double rawY = (double) motionEvent.getRawY();
            double d10 = this.f6875s;
            Double.isNaN(rawX);
            Double.isNaN(rawX);
            double d11 = rawX - d10;
            double d12 = this.f6876t;
            Double.isNaN(rawY);
            Double.isNaN(rawY);
            double d13 = rawY - d12;
            this.f6874r = Math.sqrt((d13 * d13) + (d11 * d11)) + this.f6874r;
            this.f6875s = rawX;
            this.f6876t = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 == 0) {
            this.f6877u = motionEvent.getX();
            this.f6878v = motionEvent.getY();
            this.f6879w = motionEvent.getRawX();
            this.f6880x = motionEvent.getRawY();
            this.f6867c++;
        } else if (action2 == 1) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            this.f6865a = obtain;
            this.f6866b.add(obtain);
            if (this.f6866b.size() > 6) {
                this.f6866b.remove().recycle();
            }
            this.f6869e++;
            this.f6871g = j(new Throwable().getStackTrace());
        } else if (action2 == 2) {
            this.f6868d += (long) (motionEvent.getHistorySize() + 1);
            try {
                jb0 p10 = p(motionEvent);
                Long l10 = p10.f15125d;
                if ((l10 == null || p10.f15128g == null) ? false : true) {
                    this.f6872h = l10.longValue() + p10.f15128g.longValue() + this.f6872h;
                }
                if (!(this.A == null || p10.f15126e == null || p10.f15129h == null)) {
                    z10 = true;
                }
                if (z10) {
                    this.f6873i = p10.f15126e.longValue() + p10.f15129h.longValue() + this.f6873i;
                }
            } catch (eb0 unused) {
            }
        } else if (action2 == 3) {
            this.f6870f++;
        }
        this.f6882z = true;
    }

    public final String g(Context context, String str, View view, Activity activity) {
        if (q(this.F)) {
            H.execute(new b60(context, str, view, activity));
        }
        return h(context, str, 3, view, activity);
    }

    public final long j(StackTraceElement[] stackTraceElementArr) throws eb0 {
        Method b10 = hh.B.b("2OT9joYVrtTFTzezyKMktw58CZQmMC35eJC+g1DHtwiSJr7noWsTHqhuY6WR+06T", "1wYR8NMMHfWVGRf8RctC3KcGQzbPb/adZ5AefPK64XU=");
        if (b10 == null || stackTraceElementArr == null) {
            throw new eb0();
        }
        try {
            return new db0((String) b10.invoke((Object) null, new Object[]{stackTraceElementArr})).f14242a.longValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new eb0(e10);
        }
    }

    public List<Callable<Void>> l(fr frVar, Context context, ma.a aVar, n9 n9Var) {
        int h10 = frVar.h();
        ArrayList arrayList = new ArrayList();
        if (!frVar.f6494p) {
            aVar.q((long) 16384);
            return arrayList;
        }
        fr frVar2 = frVar;
        ma.a aVar2 = aVar;
        arrayList.add(new lr(frVar2, "aCCZCbS+9NJFv/YAVF7TpEKg0nYUkVoW2AYXpByZbcIsxqmcM0FWYUY0WIw1JfrU", "BRdGeugnAVglW45lVGjb00YHnTumJRQBRLhwBQiv+gg=", aVar2, h10, context, n9Var));
        arrayList.add(new pr(frVar2, "DOe3W9WTDibsU5nlZSfTjFad6KIPoFDy87OyGRCVcEgByjdMDK067u2DiuZT6TWL", "7BUz0OBf7+ML48TB+mqZg7eDQ7HJG1RXX9OKwUgsRpo=", aVar2, L, h10));
        int i10 = h10;
        arrayList.add(new ur(frVar2, "hGLcUZy7QJxpIFFoHaFrsCRQgikzvfzIB3nOrkbIskWYbM4LpXHnEs8Z3KQSkRP+", "eLtpQvxytvRqA/n+HcvMnWbOC2DK/MHgGHjSXCUDZcI=", aVar2, i10));
        arrayList.add(new as(frVar2, "x7P77leKfFYr4j4i3CLCBDNgP3pFNdYonwHsyKoAc17n8v9lny7xt541iCBBLU/Z", "IvHYIWKXYkH/x/6pbM2Aw+Upqbpz7J/VSATO+q5xqzc=", aVar2, i10));
        arrayList.add(new ds(frVar2, "7gPOzbYPbY9l09njZifP9g8ThZdbF3fuCt6RGghbPQ+cWFSph4jCFHE8TlwT0u+4", "Hly5o4dGNQoHW2LZnWgI2Gqf+SwKx5WDF2FtVpJbRZY=", aVar2, i10));
        arrayList.add(new jr(frVar2, "swMoGPiYWmOaYsBrXlbRTk2xY6t7IeutWiSU6jJs4l7KUZ7U49HJBw8eYWHOz9Bh", "SaHODimbUpJ6mY/fLguLdMJxF8OIYUrixvGtXUWpBJo=", aVar2, i10, context));
        arrayList.add(new nr(frVar2, "uaXo1dGCYoBTXzBmbXxi3b0inzn5tdACUzmycOuAkUUHMDuSUrdTXSMwC/sV5iyl", "IWvVlD7XDGJT+R0Pmz7Bfi1B+mNDWBkptqA/1DggT6Y=", aVar2, i10));
        arrayList.add(new wr(frVar2, "RXiJGJdNEl7KURgTALxq3toAekiXr7on2IaHhdkHTqrfEG3Hg9fTaSEFzwQWN0O7", "2p8pGGxBUyM0tkZKKdDHYuiATKux+mYAGEUtBWqt6Z4=", aVar2, i10));
        arrayList.add(new yr(frVar2, "QiHtazJy0fTLaV7btNXPabAuf1Q4F0Nyub9QYk5ytOY9IAoutP7A5naNhYnFRxEF", "QZB2SscfASrdMUjwfQhEivbeqU7IzpBqT2jnC70TeUo=", aVar2, i10));
        arrayList.add(new mr(frVar2, "30sGXhJhqECSbxBrxpYs+eqbFsLbmnk0gEA/3txqs+yRgEdkRS85JZuwwk3OwiXu", "wT8+YTIwl8aegKTiNtlGd9JdiuZ5AtxnN0Fij8jx+D8=", aVar2, i10));
        arrayList.add(new qr(frVar2, "t98sFdZCf+2yY3X2rWDcXGDFZPmYGQAAueQ1SiFuRbO/5aRalN9g+/de1ZaXnrfc", "GrfTFgpt7sSDkcfpMLAhzrTbjYtAChN4F2zsV6BP/K8=", aVar2, i10));
        arrayList.add(new gs(frVar2, "ih2bgj03Fn/jCX/5J0vX41fU/2kxECdMoZoIxI7lQ0VRlZ2Tm/2Ktk2OBC37WWdQ", "SC2Dps5y0LYSj5lmbRLCKeuOpq1ahMPNAM/09kUTkbA=", aVar2, i10));
        arrayList.add(new kr(frVar2, "0kghzsq4d5KkJhXyQHICWjzzhayB3Pf1MtXvQ0GJQnVrFUbS0rnbBIDCslmxnHt5", "lm1fz5cB+kFLkl+VM20/pNpkXaVJxMkVHBNlzH/QaeU=", aVar2, i10));
        arrayList.add(new bs(frVar2, "3/2EVHID/CaZ2gn/aGWl9erm8g/u6hHJA+GqphFVZPfR29kGmaPZXpJ2YJZ6rZxD", "TQh3XeDTGSgUnDDxQSiz+gVlXWmppEL1MQ20cYDnGRc=", aVar2, i10));
        arrayList.add(new zr(frVar2, "5x95xviEfbAhIbYzSrGYR99NaTdv0p2F2c0uD4HKF00w0mXjhn6+rMzEq1UuK7Sf", "MBkPgAnoaWunTXErk+t/JkidpIKZWqWzPbH1kKd+NAo=", aVar2, i10));
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16688y1)).booleanValue()) {
            arrayList.add(new sr(frVar, "SQqXKCmI1E5h4Er+ccgj0aFE7Xvk5c9d4Lbb1PtR6Om1y1e4nsTnFo9mpsW10lXC", "M1ea2BbF7H0ixZb8Wl1WAHYykoSJipCxJ9j0CCAQeZs=", aVar, h10));
        }
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16682x1)).booleanValue()) {
            arrayList.add(new xr(frVar, "A05+fOGklvEwCTFJ6ISB85BcMQZ7zvRhP4JRWwMAEEmWGE8SgtWzeK5oJDqN1Mr4", "PGaBuV/PRgCSSO8HeKm5FHoGzUyOVD8Erwj9ggcBmCI=", aVar, h10));
        }
        arrayList.add(new tr(frVar, "IMcWE4yaSiuoPOIQYVeDDfvQ+r1BlnlQh1wSO7pBCPYrDJXPlm5yzVGcP/WnLuXO", "5CXnDu/RZt1ax7TO9HVEaIgTQqf4CPw+qY72xI6bmuE=", aVar, h10));
        return arrayList;
    }

    public final void m(fr frVar, ma.a aVar, View view, Activity activity, boolean z10) {
        List list;
        Long l10;
        MotionEvent motionEvent;
        fr frVar2 = frVar;
        ma.a aVar2 = aVar;
        nb nbVar = nb.ENUM_TRUE;
        nb nbVar2 = nb.ENUM_FALSE;
        if (!frVar2.f6494p) {
            aVar2.q((long) 16384);
            list = Arrays.asList(new Callable[]{new rr(frVar2, aVar2)});
        } else {
            try {
                jb0 k10 = k(frVar2, this.f6865a, this.A);
                Long l11 = k10.f15122a;
                if (l11 != null) {
                    long longValue = l11.longValue();
                    if (aVar2.f5971c) {
                        aVar.n();
                        aVar2.f5971c = false;
                    }
                    ma.l0((ma) aVar2.f5970b, longValue);
                }
                Long l12 = k10.f15123b;
                if (l12 != null) {
                    long longValue2 = l12.longValue();
                    if (aVar2.f5971c) {
                        aVar.n();
                        aVar2.f5971c = false;
                    }
                    ma.n0((ma) aVar2.f5970b, longValue2);
                }
                Long l13 = k10.f15124c;
                if (l13 != null) {
                    long longValue3 = l13.longValue();
                    if (aVar2.f5971c) {
                        aVar.n();
                        aVar2.f5971c = false;
                    }
                    ma.p0((ma) aVar2.f5970b, longValue3);
                }
                if (this.f6882z) {
                    Long l14 = k10.f15125d;
                    if (l14 != null) {
                        long longValue4 = l14.longValue();
                        if (aVar2.f5971c) {
                            aVar.n();
                            aVar2.f5971c = false;
                        }
                        ma.A0((ma) aVar2.f5970b, longValue4);
                    }
                    Long l15 = k10.f15126e;
                    if (l15 != null) {
                        long longValue5 = l15.longValue();
                        if (aVar2.f5971c) {
                            aVar.n();
                            aVar2.f5971c = false;
                        }
                        ma.B0((ma) aVar2.f5970b, longValue5);
                    }
                }
            } catch (eb0 unused) {
            }
            ma.d.a A = ma.d.A();
            if (this.f6867c > 0) {
                DisplayMetrics displayMetrics = this.A;
                int i10 = lb0.f15378a;
                if ((displayMetrics == null || displayMetrics.density == 0.0f) ? false : true) {
                    long a10 = lb0.a(this.f6874r, displayMetrics);
                    if (A.f5971c) {
                        A.n();
                        A.f5971c = false;
                    }
                    ma.d.N((ma.d) A.f5970b, a10);
                    long a11 = lb0.a((double) (this.f6879w - this.f6877u), this.A);
                    if (A.f5971c) {
                        A.n();
                        A.f5971c = false;
                    }
                    ma.d.O((ma.d) A.f5970b, a11);
                    long a12 = lb0.a((double) (this.f6880x - this.f6878v), this.A);
                    if (A.f5971c) {
                        A.n();
                        A.f5971c = false;
                    }
                    ma.d.P((ma.d) A.f5970b, a12);
                    long a13 = lb0.a((double) this.f6877u, this.A);
                    if (A.f5971c) {
                        A.n();
                        A.f5971c = false;
                    }
                    ma.d.S((ma.d) A.f5970b, a13);
                    long a14 = lb0.a((double) this.f6878v, this.A);
                    if (A.f5971c) {
                        A.n();
                        A.f5971c = false;
                    }
                    ma.d.T((ma.d) A.f5970b, a14);
                    if (this.f6882z && (motionEvent = this.f6865a) != null) {
                        long a15 = lb0.a((double) ((motionEvent.getRawX() + (this.f6877u - this.f6879w)) - this.f6865a.getX()), this.A);
                        if (a15 != 0) {
                            if (A.f5971c) {
                                A.n();
                                A.f5971c = false;
                            }
                            ma.d.Q((ma.d) A.f5970b, a15);
                        }
                        long a16 = lb0.a((double) ((this.f6865a.getRawY() + (this.f6878v - this.f6880x)) - this.f6865a.getY()), this.A);
                        if (a16 != 0) {
                            if (A.f5971c) {
                                A.n();
                                A.f5971c = false;
                            }
                            ma.d.R((ma.d) A.f5970b, a16);
                        }
                    }
                }
            }
            try {
                jb0 p10 = p(this.f6865a);
                Long l16 = p10.f15122a;
                if (l16 != null) {
                    long longValue6 = l16.longValue();
                    if (A.f5971c) {
                        A.n();
                        A.f5971c = false;
                    }
                    ma.d.y((ma.d) A.f5970b, longValue6);
                }
                Long l17 = p10.f15123b;
                if (l17 != null) {
                    long longValue7 = l17.longValue();
                    if (A.f5971c) {
                        A.n();
                        A.f5971c = false;
                    }
                    ma.d.C((ma.d) A.f5970b, longValue7);
                }
                long longValue8 = p10.f15124c.longValue();
                if (A.f5971c) {
                    A.n();
                    A.f5971c = false;
                }
                ma.d.J((ma.d) A.f5970b, longValue8);
                if (this.f6882z) {
                    Long l18 = p10.f15126e;
                    if (l18 != null) {
                        long longValue9 = l18.longValue();
                        if (A.f5971c) {
                            A.n();
                            A.f5971c = false;
                        }
                        ma.d.E((ma.d) A.f5970b, longValue9);
                    }
                    Long l19 = p10.f15125d;
                    if (l19 != null) {
                        long longValue10 = l19.longValue();
                        if (A.f5971c) {
                            A.n();
                            A.f5971c = false;
                        }
                        ma.d.H((ma.d) A.f5970b, longValue10);
                    }
                    Long l20 = p10.f15127f;
                    if (l20 != null) {
                        nb nbVar3 = l20.longValue() != 0 ? nbVar : nbVar2;
                        if (A.f5971c) {
                            A.n();
                            A.f5971c = false;
                        }
                        ma.d.z((ma.d) A.f5970b, nbVar3);
                    }
                    long j10 = this.f6868d;
                    if (j10 > 0) {
                        DisplayMetrics displayMetrics2 = this.A;
                        int i11 = lb0.f15378a;
                        if ((displayMetrics2 == null || displayMetrics2.density == 0.0f) ? false : true) {
                            double d10 = (double) this.f6873i;
                            double d11 = (double) j10;
                            Double.isNaN(d10);
                            Double.isNaN(d11);
                            Double.isNaN(d10);
                            Double.isNaN(d11);
                            l10 = Long.valueOf(Math.round(d10 / d11));
                        } else {
                            l10 = null;
                        }
                        if (l10 != null) {
                            long longValue11 = l10.longValue();
                            if (A.f5971c) {
                                A.n();
                                A.f5971c = false;
                            }
                            ma.d.F((ma.d) A.f5970b, longValue11);
                        } else {
                            if (A.f5971c) {
                                A.n();
                                A.f5971c = false;
                            }
                            ma.d.G((ma.d) A.f5970b);
                        }
                        double d12 = (double) this.f6872h;
                        double d13 = (double) this.f6868d;
                        Double.isNaN(d12);
                        Double.isNaN(d13);
                        Double.isNaN(d12);
                        Double.isNaN(d13);
                        long round = Math.round(d12 / d13);
                        if (A.f5971c) {
                            A.n();
                            A.f5971c = false;
                        }
                        ma.d.I((ma.d) A.f5970b, round);
                    }
                    Long l21 = p10.f15130i;
                    if (l21 != null) {
                        long longValue12 = l21.longValue();
                        if (A.f5971c) {
                            A.n();
                            A.f5971c = false;
                        }
                        ma.d.L((ma.d) A.f5970b, longValue12);
                    }
                    Long l22 = p10.f15131j;
                    if (l22 != null) {
                        long longValue13 = l22.longValue();
                        if (A.f5971c) {
                            A.n();
                            A.f5971c = false;
                        }
                        ma.d.K((ma.d) A.f5970b, longValue13);
                    }
                    Long l23 = p10.f15132k;
                    if (l23 != null) {
                        if (l23.longValue() == 0) {
                            nbVar = nbVar2;
                        }
                        if (A.f5971c) {
                            A.n();
                            A.f5971c = false;
                        }
                        ma.d.D((ma.d) A.f5970b, nbVar);
                    }
                }
            } catch (eb0 unused2) {
            }
            long j11 = this.f6871g;
            if (j11 > 0) {
                if (A.f5971c) {
                    A.n();
                    A.f5971c = false;
                }
                ma.d.M((ma.d) A.f5970b, j11);
            }
            ma.d dVar = (ma.d) ((aq) A.j());
            if (aVar2.f5971c) {
                aVar.n();
                aVar2.f5971c = false;
            }
            ma.C((ma) aVar2.f5970b, dVar);
            long j12 = this.f6867c;
            if (j12 > 0) {
                if (aVar2.f5971c) {
                    aVar.n();
                    aVar2.f5971c = false;
                }
                ma.E0((ma) aVar2.f5970b, j12);
            }
            long j13 = this.f6868d;
            if (j13 > 0) {
                if (aVar2.f5971c) {
                    aVar.n();
                    aVar2.f5971c = false;
                }
                ma.D0((ma) aVar2.f5970b, j13);
            }
            long j14 = this.f6869e;
            if (j14 > 0) {
                if (aVar2.f5971c) {
                    aVar.n();
                    aVar2.f5971c = false;
                }
                ma.C0((ma) aVar2.f5970b, j14);
            }
            long j15 = this.f6870f;
            if (j15 > 0) {
                if (aVar2.f5971c) {
                    aVar.n();
                    aVar2.f5971c = false;
                }
                ma.F0((ma) aVar2.f5970b, j15);
            }
            try {
                int size = this.f6866b.size() - 1;
                if (size > 0) {
                    if (aVar2.f5971c) {
                        aVar.n();
                        aVar2.f5971c = false;
                    }
                    ma.z((ma) aVar2.f5970b);
                    for (int i12 = 0; i12 < size; i12++) {
                        jb0 k11 = k(hh.B, this.f6866b.get(i12), this.A);
                        ma.d.a A2 = ma.d.A();
                        long longValue14 = k11.f15122a.longValue();
                        if (A2.f5971c) {
                            A2.n();
                            A2.f5971c = false;
                        }
                        ma.d.y((ma.d) A2.f5970b, longValue14);
                        long longValue15 = k11.f15123b.longValue();
                        if (A2.f5971c) {
                            A2.n();
                            A2.f5971c = false;
                        }
                        ma.d.C((ma.d) A2.f5970b, longValue15);
                        ma.d dVar2 = (ma.d) ((aq) A2.j());
                        if (aVar2.f5971c) {
                            aVar.n();
                            aVar2.f5971c = false;
                        }
                        ma.Z((ma) aVar2.f5970b, dVar2);
                    }
                }
            } catch (eb0 unused3) {
                if (aVar2.f5971c) {
                    aVar.n();
                    aVar2.f5971c = false;
                }
                ma.z((ma) aVar2.f5970b);
            }
            ArrayList arrayList = new ArrayList();
            if (frVar2.f6480b != null) {
                int h10 = frVar.h();
                arrayList.add(new rr(frVar2, aVar2));
                fr frVar3 = frVar;
                ma.a aVar3 = aVar;
                arrayList.add(new ur(frVar3, "hGLcUZy7QJxpIFFoHaFrsCRQgikzvfzIB3nOrkbIskWYbM4LpXHnEs8Z3KQSkRP+", "eLtpQvxytvRqA/n+HcvMnWbOC2DK/MHgGHjSXCUDZcI=", aVar3, h10));
                arrayList.add(new pr(frVar3, "DOe3W9WTDibsU5nlZSfTjFad6KIPoFDy87OyGRCVcEgByjdMDK067u2DiuZT6TWL", "7BUz0OBf7+ML48TB+mqZg7eDQ7HJG1RXX9OKwUgsRpo=", aVar3, L, h10));
                int i13 = h10;
                arrayList.add(new mr(frVar3, "30sGXhJhqECSbxBrxpYs+eqbFsLbmnk0gEA/3txqs+yRgEdkRS85JZuwwk3OwiXu", "wT8+YTIwl8aegKTiNtlGd9JdiuZ5AtxnN0Fij8jx+D8=", aVar3, i13));
                arrayList.add(new wr(frVar3, "RXiJGJdNEl7KURgTALxq3toAekiXr7on2IaHhdkHTqrfEG3Hg9fTaSEFzwQWN0O7", "2p8pGGxBUyM0tkZKKdDHYuiATKux+mYAGEUtBWqt6Z4=", aVar3, i13));
                arrayList.add(new yr(frVar3, "QiHtazJy0fTLaV7btNXPabAuf1Q4F0Nyub9QYk5ytOY9IAoutP7A5naNhYnFRxEF", "QZB2SscfASrdMUjwfQhEivbeqU7IzpBqT2jnC70TeUo=", aVar3, i13));
                arrayList.add(new qr(frVar3, "t98sFdZCf+2yY3X2rWDcXGDFZPmYGQAAueQ1SiFuRbO/5aRalN9g+/de1ZaXnrfc", "GrfTFgpt7sSDkcfpMLAhzrTbjYtAChN4F2zsV6BP/K8=", aVar3, i13));
                arrayList.add(new nr(frVar3, "uaXo1dGCYoBTXzBmbXxi3b0inzn5tdACUzmycOuAkUUHMDuSUrdTXSMwC/sV5iyl", "IWvVlD7XDGJT+R0Pmz7Bfi1B+mNDWBkptqA/1DggT6Y=", aVar3, i13));
                arrayList.add(new gs(frVar3, "ih2bgj03Fn/jCX/5J0vX41fU/2kxECdMoZoIxI7lQ0VRlZ2Tm/2Ktk2OBC37WWdQ", "SC2Dps5y0LYSj5lmbRLCKeuOpq1ahMPNAM/09kUTkbA=", aVar3, i13));
                arrayList.add(new kr(frVar3, "0kghzsq4d5KkJhXyQHICWjzzhayB3Pf1MtXvQ0GJQnVrFUbS0rnbBIDCslmxnHt5", "lm1fz5cB+kFLkl+VM20/pNpkXaVJxMkVHBNlzH/QaeU=", aVar3, i13));
                arrayList.add(new bs(frVar3, "3/2EVHID/CaZ2gn/aGWl9erm8g/u6hHJA+GqphFVZPfR29kGmaPZXpJ2YJZ6rZxD", "TQh3XeDTGSgUnDDxQSiz+gVlXWmppEL1MQ20cYDnGRc=", aVar3, i13));
                arrayList.add(new cs(frVar3, "2OT9joYVrtTFTzezyKMktw58CZQmMC35eJC+g1DHtwiSJr7noWsTHqhuY6WR+06T", "1wYR8NMMHfWVGRf8RctC3KcGQzbPb/adZ5AefPK64XU=", aVar3, i13, new Throwable().getStackTrace()));
                arrayList.add(new fs(frVar3, "4IM85+6v3LeUlrQpLyUYglzhWSXBRNhKw3jh1MpUR1QvY2mS/I7/7C3SpZg9WTtv", "bbyFmZEyJYCRokt7AiYGwLMj+QsOY/g8bHL496ENJG4=", aVar3, i13, view));
                arrayList.add(new zr(frVar3, "5x95xviEfbAhIbYzSrGYR99NaTdv0p2F2c0uD4HKF00w0mXjhn6+rMzEq1UuK7Sf", "MBkPgAnoaWunTXErk+t/JkidpIKZWqWzPbH1kKd+NAo=", aVar3, i13));
                if (((Boolean) ti0.f16763j.f16769f.a(t.f16622n1)).booleanValue()) {
                    arrayList.add(new ir(frVar, "wyomtAf9aaDe4uh3HjP+w/SAflo1aMf7H19nx9VUSz0R8wyUCMRB6eUzyTQ6kBJm", "9v6/WbN4SwoX0dkLbN30Zt9YVZerxrY9kvPYKpvvHRw=", aVar, h10, view, activity));
                }
                if (z10) {
                    if (((Boolean) ti0.f16763j.f16769f.a(t.f16634p1)).booleanValue()) {
                        arrayList.add(new es(frVar, "O0wRBO+iMnRO+Ddb8OSO41ojlKBxPu1wLxRRvhtDAFc9BIrQG5HyWkGaF3x5ZQwY", "Jmojlt8BV+HNELIbIaohRB5/i70XlTf3BS5d4N7mO2A=", aVar, h10, this.E));
                    }
                }
            }
            list = arrayList;
        }
        n(list);
    }

    public final jb0 p(MotionEvent motionEvent) throws eb0 {
        Method b10 = hh.B.b("bZ5kSlhJ1XrzSa9OtgNBKblj5lluC2OJ8ab8KD8XBPMS38pA7up9HAOk8mdBX560", "WgS/yqRTzuePlocEVINhxMekmQj5qknBOOY0/T78I+U=");
        if (b10 == null || motionEvent == null) {
            throw new eb0();
        }
        try {
            return new jb0((String) b10.invoke((Object) null, new Object[]{motionEvent, this.A}));
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new eb0(e10);
        }
    }
}

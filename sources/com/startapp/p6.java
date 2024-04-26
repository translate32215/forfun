package com.startapp;

import android.os.Handler;
import android.os.SystemClock;
import android.widget.TextView;

/* compiled from: Sta */
public class p6 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o6 f11573a;

    public p6(o6 o6Var) {
        this.f11573a = o6Var;
    }

    public void run() {
        long j10 = 1000;
        long uptimeMillis = (((long) this.f11573a.f10368s) * 1000) - SystemClock.uptimeMillis();
        o6 o6Var = this.f11573a;
        long j11 = uptimeMillis + o6Var.A;
        TextView textView = o6Var.O;
        if (textView != null) {
            long j12 = j11 / 1000;
            if (j12 > 0 && j11 % 1000 < 100) {
                j12--;
            }
            textView.setText(String.valueOf(j12));
        }
        if (j11 >= 1000) {
            Handler handler = this.f11573a.S;
            long j13 = j11 % 1000;
            if (j13 != 0) {
                j10 = j13;
            }
            handler.postDelayed(this, j10);
            return;
        }
        o6 o6Var2 = this.f11573a;
        if (o6Var2.O != null) {
            o6Var2.P.setVisibility(8);
            this.f11573a.O.setVisibility(8);
        }
        this.f11573a.u();
    }
}

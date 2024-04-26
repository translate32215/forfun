package com.adcolony.sdk;

import android.content.Context;
import android.widget.FrameLayout;
import com.adcolony.sdk.k0;

public class m0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f4608a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k0 f4609b;

    public m0(k0 k0Var, Context context) {
        this.f4609b = k0Var;
        this.f4608a = context;
    }

    public void run() {
        this.f4609b.Q = new k0.b(this.f4608a);
        float f10 = this.f4609b.f4576a;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (f10 * 4.0f), (int) (f10 * 4.0f));
        k0 k0Var = this.f4609b;
        layoutParams.setMargins(0, k0Var.N.f4511i - ((int) (k0Var.f4576a * 4.0f)), 0, 0);
        layoutParams.gravity = 0;
        k0 k0Var2 = this.f4609b;
        k0Var2.N.addView(k0Var2.Q, layoutParams);
    }
}

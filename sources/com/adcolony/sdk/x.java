package com.adcolony.sdk;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import p.f;

public class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w f4808a;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WebSettings f4809a;

        public a(WebSettings webSettings) {
            this.f4809a = webSettings;
        }

        public void run() {
            x.this.f4808a.f4796b = this.f4809a.getUserAgentString();
            o d10 = f.d();
            if (d10.f4658b == null) {
                d10.f4658b = new h0();
            }
            h0 h0Var = d10.f4658b;
            h0Var.f4524d = x.this.f4808a.f4796b;
            while (true) {
                b0 poll = h0Var.f4523c.poll();
                if (poll != null) {
                    h0Var.b(poll);
                } else {
                    return;
                }
            }
        }
    }

    public x(w wVar) {
        this.f4808a = wVar;
    }

    public void run() {
        Context context;
        if (this.f4808a.f4796b == null && (context = f.f4478a) != null) {
            try {
                j0.f4565a.execute(new a(new WebView(context).getSettings()));
            } catch (RuntimeException e10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e10.toString() + ": during WebView initialization.");
                sb2.append(" Disabling AdColony.");
                f.a(0, 0, sb2.toString(), false);
                this.f4808a.f4796b = "";
                a.e();
            }
        }
    }
}

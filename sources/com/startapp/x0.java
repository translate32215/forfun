package com.startapp;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* compiled from: Sta */
public abstract class x0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12780a;

    /* renamed from: b  reason: collision with root package name */
    public final v7 f12781b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f12782c;

    /* renamed from: d  reason: collision with root package name */
    public final Runnable f12783d = new a();

    /* compiled from: Sta */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            x0.this.a();
        }
    }

    /* compiled from: Sta */
    public class b implements v7 {

        /* renamed from: a  reason: collision with root package name */
        public boolean f12785a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ v7 f12786b;

        public b(v7 v7Var) {
            this.f12786b = v7Var;
        }

        public synchronized void a(Object obj) {
            if (!this.f12785a) {
                this.f12785a = true;
                x0.this.f12782c.removeCallbacksAndMessages((Object) null);
                this.f12786b.a(obj);
            }
        }
    }

    public x0(Context context, v7 v7Var) {
        this.f12780a = context;
        this.f12781b = new b(v7Var);
        this.f12782c = new Handler(Looper.getMainLooper());
    }

    public abstract void a();
}

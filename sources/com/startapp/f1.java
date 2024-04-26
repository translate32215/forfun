package com.startapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.components.ComponentLocator;

/* compiled from: Sta */
public class f1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f10341a;

    /* renamed from: b  reason: collision with root package name */
    public String f10342b;

    /* renamed from: c  reason: collision with root package name */
    public b f10343c;

    /* renamed from: d  reason: collision with root package name */
    public int f10344d;

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: com.startapp.f1$a$a  reason: collision with other inner class name */
        /* compiled from: Sta */
        public class C0115a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Bitmap f10346a;

            public C0115a(Bitmap bitmap) {
                this.f10346a = bitmap;
            }

            public void run() {
                f1 f1Var = f1.this;
                b bVar = f1Var.f10343c;
                if (bVar != null) {
                    bVar.a(this.f10346a, f1Var.f10344d);
                }
            }
        }

        public a() {
        }

        public void run() {
            new Handler(Looper.getMainLooper()).post(new C0115a(g1.b(f1.this.f10342b)));
        }
    }

    /* compiled from: Sta */
    public interface b {
        void a(Bitmap bitmap, int i10);
    }

    public f1(Context context, String str, b bVar, int i10) {
        this.f10341a = context;
        this.f10342b = str;
        this.f10343c = bVar;
        this.f10344d = i10;
    }

    public void a() {
        ComponentLocator.a(this.f10341a).f12484z.b().execute(new a());
    }
}

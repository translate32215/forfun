package com.startapp;

import android.content.Context;
import java.security.PublicKey;

/* compiled from: Sta */
public class a5 {

    /* renamed from: g  reason: collision with root package name */
    public static final String f10034g = "insight Core SDK";

    /* renamed from: h  reason: collision with root package name */
    public static final String f10035h = "© 2014 - 2020 umlaut insight GmbH";

    /* renamed from: i  reason: collision with root package name */
    public static final String f10036i = "20220530140220";

    /* renamed from: j  reason: collision with root package name */
    private static a5 f10037j;

    /* renamed from: a  reason: collision with root package name */
    private y4 f10038a;

    /* renamed from: b  reason: collision with root package name */
    private ua f10039b;

    /* renamed from: c  reason: collision with root package name */
    private b5 f10040c;

    /* renamed from: d  reason: collision with root package name */
    private Context f10041d;

    /* renamed from: e  reason: collision with root package name */
    private PublicKey f10042e;

    /* renamed from: f  reason: collision with root package name */
    private a f10043f;

    /* compiled from: Sta */
    public interface a {
        void a(String str);
    }

    private a5(Context context) {
        this.f10041d = context;
    }

    public static void a(Context context, int i10) {
        try {
            a(context, ja.a(context.getResources().openRawResource(i10)));
        } catch (Exception unused) {
            throw new IllegalArgumentException("Error while opening the raw resource");
        }
    }

    public static y4 b() {
        return f10037j.f10038a;
    }

    public static b5 c() {
        return f10037j.f10040c;
    }

    public static a d() {
        return f10037j.f10043f;
    }

    public static PublicKey e() {
        return f10037j.f10042e;
    }

    public static synchronized ua f() {
        ua uaVar;
        synchronized (a5.class) {
            uaVar = f10037j.f10039b;
        }
        return uaVar;
    }

    private void g() {
        this.f10039b = new ua();
        this.f10040c = new b5(this.f10041d);
    }

    public static boolean h() {
        return f10037j != null;
    }

    public static void a(Context context, byte[] bArr) {
        if (context == null) {
            throw new IllegalArgumentException("context is null");
        } else if (bArr == null) {
            throw new IllegalArgumentException("config is null");
        } else if (f10037j == null) {
            try {
                z4 a10 = z4.a(bArr);
                a5 a5Var = new a5(context);
                f10037j = a5Var;
                a5Var.f10042e = a10.f12914a;
                a5Var.f10038a = a10.f12915b;
                a5Var.g();
            } catch (Exception unused) {
                throw new IllegalArgumentException("configuration is invalid");
            }
        }
    }

    public static void a(a aVar) {
        f10037j.f10043f = aVar;
    }

    public static String a() {
        return f10037j.f10040c.p();
    }
}

package dev.pankaj.ytvclib.utils;

/* compiled from: C.kt */
public final class C {

    /* renamed from: a  reason: collision with root package name */
    public static final C f13466a = new C();

    static {
        System.loadLibrary("pk-lib");
    }

    public static /* synthetic */ String a(C c10, String str, String str2, int i10) {
        return c10.dec(str, (i10 & 2) != 0 ? "pk" : null);
    }

    public static /* synthetic */ String b(C c10, String str, String str2, int i10) {
        return c10.enc(str, (i10 & 2) != 0 ? "pk" : null);
    }

    public final native String dec(String str, String str2);

    public final native String enc(String str, String str2);

    public final native String wma(String str, String str2, String str3, String str4);
}

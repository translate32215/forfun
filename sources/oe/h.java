package oe;

import ke.s;

/* compiled from: RequestLine */
public final class h {
    public static String a(s sVar) {
        String f10 = sVar.f();
        String h10 = sVar.h();
        if (h10 == null) {
            return f10;
        }
        return f10 + '?' + h10;
    }
}

package qc;

import dev.pankaj.ytvclib.utils.C;
import java.nio.charset.Charset;
import ke.d0;
import ke.e0;
import ke.t;
import ke.u;
import le.c;
import oe.f;
import ud.k;

/* compiled from: CryptInterceptor.kt */
public final class h implements t {
    public d0 a(t.a aVar) {
        f fVar = (f) aVar;
        d0 a10 = fVar.a(fVar.f23704f);
        if (!a10.d()) {
            return a10;
        }
        e0 e0Var = a10.f20670g;
        d0 d0Var = null;
        if (e0Var != null) {
            String c10 = a10.f20669f.c("t");
            if (c10 == null) {
                c10 = null;
            }
            if (c10 == null) {
                String valueOf = String.valueOf(System.currentTimeMillis());
                int i10 = 10;
                k.f(valueOf, "<this>");
                int length = valueOf.length();
                if (10 > length) {
                    i10 = length;
                }
                c10 = valueOf.substring(0, i10);
                k.e(c10, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            d0.a aVar2 = new d0.a(a10);
            u c11 = u.c("application/json");
            C c12 = C.f13466a;
            String s10 = e0Var.s();
            k.e(s10, "it.string()");
            String dec = c12.dec(s10, c10);
            Charset charset = c.f21269i;
            if (c11 != null) {
                Charset a11 = c11.a((Charset) null);
                if (a11 == null) {
                    c11 = u.c(c11 + "; charset=utf-8");
                } else {
                    charset = a11;
                }
            }
            ve.f v02 = new ve.f().v0(dec, 0, dec.length(), charset);
            aVar2.f20683g = new e0.a(c11, v02.f26740b, v02);
            d0Var = aVar2.a();
        }
        return d0Var == null ? a10 : d0Var;
    }
}

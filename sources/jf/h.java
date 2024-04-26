package jf;

import ae.g;
import gf.c0;
import gf.d0;
import gf.f0;
import gf.g0;
import gf.j;
import gf.j0;
import ud.k;

/* compiled from: KodeinBinding.kt */
public interface h<C, A, T> extends a<C, A, T> {

    /* compiled from: KodeinBinding.kt */
    public interface a<C, A, T> {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f19802a = 0;
    }

    /* compiled from: KodeinBinding.kt */
    public static final class b {
        public static <C, A, T> String a(h<C, A, T> hVar) {
            String str;
            String str2 = "";
            if (!k.a(hVar.g(), d0.f18658a)) {
                str = hVar.g().e() + " -> ";
            } else {
                str = str2;
            }
            p<C> b10 = hVar.b() instanceof l ? null : hVar.b();
            if (b10 != null) {
                StringBuilder a10 = android.support.v4.media.a.a("scoped(");
                g[] gVarArr = j0.f18667a;
                k.g(b10, "obj");
                Class<?> cls = b10.getClass();
                k.g(cls, "jvmType");
                k.g(cls, "$this$simpleDispString");
                a10.append(f0.c(c0.f18656a, cls, false, 2, (Object) null));
                a10.append(").");
                String sb2 = a10.toString();
                if (sb2 != null) {
                    str2 = sb2;
                    StringBuilder a11 = android.support.v4.media.a.a(str2);
                    a11.append(hVar.f());
                    a11.append(" { ");
                    a11.append(str);
                    a11.append(hVar.h().e());
                    a11.append(" }");
                    return a11.toString();
                }
            }
            if (!k.a(hVar.a(), d0.f18659b)) {
                StringBuilder a12 = android.support.v4.media.a.a("contexted<");
                a12.append(hVar.a().e());
                a12.append(">().");
                str2 = a12.toString();
            }
            StringBuilder a112 = android.support.v4.media.a.a(str2);
            a112.append(hVar.f());
            a112.append(" { ");
            a112.append(str);
            a112.append(hVar.h().e());
            a112.append(" }");
            return a112.toString();
        }

        public static <C, A, T> String b(h<C, A, T> hVar) {
            String str;
            String str2 = "";
            if (!k.a(hVar.g(), d0.f18658a)) {
                str = hVar.g().a() + " -> ";
            } else {
                str = str2;
            }
            p<C> b10 = hVar.b() instanceof l ? null : hVar.b();
            if (b10 != null) {
                StringBuilder a10 = android.support.v4.media.a.a("scoped(");
                g[] gVarArr = j0.f18667a;
                k.g(b10, "obj");
                Class<?> cls = b10.getClass();
                k.g(cls, "jvmType");
                k.g(cls, "$this$fullDispString");
                a10.append(f0.c(j.f18666a, cls, false, 2, (Object) null));
                a10.append(").");
                String sb2 = a10.toString();
                if (sb2 != null) {
                    str2 = sb2;
                    StringBuilder a11 = android.support.v4.media.a.a(str2);
                    a11.append(hVar.i());
                    a11.append(" { ");
                    a11.append(str);
                    a11.append(hVar.h().a());
                    a11.append(" }");
                    return a11.toString();
                }
            }
            if (!k.a(hVar.a(), d0.f18659b)) {
                StringBuilder a12 = android.support.v4.media.a.a("contexted<");
                a12.append(hVar.a().a());
                a12.append(">().");
                str2 = a12.toString();
            }
            StringBuilder a112 = android.support.v4.media.a.a(str2);
            a112.append(hVar.i());
            a112.append(" { ");
            a112.append(str);
            a112.append(hVar.h().a());
            a112.append(" }");
            return a112.toString();
        }
    }

    g0<? super C> a();

    p<C> b();

    String d();

    boolean e();

    String f();

    g0<? super A> g();

    String getDescription();

    g0<? extends T> h();

    String i();
}

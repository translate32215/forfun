package p;

import android.content.Context;
import android.content.ContextWrapper;
import com.startapp.b4;
import de.c1;
import de.n;
import e8.g0;
import gf.l;
import gf.o;
import ie.r;
import k8.p5;
import md.d;
import td.p;
import ud.k;
import ud.x;

/* compiled from: CustomTabsCallback */
public class a implements g0 {
    public static final l a(Object obj, Context context) {
        for (Context context2 = context; context2 != null; context2 = context2 instanceof ContextWrapper ? ((ContextWrapper) context2).getBaseContext() : null) {
            if ((!k.a(context2, obj)) && (context2 instanceof o)) {
                return ((o) context2).j();
            }
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return ((o) applicationContext).j();
        }
        throw new kd.l("null cannot be cast to non-null type org.kodein.di.KodeinAware");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = r2.getClass().getName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(java.lang.Object r2, java.lang.StringBuilder r3) {
        /*
            if (r2 != 0) goto L_0x0008
            java.lang.String r2 = "null"
            r3.append(r2)
            goto L_0x003f
        L_0x0008:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
            int r1 = r0.length()
            if (r1 > 0) goto L_0x002c
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            if (r1 <= 0) goto L_0x002c
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
        L_0x002c:
            r3.append(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r3.append(r0)
            int r2 = java.lang.System.identityHashCode(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r3.append(r2)
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a.b(java.lang.Object, java.lang.StringBuilder):void");
    }

    public static final <T, R> Object c(r<? super T> rVar, R r10, p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        Object obj;
        Object D;
        try {
            x.b(pVar, 2);
            obj = pVar.h(r10, rVar);
        } catch (Throwable th) {
            obj = new n(th, false, 2);
        }
        nd.a aVar = nd.a.COROUTINE_SUSPENDED;
        if (obj == aVar || (D = rVar.D(obj)) == c1.f13272b) {
            return aVar;
        }
        if (!(D instanceof n)) {
            return c1.a(D);
        }
        throw ((n) D).f13313a;
    }

    public static String d(p5 p5Var) {
        StringBuilder sb2 = new StringBuilder(p5Var.h());
        for (int i10 = 0; i10 < p5Var.h(); i10++) {
            byte c10 = p5Var.c(i10);
            if (c10 == 34) {
                sb2.append("\\\"");
            } else if (c10 == 39) {
                sb2.append("\\'");
            } else if (c10 != 92) {
                switch (c10) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case b4.f10106f:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (c10 >= 32 && c10 <= 126) {
                            sb2.append((char) c10);
                            break;
                        } else {
                            sb2.append('\\');
                            sb2.append((char) (((c10 >>> 6) & 3) + 48));
                            sb2.append((char) (((c10 >>> 3) & 7) + 48));
                            sb2.append((char) ((c10 & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static boolean e(String str) {
        return "audio".equals(g(str));
    }

    public static boolean f(String str) {
        return "video".equals(g(str));
    }

    public static String g(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        throw new IllegalArgumentException(str.length() != 0 ? "Invalid mime type: ".concat(str) : new String("Invalid mime type: "));
    }

    public static boolean h() {
        try {
            Class.forName("android.app.Application", false, (ClassLoader) null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}

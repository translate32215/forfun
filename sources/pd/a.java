package pd;

import java.lang.reflect.Method;
import xd.b;
import xd.c;

/* compiled from: PlatformImplementations.kt */
public class a {

    /* renamed from: pd.a$a  reason: collision with other inner class name */
    /* compiled from: PlatformImplementations.kt */
    public static final class C0215a {

        /* renamed from: a  reason: collision with root package name */
        public static final Method f23985a;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Class[]} */
        /* JADX WARNING: type inference failed for: r5v5 */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
            if (ud.k.a(r5, r0) != false) goto L_0x003b;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        static {
            /*
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                ud.k.e(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L_0x000e:
                r5 = 0
                if (r4 >= r2) goto L_0x0042
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = ud.k.a(r7, r8)
                r8 = 1
                if (r7 == 0) goto L_0x003a
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r9 = "it.parameterTypes"
                ud.k.e(r7, r9)
                java.lang.String r9 = "<this>"
                ud.k.f(r7, r9)
                int r9 = r7.length
                if (r9 != r8) goto L_0x0033
                r5 = r7[r3]
            L_0x0033:
                boolean r5 = ud.k.a(r5, r0)
                if (r5 == 0) goto L_0x003a
                goto L_0x003b
            L_0x003a:
                r8 = 0
            L_0x003b:
                if (r8 == 0) goto L_0x003f
                r5 = r6
                goto L_0x0042
            L_0x003f:
                int r4 = r4 + 1
                goto L_0x000e
            L_0x0042:
                f23985a = r5
                int r0 = r1.length
            L_0x0045:
                if (r3 >= r0) goto L_0x0059
                r2 = r1[r3]
                java.lang.String r2 = r2.getName()
                java.lang.String r4 = "getSuppressed"
                boolean r2 = ud.k.a(r2, r4)
                if (r2 == 0) goto L_0x0056
                goto L_0x0059
            L_0x0056:
                int r3 = r3 + 1
                goto L_0x0045
            L_0x0059:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pd.a.C0215a.<clinit>():void");
        }
    }

    public void a(Throwable th, Throwable th2) {
        Method method = C0215a.f23985a;
        if (method != null) {
            method.invoke(th, new Object[]{th2});
        }
    }

    public c b() {
        return new b();
    }
}

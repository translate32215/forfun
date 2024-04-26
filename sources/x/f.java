package x;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k8.e;
import k8.e0;
import k8.h;
import k8.l;
import k8.m;
import k8.o;
import k8.q;
import k8.r;
import k8.s;
import n2.g;
import o8.r3;

/* compiled from: ViewTransitionController */
public class f {
    public static final String a(String str) {
        if (str == null) {
            return "";
        }
        if (!str.startsWith("uuid:")) {
            return str;
        }
        return str.substring(5, str.length());
    }

    public static final long b(String str) {
        try {
            return Long.parseLong(str.substring(str.indexOf(45) + 1, str.length()));
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final String c(String str) {
        return "uuid:" + str;
    }

    public static final String d(long j10) {
        if (j10 == -1) {
            return "infinite";
        }
        return "Second-" + Long.toString(j10);
    }

    public static double e(double d10) {
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (Double.isInfinite(d10) || d10 == 0.0d || d10 == 0.0d) {
            return d10;
        }
        double d11 = (double) (d10 > 0.0d ? 1 : -1);
        double floor = Math.floor(Math.abs(d10));
        Double.isNaN(d11);
        return floor * d11;
    }

    public static int f(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == 0.0d) {
            return 0;
        }
        double d11 = (double) (d10 > 0.0d ? 1 : -1);
        double floor = Math.floor(Math.abs(d10));
        Double.isNaN(d11);
        return (int) ((long) ((floor * d11) % 4.294967296E9d));
    }

    public static String g(String str, String[] strArr, String[] strArr2) {
        if (strArr2 != null) {
            int min = Math.min(strArr.length, strArr2.length);
            for (int i10 = 0; i10 < min; i10++) {
                String str2 = strArr[i10];
                if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                    return strArr2[i10];
                }
            }
            return null;
        }
        throw new NullPointerException("null reference");
    }

    public static int h(g gVar) {
        int f10 = f(gVar.A("runtime.counter").a().doubleValue() + 1.0d);
        if (f10 <= 1000000) {
            gVar.C("runtime.counter", new h(Double.valueOf((double) f10)));
            return f10;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static String i(Context context, String str, String str2) {
        if (context != null) {
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(str2)) {
                str2 = r3.a(context);
            }
            return r3.b("google_app_id", resources, str2);
        }
        throw new NullPointerException("null reference");
    }

    public static long j(double d10) {
        return ((long) f(d10)) & 4294967295L;
    }

    public static e0 k(String str) {
        e0 e0Var = null;
        if (str != null && !str.isEmpty()) {
            int parseInt = Integer.parseInt(str);
            e0Var = (e0) ((HashMap) e0.f20178z0).get(Integer.valueOf(parseInt));
        }
        if (e0Var != null) {
            return e0Var;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", new Object[]{str}));
    }

    public static Object l(o oVar) {
        if (o.f20382o.equals(oVar)) {
            return null;
        }
        if (o.f20381n.equals(oVar)) {
            return "";
        }
        if (oVar instanceof l) {
            return m((l) oVar);
        }
        if (oVar instanceof e) {
            ArrayList arrayList = new ArrayList();
            e eVar = (e) oVar;
            eVar.getClass();
            q qVar = new q(eVar);
            while (qVar.hasNext()) {
                Object l10 = l((o) qVar.next());
                if (l10 != null) {
                    arrayList.add(l10);
                }
            }
            return arrayList;
        } else if (!oVar.a().isNaN()) {
            return oVar.a();
        } else {
            return oVar.q();
        }
    }

    public static Map<String, Object> m(l lVar) {
        HashMap hashMap = new HashMap();
        lVar.getClass();
        Iterator it = new ArrayList(lVar.f20299a.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object l10 = l(lVar.i(str));
            if (l10 != null) {
                hashMap.put(str, l10);
            }
        }
        return hashMap;
    }

    public static void n(String str, int i10, List<o> list) {
        if (list.size() != i10) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", new Object[]{str, Integer.valueOf(i10), Integer.valueOf(list.size())}));
        }
    }

    public static void o(String str, int i10, List<o> list) {
        if (list.size() < i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", new Object[]{str, Integer.valueOf(i10), Integer.valueOf(list.size())}));
        }
    }

    public static void p(String str, int i10, List<o> list) {
        if (list.size() > i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", new Object[]{str, Integer.valueOf(i10), Integer.valueOf(list.size())}));
        }
    }

    public static boolean q(o oVar) {
        if (oVar == null) {
            return false;
        }
        Double a10 = oVar.a();
        if (a10.isNaN() || a10.doubleValue() < 0.0d || !a10.equals(Double.valueOf(Math.floor(a10.doubleValue())))) {
            return false;
        }
        return true;
    }

    public static boolean r(o oVar, o oVar2) {
        if (!oVar.getClass().equals(oVar2.getClass())) {
            return false;
        }
        if ((oVar instanceof s) || (oVar instanceof m)) {
            return true;
        }
        if (oVar instanceof h) {
            if (Double.isNaN(oVar.a().doubleValue()) || Double.isNaN(oVar2.a().doubleValue())) {
                return false;
            }
            return oVar.a().equals(oVar2.a());
        } else if (oVar instanceof r) {
            return oVar.q().equals(oVar2.q());
        } else {
            if (oVar instanceof k8.f) {
                return oVar.j().equals(oVar2.j());
            }
            if (oVar == oVar2) {
                return true;
            }
            return false;
        }
    }
}

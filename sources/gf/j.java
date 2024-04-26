package gf;

import android.support.v4.media.a;
import ce.i;
import j.f;
import ud.k;

/* compiled from: typeDisp.kt */
public final class j extends f0 {

    /* renamed from: a  reason: collision with root package name */
    public static final j f18666a = new j();

    public String a(Class<?> cls, boolean z10) {
        String str;
        String name;
        String a10;
        if (cls.isArray()) {
            StringBuilder a11 = a.a("kotlin.Array<");
            Class<?> componentType = cls.getComponentType();
            k.b(componentType, "cls.componentType");
            a11.append(f0.c(this, componentType, false, 2, (Object) null));
            a11.append(">");
            return a11.toString();
        }
        String a12 = b8.a.a(cls);
        if (a12 != null && (a10 = f.a("kotlin.", a12)) != null) {
            return a10;
        }
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        Package packageR = cls.getPackage();
        String str2 = "";
        if (packageR == null || (name = packageR.getName()) == null || (str = f.a(name, ".")) == null) {
            str = str2;
        }
        sb3.append(str);
        sb3.append(c0.f18656a.a(cls, true));
        String sb4 = sb3.toString();
        if (i.h(sb4, "java.", false, 2)) {
            switch (sb4.hashCode()) {
                case -2050985813:
                    if (sb4.equals("java.lang.RuntimeException")) {
                        sb4 = "kotlin.RuntimeException";
                        break;
                    }
                    break;
                case -1624170886:
                    if (sb4.equals("java.lang.AssertionError")) {
                        sb4 = "kotlin.AssertionError";
                        break;
                    }
                    break;
                case -1427677637:
                    if (sb4.equals("java.util.NoSuchElementException")) {
                        sb4 = "kotlin.NoSuchElementException";
                        break;
                    }
                    break;
                case -1402722386:
                    if (sb4.equals("java.util.HashMap")) {
                        sb4 = "kotlin.collections.HashMap";
                        break;
                    }
                    break;
                case -1402716492:
                    if (sb4.equals("java.util.HashSet")) {
                        sb4 = "kotlin.collections.HashSet";
                        break;
                    }
                    break;
                case -1383349348:
                    if (sb4.equals("java.util.Map")) {
                        sb4 = "kotlin.collections.Map";
                        break;
                    }
                    break;
                case -1383343454:
                    if (sb4.equals("java.util.Set")) {
                        sb4 = "kotlin.collections.Set";
                        break;
                    }
                    break;
                case -1282923287:
                    if (sb4.equals("java.lang.UnsupportedOperationException")) {
                        sb4 = "kotlin.UnsupportedOperationException";
                        break;
                    }
                    break;
                case -1114099497:
                    if (sb4.equals("java.util.ArrayList")) {
                        sb4 = "kotlin.collections.ArrayList";
                        break;
                    }
                    break;
                case -528621260:
                    if (sb4.equals("java.lang.Error")) {
                        sb4 = "kotlin.Error";
                        break;
                    }
                    break;
                case -310638960:
                    if (sb4.equals("java.lang.IllegalArgumentException")) {
                        sb4 = "kotlin.IllegalArgumentException";
                        break;
                    }
                    break;
                case -37663348:
                    if (sb4.equals("java.lang.ClassCastException")) {
                        sb4 = "kotlin.ClassCastException";
                        break;
                    }
                    break;
                case 65821278:
                    if (sb4.equals("java.util.List")) {
                        sb4 = "kotlin.collections.List";
                        break;
                    }
                    break;
                case 72706427:
                    if (sb4.equals("java.lang.Exception")) {
                        sb4 = "kotlin.Exception";
                        break;
                    }
                    break;
                case 75599616:
                    if (sb4.equals("java.lang.IllegalStateException")) {
                        sb4 = "kotlin.IllegalStateException";
                        break;
                    }
                    break;
                case 208316054:
                    if (sb4.equals("java.util.Comparator")) {
                        sb4 = "kotlin.Comparator";
                        break;
                    }
                    break;
                case 1063877011:
                    if (sb4.equals("java.lang.Object")) {
                        sb4 = "kotlin.Any";
                        break;
                    }
                    break;
                case 1195259493:
                    if (sb4.equals("java.lang.String")) {
                        sb4 = "kotlin.String";
                        break;
                    }
                    break;
                case 1258621781:
                    if (sb4.equals("java.util.LinkedHashMap")) {
                        sb4 = "kotlin.collections.LinkedHashMap";
                        break;
                    }
                    break;
                case 1258627675:
                    if (sb4.equals("java.util.LinkedHashSet")) {
                        sb4 = "kotlin.collections.LinkedHashSet";
                        break;
                    }
                    break;
                case 1270017459:
                    if (sb4.equals("java.lang.IndexOutOfBoundsException")) {
                        sb4 = "kotlin.IndexOutOfBoundsException";
                        break;
                    }
                    break;
                case 1630335596:
                    if (sb4.equals("java.lang.Throwable")) {
                        sb4 = "kotlin.Throwable";
                        break;
                    }
                    break;
                case 1641150139:
                    if (sb4.equals("java.lang.NumberFormatException")) {
                        sb4 = "kotlin.NumberFormatException";
                        break;
                    }
                    break;
                case 1879291277:
                    if (sb4.equals("java.lang.NullPointerException")) {
                        sb4 = "kotlin.NullPointerException";
                        break;
                    }
                    break;
            }
        }
        sb2.append(sb4);
        if (!z10) {
            str2 = b8.a.b(cls);
        }
        sb2.append(str2);
        return sb2.toString();
    }
}

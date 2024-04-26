package k8;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import p.a;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class o7 {
    public static final void a(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            for (Object a10 : (List) obj) {
                a(sb2, i10, str, a10);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry a11 : ((Map) obj).entrySet()) {
                a(sb2, i10, str, a11);
            }
        } else {
            sb2.append(10);
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                sb2.append(' ');
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                p5 p5Var = p5.f20407b;
                sb2.append(a.d(new o5(((String) obj).getBytes(r6.f20450a))));
                sb2.append('\"');
            } else if (obj instanceof p5) {
                sb2.append(": \"");
                sb2.append(a.d((p5) obj));
                sb2.append('\"');
            } else if (obj instanceof k6) {
                sb2.append(" {");
                c((k6) obj, sb2, i10 + 2);
                sb2.append("\n");
                while (i11 < i10) {
                    sb2.append(' ');
                    i11++;
                }
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                sb2.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i13 = i10 + 2;
                a(sb2, i13, "key", entry.getKey());
                a(sb2, i13, "value", entry.getValue());
                sb2.append("\n");
                while (i11 < i10) {
                    sb2.append(' ');
                    i11++;
                }
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj.toString());
            }
        }
    }

    public static final String b(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    public static void c(m7 m7Var, StringBuilder sb2, int i10) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z10;
        String str5;
        String str6;
        String str7;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : m7Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str8 = (String) it.next();
            String substring = str8.startsWith("get") ? str8.substring(3) : str8;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                if (valueOf2.length() != 0) {
                    str7 = valueOf.concat(valueOf2);
                } else {
                    str7 = new String(valueOf);
                }
                Method method2 = (Method) hashMap.get(str8);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    a(sb2, i10, b(str7), k6.k(method2, m7Var, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                if (valueOf4.length() != 0) {
                    str6 = valueOf3.concat(valueOf4);
                } else {
                    str6 = new String(valueOf3);
                }
                Method method3 = (Method) hashMap.get(str8);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    a(sb2, i10, b(str6), k6.k(method3, m7Var, new Object[0]));
                }
            }
            if (substring.length() != 0) {
                str = "set".concat(substring);
            } else {
                str = new String("set");
            }
            if (((Method) hashMap2.get(str)) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (valueOf5.length() != 0) {
                        str5 = "get".concat(valueOf5);
                    } else {
                        str5 = new String("get");
                    }
                    if (hashMap.containsKey(str5)) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                if (valueOf7.length() != 0) {
                    str2 = valueOf6.concat(valueOf7);
                } else {
                    str2 = new String(valueOf6);
                }
                if (substring.length() != 0) {
                    str3 = "get".concat(substring);
                } else {
                    str3 = new String("get");
                }
                Method method4 = (Method) hashMap.get(str3);
                if (substring.length() != 0) {
                    str4 = "has".concat(substring);
                } else {
                    str4 = new String("has");
                }
                Method method5 = (Method) hashMap.get(str4);
                if (method4 != null) {
                    Object k10 = k6.k(method4, m7Var, new Object[0]);
                    if (method5 == null) {
                        if (k10 instanceof Boolean) {
                            if (!((Boolean) k10).booleanValue()) {
                            }
                        } else if (k10 instanceof Integer) {
                            if (((Integer) k10).intValue() == 0) {
                            }
                        } else if (k10 instanceof Float) {
                            if (((Float) k10).floatValue() == 0.0f) {
                            }
                        } else if (!(k10 instanceof Double)) {
                            if (k10 instanceof String) {
                                z10 = k10.equals("");
                            } else if (k10 instanceof p5) {
                                z10 = k10.equals(p5.f20407b);
                            } else if (k10 instanceof m7) {
                                if (k10 == ((m7) k10).d()) {
                                }
                            } else if ((k10 instanceof Enum) && ((Enum) k10).ordinal() == 0) {
                            }
                            if (z10) {
                            }
                        } else if (((Double) k10).doubleValue() == 0.0d) {
                        }
                    } else if (!((Boolean) k6.k(method5, m7Var, new Object[0])).booleanValue()) {
                    }
                    a(sb2, i10, b(str2), k10);
                }
            }
        }
        if (!(m7Var instanceof i6)) {
            m8 m8Var = ((k6) m7Var).zzc;
            if (m8Var != null) {
                for (int i11 = 0; i11 < m8Var.f20329a; i11++) {
                    a(sb2, i10, String.valueOf(m8Var.f20330b[i11] >>> 3), m8Var.f20331c[i11]);
                }
                return;
            }
            return;
        }
        i6 i6Var = (i6) m7Var;
        throw null;
    }
}

package com.google.ads.mediation;

import androidx.appcompat.widget.o;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import l0.e;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public class a {

    /* renamed from: com.google.ads.mediation.a$a  reason: collision with other inner class name */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    public static final class C0072a extends Exception {
        public C0072a(String str) {
            super(str);
        }
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    public @interface b {
        String name();

        boolean required() default true;
    }

    public void a(Map<String, String> map) throws C0072a {
        HashMap hashMap = new HashMap();
        for (Field field : getClass().getFields()) {
            b bVar = (b) field.getAnnotation(b.class);
            if (bVar != null) {
                hashMap.put(bVar.name(), field);
            }
        }
        if (hashMap.isEmpty()) {
            e.K("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        }
        for (Map.Entry next : map.entrySet()) {
            Field field2 = (Field) hashMap.remove(next.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, next.getValue());
                } catch (IllegalAccessException unused) {
                    String str = (String) next.getKey();
                    StringBuilder sb2 = new StringBuilder(o.a(str, 49));
                    sb2.append("Server option \"");
                    sb2.append(str);
                    sb2.append("\" could not be set: Illegal Access");
                    e.K(sb2.toString());
                } catch (IllegalArgumentException unused2) {
                    String str2 = (String) next.getKey();
                    StringBuilder sb3 = new StringBuilder(o.a(str2, 43));
                    sb3.append("Server option \"");
                    sb3.append(str2);
                    sb3.append("\" could not be set: Bad Type");
                    e.K(sb3.toString());
                }
            } else {
                String str3 = (String) next.getKey();
                String str4 = (String) next.getValue();
                StringBuilder a10 = j4.e.a(o.a(str4, o.a(str3, 31)), "Unexpected server option: ", str3, " = \"", str4);
                a10.append("\"");
                e.E(a10.toString());
            }
        }
        StringBuilder sb4 = new StringBuilder();
        for (Field field3 : hashMap.values()) {
            if (((b) field3.getAnnotation(b.class)).required()) {
                String valueOf = String.valueOf(((b) field3.getAnnotation(b.class)).name());
                e.K(valueOf.length() != 0 ? "Required server option missing: ".concat(valueOf) : new String("Required server option missing: "));
                if (sb4.length() > 0) {
                    sb4.append(", ");
                }
                sb4.append(((b) field3.getAnnotation(b.class)).name());
            }
        }
        if (sb4.length() > 0) {
            String valueOf2 = String.valueOf(sb4.toString());
            throw new C0072a(valueOf2.length() != 0 ? "Required server option(s) missing: ".concat(valueOf2) : new String("Required server option(s) missing: "));
        }
    }
}

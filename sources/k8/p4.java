package k8;

import android.net.Uri;
import s.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class p4 {

    /* renamed from: a  reason: collision with root package name */
    public static final a<String, Uri> f20406a = new a<>();

    public static synchronized Uri a(String str) {
        Uri orDefault;
        String str2;
        synchronized (p4.class) {
            a<String, Uri> aVar = f20406a;
            orDefault = aVar.getOrDefault("com.google.android.gms.measurement", null);
            if (orDefault == null) {
                String valueOf = String.valueOf(Uri.encode("com.google.android.gms.measurement"));
                if (valueOf.length() != 0) {
                    str2 = "content://com.google.android.gms.phenotype/".concat(valueOf);
                } else {
                    str2 = new String("content://com.google.android.gms.phenotype/");
                }
                orDefault = Uri.parse(str2);
                aVar.put("com.google.android.gms.measurement", orDefault);
            }
        }
        return orDefault;
    }
}

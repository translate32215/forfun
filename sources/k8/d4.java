package k8;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class d4 {

    /* renamed from: a  reason: collision with root package name */
    public static final Uri f20108a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f20109b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f20110c = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicBoolean f20111d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    public static HashMap<String, String> f20112e;

    /* renamed from: f  reason: collision with root package name */
    public static final HashMap<String, Boolean> f20113f = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    public static final HashMap<String, Integer> f20114g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    public static final HashMap<String, Long> f20115h = new HashMap<>();

    /* renamed from: i  reason: collision with root package name */
    public static final HashMap<String, Float> f20116i = new HashMap<>();

    /* renamed from: j  reason: collision with root package name */
    public static Object f20117j;

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f20118k = new String[0];

    static {
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
    }

    public static void a(Object obj, String str, String str2) {
        synchronized (d4.class) {
            if (obj == f20117j) {
                f20112e.put(str, str2);
            }
        }
    }
}

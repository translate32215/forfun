package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import androidx.appcompat.widget.o;
import b8.c;
import com.google.android.gms.internal.ads.a5;
import com.google.android.gms.internal.ads.b7;
import com.google.android.gms.internal.ads.y6;
import d7.l;
import e.g;
import e8.b1;
import e8.cb0;
import e8.d40;
import e8.q7;
import e8.t;
import e8.ti0;
import f7.e0;
import f7.i0;
import f7.w;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.annotation.concurrent.GuardedBy;
import l0.e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z7.d;
import z7.h;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class p {

    /* renamed from: i  reason: collision with root package name */
    public static final d40 f5702i = new e0(Looper.getMainLooper());

    /* renamed from: a  reason: collision with root package name */
    public AtomicReference<Pattern> f5703a = new AtomicReference<>((Object) null);

    /* renamed from: b  reason: collision with root package name */
    public AtomicReference<Pattern> f5704b = new AtomicReference<>((Object) null);

    /* renamed from: c  reason: collision with root package name */
    public boolean f5705c = true;

    /* renamed from: d  reason: collision with root package name */
    public final Object f5706d = new Object();
    @GuardedBy("userAgentLock")

    /* renamed from: e  reason: collision with root package name */
    public String f5707e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5708f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5709g = false;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f5710h = Executors.newSingleThreadExecutor();

    public static boolean A(String str) {
        if (!b7.a()) {
            return false;
        }
        if (!((Boolean) ti0.f16763j.f16769f.a(t.B2)).booleanValue()) {
            return false;
        }
        String str2 = (String) ti0.f16763j.f16769f.a(t.D2);
        if (!str2.isEmpty()) {
            for (String equals : str2.split(";")) {
                if (equals.equals(str)) {
                    return false;
                }
            }
        }
        String str3 = (String) ti0.f16763j.f16769f.a(t.C2);
        if (str3.isEmpty()) {
            return true;
        }
        for (String equals2 : str3.split(";")) {
            if (equals2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static int[] B(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        if (window == null || (findViewById = window.findViewById(16908290)) == null) {
            return new int[]{0, 0};
        }
        return new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    public static Map<String, String> C(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String next : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(next)) {
                hashMap.put(next, uri.getQueryParameter(next));
            }
        }
        return hashMap;
    }

    public static int[] D(Activity activity) {
        int[] B = B(activity);
        return new int[]{ti0.f16763j.f16764a.f(activity, B[0]), ti0.f16763j.f16764a.f(activity, B[1])};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r0.findViewById(16908290);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] E(android.app.Activity r6) {
        /*
            android.view.Window r0 = r6.getWindow()
            r1 = 1
            r2 = 0
            r3 = 2
            if (r0 == 0) goto L_0x0021
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r4)
            if (r0 == 0) goto L_0x0021
            int[] r4 = new int[r3]
            int r5 = r0.getTop()
            r4[r2] = r5
            int r0 = r0.getBottom()
            r4[r1] = r0
            goto L_0x0026
        L_0x0021:
            int[] r4 = new int[r3]
            r4 = {0, 0} // fill-array
        L_0x0026:
            int[] r0 = new int[r3]
            e8.ti0 r3 = e8.ti0.f16763j
            e8.y8 r3 = r3.f16764a
            r5 = r4[r2]
            int r3 = r3.f(r6, r5)
            r0[r2] = r3
            e8.ti0 r2 = e8.ti0.f16763j
            e8.y8 r2 = r2.f16764a
            r3 = r4[r1]
            int r6 = r2.f(r6, r3)
            r0[r1] = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.p.E(android.app.Activity):int[]");
    }

    public static boolean G(Context context, String str) {
        Context c10 = q7.c(context);
        return c.a(c10).f3657a.getPackageManager().checkPermission(str, c10.getPackageName()) == 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean I(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 == 0) goto L_0x0012
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0012
            android.app.Activity r2 = (android.app.Activity) r2
            goto L_0x0013
        L_0x0012:
            r2 = r0
        L_0x0013:
            r1 = 0
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L_0x0022:
            if (r0 == 0) goto L_0x002d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x002d
            r2 = 1
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.p.I(android.view.View):boolean");
    }

    public static String J() {
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb2.append(" ");
            sb2.append(str);
        }
        sb2.append("; ");
        sb2.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb2.append("; ");
            sb2.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb2.append(" Build/");
                sb2.append(str3);
            }
        }
        sb2.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb2.toString();
    }

    public static String K() {
        return UUID.randomUUID().toString();
    }

    public static String L() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return g.a(str2.length() + o.a(str, 1), str, " ", str2);
    }

    public static Bundle a(Context context) {
        try {
            return c.a(context).a(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            e.v("Error getting metadata", e10);
            return null;
        }
    }

    public static DisplayMetrics c(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static void e(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static void g(Context context, Throwable th) {
        if (context != null) {
            boolean z10 = false;
            try {
                z10 = ((Boolean) b1.f13863b.b()).booleanValue();
            } catch (IllegalStateException unused) {
            }
            if (z10) {
                d.a(context, th);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0062 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean j(android.view.View r3, android.os.PowerManager r4, android.app.KeyguardManager r5) {
        /*
            d7.l r0 = d7.l.B
            com.google.android.gms.ads.internal.util.p r0 = r0.f13186c
            boolean r0 = r0.f5705c
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001d
            if (r5 != 0) goto L_0x000e
            r5 = 0
            goto L_0x0012
        L_0x000e:
            boolean r5 = r5.inKeyguardRestrictedInputMode()
        L_0x0012:
            if (r5 == 0) goto L_0x001d
            boolean r5 = I(r3)
            if (r5 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r5 = 0
            goto L_0x001e
        L_0x001d:
            r5 = 1
        L_0x001e:
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x0063
            boolean r0 = r3.isShown()
            if (r0 == 0) goto L_0x0063
            if (r4 == 0) goto L_0x0035
            boolean r4 = r4.isScreenOn()
            if (r4 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r4 = 0
            goto L_0x0036
        L_0x0035:
            r4 = 1
        L_0x0036:
            if (r4 == 0) goto L_0x0063
            if (r5 == 0) goto L_0x0063
            e8.l<java.lang.Boolean> r4 = e8.t.I0
            e8.ti0 r5 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r5 = r5.f16769f
            java.lang.Object r4 = r5.a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0062
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            boolean r4 = r3.getLocalVisibleRect(r4)
            if (r4 != 0) goto L_0x0062
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            boolean r3 = r3.getGlobalVisibleRect(r4)
            if (r3 == 0) goto L_0x0063
        L_0x0062:
            return r1
        L_0x0063:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.p.j(android.view.View, android.os.PowerManager, android.app.KeyguardManager):boolean");
    }

    public static boolean k(String str, AtomicReference<Pattern> atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static boolean l(Context context) {
        boolean z10;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses == null) {
                        return false;
                    }
                    for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                        if (Process.myPid() == next.pid) {
                            if (next.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                                return true;
                            }
                            PowerManager powerManager = (PowerManager) context.getSystemService("power");
                            if (powerManager == null) {
                                z10 = false;
                            } else {
                                z10 = powerManager.isScreenOn();
                            }
                            if (z10) {
                                return false;
                            }
                            return true;
                        }
                    }
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean m(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            e.C("Error loading class.", th);
            y6 y6Var = l.B.f13190g;
            a5.d(y6Var.f8584e, y6Var.f8585f).c(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static boolean n(Context context) {
        Window window;
        if (!(!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || window.getDecorView() == null)) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, (Point) null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static String o(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return x(a(context));
    }

    @TargetApi(18)
    public static void p(Context context, Intent intent) {
        if (intent != null && h.a()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder("android.support.customtabs.extra.SESSION", (IBinder) null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    @TargetApi(18)
    public static void q(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            p(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(uri2).length() + 26);
            sb2.append("Opening ");
            sb2.append(uri2);
            sb2.append(" in a new browser.");
            e.E(sb2.toString());
        } catch (ActivityNotFoundException e10) {
            e.C("No browser is found.", e10);
        }
    }

    public static void r(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            new w(context, str, (String) obj).b();
        }
    }

    public static boolean s(Context context) {
        Bundle a10 = a(context);
        return TextUtils.isEmpty(x(a10)) && !TextUtils.isEmpty(a10.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
    }

    public static boolean t(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static f u(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                e.I("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            if (queryLocalInterface instanceof f) {
                return (f) queryLocalInterface;
            }
            return new g(iBinder);
        } catch (Exception e10) {
            y6 y6Var = l.B.f13190g;
            a5.d(y6Var.f8584e, y6Var.f8585f).c(e10, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static WebResourceResponse w(HttpURLConnection httpURLConnection) throws IOException {
        String str;
        p pVar = l.B.f13186c;
        String contentType = httpURLConnection.getContentType();
        String str2 = "";
        if (TextUtils.isEmpty(contentType)) {
            str = str2;
        } else {
            str = contentType.split(";")[0].trim();
        }
        p pVar2 = l.B.f13186c;
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] split = contentType2.split(";");
            if (split.length != 1) {
                int i10 = 1;
                while (true) {
                    if (i10 >= split.length) {
                        break;
                    }
                    if (split[i10].trim().startsWith("charset")) {
                        String[] split2 = split[i10].trim().split("=");
                        if (split2.length > 1) {
                            str2 = split2[1].trim();
                            break;
                        }
                    }
                    i10++;
                }
            }
        }
        String str3 = str2;
        Map headerFields = httpURLConnection.getHeaderFields();
        HashMap hashMap = new HashMap(headerFields.size());
        for (Map.Entry entry : headerFields.entrySet()) {
            if (!(entry.getKey() == null || entry.getValue() == null || ((List) entry.getValue()).size() <= 0)) {
                hashMap.put((String) entry.getKey(), (String) ((List) entry.getValue()).get(0));
            }
        }
        return l.B.f13188e.e(str, str3, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
    }

    public static String x(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        if (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) {
            return string;
        }
        return "";
    }

    public static int y(int i10) {
        if (i10 >= 5000) {
            return i10;
        }
        if (i10 <= 0) {
            return 60000;
        }
        StringBuilder sb2 = new StringBuilder(97);
        sb2.append("HTTP timeout too low: ");
        sb2.append(i10);
        sb2.append(" milliseconds. Reverting to default timeout: 60000 milliseconds.");
        e.K(sb2.toString());
        return 60000;
    }

    public static int z(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
            sb2.append("Could not parse value:");
            sb2.append(valueOf);
            e.K(sb2.toString());
            return 0;
        }
    }

    public final JSONObject F(Map<String, ?> map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String next : map.keySet()) {
                i(jSONObject, next, map.get(next));
            }
            return jSONObject;
        } catch (ClassCastException e10) {
            String valueOf = String.valueOf(e10.getMessage());
            throw new JSONException(valueOf.length() != 0 ? "Could not convert map to JSON: ".concat(valueOf) : new String("Could not convert map to JSON: "));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r1 = J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x003a, code lost:
        continue;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0044 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0072 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023 A[Catch:{ Exception -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056 A[Catch:{ Exception -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b A[Catch:{ Exception -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a9 A[Catch:{ Exception -> 0x00b8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String H(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f5706d
            monitor-enter(r0)
            java.lang.String r1 = r4.f5707e     // Catch:{ all -> 0x00da }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x00da }
            return r1
        L_0x0009:
            if (r6 != 0) goto L_0x0011
            java.lang.String r5 = J()     // Catch:{ all -> 0x00da }
            monitor-exit(r0)     // Catch:{ all -> 0x00da }
            return r5
        L_0x0011:
            d7.l r1 = d7.l.B     // Catch:{ Exception -> 0x001b }
            f7.m0 r1 = r1.f13188e     // Catch:{ Exception -> 0x001b }
            java.lang.String r1 = r1.a(r5)     // Catch:{ Exception -> 0x001b }
            r4.f5707e = r1     // Catch:{ Exception -> 0x001b }
        L_0x001b:
            java.lang.String r1 = r4.f5707e     // Catch:{ all -> 0x00da }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00da }
            if (r1 == 0) goto L_0x0078
            e8.ti0 r1 = e8.ti0.f16763j     // Catch:{ all -> 0x00da }
            e8.y8 r1 = r1.f16764a     // Catch:{ all -> 0x00da }
            boolean r1 = e8.y8.l()     // Catch:{ all -> 0x00da }
            if (r1 != 0) goto L_0x0064
            r1 = 0
            r4.f5707e = r1     // Catch:{ all -> 0x00da }
            e8.d40 r1 = f5702i     // Catch:{ all -> 0x00da }
            f7.j0 r2 = new f7.j0     // Catch:{ all -> 0x00da }
            r2.<init>((com.google.android.gms.ads.internal.util.p) r4, (android.content.Context) r5)     // Catch:{ all -> 0x00da }
            r1.post(r2)     // Catch:{ all -> 0x00da }
        L_0x003a:
            java.lang.String r1 = r4.f5707e     // Catch:{ all -> 0x00da }
            if (r1 != 0) goto L_0x0078
            java.lang.Object r1 = r4.f5706d     // Catch:{ InterruptedException -> 0x0044 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0044 }
            goto L_0x003a
        L_0x0044:
            java.lang.String r1 = J()     // Catch:{ all -> 0x00da }
            r4.f5707e = r1     // Catch:{ all -> 0x00da }
            java.lang.String r2 = "Interrupted, use default user agent: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00da }
            int r3 = r1.length()     // Catch:{ all -> 0x00da }
            if (r3 == 0) goto L_0x005b
            java.lang.String r1 = r2.concat(r1)     // Catch:{ all -> 0x00da }
            goto L_0x0060
        L_0x005b:
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x00da }
            r1.<init>(r2)     // Catch:{ all -> 0x00da }
        L_0x0060:
            l0.e.K(r1)     // Catch:{ all -> 0x00da }
            goto L_0x003a
        L_0x0064:
            android.webkit.WebView r1 = new android.webkit.WebView     // Catch:{ all -> 0x0072 }
            r1.<init>(r5)     // Catch:{ all -> 0x0072 }
            android.webkit.WebSettings r1 = r1.getSettings()     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = r1.getUserAgentString()     // Catch:{ all -> 0x0072 }
            goto L_0x0076
        L_0x0072:
            java.lang.String r1 = J()     // Catch:{ all -> 0x00da }
        L_0x0076:
            r4.f5707e = r1     // Catch:{ all -> 0x00da }
        L_0x0078:
            java.lang.String r1 = r4.f5707e     // Catch:{ all -> 0x00da }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00da }
            int r2 = r1.length()     // Catch:{ all -> 0x00da }
            int r2 = r2 + 10
            int r3 = r6.length()     // Catch:{ all -> 0x00da }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00da }
            r3.<init>(r2)     // Catch:{ all -> 0x00da }
            r3.append(r1)     // Catch:{ all -> 0x00da }
            java.lang.String r1 = " (Mobile; "
            r3.append(r1)     // Catch:{ all -> 0x00da }
            r3.append(r6)     // Catch:{ all -> 0x00da }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x00da }
            r4.f5707e = r6     // Catch:{ all -> 0x00da }
            b8.b r5 = b8.c.a(r5)     // Catch:{ Exception -> 0x00b8 }
            boolean r5 = r5.c()     // Catch:{ Exception -> 0x00b8 }
            if (r5 == 0) goto L_0x00ca
            java.lang.String r5 = r4.f5707e     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r6 = ";aia"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ Exception -> 0x00b8 }
            r4.f5707e = r5     // Catch:{ Exception -> 0x00b8 }
            goto L_0x00ca
        L_0x00b8:
            r5 = move-exception
            d7.l r6 = d7.l.B     // Catch:{ all -> 0x00da }
            com.google.android.gms.internal.ads.y6 r6 = r6.f13190g     // Catch:{ all -> 0x00da }
            java.lang.String r1 = "AdUtil.getUserAgent"
            android.content.Context r2 = r6.f8584e     // Catch:{ all -> 0x00da }
            e8.f9 r6 = r6.f8585f     // Catch:{ all -> 0x00da }
            e8.v6 r6 = com.google.android.gms.internal.ads.a5.d(r2, r6)     // Catch:{ all -> 0x00da }
            r6.c(r5, r1)     // Catch:{ all -> 0x00da }
        L_0x00ca:
            java.lang.String r5 = r4.f5707e     // Catch:{ all -> 0x00da }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00da }
            java.lang.String r6 = ")"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x00da }
            r4.f5707e = r5     // Catch:{ all -> 0x00da }
            monitor-exit(r0)     // Catch:{ all -> 0x00da }
            return r5
        L_0x00da:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00da }
            goto L_0x00de
        L_0x00dd:
            throw r5
        L_0x00de:
            goto L_0x00dd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.p.H(android.content.Context, java.lang.String):java.lang.String");
    }

    @TargetApi(18)
    public final int b(Context context, Uri uri) {
        int i10;
        String t10;
        if (!h.a()) {
            e.H("Chrome Custom Tabs can only work with version Jellybean onwards.");
            i10 = 1;
        } else if (!(context instanceof Activity)) {
            e.H("Chrome Custom Tabs can only work with Activity context.");
            i10 = 2;
        } else if (!com.google.android.gms.internal.ads.p.c(context)) {
            e.H("Default browser does not support custom tabs.");
            i10 = 3;
        } else {
            i10 = 0;
        }
        if (i10 != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i10;
        }
        com.google.android.gms.internal.ads.p pVar = new com.google.android.gms.internal.ads.p();
        pVar.f7792d = new i0(pVar, context, uri);
        Activity activity = (Activity) context;
        if (pVar.f7790b != null || (t10 = androidx.appcompat.widget.p.t(activity)) == null) {
            return 4;
        }
        cb0 cb0 = new cb0(pVar);
        pVar.f7791c = cb0;
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(t10)) {
            intent2.setPackage(t10);
        }
        activity.bindService(intent2, cb0, 33);
        return 4;
    }

    public final JSONArray d(Collection<?> collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object h10 : collection) {
            h(jSONArray, h10);
        }
        return jSONArray;
    }

    public final void f(Context context, String str, HttpURLConnection httpURLConnection, int i10) {
        int y10 = y(i10);
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("HTTP timeout: ");
        sb2.append(y10);
        sb2.append(" milliseconds.");
        e.J(sb2.toString());
        httpURLConnection.setConnectTimeout(y10);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(y10);
        httpURLConnection.setRequestProperty("User-Agent", H(context, str));
        httpURLConnection.setUseCaches(false);
    }

    public final void h(JSONArray jSONArray, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONArray.put(v((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(F((Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(d((Collection) obj));
        } else if (obj instanceof Object[]) {
            JSONArray jSONArray2 = new JSONArray();
            for (Object h10 : (Object[]) obj) {
                h(jSONArray2, h10);
            }
            jSONArray.put(jSONArray2);
        } else {
            jSONArray.put(obj);
        }
    }

    public final void i(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONObject.put(str, v((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, F((Map) obj));
        } else if (obj instanceof Collection) {
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, d((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, d(Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    public final JSONObject v(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            i(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }
}

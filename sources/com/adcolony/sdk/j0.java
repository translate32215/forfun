package com.adcolony.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Toast;
import androidx.preference.PreferenceManager;
import com.adcolony.sdk.t0;
import java.security.MessageDigest;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;
import p.f;

public class j0 {

    /* renamed from: a  reason: collision with root package name */
    public static ExecutorService f4565a = Executors.newSingleThreadExecutor();

    /* renamed from: b  reason: collision with root package name */
    public static Handler f4566b;

    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f4567a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f4568b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f4569c;

        public a(Context context, String str, int i10) {
            this.f4567a = context;
            this.f4568b = str;
            this.f4569c = i10;
        }

        public void run() {
            Toast.makeText(this.f4567a, this.f4568b, this.f4569c).show();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public double f4570a;

        /* renamed from: b  reason: collision with root package name */
        public double f4571b = ((double) System.currentTimeMillis());

        public b(double d10) {
            this.f4570a = d10;
            double currentTimeMillis = (double) System.currentTimeMillis();
            Double.isNaN(currentTimeMillis);
            Double.isNaN(currentTimeMillis);
            this.f4571b = (currentTimeMillis / 1000.0d) + this.f4570a;
        }

        public double a() {
            double currentTimeMillis = (double) System.currentTimeMillis();
            Double.isNaN(currentTimeMillis);
            double d10 = this.f4571b - (currentTimeMillis / 1000.0d);
            if (d10 <= 0.0d) {
                return 0.0d;
            }
            return d10;
        }

        public String toString() {
            double a10 = a();
            ExecutorService executorService = j0.f4565a;
            StringBuilder sb2 = new StringBuilder();
            if (Double.isNaN(a10) || Double.isInfinite(a10)) {
                sb2.append(a10);
            } else {
                if (a10 < 0.0d) {
                    a10 = -a10;
                    sb2.append('-');
                }
                long pow = (long) Math.pow(10.0d, (double) 2);
                double d10 = (double) pow;
                Double.isNaN(d10);
                Double.isNaN(d10);
                Double.isNaN(d10);
                long round = Math.round(a10 * d10);
                sb2.append(round / pow);
                sb2.append('.');
                long j10 = round % pow;
                if (j10 == 0) {
                    for (int i10 = 0; i10 < 2; i10++) {
                        sb2.append('0');
                    }
                } else {
                    for (long j11 = j10 * 10; j11 < pow; j11 *= 10) {
                        sb2.append('0');
                    }
                    sb2.append(j10);
                }
            }
            return sb2.toString();
        }
    }

    public static double a(AudioManager audioManager) {
        if (audioManager == null) {
            f.a(0, 0, t2.b.a("getAudioVolume() called with a null AudioManager"), true);
            return 0.0d;
        }
        try {
            double streamVolume = (double) audioManager.getStreamVolume(3);
            double streamMaxVolume = (double) audioManager.getStreamMaxVolume(3);
            if (streamMaxVolume == 0.0d) {
                return 0.0d;
            }
            Double.isNaN(streamVolume);
            Double.isNaN(streamMaxVolume);
            return streamVolume / streamMaxVolume;
        } catch (Exception e10) {
            StringBuilder a10 = android.support.v4.media.a.a("Exception occurred when accessing AudioManager: ");
            a10.append(e10.toString());
            f.a(0, 0, a10.toString(), true);
            return 0.0d;
        }
    }

    public static int b(View view) {
        if (view == null) {
            return 0;
        }
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return (int) (((float) iArr[0]) / f.d().i().f());
    }

    public static AudioManager c(Context context) {
        return (AudioManager) context.getSystemService("audio");
    }

    public static String d() {
        return UUID.randomUUID().toString();
    }

    public static String e(JSONArray jSONArray) throws JSONException {
        String str = "";
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            if (i10 > 0) {
                str = j.f.a(str, ",");
            }
            switch (jSONArray.getInt(i10)) {
                case 1:
                    str = j.f.a(str, "MO");
                    break;
                case 2:
                    str = j.f.a(str, "TU");
                    break;
                case 3:
                    str = j.f.a(str, "WE");
                    break;
                case 4:
                    str = j.f.a(str, "TH");
                    break;
                case 5:
                    str = j.f.a(str, "FR");
                    break;
                case 6:
                    str = j.f.a(str, "SA");
                    break;
                case 7:
                    str = j.f.a(str, "SU");
                    break;
            }
        }
        return str;
    }

    public static boolean f(Intent intent) {
        return g(intent, false);
    }

    public static boolean g(Intent intent, boolean z10) {
        try {
            Context context = f.f4478a;
            if (context == null) {
                return false;
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            d dVar = f.d().f4670n;
            if (dVar != null && dVar.a()) {
                dVar.f4464c.f4758h = true;
            }
            if (z10) {
                context.startActivity(Intent.createChooser(intent, "Handle this via..."));
            } else {
                context.startActivity(intent);
            }
            return true;
        } catch (Exception e10) {
            f.a(0, 1, e10.toString(), true);
            return false;
        }
    }

    public static boolean h(Runnable runnable) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return false;
        }
        if (f4566b == null) {
            f4566b = new Handler(mainLooper);
        }
        if (mainLooper == Looper.myLooper()) {
            runnable.run();
            return true;
        }
        f4566b.post(runnable);
        return true;
    }

    public static boolean i(String str, int i10) {
        Context context = f.f4478a;
        if (context == null) {
            return false;
        }
        h(new a(context, str, i10));
        return true;
    }

    public static int j(View view) {
        if (view == null) {
            return 0;
        }
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return (int) (((float) iArr[1]) / f.d().i().f());
    }

    public static SharedPreferences k(Context context) {
        try {
            Class.forName("androidx.preference.PreferenceManager");
            return PreferenceManager.getDefaultSharedPreferences(context);
        } catch (ClassNotFoundException unused) {
            return context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        }
    }

    public static String l(Context context, String str) {
        try {
            return k(context).getString(str, (String) null);
        } catch (ClassCastException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Key " + str + " in SharedPreferences ");
            sb2.append("does not have a String value.");
            f.a(0, 1, sb2.toString(), true);
            return null;
        }
    }

    public static String m(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(str.getBytes("iso-8859-1"), 0, str.length());
            byte[] digest = instance.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : digest) {
                byte b11 = (b10 >>> 4) & 15;
                int i10 = 0;
                while (true) {
                    sb2.append((char) ((b11 < 0 || b11 > 9) ? (b11 - 10) + 97 : b11 + 48));
                    b11 = b10 & 15;
                    int i11 = i10 + 1;
                    if (i10 >= 1) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return sb2.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String n(JSONArray jSONArray) throws JSONException {
        String str = "";
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            if (i10 > 0) {
                str = j.f.a(str, ",");
            }
            StringBuilder a10 = android.support.v4.media.a.a(str);
            a10.append(jSONArray.getInt(i10));
            str = a10.toString();
        }
        return str;
    }

    public static String o() {
        Context context = f.f4478a;
        if (context == null) {
            return "1.0";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            t0.a aVar = new t0.a();
            aVar.f4784a.append("Failed to retrieve package info.");
            aVar.a(t0.f4781f);
            return "1.0";
        }
    }

    public static boolean p(String str) {
        Application application;
        Context context = f.f4478a;
        if (context == null) {
            return false;
        }
        try {
            if (context instanceof Application) {
                application = (Application) context;
            } else {
                application = ((Activity) context).getApplication();
            }
            application.getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int q(String str) {
        if (!str.equals("portrait")) {
            return !str.equals("landscape") ? -1 : 1;
        }
        return 0;
    }

    public static JSONArray r(Context context) {
        JSONArray jSONArray = new JSONArray();
        if (context == null) {
            return jSONArray;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            if (packageInfo.requestedPermissions == null) {
                return jSONArray;
            }
            JSONArray jSONArray2 = new JSONArray();
            int i10 = 0;
            while (true) {
                try {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    jSONArray2.put(strArr[i10]);
                    i10++;
                } catch (Exception unused) {
                }
            }
            return jSONArray2;
        } catch (Exception unused2) {
            return jSONArray;
        }
    }

    public static int s(Context context) {
        int identifier;
        if (context != null && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static String t() {
        Context context = f.f4478a;
        return (!(context instanceof Activity) || context.getResources().getConfiguration().orientation != 1) ? "landscape" : "portrait";
    }

    public static boolean u(String str) {
        if (str != null && str.length() <= 128) {
            return true;
        }
        f.a(0, 1, t2.b.a("String must be non-null and the max length is 128 characters."), false);
        return false;
    }

    public static int v(String str) {
        try {
            return (int) Long.parseLong(str, 16);
        } catch (NumberFormatException unused) {
            f.a(0, 1, q.b.a("Unable to parse '", str, "' as a color."), true);
            return -16777216;
        }
    }

    public static boolean w() {
        Context context = f.f4478a;
        return context != null && Build.VERSION.SDK_INT >= 24 && (context instanceof Activity) && ((Activity) context).isInMultiWindowMode();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        return new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", r1).parse(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        return new java.text.SimpleDateFormat("yyyy-MM-dd", r1).parse(r5);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x001c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0021 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date x(java.lang.String r5) {
        /*
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = "yyyy-MM-dd'T'HH:mmZ"
            r0.<init>(r2, r1)
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r3 = "yyyy-MM-dd'T'HH:mm:ssZ"
            r2.<init>(r3, r1)
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.lang.String r4 = "yyyy-MM-dd"
            r3.<init>(r4, r1)
            java.util.Date r5 = r0.parse(r5)     // Catch:{ Exception -> 0x001c }
            return r5
        L_0x001c:
            java.util.Date r5 = r2.parse(r5)     // Catch:{ Exception -> 0x0021 }
            return r5
        L_0x0021:
            java.util.Date r5 = r3.parse(r5)     // Catch:{ Exception -> 0x0026 }
            return r5
        L_0x0026:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.j0.x(java.lang.String):java.util.Date");
    }
}

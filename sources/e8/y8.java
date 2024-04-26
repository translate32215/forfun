package e8;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.UUID;
import m7.a;
import s7.e;
import x3.d;
import y6.b;
import y6.f;
import y6.i;
import z6.c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class y8 {

    /* renamed from: b  reason: collision with root package name */
    public static final Handler f17578b = new d40(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public static final String f17579c = f.class.getName();

    /* renamed from: d  reason: collision with root package name */
    public static final String f17580d = i.class.getName();

    /* renamed from: e  reason: collision with root package name */
    public static final String f17581e = c.class.getName();

    /* renamed from: f  reason: collision with root package name */
    public static final String f17582f = d.class.getName();

    /* renamed from: g  reason: collision with root package name */
    public static final String f17583g = a.class.getName();

    /* renamed from: h  reason: collision with root package name */
    public static final String f17584h = b.class.getName();

    /* renamed from: a  reason: collision with root package name */
    public float f17585a = -1.0f;

    public static int a(DisplayMetrics displayMetrics, int i10) {
        return (int) TypedValue.applyDimension(1, (float) i10, displayMetrics);
    }

    public static void b(Context context, String str, String str2, Bundle bundle, a9 a9Var) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            int a10 = e.f25013b.a(context);
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append(a10);
            sb2.append(".204102000");
            str = sb2.toString();
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", str2);
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        a9Var.c(appendQueryParameter.toString());
    }

    public static int c(DisplayMetrics displayMetrics, int i10) {
        return Math.round(((float) i10) / displayMetrics.density);
    }

    public static String d(Context context) {
        String str;
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            str = null;
        } else {
            str = Settings.Secure.getString(contentResolver, "android_id");
        }
        if (str == null || k()) {
            str = "emulator";
        }
        return h(str);
    }

    public static boolean e(Context context) {
        int d10 = e.f25013b.d(context, 12451000);
        return d10 == 0 || d10 == 2;
    }

    public static int g(Context context, int i10) {
        return a(context.getResources().getDisplayMetrics(), i10);
    }

    public static String h(String str) {
        int i10 = 0;
        while (i10 < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(str.getBytes());
                return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, instance.digest())});
            } catch (NoSuchAlgorithmException unused) {
                i10++;
            } catch (ArithmeticException unused2) {
                return null;
            }
        }
        return null;
    }

    public static boolean i(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) b1.f13865d.b());
    }

    public static boolean j(Context context, int i10) {
        return e.f25013b.d(context, i10) == 0;
    }

    public static boolean k() {
        return Build.DEVICE.startsWith("generic");
    }

    public static boolean l() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static String m() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(byteArray);
                instance.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(instance.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    public final int f(Context context, int i10) {
        if (this.f17585a < 0.0f) {
            synchronized (this) {
                if (this.f17585a < 0.0f) {
                    Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.f17585a = displayMetrics.density;
                }
            }
        }
        return Math.round(((float) i10) / this.f17585a);
    }
}

package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import b8.b;
import b8.c;
import com.startapp.b4;
import com.startapp.startappsdk.R;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;
import k0.e;
import k0.j;
import s.i;
import s7.h;
import z7.f;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class k {
    @GuardedBy("sCache")

    /* renamed from: a  reason: collision with root package name */
    public static final i<String, String> f5873a = new i<>();
    @GuardedBy("sCache")

    /* renamed from: b  reason: collision with root package name */
    public static Locale f5874b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            b a10 = c.a(context);
            return a10.f3657a.getPackageManager().getApplicationLabel(a10.f3657a.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i10) {
        Resources resources = context.getResources();
        String a10 = a(context);
        if (i10 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, new Object[]{a10});
        } else if (i10 != 2) {
            if (i10 == 3) {
                return resources.getString(R.string.common_google_play_services_enable_text, new Object[]{a10});
            } else if (i10 == 5) {
                return d(context, "common_google_play_services_invalid_account_text", a10);
            } else {
                if (i10 == 7) {
                    return d(context, "common_google_play_services_network_error_text", a10);
                }
                if (i10 == 9) {
                    return resources.getString(R.string.common_google_play_services_unsupported_text, new Object[]{a10});
                } else if (i10 == 20) {
                    return d(context, "common_google_play_services_restricted_profile_text", a10);
                } else {
                    switch (i10) {
                        case 16:
                            return d(context, "common_google_play_services_api_unavailable_text", a10);
                        case 17:
                            return d(context, "common_google_play_services_sign_in_failed_text", a10);
                        case 18:
                            return resources.getString(R.string.common_google_play_services_updating_text, new Object[]{a10});
                        default:
                            return resources.getString(R.string.common_google_play_services_unknown_issue, new Object[]{a10});
                    }
                }
            }
        } else if (f.c(context)) {
            return resources.getString(R.string.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(R.string.common_google_play_services_update_text, new Object[]{a10});
        }
    }

    public static String c(Context context, int i10) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case b4.f10106f /*8*/:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Unexpected error code ");
                sb2.append(i10);
                Log.e("GoogleApiAvailability", sb2.toString());
                return null;
        }
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e10 = e(context, str);
        if (e10 == null) {
            e10 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, e10, new Object[]{str2});
    }

    public static String e(Context context, String str) {
        k0.f fVar;
        Resources resources;
        String str2;
        String str3;
        i<String, String> iVar = f5873a;
        synchronized (iVar) {
            try {
                Configuration configuration = context.getResources().getConfiguration();
                if (Build.VERSION.SDK_INT >= 24) {
                    fVar = new k0.f(new j(e.a(configuration)));
                } else {
                    fVar = k0.f.a(configuration.locale);
                }
                Locale locale = fVar.f19869a.get(0);
                if (!locale.equals(f5874b)) {
                    iVar.clear();
                    f5874b = locale;
                }
                String orDefault = iVar.getOrDefault(str, null);
                if (orDefault != null) {
                    return orDefault;
                }
                int i10 = h.f25014e;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources == null) {
                    return null;
                }
                int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    if (str.length() != 0) {
                        str3 = "Missing resource: ".concat(str);
                    } else {
                        str3 = new String("Missing resource: ");
                    }
                    Log.w("GoogleApiAvailability", str3);
                    return null;
                }
                String string = resources.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    if (str.length() != 0) {
                        str2 = "Got empty resource: ".concat(str);
                    } else {
                        str2 = new String("Got empty resource: ");
                    }
                    Log.w("GoogleApiAvailability", str2);
                    return null;
                }
                f5873a.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

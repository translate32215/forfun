package o8;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Handler;
import androidx.fragment.app.a;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class l extends c4 {

    /* renamed from: c  reason: collision with root package name */
    public long f23313c;

    /* renamed from: d  reason: collision with root package name */
    public String f23314d;

    /* renamed from: e  reason: collision with root package name */
    public AccountManager f23315e;

    /* renamed from: f  reason: collision with root package name */
    public Boolean f23316f;

    /* renamed from: g  reason: collision with root package name */
    public long f23317g;

    public l(com.google.android.gms.measurement.internal.l lVar) {
        super(lVar);
    }

    public final boolean j() {
        Calendar instance = Calendar.getInstance();
        this.f23313c = TimeUnit.MINUTES.convert((long) (instance.get(16) + instance.get(15)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f23314d = a.a(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    public final long o() {
        h();
        return this.f23317g;
    }

    public final long p() {
        k();
        return this.f23313c;
    }

    public final String q() {
        k();
        return this.f23314d;
    }

    public final boolean r() {
        h();
        long b10 = this.f8864a.f8850n.b();
        if (b10 - this.f23317g > 86400000) {
            this.f23316f = null;
        }
        Boolean bool = this.f23316f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (d0.a.a(this.f8864a.f8837a, "android.permission.GET_ACCOUNTS") != 0) {
            this.f8864a.d().f8801j.a("Permission error checking for dasher/unicorn accounts");
            this.f23317g = b10;
            this.f23316f = Boolean.FALSE;
            return false;
        }
        if (this.f23315e == null) {
            this.f23315e = AccountManager.get(this.f8864a.f8837a);
        }
        try {
            Account[] result = this.f23315e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, (AccountManagerCallback) null, (Handler) null).getResult();
            if (result == null || result.length <= 0) {
                Account[] result2 = this.f23315e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, (AccountManagerCallback) null, (Handler) null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.f23316f = Boolean.TRUE;
                    this.f23317g = b10;
                    return true;
                }
                this.f23317g = b10;
                this.f23316f = Boolean.FALSE;
                return false;
            }
            this.f23316f = Boolean.TRUE;
            this.f23317g = b10;
            return true;
        } catch (AuthenticatorException | OperationCanceledException | IOException e10) {
            this.f8864a.d().f8798g.b("Exception checking account types", e10);
        }
    }
}

package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import z1.a;
import z1.c;

public class InitializationProvider extends ContentProvider {
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new c("Context cannot be null");
        } else if (context.getApplicationContext() == null) {
            return true;
        } else {
            a c10 = a.c(context);
            c10.getClass();
            try {
                a2.a.a("Startup");
                c10.a(c10.f28211c.getPackageManager().getProviderInfo(new ComponentName(c10.f28211c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
                a2.a.b();
                return true;
            } catch (PackageManager.NameNotFoundException e10) {
                throw new c((Throwable) e10);
            } catch (Throwable th) {
                a2.a.b();
                throw th;
            }
        }
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}

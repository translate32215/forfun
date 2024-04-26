package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import ia.a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k8.d1;
import k8.s1;
import o8.t4;
import s8.l;

/* compiled from: com.google.android.gms:play-services-measurement-api@@19.0.2 */
public final class FirebaseAnalytics {

    /* renamed from: b  reason: collision with root package name */
    public static volatile FirebaseAnalytics f9674b;

    /* renamed from: a  reason: collision with root package name */
    public final s1 f9675a;

    public FirebaseAnalytics(s1 s1Var) {
        if (s1Var != null) {
            this.f9675a = s1Var;
            return;
        }
        throw new NullPointerException("null reference");
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f9674b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f9674b == null) {
                    f9674b = new FirebaseAnalytics(s1.e(context, (String) null, (String) null, (String) null, (Bundle) null));
                }
            }
        }
        return f9674b;
    }

    @Keep
    public static t4 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        s1 e10 = s1.e(context, (String) null, (String) null, (String) null, bundle);
        if (e10 == null) {
            return null;
        }
        return new a(e10);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = com.google.firebase.installations.a.f9676m;
            return (String) l.b(com.google.firebase.installations.a.f(com.google.firebase.a.b()).getId(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e10) {
            throw new IllegalStateException(e10.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e11) {
            throw new IllegalStateException(e11);
        }
    }

    @Deprecated
    @Keep
    public void setCurrentScreen(Activity activity, String str, String str2) {
        s1 s1Var = this.f9675a;
        s1Var.getClass();
        s1Var.f20455a.execute(new d1(s1Var, activity, str, str2));
    }
}

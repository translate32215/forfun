package com.startapp;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.triggeredlinks.AppEventsMetadata;
import com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata;
import java.util.Map;

/* compiled from: Sta */
public class g0 extends l2 {

    /* renamed from: a  reason: collision with root package name */
    public final h0 f10412a;

    /* renamed from: b  reason: collision with root package name */
    public int f10413b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10414c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f10415d;

    public g0(h0 h0Var) {
        this.f10412a = h0Var;
    }

    public void onActivityStarted(Activity activity) {
        if (activity != null) {
            int i10 = this.f10413b + 1;
            this.f10413b = i10;
            if (i10 == 1 && !this.f10414c) {
                Map<String, String> map = null;
                if (!this.f10415d) {
                    this.f10415d = true;
                    StartAppSDKInternal startAppSDKInternal = (StartAppSDKInternal) this.f10412a;
                    StartAppSDKInternal.g(startAppSDKInternal.f12140h);
                    jb jbVar = startAppSDKInternal.B;
                    if (jbVar != null) {
                        TriggeredLinksMetadata a10 = jbVar.a();
                        AppEventsMetadata a11 = a10 != null ? a10.a() : null;
                        Map<String, String> c10 = a11 != null ? a11.c() : null;
                        if (c10 != null) {
                            jbVar.a(a10, c10, "Launch");
                        }
                    }
                }
                StartAppSDKInternal startAppSDKInternal2 = (StartAppSDKInternal) this.f10412a;
                Application application = startAppSDKInternal2.f12140h;
                if (application != null) {
                    sa u10 = ComponentLocator.a((Context) application).u();
                    u10.f11706b.execute(new qa(u10));
                }
                StartAppSDKInternal.g(startAppSDKInternal2.f12140h);
                jb jbVar2 = startAppSDKInternal2.B;
                if (jbVar2 != null) {
                    TriggeredLinksMetadata a12 = jbVar2.a();
                    AppEventsMetadata a13 = a12 != null ? a12.a() : null;
                    if (a13 != null) {
                        map = a13.a();
                    }
                    if (map != null) {
                        jbVar2.a(a12, map, "Active");
                    }
                }
            }
        }
    }

    public void onActivityStopped(Activity activity) {
        if (activity != null) {
            this.f10413b--;
            boolean isChangingConfigurations = activity.isChangingConfigurations();
            this.f10414c = isChangingConfigurations;
            if (this.f10413b == 0 && !isChangingConfigurations) {
                StartAppSDKInternal startAppSDKInternal = (StartAppSDKInternal) this.f10412a;
                Application application = startAppSDKInternal.f12140h;
                if (application != null) {
                    sa u10 = ComponentLocator.a((Context) application).u();
                    u10.f11706b.execute(new ra(u10));
                }
                StartAppSDKInternal.g(startAppSDKInternal.f12140h);
                jb jbVar = startAppSDKInternal.B;
                if (jbVar != null) {
                    TriggeredLinksMetadata a10 = jbVar.a();
                    Map<String, String> map = null;
                    AppEventsMetadata a11 = a10 != null ? a10.a() : null;
                    if (a11 != null) {
                        map = a11.b();
                    }
                    if (map != null) {
                        jbVar.a(a10, map, "Inactive");
                    }
                }
                Application application2 = startAppSDKInternal.f12140h;
                if (application2 != null) {
                    i6 o10 = ComponentLocator.a((Context) application2).o();
                    o10.getClass();
                    try {
                        o10.c();
                    } catch (Throwable th) {
                        i4.a(th);
                    }
                }
            }
        }
    }
}

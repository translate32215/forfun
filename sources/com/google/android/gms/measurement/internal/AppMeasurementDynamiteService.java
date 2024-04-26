package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import c8.b;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.util.DynamiteApi;
import e8.hn;
import e8.wu;
import f7.j0;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import k8.a1;
import k8.ca;
import k8.r0;
import k8.v0;
import k8.x0;
import k8.z0;
import o8.a6;
import o8.h4;
import o8.j4;
import o8.k4;
import o8.l4;
import o8.n4;
import o8.o4;
import o8.p;
import o8.r;
import o8.r4;
import o8.s4;
import o8.v2;
import o8.x4;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import r7.h;
import r7.m;
import s.a;
import t1.c;
import x.f;

@DynamiteApi
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@19.0.2 */
public class AppMeasurementDynamiteService extends r0 {

    /* renamed from: a  reason: collision with root package name */
    public l f8778a = null;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Integer, h4> f8779b = new a();

    @EnsuresNonNull({"scion"})
    public final void Y() {
        if (this.f8778a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public void beginAdUnitExposure(String str, long j10) throws RemoteException {
        Y();
        this.f8778a.n().i(str, j10);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Y();
        this.f8778a.v().I(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j10) throws RemoteException {
        Y();
        s4 v10 = this.f8778a.v();
        v10.i();
        v10.f8864a.b().r(new j0(v10, (Boolean) null));
    }

    public void endAdUnitExposure(String str, long j10) throws RemoteException {
        Y();
        this.f8778a.n().j(str, j10);
    }

    public void generateEventId(v0 v0Var) throws RemoteException {
        Y();
        long n02 = this.f8778a.A().n0();
        Y();
        this.f8778a.A().G(v0Var, n02);
    }

    public void getAppInstanceId(v0 v0Var) throws RemoteException {
        Y();
        this.f8778a.b().r(new j4(this, v0Var, 0));
    }

    public void getCachedAppInstanceId(v0 v0Var) throws RemoteException {
        Y();
        String F = this.f8778a.v().F();
        Y();
        this.f8778a.A().H(v0Var, F);
    }

    public void getConditionalUserProperties(String str, String str2, v0 v0Var) throws RemoteException {
        Y();
        this.f8778a.b().r(new wu(this, v0Var, str, str2));
    }

    public void getCurrentScreenClass(v0 v0Var) throws RemoteException {
        Y();
        x4 x4Var = this.f8778a.v().f8864a.x().f23640c;
        String str = x4Var != null ? x4Var.f23602b : null;
        Y();
        this.f8778a.A().H(v0Var, str);
    }

    public void getCurrentScreenName(v0 v0Var) throws RemoteException {
        Y();
        x4 x4Var = this.f8778a.v().f8864a.x().f23640c;
        String str = x4Var != null ? x4Var.f23601a : null;
        Y();
        this.f8778a.A().H(v0Var, str);
    }

    public void getGmpAppId(v0 v0Var) throws RemoteException {
        Y();
        s4 v10 = this.f8778a.v();
        l lVar = v10.f8864a;
        String str = lVar.f8838b;
        if (str == null) {
            try {
                str = f.i(lVar.f8837a, "google_app_id", lVar.f8855s);
            } catch (IllegalStateException e10) {
                v10.f8864a.d().f8797f.b("getGoogleAppId failed with exception", e10);
                str = null;
            }
        }
        Y();
        this.f8778a.A().H(v0Var, str);
    }

    public void getMaxUserProperties(String str, v0 v0Var) throws RemoteException {
        Y();
        s4 v10 = this.f8778a.v();
        v10.getClass();
        i.e(str);
        v10.f8864a.getClass();
        Y();
        this.f8778a.A().F(v0Var, 25);
    }

    public void getTestFlag(v0 v0Var, int i10) throws RemoteException {
        Y();
        if (i10 == 0) {
            r A = this.f8778a.A();
            s4 v10 = this.f8778a.v();
            v10.getClass();
            AtomicReference atomicReference = new AtomicReference();
            A.H(v0Var, (String) v10.f8864a.b().o(atomicReference, 15000, "String test flag value", new o4(v10, atomicReference, 0)));
        } else if (i10 == 1) {
            r A2 = this.f8778a.A();
            s4 v11 = this.f8778a.v();
            v11.getClass();
            AtomicReference atomicReference2 = new AtomicReference();
            A2.G(v0Var, ((Long) v11.f8864a.b().o(atomicReference2, 15000, "long test flag value", new j0(v11, atomicReference2))).longValue());
        } else if (i10 == 2) {
            r A3 = this.f8778a.A();
            s4 v12 = this.f8778a.v();
            v12.getClass();
            AtomicReference atomicReference3 = new AtomicReference();
            double doubleValue = ((Double) v12.f8864a.b().o(atomicReference3, 15000, "double test flag value", new o4(v12, atomicReference3, 1))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                v0Var.o0(bundle);
            } catch (RemoteException e10) {
                A3.f8864a.d().f8800i.b("Error returning double value to wrapper", e10);
            }
        } else if (i10 == 3) {
            r A4 = this.f8778a.A();
            s4 v13 = this.f8778a.v();
            v13.getClass();
            AtomicReference atomicReference4 = new AtomicReference();
            A4.F(v0Var, ((Integer) v13.f8864a.b().o(atomicReference4, 15000, "int test flag value", new n4(v13, atomicReference4, 1))).intValue());
        } else if (i10 == 4) {
            r A5 = this.f8778a.A();
            s4 v14 = this.f8778a.v();
            v14.getClass();
            AtomicReference atomicReference5 = new AtomicReference();
            A5.B(v0Var, ((Boolean) v14.f8864a.b().o(atomicReference5, 15000, "boolean test flag value", new n4(v14, atomicReference5, 0))).booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z10, v0 v0Var) throws RemoteException {
        Y();
        this.f8778a.b().r(new h(this, v0Var, str, str2, z10));
    }

    public void initForTests(Map map) throws RemoteException {
        Y();
    }

    public void initialize(c8.a aVar, a1 a1Var, long j10) throws RemoteException {
        l lVar = this.f8778a;
        if (lVar == null) {
            Context context = (Context) b.z0(aVar);
            i.h(context);
            this.f8778a = l.u(context, a1Var, Long.valueOf(j10));
            return;
        }
        lVar.d().f8800i.a("Attempting to initialize multiple times");
    }

    public void isDataCollectionEnabled(v0 v0Var) throws RemoteException {
        Y();
        this.f8778a.b().r(new j4(this, v0Var, 1));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) throws RemoteException {
        Y();
        this.f8778a.v().n(str, str2, bundle, z10, z11, j10);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, v0 v0Var, long j10) throws RemoteException {
        Bundle bundle2;
        Y();
        i.e(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.f8778a.b().r(new wu(this, v0Var, new r(str2, new p(bundle), "app", j10), str));
    }

    public void logHealthData(int i10, String str, c8.a aVar, c8.a aVar2, c8.a aVar3) throws RemoteException {
        Object obj;
        Object obj2;
        Y();
        Object obj3 = null;
        if (aVar == null) {
            obj = null;
        } else {
            obj = b.z0(aVar);
        }
        if (aVar2 == null) {
            obj2 = null;
        } else {
            obj2 = b.z0(aVar2);
        }
        if (aVar3 != null) {
            obj3 = b.z0(aVar3);
        }
        this.f8778a.d().x(i10, true, false, str, obj, obj2, obj3);
    }

    public void onActivityCreated(c8.a aVar, Bundle bundle, long j10) throws RemoteException {
        Y();
        r4 r4Var = this.f8778a.v().f23428c;
        if (r4Var != null) {
            this.f8778a.v().l();
            r4Var.onActivityCreated((Activity) b.z0(aVar), bundle);
        }
    }

    public void onActivityDestroyed(c8.a aVar, long j10) throws RemoteException {
        Y();
        r4 r4Var = this.f8778a.v().f23428c;
        if (r4Var != null) {
            this.f8778a.v().l();
            r4Var.onActivityDestroyed((Activity) b.z0(aVar));
        }
    }

    public void onActivityPaused(c8.a aVar, long j10) throws RemoteException {
        Y();
        r4 r4Var = this.f8778a.v().f23428c;
        if (r4Var != null) {
            this.f8778a.v().l();
            r4Var.onActivityPaused((Activity) b.z0(aVar));
        }
    }

    public void onActivityResumed(c8.a aVar, long j10) throws RemoteException {
        Y();
        r4 r4Var = this.f8778a.v().f23428c;
        if (r4Var != null) {
            this.f8778a.v().l();
            r4Var.onActivityResumed((Activity) b.z0(aVar));
        }
    }

    public void onActivitySaveInstanceState(c8.a aVar, v0 v0Var, long j10) throws RemoteException {
        Y();
        r4 r4Var = this.f8778a.v().f23428c;
        Bundle bundle = new Bundle();
        if (r4Var != null) {
            this.f8778a.v().l();
            r4Var.onActivitySaveInstanceState((Activity) b.z0(aVar), bundle);
        }
        try {
            v0Var.o0(bundle);
        } catch (RemoteException e10) {
            this.f8778a.d().f8800i.b("Error returning bundle value to wrapper", e10);
        }
    }

    public void onActivityStarted(c8.a aVar, long j10) throws RemoteException {
        Y();
        if (this.f8778a.v().f23428c != null) {
            this.f8778a.v().l();
            Activity activity = (Activity) b.z0(aVar);
        }
    }

    public void onActivityStopped(c8.a aVar, long j10) throws RemoteException {
        Y();
        if (this.f8778a.v().f23428c != null) {
            this.f8778a.v().l();
            Activity activity = (Activity) b.z0(aVar);
        }
    }

    public void performAction(Bundle bundle, v0 v0Var, long j10) throws RemoteException {
        Y();
        v0Var.o0((Bundle) null);
    }

    public void registerOnMeasurementEventListener(x0 x0Var) throws RemoteException {
        Object obj;
        Y();
        synchronized (this.f8779b) {
            obj = this.f8779b.get(Integer.valueOf(x0Var.f()));
            if (obj == null) {
                obj = new a6(this, x0Var);
                this.f8779b.put(Integer.valueOf(x0Var.f()), obj);
            }
        }
        s4 v10 = this.f8778a.v();
        v10.i();
        if (!v10.f23430e.add(obj)) {
            v10.f8864a.d().f8800i.a("OnEventListener already registered");
        }
    }

    public void resetAnalyticsData(long j10) throws RemoteException {
        Y();
        s4 v10 = this.f8778a.v();
        v10.f23432g.set((Object) null);
        v10.f8864a.b().r(new l4(v10, j10, 1));
    }

    public void setConditionalUserProperty(Bundle bundle, long j10) throws RemoteException {
        Y();
        if (bundle == null) {
            this.f8778a.d().f8797f.a("Conditional user property must not be null");
        } else {
            this.f8778a.v().u(bundle, j10);
        }
    }

    public void setConsent(Bundle bundle, long j10) throws RemoteException {
        Y();
        s4 v10 = this.f8778a.v();
        v10.getClass();
        ca.b();
        if (v10.f8864a.f8843g.v((String) null, v2.f23534r0)) {
            v10.f8864a.b().s(new k4(v10, bundle, j10));
        } else {
            v10.C(bundle, j10);
        }
    }

    public void setConsentThirdParty(Bundle bundle, long j10) throws RemoteException {
        Y();
        this.f8778a.v().v(bundle, -20, j10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0091, code lost:
        if (r0 <= 100) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bb, code lost:
        if (r0 <= 100) goto L_0x00d4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setCurrentScreen(c8.a r3, java.lang.String r4, java.lang.String r5, long r6) throws android.os.RemoteException {
        /*
            r2 = this;
            r2.Y()
            com.google.android.gms.measurement.internal.l r6 = r2.f8778a
            o8.z4 r6 = r6.x()
            java.lang.Object r3 = c8.b.z0(r3)
            android.app.Activity r3 = (android.app.Activity) r3
            com.google.android.gms.measurement.internal.l r7 = r6.f8864a
            o8.f r7 = r7.f8843g
            boolean r7 = r7.w()
            if (r7 != 0) goto L_0x0028
            com.google.android.gms.measurement.internal.l r3 = r6.f8864a
            com.google.android.gms.measurement.internal.h r3 = r3.d()
            o8.a3 r3 = r3.f8802k
            java.lang.String r4 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r3.a(r4)
            goto L_0x00ff
        L_0x0028:
            o8.x4 r7 = r6.f23640c
            if (r7 != 0) goto L_0x003b
            com.google.android.gms.measurement.internal.l r3 = r6.f8864a
            com.google.android.gms.measurement.internal.h r3 = r3.d()
            o8.a3 r3 = r3.f8802k
            java.lang.String r4 = "setCurrentScreen cannot be called while no activity active"
            r3.a(r4)
            goto L_0x00ff
        L_0x003b:
            java.util.Map<android.app.Activity, o8.x4> r0 = r6.f23643f
            java.lang.Object r0 = r0.get(r3)
            if (r0 != 0) goto L_0x0052
            com.google.android.gms.measurement.internal.l r3 = r6.f8864a
            com.google.android.gms.measurement.internal.h r3 = r3.d()
            o8.a3 r3 = r3.f8802k
            java.lang.String r4 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r3.a(r4)
            goto L_0x00ff
        L_0x0052:
            if (r5 != 0) goto L_0x005e
            java.lang.Class r5 = r3.getClass()
            java.lang.String r0 = "Activity"
            java.lang.String r5 = r6.p(r5, r0)
        L_0x005e:
            java.lang.String r0 = r7.f23602b
            boolean r0 = com.google.android.gms.measurement.internal.r.Y(r0, r5)
            java.lang.String r7 = r7.f23601a
            boolean r7 = com.google.android.gms.measurement.internal.r.Y(r7, r4)
            if (r0 == 0) goto L_0x007e
            if (r7 != 0) goto L_0x006f
            goto L_0x007e
        L_0x006f:
            com.google.android.gms.measurement.internal.l r3 = r6.f8864a
            com.google.android.gms.measurement.internal.h r3 = r3.d()
            o8.a3 r3 = r3.f8802k
            java.lang.String r4 = "setCurrentScreen cannot be called with the same class and name"
            r3.a(r4)
            goto L_0x00ff
        L_0x007e:
            r7 = 100
            if (r4 == 0) goto L_0x00aa
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x0094
            int r0 = r4.length()
            com.google.android.gms.measurement.internal.l r1 = r6.f8864a
            r1.getClass()
            if (r0 > r7) goto L_0x0094
            goto L_0x00aa
        L_0x0094:
            com.google.android.gms.measurement.internal.l r3 = r6.f8864a
            com.google.android.gms.measurement.internal.h r3 = r3.d()
            o8.a3 r3 = r3.f8802k
            int r4 = r4.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Invalid screen name length in setCurrentScreen. Length"
            r3.b(r5, r4)
            goto L_0x00ff
        L_0x00aa:
            if (r5 == 0) goto L_0x00d4
            int r0 = r5.length()
            if (r0 <= 0) goto L_0x00be
            int r0 = r5.length()
            com.google.android.gms.measurement.internal.l r1 = r6.f8864a
            r1.getClass()
            if (r0 > r7) goto L_0x00be
            goto L_0x00d4
        L_0x00be:
            com.google.android.gms.measurement.internal.l r3 = r6.f8864a
            com.google.android.gms.measurement.internal.h r3 = r3.d()
            o8.a3 r3 = r3.f8802k
            int r4 = r5.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Invalid class name length in setCurrentScreen. Length"
            r3.b(r5, r4)
            goto L_0x00ff
        L_0x00d4:
            com.google.android.gms.measurement.internal.l r7 = r6.f8864a
            com.google.android.gms.measurement.internal.h r7 = r7.d()
            o8.a3 r7 = r7.f8805n
            if (r4 != 0) goto L_0x00e1
            java.lang.String r0 = "null"
            goto L_0x00e2
        L_0x00e1:
            r0 = r4
        L_0x00e2:
            java.lang.String r1 = "Setting current screen to name, class"
            r7.c(r1, r0, r5)
            o8.x4 r7 = new o8.x4
            com.google.android.gms.measurement.internal.l r0 = r6.f8864a
            com.google.android.gms.measurement.internal.r r0 = r0.A()
            long r0 = r0.n0()
            r7.<init>(r4, r5, r0)
            java.util.Map<android.app.Activity, o8.x4> r4 = r6.f23643f
            r4.put(r3, r7)
            r4 = 1
            r6.l(r3, r7, r4)
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreen(c8.a, java.lang.String, java.lang.String, long):void");
    }

    public void setDataCollectionEnabled(boolean z10) throws RemoteException {
        Y();
        s4 v10 = this.f8778a.v();
        v10.i();
        v10.f8864a.b().r(new hn(v10, z10));
    }

    public void setDefaultEventParameters(Bundle bundle) {
        Bundle bundle2;
        Y();
        s4 v10 = this.f8778a.v();
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        v10.f8864a.b().r(new e7.i(v10, bundle2));
    }

    public void setEventInterceptor(x0 x0Var) throws RemoteException {
        Y();
        c cVar = new c(this, x0Var);
        if (this.f8778a.b().t()) {
            this.f8778a.v().x(cVar);
        } else {
            this.f8778a.b().r(new m(this, cVar));
        }
    }

    public void setInstanceIdProvider(z0 z0Var) throws RemoteException {
        Y();
    }

    public void setMeasurementEnabled(boolean z10, long j10) throws RemoteException {
        Y();
        s4 v10 = this.f8778a.v();
        Boolean valueOf = Boolean.valueOf(z10);
        v10.i();
        v10.f8864a.b().r(new j0(v10, valueOf));
    }

    public void setMinimumSessionDuration(long j10) throws RemoteException {
        Y();
    }

    public void setSessionTimeoutDuration(long j10) throws RemoteException {
        Y();
        s4 v10 = this.f8778a.v();
        v10.f8864a.b().r(new l4(v10, j10, 0));
    }

    public void setUserId(String str, long j10) throws RemoteException {
        Y();
        if (str == null || str.length() != 0) {
            this.f8778a.v().A((String) null, "_id", str, true, j10);
        } else {
            this.f8778a.d().f8800i.a("User ID must be non-empty");
        }
    }

    public void setUserProperty(String str, String str2, c8.a aVar, boolean z10, long j10) throws RemoteException {
        Y();
        this.f8778a.v().A(str, str2, b.z0(aVar), z10, j10);
    }

    public void unregisterOnMeasurementEventListener(x0 x0Var) throws RemoteException {
        Object remove;
        Y();
        synchronized (this.f8779b) {
            remove = this.f8779b.remove(Integer.valueOf(x0Var.f()));
        }
        if (remove == null) {
            remove = new a6(this, x0Var);
        }
        s4 v10 = this.f8778a.v();
        v10.i();
        if (!v10.f23430e.remove(remove)) {
            v10.f8864a.d().f8800i.a("OnEventListener had not been registered");
        }
    }
}

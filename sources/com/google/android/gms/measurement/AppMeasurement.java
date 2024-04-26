package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.measurement.internal.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import n8.a;
import n8.c;
import o8.t4;
import u.b;

@Deprecated
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public class AppMeasurement {

    /* renamed from: b  reason: collision with root package name */
    public static volatile AppMeasurement f8773b;

    /* renamed from: a  reason: collision with root package name */
    public final c f8774a;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(Bundle bundle) {
            Class cls = Long.class;
            Class cls2 = String.class;
            if (bundle != null) {
                this.mAppId = (String) b.g(bundle, "app_id", cls2, null);
                this.mOrigin = (String) b.g(bundle, "origin", cls2, null);
                this.mName = (String) b.g(bundle, "name", cls2, null);
                this.mValue = b.g(bundle, "value", Object.class, null);
                this.mTriggerEventName = (String) b.g(bundle, "trigger_event_name", cls2, null);
                this.mTriggerTimeout = ((Long) b.g(bundle, "trigger_timeout", cls, 0L)).longValue();
                this.mTimedOutEventName = (String) b.g(bundle, "timed_out_event_name", cls2, null);
                this.mTimedOutEventParams = (Bundle) b.g(bundle, "timed_out_event_params", Bundle.class, null);
                this.mTriggeredEventName = (String) b.g(bundle, "triggered_event_name", cls2, null);
                this.mTriggeredEventParams = (Bundle) b.g(bundle, "triggered_event_params", Bundle.class, null);
                this.mTimeToLive = ((Long) b.g(bundle, "time_to_live", cls, 0L)).longValue();
                this.mExpiredEventName = (String) b.g(bundle, "expired_event_name", cls2, null);
                this.mExpiredEventParams = (Bundle) b.g(bundle, "expired_event_params", Bundle.class, null);
                this.mActive = ((Boolean) b.g(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
                this.mCreationTimestamp = ((Long) b.g(bundle, "creation_timestamp", cls, 0L)).longValue();
                this.mTriggeredTimestamp = ((Long) b.g(bundle, "triggered_timestamp", cls, 0L)).longValue();
                return;
            }
            throw new NullPointerException("null reference");
        }
    }

    public AppMeasurement(l lVar) {
        this.f8774a = new a(lVar);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @java.lang.Deprecated
    @androidx.annotation.Keep
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.measurement.AppMeasurement getInstance(android.content.Context r14) {
        /*
            com.google.android.gms.measurement.AppMeasurement r0 = f8773b
            if (r0 != 0) goto L_0x0059
            java.lang.Class<com.google.android.gms.measurement.AppMeasurement> r0 = com.google.android.gms.measurement.AppMeasurement.class
            monitor-enter(r0)
            com.google.android.gms.measurement.AppMeasurement r1 = f8773b     // Catch:{ all -> 0x0056 }
            if (r1 != 0) goto L_0x0054
            r1 = 0
            java.lang.Class<com.google.firebase.analytics.FirebaseAnalytics> r2 = com.google.firebase.analytics.FirebaseAnalytics.class
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{  }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch:{  }
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            r7 = 1
            r4[r7] = r5     // Catch:{  }
            java.lang.String r5 = "getScionFrontendApiImplementation"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r4)     // Catch:{  }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{  }
            r3[r6] = r14     // Catch:{  }
            r3[r7] = r1     // Catch:{  }
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch:{  }
            o8.t4 r2 = (o8.t4) r2     // Catch:{  }
            goto L_0x002f
        L_0x002e:
            r2 = r1
        L_0x002f:
            if (r2 == 0) goto L_0x0039
            com.google.android.gms.measurement.AppMeasurement r14 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x0056 }
            r14.<init>((o8.t4) r2)     // Catch:{ all -> 0x0056 }
            f8773b = r14     // Catch:{ all -> 0x0056 }
            goto L_0x0054
        L_0x0039:
            k8.a1 r13 = new k8.a1     // Catch:{ all -> 0x0056 }
            r3 = 0
            r5 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r13
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0056 }
            com.google.android.gms.measurement.internal.l r14 = com.google.android.gms.measurement.internal.l.u(r14, r13, r1)     // Catch:{ all -> 0x0056 }
            com.google.android.gms.measurement.AppMeasurement r1 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x0056 }
            r1.<init>((com.google.android.gms.measurement.internal.l) r14)     // Catch:{ all -> 0x0056 }
            f8773b = r1     // Catch:{ all -> 0x0056 }
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            goto L_0x0059
        L_0x0056:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            throw r14
        L_0x0059:
            com.google.android.gms.measurement.AppMeasurement r14 = f8773b
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.getInstance(android.content.Context):com.google.android.gms.measurement.AppMeasurement");
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f8774a.b(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f8774a.c(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f8774a.f(str);
    }

    @Keep
    public long generateEventId() {
        return this.f8774a.d();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f8774a.a();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        int i10;
        List<Bundle> g10 = this.f8774a.g(str, str2);
        if (g10 == null) {
            i10 = 0;
        } else {
            i10 = g10.size();
        }
        ArrayList arrayList = new ArrayList(i10);
        for (Bundle conditionalUserProperty : g10) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f8774a.q();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f8774a.h();
    }

    @Keep
    public String getGmpAppId() {
        return this.f8774a.i();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f8774a.j(str);
    }

    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z10) {
        return this.f8774a.e(str, str2, z10);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f8774a.l(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        if (conditionalUserProperty != null) {
            c cVar = this.f8774a;
            Bundle bundle = new Bundle();
            String str = conditionalUserProperty.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            String str2 = conditionalUserProperty.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = conditionalUserProperty.mName;
            if (str3 != null) {
                bundle.putString("name", str3);
            }
            Object obj = conditionalUserProperty.mValue;
            if (obj != null) {
                b.h(bundle, obj);
            }
            String str4 = conditionalUserProperty.mTriggerEventName;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
            String str5 = conditionalUserProperty.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString("timed_out_event_name", str5);
            }
            Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str6 = conditionalUserProperty.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString("triggered_event_name", str6);
            }
            Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
            String str7 = conditionalUserProperty.mExpiredEventName;
            if (str7 != null) {
                bundle.putString("expired_event_name", str7);
            }
            Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
            bundle.putBoolean("active", conditionalUserProperty.mActive);
            bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
            cVar.k(bundle);
            return;
        }
        throw new NullPointerException("null reference");
    }

    public AppMeasurement(t4 t4Var) {
        this.f8774a = new n8.b(t4Var);
    }
}

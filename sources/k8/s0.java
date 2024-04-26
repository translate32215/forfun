package k8;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import c8.a;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public interface s0 extends IInterface {
    void beginAdUnitExposure(String str, long j10) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j10) throws RemoteException;

    void endAdUnitExposure(String str, long j10) throws RemoteException;

    void generateEventId(v0 v0Var) throws RemoteException;

    void getAppInstanceId(v0 v0Var) throws RemoteException;

    void getCachedAppInstanceId(v0 v0Var) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, v0 v0Var) throws RemoteException;

    void getCurrentScreenClass(v0 v0Var) throws RemoteException;

    void getCurrentScreenName(v0 v0Var) throws RemoteException;

    void getGmpAppId(v0 v0Var) throws RemoteException;

    void getMaxUserProperties(String str, v0 v0Var) throws RemoteException;

    void getTestFlag(v0 v0Var, int i10) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z10, v0 v0Var) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(a aVar, a1 a1Var, long j10) throws RemoteException;

    void isDataCollectionEnabled(v0 v0Var) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, v0 v0Var, long j10) throws RemoteException;

    void logHealthData(int i10, String str, a aVar, a aVar2, a aVar3) throws RemoteException;

    void onActivityCreated(a aVar, Bundle bundle, long j10) throws RemoteException;

    void onActivityDestroyed(a aVar, long j10) throws RemoteException;

    void onActivityPaused(a aVar, long j10) throws RemoteException;

    void onActivityResumed(a aVar, long j10) throws RemoteException;

    void onActivitySaveInstanceState(a aVar, v0 v0Var, long j10) throws RemoteException;

    void onActivityStarted(a aVar, long j10) throws RemoteException;

    void onActivityStopped(a aVar, long j10) throws RemoteException;

    void performAction(Bundle bundle, v0 v0Var, long j10) throws RemoteException;

    void registerOnMeasurementEventListener(x0 x0Var) throws RemoteException;

    void resetAnalyticsData(long j10) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j10) throws RemoteException;

    void setConsent(Bundle bundle, long j10) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j10) throws RemoteException;

    void setCurrentScreen(a aVar, String str, String str2, long j10) throws RemoteException;

    void setDataCollectionEnabled(boolean z10) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(x0 x0Var) throws RemoteException;

    void setInstanceIdProvider(z0 z0Var) throws RemoteException;

    void setMeasurementEnabled(boolean z10, long j10) throws RemoteException;

    void setMinimumSessionDuration(long j10) throws RemoteException;

    void setSessionTimeoutDuration(long j10) throws RemoteException;

    void setUserId(String str, long j10) throws RemoteException;

    void setUserProperty(String str, String str2, a aVar, boolean z10, long j10) throws RemoteException;

    void unregisterOnMeasurementEventListener(x0 x0Var) throws RemoteException;
}

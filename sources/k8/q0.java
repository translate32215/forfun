package k8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c8.a;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class q0 extends f0 implements s0 {
    public q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j10) throws RemoteException {
        Parcel Y = Y();
        Y.writeString(str);
        Y.writeLong(j10);
        E1(23, Y);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel Y = Y();
        Y.writeString(str);
        Y.writeString(str2);
        h0.b(Y, bundle);
        E1(9, Y);
    }

    public final void endAdUnitExposure(String str, long j10) throws RemoteException {
        Parcel Y = Y();
        Y.writeString(str);
        Y.writeLong(j10);
        E1(24, Y);
    }

    public final void generateEventId(v0 v0Var) throws RemoteException {
        Parcel Y = Y();
        h0.c(Y, v0Var);
        E1(22, Y);
    }

    public final void getCachedAppInstanceId(v0 v0Var) throws RemoteException {
        Parcel Y = Y();
        h0.c(Y, v0Var);
        E1(19, Y);
    }

    public final void getConditionalUserProperties(String str, String str2, v0 v0Var) throws RemoteException {
        Parcel Y = Y();
        Y.writeString(str);
        Y.writeString(str2);
        h0.c(Y, v0Var);
        E1(10, Y);
    }

    public final void getCurrentScreenClass(v0 v0Var) throws RemoteException {
        Parcel Y = Y();
        h0.c(Y, v0Var);
        E1(17, Y);
    }

    public final void getCurrentScreenName(v0 v0Var) throws RemoteException {
        Parcel Y = Y();
        h0.c(Y, v0Var);
        E1(16, Y);
    }

    public final void getGmpAppId(v0 v0Var) throws RemoteException {
        Parcel Y = Y();
        h0.c(Y, v0Var);
        E1(21, Y);
    }

    public final void getMaxUserProperties(String str, v0 v0Var) throws RemoteException {
        Parcel Y = Y();
        Y.writeString(str);
        h0.c(Y, v0Var);
        E1(6, Y);
    }

    public final void getUserProperties(String str, String str2, boolean z10, v0 v0Var) throws RemoteException {
        Parcel Y = Y();
        Y.writeString(str);
        Y.writeString(str2);
        ClassLoader classLoader = h0.f20231a;
        Y.writeInt(z10 ? 1 : 0);
        h0.c(Y, v0Var);
        E1(5, Y);
    }

    public final void initialize(a aVar, a1 a1Var, long j10) throws RemoteException {
        Parcel Y = Y();
        h0.c(Y, aVar);
        h0.b(Y, a1Var);
        Y.writeLong(j10);
        E1(1, Y);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) throws RemoteException {
        Parcel Y = Y();
        Y.writeString(str);
        Y.writeString(str2);
        h0.b(Y, bundle);
        Y.writeInt(z10 ? 1 : 0);
        Y.writeInt(z11 ? 1 : 0);
        Y.writeLong(j10);
        E1(2, Y);
    }

    public final void logHealthData(int i10, String str, a aVar, a aVar2, a aVar3) throws RemoteException {
        Parcel Y = Y();
        Y.writeInt(5);
        Y.writeString(str);
        h0.c(Y, aVar);
        h0.c(Y, aVar2);
        h0.c(Y, aVar3);
        E1(33, Y);
    }

    public final void onActivityCreated(a aVar, Bundle bundle, long j10) throws RemoteException {
        Parcel Y = Y();
        h0.c(Y, aVar);
        h0.b(Y, bundle);
        Y.writeLong(j10);
        E1(27, Y);
    }

    public final void onActivityDestroyed(a aVar, long j10) throws RemoteException {
        Parcel Y = Y();
        h0.c(Y, aVar);
        Y.writeLong(j10);
        E1(28, Y);
    }

    public final void onActivityPaused(a aVar, long j10) throws RemoteException {
        Parcel Y = Y();
        h0.c(Y, aVar);
        Y.writeLong(j10);
        E1(29, Y);
    }

    public final void onActivityResumed(a aVar, long j10) throws RemoteException {
        Parcel Y = Y();
        h0.c(Y, aVar);
        Y.writeLong(j10);
        E1(30, Y);
    }

    public final void onActivitySaveInstanceState(a aVar, v0 v0Var, long j10) throws RemoteException {
        Parcel Y = Y();
        h0.c(Y, aVar);
        h0.c(Y, v0Var);
        Y.writeLong(j10);
        E1(31, Y);
    }

    public final void onActivityStarted(a aVar, long j10) throws RemoteException {
        Parcel Y = Y();
        h0.c(Y, aVar);
        Y.writeLong(j10);
        E1(25, Y);
    }

    public final void onActivityStopped(a aVar, long j10) throws RemoteException {
        Parcel Y = Y();
        h0.c(Y, aVar);
        Y.writeLong(j10);
        E1(26, Y);
    }

    public final void performAction(Bundle bundle, v0 v0Var, long j10) throws RemoteException {
        Parcel Y = Y();
        h0.b(Y, bundle);
        h0.c(Y, v0Var);
        Y.writeLong(j10);
        E1(32, Y);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j10) throws RemoteException {
        Parcel Y = Y();
        h0.b(Y, bundle);
        Y.writeLong(j10);
        E1(8, Y);
    }

    public final void setConsent(Bundle bundle, long j10) throws RemoteException {
        Parcel Y = Y();
        h0.b(Y, bundle);
        Y.writeLong(j10);
        E1(44, Y);
    }

    public final void setCurrentScreen(a aVar, String str, String str2, long j10) throws RemoteException {
        Parcel Y = Y();
        h0.c(Y, aVar);
        Y.writeString(str);
        Y.writeString(str2);
        Y.writeLong(j10);
        E1(15, Y);
    }

    public final void setDataCollectionEnabled(boolean z10) throws RemoteException {
        Parcel Y = Y();
        ClassLoader classLoader = h0.f20231a;
        Y.writeInt(z10 ? 1 : 0);
        E1(39, Y);
    }

    public final void setUserProperty(String str, String str2, a aVar, boolean z10, long j10) throws RemoteException {
        Parcel Y = Y();
        Y.writeString(str);
        Y.writeString(str2);
        h0.c(Y, aVar);
        Y.writeInt(z10 ? 1 : 0);
        Y.writeLong(j10);
        E1(4, Y);
    }
}

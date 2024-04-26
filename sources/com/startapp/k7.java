package com.startapp;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import com.startapp.networkTest.results.BaseResult;
import com.startapp.networkTest.results.ConnectivityTestResult;
import com.startapp.networkTest.results.LatencyResult;
import com.startapp.networkTest.results.NetworkInformationResult;
import com.startapp.networkTest.startapp.ConnectivityTestListener;
import com.startapp.networkTest.startapp.CoverageMapperManager;
import java.util.Map;

/* compiled from: Sta */
public class k7 implements ConnectivityTestListener, CoverageMapperManager.OnNetworkInfoResultListener {
    public k7(Context context) {
    }

    public final void a(j4 j4Var, BaseResult baseResult) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Map<Activity, Integer> map = wb.f12765a;
            String encodeToString = Base64.encodeToString(wb.a(String.valueOf(k5.b(baseResult))), 11);
            if (encodeToString != null) {
                i4 i4Var = new i4(j4Var);
                i4Var.f10541h = Long.valueOf(currentTimeMillis);
                i4Var.f10538e = encodeToString;
                i4Var.a();
                return;
            }
            i4 i4Var2 = new i4(j4.f10588e);
            i4Var2.f10537d = "NTS, can not encode result";
            i4Var2.f10538e = baseResult.getClass().getName();
            i4Var2.a();
        } catch (Throwable th) {
            i4.a(th);
        }
    }

    public void onConnectivityTestFinished(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public void onConnectivityTestResult(ConnectivityTestResult connectivityTestResult) {
        if (connectivityTestResult != null) {
            a(j4.f10599p, connectivityTestResult);
        }
    }

    public void onLatencyTestResult(LatencyResult latencyResult) {
        if (latencyResult != null) {
            a(j4.f10600q, latencyResult);
        }
    }

    public void onNetworkInfoResult(NetworkInformationResult networkInformationResult) {
        if (networkInformationResult != null) {
            a(j4.f10601r, networkInformationResult);
        }
    }
}

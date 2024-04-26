package com.startapp.sdk.adsbase;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.startapp.a0;
import com.startapp.aa;
import com.startapp.i4;
import com.startapp.j0;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.common.Constants;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.wb;
import com.startapp.z9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Sta */
public class SimpleTokenUtils {

    /* renamed from: a  reason: collision with root package name */
    public static List<PackageInfo> f12112a = null;

    /* renamed from: b  reason: collision with root package name */
    public static List<PackageInfo> f12113b = null;

    /* renamed from: c  reason: collision with root package name */
    public static long f12114c = 0;

    /* renamed from: d  reason: collision with root package name */
    public static volatile Pair<TokenType, String> f12115d = null;

    /* renamed from: e  reason: collision with root package name */
    public static volatile Pair<TokenType, String> f12116e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f12117f = true;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f12118g = false;

    /* renamed from: h  reason: collision with root package name */
    public static TokenType f12119h = TokenType.UNDEFINED;

    /* compiled from: Sta */
    public enum TokenType {
        T1("token"),
        T2("token2"),
        UNDEFINED("");
        
        private final String text;

        /* access modifiers changed from: public */
        TokenType(String str) {
            this.text = str;
        }

        public static TokenType a(String str) {
            TokenType tokenType = T1;
            if (tokenType.text.equals(str)) {
                return tokenType;
            }
            TokenType tokenType2 = T2;
            if (tokenType2.text.equals(str)) {
                return tokenType2;
            }
            return UNDEFINED;
        }

        public String toString() {
            return this.text;
        }
    }

    /* compiled from: Sta */
    public class a extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            SimpleTokenUtils.f12115d = null;
            SimpleTokenUtils.f12116e = null;
            SimpleTokenUtils.f(context);
        }
    }

    /* compiled from: Sta */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f12125a;

        public c(Context context) {
            this.f12125a = context;
        }

        public void run() {
            SimpleTokenUtils.e(this.f12125a);
        }
    }

    public static Pair<String, String> a() {
        if (f12115d != null) {
            return new Pair<>(((TokenType) f12115d.first).toString(), f12115d.second);
        }
        return new Pair<>(TokenType.T1.toString(), "");
    }

    public static Pair<String, String> b() {
        if (f12116e != null) {
            return new Pair<>(((TokenType) f12116e.first).toString(), f12116e.second);
        }
        return new Pair<>(TokenType.T2.toString(), "");
    }

    public static long c() {
        return f12114c;
    }

    @SuppressLint({"VisibleForTests"})
    public static void d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Set<String> s10 = MetaData.f12393k.s();
        Set<String> C = MetaData.f12393k.C();
        f12112a = new CopyOnWriteArrayList();
        f12113b = new CopyOnWriteArrayList();
        try {
            List<PackageInfo> a10 = a0.a(packageManager);
            f12114c = System.currentTimeMillis();
            PackageInfo packageInfo = null;
            for (PackageInfo next : a10) {
                if (!a0.a(next)) {
                    long j10 = next.firstInstallTime;
                    if (j10 < f12114c && j10 >= 1291593600000L) {
                        f12114c = j10;
                    }
                    f12112a.add(next);
                    try {
                        String b10 = wb.b(context);
                        if (s10 != null && s10.contains(b10)) {
                            f12113b.add(next);
                        }
                    } catch (Throwable th) {
                        i4.a(th);
                    }
                } else if (C.contains(next.packageName)) {
                    f12112a.add(next);
                } else if (next.packageName.equals(Constants.f12448a)) {
                    packageInfo = next;
                }
            }
            f12112a = a(f12112a);
            f12113b = a(f12113b);
            if (packageInfo != null) {
                f12112a.add(0, packageInfo);
            }
        } catch (Throwable th2) {
            i4.a(th2);
        }
    }

    public static void e(Context context) {
        boolean a10 = MetaData.f12393k.I().a(context);
        synchronized (SimpleTokenUtils.class) {
            if ((f12115d == null || f12116e == null) && a10) {
                try {
                    d(context);
                    f12115d = new Pair<>(TokenType.T1, z9.a(b(f12112a)));
                    f12116e = new Pair<>(TokenType.T2, z9.a(b(f12113b)));
                } catch (Throwable th) {
                    i4.a(th);
                }
            }
        }
        return;
    }

    public static void f(Context context) {
        Context a10 = j0.a(context);
        if (a10 != null) {
            context = a10;
        }
        try {
            if ((f12115d == null || f12116e == null) && MetaData.f12393k.I().a(context)) {
                ComponentLocator.a(context).j().execute(new c(context));
            }
        } catch (Throwable th) {
            i4.a(th);
        }
    }

    public static void c(Context context) {
        Context a10 = j0.a(context);
        if (a10 != null) {
            context = a10;
        }
        f(context);
        f12117f = true;
        f12118g = false;
        f12119h = TokenType.UNDEFINED;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        context.registerReceiver(new a(), intentFilter);
        MetaData.f12393k.a((com.startapp.sdk.adsbase.remoteconfig.c) new b(context));
    }

    public static Pair<TokenType, String> a(Context context) {
        if (f12115d == null) {
            e(context);
        }
        e.a a10 = ComponentLocator.a(context).d().edit();
        String str = (String) f12115d.second;
        a10.a("shared_prefs_simple_token", str);
        a10.f12335a.putString("shared_prefs_simple_token", str);
        a10.apply();
        f12117f = false;
        f12119h = TokenType.UNDEFINED;
        return new Pair<>(TokenType.T1, f12115d.second);
    }

    public static Pair<TokenType, String> b(Context context) {
        if (f12116e == null) {
            e(context);
        }
        e.a a10 = ComponentLocator.a(context).d().edit();
        String str = (String) f12116e.second;
        a10.a("shared_prefs_simple_token2", str);
        a10.f12335a.putString("shared_prefs_simple_token2", str);
        a10.apply();
        f12117f = false;
        f12119h = TokenType.UNDEFINED;
        return new Pair<>(TokenType.T2, f12116e.second);
    }

    /* compiled from: Sta */
    public class b implements com.startapp.sdk.adsbase.remoteconfig.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f12124a;

        public b(Context context) {
            this.f12124a = context;
        }

        public void a(MetaDataRequest.RequestReason requestReason, boolean z10) {
            if (z10) {
                SimpleTokenUtils.f12115d = null;
                SimpleTokenUtils.f12116e = null;
                SimpleTokenUtils.f(this.f12124a);
            }
            MetaData.f12393k.a((com.startapp.sdk.adsbase.remoteconfig.c) this);
        }

        public void a(MetaDataRequest.RequestReason requestReason) {
            MetaData.f12393k.a((com.startapp.sdk.adsbase.remoteconfig.c) this);
        }
    }

    public static List<PackageInfo> a(List<PackageInfo> list) {
        if (list.size() <= 100) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new aa());
        return arrayList.subList(0, 100);
    }

    public static List<String> b(List<PackageInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (PackageInfo packageInfo : list) {
            arrayList.add(packageInfo.packageName);
        }
        return arrayList;
    }
}

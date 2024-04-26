package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import d0.a;
import e8.bb0;
import e8.g0;
import f7.i0;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import p.b;
import p.c;
import p.d;
import p.e;
import p.g;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class p implements bb0 {

    /* renamed from: a  reason: collision with root package name */
    public g f7789a;

    /* renamed from: b  reason: collision with root package name */
    public c f7790b;

    /* renamed from: c  reason: collision with root package name */
    public e f7791c;

    /* renamed from: d  reason: collision with root package name */
    public g0 f7792d;

    public static boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (!(queryIntentActivities == null || resolveActivity == null)) {
            for (int i10 = 0; i10 < queryIntentActivities.size(); i10++) {
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i10).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(androidx.appcompat.widget.p.t(context));
                }
            }
        }
        return false;
    }

    public final void a() {
        this.f7790b = null;
        this.f7789a = null;
        g0 g0Var = this.f7792d;
        if (g0Var != null) {
            g0Var.getClass();
        }
    }

    public final void b(c cVar) {
        g gVar;
        this.f7790b = cVar;
        cVar.getClass();
        try {
            cVar.f23735a.u5(0);
        } catch (RemoteException unused) {
        }
        g0 g0Var = this.f7792d;
        if (g0Var != null) {
            i0 i0Var = (i0) g0Var;
            p pVar = i0Var.f18290a;
            c cVar2 = pVar.f7790b;
            if (cVar2 == null) {
                pVar.f7789a = null;
            } else if (pVar.f7789a == null) {
                b bVar = new b(cVar2);
                try {
                    if (cVar2.f23735a.q4(bVar)) {
                        gVar = new g(cVar2.f23735a, bVar, cVar2.f23736b);
                        pVar.f7789a = gVar;
                    }
                } catch (RemoteException unused2) {
                }
                gVar = null;
                pVar.f7789a = gVar;
            }
            d a10 = new d.a(pVar.f7789a).a();
            Context context = i0Var.f18291b;
            a10.f23737a.setData(i0Var.f18292c);
            Intent intent = a10.f23737a;
            Object obj = a.f12940a;
            a.C0126a.b(context, intent, (Bundle) null);
            p pVar2 = i0Var.f18290a;
            Activity activity = (Activity) i0Var.f18291b;
            e eVar = pVar2.f7791c;
            if (eVar != null) {
                activity.unbindService(eVar);
                pVar2.f7790b = null;
                pVar2.f7789a = null;
                pVar2.f7791c = null;
            }
        }
    }
}

package ab;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import cb.h;
import com.google.firebase.a;
import com.google.firebase.messaging.b;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import r7.d;
import r7.r;
import r7.s;
import r7.v;
import s8.i;
import s8.l;
import sa.e;
import t.g;
import va.c;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class q {

    /* renamed from: a  reason: collision with root package name */
    public final a f234a;

    /* renamed from: b  reason: collision with root package name */
    public final b f235b;

    /* renamed from: c  reason: collision with root package name */
    public final d f236c;

    /* renamed from: d  reason: collision with root package name */
    public final ua.a<h> f237d;

    /* renamed from: e  reason: collision with root package name */
    public final ua.a<e> f238e;

    /* renamed from: f  reason: collision with root package name */
    public final c f239f;

    public q(a aVar, b bVar, ua.a<h> aVar2, ua.a<e> aVar3, c cVar) {
        aVar.a();
        d dVar = new d(aVar.f9662a);
        this.f234a = aVar;
        this.f235b = bVar;
        this.f236c = dVar;
        this.f237d = aVar2;
        this.f238e = aVar3;
        this.f239f = cVar;
    }

    public final i<String> a(i<Bundle> iVar) {
        return iVar.e(p.f233a, new cb.d(this));
    }

    public final i<Bundle> b(String str, String str2, String str3, Bundle bundle) {
        int i10;
        String str4;
        String str5;
        int i11;
        int i12;
        PackageInfo b10;
        int a10;
        PackageInfo c10;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        a aVar = this.f234a;
        aVar.a();
        bundle.putString("gmp_app_id", aVar.f9664c.f18333b);
        b bVar = this.f235b;
        synchronized (bVar) {
            if (bVar.f9719d == 0 && (c10 = bVar.c("com.google.android.gms")) != null) {
                bVar.f9719d = c10.versionCode;
            }
            i10 = bVar.f9719d;
        }
        bundle.putString("gmsv", Integer.toString(i10));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f235b.a());
        b bVar2 = this.f235b;
        synchronized (bVar2) {
            if (bVar2.f9718c == null) {
                bVar2.e();
            }
            str4 = bVar2.f9718c;
        }
        bundle.putString("app_ver_name", str4);
        a aVar2 = this.f234a;
        aVar2.a();
        try {
            str5 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(aVar2.f9663b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str5 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str5);
        boolean z10 = false;
        try {
            String a11 = ((com.google.firebase.installations.b) l.a(this.f239f.a(false))).a();
            if (!TextUtils.isEmpty(a11)) {
                bundle.putString("Goog-Firebase-Installations-Auth", a11);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e10);
        }
        bundle.putString("cliv", "fcm-22.0.0");
        e eVar = this.f238e.get();
        h hVar = this.f237d.get();
        if (!(eVar == null || hVar == null || (a10 = eVar.a("fire-iid")) == 1)) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(g.f(a10)));
            bundle.putString("Firebase-Client", hVar.a());
        }
        d dVar = this.f236c;
        r7.q qVar = dVar.f24692c;
        synchronized (qVar) {
            if (qVar.f24729b == 0 && (b10 = qVar.b("com.google.android.gms")) != null) {
                qVar.f24729b = b10.versionCode;
            }
            i11 = qVar.f24729b;
        }
        if (i11 >= 12000000) {
            r7.i a12 = r7.i.a(dVar.f24691b);
            synchronized (a12) {
                i12 = a12.f24709d;
                a12.f24709d = i12 + 1;
            }
            return a12.b(new r(i12, bundle)).e(v.f24734a, s.f24731a);
        }
        if (dVar.f24692c.a() != 0) {
            z10 = true;
        }
        if (!z10) {
            return l.d(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return dVar.b(bundle).f(v.f24734a, new t1.c(dVar, bundle));
    }
}

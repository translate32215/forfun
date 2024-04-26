package e8;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.o;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.ff;
import com.google.android.gms.internal.ads.l7;
import com.google.android.gms.internal.ads.ou;
import com.google.android.gms.internal.ads.p6;
import com.google.android.gms.internal.ads.qu;
import com.google.android.gms.internal.ads.su;
import d7.l;
import java.util.List;
import java.util.concurrent.Callable;
import l0.e;
import q.f;
import q.g;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class wy implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17416a = 18;

    /* renamed from: b  reason: collision with root package name */
    public final Object f17417b;

    public wy(p6 p6Var) {
        this.f17417b = p6Var;
    }

    private final Object a() {
        ou ouVar;
        String str;
        String str2;
        String str3;
        l lVar = l.B;
        p pVar = lVar.f13186c;
        su w10 = ((o) lVar.f13190g.f()).w();
        Bundle bundle = null;
        if (w10 != null && (!((o) l.B.f13190g.f()).x() || !((o) l.B.f13190g.f()).y())) {
            int i10 = 0;
            if (w10.f8153b) {
                synchronized (w10.f8154c) {
                    w10.f8153b = false;
                    w10.f8154c.notifyAll();
                    e.E("ContentFetchThread: wakeup");
                }
            }
            qu quVar = w10.f8155d;
            boolean z10 = w10.f8167x;
            synchronized (quVar.f7997a) {
                if (quVar.f7999c.size() == 0) {
                    e.E("Queue empty");
                    ouVar = null;
                } else if (quVar.f7999c.size() >= 2) {
                    int i11 = Integer.MIN_VALUE;
                    ouVar = null;
                    int i12 = 0;
                    for (ou next : quVar.f7999c) {
                        int i13 = next.f7749n;
                        if (i13 > i11) {
                            i10 = i12;
                            ouVar = next;
                            i11 = i13;
                        }
                        i12++;
                    }
                    quVar.f7999c.remove(i10);
                } else {
                    ouVar = quVar.f7999c.get(0);
                    if (z10) {
                        quVar.f7999c.remove(0);
                    } else {
                        synchronized (ouVar.f7742g) {
                            ouVar.f7749n -= 100;
                        }
                    }
                }
            }
            if (ouVar != null) {
                str3 = ouVar.f7750o;
                str2 = ouVar.f7751p;
                str = ouVar.f7752q;
                if (str3 != null) {
                    ((o) l.B.f13190g.f()).s(str3);
                }
                if (str != null) {
                    ((o) l.B.f13190g.f()).t(str);
                }
            } else {
                o oVar = (o) l.B.f13190g.f();
                oVar.B();
                synchronized (oVar.f5679a) {
                    str3 = oVar.f5687i;
                }
                str = ((o) l.B.f13190g.f()).z();
                str2 = null;
            }
            Bundle bundle2 = new Bundle(1);
            if (!((o) l.B.f13190g.f()).y()) {
                if (str == null || TextUtils.isEmpty(str)) {
                    bundle2.putString("v_fp_vertical", "no_hash");
                } else {
                    bundle2.putString("v_fp_vertical", str);
                }
            }
            if (str3 != null && !((o) l.B.f13190g.f()).x()) {
                bundle2.putString("fingerprint", str3);
                if (!str3.equals(str2)) {
                    bundle2.putString("v_fp", str2);
                }
            }
            if (!bundle2.isEmpty()) {
                bundle = bundle2;
            }
        }
        return new nw(bundle, 1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v52, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: org.json.JSONObject} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x04db  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x01b3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0141 A[Catch:{ Exception -> 0x0164 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x018d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r25 = this;
            r1 = r25
            int r0 = r1.f17416a
            r2 = -1
            r3 = 1
            r5 = 0
            r6 = 2
            r7 = 3
            switch(r0) {
                case 0: goto L_0x05f5;
                case 1: goto L_0x05ca;
                case 2: goto L_0x0593;
                case 3: goto L_0x058a;
                case 4: goto L_0x0536;
                case 5: goto L_0x0522;
                case 6: goto L_0x04e5;
                case 7: goto L_0x0468;
                case 8: goto L_0x03ab;
                case 9: goto L_0x03a6;
                case 10: goto L_0x030f;
                case 11: goto L_0x0301;
                case 12: goto L_0x026b;
                case 13: goto L_0x025d;
                case 14: goto L_0x0222;
                case 15: goto L_0x01ca;
                case 16: goto L_0x0087;
                case 17: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0610
        L_0x000e:
            java.lang.Object r0 = r1.f17417b
            e8.jy r0 = (e8.jy) r0
            android.content.Context r3 = r0.f15206b
            java.lang.String r4 = "phone"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3
            java.lang.String r7 = r3.getNetworkOperator()
            boolean r4 = z7.h.f()
            if (r4 == 0) goto L_0x003a
            e8.l<java.lang.Boolean> r4 = e8.t.G4
            e8.ti0 r6 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r6 = r6.f16769f
            java.lang.Object r4 = r6.a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x003a
            r9 = 0
            goto L_0x003f
        L_0x003a:
            int r4 = r3.getNetworkType()
            r9 = r4
        L_0x003f:
            int r10 = r3.getPhoneType()
            d7.l r3 = d7.l.B
            com.google.android.gms.ads.internal.util.p r3 = r3.f13186c
            android.content.Context r3 = r0.f15206b
            java.lang.String r4 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r3 = com.google.android.gms.ads.internal.util.p.G(r3, r4)
            if (r3 == 0) goto L_0x007c
            android.content.Context r0 = r0.f15206b
            java.lang.String r3 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r3 = r0.getActiveNetworkInfo()
            if (r3 == 0) goto L_0x0073
            int r2 = r3.getType()
            android.net.NetworkInfo$DetailedState r3 = r3.getDetailedState()
            int r3 = r3.ordinal()
            r24 = r3
            r3 = r2
            r2 = r24
            goto L_0x0074
        L_0x0073:
            r3 = -1
        L_0x0074:
            boolean r5 = r0.isActiveNetworkMetered()
            r12 = r2
            r8 = r3
            r11 = r5
            goto L_0x0080
        L_0x007c:
            r0 = -2
            r8 = -2
            r11 = 0
            r12 = -1
        L_0x0080:
            e8.hy r0 = new e8.hy
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r0
        L_0x0087:
            java.lang.Object r0 = r1.f17417b
            e8.gy r0 = (e8.gy) r0
            android.content.Context r2 = r0.f14833b
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.util.Locale r6 = java.util.Locale.getDefault()
            java.lang.String r7 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r7 = e8.gy.a(r2, r7)
            if (r7 == 0) goto L_0x009f
            r9 = 1
            goto L_0x00a0
        L_0x009f:
            r9 = 0
        L_0x00a0:
            java.lang.String r7 = "http://www.google.com"
            android.content.pm.ResolveInfo r7 = e8.gy.a(r2, r7)
            if (r7 == 0) goto L_0x00aa
            r10 = 1
            goto L_0x00ab
        L_0x00aa:
            r10 = 0
        L_0x00ab:
            java.lang.String r11 = r6.getCountry()
            java.lang.String r3 = android.os.Build.DEVICE
            java.lang.String r7 = "generic"
            boolean r12 = r3.startsWith(r7)
            android.content.Context r3 = r0.f14833b
            boolean r13 = z7.f.a(r3)
            android.content.Context r3 = r0.f14833b
            boolean r14 = z7.f.d(r3)
            java.lang.String r15 = r6.getLanguage()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 24
            if (r6 < r7) goto L_0x00eb
            android.os.LocaleList r6 = android.os.LocaleList.getDefault()
            r7 = 0
        L_0x00d7:
            int r8 = r6.size()
            if (r7 >= r8) goto L_0x00eb
            java.util.Locale r8 = r6.get(r7)
            java.lang.String r8 = r8.getLanguage()
            r3.add(r8)
            int r7 = r7 + 1
            goto L_0x00d7
        L_0x00eb:
            android.content.Context r6 = r0.f14833b
            java.lang.String r7 = "market://details?id=com.google.android.gms.ads"
            android.content.pm.ResolveInfo r7 = e8.gy.a(r2, r7)
            java.lang.String r8 = "."
            if (r7 != 0) goto L_0x00f8
            goto L_0x012a
        L_0x00f8:
            android.content.pm.ActivityInfo r7 = r7.activityInfo
            if (r7 != 0) goto L_0x00fd
            goto L_0x012a
        L_0x00fd:
            b8.b r6 = b8.c.a(r6)     // Catch:{ NameNotFoundException -> 0x012a }
            java.lang.String r4 = r7.packageName     // Catch:{ NameNotFoundException -> 0x012a }
            android.content.pm.PackageInfo r4 = r6.b(r4, r5)     // Catch:{ NameNotFoundException -> 0x012a }
            if (r4 == 0) goto L_0x012a
            int r4 = r4.versionCode     // Catch:{ NameNotFoundException -> 0x012a }
            java.lang.String r6 = r7.packageName     // Catch:{ NameNotFoundException -> 0x012a }
            java.lang.String r7 = java.lang.String.valueOf(r6)     // Catch:{ NameNotFoundException -> 0x012a }
            int r7 = r7.length()     // Catch:{ NameNotFoundException -> 0x012a }
            int r7 = r7 + 12
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x012a }
            r5.<init>(r7)     // Catch:{ NameNotFoundException -> 0x012a }
            r5.append(r4)     // Catch:{ NameNotFoundException -> 0x012a }
            r5.append(r8)     // Catch:{ NameNotFoundException -> 0x012a }
            r5.append(r6)     // Catch:{ NameNotFoundException -> 0x012a }
            java.lang.String r4 = r5.toString()     // Catch:{ NameNotFoundException -> 0x012a }
            goto L_0x012b
        L_0x012a:
            r4 = 0
        L_0x012b:
            android.content.Context r5 = r0.f14833b
            b8.b r5 = b8.c.a(r5)     // Catch:{ Exception -> 0x0164 }
            java.lang.String r6 = "com.android.vending"
            r7 = 128(0x80, float:1.794E-43)
            android.content.Context r5 = r5.f3657a     // Catch:{ Exception -> 0x0164 }
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ Exception -> 0x0164 }
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r6, r7)     // Catch:{ Exception -> 0x0164 }
            if (r5 == 0) goto L_0x0164
            int r6 = r5.versionCode     // Catch:{ Exception -> 0x0164 }
            java.lang.String r5 = r5.packageName     // Catch:{ Exception -> 0x0164 }
            java.lang.String r7 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0164 }
            int r7 = r7.length()     // Catch:{ Exception -> 0x0164 }
            int r7 = r7 + 12
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0164 }
            r1.<init>(r7)     // Catch:{ Exception -> 0x0164 }
            r1.append(r6)     // Catch:{ Exception -> 0x0164 }
            r1.append(r8)     // Catch:{ Exception -> 0x0164 }
            r1.append(r5)     // Catch:{ Exception -> 0x0164 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0164 }
            r18 = r1
            goto L_0x0166
        L_0x0164:
            r18 = 0
        L_0x0166:
            java.lang.String r19 = android.os.Build.FINGERPRINT
            android.content.Context r0 = r0.f14833b
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r5 = "http://www.example.com"
            android.net.Uri r5 = android.net.Uri.parse(r5)
            java.lang.String r6 = "android.intent.action.VIEW"
            r1.<init>(r6, r5)
            r5 = 0
            android.content.pm.ResolveInfo r6 = r2.resolveActivity(r1, r5)
            r5 = 65536(0x10000, float:9.18355E-41)
            java.util.List r1 = r2.queryIntentActivities(r1, r5)
            if (r1 == 0) goto L_0x01b3
            if (r6 == 0) goto L_0x01b3
            r2 = 0
        L_0x0187:
            int r5 = r1.size()
            if (r2 >= r5) goto L_0x01b3
            java.lang.Object r5 = r1.get(r2)
            android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
            android.content.pm.ActivityInfo r7 = r6.activityInfo
            java.lang.String r7 = r7.name
            android.content.pm.ActivityInfo r5 = r5.activityInfo
            java.lang.String r5 = r5.name
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x01b0
            android.content.pm.ActivityInfo r1 = r6.activityInfo
            java.lang.String r1 = r1.packageName
            java.lang.String r0 = androidx.appcompat.widget.p.t(r0)
            boolean r5 = r1.equals(r0)
            r20 = r5
            goto L_0x01b5
        L_0x01b0:
            int r2 = r2 + 1
            goto L_0x0187
        L_0x01b3:
            r20 = 0
        L_0x01b5:
            d7.l r0 = d7.l.B
            f7.m0 r0 = r0.f13188e
            long r22 = r0.r()
            com.google.android.gms.internal.ads.td r0 = new com.google.android.gms.internal.ads.td
            java.lang.String r21 = android.os.Build.MODEL
            r8 = r0
            r16 = r3
            r17 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r0
        L_0x01ca:
            java.lang.Object r0 = r1.f17417b
            e8.ow r0 = (e8.ow) r0
            e8.xx r10 = new e8.xx
            java.lang.Object r2 = r0.f15852b
            android.content.Context r2 = (android.content.Context) r2
            b8.b r2 = b8.c.a(r2)
            boolean r3 = r2.c()
            d7.l r2 = d7.l.B
            com.google.android.gms.ads.internal.util.p r2 = r2.f13186c
            java.lang.Object r2 = r0.f15852b
            android.content.Context r2 = (android.content.Context) r2
            boolean r4 = com.google.android.gms.ads.internal.util.p.m(r2)
            java.lang.Object r2 = r0.f15854d
            e8.f9 r2 = (e8.f9) r2
            java.lang.String r5 = r2.f14544a
            d7.l r2 = d7.l.B
            f7.m0 r2 = r2.f13188e
            boolean r6 = f7.m0.p()
            d7.l r2 = d7.l.B
            com.google.android.gms.ads.internal.util.p r2 = r2.f13186c
            java.lang.Object r2 = r0.f15852b
            android.content.Context r2 = (android.content.Context) r2
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            if (r2 != 0) goto L_0x0206
            r7 = 0
            goto L_0x0209
        L_0x0206:
            int r2 = r2.targetSdkVersion
            r7 = r2
        L_0x0209:
            java.lang.Object r2 = r0.f15852b
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r8 = "com.google.android.gms.ads.dynamite"
            int r9 = com.google.android.gms.dynamite.DynamiteModule.b(r2, r8)
            java.lang.Object r0 = r0.f15852b
            android.content.Context r0 = (android.content.Context) r0
            int r0 = com.google.android.gms.dynamite.DynamiteModule.a(r0, r8)
            r2 = r10
            r8 = r9
            r9 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r10
        L_0x0222:
            java.lang.Object r0 = r1.f17417b
            java.util.List r0 = (java.util.List) r0
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x022f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x024b
            java.lang.Object r3 = r0.next()
            e8.p50 r3 = (e8.p50) r3
            java.lang.Object r4 = r3.get()
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            if (r4 == 0) goto L_0x022f
            java.lang.Object r3 = r3.get()
            r2.put(r3)
            goto L_0x022f
        L_0x024b:
            int r0 = r2.length()
            if (r0 != 0) goto L_0x0253
            r4 = 0
            goto L_0x025c
        L_0x0253:
            e8.kw r4 = new e8.kw
            java.lang.String r0 = r2.toString()
            r4.<init>(r0, r7)
        L_0x025c:
            return r4
        L_0x025d:
            java.lang.Object r0 = r1.f17417b
            e8.zw r0 = (e8.zw) r0
            e8.nw r2 = new e8.nw
            java.lang.Object r0 = r0.f17800b
            android.os.Bundle r0 = (android.os.Bundle) r0
            r2.<init>((android.os.Bundle) r0, (int) r7)
            return r2
        L_0x026b:
            java.lang.Object r0 = r1.f17417b
            e8.ow r0 = (e8.ow) r0
            r0.getClass()
            e8.l<java.lang.Boolean> r2 = e8.t.F2
            e8.ti0 r4 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r4 = r4.f16769f
            java.lang.Object r4 = r4.a(r2)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x02fa
            java.lang.Object r4 = r0.f15854d
            java.util.Set r4 = (java.util.Set) r4
            java.lang.String r5 = "rewarded"
            boolean r5 = r4.contains(r5)
            if (r5 != 0) goto L_0x02ab
            java.lang.String r5 = "interstitial"
            boolean r5 = r4.contains(r5)
            if (r5 != 0) goto L_0x02ab
            java.lang.String r5 = "native"
            boolean r5 = r4.contains(r5)
            if (r5 != 0) goto L_0x02ab
            java.lang.String r5 = "banner"
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x02a9
            goto L_0x02ab
        L_0x02a9:
            r5 = 0
            goto L_0x02ac
        L_0x02ab:
            r5 = 1
        L_0x02ac:
            if (r5 == 0) goto L_0x02fa
            e8.kw r4 = new e8.kw
            d7.l r5 = d7.l.B
            com.google.android.gms.internal.ads.o4 r5 = r5.f13205v
            java.lang.Object r0 = r0.f15852b
            android.content.Context r0 = (android.content.Context) r0
            r5.getClass()
            e8.ti0 r6 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r6 = r6.f16769f
            java.lang.Object r2 = r6.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x02cc
            goto L_0x02f5
        L_0x02cc:
            r5.f(r0)     // Catch:{ RemoteException -> 0x02ef, NullPointerException -> 0x02ed }
            java.lang.String r0 = "a."
            com.google.android.gms.internal.ads.jf r2 = r5.f7668a     // Catch:{ RemoteException -> 0x02ef, NullPointerException -> 0x02ed }
            java.lang.String r2 = r2.p5()     // Catch:{ RemoteException -> 0x02ef, NullPointerException -> 0x02ed }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ RemoteException -> 0x02ef, NullPointerException -> 0x02ed }
            int r5 = r2.length()     // Catch:{ RemoteException -> 0x02ef, NullPointerException -> 0x02ed }
            if (r5 == 0) goto L_0x02e6
            java.lang.String r0 = r0.concat(r2)     // Catch:{ RemoteException -> 0x02ef, NullPointerException -> 0x02ed }
            goto L_0x02f6
        L_0x02e6:
            java.lang.String r2 = new java.lang.String     // Catch:{ RemoteException -> 0x02ef, NullPointerException -> 0x02ed }
            r2.<init>(r0)     // Catch:{ RemoteException -> 0x02ef, NullPointerException -> 0x02ed }
            r0 = r2
            goto L_0x02f6
        L_0x02ed:
            r0 = move-exception
            goto L_0x02f0
        L_0x02ef:
            r0 = move-exception
        L_0x02f0:
            java.lang.String r2 = "#007 Could not call remote method."
            l0.e.F(r2, r0)
        L_0x02f5:
            r0 = 0
        L_0x02f6:
            r4.<init>(r0, r3)
            goto L_0x0300
        L_0x02fa:
            e8.kw r4 = new e8.kw
            r2 = 0
            r4.<init>(r2, r3)
        L_0x0300:
            return r4
        L_0x0301:
            java.lang.Object r0 = r1.f17417b
            e8.ix r0 = (e8.ix) r0
            e8.hw r2 = new e8.hw
            java.lang.Object r0 = r0.f15077c
            com.google.android.gms.internal.ads.oe r0 = (com.google.android.gms.internal.ads.oe) r0
            r2.<init>((com.google.android.gms.internal.ads.oe) r0)
            return r2
        L_0x030f:
            java.lang.Object r0 = r1.f17417b
            e8.fx r0 = (e8.fx) r0
            r0.getClass()
            e8.l<java.lang.Boolean> r2 = e8.t.f16606k3
            e8.ti0 r4 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r4 = r4.f16769f
            java.lang.Object r2 = r4.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0346
            android.view.ViewGroup r2 = r0.f14691b
            if (r2 == 0) goto L_0x0346
            java.util.Set<java.lang.String> r2 = r0.f14693d
            java.lang.String r4 = "banner"
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L_0x0346
            e8.hw r2 = new e8.hw
            android.view.ViewGroup r0 = r0.f14691b
            boolean r0 = r0.isHardwareAccelerated()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.<init>((java.lang.Boolean) r0)
            goto L_0x03a5
        L_0x0346:
            e8.l<java.lang.Boolean> r2 = e8.t.f16612l3
            e8.ti0 r4 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r4 = r4.f16769f
            java.lang.Object r2 = r4.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x039f
            java.util.Set<java.lang.String> r2 = r0.f14693d
            java.lang.String r4 = "native"
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L_0x039f
            android.content.Context r0 = r0.f14692c
            boolean r2 = r0 instanceof android.app.Activity
            if (r2 == 0) goto L_0x039f
            e8.hw r2 = new e8.hw
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r4 = r0.getWindow()
            if (r4 == 0) goto L_0x0380
            android.view.WindowManager$LayoutParams r4 = r4.getAttributes()
            int r4 = r4.flags
            r5 = 16777216(0x1000000, float:2.3509887E-38)
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0380
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            goto L_0x039b
        L_0x0380:
            android.content.pm.PackageManager r4 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x039a }
            android.content.ComponentName r0 = r0.getComponentName()     // Catch:{ NameNotFoundException -> 0x039a }
            r5 = 0
            android.content.pm.ActivityInfo r0 = r4.getActivityInfo(r0, r5)     // Catch:{ NameNotFoundException -> 0x039a }
            int r0 = r0.flags     // Catch:{ NameNotFoundException -> 0x039a }
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0394
            goto L_0x0395
        L_0x0394:
            r3 = 0
        L_0x0395:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)     // Catch:{ NameNotFoundException -> 0x039a }
            goto L_0x039b
        L_0x039a:
            r4 = 0
        L_0x039b:
            r2.<init>((java.lang.Boolean) r4)
            goto L_0x03a5
        L_0x039f:
            e8.hw r2 = new e8.hw
            r3 = 0
            r2.<init>((java.lang.Boolean) r3)
        L_0x03a5:
            return r2
        L_0x03a6:
            java.lang.Object r0 = r25.a()
            return r0
        L_0x03ab:
            java.lang.Object r0 = r1.f17417b
            e8.zw r0 = (e8.zw) r0
            r0.getClass()
            e8.gw r2 = new e8.gw
            d7.l r4 = d7.l.B
            com.google.android.gms.ads.internal.util.p r4 = r4.f13186c
            java.lang.Object r4 = r0.f17800b
            android.content.Context r4 = (android.content.Context) r4
            e8.l<java.lang.Boolean> r5 = e8.t.f16648r3
            e8.ti0 r8 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r8 = r8.f16769f
            java.lang.Object r5 = r8.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            java.lang.String r8 = "mobileads_consent"
            java.lang.String r9 = ""
            if (r5 != 0) goto L_0x03d4
            r4 = r9
            goto L_0x03df
        L_0x03d4:
            r5 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r8, r5)
            java.lang.String r5 = "consent_string"
            java.lang.String r4 = r4.getString(r5, r9)
        L_0x03df:
            e8.l<java.lang.Boolean> r5 = e8.t.f16660t3
            e8.ti0 r10 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r10 = r10.f16769f
            java.lang.Object r5 = r10.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x03f2
            goto L_0x0401
        L_0x03f2:
            java.lang.Object r5 = r0.f17800b
            android.content.Context r5 = (android.content.Context) r5
            r10 = 0
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r8, r10)
            java.lang.String r8 = "fc_consent"
            java.lang.String r9 = r5.getString(r8, r9)
        L_0x0401:
            d7.l r5 = d7.l.B
            com.google.android.gms.ads.internal.util.p r5 = r5.f13186c
            java.lang.Object r0 = r0.f17800b
            android.content.Context r0 = (android.content.Context) r0
            e8.l<java.lang.Boolean> r5 = e8.t.f16654s3
            e8.ti0 r8 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r8 = r8.f16769f
            java.lang.Object r5 = r8.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x041e
            r5 = 0
        L_0x041c:
            r7 = 0
            goto L_0x0464
        L_0x041e:
            android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r0)
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r8 = "IABConsent_CMPPresent"
            boolean r10 = r0.contains(r8)
            if (r10 == 0) goto L_0x0438
            r10 = 0
            boolean r11 = r0.getBoolean(r8, r10)
            r5.putBoolean(r8, r11)
            goto L_0x0439
        L_0x0438:
            r10 = 0
        L_0x0439:
            r8 = 4
            java.lang.String[] r11 = new java.lang.String[r8]
            java.lang.String r12 = "IABConsent_SubjectToGDPR"
            r11[r10] = r12
            java.lang.String r10 = "IABConsent_ConsentString"
            r11[r3] = r10
            java.lang.String r3 = "IABConsent_ParsedPurposeConsents"
            r11[r6] = r3
            java.lang.String r3 = "IABConsent_ParsedVendorConsents"
            r11[r7] = r3
            r3 = 0
        L_0x044d:
            if (r3 >= r8) goto L_0x041c
            r6 = r11[r3]
            boolean r7 = r0.contains(r6)
            if (r7 == 0) goto L_0x0460
            r7 = 0
            java.lang.String r10 = r0.getString(r6, r7)
            r5.putString(r6, r10)
            goto L_0x0461
        L_0x0460:
            r7 = 0
        L_0x0461:
            int r3 = r3 + 1
            goto L_0x044d
        L_0x0464:
            r2.<init>(r4, r9, r5, r7)
            return r2
        L_0x0468:
            java.lang.Object r0 = r1.f17417b
            e8.fw r0 = (e8.fw) r0
            r0.getClass()
            e8.l<java.lang.Boolean> r2 = e8.t.T1
            e8.ti0 r3 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r3 = r3.f16769f
            java.lang.Object r3 = r3.a(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x0482
            goto L_0x04d9
        L_0x0482:
            java.lang.Object r3 = r0.f14687c
            e8.yp r3 = (e8.yp) r3
            java.lang.Object r4 = r0.f14688d
            e8.w00 r4 = (e8.w00) r4
            java.lang.String r4 = r4.f17192f
            java.lang.Object r0 = r0.f14689e
            java.lang.String r0 = (java.lang.String) r0
            r3.getClass()
            e8.ti0 r5 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r5 = r5.f16769f
            java.lang.Object r2 = r5.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x04a4
            goto L_0x04d6
        L_0x04a4:
            if (r4 == 0) goto L_0x04d6
            if (r0 != 0) goto L_0x04a9
            goto L_0x04d6
        L_0x04a9:
            boolean r2 = r3.f17647c
            if (r2 != 0) goto L_0x04b0
            r3.a()
        L_0x04b0:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, org.json.JSONObject>> r2 = r3.f17645a
            java.lang.Object r2 = r2.get(r0)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 != 0) goto L_0x04bb
            goto L_0x04d6
        L_0x04bb:
            java.lang.Object r5 = r2.get(r4)
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            if (r5 == 0) goto L_0x04c5
            r2 = r5
            goto L_0x04d7
        L_0x04c5:
            org.json.JSONObject r3 = r3.f17648d
            java.lang.String r0 = l0.e.u(r3, r4, r0)
            if (r0 != 0) goto L_0x04ce
            goto L_0x04d6
        L_0x04ce:
            java.lang.Object r0 = r2.get(r0)
            r2 = r0
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            goto L_0x04d7
        L_0x04d6:
            r2 = 0
        L_0x04d7:
            if (r2 != 0) goto L_0x04db
        L_0x04d9:
            r4 = 0
            goto L_0x04e4
        L_0x04db:
            com.google.android.gms.internal.ads.rd r4 = new com.google.android.gms.internal.ads.rd
            java.lang.String r0 = r2.toString()
            r4.<init>(r0)
        L_0x04e4:
            return r4
        L_0x04e5:
            java.lang.Object r0 = r1.f17417b
            e8.tw r0 = (e8.tw) r0
            android.content.Context r0 = r0.f16816c
            java.lang.String r2 = "audio"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            int r9 = r0.getMode()
            boolean r10 = r0.isMusicActive()
            boolean r11 = r0.isSpeakerphoneOn()
            int r12 = r0.getStreamVolume(r7)
            int r13 = r0.getRingerMode()
            int r14 = r0.getStreamVolume(r6)
            d7.l r0 = d7.l.B
            f7.d r0 = r0.f13191h
            float r15 = r0.b()
            d7.l r0 = d7.l.B
            f7.d r0 = r0.f13191h
            boolean r16 = r0.c()
            e8.sw r0 = new e8.sw
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
        L_0x0522:
            java.lang.Object r0 = r1.f17417b
            e8.ow r0 = (e8.ow) r0
            e8.pw r2 = new e8.pw
            java.lang.Object r3 = r0.f15852b
            e8.w00 r3 = (e8.w00) r3
            e8.pi0 r3 = r3.f17196j
            java.lang.Object r0 = r0.f15854d
            e8.f9 r0 = (e8.f9) r0
            r2.<init>((e8.pi0) r3, (e8.f9) r0)
            return r2
        L_0x0536:
            java.lang.Object r0 = r1.f17417b
            e8.fw r0 = (e8.fw) r0
            e8.gw r3 = new e8.gw
            java.lang.Object r4 = r0.f14687c
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r5 = r0.f14688d
            e8.w00 r5 = (e8.w00) r5
            e8.li0 r5 = r5.f17191e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.Object r0 = r0.f14689e
            android.view.View r0 = (android.view.View) r0
        L_0x054f:
            if (r0 == 0) goto L_0x0586
            android.view.ViewParent r7 = r0.getParent()
            if (r7 == 0) goto L_0x0586
            boolean r8 = r7 instanceof android.view.ViewGroup
            if (r8 == 0) goto L_0x0563
            r8 = r7
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            int r0 = r8.indexOfChild(r0)
            goto L_0x0564
        L_0x0563:
            r0 = -1
        L_0x0564:
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            java.lang.Class r9 = r7.getClass()
            java.lang.String r9 = r9.getName()
            java.lang.String r10 = "type"
            r8.putString(r10, r9)
            java.lang.String r9 = "index_of_child"
            r8.putInt(r9, r0)
            r6.add(r8)
            boolean r0 = r7 instanceof android.view.View
            if (r0 == 0) goto L_0x0586
            r0 = r7
            android.view.View r0 = (android.view.View) r0
            goto L_0x054f
        L_0x0586:
            r3.<init>(r4, r5, r6)
            return r3
        L_0x058a:
            java.lang.Object r0 = r1.f17417b
            e8.us r0 = (e8.us) r0
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()
            return r0
        L_0x0593:
            java.lang.Object r0 = r1.f17417b
            com.google.android.gms.internal.ads.l7 r0 = (com.google.android.gms.internal.ads.l7) r0
            r0.getClass()
            d7.l r2 = d7.l.B
            com.google.android.gms.internal.ads.gv r2 = r2.f13192i
            e8.kh0 r0 = r0.f7336k
            java.lang.Object r3 = r2.f6705b
            monitor-enter(r3)
            com.google.android.gms.internal.ads.jv r4 = r2.f6708e     // Catch:{ all -> 0x05c7 }
            r5 = -2
            if (r4 != 0) goto L_0x05ab
            monitor-exit(r3)     // Catch:{ all -> 0x05c7 }
            goto L_0x05c2
        L_0x05ab:
            e8.lh0 r4 = r2.f6706c     // Catch:{ all -> 0x05c7 }
            boolean r4 = r4.E()     // Catch:{ all -> 0x05c7 }
            if (r4 == 0) goto L_0x05c1
            com.google.android.gms.internal.ads.jv r2 = r2.f6708e     // Catch:{ RemoteException -> 0x05bb }
            long r5 = r2.F4(r0)     // Catch:{ RemoteException -> 0x05bb }
            monitor-exit(r3)     // Catch:{ all -> 0x05c7 }
            goto L_0x05c2
        L_0x05bb:
            r0 = move-exception
            java.lang.String r2 = "Unable to call into cache service."
            l0.e.C(r2, r0)     // Catch:{ all -> 0x05c7 }
        L_0x05c1:
            monitor-exit(r3)     // Catch:{ all -> 0x05c7 }
        L_0x05c2:
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            return r0
        L_0x05c7:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x05c7 }
            throw r0
        L_0x05ca:
            java.lang.Object r0 = r1.f17417b
            com.google.android.gms.internal.ads.p6 r0 = (com.google.android.gms.internal.ads.p6) r0
            java.lang.String r2 = "getAppInstanceId"
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.internal.ads.y7> r3 = r0.f7819j
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.internal.ads.y7> r4 = r0.f7819j     // Catch:{ all -> 0x05f2 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.ads.y7 r4 = (com.google.android.gms.internal.ads.y7) r4     // Catch:{ all -> 0x05f2 }
            if (r4 == 0) goto L_0x05ef
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.internal.ads.y7> r4 = r0.f7819j     // Catch:{ Exception -> 0x05eb }
            java.lang.Object r4 = r4.get()     // Catch:{ Exception -> 0x05eb }
            com.google.android.gms.internal.ads.y7 r4 = (com.google.android.gms.internal.ads.y7) r4     // Catch:{ Exception -> 0x05eb }
            java.lang.String r4 = r4.I3()     // Catch:{ Exception -> 0x05eb }
            monitor-exit(r3)     // Catch:{ all -> 0x05f2 }
            goto L_0x05f1
        L_0x05eb:
            r4 = 0
            r0.m(r2, r4)     // Catch:{ all -> 0x05f2 }
        L_0x05ef:
            monitor-exit(r3)     // Catch:{ all -> 0x05f2 }
            r4 = 0
        L_0x05f1:
            return r4
        L_0x05f2:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x05f2 }
            throw r0
        L_0x05f5:
            java.lang.Object r0 = r1.f17417b
            e8.ow r0 = (e8.ow) r0
            e8.ww r2 = new e8.ww
            java.lang.Object r3 = r0.f15852b
            e8.j r3 = (e8.j) r3
            java.lang.Object r0 = r0.f15854d
            java.util.List r0 = (java.util.List) r0
            r3.getClass()
            if (r0 != 0) goto L_0x060c
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x060c:
            r2.<init>((java.util.List) r0)
            return r2
        L_0x0610:
            java.lang.Object r0 = r1.f17417b
            com.google.android.gms.internal.ads.ff r0 = (com.google.android.gms.internal.ads.ff) r0
            r0.run()
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.wy.call():java.lang.Object");
    }

    public wy(l7 l7Var) {
        this.f17417b = l7Var;
    }

    public wy(ff ffVar) {
        this.f17417b = ffVar;
    }

    public wy(us usVar) {
        this.f17417b = usVar;
    }

    public wy(fw fwVar) {
        this.f17417b = fwVar;
    }

    public wy(fw fwVar, q.e eVar) {
        this.f17417b = fwVar;
    }

    public wy(ow owVar) {
        this.f17417b = owVar;
    }

    public wy(ow owVar, q.e eVar) {
        this.f17417b = owVar;
    }

    public wy(ow owVar, f fVar) {
        this.f17417b = owVar;
    }

    public wy(ow owVar, g gVar) {
        this.f17417b = owVar;
    }

    public wy(tw twVar) {
        this.f17417b = twVar;
    }

    public wy(zw zwVar) {
        this.f17417b = zwVar;
    }

    public wy(zw zwVar, q.e eVar) {
        this.f17417b = zwVar;
    }

    public wy(bx bxVar) {
        this.f17417b = bxVar;
    }

    public wy(fx fxVar) {
        this.f17417b = fxVar;
    }

    public wy(ix ixVar) {
        this.f17417b = ixVar;
    }

    public wy(gy gyVar) {
        this.f17417b = gyVar;
    }

    public wy(jy jyVar) {
        this.f17417b = jyVar;
    }

    public wy(List list) {
        this.f17417b = list;
    }
}

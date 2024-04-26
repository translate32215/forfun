package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.leanback.widget.t;
import b8.c;
import cb.d;
import com.google.android.gms.common.internal.i;
import e8.b60;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import javax.security.auth.x500.X500Principal;
import k8.ra;
import k8.v0;
import o8.b;
import o8.c4;
import o8.e4;
import o8.f4;
import o8.g4;
import o8.p;
import o8.s4;
import o8.u5;
import o8.v2;
import o8.x4;
import o8.z5;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import s7.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class r extends c4 {

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f8873g = {"firebase_", "google_", "ga_"};

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f8874h = {"_err"};

    /* renamed from: c  reason: collision with root package name */
    public SecureRandom f8875c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicLong f8876d = new AtomicLong(0);

    /* renamed from: e  reason: collision with root package name */
    public int f8877e;

    /* renamed from: f  reason: collision with root package name */
    public Integer f8878f = null;

    static {
        Pattern.compile("^([^\\s@]+)@([^\\s@]+\\.[^\\s@]+)$");
        Pattern.compile("^(gmail|googlemail)\\.");
        Pattern.compile("[\\s-()/.]+");
        Pattern.compile("^\\+\\d{11,15}$");
        Pattern.compile("[0-9`~!@#$%^&*()_\\-+=:;<>,.?|/\\\\\\[\\]]+");
        Pattern.compile("\\s+");
    }

    public r(l lVar) {
        super(lVar);
    }

    public static boolean U(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean V(String str) {
        i.e(str);
        if (str.charAt(0) != '_' || str.equals("_ep")) {
            return true;
        }
        return false;
    }

    public static boolean W(Context context) {
        ActivityInfo receiverInfo;
        if (context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) {
                    return false;
                }
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public static boolean X(Context context) {
        if (context == null) {
            throw new NullPointerException("null reference");
        } else if (Build.VERSION.SDK_INT >= 24) {
            return f0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        } else {
            return f0(context, "com.google.android.gms.measurement.AppMeasurementService");
        }
    }

    public static boolean Y(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    public static final boolean b0(Bundle bundle, int i10) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i10);
        return true;
    }

    public static boolean e0(String str, String[] strArr) {
        for (String Y : strArr) {
            if (Y(str, Y)) {
                return true;
            }
        }
        return false;
    }

    public static boolean f0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static long m0(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            int i10 = 0;
            i.j(length > 0);
            int i11 = length - 1;
            long j10 = 0;
            while (i11 >= 0 && i11 >= bArr.length - 8) {
                j10 += (((long) bArr[i11]) & 255) << i10;
                i10 += 8;
                i11--;
            }
            return j10;
        }
        throw new NullPointerException("null reference");
    }

    public static MessageDigest r(String str) {
        int i10 = 0;
        while (i10 < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i10++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static ArrayList<Bundle> t(List<b> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (b next : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", next.f23109a);
            bundle.putString("origin", next.f23110b);
            bundle.putLong("creation_timestamp", next.f23112d);
            bundle.putString("name", next.f23111c.f23562b);
            u.b.h(bundle, next.f23111c.i());
            bundle.putBoolean("active", next.f23113e);
            String str = next.f23114f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            o8.r rVar = next.f23115g;
            if (rVar != null) {
                bundle.putString("timed_out_event_name", rVar.f23414a);
                p pVar = next.f23115g.f23415b;
                if (pVar != null) {
                    bundle.putBundle("timed_out_event_params", pVar.i());
                }
            }
            bundle.putLong("trigger_timeout", next.f23116h);
            o8.r rVar2 = next.f23117i;
            if (rVar2 != null) {
                bundle.putString("triggered_event_name", rVar2.f23414a);
                p pVar2 = next.f23117i.f23415b;
                if (pVar2 != null) {
                    bundle.putBundle("triggered_event_params", pVar2.i());
                }
            }
            bundle.putLong("triggered_timestamp", next.f23111c.f23563c);
            bundle.putLong("time_to_live", next.f23118r);
            o8.r rVar3 = next.f23119s;
            if (rVar3 != null) {
                bundle.putString("expired_event_name", rVar3.f23414a);
                p pVar3 = next.f23119s.f23415b;
                if (pVar3 != null) {
                    bundle.putBundle("expired_event_params", pVar3.i());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void w(x4 x4Var, Bundle bundle, boolean z10) {
        if (!(bundle == null || x4Var == null)) {
            if (!bundle.containsKey("_sc") || z10) {
                String str = x4Var.f23601a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = x4Var.f23602b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", x4Var.f23603c);
                return;
            }
            z10 = false;
        }
        if (bundle != null && x4Var == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public final void A(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                this.f8864a.d().f8802k.c("Not putting event parameter. Invalid value type. name, type", this.f8864a.f8849m.e(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    public final void B(v0 v0Var, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            v0Var.o0(bundle);
        } catch (RemoteException e10) {
            this.f8864a.d().f8800i.b("Error returning boolean value to wrapper", e10);
        }
    }

    public final void C(v0 v0Var, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            v0Var.o0(bundle);
        } catch (RemoteException e10) {
            this.f8864a.d().f8800i.b("Error returning bundle list to wrapper", e10);
        }
    }

    public final void D(v0 v0Var, Bundle bundle) {
        try {
            v0Var.o0(bundle);
        } catch (RemoteException e10) {
            this.f8864a.d().f8800i.b("Error returning bundle value to wrapper", e10);
        }
    }

    public final void E(v0 v0Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            v0Var.o0(bundle);
        } catch (RemoteException e10) {
            this.f8864a.d().f8800i.b("Error returning byte array to wrapper", e10);
        }
    }

    public final void F(v0 v0Var, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            v0Var.o0(bundle);
        } catch (RemoteException e10) {
            this.f8864a.d().f8800i.b("Error returning int value to wrapper", e10);
        }
    }

    public final void G(v0 v0Var, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            v0Var.o0(bundle);
        } catch (RemoteException e10) {
            this.f8864a.d().f8800i.b("Error returning long value to wrapper", e10);
        }
    }

    public final void H(v0 v0Var, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            v0Var.o0(bundle);
        } catch (RemoteException e10) {
            this.f8864a.d().f8800i.b("Error returning string value to wrapper", e10);
        }
    }

    public final void I(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z10) {
        int i10;
        String str4;
        int i11;
        String str5 = str2;
        Bundle bundle2 = bundle;
        List<String> list2 = list;
        if (bundle2 != null) {
            this.f8864a.getClass();
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i12 = 0;
            while (it.hasNext()) {
                String str6 = (String) it.next();
                if (list2 == null || !list2.contains(str6)) {
                    i10 = !z10 ? j0(str6) : 0;
                    if (i10 == 0) {
                        i10 = i0(str6);
                    }
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    v(bundle2, i10, str6, i10 == 3 ? str6 : null);
                    bundle2.remove(str6);
                } else {
                    if (S(bundle2.get(str6))) {
                        this.f8864a.d().f8802k.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str5, str3, str6);
                        i11 = 22;
                        str4 = str6;
                    } else {
                        String str7 = str3;
                        str4 = str6;
                        i11 = N(str, str2, str6, bundle2.get(str6), bundle, list, z10, false);
                    }
                    if (i11 != 0 && !"_ev".equals(str4)) {
                        v(bundle2, i11, str4, bundle2.get(str4));
                        bundle2.remove(str4);
                    } else if (V(str4) && !e0(str4, f4.f23204d) && (i12 = i12 + 1) > 0) {
                        this.f8864a.d().f8799h.c("Item cannot contain custom parameters", this.f8864a.f8849m.d(str5), this.f8864a.f8849m.b(bundle2));
                        b0(bundle2, 23);
                        bundle2.remove(str4);
                    }
                }
            }
        }
    }

    public final boolean J(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            ra.b();
            if (this.f8864a.f8843g.v((String) null, v2.f23506d0) && !TextUtils.isEmpty(str3)) {
                return true;
            }
            if (TextUtils.isEmpty(str2)) {
                if (this.f8864a.h()) {
                    this.f8864a.d().f8799h.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                return false;
            } else if (str2 == null) {
                throw new NullPointerException("null reference");
            } else if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            } else {
                this.f8864a.d().f8799h.b("Invalid admob_app_id. Analytics disabled.", h.t(str2));
                return false;
            }
        } else if (str == null) {
            throw new NullPointerException("null reference");
        } else if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
            return true;
        } else {
            if (this.f8864a.h()) {
                this.f8864a.d().f8799h.b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", h.t(str));
            }
            return false;
        }
    }

    public final boolean K(String str, int i10, String str2) {
        if (str2 == null) {
            this.f8864a.d().f8799h.b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        } else {
            this.f8864a.d().f8799h.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
            return false;
        }
    }

    public final boolean L(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f8864a.d().f8799h.b("Name is required and can't be null. Type", str);
            return false;
        }
        String[] strArr3 = f8873g;
        for (int i10 = 0; i10 < 3; i10++) {
            if (str2.startsWith(strArr3[i10])) {
                this.f8864a.d().f8799h.c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !e0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && e0(str2, strArr2)) {
            return true;
        }
        this.f8864a.d().f8799h.c("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final boolean M(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i10) {
                this.f8864a.d().f8802k.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00da A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int N(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Object r18, android.os.Bundle r19, java.util.List<java.lang.String> r20, boolean r21, boolean r22) {
        /*
            r14 = this;
            r7 = r14
            r8 = r17
            r0 = r18
            r1 = r19
            r14.h()
            boolean r2 = r14.S(r0)
            r3 = 0
            java.lang.String r4 = "param"
            if (r2 == 0) goto L_0x00ab
            if (r22 == 0) goto L_0x00a8
            java.lang.String[] r2 = o8.f4.f23203c
            boolean r2 = e0(r8, r2)
            if (r2 != 0) goto L_0x0020
            r0 = 20
            return r0
        L_0x0020:
            com.google.android.gms.measurement.internal.l r2 = r7.f8864a
            com.google.android.gms.measurement.internal.p r2 = r2.y()
            r2.h()
            r2.i()
            boolean r5 = r2.p()
            if (r5 != 0) goto L_0x0033
            goto L_0x0045
        L_0x0033:
            com.google.android.gms.measurement.internal.l r2 = r2.f8864a
            com.google.android.gms.measurement.internal.r r2 = r2.A()
            int r2 = r2.l0()
            r5 = 200900(0x310c4, float:2.81521E-40)
            if (r2 >= r5) goto L_0x0045
            r0 = 25
            return r0
        L_0x0045:
            com.google.android.gms.measurement.internal.l r2 = r7.f8864a
            r2.getClass()
            boolean r2 = r0 instanceof android.os.Parcelable[]
            if (r2 == 0) goto L_0x0053
            r5 = r0
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r5 = r5.length
            goto L_0x005e
        L_0x0053:
            boolean r5 = r0 instanceof java.util.ArrayList
            if (r5 == 0) goto L_0x00ab
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
        L_0x005e:
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 <= r6) goto L_0x00ab
            com.google.android.gms.measurement.internal.l r9 = r7.f8864a
            com.google.android.gms.measurement.internal.h r9 = r9.d()
            o8.a3 r9 = r9.f8802k
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r10 = "Parameter array is too long; discarded. Value kind, name, array length"
            r9.d(r10, r4, r8, r5)
            com.google.android.gms.measurement.internal.l r5 = r7.f8864a
            r5.getClass()
            if (r2 == 0) goto L_0x008a
            r2 = r0
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            int r5 = r2.length
            if (r5 <= r6) goto L_0x00a3
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r6)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x00a3
        L_0x008a:
            boolean r2 = r0 instanceof java.util.ArrayList
            if (r2 == 0) goto L_0x00a3
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r5 = r2.size()
            if (r5 <= r6) goto L_0x00a3
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.List r2 = r2.subList(r3, r6)
            r5.<init>(r2)
            r1.putParcelableArrayList(r8, r5)
        L_0x00a3:
            r1 = 17
            r9 = 17
            goto L_0x00ac
        L_0x00a8:
            r0 = 21
            return r0
        L_0x00ab:
            r9 = 0
        L_0x00ac:
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            o8.f r1 = r1.f8843g
            o8.u2<java.lang.Boolean> r2 = o8.v2.S
            r10 = r15
            boolean r1 = r1.v(r15, r2)
            if (r1 == 0) goto L_0x00bf
            boolean r1 = U(r16)
            if (r1 != 0) goto L_0x00c5
        L_0x00bf:
            boolean r1 = U(r17)
            if (r1 == 0) goto L_0x00cd
        L_0x00c5:
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            r1.getClass()
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x00d4
        L_0x00cd:
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            r1.getClass()
            r1 = 100
        L_0x00d4:
            boolean r1 = r14.M(r4, r8, r1, r0)
            if (r1 == 0) goto L_0x00db
            return r9
        L_0x00db:
            if (r22 == 0) goto L_0x016a
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00f3
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.I(r1, r2, r3, r4, r5, r6)
            goto L_0x0169
        L_0x00f3:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x0129
            r11 = r0
            android.os.Parcelable[] r11 = (android.os.Parcelable[]) r11
            int r12 = r11.length
            r13 = 0
        L_0x00fc:
            if (r13 >= r12) goto L_0x0169
            r0 = r11[r13]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x0116
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            com.google.android.gms.measurement.internal.h r1 = r1.d()
            o8.a3 r1 = r1.f8802k
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            r1.c(r2, r0, r8)
            goto L_0x016a
        L_0x0116:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.I(r1, r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            goto L_0x00fc
        L_0x0129:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x016a
            r11 = r0
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            int r12 = r11.size()
            r13 = 0
        L_0x0135:
            if (r13 >= r12) goto L_0x0169
            java.lang.Object r0 = r11.get(r13)
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x0156
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            com.google.android.gms.measurement.internal.h r1 = r1.d()
            o8.a3 r1 = r1.f8802k
            if (r0 == 0) goto L_0x014e
            java.lang.Class r0 = r0.getClass()
            goto L_0x0150
        L_0x014e:
            java.lang.String r0 = "null"
        L_0x0150:
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            r1.c(r2, r0, r8)
            goto L_0x016a
        L_0x0156:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.I(r1, r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            goto L_0x0135
        L_0x0169:
            return r9
        L_0x016a:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.r.N(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final boolean O(String str, String str2) {
        if (str2 == null) {
            this.f8864a.d().f8799h.b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f8864a.d().f8799h.b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt == 95) {
                    codePointAt = 95;
                } else {
                    this.f8864a.d().f8799h.c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.f8864a.d().f8799h.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    public final boolean P(String str, String str2) {
        if (str2 == null) {
            this.f8864a.d().f8799h.b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f8864a.d().f8799h.b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                this.f8864a.d().f8799h.c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.f8864a.d().f8799h.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    public final boolean Q(String str) {
        h();
        if (c.a(this.f8864a.f8837a).f3657a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        this.f8864a.d().f8804m.b("Permission not granted", str);
        return false;
    }

    public final boolean R(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String j10 = this.f8864a.f8843g.j("debug.firebase.analytics.app", "");
        this.f8864a.getClass();
        return j10.equals(str);
    }

    public final boolean S(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public final boolean T(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = c.a(context).f3657a.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e10) {
            this.f8864a.d().f8797f.b("Error obtaining certificate", e10);
            return true;
        } catch (PackageManager.NameNotFoundException e11) {
            this.f8864a.d().f8797f.b("Package name not found", e11);
            return true;
        }
    }

    public final boolean Z(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (isEmpty || isEmpty2) {
            if (isEmpty && isEmpty2) {
                return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
            }
            if (isEmpty) {
                return TextUtils.isEmpty(str3) || !str3.equals(str4);
            }
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        } else if (str != null) {
            return !str.equals(str2);
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public final byte[] a0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public final int c0(String str) {
        if ("_ldl".equals(str)) {
            this.f8864a.getClass();
            return 2048;
        } else if ("_id".equals(str)) {
            this.f8864a.getClass();
            return 256;
        } else if (!this.f8864a.f8843g.v((String) null, v2.f23502b0) || !"_lgclid".equals(str)) {
            this.f8864a.getClass();
            return 36;
        } else {
            this.f8864a.getClass();
            return 100;
        }
    }

    public final Object d0(int i10, Object obj, boolean z10, boolean z11) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0 : 1);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return q(String.valueOf(obj), i10, z10);
            }
            if (!z11 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (parcelable instanceof Bundle) {
                    Bundle q02 = q0((Bundle) parcelable);
                    if (!q02.isEmpty()) {
                        arrayList.add(q02);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    public final int g0(String str, Object obj) {
        boolean z10;
        if ("_ldl".equals(str)) {
            z10 = M("user property referrer", str, c0(str), obj);
        } else {
            z10 = M("user property", str, c0(str), obj);
        }
        return z10 ? 0 : 7;
    }

    public final int h0(String str) {
        if (!O("event", str)) {
            return 2;
        }
        if (!L("event", e4.f23176a, e4.f23177b, str)) {
            return 13;
        }
        this.f8864a.getClass();
        if (!K("event", 40, str)) {
            return 2;
        }
        return 0;
    }

    public final void i() {
        h();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.f8864a.d().f8800i.a("Utils falling back to Random for random id");
            }
        }
        this.f8876d.set(nextLong);
    }

    public final int i0(String str) {
        if (!O("event param", str)) {
            return 3;
        }
        if (!L("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        this.f8864a.getClass();
        if (!K("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    public final boolean j() {
        return true;
    }

    public final int j0(String str) {
        if (!P("event param", str)) {
            return 3;
        }
        if (!L("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        this.f8864a.getClass();
        if (!K("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    public final int k0(String str) {
        if (!O("user property", str)) {
            return 6;
        }
        if (!L("user property", g4.f23219a, (String[]) null, str)) {
            return 15;
        }
        this.f8864a.getClass();
        if (!K("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    @EnsuresNonNull({"this.apkVersion"})
    public final int l0() {
        if (this.f8878f == null) {
            this.f8878f = Integer.valueOf(e.f25013b.a(this.f8864a.f8837a) / 1000);
        }
        return this.f8878f.intValue();
    }

    public final long n0() {
        long andIncrement;
        long j10;
        if (this.f8876d.get() == 0) {
            synchronized (this.f8876d) {
                long nextLong = new Random(System.nanoTime() ^ this.f8864a.f8850n.b()).nextLong();
                int i10 = this.f8877e + 1;
                this.f8877e = i10;
                j10 = nextLong + ((long) i10);
            }
            return j10;
        }
        synchronized (this.f8876d) {
            this.f8876d.compareAndSet(-1, 1);
            andIncrement = this.f8876d.getAndIncrement();
        }
        return andIncrement;
    }

    public final Object o(String str, Object obj) {
        int i10 = 256;
        if ("_ev".equals(str)) {
            this.f8864a.getClass();
            return d0(256, obj, true, true);
        }
        if (U(str)) {
            this.f8864a.getClass();
        } else {
            this.f8864a.getClass();
            i10 = 100;
        }
        return d0(i10, obj, false, true);
    }

    public final long o0(long j10, long j11) {
        return ((j11 * 60000) + j10) / 86400000;
    }

    public final Object p(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return d0(c0(str), obj, true, false);
        }
        return d0(c0(str), obj, false, false);
    }

    public final Bundle p0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str4 = uri.getQueryParameter("utm_campaign");
                    str3 = uri.getQueryParameter("utm_source");
                    str2 = uri.getQueryParameter("utm_medium");
                    str = uri.getQueryParameter("gclid");
                } else {
                    str4 = null;
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("campaign", str4);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("source", str3);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("medium", str2);
                }
                if (!TextUtils.isEmpty(str)) {
                    bundle.putString("gclid", str);
                }
                String queryParameter = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("term", queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("content", queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("aclid", queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("cp1", queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                return bundle;
            } catch (UnsupportedOperationException e10) {
                this.f8864a.d().f8800i.b("Install referrer url isn't a hierarchical URI", e10);
            }
        }
        return null;
    }

    public final String q(String str, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (z10) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i10))).concat("...");
        }
        return null;
    }

    public final Bundle q0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object o10 = o(str, bundle.get(str));
                if (o10 == null) {
                    this.f8864a.d().f8802k.b("Param value can't be null", this.f8864a.f8849m.e(str));
                } else {
                    A(bundle2, str, o10);
                }
            }
        }
        return bundle2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle r0(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, java.util.List<java.lang.String> r23, boolean r24) {
        /*
            r19 = this;
            r9 = r19
            r10 = r21
            r11 = r22
            r12 = r23
            java.lang.String[] r0 = o8.e4.f23179d
            boolean r13 = e0(r10, r0)
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>(r11)
            com.google.android.gms.measurement.internal.l r0 = r9.f8864a
            o8.f r0 = r0.f8843g
            int r15 = r0.m()
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r22.keySet()
            r0.<init>(r1)
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
            r18 = 0
        L_0x002c:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00e8
            java.lang.Object r0 = r16.next()
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            if (r12 == 0) goto L_0x0044
            boolean r0 = r12.contains(r8)
            if (r0 != 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r0 = 0
            goto L_0x0052
        L_0x0044:
            if (r24 != 0) goto L_0x004b
            int r0 = r9.j0(r8)
            goto L_0x004c
        L_0x004b:
            r0 = 0
        L_0x004c:
            if (r0 != 0) goto L_0x0052
            int r0 = r9.i0(r8)
        L_0x0052:
            if (r0 == 0) goto L_0x0062
            r1 = 3
            if (r0 != r1) goto L_0x0059
            r1 = r8
            goto L_0x005a
        L_0x0059:
            r1 = 0
        L_0x005a:
            r9.v(r14, r0, r8, r1)
            r14.remove(r8)
            goto L_0x00e4
        L_0x0062:
            java.lang.Object r4 = r11.get(r8)
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r8
            r5 = r14
            r6 = r23
            r7 = r24
            r12 = r8
            r8 = r13
            int r0 = r0.N(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 17
            if (r0 != r1) goto L_0x0082
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.v(r14, r1, r12, r0)
            goto L_0x009e
        L_0x0082:
            if (r0 == 0) goto L_0x009e
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r12)
            if (r1 != 0) goto L_0x009e
            r1 = 21
            if (r0 != r1) goto L_0x0092
            r8 = r10
            goto L_0x0093
        L_0x0092:
            r8 = r12
        L_0x0093:
            java.lang.Object r1 = r11.get(r12)
            r9.v(r14, r0, r8, r1)
            r14.remove(r12)
            goto L_0x00e4
        L_0x009e:
            boolean r0 = V(r12)
            if (r0 == 0) goto L_0x00e4
            int r0 = r18 + 1
            if (r0 <= r15) goto L_0x00e2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 48
            r1.<init>(r2)
            java.lang.String r2 = "Event can't contain more than "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " params"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.measurement.internal.l r2 = r9.f8864a
            com.google.android.gms.measurement.internal.h r2 = r2.d()
            o8.a3 r2 = r2.f8799h
            com.google.android.gms.measurement.internal.l r3 = r9.f8864a
            o8.x2 r3 = r3.f8849m
            java.lang.String r3 = r3.d(r10)
            com.google.android.gms.measurement.internal.l r4 = r9.f8864a
            o8.x2 r4 = r4.f8849m
            java.lang.String r4 = r4.b(r11)
            r2.c(r1, r3, r4)
            r1 = 5
            b0(r14, r1)
            r14.remove(r12)
        L_0x00e2:
            r18 = r0
        L_0x00e4:
            r12 = r23
            goto L_0x002c
        L_0x00e8:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.r.r0(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    @EnsuresNonNull({"this.secureRandom"})
    public final SecureRandom s() {
        h();
        if (this.f8875c == null) {
            this.f8875c = new SecureRandom();
        }
        return this.f8875c;
    }

    public final o8.r s0(String str, String str2, Bundle bundle, String str3, long j10, boolean z10, boolean z11) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (h0(str2) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putString("_o", str3);
            Bundle r02 = r0(str, str2, bundle3, Collections.singletonList("_o"), true);
            if (z10) {
                r02 = q0(r02);
            }
            i.h(r02);
            return new o8.r(str2, new p(r02), str3, j10);
        }
        this.f8864a.d().f8797f.b("Invalid conditional property event name", this.f8864a.f8849m.f(str2));
        throw new IllegalArgumentException();
    }

    public final void u(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            this.f8864a.d().f8800i.b("Params already contained engagement", Long.valueOf(j11));
        }
        bundle.putLong("_et", j10 + j11);
    }

    public final void v(Bundle bundle, int i10, String str, Object obj) {
        if (b0(bundle, i10)) {
            this.f8864a.getClass();
            bundle.putString("_ev", q(str, 40, true));
            if (obj == null) {
                return;
            }
            if ((obj instanceof String) || (obj instanceof CharSequence)) {
                bundle.putLong("_el", (long) String.valueOf(obj).length());
            }
        }
    }

    public final void x(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    this.f8864a.A().A(bundle, str, bundle2.get(str));
                }
            }
        }
    }

    public final void y(t tVar, int i10) {
        Iterator it = new TreeSet(((Bundle) tVar.f2528e).keySet()).iterator();
        int i11 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (V(str) && (i11 = i11 + 1) > i10) {
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("Event can't contain more than ");
                sb2.append(i10);
                sb2.append(" params");
                this.f8864a.d().f8799h.c(sb2.toString(), this.f8864a.f8849m.d((String) tVar.f2526c), this.f8864a.f8849m.b((Bundle) tVar.f2528e));
                b0((Bundle) tVar.f2528e, 5);
                ((Bundle) tVar.f2528e).remove(str);
            }
        }
    }

    public final void z(z5 z5Var, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        b0(bundle, i10);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", (long) i11);
        }
        d dVar = (d) z5Var;
        switch (dVar.f4373a) {
            case 13:
                if (TextUtils.isEmpty(str)) {
                    ((s4) dVar.f4374b).m("auto", "_err", bundle);
                    return;
                }
                ((s4) dVar.f4374b).getClass();
                l.j();
                throw null;
            default:
                if (TextUtils.isEmpty(str)) {
                    l lVar = ((u5) dVar.f4374b).f23481l;
                    if (lVar != null) {
                        lVar.d().f8797f.b("AppId not known when logging event", "_err");
                        return;
                    }
                    return;
                }
                ((u5) dVar.f4374b).b().r(new b60(dVar, str, bundle));
                return;
        }
    }
}

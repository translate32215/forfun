package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.gms.internal.ads.js;
import com.google.android.gms.internal.ads.k9;
import com.google.android.gms.internal.ads.mf;
import com.google.android.gms.internal.ads.of;
import d7.l;
import e8.g4;
import e8.ti0;
import e8.y30;
import e8.y8;
import ie.s;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k0.b;
import k0.c;
import k8.b5;
import k8.c5;
import k8.d5;
import kd.g;
import kotlin.Pair;
import l0.e;
import org.json.JSONObject;
import ud.k;
import v6.e0;

/* compiled from: AppCompatHintHelper */
public class p {

    /* renamed from: a  reason: collision with root package name */
    public static String f1053a;

    public static void a(String str) {
        if (e0.f26436a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static final Bundle b(Pair<String, ? extends Object>... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (g gVar : pairArr) {
            String str = (String) gVar.f20614a;
            B b10 = gVar.f20615b;
            if (b10 == null) {
                bundle.putString(str, (String) null);
            } else if (b10 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) b10).booleanValue());
            } else if (b10 instanceof Byte) {
                bundle.putByte(str, ((Number) b10).byteValue());
            } else if (b10 instanceof Character) {
                bundle.putChar(str, ((Character) b10).charValue());
            } else if (b10 instanceof Double) {
                bundle.putDouble(str, ((Number) b10).doubleValue());
            } else if (b10 instanceof Float) {
                bundle.putFloat(str, ((Number) b10).floatValue());
            } else if (b10 instanceof Integer) {
                bundle.putInt(str, ((Number) b10).intValue());
            } else if (b10 instanceof Long) {
                bundle.putLong(str, ((Number) b10).longValue());
            } else if (b10 instanceof Short) {
                bundle.putShort(str, ((Number) b10).shortValue());
            } else if (b10 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) b10);
            } else if (b10 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) b10);
            } else if (b10 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) b10);
            } else if (b10 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) b10);
            } else if (b10 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) b10);
            } else if (b10 instanceof char[]) {
                bundle.putCharArray(str, (char[]) b10);
            } else if (b10 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) b10);
            } else if (b10 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) b10);
            } else if (b10 instanceof int[]) {
                bundle.putIntArray(str, (int[]) b10);
            } else if (b10 instanceof long[]) {
                bundle.putLongArray(str, (long[]) b10);
            } else if (b10 instanceof short[]) {
                bundle.putShortArray(str, (short[]) b10);
            } else if (b10 instanceof Object[]) {
                Class<?> componentType = b10.getClass().getComponentType();
                k.c(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) b10);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) b10);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) b10);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) b10);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                }
            } else if (b10 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) b10);
            } else {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 18 && (b10 instanceof IBinder)) {
                    b.a(bundle, str, (IBinder) b10);
                } else if (i10 >= 21 && (b10 instanceof Size)) {
                    c.a(bundle, str, (Size) b10);
                } else if (i10 < 21 || !(b10 instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + b10.getClass().getCanonicalName() + " for key \"" + str + '\"');
                } else {
                    c.b(bundle, str, (SizeF) b10);
                }
            }
        }
        return bundle;
    }

    public static <T> T c(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static <T> T d(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static float e(float f10, float f11, float f12, float f13) {
        return (float) Math.hypot((double) (f12 - f10), (double) (f13 - f11));
    }

    public static void f() {
        if (e0.f26436a >= 18) {
            Trace.endSection();
        }
    }

    public static float g(float f10, float f11, float f12) {
        return (f12 * f11) + ((1.0f - f12) * f10);
    }

    public static InputConnection h(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (parent instanceof o1) {
                    editorInfo.hintText = ((o1) parent).a();
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        return inputConnection;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long i(java.lang.String r23, long r24, long r26, long r28) {
        /*
            r0 = r23
            r1 = r26
            r3 = r28
            java.lang.String r5 = j(r23)
            if (r5 != 0) goto L_0x0010
            r5 = r24
            goto L_0x00b3
        L_0x0010:
            java.lang.String r6 = "<this>"
            ud.k.f(r5, r6)
            ud.k.f(r5, r6)
            r6 = 10
            ce.a.a(r6)
            int r7 = r5.length()
            r8 = 0
            r9 = 1
            if (r7 != 0) goto L_0x0026
            goto L_0x0084
        L_0x0026:
            char r10 = r5.charAt(r8)
            r11 = 48
            if (r10 >= r11) goto L_0x0030
            r11 = -1
            goto L_0x0035
        L_0x0030:
            if (r10 != r11) goto L_0x0034
            r11 = 0
            goto L_0x0035
        L_0x0034:
            r11 = 1
        L_0x0035:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r11 >= 0) goto L_0x004e
            if (r7 != r9) goto L_0x003f
            goto L_0x0084
        L_0x003f:
            r11 = 45
            if (r10 != r11) goto L_0x0047
            r12 = -9223372036854775808
            r10 = 1
            goto L_0x004c
        L_0x0047:
            r11 = 43
            if (r10 != r11) goto L_0x0084
            r10 = 0
        L_0x004c:
            r11 = 1
            goto L_0x0050
        L_0x004e:
            r10 = 0
            r11 = 0
        L_0x0050:
            r14 = 0
            r16 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r18 = r16
        L_0x0059:
            if (r11 >= r7) goto L_0x008e
            char r8 = r5.charAt(r11)
            int r8 = java.lang.Character.digit(r8, r6)
            if (r8 >= 0) goto L_0x0066
            goto L_0x0084
        L_0x0066:
            int r20 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r20 >= 0) goto L_0x0078
            int r20 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r20 != 0) goto L_0x0084
            r20 = r10
            long r9 = (long) r6
            long r18 = r12 / r9
            int r9 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r9 >= 0) goto L_0x007a
            goto L_0x0084
        L_0x0078:
            r20 = r10
        L_0x007a:
            long r9 = (long) r6
            long r14 = r14 * r9
            long r8 = (long) r8
            long r21 = r12 + r8
            int r10 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r10 >= 0) goto L_0x0086
        L_0x0084:
            r6 = 0
            goto L_0x009c
        L_0x0086:
            long r14 = r14 - r8
            int r11 = r11 + 1
            r10 = r20
            r8 = 0
            r9 = 1
            goto L_0x0059
        L_0x008e:
            r20 = r10
            if (r20 == 0) goto L_0x0097
            java.lang.Long r6 = java.lang.Long.valueOf(r14)
            goto L_0x009c
        L_0x0097:
            long r6 = -r14
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
        L_0x009c:
            r7 = 39
            java.lang.String r8 = "System property '"
            if (r6 == 0) goto L_0x00e8
            long r5 = r6.longValue()
            int r9 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r9 > 0) goto L_0x00b0
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x00b0
            r9 = 1
            goto L_0x00b1
        L_0x00b0:
            r9 = 0
        L_0x00b1:
            if (r9 == 0) goto L_0x00b4
        L_0x00b3:
            return r5
        L_0x00b4:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r8)
            r10.append(r0)
            java.lang.String r0 = "' should be in range "
            r10.append(r0)
            r10.append(r1)
            java.lang.String r0 = ".."
            r10.append(r0)
            r10.append(r3)
            java.lang.String r0 = ", but is '"
            r10.append(r0)
            r10.append(r5)
            r10.append(r7)
            java.lang.String r0 = r10.toString()
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L_0x00e8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            r2.append(r0)
            java.lang.String r0 = "' has unrecognized value '"
            r2.append(r0)
            r2.append(r5)
            r2.append(r7)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            goto L_0x010d
        L_0x010c:
            throw r1
        L_0x010d:
            goto L_0x010c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.p.i(java.lang.String, long, long, long):long");
    }

    public static final String j(String str) {
        int i10 = s.f19397a;
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static final boolean k(String str, boolean z10) {
        String j10 = j(str);
        return j10 == null ? z10 : Boolean.parseBoolean(j10);
    }

    public static int l(String str, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return (int) i(str, (long) i10, (long) i11, (long) i12);
    }

    public static /* synthetic */ long m(String str, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j11 = 1;
        }
        long j13 = j11;
        if ((i10 & 8) != 0) {
            j12 = Long.MAX_VALUE;
        }
        return i(str, j10, j13, j12);
    }

    public static int n(int i10) {
        int[] iArr = {1, 2, 3};
        int i11 = 0;
        while (i11 < 3) {
            int i12 = iArr[i11];
            int i13 = i12 - 1;
            if (i12 == 0) {
                throw null;
            } else if (i13 == i10) {
                return i12;
            } else {
                i11++;
            }
        }
        return 1;
    }

    public static y30 o(Context context, js jsVar, String str, String str2, String str3, mf mfVar) {
        y30 y30;
        of ofVar = new of(context, jsVar, str, str2, mfVar);
        try {
            y30 = ofVar.f7690e.poll(50000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            ofVar.c(2009, ofVar.f7693h, e10);
            y30 = null;
        }
        ofVar.c(3004, ofVar.f7693h, (Exception) null);
        if (y30 != null) {
            if (y30.f17575c == 7) {
                mf.f7485d = k9.c.DISABLED;
            } else {
                mf.f7485d = k9.c.ENABLED;
            }
        }
        return y30 == null ? of.b() : y30;
    }

    public static <T> b5<T> p(b5<T> b5Var) {
        if ((b5Var instanceof d5) || (b5Var instanceof c5)) {
            return b5Var;
        }
        if (b5Var instanceof Serializable) {
            return new c5(b5Var);
        }
        return new d5(b5Var);
    }

    public static void q(int i10, Throwable th, String str) {
        StringBuilder sb2 = new StringBuilder(31);
        sb2.append("Ad failed to load : ");
        sb2.append(i10);
        e.J(sb2.toString());
        e.v(str, th);
        if (i10 != 3) {
            l.B.f13190g.c(th, str);
        }
    }

    public static void r(g4 g4Var, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(o.a(str2, o.a(str, 3)));
        sb2.append(str);
        sb2.append("(");
        sb2.append(str2);
        sb2.append(");");
        g4Var.a(sb2.toString());
    }

    public static void s(g4 g4Var, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb2.append(str);
        sb2.append("'");
        sb2.append(",");
        sb2.append(jSONObject2);
        sb2.append(");");
        String valueOf = String.valueOf(sb2.toString());
        e.E(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        g4Var.a(sb2.toString());
    }

    public static String t(Context context) {
        String str = f1053a;
        if (str != null) {
            return str;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        boolean z10 = false;
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        String str2 = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo next : queryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction("android.support.customtabs.action.CustomTabsService");
            intent2.setPackage(next.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(next.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            f1053a = null;
        } else if (arrayList.size() == 1) {
            f1053a = (String) arrayList.get(0);
        } else {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    List<ResolveInfo> queryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 64);
                    if (queryIntentActivities2 != null) {
                        if (queryIntentActivities2.size() != 0) {
                            Iterator<ResolveInfo> it = queryIntentActivities2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    ResolveInfo next2 = it.next();
                                    IntentFilter intentFilter = next2.filter;
                                    if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && next2.activityInfo != null) {
                                        z10 = true;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                } catch (RuntimeException unused) {
                    Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
                }
                if (!z10 && arrayList.contains(str2)) {
                    f1053a = str2;
                }
            }
            if (arrayList.contains("com.android.chrome")) {
                f1053a = "com.android.chrome";
            } else if (arrayList.contains("com.chrome.beta")) {
                f1053a = "com.chrome.beta";
            } else if (arrayList.contains("com.chrome.dev")) {
                f1053a = "com.chrome.dev";
            } else if (arrayList.contains("com.google.android.apps.chrome")) {
                f1053a = "com.google.android.apps.chrome";
            }
        }
        return f1053a;
    }

    public static void u(Context context, boolean z10) {
        if (z10) {
            e.J("This request is sent from a test device.");
            return;
        }
        y8 y8Var = ti0.f16763j.f16764a;
        String d10 = y8.d(context);
        StringBuilder sb2 = new StringBuilder(o.a(d10, 101));
        sb2.append("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
        sb2.append(d10);
        sb2.append("\") to get test ads on this device.");
        e.J(sb2.toString());
    }
}

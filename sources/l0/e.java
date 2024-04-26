package l0;

import android.graphics.Color;
import android.media.MediaFormat;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.o;
import com.google.android.gms.internal.ads.a5;
import com.google.android.gms.internal.ads.qg;
import com.google.android.gms.internal.ads.we;
import com.google.android.gms.internal.ads.y6;
import de.n;
import e8.br;
import e8.ii;
import e8.ot;
import e8.qt;
import e8.t;
import e8.ti0;
import e8.v0;
import e8.zh0;
import f7.p;
import j.f;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import k8.i;
import kd.h;
import md.d;
import n2.g;
import org.json.JSONArray;
import org.json.JSONObject;
import td.l;
import ud.k;
import v6.e0;

/* compiled from: CalleeHandler */
public class e {
    public static void A(String str, Throwable th) {
        if (h(3)) {
            Log.d("Ads", str, th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0097 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static k8.o B(k8.e r9, n2.g r10, java.util.List<k8.o> r11, boolean r12) {
        /*
            java.lang.String r0 = "reduce"
            r1 = 1
            x.f.o(r0, r1, r11)
            r2 = 2
            x.f.p(r0, r2, r11)
            r0 = 0
            java.lang.Object r3 = r11.get(r0)
            k8.o r3 = (k8.o) r3
            k8.o r3 = r10.y(r3)
            boolean r4 = r3 instanceof k8.i
            if (r4 == 0) goto L_0x00a0
            int r4 = r11.size()
            if (r4 != r2) goto L_0x0036
            java.lang.Object r11 = r11.get(r1)
            k8.o r11 = (k8.o) r11
            k8.o r11 = r10.y(r11)
            boolean r4 = r11 instanceof k8.g
            if (r4 != 0) goto L_0x002e
            goto L_0x003d
        L_0x002e:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Failed to parse initial value"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            int r11 = r9.x()
            if (r11 == 0) goto L_0x0098
            r11 = 0
        L_0x003d:
            k8.i r3 = (k8.i) r3
            int r4 = r9.x()
            if (r12 == 0) goto L_0x0047
            r5 = 0
            goto L_0x0049
        L_0x0047:
            int r5 = r4 + -1
        L_0x0049:
            r6 = -1
            if (r12 == 0) goto L_0x004e
            int r4 = r4 + r6
            goto L_0x004f
        L_0x004e:
            r4 = 0
        L_0x004f:
            if (r1 == r12) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r6 = 1
        L_0x0053:
            if (r11 != 0) goto L_0x005a
            k8.o r11 = r9.y(r5)
            goto L_0x0095
        L_0x005a:
            int r12 = r4 - r5
            int r12 = r12 * r6
            if (r12 < 0) goto L_0x0097
            boolean r12 = r9.E(r5)
            if (r12 == 0) goto L_0x0095
            r12 = 4
            k8.o[] r12 = new k8.o[r12]
            r12[r0] = r11
            k8.o r11 = r9.y(r5)
            r12[r1] = r11
            k8.h r11 = new k8.h
            double r7 = (double) r5
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            r11.<init>(r7)
            r12[r2] = r11
            r11 = 3
            r12[r11] = r9
            java.util.List r11 = java.util.Arrays.asList(r12)
            k8.o r11 = r3.b(r10, r11)
            boolean r12 = r11 instanceof k8.g
            if (r12 != 0) goto L_0x008d
            goto L_0x0095
        L_0x008d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Reduce operation failed"
            r9.<init>(r10)
            throw r9
        L_0x0095:
            int r5 = r5 + r6
            goto L_0x005a
        L_0x0097:
            return r11
        L_0x0098:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Empty array with no initial value error"
            r9.<init>(r10)
            throw r9
        L_0x00a0:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Callback should be a method"
            r9.<init>(r10)
            goto L_0x00a9
        L_0x00a8:
            throw r9
        L_0x00a9:
            goto L_0x00a8
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.e.B(k8.e, n2.g, java.util.List, boolean):k8.o");
    }

    public static void C(String str, Throwable th) {
        if (h(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static void D(String str, Throwable th) {
        if (h(5)) {
            Log.w("Ads", str, th);
        }
    }

    public static void E(String str) {
        if (h(3)) {
            Log.d("Ads", str);
        }
    }

    public static void F(String str, Throwable th) {
        if (!h(5)) {
            return;
        }
        if (th != null) {
            D(L(str), th);
        } else {
            K(L(str));
        }
    }

    public static boolean G(File file) {
        boolean z10;
        if (!file.exists()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            z10 = true;
            for (int i10 = 0; i10 < length; i10++) {
                File file2 = listFiles[i10];
                z10 = file2 != null && G(file2) && z10;
            }
        } else {
            z10 = true;
        }
        if (!file.delete() || !z10) {
            return false;
        }
        return true;
    }

    public static void H(String str) {
        if (O()) {
            Log.v("Ads", str);
        }
    }

    public static void I(String str) {
        if (h(6)) {
            Log.e("Ads", str);
        }
    }

    public static void J(String str) {
        if (h(4)) {
            Log.i("Ads", str);
        }
    }

    public static void K(String str) {
        if (h(5)) {
            Log.w("Ads", str);
        }
    }

    public static String L(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb2 = new StringBuilder(o.a(str, 13));
        sb2.append(str);
        sb2.append(" @");
        sb2.append(lineNumber);
        return sb2.toString();
    }

    public static long M(byte[] bArr, int i10) {
        return ((long) (((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16))) & 4294967295L;
    }

    public static zh0 N(Throwable th) {
        if (th instanceof ot) {
            ot otVar = (ot) th;
            return o(otVar.f14050a, otVar.f15842b);
        } else if (th instanceof br) {
            if (th.getMessage() == null) {
                return p(((br) th).f14050a, (String) null, (zh0) null);
            }
            return p(((br) th).f14050a, th.getMessage(), (zh0) null);
        } else if (!(th instanceof p)) {
            return p(we.INTERNAL_ERROR, (String) null, (zh0) null);
        } else {
            p pVar = (p) th;
            return new zh0(pVar.f18308a, qg.b(pVar.getMessage()), "com.google.android.gms.ads", (zh0) null, (IBinder) null);
        }
    }

    public static boolean O() {
        return h(2) && ((Boolean) v0.f17011a.b()).booleanValue();
    }

    public static final Object a(Throwable th) {
        k.f(th, "exception");
        return new h.a(th);
    }

    public static String b(String str) {
        return "." + str + ",." + str + " *";
    }

    public static void c(String str, String str2, Object obj) {
        Log.d(f(str), String.format(str2, new Object[]{obj}));
    }

    public static void d(String str, String str2, Object... objArr) {
        Log.d(f(str), String.format(str2, objArr));
    }

    public static void e(String str, String str2, Throwable th) {
        Log.e(f(str), str2, th);
    }

    public static String f(String str) {
        return f.a("TransportRuntime.", str);
    }

    public static void g(String str, String str2) {
        Log.i(f(str), str2);
    }

    public static boolean h(int i10) {
        return i10 >= 5 || Log.isLoggable("Ads", i10);
    }

    public static void i(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static final <T> Object j(Object obj, d<? super T> dVar) {
        return obj instanceof n ? a(((n) obj).f13313a) : obj;
    }

    public static void k(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer(d0.a("csd-", i10), ByteBuffer.wrap(list.get(i10)));
        }
    }

    public static final void l(Object obj) {
        if (obj instanceof h.a) {
            throw ((h.a) obj).f20616a;
        }
    }

    public static String m(int i10) {
        double alpha = (double) Color.alpha(i10);
        Double.isNaN(alpha);
        return e0.n("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Double.valueOf(alpha / 255.0d));
    }

    public static final <T> Object n(Object obj, l<? super Throwable, kd.o> lVar) {
        Throwable a10 = h.a(obj);
        if (a10 != null) {
            return new n(a10, false, 2);
        }
        if (lVar != null) {
            return new de.o(obj, lVar);
        }
        return obj;
    }

    public static zh0 o(we weVar, zh0 zh0) {
        if (weVar.equals(we.MEDIATION_SHOW_ERROR)) {
            if (((Integer) ti0.f16763j.f16769f.a(t.f16691y4)).intValue() > 0) {
                return zh0;
            }
        }
        return p(weVar, (String) null, zh0);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        r2 = "No fill.";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static e8.zh0 p(com.google.android.gms.internal.ads.we r6, java.lang.String r7, e8.zh0 r8) {
        /*
            if (r7 != 0) goto L_0x0043
            int[] r7 = e8.f10.f14526a
            int r0 = r6.ordinal()
            r7 = r7[r0]
            java.lang.String r0 = "No fill."
            switch(r7) {
                case 1: goto L_0x0041;
                case 2: goto L_0x003e;
                case 3: goto L_0x003b;
                case 4: goto L_0x0038;
                case 5: goto L_0x0036;
                case 6: goto L_0x0033;
                case 7: goto L_0x0030;
                case 8: goto L_0x002d;
                case 9: goto L_0x002a;
                case 10: goto L_0x0027;
                case 11: goto L_0x000f;
                case 12: goto L_0x0012;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.String r7 = "Internal error."
            goto L_0x0043
        L_0x0012:
            e8.l<java.lang.Integer> r7 = e8.t.C4
            e8.ti0 r1 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r1 = r1.f16769f
            java.lang.Object r7 = r1.a(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 > 0) goto L_0x0036
            java.lang.String r7 = "The mediation adapter did not return an ad."
            goto L_0x0043
        L_0x0027:
            java.lang.String r7 = "The ad can not be shown when app is not in foreground."
            goto L_0x0043
        L_0x002a:
            java.lang.String r7 = "The ad has already been shown."
            goto L_0x0043
        L_0x002d:
            java.lang.String r7 = "The ad is not ready."
            goto L_0x0043
        L_0x0030:
            java.lang.String r7 = "A mediation adapter failed to show the ad."
            goto L_0x0043
        L_0x0033:
            java.lang.String r7 = "App ID missing."
            goto L_0x0043
        L_0x0036:
            r2 = r0
            goto L_0x0044
        L_0x0038:
            java.lang.String r7 = "Network error."
            goto L_0x0043
        L_0x003b:
            java.lang.String r7 = "Invalid request: Invalid ad size."
            goto L_0x0043
        L_0x003e:
            java.lang.String r7 = "Invalid request: Invalid ad unit ID."
            goto L_0x0043
        L_0x0041:
            java.lang.String r7 = "Invalid request."
        L_0x0043:
            r2 = r7
        L_0x0044:
            e8.zh0 r7 = new e8.zh0
            int[] r0 = e8.f10.f14526a
            int r1 = r6.ordinal()
            r0 = r0[r1]
            r1 = 0
            switch(r0) {
                case 1: goto L_0x008d;
                case 2: goto L_0x008d;
                case 3: goto L_0x008d;
                case 4: goto L_0x008a;
                case 5: goto L_0x0087;
                case 6: goto L_0x0082;
                case 7: goto L_0x007f;
                case 8: goto L_0x008a;
                case 9: goto L_0x008d;
                case 10: goto L_0x0087;
                case 11: goto L_0x008f;
                case 12: goto L_0x0068;
                case 13: goto L_0x008f;
                default: goto L_0x0052;
            }
        L_0x0052:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r8 = r6.length()
            int r8 = r8 + 18
            java.lang.String r0 = "Unknown SdkError: "
            java.lang.String r6 = e.f.a(r8, r0, r6)
            r7.<init>(r6)
            throw r7
        L_0x0068:
            e8.l<java.lang.Integer> r6 = e8.t.C4
            e8.ti0 r0 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r0 = r0.f16769f
            java.lang.Object r6 = r0.a(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 > 0) goto L_0x0087
            r6 = 9
            r1 = 9
            goto L_0x008f
        L_0x007f:
            r6 = 4
            r1 = 4
            goto L_0x008f
        L_0x0082:
            r6 = 8
            r1 = 8
            goto L_0x008f
        L_0x0087:
            r6 = 3
            r1 = 3
            goto L_0x008f
        L_0x008a:
            r6 = 2
            r1 = 2
            goto L_0x008f
        L_0x008d:
            r6 = 1
            r1 = 1
        L_0x008f:
            r5 = 0
            java.lang.String r3 = "com.google.android.gms.ads"
            r0 = r7
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.e.p(com.google.android.gms.internal.ads.we, java.lang.String, e8.zh0):e8.zh0");
    }

    public static zh0 q(Throwable th, qt qtVar) {
        zh0 zh0;
        zh0 N = N(th);
        int i10 = N.f17753a;
        if ((i10 == 3 || i10 == 0) && (zh0 = N.f17756d) != null && !zh0.f17755c.equals("com.google.android.gms.ads")) {
            N.f17756d = null;
        }
        if (((Boolean) ti0.f16763j.f16769f.a(t.B4)).booleanValue() && qtVar != null) {
            N.f17757e = new ii(qtVar.f16203c, "", qtVar);
        }
        return N;
    }

    public static File r(File file, boolean z10) {
        if (z10 && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File s(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        r(file2, false);
        return file2;
    }

    public static File t(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(s(str, file), str2);
    }

    public static String u(JSONObject jSONObject, String str, String str2) {
        JSONArray optJSONArray;
        if (!((Boolean) ti0.f16763j.f16769f.a(t.S0)).booleanValue() || jSONObject == null || (optJSONArray = jSONObject.optJSONArray(str2)) == null) {
            return "";
        }
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
            if (optJSONObject != null) {
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("including");
                JSONArray optJSONArray3 = optJSONObject.optJSONArray("excluding");
                if (y(optJSONArray2, str) && !y(optJSONArray3, str)) {
                    return optJSONObject.optString("effective_ad_unit_id", "");
                }
            }
        }
        return "";
    }

    public static void v(String str, Throwable th) {
        if (O()) {
            Log.v("Ads", str, th);
        }
    }

    public static void w(byte[] bArr, long j10, int i10) {
        int i11 = 0;
        while (i11 < 4) {
            bArr[i10 + i11] = (byte) ((int) (255 & j10));
            i11++;
            j10 >>= 8;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0019 A[SYNTHETIC, Splitter:B:14:0x0019] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x001f A[SYNTHETIC, Splitter:B:20:0x001f] */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean x(java.io.File r2, byte[] r3) {
        /*
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x001d, all -> 0x0016 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x001d, all -> 0x0016 }
            r1.write(r3)     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            r1.flush()     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            r1.close()     // Catch:{ IOException -> 0x000f }
        L_0x000f:
            r2 = 1
            return r2
        L_0x0011:
            r2 = move-exception
            r0 = r1
            goto L_0x0017
        L_0x0014:
            r0 = r1
            goto L_0x001d
        L_0x0016:
            r2 = move-exception
        L_0x0017:
            if (r0 == 0) goto L_0x001c
            r0.close()     // Catch:{ IOException -> 0x001c }
        L_0x001c:
            throw r2
        L_0x001d:
            if (r0 == 0) goto L_0x0022
            r0.close()     // Catch:{ IOException -> 0x0022 }
        L_0x0022:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.e.x(java.io.File, byte[]):boolean");
    }

    public static boolean y(JSONArray jSONArray, String str) {
        if (!(jSONArray == null || str == null)) {
            int i10 = 0;
            while (i10 < jSONArray.length()) {
                try {
                    if (Pattern.compile(jSONArray.optString(i10)).matcher(str).lookingAt()) {
                        return true;
                    }
                    i10++;
                } catch (PatternSyntaxException e10) {
                    y6 y6Var = d7.l.B.f13190g;
                    a5.d(y6Var.f8584e, y6Var.f8585f).c(e10, "RtbAdapterMap.hasAtleastOneRegexMatch");
                }
            }
        }
        return false;
    }

    public static k8.e z(k8.e eVar, g gVar, i iVar, Boolean bool, Boolean bool2) {
        k8.e eVar2 = new k8.e();
        Iterator<Integer> A = eVar.A();
        while (A.hasNext()) {
            int intValue = A.next().intValue();
            if (eVar.E(intValue)) {
                k8.o b10 = iVar.b(gVar, Arrays.asList(new k8.o[]{eVar.y(intValue), new k8.h(Double.valueOf((double) intValue)), eVar}));
                if (b10.j().equals(bool)) {
                    return eVar2;
                }
                if (bool2 == null || b10.j().equals(bool2)) {
                    eVar2.D(intValue, b10);
                }
            }
        }
        return eVar2;
    }
}

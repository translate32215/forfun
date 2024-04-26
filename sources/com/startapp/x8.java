package com.startapp;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.util.Pair;
import com.startapp.sdk.adsbase.remoteconfig.RscMetadata;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.zip.Inflater;
import java.util.zip.InflaterOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Sta */
public class x8 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12798a;

    /* renamed from: b  reason: collision with root package name */
    public final d3<RscMetadata> f12799b;

    /* renamed from: c  reason: collision with root package name */
    public RscMetadata f12800c;

    /* renamed from: d  reason: collision with root package name */
    public List<a9> f12801d;

    /* renamed from: e  reason: collision with root package name */
    public List<z8> f12802e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<r1, Pair<Long, SoftReference<JSONObject>>> f12803f = new WeakHashMap();

    public x8(Context context, d3<RscMetadata> d3Var) {
        this.f12798a = context;
        this.f12799b = d3Var;
    }

    public static JSONArray a(z8 z8Var) {
        r1 r1Var = z8Var.f12924a;
        String[] strArr = r1Var.f11640c;
        Object[] objArr = r1Var.f11642e;
        if (strArr.length == objArr.length) {
            int length = strArr.length;
            if (length == 0) {
                return null;
            }
            try {
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(strArr[i10], objArr[i10]);
                    jSONArray.put(jSONObject);
                }
                return jSONArray;
            } catch (JSONException e10) {
                if (z8Var.a(32)) {
                    i4.a((Throwable) e10);
                }
            }
        } else {
            if (z8Var.a(512)) {
                i4 i4Var = new i4(j4.f10588e);
                i4Var.f10537d = "c690e4ef5365d88b";
                i4Var.f10538e = Arrays.toString(strArr) + ", " + Arrays.toString(objArr);
                i4Var.a();
            }
            return null;
        }
    }

    public final boolean a(int i10) {
        RscMetadata call = this.f12799b.call();
        if (call == null || !call.d()) {
            call = null;
        }
        return (call == null || (i10 & call.a()) == 0) ? false : true;
    }

    public static boolean a(RscMetadata rscMetadata, int i10) {
        return (rscMetadata == null || (rscMetadata.a() & i10) == 0) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01a5, code lost:
        r11 = r10.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01ac, code lost:
        if (r11 != null) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01af, code lost:
        r0 = r11.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01c4, code lost:
        r14 = com.startapp.s1.a(a(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01c6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01c7, code lost:
        r12 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01cd, code lost:
        if ((r3.a(r11) & r4) != 0) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01cf, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01d1, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01d2, code lost:
        if (r0 != false) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01d4, code lost:
        com.startapp.i4.a(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01d8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01d9, code lost:
        r12 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01df, code lost:
        if ((r3.a(r11) & r5) != 0) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01e1, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01e3, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01e4, code lost:
        if (r0 != false) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01e6, code lost:
        com.startapp.i4.a(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01e9, code lost:
        r14 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01ea, code lost:
        if (r14 != null) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01ed, code lost:
        r0 = r11.h();
        r12 = r11.d();
        r15 = new java.util.ArrayList(java.lang.Math.min(r8.size(), java.lang.Integer.bitCount(r0)));
        r4 = r8.iterator();
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x020f, code lost:
        if (r4.hasNext() != false) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0211, code lost:
        r5 = (com.startapp.a9) r4.next();
        r16 = 1 << r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x021d, code lost:
        if ((r0 & r16) == 0) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0221, code lost:
        if ((r12 & r16) != 0) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0223, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0226, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0228, code lost:
        r15.add(new android.util.Pair(r5, java.lang.Boolean.valueOf(r16)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0234, code lost:
        r13 = r13 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x023e, code lost:
        if (r15.size() >= 1) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0240, code lost:
        r2 = null;
        r4 = 4;
        r5 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x024c, code lost:
        if (r11.i() != null) goto L_0x024e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x024e, code lost:
        r16 = r11.i().intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0259, code lost:
        r16 = 300;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x025d, code lost:
        r17 = r11.g();
        r18 = r11.c();
        r19 = r11.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x026d, code lost:
        if (r11.e() != null) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x026f, code lost:
        r20 = r11.e().intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x027a, code lost:
        r20 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x027c, code lost:
        r9.add(new com.startapp.z8(r14, r15, r16, r17, r18, r19, r20, r3.a(r11)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x028c, code lost:
        return a(r3, r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0291, code lost:
        return a(r3, (java.util.List<com.startapp.a9>) null, (java.util.List<com.startapp.z8>) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0296, code lost:
        return a(r3, (java.util.List<com.startapp.a9>) null, (java.util.List<com.startapp.z8>) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        r0 = r3.c();
        r4 = 4;
        r5 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        if (r0 == null) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        if (r0.length() >= 1) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r0 = com.startapp.q5.a(new android.util.JsonReader(new java.io.StringReader(a(r0))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        r8 = new java.util.ArrayList();
        r0 = ((java.util.ArrayList) r0).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005e, code lost:
        if (r0.hasNext() == false) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0060, code lost:
        r9 = r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if ((r9 instanceof java.util.Map) != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        r9 = new com.startapp.a9();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006f, code lost:
        r9 = (java.util.Map) r9;
        r10 = r9.get("type");
        r9 = r9.get("params");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007f, code lost:
        if ((r10 instanceof java.lang.Number) == false) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0081, code lost:
        r10 = ((java.lang.Number) r10).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0087, code lost:
        if (r10 == 1) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0089, code lost:
        if (r10 == 2) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008c, code lost:
        if (r10 == 3) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008e, code lost:
        if (r10 == 4) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0094, code lost:
        if ((r9 instanceof java.util.List) == false) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0096, code lost:
        r9 = (java.util.List) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009c, code lost:
        if (r9.size() <= 0) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009e, code lost:
        r10 = com.startapp.j4.a(java.lang.String.valueOf(r9.get(0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00aa, code lost:
        if (r10 == null) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b0, code lost:
        if (r9.size() <= 1) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b2, code lost:
        r9 = java.lang.String.valueOf(r9.get(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bb, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bc, code lost:
        r9 = new com.startapp.t8(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c6, code lost:
        if ((r9 instanceof java.util.Map) == false) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c8, code lost:
        r9 = (java.util.Map) r9;
        r10 = r9.get("action");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d2, code lost:
        if ((r10 instanceof java.lang.String) == false) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d4, code lost:
        r9 = r9.get("extras");
        r11 = new java.util.HashMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e1, code lost:
        if ((r9 instanceof java.util.Map) == false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e3, code lost:
        r9 = ((java.util.Map) r9).entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f1, code lost:
        if (r9.hasNext() == false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f3, code lost:
        r12 = (java.util.Map.Entry) r9.next();
        r13 = r12.getKey();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ff, code lost:
        if ((r13 instanceof java.lang.String) == false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0101, code lost:
        r11.put((java.lang.String) r13, java.lang.String.valueOf(r12.getValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010f, code lost:
        r9 = new com.startapp.s8((java.lang.String) r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0119, code lost:
        if ((r9 instanceof java.util.List) == false) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x011b, code lost:
        r10 = new java.util.LinkedList();
        r9 = ((java.util.List) r9).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x012a, code lost:
        if (r9.hasNext() == false) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012c, code lost:
        r11 = r9.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0132, code lost:
        if ((r11 instanceof java.lang.String) == false) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0134, code lost:
        r11 = com.startapp.j4.a((java.lang.String) r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x013a, code lost:
        if (r11 == null) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x013c, code lost:
        r10.add(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0144, code lost:
        if (r10.size() <= 0) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0146, code lost:
        r9 = new com.startapp.u8(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x014e, code lost:
        if ((r9 instanceof java.lang.Number) == false) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0150, code lost:
        r9 = new com.startapp.r8(((java.lang.Number) r9).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x015d, code lost:
        r9 = new com.startapp.a9();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0162, code lost:
        r8.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0167, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x016c, code lost:
        if (a(r3, 1) != false) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x016e, code lost:
        com.startapp.i4.a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0172, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0173, code lost:
        r8 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0178, code lost:
        if (a(r3, 1) != false) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x017a, code lost:
        com.startapp.i4.a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x017d, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x017e, code lost:
        if (r8 == null) goto L_0x0292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0188, code lost:
        r0 = r3.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x018c, code lost:
        if (r0 == null) goto L_0x028d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0196, code lost:
        r9 = new java.util.LinkedList();
        r10 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01a3, code lost:
        if (r10.hasNext() != false) goto L_0x01a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x019f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0188  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.startapp.z8> a() {
        /*
            r22 = this;
            r1 = r22
            com.startapp.d3<com.startapp.sdk.adsbase.remoteconfig.RscMetadata> r0 = r1.f12799b
            java.lang.Object r0 = r0.call()
            com.startapp.sdk.adsbase.remoteconfig.RscMetadata r0 = (com.startapp.sdk.adsbase.remoteconfig.RscMetadata) r0
            r2 = 0
            if (r0 == 0) goto L_0x0015
            boolean r3 = r0.d()
            if (r3 == 0) goto L_0x0015
            r3 = r0
            goto L_0x0016
        L_0x0015:
            r3 = r2
        L_0x0016:
            if (r3 != 0) goto L_0x001d
            java.util.List r0 = r1.a(r2, r2, r2)
            return r0
        L_0x001d:
            monitor-enter(r22)
            com.startapp.sdk.adsbase.remoteconfig.RscMetadata r0 = r1.f12800c     // Catch:{ all -> 0x0297 }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0297 }
            if (r0 == 0) goto L_0x002a
            java.util.List<com.startapp.z8> r0 = r1.f12802e     // Catch:{ all -> 0x0297 }
            monitor-exit(r22)     // Catch:{ all -> 0x0297 }
            return r0
        L_0x002a:
            monitor-exit(r22)     // Catch:{ all -> 0x0297 }
            java.lang.String r0 = r3.c()
            r4 = 4
            r5 = 2
            r6 = 0
            r7 = 1
            if (r0 == 0) goto L_0x017d
            int r8 = r0.length()
            if (r8 >= r7) goto L_0x003d
            goto L_0x017d
        L_0x003d:
            java.lang.String r0 = a((java.lang.String) r0)     // Catch:{ all -> 0x0172 }
            android.util.JsonReader r8 = new android.util.JsonReader     // Catch:{ all -> 0x0167 }
            java.io.StringReader r9 = new java.io.StringReader     // Catch:{ all -> 0x0167 }
            r9.<init>(r0)     // Catch:{ all -> 0x0167 }
            r8.<init>(r9)     // Catch:{ all -> 0x0167 }
            java.util.List r0 = com.startapp.q5.a(r8)     // Catch:{ all -> 0x0167 }
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x005a:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x017e
            java.lang.Object r9 = r0.next()
            boolean r10 = r9 instanceof java.util.Map
            if (r10 != 0) goto L_0x006f
            com.startapp.a9 r9 = new com.startapp.a9
            r9.<init>()
            goto L_0x0162
        L_0x006f:
            java.util.Map r9 = (java.util.Map) r9
            java.lang.String r10 = "type"
            java.lang.Object r10 = r9.get(r10)
            java.lang.String r11 = "params"
            java.lang.Object r9 = r9.get(r11)
            boolean r11 = r10 instanceof java.lang.Number
            if (r11 == 0) goto L_0x015d
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r10 == r7) goto L_0x014c
            if (r10 == r5) goto L_0x0117
            r11 = 3
            if (r10 == r11) goto L_0x00c4
            if (r10 == r4) goto L_0x0092
            goto L_0x015d
        L_0x0092:
            boolean r10 = r9 instanceof java.util.List
            if (r10 == 0) goto L_0x015d
            java.util.List r9 = (java.util.List) r9
            int r10 = r9.size()
            if (r10 <= 0) goto L_0x015d
            java.lang.Object r10 = r9.get(r6)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            com.startapp.j4 r10 = com.startapp.j4.a(r10)
            if (r10 == 0) goto L_0x015d
            int r11 = r9.size()
            if (r11 <= r7) goto L_0x00bb
            java.lang.Object r9 = r9.get(r7)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            goto L_0x00bc
        L_0x00bb:
            r9 = r2
        L_0x00bc:
            com.startapp.t8 r11 = new com.startapp.t8
            r11.<init>(r10, r9)
            r9 = r11
            goto L_0x0162
        L_0x00c4:
            boolean r10 = r9 instanceof java.util.Map
            if (r10 == 0) goto L_0x015d
            java.util.Map r9 = (java.util.Map) r9
            java.lang.String r10 = "action"
            java.lang.Object r10 = r9.get(r10)
            boolean r11 = r10 instanceof java.lang.String
            if (r11 == 0) goto L_0x015d
            java.lang.String r11 = "extras"
            java.lang.Object r9 = r9.get(r11)
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            boolean r12 = r9 instanceof java.util.Map
            if (r12 == 0) goto L_0x010f
            java.util.Map r9 = (java.util.Map) r9
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x00ed:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x010f
            java.lang.Object r12 = r9.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r13 = r12.getKey()
            boolean r14 = r13 instanceof java.lang.String
            if (r14 == 0) goto L_0x00ed
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r12 = r12.getValue()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r11.put(r13, r12)
            goto L_0x00ed
        L_0x010f:
            com.startapp.s8 r9 = new com.startapp.s8
            java.lang.String r10 = (java.lang.String) r10
            r9.<init>(r10, r11)
            goto L_0x0162
        L_0x0117:
            boolean r10 = r9 instanceof java.util.List
            if (r10 == 0) goto L_0x015d
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
            java.util.List r9 = (java.util.List) r9
            java.util.Iterator r9 = r9.iterator()
        L_0x0126:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0140
            java.lang.Object r11 = r9.next()
            boolean r12 = r11 instanceof java.lang.String
            if (r12 == 0) goto L_0x0126
            java.lang.String r11 = (java.lang.String) r11
            com.startapp.j4 r11 = com.startapp.j4.a(r11)
            if (r11 == 0) goto L_0x0126
            r10.add(r11)
            goto L_0x0126
        L_0x0140:
            int r9 = r10.size()
            if (r9 <= 0) goto L_0x015d
            com.startapp.u8 r9 = new com.startapp.u8
            r9.<init>(r10)
            goto L_0x0162
        L_0x014c:
            boolean r10 = r9 instanceof java.lang.Number
            if (r10 == 0) goto L_0x015d
            com.startapp.r8 r10 = new com.startapp.r8
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r10.<init>(r9)
            r9 = r10
            goto L_0x0162
        L_0x015d:
            com.startapp.a9 r9 = new com.startapp.a9
            r9.<init>()
        L_0x0162:
            r8.add(r9)
            goto L_0x005a
        L_0x0167:
            r0 = move-exception
            boolean r8 = a(r3, r7)
            if (r8 == 0) goto L_0x017d
            com.startapp.i4.a((java.lang.Throwable) r0)
            goto L_0x017d
        L_0x0172:
            r0 = move-exception
            r8 = r0
            boolean r0 = a(r3, r7)
            if (r0 == 0) goto L_0x017d
            com.startapp.i4.a((java.lang.Throwable) r8)
        L_0x017d:
            r8 = r2
        L_0x017e:
            if (r8 == 0) goto L_0x0292
            int r0 = r8.size()
            if (r0 >= r7) goto L_0x0188
            goto L_0x0292
        L_0x0188:
            java.util.List r0 = r3.b()
            if (r0 == 0) goto L_0x028d
            int r9 = r0.size()
            if (r9 >= r7) goto L_0x0196
            goto L_0x028d
        L_0x0196:
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            java.util.Iterator r10 = r0.iterator()
        L_0x019f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0288
            java.lang.Object r0 = r10.next()
            r11 = r0
            com.startapp.sdk.adsbase.remoteconfig.RscMetadataItem r11 = (com.startapp.sdk.adsbase.remoteconfig.RscMetadataItem) r11
            if (r11 != 0) goto L_0x01af
            goto L_0x019f
        L_0x01af:
            java.lang.String r0 = r11.a()
            if (r0 == 0) goto L_0x01e9
            int r12 = r0.length()
            if (r12 >= r7) goto L_0x01bc
            goto L_0x01e9
        L_0x01bc:
            java.lang.String r0 = a((java.lang.String) r0)     // Catch:{ all -> 0x01d8 }
            com.startapp.r1 r0 = com.startapp.s1.a(r0)     // Catch:{ all -> 0x01c6 }
            r14 = r0
            goto L_0x01ea
        L_0x01c6:
            r0 = move-exception
            r12 = r0
            int r0 = r3.a(r11)
            r0 = r0 & r4
            if (r0 == 0) goto L_0x01d1
            r0 = 1
            goto L_0x01d2
        L_0x01d1:
            r0 = 0
        L_0x01d2:
            if (r0 == 0) goto L_0x01e9
            com.startapp.i4.a((java.lang.Throwable) r12)
            goto L_0x01e9
        L_0x01d8:
            r0 = move-exception
            r12 = r0
            int r0 = r3.a(r11)
            r0 = r0 & r5
            if (r0 == 0) goto L_0x01e3
            r0 = 1
            goto L_0x01e4
        L_0x01e3:
            r0 = 0
        L_0x01e4:
            if (r0 == 0) goto L_0x01e9
            com.startapp.i4.a((java.lang.Throwable) r12)
        L_0x01e9:
            r14 = r2
        L_0x01ea:
            if (r14 != 0) goto L_0x01ed
            goto L_0x019f
        L_0x01ed:
            int r0 = r11.h()
            int r12 = r11.d()
            java.util.ArrayList r15 = new java.util.ArrayList
            int r13 = r8.size()
            int r4 = java.lang.Integer.bitCount(r0)
            int r4 = java.lang.Math.min(r13, r4)
            r15.<init>(r4)
            java.util.Iterator r4 = r8.iterator()
            r13 = 0
        L_0x020b:
            boolean r16 = r4.hasNext()
            if (r16 == 0) goto L_0x023a
            java.lang.Object r16 = r4.next()
            r5 = r16
            com.startapp.a9 r5 = (com.startapp.a9) r5
            int r16 = r7 << r13
            r17 = r0 & r16
            if (r17 == 0) goto L_0x0234
            r16 = r12 & r16
            if (r16 == 0) goto L_0x0226
            r16 = 1
            goto L_0x0228
        L_0x0226:
            r16 = 0
        L_0x0228:
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r16)
            r6.<init>(r5, r2)
            r15.add(r6)
        L_0x0234:
            int r13 = r13 + 1
            r2 = 0
            r5 = 2
            r6 = 0
            goto L_0x020b
        L_0x023a:
            int r0 = r15.size()
            if (r0 >= r7) goto L_0x0246
        L_0x0240:
            r2 = 0
            r4 = 4
            r5 = 2
            r6 = 0
            goto L_0x019f
        L_0x0246:
            com.startapp.z8 r0 = new com.startapp.z8
            java.lang.Integer r2 = r11.i()
            if (r2 == 0) goto L_0x0259
            java.lang.Integer r2 = r11.i()
            int r2 = r2.intValue()
            r16 = r2
            goto L_0x025d
        L_0x0259:
            r2 = 300(0x12c, float:4.2E-43)
            r16 = 300(0x12c, float:4.2E-43)
        L_0x025d:
            int[] r17 = r11.g()
            java.lang.Integer r18 = r11.c()
            java.lang.Integer r19 = r11.f()
            java.lang.Integer r2 = r11.e()
            if (r2 == 0) goto L_0x027a
            java.lang.Integer r2 = r11.e()
            int r2 = r2.intValue()
            r20 = r2
            goto L_0x027c
        L_0x027a:
            r20 = 0
        L_0x027c:
            int r21 = r3.a(r11)
            r13 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r9.add(r0)
            goto L_0x0240
        L_0x0288:
            java.util.List r0 = r1.a(r3, r8, r9)
            return r0
        L_0x028d:
            java.util.List r0 = r1.a(r3, r2, r2)
            return r0
        L_0x0292:
            java.util.List r0 = r1.a(r3, r2, r2)
            return r0
        L_0x0297:
            r0 = move-exception
            monitor-exit(r22)     // Catch:{ all -> 0x0297 }
            goto L_0x029b
        L_0x029a:
            throw r0
        L_0x029b:
            goto L_0x029a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.x8.a():java.util.List");
    }

    public final synchronized List<z8> a(RscMetadata rscMetadata, List<a9> list, List<z8> list2) {
        List<a9> list3 = this.f12801d;
        if (list3 != null) {
            for (a9 a10 : list3) {
                try {
                    a10.a(this.f12798a);
                } catch (Throwable th) {
                    if (a(this.f12800c, 64)) {
                        i4.a(th);
                    }
                }
            }
        }
        this.f12800c = rscMetadata;
        this.f12801d = list;
        this.f12802e = list2;
        if (list != null) {
            for (a9 a11 : list) {
                try {
                    a11.a(this.f12798a, this);
                } catch (Throwable th2) {
                    if (a(rscMetadata, 128)) {
                        i4.a(th2);
                    }
                }
            }
        }
        return list2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009f, code lost:
        if ((((java.lang.Long) r10.first).longValue() + ((long) (r0 * 1000))) < android.os.SystemClock.elapsedRealtime()) goto L_0x00a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r18
            java.util.List r0 = r18.a()
            r2 = 0
            if (r0 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.util.Iterator r3 = r0.iterator()
            r4 = r2
        L_0x000f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01c3
            java.lang.Object r0 = r3.next()
            r5 = r0
            com.startapp.z8 r5 = (com.startapp.z8) r5
            r6 = 2
            r8 = 1
            java.util.List<android.util.Pair<com.startapp.a9, java.lang.Boolean>> r0 = r5.f12925b     // Catch:{ all -> 0x0050 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0050 }
        L_0x0024:
            boolean r9 = r0.hasNext()     // Catch:{ all -> 0x0050 }
            if (r9 == 0) goto L_0x004d
            java.lang.Object r9 = r0.next()     // Catch:{ all -> 0x0050 }
            android.util.Pair r9 = (android.util.Pair) r9     // Catch:{ all -> 0x0050 }
            java.lang.Object r10 = r9.first     // Catch:{ all -> 0x0050 }
            com.startapp.a9 r10 = (com.startapp.a9) r10     // Catch:{ all -> 0x0050 }
            r11 = r19
            boolean r10 = r10.a((java.lang.Object) r11)     // Catch:{ all -> 0x004b }
            if (r10 == 0) goto L_0x0024
            java.lang.Object r0 = r9.second     // Catch:{ all -> 0x004b }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x004b }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0048
            r0 = 2
            goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            r0 = r0 | r8
            goto L_0x005f
        L_0x004b:
            r0 = move-exception
            goto L_0x0053
        L_0x004d:
            r11 = r19
            goto L_0x005e
        L_0x0050:
            r0 = move-exception
            r11 = r19
        L_0x0053:
            r9 = 256(0x100, float:3.59E-43)
            boolean r9 = r5.a(r9)
            if (r9 == 0) goto L_0x005e
            com.startapp.i4.a((java.lang.Throwable) r0)
        L_0x005e:
            r0 = 0
        L_0x005f:
            r9 = r0 & 1
            if (r9 != 0) goto L_0x0067
            r17 = r3
            goto L_0x0183
        L_0x0067:
            com.startapp.r1 r9 = r5.f12924a
            r0 = r0 & 2
            if (r0 != 0) goto L_0x00a5
            int r0 = r5.f12926c
            monitor-enter(r18)
            java.util.Map<com.startapp.r1, android.util.Pair<java.lang.Long, java.lang.ref.SoftReference<org.json.JSONObject>>> r10 = r1.f12803f     // Catch:{ all -> 0x00a2 }
            java.lang.Object r10 = r10.get(r9)     // Catch:{ all -> 0x00a2 }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x00a2 }
            monitor-exit(r18)     // Catch:{ all -> 0x00a2 }
            if (r10 != 0) goto L_0x007e
        L_0x007b:
            r17 = r3
            goto L_0x00a1
        L_0x007e:
            java.lang.Object r12 = r10.second
            java.lang.ref.SoftReference r12 = (java.lang.ref.SoftReference) r12
            java.lang.Object r12 = r12.get()
            org.json.JSONObject r12 = (org.json.JSONObject) r12
            if (r12 != 0) goto L_0x008b
            goto L_0x007b
        L_0x008b:
            java.lang.Object r10 = r10.first
            java.lang.Long r10 = (java.lang.Long) r10
            long r13 = r10.longValue()
            long r15 = android.os.SystemClock.elapsedRealtime()
            int r0 = r0 * 1000
            r17 = r3
            long r2 = (long) r0
            long r13 = r13 + r2
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a8
        L_0x00a1:
            goto L_0x00a7
        L_0x00a2:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x00a2 }
            throw r0
        L_0x00a5:
            r17 = r3
        L_0x00a7:
            r12 = 0
        L_0x00a8:
            r2 = 32
            if (r12 != 0) goto L_0x0181
            android.content.Context r0 = r1.f12798a     // Catch:{ all -> 0x00b8 }
            int[] r3 = r5.f12927d     // Catch:{ all -> 0x00b8 }
            java.lang.Integer r13 = r5.f12928e     // Catch:{ all -> 0x00b8 }
            org.json.JSONArray r0 = r9.a((android.content.Context) r0, (int[]) r3, (java.lang.Integer) r13)     // Catch:{ all -> 0x00b8 }
            r3 = r0
            goto L_0x00c5
        L_0x00b8:
            r0 = move-exception
            r3 = 8
            boolean r3 = r5.a(r3)
            if (r3 == 0) goto L_0x00c4
            com.startapp.i4.a((java.lang.Throwable) r0)
        L_0x00c4:
            r3 = 0
        L_0x00c5:
            if (r3 == 0) goto L_0x0116
            java.lang.Integer r0 = r5.f12929f
            if (r0 == 0) goto L_0x0116
            int r0 = r0.intValue()     // Catch:{ all -> 0x010a }
            if (r0 != r8) goto L_0x00d7
            com.startapp.y8 r0 = new com.startapp.y8     // Catch:{ all -> 0x010a }
            r0.<init>()     // Catch:{ all -> 0x010a }
            goto L_0x00d8
        L_0x00d7:
            r0 = 0
        L_0x00d8:
            if (r0 == 0) goto L_0x0116
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ all -> 0x010a }
            r0.<init>()     // Catch:{ all -> 0x010a }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x010a }
            int r14 = r3.length()     // Catch:{ all -> 0x010a }
            r13.<init>(r14)     // Catch:{ all -> 0x010a }
            int r14 = r3.length()     // Catch:{ all -> 0x010a }
            r15 = 0
        L_0x00ed:
            if (r15 >= r14) goto L_0x0101
            org.json.JSONObject r7 = r3.getJSONObject(r15)     // Catch:{ all -> 0x010a }
            if (r7 == 0) goto L_0x00fe
            java.lang.String r10 = com.startapp.y8.f12880a     // Catch:{ all -> 0x010a }
            java.lang.String r7 = r7.getString(r10)     // Catch:{ all -> 0x010a }
            r13.add(r7)     // Catch:{ all -> 0x010a }
        L_0x00fe:
            int r15 = r15 + 1
            goto L_0x00ed
        L_0x0101:
            java.lang.String r7 = com.startapp.z9.a(r13)     // Catch:{ all -> 0x010a }
            r0.put(r7)     // Catch:{ all -> 0x010a }
            r3 = r0
            goto L_0x0116
        L_0x010a:
            r0 = move-exception
            r7 = 2048(0x800, float:2.87E-42)
            boolean r7 = r5.a(r7)
            if (r7 == 0) goto L_0x0116
            com.startapp.i4.a((java.lang.Throwable) r0)
        L_0x0116:
            if (r3 == 0) goto L_0x0181
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x0181
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            int r0 = r5.f12930g     // Catch:{ JSONException -> 0x015a }
            r0 = r0 & r8
            if (r0 == 0) goto L_0x012a
            r0 = 1
            goto L_0x012b
        L_0x012a:
            r0 = 0
        L_0x012b:
            if (r0 == 0) goto L_0x0136
            java.lang.String r0 = "currentTimeMillis"
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x015a }
            r12.put(r0, r13)     // Catch:{ JSONException -> 0x015a }
        L_0x0136:
            int r0 = r5.f12930g     // Catch:{ JSONException -> 0x015a }
            r0 = r0 & r6
            if (r0 == 0) goto L_0x013d
            r7 = 1
            goto L_0x013e
        L_0x013d:
            r7 = 0
        L_0x013e:
            if (r7 == 0) goto L_0x0149
            java.lang.String r0 = "bootTimeMillis"
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x015a }
            r12.put(r0, r6)     // Catch:{ JSONException -> 0x015a }
        L_0x0149:
            org.json.JSONArray r0 = a((com.startapp.z8) r5)     // Catch:{ JSONException -> 0x015a }
            if (r0 == 0) goto L_0x0154
            java.lang.String r6 = "params"
            r12.put(r6, r0)     // Catch:{ JSONException -> 0x015a }
        L_0x0154:
            java.lang.String r0 = "items"
            r12.put(r0, r3)     // Catch:{ JSONException -> 0x015a }
            goto L_0x0164
        L_0x015a:
            r0 = move-exception
            boolean r3 = r5.a(r2)
            if (r3 == 0) goto L_0x0164
            com.startapp.i4.a((java.lang.Throwable) r0)
        L_0x0164:
            monitor-enter(r18)
            java.util.Map<com.startapp.r1, android.util.Pair<java.lang.Long, java.lang.ref.SoftReference<org.json.JSONObject>>> r0 = r1.f12803f     // Catch:{ all -> 0x017e }
            android.util.Pair r3 = new android.util.Pair     // Catch:{ all -> 0x017e }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x017e }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x017e }
            java.lang.ref.SoftReference r7 = new java.lang.ref.SoftReference     // Catch:{ all -> 0x017e }
            r7.<init>(r12)     // Catch:{ all -> 0x017e }
            r3.<init>(r6, r7)     // Catch:{ all -> 0x017e }
            r0.put(r9, r3)     // Catch:{ all -> 0x017e }
            monitor-exit(r18)
            goto L_0x0181
        L_0x017e:
            r0 = move-exception
            monitor-exit(r18)
            throw r0
        L_0x0181:
            if (r12 != 0) goto L_0x0188
        L_0x0183:
            r3 = r17
            r2 = 0
            goto L_0x000f
        L_0x0188:
            if (r4 != 0) goto L_0x0190
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r4 = r0
        L_0x0190:
            java.lang.String r0 = r9.f11638a     // Catch:{ JSONException -> 0x01b8 }
            org.json.JSONObject r0 = r4.optJSONObject(r0)     // Catch:{ JSONException -> 0x01b8 }
            if (r0 != 0) goto L_0x01a2
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01b8 }
            r0.<init>()     // Catch:{ JSONException -> 0x01b8 }
            java.lang.String r3 = r9.f11638a     // Catch:{ JSONException -> 0x01b8 }
            r4.put(r3, r0)     // Catch:{ JSONException -> 0x01b8 }
        L_0x01a2:
            java.lang.String r3 = r9.f11639b     // Catch:{ JSONException -> 0x01b8 }
            org.json.JSONArray r3 = r0.optJSONArray(r3)     // Catch:{ JSONException -> 0x01b8 }
            if (r3 != 0) goto L_0x01b4
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x01b8 }
            r3.<init>()     // Catch:{ JSONException -> 0x01b8 }
            java.lang.String r6 = r9.f11639b     // Catch:{ JSONException -> 0x01b8 }
            r0.put(r6, r3)     // Catch:{ JSONException -> 0x01b8 }
        L_0x01b4:
            r3.put(r12)     // Catch:{ JSONException -> 0x01b8 }
            goto L_0x0183
        L_0x01b8:
            r0 = move-exception
            boolean r2 = r5.a(r2)
            if (r2 == 0) goto L_0x0183
            com.startapp.i4.a((java.lang.Throwable) r0)
            goto L_0x0183
        L_0x01c3:
            r2 = 0
            if (r4 != 0) goto L_0x01c7
            return r2
        L_0x01c7:
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x01d0 }
            java.lang.String r2 = com.startapp.wb.c((java.lang.String) r0)     // Catch:{ all -> 0x01d0 }
            goto L_0x01dc
        L_0x01d0:
            r0 = move-exception
            r3 = 16
            boolean r3 = r1.a((int) r3)
            if (r3 == 0) goto L_0x01dc
            com.startapp.i4.a((java.lang.Throwable) r0)
        L_0x01dc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.x8.a(java.lang.Object):java.lang.String");
    }

    public static String a(String str) throws IOException {
        byte[] a10 = a.a(Base64.decode(str, 8));
        Map<Activity, Integer> map = wb.f12765a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InflaterOutputStream inflaterOutputStream = new InflaterOutputStream(byteArrayOutputStream, new Inflater(true));
        inflaterOutputStream.write(a10);
        inflaterOutputStream.close();
        return new String(byteArrayOutputStream.toByteArray());
    }
}

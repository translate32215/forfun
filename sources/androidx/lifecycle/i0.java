package androidx.lifecycle;

import android.os.Bundle;
import androidx.activity.d;
import androidx.appcompat.widget.p;
import ge.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kd.g;
import ld.t;
import ud.f;
import ud.k;
import w1.a;

/* compiled from: SavedStateHandle.kt */
public final class i0 {

    /* renamed from: f  reason: collision with root package name */
    public static final a f2664f = new a((f) null);

    /* renamed from: g  reason: collision with root package name */
    public static final Class<? extends Object>[] f2665g;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f2666a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, a.b> f2667b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Object> f2668c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, b<Object>> f2669d;

    /* renamed from: e  reason: collision with root package name */
    public final a.b f2670e;

    /* compiled from: SavedStateHandle.kt */
    public static final class a {
        public a(f fVar) {
        }

        public final i0 a(Bundle bundle, Bundle bundle2) {
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
                int i10 = 0;
                if ((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int size = parcelableArrayList.size();
                    while (i10 < size) {
                        Object obj = parcelableArrayList.get(i10);
                        if (obj != null) {
                            linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
                            i10++;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                    return new i0(linkedHashMap);
                }
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            } else if (bundle2 == null) {
                return new i0();
            } else {
                HashMap hashMap = new HashMap();
                for (String str : bundle2.keySet()) {
                    k.e(str, "key");
                    hashMap.put(str, bundle2.get(str));
                }
                return new i0(hashMap);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Class<? extends java.lang.Object>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            androidx.lifecycle.i0$a r0 = new androidx.lifecycle.i0$a
            r1 = 0
            r0.<init>(r1)
            f2664f = r0
            r0 = 29
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r2 = 0
            r0[r2] = r1
            r1 = 1
            java.lang.Class<boolean[]> r2 = boolean[].class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Double.TYPE
            r2 = 2
            r0[r2] = r1
            r1 = 3
            java.lang.Class<double[]> r2 = double[].class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Integer.TYPE
            r2 = 4
            r0[r2] = r1
            r2 = 5
            java.lang.Class<int[]> r3 = int[].class
            r0[r2] = r3
            java.lang.Class r2 = java.lang.Long.TYPE
            r3 = 6
            r0[r3] = r2
            r2 = 7
            java.lang.Class<long[]> r3 = long[].class
            r0[r2] = r3
            r2 = 8
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r0[r2] = r3
            r2 = 9
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            r0[r2] = r3
            r2 = 10
            java.lang.Class<android.os.Binder> r3 = android.os.Binder.class
            r0[r2] = r3
            r2 = 11
            java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
            r0[r2] = r3
            java.lang.Class r2 = java.lang.Byte.TYPE
            r3 = 12
            r0[r3] = r2
            r2 = 13
            java.lang.Class<byte[]> r3 = byte[].class
            r0[r2] = r3
            java.lang.Class r2 = java.lang.Character.TYPE
            r3 = 14
            r0[r3] = r2
            r2 = 15
            java.lang.Class<char[]> r3 = char[].class
            r0[r2] = r3
            r2 = 16
            java.lang.Class<java.lang.CharSequence> r3 = java.lang.CharSequence.class
            r0[r2] = r3
            r2 = 17
            java.lang.Class<java.lang.CharSequence[]> r3 = java.lang.CharSequence[].class
            r0[r2] = r3
            r2 = 18
            java.lang.Class<java.util.ArrayList> r3 = java.util.ArrayList.class
            r0[r2] = r3
            java.lang.Class r2 = java.lang.Float.TYPE
            r3 = 19
            r0[r3] = r2
            r2 = 20
            java.lang.Class<float[]> r3 = float[].class
            r0[r2] = r3
            java.lang.Class<android.os.Parcelable> r2 = android.os.Parcelable.class
            r3 = 21
            r0[r3] = r2
            r2 = 22
            java.lang.Class<android.os.Parcelable[]> r4 = android.os.Parcelable[].class
            r0[r2] = r4
            r2 = 23
            java.lang.Class<java.io.Serializable> r4 = java.io.Serializable.class
            r0[r2] = r4
            java.lang.Class r2 = java.lang.Short.TYPE
            r4 = 24
            r0[r4] = r2
            r2 = 25
            java.lang.Class<short[]> r4 = short[].class
            r0[r2] = r4
            r2 = 26
            java.lang.Class<android.util.SparseArray> r4 = android.util.SparseArray.class
            r0[r2] = r4
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r3) goto L_0x00ad
            java.lang.Class<android.util.Size> r4 = android.util.Size.class
            goto L_0x00ae
        L_0x00ad:
            r4 = r1
        L_0x00ae:
            r5 = 27
            r0[r5] = r4
            r4 = 28
            if (r2 < r3) goto L_0x00b8
            java.lang.Class<android.util.SizeF> r1 = android.util.SizeF.class
        L_0x00b8:
            r0[r4] = r1
            f2665g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.i0.<clinit>():void");
    }

    public i0(Map<String, ? extends Object> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f2666a = linkedHashMap;
        this.f2667b = new LinkedHashMap();
        this.f2668c = new LinkedHashMap();
        this.f2669d = new LinkedHashMap();
        this.f2670e = new d(this);
        linkedHashMap.putAll(map);
    }

    public static Bundle a(i0 i0Var) {
        k.f(i0Var, "this$0");
        Iterator<Map.Entry<String, a.b>> it = t.e(i0Var.f2667b).entrySet().iterator();
        while (true) {
            boolean z10 = true;
            if (it.hasNext()) {
                Map.Entry next = it.next();
                String str = (String) next.getKey();
                Bundle a10 = ((a.b) next.getValue()).a();
                k.f(str, "key");
                if (a10 != null) {
                    Class<? extends Object>[] clsArr = f2665g;
                    int length = clsArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            z10 = false;
                            break;
                        }
                        Class<? extends Object> cls = clsArr[i10];
                        k.c(cls);
                        if (cls.isInstance(a10)) {
                            break;
                        }
                        i10++;
                    }
                }
                if (z10) {
                    Object obj = i0Var.f2668c.get(str);
                    b0 b0Var = obj instanceof b0 ? (b0) obj : null;
                    if (b0Var != null) {
                        b0Var.l(a10);
                    } else {
                        i0Var.f2666a.put(str, a10);
                    }
                    b bVar = i0Var.f2669d.get(str);
                    if (bVar != null) {
                        bVar.setValue(a10);
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Can't put value with type ");
                    k.c(a10);
                    sb2.append(a10.getClass());
                    sb2.append(" into saved state");
                    throw new IllegalArgumentException(sb2.toString());
                }
            } else {
                Set<String> keySet = i0Var.f2666a.keySet();
                ArrayList arrayList = new ArrayList(keySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String next2 : keySet) {
                    arrayList.add(next2);
                    arrayList2.add(i0Var.f2666a.get(next2));
                }
                return p.b(new g("keys", arrayList), new g("values", arrayList2));
            }
        }
    }

    public i0() {
        this.f2666a = new LinkedHashMap();
        this.f2667b = new LinkedHashMap();
        this.f2668c = new LinkedHashMap();
        this.f2669d = new LinkedHashMap();
        this.f2670e = new h0(this);
    }
}

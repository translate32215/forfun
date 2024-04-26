package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.JsonReader;
import android.util.JsonWriter;
import com.google.android.gms.internal.ads.k9;
import e8.bg0;
import e8.cc0;
import e8.fd0;
import e8.gc0;
import e8.se0;
import e8.th0;
import e8.w60;
import e8.y9;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k3.b;
import l0.e;
import s8.a;
import s8.i;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class se implements c7, a, se0 {

    /* renamed from: a  reason: collision with root package name */
    public int f8121a;

    /* renamed from: b  reason: collision with root package name */
    public Object f8122b;

    public se(int i10, Map map) {
        this.f8121a = i10;
        this.f8122b = map;
    }

    public static se g(w60 w60) throws cc0 {
        List list;
        try {
            w60.i(21);
            int d10 = w60.d() & 3;
            int d11 = w60.d();
            int i10 = w60.f17221b;
            int i11 = 0;
            for (int i12 = 0; i12 < d11; i12++) {
                w60.i(1);
                int e10 = w60.e();
                for (int i13 = 0; i13 < e10; i13++) {
                    int e11 = w60.e();
                    i11 += e11 + 4;
                    w60.i(e11);
                }
            }
            w60.h(i10);
            byte[] bArr = new byte[i11];
            int i14 = 0;
            for (int i15 = 0; i15 < d11; i15++) {
                w60.i(1);
                int e12 = w60.e();
                for (int i16 = 0; i16 < e12; i16++) {
                    int e13 = w60.e();
                    byte[] bArr2 = bg0.f14009a;
                    System.arraycopy(bArr2, 0, bArr, i14, bArr2.length);
                    int length = i14 + bArr2.length;
                    System.arraycopy(w60.f17220a, w60.f17221b, bArr, length, e13);
                    i14 = length + e13;
                    w60.i(e13);
                }
            }
            if (i11 == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new se(list, d10 + 1);
        } catch (ArrayIndexOutOfBoundsException e14) {
            throw new cc0("Error parsing HEVC config", e14);
        }
    }

    public void a(long j10) {
        int i10 = this.f8121a;
        Object obj = this.f8122b;
        if (i10 == ((long[]) obj).length) {
            this.f8122b = Arrays.copyOf((long[]) obj, i10 << 1);
        }
        int i11 = this.f8121a;
        this.f8121a = i11 + 1;
        ((long[]) this.f8122b)[i11] = j10;
    }

    public void b(JsonWriter jsonWriter) {
        int i10 = this.f8121a;
        Object obj = b7.f5991b;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value((long) i10);
        jsonWriter.endObject();
        b7.b(jsonWriter, (Map) this.f8122b);
        jsonWriter.endObject();
    }

    public long c(int i10) {
        if (i10 >= 0 && i10 < this.f8121a) {
            return ((long[]) this.f8122b)[i10];
        }
        throw new IndexOutOfBoundsException(y9.a(46, "Invalid index ", i10, ", size is ", this.f8121a));
    }

    public void d(gc0 gc0, Object obj) {
        b bVar;
        eu euVar = (eu) this.f8122b;
        int i10 = this.f8121a;
        if (euVar.f6335h == null) {
            int g10 = gc0.g();
            for (int i11 = 0; i11 < g10; i11++) {
                gc0.c(i11, euVar.f6330c);
            }
            if (euVar.f6334g == -1) {
                euVar.f6334g = gc0.h();
            } else if (gc0.h() != euVar.f6334g) {
                bVar = new b(1, 2);
                euVar.f6335h = bVar;
            }
            bVar = null;
            euVar.f6335h = bVar;
        }
        if (euVar.f6335h == null) {
            euVar.f6329b.remove(euVar.f6328a[i10]);
            if (i10 == 0) {
                euVar.f6332e = gc0;
                euVar.f6333f = obj;
            }
            if (euVar.f6329b.isEmpty()) {
                euVar.f6331d.d(euVar.f6332e, euVar.f6333f);
            }
        }
    }

    public Object e(i iVar) {
        k9.a aVar = (k9.a) this.f8122b;
        int i10 = this.f8121a;
        if (!iVar.l()) {
            return Boolean.FALSE;
        }
        th0 th0 = (th0) iVar.h();
        byte[] f10 = ((k9) ((aq) aVar.j())).f();
        th0.getClass();
        try {
            if (th0.f16760b) {
                th0.f16759a.b1(f10);
                th0.f16759a.a4(0);
                th0.f16759a.g5(i10);
                th0.f16759a.T4((int[]) null);
                th0.f16759a.A4();
            }
        } catch (RemoteException e10) {
            e.A("Clearcut log failed", e10);
        }
        return Boolean.TRUE;
    }

    public long f(fd0 fd0) throws IOException, InterruptedException {
        gt gtVar = (gt) fd0;
        int i10 = 0;
        gtVar.b(((w60) this.f8122b).f17220a, 0, 1);
        byte b10 = ((w60) this.f8122b).f17220a[0] & 255;
        if (b10 == 0) {
            return Long.MIN_VALUE;
        }
        int i11 = 128;
        int i12 = 0;
        while ((b10 & i11) == 0) {
            i11 >>= 1;
            i12++;
        }
        int i13 = b10 & (i11 ^ -1);
        gtVar.b(((w60) this.f8122b).f17220a, 1, i12);
        while (i10 < i12) {
            i10++;
            i13 = (((w60) this.f8122b).f17220a[i10] & 255) + (i13 << 8);
        }
        this.f8121a = i12 + 1 + this.f8121a;
        return (long) i13;
    }

    public se(k9.a aVar, int i10) {
        this.f8122b = aVar;
        this.f8121a = i10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public se(int i10, q.e eVar) {
        this(32);
        if (i10 != 7) {
            this.f8122b = new w60(8);
        }
    }

    public se(l5 l5Var, int i10) {
        this.f8122b = l5Var;
        this.f8121a = i10;
    }

    public se(eu euVar, int i10) {
        this.f8122b = euVar;
        this.f8121a = i10;
    }

    public se(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i10 = 3;
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals("description")) {
                str = jsonReader.nextString();
            } else if (!nextName.equals("code")) {
                jsonReader.skipValue();
            } else {
                i10 = jsonReader.nextInt();
            }
        }
        jsonReader.endObject();
        this.f8121a = i10;
        this.f8122b = str;
    }

    public se(int i10) {
        this.f8122b = new long[32];
    }

    public se(List list, int i10) {
        this.f8122b = list;
        this.f8121a = i10;
    }
}

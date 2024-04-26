package com.google.android.gms.internal.ads;

import e8.ag0;
import e8.bg0;
import e8.cc0;
import e8.w60;
import e8.xf0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class mu {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f7507a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7508b;

    /* renamed from: c  reason: collision with root package name */
    public final float f7509c;

    public mu(List<byte[]> list, int i10, int i11, int i12, float f10) {
        this.f7507a = list;
        this.f7508b = i10;
        this.f7509c = f10;
    }

    public static mu a(w60 w60) throws cc0 {
        float f10;
        int i10;
        int i11;
        try {
            w60.i(4);
            int d10 = (w60.d() & 3) + 1;
            if (d10 != 3) {
                ArrayList arrayList = new ArrayList();
                int d11 = w60.d() & 31;
                for (int i12 = 0; i12 < d11; i12++) {
                    arrayList.add(b(w60));
                }
                int d12 = w60.d();
                for (int i13 = 0; i13 < d12; i13++) {
                    arrayList.add(b(w60));
                }
                if (d11 > 0) {
                    ag0 a10 = bg0.a((byte[]) arrayList.get(0), d10, ((byte[]) arrayList.get(0)).length);
                    int i14 = a10.f13721a;
                    int i15 = a10.f13722b;
                    f10 = a10.f13723c;
                    i11 = i14;
                    i10 = i15;
                } else {
                    i11 = -1;
                    i10 = -1;
                    f10 = 1.0f;
                }
                return new mu(arrayList, d10, i11, i10, f10);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new cc0("Error parsing AVC config", e10);
        }
    }

    public static byte[] b(w60 w60) {
        int e10 = w60.e();
        int i10 = w60.f17221b;
        w60.i(e10);
        byte[] bArr = w60.f17220a;
        byte[] bArr2 = xf0.f17486a;
        byte[] bArr3 = new byte[(bArr2.length + e10)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, bArr2.length, e10);
        return bArr3;
    }
}

package com.google.android.gms.internal.ads;

import e8.lc0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class at implements ys {

    /* renamed from: b  reason: collision with root package name */
    public int f5975b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f5976c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int[] f5977d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5978e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f5979f;

    /* renamed from: g  reason: collision with root package name */
    public ByteBuffer f5980g;

    /* renamed from: h  reason: collision with root package name */
    public ByteBuffer f5981h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5982i;

    public at() {
        ByteBuffer byteBuffer = ys.f8641a;
        this.f5980g = byteBuffer;
        this.f5981h = byteBuffer;
    }

    public final boolean a() {
        return this.f5978e;
    }

    public final void b() {
        flush();
        this.f5980g = ys.f8641a;
        this.f5975b = -1;
        this.f5976c = -1;
        this.f5979f = null;
        this.f5978e = false;
    }

    public final int c() {
        int[] iArr = this.f5979f;
        return iArr == null ? this.f5975b : iArr.length;
    }

    public final boolean d(int i10, int i11, int i12) throws lc0 {
        boolean z10 = !Arrays.equals(this.f5977d, this.f5979f);
        int[] iArr = this.f5977d;
        this.f5979f = iArr;
        if (iArr == null) {
            this.f5978e = false;
            return z10;
        } else if (i12 != 2) {
            throw new lc0(i10, i11, i12);
        } else if (!z10 && this.f5976c == i10 && this.f5975b == i11) {
            return false;
        } else {
            this.f5976c = i10;
            this.f5975b = i11;
            this.f5978e = i11 != iArr.length;
            int i13 = 0;
            while (true) {
                int[] iArr2 = this.f5979f;
                if (i13 >= iArr2.length) {
                    return true;
                }
                int i14 = iArr2[i13];
                if (i14 < i11) {
                    this.f5978e = (i14 != i13) | this.f5978e;
                    i13++;
                } else {
                    throw new lc0(i10, i11, i12);
                }
            }
        }
    }

    public final int e() {
        return 2;
    }

    public final boolean f() {
        return this.f5982i && this.f5981h == ys.f8641a;
    }

    public final void flush() {
        this.f5981h = ys.f8641a;
        this.f5982i = false;
    }

    public final void g() {
        this.f5982i = true;
    }

    public final void h(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = (((limit - position) / (this.f5975b * 2)) * this.f5979f.length) << 1;
        if (this.f5980g.capacity() < length) {
            this.f5980g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f5980g.clear();
        }
        while (position < limit) {
            for (int i10 : this.f5979f) {
                this.f5980g.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.f5975b << 1;
        }
        byteBuffer.position(limit);
        this.f5980g.flip();
        this.f5981h = this.f5980g;
    }

    public final ByteBuffer i() {
        ByteBuffer byteBuffer = this.f5981h;
        this.f5981h = ys.f8641a;
        return byteBuffer;
    }
}

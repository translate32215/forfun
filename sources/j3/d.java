package j3;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* compiled from: GifHeaderParser */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f19507a = new byte[256];

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f19508b;

    /* renamed from: c  reason: collision with root package name */
    public c f19509c;

    /* renamed from: d  reason: collision with root package name */
    public int f19510d = 0;

    public final boolean a() {
        return this.f19509c.f19497b != 0;
    }

    public c b() {
        if (this.f19508b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (a()) {
            return this.f19509c;
        } else {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < 6; i10++) {
                sb2.append((char) c());
            }
            if (!sb2.toString().startsWith("GIF")) {
                this.f19509c.f19497b = 1;
            } else {
                this.f19509c.f19501f = f();
                this.f19509c.f19502g = f();
                int c10 = c();
                c cVar = this.f19509c;
                cVar.f19503h = (c10 & 128) != 0;
                cVar.f19504i = (int) Math.pow(2.0d, (double) ((c10 & 7) + 1));
                this.f19509c.f19505j = c();
                c cVar2 = this.f19509c;
                c();
                cVar2.getClass();
                if (this.f19509c.f19503h && !a()) {
                    c cVar3 = this.f19509c;
                    cVar3.f19496a = e(cVar3.f19504i);
                    c cVar4 = this.f19509c;
                    cVar4.f19506k = cVar4.f19496a[cVar4.f19505j];
                }
            }
            if (!a()) {
                boolean z10 = false;
                while (!z10 && !a() && this.f19509c.f19498c <= Integer.MAX_VALUE) {
                    int c11 = c();
                    if (c11 == 33) {
                        int c12 = c();
                        if (c12 == 1) {
                            g();
                        } else if (c12 == 249) {
                            this.f19509c.f19499d = new b();
                            c();
                            int c13 = c();
                            b bVar = this.f19509c.f19499d;
                            int i11 = (c13 & 28) >> 2;
                            bVar.f19491g = i11;
                            if (i11 == 0) {
                                bVar.f19491g = 1;
                            }
                            bVar.f19490f = (c13 & 1) != 0;
                            int f10 = f();
                            if (f10 < 2) {
                                f10 = 10;
                            }
                            b bVar2 = this.f19509c.f19499d;
                            bVar2.f19493i = f10 * 10;
                            bVar2.f19492h = c();
                            c();
                        } else if (c12 == 254) {
                            g();
                        } else if (c12 != 255) {
                            g();
                        } else {
                            d();
                            StringBuilder sb3 = new StringBuilder();
                            for (int i12 = 0; i12 < 11; i12++) {
                                sb3.append((char) this.f19507a[i12]);
                            }
                            if (sb3.toString().equals("NETSCAPE2.0")) {
                                do {
                                    d();
                                    byte[] bArr = this.f19507a;
                                    if (bArr[0] == 1) {
                                        byte b10 = bArr[1];
                                        byte b11 = bArr[2];
                                        this.f19509c.getClass();
                                    }
                                    if (this.f19510d <= 0) {
                                        break;
                                    }
                                } while (a());
                            } else {
                                g();
                            }
                        }
                    } else if (c11 == 44) {
                        c cVar5 = this.f19509c;
                        if (cVar5.f19499d == null) {
                            cVar5.f19499d = new b();
                        }
                        cVar5.f19499d.f19485a = f();
                        this.f19509c.f19499d.f19486b = f();
                        this.f19509c.f19499d.f19487c = f();
                        this.f19509c.f19499d.f19488d = f();
                        int c14 = c();
                        boolean z11 = (c14 & 128) != 0;
                        int pow = (int) Math.pow(2.0d, (double) ((c14 & 7) + 1));
                        b bVar3 = this.f19509c.f19499d;
                        bVar3.f19489e = (c14 & 64) != 0;
                        if (z11) {
                            bVar3.f19495k = e(pow);
                        } else {
                            bVar3.f19495k = null;
                        }
                        this.f19509c.f19499d.f19494j = this.f19508b.position();
                        c();
                        g();
                        if (!a()) {
                            c cVar6 = this.f19509c;
                            cVar6.f19498c++;
                            cVar6.f19500e.add(cVar6.f19499d);
                        }
                    } else if (c11 != 59) {
                        this.f19509c.f19497b = 1;
                    } else {
                        z10 = true;
                    }
                }
                c cVar7 = this.f19509c;
                if (cVar7.f19498c < 0) {
                    cVar7.f19497b = 1;
                }
            }
            return this.f19509c;
        }
    }

    public final int c() {
        try {
            return this.f19508b.get() & 255;
        } catch (Exception unused) {
            this.f19509c.f19497b = 1;
            return 0;
        }
    }

    public final void d() {
        int c10 = c();
        this.f19510d = c10;
        if (c10 > 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                try {
                    int i12 = this.f19510d;
                    if (i10 < i12) {
                        i11 = i12 - i10;
                        this.f19508b.get(this.f19507a, i10, i11);
                        i10 += i11;
                    } else {
                        return;
                    }
                } catch (Exception e10) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i10 + " count: " + i11 + " blockSize: " + this.f19510d, e10);
                    }
                    this.f19509c.f19497b = 1;
                    return;
                }
            }
        }
    }

    public final int[] e(int i10) {
        byte[] bArr = new byte[(i10 * 3)];
        int[] iArr = null;
        try {
            this.f19508b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = i12 + 1;
                int i14 = i13 + 1;
                int i15 = i14 + 1;
                int i16 = i11 + 1;
                iArr[i11] = ((bArr[i12] & 255) << 16) | -16777216 | ((bArr[i13] & 255) << 8) | (bArr[i14] & 255);
                i12 = i15;
                i11 = i16;
            }
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e10);
            }
            this.f19509c.f19497b = 1;
        }
        return iArr;
    }

    public final int f() {
        return this.f19508b.getShort();
    }

    public final void g() {
        int c10;
        do {
            c10 = c();
            this.f19508b.position(Math.min(this.f19508b.position() + c10, this.f19508b.limit()));
        } while (c10 > 0);
    }
}

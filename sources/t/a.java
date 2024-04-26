package t;

import j.f;
import java.util.Arrays;
import n2.g;
import t.b;

/* compiled from: ArrayLinkedVariables */
public class a implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public int f25264a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final b f25265b;

    /* renamed from: c  reason: collision with root package name */
    public final g f25266c;

    /* renamed from: d  reason: collision with root package name */
    public int f25267d = 8;

    /* renamed from: e  reason: collision with root package name */
    public int[] f25268e = new int[8];

    /* renamed from: f  reason: collision with root package name */
    public int[] f25269f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public float[] f25270g = new float[8];

    /* renamed from: h  reason: collision with root package name */
    public int f25271h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f25272i = -1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f25273j = false;

    public a(b bVar, g gVar) {
        this.f25265b = bVar;
        this.f25266c = gVar;
    }

    public float a(int i10) {
        int i11 = this.f25271h;
        int i12 = 0;
        while (i11 != -1 && i12 < this.f25264a) {
            if (i12 == i10) {
                return this.f25270g[i11];
            }
            i11 = this.f25269f[i11];
            i12++;
        }
        return 0.0f;
    }

    public float b(b bVar, boolean z10) {
        float e10 = e(bVar.f25274a);
        c(bVar.f25274a, z10);
        b.a aVar = bVar.f25277d;
        int f10 = aVar.f();
        for (int i10 = 0; i10 < f10; i10++) {
            h h10 = aVar.h(i10);
            j(h10, aVar.e(h10) * e10, z10);
        }
        return e10;
    }

    public final float c(h hVar, boolean z10) {
        int i10 = this.f25271h;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f25264a) {
            if (this.f25268e[i10] == hVar.f25313b) {
                if (i10 == this.f25271h) {
                    this.f25271h = this.f25269f[i10];
                } else {
                    int[] iArr = this.f25269f;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    hVar.b(this.f25265b);
                }
                hVar.f25323t--;
                this.f25264a--;
                this.f25268e[i10] = -1;
                if (this.f25273j) {
                    this.f25272i = i10;
                }
                return this.f25270g[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f25269f[i10];
        }
        return 0.0f;
    }

    public final void clear() {
        int i10 = this.f25271h;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f25264a) {
            h hVar = ((h[]) this.f25266c.f21853d)[this.f25268e[i10]];
            if (hVar != null) {
                hVar.b(this.f25265b);
            }
            i10 = this.f25269f[i10];
            i11++;
        }
        this.f25271h = -1;
        this.f25272i = -1;
        this.f25273j = false;
        this.f25264a = 0;
    }

    public final void d(h hVar, float f10) {
        if (f10 == 0.0f) {
            c(hVar, true);
            return;
        }
        int i10 = this.f25271h;
        if (i10 == -1) {
            this.f25271h = 0;
            this.f25270g[0] = f10;
            this.f25268e[0] = hVar.f25313b;
            this.f25269f[0] = -1;
            hVar.f25323t++;
            hVar.a(this.f25265b);
            this.f25264a++;
            if (!this.f25273j) {
                int i11 = this.f25272i + 1;
                this.f25272i = i11;
                int[] iArr = this.f25268e;
                if (i11 >= iArr.length) {
                    this.f25273j = true;
                    this.f25272i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i12 = 0;
        int i13 = -1;
        while (i10 != -1 && i12 < this.f25264a) {
            int[] iArr2 = this.f25268e;
            int i14 = iArr2[i10];
            int i15 = hVar.f25313b;
            if (i14 == i15) {
                this.f25270g[i10] = f10;
                return;
            }
            if (iArr2[i10] < i15) {
                i13 = i10;
            }
            i10 = this.f25269f[i10];
            i12++;
        }
        int i16 = this.f25272i;
        int i17 = i16 + 1;
        if (this.f25273j) {
            int[] iArr3 = this.f25268e;
            if (iArr3[i16] != -1) {
                i16 = iArr3.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr4 = this.f25268e;
        if (i16 >= iArr4.length && this.f25264a < iArr4.length) {
            int i18 = 0;
            while (true) {
                int[] iArr5 = this.f25268e;
                if (i18 >= iArr5.length) {
                    break;
                } else if (iArr5[i18] == -1) {
                    i16 = i18;
                    break;
                } else {
                    i18++;
                }
            }
        }
        int[] iArr6 = this.f25268e;
        if (i16 >= iArr6.length) {
            i16 = iArr6.length;
            int i19 = this.f25267d * 2;
            this.f25267d = i19;
            this.f25273j = false;
            this.f25272i = i16 - 1;
            this.f25270g = Arrays.copyOf(this.f25270g, i19);
            this.f25268e = Arrays.copyOf(this.f25268e, this.f25267d);
            this.f25269f = Arrays.copyOf(this.f25269f, this.f25267d);
        }
        this.f25268e[i16] = hVar.f25313b;
        this.f25270g[i16] = f10;
        if (i13 != -1) {
            int[] iArr7 = this.f25269f;
            iArr7[i16] = iArr7[i13];
            iArr7[i13] = i16;
        } else {
            this.f25269f[i16] = this.f25271h;
            this.f25271h = i16;
        }
        hVar.f25323t++;
        hVar.a(this.f25265b);
        int i20 = this.f25264a + 1;
        this.f25264a = i20;
        if (!this.f25273j) {
            this.f25272i++;
        }
        int[] iArr8 = this.f25268e;
        if (i20 >= iArr8.length) {
            this.f25273j = true;
        }
        if (this.f25272i >= iArr8.length) {
            this.f25273j = true;
            this.f25272i = iArr8.length - 1;
        }
    }

    public final float e(h hVar) {
        int i10 = this.f25271h;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f25264a) {
            if (this.f25268e[i10] == hVar.f25313b) {
                return this.f25270g[i10];
            }
            i10 = this.f25269f[i10];
            i11++;
        }
        return 0.0f;
    }

    public int f() {
        return this.f25264a;
    }

    public boolean g(h hVar) {
        int i10 = this.f25271h;
        if (i10 == -1) {
            return false;
        }
        int i11 = 0;
        while (i10 != -1 && i11 < this.f25264a) {
            if (this.f25268e[i10] == hVar.f25313b) {
                return true;
            }
            i10 = this.f25269f[i10];
            i11++;
        }
        return false;
    }

    public h h(int i10) {
        int i11 = this.f25271h;
        int i12 = 0;
        while (i11 != -1 && i12 < this.f25264a) {
            if (i12 == i10) {
                return ((h[]) this.f25266c.f21853d)[this.f25268e[i11]];
            }
            i11 = this.f25269f[i11];
            i12++;
        }
        return null;
    }

    public void i(float f10) {
        int i10 = this.f25271h;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f25264a) {
            float[] fArr = this.f25270g;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f25269f[i10];
            i11++;
        }
    }

    public void j(h hVar, float f10, boolean z10) {
        if (f10 <= -0.001f || f10 >= 0.001f) {
            int i10 = this.f25271h;
            if (i10 == -1) {
                this.f25271h = 0;
                this.f25270g[0] = f10;
                this.f25268e[0] = hVar.f25313b;
                this.f25269f[0] = -1;
                hVar.f25323t++;
                hVar.a(this.f25265b);
                this.f25264a++;
                if (!this.f25273j) {
                    int i11 = this.f25272i + 1;
                    this.f25272i = i11;
                    int[] iArr = this.f25268e;
                    if (i11 >= iArr.length) {
                        this.f25273j = true;
                        this.f25272i = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i12 = 0;
            int i13 = -1;
            while (i10 != -1 && i12 < this.f25264a) {
                int[] iArr2 = this.f25268e;
                int i14 = iArr2[i10];
                int i15 = hVar.f25313b;
                if (i14 == i15) {
                    float[] fArr = this.f25270g;
                    float f11 = fArr[i10] + f10;
                    if (f11 > -0.001f && f11 < 0.001f) {
                        f11 = 0.0f;
                    }
                    fArr[i10] = f11;
                    if (f11 == 0.0f) {
                        if (i10 == this.f25271h) {
                            this.f25271h = this.f25269f[i10];
                        } else {
                            int[] iArr3 = this.f25269f;
                            iArr3[i13] = iArr3[i10];
                        }
                        if (z10) {
                            hVar.b(this.f25265b);
                        }
                        if (this.f25273j) {
                            this.f25272i = i10;
                        }
                        hVar.f25323t--;
                        this.f25264a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i10] < i15) {
                    i13 = i10;
                }
                i10 = this.f25269f[i10];
                i12++;
            }
            int i16 = this.f25272i;
            int i17 = i16 + 1;
            if (this.f25273j) {
                int[] iArr4 = this.f25268e;
                if (iArr4[i16] != -1) {
                    i16 = iArr4.length;
                }
            } else {
                i16 = i17;
            }
            int[] iArr5 = this.f25268e;
            if (i16 >= iArr5.length && this.f25264a < iArr5.length) {
                int i18 = 0;
                while (true) {
                    int[] iArr6 = this.f25268e;
                    if (i18 >= iArr6.length) {
                        break;
                    } else if (iArr6[i18] == -1) {
                        i16 = i18;
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            int[] iArr7 = this.f25268e;
            if (i16 >= iArr7.length) {
                i16 = iArr7.length;
                int i19 = this.f25267d * 2;
                this.f25267d = i19;
                this.f25273j = false;
                this.f25272i = i16 - 1;
                this.f25270g = Arrays.copyOf(this.f25270g, i19);
                this.f25268e = Arrays.copyOf(this.f25268e, this.f25267d);
                this.f25269f = Arrays.copyOf(this.f25269f, this.f25267d);
            }
            this.f25268e[i16] = hVar.f25313b;
            this.f25270g[i16] = f10;
            if (i13 != -1) {
                int[] iArr8 = this.f25269f;
                iArr8[i16] = iArr8[i13];
                iArr8[i13] = i16;
            } else {
                this.f25269f[i16] = this.f25271h;
                this.f25271h = i16;
            }
            hVar.f25323t++;
            hVar.a(this.f25265b);
            this.f25264a++;
            if (!this.f25273j) {
                this.f25272i++;
            }
            int i20 = this.f25272i;
            int[] iArr9 = this.f25268e;
            if (i20 >= iArr9.length) {
                this.f25273j = true;
                this.f25272i = iArr9.length - 1;
            }
        }
    }

    public void k() {
        int i10 = this.f25271h;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f25264a) {
            float[] fArr = this.f25270g;
            fArr[i10] = fArr[i10] * -1.0f;
            i10 = this.f25269f[i10];
            i11++;
        }
    }

    public String toString() {
        int i10 = this.f25271h;
        String str = "";
        int i11 = 0;
        while (i10 != -1 && i11 < this.f25264a) {
            StringBuilder a10 = android.support.v4.media.a.a(f.a(str, " -> "));
            a10.append(this.f25270g[i10]);
            a10.append(" : ");
            StringBuilder a11 = android.support.v4.media.a.a(a10.toString());
            a11.append(((h[]) this.f25266c.f21853d)[this.f25268e[i10]]);
            str = a11.toString();
            i10 = this.f25269f[i10];
            i11++;
        }
        return str;
    }
}

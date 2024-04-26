package i6;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import androidx.appcompat.widget.d0;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import d5.b0;
import f0.j;
import h6.b;
import h6.e;
import h6.i;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import v6.v;

/* compiled from: Cea708Decoder */
public final class c extends d {

    /* renamed from: g  reason: collision with root package name */
    public final v f19272g = new v();

    /* renamed from: h  reason: collision with root package name */
    public final b0 f19273h = new b0();

    /* renamed from: i  reason: collision with root package name */
    public int f19274i = -1;

    /* renamed from: j  reason: collision with root package name */
    public final int f19275j;

    /* renamed from: k  reason: collision with root package name */
    public final b[] f19276k;

    /* renamed from: l  reason: collision with root package name */
    public b f19277l;

    /* renamed from: m  reason: collision with root package name */
    public List<h6.b> f19278m;

    /* renamed from: n  reason: collision with root package name */
    public List<h6.b> f19279n;

    /* renamed from: o  reason: collision with root package name */
    public C0163c f19280o;

    /* renamed from: p  reason: collision with root package name */
    public int f19281p;

    /* compiled from: Cea708Decoder */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final h6.b f19282a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19283b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            int i15;
            boolean z11;
            if (z10) {
                i15 = i13;
                z11 = true;
            } else {
                z11 = false;
                i15 = -16777216;
            }
            this.f19282a = new h6.b(charSequence, alignment, (Bitmap) null, f10, i10, i11, f11, i12, Integer.MIN_VALUE, -3.4028235E38f, f12, -3.4028235E38f, z11, i15, Integer.MIN_VALUE, 0.0f, (b.a) null);
            this.f19283b = i14;
        }
    }

    /* compiled from: Cea708Decoder */
    public static final class b {
        public static final int[] A = {3, 3, 3, 3, 3, 3, 1};
        public static final boolean[] B = {false, false, false, true, true, true, false};
        public static final int[] C;
        public static final int[] D = {0, 1, 2, 3, 4, 3, 4};
        public static final int[] E = {0, 0, 0, 0, 0, 3, 3};
        public static final int[] F;

        /* renamed from: w  reason: collision with root package name */
        public static final int f19284w = d(2, 2, 2, 0);

        /* renamed from: x  reason: collision with root package name */
        public static final int f19285x;

        /* renamed from: y  reason: collision with root package name */
        public static final int[] f19286y = {0, 0, 0, 0, 0, 2, 0};

        /* renamed from: z  reason: collision with root package name */
        public static final int[] f19287z = {0, 0, 0, 0, 0, 0, 2};

        /* renamed from: a  reason: collision with root package name */
        public final List<SpannableString> f19288a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final SpannableStringBuilder f19289b = new SpannableStringBuilder();

        /* renamed from: c  reason: collision with root package name */
        public boolean f19290c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f19291d;

        /* renamed from: e  reason: collision with root package name */
        public int f19292e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f19293f;

        /* renamed from: g  reason: collision with root package name */
        public int f19294g;

        /* renamed from: h  reason: collision with root package name */
        public int f19295h;

        /* renamed from: i  reason: collision with root package name */
        public int f19296i;

        /* renamed from: j  reason: collision with root package name */
        public int f19297j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f19298k;

        /* renamed from: l  reason: collision with root package name */
        public int f19299l;

        /* renamed from: m  reason: collision with root package name */
        public int f19300m;

        /* renamed from: n  reason: collision with root package name */
        public int f19301n;

        /* renamed from: o  reason: collision with root package name */
        public int f19302o;

        /* renamed from: p  reason: collision with root package name */
        public int f19303p;

        /* renamed from: q  reason: collision with root package name */
        public int f19304q;

        /* renamed from: r  reason: collision with root package name */
        public int f19305r;

        /* renamed from: s  reason: collision with root package name */
        public int f19306s;

        /* renamed from: t  reason: collision with root package name */
        public int f19307t;

        /* renamed from: u  reason: collision with root package name */
        public int f19308u;

        /* renamed from: v  reason: collision with root package name */
        public int f19309v;

        static {
            int d10 = d(0, 0, 0, 0);
            f19285x = d10;
            int d11 = d(0, 0, 0, 3);
            C = new int[]{d10, d11, d10, d10, d11, d10, d10};
            F = new int[]{d10, d10, d10, d10, d10, d11, d11};
        }

        public b() {
            f();
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0031  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int d(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                v6.a.c(r4, r0, r1)
                v6.a.c(r5, r0, r1)
                v6.a.c(r6, r0, r1)
                v6.a.c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L_0x0021
                if (r7 == r1) goto L_0x0021
                r3 = 2
                if (r7 == r3) goto L_0x001e
                r3 = 3
                if (r7 == r3) goto L_0x001c
                goto L_0x0021
            L_0x001c:
                r7 = 0
                goto L_0x0023
            L_0x001e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L_0x0023
            L_0x0021:
                r7 = 255(0xff, float:3.57E-43)
            L_0x0023:
                if (r4 <= r1) goto L_0x0028
                r4 = 255(0xff, float:3.57E-43)
                goto L_0x0029
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r5 <= r1) goto L_0x002e
                r5 = 255(0xff, float:3.57E-43)
                goto L_0x002f
            L_0x002e:
                r5 = 0
            L_0x002f:
                if (r6 <= r1) goto L_0x0033
                r0 = 255(0xff, float:3.57E-43)
            L_0x0033:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: i6.c.b.d(int, int, int, int):int");
        }

        public void a(char c10) {
            if (c10 == 10) {
                this.f19288a.add(b());
                this.f19289b.clear();
                if (this.f19303p != -1) {
                    this.f19303p = 0;
                }
                if (this.f19304q != -1) {
                    this.f19304q = 0;
                }
                if (this.f19305r != -1) {
                    this.f19305r = 0;
                }
                if (this.f19307t != -1) {
                    this.f19307t = 0;
                }
                while (true) {
                    if ((this.f19298k && this.f19288a.size() >= this.f19297j) || this.f19288a.size() >= 15) {
                        this.f19288a.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                this.f19289b.append(c10);
            }
        }

        public SpannableString b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f19289b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f19303p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f19303p, length, 33);
                }
                if (this.f19304q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f19304q, length, 33);
                }
                if (this.f19305r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f19306s), this.f19305r, length, 33);
                }
                if (this.f19307t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f19308u), this.f19307t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void c() {
            this.f19288a.clear();
            this.f19289b.clear();
            this.f19303p = -1;
            this.f19304q = -1;
            this.f19305r = -1;
            this.f19307t = -1;
            this.f19309v = 0;
        }

        public boolean e() {
            return !this.f19290c || (this.f19288a.isEmpty() && this.f19289b.length() == 0);
        }

        public void f() {
            c();
            this.f19290c = false;
            this.f19291d = false;
            this.f19292e = 4;
            this.f19293f = false;
            this.f19294g = 0;
            this.f19295h = 0;
            this.f19296i = 0;
            this.f19297j = 15;
            this.f19298k = true;
            this.f19299l = 0;
            this.f19300m = 0;
            this.f19301n = 0;
            int i10 = f19285x;
            this.f19302o = i10;
            this.f19306s = f19284w;
            this.f19308u = i10;
        }

        public void g(boolean z10, boolean z11) {
            if (this.f19303p != -1) {
                if (!z10) {
                    this.f19289b.setSpan(new StyleSpan(2), this.f19303p, this.f19289b.length(), 33);
                    this.f19303p = -1;
                }
            } else if (z10) {
                this.f19303p = this.f19289b.length();
            }
            if (this.f19304q != -1) {
                if (!z11) {
                    this.f19289b.setSpan(new UnderlineSpan(), this.f19304q, this.f19289b.length(), 33);
                    this.f19304q = -1;
                }
            } else if (z11) {
                this.f19304q = this.f19289b.length();
            }
        }

        public void h(int i10, int i11) {
            if (!(this.f19305r == -1 || this.f19306s == i10)) {
                this.f19289b.setSpan(new ForegroundColorSpan(this.f19306s), this.f19305r, this.f19289b.length(), 33);
            }
            if (i10 != f19284w) {
                this.f19305r = this.f19289b.length();
                this.f19306s = i10;
            }
            if (!(this.f19307t == -1 || this.f19308u == i11)) {
                this.f19289b.setSpan(new BackgroundColorSpan(this.f19308u), this.f19307t, this.f19289b.length(), 33);
            }
            if (i11 != f19285x) {
                this.f19307t = this.f19289b.length();
                this.f19308u = i11;
            }
        }
    }

    /* renamed from: i6.c$c  reason: collision with other inner class name */
    /* compiled from: Cea708Decoder */
    public static final class C0163c {

        /* renamed from: a  reason: collision with root package name */
        public final int f19310a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19311b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f19312c;

        /* renamed from: d  reason: collision with root package name */
        public int f19313d = 0;

        public C0163c(int i10, int i11) {
            this.f19310a = i10;
            this.f19311b = i11;
            this.f19312c = new byte[((i11 * 2) - 1)];
        }
    }

    public c(int i10, List<byte[]> list) {
        this.f19275j = i10 == -1 ? 1 : i10;
        if (!(list == null || (list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1))) {
        }
        this.f19276k = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f19276k[i11] = new b();
        }
        this.f19277l = this.f19276k[0];
    }

    public e f() {
        List<h6.b> list = this.f19278m;
        this.f19279n = list;
        list.getClass();
        return new e(list, 0);
    }

    public void flush() {
        super.flush();
        this.f19278m = null;
        this.f19279n = null;
        this.f19281p = 0;
        this.f19277l = this.f19276k[0];
        m();
        this.f19280o = null;
    }

    public void g(i iVar) {
        ByteBuffer byteBuffer = iVar.f86c;
        byteBuffer.getClass();
        this.f19272g.B(byteBuffer.array(), byteBuffer.limit());
        while (this.f19272g.a() >= 3) {
            int s10 = this.f19272g.s() & 7;
            int i10 = s10 & 3;
            boolean z10 = false;
            boolean z11 = (s10 & 4) == 4;
            byte s11 = (byte) this.f19272g.s();
            byte s12 = (byte) this.f19272g.s();
            if ((i10 == 2 || i10 == 3) && z11) {
                if (i10 == 3) {
                    k();
                    int i11 = (s11 & 192) >> 6;
                    int i12 = this.f19274i;
                    if (!(i12 == -1 || i11 == (i12 + 1) % 4)) {
                        m();
                        Log.w("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f19274i + " current=" + i11);
                    }
                    this.f19274i = i11;
                    byte b10 = s11 & 63;
                    if (b10 == 0) {
                        b10 = 64;
                    }
                    C0163c cVar = new C0163c(i11, b10);
                    this.f19280o = cVar;
                    byte[] bArr = cVar.f19312c;
                    int i13 = cVar.f19313d;
                    cVar.f19313d = i13 + 1;
                    bArr[i13] = s12;
                } else {
                    if (i10 == 2) {
                        z10 = true;
                    }
                    v6.a.a(z10);
                    C0163c cVar2 = this.f19280o;
                    if (cVar2 == null) {
                        Log.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        byte[] bArr2 = cVar2.f19312c;
                        int i14 = cVar2.f19313d;
                        int i15 = i14 + 1;
                        cVar2.f19313d = i15;
                        bArr2[i14] = s11;
                        cVar2.f19313d = i15 + 1;
                        bArr2[i15] = s12;
                    }
                }
                C0163c cVar3 = this.f19280o;
                if (cVar3.f19313d == (cVar3.f19311b * 2) - 1) {
                    k();
                }
            }
        }
    }

    public boolean i() {
        return this.f19278m != this.f19279n;
    }

    public final void k() {
        C0163c cVar = this.f19280o;
        if (cVar != null) {
            if (cVar.f19313d != (cVar.f19311b * 2) - 1) {
                StringBuilder a10 = android.support.v4.media.a.a("DtvCcPacket ended prematurely; size is ");
                a10.append((this.f19280o.f19311b * 2) - 1);
                a10.append(", but current index is ");
                a10.append(this.f19280o.f19313d);
                a10.append(" (sequence number ");
                a10.append(this.f19280o.f19310a);
                a10.append(");");
                Log.d("Cea708Decoder", a10.toString());
            }
            b0 b0Var = this.f19273h;
            C0163c cVar2 = this.f19280o;
            b0Var.n(cVar2.f19312c, cVar2.f19313d);
            int i10 = 3;
            int i11 = this.f19273h.i(3);
            int i12 = this.f19273h.i(5);
            int i13 = 7;
            int i14 = 6;
            if (i11 == 7) {
                this.f19273h.s(2);
                i11 = this.f19273h.i(6);
                if (i11 < 7) {
                    j.a("Invalid extended service number: ", i11, "Cea708Decoder");
                }
            }
            if (i12 == 0) {
                if (i11 != 0) {
                    Log.w("Cea708Decoder", "serviceNumber is non-zero (" + i11 + ") when blockSize is 0");
                }
            } else if (i11 == this.f19275j) {
                boolean z10 = false;
                while (this.f19273h.b() > 0) {
                    int i15 = this.f19273h.i(8);
                    if (i15 != 16) {
                        if (i15 <= 31) {
                            if (i15 != 0) {
                                if (i15 == i10) {
                                    this.f19278m = l();
                                } else if (i15 != 8) {
                                    switch (i15) {
                                        case 12:
                                            m();
                                            break;
                                        case 13:
                                            this.f19277l.a(10);
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (i15 < 17 || i15 > 23) {
                                                if (i15 >= 24 && i15 <= 31) {
                                                    j.a("Currently unsupported COMMAND_P16 Command: ", i15, "Cea708Decoder");
                                                    this.f19273h.s(16);
                                                    break;
                                                } else {
                                                    j.a("Invalid C0 command: ", i15, "Cea708Decoder");
                                                    break;
                                                }
                                            } else {
                                                j.a("Currently unsupported COMMAND_EXT1 Command: ", i15, "Cea708Decoder");
                                                this.f19273h.s(8);
                                                break;
                                            }
                                    }
                                } else {
                                    b bVar = this.f19277l;
                                    int length = bVar.f19289b.length();
                                    if (length > 0) {
                                        bVar.f19289b.delete(length - 1, length);
                                    }
                                }
                            }
                        } else if (i15 <= 127) {
                            if (i15 == 127) {
                                this.f19277l.a(9835);
                            } else {
                                this.f19277l.a((char) (i15 & 255));
                            }
                        } else if (i15 <= 159) {
                            switch (i15) {
                                case 128:
                                case 129:
                                case 130:
                                case 131:
                                case 132:
                                case 133:
                                case 134:
                                case 135:
                                    int i16 = i15 - 128;
                                    if (this.f19281p != i16) {
                                        this.f19281p = i16;
                                        this.f19277l = this.f19276k[i16];
                                        break;
                                    }
                                    break;
                                case 136:
                                    for (int i17 = 1; i17 <= 8; i17++) {
                                        if (this.f19273h.h()) {
                                            this.f19276k[8 - i17].c();
                                        }
                                    }
                                    break;
                                case 137:
                                    for (int i18 = 1; i18 <= 8; i18++) {
                                        if (this.f19273h.h()) {
                                            this.f19276k[8 - i18].f19291d = true;
                                        }
                                    }
                                    break;
                                case 138:
                                    for (int i19 = 1; i19 <= 8; i19++) {
                                        if (this.f19273h.h()) {
                                            this.f19276k[8 - i19].f19291d = false;
                                        }
                                    }
                                    break;
                                case 139:
                                    for (int i20 = 1; i20 <= 8; i20++) {
                                        if (this.f19273h.h()) {
                                            b bVar2 = this.f19276k[8 - i20];
                                            bVar2.f19291d = !bVar2.f19291d;
                                        }
                                    }
                                    break;
                                case 140:
                                    for (int i21 = 1; i21 <= 8; i21++) {
                                        if (this.f19273h.h()) {
                                            this.f19276k[8 - i21].f();
                                        }
                                    }
                                    break;
                                case 141:
                                    this.f19273h.s(8);
                                    break;
                                case 142:
                                    break;
                                case 143:
                                    m();
                                    break;
                                case 144:
                                    if (this.f19277l.f19290c) {
                                        this.f19273h.i(4);
                                        this.f19273h.i(2);
                                        this.f19273h.i(2);
                                        boolean h10 = this.f19273h.h();
                                        boolean h11 = this.f19273h.h();
                                        this.f19273h.i(3);
                                        this.f19273h.i(3);
                                        this.f19277l.g(h10, h11);
                                        break;
                                    } else {
                                        this.f19273h.s(16);
                                        break;
                                    }
                                case 145:
                                    if (this.f19277l.f19290c) {
                                        int d10 = b.d(this.f19273h.i(2), this.f19273h.i(2), this.f19273h.i(2), this.f19273h.i(2));
                                        int d11 = b.d(this.f19273h.i(2), this.f19273h.i(2), this.f19273h.i(2), this.f19273h.i(2));
                                        this.f19273h.s(2);
                                        b.d(this.f19273h.i(2), this.f19273h.i(2), this.f19273h.i(2), 0);
                                        this.f19277l.h(d10, d11);
                                        break;
                                    } else {
                                        this.f19273h.s(24);
                                        break;
                                    }
                                case 146:
                                    if (this.f19277l.f19290c) {
                                        this.f19273h.s(4);
                                        int i22 = this.f19273h.i(4);
                                        this.f19273h.s(2);
                                        this.f19273h.i(6);
                                        b bVar3 = this.f19277l;
                                        if (bVar3.f19309v != i22) {
                                            bVar3.a(10);
                                        }
                                        bVar3.f19309v = i22;
                                        break;
                                    } else {
                                        this.f19273h.s(16);
                                        break;
                                    }
                                case 151:
                                    if (this.f19277l.f19290c) {
                                        int d12 = b.d(this.f19273h.i(2), this.f19273h.i(2), this.f19273h.i(2), this.f19273h.i(2));
                                        this.f19273h.i(2);
                                        b.d(this.f19273h.i(2), this.f19273h.i(2), this.f19273h.i(2), 0);
                                        this.f19273h.h();
                                        this.f19273h.h();
                                        this.f19273h.i(2);
                                        this.f19273h.i(2);
                                        int i23 = this.f19273h.i(2);
                                        this.f19273h.s(8);
                                        b bVar4 = this.f19277l;
                                        bVar4.f19302o = d12;
                                        bVar4.f19299l = i23;
                                        break;
                                    } else {
                                        this.f19273h.s(32);
                                        break;
                                    }
                                case 152:
                                case 153:
                                case 154:
                                case 155:
                                case 156:
                                case 157:
                                case 158:
                                case 159:
                                    int i24 = i15 - 152;
                                    b bVar5 = this.f19276k[i24];
                                    this.f19273h.s(2);
                                    boolean h12 = this.f19273h.h();
                                    boolean h13 = this.f19273h.h();
                                    this.f19273h.h();
                                    int i25 = this.f19273h.i(i10);
                                    boolean h14 = this.f19273h.h();
                                    int i26 = this.f19273h.i(i13);
                                    int i27 = this.f19273h.i(8);
                                    int i28 = this.f19273h.i(4);
                                    int i29 = this.f19273h.i(4);
                                    this.f19273h.s(2);
                                    this.f19273h.i(i14);
                                    this.f19273h.s(2);
                                    int i30 = this.f19273h.i(i10);
                                    int i31 = this.f19273h.i(i10);
                                    bVar5.f19290c = true;
                                    bVar5.f19291d = h12;
                                    bVar5.f19298k = h13;
                                    bVar5.f19292e = i25;
                                    bVar5.f19293f = h14;
                                    bVar5.f19294g = i26;
                                    bVar5.f19295h = i27;
                                    bVar5.f19296i = i28;
                                    int i32 = i29 + 1;
                                    if (bVar5.f19297j != i32) {
                                        bVar5.f19297j = i32;
                                        while (true) {
                                            if ((h13 && bVar5.f19288a.size() >= bVar5.f19297j) || bVar5.f19288a.size() >= 15) {
                                                bVar5.f19288a.remove(0);
                                            }
                                        }
                                    }
                                    if (!(i30 == 0 || bVar5.f19300m == i30)) {
                                        bVar5.f19300m = i30;
                                        int i33 = i30 - 1;
                                        int i34 = b.C[i33];
                                        boolean z11 = b.B[i33];
                                        int i35 = b.f19287z[i33];
                                        int i36 = b.A[i33];
                                        int i37 = b.f19286y[i33];
                                        bVar5.f19302o = i34;
                                        bVar5.f19299l = i37;
                                    }
                                    if (!(i31 == 0 || bVar5.f19301n == i31)) {
                                        bVar5.f19301n = i31;
                                        int i38 = i31 - 1;
                                        int i39 = b.E[i38];
                                        int i40 = b.D[i38];
                                        bVar5.g(false, false);
                                        bVar5.h(b.f19284w, b.F[i38]);
                                    }
                                    if (this.f19281p != i24) {
                                        this.f19281p = i24;
                                        this.f19277l = this.f19276k[i24];
                                        break;
                                    }
                                    break;
                                default:
                                    Log.w("Cea708Decoder", d0.a("Invalid C1 command: ", i15));
                                    break;
                            }
                        } else if (i15 <= 255) {
                            this.f19277l.a((char) (i15 & 255));
                        } else {
                            j.a("Invalid base command: ", i15, "Cea708Decoder");
                        }
                        i10 = 3;
                        i13 = 7;
                        i14 = 6;
                    } else {
                        int i41 = this.f19273h.i(8);
                        if (i41 <= 31) {
                            if (i41 > 7) {
                                if (i41 <= 15) {
                                    this.f19273h.s(8);
                                } else if (i41 <= 23) {
                                    this.f19273h.s(16);
                                } else if (i41 <= 31) {
                                    this.f19273h.s(24);
                                }
                            }
                        } else if (i41 <= 127) {
                            if (i41 == 32) {
                                this.f19277l.a(' ');
                            } else if (i41 == 33) {
                                this.f19277l.a(160);
                            } else if (i41 == 37) {
                                this.f19277l.a(8230);
                            } else if (i41 == 42) {
                                this.f19277l.a(352);
                            } else if (i41 == 44) {
                                this.f19277l.a(338);
                            } else if (i41 == 63) {
                                this.f19277l.a(376);
                            } else if (i41 == 57) {
                                this.f19277l.a(8482);
                            } else if (i41 == 58) {
                                this.f19277l.a(353);
                            } else if (i41 == 60) {
                                this.f19277l.a(339);
                            } else if (i41 != 61) {
                                switch (i41) {
                                    case 48:
                                        this.f19277l.a(9608);
                                        break;
                                    case 49:
                                        this.f19277l.a(8216);
                                        break;
                                    case 50:
                                        this.f19277l.a(8217);
                                        break;
                                    case 51:
                                        this.f19277l.a(8220);
                                        break;
                                    case ModuleDescriptor.MODULE_VERSION:
                                        this.f19277l.a(8221);
                                        break;
                                    case 53:
                                        this.f19277l.a(8226);
                                        break;
                                    default:
                                        switch (i41) {
                                            case 118:
                                                this.f19277l.a(8539);
                                                break;
                                            case 119:
                                                this.f19277l.a(8540);
                                                break;
                                            case 120:
                                                this.f19277l.a(8541);
                                                break;
                                            case 121:
                                                this.f19277l.a(8542);
                                                break;
                                            case 122:
                                                this.f19277l.a(9474);
                                                break;
                                            case 123:
                                                this.f19277l.a(9488);
                                                break;
                                            case 124:
                                                this.f19277l.a(9492);
                                                break;
                                            case 125:
                                                this.f19277l.a(9472);
                                                break;
                                            case 126:
                                                this.f19277l.a(9496);
                                                break;
                                            case 127:
                                                this.f19277l.a(9484);
                                                break;
                                            default:
                                                j.a("Invalid G2 character: ", i41, "Cea708Decoder");
                                                break;
                                        }
                                }
                            } else {
                                this.f19277l.a(8480);
                            }
                        } else if (i41 <= 159) {
                            if (i41 <= 135) {
                                this.f19273h.s(32);
                            } else if (i41 <= 143) {
                                this.f19273h.s(40);
                            } else if (i41 <= 159) {
                                this.f19273h.s(2);
                                this.f19273h.s(this.f19273h.i(6) * 8);
                            }
                        } else if (i41 > 255) {
                            j.a("Invalid extended command: ", i41, "Cea708Decoder");
                        } else if (i41 == 160) {
                            this.f19277l.a(13252);
                        } else {
                            j.a("Invalid G3 character: ", i41, "Cea708Decoder");
                            this.f19277l.a('_');
                        }
                        i10 = 3;
                        i13 = 7;
                        i14 = 6;
                    }
                    z10 = true;
                    i10 = 3;
                    i13 = 7;
                    i14 = 6;
                }
                if (z10) {
                    this.f19278m = l();
                }
            }
            this.f19280o = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<h6.b> l() {
        /*
            r18 = this;
            r0 = r18
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 0
        L_0x0009:
            r4 = 8
            if (r3 >= r4) goto L_0x00f3
            i6.c$b[] r4 = r0.f19276k
            r4 = r4[r3]
            boolean r4 = r4.e()
            if (r4 != 0) goto L_0x00ef
            i6.c$b[] r4 = r0.f19276k
            r5 = r4[r3]
            boolean r5 = r5.f19291d
            if (r5 == 0) goto L_0x00ef
            r4 = r4[r3]
            boolean r5 = r4.e()
            if (r5 == 0) goto L_0x002a
            r4 = 0
            goto L_0x00ea
        L_0x002a:
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>()
            r5 = 0
        L_0x0030:
            java.util.List<android.text.SpannableString> r7 = r4.f19288a
            int r7 = r7.size()
            if (r5 >= r7) goto L_0x004b
            java.util.List<android.text.SpannableString> r7 = r4.f19288a
            java.lang.Object r7 = r7.get(r5)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r6.append(r7)
            r7 = 10
            r6.append(r7)
            int r5 = r5 + 1
            goto L_0x0030
        L_0x004b:
            android.text.SpannableString r5 = r4.b()
            r6.append(r5)
            int r5 = r4.f19299l
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L_0x007b
            if (r5 == r8) goto L_0x0078
            if (r5 == r7) goto L_0x0075
            r7 = 3
            if (r5 != r7) goto L_0x0060
            goto L_0x007b
        L_0x0060:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Unexpected justification value: "
            java.lang.StringBuilder r2 = android.support.v4.media.a.a(r2)
            int r3 = r4.f19299l
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0075:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x007d
        L_0x0078:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x007d
        L_0x007b:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
        L_0x007d:
            r7 = r5
            boolean r5 = r4.f19293f
            if (r5 == 0) goto L_0x008d
            int r5 = r4.f19295h
            float r5 = (float) r5
            r9 = 1120272384(0x42c60000, float:99.0)
            float r5 = r5 / r9
            int r10 = r4.f19294g
            float r10 = (float) r10
            float r10 = r10 / r9
            goto L_0x009a
        L_0x008d:
            int r5 = r4.f19295h
            float r5 = (float) r5
            r9 = 1129381888(0x43510000, float:209.0)
            float r5 = r5 / r9
            int r9 = r4.f19294g
            float r9 = (float) r9
            r10 = 1116995584(0x42940000, float:74.0)
            float r10 = r9 / r10
        L_0x009a:
            r9 = 1063675494(0x3f666666, float:0.9)
            float r5 = r5 * r9
            r11 = 1028443341(0x3d4ccccd, float:0.05)
            float r12 = r5 + r11
            float r10 = r10 * r9
            float r9 = r10 + r11
            int r5 = r4.f19296i
            int r10 = r5 / 3
            if (r10 != 0) goto L_0x00b0
            r10 = 0
            goto L_0x00b5
        L_0x00b0:
            if (r10 != r8) goto L_0x00b4
            r10 = 1
            goto L_0x00b5
        L_0x00b4:
            r10 = 2
        L_0x00b5:
            int r5 = r5 % 3
            if (r5 != 0) goto L_0x00bc
            r5 = 0
            r13 = 0
            goto L_0x00c3
        L_0x00bc:
            if (r5 != r8) goto L_0x00c1
            r5 = 1
            r13 = 1
            goto L_0x00c3
        L_0x00c1:
            r5 = 2
            r13 = 2
        L_0x00c3:
            int r5 = r4.f19302o
            int r8 = i6.c.b.f19285x
            if (r5 == r8) goto L_0x00cc
            r5 = 1
            r14 = 1
            goto L_0x00ce
        L_0x00cc:
            r5 = 0
            r14 = 0
        L_0x00ce:
            i6.c$a r17 = new i6.c$a
            r11 = 0
            r15 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r8 = r4.f19302o
            int r4 = r4.f19292e
            r5 = r17
            r16 = r8
            r8 = r9
            r9 = r11
            r11 = r12
            r12 = r13
            r13 = r15
            r15 = r16
            r16 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4 = r17
        L_0x00ea:
            if (r4 == 0) goto L_0x00ef
            r1.add(r4)
        L_0x00ef:
            int r3 = r3 + 1
            goto L_0x0009
        L_0x00f3:
            i6.b r3 = i6.b.f19269b
            java.util.Collections.sort(r1, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r1.size()
            r3.<init>(r4)
        L_0x0101:
            int r4 = r1.size()
            if (r2 >= r4) goto L_0x0115
            java.lang.Object r4 = r1.get(r2)
            i6.c$a r4 = (i6.c.a) r4
            h6.b r4 = r4.f19282a
            r3.add(r4)
            int r2 = r2 + 1
            goto L_0x0101
        L_0x0115:
            java.util.List r1 = java.util.Collections.unmodifiableList(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.c.l():java.util.List");
    }

    public final void m() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f19276k[i10].f();
        }
    }
}

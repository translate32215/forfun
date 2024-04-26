package p6;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import androidx.appcompat.widget.y0;
import h6.b;
import h6.c;
import h6.e;
import h6.g;
import java.util.List;
import v6.e0;
import v6.v;

/* compiled from: Tx3gDecoder */
public final class a extends c {

    /* renamed from: n  reason: collision with root package name */
    public final v f23937n = new v();

    /* renamed from: o  reason: collision with root package name */
    public final boolean f23938o;

    /* renamed from: p  reason: collision with root package name */
    public final int f23939p;

    /* renamed from: q  reason: collision with root package name */
    public final int f23940q;

    /* renamed from: r  reason: collision with root package name */
    public final String f23941r;

    /* renamed from: s  reason: collision with root package name */
    public final float f23942s;

    /* renamed from: t  reason: collision with root package name */
    public final int f23943t;

    public a(List<byte[]> list) {
        super("Tx3gDecoder");
        String str = "sans-serif";
        boolean z10 = true;
        if (list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.f23939p = bArr[24];
            this.f23940q = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f23941r = "Serif".equals(e0.p(bArr, 43, bArr.length - 43)) ? "serif" : str;
            int i10 = bArr[25] * 20;
            this.f23943t = i10;
            z10 = (bArr[0] & 32) == 0 ? false : z10;
            this.f23938o = z10;
            if (z10) {
                this.f23942s = e0.h(((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) i10), 0.0f, 0.95f);
            } else {
                this.f23942s = 0.85f;
            }
        } else {
            this.f23939p = 0;
            this.f23940q = -1;
            this.f23941r = str;
            this.f23938o = false;
            this.f23942s = 0.85f;
            this.f23943t = -1;
        }
    }

    public static void l(boolean z10) throws g {
        if (!z10) {
            throw new g("Unexpected subtitle format.");
        }
    }

    public static void m(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = true;
            boolean z11 = (i10 & 1) != 0;
            boolean z12 = (i10 & 2) != 0;
            if (z11) {
                if (z12) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z12) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            if ((i10 & 4) == 0) {
                z10 = false;
            }
            if (z10) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (!z10 && !z11 && !z12) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
            }
        }
    }

    public e k(byte[] bArr, int i10, boolean z10) throws g {
        String str;
        v vVar = this.f23937n;
        vVar.f26518a = bArr;
        vVar.f26520c = i10;
        vVar.f26519b = 0;
        int i11 = 2;
        int i12 = 1;
        l(vVar.a() >= 2);
        int x10 = vVar.x();
        if (x10 == 0) {
            str = "";
        } else {
            if (vVar.a() >= 2) {
                byte[] bArr2 = vVar.f26518a;
                int i13 = vVar.f26519b;
                char c10 = (char) ((bArr2[i13 + 1] & 255) | ((bArr2[i13] & 255) << 8));
                if (c10 == 65279 || c10 == 65534) {
                    str = vVar.q(x10, aa.c.f180e);
                }
            }
            str = vVar.q(x10, aa.c.f178c);
        }
        if (str.isEmpty()) {
            return b.f23944b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        m(spannableStringBuilder, this.f23939p, 0, 0, spannableStringBuilder.length(), 16711680);
        int i14 = this.f23940q;
        int length = spannableStringBuilder.length();
        if (i14 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i14 >>> 8) | ((i14 & 255) << 24)), 0, length, 16711713);
        }
        String str2 = this.f23941r;
        int length2 = spannableStringBuilder.length();
        if (str2 != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str2), 0, length2, 16711713);
        }
        float f10 = this.f23942s;
        for (int i15 = 8; this.f23937n.a() >= i15; i15 = 8) {
            v vVar2 = this.f23937n;
            int i16 = vVar2.f26519b;
            int f11 = vVar2.f();
            int f12 = this.f23937n.f();
            if (f12 == 1937013100) {
                l(this.f23937n.a() >= i11);
                int x11 = this.f23937n.x();
                int i17 = 0;
                while (i17 < x11) {
                    v vVar3 = this.f23937n;
                    l(vVar3.a() >= 12);
                    int x12 = vVar3.x();
                    int x13 = vVar3.x();
                    vVar3.E(i11);
                    int s10 = vVar3.s();
                    vVar3.E(i12);
                    int f13 = vVar3.f();
                    if (x13 > spannableStringBuilder.length()) {
                        StringBuilder a10 = y0.a("Truncating styl end (", x13, ") to cueText.length() (");
                        a10.append(spannableStringBuilder.length());
                        a10.append(").");
                        Log.w("Tx3gDecoder", a10.toString());
                        x13 = spannableStringBuilder.length();
                    }
                    int i18 = x13;
                    if (x12 >= i18) {
                        Log.w("Tx3gDecoder", "Ignoring styl with start (" + x12 + ") >= end (" + i18 + ").");
                    } else {
                        m(spannableStringBuilder, s10, this.f23939p, x12, i18, 0);
                        if (f13 != this.f23940q) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(((f13 & 255) << 24) | (f13 >>> 8)), x12, i18, 33);
                        }
                    }
                    i17++;
                    i11 = 2;
                    i12 = 1;
                }
            } else if (f12 == 1952608120 && this.f23938o) {
                l(this.f23937n.a() >= 2);
                f10 = e0.h(((float) this.f23937n.x()) / ((float) this.f23943t), 0.0f, 0.95f);
            }
            this.f23937n.D(i16 + f11);
            i11 = 2;
            i12 = 1;
        }
        b bVar = r2;
        b bVar2 = new b(spannableStringBuilder, (Layout.Alignment) null, (Bitmap) null, f10, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, (b.a) null);
        return new b(bVar);
    }
}

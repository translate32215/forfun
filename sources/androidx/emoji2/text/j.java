package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import q.a;

/* compiled from: EmojiSpan */
public abstract class j extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public final Paint.FontMetricsInt f1545a = new Paint.FontMetricsInt();

    /* renamed from: b  reason: collision with root package name */
    public final h f1546b;

    /* renamed from: c  reason: collision with root package name */
    public short f1547c = -1;

    /* renamed from: d  reason: collision with root package name */
    public float f1548d = 1.0f;

    public j(h hVar) {
        a.f(hVar, "metadata cannot be null");
        this.f1546b = hVar;
    }

    public int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f1545a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f1545a;
        this.f1548d = (((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f) / ((float) this.f1546b.c());
        this.f1546b.c();
        y0.a e10 = this.f1546b.e();
        int a10 = e10.a(12);
        short s10 = (short) ((int) (((float) (a10 != 0 ? e10.f27976b.getShort(a10 + e10.f27975a) : 0)) * this.f1548d));
        this.f1547c = s10;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f1545a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return s10;
    }
}

package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* compiled from: TypefaceEmojiSpan */
public final class o extends j {
    public o(h hVar) {
        super(hVar);
    }

    public void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        Paint paint2 = paint;
        e.a().getClass();
        h hVar = this.f1546b;
        Typeface typeface = hVar.f1534b.f1563d;
        Typeface typeface2 = paint.getTypeface();
        paint2.setTypeface(typeface);
        int i15 = hVar.f1533a * 2;
        char[] cArr = hVar.f1534b.f1561b;
        canvas.drawText(cArr, i15, 2, f10, (float) i13, paint);
        paint2.setTypeface(typeface2);
    }
}

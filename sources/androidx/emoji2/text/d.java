package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.e;

/* compiled from: DefaultGlyphChecker */
public class d implements e.d {

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<StringBuilder> f1504b = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f1505a;

    public d() {
        TextPaint textPaint = new TextPaint();
        this.f1505a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}

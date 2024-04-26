package androidx.emoji2.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* compiled from: UnprecomputeTextOnModificationSpannable */
public class p implements Spannable {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1570a = false;

    /* renamed from: b  reason: collision with root package name */
    public Spannable f1571b;

    /* compiled from: UnprecomputeTextOnModificationSpannable */
    public static class a {
        public boolean a(CharSequence charSequence) {
            return charSequence instanceof m0.b;
        }
    }

    /* compiled from: UnprecomputeTextOnModificationSpannable */
    public static class b extends a {
        public boolean a(CharSequence charSequence) {
            return (charSequence instanceof PrecomputedText) || (charSequence instanceof m0.b);
        }
    }

    public p(Spannable spannable) {
        this.f1571b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f1571b;
        if (!this.f1570a) {
            if ((Build.VERSION.SDK_INT < 28 ? new a() : new b()).a(spannable)) {
                this.f1571b = new SpannableString(spannable);
            }
        }
        this.f1570a = true;
    }

    public char charAt(int i10) {
        return this.f1571b.charAt(i10);
    }

    public IntStream chars() {
        return this.f1571b.chars();
    }

    public IntStream codePoints() {
        return this.f1571b.codePoints();
    }

    public int getSpanEnd(Object obj) {
        return this.f1571b.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f1571b.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f1571b.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return this.f1571b.getSpans(i10, i11, cls);
    }

    public int length() {
        return this.f1571b.length();
    }

    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f1571b.nextSpanTransition(i10, i11, cls);
    }

    public void removeSpan(Object obj) {
        a();
        this.f1571b.removeSpan(obj);
    }

    public void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f1571b.setSpan(obj, i10, i11, i12);
    }

    public CharSequence subSequence(int i10, int i11) {
        return this.f1571b.subSequence(i10, i11);
    }

    public String toString() {
        return this.f1571b.toString();
    }

    public p(CharSequence charSequence) {
        this.f1571b = new SpannableString(charSequence);
    }
}

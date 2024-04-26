package m0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* compiled from: PrecomputedTextCompat */
public class b implements Spannable {
    public char charAt(int i10) {
        throw null;
    }

    public int getSpanEnd(Object obj) {
        throw null;
    }

    public int getSpanFlags(Object obj) {
        throw null;
    }

    public int getSpanStart(Object obj) {
        throw null;
    }

    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        throw null;
    }

    public int length() {
        throw null;
    }

    public int nextSpanTransition(int i10, int i11, Class cls) {
        throw null;
    }

    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        } else {
            throw null;
        }
    }

    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        } else {
            throw null;
        }
    }

    public CharSequence subSequence(int i10, int i11) {
        throw null;
    }

    public String toString() {
        throw null;
    }

    /* compiled from: PrecomputedTextCompat */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextPaint f21477a;

        /* renamed from: b  reason: collision with root package name */
        public final TextDirectionHeuristic f21478b;

        /* renamed from: c  reason: collision with root package name */
        public final int f21479c;

        /* renamed from: d  reason: collision with root package name */
        public final int f21480d;

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            }
            this.f21477a = textPaint;
            this.f21478b = textDirectionHeuristic;
            this.f21479c = i10;
            this.f21480d = i11;
        }

        public boolean a(a aVar) {
            int i10 = Build.VERSION.SDK_INT;
            if ((i10 >= 23 && (this.f21479c != aVar.f21479c || this.f21480d != aVar.f21480d)) || this.f21477a.getTextSize() != aVar.f21477a.getTextSize() || this.f21477a.getTextScaleX() != aVar.f21477a.getTextScaleX() || this.f21477a.getTextSkewX() != aVar.f21477a.getTextSkewX()) {
                return false;
            }
            if ((i10 >= 21 && (this.f21477a.getLetterSpacing() != aVar.f21477a.getLetterSpacing() || !TextUtils.equals(this.f21477a.getFontFeatureSettings(), aVar.f21477a.getFontFeatureSettings()))) || this.f21477a.getFlags() != aVar.f21477a.getFlags()) {
                return false;
            }
            if (i10 >= 24) {
                if (!this.f21477a.getTextLocales().equals(aVar.f21477a.getTextLocales())) {
                    return false;
                }
            } else if (!this.f21477a.getTextLocale().equals(aVar.f21477a.getTextLocale())) {
                return false;
            }
            if (this.f21477a.getTypeface() == null) {
                if (aVar.f21477a.getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f21477a.getTypeface().equals(aVar.f21477a.getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!a(aVar)) {
                return false;
            }
            return Build.VERSION.SDK_INT < 18 || this.f21478b == aVar.f21478b;
        }

        public int hashCode() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                return n0.b.b(Float.valueOf(this.f21477a.getTextSize()), Float.valueOf(this.f21477a.getTextScaleX()), Float.valueOf(this.f21477a.getTextSkewX()), Float.valueOf(this.f21477a.getLetterSpacing()), Integer.valueOf(this.f21477a.getFlags()), this.f21477a.getTextLocales(), this.f21477a.getTypeface(), Boolean.valueOf(this.f21477a.isElegantTextHeight()), this.f21478b, Integer.valueOf(this.f21479c), Integer.valueOf(this.f21480d));
            } else if (i10 >= 21) {
                return n0.b.b(Float.valueOf(this.f21477a.getTextSize()), Float.valueOf(this.f21477a.getTextScaleX()), Float.valueOf(this.f21477a.getTextSkewX()), Float.valueOf(this.f21477a.getLetterSpacing()), Integer.valueOf(this.f21477a.getFlags()), this.f21477a.getTextLocale(), this.f21477a.getTypeface(), Boolean.valueOf(this.f21477a.isElegantTextHeight()), this.f21478b, Integer.valueOf(this.f21479c), Integer.valueOf(this.f21480d));
            } else if (i10 >= 18) {
                return n0.b.b(Float.valueOf(this.f21477a.getTextSize()), Float.valueOf(this.f21477a.getTextScaleX()), Float.valueOf(this.f21477a.getTextSkewX()), Integer.valueOf(this.f21477a.getFlags()), this.f21477a.getTextLocale(), this.f21477a.getTypeface(), this.f21478b, Integer.valueOf(this.f21479c), Integer.valueOf(this.f21480d));
            } else {
                return n0.b.b(Float.valueOf(this.f21477a.getTextSize()), Float.valueOf(this.f21477a.getTextScaleX()), Float.valueOf(this.f21477a.getTextSkewX()), Integer.valueOf(this.f21477a.getFlags()), this.f21477a.getTextLocale(), this.f21477a.getTypeface(), this.f21478b, Integer.valueOf(this.f21479c), Integer.valueOf(this.f21480d));
            }
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            StringBuilder a10 = android.support.v4.media.a.a("textSize=");
            a10.append(this.f21477a.getTextSize());
            sb2.append(a10.toString());
            sb2.append(", textScaleX=" + this.f21477a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f21477a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 21) {
                StringBuilder a11 = android.support.v4.media.a.a(", letterSpacing=");
                a11.append(this.f21477a.getLetterSpacing());
                sb2.append(a11.toString());
                sb2.append(", elegantTextHeight=" + this.f21477a.isElegantTextHeight());
            }
            if (i10 >= 24) {
                StringBuilder a12 = android.support.v4.media.a.a(", textLocale=");
                a12.append(this.f21477a.getTextLocales());
                sb2.append(a12.toString());
            } else {
                StringBuilder a13 = android.support.v4.media.a.a(", textLocale=");
                a13.append(this.f21477a.getTextLocale());
                sb2.append(a13.toString());
            }
            StringBuilder a14 = android.support.v4.media.a.a(", typeface=");
            a14.append(this.f21477a.getTypeface());
            sb2.append(a14.toString());
            if (i10 >= 26) {
                StringBuilder a15 = android.support.v4.media.a.a(", variationSettings=");
                a15.append(this.f21477a.getFontVariationSettings());
                sb2.append(a15.toString());
            }
            StringBuilder a16 = android.support.v4.media.a.a(", textDir=");
            a16.append(this.f21478b);
            sb2.append(a16.toString());
            sb2.append(", breakStrategy=" + this.f21479c);
            sb2.append(", hyphenationFrequency=" + this.f21480d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f21477a = params.getTextPaint();
            this.f21478b = params.getTextDirection();
            this.f21479c = params.getBreakStrategy();
            this.f21480d = params.getHyphenationFrequency();
        }
    }
}

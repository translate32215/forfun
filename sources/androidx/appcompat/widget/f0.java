package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

/* compiled from: AppCompatTextHelper */
public class f0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextView f901a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Typeface f902b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f903c;

    public f0(e0 e0Var, TextView textView, Typeface typeface, int i10) {
        this.f901a = textView;
        this.f902b = typeface;
        this.f903c = i10;
    }

    public void run() {
        this.f901a.setTypeface(this.f902b, this.f903c);
    }
}

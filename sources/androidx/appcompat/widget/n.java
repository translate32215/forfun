package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import e.l;
import z0.f;

/* compiled from: AppCompatEmojiTextHelper */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f1024a;

    /* renamed from: b  reason: collision with root package name */
    public final f f1025b;

    public n(TextView textView) {
        this.f1024a = textView;
        this.f1025b = new f(textView, false);
    }

    /* JADX INFO: finally extract failed */
    public void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f1024a.getContext().obtainStyledAttributes(attributeSet, l.f13509i, i10, 0);
        try {
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z10 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            b(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void b(boolean z10) {
        this.f1025b.f28196a.c(z10);
    }
}

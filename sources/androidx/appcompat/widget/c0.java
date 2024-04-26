package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* compiled from: AppCompatTextClassifierHelper */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public TextView f862a;

    /* renamed from: b  reason: collision with root package name */
    public TextClassifier f863b;

    /* compiled from: AppCompatTextClassifierHelper */
    public static final class a {
        public static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
    }

    public c0(TextView textView) {
        this.f862a = textView;
    }
}

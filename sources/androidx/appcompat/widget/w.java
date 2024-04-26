package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.startapp.startappsdk.R;

/* compiled from: AppCompatRatingBar */
public class w extends RatingBar {

    /* renamed from: a  reason: collision with root package name */
    public final u f1121a;

    public w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        b1.a(this, getContext());
        u uVar = new u(this);
        this.f1121a = uVar;
        uVar.a(attributeSet, R.attr.ratingBarStyle);
    }

    public synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap bitmap = this.f1121a.f1107b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }
}

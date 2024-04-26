package androidx.leanback.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.startapp.startappsdk.R;

public class MediaNowPlayingView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f2145a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f2146b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f2147c;

    /* renamed from: d  reason: collision with root package name */
    public final ObjectAnimator f2148d;

    /* renamed from: e  reason: collision with root package name */
    public final ObjectAnimator f2149e;

    /* renamed from: f  reason: collision with root package name */
    public final ObjectAnimator f2150f;

    public MediaNowPlayingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        LayoutInflater.from(context).inflate(R.layout.lb_playback_now_playing_bars, this, true);
        ImageView imageView = (ImageView) findViewById(R.id.bar1);
        this.f2145a = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.bar2);
        this.f2146b = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.bar3);
        this.f2147c = imageView3;
        imageView.setPivotY((float) imageView.getDrawable().getIntrinsicHeight());
        imageView2.setPivotY((float) imageView2.getDrawable().getIntrinsicHeight());
        imageView3.setPivotY((float) imageView3.getDrawable().getIntrinsicHeight());
        setDropScale(imageView);
        setDropScale(imageView2);
        setDropScale(imageView3);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "scaleY", new float[]{0.41666666f, 0.25f, 0.41666666f, 0.5833333f, 0.75f, 0.8333333f, 0.9166667f, 1.0f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.5f, 0.33333334f, 0.16666667f, 0.33333334f, 0.5f, 0.5833333f, 0.75f, 0.9166667f, 0.75f, 0.5833333f, 0.41666666f, 0.25f, 0.41666666f, 0.6666667f, 0.41666666f, 0.25f, 0.33333334f, 0.41666666f});
        this.f2148d = ofFloat;
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(2320);
        ofFloat.setInterpolator(linearInterpolator);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, "scaleY", new float[]{1.0f, 0.9166667f, 0.8333333f, 0.9166667f, 1.0f, 0.9166667f, 0.75f, 0.5833333f, 0.75f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.8333333f, 1.0f, 0.9166667f, 0.75f, 0.41666666f, 0.25f, 0.41666666f, 0.6666667f, 0.8333333f, 1.0f, 0.8333333f, 0.75f, 0.6666667f, 1.0f});
        this.f2149e = ofFloat2;
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setDuration(2080);
        ofFloat2.setInterpolator(linearInterpolator);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView3, "scaleY", new float[]{0.6666667f, 0.75f, 0.8333333f, 1.0f, 0.9166667f, 0.75f, 0.5833333f, 0.41666666f, 0.5833333f, 0.6666667f, 0.75f, 1.0f, 0.9166667f, 1.0f, 0.75f, 0.5833333f, 0.75f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.75f, 0.5833333f, 0.41666666f, 0.25f, 0.6666667f});
        this.f2150f = ofFloat3;
        ofFloat3.setRepeatCount(-1);
        ofFloat3.setDuration(2000);
        ofFloat3.setInterpolator(linearInterpolator);
    }

    public static void setDropScale(View view) {
        view.setScaleY(0.083333336f);
    }

    public final void a() {
        b(this.f2148d);
        b(this.f2149e);
        b(this.f2150f);
        this.f2145a.setVisibility(0);
        this.f2146b.setVisibility(0);
        this.f2147c.setVisibility(0);
    }

    public final void b(Animator animator) {
        if (!animator.isStarted()) {
            animator.start();
        }
    }

    public final void c() {
        d(this.f2148d, this.f2145a);
        d(this.f2149e, this.f2146b);
        d(this.f2150f, this.f2147c);
        this.f2145a.setVisibility(8);
        this.f2146b.setVisibility(8);
        this.f2147c.setVisibility(8);
    }

    public final void d(Animator animator, View view) {
        if (animator.isStarted()) {
            animator.cancel();
            setDropScale(view);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            a();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8) {
            c();
        } else {
            a();
        }
    }
}

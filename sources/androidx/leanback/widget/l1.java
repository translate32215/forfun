package androidx.leanback.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.startapp.startappsdk.R;
import java.util.Random;
import java.util.regex.Pattern;
import s0.i;

/* compiled from: StreamingTextView */
public class l1 extends EditText {

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f2410f = Pattern.compile("\\S+");

    /* renamed from: g  reason: collision with root package name */
    public static final Property<l1, Integer> f2411g = new a(Integer.class, "streamPosition");

    /* renamed from: a  reason: collision with root package name */
    public final Random f2412a = new Random();

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f2413b;

    /* renamed from: c  reason: collision with root package name */
    public Bitmap f2414c;

    /* renamed from: d  reason: collision with root package name */
    public int f2415d;

    /* renamed from: e  reason: collision with root package name */
    public ObjectAnimator f2416e;

    /* compiled from: StreamingTextView */
    public static class a extends Property<l1, Integer> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Integer.valueOf(((l1) obj).getStreamPosition());
        }

        public void set(Object obj, Object obj2) {
            ((l1) obj).setStreamPosition(((Integer) obj2).intValue());
        }
    }

    /* compiled from: StreamingTextView */
    public class b extends ReplacementSpan {

        /* renamed from: a  reason: collision with root package name */
        public final int f2417a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2418b;

        public b(int i10, int i11) {
            this.f2417a = i10;
            this.f2418b = i11;
        }

        public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
            Canvas canvas2 = canvas;
            Paint paint2 = paint;
            int measureText = (int) paint2.measureText(charSequence, i10, i11);
            int width = l1.this.f2413b.getWidth();
            int i15 = width * 2;
            int i16 = measureText / i15;
            int i17 = (measureText % i15) / 2;
            boolean z10 = 1 == l1.this.getLayoutDirection();
            l1.this.f2412a.setSeed((long) this.f2417a);
            int alpha = paint.getAlpha();
            for (int i18 = 0; i18 < i16; i18++) {
                int i19 = this.f2418b + i18;
                l1 l1Var = l1.this;
                if (i19 >= l1Var.f2415d) {
                    break;
                }
                float f11 = (float) ((width / 2) + (i18 * i15) + i17);
                float f12 = z10 ? ((f10 + ((float) measureText)) - f11) - ((float) width) : f10 + f11;
                paint2.setAlpha((l1Var.f2412a.nextInt(4) + 1) * 63);
                if (l1.this.f2412a.nextBoolean()) {
                    Bitmap bitmap = l1.this.f2414c;
                    canvas2.drawBitmap(bitmap, f12, (float) (i13 - bitmap.getHeight()), paint2);
                } else {
                    Bitmap bitmap2 = l1.this.f2413b;
                    canvas2.drawBitmap(bitmap2, f12, (float) (i13 - bitmap2.getHeight()), paint2);
                }
            }
            paint2.setAlpha(alpha);
        }

        public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
            return (int) paint.measureText(charSequence, i10, i11);
        }
    }

    public l1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final Bitmap a(int i10, float f10) {
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), i10);
        return Bitmap.createScaledBitmap(decodeResource, (int) (((float) decodeResource.getWidth()) * f10), (int) (((float) decodeResource.getHeight()) * f10), false);
    }

    public int getStreamPosition() {
        return this.f2415d;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2413b = a(R.drawable.lb_text_dot_one, 1.3f);
        this.f2414c = a(R.drawable.lb_text_dot_two, 1.3f);
        this.f2415d = -1;
        ObjectAnimator objectAnimator = this.f2416e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setText("");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(l1.class.getCanonicalName());
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.j(this, callback));
    }

    public void setFinalRecognizedText(CharSequence charSequence) {
        setText(charSequence);
        bringPointIntoView(length());
    }

    public void setStreamPosition(int i10) {
        this.f2415d = i10;
        invalidate();
    }

    public l1(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}

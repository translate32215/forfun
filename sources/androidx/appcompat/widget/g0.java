package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: AppCompatTextViewAutoSizeHelper */
public class g0 {

    /* renamed from: l  reason: collision with root package name */
    public static final RectF f909l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m  reason: collision with root package name */
    public static ConcurrentHashMap<String, Method> f910m = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: n  reason: collision with root package name */
    public static ConcurrentHashMap<String, Field> f911n = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public int f912a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f913b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f914c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f915d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f916e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f917f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f918g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f919h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f920i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f921j;

    /* renamed from: k  reason: collision with root package name */
    public final f f922k;

    /* compiled from: AppCompatTextViewAutoSizeHelper */
    public static final class a {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i10, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        public static int b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper */
    public static final class b {
        public static boolean a(View view) {
            return view.isInLayout();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper */
    public static final class c {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11, TextView textView, TextPaint textPaint, f fVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                fVar.a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper */
    public static class d extends f {
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) g0.e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper */
    public static class e extends d {
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper */
    public static class f {
        public void a(StaticLayout.Builder builder, TextView textView) {
        }

        public boolean b(TextView textView) {
            return ((Boolean) g0.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public g0(TextView textView) {
        this.f920i = textView;
        this.f921j = textView.getContext();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            this.f922k = new e();
        } else if (i10 >= 23) {
            this.f922k = new d();
        } else {
            this.f922k = new f();
        }
    }

    public static Method d(String str) {
        try {
            Method method = f910m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f910m.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    public static <T> T e(Object obj, String str, T t10) {
        try {
            return d(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return t10;
        }
    }

    public void a() {
        int i10;
        if (i() && this.f912a != 0) {
            if (this.f913b) {
                if (this.f920i.getMeasuredHeight() > 0 && this.f920i.getMeasuredWidth() > 0) {
                    if (this.f922k.b(this.f920i)) {
                        i10 = 1048576;
                    } else {
                        i10 = (this.f920i.getMeasuredWidth() - this.f920i.getTotalPaddingLeft()) - this.f920i.getTotalPaddingRight();
                    }
                    int height = (this.f920i.getHeight() - this.f920i.getCompoundPaddingBottom()) - this.f920i.getCompoundPaddingTop();
                    if (i10 > 0 && height > 0) {
                        RectF rectF = f909l;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) i10;
                            rectF.bottom = (float) height;
                            float c10 = (float) c(rectF);
                            if (c10 != this.f920i.getTextSize()) {
                                f(0, c10);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f913b = true;
        }
    }

    public final int[] b(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    public final int c(RectF rectF) {
        StaticLayout staticLayout;
        int i10;
        CharSequence transformation;
        RectF rectF2 = rectF;
        int length = this.f917f.length;
        if (length != 0) {
            int i11 = length - 1;
            int i12 = 1;
            int i13 = 0;
            while (i12 <= i11) {
                int i14 = (i12 + i11) / 2;
                int i15 = this.f917f[i14];
                CharSequence text = this.f920i.getText();
                TransformationMethod transformationMethod = this.f920i.getTransformationMethod();
                if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f920i)) == null)) {
                    text = transformation;
                }
                int i16 = Build.VERSION.SDK_INT;
                int b10 = a.b(this.f920i);
                TextPaint textPaint = this.f919h;
                if (textPaint == null) {
                    this.f919h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f919h.set(this.f920i.getPaint());
                this.f919h.setTextSize((float) i15);
                Layout.Alignment alignment = (Layout.Alignment) e(this.f920i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
                int round = Math.round(rectF2.right);
                if (i16 >= 23) {
                    i10 = b10;
                    staticLayout = c.a(text, alignment, round, b10, this.f920i, this.f919h, this.f922k);
                } else {
                    i10 = b10;
                    staticLayout = a.a(text, alignment, round, this.f920i, this.f919h);
                }
                if ((i10 == -1 || (staticLayout.getLineCount() <= i10 && staticLayout.getLineEnd(staticLayout.getLineCount() - 1) == text.length())) && ((float) staticLayout.getHeight()) <= rectF2.bottom) {
                    int i17 = i14 + 1;
                    i13 = i12;
                    i12 = i17;
                } else {
                    i13 = i14 - 1;
                    i11 = i13;
                }
            }
            return this.f917f[i13];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public void f(int i10, float f10) {
        Resources resources;
        Context context = this.f921j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i10, f10, resources.getDisplayMetrics());
        if (applyDimension != this.f920i.getPaint().getTextSize()) {
            this.f920i.getPaint().setTextSize(applyDimension);
            boolean a10 = Build.VERSION.SDK_INT >= 18 ? b.a(this.f920i) : false;
            if (this.f920i.getLayout() != null) {
                this.f913b = false;
                try {
                    Method d10 = d("nullLayouts");
                    if (d10 != null) {
                        d10.invoke(this.f920i, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (!a10) {
                    this.f920i.requestLayout();
                } else {
                    this.f920i.forceLayout();
                }
                this.f920i.invalidate();
            }
        }
    }

    public final boolean g() {
        if (!i() || this.f912a != 1) {
            this.f913b = false;
        } else {
            if (!this.f918g || this.f917f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f916e - this.f915d) / this.f914c))) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round((((float) i10) * this.f914c) + this.f915d);
                }
                this.f917f = b(iArr);
            }
            this.f913b = true;
        }
        return this.f913b;
    }

    public final boolean h() {
        int[] iArr = this.f917f;
        int length = iArr.length;
        boolean z10 = length > 0;
        this.f918g = z10;
        if (z10) {
            this.f912a = 1;
            this.f915d = (float) iArr[0];
            this.f916e = (float) iArr[length - 1];
            this.f914c = -1.0f;
        }
        return z10;
    }

    public final boolean i() {
        return !(this.f920i instanceof l);
    }

    public final void j(float f10, float f11, float f12) throws IllegalArgumentException {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        } else if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        } else if (f12 > 0.0f) {
            this.f912a = 1;
            this.f915d = f10;
            this.f916e = f11;
            this.f914c = f12;
            this.f918g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
    }
}

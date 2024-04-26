package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import androidx.activity.c;
import androidx.activity.f;
import com.startapp.startappsdk.R;
import java.lang.reflect.Method;
import o0.c0;
import o0.e0;

/* compiled from: TooltipCompatHandler */
public class k1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: s  reason: collision with root package name */
    public static k1 f977s;

    /* renamed from: t  reason: collision with root package name */
    public static k1 f978t;

    /* renamed from: a  reason: collision with root package name */
    public final View f979a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f980b;

    /* renamed from: c  reason: collision with root package name */
    public final int f981c;

    /* renamed from: d  reason: collision with root package name */
    public final Runnable f982d = new f(this);

    /* renamed from: e  reason: collision with root package name */
    public final Runnable f983e = new c(this);

    /* renamed from: f  reason: collision with root package name */
    public int f984f;

    /* renamed from: g  reason: collision with root package name */
    public int f985g;

    /* renamed from: h  reason: collision with root package name */
    public l1 f986h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f987i;

    /* renamed from: r  reason: collision with root package name */
    public boolean f988r;

    public k1(View view, CharSequence charSequence) {
        int i10;
        this.f979a = view;
        this.f980b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = e0.f22576a;
        if (Build.VERSION.SDK_INT >= 28) {
            i10 = e0.b.a(viewConfiguration);
        } else {
            i10 = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f981c = i10;
        this.f988r = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(k1 k1Var) {
        k1 k1Var2 = f977s;
        if (k1Var2 != null) {
            k1Var2.f979a.removeCallbacks(k1Var2.f982d);
        }
        f977s = k1Var;
        if (k1Var != null) {
            k1Var.f979a.postDelayed(k1Var.f982d, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    public void a() {
        if (f978t == this) {
            f978t = null;
            l1 l1Var = this.f986h;
            if (l1Var != null) {
                l1Var.a();
                this.f986h = null;
                this.f988r = true;
                this.f979a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f977s == this) {
            b((k1) null);
        }
        this.f979a.removeCallbacks(this.f983e);
    }

    public void c(boolean z10) {
        int i10;
        int i11;
        long j10;
        int i12;
        long j11;
        if (c0.q(this.f979a)) {
            b((k1) null);
            k1 k1Var = f978t;
            if (k1Var != null) {
                k1Var.a();
            }
            f978t = this;
            this.f987i = z10;
            l1 l1Var = new l1(this.f979a.getContext());
            this.f986h = l1Var;
            View view = this.f979a;
            int i13 = this.f984f;
            int i14 = this.f985g;
            boolean z11 = this.f987i;
            CharSequence charSequence = this.f980b;
            if (l1Var.f1014b.getParent() != null) {
                l1Var.a();
            }
            l1Var.f1015c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = l1Var.f1016d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = l1Var.f1013a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i13 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = l1Var.f1013a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                i10 = i14 + dimensionPixelOffset2;
                i11 = i14 - dimensionPixelOffset2;
            } else {
                i10 = view.getHeight();
                i11 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = l1Var.f1013a.getResources().getDimensionPixelOffset(z11 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(l1Var.f1017e);
                Rect rect = l1Var.f1017e;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = l1Var.f1013a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    l1Var.f1017e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(l1Var.f1019g);
                view.getLocationOnScreen(l1Var.f1018f);
                int[] iArr = l1Var.f1018f;
                int i15 = iArr[0];
                int[] iArr2 = l1Var.f1019g;
                iArr[0] = i15 - iArr2[0];
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (iArr[0] + i13) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                l1Var.f1014b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = l1Var.f1014b.getMeasuredHeight();
                int[] iArr3 = l1Var.f1018f;
                int i16 = ((iArr3[1] + i11) - dimensionPixelOffset3) - measuredHeight;
                int i17 = iArr3[1] + i10 + dimensionPixelOffset3;
                if (z11) {
                    if (i16 >= 0) {
                        layoutParams.y = i16;
                    } else {
                        layoutParams.y = i17;
                    }
                } else if (measuredHeight + i17 <= l1Var.f1017e.height()) {
                    layoutParams.y = i17;
                } else {
                    layoutParams.y = i16;
                }
            }
            ((WindowManager) l1Var.f1013a.getSystemService("window")).addView(l1Var.f1014b, l1Var.f1016d);
            this.f979a.addOnAttachStateChangeListener(this);
            if (this.f987i) {
                j10 = 2500;
            } else {
                if ((c0.d.g(this.f979a) & 1) == 1) {
                    j11 = 3000;
                    i12 = ViewConfiguration.getLongPressTimeout();
                } else {
                    j11 = 15000;
                    i12 = ViewConfiguration.getLongPressTimeout();
                }
                j10 = j11 - ((long) i12);
            }
            this.f979a.removeCallbacks(this.f983e);
            this.f979a.postDelayed(this.f983e, j10);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f986h != null && this.f987i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f979a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action != 7) {
            if (action == 10) {
                this.f988r = true;
                a();
            }
        } else if (this.f979a.isEnabled() && this.f986h == null) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (this.f988r || Math.abs(x10 - this.f984f) > this.f981c || Math.abs(y10 - this.f985g) > this.f981c) {
                this.f984f = x10;
                this.f985g = y10;
                this.f988r = false;
            } else {
                z10 = false;
            }
            if (z10) {
                b(this);
            }
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f984f = view.getWidth() / 2;
        this.f985g = view.getHeight() / 2;
        c(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        a();
    }
}

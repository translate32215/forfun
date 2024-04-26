package o0;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import com.startapp.startappsdk.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import o0.a;
import o0.c;
import o0.o0;
import p0.c;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* compiled from: ViewCompat */
public class c0 {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap<View, String> f22553a;

    /* renamed from: b  reason: collision with root package name */
    public static WeakHashMap<View, i0> f22554b = null;

    /* renamed from: c  reason: collision with root package name */
    public static Field f22555c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f22556d = false;

    /* renamed from: e  reason: collision with root package name */
    public static ThreadLocal<Rect> f22557e;

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f22558f = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: g  reason: collision with root package name */
    public static final u f22559g = y.f22638a;

    /* renamed from: h  reason: collision with root package name */
    public static final a f22560h = new a();

    /* compiled from: ViewCompat */
    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final WeakHashMap<View, Boolean> f22561a = new WeakHashMap<>();

        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry next : this.f22561a.entrySet()) {
                    View view = (View) next.getKey();
                    boolean booleanValue = ((Boolean) next.getValue()).booleanValue();
                    boolean z10 = view.isShown() && view.getWindowVisibility() == 0;
                    if (booleanValue != z10) {
                        c0.s(view, z10 ? 16 : 32);
                        this.f22561a.put(view, Boolean.valueOf(z10));
                    }
                }
            }
        }

        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: ViewCompat */
    public static class c {
        public static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* compiled from: ViewCompat */
    public static class d {
        public static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        public static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        public static int c(View view) {
            return view.getImportantForAccessibility();
        }

        public static int d(View view) {
            return view.getMinimumHeight();
        }

        public static int e(View view) {
            return view.getMinimumWidth();
        }

        public static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        public static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        public static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        public static boolean i(View view) {
            return view.hasTransientState();
        }

        public static boolean j(View view, int i10, Bundle bundle) {
            return view.performAccessibilityAction(i10, bundle);
        }

        public static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        public static void l(View view, int i10, int i11, int i12, int i13) {
            view.postInvalidateOnAnimation(i10, i11, i12, i13);
        }

        public static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void n(View view, Runnable runnable, long j10) {
            view.postOnAnimationDelayed(runnable, j10);
        }

        public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        public static void p(View view) {
            view.requestFitSystemWindows();
        }

        public static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        public static void r(View view, boolean z10) {
            view.setHasTransientState(z10);
        }

        public static void s(View view, int i10) {
            view.setImportantForAccessibility(i10);
        }
    }

    /* compiled from: ViewCompat */
    public static class e {
        public static int a() {
            return View.generateViewId();
        }

        public static Display b(View view) {
            return view.getDisplay();
        }

        public static int c(View view) {
            return view.getLabelFor();
        }

        public static int d(View view) {
            return view.getLayoutDirection();
        }

        public static int e(View view) {
            return view.getPaddingEnd();
        }

        public static int f(View view) {
            return view.getPaddingStart();
        }

        public static boolean g(View view) {
            return view.isPaddingRelative();
        }

        public static void h(View view, int i10) {
            view.setLabelFor(i10);
        }

        public static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        public static void j(View view, int i10) {
            view.setLayoutDirection(i10);
        }

        public static void k(View view, int i10, int i11, int i12, int i13) {
            view.setPaddingRelative(i10, i11, i12, i13);
        }
    }

    /* compiled from: ViewCompat */
    public static class f {
        public static Rect a(View view) {
            return view.getClipBounds();
        }

        public static boolean b(View view) {
            return view.isInLayout();
        }

        public static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* compiled from: ViewCompat */
    public static class g {
        public static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        public static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        public static boolean c(View view) {
            return view.isLaidOut();
        }

        public static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        public static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }

        public static void f(View view, int i10) {
            view.setAccessibilityLiveRegion(i10);
        }

        public static void g(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    /* compiled from: ViewCompat */
    public static class h {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* compiled from: ViewCompat */
    public static class i {

        /* compiled from: ViewCompat */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            public o0 f22566a = null;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ View f22567b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ s f22568c;

            public a(View view, s sVar) {
                this.f22567b = view;
                this.f22568c = sVar;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                o0 l10 = o0.l(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    i.a(windowInsets, this.f22567b);
                    if (l10.equals(this.f22566a)) {
                        return this.f22568c.a(view, l10).j();
                    }
                }
                this.f22566a = l10;
                o0 a10 = this.f22568c.a(view, l10);
                if (i10 >= 30) {
                    return a10.j();
                }
                c0.A(view);
                return a10.j();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static o0 b(View view, o0 o0Var, Rect rect) {
            WindowInsets j10 = o0Var.j();
            if (j10 != null) {
                return o0.l(view.computeSystemWindowInsets(j10, rect), view);
            }
            rect.setEmpty();
            return o0Var;
        }

        public static boolean c(View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        public static boolean d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        public static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        public static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static o0 j(View view) {
            o0.e eVar;
            if (!o0.a.f22601d || !view.isAttachedToWindow()) {
                return null;
            }
            try {
                Object obj = o0.a.f22598a.get(view.getRootView());
                if (obj == null) {
                    return null;
                }
                Rect rect = (Rect) o0.a.f22599b.get(obj);
                Rect rect2 = (Rect) o0.a.f22600c.get(obj);
                if (rect == null || rect2 == null) {
                    return null;
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30) {
                    eVar = new o0.d();
                } else if (i10 >= 29) {
                    eVar = new o0.c();
                } else if (i10 >= 20) {
                    eVar = new o0.b();
                } else {
                    eVar = new o0.e();
                }
                eVar.c(g0.b.b(rect.left, rect.top, rect.right, rect.bottom));
                eVar.d(g0.b.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                o0 b10 = eVar.b();
                b10.f22597a.p(b10);
                b10.f22597a.d(view.getRootView());
                return b10;
            } catch (IllegalAccessException e10) {
                StringBuilder a10 = android.support.v4.media.a.a("Failed to get insets from AttachInfo. ");
                a10.append(e10.getMessage());
                Log.w("WindowInsetsCompat", a10.toString(), e10);
                return null;
            }
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f10) {
            view.setElevation(f10);
        }

        public static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        public static void u(View view, s sVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, sVar);
            }
            if (sVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, sVar));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        public static void x(View view, float f10) {
            view.setZ(f10);
        }

        public static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* compiled from: ViewCompat */
    public static class j {
        public static o0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            o0 l10 = o0.l(rootWindowInsets, (View) null);
            l10.f22597a.p(l10);
            l10.f22597a.d(view.getRootView());
            return l10;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        public static void d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* compiled from: ViewCompat */
    public static class k {
        public static void a(View view) {
            view.cancelDragAndDrop();
        }

        public static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        public static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        public static void d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        public static boolean e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i10) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i10);
        }

        public static void f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* compiled from: ViewCompat */
    public static class l {
        public static void a(View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        public static int b(View view) {
            return view.getImportantForAutofill();
        }

        public static int c(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean d(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean e(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View h(View view, View view2, int i10) {
            return view.keyboardNavigationClusterSearch(view2, i10);
        }

        public static boolean i(View view) {
            return view.restoreDefaultFocus();
        }

        public static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void k(View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        public static void l(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        public static void m(View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        public static void n(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        public static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* compiled from: ViewCompat */
    public static class m {
        public static void a(View view, r rVar) {
            s.i iVar = (s.i) view.getTag(R.id.tag_unhandled_key_listeners);
            if (iVar == null) {
                iVar = new s.i();
                view.setTag(R.id.tag_unhandled_key_listeners, iVar);
            }
            rVar.getClass();
            d0 d0Var = new d0(rVar);
            iVar.put(rVar, d0Var);
            view.addOnUnhandledKeyEventListener(d0Var);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, r rVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            s.i iVar = (s.i) view.getTag(R.id.tag_unhandled_key_listeners);
            if (iVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) iVar.getOrDefault(rVar, null)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        public static <T> T f(View view, int i10) {
            return view.requireViewById(i10);
        }

        public static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* compiled from: ViewCompat */
    public static class n {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        public static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* compiled from: ViewCompat */
    public static class o {
        public static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* compiled from: ViewCompat */
    public static final class p {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static c b(View view, c cVar) {
            ContentInfo c10 = cVar.f22540a.c();
            c10.getClass();
            ContentInfo performReceiveContent = view.performReceiveContent(c10);
            if (performReceiveContent == null) {
                return null;
            }
            if (performReceiveContent == c10) {
                return cVar;
            }
            return new c(new c.d(performReceiveContent));
        }

        public static void c(View view, String[] strArr, t tVar) {
            if (tVar == null) {
                view.setOnReceiveContentListener(strArr, (OnReceiveContentListener) null);
            } else {
                view.setOnReceiveContentListener(strArr, new q(tVar));
            }
        }
    }

    /* compiled from: ViewCompat */
    public static final class q implements OnReceiveContentListener {

        /* renamed from: a  reason: collision with root package name */
        public final t f22569a;

        public q(t tVar) {
            this.f22569a = tVar;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            c cVar = new c(new c.d(contentInfo));
            c a10 = this.f22569a.a(view, cVar);
            if (a10 == null) {
                return null;
            }
            if (a10 == cVar) {
                return contentInfo;
            }
            ContentInfo c10 = a10.f22540a.c();
            c10.getClass();
            return c10;
        }
    }

    /* compiled from: ViewCompat */
    public interface r {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* compiled from: ViewCompat */
    public static class s {

        /* renamed from: d  reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f22570d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        public WeakHashMap<View, Boolean> f22571a = null;

        /* renamed from: b  reason: collision with root package name */
        public SparseArray<WeakReference<View>> f22572b = null;

        /* renamed from: c  reason: collision with root package name */
        public WeakReference<KeyEvent> f22573c = null;

        public final View a(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f22571a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View a10 = a(viewGroup.getChildAt(childCount), keyEvent);
                        if (a10 != null) {
                            return a10;
                        }
                    }
                }
                if (b(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((r) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        new AtomicInteger(1);
    }

    public static void A(View view) {
        if (Build.VERSION.SDK_INT >= 20) {
            h.c(view);
        } else {
            d.p(view);
        }
    }

    public static void B(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            n.c(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    public static void C(View view, a aVar) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (aVar == null && (h(view) instanceof a.C0198a)) {
            aVar = new a();
        }
        if (aVar == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = aVar.f22537b;
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    public static void D(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 19) {
            g.f(view, i10);
        }
    }

    public static void E(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            new a0(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).e(view, charSequence);
            if (charSequence != null) {
                a aVar = f22560h;
                aVar.f22561a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
                view.addOnAttachStateChangeListener(aVar);
                if (g.b(view)) {
                    view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
                    return;
                }
                return;
            }
            a aVar2 = f22560h;
            aVar2.f22561a.remove(view);
            view.removeOnAttachStateChangeListener(aVar2);
            d.o(view.getViewTreeObserver(), aVar2);
        }
    }

    public static void F(View view, ColorStateList colorStateList) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            i.q(view, colorStateList);
            if (i10 == 21) {
                Drawable background = view.getBackground();
                boolean z10 = (i.g(view) == null && i.h(view) == null) ? false : true;
                if (background != null && z10) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    d.q(view, background);
                }
            }
        } else if (view instanceof x) {
            ((x) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    public static void G(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            f.c(view, rect);
        }
    }

    public static void H(View view, float f10) {
        if (Build.VERSION.SDK_INT >= 21) {
            i.s(view, f10);
        }
    }

    public static void I(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 19) {
            d.s(view, i10);
            return;
        }
        if (i10 == 4) {
            i10 = 2;
        }
        d.s(view, i10);
    }

    public static void J(View view, s sVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            i.u(view, sVar);
        }
    }

    public static void K(View view, w wVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            k.d(view, wVar != null ? wVar.f22637a : null);
        }
    }

    public static void L(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            i.v(view, str);
            return;
        }
        if (f22553a == null) {
            f22553a = new WeakHashMap<>();
        }
        f22553a.put(view, str);
    }

    public static void M(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static void a(View view, c.a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            a g10 = g(view);
            if (g10 == null) {
                g10 = new a();
            }
            C(view, g10);
            y(aVar.a(), view);
            j(view).add(aVar);
            s(view, 0);
        }
    }

    public static i0 b(View view) {
        if (f22554b == null) {
            f22554b = new WeakHashMap<>();
        }
        i0 i0Var = f22554b.get(view);
        if (i0Var != null) {
            return i0Var;
        }
        i0 i0Var2 = new i0(view);
        f22554b.put(view, i0Var2);
        return i0Var2;
    }

    public static void c(View view, int i10) {
        view.offsetLeftAndRight(i10);
        if (view.getVisibility() == 0) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                M((View) parent);
            }
        }
    }

    public static void d(View view, int i10) {
        view.offsetTopAndBottom(i10);
        if (view.getVisibility() == 0) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                M((View) parent);
            }
        }
    }

    public static o0 e(View view, o0 o0Var) {
        WindowInsets j10;
        if (Build.VERSION.SDK_INT >= 21 && (j10 = o0Var.j()) != null) {
            WindowInsets a10 = h.a(view, j10);
            if (!a10.equals(j10)) {
                return o0.l(a10, view);
            }
        }
        return o0Var;
    }

    public static boolean f(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = s.f22570d;
        s sVar = (s) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (sVar == null) {
            sVar = new s();
            view.setTag(R.id.tag_unhandled_key_event_manager, sVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = sVar.f22571a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = s.f22570d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (sVar.f22571a == null) {
                        sVar.f22571a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = s.f22570d;
                        View view2 = (View) arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            sVar.f22571a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                sVar.f22571a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a10 = sVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a10 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (sVar.f22572b == null) {
                    sVar.f22572b = new SparseArray<>();
                }
                sVar.f22572b.put(keyCode, new WeakReference(a10));
            }
        }
        if (a10 != null) {
            return true;
        }
        return false;
    }

    public static a g(View view) {
        View.AccessibilityDelegate h10 = h(view);
        if (h10 == null) {
            return null;
        }
        if (h10 instanceof a.C0198a) {
            return ((a.C0198a) h10).f22538a;
        }
        return new a(h10);
    }

    public static View.AccessibilityDelegate h(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return n.a(view);
        }
        if (f22556d) {
            return null;
        }
        if (f22555c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f22555c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f22556d = true;
                return null;
            }
        }
        try {
            Object obj = f22555c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f22556d = true;
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r0.isInstance(r5) != false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence i(android.view.View r5) {
        /*
            java.lang.Class<java.lang.CharSequence> r0 = java.lang.CharSequence.class
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r3 = 1
            r4 = 28
            if (r1 < r4) goto L_0x000c
            r4 = 1
            goto L_0x000d
        L_0x000c:
            r4 = 0
        L_0x000d:
            if (r4 == 0) goto L_0x0014
            java.lang.CharSequence r5 = o0.c0.m.b(r5)
            goto L_0x002a
        L_0x0014:
            r4 = 19
            if (r1 < r4) goto L_0x0019
            r2 = 1
        L_0x0019:
            if (r2 == 0) goto L_0x0029
            r1 = 2131428057(0x7f0b02d9, float:1.8477748E38)
            java.lang.Object r5 = r5.getTag(r1)
            boolean r0 = r0.isInstance(r5)
            if (r0 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r5 = 0
        L_0x002a:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.c0.i(android.view.View):java.lang.CharSequence");
    }

    public static List<c.a> j(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static ColorStateList k(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return i.g(view);
        }
        if (view instanceof x) {
            return ((x) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static float l(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return i.i(view);
        }
        return 0.0f;
    }

    public static Rect m() {
        if (f22557e == null) {
            f22557e = new ThreadLocal<>();
        }
        Rect rect = f22557e.get();
        if (rect == null) {
            rect = new Rect();
            f22557e.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static String[] n(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return p.a(view);
        }
        return (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static o0 o(View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            return j.a(view);
        }
        if (i10 >= 21) {
            return i.j(view);
        }
        return null;
    }

    public static String p(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return i.k(view);
        }
        WeakHashMap<View, String> weakHashMap = f22553a;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    public static boolean q(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return g.b(view);
        }
        return view.getWindowToken() != null;
    }

    public static boolean r(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return g.c(view);
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static void s(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i11 = 0;
            boolean z10 = i(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (Build.VERSION.SDK_INT >= 19) {
                i11 = g.a(view);
            }
            int i12 = 32;
            if (i11 != 0 || z10) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z10) {
                    i12 = 2048;
                }
                obtain.setEventType(i12);
                g.g(obtain, i10);
                if (z10) {
                    obtain.getText().add(i(view));
                    if (d.c(view) == 0) {
                        I(view, 1);
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (!(parent instanceof View)) {
                            break;
                        } else if (d.c((View) parent) == 4) {
                            I(view, 2);
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i10 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                g.g(obtain2, i10);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(i(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    g.e(view.getParent(), view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    public static void t(View view, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23) {
            view.offsetLeftAndRight(i10);
        } else if (i11 >= 21) {
            Rect m10 = m();
            boolean z10 = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                m10.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z10 = !m10.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            c(view, i10);
            if (z10 && m10.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(m10);
            }
        } else {
            c(view, i10);
        }
    }

    public static void u(View view, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23) {
            view.offsetTopAndBottom(i10);
        } else if (i11 >= 21) {
            Rect m10 = m();
            boolean z10 = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                m10.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z10 = !m10.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            d(view, i10);
            if (z10 && m10.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(m10);
            }
        } else {
            d(view, i10);
        }
    }

    public static o0 v(View view, o0 o0Var) {
        WindowInsets j10;
        if (Build.VERSION.SDK_INT >= 21 && (j10 = o0Var.j()) != null) {
            WindowInsets b10 = h.b(view, j10);
            if (!b10.equals(j10)) {
                return o0.l(b10, view);
            }
        }
        return o0Var;
    }

    public static c w(View view, c cVar) {
        u uVar;
        u uVar2;
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return p.b(view, cVar);
        }
        t tVar = (t) view.getTag(R.id.tag_on_receive_content_listener);
        if (tVar != null) {
            c a10 = tVar.a(view, cVar);
            if (a10 == null) {
                return null;
            }
            if (view instanceof u) {
                uVar2 = (u) view;
            } else {
                uVar2 = f22559g;
            }
            return uVar2.a(a10);
        }
        if (view instanceof u) {
            uVar = (u) view;
        } else {
            uVar = f22559g;
        }
        return uVar.a(cVar);
    }

    public static void x(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 21) {
            y(i10, view);
            s(view, 0);
        }
    }

    public static void y(int i10, View view) {
        List<c.a> j10 = j(view);
        for (int i11 = 0; i11 < j10.size(); i11++) {
            if (j10.get(i11).a() == i10) {
                j10.remove(i11);
                return;
            }
        }
    }

    public static void z(View view, c.a aVar, CharSequence charSequence, p0.g gVar) {
        if (gVar == null) {
            x(view, aVar.a());
            return;
        }
        a(view, new c.a((Object) null, aVar.f23764b, (CharSequence) null, gVar, aVar.f23765c));
    }

    /* compiled from: ViewCompat */
    public static abstract class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f22562a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<T> f22563b;

        /* renamed from: c  reason: collision with root package name */
        public final int f22564c;

        /* renamed from: d  reason: collision with root package name */
        public final int f22565d;

        public b(int i10, Class<T> cls, int i11) {
            this.f22562a = i10;
            this.f22563b = cls;
            this.f22565d = 0;
            this.f22564c = i11;
        }

        public boolean a(Boolean bool, Boolean bool2) {
            if ((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue())) {
                return true;
            }
            return false;
        }

        public abstract T b(View view);

        public abstract void c(View view, T t10);

        public T d(View view) {
            int i10 = Build.VERSION.SDK_INT;
            boolean z10 = false;
            if (i10 >= this.f22564c) {
                return b(view);
            }
            if (i10 >= 19) {
                z10 = true;
            }
            if (!z10) {
                return null;
            }
            T tag = view.getTag(this.f22562a);
            if (this.f22563b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public void e(View view, T t10) {
            int i10 = Build.VERSION.SDK_INT;
            boolean z10 = false;
            if (i10 >= this.f22564c) {
                c(view, t10);
                return;
            }
            if (i10 >= 19) {
                z10 = true;
            }
            if (z10 && f(d(view), t10)) {
                a g10 = c0.g(view);
                if (g10 == null) {
                    g10 = new a();
                }
                c0.C(view, g10);
                view.setTag(this.f22562a, t10);
                c0.s(view, this.f22565d);
            }
        }

        public abstract boolean f(T t10, T t11);

        public b(int i10, Class<T> cls, int i11, int i12) {
            this.f22562a = i10;
            this.f22563b = cls;
            this.f22565d = i11;
            this.f22564c = i12;
        }
    }
}

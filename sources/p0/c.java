package p0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.startapp.b4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p0.g;

/* compiled from: AccessibilityNodeInfoCompat */
public class c {

    /* renamed from: d  reason: collision with root package name */
    public static int f23747d;

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityNodeInfo f23748a;

    /* renamed from: b  reason: collision with root package name */
    public int f23749b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f23750c = -1;

    /* compiled from: AccessibilityNodeInfoCompat */
    public static class a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f23751e = new a(1, (CharSequence) null);

        /* renamed from: f  reason: collision with root package name */
        public static final a f23752f = new a(2, (CharSequence) null);

        /* renamed from: g  reason: collision with root package name */
        public static final a f23753g = new a(16, (CharSequence) null);

        /* renamed from: h  reason: collision with root package name */
        public static final a f23754h = new a(4096, (CharSequence) null);

        /* renamed from: i  reason: collision with root package name */
        public static final a f23755i = new a(8192, (CharSequence) null);

        /* renamed from: j  reason: collision with root package name */
        public static final a f23756j = new a(262144, (CharSequence) null);

        /* renamed from: k  reason: collision with root package name */
        public static final a f23757k = new a(524288, (CharSequence) null);

        /* renamed from: l  reason: collision with root package name */
        public static final a f23758l = new a(1048576, (CharSequence) null);

        /* renamed from: m  reason: collision with root package name */
        public static final a f23759m;

        /* renamed from: n  reason: collision with root package name */
        public static final a f23760n;

        /* renamed from: o  reason: collision with root package name */
        public static final a f23761o;

        /* renamed from: p  reason: collision with root package name */
        public static final a f23762p;

        /* renamed from: a  reason: collision with root package name */
        public final Object f23763a;

        /* renamed from: b  reason: collision with root package name */
        public final int f23764b;

        /* renamed from: c  reason: collision with root package name */
        public final Class<? extends g.a> f23765c;

        /* renamed from: d  reason: collision with root package name */
        public final g f23766d;

        static {
            Class<g.c> cls = g.c.class;
            Class<g.b> cls2 = g.b.class;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            new a(4, (CharSequence) null);
            new a(8, (CharSequence) null);
            new a(32, (CharSequence) null);
            new a(64, (CharSequence) null);
            new a(128, (CharSequence) null);
            new a(256, (CharSequence) null, cls2);
            new a(512, (CharSequence) null, cls2);
            new a(1024, (CharSequence) null, cls);
            new a(2048, (CharSequence) null, cls);
            new a(16384, (CharSequence) null);
            new a(32768, (CharSequence) null);
            new a(65536, (CharSequence) null);
            new a(131072, (CharSequence) null, g.C0208g.class);
            new a(2097152, (CharSequence) null, g.h.class);
            int i10 = Build.VERSION.SDK_INT;
            new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, (CharSequence) null, (g) null, g.e.class);
            f23759m = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            f23760n = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            f23761o = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            f23762p = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            new a(i10 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, (CharSequence) null, (g) null, g.f.class);
            new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (CharSequence) null, (g) null, g.d.class);
            new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, 16908373, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, 16908374, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, 16908375, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            if (i10 >= 33) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            }
            new a(accessibilityAction, 16908376, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
        }

        public a(int i10, CharSequence charSequence) {
            this((Object) null, i10, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
        }

        public int a() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f23763a).getId();
            }
            return 0;
        }

        public CharSequence b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f23763a).getLabel();
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f23763a;
            if (obj2 == null) {
                if (aVar.f23763a != null) {
                    return false;
                }
                return true;
            } else if (!obj2.equals(aVar.f23763a)) {
                return false;
            } else {
                return true;
            }
        }

        public int hashCode() {
            Object obj = this.f23763a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public a(int i10, CharSequence charSequence, Class<? extends g.a> cls) {
            this((Object) null, i10, (CharSequence) null, (g) null, cls);
        }

        public a(Object obj, int i10, CharSequence charSequence, g gVar, Class<? extends g.a> cls) {
            this.f23764b = i10;
            this.f23766d = gVar;
            if (Build.VERSION.SDK_INT < 21 || obj != null) {
                this.f23763a = obj;
            } else {
                this.f23763a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            }
            this.f23765c = cls;
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Object f23767a;

        public b(Object obj) {
            this.f23767a = obj;
        }

        public static b a(int i10, int i11, boolean z10, int i12) {
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 21) {
                return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
            }
            if (i13 >= 19) {
                return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10));
            }
            return new b((Object) null);
        }
    }

    /* renamed from: p0.c$c  reason: collision with other inner class name */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C0207c {

        /* renamed from: a  reason: collision with root package name */
        public final Object f23768a;

        public C0207c(Object obj) {
            this.f23768a = obj;
        }

        public static C0207c a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 21) {
                return new C0207c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
            }
            if (i14 >= 19) {
                return new C0207c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10));
            }
            return new C0207c((Object) null);
        }
    }

    public c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f23748a = accessibilityNodeInfo;
    }

    public static String c(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case b4.f10106f:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i10) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case 16908372:
                                        return "ACTION_IME_ENTER";
                                    case 16908373:
                                        return "ACTION_DRAG_START";
                                    case 16908374:
                                        return "ACTION_DRAG_DROP";
                                    case 16908375:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public static ClickableSpan[] f(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public void a(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f23748a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f23763a);
        }
    }

    public final List<Integer> b(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f23748a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f23748a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    @Deprecated
    public int d() {
        return this.f23748a.getActions();
    }

    public CharSequence e() {
        return this.f23748a.getClassName();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f23748a;
        if (accessibilityNodeInfo == null) {
            if (cVar.f23748a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cVar.f23748a)) {
            return false;
        }
        return this.f23750c == cVar.f23750c && this.f23749b == cVar.f23749b;
    }

    public CharSequence g() {
        return this.f23748a.getContentDescription();
    }

    public Bundle h() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f23748a.getExtras();
        }
        return new Bundle();
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f23748a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public CharSequence i() {
        if (!(!b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty())) {
            return this.f23748a.getText();
        }
        List<Integer> b10 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> b11 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> b12 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> b13 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f23748a.getText(), 0, this.f23748a.getText().length()));
        for (int i10 = 0; i10 < b10.size(); i10++) {
            spannableString.setSpan(new a(b13.get(i10).intValue(), this, h().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), b10.get(i10).intValue(), b11.get(i10).intValue(), b12.get(i10).intValue());
        }
        return spannableString;
    }

    public boolean j() {
        return this.f23748a.isEnabled();
    }

    public boolean k(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f23748a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f23763a);
        }
        return false;
    }

    public final void l(int i10, boolean z10) {
        Bundle h10 = h();
        if (h10 != null) {
            int i11 = h10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i10 ^ -1);
            if (!z10) {
                i10 = 0;
            }
            h10.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    public void m(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        if (Build.VERSION.SDK_INT >= 19) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.f23748a;
            if (obj == null) {
                collectionInfo = null;
            } else {
                collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f23767a;
            }
            accessibilityNodeInfo.setCollectionInfo(collectionInfo);
        }
    }

    public void n(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f23748a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((C0207c) obj).f23768a);
        }
    }

    public void o(CharSequence charSequence) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            this.f23748a.setHintText(charSequence);
        } else if (i10 >= 19) {
            this.f23748a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public void p(View view) {
        this.f23749b = -1;
        this.f23748a.setParent(view);
    }

    public void q(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f23748a.setTraversalAfter(view);
        }
    }

    public String toString() {
        String str;
        ArrayList arrayList;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        this.f23748a.getBoundsInParent(rect);
        sb2.append("; boundsInParent: " + rect);
        this.f23748a.getBoundsInScreen(rect);
        sb2.append("; boundsInScreen: " + rect);
        sb2.append("; packageName: ");
        sb2.append(this.f23748a.getPackageName());
        sb2.append("; className: ");
        sb2.append(e());
        sb2.append("; text: ");
        sb2.append(i());
        sb2.append("; contentDescription: ");
        sb2.append(g());
        sb2.append("; viewId: ");
        int i10 = Build.VERSION.SDK_INT;
        List<AccessibilityNodeInfo.AccessibilityAction> list = null;
        sb2.append(i10 >= 18 ? this.f23748a.getViewIdResourceName() : null);
        sb2.append("; uniqueId: ");
        if (k0.a.a()) {
            str = this.f23748a.getUniqueId();
        } else {
            str = i10 >= 19 ? this.f23748a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY") : null;
        }
        sb2.append(str);
        sb2.append("; checkable: ");
        sb2.append(this.f23748a.isCheckable());
        sb2.append("; checked: ");
        sb2.append(this.f23748a.isChecked());
        sb2.append("; focusable: ");
        sb2.append(this.f23748a.isFocusable());
        sb2.append("; focused: ");
        sb2.append(this.f23748a.isFocused());
        sb2.append("; selected: ");
        sb2.append(this.f23748a.isSelected());
        sb2.append("; clickable: ");
        sb2.append(this.f23748a.isClickable());
        sb2.append("; longClickable: ");
        sb2.append(this.f23748a.isLongClickable());
        sb2.append("; enabled: ");
        sb2.append(j());
        sb2.append("; password: ");
        sb2.append(this.f23748a.isPassword());
        sb2.append("; scrollable: " + this.f23748a.isScrollable());
        sb2.append("; [");
        if (i10 >= 21) {
            if (i10 >= 21) {
                list = this.f23748a.getActionList();
            }
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    arrayList2.add(new a(list.get(i11), 0, (CharSequence) null, (g) null, (Class<? extends g.a>) null));
                }
                arrayList = arrayList2;
            } else {
                arrayList = Collections.emptyList();
            }
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                a aVar = (a) arrayList.get(i12);
                String c10 = c(aVar.a());
                if (c10.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                    c10 = aVar.b().toString();
                }
                sb2.append(c10);
                if (i12 != arrayList.size() - 1) {
                    sb2.append(", ");
                }
            }
        } else {
            int d10 = d();
            while (d10 != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(d10);
                d10 &= numberOfTrailingZeros ^ -1;
                sb2.append(c(numberOfTrailingZeros));
                if (d10 != 0) {
                    sb2.append(", ");
                }
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}

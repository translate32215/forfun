package v0;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.startapp.startappsdk.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import o0.c0;
import p0.c;
import p0.d;
import p0.f;
import s.j;
import v0.b;

/* compiled from: ExploreByTouchHelper */
public abstract class a extends o0.a {

    /* renamed from: n  reason: collision with root package name */
    public static final Rect f26308n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o  reason: collision with root package name */
    public static final b.a<p0.c> f26309o = new C0262a();

    /* renamed from: p  reason: collision with root package name */
    public static final b.C0263b<j<p0.c>, p0.c> f26310p = new b();

    /* renamed from: d  reason: collision with root package name */
    public final Rect f26311d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f26312e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final Rect f26313f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public final int[] f26314g = new int[2];

    /* renamed from: h  reason: collision with root package name */
    public final AccessibilityManager f26315h;

    /* renamed from: i  reason: collision with root package name */
    public final View f26316i;

    /* renamed from: j  reason: collision with root package name */
    public c f26317j;

    /* renamed from: k  reason: collision with root package name */
    public int f26318k = Integer.MIN_VALUE;

    /* renamed from: l  reason: collision with root package name */
    public int f26319l = Integer.MIN_VALUE;

    /* renamed from: m  reason: collision with root package name */
    public int f26320m = Integer.MIN_VALUE;

    /* renamed from: v0.a$a  reason: collision with other inner class name */
    /* compiled from: ExploreByTouchHelper */
    public class C0262a implements b.a<p0.c> {
        public void a(Object obj, Rect rect) {
            ((p0.c) obj).f23748a.getBoundsInParent(rect);
        }
    }

    /* compiled from: ExploreByTouchHelper */
    public class b implements b.C0263b<j<p0.c>, p0.c> {
    }

    /* compiled from: ExploreByTouchHelper */
    public class c extends d {
        public c() {
        }

        public p0.c a(int i10) {
            return new p0.c(AccessibilityNodeInfo.obtain(a.this.o(i10).f23748a));
        }

        public p0.c b(int i10) {
            int i11 = i10 == 2 ? a.this.f26318k : a.this.f26319l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return new p0.c(AccessibilityNodeInfo.obtain(a.this.o(i11).f23748a));
        }

        public boolean c(int i10, int i11, Bundle bundle) {
            int i12;
            a aVar = a.this;
            if (i10 != -1) {
                boolean z10 = true;
                if (i11 == 1) {
                    return aVar.r(i10);
                }
                if (i11 == 2) {
                    return aVar.k(i10);
                }
                if (i11 == 64) {
                    if (!aVar.f26315h.isEnabled() || !aVar.f26315h.isTouchExplorationEnabled() || (i12 = aVar.f26318k) == i10) {
                        z10 = false;
                    } else {
                        if (i12 != Integer.MIN_VALUE) {
                            aVar.j(i12);
                        }
                        aVar.f26318k = i10;
                        aVar.f26316i.invalidate();
                        aVar.s(i10, 32768);
                    }
                    return z10;
                } else if (i11 != 128) {
                    return aVar.p(i10, i11, bundle);
                } else {
                    return aVar.j(i10);
                }
            } else {
                View view = aVar.f26316i;
                WeakHashMap<View, String> weakHashMap = c0.f22553a;
                return c0.d.j(view, i11, bundle);
            }
        }
    }

    public a(View view) {
        if (view != null) {
            this.f26316i = view;
            this.f26315h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            if (c0.d.c(view) == 0) {
                c0.I(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    public d b(View view) {
        if (this.f26317j == null) {
            this.f26317j = new c();
        }
        return this.f26317j;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f22536a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, p0.c cVar) {
        this.f22536a.onInitializeAccessibilityNodeInfo(view, cVar.f23748a);
        Chip.b bVar = (Chip.b) this;
        cVar.f23748a.setCheckable(Chip.this.f());
        cVar.f23748a.setClickable(Chip.this.isClickable());
        cVar.f23748a.setClassName(Chip.this.getAccessibilityClassName());
        CharSequence text = Chip.this.getText();
        if (Build.VERSION.SDK_INT >= 23) {
            cVar.f23748a.setText(text);
        } else {
            cVar.f23748a.setContentDescription(text);
        }
    }

    public final boolean j(int i10) {
        if (this.f26318k != i10) {
            return false;
        }
        this.f26318k = Integer.MIN_VALUE;
        this.f26316i.invalidate();
        s(i10, 65536);
        return true;
    }

    public final boolean k(int i10) {
        if (this.f26319l != i10) {
            return false;
        }
        this.f26319l = Integer.MIN_VALUE;
        Chip.b bVar = (Chip.b) this;
        if (i10 == 1) {
            Chip chip = Chip.this;
            chip.f9079u = false;
            chip.refreshDrawableState();
        }
        s(i10, 8);
        return true;
    }

    public final p0.c l(int i10) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        p0.c cVar = new p0.c(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        obtain.setClassName("android.view.View");
        Rect rect = f26308n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        cVar.p(this.f26316i);
        q(i10, cVar);
        if (cVar.i() == null && cVar.g() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        obtain.getBoundsInParent(this.f26312e);
        if (!this.f26312e.equals(rect)) {
            int d10 = cVar.d();
            if ((d10 & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((d10 & 128) == 0) {
                obtain.setPackageName(this.f26316i.getContext().getPackageName());
                View view = this.f26316i;
                cVar.f23750c = i10;
                obtain.setSource(view, i10);
                boolean z10 = false;
                if (this.f26318k == i10) {
                    obtain.setAccessibilityFocused(true);
                    obtain.addAction(128);
                } else {
                    obtain.setAccessibilityFocused(false);
                    obtain.addAction(64);
                }
                boolean z11 = this.f26319l == i10;
                if (z11) {
                    obtain.addAction(2);
                } else if (obtain.isFocusable()) {
                    obtain.addAction(1);
                }
                obtain.setFocused(z11);
                this.f26316i.getLocationOnScreen(this.f26314g);
                obtain.getBoundsInScreen(this.f26311d);
                if (this.f26311d.equals(rect)) {
                    obtain.getBoundsInParent(this.f26311d);
                    if (cVar.f23749b != -1) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        for (int i11 = cVar.f23749b; i11 != -1; i11 = -1) {
                            obtain2.setParent(this.f26316i, -1);
                            obtain2.setBoundsInParent(f26308n);
                            Chip.b bVar = (Chip.b) this;
                            CharSequence charSequence = "";
                            if (i11 == 1) {
                                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                                if (closeIconContentDescription != null) {
                                    obtain2.setContentDescription(closeIconContentDescription);
                                } else {
                                    CharSequence text = Chip.this.getText();
                                    Context context = Chip.this.getContext();
                                    Object[] objArr = new Object[1];
                                    if (!TextUtils.isEmpty(text)) {
                                        charSequence = text;
                                    }
                                    objArr[0] = charSequence;
                                    obtain2.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim());
                                }
                                obtain2.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
                                c.a aVar = c.a.f23753g;
                                if (Build.VERSION.SDK_INT >= 21) {
                                    obtain2.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f23763a);
                                }
                                obtain2.setEnabled(Chip.this.isEnabled());
                            } else {
                                obtain2.setContentDescription(charSequence);
                                obtain2.setBoundsInParent(Chip.E);
                            }
                            obtain2.getBoundsInParent(this.f26312e);
                            Rect rect2 = this.f26311d;
                            Rect rect3 = this.f26312e;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        obtain2.recycle();
                    }
                    this.f26311d.offset(this.f26314g[0] - this.f26316i.getScrollX(), this.f26314g[1] - this.f26316i.getScrollY());
                }
                if (this.f26316i.getLocalVisibleRect(this.f26313f)) {
                    this.f26313f.offset(this.f26314g[0] - this.f26316i.getScrollX(), this.f26314g[1] - this.f26316i.getScrollY());
                    if (this.f26311d.intersect(this.f26313f)) {
                        cVar.f23748a.setBoundsInScreen(this.f26311d);
                        Rect rect4 = this.f26311d;
                        if (rect4 != null && !rect4.isEmpty() && this.f26316i.getWindowVisibility() == 0) {
                            ViewParent parent = this.f26316i.getParent();
                            while (true) {
                                if (parent instanceof View) {
                                    View view2 = (View) parent;
                                    if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                        break;
                                    }
                                    parent = view2.getParent();
                                } else if (parent != null) {
                                    z10 = true;
                                }
                            }
                        }
                        if (z10) {
                            cVar.f23748a.setVisibleToUser(true);
                        }
                    }
                }
                return cVar;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    public abstract void m(List<Integer> list);

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014a, code lost:
        if (r13 < ((r17 * r17) + ((r12 * 13) * r12))) goto L_0x014c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0156 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean n(int r20, android.graphics.Rect r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.m(r3)
            s.j r4 = new s.j
            r4.<init>()
            r5 = 0
            r6 = 0
        L_0x0015:
            int r7 = r3.size()
            if (r6 >= r7) goto L_0x0039
            java.lang.Object r7 = r3.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            p0.c r7 = r0.l(r7)
            java.lang.Object r8 = r3.get(r6)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r4.h(r8, r7)
            int r6 = r6 + 1
            goto L_0x0015
        L_0x0039:
            int r3 = r0.f26319l
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r7) goto L_0x0041
            r3 = 0
            goto L_0x0047
        L_0x0041:
            java.lang.Object r3 = r4.d(r3)
            p0.c r3 = (p0.c) r3
        L_0x0047:
            r8 = -1
            r9 = 2
            r10 = 1
            if (r1 == r10) goto L_0x0159
            if (r1 == r9) goto L_0x0159
            r9 = 130(0x82, float:1.82E-43)
            r11 = 66
            r12 = 33
            r13 = 17
            if (r1 == r13) goto L_0x0067
            if (r1 == r12) goto L_0x0067
            if (r1 == r11) goto L_0x0067
            if (r1 != r9) goto L_0x005f
            goto L_0x0067
        L_0x005f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L_0x0067:
            android.graphics.Rect r14 = new android.graphics.Rect
            r14.<init>()
            int r15 = r0.f26319l
            java.lang.String r6 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            if (r15 == r7) goto L_0x007c
            p0.c r2 = r0.o(r15)
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.f23748a
            r2.getBoundsInParent(r14)
            goto L_0x00a9
        L_0x007c:
            if (r2 == 0) goto L_0x0082
            r14.set(r2)
            goto L_0x00a9
        L_0x0082:
            android.view.View r2 = r0.f26316i
            int r15 = r2.getWidth()
            int r2 = r2.getHeight()
            if (r1 == r13) goto L_0x00a6
            if (r1 == r12) goto L_0x00a2
            if (r1 == r11) goto L_0x009e
            if (r1 != r9) goto L_0x0098
            r14.set(r5, r8, r15, r8)
            goto L_0x00a9
        L_0x0098:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r6)
            throw r1
        L_0x009e:
            r14.set(r8, r5, r8, r2)
            goto L_0x00a9
        L_0x00a2:
            r14.set(r5, r2, r15, r2)
            goto L_0x00a9
        L_0x00a6:
            r14.set(r15, r5, r15, r2)
        L_0x00a9:
            v0.b$b<s.j<p0.c>, p0.c> r2 = f26310p
            v0.b$a<p0.c> r8 = f26309o
            android.graphics.Rect r15 = new android.graphics.Rect
            r15.<init>(r14)
            if (r1 == r13) goto L_0x00dd
            if (r1 == r12) goto L_0x00d4
            if (r1 == r11) goto L_0x00ca
            if (r1 != r9) goto L_0x00c4
            int r6 = r14.height()
            int r6 = r6 + r10
            int r6 = -r6
            r15.offset(r5, r6)
            goto L_0x00e5
        L_0x00c4:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r6)
            throw r1
        L_0x00ca:
            int r6 = r14.width()
            int r6 = r6 + r10
            int r6 = -r6
            r15.offset(r6, r5)
            goto L_0x00e5
        L_0x00d4:
            int r6 = r14.height()
            int r6 = r6 + r10
            r15.offset(r5, r6)
            goto L_0x00e5
        L_0x00dd:
            int r6 = r14.width()
            int r6 = r6 + r10
            r15.offset(r6, r5)
        L_0x00e5:
            v0.a$b r2 = (v0.a.b) r2
            r2.getClass()
            int r2 = r4.k()
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r9 = 0
            r16 = 0
        L_0x00f6:
            if (r9 >= r2) goto L_0x01cc
            boolean r11 = r4.f24853a
            if (r11 == 0) goto L_0x00ff
            r4.c()
        L_0x00ff:
            java.lang.Object[] r11 = r4.f24855c
            r11 = r11[r9]
            p0.c r11 = (p0.c) r11
            if (r11 != r3) goto L_0x0108
            goto L_0x0156
        L_0x0108:
            r12 = r8
            v0.a$a r12 = (v0.a.C0262a) r12
            r12.a(r11, r6)
            boolean r12 = v0.b.c(r14, r6, r1)
            if (r12 != 0) goto L_0x0115
            goto L_0x014e
        L_0x0115:
            boolean r12 = v0.b.c(r14, r15, r1)
            if (r12 != 0) goto L_0x011c
            goto L_0x014c
        L_0x011c:
            boolean r12 = v0.b.a(r1, r14, r6, r15)
            if (r12 == 0) goto L_0x0123
            goto L_0x014c
        L_0x0123:
            boolean r12 = v0.b.a(r1, r14, r15, r6)
            if (r12 == 0) goto L_0x012a
            goto L_0x014e
        L_0x012a:
            int r12 = v0.b.d(r1, r14, r6)
            int r13 = v0.b.e(r1, r14, r6)
            int r17 = r12 * 13
            int r17 = r17 * r12
            int r13 = r13 * r13
            int r13 = r13 + r17
            int r12 = v0.b.d(r1, r14, r15)
            int r17 = v0.b.e(r1, r14, r15)
            int r18 = r12 * 13
            int r18 = r18 * r12
            int r17 = r17 * r17
            int r12 = r17 + r18
            if (r13 >= r12) goto L_0x014e
        L_0x014c:
            r12 = 1
            goto L_0x014f
        L_0x014e:
            r12 = 0
        L_0x014f:
            if (r12 == 0) goto L_0x0156
            r15.set(r6)
            r16 = r11
        L_0x0156:
            int r9 = r9 + 1
            goto L_0x00f6
        L_0x0159:
            android.view.View r2 = r0.f26316i
            java.util.WeakHashMap<android.view.View, java.lang.String> r6 = o0.c0.f22553a
            int r2 = o0.c0.e.d(r2)
            if (r2 != r10) goto L_0x0165
            r2 = 1
            goto L_0x0166
        L_0x0165:
            r2 = 0
        L_0x0166:
            v0.b$b<s.j<p0.c>, p0.c> r6 = f26310p
            v0.b$a<p0.c> r11 = f26309o
            v0.a$b r6 = (v0.a.b) r6
            r6.getClass()
            int r6 = r4.k()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r6)
        L_0x0178:
            if (r5 >= r6) goto L_0x018d
            boolean r13 = r4.f24853a
            if (r13 == 0) goto L_0x0181
            r4.c()
        L_0x0181:
            java.lang.Object[] r13 = r4.f24855c
            r13 = r13[r5]
            p0.c r13 = (p0.c) r13
            r12.add(r13)
            int r5 = r5 + 1
            goto L_0x0178
        L_0x018d:
            v0.b$c r5 = new v0.b$c
            r5.<init>(r2, r11)
            java.util.Collections.sort(r12, r5)
            if (r1 == r10) goto L_0x01b6
            if (r1 != r9) goto L_0x01ae
            int r1 = r12.size()
            if (r3 != 0) goto L_0x01a0
            goto L_0x01a4
        L_0x01a0:
            int r8 = r12.lastIndexOf(r3)
        L_0x01a4:
            int r8 = r8 + r10
            if (r8 >= r1) goto L_0x01ac
            java.lang.Object r6 = r12.get(r8)
            goto L_0x01c8
        L_0x01ac:
            r6 = 0
            goto L_0x01c8
        L_0x01ae:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."
            r1.<init>(r2)
            throw r1
        L_0x01b6:
            int r1 = r12.size()
            if (r3 != 0) goto L_0x01bd
            goto L_0x01c1
        L_0x01bd:
            int r1 = r12.indexOf(r3)
        L_0x01c1:
            int r1 = r1 + r8
            if (r1 < 0) goto L_0x01ac
            java.lang.Object r6 = r12.get(r1)
        L_0x01c8:
            r16 = r6
            p0.c r16 = (p0.c) r16
        L_0x01cc:
            r1 = r16
            if (r1 != 0) goto L_0x01d1
            goto L_0x01d9
        L_0x01d1:
            int r1 = r4.f(r1)
            int r7 = r4.g(r1)
        L_0x01d9:
            boolean r1 = r0.r(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.a.n(int, android.graphics.Rect):boolean");
    }

    public p0.c o(int i10) {
        if (i10 != -1) {
            return l(i10);
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.f26316i);
        p0.c cVar = new p0.c(obtain);
        View view = this.f26316i;
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        m(arrayList);
        if (obtain.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                cVar.f23748a.addChild(this.f26316i, ((Integer) arrayList.get(i11)).intValue());
            }
            return cVar;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    public abstract boolean p(int i10, int i11, Bundle bundle);

    public abstract void q(int i10, p0.c cVar);

    public final boolean r(int i10) {
        int i11;
        if ((!this.f26316i.isFocused() && !this.f26316i.requestFocus()) || (i11 = this.f26319l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            k(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f26319l = i10;
        Chip.b bVar = (Chip.b) this;
        if (i10 == 1) {
            Chip chip = Chip.this;
            chip.f9079u = true;
            chip.refreshDrawableState();
        }
        s(i10, 8);
        return true;
    }

    public final boolean s(int i10, int i11) {
        ViewParent parent;
        AccessibilityEvent accessibilityEvent;
        if (i10 == Integer.MIN_VALUE || !this.f26315h.isEnabled() || (parent = this.f26316i.getParent()) == null) {
            return false;
        }
        if (i10 != -1) {
            accessibilityEvent = AccessibilityEvent.obtain(i11);
            p0.c o10 = o(i10);
            accessibilityEvent.getText().add(o10.i());
            accessibilityEvent.setContentDescription(o10.g());
            accessibilityEvent.setScrollable(o10.f23748a.isScrollable());
            accessibilityEvent.setPassword(o10.f23748a.isPassword());
            accessibilityEvent.setEnabled(o10.j());
            accessibilityEvent.setChecked(o10.f23748a.isChecked());
            if (!accessibilityEvent.getText().isEmpty() || accessibilityEvent.getContentDescription() != null) {
                accessibilityEvent.setClassName(o10.e());
                f.a(accessibilityEvent, this.f26316i, i10);
                accessibilityEvent.setPackageName(this.f26316i.getContext().getPackageName());
            } else {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
        } else {
            accessibilityEvent = AccessibilityEvent.obtain(i11);
            this.f26316i.onInitializeAccessibilityEvent(accessibilityEvent);
        }
        return parent.requestSendAccessibilityEvent(this.f26316i, accessibilityEvent);
    }
}

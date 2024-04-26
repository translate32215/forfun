package o0;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import p0.c;
import p0.d;

/* compiled from: AccessibilityDelegateCompat */
public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final View.AccessibilityDelegate f22535c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f22536a;

    /* renamed from: b  reason: collision with root package name */
    public final View.AccessibilityDelegate f22537b;

    /* renamed from: o0.a$a  reason: collision with other inner class name */
    /* compiled from: AccessibilityDelegateCompat */
    public static final class C0198a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final a f22538a;

        public C0198a(a aVar) {
            this.f22538a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f22538a.a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            d b10 = this.f22538a.b(view);
            if (b10 != null) {
                return (AccessibilityNodeProvider) b10.f23769a;
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f22538a.c(view, accessibilityEvent);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
            if (r2.isInstance(r8) != false) goto L_0x003b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onInitializeAccessibilityNodeInfo(android.view.View r18, android.view.accessibility.AccessibilityNodeInfo r19) {
            /*
                r17 = this;
                r0 = r18
                r1 = r19
                java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
                p0.c r3 = new p0.c
                r3.<init>(r1)
                java.util.WeakHashMap<android.view.View, java.lang.String> r4 = o0.c0.f22553a
                int r4 = android.os.Build.VERSION.SDK_INT
                r6 = 1
                r7 = 28
                if (r4 < r7) goto L_0x0016
                r8 = 1
                goto L_0x0017
            L_0x0016:
                r8 = 0
            L_0x0017:
                r9 = 0
                r10 = 19
                if (r8 == 0) goto L_0x0025
                boolean r8 = o0.c0.m.d(r18)
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
                goto L_0x003b
            L_0x0025:
                if (r4 < r10) goto L_0x0029
                r8 = 1
                goto L_0x002a
            L_0x0029:
                r8 = 0
            L_0x002a:
                if (r8 == 0) goto L_0x003a
                r8 = 2131428061(0x7f0b02dd, float:1.8477756E38)
                java.lang.Object r8 = r0.getTag(r8)
                boolean r11 = r2.isInstance(r8)
                if (r11 == 0) goto L_0x003a
                goto L_0x003b
            L_0x003a:
                r8 = r9
            L_0x003b:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                if (r8 == 0) goto L_0x0047
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L_0x0047
                r8 = 1
                goto L_0x0048
            L_0x0047:
                r8 = 0
            L_0x0048:
                if (r4 < r7) goto L_0x004e
                r1.setScreenReaderFocusable(r8)
                goto L_0x0051
            L_0x004e:
                r3.l(r6, r8)
            L_0x0051:
                r8 = 2131428056(0x7f0b02d8, float:1.8477746E38)
                if (r4 < r7) goto L_0x0058
                r11 = 1
                goto L_0x0059
            L_0x0058:
                r11 = 0
            L_0x0059:
                if (r11 == 0) goto L_0x0064
                boolean r2 = o0.c0.m.c(r18)
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                goto L_0x0078
            L_0x0064:
                if (r4 < r10) goto L_0x0068
                r11 = 1
                goto L_0x0069
            L_0x0068:
                r11 = 0
            L_0x0069:
                if (r11 == 0) goto L_0x0077
                java.lang.Object r8 = r0.getTag(r8)
                boolean r2 = r2.isInstance(r8)
                if (r2 == 0) goto L_0x0077
                r2 = r8
                goto L_0x0078
            L_0x0077:
                r2 = r9
            L_0x0078:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                if (r2 == 0) goto L_0x0084
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L_0x0084
                r2 = 1
                goto L_0x0085
            L_0x0084:
                r2 = 0
            L_0x0085:
                if (r4 < r7) goto L_0x008b
                r1.setHeading(r2)
                goto L_0x008f
            L_0x008b:
                r8 = 2
                r3.l(r8, r2)
            L_0x008f:
                java.lang.CharSequence r2 = o0.c0.i(r18)
                if (r4 < r7) goto L_0x0099
                r1.setPaneTitle(r2)
                goto L_0x00a4
            L_0x0099:
                if (r4 < r10) goto L_0x00a4
                android.os.Bundle r7 = r19.getExtras()
                java.lang.String r8 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"
                r7.putCharSequence(r8, r2)
            L_0x00a4:
                java.lang.Class<java.lang.CharSequence> r2 = java.lang.CharSequence.class
                r7 = 2131428062(0x7f0b02de, float:1.8477758E38)
                r8 = 30
                if (r4 < r8) goto L_0x00af
                r11 = 1
                goto L_0x00b0
            L_0x00af:
                r11 = 0
            L_0x00b0:
                if (r11 == 0) goto L_0x00b7
                java.lang.CharSequence r9 = o0.c0.o.a(r18)
                goto L_0x00c9
            L_0x00b7:
                if (r4 < r10) goto L_0x00bb
                r11 = 1
                goto L_0x00bc
            L_0x00bb:
                r11 = 0
            L_0x00bc:
                if (r11 == 0) goto L_0x00c9
                java.lang.Object r7 = r0.getTag(r7)
                boolean r2 = r2.isInstance(r7)
                if (r2 == 0) goto L_0x00c9
                r9 = r7
            L_0x00c9:
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                if (r4 < r8) goto L_0x00ce
                goto L_0x00cf
            L_0x00ce:
                r6 = 0
            L_0x00cf:
                if (r6 == 0) goto L_0x00d5
                r1.setStateDescription(r9)
                goto L_0x00e0
            L_0x00d5:
                if (r4 < r10) goto L_0x00e0
                android.os.Bundle r2 = r19.getExtras()
                java.lang.String r6 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"
                r2.putCharSequence(r6, r9)
            L_0x00e0:
                r2 = r17
                o0.a r6 = r2.f22538a
                r6.d(r0, r3)
                java.lang.CharSequence r6 = r19.getText()
                if (r4 < r10) goto L_0x01f7
                r7 = 26
                if (r4 >= r7) goto L_0x01f7
                java.lang.String r7 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY"
                java.lang.String r8 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY"
                java.lang.String r9 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY"
                java.lang.String r11 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"
                if (r4 < r10) goto L_0x0117
                android.os.Bundle r4 = r19.getExtras()
                r4.remove(r11)
                android.os.Bundle r4 = r19.getExtras()
                r4.remove(r9)
                android.os.Bundle r4 = r19.getExtras()
                r4.remove(r8)
                android.os.Bundle r1 = r19.getExtras()
                r1.remove(r7)
            L_0x0117:
                r1 = 2131428055(0x7f0b02d7, float:1.8477744E38)
                java.lang.Object r4 = r0.getTag(r1)
                android.util.SparseArray r4 = (android.util.SparseArray) r4
                if (r4 == 0) goto L_0x015b
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
                r12 = 0
            L_0x0128:
                int r13 = r4.size()
                if (r12 >= r13) goto L_0x0144
                java.lang.Object r13 = r4.valueAt(r12)
                java.lang.ref.WeakReference r13 = (java.lang.ref.WeakReference) r13
                java.lang.Object r13 = r13.get()
                if (r13 != 0) goto L_0x0141
                java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
                r10.add(r13)
            L_0x0141:
                int r12 = r12 + 1
                goto L_0x0128
            L_0x0144:
                r12 = 0
            L_0x0145:
                int r13 = r10.size()
                if (r12 >= r13) goto L_0x015b
                java.lang.Object r13 = r10.get(r12)
                java.lang.Integer r13 = (java.lang.Integer) r13
                int r13 = r13.intValue()
                r4.remove(r13)
                int r12 = r12 + 1
                goto L_0x0145
            L_0x015b:
                android.text.style.ClickableSpan[] r4 = p0.c.f(r6)
                if (r4 == 0) goto L_0x01f7
                int r10 = r4.length
                if (r10 <= 0) goto L_0x01f7
                android.os.Bundle r10 = r3.h()
                r12 = 2131427348(0x7f0b0014, float:1.847631E38)
                java.lang.String r13 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY"
                r10.putInt(r13, r12)
                java.lang.Object r10 = r0.getTag(r1)
                android.util.SparseArray r10 = (android.util.SparseArray) r10
                if (r10 != 0) goto L_0x0180
                android.util.SparseArray r10 = new android.util.SparseArray
                r10.<init>()
                r0.setTag(r1, r10)
            L_0x0180:
                r1 = 0
            L_0x0181:
                int r12 = r4.length
                if (r1 >= r12) goto L_0x01f7
                r12 = r4[r1]
                r13 = 0
            L_0x0187:
                int r14 = r10.size()
                if (r13 >= r14) goto L_0x01a7
                java.lang.Object r14 = r10.valueAt(r13)
                java.lang.ref.WeakReference r14 = (java.lang.ref.WeakReference) r14
                java.lang.Object r14 = r14.get()
                android.text.style.ClickableSpan r14 = (android.text.style.ClickableSpan) r14
                boolean r14 = r12.equals(r14)
                if (r14 == 0) goto L_0x01a4
                int r12 = r10.keyAt(r13)
                goto L_0x01ad
            L_0x01a4:
                int r13 = r13 + 1
                goto L_0x0187
            L_0x01a7:
                int r12 = p0.c.f23747d
                int r13 = r12 + 1
                p0.c.f23747d = r13
            L_0x01ad:
                java.lang.ref.WeakReference r13 = new java.lang.ref.WeakReference
                r14 = r4[r1]
                r13.<init>(r14)
                r10.put(r12, r13)
                r13 = r4[r1]
                r14 = r6
                android.text.Spanned r14 = (android.text.Spanned) r14
                java.util.List r15 = r3.b(r11)
                int r16 = r14.getSpanStart(r13)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r16)
                r15.add(r5)
                java.util.List r5 = r3.b(r9)
                int r15 = r14.getSpanEnd(r13)
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
                r5.add(r15)
                java.util.List r5 = r3.b(r8)
                int r13 = r14.getSpanFlags(r13)
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r5.add(r13)
                java.util.List r5 = r3.b(r7)
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r5.add(r12)
                int r1 = r1 + 1
                goto L_0x0181
            L_0x01f7:
                r1 = 2131428054(0x7f0b02d6, float:1.8477742E38)
                java.lang.Object r0 = r0.getTag(r1)
                java.util.List r0 = (java.util.List) r0
                if (r0 != 0) goto L_0x0206
                java.util.List r0 = java.util.Collections.emptyList()
            L_0x0206:
                r5 = 0
            L_0x0207:
                int r1 = r0.size()
                if (r5 >= r1) goto L_0x0219
                java.lang.Object r1 = r0.get(r5)
                p0.c$a r1 = (p0.c.a) r1
                r3.a(r1)
                int r5 = r5 + 1
                goto L_0x0207
            L_0x0219:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o0.a.C0198a.onInitializeAccessibilityNodeInfo(android.view.View, android.view.accessibility.AccessibilityNodeInfo):void");
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f22538a.e(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f22538a.f(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f22538a.g(view, i10, bundle);
        }

        public void sendAccessibilityEvent(View view, int i10) {
            this.f22538a.h(view, i10);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f22538a.i(view, accessibilityEvent);
        }
    }

    /* compiled from: AccessibilityDelegateCompat */
    public static class b {
        public static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        public static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i10, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i10, bundle);
        }
    }

    public a() {
        this.f22536a = f22535c;
        this.f22537b = new C0198a(this);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f22536a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public d b(View view) {
        AccessibilityNodeProvider a10 = b.a(this.f22536a, view);
        if (a10 != null) {
            return new d(a10);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f22536a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, c cVar) {
        this.f22536a.onInitializeAccessibilityNodeInfo(view, cVar.f23748a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f22536a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f22536a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(android.view.View r9, int r10, android.os.Bundle r11) {
        /*
            r8 = this;
            r0 = 2131428054(0x7f0b02d6, float:1.8477742E38)
            java.lang.Object r0 = r9.getTag(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x000f
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x000f:
            r1 = 0
            r2 = 0
        L_0x0011:
            int r3 = r0.size()
            if (r2 >= r3) goto L_0x0070
            java.lang.Object r3 = r0.get(r2)
            p0.c$a r3 = (p0.c.a) r3
            int r4 = r3.a()
            if (r4 != r10) goto L_0x006d
            p0.g r0 = r3.f23766d
            if (r0 == 0) goto L_0x0070
            r0 = 0
            java.lang.Class<? extends p0.g$a> r2 = r3.f23765c
            if (r2 == 0) goto L_0x0066
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0040 }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r4)     // Catch:{ Exception -> 0x0040 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0040 }
            java.lang.Object r2 = r2.newInstance(r4)     // Catch:{ Exception -> 0x0040 }
            p0.g$a r2 = (p0.g.a) r2     // Catch:{ Exception -> 0x0040 }
            r2.getClass()     // Catch:{ Exception -> 0x003e }
            goto L_0x0065
        L_0x003e:
            r0 = move-exception
            goto L_0x0044
        L_0x0040:
            r2 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
        L_0x0044:
            java.lang.Class<? extends p0.g$a> r4 = r3.f23765c
            if (r4 != 0) goto L_0x004b
            java.lang.String r4 = "null"
            goto L_0x004f
        L_0x004b:
            java.lang.String r4 = r4.getName()
        L_0x004f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to execute command with argument class ViewCommandArgument: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "A11yActionCompat"
            android.util.Log.e(r5, r4, r0)
        L_0x0065:
            r0 = r2
        L_0x0066:
            p0.g r2 = r3.f23766d
            boolean r0 = r2.a(r9, r0)
            goto L_0x0071
        L_0x006d:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0070:
            r0 = 0
        L_0x0071:
            if (r0 != 0) goto L_0x0079
            android.view.View$AccessibilityDelegate r0 = r8.f22536a
            boolean r0 = o0.a.b.b(r0, r9, r10, r11)
        L_0x0079:
            if (r0 != 0) goto L_0x00cc
            r2 = 2131427348(0x7f0b0014, float:1.847631E38)
            if (r10 != r2) goto L_0x00cc
            if (r11 == 0) goto L_0x00cc
            r10 = -1
            java.lang.String r0 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            int r10 = r11.getInt(r0, r10)
            r11 = 2131428055(0x7f0b02d7, float:1.8477744E38)
            java.lang.Object r11 = r9.getTag(r11)
            android.util.SparseArray r11 = (android.util.SparseArray) r11
            r0 = 1
            if (r11 == 0) goto L_0x00cb
            java.lang.Object r10 = r11.get(r10)
            java.lang.ref.WeakReference r10 = (java.lang.ref.WeakReference) r10
            if (r10 == 0) goto L_0x00cb
            java.lang.Object r10 = r10.get()
            android.text.style.ClickableSpan r10 = (android.text.style.ClickableSpan) r10
            if (r10 == 0) goto L_0x00c4
            android.view.accessibility.AccessibilityNodeInfo r11 = r9.createAccessibilityNodeInfo()
            java.lang.CharSequence r11 = r11.getText()
            android.text.style.ClickableSpan[] r11 = p0.c.f(r11)
            r2 = 0
        L_0x00b2:
            if (r11 == 0) goto L_0x00c4
            int r3 = r11.length
            if (r2 >= r3) goto L_0x00c4
            r3 = r11[r2]
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x00c1
            r11 = 1
            goto L_0x00c5
        L_0x00c1:
            int r2 = r2 + 1
            goto L_0x00b2
        L_0x00c4:
            r11 = 0
        L_0x00c5:
            if (r11 == 0) goto L_0x00cb
            r10.onClick(r9)
            r1 = 1
        L_0x00cb:
            r0 = r1
        L_0x00cc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.a.g(android.view.View, int, android.os.Bundle):boolean");
    }

    public void h(View view, int i10) {
        this.f22536a.sendAccessibilityEvent(view, i10);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f22536a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f22536a = accessibilityDelegate;
        this.f22537b = new C0198a(this);
    }
}

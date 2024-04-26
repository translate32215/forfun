package t2;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;

public class u1 {

    /* renamed from: a  reason: collision with root package name */
    public static int f25585a;

    /* renamed from: b  reason: collision with root package name */
    public static int f25586b;

    /* renamed from: c  reason: collision with root package name */
    public static int f25587c;

    /* renamed from: d  reason: collision with root package name */
    public static int f25588d;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        return r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0149, code lost:
        if (r14.isEmpty() == false) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01b5, code lost:
        r9 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0073 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static float a(android.view.View r17, android.graphics.Rect r18, float r19, boolean r20) {
        /*
            r0 = r18
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r3.add(r0)
            android.view.ViewParent r6 = r17.getParent()
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            android.view.View r7 = r17.getRootView()
            android.content.Context r9 = r17.getContext()     // Catch:{ Exception -> 0x0036 }
            android.app.Activity r9 = (android.app.Activity) r9     // Catch:{ Exception -> 0x0036 }
            r10 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r9 = r9.findViewById(r10)     // Catch:{ Exception -> 0x0036 }
            goto L_0x0037
        L_0x0036:
            r9 = 0
        L_0x0037:
            r10 = 0
            if (r6 == 0) goto L_0x0071
            android.view.ViewParent r11 = r6.getParent()
            if (r11 == r7) goto L_0x0071
            int r11 = r6.getVisibility()
            if (r11 != 0) goto L_0x0070
            float r11 = r6.getAlpha()
            int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r10 != 0) goto L_0x004f
            goto L_0x0070
        L_0x004f:
            if (r9 == 0) goto L_0x0066
            if (r20 == 0) goto L_0x0066
            if (r6 == r9) goto L_0x0066
            android.view.ViewGroup$LayoutParams r10 = r6.getLayoutParams()
            int r10 = r10.height
            if (r10 == 0) goto L_0x0065
            android.view.ViewGroup$LayoutParams r10 = r6.getLayoutParams()
            int r10 = r10.width
            if (r10 != 0) goto L_0x0066
        L_0x0065:
            return r19
        L_0x0066:
            r1.addFirst(r6)
            android.view.ViewParent r6 = r6.getParent()
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            goto L_0x0037
        L_0x0070:
            return r19
        L_0x0071:
            if (r6 != 0) goto L_0x0074
            return r19
        L_0x0074:
            java.util.Iterator r1 = r1.iterator()
        L_0x0078:
            boolean r6 = r1.hasNext()
            r7 = 0
            r9 = 1
            if (r6 == 0) goto L_0x0159
            java.lang.Object r6 = r1.next()
            android.view.View r6 = (android.view.View) r6
            android.view.ViewParent r11 = r6.getParent()
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            if (r11 != 0) goto L_0x008f
            return r19
        L_0x008f:
            java.lang.Class r12 = r11.getClass()
            java.lang.String r12 = r12.getSimpleName()
            java.lang.String r13 = "viewpager"
            boolean r12 = r13.equalsIgnoreCase(r12)
            if (r12 == 0) goto L_0x00a1
            goto L_0x0156
        L_0x00a1:
            int r6 = r11.indexOfChild(r6)
            int r12 = r11.getChildCount()
            int r12 = r12 - r9
            if (r6 >= r12) goto L_0x0156
        L_0x00ac:
            int r6 = r6 + r9
            int r12 = r11.getChildCount()
            if (r6 >= r12) goto L_0x0078
            android.view.View r12 = r11.getChildAt(r6)
            boolean r13 = e(r12)
            if (r13 != 0) goto L_0x00d0
            int r13 = r12.getVisibility()
            if (r13 != 0) goto L_0x0152
            float r13 = r12.getAlpha()
            int r13 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r13 == 0) goto L_0x0152
            r4.addFirst(r12)
            goto L_0x0152
        L_0x00d0:
            boolean r13 = r12 instanceof android.view.ViewGroup
            if (r13 != 0) goto L_0x00d6
            goto L_0x014c
        L_0x00d6:
            int r13 = r12.getVisibility()
            if (r13 != 0) goto L_0x014c
            float r13 = r12.getAlpha()
            int r13 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r13 != 0) goto L_0x00e5
            goto L_0x014c
        L_0x00e5:
            java.util.LinkedList r13 = new java.util.LinkedList
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            r13.add(r12)
            java.util.ListIterator r12 = r13.listIterator()
        L_0x00f8:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0145
            java.lang.Object r13 = r12.next()
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            r12.remove()
            int r15 = r13.getChildCount()
            r8 = 0
        L_0x010c:
            if (r8 >= r15) goto L_0x00f8
            android.view.View r9 = r13.getChildAt(r8)
            int r16 = r9.getVisibility()
            if (r16 != 0) goto L_0x0140
            float r16 = r9.getAlpha()
            int r16 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r16 == 0) goto L_0x0140
            boolean r10 = r9 instanceof android.view.ViewGroup
            if (r10 == 0) goto L_0x0137
            boolean r10 = e(r9)
            if (r10 == 0) goto L_0x0133
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r12.add(r9)
            r12.previous()
            goto L_0x0140
        L_0x0133:
            r14.add(r9)
            goto L_0x0140
        L_0x0137:
            boolean r10 = e(r9)
            if (r10 != 0) goto L_0x0140
            r14.add(r9)
        L_0x0140:
            int r8 = r8 + 1
            r9 = 1
            r10 = 0
            goto L_0x010c
        L_0x0145:
            boolean r8 = r14.isEmpty()
            if (r8 != 0) goto L_0x014c
            goto L_0x014d
        L_0x014c:
            r14 = 0
        L_0x014d:
            if (r14 == 0) goto L_0x0152
            r4.addAll(r7, r14)
        L_0x0152:
            r9 = 1
            r10 = 0
            goto L_0x00ac
        L_0x0156:
            r10 = 0
            goto L_0x0078
        L_0x0159:
            java.util.Iterator r1 = r4.iterator()
            r4 = 0
        L_0x015e:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x01b5
            java.lang.Object r6 = r1.next()
            android.view.View r6 = (android.view.View) r6
            int r8 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r8 < 0) goto L_0x016f
            goto L_0x01b5
        L_0x016f:
            if (r6 == 0) goto L_0x0187
            java.lang.Object r8 = r6.getTag()     // Catch:{ Exception -> 0x0186 }
            if (r8 == 0) goto L_0x0187
            java.lang.Object r8 = r6.getTag()     // Catch:{ Exception -> 0x0186 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0186 }
            java.lang.String r9 = "BTN_CLOSE"
            boolean r8 = r8.contains(r9)     // Catch:{ Exception -> 0x0186 }
            if (r8 == 0) goto L_0x0187
            goto L_0x015e
        L_0x0186:
        L_0x0187:
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            boolean r6 = r6.getGlobalVisibleRect(r8)
            if (r6 != 0) goto L_0x0193
            goto L_0x015e
        L_0x0193:
            if (r20 == 0) goto L_0x019b
            int r6 = r8.top
            r9 = 1
            int r6 = r6 + r9
            r8.top = r6
        L_0x019b:
            boolean r6 = r8.intersect(r0)
            if (r6 == 0) goto L_0x015e
            r2.add(r8)
            int r4 = r8.width()
            int r6 = r8.height()
            int r6 = r6 * r4
            float r4 = (float) r6
            int r6 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r6 < 0) goto L_0x015e
            r9 = 1
            goto L_0x01b6
        L_0x01b5:
            r9 = 0
        L_0x01b6:
            if (r9 == 0) goto L_0x01b9
            return r19
        L_0x01b9:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x02a5
            int r0 = r2.size()
            r9 = 1
            if (r0 != r9) goto L_0x01c7
            return r4
        L_0x01c7:
            java.util.Iterator r0 = r2.iterator()
        L_0x01cb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x027a
            java.lang.Object r1 = r0.next()
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            r5.clear()
            r5.addAll(r3)
            r2 = 0
        L_0x01de:
            int r6 = r5.size()
            if (r2 >= r6) goto L_0x01cb
            java.lang.Object r6 = r5.get(r2)
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            boolean r8 = r1.intersect(r6)
            if (r8 == 0) goto L_0x0276
            java.lang.Object r8 = r5.get(r2)
            r3.remove(r8)
            r8 = 1
        L_0x01f8:
            r10 = 9
            if (r8 >= r10) goto L_0x0276
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            switch(r8) {
                case 1: goto L_0x0259;
                case 2: goto L_0x024d;
                case 3: goto L_0x0241;
                case 4: goto L_0x0235;
                case 5: goto L_0x0229;
                case 6: goto L_0x021d;
                case 7: goto L_0x0211;
                case 8: goto L_0x0205;
                default: goto L_0x0204;
            }
        L_0x0204:
            goto L_0x0264
        L_0x0205:
            int r11 = r6.left
            int r12 = r1.top
            int r13 = r1.left
            int r14 = r1.bottom
            r10.set(r11, r12, r13, r14)
            goto L_0x0264
        L_0x0211:
            int r11 = r6.left
            int r12 = r1.bottom
            int r13 = r1.left
            int r14 = r6.bottom
            r10.set(r11, r12, r13, r14)
            goto L_0x0264
        L_0x021d:
            int r11 = r1.left
            int r12 = r1.bottom
            int r13 = r1.right
            int r14 = r6.bottom
            r10.set(r11, r12, r13, r14)
            goto L_0x0264
        L_0x0229:
            int r11 = r1.right
            int r12 = r1.bottom
            int r13 = r6.right
            int r14 = r6.bottom
            r10.set(r11, r12, r13, r14)
            goto L_0x0264
        L_0x0235:
            int r11 = r1.right
            int r12 = r1.top
            int r13 = r6.right
            int r14 = r1.bottom
            r10.set(r11, r12, r13, r14)
            goto L_0x0264
        L_0x0241:
            int r11 = r1.right
            int r12 = r6.top
            int r13 = r6.right
            int r14 = r1.top
            r10.set(r11, r12, r13, r14)
            goto L_0x0264
        L_0x024d:
            int r11 = r1.left
            int r12 = r6.top
            int r13 = r1.right
            int r14 = r1.top
            r10.set(r11, r12, r13, r14)
            goto L_0x0264
        L_0x0259:
            int r11 = r6.left
            int r12 = r6.top
            int r13 = r1.left
            int r14 = r1.top
            r10.set(r11, r12, r13, r14)
        L_0x0264:
            int r11 = r10.height()
            if (r11 <= 0) goto L_0x0273
            int r11 = r10.width()
            if (r11 <= 0) goto L_0x0273
            r3.add(r10)
        L_0x0273:
            int r8 = r8 + 1
            goto L_0x01f8
        L_0x0276:
            int r2 = r2 + 1
            goto L_0x01de
        L_0x027a:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x02a5
            java.util.Iterator r0 = r3.iterator()
            r10 = 0
        L_0x0285:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x029e
            java.lang.Object r1 = r0.next()
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            int r2 = r1.width()
            int r1 = r1.height()
            int r1 = r1 * r2
            float r1 = (float) r1
            float r10 = r10 + r1
            goto L_0x0285
        L_0x029e:
            int r0 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r0 >= 0) goto L_0x02a5
            float r0 = r19 - r10
            return r0
        L_0x02a5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.u1.a(android.view.View, android.graphics.Rect, float, boolean):float");
    }

    public static int b(Context context) {
        int i10;
        int i11;
        int i12 = context.getResources().getConfiguration().orientation;
        if (i12 == 2 && (i11 = f25585a) > 0) {
            return i11;
        }
        if (i12 == 1 && (i10 = f25587c) > 0) {
            return i10;
        }
        try {
            Point point = new Point();
            ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getSize(point);
            int i13 = point.y;
            if (i12 == 2) {
                f25585a = i13;
            } else if (i12 == 1) {
                f25587c = i13;
            }
            return i13;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static float c(View view) {
        return view.getAlpha();
    }

    public static int d(Context context) {
        int i10;
        int i11;
        int i12 = context.getResources().getConfiguration().orientation;
        if (i12 == 2 && (i11 = f25586b) > 0) {
            return i11;
        }
        if (i12 == 1 && (i10 = f25588d) > 0) {
            return i10;
        }
        try {
            Point point = new Point();
            ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getSize(point);
            int i13 = point.x;
            if (i12 == 2) {
                f25586b = i13;
            } else if (i12 == 1) {
                f25588d = i13;
            }
            return i13;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static boolean e(View view) {
        if (view == null) {
            return false;
        }
        if (view.getBackground() == null || (Build.VERSION.SDK_INT > 18 && view.getBackground().getAlpha() == 0)) {
            return true;
        }
        return false;
    }
}

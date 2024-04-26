package b2;

import android.os.Build;
import android.view.ViewGroup;

/* compiled from: ViewGroupUtils */
public class v {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f3446a = true;

    public static u a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new t(viewGroup);
        }
        return (s) y.a(viewGroup);
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(android.view.ViewGroup r8, boolean r9) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L_0x000b
            r8.suppressLayout(r9)
            goto L_0x00da
        L_0x000b:
            r1 = 18
            r2 = 0
            if (r0 < r1) goto L_0x001d
            boolean r0 = f3446a
            if (r0 == 0) goto L_0x00da
            r8.suppressLayout(r9)     // Catch:{ NoSuchMethodError -> 0x0019 }
            goto L_0x00da
        L_0x0019:
            f3446a = r2
            goto L_0x00da
        L_0x001d:
            android.animation.LayoutTransition r0 = b2.x.f3447a
            r1 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0044
            b2.w r0 = new b2.w
            r0.<init>()
            b2.x.f3447a = r0
            r4 = 2
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = b2.x.f3447a
            r0.setAnimator(r2, r3)
            android.animation.LayoutTransition r0 = b2.x.f3447a
            r0.setAnimator(r1, r3)
            android.animation.LayoutTransition r0 = b2.x.f3447a
            r4 = 3
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = b2.x.f3447a
            r4 = 4
            r0.setAnimator(r4, r3)
        L_0x0044:
            r0 = 2131428111(0x7f0b030f, float:1.8477857E38)
            java.lang.String r4 = "ViewGroupUtilsApi14"
            if (r9 == 0) goto L_0x0092
            android.animation.LayoutTransition r9 = r8.getLayoutTransition()
            if (r9 == 0) goto L_0x008c
            boolean r3 = r9.isRunning()
            if (r3 == 0) goto L_0x0085
            boolean r3 = b2.x.f3451e
            java.lang.String r5 = "Failed to access cancel method by reflection"
            if (r3 != 0) goto L_0x0072
            java.lang.Class<android.animation.LayoutTransition> r3 = android.animation.LayoutTransition.class
            java.lang.String r6 = "cancel"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x006d }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x006d }
            b2.x.f3450d = r3     // Catch:{ NoSuchMethodException -> 0x006d }
            r3.setAccessible(r1)     // Catch:{ NoSuchMethodException -> 0x006d }
            goto L_0x0070
        L_0x006d:
            android.util.Log.i(r4, r5)
        L_0x0070:
            b2.x.f3451e = r1
        L_0x0072:
            java.lang.reflect.Method r1 = b2.x.f3450d
            if (r1 == 0) goto L_0x0085
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException -> 0x0082, InvocationTargetException -> 0x007c }
            r1.invoke(r9, r2)     // Catch:{ IllegalAccessException -> 0x0082, InvocationTargetException -> 0x007c }
            goto L_0x0085
        L_0x007c:
            java.lang.String r1 = "Failed to invoke cancel method by reflection"
            android.util.Log.i(r4, r1)
            goto L_0x0085
        L_0x0082:
            android.util.Log.i(r4, r5)
        L_0x0085:
            android.animation.LayoutTransition r1 = b2.x.f3447a
            if (r9 == r1) goto L_0x008c
            r8.setTag(r0, r9)
        L_0x008c:
            android.animation.LayoutTransition r9 = b2.x.f3447a
            r8.setLayoutTransition(r9)
            goto L_0x00da
        L_0x0092:
            r8.setLayoutTransition(r3)
            boolean r9 = b2.x.f3449c
            if (r9 != 0) goto L_0x00ae
            java.lang.Class<android.view.ViewGroup> r9 = android.view.ViewGroup.class
            java.lang.String r5 = "mLayoutSuppressed"
            java.lang.reflect.Field r9 = r9.getDeclaredField(r5)     // Catch:{ NoSuchFieldException -> 0x00a7 }
            b2.x.f3448b = r9     // Catch:{ NoSuchFieldException -> 0x00a7 }
            r9.setAccessible(r1)     // Catch:{ NoSuchFieldException -> 0x00a7 }
            goto L_0x00ac
        L_0x00a7:
            java.lang.String r9 = "Failed to access mLayoutSuppressed field by reflection"
            android.util.Log.i(r4, r9)
        L_0x00ac:
            b2.x.f3449c = r1
        L_0x00ae:
            java.lang.reflect.Field r9 = b2.x.f3448b
            if (r9 == 0) goto L_0x00c7
            boolean r9 = r9.getBoolean(r8)     // Catch:{ IllegalAccessException -> 0x00c2 }
            if (r9 == 0) goto L_0x00c0
            java.lang.reflect.Field r1 = b2.x.f3448b     // Catch:{ IllegalAccessException -> 0x00be }
            r1.setBoolean(r8, r2)     // Catch:{ IllegalAccessException -> 0x00be }
            goto L_0x00c0
        L_0x00be:
            r2 = r9
            goto L_0x00c2
        L_0x00c0:
            r2 = r9
            goto L_0x00c7
        L_0x00c2:
            java.lang.String r9 = "Failed to get mLayoutSuppressed field by reflection"
            android.util.Log.i(r4, r9)
        L_0x00c7:
            if (r2 == 0) goto L_0x00cc
            r8.requestLayout()
        L_0x00cc:
            java.lang.Object r9 = r8.getTag(r0)
            android.animation.LayoutTransition r9 = (android.animation.LayoutTransition) r9
            if (r9 == 0) goto L_0x00da
            r8.setTag(r0, r3)
            r8.setLayoutTransition(r9)
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.v.b(android.view.ViewGroup, boolean):void");
    }
}

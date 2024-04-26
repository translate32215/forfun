package z9;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public final class h extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final ProgressBar f28746a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f28747b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(android.content.Context r8) {
        /*
            r7 = this;
            android.net.Uri r0 = z9.p.f28773a
            r0 = 0
            java.lang.String r1 = z9.p.a(r8)     // Catch:{ NameNotFoundException -> 0x000d }
            r2 = 3
            android.content.Context r1 = r8.createPackageContext(r1, r2)     // Catch:{ NameNotFoundException -> 0x000d }
            goto L_0x000e
        L_0x000d:
            r1 = r0
        L_0x000e:
            r2 = 0
            if (r1 == 0) goto L_0x0021
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r2 = z9.p.a(r8)
            java.lang.String r3 = "clientTheme"
            java.lang.String r4 = "style"
            int r2 = r1.getIdentifier(r3, r4, r2)
        L_0x0021:
            if (r2 != 0) goto L_0x0026
            r2 = 16974120(0x1030128, float:2.406173E-38)
        L_0x0026:
            r7.<init>(r8, r0, r2)
            e8.xd r0 = new e8.xd
            r0.<init>(r8)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r7.setBackgroundColor(r1)
            android.widget.ProgressBar r1 = new android.widget.ProgressBar
            r1.<init>(r8)
            r7.f28746a = r1
            r2 = 8
            r1.setVisibility(r2)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = -2
            r5 = 17
            r3.<init>(r4, r4, r5)
            r7.addView(r1, r3)
            r1 = 1092616192(0x41200000, float:10.0)
            android.content.res.Resources r3 = r8.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r3 = r3 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r1
            int r1 = (int) r3
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r8)
            r7.f28747b = r3
            r6 = 16973894(0x1030046, float:2.4061096E-38)
            r3.setTextAppearance(r8, r6)
            r8 = -1
            r3.setTextColor(r8)
            r3.setVisibility(r2)
            r3.setPadding(r1, r1, r1, r1)
            r3.setGravity(r5)
            e8.ab0<android.content.Context> r8 = r0.f17471a
            java.lang.String r8 = (java.lang.String) r8
            r3.setText(r8)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r8.<init>(r4, r4, r5)
            r7.addView(r3, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z9.h.<init>(android.content.Context):void");
    }

    public final void onMeasure(int i10, int i11) {
        float f10;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (mode == 1073741824 || (mode == Integer.MIN_VALUE && mode2 == 0)) {
                size2 = (int) (((float) size) / 1.777f);
            } else {
                if (mode2 == 1073741824 || (mode2 == Integer.MIN_VALUE && mode == 0)) {
                    f10 = (float) size2;
                } else if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
                    f10 = (float) size2;
                    float f11 = ((float) size) / 1.777f;
                    if (f10 >= f11) {
                        size2 = (int) f11;
                    }
                } else {
                    size = 0;
                    size2 = 0;
                }
                size = (int) (f10 * 1.777f);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(FrameLayout.resolveSize(size, i10), 1073741824), View.MeasureSpec.makeMeasureSpec(FrameLayout.resolveSize(size2, i11), 1073741824));
    }
}

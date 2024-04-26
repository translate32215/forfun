package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.startapp.startappsdk.R;
import java.util.WeakHashMap;
import o0.c0;

public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public TextView f9394a;

    /* renamed from: b  reason: collision with root package name */
    public Button f9395b;

    /* renamed from: c  reason: collision with root package name */
    public int f9396c;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean a(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f9394a.getPaddingTop() == i11 && this.f9394a.getPaddingBottom() == i12) {
            return z10;
        }
        TextView textView = this.f9394a;
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        if (c0.e.g(textView)) {
            c0.e.k(textView, c0.e.f(textView), i11, c0.e.e(textView), i12);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i11, textView.getPaddingRight(), i12);
        return true;
    }

    public Button getActionView() {
        return this.f9395b;
    }

    public TextView getMessageView() {
        return this.f9394a;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f9394a = (TextView) findViewById(R.id.snackbar_text);
        this.f9395b = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        if (a(1, r0, r0 - r2) != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (a(0, r0, r0) != false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto L_0x000b
            return
        L_0x000b:
            android.content.res.Resources r0 = r7.getResources()
            r2 = 2131165325(0x7f07008d, float:1.7944864E38)
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            r3 = 2131165324(0x7f07008c, float:1.7944862E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.f9394a
            android.text.Layout r3 = r3.getLayout()
            int r3 = r3.getLineCount()
            r4 = 0
            if (r3 <= r1) goto L_0x0030
            r3 = 1
            goto L_0x0031
        L_0x0030:
            r3 = 0
        L_0x0031:
            if (r3 == 0) goto L_0x004a
            int r5 = r7.f9396c
            if (r5 <= 0) goto L_0x004a
            android.widget.Button r5 = r7.f9395b
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f9396c
            if (r5 <= r6) goto L_0x004a
            int r2 = r0 - r2
            boolean r0 = r7.a(r1, r0, r2)
            if (r0 == 0) goto L_0x0055
            goto L_0x0056
        L_0x004a:
            if (r3 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r0 = r2
        L_0x004e:
            boolean r0 = r7.a(r4, r0, r0)
            if (r0 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r1 = 0
        L_0x0056:
            if (r1 == 0) goto L_0x005b
            super.onMeasure(r8, r9)
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f9396c = i10;
    }
}

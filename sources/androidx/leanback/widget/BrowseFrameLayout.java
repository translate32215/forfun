package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.leanback.app.h;
import com.startapp.startappsdk.R;

public class BrowseFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public b f2118a;

    /* renamed from: b  reason: collision with root package name */
    public a f2119b;

    /* renamed from: c  reason: collision with root package name */
    public View.OnKeyListener f2120c;

    public interface a {
    }

    public interface b {
    }

    public BrowseFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        View.OnKeyListener onKeyListener = this.f2120c;
        return (onKeyListener == null || dispatchKeyEvent) ? dispatchKeyEvent : onKeyListener.onKey(getRootView(), keyEvent.getKeyCode(), keyEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0094, code lost:
        if (r1 == null) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a1 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View focusSearch(android.view.View r7, int r8) {
        /*
            r6 = this;
            androidx.leanback.widget.BrowseFrameLayout$b r0 = r6.f2118a
            if (r0 == 0) goto L_0x00a2
            androidx.leanback.app.h$f r0 = (androidx.leanback.app.h.f) r0
            androidx.leanback.app.h r1 = androidx.leanback.app.h.this
            boolean r2 = r1.f1960e1
            if (r2 == 0) goto L_0x0014
            boolean r1 = r1.B0()
            if (r1 == 0) goto L_0x0014
            goto L_0x0081
        L_0x0014:
            androidx.leanback.app.h r1 = androidx.leanback.app.h.this
            android.view.View r1 = r1.f1950q0
            if (r1 == 0) goto L_0x0022
            if (r7 == r1) goto L_0x0022
            r2 = 33
            if (r8 != r2) goto L_0x0022
            goto L_0x009f
        L_0x0022:
            r2 = 130(0x82, float:1.82E-43)
            if (r1 == 0) goto L_0x0044
            boolean r1 = r1.hasFocus()
            if (r1 == 0) goto L_0x0044
            if (r8 != r2) goto L_0x0044
            androidx.leanback.app.h r0 = androidx.leanback.app.h.this
            boolean r1 = r0.f1960e1
            if (r1 == 0) goto L_0x003d
            boolean r1 = r0.f1959d1
            if (r1 == 0) goto L_0x003d
            androidx.leanback.app.l r0 = r0.R0
            androidx.leanback.widget.VerticalGridView r0 = r0.f1924o0
            goto L_0x0041
        L_0x003d:
            androidx.fragment.app.p r0 = r0.Q0
            android.view.View r0 = r0.Q
        L_0x0041:
            r1 = r0
            goto L_0x009f
        L_0x0044:
            java.util.WeakHashMap<android.view.View, java.lang.String> r1 = o0.c0.f22553a
            int r1 = o0.c0.e.d(r7)
            r3 = 1
            if (r1 != r3) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r3 = 0
        L_0x004f:
            r1 = 17
            r4 = 66
            if (r3 == 0) goto L_0x0058
            r5 = 66
            goto L_0x005a
        L_0x0058:
            r5 = 17
        L_0x005a:
            if (r3 == 0) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            r1 = 66
        L_0x005f:
            androidx.leanback.app.h r3 = androidx.leanback.app.h.this
            boolean r4 = r3.f1960e1
            if (r4 == 0) goto L_0x0083
            if (r8 != r5) goto L_0x0083
            boolean r1 = r3.C0()
            if (r1 != 0) goto L_0x0081
            androidx.leanback.app.h r1 = androidx.leanback.app.h.this
            boolean r2 = r1.f1959d1
            if (r2 != 0) goto L_0x0081
            boolean r1 = r1.A0()
            if (r1 != 0) goto L_0x007a
            goto L_0x0081
        L_0x007a:
            androidx.leanback.app.h r0 = androidx.leanback.app.h.this
            androidx.leanback.app.l r0 = r0.R0
            androidx.leanback.widget.VerticalGridView r0 = r0.f1924o0
            goto L_0x0041
        L_0x0081:
            r1 = r7
            goto L_0x009f
        L_0x0083:
            if (r8 != r1) goto L_0x0097
            boolean r1 = r3.C0()
            if (r1 == 0) goto L_0x008c
            goto L_0x0081
        L_0x008c:
            androidx.leanback.app.h r0 = androidx.leanback.app.h.this
            androidx.fragment.app.p r0 = r0.Q0
            if (r0 == 0) goto L_0x0081
            android.view.View r1 = r0.Q
            if (r1 == 0) goto L_0x0081
            goto L_0x009f
        L_0x0097:
            if (r8 != r2) goto L_0x009e
            boolean r0 = r3.f1959d1
            if (r0 == 0) goto L_0x009e
            goto L_0x0081
        L_0x009e:
            r1 = 0
        L_0x009f:
            if (r1 == 0) goto L_0x00a2
            return r1
        L_0x00a2:
            android.view.View r7 = super.focusSearch(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.BrowseFrameLayout.focusSearch(android.view.View, int):android.view.View");
    }

    public a getOnChildFocusListener() {
        return this.f2119b;
    }

    public b getOnFocusSearchListener() {
        return this.f2118a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x004d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onRequestFocusInDescendants(int r5, android.graphics.Rect r6) {
        /*
            r4 = this;
            androidx.leanback.widget.BrowseFrameLayout$a r0 = r4.f2119b
            if (r0 == 0) goto L_0x004e
            androidx.leanback.app.h$g r0 = (androidx.leanback.app.h.g) r0
            androidx.leanback.app.h r1 = androidx.leanback.app.h.this
            androidx.fragment.app.a0 r1 = r1.p()
            boolean r1 = r1.I
            r2 = 1
            if (r1 == 0) goto L_0x0012
            goto L_0x0048
        L_0x0012:
            androidx.leanback.app.h r1 = androidx.leanback.app.h.this
            boolean r3 = r1.f1960e1
            if (r3 == 0) goto L_0x002b
            boolean r3 = r1.f1959d1
            if (r3 == 0) goto L_0x002b
            androidx.leanback.app.l r1 = r1.R0
            if (r1 == 0) goto L_0x002b
            android.view.View r1 = r1.Q
            if (r1 == 0) goto L_0x002b
            boolean r1 = r1.requestFocus(r5, r6)
            if (r1 == 0) goto L_0x002b
            goto L_0x0048
        L_0x002b:
            androidx.leanback.app.h r1 = androidx.leanback.app.h.this
            androidx.fragment.app.p r1 = r1.Q0
            if (r1 == 0) goto L_0x003c
            android.view.View r1 = r1.Q
            if (r1 == 0) goto L_0x003c
            boolean r1 = r1.requestFocus(r5, r6)
            if (r1 == 0) goto L_0x003c
            goto L_0x0048
        L_0x003c:
            androidx.leanback.app.h r0 = androidx.leanback.app.h.this
            android.view.View r0 = r0.f1950q0
            if (r0 == 0) goto L_0x004a
            boolean r0 = r0.requestFocus(r5, r6)
            if (r0 == 0) goto L_0x004a
        L_0x0048:
            r0 = 1
            goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            if (r0 == 0) goto L_0x004e
            return r2
        L_0x004e:
            boolean r5 = super.onRequestFocusInDescendants(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.BrowseFrameLayout.onRequestFocusInDescendants(int, android.graphics.Rect):boolean");
    }

    public void requestChildFocus(View view, View view2) {
        a aVar = this.f2119b;
        if (aVar != null) {
            h.g gVar = (h.g) aVar;
            if (!h.this.p().I) {
                h hVar = h.this;
                if (hVar.f1960e1 && !hVar.B0()) {
                    int id2 = view.getId();
                    if (id2 == R.id.browse_container_dock) {
                        h hVar2 = h.this;
                        if (hVar2.f1959d1) {
                            hVar2.L0(false);
                        }
                    }
                    if (id2 == R.id.browse_headers_dock) {
                        h hVar3 = h.this;
                        if (!hVar3.f1959d1) {
                            hVar3.L0(true);
                        }
                    }
                }
            }
        }
        super.requestChildFocus(view, view2);
    }

    public void setOnChildFocusListener(a aVar) {
        this.f2119b = aVar;
    }

    public void setOnDispatchKeyListener(View.OnKeyListener onKeyListener) {
        this.f2120c = onKeyListener;
    }

    public void setOnFocusSearchListener(b bVar) {
        this.f2118a = bVar;
    }
}

package z0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: EmojiKeyListener */
public final class e implements KeyListener {

    /* renamed from: a  reason: collision with root package name */
    public final KeyListener f28194a;

    /* renamed from: b  reason: collision with root package name */
    public final a f28195b;

    /* compiled from: EmojiKeyListener */
    public static class a {
    }

    public e(KeyListener keyListener) {
        a aVar = new a();
        this.f28194a = keyListener;
        this.f28195b = aVar;
    }

    public void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f28194a.clearMetaKeyState(view, editable, i10);
    }

    public int getInputType() {
        return this.f28194a.getInputType();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(android.view.View r5, android.text.Editable r6, int r7, android.view.KeyEvent r8) {
        /*
            r4 = this;
            z0.e$a r0 = r4.f28195b
            r0.getClass()
            java.lang.Object r0 = androidx.emoji2.text.e.f1506j
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            r2 = 1
            r3 = 0
            if (r0 < r1) goto L_0x0029
            r0 = 67
            if (r7 == r0) goto L_0x001e
            r0 = 112(0x70, float:1.57E-43)
            if (r7 == r0) goto L_0x0019
            r0 = 0
            goto L_0x0022
        L_0x0019:
            boolean r0 = androidx.emoji2.text.i.a(r6, r8, r2)
            goto L_0x0022
        L_0x001e:
            boolean r0 = androidx.emoji2.text.i.a(r6, r8, r3)
        L_0x0022:
            if (r0 == 0) goto L_0x0029
            android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(r6)
            r0 = 1
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            if (r0 != 0) goto L_0x0036
            android.text.method.KeyListener r0 = r4.f28194a
            boolean r5 = r0.onKeyDown(r5, r6, r7, r8)
            if (r5 == 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r2 = 0
        L_0x0036:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.e.onKeyDown(android.view.View, android.text.Editable, int, android.view.KeyEvent):boolean");
    }

    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f28194a.onKeyOther(view, editable, keyEvent);
    }

    public boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f28194a.onKeyUp(view, editable, i10, keyEvent);
    }
}

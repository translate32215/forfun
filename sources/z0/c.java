package z0;

import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.e;

/* compiled from: EmojiInputConnection */
public final class c extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f28188a;

    /* renamed from: b  reason: collision with root package name */
    public final a f28189b;

    /* compiled from: EmojiInputConnection */
    public static class a {
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
            if (java.lang.Character.isHighSurrogate(r5) != false) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0082, code lost:
            if (r12 != false) goto L_0x00ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x008f, code lost:
            if (java.lang.Character.isLowSurrogate(r5) != false) goto L_0x0092;
         */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x007e A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(android.view.inputmethod.InputConnection r8, android.text.Editable r9, int r10, int r11, boolean r12) {
            /*
                r7 = this;
                java.lang.Object r0 = androidx.emoji2.text.e.f1506j
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 0
                r2 = 1
                r3 = 19
                if (r0 < r3) goto L_0x00fd
                if (r9 == 0) goto L_0x00fd
                if (r10 < 0) goto L_0x00fd
                if (r11 >= 0) goto L_0x0012
                goto L_0x00fd
            L_0x0012:
                int r0 = android.text.Selection.getSelectionStart(r9)
                int r3 = android.text.Selection.getSelectionEnd(r9)
                r4 = -1
                if (r0 == r4) goto L_0x0024
                if (r3 == r4) goto L_0x0024
                if (r0 == r3) goto L_0x0022
                goto L_0x0024
            L_0x0022:
                r5 = 0
                goto L_0x0025
            L_0x0024:
                r5 = 1
            L_0x0025:
                if (r5 == 0) goto L_0x0029
                goto L_0x00fd
            L_0x0029:
                if (r12 == 0) goto L_0x00b3
                int r10 = java.lang.Math.max(r10, r1)
                int r12 = r9.length()
                if (r0 < 0) goto L_0x006a
                if (r12 >= r0) goto L_0x0038
                goto L_0x006a
            L_0x0038:
                if (r10 >= 0) goto L_0x003b
                goto L_0x006a
            L_0x003b:
                r12 = 0
            L_0x003c:
                if (r10 != 0) goto L_0x003f
                goto L_0x006b
            L_0x003f:
                int r0 = r0 + -1
                if (r0 >= 0) goto L_0x0048
                if (r12 == 0) goto L_0x0046
                goto L_0x006a
            L_0x0046:
                r0 = 0
                goto L_0x006b
            L_0x0048:
                char r5 = r9.charAt(r0)
                if (r12 == 0) goto L_0x0058
                boolean r12 = java.lang.Character.isHighSurrogate(r5)
                if (r12 != 0) goto L_0x0055
                goto L_0x006a
            L_0x0055:
                int r10 = r10 + -1
                goto L_0x003b
            L_0x0058:
                boolean r6 = java.lang.Character.isSurrogate(r5)
                if (r6 != 0) goto L_0x0061
                int r10 = r10 + -1
                goto L_0x003c
            L_0x0061:
                boolean r12 = java.lang.Character.isHighSurrogate(r5)
                if (r12 == 0) goto L_0x0068
                goto L_0x006a
            L_0x0068:
                r12 = 1
                goto L_0x003c
            L_0x006a:
                r0 = -1
            L_0x006b:
                int r10 = java.lang.Math.max(r11, r1)
                int r11 = r9.length()
                if (r3 < 0) goto L_0x00ad
                if (r11 >= r3) goto L_0x0078
                goto L_0x00ad
            L_0x0078:
                if (r10 >= 0) goto L_0x007b
                goto L_0x00ad
            L_0x007b:
                r12 = 0
            L_0x007c:
                if (r10 != 0) goto L_0x0080
                r11 = r3
                goto L_0x00ae
            L_0x0080:
                if (r3 < r11) goto L_0x0085
                if (r12 == 0) goto L_0x00ae
                goto L_0x00ad
            L_0x0085:
                char r5 = r9.charAt(r3)
                if (r12 == 0) goto L_0x0097
                boolean r12 = java.lang.Character.isLowSurrogate(r5)
                if (r12 != 0) goto L_0x0092
                goto L_0x00ad
            L_0x0092:
                int r10 = r10 + -1
                int r3 = r3 + 1
                goto L_0x007b
            L_0x0097:
                boolean r6 = java.lang.Character.isSurrogate(r5)
                if (r6 != 0) goto L_0x00a2
                int r10 = r10 + -1
                int r3 = r3 + 1
                goto L_0x007c
            L_0x00a2:
                boolean r12 = java.lang.Character.isLowSurrogate(r5)
                if (r12 == 0) goto L_0x00a9
                goto L_0x00ad
            L_0x00a9:
                int r3 = r3 + 1
                r12 = 1
                goto L_0x007c
            L_0x00ad:
                r11 = -1
            L_0x00ae:
                if (r0 == r4) goto L_0x00fd
                if (r11 != r4) goto L_0x00c1
                goto L_0x00fd
            L_0x00b3:
                int r0 = r0 - r10
                int r0 = java.lang.Math.max(r0, r1)
                int r3 = r3 + r11
                int r10 = r9.length()
                int r11 = java.lang.Math.min(r3, r10)
            L_0x00c1:
                java.lang.Class<androidx.emoji2.text.j> r10 = androidx.emoji2.text.j.class
                java.lang.Object[] r10 = r9.getSpans(r0, r11, r10)
                androidx.emoji2.text.j[] r10 = (androidx.emoji2.text.j[]) r10
                if (r10 == 0) goto L_0x00fd
                int r12 = r10.length
                if (r12 <= 0) goto L_0x00fd
                int r12 = r10.length
                r3 = 0
            L_0x00d0:
                if (r3 >= r12) goto L_0x00e7
                r4 = r10[r3]
                int r5 = r9.getSpanStart(r4)
                int r4 = r9.getSpanEnd(r4)
                int r0 = java.lang.Math.min(r5, r0)
                int r11 = java.lang.Math.max(r4, r11)
                int r3 = r3 + 1
                goto L_0x00d0
            L_0x00e7:
                int r10 = java.lang.Math.max(r0, r1)
                int r12 = r9.length()
                int r11 = java.lang.Math.min(r11, r12)
                r8.beginBatchEdit()
                r9.delete(r10, r11)
                r8.endBatchEdit()
                r1 = 1
            L_0x00fd:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.c.a.a(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        a aVar = new a();
        this.f28188a = textView;
        this.f28189b = aVar;
        if (e.c()) {
            e a10 = e.a();
            if (a10.d() && editorInfo != null) {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                a10.f1512e.c(editorInfo);
            }
        }
    }

    public boolean deleteSurroundingText(int i10, int i11) {
        return this.f28189b.a(this, this.f28188a.getEditableText(), i10, i11, false) || super.deleteSurroundingText(i10, i11);
    }

    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        return this.f28189b.a(this, this.f28188a.getEditableText(), i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11);
    }
}

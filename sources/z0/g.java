package z0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: EmojiTextWatcher */
public final class g implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final EditText f28201a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f28202b;

    /* renamed from: c  reason: collision with root package name */
    public e.C0021e f28203c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f28204d = true;

    /* compiled from: EmojiTextWatcher */
    public static class a extends e.C0021e {

        /* renamed from: a  reason: collision with root package name */
        public final Reference<EditText> f28205a;

        public a(EditText editText) {
            this.f28205a = new WeakReference(editText);
        }

        public void a() {
            g.a(this.f28205a.get(), 1);
        }
    }

    public g(EditText editText, boolean z10) {
        this.f28201a = editText;
        this.f28202b = z10;
    }

    public static void a(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            e.a().h(editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (!this.f28201a.isInEditMode()) {
            if (!(!this.f28204d || (!this.f28202b && !e.c())) && i11 <= i12 && (charSequence instanceof Spannable)) {
                int b10 = e.a().b();
                if (b10 != 0) {
                    if (b10 == 1) {
                        e.a().i((Spannable) charSequence, i10, i10 + i12, Integer.MAX_VALUE, 0);
                        return;
                    } else if (b10 != 3) {
                        return;
                    }
                }
                e a10 = e.a();
                if (this.f28203c == null) {
                    this.f28203c = new a(this.f28201a);
                }
                a10.j(this.f28203c);
            }
        }
    }
}

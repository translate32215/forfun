package z0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: EmojiInputFilter */
public final class d implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f28190a;

    /* renamed from: b  reason: collision with root package name */
    public e.C0021e f28191b;

    /* compiled from: EmojiInputFilter */
    public static class a extends e.C0021e {

        /* renamed from: a  reason: collision with root package name */
        public final Reference<TextView> f28192a;

        /* renamed from: b  reason: collision with root package name */
        public final Reference<d> f28193b;

        public a(TextView textView, d dVar) {
            this.f28192a = new WeakReference(textView);
            this.f28193b = new WeakReference(dVar);
        }

        public void a() {
            CharSequence text;
            CharSequence h10;
            InputFilter[] filters;
            TextView textView = this.f28192a.get();
            InputFilter inputFilter = this.f28193b.get();
            boolean z10 = false;
            if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= filters.length) {
                        break;
                    } else if (filters[i10] == inputFilter) {
                        z10 = true;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            if (z10 && textView.isAttachedToWindow() && (text = textView.getText()) != (h10 = e.a().h(text))) {
                int selectionStart = Selection.getSelectionStart(h10);
                int selectionEnd = Selection.getSelectionEnd(h10);
                textView.setText(h10);
                if (h10 instanceof Spannable) {
                    Spannable spannable = (Spannable) h10;
                    if (selectionStart >= 0 && selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionStart, selectionEnd);
                    } else if (selectionStart >= 0) {
                        Selection.setSelection(spannable, selectionStart);
                    } else if (selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionEnd);
                    }
                }
            }
        }
    }

    public d(TextView textView) {
        this.f28190a = textView;
    }

    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (this.f28190a.isInEditMode()) {
            return charSequence;
        }
        int b10 = e.a().b();
        if (b10 != 0) {
            boolean z10 = true;
            if (b10 == 1) {
                if (i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == this.f28190a.getText()) {
                    z10 = false;
                }
                if (!z10 || charSequence == null) {
                    return charSequence;
                }
                if (!(i10 == 0 && i11 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                CharSequence charSequence2 = charSequence;
                return e.a().i(charSequence2, 0, charSequence2.length(), Integer.MAX_VALUE, 0);
            } else if (b10 != 3) {
                return charSequence;
            }
        }
        e a10 = e.a();
        if (this.f28191b == null) {
            this.f28191b = new a(this.f28190a, this);
        }
        a10.j(this.f28191b);
        return charSequence;
    }
}

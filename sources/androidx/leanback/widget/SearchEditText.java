package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;
import androidx.leanback.app.p;
import androidx.leanback.widget.SearchBar;

public class SearchEditText extends l1 {

    /* renamed from: h  reason: collision with root package name */
    public a f2231h;

    public interface a {
    }

    static {
        Class<SearchEditText> cls = SearchEditText.class;
    }

    public SearchEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2132083198);
    }

    public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
        SearchBar.j jVar;
        if (keyEvent.getKeyCode() != 4) {
            return super.onKeyPreIme(i10, keyEvent);
        }
        a aVar = this.f2231h;
        if (aVar == null || (jVar = SearchBar.this.f2199a) == null) {
            return false;
        }
        p pVar = p.this;
        pVar.B0 |= 2;
        pVar.r0();
        return false;
    }

    public /* bridge */ /* synthetic */ void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public /* bridge */ /* synthetic */ void setFinalRecognizedText(CharSequence charSequence) {
        super.setFinalRecognizedText(charSequence);
    }

    public void setOnKeyboardDismissListener(a aVar) {
        this.f2231h = aVar;
    }
}

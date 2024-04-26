package z0;

import android.os.Build;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.emoji2.text.e;

/* compiled from: EmojiEditTextHelper */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f28182a;

    /* renamed from: z0.a$a  reason: collision with other inner class name */
    /* compiled from: EmojiEditTextHelper */
    public static class C0287a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final EditText f28183a;

        /* renamed from: b  reason: collision with root package name */
        public final g f28184b;

        public C0287a(EditText editText, boolean z10) {
            this.f28183a = editText;
            g gVar = new g(editText, z10);
            this.f28184b = gVar;
            editText.addTextChangedListener(gVar);
            if (b.f28186b == null) {
                synchronized (b.f28185a) {
                    if (b.f28186b == null) {
                        b.f28186b = new b();
                    }
                }
            }
            editText.setEditableFactory(b.f28186b);
        }

        public KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new e(keyListener);
        }

        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            if (inputConnection instanceof c) {
                return inputConnection;
            }
            return new c(this.f28183a, inputConnection, editorInfo);
        }

        public void c(boolean z10) {
            g gVar = this.f28184b;
            if (gVar.f28204d != z10) {
                if (gVar.f28203c != null) {
                    e a10 = e.a();
                    e.C0021e eVar = gVar.f28203c;
                    a10.getClass();
                    q.a.f(eVar, "initCallback cannot be null");
                    a10.f1508a.writeLock().lock();
                    try {
                        a10.f1509b.remove(eVar);
                    } finally {
                        a10.f1508a.writeLock().unlock();
                    }
                }
                gVar.f28204d = z10;
                if (z10) {
                    g.a(gVar.f28201a, e.a().b());
                }
            }
        }
    }

    /* compiled from: EmojiEditTextHelper */
    public static class b {
        public KeyListener a(KeyListener keyListener) {
            return keyListener;
        }

        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection;
        }

        public void c(boolean z10) {
        }
    }

    public a(EditText editText, boolean z10) {
        q.a.f(editText, "editText cannot be null");
        if (Build.VERSION.SDK_INT < 19) {
            this.f28182a = new b();
        } else {
            this.f28182a = new C0287a(editText, z10);
        }
    }
}

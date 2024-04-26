package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.c;
import androidx.appcompat.view.menu.i;

/* compiled from: MenuDialogHelper */
public class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, i.a {

    /* renamed from: a  reason: collision with root package name */
    public e f561a;

    /* renamed from: b  reason: collision with root package name */
    public b f562b;

    /* renamed from: c  reason: collision with root package name */
    public c f563c;

    public f(e eVar) {
        this.f561a = eVar;
    }

    public void a(e eVar, boolean z10) {
        b bVar;
        if ((z10 || eVar == this.f561a) && (bVar = this.f562b) != null) {
            bVar.dismiss();
        }
    }

    public boolean b(e eVar) {
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f561a.q(((c.a) this.f563c.b()).getItem(i10), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        c cVar = this.f563c;
        e eVar = this.f561a;
        i.a aVar = cVar.f526e;
        if (aVar != null) {
            aVar.a(eVar, true);
        }
    }

    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f562b.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f562b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f561a.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f561a.performShortcut(i10, keyEvent, 0);
    }
}

package j;

import android.view.ActionMode;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* compiled from: WindowCallbackWrapper */
public class i implements Window.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final Window.Callback f19479a;

    /* compiled from: WindowCallbackWrapper */
    public static class a {
        public static boolean a(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        public static ActionMode b(Window.Callback callback, ActionMode.Callback callback2, int i10) {
            return callback.onWindowStartingActionMode(callback2, i10);
        }
    }

    /* compiled from: WindowCallbackWrapper */
    public static class b {
        public static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            callback.onProvideKeyboardShortcuts(list, menu, i10);
        }
    }

    /* compiled from: WindowCallbackWrapper */
    public static class c {
        public static void a(Window.Callback callback, boolean z10) {
            callback.onPointerCaptureChanged(z10);
        }
    }

    public i(Window.Callback callback) {
        if (callback != null) {
            this.f19479a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f19479a.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f19479a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f19479a.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f19479a.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f19479a.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f19479a.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f19479a.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        this.f19479a.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f19479a.onMenuItemSelected(i10, menuItem);
    }

    public void onPointerCaptureChanged(boolean z10) {
        c.a(this.f19479a, z10);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return a.a(this.f19479a, searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f19479a.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z10) {
        this.f19479a.onWindowFocusChanged(z10);
    }

    public boolean onSearchRequested() {
        return this.f19479a.onSearchRequested();
    }
}

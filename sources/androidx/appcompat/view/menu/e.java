package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o0.e0;

/* compiled from: MenuBuilder */
public class e implements i0.a {

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f536y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f537a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f538b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f539c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f540d;

    /* renamed from: e  reason: collision with root package name */
    public a f541e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<g> f542f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<g> f543g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f544h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<g> f545i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<g> f546j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f547k;

    /* renamed from: l  reason: collision with root package name */
    public int f548l = 0;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f549m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f550n;

    /* renamed from: o  reason: collision with root package name */
    public View f551o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f552p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f553q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f554r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f555s = false;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList<g> f556t = new ArrayList<>();

    /* renamed from: u  reason: collision with root package name */
    public CopyOnWriteArrayList<WeakReference<i>> f557u = new CopyOnWriteArrayList<>();

    /* renamed from: v  reason: collision with root package name */
    public g f558v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f559w = false;

    /* renamed from: x  reason: collision with root package name */
    public boolean f560x;

    /* compiled from: MenuBuilder */
    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    /* compiled from: MenuBuilder */
    public interface b {
        boolean a(g gVar);
    }

    public e(Context context) {
        boolean z10;
        boolean z11 = false;
        this.f537a = context;
        Resources resources = context.getResources();
        this.f538b = resources;
        this.f542f = new ArrayList<>();
        this.f543g = new ArrayList<>();
        this.f544h = true;
        this.f545i = new ArrayList<>();
        this.f546j = new ArrayList<>();
        this.f547k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = e0.f22576a;
            if (Build.VERSION.SDK_INT >= 28) {
                z10 = e0.b.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z10 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z10) {
                z11 = true;
            }
        }
        this.f540d = z11;
    }

    public void A() {
        if (!this.f552p) {
            this.f552p = true;
            this.f553q = false;
            this.f554r = false;
        }
    }

    public MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = (-65536 & i12) >> 16;
        if (i14 >= 0) {
            int[] iArr = f536y;
            if (i14 < iArr.length) {
                int i15 = (iArr[i14] << 16) | (65535 & i12);
                g gVar = new g(this, i10, i11, i12, i15, charSequence, this.f548l);
                ArrayList<g> arrayList = this.f542f;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        if (arrayList.get(size).f567d <= i15) {
                            i13 = size + 1;
                            break;
                        }
                    } else {
                        i13 = 0;
                        break;
                    }
                }
                arrayList.add(i13, gVar);
                p(true);
                return gVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f537a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = a(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(i iVar, Context context) {
        this.f557u.add(new WeakReference(iVar));
        iVar.c(context, this);
        this.f547k = true;
    }

    public final void c(boolean z10) {
        if (!this.f555s) {
            this.f555s = true;
            Iterator<WeakReference<i>> it = this.f557u.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                i iVar = (i) next.get();
                if (iVar == null) {
                    this.f557u.remove(next);
                } else {
                    iVar.a(this, z10);
                }
            }
            this.f555s = false;
        }
    }

    public void clear() {
        g gVar = this.f558v;
        if (gVar != null) {
            d(gVar);
        }
        this.f542f.clear();
        p(true);
    }

    public void clearHeader() {
        this.f550n = null;
        this.f549m = null;
        this.f551o = null;
        p(false);
    }

    public void close() {
        c(true);
    }

    public boolean d(g gVar) {
        boolean z10 = false;
        if (!this.f557u.isEmpty() && this.f558v == gVar) {
            A();
            Iterator<WeakReference<i>> it = this.f557u.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                i iVar = (i) next.get();
                if (iVar == null) {
                    this.f557u.remove(next);
                } else {
                    z10 = iVar.j(this, gVar);
                    if (z10) {
                        break;
                    }
                }
            }
            z();
            if (z10) {
                this.f558v = null;
            }
        }
        return z10;
    }

    public boolean e(e eVar, MenuItem menuItem) {
        a aVar = this.f541e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    public boolean f(g gVar) {
        boolean z10 = false;
        if (this.f557u.isEmpty()) {
            return false;
        }
        A();
        Iterator<WeakReference<i>> it = this.f557u.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            i iVar = (i) next.get();
            if (iVar == null) {
                this.f557u.remove(next);
            } else {
                z10 = iVar.k(this, gVar);
                if (z10) {
                    break;
                }
            }
        }
        z();
        if (z10) {
            this.f558v = gVar;
        }
        return z10;
    }

    public MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f542f.get(i11);
            if (gVar.f564a == i10) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (findItem = gVar.f578o.findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public g g(int i10, KeyEvent keyEvent) {
        char c10;
        ArrayList<g> arrayList = this.f556t;
        arrayList.clear();
        h(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean n10 = n();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = arrayList.get(i11);
            if (n10) {
                c10 = gVar.f573j;
            } else {
                c10 = gVar.f571h;
            }
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (n10 && c10 == 8 && i10 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    public MenuItem getItem(int i10) {
        return this.f542f.get(i10);
    }

    public void h(List<g> list, int i10, KeyEvent keyEvent) {
        char c10;
        int i11;
        boolean n10 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f542f.size();
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = this.f542f.get(i12);
                if (gVar.hasSubMenu()) {
                    gVar.f578o.h(list, i10, keyEvent);
                }
                if (n10) {
                    c10 = gVar.f573j;
                } else {
                    c10 = gVar.f571h;
                }
                if (n10) {
                    i11 = gVar.f574k;
                } else {
                    i11 = gVar.f572i;
                }
                if (((modifiers & 69647) == (i11 & 69647)) && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c10 == cArr[0] || c10 == cArr[2] || (n10 && c10 == 8 && i10 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public boolean hasVisibleItems() {
        if (this.f560x) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f542f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public void i() {
        ArrayList<g> l10 = l();
        if (this.f547k) {
            Iterator<WeakReference<i>> it = this.f557u.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                i iVar = (i) next.get();
                if (iVar == null) {
                    this.f557u.remove(next);
                } else {
                    z10 |= iVar.h();
                }
            }
            if (z10) {
                this.f545i.clear();
                this.f546j.clear();
                int size = l10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    g gVar = l10.get(i10);
                    if (gVar.g()) {
                        this.f545i.add(gVar);
                    } else {
                        this.f546j.add(gVar);
                    }
                }
            } else {
                this.f545i.clear();
                this.f546j.clear();
                this.f546j.addAll(l());
            }
            this.f547k = false;
        }
    }

    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return g(i10, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public e k() {
        return this;
    }

    public ArrayList<g> l() {
        if (!this.f544h) {
            return this.f543g;
        }
        this.f543g.clear();
        int size = this.f542f.size();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = this.f542f.get(i10);
            if (gVar.isVisible()) {
                this.f543g.add(gVar);
            }
        }
        this.f544h = false;
        this.f547k = true;
        return this.f543g;
    }

    public boolean m() {
        return this.f559w;
    }

    public boolean n() {
        return this.f539c;
    }

    public boolean o() {
        return this.f540d;
    }

    public void p(boolean z10) {
        if (!this.f552p) {
            if (z10) {
                this.f544h = true;
                this.f547k = true;
            }
            if (!this.f557u.isEmpty()) {
                A();
                Iterator<WeakReference<i>> it = this.f557u.iterator();
                while (it.hasNext()) {
                    WeakReference next = it.next();
                    i iVar = (i) next.get();
                    if (iVar == null) {
                        this.f557u.remove(next);
                    } else {
                        iVar.g(z10);
                    }
                }
                z();
                return;
            }
            return;
        }
        this.f553q = true;
        if (z10) {
            this.f554r = true;
        }
    }

    public boolean performIdentifierAction(int i10, int i11) {
        return q(findItem(i10), i11);
    }

    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        g g10 = g(i10, keyEvent);
        boolean r10 = g10 != null ? r(g10, (i) null, i11) : false;
        if ((i11 & 2) != 0) {
            c(true);
        }
        return r10;
    }

    public boolean q(MenuItem menuItem, int i10) {
        return r(menuItem, (i) null, i10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean r(android.view.MenuItem r7, androidx.appcompat.view.menu.i r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.g r7 = (androidx.appcompat.view.menu.g) r7
            r0 = 0
            if (r7 == 0) goto L_0x00d2
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000d
            goto L_0x00d2
        L_0x000d:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f579p
            r2 = 1
            if (r1 == 0) goto L_0x0019
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L_0x0019
            goto L_0x0021
        L_0x0019:
            androidx.appcompat.view.menu.e r1 = r7.f577n
            boolean r1 = r1.e(r1, r7)
            if (r1 == 0) goto L_0x0023
        L_0x0021:
            r1 = 1
            goto L_0x0043
        L_0x0023:
            android.content.Intent r1 = r7.f570g
            if (r1 == 0) goto L_0x0037
            androidx.appcompat.view.menu.e r3 = r7.f577n     // Catch:{ ActivityNotFoundException -> 0x002f }
            android.content.Context r3 = r3.f537a     // Catch:{ ActivityNotFoundException -> 0x002f }
            r3.startActivity(r1)     // Catch:{ ActivityNotFoundException -> 0x002f }
            goto L_0x0021
        L_0x002f:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L_0x0037:
            o0.b r1 = r7.A
            if (r1 == 0) goto L_0x0042
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x0042
            goto L_0x0021
        L_0x0042:
            r1 = 0
        L_0x0043:
            o0.b r3 = r7.A
            if (r3 == 0) goto L_0x004f
            boolean r4 = r3.a()
            if (r4 == 0) goto L_0x004f
            r4 = 1
            goto L_0x0050
        L_0x004f:
            r4 = 0
        L_0x0050:
            boolean r5 = r7.f()
            if (r5 == 0) goto L_0x0062
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x00d1
            r6.c(r2)
            goto L_0x00d1
        L_0x0062:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x0073
            if (r4 == 0) goto L_0x006b
            goto L_0x0073
        L_0x006b:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x00d1
            r6.c(r2)
            goto L_0x00d1
        L_0x0073:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x007a
            r6.c(r0)
        L_0x007a:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x008e
            androidx.appcompat.view.menu.l r9 = new androidx.appcompat.view.menu.l
            android.content.Context r5 = r6.f537a
            r9.<init>(r5, r6, r7)
            r7.f578o = r9
            java.lang.CharSequence r5 = r7.f568e
            r9.setHeaderTitle((java.lang.CharSequence) r5)
        L_0x008e:
            androidx.appcompat.view.menu.l r7 = r7.f578o
            if (r4 == 0) goto L_0x0095
            r3.f(r7)
        L_0x0095:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r9 = r6.f557u
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x009e
            goto L_0x00cb
        L_0x009e:
            if (r8 == 0) goto L_0x00a4
            boolean r0 = r8.e(r7)
        L_0x00a4:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r8 = r6.f557u
            java.util.Iterator r8 = r8.iterator()
        L_0x00aa:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00cb
            java.lang.Object r9 = r8.next()
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            java.lang.Object r3 = r9.get()
            androidx.appcompat.view.menu.i r3 = (androidx.appcompat.view.menu.i) r3
            if (r3 != 0) goto L_0x00c4
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r3 = r6.f557u
            r3.remove(r9)
            goto L_0x00aa
        L_0x00c4:
            if (r0 != 0) goto L_0x00aa
            boolean r0 = r3.e(r7)
            goto L_0x00aa
        L_0x00cb:
            r1 = r1 | r0
            if (r1 != 0) goto L_0x00d1
            r6.c(r2)
        L_0x00d1:
            return r1
        L_0x00d2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.r(android.view.MenuItem, androidx.appcompat.view.menu.i, int):boolean");
    }

    public void removeGroup(int i10) {
        int size = size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (this.f542f.get(i11).f565b == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            int size2 = this.f542f.size() - i11;
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (i12 >= size2 || this.f542f.get(i11).f565b != i10) {
                    p(true);
                } else {
                    s(i11, false);
                    i12 = i13;
                }
            }
            p(true);
        }
    }

    public void removeItem(int i10) {
        int size = size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (this.f542f.get(i11).f564a == i10) {
                break;
            } else {
                i11++;
            }
        }
        s(i11, true);
    }

    public final void s(int i10, boolean z10) {
        if (i10 >= 0 && i10 < this.f542f.size()) {
            this.f542f.remove(i10);
            if (z10) {
                p(true);
            }
        }
    }

    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f542f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f542f.get(i11);
            if (gVar.f565b == i10) {
                gVar.k(z11);
                gVar.setCheckable(z10);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z10) {
        this.f559w = z10;
    }

    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f542f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f542f.get(i11);
            if (gVar.f565b == i10) {
                gVar.setEnabled(z10);
            }
        }
    }

    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f542f.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f542f.get(i11);
            if (gVar.f565b == i10 && gVar.m(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            p(true);
        }
    }

    public void setQwertyMode(boolean z10) {
        this.f539c = z10;
        p(false);
    }

    public int size() {
        return this.f542f.size();
    }

    public void t(i iVar) {
        Iterator<WeakReference<i>> it = this.f557u.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            i iVar2 = (i) next.get();
            if (iVar2 == null || iVar2 == iVar) {
                this.f557u.remove(next);
            }
        }
    }

    public void u(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(j());
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                MenuItem item = getItem(i10);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((l) item.getSubMenu()).u(bundle);
                }
            }
            int i11 = bundle.getInt("android:menu:expandedactionview");
            if (i11 > 0 && (findItem = findItem(i11)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public void v(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.f557u.isEmpty()) {
            Iterator<WeakReference<i>> it = this.f557u.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                i iVar = (i) next.get();
                if (iVar == null) {
                    this.f557u.remove(next);
                } else {
                    int id2 = iVar.getId();
                    if (id2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                        iVar.d(parcelable);
                    }
                }
            }
        }
    }

    public void w(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((l) item.getSubMenu()).w(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public void x(Bundle bundle) {
        Parcelable i10;
        if (!this.f557u.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator<WeakReference<i>> it = this.f557u.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                i iVar = (i) next.get();
                if (iVar == null) {
                    this.f557u.remove(next);
                } else {
                    int id2 = iVar.getId();
                    if (id2 > 0 && (i10 = iVar.i()) != null) {
                        sparseArray.put(id2, i10);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    public final void y(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources resources = this.f538b;
        if (view != null) {
            this.f551o = view;
            this.f549m = null;
            this.f550n = null;
        } else {
            if (i10 > 0) {
                this.f549m = resources.getText(i10);
            } else if (charSequence != null) {
                this.f549m = charSequence;
            }
            if (i11 > 0) {
                this.f550n = d0.a.c(this.f537a, i11);
            } else if (drawable != null) {
                this.f550n = drawable;
            }
            this.f551o = null;
        }
        p(false);
    }

    public void z() {
        this.f552p = false;
        if (this.f553q) {
            this.f553q = false;
            p(this.f554r);
        }
    }

    public MenuItem add(int i10) {
        return a(0, 0, 0, this.f538b.getString(i10));
    }

    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f538b.getString(i10));
    }

    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        g gVar = (g) a(i10, i11, i12, charSequence);
        l lVar = new l(this.f537a, this, gVar);
        gVar.f578o = lVar;
        lVar.setHeaderTitle(gVar.f568e);
        return lVar;
    }

    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f538b.getString(i13));
    }

    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, (CharSequence) this.f538b.getString(i13));
    }
}

package j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.activity.result.d;
import androidx.appcompat.widget.g1;
import androidx.appcompat.widget.k0;
import e.l;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import k.c;
import o0.k;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: SupportMenuInflater */
public class g extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class<?>[] f19435e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class<?>[] f19436f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f19437a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f19438b;

    /* renamed from: c  reason: collision with root package name */
    public Context f19439c;

    /* renamed from: d  reason: collision with root package name */
    public Object f19440d;

    /* compiled from: SupportMenuInflater */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        public static final Class<?>[] f19441c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        public Object f19442a;

        /* renamed from: b  reason: collision with root package name */
        public Method f19443b;

        public a(Object obj, String str) {
            this.f19442a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f19443b = cls.getMethod(str, f19441c);
            } catch (Exception e10) {
                StringBuilder a10 = d.a("Couldn't resolve menu item onClick handler ", str, " in class ");
                a10.append(cls.getName());
                InflateException inflateException = new InflateException(a10.toString());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f19443b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f19443b.invoke(this.f19442a, new Object[]{menuItem})).booleanValue();
                }
                this.f19443b.invoke(this.f19442a, new Object[]{menuItem});
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* compiled from: SupportMenuInflater */
    public class b {
        public CharSequence A;
        public CharSequence B;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;

        /* renamed from: a  reason: collision with root package name */
        public Menu f19444a;

        /* renamed from: b  reason: collision with root package name */
        public int f19445b;

        /* renamed from: c  reason: collision with root package name */
        public int f19446c;

        /* renamed from: d  reason: collision with root package name */
        public int f19447d;

        /* renamed from: e  reason: collision with root package name */
        public int f19448e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f19449f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f19450g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f19451h;

        /* renamed from: i  reason: collision with root package name */
        public int f19452i;

        /* renamed from: j  reason: collision with root package name */
        public int f19453j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f19454k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f19455l;

        /* renamed from: m  reason: collision with root package name */
        public int f19456m;

        /* renamed from: n  reason: collision with root package name */
        public char f19457n;

        /* renamed from: o  reason: collision with root package name */
        public int f19458o;

        /* renamed from: p  reason: collision with root package name */
        public char f19459p;

        /* renamed from: q  reason: collision with root package name */
        public int f19460q;

        /* renamed from: r  reason: collision with root package name */
        public int f19461r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f19462s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f19463t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f19464u;

        /* renamed from: v  reason: collision with root package name */
        public int f19465v;

        /* renamed from: w  reason: collision with root package name */
        public int f19466w;

        /* renamed from: x  reason: collision with root package name */
        public String f19467x;

        /* renamed from: y  reason: collision with root package name */
        public String f19468y;

        /* renamed from: z  reason: collision with root package name */
        public o0.b f19469z;

        public b(Menu menu) {
            this.f19444a = menu;
            this.f19445b = 0;
            this.f19446c = 0;
            this.f19447d = 0;
            this.f19448e = 0;
            this.f19449f = true;
            this.f19450g = true;
        }

        public SubMenu a() {
            this.f19451h = true;
            SubMenu addSubMenu = this.f19444a.addSubMenu(this.f19445b, this.f19452i, this.f19453j, this.f19454k);
            c(addSubMenu.getItem());
            return addSubMenu;
        }

        public final <T> T b(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f19439c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        public final void c(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f19462s).setVisible(this.f19463t).setEnabled(this.f19464u).setCheckable(this.f19461r >= 1).setTitleCondensed(this.f19455l).setIcon(this.f19456m);
            int i10 = this.f19465v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f19468y != null) {
                if (!g.this.f19439c.isRestricted()) {
                    g gVar = g.this;
                    if (gVar.f19440d == null) {
                        gVar.f19440d = gVar.a(gVar.f19439c);
                    }
                    menuItem.setOnMenuItemClickListener(new a(gVar.f19440d, this.f19468y));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f19461r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).k(true);
                } else if (menuItem instanceof c) {
                    c cVar = (c) menuItem;
                    try {
                        if (cVar.f19853e == null) {
                            cVar.f19853e = cVar.f19852d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                        }
                        cVar.f19853e.invoke(cVar.f19852d, new Object[]{Boolean.TRUE});
                    } catch (Exception e10) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
                    }
                }
            }
            String str = this.f19467x;
            if (str != null) {
                menuItem.setActionView((View) b(str, g.f19435e, g.this.f19437a));
                z10 = true;
            }
            int i11 = this.f19466w;
            if (i11 > 0) {
                if (!z10) {
                    menuItem.setActionView(i11);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            o0.b bVar = this.f19469z;
            if (bVar != null) {
                if (menuItem instanceof i0.b) {
                    ((i0.b) menuItem).b(bVar);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.A;
            boolean z11 = menuItem instanceof i0.b;
            if (z11) {
                ((i0.b) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                k.h(menuItem, charSequence);
            }
            CharSequence charSequence2 = this.B;
            if (z11) {
                ((i0.b) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                k.m(menuItem, charSequence2);
            }
            char c10 = this.f19457n;
            int i12 = this.f19458o;
            if (z11) {
                ((i0.b) menuItem).setAlphabeticShortcut(c10, i12);
            } else if (Build.VERSION.SDK_INT >= 26) {
                k.g(menuItem, c10, i12);
            }
            char c11 = this.f19459p;
            int i13 = this.f19460q;
            if (z11) {
                ((i0.b) menuItem).setNumericShortcut(c11, i13);
            } else if (Build.VERSION.SDK_INT >= 26) {
                k.k(menuItem, c11, i13);
            }
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                if (z11) {
                    ((i0.b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    k.j(menuItem, mode);
                }
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList == null) {
                return;
            }
            if (z11) {
                ((i0.b) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                k.i(menuItem, colorStateList);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            f19435e = r0
            f19436f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.g.<clinit>():void");
    }

    public g(Context context) {
        super(context);
        this.f19439c = context;
        Object[] objArr = {context};
        this.f19437a = objArr;
        this.f19438b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        char c10;
        char c11;
        ColorStateList colorStateList;
        AttributeSet attributeSet2 = attributeSet;
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException(f.a("Expecting menu, got ", name));
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
                XmlPullParser xmlPullParser2 = xmlPullParser;
            }
        }
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z11 && name2.equals(str)) {
                            XmlPullParser xmlPullParser3 = xmlPullParser;
                            str = null;
                            z11 = false;
                            eventType = xmlPullParser.next();
                        } else if (name2.equals("group")) {
                            bVar.f19445b = 0;
                            bVar.f19446c = 0;
                            bVar.f19447d = 0;
                            bVar.f19448e = 0;
                            bVar.f19449f = true;
                            bVar.f19450g = true;
                        } else if (name2.equals("item")) {
                            if (!bVar.f19451h) {
                                o0.b bVar2 = bVar.f19469z;
                                if (bVar2 == null || !bVar2.a()) {
                                    bVar.f19451h = true;
                                    bVar.c(bVar.f19444a.add(bVar.f19445b, bVar.f19452i, bVar.f19453j, bVar.f19454k));
                                } else {
                                    bVar.a();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            XmlPullParser xmlPullParser4 = xmlPullParser;
                            z10 = true;
                            eventType = xmlPullParser.next();
                        }
                    }
                } else if (!z11) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        TypedArray obtainStyledAttributes = g.this.f19439c.obtainStyledAttributes(attributeSet2, l.f13517q);
                        bVar.f19445b = obtainStyledAttributes.getResourceId(1, 0);
                        bVar.f19446c = obtainStyledAttributes.getInt(3, 0);
                        bVar.f19447d = obtainStyledAttributes.getInt(4, 0);
                        bVar.f19448e = obtainStyledAttributes.getInt(5, 0);
                        bVar.f19449f = obtainStyledAttributes.getBoolean(2, true);
                        bVar.f19450g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        g1 q10 = g1.q(g.this.f19439c, attributeSet2, l.f13518r);
                        bVar.f19452i = q10.m(2, 0);
                        bVar.f19453j = (q10.j(5, bVar.f19446c) & -65536) | (q10.j(6, bVar.f19447d) & 65535);
                        bVar.f19454k = q10.o(7);
                        bVar.f19455l = q10.o(8);
                        bVar.f19456m = q10.m(0, 0);
                        String n10 = q10.n(9);
                        if (n10 == null) {
                            c10 = 0;
                        } else {
                            c10 = n10.charAt(0);
                        }
                        bVar.f19457n = c10;
                        bVar.f19458o = q10.j(16, 4096);
                        String n11 = q10.n(10);
                        if (n11 == null) {
                            c11 = 0;
                        } else {
                            c11 = n11.charAt(0);
                        }
                        bVar.f19459p = c11;
                        bVar.f19460q = q10.j(20, 4096);
                        if (q10.p(11)) {
                            bVar.f19461r = q10.a(11, false) ? 1 : 0;
                        } else {
                            bVar.f19461r = bVar.f19448e;
                        }
                        bVar.f19462s = q10.a(3, false);
                        bVar.f19463t = q10.a(4, bVar.f19449f);
                        bVar.f19464u = q10.a(1, bVar.f19450g);
                        bVar.f19465v = q10.j(21, -1);
                        bVar.f19468y = q10.n(12);
                        bVar.f19466w = q10.m(13, 0);
                        bVar.f19467x = q10.n(15);
                        String n12 = q10.n(14);
                        boolean z12 = n12 != null;
                        if (z12 && bVar.f19466w == 0 && bVar.f19467x == null) {
                            bVar.f19469z = (o0.b) bVar.b(n12, f19436f, g.this.f19438b);
                        } else {
                            if (z12) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            bVar.f19469z = null;
                        }
                        bVar.A = q10.o(17);
                        bVar.B = q10.o(22);
                        if (q10.p(19)) {
                            bVar.D = k0.c(q10.j(19, -1), bVar.D);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            bVar.D = null;
                        }
                        if (q10.p(18)) {
                            bVar.C = q10.c(18);
                        } else {
                            bVar.C = colorStateList;
                        }
                        q10.f924b.recycle();
                        bVar.f19451h = false;
                    } else {
                        if (name3.equals("menu")) {
                            b(xmlPullParser, attributeSet2, bVar.a());
                        } else {
                            XmlPullParser xmlPullParser5 = xmlPullParser;
                            z11 = true;
                            str = name3;
                        }
                        eventType = xmlPullParser.next();
                    }
                }
                XmlPullParser xmlPullParser6 = xmlPullParser;
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof i0.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f19439c.getResources().getLayout(i10);
            b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            xmlResourceParser.close();
        } catch (XmlPullParserException e10) {
            throw new InflateException("Error inflating menu XML", e10);
        } catch (IOException e11) {
            throw new InflateException("Error inflating menu XML", e11);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}

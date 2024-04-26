package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.widget.o0;
import androidx.core.widget.NestedScrollView;
import com.startapp.startappsdk.R;
import f.c;
import f.d;
import f.e;
import f.f;
import f.s;
import java.util.WeakHashMap;
import o0.c0;

/* compiled from: AlertDialog */
public class b extends s {

    /* renamed from: e  reason: collision with root package name */
    public final AlertController f440e = new AlertController(getContext(), this, getWindow());

    /* compiled from: AlertDialog */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final AlertController.b f441a;

        /* renamed from: b  reason: collision with root package name */
        public final int f442b;

        public a(Context context) {
            this(context, b.k(context, 0));
        }

        public b create() {
            int i10;
            b bVar = new b(this.f441a.f421a, this.f442b);
            AlertController.b bVar2 = this.f441a;
            AlertController alertController = bVar.f440e;
            View view = bVar2.f425e;
            if (view != null) {
                alertController.G = view;
            } else {
                CharSequence charSequence = bVar2.f424d;
                if (charSequence != null) {
                    alertController.f396e = charSequence;
                    TextView textView = alertController.E;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar2.f423c;
                if (drawable != null) {
                    alertController.C = drawable;
                    alertController.B = 0;
                    ImageView imageView = alertController.D;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.D.setImageDrawable(drawable);
                    }
                }
            }
            CharSequence charSequence2 = bVar2.f426f;
            if (charSequence2 != null) {
                alertController.f397f = charSequence2;
                TextView textView2 = alertController.F;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = bVar2.f427g;
            if (charSequence3 != null) {
                alertController.e(-1, charSequence3, bVar2.f428h, (Message) null, (Drawable) null);
            }
            CharSequence charSequence4 = bVar2.f429i;
            if (charSequence4 != null) {
                alertController.e(-2, charSequence4, bVar2.f430j, (Message) null, (Drawable) null);
            }
            if (bVar2.f432l != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar2.f422b.inflate(alertController.L, (ViewGroup) null);
                if (bVar2.f435o) {
                    i10 = alertController.N;
                } else {
                    i10 = alertController.O;
                }
                ListAdapter listAdapter = bVar2.f432l;
                if (listAdapter == null) {
                    listAdapter = new AlertController.d(bVar2.f421a, i10, 16908308, (CharSequence[]) null);
                }
                alertController.H = listAdapter;
                alertController.I = bVar2.f436p;
                if (bVar2.f433m != null) {
                    recycleListView.setOnItemClickListener(new a(bVar2, alertController));
                }
                if (bVar2.f435o) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f398g = recycleListView;
            }
            View view2 = bVar2.f434n;
            if (view2 != null) {
                alertController.f399h = view2;
                alertController.f400i = 0;
                alertController.f405n = false;
            }
            this.f441a.getClass();
            bVar.setCancelable(true);
            this.f441a.getClass();
            bVar.setCanceledOnTouchOutside(true);
            this.f441a.getClass();
            bVar.setOnCancelListener((DialogInterface.OnCancelListener) null);
            this.f441a.getClass();
            bVar.setOnDismissListener((DialogInterface.OnDismissListener) null);
            DialogInterface.OnKeyListener onKeyListener = this.f441a.f431k;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public Context getContext() {
            return this.f441a.f421a;
        }

        public a setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f441a;
            bVar.f429i = bVar.f421a.getText(i10);
            this.f441a.f430j = onClickListener;
            return this;
        }

        public a setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f441a;
            bVar.f427g = bVar.f421a.getText(i10);
            this.f441a.f428h = onClickListener;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f441a.f424d = charSequence;
            return this;
        }

        public a setView(View view) {
            this.f441a.f434n = view;
            return this;
        }

        public a(Context context, int i10) {
            this.f441a = new AlertController.b(new ContextThemeWrapper(context, b.k(context, i10)));
            this.f442b = i10;
        }
    }

    public b(Context context, int i10) {
        super(context, k(context, i10));
    }

    public static int k(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public void onCreate(Bundle bundle) {
        int i10;
        boolean z10;
        View view;
        ListAdapter listAdapter;
        View view2;
        View view3;
        View findViewById;
        super.onCreate(bundle);
        AlertController alertController = this.f440e;
        if (alertController.K == 0) {
            i10 = alertController.J;
        } else {
            i10 = alertController.J;
        }
        alertController.f393b.setContentView(i10);
        View findViewById2 = alertController.f394c.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        View view4 = alertController.f399h;
        int i11 = 0;
        if (view4 == null) {
            view4 = alertController.f400i != 0 ? LayoutInflater.from(alertController.f392a).inflate(alertController.f400i, viewGroup, false) : null;
        }
        boolean z11 = view4 != null;
        if (!z11 || !AlertController.a(view4)) {
            alertController.f394c.setFlags(131072, 131072);
        }
        if (z11) {
            FrameLayout frameLayout = (FrameLayout) alertController.f394c.findViewById(R.id.custom);
            frameLayout.addView(view4, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.f405n) {
                frameLayout.setPadding(alertController.f401j, alertController.f402k, alertController.f403l, alertController.f404m);
            }
            if (alertController.f398g != null) {
                ((o0.a) viewGroup.getLayoutParams()).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup d10 = alertController.d(findViewById6, findViewById3);
        ViewGroup d11 = alertController.d(findViewById7, findViewById4);
        ViewGroup d12 = alertController.d(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) alertController.f394c.findViewById(R.id.scrollView);
        alertController.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) d11.findViewById(16908299);
        alertController.F = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f397f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.A.removeView(alertController.F);
                if (alertController.f398g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.A.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.A);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.f398g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    d11.setVisibility(8);
                }
            }
        }
        Button button = (Button) d12.findViewById(16908313);
        alertController.f406o = button;
        button.setOnClickListener(alertController.R);
        if (!TextUtils.isEmpty(alertController.f407p) || alertController.f409r != null) {
            alertController.f406o.setText(alertController.f407p);
            Drawable drawable = alertController.f409r;
            if (drawable != null) {
                int i12 = alertController.f395d;
                drawable.setBounds(0, 0, i12, i12);
                alertController.f406o.setCompoundDrawables(alertController.f409r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            alertController.f406o.setVisibility(0);
            z10 = true;
        } else {
            alertController.f406o.setVisibility(8);
            z10 = false;
        }
        Button button2 = (Button) d12.findViewById(16908314);
        alertController.f410s = button2;
        button2.setOnClickListener(alertController.R);
        if (!TextUtils.isEmpty(alertController.f411t) || alertController.f413v != null) {
            alertController.f410s.setText(alertController.f411t);
            Drawable drawable2 = alertController.f413v;
            if (drawable2 != null) {
                int i13 = alertController.f395d;
                drawable2.setBounds(0, 0, i13, i13);
                alertController.f410s.setCompoundDrawables(alertController.f413v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            alertController.f410s.setVisibility(0);
            z10 |= true;
        } else {
            alertController.f410s.setVisibility(8);
        }
        Button button3 = (Button) d12.findViewById(16908315);
        alertController.f414w = button3;
        button3.setOnClickListener(alertController.R);
        if (!TextUtils.isEmpty(alertController.f415x) || alertController.f417z != null) {
            alertController.f414w.setText(alertController.f415x);
            Drawable drawable3 = alertController.f417z;
            if (drawable3 != null) {
                int i14 = alertController.f395d;
                drawable3.setBounds(0, 0, i14, i14);
                view = null;
                alertController.f414w.setCompoundDrawables(alertController.f417z, (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                view = null;
            }
            alertController.f414w.setVisibility(0);
            z10 |= true;
        } else {
            alertController.f414w.setVisibility(8);
            view = null;
        }
        Context context = alertController.f392a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (z10) {
                alertController.b(alertController.f406o);
            } else if (z10) {
                alertController.b(alertController.f410s);
            } else if (z10) {
                alertController.b(alertController.f414w);
            }
        }
        if (!(z10)) {
            d12.setVisibility(8);
        }
        if (alertController.G != null) {
            d10.addView(alertController.G, 0, new ViewGroup.LayoutParams(-1, -2));
            alertController.f394c.findViewById(R.id.title_template).setVisibility(8);
        } else {
            alertController.D = (ImageView) alertController.f394c.findViewById(16908294);
            if (!(!TextUtils.isEmpty(alertController.f396e)) || !alertController.P) {
                alertController.f394c.findViewById(R.id.title_template).setVisibility(8);
                alertController.D.setVisibility(8);
                d10.setVisibility(8);
            } else {
                TextView textView2 = (TextView) alertController.f394c.findViewById(R.id.alertTitle);
                alertController.E = textView2;
                textView2.setText(alertController.f396e);
                int i15 = alertController.B;
                if (i15 != 0) {
                    alertController.D.setImageResource(i15);
                } else {
                    Drawable drawable4 = alertController.C;
                    if (drawable4 != null) {
                        alertController.D.setImageDrawable(drawable4);
                    } else {
                        alertController.E.setPadding(alertController.D.getPaddingLeft(), alertController.D.getPaddingTop(), alertController.D.getPaddingRight(), alertController.D.getPaddingBottom());
                        alertController.D.setVisibility(8);
                    }
                }
            }
        }
        boolean z12 = viewGroup.getVisibility() != 8;
        int i16 = (d10 == null || d10.getVisibility() == 8) ? 0 : 1;
        boolean z13 = d12.getVisibility() != 8;
        if (!z13 && (findViewById = d11.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i16 != 0) {
            NestedScrollView nestedScrollView2 = alertController.A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (alertController.f397f == null && alertController.f398g == null) {
                view3 = view;
            } else {
                view3 = d10.findViewById(R.id.titleDividerNoCustom);
            }
            if (view3 != null) {
                view3.setVisibility(0);
            }
        } else {
            View findViewById9 = d11.findViewById(R.id.textSpacerNoTitle);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        ListView listView = alertController.f398g;
        if (listView instanceof AlertController.RecycleListView) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) listView;
            recycleListView.getClass();
            if (!z13 || i16 == 0) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), i16 != 0 ? recycleListView.getPaddingTop() : recycleListView.f418a, recycleListView.getPaddingRight(), z13 ? recycleListView.getPaddingBottom() : recycleListView.f419b);
            }
        }
        if (!z12) {
            View view5 = alertController.f398g;
            if (view5 == null) {
                view5 = alertController.A;
            }
            if (view5 != null) {
                if (z13) {
                    i11 = 2;
                }
                int i17 = i16 | i11;
                View findViewById10 = alertController.f394c.findViewById(R.id.scrollIndicatorUp);
                View findViewById11 = alertController.f394c.findViewById(R.id.scrollIndicatorDown);
                int i18 = Build.VERSION.SDK_INT;
                if (i18 >= 23) {
                    WeakHashMap<View, String> weakHashMap = c0.f22553a;
                    if (i18 >= 23) {
                        c0.j.d(view5, i17, 3);
                    }
                    if (findViewById10 != null) {
                        d11.removeView(findViewById10);
                    }
                    if (findViewById11 != null) {
                        d11.removeView(findViewById11);
                    }
                } else {
                    if (findViewById10 != null && (i17 & 1) == 0) {
                        d11.removeView(findViewById10);
                        findViewById10 = view;
                    }
                    if (findViewById11 == null || (i17 & 2) != 0) {
                        view2 = findViewById11;
                    } else {
                        d11.removeView(findViewById11);
                        view2 = view;
                    }
                    if (!(findViewById10 == null && view2 == null)) {
                        if (alertController.f397f != null) {
                            alertController.A.setOnScrollChangeListener(new c(alertController, findViewById10, view2));
                            alertController.A.post(new d(alertController, findViewById10, view2));
                        } else {
                            ListView listView2 = alertController.f398g;
                            if (listView2 != null) {
                                listView2.setOnScrollListener(new e(alertController, findViewById10, view2));
                                alertController.f398g.post(new f(alertController, findViewById10, view2));
                            } else {
                                if (findViewById10 != null) {
                                    d11.removeView(findViewById10);
                                }
                                if (view2 != null) {
                                    d11.removeView(view2);
                                }
                            }
                        }
                    }
                }
            }
        }
        ListView listView3 = alertController.f398g;
        if (listView3 != null && (listAdapter = alertController.H) != null) {
            listView3.setAdapter(listAdapter);
            int i19 = alertController.I;
            if (i19 > -1) {
                listView3.setItemChecked(i19, true);
                listView3.setSelection(i19);
            }
        }
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f440e.A;
        if (nestedScrollView != null && nestedScrollView.k(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f440e.A;
        if (nestedScrollView != null && nestedScrollView.k(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f440e;
        alertController.f396e = charSequence;
        TextView textView = alertController.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}

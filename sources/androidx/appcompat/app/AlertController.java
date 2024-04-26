package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.startapp.startappsdk.R;
import e.l;
import f.s;
import java.lang.ref.WeakReference;

public class AlertController {
    public NestedScrollView A;
    public int B = 0;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public int I = -1;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public Handler Q;
    public final View.OnClickListener R = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Context f392a;

    /* renamed from: b  reason: collision with root package name */
    public final s f393b;

    /* renamed from: c  reason: collision with root package name */
    public final Window f394c;

    /* renamed from: d  reason: collision with root package name */
    public final int f395d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f396e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f397f;

    /* renamed from: g  reason: collision with root package name */
    public ListView f398g;

    /* renamed from: h  reason: collision with root package name */
    public View f399h;

    /* renamed from: i  reason: collision with root package name */
    public int f400i;

    /* renamed from: j  reason: collision with root package name */
    public int f401j;

    /* renamed from: k  reason: collision with root package name */
    public int f402k;

    /* renamed from: l  reason: collision with root package name */
    public int f403l;

    /* renamed from: m  reason: collision with root package name */
    public int f404m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f405n = false;

    /* renamed from: o  reason: collision with root package name */
    public Button f406o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f407p;

    /* renamed from: q  reason: collision with root package name */
    public Message f408q;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f409r;

    /* renamed from: s  reason: collision with root package name */
    public Button f410s;

    /* renamed from: t  reason: collision with root package name */
    public CharSequence f411t;

    /* renamed from: u  reason: collision with root package name */
    public Message f412u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f413v;

    /* renamed from: w  reason: collision with root package name */
    public Button f414w;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f415x;

    /* renamed from: y  reason: collision with root package name */
    public Message f416y;

    /* renamed from: z  reason: collision with root package name */
    public Drawable f417z;

    public static class RecycleListView extends ListView {

        /* renamed from: a  reason: collision with root package name */
        public final int f418a;

        /* renamed from: b  reason: collision with root package name */
        public final int f419b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f13521u);
            this.f419b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f418a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r3 = r0.f416y;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f406o
                if (r3 != r1) goto L_0x000f
                android.os.Message r1 = r0.f408q
                if (r1 == 0) goto L_0x000f
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x002a
            L_0x000f:
                android.widget.Button r1 = r0.f410s
                if (r3 != r1) goto L_0x001c
                android.os.Message r1 = r0.f412u
                if (r1 == 0) goto L_0x001c
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x002a
            L_0x001c:
                android.widget.Button r1 = r0.f414w
                if (r3 != r1) goto L_0x0029
                android.os.Message r3 = r0.f416y
                if (r3 == 0) goto L_0x0029
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x002a
            L_0x0029:
                r3 = 0
            L_0x002a:
                if (r3 == 0) goto L_0x002f
                r3.sendToTarget()
            L_0x002f:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.Q
                r1 = 1
                f.s r3 = r3.f393b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.a.onClick(android.view.View):void");
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f421a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f422b;

        /* renamed from: c  reason: collision with root package name */
        public Drawable f423c;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f424d;

        /* renamed from: e  reason: collision with root package name */
        public View f425e;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f426f;

        /* renamed from: g  reason: collision with root package name */
        public CharSequence f427g;

        /* renamed from: h  reason: collision with root package name */
        public DialogInterface.OnClickListener f428h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f429i;

        /* renamed from: j  reason: collision with root package name */
        public DialogInterface.OnClickListener f430j;

        /* renamed from: k  reason: collision with root package name */
        public DialogInterface.OnKeyListener f431k;

        /* renamed from: l  reason: collision with root package name */
        public ListAdapter f432l;

        /* renamed from: m  reason: collision with root package name */
        public DialogInterface.OnClickListener f433m;

        /* renamed from: n  reason: collision with root package name */
        public View f434n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f435o;

        /* renamed from: p  reason: collision with root package name */
        public int f436p = -1;

        public b(Context context) {
            this.f421a = context;
            this.f422b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    public static final class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<DialogInterface> f437a;

        public c(DialogInterface dialogInterface) {
            this.f437a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f437a.get(), message.what);
            } else if (i10 == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, (Object[]) null);
        }

        public long getItemId(int i10) {
            return (long) i10;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, s sVar, Window window) {
        this.f392a = context;
        this.f393b = sVar;
        this.f394c = window;
        this.Q = new c(sVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, l.f13505e, R.attr.alertDialogStyle, 0);
        this.J = obtainStyledAttributes.getResourceId(0, 0);
        this.K = obtainStyledAttributes.getResourceId(2, 0);
        this.L = obtainStyledAttributes.getResourceId(4, 0);
        this.M = obtainStyledAttributes.getResourceId(5, 0);
        this.N = obtainStyledAttributes.getResourceId(7, 0);
        this.O = obtainStyledAttributes.getResourceId(3, 0);
        this.P = obtainStyledAttributes.getBoolean(6, true);
        this.f395d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        sVar.j(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void c(View view, View view2, View view3) {
        int i10 = 4;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (view.canScrollVertically(1)) {
                i10 = 0;
            }
            view3.setVisibility(i10);
        }
    }

    public final void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public final ViewGroup d(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public void e(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        Message obtainMessage = onClickListener != null ? this.Q.obtainMessage(i10, onClickListener) : null;
        if (i10 == -3) {
            this.f415x = charSequence;
            this.f416y = obtainMessage;
            this.f417z = null;
        } else if (i10 == -2) {
            this.f411t = charSequence;
            this.f412u = obtainMessage;
            this.f413v = null;
        } else if (i10 == -1) {
            this.f407p = charSequence;
            this.f408q = obtainMessage;
            this.f409r = null;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }
}

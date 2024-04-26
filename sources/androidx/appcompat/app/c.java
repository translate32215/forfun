package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.g;
import androidx.appcompat.widget.v;
import com.startapp.startappsdk.R;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import s.i;

/* compiled from: AppCompatViewInflater */
public class c {

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?>[] f443b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f444c = {16843375};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f445d = {16844160};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f446e = {16844156};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f447f = {16844148};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f448g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h  reason: collision with root package name */
    public static final i<String, Constructor<? extends View>> f449h = new i<>();

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f450a = new Object[2];

    /* compiled from: AppCompatViewInflater */
    public static class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final View f451a;

        /* renamed from: b  reason: collision with root package name */
        public final String f452b;

        /* renamed from: c  reason: collision with root package name */
        public Method f453c;

        /* renamed from: d  reason: collision with root package name */
        public Context f454d;

        public a(View view, String str) {
            this.f451a = view;
            this.f452b = str;
        }

        public void onClick(View view) {
            String str;
            Method method;
            if (this.f453c == null) {
                for (Context context = this.f451a.getContext(); context != null; context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.f452b, new Class[]{View.class})) != null) {
                            this.f453c = method;
                            this.f454d = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                }
                int id2 = this.f451a.getId();
                if (id2 == -1) {
                    str = "";
                } else {
                    StringBuilder a10 = android.support.v4.media.a.a(" with id '");
                    a10.append(this.f451a.getContext().getResources().getResourceEntryName(id2));
                    a10.append("'");
                    str = a10.toString();
                }
                StringBuilder a11 = android.support.v4.media.a.a("Could not find method ");
                a11.append(this.f452b);
                a11.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                a11.append(this.f451a.getClass());
                a11.append(str);
                throw new IllegalStateException(a11.toString());
            }
            try {
                this.f453c.invoke(this.f454d, new Object[]{view});
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    public d a(Context context, AttributeSet attributeSet) {
        return new d(context, attributeSet);
    }

    public f b(Context context, AttributeSet attributeSet) {
        return new f(context, attributeSet);
    }

    public g c(Context context, AttributeSet attributeSet) {
        return new g(context, attributeSet);
    }

    public v d(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet, R.attr.radioButtonStyle);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        i<String, Constructor<? extends View>> iVar = f449h;
        Constructor<? extends U> orDefault = iVar.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            orDefault = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f443b);
            iVar.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return (View) orDefault.newInstance(this.f450a);
    }

    public final void g(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }
}

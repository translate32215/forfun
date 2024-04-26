package y;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.activity.result.d;
import j.f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import t.g;

/* compiled from: ConstraintAttribute */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f27938a = false;

    /* renamed from: b  reason: collision with root package name */
    public String f27939b;

    /* renamed from: c  reason: collision with root package name */
    public int f27940c;

    /* renamed from: d  reason: collision with root package name */
    public int f27941d;

    /* renamed from: e  reason: collision with root package name */
    public float f27942e;

    /* renamed from: f  reason: collision with root package name */
    public String f27943f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f27944g;

    /* renamed from: h  reason: collision with root package name */
    public int f27945h;

    public a(String str, int i10, Object obj, boolean z10) {
        this.f27939b = str;
        this.f27940c = i10;
        this.f27938a = z10;
        c(obj);
    }

    public static void a(Context context, XmlPullParser xmlPullParser, HashMap<String, a> hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), e.f27965e);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        int i10 = 0;
        boolean z10 = false;
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i10 = 6;
            } else if (index == 3) {
                obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                i10 = 3;
            } else if (index == 2) {
                obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                i10 = 4;
            } else {
                if (index == 7) {
                    obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                    i10 = 2;
                } else if (index == 6) {
                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                    i10 = 1;
                } else if (index == 9) {
                    obj = obtainStyledAttributes.getString(index);
                    i10 = 5;
                } else if (index == 8) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    obj = Integer.valueOf(resourceId);
                    i10 = 8;
                }
                i10 = 7;
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new a(str, i10, obj, z10));
        }
        obtainStyledAttributes.recycle();
    }

    public static void b(View view, HashMap<String, a> hashMap) {
        Class<?> cls = view.getClass();
        for (String next : hashMap.keySet()) {
            a aVar = hashMap.get(next);
            String a10 = !aVar.f27938a ? f.a("set", next) : next;
            try {
                switch (g.f(aVar.f27940c)) {
                    case 0:
                        cls.getMethod(a10, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f27941d)});
                        break;
                    case 1:
                        cls.getMethod(a10, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f27942e)});
                        break;
                    case 2:
                        cls.getMethod(a10, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f27945h)});
                        break;
                    case 3:
                        Method method = cls.getMethod(a10, new Class[]{Drawable.class});
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f27945h);
                        method.invoke(view, new Object[]{colorDrawable});
                        break;
                    case 4:
                        cls.getMethod(a10, new Class[]{CharSequence.class}).invoke(view, new Object[]{aVar.f27943f});
                        break;
                    case 5:
                        cls.getMethod(a10, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(aVar.f27944g)});
                        break;
                    case 6:
                        cls.getMethod(a10, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f27942e)});
                        break;
                    case 7:
                        cls.getMethod(a10, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f27941d)});
                        break;
                }
            } catch (NoSuchMethodException e10) {
                Log.e("TransitionLayout", e10.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + next + "\" not found on " + cls.getName());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls.getName());
                sb2.append(" must have a method ");
                sb2.append(a10);
                Log.e("TransitionLayout", sb2.toString());
            } catch (IllegalAccessException e11) {
                StringBuilder a11 = d.a(" Custom Attribute \"", next, "\" not found on ");
                a11.append(cls.getName());
                Log.e("TransitionLayout", a11.toString());
                e11.printStackTrace();
            } catch (InvocationTargetException e12) {
                StringBuilder a12 = d.a(" Custom Attribute \"", next, "\" not found on ");
                a12.append(cls.getName());
                Log.e("TransitionLayout", a12.toString());
                e12.printStackTrace();
            }
        }
    }

    public void c(Object obj) {
        switch (g.f(this.f27940c)) {
            case 0:
            case 7:
                this.f27941d = ((Integer) obj).intValue();
                return;
            case 1:
                this.f27942e = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f27945h = ((Integer) obj).intValue();
                return;
            case 4:
                this.f27943f = (String) obj;
                return;
            case 5:
                this.f27944g = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.f27942e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public a(a aVar, Object obj) {
        this.f27939b = aVar.f27939b;
        this.f27940c = aVar.f27940c;
        c(obj);
    }
}

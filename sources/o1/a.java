package o1;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import be.g;
import ce.i;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o1.d0;
import ud.k;
import ud.l;
import v.e;

@d0.b("activity")
/* compiled from: ActivityNavigator.kt */
public class a extends d0<C0200a> {

    /* renamed from: c  reason: collision with root package name */
    public final Context f22639c;

    /* renamed from: d  reason: collision with root package name */
    public final Activity f22640d;

    /* renamed from: o1.a$a  reason: collision with other inner class name */
    /* compiled from: ActivityNavigator.kt */
    public static class C0200a extends r {

        /* renamed from: s  reason: collision with root package name */
        public Intent f22641s;

        /* renamed from: t  reason: collision with root package name */
        public String f22642t;

        public C0200a(d0<? extends C0200a> d0Var) {
            super(d0Var);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C0200a) || !super.equals(obj)) {
                return false;
            }
            Intent intent = this.f22641s;
            if (!(intent != null ? intent.filterEquals(((C0200a) obj).f22641s) : ((C0200a) obj).f22641s == null) || !k.a(this.f22642t, ((C0200a) obj).f22642t)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            Intent intent = this.f22641s;
            int i10 = 0;
            int filterHashCode = (hashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.f22642t;
            if (str != null) {
                i10 = str.hashCode();
            }
            return filterHashCode + i10;
        }

        public String toString() {
            Intent intent = this.f22641s;
            String str = null;
            ComponentName component = intent != null ? intent.getComponent() : null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            if (component != null) {
                sb2.append(" class=");
                sb2.append(component.getClassName());
            } else {
                Intent intent2 = this.f22641s;
                if (intent2 != null) {
                    str = intent2.getAction();
                }
                if (str != null) {
                    sb2.append(" action=");
                    sb2.append(str);
                }
            }
            String sb3 = sb2.toString();
            k.e(sb3, "sb.toString()");
            return sb3;
        }

        public void y(Context context, AttributeSet attributeSet) {
            k.f(context, "context");
            k.f(attributeSet, "attrs");
            super.y(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, g0.f22691a);
            k.e(obtainAttributes, "context.resources.obtain…tyNavigator\n            )");
            String string = obtainAttributes.getString(4);
            if (string != null) {
                String packageName = context.getPackageName();
                k.e(packageName, "context.packageName");
                string = i.g(string, "${applicationId}", packageName, false, 4);
            }
            if (this.f22641s == null) {
                this.f22641s = new Intent();
            }
            Intent intent = this.f22641s;
            k.c(intent);
            intent.setPackage(string);
            String string2 = obtainAttributes.getString(0);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                ComponentName componentName = new ComponentName(context, string2);
                if (this.f22641s == null) {
                    this.f22641s = new Intent();
                }
                Intent intent2 = this.f22641s;
                k.c(intent2);
                intent2.setComponent(componentName);
            }
            String string3 = obtainAttributes.getString(1);
            if (this.f22641s == null) {
                this.f22641s = new Intent();
            }
            Intent intent3 = this.f22641s;
            k.c(intent3);
            intent3.setAction(string3);
            String string4 = obtainAttributes.getString(2);
            if (string4 != null) {
                Uri parse = Uri.parse(string4);
                if (this.f22641s == null) {
                    this.f22641s = new Intent();
                }
                Intent intent4 = this.f22641s;
                k.c(intent4);
                intent4.setData(parse);
            }
            this.f22642t = obtainAttributes.getString(3);
            obtainAttributes.recycle();
        }
    }

    /* compiled from: ActivityNavigator.kt */
    public static final class b implements d0.a {
    }

    /* compiled from: ActivityNavigator.kt */
    public static final class c extends l implements td.l<Context, Context> {

        /* renamed from: b  reason: collision with root package name */
        public static final c f22643b = new c();

        public c() {
            super(1);
        }

        public Object c(Object obj) {
            Context context = (Context) obj;
            k.f(context, "it");
            if (context instanceof ContextWrapper) {
                return ((ContextWrapper) context).getBaseContext();
            }
            return null;
        }
    }

    public a(Context context) {
        Object obj;
        k.f(context, "context");
        this.f22639c = context;
        Iterator it = g.c(context, c.f22643b).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Context) obj) instanceof Activity) {
                break;
            }
        }
        this.f22640d = (Activity) obj;
    }

    public r a() {
        return new C0200a(this);
    }

    public r c(r rVar, Bundle bundle, x xVar, d0.a aVar) {
        Intent intent;
        int intExtra;
        C0200a aVar2 = (C0200a) rVar;
        if (aVar2.f22641s != null) {
            Intent intent2 = new Intent(aVar2.f22641s);
            int i10 = 0;
            if (bundle != null) {
                intent2.putExtras(bundle);
                String str = aVar2.f22642t;
                if (!(str == null || str.length() == 0)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            stringBuffer.append(Uri.encode(String.valueOf(bundle.get(group))));
                        } else {
                            throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + str);
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            boolean z10 = aVar instanceof b;
            if (z10) {
                ((b) aVar).getClass();
                intent2.addFlags(0);
            }
            if (this.f22640d == null) {
                intent2.addFlags(268435456);
            }
            if (xVar != null && xVar.f22826a) {
                intent2.addFlags(536870912);
            }
            Activity activity = this.f22640d;
            if (!(activity == null || (intent = activity.getIntent()) == null || (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) == 0)) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", aVar2.f22806h);
            Resources resources = this.f22639c.getResources();
            if (xVar != null) {
                int i11 = xVar.f22833h;
                int i12 = xVar.f22834i;
                if ((i11 <= 0 || !k.a(resources.getResourceTypeName(i11), "animator")) && (i12 <= 0 || !k.a(resources.getResourceTypeName(i12), "animator"))) {
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i11);
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i12);
                } else {
                    StringBuilder a10 = android.support.v4.media.a.a("Activity destinations do not support Animator resource. Ignoring popEnter resource ");
                    a10.append(resources.getResourceName(i11));
                    a10.append(" and popExit resource ");
                    a10.append(resources.getResourceName(i12));
                    a10.append(" when launching ");
                    a10.append(aVar2);
                    Log.w("ActivityNavigator", a10.toString());
                }
            }
            if (z10) {
                ((b) aVar).getClass();
                this.f22639c.startActivity(intent2);
            } else {
                this.f22639c.startActivity(intent2);
            }
            if (xVar == null || this.f22640d == null) {
                return null;
            }
            int i13 = xVar.f22831f;
            int i14 = xVar.f22832g;
            if ((i13 > 0 && k.a(resources.getResourceTypeName(i13), "animator")) || (i14 > 0 && k.a(resources.getResourceTypeName(i14), "animator"))) {
                StringBuilder a11 = android.support.v4.media.a.a("Activity destinations do not support Animator resource. Ignoring enter resource ");
                a11.append(resources.getResourceName(i13));
                a11.append(" and exit resource ");
                a11.append(resources.getResourceName(i14));
                a11.append("when launching ");
                a11.append(aVar2);
                Log.w("ActivityNavigator", a11.toString());
                return null;
            } else if (i13 < 0 && i14 < 0) {
                return null;
            } else {
                if (i13 < 0) {
                    i13 = 0;
                }
                if (i14 >= 0) {
                    i10 = i14;
                }
                this.f22640d.overridePendingTransition(i13, i10);
                return null;
            }
        } else {
            throw new IllegalStateException(e.a(android.support.v4.media.a.a("Destination "), aVar2.f22806h, " does not have an Intent set.").toString());
        }
    }

    public boolean j() {
        Activity activity = this.f22640d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}

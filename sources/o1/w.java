package o1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import ce.i;
import java.io.IOException;
import o1.a;
import org.xmlpull.v1.XmlPullParserException;
import p1.a;
import ud.k;

/* compiled from: NavInflater.kt */
public final class w {

    /* renamed from: c  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f22823c = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final Context f22824a;

    /* renamed from: b  reason: collision with root package name */
    public final e0 f22825b;

    public w(Context context, e0 e0Var) {
        k.f(context, "context");
        k.f(e0Var, "navigatorProvider");
        this.f22824a = context;
        this.f22825b = e0Var;
    }

    public static final a0<?> a(TypedValue typedValue, a0<?> a0Var, a0<?> a0Var2, String str, String str2) throws XmlPullParserException {
        if (a0Var == null || a0Var == a0Var2) {
            return a0Var == null ? a0Var2 : a0Var;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }

    public final r b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i10) throws XmlPullParserException, IOException {
        int depth;
        int i11;
        int i12;
        int depth2;
        String str;
        String str2;
        String str3;
        Resources resources2 = resources;
        AttributeSet attributeSet2 = attributeSet;
        e0 e0Var = this.f22825b;
        String name = xmlResourceParser.getName();
        k.e(name, "parser.name");
        r a10 = e0Var.c(name).a();
        a10.y(this.f22824a, attributeSet2);
        int i13 = 1;
        int depth3 = xmlResourceParser.getDepth() + 1;
        int i14 = i10;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i13 || ((depth = xmlResourceParser.getDepth()) < depth3 && next == 3)) {
                return a10;
            }
            if (next == 2 && depth <= depth3) {
                String name2 = xmlResourceParser.getName();
                if (k.a("argument", name2)) {
                    TypedArray obtainAttributes = resources2.obtainAttributes(attributeSet2, a.f23772b);
                    k.e(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
                    String string = obtainAttributes.getString(0);
                    if (string != null) {
                        a10.f22805g.put(string, d(obtainAttributes, resources2, i14));
                        obtainAttributes.recycle();
                    } else {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                } else {
                    if (k.a("deepLink", name2)) {
                        TypedArray obtainAttributes2 = resources2.obtainAttributes(attributeSet2, a.f23773c);
                        k.e(obtainAttributes2, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
                        String string2 = obtainAttributes2.getString(3);
                        String string3 = obtainAttributes2.getString(i13);
                        String string4 = obtainAttributes2.getString(2);
                        if (string2 == null || string2.length() == 0) {
                            if (string3 == null || string3.length() == 0) {
                                if (string4 == null || string4.length() == 0) {
                                    throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                                }
                            }
                        }
                        if (string2 != null) {
                            String packageName = this.f22824a.getPackageName();
                            k.e(packageName, "context.packageName");
                            str = i.g(string2, "${applicationId}", packageName, false, 4);
                        } else {
                            str = null;
                        }
                        if (!(string3 == null || string3.length() == 0)) {
                            String packageName2 = this.f22824a.getPackageName();
                            k.e(packageName2, "context.packageName");
                            str2 = i.g(string3, "${applicationId}", packageName2, false, 4);
                            if (!(str2.length() > 0)) {
                                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
                            }
                        } else {
                            str2 = null;
                        }
                        if (string4 != null) {
                            String packageName3 = this.f22824a.getPackageName();
                            k.e(packageName3, "context.packageName");
                            str3 = i.g(string4, "${applicationId}", packageName3, false, 4);
                        } else {
                            str3 = null;
                        }
                        a10.c(new n(str, str2, str3));
                        obtainAttributes2.recycle();
                        i11 = depth3;
                        i12 = i14;
                    } else {
                        if (k.a("action", name2)) {
                            TypedArray obtainStyledAttributes = this.f22824a.obtainStyledAttributes(attributeSet2, a.f23771a, 0, 0);
                            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                            i11 = depth3;
                            c cVar = new c(obtainStyledAttributes.getResourceId(i13, 0), (x) null, (Bundle) null, 6);
                            cVar.f22662b = new x(obtainStyledAttributes.getBoolean(4, false), obtainStyledAttributes.getBoolean(10, false), obtainStyledAttributes.getResourceId(7, -1), obtainStyledAttributes.getBoolean(8, false), obtainStyledAttributes.getBoolean(9, false), obtainStyledAttributes.getResourceId(2, -1), obtainStyledAttributes.getResourceId(3, -1), obtainStyledAttributes.getResourceId(5, -1), obtainStyledAttributes.getResourceId(6, -1));
                            Bundle bundle = new Bundle();
                            int i15 = 1;
                            int depth4 = xmlResourceParser.getDepth() + 1;
                            while (true) {
                                int next2 = xmlResourceParser.next();
                                if (next2 != i15 && ((depth2 = xmlResourceParser.getDepth()) >= depth4 || next2 != 3)) {
                                    if (next2 == 2 && depth2 <= depth4 && k.a("argument", xmlResourceParser.getName())) {
                                        TypedArray obtainAttributes3 = resources2.obtainAttributes(attributeSet2, a.f23772b);
                                        k.e(obtainAttributes3, "res.obtainAttributes(att… R.styleable.NavArgument)");
                                        String string5 = obtainAttributes3.getString(0);
                                        if (string5 != null) {
                                            g d10 = d(obtainAttributes3, resources2, i14);
                                            boolean z10 = d10.f22689c;
                                            if (z10 && z10) {
                                                d10.f22687a.d(bundle, string5, d10.f22690d);
                                            }
                                            obtainAttributes3.recycle();
                                        } else {
                                            throw new XmlPullParserException("Arguments must have a name");
                                        }
                                    }
                                    i14 = i10;
                                    i15 = 1;
                                }
                            }
                            if (!bundle.isEmpty()) {
                                cVar.f22663c = bundle;
                            }
                            if (!(a10 instanceof a.C0200a)) {
                                if (resourceId != 0) {
                                    a10.f22804f.h(resourceId, cVar);
                                    obtainStyledAttributes.recycle();
                                } else {
                                    throw new IllegalArgumentException("Cannot have an action with actionId 0".toString());
                                }
                            } else {
                                throw new UnsupportedOperationException("Cannot add action " + resourceId + " to " + a10 + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
                            }
                        } else {
                            i11 = depth3;
                            if (k.a("include", name2) && (a10 instanceof t)) {
                                TypedArray obtainAttributes4 = resources2.obtainAttributes(attributeSet2, g0.f22693c);
                                k.e(obtainAttributes4, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                                ((t) a10).A(c(obtainAttributes4.getResourceId(0, 0)));
                                obtainAttributes4.recycle();
                            } else if (a10 instanceof t) {
                                ((t) a10).A(b(resources, xmlResourceParser, attributeSet, i10));
                            }
                        }
                        i12 = i10;
                    }
                    i14 = i12;
                    depth3 = i11;
                    i13 = 1;
                }
            }
        }
        return a10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005b A[Catch:{ Exception -> 0x0065, all -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f A[Catch:{ Exception -> 0x0065, all -> 0x0063 }] */
    @android.annotation.SuppressLint({"ResourceType"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o1.t c(int r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f22824a
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.XmlResourceParser r1 = r0.getXml(r7)
            java.lang.String r2 = "res.getXml(graphResId)"
            ud.k.e(r1, r2)
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r1)
        L_0x0013:
            int r3 = r1.next()     // Catch:{ Exception -> 0x0065 }
            r4 = 2
            if (r3 == r4) goto L_0x001d
            r5 = 1
            if (r3 != r5) goto L_0x0013
        L_0x001d:
            if (r3 != r4) goto L_0x005b
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x0065 }
            java.lang.String r4 = "res"
            ud.k.e(r0, r4)     // Catch:{ Exception -> 0x0065 }
            java.lang.String r4 = "attrs"
            ud.k.e(r2, r4)     // Catch:{ Exception -> 0x0065 }
            o1.r r2 = r6.b(r0, r1, r2, r7)     // Catch:{ Exception -> 0x0065 }
            boolean r4 = r2 instanceof o1.t     // Catch:{ Exception -> 0x0065 }
            if (r4 == 0) goto L_0x003b
            o1.t r2 = (o1.t) r2     // Catch:{ Exception -> 0x0065 }
            r1.close()
            return r2
        L_0x003b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0065 }
            r2.<init>()     // Catch:{ Exception -> 0x0065 }
            java.lang.String r4 = "Root element <"
            r2.append(r4)     // Catch:{ Exception -> 0x0065 }
            r2.append(r3)     // Catch:{ Exception -> 0x0065 }
            java.lang.String r3 = "> did not inflate into a NavGraph"
            r2.append(r3)     // Catch:{ Exception -> 0x0065 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0065 }
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0065 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0065 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0065 }
            throw r3     // Catch:{ Exception -> 0x0065 }
        L_0x005b:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0065 }
            java.lang.String r3 = "No start tag found"
            r2.<init>(r3)     // Catch:{ Exception -> 0x0065 }
            throw r2     // Catch:{ Exception -> 0x0065 }
        L_0x0063:
            r7 = move-exception
            goto L_0x008d
        L_0x0065:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x0063 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0063 }
            r4.<init>()     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = "Exception inflating "
            r4.append(r5)     // Catch:{ all -> 0x0063 }
            java.lang.String r7 = r0.getResourceName(r7)     // Catch:{ all -> 0x0063 }
            r4.append(r7)     // Catch:{ all -> 0x0063 }
            java.lang.String r7 = " line "
            r4.append(r7)     // Catch:{ all -> 0x0063 }
            int r7 = r1.getLineNumber()     // Catch:{ all -> 0x0063 }
            r4.append(r7)     // Catch:{ all -> 0x0063 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0063 }
            r3.<init>(r7, r2)     // Catch:{ all -> 0x0063 }
            throw r3     // Catch:{ all -> 0x0063 }
        L_0x008d:
            r1.close()
            goto L_0x0092
        L_0x0091:
            throw r7
        L_0x0092:
            goto L_0x0091
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.w.c(int):o1.t");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:117|118|119|120|121|122) */
    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        r1 = o1.a0.f22647e;
        r1.c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        r1 = o1.a0.f22649g;
        r1.c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        r1 = o1.a0.f22651i;
        r1.c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0281, code lost:
        r1 = o1.a0.f22653k;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:117:0x026f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:119:0x0275 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:121:0x027b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o1.g d(android.content.res.TypedArray r16, android.content.res.Resources r17, int r18) throws org.xmlpull.v1.XmlPullParserException {
        /*
            r15 = this;
            r0 = r16
            r1 = 3
            r2 = 0
            boolean r3 = r0.getBoolean(r1, r2)
            java.lang.ThreadLocal<android.util.TypedValue> r4 = f22823c
            java.lang.Object r5 = r4.get()
            android.util.TypedValue r5 = (android.util.TypedValue) r5
            if (r5 != 0) goto L_0x001a
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            r4.set(r5)
        L_0x001a:
            r4 = 2
            java.lang.String r6 = r0.getString(r4)
            java.lang.String r7 = "reference"
            r8 = 0
            r9 = 1
            if (r6 == 0) goto L_0x0152
            java.lang.String r10 = r17.getResourcePackageName(r18)
            o1.a0<java.lang.Integer> r11 = o1.a0.f22644b
            java.lang.String r12 = "integer"
            boolean r12 = ud.k.a(r12, r6)
            if (r12 == 0) goto L_0x0035
            goto L_0x0153
        L_0x0035:
            o1.a0<int[]> r11 = o1.a0.f22646d
            java.lang.String r12 = "integer[]"
            boolean r12 = ud.k.a(r12, r6)
            if (r12 == 0) goto L_0x0041
            goto L_0x0153
        L_0x0041:
            o1.a0<java.lang.Long> r11 = o1.a0.f22647e
            java.lang.String r12 = "long"
            boolean r12 = ud.k.a(r12, r6)
            if (r12 == 0) goto L_0x004d
            goto L_0x0153
        L_0x004d:
            o1.a0<long[]> r11 = o1.a0.f22648f
            java.lang.String r12 = "long[]"
            boolean r12 = ud.k.a(r12, r6)
            if (r12 == 0) goto L_0x0059
            goto L_0x0153
        L_0x0059:
            o1.a0<java.lang.Boolean> r11 = o1.a0.f22651i
            java.lang.String r12 = "boolean"
            boolean r12 = ud.k.a(r12, r6)
            if (r12 == 0) goto L_0x0065
            goto L_0x0153
        L_0x0065:
            o1.a0<boolean[]> r11 = o1.a0.f22652j
            java.lang.String r12 = "boolean[]"
            boolean r12 = ud.k.a(r12, r6)
            if (r12 == 0) goto L_0x0071
            goto L_0x0153
        L_0x0071:
            o1.a0<java.lang.String> r11 = o1.a0.f22653k
            java.lang.String r12 = "string"
            boolean r12 = ud.k.a(r12, r6)
            if (r12 == 0) goto L_0x007d
            goto L_0x0153
        L_0x007d:
            o1.a0<java.lang.String[]> r12 = o1.a0.f22654l
            java.lang.String r13 = "string[]"
            boolean r13 = ud.k.a(r13, r6)
            if (r13 == 0) goto L_0x008a
        L_0x0087:
            r11 = r12
            goto L_0x0153
        L_0x008a:
            o1.a0<java.lang.Float> r12 = o1.a0.f22649g
            java.lang.String r13 = "float"
            boolean r13 = ud.k.a(r13, r6)
            if (r13 == 0) goto L_0x0095
            goto L_0x0087
        L_0x0095:
            o1.a0<float[]> r12 = o1.a0.f22650h
            java.lang.String r13 = "float[]"
            boolean r13 = ud.k.a(r13, r6)
            if (r13 == 0) goto L_0x00a0
            goto L_0x0087
        L_0x00a0:
            o1.a0<java.lang.Integer> r12 = o1.a0.f22645c
            boolean r13 = ud.k.a(r7, r6)
            if (r13 == 0) goto L_0x00a9
            goto L_0x0087
        L_0x00a9:
            int r12 = r6.length()
            if (r12 != 0) goto L_0x00b1
            r12 = 1
            goto L_0x00b2
        L_0x00b1:
            r12 = 0
        L_0x00b2:
            if (r12 != 0) goto L_0x0153
            java.lang.String r11 = "."
            boolean r11 = ce.i.h(r6, r11, r2, r4)     // Catch:{ ClassNotFoundException -> 0x014b }
            if (r11 == 0) goto L_0x00ce
            if (r10 == 0) goto L_0x00ce
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x014b }
            r11.<init>()     // Catch:{ ClassNotFoundException -> 0x014b }
            r11.append(r10)     // Catch:{ ClassNotFoundException -> 0x014b }
            r11.append(r6)     // Catch:{ ClassNotFoundException -> 0x014b }
            java.lang.String r10 = r11.toString()     // Catch:{ ClassNotFoundException -> 0x014b }
            goto L_0x00cf
        L_0x00ce:
            r10 = r6
        L_0x00cf:
            java.lang.String r11 = "[]"
            boolean r11 = ce.i.b(r6, r11, r2, r4)     // Catch:{ ClassNotFoundException -> 0x014b }
            if (r11 == 0) goto L_0x0105
            int r11 = r10.length()     // Catch:{ ClassNotFoundException -> 0x014b }
            int r11 = r11 - r4
            java.lang.String r10 = r10.substring(r2, r11)     // Catch:{ ClassNotFoundException -> 0x014b }
            java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
            ud.k.e(r10, r4)     // Catch:{ ClassNotFoundException -> 0x014b }
            java.lang.Class r4 = java.lang.Class.forName(r10)     // Catch:{ ClassNotFoundException -> 0x014b }
            java.lang.Class<android.os.Parcelable> r11 = android.os.Parcelable.class
            boolean r11 = r11.isAssignableFrom(r4)     // Catch:{ ClassNotFoundException -> 0x014b }
            if (r11 == 0) goto L_0x00f7
            o1.a0$m r10 = new o1.a0$m     // Catch:{ ClassNotFoundException -> 0x014b }
            r10.<init>(r4)     // Catch:{ ClassNotFoundException -> 0x014b }
            goto L_0x0116
        L_0x00f7:
            java.lang.Class<java.io.Serializable> r11 = java.io.Serializable.class
            boolean r11 = r11.isAssignableFrom(r4)     // Catch:{ ClassNotFoundException -> 0x014b }
            if (r11 == 0) goto L_0x0134
            o1.a0$o r10 = new o1.a0$o     // Catch:{ ClassNotFoundException -> 0x014b }
            r10.<init>(r4)     // Catch:{ ClassNotFoundException -> 0x014b }
            goto L_0x0116
        L_0x0105:
            java.lang.Class r4 = java.lang.Class.forName(r10)     // Catch:{ ClassNotFoundException -> 0x014b }
            java.lang.Class<android.os.Parcelable> r11 = android.os.Parcelable.class
            boolean r11 = r11.isAssignableFrom(r4)     // Catch:{ ClassNotFoundException -> 0x014b }
            if (r11 == 0) goto L_0x0118
            o1.a0$n r10 = new o1.a0$n     // Catch:{ ClassNotFoundException -> 0x014b }
            r10.<init>(r4)     // Catch:{ ClassNotFoundException -> 0x014b }
        L_0x0116:
            r11 = r10
            goto L_0x0153
        L_0x0118:
            java.lang.Class<java.lang.Enum> r11 = java.lang.Enum.class
            boolean r11 = r11.isAssignableFrom(r4)     // Catch:{ ClassNotFoundException -> 0x014b }
            if (r11 == 0) goto L_0x0126
            o1.a0$l r10 = new o1.a0$l     // Catch:{ ClassNotFoundException -> 0x014b }
            r10.<init>(r4)     // Catch:{ ClassNotFoundException -> 0x014b }
            goto L_0x0116
        L_0x0126:
            java.lang.Class<java.io.Serializable> r11 = java.io.Serializable.class
            boolean r11 = r11.isAssignableFrom(r4)     // Catch:{ ClassNotFoundException -> 0x014b }
            if (r11 == 0) goto L_0x0134
            o1.a0$p r10 = new o1.a0$p     // Catch:{ ClassNotFoundException -> 0x014b }
            r10.<init>(r4)     // Catch:{ ClassNotFoundException -> 0x014b }
            goto L_0x0116
        L_0x0134:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ ClassNotFoundException -> 0x014b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x014b }
            r1.<init>()     // Catch:{ ClassNotFoundException -> 0x014b }
            r1.append(r10)     // Catch:{ ClassNotFoundException -> 0x014b }
            java.lang.String r2 = " is not Serializable or Parcelable."
            r1.append(r2)     // Catch:{ ClassNotFoundException -> 0x014b }
            java.lang.String r1 = r1.toString()     // Catch:{ ClassNotFoundException -> 0x014b }
            r0.<init>(r1)     // Catch:{ ClassNotFoundException -> 0x014b }
            throw r0     // Catch:{ ClassNotFoundException -> 0x014b }
        L_0x014b:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0152:
            r11 = r8
        L_0x0153:
            boolean r4 = r0.getValue(r9, r5)
            if (r4 == 0) goto L_0x0289
            o1.a0<java.lang.Integer> r4 = o1.a0.f22645c
            java.lang.String r10 = "' for "
            java.lang.String r12 = "unsupported value '"
            r13 = 16
            if (r11 != r4) goto L_0x0199
            int r0 = r5.resourceId
            if (r0 == 0) goto L_0x0168
            goto L_0x0171
        L_0x0168:
            int r0 = r5.type
            if (r0 != r13) goto L_0x0177
            int r0 = r5.data
            if (r0 != 0) goto L_0x0177
            r0 = 0
        L_0x0171:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x028a
        L_0x0177:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = android.support.v4.media.a.a(r12)
            java.lang.CharSequence r2 = r5.string
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = r11.b()
            r1.append(r2)
            java.lang.String r2 = ". Must be a reference to a resource."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0199:
            int r14 = r5.resourceId
            if (r14 == 0) goto L_0x01ca
            if (r11 != 0) goto L_0x01a6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            r11 = r4
            goto L_0x028a
        L_0x01a6:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = android.support.v4.media.a.a(r12)
            java.lang.CharSequence r2 = r5.string
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = r11.b()
            r1.append(r2)
            java.lang.String r2 = ". You must use a \""
            r1.append(r2)
            java.lang.String r2 = "\" type to reference other resources."
            java.lang.String r1 = androidx.activity.e.a(r1, r7, r2)
            r0.<init>(r1)
            throw r0
        L_0x01ca:
            o1.a0<java.lang.String> r4 = o1.a0.f22653k
            if (r11 != r4) goto L_0x01d4
            java.lang.String r0 = r0.getString(r9)
            goto L_0x028a
        L_0x01d4:
            int r0 = r5.type
            if (r0 == r1) goto L_0x025b
            r1 = 4
            if (r0 == r1) goto L_0x024a
            r1 = 5
            if (r0 == r1) goto L_0x0234
            r1 = 18
            if (r0 == r1) goto L_0x0220
            if (r0 < r13) goto L_0x020b
            r1 = 31
            if (r0 > r1) goto L_0x020b
            o1.a0<java.lang.Float> r0 = o1.a0.f22649g
            if (r11 != r0) goto L_0x01fb
            java.lang.String r1 = "float"
            o1.a0 r11 = a(r5, r11, r0, r6, r1)
            int r0 = r5.data
            float r0 = (float) r0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x028a
        L_0x01fb:
            o1.a0<java.lang.Integer> r0 = o1.a0.f22644b
            java.lang.String r1 = "integer"
            o1.a0 r11 = a(r5, r11, r0, r6, r1)
            int r0 = r5.data
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x028a
        L_0x020b:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "unsupported argument type "
            java.lang.StringBuilder r1 = android.support.v4.media.a.a(r1)
            int r2 = r5.type
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0220:
            o1.a0<java.lang.Boolean> r0 = o1.a0.f22651i
            java.lang.String r1 = "boolean"
            o1.a0 r11 = a(r5, r11, r0, r6, r1)
            int r0 = r5.data
            if (r0 == 0) goto L_0x022e
            r0 = 1
            goto L_0x022f
        L_0x022e:
            r0 = 0
        L_0x022f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x028a
        L_0x0234:
            o1.a0<java.lang.Integer> r0 = o1.a0.f22644b
            java.lang.String r1 = "dimension"
            o1.a0 r11 = a(r5, r11, r0, r6, r1)
            android.util.DisplayMetrics r0 = r17.getDisplayMetrics()
            float r0 = r5.getDimension(r0)
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x028a
        L_0x024a:
            o1.a0<java.lang.Float> r0 = o1.a0.f22649g
            java.lang.String r1 = "float"
            o1.a0 r11 = a(r5, r11, r0, r6, r1)
            float r0 = r5.getFloat()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x028a
        L_0x025b:
            java.lang.CharSequence r0 = r5.string
            java.lang.String r0 = r0.toString()
            if (r11 != 0) goto L_0x0284
            java.lang.String r1 = "value"
            ud.k.f(r0, r1)
            o1.a0<java.lang.Integer> r1 = o1.a0.f22644b     // Catch:{ IllegalArgumentException -> 0x026f }
            r1.c(r0)     // Catch:{ IllegalArgumentException -> 0x026f }
        L_0x026d:
            r11 = r1
            goto L_0x0284
        L_0x026f:
            o1.a0<java.lang.Long> r1 = o1.a0.f22647e     // Catch:{ IllegalArgumentException -> 0x0275 }
            r1.c(r0)     // Catch:{ IllegalArgumentException -> 0x0275 }
            goto L_0x026d
        L_0x0275:
            o1.a0<java.lang.Float> r1 = o1.a0.f22649g     // Catch:{ IllegalArgumentException -> 0x027b }
            r1.c(r0)     // Catch:{ IllegalArgumentException -> 0x027b }
            goto L_0x026d
        L_0x027b:
            o1.a0<java.lang.Boolean> r1 = o1.a0.f22651i     // Catch:{ IllegalArgumentException -> 0x0281 }
            r1.c(r0)     // Catch:{ IllegalArgumentException -> 0x0281 }
            goto L_0x026d
        L_0x0281:
            o1.a0<java.lang.String> r1 = o1.a0.f22653k
            goto L_0x026d
        L_0x0284:
            java.lang.Object r0 = r11.c(r0)
            goto L_0x028a
        L_0x0289:
            r0 = r8
        L_0x028a:
            if (r0 == 0) goto L_0x028e
            r2 = 1
            goto L_0x028f
        L_0x028e:
            r0 = r8
        L_0x028f:
            if (r11 == 0) goto L_0x0292
            r8 = r11
        L_0x0292:
            if (r8 != 0) goto L_0x03a2
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x029c
            o1.a0<java.lang.Integer> r8 = o1.a0.f22644b
            goto L_0x03a2
        L_0x029c:
            boolean r1 = r0 instanceof int[]
            if (r1 == 0) goto L_0x02a4
            o1.a0<int[]> r8 = o1.a0.f22646d
            goto L_0x03a2
        L_0x02a4:
            boolean r1 = r0 instanceof java.lang.Long
            if (r1 == 0) goto L_0x02ac
            o1.a0<java.lang.Long> r8 = o1.a0.f22647e
            goto L_0x03a2
        L_0x02ac:
            boolean r1 = r0 instanceof long[]
            if (r1 == 0) goto L_0x02b4
            o1.a0<long[]> r8 = o1.a0.f22648f
            goto L_0x03a2
        L_0x02b4:
            boolean r1 = r0 instanceof java.lang.Float
            if (r1 == 0) goto L_0x02bc
            o1.a0<java.lang.Float> r8 = o1.a0.f22649g
            goto L_0x03a2
        L_0x02bc:
            boolean r1 = r0 instanceof float[]
            if (r1 == 0) goto L_0x02c4
            o1.a0<float[]> r8 = o1.a0.f22650h
            goto L_0x03a2
        L_0x02c4:
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L_0x02cc
            o1.a0<java.lang.Boolean> r8 = o1.a0.f22651i
            goto L_0x03a2
        L_0x02cc:
            boolean r1 = r0 instanceof boolean[]
            if (r1 == 0) goto L_0x02d4
            o1.a0<boolean[]> r8 = o1.a0.f22652j
            goto L_0x03a2
        L_0x02d4:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 != 0) goto L_0x03a0
            if (r0 != 0) goto L_0x02dc
            goto L_0x03a0
        L_0x02dc:
            boolean r1 = r0 instanceof java.lang.Object[]
            if (r1 == 0) goto L_0x02eb
            r1 = r0
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            boolean r1 = r1 instanceof java.lang.String[]
            if (r1 == 0) goto L_0x02eb
            o1.a0<java.lang.String[]> r8 = o1.a0.f22654l
            goto L_0x03a2
        L_0x02eb:
            java.lang.Class r1 = r0.getClass()
            boolean r1 = r1.isArray()
            if (r1 == 0) goto L_0x0320
            java.lang.Class<android.os.Parcelable> r1 = android.os.Parcelable.class
            java.lang.Class r4 = r0.getClass()
            java.lang.Class r4 = r4.getComponentType()
            ud.k.c(r4)
            boolean r1 = r1.isAssignableFrom(r4)
            if (r1 == 0) goto L_0x0320
            o1.a0$m r1 = new o1.a0$m
            java.lang.Class r4 = r0.getClass()
            java.lang.Class r4 = r4.getComponentType()
            if (r4 == 0) goto L_0x0318
            r1.<init>(r4)
            goto L_0x0362
        L_0x0318:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>"
            r0.<init>(r1)
            throw r0
        L_0x0320:
            java.lang.Class r1 = r0.getClass()
            boolean r1 = r1.isArray()
            if (r1 == 0) goto L_0x0355
            java.lang.Class<java.io.Serializable> r1 = java.io.Serializable.class
            java.lang.Class r4 = r0.getClass()
            java.lang.Class r4 = r4.getComponentType()
            ud.k.c(r4)
            boolean r1 = r1.isAssignableFrom(r4)
            if (r1 == 0) goto L_0x0355
            o1.a0$o r1 = new o1.a0$o
            java.lang.Class r4 = r0.getClass()
            java.lang.Class r4 = r4.getComponentType()
            if (r4 == 0) goto L_0x034d
            r1.<init>(r4)
            goto L_0x0362
        L_0x034d:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>"
            r0.<init>(r1)
            throw r0
        L_0x0355:
            boolean r1 = r0 instanceof android.os.Parcelable
            if (r1 == 0) goto L_0x0364
            o1.a0$n r1 = new o1.a0$n
            java.lang.Class r4 = r0.getClass()
            r1.<init>(r4)
        L_0x0362:
            r8 = r1
            goto L_0x03a2
        L_0x0364:
            boolean r1 = r0 instanceof java.lang.Enum
            if (r1 == 0) goto L_0x0372
            o1.a0$l r1 = new o1.a0$l
            java.lang.Class r4 = r0.getClass()
            r1.<init>(r4)
            goto L_0x0362
        L_0x0372:
            boolean r1 = r0 instanceof java.io.Serializable
            if (r1 == 0) goto L_0x0380
            o1.a0$p r1 = new o1.a0$p
            java.lang.Class r4 = r0.getClass()
            r1.<init>(r4)
            goto L_0x0362
        L_0x0380:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Object of type "
            java.lang.StringBuilder r2 = android.support.v4.media.a.a(r2)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r2.append(r0)
            java.lang.String r0 = " is not supported for navigation arguments."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x03a0:
            o1.a0<java.lang.String> r8 = o1.a0.f22653k
        L_0x03a2:
            o1.g r1 = new o1.g
            r1.<init>(r8, r3, r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.w.d(android.content.res.TypedArray, android.content.res.Resources, int):o1.g");
    }
}

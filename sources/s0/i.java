package s0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.Locale;
import m0.b;

/* compiled from: TextViewCompat */
public final class i {

    /* compiled from: TextViewCompat */
    public static class a {
        public static boolean a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        public static int b(TextView textView) {
            return textView.getMaxLines();
        }

        public static int c(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* compiled from: TextViewCompat */
    public static class b {
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        public static int b(View view) {
            return view.getLayoutDirection();
        }

        public static int c(View view) {
            return view.getTextDirection();
        }

        public static Locale d(TextView textView) {
            return textView.getTextLocale();
        }

        public static void e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        public static void f(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
        }

        public static void g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public static void h(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    /* compiled from: TextViewCompat */
    public static class c {
        public static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        public static ColorStateList b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        public static PorterDuff.Mode c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        public static int d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        public static void e(TextView textView, int i10) {
            textView.setBreakStrategy(i10);
        }

        public static void f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        public static void g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        public static void h(TextView textView, int i10) {
            textView.setHyphenationFrequency(i10);
        }
    }

    /* compiled from: TextViewCompat */
    public static class d {
        public static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* compiled from: TextViewCompat */
    public static class e {
        public static String[] a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        public static PrecomputedText.Params b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        public static void c(TextView textView, int i10) {
            textView.setFirstBaselineToTopHeight(i10);
        }
    }

    /* compiled from: TextViewCompat */
    public static class f implements ActionMode.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f24895a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f24896b;

        /* renamed from: c  reason: collision with root package name */
        public Class<?> f24897c;

        /* renamed from: d  reason: collision with root package name */
        public Method f24898d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f24899e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f24900f = false;

        public f(ActionMode.Callback callback, TextView textView) {
            this.f24895a = callback;
            this.f24896b = textView;
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f24895a.onActionItemClicked(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f24895a.onCreateActionMode(actionMode, menu);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f24895a.onDestroyActionMode(actionMode);
        }

        /* JADX WARNING: Removed duplicated region for block: B:41:0x00d1  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x009f A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onPrepareActionMode(android.view.ActionMode r13, android.view.Menu r14) {
            /*
                r12 = this;
                android.widget.TextView r0 = r12.f24896b
                android.content.Context r0 = r0.getContext()
                android.content.pm.PackageManager r1 = r0.getPackageManager()
                boolean r2 = r12.f24900f
                java.lang.String r3 = "removeItemAt"
                r4 = 1
                r5 = 0
                if (r2 != 0) goto L_0x0032
                r12.f24900f = r4
                java.lang.String r2 = "com.android.internal.view.menu.MenuBuilder"
                java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r12.f24897c = r2     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r6[r5] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r12.f24898d = r2     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r12.f24899e = r4     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                goto L_0x0032
            L_0x002b:
                r2 = 0
                r12.f24897c = r2
                r12.f24898d = r2
                r12.f24899e = r5
            L_0x0032:
                boolean r2 = r12.f24899e     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                if (r2 == 0) goto L_0x0041
                java.lang.Class<?> r2 = r12.f24897c     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                boolean r2 = r2.isInstance(r14)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                if (r2 == 0) goto L_0x0041
                java.lang.reflect.Method r2 = r12.f24898d     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                goto L_0x004f
            L_0x0041:
                java.lang.Class r2 = r14.getClass()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                r6[r5] = r7     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r6)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
            L_0x004f:
                int r3 = r14.size()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                int r3 = r3 - r4
            L_0x0054:
                java.lang.String r6 = "android.intent.action.PROCESS_TEXT"
                if (r3 < 0) goto L_0x007e
                android.view.MenuItem r7 = r14.getItem(r3)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                android.content.Intent r8 = r7.getIntent()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                if (r8 == 0) goto L_0x007b
                android.content.Intent r7 = r7.getIntent()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                java.lang.String r7 = r7.getAction()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                boolean r6 = r6.equals(r7)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                if (r6 == 0) goto L_0x007b
                java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r3)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                r6[r5] = r7     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                r2.invoke(r14, r6)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
            L_0x007b:
                int r3 = r3 + -1
                goto L_0x0054
            L_0x007e:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                boolean r3 = r0 instanceof android.app.Activity
                java.lang.String r7 = "text/plain"
                if (r3 != 0) goto L_0x008a
                goto L_0x00d5
            L_0x008a:
                android.content.Intent r3 = new android.content.Intent
                r3.<init>()
                android.content.Intent r3 = r3.setAction(r6)
                android.content.Intent r3 = r3.setType(r7)
                java.util.List r3 = r1.queryIntentActivities(r3, r5)
                java.util.Iterator r3 = r3.iterator()
            L_0x009f:
                boolean r8 = r3.hasNext()
                if (r8 == 0) goto L_0x00d5
                java.lang.Object r8 = r3.next()
                android.content.pm.ResolveInfo r8 = (android.content.pm.ResolveInfo) r8
                java.lang.String r9 = r0.getPackageName()
                android.content.pm.ActivityInfo r10 = r8.activityInfo
                java.lang.String r10 = r10.packageName
                boolean r9 = r9.equals(r10)
                if (r9 == 0) goto L_0x00ba
                goto L_0x00ce
            L_0x00ba:
                android.content.pm.ActivityInfo r9 = r8.activityInfo
                boolean r10 = r9.exported
                if (r10 != 0) goto L_0x00c1
                goto L_0x00cc
            L_0x00c1:
                java.lang.String r9 = r9.permission
                if (r9 == 0) goto L_0x00ce
                int r9 = r0.checkSelfPermission(r9)
                if (r9 != 0) goto L_0x00cc
                goto L_0x00ce
            L_0x00cc:
                r9 = 0
                goto L_0x00cf
            L_0x00ce:
                r9 = 1
            L_0x00cf:
                if (r9 == 0) goto L_0x009f
                r2.add(r8)
                goto L_0x009f
            L_0x00d5:
                r0 = 0
            L_0x00d6:
                int r3 = r2.size()
                if (r0 >= r3) goto L_0x0129
                java.lang.Object r3 = r2.get(r0)
                android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
                int r8 = r0 + 100
                java.lang.CharSequence r9 = r3.loadLabel(r1)
                android.view.MenuItem r8 = r14.add(r5, r5, r8, r9)
                android.widget.TextView r9 = r12.f24896b
                android.content.Intent r10 = new android.content.Intent
                r10.<init>()
                android.content.Intent r10 = r10.setAction(r6)
                android.content.Intent r10 = r10.setType(r7)
                boolean r11 = r9 instanceof android.text.Editable
                if (r11 == 0) goto L_0x010d
                boolean r11 = r9.onCheckIsTextEditor()
                if (r11 == 0) goto L_0x010d
                boolean r9 = r9.isEnabled()
                if (r9 == 0) goto L_0x010d
                r9 = 1
                goto L_0x010e
            L_0x010d:
                r9 = 0
            L_0x010e:
                r9 = r9 ^ r4
                java.lang.String r11 = "android.intent.extra.PROCESS_TEXT_READONLY"
                android.content.Intent r9 = r10.putExtra(r11, r9)
                android.content.pm.ActivityInfo r3 = r3.activityInfo
                java.lang.String r10 = r3.packageName
                java.lang.String r3 = r3.name
                android.content.Intent r3 = r9.setClassName(r10, r3)
                android.view.MenuItem r3 = r8.setIntent(r3)
                r3.setShowAsAction(r4)
                int r0 = r0 + 1
                goto L_0x00d6
            L_0x0129:
                android.view.ActionMode$Callback r0 = r12.f24895a
                boolean r13 = r0.onPrepareActionMode(r13, r14)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: s0.i.f.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
        }
    }

    public static Drawable[] a(TextView textView) {
        if (Build.VERSION.SDK_INT >= 18) {
            return b.a(textView);
        }
        boolean z10 = true;
        if (b.b(textView) != 1) {
            z10 = false;
        }
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        if (z10) {
            Drawable drawable = compoundDrawables[2];
            Drawable drawable2 = compoundDrawables[0];
            compoundDrawables[0] = drawable;
            compoundDrawables[2] = drawable2;
        }
        return compoundDrawables;
    }

    public static b.a b(TextView textView) {
        int i10;
        int i11;
        TextDirectionHeuristic textDirectionHeuristic;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            return new b.a(e.b(textView));
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        int i13 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i13 >= 23) {
            i11 = 1;
            i10 = 1;
        } else {
            i11 = 0;
            i10 = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic2 = i13 >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
        if (i12 >= 23) {
            i11 = c.a(textView);
            i10 = c.d(textView);
        }
        if (i12 >= 18) {
            if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            } else if (i12 < 28 || (textView.getInputType() & 15) != 3) {
                if (b.b(textView) == 1) {
                    z10 = true;
                }
                switch (b.c(textView)) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (!z10) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            break;
                        } else {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                }
            } else {
                byte directionality = Character.getDirectionality(e.a(d.a(b.d(textView)))[0].codePointAt(0));
                if (directionality == 1 || directionality == 2) {
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                } else {
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                }
            }
            textDirectionHeuristic2 = textDirectionHeuristic;
        }
        return new b.a(textPaint, textDirectionHeuristic2, i11, i10);
    }

    public static void c(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (Build.VERSION.SDK_INT >= 18) {
            b.e(textView, drawable, drawable2, drawable3, drawable4);
            return;
        }
        boolean z10 = true;
        if (b.b(textView) != 1) {
            z10 = false;
        }
        Drawable drawable5 = z10 ? drawable3 : drawable;
        if (!z10) {
            drawable = drawable3;
        }
        textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
    }

    public static void d(TextView textView, int i10) {
        int i11;
        q.a.d(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            e.c(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (a.a(textView)) {
            i11 = fontMetricsInt.top;
        } else {
            i11 = fontMetricsInt.ascent;
        }
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void e(TextView textView, int i10) {
        int i11;
        q.a.d(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (a.a(textView)) {
            i11 = fontMetricsInt.bottom;
        } else {
            i11 = fontMetricsInt.descent;
        }
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    public static void f(TextView textView, int i10) {
        q.a.d(i10);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i10 != fontMetricsInt) {
            textView.setLineSpacing((float) (i10 - fontMetricsInt), 1.0f);
        }
    }

    public static void g(TextView textView, m0.b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            bVar.getClass();
            textView.setText((CharSequence) null);
            return;
        }
        b.a b10 = b(textView);
        bVar.getClass();
        if (b10.a((b.a) null)) {
            textView.setText(bVar);
            return;
        }
        throw new IllegalArgumentException("Given text can not be applied to TextView.");
    }

    public static void h(TextView textView, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i10);
        } else {
            textView.setTextAppearance(textView.getContext(), i10);
        }
    }

    public static ActionMode.Callback i(ActionMode.Callback callback) {
        return (!(callback instanceof f) || Build.VERSION.SDK_INT < 26) ? callback : ((f) callback).f24895a;
    }

    public static ActionMode.Callback j(TextView textView, ActionMode.Callback callback) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || i10 > 27 || (callback instanceof f) || callback == null) ? callback : new f(callback, textView);
    }
}

package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.startapp.startappsdk.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import t0.c;

/* compiled from: SuggestionsAdapter */
public class a1 extends c implements View.OnClickListener {
    public static final /* synthetic */ int G = 0;
    public int A = -1;
    public int B = -1;
    public int C = -1;
    public int D = -1;
    public int E = -1;
    public int F = -1;

    /* renamed from: t  reason: collision with root package name */
    public final SearchView f803t;

    /* renamed from: u  reason: collision with root package name */
    public final SearchableInfo f804u;

    /* renamed from: v  reason: collision with root package name */
    public final Context f805v;

    /* renamed from: w  reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f806w;

    /* renamed from: x  reason: collision with root package name */
    public final int f807x;

    /* renamed from: y  reason: collision with root package name */
    public int f808y = 1;

    /* renamed from: z  reason: collision with root package name */
    public ColorStateList f809z;

    /* compiled from: SuggestionsAdapter */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f810a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f811b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f812c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f813d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f814e;

        public a(View view) {
            this.f810a = (TextView) view.findViewById(16908308);
            this.f811b = (TextView) view.findViewById(16908309);
            this.f812c = (ImageView) view.findViewById(16908295);
            this.f813d = (ImageView) view.findViewById(16908296);
            this.f814e = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    public a1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f803t = searchView;
        this.f804u = searchableInfo;
        this.f807x = searchView.getSuggestionCommitIconResId();
        this.f805v = context;
        this.f806w = weakHashMap;
    }

    public static String h(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0147  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.View r18, android.content.Context r19, android.database.Cursor r20) {
        /*
            r17 = this;
            r1 = r17
            r2 = r20
            java.lang.Object r0 = r18.getTag()
            r3 = r0
            androidx.appcompat.widget.a1$a r3 = (androidx.appcompat.widget.a1.a) r3
            int r0 = r1.F
            r4 = 0
            r5 = -1
            if (r0 == r5) goto L_0x0017
            int r0 = r2.getInt(r0)
            r5 = r0
            goto L_0x0019
        L_0x0017:
            r0 = 0
            r5 = 0
        L_0x0019:
            android.widget.TextView r0 = r3.f810a
            r6 = 8
            if (r0 == 0) goto L_0x0037
            int r0 = r1.A
            java.lang.String r0 = h(r2, r0)
            android.widget.TextView r7 = r3.f810a
            r7.setText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0034
            r7.setVisibility(r6)
            goto L_0x0037
        L_0x0034:
            r7.setVisibility(r4)
        L_0x0037:
            android.widget.TextView r0 = r3.f811b
            r7 = 2
            r8 = 1
            if (r0 == 0) goto L_0x00c0
            int r0 = r1.C
            java.lang.String r0 = h(r2, r0)
            if (r0 == 0) goto L_0x0087
            android.content.res.ColorStateList r9 = r1.f809z
            if (r9 != 0) goto L_0x0068
            android.util.TypedValue r9 = new android.util.TypedValue
            r9.<init>()
            android.content.Context r10 = r1.f805v
            android.content.res.Resources$Theme r10 = r10.getTheme()
            r11 = 2130969838(0x7f0404ee, float:1.754837E38)
            r10.resolveAttribute(r11, r9, r8)
            android.content.Context r10 = r1.f805v
            android.content.res.Resources r10 = r10.getResources()
            int r9 = r9.resourceId
            android.content.res.ColorStateList r9 = r10.getColorStateList(r9)
            r1.f809z = r9
        L_0x0068:
            android.text.SpannableString r9 = new android.text.SpannableString
            r9.<init>(r0)
            android.text.style.TextAppearanceSpan r15 = new android.text.style.TextAppearanceSpan
            r11 = 0
            r12 = 0
            r13 = 0
            android.content.res.ColorStateList r14 = r1.f809z
            r16 = 0
            r10 = r15
            r6 = r15
            r15 = r16
            r10.<init>(r11, r12, r13, r14, r15)
            int r0 = r0.length()
            r10 = 33
            r9.setSpan(r6, r4, r0, r10)
            goto L_0x008d
        L_0x0087:
            int r0 = r1.B
            java.lang.String r9 = h(r2, r0)
        L_0x008d:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x00a0
            android.widget.TextView r0 = r3.f810a
            if (r0 == 0) goto L_0x00ac
            r0.setSingleLine(r4)
            android.widget.TextView r0 = r3.f810a
            r0.setMaxLines(r7)
            goto L_0x00ac
        L_0x00a0:
            android.widget.TextView r0 = r3.f810a
            if (r0 == 0) goto L_0x00ac
            r0.setSingleLine(r8)
            android.widget.TextView r0 = r3.f810a
            r0.setMaxLines(r8)
        L_0x00ac:
            android.widget.TextView r0 = r3.f811b
            r0.setText(r9)
            boolean r6 = android.text.TextUtils.isEmpty(r9)
            if (r6 == 0) goto L_0x00bd
            r6 = 8
            r0.setVisibility(r6)
            goto L_0x00c0
        L_0x00bd:
            r0.setVisibility(r4)
        L_0x00c0:
            android.widget.ImageView r6 = r3.f812c
            if (r6 == 0) goto L_0x0171
            int r0 = r1.D
            r9 = -1
            if (r0 != r9) goto L_0x00cc
            r0 = 0
            goto L_0x015e
        L_0x00cc:
            java.lang.String r0 = r2.getString(r0)
            android.graphics.drawable.Drawable r0 = r1.f(r0)
            if (r0 == 0) goto L_0x00d8
            goto L_0x015e
        L_0x00d8:
            android.app.SearchableInfo r0 = r1.f804u
            android.content.ComponentName r0 = r0.getSearchActivity()
            java.lang.String r9 = r0.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r10 = r1.f806w
            boolean r10 = r10.containsKey(r9)
            if (r10 == 0) goto L_0x0101
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r1.f806w
            java.lang.Object r0 = r0.get(r9)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 != 0) goto L_0x00f6
            r0 = 0
            goto L_0x0151
        L_0x00f6:
            android.content.Context r9 = r1.f805v
            android.content.res.Resources r9 = r9.getResources()
            android.graphics.drawable.Drawable r0 = r0.newDrawable(r9)
            goto L_0x0151
        L_0x0101:
            java.lang.String r10 = "SuggestionsAdapter"
            android.content.Context r11 = r1.f805v
            android.content.pm.PackageManager r11 = r11.getPackageManager()
            r12 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r12 = r11.getActivityInfo(r0, r12)     // Catch:{ NameNotFoundException -> 0x0139 }
            int r13 = r12.getIconResource()
            if (r13 != 0) goto L_0x0116
            goto L_0x0142
        L_0x0116:
            java.lang.String r14 = r0.getPackageName()
            android.content.pm.ApplicationInfo r12 = r12.applicationInfo
            android.graphics.drawable.Drawable r11 = r11.getDrawable(r14, r13, r12)
            if (r11 != 0) goto L_0x0143
            java.lang.String r11 = "Invalid icon resource "
            java.lang.String r12 = " for "
            java.lang.StringBuilder r11 = androidx.appcompat.widget.y0.a(r11, r13, r12)
            java.lang.String r0 = r0.flattenToShortString()
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            android.util.Log.w(r10, r0)
            goto L_0x0142
        L_0x0139:
            r0 = move-exception
            r11 = r0
            java.lang.String r0 = r11.toString()
            android.util.Log.w(r10, r0)
        L_0x0142:
            r11 = 0
        L_0x0143:
            if (r11 != 0) goto L_0x0147
            r0 = 0
            goto L_0x014b
        L_0x0147:
            android.graphics.drawable.Drawable$ConstantState r0 = r11.getConstantState()
        L_0x014b:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r10 = r1.f806w
            r10.put(r9, r0)
            r0 = r11
        L_0x0151:
            if (r0 == 0) goto L_0x0154
            goto L_0x015e
        L_0x0154:
            android.content.Context r0 = r1.f805v
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.graphics.drawable.Drawable r0 = r0.getDefaultActivityIcon()
        L_0x015e:
            r9 = 4
            r6.setImageDrawable(r0)
            if (r0 != 0) goto L_0x0168
            r6.setVisibility(r9)
            goto L_0x0171
        L_0x0168:
            r6.setVisibility(r4)
            r0.setVisible(r4, r4)
            r0.setVisible(r8, r4)
        L_0x0171:
            android.widget.ImageView r0 = r3.f813d
            if (r0 == 0) goto L_0x0198
            int r6 = r1.E
            r9 = -1
            if (r6 != r9) goto L_0x017c
            r2 = 0
            goto L_0x0184
        L_0x017c:
            java.lang.String r2 = r2.getString(r6)
            android.graphics.drawable.Drawable r2 = r1.f(r2)
        L_0x0184:
            r0.setImageDrawable(r2)
            if (r2 != 0) goto L_0x018f
            r6 = 8
            r0.setVisibility(r6)
            goto L_0x0198
        L_0x018f:
            r0.setVisibility(r4)
            r2.setVisible(r4, r4)
            r2.setVisible(r8, r4)
        L_0x0198:
            int r0 = r1.f808y
            if (r0 == r7) goto L_0x01ab
            if (r0 != r8) goto L_0x01a3
            r0 = r5 & 1
            if (r0 == 0) goto L_0x01a3
            goto L_0x01ab
        L_0x01a3:
            android.widget.ImageView r0 = r3.f814e
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x01c0
        L_0x01ab:
            android.widget.ImageView r0 = r3.f814e
            r0.setVisibility(r4)
            android.widget.ImageView r0 = r3.f814e
            android.widget.TextView r2 = r3.f810a
            java.lang.CharSequence r2 = r2.getText()
            r0.setTag(r2)
            android.widget.ImageView r0 = r3.f814e
            r0.setOnClickListener(r1)
        L_0x01c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.a1.a(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    public void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.A = cursor.getColumnIndex("suggest_text_1");
                this.B = cursor.getColumnIndex("suggest_text_2");
                this.C = cursor.getColumnIndex("suggest_text_2_url");
                this.D = cursor.getColumnIndex("suggest_icon_1");
                this.E = cursor.getColumnIndex("suggest_icon_2");
                this.F = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    public CharSequence c(Cursor cursor) {
        String h10;
        String h11;
        if (cursor == null) {
            return null;
        }
        String h12 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h12 != null) {
            return h12;
        }
        if (this.f804u.shouldRewriteQueryFromData() && (h11 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h11;
        }
        if (!this.f804u.shouldRewriteQueryFromText() || (h10 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h10;
    }

    public View d(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.f25337s.inflate(this.f25335i, viewGroup, false);
        inflate.setTag(new a(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f807x);
        return inflate;
    }

    public Drawable e(Uri uri) throws FileNotFoundException {
        int i10;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f805v.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i10 = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException(x0.a("Single path segment is not a resource ID: ", uri));
                        }
                    } else if (size == 2) {
                        i10 = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException(x0.a("More than two path segments: ", uri));
                    }
                    if (i10 != 0) {
                        return resourcesForApplication.getDrawable(i10);
                    }
                    throw new FileNotFoundException(x0.a("No resource found for: ", uri));
                }
                throw new FileNotFoundException(x0.a("No path: ", uri));
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException(x0.a("No package found for authority: ", uri));
            }
        } else {
            throw new FileNotFoundException(x0.a("No authority: ", uri));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:34|35|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a6, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r2);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0090 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable f(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "SuggestionsAdapter"
            r1 = 0
            if (r8 == 0) goto L_0x012c
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L_0x012c
            java.lang.String r2 = "0"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0015
            goto L_0x012c
        L_0x0015:
            int r2 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0063, NotFoundException -> 0x005d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0063, NotFoundException -> 0x005d }
            r3.<init>()     // Catch:{ NumberFormatException -> 0x0063, NotFoundException -> 0x005d }
            java.lang.String r4 = "android.resource://"
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x0063, NotFoundException -> 0x005d }
            android.content.Context r4 = r7.f805v     // Catch:{ NumberFormatException -> 0x0063, NotFoundException -> 0x005d }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NumberFormatException -> 0x0063, NotFoundException -> 0x005d }
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x0063, NotFoundException -> 0x005d }
            java.lang.String r4 = "/"
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x0063, NotFoundException -> 0x005d }
            r3.append(r2)     // Catch:{ NumberFormatException -> 0x0063, NotFoundException -> 0x005d }
            java.lang.String r3 = r3.toString()     // Catch:{ NumberFormatException -> 0x0063, NotFoundException -> 0x005d }
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r7.f806w     // Catch:{ NumberFormatException -> 0x0063, NotFoundException -> 0x005d }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ NumberFormatException -> 0x0063, NotFoundException -> 0x005d }
            android.graphics.drawable.Drawable$ConstantState r4 = (android.graphics.drawable.Drawable.ConstantState) r4     // Catch:{ NumberFormatException -> 0x0063, NotFoundException -> 0x005d }
            if (r4 != 0) goto L_0x0044
            r4 = r1
            goto L_0x0048
        L_0x0044:
            android.graphics.drawable.Drawable r4 = r4.newDrawable()     // Catch:{ NumberFormatException -> 0x0063, NotFoundException -> 0x005d }
        L_0x0048:
            if (r4 == 0) goto L_0x004b
            return r4
        L_0x004b:
            android.content.Context r4 = r7.f805v     // Catch:{ NumberFormatException -> 0x0063, NotFoundException -> 0x005d }
            android.graphics.drawable.Drawable r2 = d0.a.c(r4, r2)     // Catch:{ NumberFormatException -> 0x0063, NotFoundException -> 0x005d }
            if (r2 == 0) goto L_0x005c
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r7.f806w     // Catch:{ NumberFormatException -> 0x0063, NotFoundException -> 0x005d }
            android.graphics.drawable.Drawable$ConstantState r5 = r2.getConstantState()     // Catch:{ NumberFormatException -> 0x0063, NotFoundException -> 0x005d }
            r4.put(r3, r5)     // Catch:{ NumberFormatException -> 0x0063, NotFoundException -> 0x005d }
        L_0x005c:
            return r2
        L_0x005d:
            java.lang.String r2 = "Icon resource not found: "
            androidx.appcompat.widget.z0.a(r2, r8, r0)
            return r1
        L_0x0063:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r2 = r7.f806w
            java.lang.Object r2 = r2.get(r8)
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2
            if (r2 != 0) goto L_0x0070
            r2 = r1
            goto L_0x0074
        L_0x0070:
            android.graphics.drawable.Drawable r2 = r2.newDrawable()
        L_0x0074:
            if (r2 == 0) goto L_0x0077
            return r2
        L_0x0077:
            android.net.Uri r2 = android.net.Uri.parse(r8)
            java.lang.String r3 = "Error closing icon stream for "
            java.lang.String r4 = r2.getScheme()     // Catch:{ FileNotFoundException -> 0x0100 }
            java.lang.String r5 = "android.resource"
            boolean r4 = r5.equals(r4)     // Catch:{ FileNotFoundException -> 0x0100 }
            if (r4 == 0) goto L_0x00a7
            android.graphics.drawable.Drawable r0 = r7.e(r2)     // Catch:{ NotFoundException -> 0x0090 }
            r1 = r0
            goto L_0x0121
        L_0x0090:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0100 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0100 }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x0100 }
            java.lang.String r5 = "Resource does not exist: "
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x0100 }
            r4.append(r2)     // Catch:{ FileNotFoundException -> 0x0100 }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x0100 }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0100 }
            throw r3     // Catch:{ FileNotFoundException -> 0x0100 }
        L_0x00a7:
            android.content.Context r4 = r7.f805v     // Catch:{ FileNotFoundException -> 0x0100 }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0100 }
            java.io.InputStream r4 = r4.openInputStream(r2)     // Catch:{ FileNotFoundException -> 0x0100 }
            if (r4 == 0) goto L_0x00e9
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromStream(r4, r1)     // Catch:{ all -> 0x00d0 }
            r4.close()     // Catch:{ IOException -> 0x00bb }
            goto L_0x00ce
        L_0x00bb:
            r4 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0100 }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x0100 }
            r6.append(r3)     // Catch:{ FileNotFoundException -> 0x0100 }
            r6.append(r2)     // Catch:{ FileNotFoundException -> 0x0100 }
            java.lang.String r3 = r6.toString()     // Catch:{ FileNotFoundException -> 0x0100 }
            android.util.Log.e(r0, r3, r4)     // Catch:{ FileNotFoundException -> 0x0100 }
        L_0x00ce:
            r1 = r5
            goto L_0x0121
        L_0x00d0:
            r5 = move-exception
            r4.close()     // Catch:{ IOException -> 0x00d5 }
            goto L_0x00e8
        L_0x00d5:
            r4 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0100 }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x0100 }
            r6.append(r3)     // Catch:{ FileNotFoundException -> 0x0100 }
            r6.append(r2)     // Catch:{ FileNotFoundException -> 0x0100 }
            java.lang.String r3 = r6.toString()     // Catch:{ FileNotFoundException -> 0x0100 }
            android.util.Log.e(r0, r3, r4)     // Catch:{ FileNotFoundException -> 0x0100 }
        L_0x00e8:
            throw r5     // Catch:{ FileNotFoundException -> 0x0100 }
        L_0x00e9:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0100 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0100 }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x0100 }
            java.lang.String r5 = "Failed to open "
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x0100 }
            r4.append(r2)     // Catch:{ FileNotFoundException -> 0x0100 }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x0100 }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0100 }
            throw r3     // Catch:{ FileNotFoundException -> 0x0100 }
        L_0x0100:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Icon not found: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = ", "
            r4.append(r2)
            java.lang.String r2 = r3.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.util.Log.w(r0, r2)
        L_0x0121:
            if (r1 == 0) goto L_0x012c
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r7.f806w
            android.graphics.drawable.Drawable$ConstantState r2 = r1.getConstantState()
            r0.put(r8, r2)
        L_0x012c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.a1.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    public Cursor g(SearchableInfo searchableInfo, String str, int i10) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i10 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i10));
        }
        return this.f805v.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View inflate = this.f25337s.inflate(this.f25336r, viewGroup, false);
            if (inflate != null) {
                ((a) inflate.getTag()).f810a.setText(e10.toString());
            }
            return inflate;
        }
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View d10 = d(this.f805v, this.f25326c, viewGroup);
            ((a) d10.getTag()).f810a.setText(e10.toString());
            return d10;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f25326c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f25326c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f803t.s((CharSequence) tag);
        }
    }
}

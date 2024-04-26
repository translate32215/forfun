package androidx.leanback.widget.picker;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.leanback.widget.picker.a;
import i1.b;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

public class DatePicker extends i1.a {
    public static final int[] L = {5, 2, 1};
    public b A;
    public b B;
    public int C;
    public int D;
    public int E;
    public final DateFormat F = new SimpleDateFormat("MM/dd/yyyy");
    public a.C0030a G;
    public Calendar H;
    public Calendar I;
    public Calendar J;
    public Calendar K;

    /* renamed from: y  reason: collision with root package name */
    public String f2499y;

    /* renamed from: z  reason: collision with root package name */
    public b f2500z;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f2501a;

        public a(boolean z10) {
            this.f2501a = z10;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0094  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0096  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00b3  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00d3 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r13 = this;
                androidx.leanback.widget.picker.DatePicker r0 = androidx.leanback.widget.picker.DatePicker.this
                boolean r1 = r13.f2501a
                r2 = 3
                int[] r2 = new int[r2]
                int r3 = r0.D
                r4 = 0
                r2[r4] = r3
                int r3 = r0.C
                r5 = 1
                r2[r5] = r3
                int r3 = r0.E
                r6 = 2
                r2[r6] = r3
                int[] r3 = androidx.leanback.widget.picker.DatePicker.L
                int r3 = r3.length
                int r3 = r3 - r5
                r6 = 1
                r7 = 1
            L_0x001c:
                if (r3 < 0) goto L_0x00d7
                r8 = r2[r3]
                if (r8 >= 0) goto L_0x0024
                goto L_0x00d3
            L_0x0024:
                int[] r8 = androidx.leanback.widget.picker.DatePicker.L
                r8 = r8[r3]
                r9 = r2[r3]
                java.util.ArrayList<i1.b> r10 = r0.f19075d
                if (r10 != 0) goto L_0x0030
                r9 = 0
                goto L_0x0036
            L_0x0030:
                java.lang.Object r9 = r10.get(r9)
                i1.b r9 = (i1.b) r9
            L_0x0036:
                if (r6 == 0) goto L_0x0045
                java.util.Calendar r10 = r0.H
                int r10 = r10.get(r8)
                int r11 = r9.f19096b
                if (r10 == r11) goto L_0x0053
                r9.f19096b = r10
                goto L_0x0051
            L_0x0045:
                java.util.Calendar r10 = r0.J
                int r10 = r10.getActualMinimum(r8)
                int r11 = r9.f19096b
                if (r10 == r11) goto L_0x0053
                r9.f19096b = r10
            L_0x0051:
                r10 = 1
                goto L_0x0054
            L_0x0053:
                r10 = 0
            L_0x0054:
                r10 = r10 | r4
                if (r7 == 0) goto L_0x0064
                java.util.Calendar r11 = r0.I
                int r11 = r11.get(r8)
                int r12 = r9.f19097c
                if (r11 == r12) goto L_0x0072
                r9.f19097c = r11
                goto L_0x0070
            L_0x0064:
                java.util.Calendar r11 = r0.J
                int r11 = r11.getActualMaximum(r8)
                int r12 = r9.f19097c
                if (r11 == r12) goto L_0x0072
                r9.f19097c = r11
            L_0x0070:
                r11 = 1
                goto L_0x0073
            L_0x0072:
                r11 = 0
            L_0x0073:
                r10 = r10 | r11
                java.util.Calendar r11 = r0.J
                int r11 = r11.get(r8)
                java.util.Calendar r12 = r0.H
                int r12 = r12.get(r8)
                if (r11 != r12) goto L_0x0084
                r11 = 1
                goto L_0x0085
            L_0x0084:
                r11 = 0
            L_0x0085:
                r6 = r6 & r11
                java.util.Calendar r11 = r0.J
                int r11 = r11.get(r8)
                java.util.Calendar r12 = r0.I
                int r12 = r12.get(r8)
                if (r11 != r12) goto L_0x0096
                r11 = 1
                goto L_0x0097
            L_0x0096:
                r11 = 0
            L_0x0097:
                r7 = r7 & r11
                if (r10 == 0) goto L_0x009f
                r10 = r2[r3]
                r0.b(r10, r9)
            L_0x009f:
                r9 = r2[r3]
                java.util.Calendar r10 = r0.J
                int r8 = r10.get(r8)
                java.util.ArrayList<i1.b> r10 = r0.f19075d
                java.lang.Object r10 = r10.get(r9)
                i1.b r10 = (i1.b) r10
                int r11 = r10.f19095a
                if (r11 == r8) goto L_0x00d3
                r10.f19095a = r8
                java.util.List<androidx.leanback.widget.VerticalGridView> r10 = r0.f19074c
                java.lang.Object r10 = r10.get(r9)
                androidx.leanback.widget.VerticalGridView r10 = (androidx.leanback.widget.VerticalGridView) r10
                if (r10 == 0) goto L_0x00d3
                java.util.ArrayList<i1.b> r11 = r0.f19075d
                java.lang.Object r9 = r11.get(r9)
                i1.b r9 = (i1.b) r9
                int r9 = r9.f19096b
                int r8 = r8 - r9
                if (r1 == 0) goto L_0x00d0
                r10.setSelectedPositionSmooth(r8)
                goto L_0x00d3
            L_0x00d0:
                r10.setSelectedPosition(r8)
            L_0x00d3:
                int r3 = r3 + -1
                goto L_0x001c
            L_0x00d7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.picker.DatePicker.a.run():void");
        }
    }

    public DatePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Locale locale = Locale.getDefault();
        getContext().getResources();
        boolean z10 = a.f2503a;
        this.G = new a.C0030a(locale);
        this.K = a.a(this.K, locale);
        this.H = a.a(this.H, this.G.f2504a);
        this.I = a.a(this.I, this.G.f2504a);
        this.J = a.a(this.J, this.G.f2504a);
        b bVar = this.f2500z;
        if (bVar != null) {
            bVar.f19098d = this.G.f2505b;
            b(this.C, bVar);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e1.a.f13533g);
        String string = obtainStyledAttributes.getString(0);
        String string2 = obtainStyledAttributes.getString(1);
        this.K.clear();
        if (TextUtils.isEmpty(string)) {
            this.K.set(1900, 0, 1);
        } else if (!h(string, this.K)) {
            this.K.set(1900, 0, 1);
        }
        this.H.setTimeInMillis(this.K.getTimeInMillis());
        this.K.clear();
        if (TextUtils.isEmpty(string2)) {
            this.K.set(2100, 0, 1);
        } else if (!h(string2, this.K)) {
            this.K.set(2100, 0, 1);
        }
        this.I.setTimeInMillis(this.K.getTimeInMillis());
        String string3 = obtainStyledAttributes.getString(2);
        setDatePickerFormat(TextUtils.isEmpty(string3) ? new String(android.text.format.DateFormat.getDateFormatOrder(context)) : string3);
    }

    public final void a(int i10, int i11) {
        b bVar;
        this.K.setTimeInMillis(this.J.getTimeInMillis());
        ArrayList<b> arrayList = this.f19075d;
        if (arrayList == null) {
            bVar = null;
        } else {
            bVar = arrayList.get(i10);
        }
        int i12 = bVar.f19095a;
        if (i10 == this.D) {
            this.K.add(5, i11 - i12);
        } else if (i10 == this.C) {
            this.K.add(2, i11 - i12);
        } else if (i10 == this.E) {
            this.K.add(1, i11 - i12);
        } else {
            throw new IllegalArgumentException();
        }
        this.J.set(this.K.get(1), this.K.get(2), this.K.get(5));
        if (this.J.before(this.H)) {
            this.J.setTimeInMillis(this.H.getTimeInMillis());
        } else if (this.J.after(this.I)) {
            this.J.setTimeInMillis(this.I.getTimeInMillis());
        }
        i(false);
    }

    public long getDate() {
        return this.J.getTimeInMillis();
    }

    public String getDatePickerFormat() {
        return this.f2499y;
    }

    public long getMaxDate() {
        return this.I.getTimeInMillis();
    }

    public long getMinDate() {
        return this.H.getTimeInMillis();
    }

    public final boolean h(String str, Calendar calendar) {
        try {
            calendar.setTime(this.F.parse(str));
            return true;
        } catch (ParseException unused) {
            Log.w("DatePicker", "Date: " + str + " not in format: " + "MM/dd/yyyy");
            return false;
        }
    }

    public final void i(boolean z10) {
        post(new a(z10));
    }

    public void setDatePickerFormat(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str = new String(android.text.format.DateFormat.getDateFormatOrder(getContext()));
        }
        if (!TextUtils.equals(this.f2499y, str)) {
            this.f2499y = str;
            String str3 = "MM/dd/yyyy";
            if (a.f2503a) {
                str2 = android.text.format.DateFormat.getBestDateTimePattern(this.G.f2504a, str);
            } else {
                DateFormat dateFormat = android.text.format.DateFormat.getDateFormat(getContext());
                str2 = dateFormat instanceof SimpleDateFormat ? ((SimpleDateFormat) dateFormat).toLocalizedPattern() : str3;
            }
            if (!TextUtils.isEmpty(str2)) {
                str3 = str2;
            }
            ArrayList arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            char[] cArr = {'Y', 'y', 'M', 'm', 'D', 'd'};
            int i10 = 0;
            boolean z10 = false;
            char c10 = 0;
            while (true) {
                boolean z11 = true;
                if (i10 >= str3.length()) {
                    break;
                }
                char charAt = str3.charAt(i10);
                if (charAt != ' ') {
                    if (charAt != '\'') {
                        if (z10) {
                            sb2.append(charAt);
                        } else {
                            int i11 = 0;
                            while (true) {
                                if (i11 >= 6) {
                                    z11 = false;
                                    break;
                                } else if (charAt == cArr[i11]) {
                                    break;
                                } else {
                                    i11++;
                                }
                            }
                            if (!z11) {
                                sb2.append(charAt);
                            } else if (charAt != c10) {
                                arrayList.add(sb2.toString());
                                sb2.setLength(0);
                            }
                        }
                        c10 = charAt;
                    } else if (!z10) {
                        sb2.setLength(0);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                i10++;
            }
            arrayList.add(sb2.toString());
            if (arrayList.size() == str.length() + 1) {
                setSeparators(arrayList);
                this.A = null;
                this.f2500z = null;
                this.B = null;
                this.C = -1;
                this.D = -1;
                this.E = -1;
                String upperCase = str.toUpperCase();
                ArrayList arrayList2 = new ArrayList(3);
                for (int i12 = 0; i12 < upperCase.length(); i12++) {
                    char charAt2 = upperCase.charAt(i12);
                    if (charAt2 != 'D') {
                        if (charAt2 != 'M') {
                            if (charAt2 != 'Y') {
                                throw new IllegalArgumentException("datePicker format error");
                            } else if (this.B == null) {
                                b bVar = new b();
                                this.B = bVar;
                                arrayList2.add(bVar);
                                this.E = i12;
                                this.B.f19099e = "%d";
                            } else {
                                throw new IllegalArgumentException("datePicker format error");
                            }
                        } else if (this.f2500z == null) {
                            b bVar2 = new b();
                            this.f2500z = bVar2;
                            arrayList2.add(bVar2);
                            this.f2500z.f19098d = this.G.f2505b;
                            this.C = i12;
                        } else {
                            throw new IllegalArgumentException("datePicker format error");
                        }
                    } else if (this.A == null) {
                        b bVar3 = new b();
                        this.A = bVar3;
                        arrayList2.add(bVar3);
                        this.A.f19099e = "%02d";
                        this.D = i12;
                    } else {
                        throw new IllegalArgumentException("datePicker format error");
                    }
                }
                setColumns(arrayList2);
                i(false);
                return;
            }
            StringBuilder a10 = android.support.v4.media.a.a("Separators size: ");
            a10.append(arrayList.size());
            a10.append(" must equal");
            a10.append(" the size of datePickerFormat: ");
            a10.append(str.length());
            a10.append(" + 1");
            throw new IllegalStateException(a10.toString());
        }
    }

    public void setMaxDate(long j10) {
        this.K.setTimeInMillis(j10);
        if (this.K.get(1) != this.I.get(1) || this.K.get(6) == this.I.get(6)) {
            this.I.setTimeInMillis(j10);
            if (this.J.after(this.I)) {
                this.J.setTimeInMillis(this.I.getTimeInMillis());
            }
            i(false);
        }
    }

    public void setMinDate(long j10) {
        this.K.setTimeInMillis(j10);
        if (this.K.get(1) != this.H.get(1) || this.K.get(6) == this.H.get(6)) {
            this.H.setTimeInMillis(j10);
            if (this.J.before(this.H)) {
                this.J.setTimeInMillis(this.H.getTimeInMillis());
            }
            i(false);
        }
    }
}

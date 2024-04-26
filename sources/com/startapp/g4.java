package com.startapp;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.View;
import androidx.activity.e;
import com.startapp.sdk.ads.list3d.List3DActivity;
import com.startapp.sdk.ads.list3d.List3DView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: Sta */
public class g4 {

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, j9> f10427a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public Hashtable<String, Bitmap> f10428b = new Hashtable<>();

    /* renamed from: c  reason: collision with root package name */
    public Set<String> f10429c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    public r7 f10430d;

    /* renamed from: e  reason: collision with root package name */
    public int f10431e = 0;

    /* renamed from: f  reason: collision with root package name */
    public ConcurrentLinkedQueue<b> f10432f = new ConcurrentLinkedQueue<>();

    /* compiled from: Sta */
    public class a extends AsyncTask<Void, Void, Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        public int f10433a = -1;

        /* renamed from: b  reason: collision with root package name */
        public String f10434b;

        /* renamed from: c  reason: collision with root package name */
        public String f10435c;

        public a(int i10, String str, String str2) {
            this.f10433a = i10;
            this.f10434b = str;
            this.f10435c = str2;
        }

        public Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            return g1.b(this.f10435c);
        }

        public void onPostExecute(Object obj) {
            List<w5> list;
            Bitmap bitmap = (Bitmap) obj;
            g4 g4Var = g4.this;
            boolean z10 = true;
            g4Var.f10431e--;
            if (bitmap != null) {
                g4Var.f10428b.put(this.f10434b, bitmap);
                r7 r7Var = g4.this.f10430d;
                if (r7Var != null) {
                    int i10 = this.f10433a;
                    List3DActivity list3DActivity = (List3DActivity) r7Var;
                    List3DView list3DView = list3DActivity.f11815a;
                    View childAt = list3DView.getChildAt(i10 - list3DView.f11837i);
                    if (childAt != null) {
                        x5 x5Var = (x5) childAt.getTag();
                        y5 a10 = z5.f12916b.a(list3DActivity.f11820f);
                        if (!(a10 == null || (list = a10.f12876b) == null || i10 >= list.size())) {
                            w5 w5Var = a10.f12876b.get(i10);
                            x5Var.f12791b.setImageBitmap(a10.f12875a.a(i10, w5Var.f12743a, w5Var.f12751i));
                            x5Var.f12791b.requestLayout();
                            if (w5Var.f12756n == null) {
                                z10 = false;
                            }
                            x5Var.a(z10);
                        }
                    }
                }
                g4 g4Var2 = g4.this;
                if (!g4Var2.f10432f.isEmpty()) {
                    b poll = g4Var2.f10432f.poll();
                    new a(poll.f10437a, poll.f10438b, poll.f10439c).execute(new Void[0]);
                }
            }
        }
    }

    /* compiled from: Sta */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f10437a;

        /* renamed from: b  reason: collision with root package name */
        public String f10438b;

        /* renamed from: c  reason: collision with root package name */
        public String f10439c;

        public b(g4 g4Var, int i10, String str, String str2) {
            this.f10437a = i10;
            this.f10438b = str;
            this.f10439c = str2;
        }
    }

    public final String a(String[] strArr, String str) {
        if (strArr != null) {
            return e.a(new StringBuilder(), TextUtils.join("^", strArr), str);
        }
        return null;
    }

    public Bitmap a(int i10, String str, String str2) {
        Bitmap bitmap = this.f10428b.get(str);
        if (bitmap != null) {
            return bitmap;
        }
        if (this.f10429c.contains(str)) {
            return null;
        }
        this.f10429c.add(str);
        int i11 = this.f10431e;
        if (i11 >= 15) {
            this.f10432f.add(new b(this, i10, str, str2));
            return null;
        }
        this.f10431e = i11 + 1;
        new a(i10, str, str2).execute(new Void[0]);
        return null;
    }
}

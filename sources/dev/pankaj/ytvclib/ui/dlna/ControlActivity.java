package dev.pankaj.ytvclib.ui.dlna;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.Toast;
import androidx.activity.c;
import com.startapp.startappsdk.R;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ld.h;
import ud.t;
import wc.d;
import wc.e;
import wc.g;
import wc.j;
import wc.k;
import wc.l;
import ze.f;

/* compiled from: ControlActivity.kt */
public final class ControlActivity extends vc.a<tc.a> implements View.OnClickListener {
    public static final /* synthetic */ int R = 0;
    public int I;
    public String J = "";
    public int K;
    public final k L = new l();
    public f M;
    public boolean N = true;
    public final String O = "NOT_IMPLEMENTED";
    public final Runnable P = new c(this);
    public final Handler Q = new Handler();

    /* compiled from: ControlActivity.kt */
    public static final class a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ControlActivity f13429a;

        public a(ControlActivity controlActivity) {
            this.f13429a = controlActivity;
        }

        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            ud.k.f(seekBar, "seekBar");
            ControlActivity.O(this.f13429a).A.setText(this.f13429a.S(i10));
            if (z10) {
                ControlActivity controlActivity = this.f13429a;
                controlActivity.Q.removeCallbacks(controlActivity.P);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            ud.k.f(seekBar, "seekBar");
            ControlActivity controlActivity = this.f13429a;
            controlActivity.Q.removeCallbacks(controlActivity.P);
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            ud.k.f(seekBar, "seekBar");
            ControlActivity controlActivity = this.f13429a;
            controlActivity.Q.postDelayed(controlActivity.P, 1000);
            String S = this.f13429a.S(seekBar.getProgress());
            if (S != null) {
                ControlActivity controlActivity2 = this.f13429a;
                synchronized (controlActivity2) {
                    new g(controlActivity2, S).start();
                }
            }
        }
    }

    /* compiled from: ControlActivity.kt */
    public static final class b extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ControlActivity f13430a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ t f13431b;

        public b(ControlActivity controlActivity, t tVar) {
            this.f13430a = controlActivity;
            this.f13431b = tVar;
        }

        public void run() {
            k kVar = this.f13430a.L;
            ud.k.c(kVar);
            if (kVar.d(this.f13430a.M, this.f13431b.f26196a)) {
                ud.k.f(ud.k.j("set setVoice: ", Integer.valueOf(this.f13431b.f26196a)), "msg");
                this.f13430a.I = this.f13431b.f26196a;
            }
        }
    }

    public ControlActivity() {
        super(R.layout.activity_control);
    }

    public static final /* synthetic */ tc.a O(ControlActivity controlActivity) {
        return (tc.a) controlActivity.L();
    }

    public static final void P(ControlActivity controlActivity, boolean z10) {
        controlActivity.N = z10;
        if (z10) {
            ImageButton imageButton = ((tc.a) controlActivity.L()).f25892z;
            ud.k.e(imageButton, "binding.play");
            imageButton.setVisibility(8);
            ImageButton imageButton2 = ((tc.a) controlActivity.L()).f25891y;
            ud.k.e(imageButton2, "binding.pause");
            androidx.activity.k.c(imageButton2);
            controlActivity.Q.postDelayed(controlActivity.P, 1000);
            return;
        }
        ImageButton imageButton3 = ((tc.a) controlActivity.L()).f25891y;
        ud.k.e(imageButton3, "binding.pause");
        imageButton3.setVisibility(8);
        ImageButton imageButton4 = ((tc.a) controlActivity.L()).f25892z;
        ud.k.e(imageButton4, "binding.play");
        androidx.activity.k.c(imageButton4);
        controlActivity.Q.removeCallbacks(controlActivity.P);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void Q(boolean r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            androidx.databinding.ViewDataBinding r0 = r1.L()     // Catch:{ all -> 0x0049 }
            tc.a r0 = (tc.a) r0     // Catch:{ all -> 0x0049 }
            android.widget.TextView r0 = r0.A     // Catch:{ all -> 0x0049 }
            java.lang.CharSequence r0 = r0.getText()     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0049 }
            if (r2 == 0) goto L_0x001f
            int r2 = r1.R(r0)     // Catch:{ all -> 0x0049 }
            int r2 = r2 + 10
            int r0 = r1.K     // Catch:{ all -> 0x0049 }
            if (r2 <= r0) goto L_0x0028
            r2 = r0
            goto L_0x0028
        L_0x001f:
            int r2 = r1.R(r0)     // Catch:{ all -> 0x0049 }
            int r2 = r2 + -10
            if (r2 >= 0) goto L_0x0028
            r2 = 0
        L_0x0028:
            androidx.databinding.ViewDataBinding r0 = r1.L()     // Catch:{ all -> 0x0049 }
            tc.a r0 = (tc.a) r0     // Catch:{ all -> 0x0049 }
            android.widget.SeekBar r0 = r0.B     // Catch:{ all -> 0x0049 }
            r0.setProgress(r2)     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = r1.S(r2)     // Catch:{ all -> 0x0049 }
            if (r2 != 0) goto L_0x003a
            goto L_0x0044
        L_0x003a:
            monitor-enter(r1)     // Catch:{ all -> 0x0049 }
            wc.g r0 = new wc.g     // Catch:{ all -> 0x0046 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0046 }
            r0.start()     // Catch:{ all -> 0x0046 }
            monitor-exit(r1)     // Catch:{ all -> 0x0049 }
        L_0x0044:
            monitor-exit(r1)
            return
        L_0x0046:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0049 }
            throw r2     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.pankaj.ytvclib.ui.dlna.ControlActivity.Q(boolean):void");
    }

    public final int R(String str) {
        List list;
        int i10;
        int i11;
        if (str.length() == 0) {
            return 0;
        }
        ud.k.f(":", "pattern");
        Pattern compile = Pattern.compile(":");
        ud.k.e(compile, "compile(pattern)");
        ud.k.f(compile, "nativePattern");
        ud.k.f(str, "input");
        ce.k.r(0);
        Matcher matcher = compile.matcher(str);
        if (!matcher.find()) {
            list = h.c(str.toString());
        } else {
            ArrayList arrayList = new ArrayList(10);
            int i12 = 0 - 1;
            int i13 = 0;
            do {
                arrayList.add(str.subSequence(i13, matcher.start()).toString());
                i13 = matcher.end();
                if ((i12 >= 0 && arrayList.size() == i12) || !matcher.find()) {
                    arrayList.add(str.subSequence(i13, str.length()).toString());
                    list = arrayList;
                }
                arrayList.add(str.subSequence(i13, matcher.start()).toString());
                i13 = matcher.end();
                break;
            } while (!matcher.find());
            arrayList.add(str.subSequence(i13, str.length()).toString());
            list = arrayList;
        }
        Object[] array = list.toArray(new String[0]);
        ud.k.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        try {
            if (strArr.length == 3) {
                i11 = 0 + (Integer.parseInt(strArr[0]) * 60 * 60) + (Integer.parseInt(strArr[1]) * 60);
                i10 = Integer.parseInt(strArr[2]);
            } else if (strArr.length != 2) {
                return 0;
            } else {
                i11 = 0 + (Integer.parseInt(strArr[0]) * 60);
                i10 = Integer.parseInt(strArr[1]);
            }
            return i11 + i10;
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public final String S(int i10) {
        if (i10 <= 0) {
            return "00:00:00";
        }
        int i11 = i10 / 60;
        if (i11 < 60) {
            StringBuilder a10 = android.support.v4.media.a.a("00:");
            a10.append(U(i11));
            a10.append(':');
            a10.append(U(i10 % 60));
            return a10.toString();
        }
        int i12 = i11 / 60;
        if (i12 > 99) {
            return "99:59:59";
        }
        int i13 = i11 % 60;
        return U(i12) + ':' + U(i13) + ':' + U((i10 - (i12 * 3600)) - (i13 * 60));
    }

    public final synchronized void T(int i10) {
        t tVar = new t();
        tVar.f26196a = i10;
        if (i10 > 100) {
            tVar.f26196a = 100;
        } else if (i10 < 0) {
            tVar.f26196a = 0;
        }
        new b(this, tVar).start();
    }

    public final String U(int i10) {
        boolean z10 = true;
        if (i10 >= 0 && i10 < 10) {
            return ud.k.j("0", Integer.valueOf(i10));
        }
        if (10 > i10 || i10 >= 61) {
            z10 = false;
        }
        return z10 ? ud.k.j("", Integer.valueOf(i10)) : "00";
    }

    public void onClick(View view) {
        if (ud.k.a(view, ((tc.a) L()).f25892z)) {
            String obj = ce.k.t(((tc.a) L()).A.getText().toString()).toString();
            synchronized (this) {
                new d(this, obj).start();
            }
        } else if (ud.k.a(view, ((tc.a) L()).f25891y)) {
            synchronized (this) {
                new e(this).start();
            }
        } else if (ud.k.a(view, ((tc.a) L()).C)) {
            Q(false);
        } else if (ud.k.a(view, ((tc.a) L()).f25890x)) {
            Q(true);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j jVar = j.f27200c;
        this.M = j.f27201d.f27203b;
        Bundle extras = getIntent().getExtras();
        String string = extras == null ? null : extras.getString("channel");
        if (string == null && this.L == null && this.M == null) {
            Toast.makeText(getApplicationContext(), R.string.error_message, 0).show();
            finish();
        }
        ud.k.c(string);
        this.J = string;
        ((tc.a) L()).f25892z.setOnClickListener(this);
        ((tc.a) L()).f25891y.setOnClickListener(this);
        ((tc.a) L()).C.setOnClickListener(this);
        ((tc.a) L()).f25890x.setOnClickListener(this);
        ((tc.a) L()).B.setOnSeekBarChangeListener(new a(this));
        synchronized (this) {
            new wc.f(this).start();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        synchronized (this) {
            this.Q.removeCallbacks(this.P);
            new wc.h(this).start();
        }
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 24) {
            T(this.I + 5);
            return true;
        } else if (i10 != 25) {
            return super.onKeyDown(i10, keyEvent);
        } else {
            T(this.I - 5);
            return true;
        }
    }

    public void onPause() {
        super.onPause();
        this.Q.removeCallbacks(this.P);
    }

    public void onResume() {
        super.onResume();
        if (this.N) {
            this.Q.postDelayed(this.P, 1000);
        }
    }

    public void onStart() {
        super.onStart();
        synchronized (this) {
            new wc.b(this).start();
        }
    }
}

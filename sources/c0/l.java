package c0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import com.startapp.startappsdk.R;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* compiled from: NotificationCompat */
public class l {

    /* compiled from: NotificationCompat */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Bundle f3953a;

        /* renamed from: b  reason: collision with root package name */
        public IconCompat f3954b;

        /* renamed from: c  reason: collision with root package name */
        public final s[] f3955c;

        /* renamed from: d  reason: collision with root package name */
        public final s[] f3956d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3957e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f3958f;

        /* renamed from: g  reason: collision with root package name */
        public final int f3959g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f3960h;
        @Deprecated

        /* renamed from: i  reason: collision with root package name */
        public int f3961i;

        /* renamed from: j  reason: collision with root package name */
        public CharSequence f3962j;

        /* renamed from: k  reason: collision with root package name */
        public PendingIntent f3963k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f3964l;

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            IconCompat b10 = i10 == 0 ? null : IconCompat.b((Resources) null, "", i10);
            Bundle bundle = new Bundle();
            this.f3958f = true;
            this.f3954b = b10;
            if (b10 != null && b10.e() == 2) {
                this.f3961i = b10.d();
            }
            this.f3962j = d.b(charSequence);
            this.f3963k = pendingIntent;
            this.f3953a = bundle;
            this.f3955c = null;
            this.f3956d = null;
            this.f3957e = true;
            this.f3959g = 0;
            this.f3958f = true;
            this.f3960h = false;
            this.f3964l = false;
        }

        public IconCompat a() {
            int i10;
            if (this.f3954b == null && (i10 = this.f3961i) != 0) {
                this.f3954b = IconCompat.b((Resources) null, "", i10);
            }
            return this.f3954b;
        }
    }

    /* compiled from: NotificationCompat */
    public static class b extends e {

        /* renamed from: b  reason: collision with root package name */
        public IconCompat f3965b;

        /* renamed from: c  reason: collision with root package name */
        public IconCompat f3966c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3967d;

        /* compiled from: NotificationCompat */
        public static class a {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }
        }

        /* renamed from: c0.l$b$b  reason: collision with other inner class name */
        /* compiled from: NotificationCompat */
        public static class C0056b {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* compiled from: NotificationCompat */
        public static class c {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        public void b(k kVar) {
            int i10 = Build.VERSION.SDK_INT;
            m mVar = (m) kVar;
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(mVar.f3992b).setBigContentTitle((CharSequence) null);
            IconCompat iconCompat = this.f3965b;
            if (iconCompat != null) {
                if (i10 >= 31) {
                    c.a(bigContentTitle, iconCompat.h(mVar.f3991a));
                } else if (iconCompat.e() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f3965b.c());
                }
            }
            if (this.f3967d) {
                IconCompat iconCompat2 = this.f3966c;
                if (iconCompat2 == null) {
                    a.a(bigContentTitle, (Bitmap) null);
                } else if (i10 >= 23) {
                    C0056b.a(bigContentTitle, iconCompat2.h(mVar.f3991a));
                } else if (iconCompat2.e() == 1) {
                    a.a(bigContentTitle, this.f3966c.c());
                } else {
                    a.a(bigContentTitle, (Bitmap) null);
                }
            }
            if (i10 >= 31) {
                c.c(bigContentTitle, false);
                c.b(bigContentTitle, (CharSequence) null);
            }
        }

        public String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b d(Bitmap bitmap) {
            this.f3966c = null;
            this.f3967d = true;
            return this;
        }

        public b e(Bitmap bitmap) {
            IconCompat iconCompat;
            if (bitmap == null) {
                iconCompat = null;
            } else {
                PorterDuff.Mode mode = IconCompat.f1409k;
                IconCompat iconCompat2 = new IconCompat(1);
                iconCompat2.f1411b = bitmap;
                iconCompat = iconCompat2;
            }
            this.f3965b = iconCompat;
            return this;
        }
    }

    /* compiled from: NotificationCompat */
    public static class c extends e {

        /* renamed from: b  reason: collision with root package name */
        public CharSequence f3968b;

        public void a(Bundle bundle) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.f3968b);
            }
        }

        public void b(k kVar) {
            new Notification.BigTextStyle(((m) kVar).f3992b).setBigContentTitle((CharSequence) null).bigText(this.f3968b);
        }

        public String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c d(CharSequence charSequence) {
            this.f3968b = d.b(charSequence);
            return this;
        }
    }

    /* compiled from: NotificationCompat */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public Context f3969a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f3970b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<q> f3971c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<a> f3972d = new ArrayList<>();

        /* renamed from: e  reason: collision with root package name */
        public CharSequence f3973e;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f3974f;

        /* renamed from: g  reason: collision with root package name */
        public PendingIntent f3975g;

        /* renamed from: h  reason: collision with root package name */
        public Bitmap f3976h;

        /* renamed from: i  reason: collision with root package name */
        public int f3977i;

        /* renamed from: j  reason: collision with root package name */
        public int f3978j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f3979k = true;

        /* renamed from: l  reason: collision with root package name */
        public e f3980l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f3981m = false;

        /* renamed from: n  reason: collision with root package name */
        public String f3982n;

        /* renamed from: o  reason: collision with root package name */
        public Bundle f3983o;

        /* renamed from: p  reason: collision with root package name */
        public int f3984p = 0;

        /* renamed from: q  reason: collision with root package name */
        public int f3985q = 0;

        /* renamed from: r  reason: collision with root package name */
        public String f3986r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f3987s;

        /* renamed from: t  reason: collision with root package name */
        public Notification f3988t;
        @Deprecated

        /* renamed from: u  reason: collision with root package name */
        public ArrayList<String> f3989u;

        public d(Context context, String str) {
            Notification notification = new Notification();
            this.f3988t = notification;
            this.f3969a = context;
            this.f3986r = str;
            notification.when = System.currentTimeMillis();
            this.f3988t.audioStreamType = -1;
            this.f3978j = 0;
            this.f3989u = new ArrayList<>();
            this.f3987s = true;
        }

        public static CharSequence b(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public Notification a() {
            Notification notification;
            Bundle a10;
            m mVar = new m(this);
            e eVar = mVar.f3993c.f3980l;
            if (eVar != null) {
                eVar.b(mVar);
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                notification = mVar.f3992b.build();
            } else if (i10 >= 24) {
                notification = mVar.f3992b.build();
            } else if (i10 >= 21) {
                mVar.f3992b.setExtras(mVar.f3995e);
                notification = mVar.f3992b.build();
            } else if (i10 >= 20) {
                mVar.f3992b.setExtras(mVar.f3995e);
                notification = mVar.f3992b.build();
            } else if (i10 >= 19) {
                SparseArray<Bundle> a11 = n.a(mVar.f3994d);
                if (a11 != null) {
                    mVar.f3995e.putSparseParcelableArray("android.support.actionExtras", a11);
                }
                mVar.f3992b.setExtras(mVar.f3995e);
                notification = mVar.f3992b.build();
            } else {
                notification = mVar.f3992b.build();
                Bundle a12 = l.a(notification);
                Bundle bundle = new Bundle(mVar.f3995e);
                for (String str : mVar.f3995e.keySet()) {
                    if (a12.containsKey(str)) {
                        bundle.remove(str);
                    }
                }
                a12.putAll(bundle);
                SparseArray<Bundle> a13 = n.a(mVar.f3994d);
                if (a13 != null) {
                    l.a(notification).putSparseParcelableArray("android.support.actionExtras", a13);
                }
            }
            mVar.f3993c.getClass();
            if (Build.VERSION.SDK_INT >= 21 && eVar != null) {
                mVar.f3993c.f3980l.getClass();
            }
            if (!(eVar == null || (a10 = l.a(notification)) == null)) {
                eVar.a(a10);
            }
            return notification;
        }

        public d c(boolean z10) {
            if (z10) {
                this.f3988t.flags |= 16;
            } else {
                this.f3988t.flags &= -17;
            }
            return this;
        }

        public d d(CharSequence charSequence) {
            this.f3974f = b(charSequence);
            return this;
        }

        public d e(CharSequence charSequence) {
            this.f3973e = b(charSequence);
            return this;
        }

        public d f(Bitmap bitmap) {
            if (bitmap != null && Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f3969a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double d10 = (double) dimensionPixelSize;
                    double max = (double) Math.max(1, bitmap.getWidth());
                    Double.isNaN(d10);
                    Double.isNaN(max);
                    Double.isNaN(d10);
                    Double.isNaN(max);
                    double d11 = d10 / max;
                    double d12 = (double) dimensionPixelSize2;
                    double max2 = (double) Math.max(1, bitmap.getHeight());
                    Double.isNaN(d12);
                    Double.isNaN(max2);
                    Double.isNaN(d12);
                    Double.isNaN(max2);
                    double min = Math.min(d11, d12 / max2);
                    double width = (double) bitmap.getWidth();
                    Double.isNaN(width);
                    Double.isNaN(width);
                    double height = (double) bitmap.getHeight();
                    Double.isNaN(height);
                    Double.isNaN(height);
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(width * min), (int) Math.ceil(height * min), true);
                }
            }
            this.f3976h = bitmap;
            return this;
        }

        public d g(Uri uri) {
            Notification notification = this.f3988t;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        public d h(e eVar) {
            if (this.f3980l != eVar) {
                this.f3980l = eVar;
                if (eVar.f3990a != this) {
                    eVar.f3990a = this;
                    h(eVar);
                }
            }
            return this;
        }
    }

    /* compiled from: NotificationCompat */
    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        public d f3990a;

        public void a(Bundle bundle) {
            String c10 = c();
            if (c10 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c10);
            }
        }

        public abstract void b(k kVar);

        public abstract String c();
    }

    public static Bundle a(Notification notification) {
        Bundle bundle;
        if (Build.VERSION.SDK_INT >= 19) {
            return notification.extras;
        }
        synchronized (n.f3996a) {
            bundle = null;
            if (!n.f3998c) {
                try {
                    if (n.f3997b == null) {
                        Field declaredField = Notification.class.getDeclaredField("extras");
                        if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                            Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                            n.f3998c = true;
                        } else {
                            declaredField.setAccessible(true);
                            n.f3997b = declaredField;
                        }
                    }
                    Bundle bundle2 = (Bundle) n.f3997b.get(notification);
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                        n.f3997b.set(notification, bundle2);
                    }
                    bundle = bundle2;
                } catch (IllegalAccessException e10) {
                    Log.e("NotificationCompat", "Unable to access notification extras", e10);
                    n.f3998c = true;
                    return bundle;
                } catch (NoSuchFieldException e11) {
                    Log.e("NotificationCompat", "Unable to access notification extras", e11);
                    n.f3998c = true;
                    return bundle;
                }
            }
        }
        return bundle;
    }
}

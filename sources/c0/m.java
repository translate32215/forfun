package c0;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.a;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import c0.l;
import c0.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s.c;

/* compiled from: NotificationCompatBuilder */
public class m implements k {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3991a;

    /* renamed from: b  reason: collision with root package name */
    public final Notification.Builder f3992b;

    /* renamed from: c  reason: collision with root package name */
    public final l.d f3993c;

    /* renamed from: d  reason: collision with root package name */
    public final List<Bundle> f3994d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f3995e = new Bundle();

    public m(l.d dVar) {
        List<String> list;
        Bundle bundle;
        List<String> a10;
        Notification.Action.Builder builder;
        Bundle bundle2;
        l.d dVar2 = dVar;
        this.f3993c = dVar2;
        this.f3991a = dVar2.f3969a;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            this.f3992b = new Notification.Builder(dVar2.f3969a, dVar2.f3986r);
        } else {
            this.f3992b = new Notification.Builder(dVar2.f3969a);
        }
        Notification notification = dVar2.f3988t;
        this.f3992b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, (RemoteViews) null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar2.f3973e).setContentText(dVar2.f3974f).setContentInfo((CharSequence) null).setContentIntent(dVar2.f3975g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent((PendingIntent) null, (notification.flags & 128) != 0).setLargeIcon(dVar2.f3976h).setNumber(dVar2.f3977i).setProgress(0, 0, false);
        if (i10 < 21) {
            this.f3992b.setSound(notification.sound, notification.audioStreamType);
        }
        this.f3992b.setSubText((CharSequence) null).setUsesChronometer(false).setPriority(dVar2.f3978j);
        Iterator<l.a> it = dVar2.f3970b.iterator();
        while (it.hasNext()) {
            l.a next = it.next();
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 20) {
                IconCompat a11 = next.a();
                if (i11 >= 23) {
                    builder = new Notification.Action.Builder(a11 != null ? a11.g() : null, next.f3962j, next.f3963k);
                } else {
                    builder = new Notification.Action.Builder(a11 != null ? a11.d() : 0, next.f3962j, next.f3963k);
                }
                s[] sVarArr = next.f3955c;
                if (sVarArr != null) {
                    int length = sVarArr.length;
                    RemoteInput[] remoteInputArr = new RemoteInput[length];
                    if (sVarArr.length <= 0) {
                        for (int i12 = 0; i12 < length; i12++) {
                            builder.addRemoteInput(remoteInputArr[i12]);
                        }
                    } else {
                        s sVar = sVarArr[0];
                        throw null;
                    }
                }
                if (next.f3953a != null) {
                    bundle2 = new Bundle(next.f3953a);
                } else {
                    bundle2 = new Bundle();
                }
                bundle2.putBoolean("android.support.allowGeneratedReplies", next.f3957e);
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 24) {
                    builder.setAllowGeneratedReplies(next.f3957e);
                }
                bundle2.putInt("android.support.action.semanticAction", next.f3959g);
                if (i13 >= 28) {
                    builder.setSemanticAction(next.f3959g);
                }
                if (i13 >= 29) {
                    builder.setContextual(next.f3960h);
                }
                if (i13 >= 31) {
                    builder.setAuthenticationRequired(next.f3964l);
                }
                bundle2.putBoolean("android.support.action.showsUserInterface", next.f3958f);
                builder.addExtras(bundle2);
                this.f3992b.addAction(builder.build());
            } else {
                List<Bundle> list2 = this.f3994d;
                Notification.Builder builder2 = this.f3992b;
                Object obj = n.f3996a;
                IconCompat a12 = next.a();
                builder2.addAction(a12 != null ? a12.d() : 0, next.f3962j, next.f3963k);
                Bundle bundle3 = new Bundle(next.f3953a);
                s[] sVarArr2 = next.f3955c;
                if (sVarArr2 != null) {
                    bundle3.putParcelableArray("android.support.remoteInputs", n.b(sVarArr2));
                }
                s[] sVarArr3 = next.f3956d;
                if (sVarArr3 != null) {
                    bundle3.putParcelableArray("android.support.dataRemoteInputs", n.b(sVarArr3));
                }
                bundle3.putBoolean("android.support.allowGeneratedReplies", next.f3957e);
                list2.add(bundle3);
            }
        }
        Bundle bundle4 = dVar2.f3983o;
        if (bundle4 != null) {
            this.f3995e.putAll(bundle4);
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 < 20 && dVar2.f3981m) {
            this.f3995e.putBoolean("android.support.localOnly", true);
        }
        this.f3992b.setShowWhen(dVar2.f3979k);
        if (i14 >= 19 && i14 < 21 && (a10 = a(b(dVar2.f3971c), dVar2.f3989u)) != null && !a10.isEmpty()) {
            this.f3995e.putStringArray("android.people", (String[]) a10.toArray(new String[a10.size()]));
        }
        if (i14 >= 20) {
            this.f3992b.setLocalOnly(dVar2.f3981m).setGroup((String) null).setGroupSummary(false).setSortKey((String) null);
        }
        if (i14 >= 21) {
            this.f3992b.setCategory(dVar2.f3982n).setColor(dVar2.f3984p).setVisibility(dVar2.f3985q).setPublicVersion((Notification) null).setSound(notification.sound, notification.audioAttributes);
            if (i14 < 28) {
                list = a(b(dVar2.f3971c), dVar2.f3989u);
            } else {
                list = dVar2.f3989u;
            }
            if (list != null && !list.isEmpty()) {
                for (String addPerson : list) {
                    this.f3992b.addPerson(addPerson);
                }
            }
            if (dVar2.f3972d.size() > 0) {
                if (dVar2.f3983o == null) {
                    dVar2.f3983o = new Bundle();
                }
                Bundle bundle5 = dVar2.f3983o.getBundle("android.car.EXTENSIONS");
                bundle5 = bundle5 == null ? new Bundle() : bundle5;
                Bundle bundle6 = new Bundle(bundle5);
                Bundle bundle7 = new Bundle();
                for (int i15 = 0; i15 < dVar2.f3972d.size(); i15++) {
                    String num = Integer.toString(i15);
                    l.a aVar = dVar2.f3972d.get(i15);
                    Object obj2 = n.f3996a;
                    Bundle bundle8 = new Bundle();
                    IconCompat a13 = aVar.a();
                    bundle8.putInt("icon", a13 != null ? a13.d() : 0);
                    bundle8.putCharSequence("title", aVar.f3962j);
                    bundle8.putParcelable("actionIntent", aVar.f3963k);
                    if (aVar.f3953a != null) {
                        bundle = new Bundle(aVar.f3953a);
                    } else {
                        bundle = new Bundle();
                    }
                    bundle.putBoolean("android.support.allowGeneratedReplies", aVar.f3957e);
                    bundle8.putBundle("extras", bundle);
                    bundle8.putParcelableArray("remoteInputs", n.b(aVar.f3955c));
                    bundle8.putBoolean("showsUserInterface", aVar.f3958f);
                    bundle8.putInt("semanticAction", aVar.f3959g);
                    bundle7.putBundle(num, bundle8);
                }
                bundle5.putBundle("invisible_actions", bundle7);
                bundle6.putBundle("invisible_actions", bundle7);
                if (dVar2.f3983o == null) {
                    dVar2.f3983o = new Bundle();
                }
                dVar2.f3983o.putBundle("android.car.EXTENSIONS", bundle5);
                this.f3995e.putBundle("android.car.EXTENSIONS", bundle6);
            }
        }
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 24) {
            this.f3992b.setExtras(dVar2.f3983o).setRemoteInputHistory((CharSequence[]) null);
        }
        if (i16 >= 26) {
            this.f3992b.setBadgeIconType(0).setSettingsText((CharSequence) null).setShortcutId((String) null).setTimeoutAfter(0).setGroupAlertBehavior(0);
            if (!TextUtils.isEmpty(dVar2.f3986r)) {
                this.f3992b.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i16 >= 28) {
            Iterator<q> it2 = dVar2.f3971c.iterator();
            while (it2.hasNext()) {
                q next2 = it2.next();
                Notification.Builder builder3 = this.f3992b;
                next2.getClass();
                builder3.addPerson(q.a.b(next2));
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3992b.setAllowSystemGeneratedContextualActions(dVar2.f3987s);
            this.f3992b.setBubbleMetadata((Notification.BubbleMetadata) null);
        }
    }

    public static List<String> a(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        c cVar = new c(list2.size() + list.size());
        cVar.addAll(list);
        cVar.addAll(list2);
        return new ArrayList(cVar);
    }

    public static List<String> b(List<q> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (q next : list) {
            String str = next.f4001c;
            if (str == null) {
                if (next.f3999a != null) {
                    StringBuilder a10 = a.a("name:");
                    a10.append(next.f3999a);
                    str = a10.toString();
                } else {
                    str = "";
                }
            }
            arrayList.add(str);
        }
        return arrayList;
    }
}

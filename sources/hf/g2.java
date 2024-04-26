package hf;

import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.Application;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.NetworkStatsManager;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.ClipboardManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.RestrictionsManager;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.LauncherApps;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.fingerprint.FingerprintManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.midi.MidiManager;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.DropBoxManager;
import android.os.HardwarePropertiesManager;
import android.os.Looper;
import android.os.PowerManager;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.health.SystemHealthManager;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.CarrierConfigManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import gf.d0;
import gf.f;
import gf.l;
import java.io.File;
import jf.g;
import jf.m;
import kd.o;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class g2 extends l implements td.l<l.b, o> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Application f19010b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g2(Application application) {
        super(1);
        this.f19010b = application;
    }

    public Object c(Object obj) {
        l.b bVar = (l.b) obj;
        Class<String> cls = String.class;
        k.g(bVar, "$receiver");
        l.b.a.d(bVar, i.f19014a, false, 2, (Object) null);
        f fVar = new f(Context.class);
        l.b.C0151b a10 = bVar.e((Object) null, (Boolean) null);
        d0 d0Var = d0.f18660c;
        a10.a(new m(d0.f18659b, new f(Application.class), new t(this)));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(AssetManager.class), e0.f19000b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(ContentResolver.class), p0.f19037b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(ApplicationInfo.class), a1.f18984b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(Looper.class), l1.f19026b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(PackageManager.class), w1.f19059b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(Resources.class), d2.f18998b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(Resources.Theme.class), e2.f19002b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(SharedPreferences.class), f2.f19006b));
        bVar.e((Object) null, (Boolean) null).a(new g(fVar, new f(cls), new f(SharedPreferences.class), j.f19018b));
        l.b.a.b(bVar, new f(File.class), "cache", (Boolean) null, 4, (Object) null).a(new m(fVar, new f(File.class), k.f19021b));
        l.b.a.b(bVar, new f(File.class), "externalCache", (Boolean) null, 4, (Object) null).a(new m(fVar, new f(File.class), l.f19024b));
        l.b.a.b(bVar, new f(File.class), "files", (Boolean) null, 4, (Object) null).a(new m(fVar, new f(File.class), m.f19027b));
        l.b.a.b(bVar, new f(File.class), "obb", (Boolean) null, 4, (Object) null).a(new m(fVar, new f(File.class), n.f19030b));
        l.b.a.b(bVar, new f(cls), "packageCodePath", (Boolean) null, 4, (Object) null).a(new m(fVar, new f(cls), o.f19033b));
        l.b.a.b(bVar, new f(cls), "packageName", (Boolean) null, 4, (Object) null).a(new m(fVar, new f(cls), p.f19036b));
        l.b.a.b(bVar, new f(cls), "packageResourcePath", (Boolean) null, 4, (Object) null).a(new m(fVar, new f(cls), q.f19039b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(AccessibilityManager.class), r.f19042b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(AccountManager.class), s.f19045b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(ActivityManager.class), u.f19051b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(AlarmManager.class), v.f19054b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(AudioManager.class), w.f19057b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(ClipboardManager.class), x.f19060b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(ConnectivityManager.class), y.f19063b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(DevicePolicyManager.class), z.f19066b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(DownloadManager.class), a0.f18983b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(DropBoxManager.class), b0.f18986b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(InputMethodManager.class), c0.f18992b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(KeyguardManager.class), d0.f18996b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(LayoutInflater.class), f0.f19004b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(LocationManager.class), g0.f19008b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(NfcManager.class), h0.f19012b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(NotificationManager.class), i0.f19016b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(PowerManager.class), j0.f19019b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(SearchManager.class), k0.f19022b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(SensorManager.class), l0.f19025b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(StorageManager.class), m0.f19028b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(TelephonyManager.class), n0.f19031b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(TextServicesManager.class), o0.f19034b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(UiModeManager.class), q0.f19040b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(UsbManager.class), r0.f19043b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(Vibrator.class), s0.f19046b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(WallpaperManager.class), t0.f19049b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(WifiP2pManager.class), u0.f19052b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(WifiManager.class), v0.f19055b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(WindowManager.class), w0.f19058b));
        int i10 = Build.VERSION.SDK_INT;
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(InputManager.class), x0.f19061b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(MediaRouter.class), y0.f19064b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(NsdManager.class), z0.f19067b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(DisplayManager.class), b1.f18987b));
        bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(UserManager.class), c1.f18993b));
        if (i10 >= 18) {
            bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(BluetoothManager.class), d1.f18997b));
        }
        if (i10 >= 19) {
            bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(AppOpsManager.class), e1.f19001b));
            bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(CaptioningManager.class), f1.f19005b));
            bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(ConsumerIrManager.class), g1.f19009b));
            bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(PrintManager.class), h1.f19013b));
        }
        if (i10 >= 21) {
            bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(AppWidgetManager.class), i1.f19017b));
            bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(BatteryManager.class), j1.f19020b));
            bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(CameraManager.class), k1.f19023b));
            bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(JobScheduler.class), m1.f19029b));
            bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(LauncherApps.class), n1.f19032b));
            bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(MediaProjectionManager.class), o1.f19035b));
            bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(MediaSessionManager.class), p1.f19038b));
            bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(RestrictionsManager.class), q1.f19041b));
            bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(TelecomManager.class), r1.f19044b));
            bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(TvInputManager.class), s1.f19047b));
        }
        if (i10 >= 22) {
            bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(SubscriptionManager.class), t1.f19050b));
            bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(UsageStatsManager.class), u1.f19053b));
        }
        if (i10 >= 23) {
            bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(CarrierConfigManager.class), v1.f19056b));
            bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(FingerprintManager.class), x1.f19062b));
            bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(MidiManager.class), y1.f19065b));
            bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(NetworkStatsManager.class), z1.f19068b));
        }
        if (i10 >= 24) {
            bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(HardwarePropertiesManager.class), a2.f18985b));
            bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(SystemHealthManager.class), b2.f18988b));
        }
        if (i10 >= 25) {
            bVar.e((Object) null, (Boolean) null).a(new m(fVar, new f(ShortcutManager.class), c2.f18994b));
        }
        return o.f20627a;
    }
}

package com.startapp;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.provider.Settings;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.startapp.networkTest.enums.IdleStates;
import com.startapp.networkTest.enums.MemoryStates;
import com.startapp.networkTest.enums.MultiSimVariants;
import com.startapp.networkTest.enums.Os;
import com.startapp.networkTest.enums.PhoneTypes;
import com.startapp.networkTest.enums.ScreenStates;
import com.startapp.networkTest.enums.SimStates;
import com.startapp.networkTest.enums.ThreeState;
import j.f;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: Sta */
public class p2 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f11563a = "p2";

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f11564b = false;

    /* compiled from: Sta */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11565a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.startapp.networkTest.enums.AnonymizationLevel[] r0 = com.startapp.networkTest.enums.AnonymizationLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11565a = r0
                com.startapp.networkTest.enums.AnonymizationLevel r1 = com.startapp.networkTest.enums.AnonymizationLevel.Full     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11565a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.networkTest.enums.AnonymizationLevel r1 = com.startapp.networkTest.enums.AnonymizationLevel.Anonymized     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11565a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.startapp.networkTest.enums.AnonymizationLevel r1 = com.startapp.networkTest.enums.AnonymizationLevel.None     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.p2.a.<clinit>():void");
        }
    }

    private static l1 a(Context context) {
        l1 l1Var = new l1();
        l1Var.MissingPermission = true;
        return l1Var;
    }

    public static q2 b(Context context) {
        String[] strArr;
        q2 q2Var = new q2();
        q2Var.DeviceManufacturer = Build.MANUFACTURER;
        q2Var.DeviceName = Build.MODEL;
        q2Var.OS = Os.Android;
        q2Var.OSVersion = Build.VERSION.RELEASE;
        q2Var.BuildFingerprint = Build.FINGERPRINT;
        q2Var.DeviceUpTime = SystemClock.elapsedRealtime();
        q2Var.UserLocal = Locale.getDefault().toString();
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            q2Var.SimOperator = la.a(telephonyManager.getSimOperator());
            q2Var.SimOperatorName = la.a(telephonyManager.getSimOperatorName());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                String typeAllocationCode = telephonyManager.getTypeAllocationCode();
                if (typeAllocationCode == null || typeAllocationCode.isEmpty()) {
                    String manufacturerCode = telephonyManager.getManufacturerCode();
                    if (manufacturerCode != null && !manufacturerCode.isEmpty()) {
                        q2Var.TAC = manufacturerCode;
                    }
                } else {
                    q2Var.TAC = typeAllocationCode;
                }
            }
            SimStates simStates = SimStates.Unknown;
            int simState = telephonyManager.getSimState();
            if (simState == 1) {
                simStates = SimStates.Absent;
            } else if (simState == 2) {
                simStates = SimStates.PinRequired;
            } else if (simState == 3) {
                simStates = SimStates.PukRequired;
            } else if (simState == 4) {
                simStates = SimStates.NetworkLocked;
            } else if (simState == 5) {
                simStates = SimStates.Ready;
            }
            q2Var.SimState = simStates;
            if (i10 >= 23) {
                try {
                    q2Var.PhoneCount = ((Integer) telephonyManager.getClass().getDeclaredMethod("getPhoneCount", new Class[0]).invoke(telephonyManager, new Object[0])).intValue();
                } catch (Throwable th) {
                    x2.b(th);
                }
            }
            PhoneTypes phoneTypes = PhoneTypes.Unknown;
            int phoneType = telephonyManager.getPhoneType();
            if (phoneType == 0) {
                phoneTypes = PhoneTypes.None;
            } else if (phoneType == 1) {
                phoneTypes = PhoneTypes.GSM;
            } else if (phoneType == 2) {
                phoneTypes = PhoneTypes.CDMA;
            } else if (phoneType == 3) {
                phoneTypes = PhoneTypes.SIP;
            }
            q2Var.PhoneType = phoneTypes;
        }
        q2Var.IsRooted = a();
        if (Build.VERSION.SDK_INT <= 24) {
            strArr = v9.a("/proc/version");
        } else {
            strArr = v9.b("uname -a");
        }
        if (strArr.length > 0) {
            q2Var.OsSystemVersion = la.a(strArr[0]);
        }
        q2Var.BluetoothInfo = a(context);
        q2Var.PowerSaveMode = g(context);
        q2Var.MultiSimInfo = f(context);
        q2Var.HostAppInfo = c(context);
        return q2Var;
    }

    private static x3 c(Context context) {
        x3 x3Var = new x3();
        x3Var.AppPackageName = context.getPackageName();
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
            } catch (Throwable th) {
                x2.b(th);
            }
        }
        if (applicationInfo != null) {
            x3Var.AppTargetVersion = applicationInfo.targetSdkVersion;
            x3Var.AppName = (String) applicationInfo.loadLabel(context.getPackageManager());
            if (Build.VERSION.SDK_INT >= 26) {
                x3Var.AppCategory = i0.a(applicationInfo.category);
            }
        }
        ArrayList<d0> arrayList = new ArrayList<>();
        try {
            for (String str : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions) {
                d0 d0Var = new d0();
                d0Var.Permission = str.toLowerCase();
                if (str.equalsIgnoreCase("android.permission.PACKAGE_USAGE_STATS")) {
                    d0Var.IsGranted = i0.b(context) ? 1 : 0;
                } else {
                    d0Var.IsGranted = context.checkPermission(str, Process.myPid(), Process.myUid()) == 0 ? 1 : 0;
                }
                arrayList.add(d0Var);
            }
        } catch (Throwable th2) {
            x3Var.AppPermissions = arrayList;
            throw th2;
        }
        x3Var.AppPermissions = arrayList;
        return x3Var;
    }

    public static IdleStates d(Context context) {
        PowerManager powerManager;
        IdleStates idleStates = IdleStates.Unknown;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23 || (powerManager = (PowerManager) context.getSystemService("power")) == null) {
            return idleStates;
        }
        if (i10 >= 24) {
            try {
                if (((Boolean) powerManager.getClass().getDeclaredMethod("isLightDeviceIdleMode", new Class[0]).invoke(powerManager, new Object[0])).booleanValue()) {
                    idleStates = IdleStates.LightIdle;
                }
            } catch (Throwable th) {
                x2.b(th);
            }
        }
        if (idleStates != IdleStates.LightIdle) {
            return powerManager.isDeviceIdleMode() ? IdleStates.DeepIdle : IdleStates.NonIdle;
        }
        return idleStates;
    }

    @SuppressLint({"NewApi"})
    public static h6 e(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        h6 h6Var = new h6();
        long j10 = memoryInfo.availMem;
        h6Var.MemoryFree = j10;
        long j11 = memoryInfo.totalMem;
        h6Var.MemoryTotal = j11;
        h6Var.MemoryUsed = j11 - j10;
        if (memoryInfo.lowMemory) {
            h6Var.MemoryState = MemoryStates.Low;
        } else {
            h6Var.MemoryState = MemoryStates.Normal;
        }
        return h6Var;
    }

    public static y6 f(Context context) {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        SimStates simStates;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        y6 y6Var = new y6();
        if (Build.VERSION.SDK_INT >= 22 && context.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
            SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService("telephony_subscription_service");
            char c10 = 65535;
            if (subscriptionManager != null) {
                y6Var.ActiveSimCount = subscriptionManager.getActiveSubscriptionInfoCount();
                y6Var.ActiveSimCountMax = subscriptionManager.getActiveSubscriptionInfoCountMax();
                List<SubscriptionInfo> activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList();
                if (activeSubscriptionInfoList != null && activeSubscriptionInfoList.size() > 0) {
                    x9[] x9VarArr = new x9[activeSubscriptionInfoList.size()];
                    int i10 = 0;
                    for (SubscriptionInfo next : activeSubscriptionInfoList) {
                        x9 x9Var = new x9();
                        try {
                            if (next.getCarrierName() != null) {
                                x9Var.CarrierName = la.a(next.getCarrierName().toString());
                            }
                        } catch (Throwable th) {
                            x2.b(th);
                        }
                        try {
                            if (next.getCountryIso() != null) {
                                x9Var.CountryIso = la.a(next.getCountryIso());
                            }
                        } catch (Throwable th2) {
                            x2.b(th2);
                        }
                        try {
                            if (next.getIccId() != null) {
                                x9Var.IccId = a(la.a(next.getIccId()));
                            }
                        } catch (Throwable th3) {
                            x2.b(th3);
                        }
                        x9Var.Mcc = next.getMcc() == Integer.MAX_VALUE ? -1 : next.getMcc();
                        x9Var.Mnc = next.getMnc() == Integer.MAX_VALUE ? -1 : next.getMnc();
                        x9Var.SimSlotIndex = next.getSimSlotIndex();
                        x9Var.SubscriptionId = next.getSubscriptionId();
                        x9Var.DataRoaming = next.getDataRoaming() == 1;
                        a(context, x9Var.SubscriptionId, x9Var);
                        x9VarArr[i10] = x9Var;
                        i10++;
                    }
                    y6Var.SimInfos = new ArrayList<>(Arrays.asList(x9VarArr));
                }
                try {
                    method5 = subscriptionManager.getClass().getDeclaredMethod("getDefaultDataSubscriptionId", new Class[0]);
                } catch (NoSuchMethodException e10) {
                    x2.b(e10);
                    method5 = null;
                }
                if (method5 == null) {
                    try {
                        method5 = subscriptionManager.getClass().getDeclaredMethod("getDefaultDataSubId", new Class[0]);
                    } catch (NoSuchMethodException e11) {
                        x2.b(e11);
                    }
                }
                if (method5 != null) {
                    try {
                        y6Var.DefaultDataSimId = ((Integer) method5.invoke(subscriptionManager, new Object[0])).intValue();
                    } catch (Throwable th4) {
                        x2.a(th4);
                    }
                }
                try {
                    method6 = subscriptionManager.getClass().getDeclaredMethod("getDefaultSmsSubscriptionId", new Class[0]);
                } catch (NoSuchMethodException e12) {
                    x2.b(e12);
                    method6 = null;
                }
                if (method6 == null) {
                    try {
                        method6 = subscriptionManager.getClass().getDeclaredMethod("getDefaultSmsSubId", new Class[0]);
                    } catch (NoSuchMethodException e13) {
                        x2.b(e13);
                    }
                }
                if (method6 != null) {
                    try {
                        y6Var.DefaultSmsSimId = ((Integer) method6.invoke(subscriptionManager, new Object[0])).intValue();
                    } catch (Throwable th5) {
                        x2.a(th5);
                    }
                }
                try {
                    method7 = subscriptionManager.getClass().getDeclaredMethod("getDefaultSubscriptionId", new Class[0]);
                } catch (NoSuchMethodException e14) {
                    x2.b(e14);
                    method7 = null;
                }
                if (method7 == null) {
                    try {
                        method7 = subscriptionManager.getClass().getDeclaredMethod("getDefaultSubId", new Class[0]);
                    } catch (NoSuchMethodException e15) {
                        x2.b(e15);
                    }
                }
                if (method7 != null) {
                    try {
                        y6Var.DefaultSimId = ((Integer) method7.invoke(subscriptionManager, new Object[0])).intValue();
                    } catch (Throwable th6) {
                        x2.a(th6);
                    }
                }
                try {
                    method8 = subscriptionManager.getClass().getDeclaredMethod("getDefaultVoiceSubscriptionId", new Class[0]);
                } catch (NoSuchMethodException e16) {
                    x2.b(e16);
                    method8 = null;
                }
                if (method8 == null) {
                    try {
                        method8 = subscriptionManager.getClass().getDeclaredMethod("getDefaultVoiceSubId", new Class[0]);
                    } catch (NoSuchMethodException e17) {
                        x2.b(e17);
                    }
                }
                if (method8 != null) {
                    try {
                        y6Var.DefaultVoiceSimId = ((Integer) method8.invoke(subscriptionManager, new Object[0])).intValue();
                    } catch (Throwable th7) {
                        x2.a(th7);
                    }
                }
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                try {
                    method = telephonyManager.getClass().getDeclaredMethod("getMultiSimConfiguration", new Class[0]);
                } catch (NoSuchMethodException e18) {
                    x2.b(e18);
                    method = null;
                }
                if (method != null) {
                    try {
                        Object invoke = method.invoke(telephonyManager, new Object[0]);
                        if (invoke instanceof Enum) {
                            String obj = invoke.toString();
                            int hashCode = obj.hashCode();
                            if (hashCode != 2107724) {
                                if (hashCode != 2107742) {
                                    if (hashCode == 2584894) {
                                        if (obj.equals("TSTS")) {
                                            c10 = 2;
                                        }
                                    }
                                } else if (obj.equals("DSDS")) {
                                    c10 = 1;
                                }
                            } else if (obj.equals("DSDA")) {
                                c10 = 0;
                            }
                            if (c10 == 0) {
                                y6Var.MultiSimVariant = MultiSimVariants.DSDA;
                            } else if (c10 == 1) {
                                y6Var.MultiSimVariant = MultiSimVariants.DSDS;
                            } else if (c10 != 2) {
                                y6Var.MultiSimVariant = MultiSimVariants.Unknown;
                            } else {
                                y6Var.MultiSimVariant = MultiSimVariants.TSTS;
                            }
                        }
                    } catch (Throwable th8) {
                        x2.a(th8);
                    }
                }
                Iterator<x9> it = y6Var.SimInfos.iterator();
                while (it.hasNext()) {
                    x9 next2 = it.next();
                    try {
                        method2 = telephonyManager.getClass().getDeclaredMethod("getSimState", new Class[]{Integer.TYPE});
                    } catch (NoSuchMethodException e19) {
                        x2.b(e19);
                        method2 = null;
                    }
                    if (method2 != null) {
                        try {
                            switch (((Integer) method2.invoke(telephonyManager, new Object[]{Integer.valueOf(next2.SimSlotIndex)})).intValue()) {
                                case 1:
                                    simStates = SimStates.Absent;
                                    break;
                                case 2:
                                    simStates = SimStates.PinRequired;
                                    break;
                                case 3:
                                    simStates = SimStates.PukRequired;
                                    break;
                                case 4:
                                    simStates = SimStates.NetworkLocked;
                                    break;
                                case 5:
                                    simStates = SimStates.Ready;
                                    break;
                                case 6:
                                    simStates = SimStates.NotReady;
                                    break;
                                case 7:
                                    simStates = SimStates.PermanentlyDisabled;
                                    break;
                                case b4.f10106f:
                                    simStates = SimStates.CardIoError;
                                    break;
                                case 9:
                                    simStates = SimStates.CardRestricted;
                                    break;
                                default:
                                    simStates = SimStates.Unknown;
                                    break;
                            }
                            next2.SimState = simStates;
                        } catch (Throwable th9) {
                            x2.a(th9);
                        }
                    }
                    try {
                        method3 = telephonyManager.getClass().getDeclaredMethod("getSubscriberId", new Class[]{Integer.TYPE});
                    } catch (NoSuchMethodException e20) {
                        x2.b(e20);
                        method3 = null;
                    }
                    if (method3 != null) {
                        try {
                            next2.IMSI = b(la.a((String) method3.invoke(telephonyManager, new Object[]{Integer.valueOf(next2.SubscriptionId)})));
                        } catch (Throwable th10) {
                            x2.a(th10);
                        }
                    }
                    try {
                        method4 = telephonyManager.getClass().getDeclaredMethod("getGroupIdLevel1", new Class[]{Integer.TYPE});
                    } catch (NoSuchMethodException e21) {
                        x2.b(e21);
                        method4 = null;
                    }
                    if (method4 != null) {
                        try {
                            next2.GroupIdentifierLevel1 = la.a((String) method4.invoke(telephonyManager, new Object[]{Integer.valueOf(next2.SubscriptionId)}));
                        } catch (Throwable th11) {
                            x2.a(th11);
                        }
                    }
                }
            }
        }
        return y6Var;
    }

    private static ThreeState g(Context context) {
        try {
            String string = Settings.System.getString(context.getContentResolver(), "user_powersaver_enable");
            if (string != null) {
                return string.equals("1") ? ThreeState.Enabled : ThreeState.Disabled;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 21) {
                if (Build.MANUFACTURER.toLowerCase().startsWith("sony") && i10 < 23) {
                    return ThreeState.Unknown;
                }
                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                if (powerManager != null) {
                    return powerManager.isPowerSaveMode() ? ThreeState.Enabled : ThreeState.Disabled;
                }
            }
            return ThreeState.Unknown;
        } catch (Throwable th) {
            x2.a(th);
        }
    }

    public static ScreenStates h(Context context) {
        ScreenStates screenStates = ScreenStates.Unknown;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            return powerManager.isScreenOn() ? ScreenStates.On : ScreenStates.Off;
        }
        return screenStates;
    }

    public static x9 i(Context context) {
        return f(context).getDefaultDataSimInfo();
    }

    public static x9 j(Context context) {
        return f(context).getDefaultVoiceSimInfo();
    }

    public static ia k(Context context) {
        ia iaVar = new ia();
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize = (long) statFs.getBlockSize();
        iaVar.StorageInternalSize = ((long) statFs.getBlockCount()) * blockSize;
        iaVar.StorageInternalAvailable = blockSize * ((long) statFs.getAvailableBlocks());
        iaVar.StorageInternalAudio = a(context, MediaStore.Audio.Media.INTERNAL_CONTENT_URI);
        iaVar.StorageInternalImages = a(context, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        iaVar.StorageInternalVideo = a(context, MediaStore.Video.Media.INTERNAL_CONTENT_URI);
        if (b()) {
            try {
                StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                long blockSize2 = (long) statFs2.getBlockSize();
                iaVar.StorageExternalSize = ((long) statFs2.getBlockCount()) * blockSize2;
                iaVar.StorageExternalAvailable = blockSize2 * ((long) statFs2.getAvailableBlocks());
            } catch (IllegalArgumentException unused) {
                iaVar.StorageExternalSize = -1;
                iaVar.StorageExternalAvailable = -1;
            }
            if (context.checkCallingOrSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
                iaVar.StorageExternalAudio = a(context, MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
                iaVar.StorageExternalImages = a(context, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                iaVar.StorageExternalVideo = a(context, MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
            }
        }
        return iaVar;
    }

    private static boolean a() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i10 = 0; i10 < 10; i10++) {
            if (new File(strArr[i10]).exists()) {
                return true;
            }
        }
        return false;
    }

    private static long a(Context context, Uri uri) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{"_size"}, (String) null, (String[]) null, (String) null);
            long j10 = 0;
            if (cursor != null) {
                if (cursor.getCount() == 0) {
                    cursor.close();
                    return 0;
                }
                while (cursor.moveToNext()) {
                    j10 += cursor.getLong(cursor.getColumnIndexOrThrow("_size"));
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return j10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public static db a(nd ndVar) {
        db dbVar = new db();
        dbVar.MobileRxBytes = eb.e();
        dbVar.MobileTxBytes = eb.f();
        dbVar.TotalRxBytes = TrafficStats.getTotalRxBytes();
        dbVar.TotalTxBytes = TrafficStats.getTotalTxBytes();
        if (ndVar != null) {
            dbVar.WifiRxBytes = ndVar.d();
            dbVar.WifiTxBytes = ndVar.e();
        } else {
            dbVar.WifiRxBytes = -1;
            dbVar.WifiTxBytes = -1;
        }
        return dbVar;
    }

    public static x9 a(int i10, Context context) {
        return f(context).getSimInfoSubId(i10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(android.content.Context r9, int r10, com.startapp.x9 r11) {
        /*
            java.lang.String r0 = "type"
            java.lang.String r1 = "apn"
            r2 = -1
            if (r10 == r2) goto L_0x000e
            java.lang.String r2 = "content://telephony/carriers/preferapn/subId/"
            java.lang.String r10 = com.startapp.o2.a(r2, r10)
            goto L_0x0010
        L_0x000e:
            java.lang.String r10 = "content://telephony/carriers/preferapn"
        L_0x0010:
            r2 = 0
            android.net.Uri r4 = android.net.Uri.parse(r10)     // Catch:{ all -> 0x0050 }
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch:{ all -> 0x0050 }
            r9 = 2
            java.lang.String[] r5 = new java.lang.String[r9]     // Catch:{ all -> 0x0050 }
            r9 = 0
            r5[r9] = r1     // Catch:{ all -> 0x0050 }
            r9 = 1
            r5[r9] = r0     // Catch:{ all -> 0x0050 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0050 }
            if (r9 == 0) goto L_0x004c
            boolean r10 = r9.moveToFirst()     // Catch:{ all -> 0x0049 }
            if (r10 == 0) goto L_0x004c
            int r10 = r9.getColumnIndex(r1)     // Catch:{ all -> 0x0049 }
            java.lang.String r10 = r9.getString(r10)     // Catch:{ all -> 0x0049 }
            int r0 = r9.getColumnIndex(r0)     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = r9.getString(r0)     // Catch:{ all -> 0x0049 }
            r11.Apn = r10     // Catch:{ all -> 0x0049 }
            r11.ApnTypes = r0     // Catch:{ all -> 0x0049 }
            r9.close()     // Catch:{ all -> 0x0049 }
            goto L_0x004d
        L_0x0049:
            r10 = move-exception
            r2 = r9
            goto L_0x0051
        L_0x004c:
            r2 = r9
        L_0x004d:
            if (r2 == 0) goto L_0x005e
            goto L_0x0056
        L_0x0050:
            r10 = move-exception
        L_0x0051:
            com.startapp.x2.a((java.lang.Throwable) r10)     // Catch:{ all -> 0x005f }
            if (r2 == 0) goto L_0x005e
        L_0x0056:
            r2.close()     // Catch:{ all -> 0x005a }
            goto L_0x005e
        L_0x005a:
            r9 = move-exception
            com.startapp.x2.b(r9)
        L_0x005e:
            return
        L_0x005f:
            r9 = move-exception
            if (r2 == 0) goto L_0x006a
            r2.close()     // Catch:{ all -> 0x0066 }
            goto L_0x006a
        L_0x0066:
            r10 = move-exception
            com.startapp.x2.b(r10)
        L_0x006a:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.p2.a(android.content.Context, int, com.startapp.x9):void");
    }

    private static String a(String str) {
        int i10;
        if (str.length() == 0 || (i10 = a.f11565a[a5.b().SIMINFO_ICCID_RECORDTYPE().ordinal()]) == 1) {
            return str;
        }
        if (i10 != 2) {
            return "";
        }
        if (str.length() >= 11) {
            return f.a(str.substring(0, 7), str.substring(7, str.length()).replaceAll("[\\d\\w]", "*"));
        }
        return str.replaceAll("[\\d\\w]", "*");
    }

    private static boolean b() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Throwable th) {
            x2.a(th);
            return false;
        }
    }

    private static String b(String str) {
        int i10;
        if (str.length() == 0 || (i10 = a.f11565a[a5.b().SIMINFO_IMSI_RECORDTYPE().ordinal()]) == 1) {
            return str;
        }
        if (i10 != 2) {
            return "";
        }
        if (str.length() >= 14) {
            return f.a(str.substring(0, 10), str.substring(10, str.length()).replaceAll("[\\d\\w]", "*"));
        }
        return str.replaceAll("[\\d\\w]", "*");
    }
}

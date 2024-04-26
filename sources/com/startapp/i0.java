package com.startapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import com.startapp.networkTest.enums.AppCategoryTypes;

/* compiled from: Sta */
public class i0 {

    /* compiled from: Sta */
    public class a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f10524a;

        public a(Activity activity) {
            this.f10524a = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i10) {
            i0.c(this.f10524a);
        }
    }

    /* compiled from: Sta */
    public class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f10525a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Activity f10526b;

        public b(boolean z10, Activity activity) {
            this.f10525a = z10;
            this.f10526b = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i10) {
            if (this.f10525a) {
                this.f10526b.finish();
            }
        }
    }

    public static boolean a(Context context) {
        if (Build.VERSION.SDK_INT < 21 || new Intent("android.settings.USAGE_ACCESS_SETTINGS").resolveActivity(context.getPackageManager()) == null) {
            return false;
        }
        return true;
    }

    public static boolean b(Context context) {
        if (Build.VERSION.SDK_INT < 21 || ((AppOpsManager) context.getApplicationContext().getSystemService("appops")).checkOpNoThrow("android:get_usage_stats", Process.myUid(), context.getApplicationContext().getPackageName()) == 0) {
            return true;
        }
        return false;
    }

    public static boolean c(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                Intent intent = new Intent("android.settings.USAGE_ACCESS_SETTINGS");
                intent.setFlags(411074560);
                context.startActivity(intent);
                return true;
            } catch (Throwable th) {
                x2.a(th);
            }
        }
        return false;
    }

    public static boolean a(Activity activity, int i10, int i11, int i12, int i13, boolean z10) {
        if (!a((Context) activity)) {
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(i10);
        builder.setCancelable(false);
        builder.setMessage(i11);
        builder.setPositiveButton(i12, new a(activity));
        builder.setNegativeButton(i13, new b(z10, activity));
        builder.create().show();
        return true;
    }

    public static AppCategoryTypes a(int i10) {
        AppCategoryTypes appCategoryTypes = AppCategoryTypes.Unknown;
        switch (i10) {
            case nd.f10913j /*-1*/:
                return AppCategoryTypes.Undefined;
            case 0:
                return AppCategoryTypes.Game;
            case 1:
                return AppCategoryTypes.Audio;
            case 2:
                return AppCategoryTypes.Video;
            case 3:
                return AppCategoryTypes.Image;
            case 4:
                return AppCategoryTypes.Social;
            case 5:
                return AppCategoryTypes.News;
            case 6:
                return AppCategoryTypes.Maps;
            case 7:
                return AppCategoryTypes.Productivity;
            default:
                return appCategoryTypes;
        }
    }
}

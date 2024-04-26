package com.startapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.startapp.f1;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.ads.banner.banner3d.Banner3DView;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdDetails;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Sta */
public class m0 implements f1.b, Parcelable {
    public static final Parcelable.Creator<m0> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public AdDetails f10855a;

    /* renamed from: b  reason: collision with root package name */
    public Point f10856b;

    /* renamed from: c  reason: collision with root package name */
    public Bitmap f10857c = null;

    /* renamed from: d  reason: collision with root package name */
    public Bitmap f10858d = null;

    /* renamed from: e  reason: collision with root package name */
    public AtomicBoolean f10859e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public TrackingParams f10860f;

    /* renamed from: g  reason: collision with root package name */
    public j9 f10861g = null;

    /* renamed from: h  reason: collision with root package name */
    public Banner3DView f10862h = null;

    /* compiled from: Sta */
    public class a implements Parcelable.Creator<m0> {
        public Object createFromParcel(Parcel parcel) {
            return new m0(parcel);
        }

        public Object[] newArray(int i10) {
            return new m0[i10];
        }
    }

    public m0(Context context, ViewGroup viewGroup, AdDetails adDetails, BannerOptions bannerOptions, TrackingParams trackingParams) {
        this.f10855a = adDetails;
        this.f10860f = trackingParams;
        a(context, bannerOptions, viewGroup);
    }

    public void a(Context context, BannerOptions bannerOptions, ViewGroup viewGroup) {
        int a10 = l0.a(context, 1, (float) (bannerOptions.d() - 5));
        this.f10856b = new Point((int) (bannerOptions.p() * ((float) l0.a(context, 1, (float) bannerOptions.o()))), (int) (bannerOptions.e() * ((float) l0.a(context, 1, (float) bannerOptions.d()))));
        Banner3DView banner3DView = new Banner3DView(context, new Point(bannerOptions.o(), bannerOptions.d()));
        this.f10862h = banner3DView;
        banner3DView.setText(this.f10855a.t());
        this.f10862h.setRating(this.f10855a.q());
        this.f10862h.setDescription(this.f10855a.i());
        this.f10862h.setButtonText(this.f10855a.z());
        Bitmap bitmap = this.f10857c;
        if (bitmap != null) {
            this.f10862h.setImage(bitmap, a10, a10);
        } else {
            this.f10862h.setImage(17301651, a10, a10);
            new f1(context, this.f10855a.j(), this, 0).a();
        }
        Point point = this.f10856b;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(point.x, point.y);
        layoutParams.addRule(13);
        viewGroup.addView(this.f10862h, layoutParams);
        this.f10862h.setVisibility(8);
        a();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f10855a, i10);
        parcel.writeInt(this.f10856b.x);
        parcel.writeInt(this.f10856b.y);
        parcel.writeParcelable(this.f10857c, i10);
        parcel.writeBooleanArray(new boolean[]{this.f10859e.get()});
        parcel.writeSerializable(this.f10860f);
    }

    public m0(Parcel parcel) {
        this.f10855a = (AdDetails) parcel.readParcelable(AdDetails.class.getClassLoader());
        Point point = new Point(1, 1);
        this.f10856b = point;
        point.x = parcel.readInt();
        this.f10856b.y = parcel.readInt();
        this.f10857c = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.f10859e.set(zArr[0]);
        this.f10860f = (TrackingParams) parcel.readSerializable();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
        r1 = r4.f10856b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r4 = this;
            com.startapp.sdk.ads.banner.banner3d.Banner3DView r0 = r4.f10862h
            if (r0 == 0) goto L_0x000d
            android.graphics.Bitmap r0 = a(r0)     // Catch:{ OutOfMemoryError -> 0x000d, all -> 0x0009 }
            goto L_0x000e
        L_0x0009:
            r0 = move-exception
            com.startapp.i4.a((java.lang.Throwable) r0)
        L_0x000d:
            r0 = 0
        L_0x000e:
            r4.f10858d = r0
            if (r0 != 0) goto L_0x0013
            return
        L_0x0013:
            android.graphics.Point r1 = r4.f10856b
            int r2 = r1.x
            if (r2 <= 0) goto L_0x0024
            int r1 = r1.y
            if (r1 <= 0) goto L_0x0024
            r3 = 0
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r0, r2, r1, r3)
            r4.f10858d = r0
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.m0.a():void");
    }

    public static Bitmap a(View view) {
        view.measure(view.getMeasuredWidth(), view.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.draw(canvas);
        return createBitmap;
    }

    public void a(Bitmap bitmap, int i10) {
        Banner3DView banner3DView;
        if (bitmap != null && (banner3DView = this.f10862h) != null) {
            this.f10857c = bitmap;
            banner3DView.setImage(bitmap);
            a();
        }
    }
}

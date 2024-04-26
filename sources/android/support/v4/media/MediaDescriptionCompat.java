package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f286a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f287b;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence f288c;

    /* renamed from: d  reason: collision with root package name */
    public final CharSequence f289d;

    /* renamed from: e  reason: collision with root package name */
    public final Bitmap f290e;

    /* renamed from: f  reason: collision with root package name */
    public final Uri f291f;

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f292g;

    /* renamed from: h  reason: collision with root package name */
    public final Uri f293h;

    /* renamed from: i  reason: collision with root package name */
    public MediaDescription f294i;

    public class a implements Parcelable.Creator<MediaDescriptionCompat> {
        public Object createFromParcel(Parcel parcel) {
            if (Build.VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        public Object[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f286a = str;
        this.f287b = charSequence;
        this.f288c = charSequence2;
        this.f289d = charSequence3;
        this.f290e = bitmap;
        this.f291f = uri;
        this.f292g = bundle;
        this.f293h = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r14) {
        /*
            r0 = 0
            if (r14 == 0) goto L_0x0067
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0067
            android.media.MediaDescription r14 = (android.media.MediaDescription) r14
            java.lang.String r3 = r14.getMediaId()
            java.lang.CharSequence r4 = r14.getTitle()
            java.lang.CharSequence r5 = r14.getSubtitle()
            java.lang.CharSequence r6 = r14.getDescription()
            android.graphics.Bitmap r7 = r14.getIconBitmap()
            android.net.Uri r8 = r14.getIconUri()
            android.os.Bundle r2 = r14.getExtras()
            if (r2 == 0) goto L_0x002d
            android.os.Bundle r2 = android.support.v4.media.session.MediaSessionCompat.b(r2)
        L_0x002d:
            java.lang.String r9 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x0038
            android.os.Parcelable r10 = r2.getParcelable(r9)
            android.net.Uri r10 = (android.net.Uri) r10
            goto L_0x0039
        L_0x0038:
            r10 = r0
        L_0x0039:
            if (r10 == 0) goto L_0x0052
            java.lang.String r11 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r12 = r2.containsKey(r11)
            if (r12 == 0) goto L_0x004c
            int r12 = r2.size()
            r13 = 2
            if (r12 != r13) goto L_0x004c
            r9 = r0
            goto L_0x0053
        L_0x004c:
            r2.remove(r9)
            r2.remove(r11)
        L_0x0052:
            r9 = r2
        L_0x0053:
            if (r10 == 0) goto L_0x0056
            goto L_0x005f
        L_0x0056:
            r2 = 23
            if (r1 < r2) goto L_0x005e
            android.net.Uri r0 = r14.getMediaUri()
        L_0x005e:
            r10 = r0
        L_0x005f:
            android.support.v4.media.MediaDescriptionCompat r0 = new android.support.v4.media.MediaDescriptionCompat
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0.f294i = r14
        L_0x0067:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f287b + ", " + this.f288c + ", " + this.f289d;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 21) {
            parcel.writeString(this.f286a);
            TextUtils.writeToParcel(this.f287b, parcel, i10);
            TextUtils.writeToParcel(this.f288c, parcel, i10);
            TextUtils.writeToParcel(this.f289d, parcel, i10);
            parcel.writeParcelable(this.f290e, i10);
            parcel.writeParcelable(this.f291f, i10);
            parcel.writeBundle(this.f292g);
            parcel.writeParcelable(this.f293h, i10);
            return;
        }
        MediaDescription mediaDescription = this.f294i;
        if (mediaDescription == null && i11 >= 21) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f286a);
            builder.setTitle(this.f287b);
            builder.setSubtitle(this.f288c);
            builder.setDescription(this.f289d);
            builder.setIconBitmap(this.f290e);
            builder.setIconUri(this.f291f);
            Bundle bundle = this.f292g;
            if (i11 < 23 && this.f293h != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f293h);
            }
            builder.setExtras(bundle);
            if (i11 >= 23) {
                builder.setMediaUri(this.f293h);
            }
            mediaDescription = builder.build();
            this.f294i = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i10);
    }

    public MediaDescriptionCompat(Parcel parcel) {
        this.f286a = parcel.readString();
        this.f287b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f288c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f289d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f290e = (Bitmap) parcel.readParcelable(classLoader);
        this.f291f = (Uri) parcel.readParcelable(classLoader);
        this.f292g = parcel.readBundle(classLoader);
        this.f293h = (Uri) parcel.readParcelable(classLoader);
    }
}

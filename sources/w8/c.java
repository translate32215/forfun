package w8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.startapp.startappsdk.R;
import java.io.IOException;
import java.util.Locale;
import l9.r;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: BadgeState */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final a f27150a;

    /* renamed from: b  reason: collision with root package name */
    public final a f27151b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final float f27152c;

    /* renamed from: d  reason: collision with root package name */
    public final float f27153d;

    /* renamed from: e  reason: collision with root package name */
    public final float f27154e;

    public c(Context context, int i10, int i11, int i12, a aVar) {
        AttributeSet attributeSet;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Locale locale;
        int next;
        aVar = aVar == null ? new a() : aVar;
        if (i10 != 0) {
            aVar.f27155a = i10;
        }
        int i21 = aVar.f27155a;
        int i22 = 0;
        if (i21 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i21);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                } else if (TextUtils.equals(xml.getName(), "badge")) {
                    attributeSet = Xml.asAttributeSet(xml);
                    i13 = attributeSet.getStyleAttribute();
                } else {
                    throw new XmlPullParserException("Must have a <badge> start tag");
                }
            } catch (IOException | XmlPullParserException e10) {
                StringBuilder a10 = android.support.v4.media.a.a("Can't load badge resource ID #0x");
                a10.append(Integer.toHexString(i21));
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(a10.toString());
                notFoundException.initCause(e10);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i13 = 0;
        }
        i12 = i13 != 0 ? i13 : i12;
        int[] iArr = t8.a.f25836c;
        r.a(context, attributeSet, i11, i12);
        r.b(context, attributeSet, iArr, i11, i12, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i11, i12);
        Resources resources = context.getResources();
        this.f27152c = (float) obtainStyledAttributes.getDimensionPixelSize(2, resources.getDimensionPixelSize(R.dimen.mtrl_badge_radius));
        this.f27154e = (float) obtainStyledAttributes.getDimensionPixelSize(4, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        this.f27153d = (float) obtainStyledAttributes.getDimensionPixelSize(5, resources.getDimensionPixelSize(R.dimen.mtrl_badge_with_text_radius));
        a aVar2 = this.f27151b;
        int i23 = aVar.f27158d;
        aVar2.f27158d = i23 == -2 ? 255 : i23;
        CharSequence charSequence = aVar.f27162h;
        aVar2.f27162h = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        a aVar3 = this.f27151b;
        int i24 = aVar.f27163i;
        aVar3.f27163i = i24 == 0 ? R.plurals.mtrl_badge_content_description : i24;
        int i25 = aVar.f27164r;
        aVar3.f27164r = i25 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i25;
        Boolean bool = aVar.f27166t;
        aVar3.f27166t = Boolean.valueOf(bool == null || bool.booleanValue());
        a aVar4 = this.f27151b;
        int i26 = aVar.f27160f;
        aVar4.f27160f = i26 == -2 ? obtainStyledAttributes.getInt(8, 4) : i26;
        int i27 = aVar.f27159e;
        if (i27 != -2) {
            this.f27151b.f27159e = i27;
        } else if (obtainStyledAttributes.hasValue(9)) {
            this.f27151b.f27159e = obtainStyledAttributes.getInt(9, 0);
        } else {
            this.f27151b.f27159e = -1;
        }
        a aVar5 = this.f27151b;
        Integer num = aVar.f27156b;
        if (num == null) {
            i14 = p9.c.a(context, obtainStyledAttributes, 0).getDefaultColor();
        } else {
            i14 = num.intValue();
        }
        aVar5.f27156b = Integer.valueOf(i14);
        Integer num2 = aVar.f27157c;
        if (num2 != null) {
            this.f27151b.f27157c = num2;
        } else if (obtainStyledAttributes.hasValue(3)) {
            this.f27151b.f27157c = Integer.valueOf(p9.c.a(context, obtainStyledAttributes, 3).getDefaultColor());
        } else {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(2132083234, t8.a.K);
            obtainStyledAttributes2.getDimension(0, 0.0f);
            ColorStateList a11 = p9.c.a(context, obtainStyledAttributes2, 3);
            p9.c.a(context, obtainStyledAttributes2, 4);
            p9.c.a(context, obtainStyledAttributes2, 5);
            obtainStyledAttributes2.getInt(2, 0);
            obtainStyledAttributes2.getInt(1, 1);
            int i28 = !obtainStyledAttributes2.hasValue(12) ? 10 : 12;
            obtainStyledAttributes2.getResourceId(i28, 0);
            obtainStyledAttributes2.getString(i28);
            obtainStyledAttributes2.getBoolean(14, false);
            p9.c.a(context, obtainStyledAttributes2, 6);
            obtainStyledAttributes2.getFloat(7, 0.0f);
            obtainStyledAttributes2.getFloat(8, 0.0f);
            obtainStyledAttributes2.getFloat(9, 0.0f);
            obtainStyledAttributes2.recycle();
            if (Build.VERSION.SDK_INT >= 21) {
                TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(2132083234, t8.a.f25857x);
                obtainStyledAttributes3.hasValue(0);
                obtainStyledAttributes3.getFloat(0, 0.0f);
                obtainStyledAttributes3.recycle();
            }
            this.f27151b.f27157c = Integer.valueOf(a11.getDefaultColor());
        }
        a aVar6 = this.f27151b;
        Integer num3 = aVar.f27165s;
        if (num3 == null) {
            i15 = obtainStyledAttributes.getInt(1, 8388661);
        } else {
            i15 = num3.intValue();
        }
        aVar6.f27165s = Integer.valueOf(i15);
        a aVar7 = this.f27151b;
        Integer num4 = aVar.f27167u;
        if (num4 == null) {
            i16 = obtainStyledAttributes.getDimensionPixelOffset(6, 0);
        } else {
            i16 = num4.intValue();
        }
        aVar7.f27167u = Integer.valueOf(i16);
        a aVar8 = this.f27151b;
        if (aVar.f27167u == null) {
            i17 = obtainStyledAttributes.getDimensionPixelOffset(10, 0);
        } else {
            i17 = aVar.f27168v.intValue();
        }
        aVar8.f27168v = Integer.valueOf(i17);
        a aVar9 = this.f27151b;
        Integer num5 = aVar.f27169w;
        if (num5 == null) {
            i18 = obtainStyledAttributes.getDimensionPixelOffset(7, aVar9.f27167u.intValue());
        } else {
            i18 = num5.intValue();
        }
        aVar9.f27169w = Integer.valueOf(i18);
        a aVar10 = this.f27151b;
        Integer num6 = aVar.f27170x;
        if (num6 == null) {
            i19 = obtainStyledAttributes.getDimensionPixelOffset(11, aVar10.f27168v.intValue());
        } else {
            i19 = num6.intValue();
        }
        aVar10.f27170x = Integer.valueOf(i19);
        a aVar11 = this.f27151b;
        Integer num7 = aVar.f27171y;
        if (num7 == null) {
            i20 = 0;
        } else {
            i20 = num7.intValue();
        }
        aVar11.f27171y = Integer.valueOf(i20);
        a aVar12 = this.f27151b;
        Integer num8 = aVar.f27172z;
        aVar12.f27172z = Integer.valueOf(num8 != null ? num8.intValue() : i22);
        obtainStyledAttributes.recycle();
        Locale locale2 = aVar.f27161g;
        if (locale2 == null) {
            a aVar13 = this.f27151b;
            if (Build.VERSION.SDK_INT >= 24) {
                locale = Locale.getDefault(Locale.Category.FORMAT);
            } else {
                locale = Locale.getDefault();
            }
            aVar13.f27161g = locale;
        } else {
            this.f27151b.f27161g = locale2;
        }
        this.f27150a = aVar;
    }

    /* compiled from: BadgeState */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0272a();

        /* renamed from: a  reason: collision with root package name */
        public int f27155a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f27156b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f27157c;

        /* renamed from: d  reason: collision with root package name */
        public int f27158d = 255;

        /* renamed from: e  reason: collision with root package name */
        public int f27159e = -2;

        /* renamed from: f  reason: collision with root package name */
        public int f27160f = -2;

        /* renamed from: g  reason: collision with root package name */
        public Locale f27161g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f27162h;

        /* renamed from: i  reason: collision with root package name */
        public int f27163i;

        /* renamed from: r  reason: collision with root package name */
        public int f27164r;

        /* renamed from: s  reason: collision with root package name */
        public Integer f27165s;

        /* renamed from: t  reason: collision with root package name */
        public Boolean f27166t = Boolean.TRUE;

        /* renamed from: u  reason: collision with root package name */
        public Integer f27167u;

        /* renamed from: v  reason: collision with root package name */
        public Integer f27168v;

        /* renamed from: w  reason: collision with root package name */
        public Integer f27169w;

        /* renamed from: x  reason: collision with root package name */
        public Integer f27170x;

        /* renamed from: y  reason: collision with root package name */
        public Integer f27171y;

        /* renamed from: z  reason: collision with root package name */
        public Integer f27172z;

        /* renamed from: w8.c$a$a  reason: collision with other inner class name */
        /* compiled from: BadgeState */
        public class C0272a implements Parcelable.Creator<a> {
            public Object createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            public Object[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f27155a);
            parcel.writeSerializable(this.f27156b);
            parcel.writeSerializable(this.f27157c);
            parcel.writeInt(this.f27158d);
            parcel.writeInt(this.f27159e);
            parcel.writeInt(this.f27160f);
            CharSequence charSequence = this.f27162h;
            parcel.writeString(charSequence == null ? null : charSequence.toString());
            parcel.writeInt(this.f27163i);
            parcel.writeSerializable(this.f27165s);
            parcel.writeSerializable(this.f27167u);
            parcel.writeSerializable(this.f27168v);
            parcel.writeSerializable(this.f27169w);
            parcel.writeSerializable(this.f27170x);
            parcel.writeSerializable(this.f27171y);
            parcel.writeSerializable(this.f27172z);
            parcel.writeSerializable(this.f27166t);
            parcel.writeSerializable(this.f27161g);
        }

        public a(Parcel parcel) {
            this.f27155a = parcel.readInt();
            this.f27156b = (Integer) parcel.readSerializable();
            this.f27157c = (Integer) parcel.readSerializable();
            this.f27158d = parcel.readInt();
            this.f27159e = parcel.readInt();
            this.f27160f = parcel.readInt();
            this.f27162h = parcel.readString();
            this.f27163i = parcel.readInt();
            this.f27165s = (Integer) parcel.readSerializable();
            this.f27167u = (Integer) parcel.readSerializable();
            this.f27168v = (Integer) parcel.readSerializable();
            this.f27169w = (Integer) parcel.readSerializable();
            this.f27170x = (Integer) parcel.readSerializable();
            this.f27171y = (Integer) parcel.readSerializable();
            this.f27172z = (Integer) parcel.readSerializable();
            this.f27166t = (Boolean) parcel.readSerializable();
            this.f27161g = (Locale) parcel.readSerializable();
        }
    }
}

package dev.pankaj.ytvlib.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import fb.b;
import o1.q;
import ud.k;

@Keep
/* compiled from: Category.kt */
public final class Category implements Parcelable {
    public static final Parcelable.Creator<Category> CREATOR = new a();
    @b("child_count")
    private final long childCount;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private final long f13482id;
    @b("logo")
    private final String logo;
    @b("name")
    private final String name;

    /* compiled from: Category.kt */
    public static final class a implements Parcelable.Creator<Category> {
        public Object createFromParcel(Parcel parcel) {
            k.f(parcel, "parcel");
            return new Category(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        public Object[] newArray(int i10) {
            return new Category[i10];
        }
    }

    public Category(long j10, String str, String str2, long j11) {
        k.f(str, "name");
        k.f(str2, "logo");
        this.f13482id = j10;
        this.name = str;
        this.logo = str2;
        this.childCount = j11;
    }

    public static /* synthetic */ Category copy$default(Category category, long j10, String str, String str2, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = category.f13482id;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            str = category.name;
        }
        String str3 = str;
        if ((i10 & 4) != 0) {
            str2 = category.logo;
        }
        String str4 = str2;
        if ((i10 & 8) != 0) {
            j11 = category.childCount;
        }
        return category.copy(j12, str3, str4, j11);
    }

    public final long component1() {
        return this.f13482id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.logo;
    }

    public final long component4() {
        return this.childCount;
    }

    public final Category copy(long j10, String str, String str2, long j11) {
        k.f(str, "name");
        k.f(str2, "logo");
        return new Category(j10, str, str2, j11);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Category)) {
            return false;
        }
        Category category = (Category) obj;
        return this.f13482id == category.f13482id && k.a(this.name, category.name) && k.a(this.logo, category.logo) && this.childCount == category.childCount;
    }

    public final long getChildCount() {
        return this.childCount;
    }

    public final boolean getHasChild() {
        return this.childCount > 0;
    }

    public final long getId() {
        return this.f13482id;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        long j10 = this.f13482id;
        int a10 = q.a(this.logo, q.a(this.name, ((int) (j10 ^ (j10 >>> 32))) * 31, 31), 31);
        long j11 = this.childCount;
        return a10 + ((int) ((j11 >>> 32) ^ j11));
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("Category(id=");
        a10.append(this.f13482id);
        a10.append(", name=");
        a10.append(this.name);
        a10.append(", logo=");
        a10.append(this.logo);
        a10.append(", childCount=");
        a10.append(this.childCount);
        a10.append(')');
        return a10.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        k.f(parcel, "out");
        parcel.writeLong(this.f13482id);
        parcel.writeString(this.name);
        parcel.writeString(this.logo);
        parcel.writeLong(this.childCount);
    }
}

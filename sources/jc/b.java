package jc;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.a;
import dev.pankaj.ytvlib.data.model.Category;
import java.io.Serializable;
import o1.d;
import ud.k;

/* compiled from: ChannelFragmentArgs.kt */
public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public final Category f19739a;

    public b(Category category) {
        this.f19739a = category;
    }

    public static final b fromBundle(Bundle bundle) {
        k.f(bundle, "bundle");
        bundle.setClassLoader(b.class.getClassLoader());
        if (!bundle.containsKey("category")) {
            throw new IllegalArgumentException("Required argument \"category\" is missing and does not have an android:defaultValue");
        } else if (Parcelable.class.isAssignableFrom(Category.class) || Serializable.class.isAssignableFrom(Category.class)) {
            Category category = (Category) bundle.get("category");
            if (category != null) {
                return new b(category);
            }
            throw new IllegalArgumentException("Argument \"category\" is marked as non-null but was passed a null value.");
        } else {
            throw new UnsupportedOperationException(Category.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && k.a(this.f19739a, ((b) obj).f19739a);
    }

    public int hashCode() {
        return this.f19739a.hashCode();
    }

    public String toString() {
        StringBuilder a10 = a.a("ChannelFragmentArgs(category=");
        a10.append(this.f19739a);
        a10.append(')');
        return a10.toString();
    }
}

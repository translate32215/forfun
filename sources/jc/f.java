package jc;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.a;
import com.startapp.startappsdk.R;
import dev.pankaj.ytvlib.data.model.Category;
import java.io.Serializable;
import o1.s;
import ud.k;

/* compiled from: LiveTvFragmentDirections.kt */
public final class f implements s {

    /* renamed from: a  reason: collision with root package name */
    public final Category f19744a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19745b = R.id.action_tvFragment_to_channelFragment;

    public f(Category category) {
        this.f19744a = category;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(Category.class)) {
            bundle.putParcelable("category", this.f19744a);
        } else if (Serializable.class.isAssignableFrom(Category.class)) {
            bundle.putSerializable("category", (Serializable) this.f19744a);
        } else {
            throw new UnsupportedOperationException(Category.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return bundle;
    }

    public int b() {
        return this.f19745b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && k.a(this.f19744a, ((f) obj).f19744a);
    }

    public int hashCode() {
        return this.f19744a.hashCode();
    }

    public String toString() {
        StringBuilder a10 = a.a("ActionTvFragmentToChannelFragment(category=");
        a10.append(this.f19744a);
        a10.append(')');
        return a10.toString();
    }
}

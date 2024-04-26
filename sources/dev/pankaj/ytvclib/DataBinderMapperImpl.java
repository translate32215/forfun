package dev.pankaj.ytvclib;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.b;
import androidx.databinding.c;
import com.startapp.startappsdk.R;
import java.util.ArrayList;
import java.util.List;
import tc.d;
import tc.f;
import tc.h;
import tc.j;

public class DataBinderMapperImpl extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f13426a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(5);
        f13426a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_control, 1);
        sparseIntArray.put(R.layout.activity_pk_ad, 2);
        sparseIntArray.put(R.layout.activity_player, 3);
        sparseIntArray.put(R.layout.activity_web, 4);
        sparseIntArray.put(R.layout.list_stream, 5);
    }

    public List<b> a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    public ViewDataBinding b(c cVar, View view, int i10) {
        int i11 = f13426a.get(i10);
        if (i11 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        } else if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        if ("layout/list_stream_0".equals(tag)) {
                            return new j(cVar, view);
                        }
                        throw new IllegalArgumentException("The tag for list_stream is invalid. Received: " + tag);
                    } else if ("layout/activity_web_0".equals(tag)) {
                        return new h(cVar, view);
                    } else {
                        throw new IllegalArgumentException("The tag for activity_web is invalid. Received: " + tag);
                    }
                } else if ("layout/activity_player_0".equals(tag)) {
                    return new f(cVar, view);
                } else {
                    throw new IllegalArgumentException("The tag for activity_player is invalid. Received: " + tag);
                }
            } else if ("layout/activity_pk_ad_0".equals(tag)) {
                return new d(cVar, view);
            } else {
                throw new IllegalArgumentException("The tag for activity_pk_ad is invalid. Received: " + tag);
            }
        } else if ("layout/activity_control_0".equals(tag)) {
            return new tc.b(cVar, view);
        } else {
            throw new IllegalArgumentException("The tag for activity_control is invalid. Received: " + tag);
        }
    }

    public ViewDataBinding c(c cVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f13426a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}

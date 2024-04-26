package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;
import n0.c;

/* compiled from: DateSelector */
public interface d<S> extends Parcelable {
    Collection<c<Long, Long>> D();

    boolean E();

    Collection<Long> G();

    S H();

    void K(long j10);

    View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, a aVar, x<S> xVar);

    String c(Context context);

    int f(Context context);
}

package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.ob;
import com.startapp.wb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: Sta */
public class MetaDataStyle implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final Integer f12423a = 18;

    /* renamed from: b  reason: collision with root package name */
    public static final Integer f12424b = -1;

    /* renamed from: c  reason: collision with root package name */
    public static final Set<String> f12425c = new HashSet(Arrays.asList(new String[]{"BOLD"}));

    /* renamed from: d  reason: collision with root package name */
    public static final Integer f12426d = 14;

    /* renamed from: e  reason: collision with root package name */
    public static final Integer f12427e = -1;

    /* renamed from: f  reason: collision with root package name */
    public static final Set<String> f12428f = new HashSet();
    private static final long serialVersionUID = -8172457405775076403L;
    private Integer itemDescriptionTextColor = f12427e;
    @ob(type = HashSet.class)
    private Set<String> itemDescriptionTextDecoration = f12428f;
    private Integer itemDescriptionTextSize = f12426d;
    private Integer itemGradientBottom = -8750199;
    private Integer itemGradientTop = -14014151;
    private Integer itemTitleTextColor = f12424b;
    @ob(type = HashSet.class)
    private Set<String> itemTitleTextDecoration = f12425c;
    private Integer itemTitleTextSize = f12423a;
    private String name = "";

    public Integer a() {
        return this.itemDescriptionTextColor;
    }

    public Set<String> b() {
        return this.itemDescriptionTextDecoration;
    }

    public Integer c() {
        return this.itemDescriptionTextSize;
    }

    public Integer d() {
        return this.itemGradientBottom;
    }

    public Integer e() {
        return this.itemGradientTop;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetaDataStyle metaDataStyle = (MetaDataStyle) obj;
        if (!wb.a(this.name, metaDataStyle.name) || !wb.a(this.itemGradientTop, metaDataStyle.itemGradientTop) || !wb.a(this.itemGradientBottom, metaDataStyle.itemGradientBottom) || !wb.a(this.itemTitleTextSize, metaDataStyle.itemTitleTextSize) || !wb.a(this.itemTitleTextColor, metaDataStyle.itemTitleTextColor) || !wb.a(this.itemTitleTextDecoration, metaDataStyle.itemTitleTextDecoration) || !wb.a(this.itemDescriptionTextSize, metaDataStyle.itemDescriptionTextSize) || !wb.a(this.itemDescriptionTextColor, metaDataStyle.itemDescriptionTextColor) || !wb.a(this.itemDescriptionTextDecoration, metaDataStyle.itemDescriptionTextDecoration)) {
            return false;
        }
        return true;
    }

    public Integer f() {
        return this.itemTitleTextColor;
    }

    public Set<String> g() {
        return this.itemTitleTextDecoration;
    }

    public Integer h() {
        return this.itemTitleTextSize;
    }

    public int hashCode() {
        Object[] objArr = {this.name, this.itemGradientTop, this.itemGradientBottom, this.itemTitleTextSize, this.itemTitleTextColor, this.itemTitleTextDecoration, this.itemDescriptionTextSize, this.itemDescriptionTextColor, this.itemDescriptionTextDecoration};
        Map<Activity, Integer> map = wb.f12765a;
        return Arrays.deepHashCode(objArr);
    }
}

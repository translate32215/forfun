package com.google.android.gms.internal.gtm;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public class zzcu extends zzbt {
    public final zzct zza;

    public zzcu(zzbx zzbx, zzct zzct) {
        super(zzbx);
        this.zza = zzct;
    }

    public final zzcs zza(int i10) {
        try {
            return zzb(zzt().zzb().getResources().getXml(i10));
        } catch (Resources.NotFoundException e10) {
            zzR("inflate() called with unknown resourceId", e10);
            return null;
        }
    }

    public final zzcs zzb(XmlResourceParser xmlResourceParser) {
        try {
            xmlResourceParser.next();
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (xmlResourceParser.getEventType() == 2) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.US);
                    if (lowerCase.equals("screenname")) {
                        String attributeValue = xmlResourceParser.getAttributeValue((String) null, "name");
                        String trim = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue) && !TextUtils.isEmpty(trim)) {
                            this.zza.zzb(attributeValue, trim);
                        }
                    } else if (lowerCase.equals("string")) {
                        String attributeValue2 = xmlResourceParser.getAttributeValue((String) null, "name");
                        String trim2 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue2) && trim2 != null) {
                            this.zza.zze(attributeValue2, trim2);
                        }
                    } else if (lowerCase.equals("bool")) {
                        String attributeValue3 = xmlResourceParser.getAttributeValue((String) null, "name");
                        String trim3 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue3) && !TextUtils.isEmpty(trim3)) {
                            try {
                                this.zza.zzc(attributeValue3, Boolean.parseBoolean(trim3));
                            } catch (NumberFormatException e10) {
                                zzS("Error parsing bool configuration value", trim3, e10);
                            }
                        }
                    } else if (lowerCase.equals("integer")) {
                        String attributeValue4 = xmlResourceParser.getAttributeValue((String) null, "name");
                        String trim4 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue4) && !TextUtils.isEmpty(trim4)) {
                            try {
                                this.zza.zzd(attributeValue4, Integer.parseInt(trim4));
                            } catch (NumberFormatException e11) {
                                zzS("Error parsing int configuration value", trim4, e11);
                            }
                        }
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (XmlPullParserException e12) {
            zzJ("Error parsing tracker configuration file", e12);
        } catch (IOException e13) {
            zzJ("Error parsing tracker configuration file", e13);
        }
        return this.zza.zza();
    }
}

package com.startapp.sdk.adsbase;

import androidx.activity.e;
import com.startapp.b1;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Sta */
public abstract class BaseResponse implements Serializable {
    private static final long serialVersionUID = 1;
    private String errorMessage = null;
    public Map<String, String> parameters = new HashMap();
    private boolean validResponse = true;

    public String a() {
        return this.errorMessage;
    }

    public boolean b() {
        return this.validResponse;
    }

    public String toString() {
        StringBuilder a10 = b1.a("BaseResponse [parameters=");
        a10.append(this.parameters);
        a10.append(", validResponse=");
        a10.append(this.validResponse);
        a10.append(", errorMessage=");
        return e.a(a10, this.errorMessage, "]");
    }
}

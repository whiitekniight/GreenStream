package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Purchase {

    /* JADX INFO: renamed from: ʽ */
    public final JSONObject f1619;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f1620;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f1621;

    public Purchase(String r1, String r2) {
        this.f1621 = r1;
        this.f1620 = r2;
        this.f1619 = new JSONObject(r1);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Purchase) == true) goto L8;
        return false;
    L8:
        Purchase r52 = (Purchase) r5;
        if (TextUtils.equals(this.f1621, r52.f1621) == true) goto L11;
    L13:
        return false;
    L11:
        if (TextUtils.equals(this.f1620, r52.f1620) == false) goto L13;
        return true;
    }

    public final int hashCode() {
        return this.f1621.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f1621));
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final ArrayList m1156() {
        ArrayList r0 = new ArrayList();
        JSONObject r1 = this.f1619;
        if (r1.has("productIds") == false) goto L11;
        JSONArray r12 = r1.optJSONArray("productIds");
        if (r12 == null) goto L13;
        int r2 = 0;
    L8:
        if (r2 >= r12.length()) goto L13;
        r0.add(r12.optString(r2));
        r2 = r2 + 1;
    L13:
        return r0;
    L11:
        if (r1.has("productId") == false) goto L13;
        r0.add(r1.optString("productId"));
        goto L13
    }
}

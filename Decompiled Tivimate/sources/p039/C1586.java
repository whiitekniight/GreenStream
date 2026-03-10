package p039;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: ʼٴ.ٴﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C1586 {

    /* JADX INFO: renamed from: ʼˎ */
    public final ArrayList f5246;

    /* JADX INFO: renamed from: ʽ */
    public final String f5247;

    /* JADX INFO: renamed from: ˈ */
    public final String f5248;

    /* JADX INFO: renamed from: ˑﹳ */
    public final String f5249;

    /* JADX INFO: renamed from: ᵎﹶ */
    public final String f5250;

    /* JADX INFO: renamed from: ᵔᵢ */
    public final ArrayList f5251;

    /* JADX INFO: renamed from: ⁱˊ */
    public final JSONObject f5252;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f5253;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final String f5254;

    public C1586(String r7) {
        this.f5253 = r7;
        JSONObject r0 = new JSONObject(r7);
        this.f5252 = r0;
        String r72 = r0.optString("productId");
        this.f5247 = r72;
        String r1 = r0.optString("type");
        this.f5248 = r1;
        if (TextUtils.isEmpty(r72) == true) goto L36;
        if (TextUtils.isEmpty(r1) == true) goto L34;
        this.f5249 = r0.optString("title");
        r0.optString("name");
        r0.optString("description");
        r0.optString("packageDisplayName");
        r0.optString("iconUrl");
        this.f5254 = r0.optString("skuDetailsToken");
        this.f5250 = r0.optString("serializedDocid");
        JSONArray r73 = r0.optJSONArray("subscriptionOfferDetails");
        int r2 = 0;
        if (r73 == null) goto L14;
        ArrayList r12 = new ArrayList();
        int r3 = 0;
    L10:
        if (r3 >= r73.length()) goto L12;
        r12.add(new C1574(r73.getJSONObject(r3)));
        r3 = r3 + 1;
        goto L10
    L12:
        this.f5251 = r12;
    L21:
        JSONObject r74 = this.f5252.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray r13 = this.f5252.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList r32 = new ArrayList();
        if (r13 != null) goto L24;
        if (r74 == null) goto L31;
        r32.add(new C1589(r74));
        this.f5246 = r32;
        return;
    L31:
        this.f5246 = null;
        return;
    L24:
        if (r2 >= r13.length()) goto L26;
        r32.add(new C1589(r13.getJSONObject(r2)));
        r2 = r2 + 1;
        goto L24
    L26:
        this.f5246 = r32;
        return;
    L14:
        if (r1.equals("subs") == false) goto L16;
    L19:
        ArrayList r75 = new ArrayList();
    L20:
        this.f5251 = r75;
        goto L21
    L16:
        if (r1.equals("play_pass_subs") == true) goto L19;
        r75 = null;
        goto L20
    L34:
        throw new IllegalArgumentException("Product type cannot be empty.");
    L36:
        throw new IllegalArgumentException("Product id cannot be empty.");
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof C1586) == true) goto L10;
        return false;
    L10:
        return TextUtils.equals(this.f5253, ((C1586) r2).f5253);
    }

    public final int hashCode() {
        return this.f5253.hashCode();
    }

    public final String toString() {
        return "ProductDetails{jsonString='" + this.f5253 + "', parsedJson=" + this.f5252.toString() + ", productId='" + this.f5247 + "', productType='" + this.f5248 + "', title='" + this.f5249 + "', productDetailsToken='" + this.f5254 + "', subscriptionOfferDetails=" + String.valueOf(this.f5251) + "}";
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final C1589 m4201() {
        ArrayList r0 = this.f5246;
        if (r0 != null) goto L5;
        return null;
    L5:
        if (r0.isEmpty() == false) goto L7;
        return null;
    L7:
        return (C1589) r0.get(0);
    }
}

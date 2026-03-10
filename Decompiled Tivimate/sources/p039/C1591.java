package p039;

import org.json.JSONObject;

/* JADX INFO: renamed from: ʼٴ.ᵔᵢ */
/* JADX INFO: loaded from: classes.dex */
public final class C1591 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f5263;

    public C1591(JSONObject r2) {
        r2.optString("billingPeriod");
        r2.optString("priceCurrencyCode");
        this.f5263 = r2.optString("formattedPrice");
        r2.optLong("priceAmountMicros");
        r2.optInt("recurrenceMode");
        r2.optInt("billingCycleCount");
    }
}

package p039;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: ʼٴ.ˆʾ */
/* JADX INFO: loaded from: classes.dex */
public final class C1574 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final C1567 f5197;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f5198;

    public C1574(JSONObject r4) {
        r4.optString("basePlanId");
        r4.optString("offerId").getClass();
        this.f5198 = r4.getString("offerIdToken");
        this.f5197 = new C1567(r4.getJSONArray("pricingPhases"));
        JSONObject r1 = r4.optJSONObject("installmentPlanDetails");
        if (r1 == null) goto L6;
        r1.getInt("commitmentPaymentsCount");
        r1.optInt("subsequentCommitmentPaymentsCount");
    L6:
        JSONObject r12 = r4.optJSONObject("transitionPlanDetails");
        if (r12 == null) goto L12;
        r12.getString("productId");
        r12.optString("title");
        r12.optString("name");
        r12.optString("description");
        r12.optString("basePlanId");
        JSONObject r0 = r12.optJSONObject("pricingPhase");
        if (r0 == null) goto L12;
        r0.optString("billingPeriod");
        r0.optString("priceCurrencyCode");
        r0.optString("formattedPrice");
        r0.optLong("priceAmountMicros");
        r0.optInt("recurrenceMode");
        r0.optInt("billingCycleCount");
    L12:
        ArrayList r02 = new ArrayList();
        JSONArray r42 = r4.optJSONArray("offerTags");
        if (r42 == null) goto L18;
        int r13 = 0;
    L16:
        if (r13 >= r42.length()) goto L20;
        r02.add(r42.getString(r13));
        r13 = r13 + 1;
        goto L16
    L20:
        return;
    }
}

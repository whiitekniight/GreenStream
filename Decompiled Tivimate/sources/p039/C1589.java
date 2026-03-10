package p039;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import ٴﾞ.ˆʾ;

/* JADX INFO: renamed from: ʼٴ.ᵎﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C1589 {

    /* JADX INFO: renamed from: ʽ */
    public final ArrayList f5258;

    /* JADX INFO: renamed from: ˈ */
    public final String f5259;

    /* JADX INFO: renamed from: ˑﹳ */
    public final ˆʾ f5260;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f5261;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f5262;

    public C1589(JSONObject r7) {
        this.f5262 = r7.optString("formattedPrice");
        r7.optLong("priceAmountMicros");
        r7.optString("priceCurrencyCode");
        String r0 = r7.optString("offerIdToken");
        ˆʾ r3 = null;
        if (true != r0.isEmpty()) goto L5;
        r0 = null;
    L5:
        this.f5261 = r0;
        r7.optString("offerId").getClass();
        r7.optString("purchaseOptionId").getClass();
        r7.optInt("offerType");
        JSONArray r02 = r7.optJSONArray("offerTags");
        this.f5258 = new ArrayList();
        int r1 = 0;
        if (r02 == null) goto L12;
        int r2 = 0;
    L9:
        if (r2 >= r02.length()) goto L12;
        this.f5258.add(r02.getString(r2));
        r2 = r2 + 1;
    L12:
        if (r7.has("fullPriceMicros") == false) goto L14;
        r7.optLong("fullPriceMicros");
    L14:
        JSONObject r03 = r7.optJSONObject("discountDisplayInfo");
        if (r03 != null) goto L18;
    L24:
        JSONObject r04 = r7.optJSONObject("validTimeWindow");
        if (r04 != null) goto L28;
    L33:
        JSONObject r05 = r7.optJSONObject("limitedQuantityInfo");
        if (r05 == null) goto L37;
        r05.getInt("maximumQuantity");
        r05.getInt("remainingQuantity");
    L37:
        this.f5259 = r7.optString("serializedDocid");
        JSONObject r06 = r7.optJSONObject("preorderDetails");
        if (r06 == null) goto L40;
        r06.getLong("preorderReleaseTimeMillis");
        r06.getLong("preorderPresaleEndTimeMillis");
    L40:
        JSONObject r07 = r7.optJSONObject("rentalDetails");
        if (r07 == null) goto L44;
        r07.getString("rentalPeriod");
        r07.optString("rentalExpirationPeriod").getClass();
    L44:
        JSONObject r08 = r7.optJSONObject("autoPayDetails");
        if (r08 == null) goto L48;
        r3 = new ˆʾ(5);
        r08.getString("type");
    L48:
        this.f5260 = r3;
        JSONArray r72 = r7.optJSONArray("pricingPhases");
        if (r72 == null) goto L58;
        ArrayList r09 = new ArrayList();
    L53:
        if (r1 >= r72.length()) goto L63;
        JSONObject r22 = r72.optJSONObject(r1);
        if (r22 == null) goto L57;
        r09.add(new C1591(r22));
    L57:
        r1 = r1 + 1;
        goto L53
    L63:
        return;
    L58:
        return;
    L28:
        if (r04.has("startTimeMillis") == false) goto L31;
        r04.optLong("startTimeMillis");
    L31:
        if (r04.has("endTimeMillis") == false) goto L33;
        r04.optLong("endTimeMillis");
        goto L33
    L18:
        if (r03.has("percentageDiscount") == false) goto L20;
        r03.optInt("percentageDiscount");
    L20:
        JSONObject r010 = r03.optJSONObject("discountAmount");
        if (r010 == null) goto L24;
        r010.optString("formattedDiscountAmount");
        r010.optLong("discountAmountMicros");
        r010.optString("discountAmountCurrencyCode");
        goto L24
    }
}

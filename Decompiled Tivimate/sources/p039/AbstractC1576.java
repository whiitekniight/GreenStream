package p039;

/* JADX INFO: renamed from: ʼٴ.ˈٴ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1576 {

    /* JADX INFO: renamed from: ʼˎ */
    public static final C1598 f5201 = null;

    /* JADX INFO: renamed from: ʼᐧ */
    public static final C1598 f5202 = null;

    /* JADX INFO: renamed from: ʽ */
    public static final C1598 f5203 = null;

    /* JADX INFO: renamed from: ˆʾ */
    public static final C1598 f5204 = null;

    /* JADX INFO: renamed from: ˈ */
    public static final C1598 f5205 = null;

    /* JADX INFO: renamed from: ˉʿ */
    public static final C1598 f5206 = null;

    /* JADX INFO: renamed from: ˉˆ */
    public static final C1598 f5207 = null;

    /* JADX INFO: renamed from: ˑﹳ */
    public static final C1598 f5208 = null;

    /* JADX INFO: renamed from: ٴﹶ */
    public static final C1598 f5209 = null;

    /* JADX INFO: renamed from: ᵎﹶ */
    public static final C1598 f5210 = null;

    /* JADX INFO: renamed from: ᵔʾ */
    public static final C1598 f5211 = null;

    /* JADX INFO: renamed from: ᵔᵢ */
    public static final C1598 f5212 = null;

    /* JADX INFO: renamed from: ᵔﹳ */
    public static final C1598 f5213 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C1598 f5214 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C1598 f5215 = null;

    /* JADX INFO: renamed from: ﹳᐧ */
    public static final C1598 f5216 = null;

    /* JADX INFO: renamed from: ﾞʻ */
    public static final C1598 f5217 = null;

    /* JADX INFO: renamed from: ﾞᴵ */
    public static final C1598 f5218 = null;

    static {
        C1582 r0 = C1598.m4238();
        r0.f5233 = 3;
        r0.f5231 = "Google Play In-app Billing API version is less than 3";
        r0.m4196();
        C1582 r02 = C1598.m4238();
        r02.f5233 = 3;
        r02.f5231 = "Google Play In-app Billing API version is less than 9";
        f5215 = r02.m4196();
        C1582 r03 = C1598.m4238();
        r03.f5233 = 3;
        r03.f5231 = "Billing service unavailable on device.";
        f5214 = r03.m4196();
        C1582 r04 = C1598.m4238();
        r04.f5233 = 2;
        r04.f5231 = "Billing service unavailable on device.";
        f5203 = r04.m4196();
        C1582 r05 = C1598.m4238();
        r05.f5233 = 5;
        r05.f5231 = "Client is already in the process of connecting to billing service.";
        f5205 = r05.m4196();
        C1582 r06 = C1598.m4238();
        r06.f5233 = 5;
        r06.f5231 = "The list of SKUs can't be empty.";
        r06.m4196();
        C1582 r07 = C1598.m4238();
        r07.f5233 = 5;
        r07.f5231 = "SKU type can't be empty.";
        r07.m4196();
        C1582 r08 = C1598.m4238();
        r08.f5233 = 5;
        r08.f5231 = "Product type can't be empty.";
        f5208 = r08.m4196();
        C1582 r09 = C1598.m4238();
        r09.f5233 = -2;
        r09.f5231 = "Client does not support extra params.";
        f5218 = r09.m4196();
        C1582 r010 = C1598.m4238();
        r010.f5233 = 5;
        r010.f5231 = "Invalid purchase token.";
        f5210 = r010.m4196();
        C1582 r011 = C1598.m4238();
        r011.f5233 = 6;
        r011.f5231 = "An internal error occurred.";
        f5212 = r011.m4196();
        C1582 r012 = C1598.m4238();
        r012.f5233 = 5;
        r012.f5231 = "SKU can't be null.";
        r012.m4196();
        C1582 r013 = C1598.m4238();
        r013.f5233 = 0;
        f5201 = r013.m4196();
        C1582 r014 = C1598.m4238();
        r014.f5233 = -1;
        r014.f5231 = "Service connection is disconnected.";
        f5204 = r014.m4196();
        C1582 r015 = C1598.m4238();
        r015.f5233 = 2;
        r015.f5231 = "Timeout communicating with service.";
        f5209 = r015.m4196();
        C1582 r016 = C1598.m4238();
        r016.f5233 = -2;
        r016.f5231 = "Client does not support subscriptions.";
        f5217 = r016.m4196();
        C1582 r017 = C1598.m4238();
        r017.f5233 = -2;
        r017.f5231 = "Client does not support subscriptions update.";
        r017.m4196();
        C1582 r018 = C1598.m4238();
        r018.f5233 = -2;
        r018.f5231 = "Client does not support get purchase history.";
        r018.m4196();
        C1582 r019 = C1598.m4238();
        r019.f5233 = -2;
        r019.f5231 = "Client does not support price change confirmation.";
        r019.m4196();
        C1582 r020 = C1598.m4238();
        r020.f5233 = -2;
        r020.f5231 = "Play Store version installed does not support cross selling products.";
        r020.m4196();
        C1582 r021 = C1598.m4238();
        r021.f5233 = -2;
        r021.f5231 = "Client does not support multi-item purchases.";
        f5206 = r021.m4196();
        C1582 r022 = C1598.m4238();
        r022.f5233 = -2;
        r022.f5231 = "Client does not support offer_id_token.";
        f5211 = r022.m4196();
        C1582 r023 = C1598.m4238();
        r023.f5233 = -2;
        r023.f5231 = "Client does not support ProductDetails.";
        f5207 = r023.m4196();
        C1582 r024 = C1598.m4238();
        r024.f5233 = -2;
        r024.f5231 = "Client does not support in-app messages.";
        r024.m4196();
        C1582 r025 = C1598.m4238();
        r025.f5233 = -2;
        r025.f5231 = "Client does not support user choice billing.";
        r025.m4196();
        C1582 r026 = C1598.m4238();
        r026.f5233 = -2;
        r026.f5231 = "Play Store version installed does not support external offer.";
        r026.m4196();
        C1582 r027 = C1598.m4238();
        r027.f5233 = -2;
        r027.f5231 = "Play Store version installed does not support multi-item purchases with season pass in one cart.";
        r027.m4196();
        C1582 r028 = C1598.m4238();
        r028.f5233 = -2;
        r028.f5231 = "Play Store version installed does not support querying AutoPay plan purchase.";
        r028.m4196();
        C1582 r029 = C1598.m4238();
        r029.f5233 = -2;
        r029.f5231 = "Play Store version installed does not support including suspended subscriptions.";
        r029.m4196();
        C1582 r030 = C1598.m4238();
        r030.f5233 = 5;
        r030.f5231 = "Unknown feature";
        r030.m4196();
        C1582 r031 = C1598.m4238();
        r031.f5233 = -2;
        r031.f5231 = "Play Store version installed does not support get billing config.";
        r031.m4196();
        C1582 r032 = C1598.m4238();
        r032.f5233 = -2;
        r032.f5231 = "Query product details with serialized docid is not supported.";
        r032.m4196();
        C1582 r033 = C1598.m4238();
        r033.f5233 = -2;
        r033.f5231 = "Play Store version installed does not support launching external offer flow.";
        r033.m4196();
        C1582 r034 = C1598.m4238();
        r034.f5233 = 4;
        r034.f5231 = "Item is unavailable for purchase.";
        f5202 = r034.m4196();
        C1582 r035 = C1598.m4238();
        r035.f5233 = -2;
        r035.f5231 = "Query product details with developer specified account is not supported.";
        r035.m4196();
        C1582 r036 = C1598.m4238();
        r036.f5233 = -2;
        r036.f5231 = "Play Store version installed does not support alternative billing only.";
        r036.m4196();
        C1582 r037 = C1598.m4238();
        r037.f5233 = 5;
        r037.f5231 = "To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.";
        f5213 = r037.m4196();
        C1582 r038 = C1598.m4238();
        r038.f5233 = 6;
        r038.f5231 = "An error occurred while retrieving billing override.";
        f5216 = r038.m4196();
        C1582 r039 = C1598.m4238();
        r039.f5233 = -2;
        r039.f5231 = "Play Store version installed does not support the provided billing program.";
        r039.m4196();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static C1598 m4190(int r1, String r2) {
        C1582 r0 = C1598.m4238();
        r0.f5233 = r1;
        r0.f5231 = r2;
        return r0.m4196();
    }
}

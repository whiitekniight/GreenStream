package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.ˏי */
/* JADX INFO: loaded from: classes.dex */
public final class C0581 {

    /* JADX INFO: renamed from: ʽ */
    public final Object f2390;

    /* JADX INFO: renamed from: ⁱˊ */
    public final Object f2391;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Object f2392;

    public C0581(Object r1, Object r2, Object r3) {
        this.f2392 = r1;
        this.f2391 = r2;
        this.f2390 = r3;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final IllegalArgumentException m2230() {
        Object r1 = this.f2392;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(r1) + "=" + String.valueOf(this.f2391) + " and " + String.valueOf(r1) + "=" + String.valueOf(this.f2390));
    }
}

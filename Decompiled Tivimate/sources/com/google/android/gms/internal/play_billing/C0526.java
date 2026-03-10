package com.google.android.gms.internal.play_billing;

import p005j$.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.ʼʼ */
/* JADX INFO: loaded from: classes.dex */
public final class C0526 extends AbstractC0592 {

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final C0526 f2305 = null;

    /* JADX INFO: renamed from: ʽʽ */
    public final transient Object[] f2306;

    /* JADX INFO: renamed from: ˈٴ */
    public final transient int f2307;

    static {
        f2305 = new C0526(0, new Object[0]);
    }

    public C0526(int r1, Object[] r2) {
        this.f2306 = r2;
        this.f2307 = r1;
    }

    @Override // java.util.List
    public final Object get(int r2) {
        com.bumptech.glide.ˈ.ᵔי(r2, this.f2307);
        Object r22 = this.f2306[r2];
        Objects.requireNonNull(r22);
        return r22;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2307;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0530
    /* JADX INFO: renamed from: ˈ */
    public final int mo2091() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0530
    /* JADX INFO: renamed from: ᵎﹶ */
    public final Object[] mo2092() {
        return this.f2306;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0530
    /* JADX INFO: renamed from: ⁱˊ */
    public final int mo2093() {
        return this.f2307;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0592, com.google.android.gms.internal.play_billing.AbstractC0530
    /* JADX INFO: renamed from: ﹳٴ */
    public final int mo2094(Object[] r4) {
        Object[] r1 = this.f2306;
        int r2 = this.f2307;
        System.arraycopy(r1, 0, r4, 0, r2);
        return r2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0530
    /* JADX INFO: renamed from: ﾞᴵ */
    public final boolean mo2095() {
        return false;
    }
}

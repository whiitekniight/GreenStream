package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ʼﾞ */
/* JADX INFO: loaded from: classes.dex */
public final class C0270 extends C0364 {

    /* JADX INFO: renamed from: ˈٴ */
    public final int f1781;

    public C0270(int r2, byte[] r3) {
        super(r3);
        C0364.m1743(0, r2, r3.length);
        this.f1781 = r2;
    }

    @Override // com.google.android.gms.internal.measurement.C0364
    /* JADX INFO: renamed from: ˈ */
    public final int mo1293() {
        return this.f1781;
    }

    @Override // com.google.android.gms.internal.measurement.C0364
    /* JADX INFO: renamed from: ⁱˊ */
    public final byte mo1294(int r2) {
        return this.f2033[r2];
    }

    @Override // com.google.android.gms.internal.measurement.C0364
    /* JADX INFO: renamed from: ﹳٴ */
    public final byte mo1295(int r6) {
        int r1 = this.f1781;
        if (((r1 - (r6 + 1)) | r6) >= 0) goto L11;
        if (r6 >= 0) goto L8;
        StringBuilder r2 = new StringBuilder(String.valueOf(r6).length() + 11);
        r2.append("Index < 0: ");
        r2.append(r6);
        throw new ArrayIndexOutOfBoundsException(r2.toString());
    L8:
        int r22 = String.valueOf(r6).length();
        StringBuilder r4 = new StringBuilder((r22 + 18) + String.valueOf(r1).length());
        r4.append("Index > length: ");
        r4.append(r6);
        r4.append(", ");
        r4.append(r1);
        throw new ArrayIndexOutOfBoundsException(r4.toString());
    L11:
        return this.f2033[r6];
    }
}

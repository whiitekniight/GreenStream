package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ˈⁱ */
/* JADX INFO: loaded from: classes.dex */
public final class C0324 implements Parcelable.Creator {

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f1982;

    public /* synthetic */ C0324(int r1) {
        this.f1982 = r1;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel r14) {
        switch(this.f1982) {
            case 0: goto L19;
            default: goto L4;
        };
    L4:
        int r0 = ˈˆ.ﾞᴵ.ʿ(r14);
        String r1 = null;
        int r3 = 0;
        Intent r2 = null;
    L6:
        if (r14.dataPosition() >= r0) goto L17;
        int r4 = r14.readInt();
        char r5 = (char) r4;
        if (r5 != 1) goto L10;
        r3 = ˈˆ.ﾞᴵ.ˆﾞ(r14, r4);
        goto L6
    L10:
        if (r5 != 2) goto L12;
        r1 = ˈˆ.ﾞᴵ.ﾞʻ(r14, r4);
        goto L6
    L12:
        if (r5 != 3) goto L13;
        r2 = (Intent) ˈˆ.ﾞᴵ.ˆʾ(r14, r4, Intent.CREATOR);
        goto L6
    L13:
        ˈˆ.ﾞᴵ.ˊˋ(r14, r4);
        goto L6
    L17:
        ˈˆ.ﾞᴵ.ˉˆ(r14, r0);
        return new C0441(r3, r1, r2);
    L19:
        int r02 = ˈˆ.ﾞᴵ.ʿ(r14);
        Bundle r11 = null;
        String r12 = null;
        boolean r10 = false;
        long r6 = 0;
        long r8 = 0;
    L21:
        if (r14.dataPosition() >= r02) goto L38;
        int r13 = r14.readInt();
        char r22 = (char) r13;
        if (r22 != 1) goto L25;
        r6 = ˈˆ.ﾞᴵ.ᵔٴ(r14, r13);
        goto L21
    L25:
        if (r22 != 2) goto L27;
        r8 = ˈˆ.ﾞᴵ.ᵔٴ(r14, r13);
        goto L21
    L27:
        if (r22 != 3) goto L29;
        r10 = ˈˆ.ﾞᴵ.ᵔי(r14, r13);
        goto L21
    L29:
        if (r22 != 7) goto L31;
        r11 = ˈˆ.ﾞᴵ.ᵔᵢ(r14, r13);
        goto L21
    L31:
        if (r22 != '\b') goto L32;
        r12 = ˈˆ.ﾞᴵ.ﾞʻ(r14, r13);
        goto L21
    L32:
        ˈˆ.ﾞᴵ.ˊˋ(r14, r13);
        goto L21
    L38:
        ˈˆ.ﾞᴵ.ˉˆ(r14, r02);
        return new C0492(r6, r8, r10, r11, r12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r2) {
        switch(this.f1982) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new C0441[r2];
    L7:
        return new C0492[r2];
    }
}

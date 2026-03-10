package p218;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.ˏʻ;
import p317.AbstractC4214;

/* JADX INFO: renamed from: ˎᵎ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C3410 {

    /* JADX INFO: renamed from: ʽ */
    public final int f12024;

    /* JADX INFO: renamed from: ˈ */
    public final int f12025;

    /* JADX INFO: renamed from: ˑﹳ */
    public final int f12026;

    /* JADX INFO: renamed from: ⁱˊ */
    public final int f12027;

    /* JADX INFO: renamed from: ﹳٴ */
    public final int f12028;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final int f12029;

    public /* synthetic */ C3410(int r1, int r2, int r3, int r4, int r5, int r6) {
        this.f12028 = r1;
        this.f12027 = r2;
        this.f12024 = r3;
        this.f12025 = r4;
        this.f12026 = r5;
        this.f12029 = r6;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static C3410 m7168(String r10) {
        AbstractC4214.m8560(r10.startsWith("Format:"));
        String[] r102 = TextUtils.split(r10.substring(7), ",");
        int r4 = -1;
        int r5 = -1;
        int r6 = -1;
        int r7 = -1;
        int r8 = -1;
        int r2 = 0;
    L4:
        if (r2 >= r102.length) goto L36;
        String r3 = ˏʻ.ˈⁱ(r102[r2].trim());
        r3.getClass();
        switch(r3.hashCode()) {
            case 100571: goto L25;
            case 3556653: goto L21;
            case 102749521: goto L17;
            case 109757538: goto L13;
            case 109780401: goto L9;
            default: goto L7;
        };
    L7:
        byte r32 = -1;
    L28:
        switch(r32) {
            case 0: goto L34;
            case 1: goto L33;
            case 2: goto L32;
            case 3: goto L31;
            case 4: goto L30;
            default: goto L35;
        };
    L30:
        r7 = r2;
        goto L35
    L31:
        r5 = r2;
        goto L35
    L32:
        r4 = r2;
        goto L35
    L33:
        r8 = r2;
        goto L35
    L34:
        r6 = r2;
    L35:
        r2 = r2 + 1;
        goto L4
    L9:
        if (r3.equals("style") == false) goto L50;
        r32 = 4;
        goto L28
    L50:
        r32 = -1;
        goto L28
    L13:
        if (r3.equals("start") == false) goto L51;
        r32 = 3;
        goto L28
    L51:
        r32 = -1;
        goto L28
    L17:
        if (r3.equals("layer") == false) goto L52;
        r32 = 2;
        goto L28
    L52:
        r32 = -1;
        goto L28
    L21:
        if (r3.equals("text") == false) goto L53;
        r32 = 1;
        goto L28
    L53:
        r32 = -1;
        goto L28
    L25:
        if (r3.equals("end") == false) goto L54;
        r32 = 0;
        goto L28
    L54:
        r32 = -1;
        goto L28
    L36:
        if (r5 == (-1)) goto L41;
        if (r6 == (-1)) goto L55;
        if (r8 != (-1)) goto L40;
        return null;
    L40:
        return new C3410(r4, r5, r6, r7, r8, r102.length);
    L55:
        return null;
    L41:
        return null;
    }
}

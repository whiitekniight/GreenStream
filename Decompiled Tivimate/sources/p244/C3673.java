package p244;

import android.graphics.Rect;
import java.util.Arrays;
import p024.C1364;

/* JADX INFO: renamed from: ˑˉ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C3673 {

    /* JADX INFO: renamed from: ʼˎ */
    public int f13142;

    /* JADX INFO: renamed from: ʽ */
    public boolean f13143;

    /* JADX INFO: renamed from: ˈ */
    public int[] f13144;

    /* JADX INFO: renamed from: ˑﹳ */
    public int f13145;

    /* JADX INFO: renamed from: ᵎﹶ */
    public Rect f13146;

    /* JADX INFO: renamed from: ᵔᵢ */
    public int f13147;

    /* JADX INFO: renamed from: ⁱˊ */
    public boolean f13148;

    /* JADX INFO: renamed from: ﹳٴ */
    public final int[] f13149;

    /* JADX INFO: renamed from: ﾞᴵ */
    public int f13150;

    public C3673() {
        this.f13149 = new int[4];
        this.f13147 = -1;
        this.f13142 = -1;
    }

    /* JADX INFO: renamed from: ʽ */
    public static int m7722(int r1, int r2) {
        return (r1 & 16777215) | ((r2 * 17) << 24);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static int m7723(int[] r1, int r2) {
        if (r2 < 0) goto L8;
        if (r2 >= r1.length) goto L8;
        return r1[r2];
    L8:
        return r1[0];
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m7724(C1364 r10, boolean r11, Rect r12, int[] r13) {
        int r0 = r12.width();
        int r122 = r12.height();
        int r112 = !r11 ? 1 : 0;
        int r2 = r112 * r0;
    L3:
        int r4 = 0;
    L4:
        int r6 = 1;
        int r5 = 0;
    L6:
        if (r5 >= r6) goto L13;
        if (r6 > 64) goto L13;
        if (r10.m3820() < 4) goto L11;
        r5 = (r5 << 4) | r10.m3808(4);
        r6 = r6 << 2;
        goto L6
    L11:
        int r62 = -1;
        int r52 = 0;
    L17:
        int r53 = Math.min(r52, r0 - r4);
        if (r53 <= 0) goto L20;
        int r7 = r2 + r53;
        Arrays.fill(r13, r2, r7, this.f13149[r62]);
        r4 = r4 + r53;
        r2 = r7;
    L20:
        if (r4 < r0) goto L4;
        r112 = r112 + 2;
        if (r112 >= r122) goto L23;
        r2 = r112 * r0;
        r10.m3804();
        goto L3
    L23:
        return;
    L13:
        r62 = r5 & 3;
        if (r5 >= 4) goto L16;
        r52 = r0;
        goto L17
    L16:
        r52 = r5 >> 2;
        goto L17
    }
}

package p077;

import java.util.Arrays;

/* JADX INFO: renamed from: ʾˋ.ᵎﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C2088 {

    /* JADX INFO: renamed from: ʼˎ */
    public int f7332;

    /* JADX INFO: renamed from: ʽ */
    public int f7333;

    /* JADX INFO: renamed from: ˆʾ */
    public int[] f7334;

    /* JADX INFO: renamed from: ˈ */
    public int[] f7335;

    /* JADX INFO: renamed from: ˑﹳ */
    public float[] f7336;

    /* JADX INFO: renamed from: ٴﹶ */
    public boolean[] f7337;

    /* JADX INFO: renamed from: ᵎﹶ */
    public int[] f7338;

    /* JADX INFO: renamed from: ᵔᵢ */
    public String[] f7339;

    /* JADX INFO: renamed from: ⁱˊ */
    public int[] f7340;

    /* JADX INFO: renamed from: ﹳٴ */
    public int[] f7341;

    /* JADX INFO: renamed from: ﾞʻ */
    public int f7342;

    /* JADX INFO: renamed from: ﾞᴵ */
    public int f7343;

    /* JADX INFO: renamed from: ʽ */
    public final void m5093(int r4, String r5) {
        int r0 = this.f7332;
        int[] r1 = this.f7338;
        if (r0 < r1.length) goto L5;
        this.f7338 = Arrays.copyOf(r1, r1.length * 2);
        String[] r02 = this.f7339;
        this.f7339 = (String[]) Arrays.copyOf(r02, r02.length * 2);
    L5:
        int[] r03 = this.f7338;
        int r12 = this.f7332;
        r03[r12] = r4;
        String[] r42 = this.f7339;
        this.f7332 = r12 + 1;
        r42[r12] = r5;
    }

    /* JADX INFO: renamed from: ˈ */
    public final void m5094(int r4, boolean r5) {
        int r0 = this.f7342;
        int[] r1 = this.f7334;
        if (r0 < r1.length) goto L5;
        this.f7334 = Arrays.copyOf(r1, r1.length * 2);
        boolean[] r02 = this.f7337;
        this.f7337 = Arrays.copyOf(r02, r02.length * 2);
    L5:
        int[] r03 = this.f7334;
        int r12 = this.f7342;
        r03[r12] = r4;
        boolean[] r42 = this.f7337;
        this.f7342 = r12 + 1;
        r42[r12] = r5;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m5095(int r4, int r5) {
        int r0 = this.f7333;
        int[] r1 = this.f7341;
        if (r0 < r1.length) goto L5;
        this.f7341 = Arrays.copyOf(r1, r1.length * 2);
        int[] r02 = this.f7340;
        this.f7340 = Arrays.copyOf(r02, r02.length * 2);
    L5:
        int[] r03 = this.f7341;
        int r12 = this.f7333;
        r03[r12] = r4;
        int[] r42 = this.f7340;
        this.f7333 = r12 + 1;
        r42[r12] = r5;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m5096(int r4, float r5) {
        int r0 = this.f7343;
        int[] r1 = this.f7335;
        if (r0 < r1.length) goto L5;
        this.f7335 = Arrays.copyOf(r1, r1.length * 2);
        float[] r02 = this.f7336;
        this.f7336 = Arrays.copyOf(r02, r02.length * 2);
    L5:
        int[] r03 = this.f7335;
        int r12 = this.f7343;
        r03[r12] = r4;
        float[] r42 = this.f7336;
        this.f7343 = r12 + 1;
        r42[r12] = r5;
    }
}

package p108;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import ˈˆ.ﾞᴵ;

/* JADX INFO: renamed from: ˆʾ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C2373 extends ﾞᴵ {

    /* JADX INFO: renamed from: ˈ */
    public final ObjectAnimator f8478;

    /* JADX INFO: renamed from: ˑﹳ */
    public final boolean f8479;

    public C2373(AnimationDrawable r10, boolean r11, boolean r12) {
        int r0 = r10.getNumberOfFrames();
        int r1 = 0;
        if (r11 == false) goto L5;
        int r2 = r0 - 1;
    L7:
        if (r11 == false) goto L9;
        int r02 = 0;
    L10:
        C2374 r4 = new C2374();
        int r5 = r10.getNumberOfFrames();
        r4.f8481 = r5;
        int[] r6 = r4.f8482;
        if (r6 != null) goto L13;
    L14:
        r4.f8482 = new int[r5];
    L15:
        int[] r62 = r4.f8482;
        int r7 = 0;
    L16:
        if (r1 >= r5) goto L21;
        if (r11 == false) goto L19;
        int r8 = (r5 - r1) - 1;
    L20:
        int r82 = r10.getDuration(r8);
        r62[r1] = r82;
        r7 = r7 + r82;
        r1 = r1 + 1;
        goto L16
    L19:
        r8 = r1;
        goto L20
    L21:
        r4.f8480 = r7;
        ObjectAnimator r102 = ObjectAnimator.ofInt(r10, "currentIndex", new int[]{r2, r02});
        r102.setAutoCancel(true);
        r102.setDuration(r4.f8480);
        r102.setInterpolator(r4);
        this.f8479 = r12;
        this.f8478 = r102;
        return;
    L13:
        if (r6.length >= r5) goto L15;
    L9:
        r02 = r0 - 1;
        goto L10
    L5:
        r2 = 0;
        goto L7
    }

    /* JADX INFO: renamed from: ˑٴ */
    public final void m5526() {
        this.f8478.reverse();
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final boolean m5527() {
        return this.f8479;
    }

    /* JADX INFO: renamed from: ـˏ */
    public final void m5528() {
        this.f8478.start();
    }

    /* JADX INFO: renamed from: ﹳـ */
    public final void m5529() {
        this.f8478.cancel();
    }
}

package p469;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.Surface;
import p170.AbstractC3011;
import p317.AbstractC4214;

/* JADX INFO: renamed from: ﾞˏ.ᵢˏ */
/* JADX INFO: loaded from: classes.dex */
public final class C5888 {

    /* JADX INFO: renamed from: ʼˎ */
    public float f21572;

    /* JADX INFO: renamed from: ʼᐧ */
    public long f21573;

    /* JADX INFO: renamed from: ʽ */
    public final ChoreographerFrameCallbackC5864 f21574;

    /* JADX INFO: renamed from: ˆʾ */
    public int f21575;

    /* JADX INFO: renamed from: ˈ */
    public boolean f21576;

    /* JADX INFO: renamed from: ˉʿ */
    public long f21577;

    /* JADX INFO: renamed from: ˉˆ */
    public long f21578;

    /* JADX INFO: renamed from: ˑﹳ */
    public Surface f21579;

    /* JADX INFO: renamed from: ٴﹶ */
    public long f21580;

    /* JADX INFO: renamed from: ᵎﹶ */
    public float f21581;

    /* JADX INFO: renamed from: ᵔʾ */
    public long f21582;

    /* JADX INFO: renamed from: ᵔᵢ */
    public float f21583;

    /* JADX INFO: renamed from: ᵔﹳ */
    public long f21584;

    /* JADX INFO: renamed from: ⁱˊ */
    public final C5871 f21585;

    /* JADX INFO: renamed from: ﹳٴ */
    public final C5893 f21586;

    /* JADX INFO: renamed from: ﾞʻ */
    public long f21587;

    /* JADX INFO: renamed from: ﾞᴵ */
    public float f21588;

    public C5888(Context r5) {
        C5893 r0 = new C5893();
        r0.f21609 = new C5878();
        r0.f21608 = new C5878();
        r0.f21606 = -9223372036854775807L;
        this.f21586 = r0;
        ChoreographerFrameCallbackC5864 r02 = null;
        if (r5 != null) goto L5;
    L4:
        C5871 r3 = null;
    L8:
        this.f21585 = r3;
        if (r3 == null) goto L11;
        r02 = ChoreographerFrameCallbackC5864.f21440;
    L11:
        this.f21574 = r02;
        this.f21580 = -9223372036854775807L;
        this.f21587 = -9223372036854775807L;
        this.f21588 = -1.0f;
        this.f21572 = 1.0f;
        this.f21575 = 0;
        return;
    L5:
        DisplayManager r52 = (DisplayManager) r5.getSystemService("display");
        if (r52 == null) goto L4;
        r3 = new C5871(this, r52);
        goto L8
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static void m11548(C5888 r4, Display r5) {
        if (r5 == null) goto L5;
        long r0 = (long) (1.0E9d / ((double) r5.getRefreshRate()));
        r4.f21580 = r0;
        r4.f21587 = (r0 * 80) / 100;
        return;
    L5:
        AbstractC4214.m8561("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        r4.f21580 = -9223372036854775807L;
        r4.f21587 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m11549() {
        if (Build.VERSION.SDK_INT >= 30) goto L5;
        return;
    L5:
        if (this.f21579 == null) goto L47;
        C5893 r0 = this.f21586;
        if (r0.f21609.m11544() == true) goto L10;
        float r2 = this.f21588;
    L18:
        float r4 = this.f21581;
        if (r2 != r4) goto L22;
        return;
    L22:
        if (r2 != (-1.0f)) goto L24;
    L38:
        if (r2 == (-1.0f)) goto L41;
    L42:
        this.f21581 = r2;
        m11550(false);
        return;
    L41:
        if (r0.f21607 >= 30) goto L42;
        return;
    L24:
        if (r4 == (-1.0f)) goto L38;
        if (r0.f21609.m11544() == true) goto L28;
    L34:
        float r02 = 1.0f;
    L36:
        if (Math.abs(r2 - this.f21581) >= r02) goto L42;
        return;
    L28:
        if (r0.f21609.m11544() == false) goto L30;
        long r03 = r0.f21609.f21532;
    L32:
        if (r03 < 5000000000L) goto L34;
        r02 = 0.02f;
        goto L36
    L30:
        r03 = -9223372036854775807L;
        goto L32
    L10:
        if (r0.f21609.m11544() == false) goto L16;
        C5878 r22 = r0.f21609;
        long r42 = r22.f21527;
        long r6 = 0;
        if (r42 == 0) goto L15;
        r6 = r22.f21532 / r42;
    L15:
        r2 = (float) (1.0E9d / r6);
        goto L18
    L16:
        r2 = -1.0f;
        goto L18
    }

    /* JADX INFO: renamed from: ˈ */
    public final void m11550(boolean r4) {
        if (Build.VERSION.SDK_INT < 30) goto L21;
        Surface r0 = this.f21579;
        if (r0 != null) goto L7;
        return;
    L7:
        if (this.f21575 != Integer.MIN_VALUE) goto L10;
        return;
    L10:
        if (this.f21576 == false) goto L14;
        float r1 = this.f21581;
        if (r1 == (-1.0f)) goto L14;
        float r12 = r1 * this.f21572;
    L15:
        if (r4 == false) goto L17;
    L19:
        this.f21583 = r12;
        AbstractC3011.m6363(r0, r12);
        return;
    L17:
        if (this.f21583 != r12) goto L19;
        return;
    L14:
        r12 = 0.0f;
        goto L15
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m11551() {
        if (Build.VERSION.SDK_INT < 30) goto L13;
        Surface r0 = this.f21579;
        if (r0 != null) goto L7;
        return;
    L7:
        if (this.f21575 != Integer.MIN_VALUE) goto L9;
        return;
    L9:
        if (this.f21583 == 0.0f) goto L16;
        this.f21583 = 0.0f;
        AbstractC3011.m6363(r0, 0.0f);
        return;
    L16:
        return;
    }
}

package p198;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import p005j$.util.Objects;
import p170.AbstractC3024;

/* JADX INFO: renamed from: ˋᵔ.ᵔᵢ */
/* JADX INFO: loaded from: classes.dex */
public final class C3313 {

    /* JADX INFO: renamed from: ʽ */
    public VelocityTracker f11559;

    /* JADX INFO: renamed from: ˈ */
    public float f11560;

    /* JADX INFO: renamed from: ˑﹳ */
    public int f11561;

    /* JADX INFO: renamed from: ᵎﹶ */
    public int f11562;

    /* JADX INFO: renamed from: ᵔᵢ */
    public final int[] f11563;

    /* JADX INFO: renamed from: ⁱˊ */
    public final InterfaceC3255 f11564;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Context f11565;

    /* JADX INFO: renamed from: ﾞᴵ */
    public int f11566;

    public C3313(Context r3, InterfaceC3255 r4) {
        this.f11561 = -1;
        this.f11566 = -1;
        this.f11562 = -1;
        this.f11563 = new int[]{Integer.MAX_VALUE, 0};
        this.f11565 = r3;
        this.f11564 = r4;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m6999(MotionEvent r28, int r29) {
        int r3 = r28.getSource();
        int r4 = r28.getDeviceId();
        int r5 = this.f11566;
        int[] r10 = this.f11563;
        if (r5 == r3) goto L5;
    L10:
        Context r52 = this.f11565;
        ViewConfiguration r13 = ViewConfiguration.get(r52);
        int r14 = r28.getDeviceId();
        int r15 = r28.getSource();
        int r16 = 1;
        int r11 = Build.VERSION.SDK_INT;
        int r17 = 0;
        if (r11 < 34) goto L13;
        Method r19 = AbstractC3311.f11554;
        int r142 = AbstractC3024.m6400(r13, r14, r29, r15);
    L31:
        r10[0] = r142;
        int r143 = r28.getDeviceId();
        int r152 = r28.getSource();
        if (r11 < 34) goto L34;
        int r53 = AbstractC3024.m6404(r13, r143, r29, r152);
    L52:
        r10[1] = r53;
        this.f11566 = r3;
        this.f11562 = r4;
        this.f11561 = r29;
        boolean r12 = true;
    L54:
        if (r10[r17] != Integer.MAX_VALUE) goto L60;
        VelocityTracker r1 = this.f11559;
        if (r1 == null) goto L144;
        r1.recycle();
        this.f11559 = null;
        return;
    L144:
        return;
    L60:
        if (this.f11559 != null) goto L62;
        this.f11559 = VelocityTracker.obtain();
    L62:
        VelocityTracker r32 = this.f11559;
        Map r42 = AbstractC3251.f11471;
        r32.addMovement(r28);
        float r54 = 0.0f;
        int r7 = 20;
        if (Build.VERSION.SDK_INT < 34) goto L66;
    L79:
        r32.computeCurrentVelocity(1000, Float.MAX_VALUE);
        C3290 r8 = (C3290) AbstractC3251.f11471.get(r32);
        if (r8 == null) goto L119;
        float[] r9 = r8.f11510;
        long[] r112 = r8.f11509;
        int r132 = r8.f11507;
        if (r132 >= 2) goto L84;
    L83:
        float r282 = Float.MAX_VALUE;
        float r72 = 0.0f;
        float r24 = 0.0f;
    L113:
        float r73 = r72 * 1000;
        r8.f11506 = r73;
        if (r73 >= (-Math.abs(r282))) goto L117;
        r8.f11506 = -Math.abs(r282);
    L121:
        if (Build.VERSION.SDK_INT < 34) goto L123;
        float r18 = AbstractC3024.m6396(r32, r29);
    L135:
        InterfaceC3255 r2 = this.f11564;
        float r33 = r2.mo6763() * r18;
        float r110 = Math.signum(r33);
        if (r12 == false) goto L138;
    L141:
        r2.mo6761();
    L143:
        if (Math.abs(r33) < r10[0]) goto L156;
        float r111 = Math.max(-r1, Math.min(r33, r10[1]));
        if (r2.mo6764(r111) == false) goto L148;
        float r55 = r111;
    L149:
        this.f11560 = r55;
        return;
    L148:
        r55 = r24;
        goto L149
    L156:
        return;
    L138:
        if (r110 == Math.signum(this.f11560)) goto L143;
        if (r110 == r24) goto L143;
    L123:
        if (r29 != 0) goto L126;
        r18 = r32.getXVelocity();
        goto L135
    L126:
        if (r29 != 1) goto L128;
        r18 = r32.getYVelocity();
        goto L135
    L128:
        C3290 r113 = (C3290) AbstractC3251.f11471.get(r32);
        if (r113 != null) goto L131;
    L134:
        r18 = r24;
        goto L135
    L131:
        if (r29 != 26) goto L134;
        r18 = r113.f11506;
        goto L135
    L117:
        if (r8.f11506 <= Math.abs(r282)) goto L121;
        r8.f11506 = Math.abs(r282);
        goto L121
    L84:
        int r153 = r8.f11508;
        int r182 = ((r153 + 20) - (r132 - 1)) % 20;
        long r192 = r112[r153];
    L85:
        long r21 = r112[r182];
        if ((r192 - r21) <= 100) goto L88;
        r8.f11507--;
        r182 = (r182 + 1) % 20;
        goto L85
    L88:
        int r133 = r8.f11507;
        if (r133 < 2) goto L83;
        if (r133 != 2) goto L96;
        int r183 = (r182 + 1) % 20;
        if (r21 == r112[r183]) goto L83;
        r72 = r9[r183] / (r13 - r21);
        r282 = Float.MAX_VALUE;
        r24 = 0.0f;
        goto L113
    L96:
        r282 = Float.MAX_VALUE;
        float r154 = 0.0f;
        int r134 = 0;
        int r144 = 0;
    L97:
        float r20 = 1.0f;
        if (r134 >= (r8.f11507 - 1)) goto L109;
        int r43 = r134 + r182;
        long r22 = r112[r43 % 20];
        int r44 = (r43 + 1) % r7;
        if (r112[r44] != r22) goto L102;
        float r242 = r54;
    L108:
        r134 = r134 + 1;
        r54 = r242;
        r7 = 20;
        r16 = 1;
        goto L97
    L102:
        r144 = r144 + 1;
        if (r154 >= r54) goto L105;
        r20 = -1.0f;
    L105:
        r242 = r54;
        float r202 = r20 * ((float) Math.sqrt(Math.abs(r154) * 2.0f));
        float r56 = r9[r44] / (r112[r44] - r22);
        r154 = r154 + (Math.abs(r56) * (r56 - r202));
        if (r144 != r16) goto L108;
        r154 = r154 * 0.5f;
        goto L108
    L109:
        r24 = r54;
        if (r154 >= r24) goto L112;
        r20 = -1.0f;
    L112:
        r72 = r20 * ((float) Math.sqrt(Math.abs(r154) * 2.0f));
        goto L113
    L119:
        r24 = 0.0f;
        goto L121
    L66:
        if (r28.getSource() != 4194304) goto L79;
        Map r45 = AbstractC3251.f11471;
        if (r45.containsKey(r32) == true) goto L70;
        r45.put(r32, new C3290());
    L70:
        C3290 r46 = (C3290) r45.get(r32);
        long[] r82 = r46.f11509;
        long r135 = r28.getEventTime();
        if (r46.f11507 != 0) goto L73;
    L75:
        int r92 = (r46.f11508 + 1) % 20;
        r46.f11508 = r92;
        int r114 = r46.f11507;
        if (r114 == 20) goto L78;
        r46.f11507 = r114 + 1;
    L78:
        r46.f11510[r92] = r28.getAxisValue(26);
        r82[r46.f11508] = r135;
        goto L79
    L73:
        if ((r135 - r82[r46.f11508]) <= 40) goto L75;
        r46.f11507 = r17;
        r46.f11506 = 0.0f;
        goto L75
    L34:
        InputDevice r115 = InputDevice.getDevice(r143);
        if (r115 != null) goto L37;
    L51:
        r53 = Integer.MIN_VALUE;
        goto L52
    L37:
        if (r115.getMotionRange(r29, r152) == null) goto L51;
        Resources r57 = r52.getResources();
        if (r152 == 4194304) goto L41;
    L43:
        int r74 = -1;
    L44:
        Objects.requireNonNull(r13);
        if (r74 == (-1)) goto L50;
        if (r74 == 0) goto L51;
        r53 = r57.getDimensionPixelSize(r74);
        if (r53 >= 0) goto L52;
    L50:
        r53 = r13.getScaledMaximumFlingVelocity();
        goto L52
    L41:
        if (r29 != 26) goto L43;
        r74 = r57.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android");
        goto L44
    L13:
        Method r193 = AbstractC3311.f11554;
        InputDevice r145 = InputDevice.getDevice(r14);
        if (r145 != null) goto L16;
    L30:
        r142 = Integer.MAX_VALUE;
        goto L31
    L16:
        if (r145.getMotionRange(r29, r15) == null) goto L30;
        Resources r146 = r52.getResources();
        if (r15 == 4194304) goto L20;
    L22:
        int r155 = -1;
    L23:
        Objects.requireNonNull(r13);
        if (r155 == (-1)) goto L29;
        if (r155 == 0) goto L30;
        r142 = r146.getDimensionPixelSize(r155);
        if (r142 >= 0) goto L31;
    L29:
        r142 = r13.getScaledMinimumFlingVelocity();
        goto L31
    L20:
        if (r29 != 26) goto L22;
        r155 = r146.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android");
        goto L23
    L5:
        if (this.f11562 != r4) goto L10;
        if (this.f11561 != r29) goto L10;
        r12 = false;
        r16 = 1;
        r17 = 0;
        goto L54
    }
}

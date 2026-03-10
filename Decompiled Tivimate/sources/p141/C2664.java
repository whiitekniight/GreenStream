package p141;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import ar.tvplayer.core.domain.ʽﹳ;
import com.google.android.material.internal.StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException;
import com.google.android.material.textfield.TextInputLayout;
import p044.AbstractC1641;
import p131.AbstractC2489;
import p248.AbstractC3683;
import p346.C4690;
import p413.C5247;

/* JADX INFO: renamed from: ˈᐧ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C2664 {

    /* JADX INFO: renamed from: ʻٴ */
    public Typeface f9498;

    /* JADX INFO: renamed from: ʻᵎ */
    public int f9499;

    /* JADX INFO: renamed from: ʼʼ */
    public Typeface f9500;

    /* JADX INFO: renamed from: ʼˈ */
    public float f9501;

    /* JADX INFO: renamed from: ʼˎ */
    public float f9502;

    /* JADX INFO: renamed from: ʼᐧ */
    public float f9503;

    /* JADX INFO: renamed from: ʽ */
    public final Rect f9504;

    /* JADX INFO: renamed from: ʽʽ */
    public CharSequence f9505;

    /* JADX INFO: renamed from: ʽﹳ */
    public Typeface f9506;

    /* JADX INFO: renamed from: ʾˋ */
    public final TextUtils.TruncateAt f9507;

    /* JADX INFO: renamed from: ʾᵎ */
    public Typeface f9508;

    /* JADX INFO: renamed from: ʿ */
    public float f9509;

    /* JADX INFO: renamed from: ʿᵢ */
    public StaticLayout f9510;

    /* JADX INFO: renamed from: ˆʾ */
    public ColorStateList f9511;

    /* JADX INFO: renamed from: ˆﾞ */
    public int[] f9512;

    /* JADX INFO: renamed from: ˈ */
    public final Rect f9513;

    /* JADX INFO: renamed from: ˈʿ */
    public final TextPaint f9514;

    /* JADX INFO: renamed from: ˈˏ */
    public int f9515;

    /* JADX INFO: renamed from: ˈٴ */
    public boolean f9516;

    /* JADX INFO: renamed from: ˈⁱ */
    public ColorStateList f9517;

    /* JADX INFO: renamed from: ˉʿ */
    public float f9518;

    /* JADX INFO: renamed from: ˉˆ */
    public float f9519;

    /* JADX INFO: renamed from: ˉـ */
    public float f9520;

    /* JADX INFO: renamed from: ˉٴ */
    public float f9521;

    /* JADX INFO: renamed from: ˊʻ */
    public float f9522;

    /* JADX INFO: renamed from: ˊˋ */
    public TimeInterpolator f9523;

    /* JADX INFO: renamed from: ˊᵔ */
    public final float f9524;

    /* JADX INFO: renamed from: ˋᵔ */
    public TimeInterpolator f9525;

    /* JADX INFO: renamed from: ˏי */
    public Typeface f9526;

    /* JADX INFO: renamed from: ˏᵢ */
    public CharSequence f9527;

    /* JADX INFO: renamed from: ˑٴ */
    public final TextPaint f9528;

    /* JADX INFO: renamed from: ˑﹳ */
    public final RectF f9529;

    /* JADX INFO: renamed from: יـ */
    public Typeface f9530;

    /* JADX INFO: renamed from: ـˆ */
    public Typeface f9531;

    /* JADX INFO: renamed from: ـˏ */
    public float f9532;

    /* JADX INFO: renamed from: ـﹶ */
    public final int f9533;

    /* JADX INFO: renamed from: ٴʼ */
    public float f9534;

    /* JADX INFO: renamed from: ٴᵢ */
    public float f9535;

    /* JADX INFO: renamed from: ٴﹶ */
    public ColorStateList f9536;

    /* JADX INFO: renamed from: ᐧᴵ */
    public float f9537;

    /* JADX INFO: renamed from: ᐧﾞ */
    public float f9538;

    /* JADX INFO: renamed from: ᴵʼ */
    public int f9539;

    /* JADX INFO: renamed from: ᴵˊ */
    public CharSequence f9540;

    /* JADX INFO: renamed from: ᴵˑ */
    public float f9541;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final boolean f9542;

    /* JADX INFO: renamed from: ᵎˊ */
    public int f9543;

    /* JADX INFO: renamed from: ᵎᵔ */
    public float f9544;

    /* JADX INFO: renamed from: ᵎⁱ */
    public float f9545;

    /* JADX INFO: renamed from: ᵎﹶ */
    public int f9546;

    /* JADX INFO: renamed from: ᵔʾ */
    public float f9547;

    /* JADX INFO: renamed from: ᵔי */
    public int f9548;

    /* JADX INFO: renamed from: ᵔٴ */
    public boolean f9549;

    /* JADX INFO: renamed from: ᵔᵢ */
    public float f9550;

    /* JADX INFO: renamed from: ᵔﹳ */
    public float f9551;

    /* JADX INFO: renamed from: ᵢˏ */
    public C5247 f9552;

    /* JADX INFO: renamed from: ⁱˊ */
    public float f9553;

    /* JADX INFO: renamed from: ﹳـ */
    public float f9554;

    /* JADX INFO: renamed from: ﹳٴ */
    public final TextInputLayout f9555;

    /* JADX INFO: renamed from: ﹳᐧ */
    public float f9556;

    /* JADX INFO: renamed from: ﹳﹳ */
    public boolean f9557;

    /* JADX INFO: renamed from: ﹶᐧ */
    public int f9558;

    /* JADX INFO: renamed from: ﾞʻ */
    public int f9559;

    /* JADX INFO: renamed from: ﾞᴵ */
    public int f9560;

    public C2664(TextInputLayout r3) {
        this.f9560 = 16;
        this.f9546 = 16;
        this.f9550 = 15.0f;
        this.f9502 = 15.0f;
        this.f9507 = TextUtils.TruncateAt.END;
        this.f9542 = true;
        this.f9539 = 1;
        this.f9499 = 1;
        this.f9524 = 1.0f;
        this.f9533 = 1;
        this.f9515 = -1;
        this.f9558 = -1;
        this.f9555 = r3;
        TextPaint r0 = new TextPaint(129);
        this.f9514 = r0;
        this.f9528 = new TextPaint(r0);
        this.f9513 = new Rect();
        this.f9504 = new Rect();
        this.f9529 = new RectF();
        m5880(r3.getContext().getResources().getConfiguration());
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public static float m5878(float r0, float r1, float r2, TimeInterpolator r3) {
        if (r3 == null) goto L5;
        r2 = r3.getInterpolation(r2);
    L5:
        return AbstractC3683.m7751(r0, r1, r2);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static int m5879(float r5, int r6, int r7) {
        float r0 = 1.0f - r5;
        return Color.argb(Math.round((Color.alpha(r7) * r5) + (Color.alpha(r6) * r0)), Math.round((Color.red(r7) * r5) + (Color.red(r6) * r0)), Math.round((Color.green(r7) * r5) + (Color.green(r6) * r0)), Math.round((Color.blue(r7) * r5) + (Color.blue(r6) * r0)));
    }

    /* JADX INFO: renamed from: ʼˎ */
    public final void m5880(Configuration r3) {
        if (Build.VERSION.SDK_INT < 31) goto L20;
        Typeface r0 = this.f9506;
        if (r0 == null) goto L7;
        this.f9526 = AbstractC1641.m4321(r3, r0);
    L7:
        Typeface r02 = this.f9508;
        if (r02 == null) goto L10;
        this.f9531 = AbstractC1641.m4321(r3, r02);
    L10:
        Typeface r32 = this.f9526;
        if (r32 != null) goto L14;
        r32 = this.f9506;
    L14:
        this.f9530 = r32;
        Typeface r33 = this.f9531;
        if (r33 != null) goto L18;
        r33 = this.f9508;
    L18:
        this.f9498 = r33;
        m5882(true);
        return;
    }

    /* JADX INFO: renamed from: ʽ */
    public final boolean m5881(CharSequence r3) {
        boolean r1 = true;
        if (this.f9555.getLayoutDirection() == 1) goto L7;
        r1 = false;
    L7:
        if (this.f9542 == false) goto L13;
        if (r1 == false) goto L10;
        ʽﹳ r0 = AbstractC2489.f8828;
    L12:
        return r0.ᵎﹶ(r3, r3.length());
    L10:
        r0 = AbstractC2489.f8827;
        goto L12
    L13:
        return r1;
    }

    /* JADX INFO: renamed from: ˆʾ */
    public final void m5882(boolean r15) {
        TextInputLayout r0 = this.f9555;
        if (r0.getHeight() > 0) goto L5;
    L6:
        if (r15 == false) goto L72;
    L7:
        m5883(1.0f, r15);
        CharSequence r1 = this.f9505;
        TextPaint r2 = this.f9514;
        if (r1 != null) goto L10;
    L16:
        CharSequence r12 = this.f9527;
        float r4 = 0.0f;
        if (r12 == null) goto L19;
        this.f9544 = r2.measureText(r12, 0, r12.length());
    L20:
        int r13 = Gravity.getAbsoluteGravity(this.f9546, this.f9516 ? 1 : 0);
        int r5 = r13 & 112;
        Rect r9 = this.f9513;
        if (r5 == 48) goto L25;
        if (r5 == 80) goto L24;
        this.f9547 = r9.centerY() - ((r2.descent() - r2.ascent()) / 2.0f);
    L26:
        int r14 = r13 & 8388615;
        if (r14 == 1) goto L31;
        if (r14 == 5) goto L30;
        this.f9503 = r9.left;
    L33:
        if (this.f9544 > r9.width()) goto L35;
        float r16 = this.f9503;
        float r122 = Math.max(0.0f, r9.left - r16) + r16;
        this.f9503 = r122;
        this.f9503 = Math.min(0.0f, r9.right - (this.f9544 + r122)) + r122;
    L35:
        float r17 = this.f9502;
        TextPaint r123 = this.f9528;
        r123.setTextSize(r17);
        r123.setTypeface(this.f9530);
        r123.setLetterSpacing(this.f9541);
        if ((r123.descent() + (-r123.ascent())) > r9.height()) goto L38;
        float r18 = this.f9547;
        float r124 = Math.max(0.0f, r9.top - r18) + r18;
        this.f9547 = r124;
        this.f9547 = Math.min(0.0f, r9.bottom - (m5892() + r124)) + r124;
    L38:
        m5883(0.0f, r15);
        StaticLayout r152 = this.f9510;
        if (r152 == null) goto L41;
        float r153 = r152.getHeight();
    L42:
        StaticLayout r19 = this.f9510;
        if (r19 != null) goto L45;
    L47:
        CharSequence r110 = this.f9505;
        if (r110 == null) goto L50;
        float r111 = r2.measureText(r110, 0, r110.length());
    L51:
        StaticLayout r92 = this.f9510;
        if (r92 == null) goto L54;
        int r93 = r92.getLineCount();
    L55:
        this.f9559 = r93;
        int r94 = Gravity.getAbsoluteGravity(this.f9560, this.f9516 ? 1 : 0);
        int r125 = r94 & 112;
        Rect r132 = this.f9504;
        if (r125 == 48) goto L63;
        if (r125 == 80) goto L59;
        this.f9518 = r132.centerY() - (r153 / 2.0f);
    L64:
        int r154 = r94 & 8388615;
        if (r154 == 1) goto L69;
        if (r154 == 5) goto L68;
        this.f9519 = r132.left;
    L70:
        m5883(this.f9553, false);
        r0.postInvalidateOnAnimation();
        m5890();
        return;
    L68:
        this.f9519 = r132.right - r111;
        goto L70
    L69:
        this.f9519 = r132.centerX() - (r111 / 2.0f);
        goto L70
    L59:
        float r6 = r132.bottom - r153;
        if (this.f9557 == false) goto L62;
        r4 = r2.descent();
    L62:
        this.f9518 = r6 + r4;
        goto L64
    L63:
        this.f9518 = r132.top;
        goto L64
    L54:
        r93 = 0;
        goto L55
    L50:
        r111 = 0.0f;
        goto L51
    L45:
        if (this.f9539 <= 1) goto L47;
        r111 = r19.getWidth();
        goto L51
    L41:
        r153 = 0.0f;
        goto L42
    L30:
        this.f9503 = r9.right - this.f9544;
        goto L33
    L31:
        this.f9503 = r9.centerX() - (this.f9544 / 2.0f);
        goto L33
    L24:
        this.f9547 = r2.ascent() + r9.bottom;
        goto L26
    L25:
        this.f9547 = r9.top;
        goto L26
    L19:
        this.f9544 = 0.0f;
        goto L20
    L10:
        if (this.f9510 == null) goto L16;
        if (m5885() == false) goto L14;
        CharSequence r112 = TextUtils.ellipsize(this.f9505, r2, this.f9510.getWidth(), this.f9507);
    L15:
        this.f9527 = r112;
        goto L16
    L14:
        r112 = this.f9505;
        goto L15
    L72:
        return;
    L5:
        if (r0.getWidth() > 0) goto L7;
        goto L6
    }

    /* JADX INFO: renamed from: ˈ */
    public final void m5883(float r16, boolean r17) {
        if (this.f9540 == null) goto L96;
        float r1 = this.f9513.width();
        float r2 = this.f9504.width();
        float r3 = 1.0f;
        if (Math.abs(r16 - 1.0f) < 1.0E-5f) goto L8;
        float r4 = this.f9550;
        float r7 = this.f9520;
        Typeface r8 = this.f9498;
        if (Math.abs(r16 - 0.0f) >= 1.0E-5f) goto L27;
        this.f9522 = 1.0f;
    L28:
        float r5 = this.f9502 / this.f9550;
        float r9 = r2 * r5;
        if (r17 == false) goto L31;
    L35:
        float r52 = r7;
    L37:
        if (r16 >= 0.5f) goto L39;
        int r0 = this.f9539;
    L40:
        TextPaint r11 = this.f9514;
        boolean r72 = false;
        if (r2 <= 0.0f) goto L79;
        if (this.f9535 == r4) goto L45;
        boolean r12 = true;
    L47:
        if (this.f9509 == r52) goto L49;
        boolean r92 = true;
    L51:
        if (this.f9500 == r8) goto L53;
        boolean r10 = true;
    L55:
        if (this.f9510 != null) goto L57;
    L59:
        boolean r122 = false;
    L61:
        if (this.f9548 == r0) goto L63;
        boolean r13 = true;
    L64:
        if (r12 == true) goto L73;
        if (r92 == true) goto L73;
        if (r122 == true) goto L73;
        if (r10 == true) goto L73;
        if (r13 == true) goto L73;
        if (this.f9549 == true) goto L73;
        boolean r14 = false;
    L74:
        this.f9535 = r4;
        this.f9509 = r52;
        this.f9500 = r8;
        this.f9549 = false;
        this.f9548 = r0;
        if (this.f9522 == 1.0f) goto L77;
        r72 = true;
    L77:
        r11.setLinearText(r72);
        r72 = r14;
    L73:
        r14 = true;
        goto L74
    L63:
        r13 = false;
        goto L64
    L57:
        if (r2 == r12.getWidth()) goto L59;
        r122 = true;
        goto L61
    L53:
        r10 = false;
        goto L55
    L49:
        r92 = false;
        goto L51
    L45:
        r12 = false;
    L79:
        if (this.f9505 == null) goto L83;
        if (r72 == true) goto L83;
        return;
    L83:
        r11.setTextSize(this.f9535);
        r11.setTypeface(this.f9500);
        r11.setLetterSpacing(this.f9509);
        boolean r15 = m5881(this.f9540);
        this.f9516 = r15;
        if (this.f9539 <= 1) goto L86;
    L87:
        if (r15 == false) goto L89;
    L88:
        int r102 = 1;
    L90:
        CharSequence r123 = this.f9540;
        if (m5885() == true) goto L94;
        r3 = this.f9522;
    L94:
        StaticLayout r02 = m5886(r102, r11, r123, r2 * r3, this.f9516);
        this.f9510 = r02;
        this.f9505 = r02.getText();
        return;
    L89:
        r102 = r0;
        goto L90
    L86:
        if (this.f9499 <= 1) goto L88;
    L39:
        r0 = this.f9499;
        goto L40
    L31:
        if (r9 <= r1) goto L35;
        if (m5885() == false) goto L35;
        r2 = Math.min(r1 / r5, r2);
        goto L35
    L27:
        this.f9522 = m5878(this.f9550, this.f9502, r16, this.f9523) / this.f9550;
        goto L28
    L8:
        if (m5885() == false) goto L10;
        r4 = this.f9502;
    L12:
        if (m5885() == false) goto L14;
        r52 = this.f9541;
    L16:
        if (m5885() == false) goto L18;
        float r73 = 1.0f;
    L19:
        this.f9522 = r73;
        if (m5885() == true) goto L23;
        r1 = r2;
    L23:
        r8 = this.f9530;
        r2 = r1;
        goto L37
    L18:
        r73 = m5878(this.f9550, this.f9502, r16, this.f9523) / this.f9550;
        goto L19
    L14:
        r52 = this.f9520;
        goto L16
    L10:
        r4 = this.f9550;
        goto L12
    }

    /* JADX INFO: renamed from: ˉʿ */
    public final void m5884(float r3) {
        float r0 = 0.0f;
        if (r3 >= 0.0f) goto L5;
    L4:
        r3 = r0;
    L9:
        if (r3 == this.f9553) goto L12;
        this.f9553 = r3;
        m5890();
        return;
    L12:
        return;
    L5:
        r0 = 1.0f;
        if (r3 <= 1.0f) goto L9;
        goto L4
    }

    /* JADX INFO: renamed from: ˉˆ */
    public final boolean m5885() {
        if (this.f9499 != 1) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final StaticLayout m5886(int r5, TextPaint r6, CharSequence r7, float r8, boolean r9) {
        StaticLayout r0 = null;
        if (r5 != 1) goto L7;
        Layout.Alignment r1 = Layout.Alignment.ALIGN_NORMAL;     // Catch: StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException -> L5
    L20:
        C2669 r2 = new C2669(r7, r6, (int) r8);     // Catch: StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException -> L5
        r2.f9583 = this.f9507;     // Catch: StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException -> L5
        r2.f9578 = r9;     // Catch: StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException -> L5
        r2.f9577 = r1;     // Catch: StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException -> L5
        r2.f9574 = false;     // Catch: StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException -> L5
        r2.f9584 = r5;     // Catch: StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException -> L5
        float r52 = this.f9524;     // Catch: StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException -> L5
        r2.f9579 = 0.0f;     // Catch: StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException -> L5
        r2.f9580 = r52;     // Catch: StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException -> L5
        r2.f9572 = this.f9533;     // Catch: StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException -> L5
        r2.f9576 = null;     // Catch: StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException -> L5
        r0 = r2.m5901();     // Catch: StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException -> L5
    L23:
        r0.getClass();
        return r0;
    L7:
        int r22 = Gravity.getAbsoluteGravity(this.f9560, this.f9516 ? 1 : 0) & 7;     // Catch: StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException -> L5
        if (r22 != 1) goto L10;
        r1 = Layout.Alignment.ALIGN_CENTER;     // Catch: StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException -> L5
        goto L20
    L10:
        if (r22 == 5) goto L16;
        if (this.f9516 == false) goto L14;
        r1 = Layout.Alignment.ALIGN_OPPOSITE;     // Catch: StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException -> L5
        goto L20
    L14:
        r1 = Layout.Alignment.ALIGN_NORMAL;     // Catch: StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException -> L5
        goto L20
    L16:
        if (this.f9516 == false) goto L18;
        r1 = Layout.Alignment.ALIGN_NORMAL;     // Catch: StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException -> L5
        goto L20
    L18:
        r1 = Layout.Alignment.ALIGN_OPPOSITE;     // Catch: StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException -> L5
    L5:
        e = move-exception;
        e.getCause().getMessage();
        goto L23
    }

    /* JADX INFO: renamed from: ٴﹶ */
    public final void m5887(ColorStateList r2) {
        if (this.f9536 == r2) goto L5;
    L8:
        this.f9536 = r2;
        this.f9511 = r2;
        m5882(false);
        return;
    L5:
        if (this.f9511 != r2) goto L8;
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public final int m5888(ColorStateList r3) {
        if (r3 != null) goto L5;
        return 0;
    L5:
        int[] r1 = this.f9512;
        if (r1 == null) goto L10;
        return r3.getColorForState(r1, 0);
    L10:
        return r3.getDefaultColor();
    }

    /* JADX INFO: renamed from: ᵔʾ */
    public final void m5889(Typeface r4) {
        boolean r0 = m5891(r4);
        if (this.f9508 == r4) goto L8;
        this.f9508 = r4;
        Typeface r42 = AbstractC1641.m4321(this.f9555.getContext().getResources().getConfiguration(), r4);
        this.f9531 = r42;
        if (r42 != null) goto L7;
        r42 = this.f9508;
    L7:
        this.f9498 = r42;
        boolean r43 = true;
    L9:
        if (r0 == true) goto L13;
        if (r43 == true) goto L13;
        return;
    L13:
        m5882(false);
        return;
    L8:
        r43 = false;
        goto L9
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m5890() {
        float r0 = this.f9553;
        float r2 = this.f9504.left;
        Rect r3 = this.f9513;
        float r22 = m5878(r2, r3.left, r0, this.f9525);
        RectF r4 = this.f9529;
        r4.left = r22;
        r4.top = m5878(this.f9518, this.f9547, r0, this.f9525);
        r4.right = m5878(r1.right, r3.right, r0, this.f9525);
        r4.bottom = m5878(r1.bottom, r3.bottom, r0, this.f9525);
        this.f9551 = m5878(this.f9519, this.f9503, r0, this.f9525);
        this.f9556 = m5878(this.f9518, this.f9547, r0, this.f9525);
        m5883(r0, false);
        TextInputLayout r23 = this.f9555;
        r23.postInvalidateOnAnimation();
        C4690 r5 = AbstractC3683.f13187;
        this.f9538 = 1.0f - m5878(0.0f, 1.0f, 1.0f - r0, r5);
        r23.postInvalidateOnAnimation();
        this.f9537 = m5878(1.0f, 0.0f, r0, r5);
        r23.postInvalidateOnAnimation();
        ColorStateList r32 = this.f9536;
        ColorStateList r42 = this.f9511;
        TextPaint r7 = this.f9514;
        if (r32 == r42) goto L5;
        r7.setColor(m5879(r0, m5888(r42), m5888(this.f9536)));
    L6:
        float r33 = this.f9541;
        float r43 = this.f9520;
        if (r33 == r43) goto L9;
        r7.setLetterSpacing(m5878(r43, r33, r0, r5));
    L10:
        this.f9521 = AbstractC3683.m7751(0.0f, this.f9501, r0);
        this.f9545 = AbstractC3683.m7751(0.0f, this.f9532, r0);
        this.f9534 = AbstractC3683.m7751(0.0f, this.f9554, r0);
        int r02 = m5879(r0, 0, m5888(this.f9517));
        this.f9543 = r02;
        r7.setShadowLayer(this.f9521, this.f9545, this.f9534, r02);
        r23.postInvalidateOnAnimation();
        return;
    L9:
        r7.setLetterSpacing(r33);
        goto L10
    L5:
        r7.setColor(m5888(r32));
        goto L6
    }

    /* JADX INFO: renamed from: ﾞʻ */
    public final boolean m5891(Typeface r3) {
        C5247 r0 = this.f9552;
        if (r0 == null) goto L6;
        r0.f18939 = true;
    L6:
        if (this.f9506 == r3) goto L12;
        this.f9506 = r3;
        Typeface r32 = AbstractC1641.m4321(this.f9555.getContext().getResources().getConfiguration(), r3);
        this.f9526 = r32;
        if (r32 != null) goto L10;
        r32 = this.f9506;
    L10:
        this.f9530 = r32;
        return true;
    L12:
        return false;
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public final float m5892() {
        int r0 = this.f9515;
        if (r0 != (-1)) goto L5;
        float r02 = this.f9502;
        TextPaint r1 = this.f9528;
        r1.setTextSize(r02);
        r1.setTypeface(this.f9530);
        r1.setLetterSpacing(this.f9541);
        return -r1.ascent();
    L5:
        return r0;
    }
}

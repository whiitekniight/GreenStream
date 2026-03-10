package p131;

import android.text.SpannableStringBuilder;
import ar.tvplayer.core.domain.ʽﹳ;

/* JADX INFO: renamed from: ˈʿ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C2487 {

    /* JADX INFO: renamed from: ʽ */
    public static final String f8817 = null;

    /* JADX INFO: renamed from: ˈ */
    public static final C2487 f8818 = null;

    /* JADX INFO: renamed from: ˑﹳ */
    public static final C2487 f8819 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final String f8820 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public final boolean f8821;

    static {
        ʽﹳ r0 = AbstractC2489.f8827;
        f8820 = Character.toString('\u200e');
        f8817 = Character.toString('\u200f');
        f8818 = new C2487(false);
        f8819 = new C2487(true);
    }

    public C2487(boolean r2) {
        ʽﹳ r0 = AbstractC2489.f8830;
        this.f8821 = r2;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static int m5691(CharSequence r6) {
        C2488 r0 = new C2488(r6);
        r0.f8823 = r0.f8825;
        int r1 = 0;
    L3:
        int r2 = r1;
    L5:
        if (r0.f8823 <= 0) goto L32;
        byte r3 = r0.m5694();
        if (r3 != 0) goto L9;
        if (r1 == 0) goto L59;
        if (r2 != 0) goto L5;
    L59:
        return -1;
    L9:
        if (r3 == 1) goto L23;
        if (r3 == 2) goto L23;
        if (r3 == 9) goto L5;
        switch(r3) {
            case 14: goto L21;
            case 15: goto L21;
            case 16: goto L18;
            case 17: goto L18;
            case 18: goto L17;
            default: goto L15;
        };
    L17:
        r1 = r1 + 1;
        goto L5
    L18:
        if (r2 == r1) goto L24;
    L20:
        r1 = r1 - 1;
    L24:
        return 1;
    L21:
        if (r2 != r1) goto L20;
        return -1;
    L15:
        if (r2 != 0) goto L5;
    L23:
        if (r1 == 0) goto L24;
        if (r2 != 0) goto L5;
    L32:
        return 0;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static int m5692(CharSequence r9) {
        C2488 r0 = new C2488(r9);
        r0.f8823 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
    L3:
        int r4 = r0.f8823;
        if (r4 >= r0.f8825) goto L29;
        if (r1 != 0) goto L29;
        CharSequence r5 = r0.f8826;
        char r42 = r5.charAt(r4);
        r0.f8824 = r42;
        if (Character.isHighSurrogate(r42) == false) goto L9;
        int r43 = Character.codePointAt(r5, r0.f8823);
        r0.f8823 = Character.charCount(r43) + r0.f8823;
        byte r44 = Character.getDirectionality(r43);
    L13:
        if (r44 == 0) goto L26;
        if (r44 == 1) goto L24;
        if (r44 == 2) goto L24;
        if (r44 == 9) goto L3;
        switch(r44) {
            case 14: goto L23;
            case 15: goto L23;
            case 16: goto L22;
            case 17: goto L22;
            case 18: goto L21;
            default: goto L28;
        };
    L22:
        r3 = r3 + 1;
        r2 = 1;
        goto L3
    L23:
        r3 = r3 + 1;
        r2 = -1;
    L28:
        r1 = r3;
        goto L3
    L21:
        r3 = r3 - 1;
        r2 = 0;
    L24:
        if (r3 != 0) goto L28;
    L40:
        return 1;
    L26:
        if (r3 != 0) goto L28;
    L43:
        return -1;
    L9:
        r0.f8823++;
        char r45 = r0.f8824;
        if (r45 >= '\u0700') goto L12;
        r44 = C2488.f8822[r45];
        goto L13
    L12:
        r44 = Character.getDirectionality(r45);
    L29:
        if (r1 == 0) goto L44;
        if (r2 == 0) goto L34;
        return r2;
    L34:
        if (r0.f8823 <= 0) goto L44;
        switch(r0.m5694()) {
            case 14: goto L42;
            case 15: goto L42;
            case 16: goto L39;
            case 17: goto L39;
            case 18: goto L38;
            default: goto L34;
        };
    L38:
        r3 = r3 + 1;
        goto L34
    L39:
        if (r1 == r3) goto L40;
    L41:
        r3 = r3 - 1;
        goto L34
    L42:
        if (r1 != r3) goto L41;
    L44:
        return 0;
    }

    /* JADX INFO: renamed from: ʽ */
    public final SpannableStringBuilder m5693(CharSequence r11) {
        ʽﹳ r0 = AbstractC2489.f8827;
        if (r11 != null) goto L6;
        return null;
    L6:
        boolean r02 = r0.ᵎﹶ(r11, r11.length());
        SpannableStringBuilder r1 = new SpannableStringBuilder();
        if (r02 == false) goto L9;
        ʽﹳ r2 = AbstractC2489.f8829;
    L10:
        boolean r22 = r2.ᵎﹶ(r11, r11.length());
        String r3 = "";
        String r4 = f8817;
        String r6 = f8820;
        boolean r8 = this.f8821;
        if (r8 == true) goto L16;
        if (r22 == false) goto L14;
    L15:
        String r23 = r6;
    L22:
        r1.append(r23);
        if (r02 == r8) goto L28;
        if (r02 == false) goto L26;
        char r24 = '\u202b';
    L27:
        r1.append(r24);
        r1.append(r11);
        r1.append('\u202c');
    L29:
        if (r02 == false) goto L31;
        ʽﹳ r03 = AbstractC2489.f8829;
    L32:
        boolean r04 = r03.ᵎﹶ(r11, r11.length());
        if (r8 == true) goto L38;
        if (r04 == false) goto L36;
    L37:
        r3 = r6;
    L43:
        r1.append(r3);
        return r1;
    L36:
        if (m5691(r11) == 1) goto L37;
    L38:
        if (r8 == false) goto L43;
        if (r04 == true) goto L41;
    L42:
        r3 = r4;
        goto L43
    L41:
        if (m5691(r11) != (-1)) goto L43;
    L31:
        r03 = AbstractC2489.f8830;
        goto L32
    L26:
        r24 = '\u202a';
        goto L27
    L28:
        r1.append(r11);
        goto L29
    L14:
        if (m5692(r11) == 1) goto L15;
    L16:
        if (r8 == false) goto L21;
        if (r22 == true) goto L19;
    L20:
        r23 = r4;
        goto L22
    L19:
        if (m5692(r11) == (-1)) goto L20;
    L21:
        r23 = "";
        goto L22
    L9:
        r2 = AbstractC2489.f8830;
        goto L10
    }
}

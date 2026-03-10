package p397;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import p317.AbstractC4214;

/* JADX INFO: renamed from: ⁱʾ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C5090 {

    /* JADX INFO: renamed from: ʻٴ */
    public static final int f18105 = 0;

    /* JADX INFO: renamed from: ʼʼ */
    public static final int[] f18106 = null;

    /* JADX INFO: renamed from: ʽʽ */
    public static final int[] f18107 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public static final boolean[] f18108 = null;

    /* JADX INFO: renamed from: ʾᵎ */
    public static final int[] f18109 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final int[] f18110 = null;

    /* JADX INFO: renamed from: ـˆ */
    public static final int f18111 = 0;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final int[] f18112 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final int[] f18113 = null;

    /* JADX INFO: renamed from: ᵢˏ */
    public static final int[] f18114 = null;

    /* JADX INFO: renamed from: ʼˎ */
    public int f18115;

    /* JADX INFO: renamed from: ʼᐧ */
    public int f18116;

    /* JADX INFO: renamed from: ʽ */
    public boolean f18117;

    /* JADX INFO: renamed from: ʽﹳ */
    public int f18118;

    /* JADX INFO: renamed from: ˆʾ */
    public int f18119;

    /* JADX INFO: renamed from: ˈ */
    public boolean f18120;

    /* JADX INFO: renamed from: ˉʿ */
    public int f18121;

    /* JADX INFO: renamed from: ˉˆ */
    public int f18122;

    /* JADX INFO: renamed from: ˏי */
    public int f18123;

    /* JADX INFO: renamed from: ˑﹳ */
    public int f18124;

    /* JADX INFO: renamed from: יـ */
    public int f18125;

    /* JADX INFO: renamed from: ٴﹶ */
    public int f18126;

    /* JADX INFO: renamed from: ᵎﹶ */
    public int f18127;

    /* JADX INFO: renamed from: ᵔʾ */
    public int f18128;

    /* JADX INFO: renamed from: ᵔᵢ */
    public int f18129;

    /* JADX INFO: renamed from: ᵔﹳ */
    public int f18130;

    /* JADX INFO: renamed from: ⁱˊ */
    public final SpannableStringBuilder f18131;

    /* JADX INFO: renamed from: ﹳٴ */
    public final ArrayList f18132;

    /* JADX INFO: renamed from: ﹳᐧ */
    public int f18133;

    /* JADX INFO: renamed from: ﾞʻ */
    public int f18134;

    /* JADX INFO: renamed from: ﾞᴵ */
    public boolean f18135;

    static {
        f18105 = m9882(2, 2, 2, 0);
        int r2 = m9882(0, 0, 0, 0);
        f18111 = r2;
        int r3 = m9882(0, 0, 0, 3);
        f18109 = new int[]{0, 0, 0, 0, 0, 2, 0};
        f18106 = new int[]{0, 0, 0, 0, 0, 0, 2};
        f18114 = new int[]{3, 3, 3, 3, 3, 3, 1};
        f18108 = new boolean[]{false, false, false, true, true, true, false};
        f18112 = new int[]{r2, r3, r2, r2, r3, r2, r2};
        f18107 = new int[]{0, 1, 2, 3, 4, 3, 4};
        f18110 = new int[]{0, 0, 0, 0, 0, 3, 3};
        f18113 = new int[]{r2, r2, r2, r2, r2, r3, r3};
    }

    public C5090() {
        this.f18132 = new ArrayList();
        this.f18131 = new SpannableStringBuilder();
        m9883();
    }

    /* JADX INFO: renamed from: ʽ */
    public static int m9882(int r4, int r5, int r6, int r7) {
        AbstractC4214.m8571(r4, 4);
        AbstractC4214.m8571(r5, 4);
        AbstractC4214.m8571(r6, 4);
        AbstractC4214.m8571(r7, 4);
        int r1 = 255;
        if (r7 == 0) goto L9;
        if (r7 == 1) goto L9;
        if (r7 != 2) goto L8;
        int r72 = 127;
    L12:
        if (r4 <= 1) goto L14;
        int r42 = 255;
    L15:
        if (r5 <= 1) goto L17;
        int r52 = 255;
    L18:
        if (r6 > 1) goto L22;
        r1 = 0;
    L22:
        return Color.argb(r72, r42, r52, r1);
    L17:
        r52 = 0;
        goto L18
    L14:
        r42 = 0;
        goto L15
    L8:
        if (r7 != 3) goto L9;
        r72 = 0;
    L9:
        r72 = 255;
        goto L12
    }

    /* JADX INFO: renamed from: ˈ */
    public final void m9883() {
        this.f18132.clear();
        this.f18131.clear();
        this.f18122 = -1;
        this.f18116 = -1;
        this.f18130 = -1;
        this.f18125 = -1;
        this.f18118 = 0;
        this.f18117 = false;
        this.f18120 = false;
        this.f18124 = 4;
        this.f18135 = false;
        this.f18127 = 0;
        this.f18129 = 0;
        this.f18115 = 0;
        this.f18119 = 15;
        this.f18126 = 0;
        this.f18134 = 0;
        this.f18121 = 0;
        int r0 = f18111;
        this.f18128 = r0;
        this.f18133 = f18105;
        this.f18123 = r0;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final void m9884(boolean r6, boolean r7) {
        int r0 = this.f18122;
        SpannableStringBuilder r2 = this.f18131;
        if (r0 == (-1)) goto L6;
        if (r6 == true) goto L9;
        r2.setSpan(new StyleSpan(2), this.f18122, r2.length(), 33);
        this.f18122 = -1;
    L9:
        if (this.f18116 == (-1)) goto L13;
        if (r7 == true) goto L16;
        r2.setSpan(new UnderlineSpan(), this.f18116, r2.length(), 33);
        this.f18116 = -1;
        return;
    L16:
        return;
    L13:
        if (r7 == false) goto L17;
        this.f18116 = r2.length();
        return;
    L17:
        return;
    L6:
        if (r6 == false) goto L9;
        this.f18122 = r2.length();
        goto L9
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final SpannableString m9885() {
        SpannableStringBuilder r0 = new SpannableStringBuilder(this.f18131);
        int r1 = r0.length();
        if (r1 <= 0) goto L17;
        if (this.f18122 == (-1)) goto L8;
        r0.setSpan(new StyleSpan(2), this.f18122, r1, 33);
    L8:
        if (this.f18116 == (-1)) goto L11;
        r0.setSpan(new UnderlineSpan(), this.f18116, r1, 33);
    L11:
        if (this.f18130 == (-1)) goto L14;
        r0.setSpan(new ForegroundColorSpan(this.f18133), this.f18130, r1, 33);
    L14:
        if (this.f18125 == (-1)) goto L17;
        r0.setSpan(new BackgroundColorSpan(this.f18123), this.f18125, r1, 33);
    L17:
        return new SpannableString(r0);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m9886(char r4) {
        SpannableStringBuilder r1 = this.f18131;
        if (r4 != '\n') goto L24;
        SpannableString r42 = m9885();
        ArrayList r0 = this.f18132;
        r0.add(r42);
        r1.clear();
        if (this.f18122 == (-1)) goto L8;
        this.f18122 = 0;
    L8:
        if (this.f18116 == (-1)) goto L11;
        this.f18116 = 0;
    L11:
        if (this.f18130 == (-1)) goto L14;
        this.f18130 = 0;
    L14:
        if (this.f18125 == (-1)) goto L17;
        this.f18125 = 0;
    L17:
        if (r0.size() >= this.f18119) goto L23;
        if (r0.size() >= 15) goto L23;
        this.f18118 = r0.size();
        return;
    L23:
        r0.remove(0);
        goto L17
    L24:
        r1.append(r4);
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public final void m9887(int r7, int r8) {
        int r0 = this.f18130;
        SpannableStringBuilder r2 = this.f18131;
        if (r0 == (-1)) goto L8;
        if (this.f18133 == r7) goto L8;
        r2.setSpan(new ForegroundColorSpan(this.f18133), this.f18130, r2.length(), 33);
    L8:
        if (r7 == f18105) goto L11;
        this.f18130 = r2.length();
        this.f18133 = r7;
    L11:
        if (this.f18125 == (-1)) goto L16;
        if (this.f18123 == r8) goto L16;
        r2.setSpan(new BackgroundColorSpan(this.f18123), this.f18125, r2.length(), 33);
    L16:
        if (r8 == f18111) goto L19;
        this.f18125 = r2.length();
        this.f18123 = r8;
        return;
    }
}

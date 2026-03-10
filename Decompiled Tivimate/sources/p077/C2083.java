package p077;

import android.view.ViewGroup;
import p084.C2118;
import p084.C2121;

/* JADX INFO: renamed from: ʾˋ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C2083 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: ʻˋ */
    public float f7246;

    /* JADX INFO: renamed from: ʻٴ */
    public int f7247;

    /* JADX INFO: renamed from: ʻᵎ */
    public int f7248;

    /* JADX INFO: renamed from: ʼʼ */
    public int f7249;

    /* JADX INFO: renamed from: ʼˈ */
    public float f7250;

    /* JADX INFO: renamed from: ʼˎ */
    public int f7251;

    /* JADX INFO: renamed from: ʼᐧ */
    public int f7252;

    /* JADX INFO: renamed from: ʽ */
    public float f7253;

    /* JADX INFO: renamed from: ʽʽ */
    public int f7254;

    /* JADX INFO: renamed from: ʽﹳ */
    public int f7255;

    /* JADX INFO: renamed from: ʾˋ */
    public int f7256;

    /* JADX INFO: renamed from: ʾᵎ */
    public int f7257;

    /* JADX INFO: renamed from: ʿ */
    public String f7258;

    /* JADX INFO: renamed from: ʿᵢ */
    public int f7259;

    /* JADX INFO: renamed from: ˆʾ */
    public int f7260;

    /* JADX INFO: renamed from: ˆﾞ */
    public int f7261;

    /* JADX INFO: renamed from: ˈ */
    public boolean f7262;

    /* JADX INFO: renamed from: ˈʿ */
    public int f7263;

    /* JADX INFO: renamed from: ˈˏ */
    public int f7264;

    /* JADX INFO: renamed from: ˈٴ */
    public int f7265;

    /* JADX INFO: renamed from: ˈⁱ */
    public int f7266;

    /* JADX INFO: renamed from: ˉʿ */
    public int f7267;

    /* JADX INFO: renamed from: ˉˆ */
    public int f7268;

    /* JADX INFO: renamed from: ˉـ */
    public boolean f7269;

    /* JADX INFO: renamed from: ˉٴ */
    public float f7270;

    /* JADX INFO: renamed from: ˊʻ */
    public float f7271;

    /* JADX INFO: renamed from: ˊˋ */
    public float f7272;

    /* JADX INFO: renamed from: ˊᵔ */
    public int f7273;

    /* JADX INFO: renamed from: ˋᵔ */
    public int f7274;

    /* JADX INFO: renamed from: ˏי */
    public int f7275;

    /* JADX INFO: renamed from: ˏᵢ */
    public boolean f7276;

    /* JADX INFO: renamed from: ˑʼ */
    public int f7277;

    /* JADX INFO: renamed from: ˑٴ */
    public int f7278;

    /* JADX INFO: renamed from: ˑﹳ */
    public int f7279;

    /* JADX INFO: renamed from: יـ */
    public int f7280;

    /* JADX INFO: renamed from: ـˆ */
    public int f7281;

    /* JADX INFO: renamed from: ـˏ */
    public int f7282;

    /* JADX INFO: renamed from: ـᵎ */
    public C2118 f7283;

    /* JADX INFO: renamed from: ـﹶ */
    public int f7284;

    /* JADX INFO: renamed from: ٴʼ */
    public int f7285;

    /* JADX INFO: renamed from: ٴᵢ */
    public String f7286;

    /* JADX INFO: renamed from: ٴﹳ */
    public int f7287;

    /* JADX INFO: renamed from: ٴﹶ */
    public int f7288;

    /* JADX INFO: renamed from: ᐧᴵ */
    public boolean f7289;

    /* JADX INFO: renamed from: ᐧﾞ */
    public boolean f7290;

    /* JADX INFO: renamed from: ᴵʼ */
    public boolean f7291;

    /* JADX INFO: renamed from: ᴵˊ */
    public int f7292;

    /* JADX INFO: renamed from: ᴵˑ */
    public boolean f7293;

    /* JADX INFO: renamed from: ᴵᵔ */
    public float f7294;

    /* JADX INFO: renamed from: ᵎʻ */
    public float f7295;

    /* JADX INFO: renamed from: ᵎˊ */
    public int f7296;

    /* JADX INFO: renamed from: ᵎᵔ */
    public boolean f7297;

    /* JADX INFO: renamed from: ᵎⁱ */
    public float f7298;

    /* JADX INFO: renamed from: ᵎﹶ */
    public int f7299;

    /* JADX INFO: renamed from: ᵔʾ */
    public int f7300;

    /* JADX INFO: renamed from: ᵔי */
    public int f7301;

    /* JADX INFO: renamed from: ᵔٴ */
    public int f7302;

    /* JADX INFO: renamed from: ᵔᵢ */
    public int f7303;

    /* JADX INFO: renamed from: ᵔﹳ */
    public int f7304;

    /* JADX INFO: renamed from: ᵢˏ */
    public int f7305;

    /* JADX INFO: renamed from: ⁱˊ */
    public int f7306;

    /* JADX INFO: renamed from: ﹳـ */
    public int f7307;

    /* JADX INFO: renamed from: ﹳٴ */
    public int f7308;

    /* JADX INFO: renamed from: ﹳᐧ */
    public float f7309;

    /* JADX INFO: renamed from: ﹳﹳ */
    public int f7310;

    /* JADX INFO: renamed from: ﹶᐧ */
    public int f7311;

    /* JADX INFO: renamed from: ﾞʻ */
    public int f7312;

    /* JADX INFO: renamed from: ﾞᴵ */
    public int f7313;

    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    public final void resolveLayoutDirection(int r11) {
        int r0 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int r1 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(r11);
        boolean r2 = false;
        if (1 != getLayoutDirection()) goto L5;
        boolean r112 = true;
    L6:
        this.f7284 = -1;
        this.f7264 = -1;
        this.f7248 = -1;
        this.f7273 = -1;
        this.f7311 = this.f7281;
        this.f7310 = this.f7249;
        float r5 = this.f7294;
        this.f7246 = r5;
        int r6 = this.f7308;
        this.f7277 = r6;
        int r7 = this.f7306;
        this.f7287 = r7;
        float r8 = this.f7253;
        this.f7295 = r8;
        if (r112 == false) goto L43;
        int r113 = this.f7280;
        if (r113 == (-1)) goto L12;
        this.f7284 = r113;
    L11:
        r2 = true;
    L15:
        int r114 = this.f7255;
        if (r114 == (-1)) goto L18;
        this.f7273 = r114;
        r2 = true;
    L18:
        int r115 = this.f7247;
        if (r115 == (-1)) goto L21;
        this.f7248 = r115;
        r2 = true;
    L21:
        int r116 = this.f7256;
        if (r116 == Integer.MIN_VALUE) goto L24;
        this.f7310 = r116;
    L24:
        int r117 = this.f7292;
        if (r117 == Integer.MIN_VALUE) goto L28;
        this.f7311 = r117;
    L28:
        if (r2 == false) goto L31;
        this.f7246 = 1.0f - r5;
    L31:
        if (this.f7276 == false) goto L62;
        if (this.f7266 != 1) goto L62;
        if (this.f7262 == false) goto L62;
        if (r8 == (-1.0f)) goto L39;
        this.f7295 = 1.0f - r8;
        this.f7277 = -1;
        this.f7287 = -1;
        goto L62
    L39:
        if (r6 == (-1)) goto L41;
        this.f7287 = r6;
        this.f7277 = -1;
        this.f7295 = -1.0f;
        goto L62
    L41:
        if (r7 == (-1)) goto L62;
        this.f7277 = r7;
        this.f7287 = -1;
        this.f7295 = -1.0f;
    L62:
        if (this.f7255 == (-1)) goto L64;
        return;
    L64:
        if (this.f7247 == (-1)) goto L66;
        return;
    L66:
        if (this.f7275 == (-1)) goto L68;
        return;
    L68:
        if (this.f7280 != (-1)) goto L98;
        int r118 = this.f7299;
        if (r118 == (-1)) goto L75;
        this.f7284 = r118;
        if (((ViewGroup.MarginLayoutParams) this).rightMargin > 0) goto L81;
        if (r1 <= 0) goto L81;
        ((ViewGroup.MarginLayoutParams) this).rightMargin = r1;
    L81:
        int r119 = this.f7279;
        if (r119 == (-1)) goto L88;
        this.f7248 = r119;
        if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0) goto L99;
        if (r0 <= 0) goto L100;
        ((ViewGroup.MarginLayoutParams) this).leftMargin = r0;
        return;
    L100:
        return;
    L99:
        return;
    L88:
        int r1110 = this.f7313;
        if (r1110 == (-1)) goto L101;
        this.f7273 = r1110;
        if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0) goto L102;
        if (r0 <= 0) goto L103;
        ((ViewGroup.MarginLayoutParams) this).leftMargin = r0;
        return;
    L103:
        return;
    L102:
        return;
    L101:
        return;
    L75:
        int r1111 = this.f7303;
        if (r1111 == (-1)) goto L81;
        this.f7264 = r1111;
        if (((ViewGroup.MarginLayoutParams) this).rightMargin > 0) goto L81;
        if (r1 <= 0) goto L81;
        ((ViewGroup.MarginLayoutParams) this).rightMargin = r1;
        goto L81
    L98:
        return;
    L12:
        int r1112 = this.f7275;
        if (r1112 == (-1)) goto L15;
        this.f7264 = r1112;
        goto L11
    L43:
        int r1113 = this.f7280;
        if (r1113 == (-1)) goto L46;
        this.f7273 = r1113;
    L46:
        int r1114 = this.f7275;
        if (r1114 == (-1)) goto L49;
        this.f7248 = r1114;
    L49:
        int r1115 = this.f7255;
        if (r1115 == (-1)) goto L52;
        this.f7284 = r1115;
    L52:
        int r1116 = this.f7247;
        if (r1116 == (-1)) goto L55;
        this.f7264 = r1116;
    L55:
        int r1117 = this.f7256;
        if (r1117 == Integer.MIN_VALUE) goto L58;
        this.f7311 = r1117;
    L58:
        int r1118 = this.f7292;
        if (r1118 == Integer.MIN_VALUE) goto L62;
        this.f7310 = r1118;
        goto L62
    L5:
        r112 = false;
        goto L6
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m5081() {
        this.f7276 = false;
        this.f7297 = true;
        this.f7290 = true;
        int r2 = ((ViewGroup.MarginLayoutParams) this).width;
        if (r2 == (-2)) goto L5;
    L9:
        int r4 = ((ViewGroup.MarginLayoutParams) this).height;
        if (r4 != (-2)) goto L17;
        if (this.f7269 == false) goto L17;
        this.f7290 = false;
        if (this.f7261 != 0) goto L17;
        this.f7261 = 1;
    L17:
        if (r2 == 0) goto L19;
        if (r2 == (-1)) goto L19;
    L24:
        if (r4 == 0) goto L26;
        if (r4 == (-1)) goto L26;
    L32:
        if (this.f7253 == (-1.0f)) goto L34;
    L39:
        this.f7276 = true;
        this.f7297 = true;
        this.f7290 = true;
        if ((this.f7283 instanceof C2121) == true) goto L42;
        this.f7283 = new C2121();
    L42:
        ((C2121) this.f7283).m5194(this.f7266);
        return;
    L34:
        if (this.f7308 != (-1)) goto L39;
        if (this.f7306 != (-1)) goto L39;
        return;
    L26:
        this.f7290 = false;
        if (r4 != 0) goto L32;
        if (this.f7261 != 1) goto L32;
        ((ViewGroup.MarginLayoutParams) this).height = -2;
        this.f7269 = true;
    L19:
        this.f7297 = false;
        if (r2 != 0) goto L24;
        if (this.f7301 != 1) goto L24;
        ((ViewGroup.MarginLayoutParams) this).width = -2;
        this.f7293 = true;
        goto L24
    L5:
        if (this.f7293 == false) goto L9;
        this.f7297 = false;
        if (this.f7301 != 0) goto L9;
        this.f7301 = 1;
        goto L9
    }
}

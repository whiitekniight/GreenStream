package p400;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import p005j$.util.Objects;
import p317.AbstractC4195;
import p317.AbstractC4214;

/* JADX INFO: renamed from: ⁱˉ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C5108 {

    /* JADX INFO: renamed from: ʻٴ */
    public static final String f18187 = null;

    /* JADX INFO: renamed from: ʼʼ */
    public static final String f18188 = null;

    /* JADX INFO: renamed from: ʽʽ */
    public static final String f18189 = null;

    /* JADX INFO: renamed from: ʽﹳ */
    public static final String f18190 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public static final String f18191 = null;

    /* JADX INFO: renamed from: ʾᵎ */
    public static final String f18192 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final String f18193 = null;

    /* JADX INFO: renamed from: ˉٴ */
    public static final String f18194 = null;

    /* JADX INFO: renamed from: ˊʻ */
    public static final String f18195 = null;

    /* JADX INFO: renamed from: ˏי */
    public static final String f18196 = null;

    /* JADX INFO: renamed from: יـ */
    public static final String f18197 = null;

    /* JADX INFO: renamed from: ـˆ */
    public static final String f18198 = null;

    /* JADX INFO: renamed from: ٴʼ */
    public static final String f18199 = null;

    /* JADX INFO: renamed from: ٴᵢ */
    public static final String f18200 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final String f18201 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final String f18202 = null;

    /* JADX INFO: renamed from: ᵎˊ */
    public static final String f18203 = null;

    /* JADX INFO: renamed from: ᵎⁱ */
    public static final String f18204 = null;

    /* JADX INFO: renamed from: ᵔי */
    public static final String f18205 = null;

    /* JADX INFO: renamed from: ᵢˏ */
    public static final String f18206 = null;

    /* JADX INFO: renamed from: ʼˎ */
    public final int f18207;

    /* JADX INFO: renamed from: ʼᐧ */
    public final int f18208;

    /* JADX INFO: renamed from: ʽ */
    public final Layout.Alignment f18209;

    /* JADX INFO: renamed from: ˆʾ */
    public final float f18210;

    /* JADX INFO: renamed from: ˈ */
    public final Bitmap f18211;

    /* JADX INFO: renamed from: ˉʿ */
    public final int f18212;

    /* JADX INFO: renamed from: ˉˆ */
    public final float f18213;

    /* JADX INFO: renamed from: ˑﹳ */
    public final float f18214;

    /* JADX INFO: renamed from: ٴﹶ */
    public final float f18215;

    /* JADX INFO: renamed from: ᵎﹶ */
    public final int f18216;

    /* JADX INFO: renamed from: ᵔʾ */
    public final int f18217;

    /* JADX INFO: renamed from: ᵔᵢ */
    public final float f18218;

    /* JADX INFO: renamed from: ᵔﹳ */
    public final float f18219;

    /* JADX INFO: renamed from: ⁱˊ */
    public final Layout.Alignment f18220;

    /* JADX INFO: renamed from: ﹳٴ */
    public final CharSequence f18221;

    /* JADX INFO: renamed from: ﹳᐧ */
    public final int f18222;

    /* JADX INFO: renamed from: ﾞʻ */
    public final boolean f18223;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final int f18224;

    static {
        new C5108("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String r0 = AbstractC4195.f15423;
        f18197 = Integer.toString(0, 36);
        f18196 = Integer.toString(17, 36);
        f18190 = Integer.toString(1, 36);
        f18187 = Integer.toString(2, 36);
        f18198 = Integer.toString(3, 36);
        f18192 = Integer.toString(18, 36);
        f18188 = Integer.toString(4, 36);
        f18206 = Integer.toString(5, 36);
        f18191 = Integer.toString(6, 36);
        f18201 = Integer.toString(7, 36);
        f18189 = Integer.toString(8, 36);
        f18193 = Integer.toString(9, 36);
        f18202 = Integer.toString(10, 36);
        f18195 = Integer.toString(11, 36);
        f18200 = Integer.toString(12, 36);
        f18194 = Integer.toString(13, 36);
        f18204 = Integer.toString(14, 36);
        f18199 = Integer.toString(15, 36);
        f18203 = Integer.toString(16, 36);
        f18205 = Integer.toString(19, 36);
    }

    public C5108(CharSequence r2, Layout.Alignment r3, Layout.Alignment r4, Bitmap r5, float r6, int r7, int r8, float r9, int r10, int r11, float r12, float r13, float r14, boolean r15, int r16, int r17, float r18, int r19) {
        if (r2 != null) goto L5;
        r5.getClass();
    L10:
        if ((r2 instanceof Spanned) == false) goto L12;
        this.f18221 = SpannedString.valueOf(r2);
    L15:
        this.f18220 = r3;
        this.f18209 = r4;
        this.f18211 = r5;
        this.f18214 = r6;
        this.f18224 = r7;
        this.f18216 = r8;
        this.f18218 = r9;
        this.f18207 = r10;
        this.f18210 = r13;
        this.f18215 = r14;
        this.f18223 = r15;
        this.f18212 = r16;
        this.f18217 = r11;
        this.f18213 = r12;
        this.f18208 = r17;
        this.f18219 = r18;
        this.f18222 = r19;
        return;
    L12:
        if (r2 == null) goto L14;
        this.f18221 = r2.toString();
        goto L15
    L14:
        this.f18221 = null;
        goto L15
    L5:
        if (r5 != null) goto L7;
        boolean r0 = true;
    L8:
        AbstractC4214.m8560(r0);
        goto L10
    L7:
        r0 = false;
        goto L8
    }

    public final boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if (r6 != null) goto L8;
    L52:
        return false;
    L8:
        if (C5108.class != r6.getClass()) goto L52;
        C5108 r62 = (C5108) r6;
        Bitmap r2 = r62.f18211;
        if (TextUtils.equals(this.f18221, r62.f18221) == false) goto L52;
        if (this.f18220 != r62.f18220) goto L52;
        if (this.f18209 != r62.f18209) goto L52;
        Bitmap r3 = this.f18211;
        if (r3 != null) goto L20;
        if (r2 != null) goto L52;
    L24:
        if (this.f18214 != r62.f18214) goto L52;
        if (this.f18224 != r62.f18224) goto L52;
        if (this.f18216 != r62.f18216) goto L52;
        if (this.f18218 != r62.f18218) goto L52;
        if (this.f18207 != r62.f18207) goto L52;
        if (this.f18210 != r62.f18210) goto L52;
        if (this.f18215 != r62.f18215) goto L52;
        if (this.f18223 != r62.f18223) goto L52;
        if (this.f18212 != r62.f18212) goto L52;
        if (this.f18217 != r62.f18217) goto L52;
        if (this.f18213 != r62.f18213) goto L52;
        if (this.f18208 != r62.f18208) goto L52;
        if (this.f18219 != r62.f18219) goto L52;
        if (this.f18222 != r62.f18222) goto L52;
        return true;
    L20:
        if (r2 == null) goto L52;
        if (r3.sameAs(r2) == false) goto L52;
        goto L52
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f18221, this.f18220, this.f18209, this.f18211, Float.valueOf(this.f18214), Integer.valueOf(this.f18224), Integer.valueOf(this.f18216), Float.valueOf(this.f18218), Integer.valueOf(this.f18207), Float.valueOf(this.f18210), Float.valueOf(this.f18215), Boolean.valueOf(this.f18223), Integer.valueOf(this.f18212), Integer.valueOf(this.f18217), Float.valueOf(this.f18213), Integer.valueOf(this.f18208), Float.valueOf(this.f18219), Integer.valueOf(this.f18222)});
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final C5109 m9897() {
        C5109 r0 = new C5109();
        r0.f18239 = this.f18221;
        r0.f18238 = this.f18211;
        r0.f18227 = this.f18220;
        r0.f18229 = this.f18209;
        r0.f18232 = this.f18214;
        r0.f18242 = this.f18224;
        r0.f18234 = this.f18216;
        r0.f18236 = this.f18218;
        r0.f18225 = this.f18207;
        r0.f18228 = this.f18217;
        r0.f18233 = this.f18213;
        r0.f18241 = this.f18210;
        r0.f18230 = this.f18215;
        r0.f18235 = this.f18223;
        r0.f18231 = this.f18212;
        r0.f18226 = this.f18208;
        r0.f18237 = this.f18219;
        r0.f18240 = this.f18222;
        return r0;
    }
}

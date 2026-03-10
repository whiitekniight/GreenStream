package p324;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* JADX INFO: renamed from: ᐧⁱ.ᵎˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C4353 {

    /* JADX INFO: renamed from: ʻٴ */
    public int f15997;

    /* JADX INFO: renamed from: ʼʼ */
    public float f15998;

    /* JADX INFO: renamed from: ʼˎ */
    public CharSequence f15999;

    /* JADX INFO: renamed from: ʼᐧ */
    public int f16000;

    /* JADX INFO: renamed from: ʽ */
    public final float f16001;

    /* JADX INFO: renamed from: ʽʽ */
    public int f16002;

    /* JADX INFO: renamed from: ʽﹳ */
    public int f16003;

    /* JADX INFO: renamed from: ʾˋ */
    public int f16004;

    /* JADX INFO: renamed from: ʾᵎ */
    public float f16005;

    /* JADX INFO: renamed from: ˆʾ */
    public Layout.Alignment f16006;

    /* JADX INFO: renamed from: ˈ */
    public final float f16007;

    /* JADX INFO: renamed from: ˈٴ */
    public int f16008;

    /* JADX INFO: renamed from: ˉʿ */
    public int f16009;

    /* JADX INFO: renamed from: ˉˆ */
    public float f16010;

    /* JADX INFO: renamed from: ˉٴ */
    public int f16011;

    /* JADX INFO: renamed from: ˊʻ */
    public StaticLayout f16012;

    /* JADX INFO: renamed from: ˏי */
    public int f16013;

    /* JADX INFO: renamed from: ˑﹳ */
    public final float f16014;

    /* JADX INFO: renamed from: יـ */
    public int f16015;

    /* JADX INFO: renamed from: ـˆ */
    public int f16016;

    /* JADX INFO: renamed from: ٴʼ */
    public Rect f16017;

    /* JADX INFO: renamed from: ٴᵢ */
    public int f16018;

    /* JADX INFO: renamed from: ٴﹶ */
    public Bitmap f16019;

    /* JADX INFO: renamed from: ᴵˊ */
    public int f16020;

    /* JADX INFO: renamed from: ᴵᵔ */
    public StaticLayout f16021;

    /* JADX INFO: renamed from: ᵎⁱ */
    public int f16022;

    /* JADX INFO: renamed from: ᵎﹶ */
    public final Paint f16023;

    /* JADX INFO: renamed from: ᵔʾ */
    public int f16024;

    /* JADX INFO: renamed from: ᵔᵢ */
    public final Paint f16025;

    /* JADX INFO: renamed from: ᵔﹳ */
    public float f16026;

    /* JADX INFO: renamed from: ᵢˏ */
    public float f16027;

    /* JADX INFO: renamed from: ⁱˊ */
    public final float f16028;

    /* JADX INFO: renamed from: ﹳٴ */
    public final float f16029;

    /* JADX INFO: renamed from: ﹳᐧ */
    public float f16030;

    /* JADX INFO: renamed from: ﾞʻ */
    public float f16031;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final TextPaint f16032;

    public C4353(Context r4) {
        TypedArray r0 = r4.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f16014 = r0.getDimensionPixelSize(0, 0);
        this.f16007 = r0.getFloat(1, 1.0f);
        r0.recycle();
        float r42 = Math.round((r4.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f16029 = r42;
        this.f16028 = r42;
        this.f16001 = r42;
        TextPaint r43 = new TextPaint();
        this.f16032 = r43;
        r43.setAntiAlias(true);
        r43.setSubpixelText(true);
        Paint r44 = new Paint();
        this.f16023 = r44;
        r44.setAntiAlias(true);
        r44.setStyle(Paint.Style.FILL);
        Paint r45 = new Paint();
        this.f16025 = r45;
        r45.setAntiAlias(true);
        r45.setFilterBitmap(true);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m8779(Canvas r10, boolean r11) {
        if (r11 == false) goto L33;
        StaticLayout r112 = this.f16021;
        StaticLayout r0 = this.f16012;
        if (r112 == null) goto L35;
        if (r0 == null) goto L36;
        int r1 = r10.save();
        r10.translate(this.f16018, this.f16011);
        if (Color.alpha(this.f16003) <= 0) goto L10;
        int r2 = this.f16003;
        Paint r8 = this.f16023;
        r8.setColor(r2);
        Canvas r3 = r10;
        r3.drawRect(-this.f16022, 0.0f, r112.getWidth() + this.f16022, r112.getHeight(), r8);
    L11:
        int r102 = this.f16016;
        boolean r4 = true;
        TextPaint r5 = this.f16032;
        if (r102 != 1) goto L14;
        r5.setStrokeJoin(Paint.Join.ROUND);
        r5.setStrokeWidth(this.f16029);
        r5.setColor(this.f15997);
        r5.setStyle(Paint.Style.FILL_AND_STROKE);
        r0.draw(r3);
    L31:
        r5.setColor(this.f16015);
        r5.setStyle(Paint.Style.FILL);
        r112.draw(r3);
        r5.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        r3.restoreToCount(r1);
        return;
    L14:
        float r7 = this.f16028;
        if (r102 != 2) goto L18;
        float r103 = this.f16001;
        r5.setShadowLayer(r7, r103, r103, this.f15997);
        goto L31
    L18:
        if (r102 != 3) goto L20;
    L21:
        if (r102 == 3) goto L24;
        r4 = false;
    L24:
        int r104 = -1;
        if (r4 == false) goto L27;
        int r6 = -1;
    L28:
        if (r4 == false) goto L30;
        r104 = this.f15997;
    L30:
        float r42 = r7 / 2.0f;
        r5.setColor(this.f16015);
        r5.setStyle(Paint.Style.FILL);
        float r82 = -r42;
        r5.setShadowLayer(r7, r82, r82, r6);
        r0.draw(r3);
        r5.setShadowLayer(r7, r42, r42, r104);
        goto L31
    L27:
        r6 = this.f15997;
        goto L28
    L20:
        if (r102 != 4) goto L31;
    L10:
        r3 = r10;
        goto L11
    L36:
        return;
    L35:
        return;
    L33:
        this.f16017.getClass();
        this.f16019.getClass();
        r10.drawBitmap(this.f16019, null, this.f16017, this.f16025);
    }
}

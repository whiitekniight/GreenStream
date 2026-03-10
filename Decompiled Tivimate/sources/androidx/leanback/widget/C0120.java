package androidx.leanback.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: androidx.leanback.widget.י */
/* JADX INFO: loaded from: classes.dex */
public final class C0120 extends ReplacementSpan {

    /* JADX INFO: renamed from: ʽʽ */
    public final /* synthetic */ AbstractC0094 f949;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f950;

    /* JADX INFO: renamed from: ᴵˊ */
    public final int f951;

    public C0120(AbstractC0094 r1, int r2, int r3) {
        this.f949 = r1;
        this.f950 = r2;
        this.f951 = r3;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas r17, CharSequence r18, int r19, int r20, float r21, int r22, int r23, int r24, Paint r25) {
        int r2 = (int) r25.measureText(r18, r19, r20);
        AbstractC0094 r3 = this.f949;
        int r4 = r3.f867.getWidth();
        int r6 = r4 * 2;
        int r7 = r2 / r6;
        int r8 = (r2 % r6) / 2;
        int r10 = 0;
        if (1 != r3.getLayoutDirection()) goto L5;
        boolean r9 = true;
    L6:
        r3.f865.setSeed(this.f950);
        int r12 = r25.getAlpha();
    L7:
        if (r10 >= r7) goto L20;
        if ((this.f951 + r10) >= r3.f866) goto L20;
        float r13 = (r4 / 2) + ((r10 * r6) + r8);
        if (r9 == false) goto L14;
        float r14 = ((r21 + r2) - r13) - r4;
    L15:
        r25.setAlpha((r3.f865.nextInt(4) + 1) * 63);
        if (r3.f865.nextBoolean() == false) goto L18;
        r17.drawBitmap(r3.f864, r14, r23 - r13.getHeight(), r25);
    L19:
        r10 = r10 + 1;
        goto L7
    L18:
        r17.drawBitmap(r3.f867, r14, r23 - r13.getHeight(), r25);
        goto L19
    L14:
        r14 = r21 + r13;
    L20:
        r25.setAlpha(r12);
        return;
    L5:
        r9 = false;
        goto L6
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint r1, CharSequence r2, int r3, int r4, Paint.FontMetricsInt r5) {
        return (int) r1.measureText(r2, r3, r4);
    }
}

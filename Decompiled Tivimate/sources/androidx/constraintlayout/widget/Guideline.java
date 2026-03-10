package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import p077.C2083;

/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {

    /* JADX INFO: renamed from: ʾˋ */
    public boolean f271;

    public Guideline(Context r1) {
        super(r1);
        this.f271 = true;
        super.setVisibility(8);
    }

    public Guideline(Context r1, AttributeSet r2) {
        super(r1, r2);
        this.f271 = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas r1) {
    }

    @Override // android.view.View
    public final void onMeasure(int r1, int r2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean r1) {
        this.f271 = r1;
    }

    public void setGuidelineBegin(int r3) {
        C2083 r0 = (C2083) getLayoutParams();
        if (this.f271 == true) goto L5;
    L7:
        r0.f7308 = r3;
        setLayoutParams(r0);
        return;
    L5:
        if (r0.f7308 != r3) goto L7;
    }

    public void setGuidelineEnd(int r3) {
        C2083 r0 = (C2083) getLayoutParams();
        if (this.f271 == true) goto L5;
    L7:
        r0.f7306 = r3;
        setLayoutParams(r0);
        return;
    L5:
        if (r0.f7306 != r3) goto L7;
    }

    public void setGuidelinePercent(float r3) {
        C2083 r0 = (C2083) getLayoutParams();
        if (this.f271 == true) goto L5;
    L7:
        r0.f7253 = r3;
        setLayoutParams(r0);
        return;
    L5:
        if (r0.f7253 != r3) goto L7;
    }

    @Override // android.view.View
    public void setVisibility(int r1) {
    }
}

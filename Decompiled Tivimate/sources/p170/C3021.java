package p170;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: ˊˋ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C3021 extends ClickableSpan {

    /* JADX INFO: renamed from: ʽʽ */
    public final int f10577;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f10578;

    /* JADX INFO: renamed from: ᴵˊ */
    public final C3018 f10579;

    public C3021(int r1, C3018 r2, int r3) {
        this.f10578 = r1;
        this.f10579 = r2;
        this.f10577 = r3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View r3) {
        Bundle r32 = new Bundle();
        r32.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f10578);
        int r0 = this.f10577;
        this.f10579.f10575.performAction(r0, r32);
    }
}

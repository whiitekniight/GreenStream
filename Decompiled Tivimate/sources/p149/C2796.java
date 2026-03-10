package p149;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: ˉˆ.ᴵʼ */
/* JADX INFO: loaded from: classes.dex */
public final class C2796 extends C2768 {
    public C2796() {
    }

    @Override // p149.AbstractC2718
    /* JADX INFO: renamed from: ⁱˊ */
    public boolean mo5947(TextView r1) {
        return r1.isHorizontallyScrollable();
    }

    @Override // p149.C2768, p149.AbstractC2718
    /* JADX INFO: renamed from: ﹳٴ */
    public void mo5948(StaticLayout.Builder r1, TextView r2) {
        r1.setTextDirection(r2.getTextDirectionHeuristic());
    }
}

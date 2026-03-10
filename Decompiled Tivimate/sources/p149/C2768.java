package p149;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* JADX INFO: renamed from: ˉˆ.ˏᵢ */
/* JADX INFO: loaded from: classes.dex */
public class C2768 extends AbstractC2718 {
    public C2768() {
    }

    @Override // p149.AbstractC2718
    /* JADX INFO: renamed from: ﹳٴ */
    public void mo5948(StaticLayout.Builder r3, TextView r4) {
        r3.setTextDirection((TextDirectionHeuristic) C2757.m6021(r4, TextDirectionHeuristics.FIRSTSTRONG_LTR, "getTextDirectionHeuristic"));
    }
}

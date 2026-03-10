package p344;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: renamed from: ᴵﾞ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C4682 implements FilenameFilter {

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ String f16586;

    public C4682(String r1) {
        this.f16586 = r1;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File r2, String r3) {
        return r3.startsWith(this.f16586 + ".");
    }
}

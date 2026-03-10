package p246;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: renamed from: ˑˋ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3679 implements FilenameFilter {

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f13171;

    public /* synthetic */ C3679(int r1) {
        this.f13171 = r1;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File r1, String r2) {
        switch(this.f13171) {
            case 0: goto L16;
            case 1: goto L9;
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return r2.startsWith(".ae");
    L7:
        return r2.startsWith("aqs.");
    L9:
        if (r2.startsWith("event") == true) goto L11;
    L13:
        return false;
    L11:
        if (r2.endsWith("_") == true) goto L13;
        return true;
    L16:
        return r2.startsWith("event");
    }
}

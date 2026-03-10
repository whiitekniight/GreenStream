package p416;

import com.parse.ˑ;
import java.security.SecureRandom;

/* JADX INFO: renamed from: ﹳʽ.ٴᵢ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5279 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final ˑ f18986 = null;

    static {
        f18986 = new ˑ(8);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static byte[] m10293(int r1) {
        byte[] r12 = new byte[r1];
        ((SecureRandom) f18986.get()).nextBytes(r12);
        return r12;
    }
}
